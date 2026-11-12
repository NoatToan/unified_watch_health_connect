package com.mi.fitness.course.schecule.export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mi/fitness/course/schecule/export/CourseScheduleConstant;", "", "<init>", "()V", "SYNC_AIVS_ENGINE_STATUS_ACTION", "", "SYNC_AIVS_ENGINE_STATUS_READY", "aivs_engine_status", "", "getAivs_engine_status", "()I", "setAivs_engine_status", "(I)V", "ENGINE_STATUS_IDLE", "ENGINE_STATUS_INITIALIZING", "ENGINE_STATUS_READY", "course-schedule-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CourseScheduleConstant {
    public static final int ENGINE_STATUS_IDLE = 0;
    public static final int ENGINE_STATUS_INITIALIZING = 1;
    public static final int ENGINE_STATUS_READY = 2;

    @NotNull
    public static final CourseScheduleConstant INSTANCE = new CourseScheduleConstant();

    @NotNull
    public static final String SYNC_AIVS_ENGINE_STATUS_ACTION = "com.mi.health.sync_aivs_engine_status_action";

    @NotNull
    public static final String SYNC_AIVS_ENGINE_STATUS_READY = "sync_aivs_engine_status_ready";
    private static int aivs_engine_status;

    private CourseScheduleConstant() {
    }

    public final int getAivs_engine_status() {
        return aivs_engine_status;
    }

    public final void setAivs_engine_status(int i) {
        aivs_engine_status = i;
    }
}
