package defpackage;

import com.mi.fitness.course.schedule.di.CourseScheduleSingleModule;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;

/* JADX INFO: loaded from: classes5.dex */
public final class kw4 implements dei {
    public static TabContentItem a(CourseScheduleSingleModule courseScheduleSingleModule) {
        return (TabContentItem) f6i.c(courseScheduleSingleModule.provideCourseScheduleItem());
    }
}
