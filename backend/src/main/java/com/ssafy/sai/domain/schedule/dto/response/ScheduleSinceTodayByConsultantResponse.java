package com.ssafy.sai.domain.schedule.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ssafy.sai.domain.schedule.domain.Schedule;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class ScheduleSinceTodayByConsultantResponse {

    private Long id;

    private LocalDate scheduleDate;

    @JsonFormat(pattern = "HH:mm")
    private LocalTime startTime;

    @JsonFormat(pattern = "HH:mm")
    private LocalTime endTime;

    private String category;

    private String detail;

    private Long studentId;
    private String studentName;

    public ScheduleSinceTodayByConsultantResponse(Schedule schedule) {
        this.id = schedule.getId();
        this.scheduleDate = schedule.getScheduleDate();
        this.startTime = schedule.getStartTime();
        this.endTime = schedule.getEndTime();
        this.category = schedule.getCategory();
        this.detail = schedule.getDetail();
        this.studentId = schedule.getMemberStudent().getId();
        this.studentName = schedule.getMemberStudent().getName();
    }
}
