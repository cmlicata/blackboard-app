package com.blackboard.api.dao.impl.interfaces;

import com.blackboard.api.core.model.Instructor;

import java.util.List;
import java.util.Optional;

/**
 * The internal API for the persistence layer operations. These operations listed only pertain to the
 * Creation, Retrieval, Updating, and Deletion of Instructor objects.
 * <p>
 *
 * @author ChristopherLicata <Chris@bizmerlin.com>
 *         <p>
 *         Created by ChristopherLicata on 11/18/15.
 */

public interface InstructorDao
{
    Instructor createInstructor(Instructor instructor);

    Optional<Instructor> findInstructorByEmail(String email);

    List<Instructor> findAllInstructors();

}
