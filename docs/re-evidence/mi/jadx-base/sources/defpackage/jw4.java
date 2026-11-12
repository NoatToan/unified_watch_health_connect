package defpackage;

import com.mi.fitness.capability.export.model.CapabilityModel;
import com.mi.fitness.course.schedule.di.CourseScheduleSingleModule;

/* JADX INFO: loaded from: classes5.dex */
public final class jw4 implements dei {
    public static CapabilityModel a(CourseScheduleSingleModule courseScheduleSingleModule) {
        return (CapabilityModel) f6i.c(courseScheduleSingleModule.provideCourseSchedule());
    }
}
