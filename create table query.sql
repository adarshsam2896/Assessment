-- create a table
-- Creating a table named Products 
CREATE TABLE Products
(
ProductID int PRIMARY KEY not null,
Name varchar(50) NOT NULL,
Category varchar(50) NOT NULL
);
-- Creating a table named Product price history
CREATE TABLE ProductPriceHistory
(
ProductPriceHistoryId int PRIMARY KEY not null,
ProductId int not null,
Price int not null,
Start_date DATE NOT NULL,
End_date DATE,
FOREIGN KEY (ProductId) REFERENCES Products(ProductId)
);

-- Inserting sample data into Products and ProductPriceHistory
INSERT into Products VALUES (1,'APPLE','FRUITS');
INSERT into Products VALUES (2,'BANANNA','FRUITS');

INSERT INTO ProductPriceHistory VALUES (10,1,40,'2015-06-24','2015-08-25');
INSERT INTO ProductPriceHistory VALUES (11,2,50,'2014-06-24','2014-08-25');
INSERT INTO ProductPriceHistory VALUES (12,1,60,'2012-06-24',NULL);
-- Join statement to join the tables together on ProductId
SELECT Products.Name as NAME, ProductPriceHistory.Start_date as START_DATE,ProductPriceHistory.End_date as END_DATE,ProductPriceHistory.Price as PRICE, Products.Category AS CATEGORY
FROM Products
INNER JOIN ProductPriceHistory ON products.ProductId=ProductPriceHistory.ProductId;