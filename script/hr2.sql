-- sqlplus -s system/oracle < hr2.sql

drop user hr2 cascade;

create user hr2 identified by hr2 default tablespace users;
grant connect, resource to hr2;

create table hr2.employees (
emp_id number(3) constraint emp_empid_pk primary key,
emp_name varchar2(10) constraint emp_epmname_nn not null,
hire_date date constraint emp_hiredate_nn not null);

create sequence hr2.emp_empid_seq;
