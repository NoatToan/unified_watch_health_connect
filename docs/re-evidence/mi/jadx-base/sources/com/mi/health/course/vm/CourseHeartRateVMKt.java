package com.mi.health.course.vm;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"TAG", "", "SPORT_TIME", "", "MIN_SPEED", "", "DIALOG_AUTO_DISMISS_TIME", "STAGE_WARMUP", "", "STAGE_TRAINING", "STAGE_RELAX", "AVERAGE_HR", "MAX_HR", "DURING_HR", "LESSTHAN_HR", "MORETHAN_HR", "COURSE_COMPLETE", "KEY_HR_ABNORMAL", "KEY_HR_LESSTHAN", "KEY_HR_MORETHAN", "KEY_HR_PROTECT", "KEY_HR_SPEED_PROTECT", "KEY_HR_DIALOG_CLOSE", "course_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CourseHeartRateVMKt {
    private static final int AVERAGE_HR = 1;
    private static final int COURSE_COMPLETE = 4;
    public static final long DIALOG_AUTO_DISMISS_TIME = 10000;
    private static final int DURING_HR = 1;

    @NotNull
    public static final String KEY_HR_ABNORMAL = "abnormal_hr";

    @NotNull
    public static final String KEY_HR_DIALOG_CLOSE = "dialog_close";

    @NotNull
    public static final String KEY_HR_LESSTHAN = "lessThan_hr";

    @NotNull
    public static final String KEY_HR_MORETHAN = "moreThan_hr";

    @NotNull
    public static final String KEY_HR_PROTECT = "protect";

    @NotNull
    public static final String KEY_HR_SPEED_PROTECT = "speed_protect";
    private static final int LESSTHAN_HR = 2;
    private static final int MAX_HR = 2;
    private static final float MIN_SPEED = 1.0f;
    private static final int MORETHAN_HR = 3;
    private static final long SPORT_TIME = 60000;
    public static final int STAGE_RELAX = 3;
    public static final int STAGE_TRAINING = 2;
    public static final int STAGE_WARMUP = 1;

    @NotNull
    private static final String TAG = "CourseHeartRateVM";
}
