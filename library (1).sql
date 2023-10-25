-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 25, 2020 at 08:53 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `feedbackform`
--

CREATE TABLE `feedbackform` (
  `Sr. no.` int(10) NOT NULL,
  `FullName` varchar(50) NOT NULL,
  `BookName` varchar(50) NOT NULL,
  `Ratings` varchar(30) NOT NULL,
  `Feedback` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feedbackform`
--

INSERT INTO `feedbackform` (`Sr. no.`, `FullName`, `BookName`, `Ratings`, `Feedback`) VALUES
(1, 'Durva Patel', 'Programming in Java', '4.5', 'Very informative, very usefull, good book for a Beginner.'),
(2, 'Milli Davis', 'The Secret', '5', 'Very Motivational.');

-- --------------------------------------------------------

--
-- Table structure for table `issuebook`
--

CREATE TABLE `issuebook` (
  `Sr. no.` int(11) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `StudentId` int(11) NOT NULL,
  `BookName` varchar(50) NOT NULL,
  `BookCode` int(11) NOT NULL,
  `DateofIssual` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `issuebook`
--

INSERT INTO `issuebook` (`Sr. no.`, `FirstName`, `LastName`, `StudentId`, `BookName`, `BookCode`, `DateofIssual`) VALUES
(1, 'Durva', 'Patel', 1991036, 'Programming In Java', 10003, '2020-10-01'),
(2, 'David', 'Johnson', 1991032, 'Programming in ANCI C', 10001, '2020-11-25'),
(3, 'Milli', 'Davis', 1991036, 'The Secret', 10006, '2020-11-23');

-- --------------------------------------------------------

--
-- Table structure for table `loginform`
--

CREATE TABLE `loginform` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `loginform`
--

INSERT INTO `loginform` (`username`, `password`) VALUES
('Durva', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `records1`
--

CREATE TABLE `records1` (
  `Sr. no.` int(5) NOT NULL,
  `Code` int(10) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Author` varchar(50) NOT NULL,
  `Genre` varchar(50) NOT NULL,
  `Status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `records1`
--

INSERT INTO `records1` (`Sr. no.`, `Code`, `Name`, `Author`, `Genre`, `Status`) VALUES
(1, 10001, 'Programming in ANCI C', 'E. Balagurusamy', 'Textbooks', 'Available'),
(2, 10002, 'Programming in ANCI C++', 'Bhushan Trivedi', 'Textbooks', 'Available'),
(3, 10003, 'Programming in Java', 'E. Balagurusamy', 'Textbooks', 'Available'),
(4, 10004, 'Head First SQL', 'Lynn Beighley', 'Textbooks', 'Available'),
(5, 10005, 'Data Structures and Algorithms', 'Adam Drozdek', 'Textbooks', 'Available'),
(6, 10006, 'The Secret', 'Rhonda Byrne', 'Self-Help', 'Available'),
(7, 10007, 'The Alchemist', 'Paulo Coelho', 'Self-Help', 'Available'),
(8, 10008, 'Big Magic', 'Elizabeth Gilbert ', 'Self-Help', 'Available'),
(9, 10009, 'You Can Heal Your Life', 'Louis Hay', 'Self-Help', 'Available'),
(10, 10010, 'Whenever You Go, There You Are ', 'Jon Kabat-Zinn ', 'Self-Help', 'Available'),
(11, 10011, 'Three Men in a Boat', 'Jerome K. Jerome', 'Comedy', 'Available'),
(12, 10012, 'Good Omens', 'Neil Gaiman', 'Comedy', 'Available'),
(13, 10013, 'Where\'d You Go Bernadette', 'Maria Sample', 'Comedy', 'Available'),
(14, 10014, 'I Feel Bad About My NEck', 'Nora Ephron', 'Comedy', 'Available'),
(15, 10015, 'Cat\'s Cradle ', 'Kurt Vonnegut', 'Comedy', 'Available'),
(16, 10016, 'The Hobbit', 'J. R. R. Tolkien', 'Fantasy & Adventure', 'Available'),
(17, 10017, 'Alice\'s  Adventure in Wonderland', 'Lewis Carroll', 'Fantasy & Adventure', 'Available'),
(18, 10018, 'Harry Potter Box set : Complete Collection', 'J.K Rowling', 'Fantasy & Adventure', 'Available'),
(19, 10019, 'Game Of Thrones', 'George R. R. Martin  ', 'Fantasy & Adventure', 'Available'),
(20, 10020, 'The Chronicles of Narnia: Complete Edition', 'C. S. Lewis', 'Fantasy & Adventure', 'Available'),
(21, 10021, 'Complete Code', 'Steve McConnell', 'Textbooks', 'Available'),
(22, 10022, 'Clean Code', 'Robert Martin', 'Textbooks', 'Available'),
(23, 10023, 'Introduction to Algorithms', 'Clifford Stein', 'Textbooks', 'Available'),
(24, 10024, 'The Art of Computer Programming', 'Donald Knuth', 'Textbooks', 'Available'),
(25, 10025, 'Computer Science ', 'J. Glenn Brookshear', 'Textbooks', 'Available'),
(26, 10026, 'Fundamentals of Software Architecture ', 'Mark Richards', 'Textbooks', 'Available'),
(27, 10027, 'The Self-Taught Programmer', 'Cory Althoff', 'Taxtbooks', 'Available'),
(28, 10028, 'Head First Java', 'Bert Bates', 'Textbooks', 'Available'),
(29, 10029, 'Soft Skills: The software Developer\'s Manual', 'John Sonmez', 'Textbooks', 'Available'),
(30, 10030, 'The Pragmatic Programmer', 'Andy Hunt', 'Txtbooks', 'Available');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `feedbackform`
--
ALTER TABLE `feedbackform`
  ADD PRIMARY KEY (`Sr. no.`);

--
-- Indexes for table `issuebook`
--
ALTER TABLE `issuebook`
  ADD PRIMARY KEY (`Sr. no.`);

--
-- Indexes for table `records1`
--
ALTER TABLE `records1`
  ADD PRIMARY KEY (`Sr. no.`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `feedbackform`
--
ALTER TABLE `feedbackform`
  MODIFY `Sr. no.` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `issuebook`
--
ALTER TABLE `issuebook`
  MODIFY `Sr. no.` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `records1`
--
ALTER TABLE `records1`
  MODIFY `Sr. no.` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
