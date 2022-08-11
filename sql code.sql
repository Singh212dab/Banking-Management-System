Creating Tables:

create table staff_details
 (id int,
 name varchar(20),
 address varchar(30),
 contact int(11),
 email varchar(25),
 dob date,
 doj date);

create table staff_login
(username varchar(25),
Password varchar(25));

create table cust_details
(acc_no int(10),
Name varchar(25),
Address varchar(35),
contact_no int(11),
acc_type varchar(20),
amount double(15,2),
balance char(2));
Structure of Tables:
Desc staff_details;
 

Desc staff_login;
 

Desc cust_details;
 

Inserting Values in Staff_Details:
insert into staff_details
values(1, "Ravi Khandelwal", "Bhopal","789822874","ravi@nb.com", "1992-09-27", "2015-04-01");

insert into staff_details
values(2, "Atul Singhasiya", "Bhopal","756668137","atul@nb.com", "1993-04-02", "2015-04-01");

insert into staff_details
values(3, "Abhay Mishra", "Bhopal","957560505","abhay@nb.com", "1993-03-14", "2015-04-01");

insert into staff_details
values(4, "Yogesh Kene", "Bhopal","982750513","yogesh@nb.com", "1993-05-20", "2015-04-01");

insert into staff_details
values(5, "Ayush Sharma", "Bhopal","982745251","ayush@nb.com", "1992-09-15", "2015-04-01");

insert into staff_details
values(6, "Harbind Kaur", "Bhopal","942587522","harbind@nb.com", "1991-05-05", "2015-04-01");




Inserting Values in Staff_Login:
insert into staff_login
values("ravi","ravi");

insert into staff_login
values("atul","atul");

insert into staff_login
values("abhay","abhay");

insert into staff_login
values("yogesh","yogesh");

insert into staff_login
values("ayush","ayush");

insert into staff_login
values("harbind","harbind");




Inserting Values in Cust_Details:
insert into cust_details
values(1000000001,"Ravi Khandelwal","Bhopal", 789822674,"Saving A/c", 7852677,"cr");

insert into cust_details
values(1000000002," Atul Singahsiya","Bhopal", 756668137,"Saving A/c", 5286401,"cr");

insert into cust_details
values(1000000003," Reliance Retail Ltd.","Bhopal", 075542536,"Current A/c", 10000000,"cr");

insert into cust_details
values(1000000004," XYZ Ltd.","Indore", 073150478,"Current A/c", 3600000,"cr");

insert into cust_details
values(1000000005," DB Corp Ltd."," Gwalior", 078324546," Overdraft A/c", 2000000,"dr");

insert into cust_details
values(1000000006," Google Ltd."," Indore", 073180545," Fixed Deposit", 5000000,"cr");

insert into cust_details
values(1000000007," AB Ltd."," Bhopal", 0 75548722," Loan A/c", 1000000,"dr");

insert into cust_details
values(1000000008,"Ram Singh","Bina",708389418,"Pension A/c",1200000,"cr");

select *
from staff_details;
 

Select *
From staff_login;
 

Select *
From cust_details;
