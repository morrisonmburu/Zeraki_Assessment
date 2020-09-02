/* Question 3B MYSQL query */

SELECT institution.name as 'INSTITUTION NAME',
 course.name as 'COURSE NAME', 
 COUNT(*) as 'NUMBER OF STUDENTS'
 FROM student INNER JOIN course 
 ON course.courseid = student.course
 INNER JOIN institution 
 ON institution.institutionid = course.institution
 GROUP BY institution.name