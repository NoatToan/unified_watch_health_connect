package com.mi.health.course.di;

import com.mi.health.course.export.CourseManager;
import com.mi.health.course.export.CourseManagerImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/mi/health/course/di/CourseSingleModule;", "", "<init>", "()V", "bindDeviceManager", "Lcom/mi/health/course/export/CourseManager;", "habitManager", "Lcom/mi/health/course/export/CourseManagerImpl;", "course_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CourseSingleModule {
    @NotNull
    public abstract CourseManager bindDeviceManager(@NotNull CourseManagerImpl habitManager);
}
