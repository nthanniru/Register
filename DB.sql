create table register_user
(First_name varchar2(250),
 Last_name varchar2(250),
 gender varchar2(10),
 eamil varchar2 (250),
 password varchar2(250),
 pnone_number varchar2(10),
 country varchar2(100),
 address varchar2(1000))
-- Adding Sequence to tabl
 create sequence SCOTT.register_user
minvalue 1
maxvalue 999999999999999999999999999
start with 1
increment by 1
cache 20;