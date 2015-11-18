package com.blackboard.api.core.model;

import java.util.Date;

/**
 * This is the Assignment Model Class that maps to the assignments table in the database.
 * <p/>
 * Created by ChristopherLicata on 11/14/15.
 */
public class Assignment
{
	private Course course;

	private String assignmentName;

	private String assignmentFileName;

	private String instructions;

	private int totalPoints;

	private Date dateAssigned;

	private Date dueDate;


	/**
	 * Default Constructor for Assignments
	 */
	public Assignment()
	{
	}


	/**
	 * Full Constructor for the Assignment Model Class
	 *
	 * @param assignmentName Name and FileName of the Assignment in Question
	 * @param instructions   Instructions, detailing how to complete the assignment
	 * @param totalPoints    Total points to potentially earn in the completion of the assignment
	 * @param dateAssigned   Date when the assignment was posted
	 * @param dueDate        Expected duedate of the assignment.
	 */
	public Assignment(String assignmentName, String assignmentFileName, String instructions, int totalPoints, Date dateAssigned, Date dueDate)
	{
		this.assignmentName = assignmentName;
		this.assignmentFileName = assignmentFileName;
		this.instructions = instructions;
		this.totalPoints = totalPoints;
		this.dateAssigned = dateAssigned;
		this.dueDate = dueDate;
	}


	public String getAssignmentName()
	{
		return assignmentName;
	}


	public void setAssignmentName(String assignmentName)
	{
		this.assignmentName = assignmentName;
	}


	public String getAssignmentFileName()
	{
		return assignmentFileName;
	}


	public void setAssignmentFileName(String assignmentFileName)
	{
		this.assignmentFileName = assignmentFileName;
	}


	public String getInstructions()
	{
		return instructions;
	}


	public void setInstructions(String instructions)
	{
		this.instructions = instructions;
	}


	public int getTotalPoints()
	{
		return totalPoints;
	}


	public void setTotalPoints(int totalPoints)
	{
		this.totalPoints = totalPoints;
	}


	public Date getDateAssigned()
	{
		return dateAssigned;
	}


	public void setDateAssigned(Date dateAssigned)
	{
		this.dateAssigned = dateAssigned;
	}


	public Date getDueDate()
	{
		return dueDate;
	}


	public void setDueDate(Date dueDate)
	{
		this.dueDate = dueDate;
	}
}