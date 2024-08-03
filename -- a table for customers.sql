--  a table for customers
CREATE TABLE customers (
    customer_id INTEGER PRIMARY KEY,
    name TEXT,
    age INTEGER,
    balance REAL,
    is_vip TEXT DEFAULT 'N'
);

CREATE TABLE loans (
    loan_id INTEGER PRIMARY KEY,
    customer_id INTEGER,
    loan_amount REAL,
    interest_rate REAL,
    due_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);
