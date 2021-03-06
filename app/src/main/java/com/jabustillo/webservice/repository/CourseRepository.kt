package com.jabustillo.webservice.repository

import com.jabustillo.webservice.repository.api.course.CourseApiService

class CourseRepository {

    private val service = CourseApiService()

    suspend fun getCourses(user: String, token: String) = service.getCourses(user,token)

    fun addCourse(user: String, token: String) = service.addCourse(user,token)

    fun getCourseData(user: String, course: String, token:String) = service.getCourseData(user, course, token)

    fun restartDB(user: String, token: String) = service.restartDB(user, token)

    fun getProfessorData(user: String, professor: String, token:String) = service.getProfessorData(user, professor, token)

    fun getStudentData(user: String, student: String, token:String) = service.getStudentData(user, student, token)

    fun addStudent(user: String, token: String, course: String) = service.addStudent(user,token, course)
}