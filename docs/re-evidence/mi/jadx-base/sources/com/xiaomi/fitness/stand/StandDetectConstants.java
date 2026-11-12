package com.xiaomi.fitness.stand;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/stand/StandDetectConstants;", "", "<init>", "()V", "TAG", "", "KEY_TIME", "DETECT_SPF_NAME", "DEFAULT_START_HOUR", "", "DEFAULT_END_HOUR", "DETECT_IGNORE_NOTICE_START", "DETECT_IGNORE_NOTICE_END", "STEP_MIN_COUNT", "REMIND_DURATION", "REMIND_TAIL", "REQUEST_CODE_STAND_REMINDER_SHOW", "REQUEST_CODE_STAND_REMINDER_CANCEL", "APPLICATION_ID", "ACTION_STAND_REMINDER_SHOW", "getACTION_STAND_REMINDER_SHOW", "()Ljava/lang/String;", "ACTION_STAND_REMINDER_CANCEL", "getACTION_STAND_REMINDER_CANCEL", "ACTION_STAND_RECORD", "getACTION_STAND_RECORD", "ACTION_STAND_STOP_REMIND", "getACTION_STAND_STOP_REMIND", "ACTION_STAND_STOP_REMIND_TODAY", "getACTION_STAND_STOP_REMIND_TODAY", "ACTION_STAND_DETAIL", "getACTION_STAND_DETAIL", "stand-detect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StandDetectConstants {

    @NotNull
    private static final String ACTION_STAND_DETAIL;

    @NotNull
    private static final String ACTION_STAND_RECORD;

    @NotNull
    private static final String ACTION_STAND_REMINDER_CANCEL;

    @NotNull
    private static final String ACTION_STAND_REMINDER_SHOW;

    @NotNull
    private static final String ACTION_STAND_STOP_REMIND;

    @NotNull
    private static final String ACTION_STAND_STOP_REMIND_TODAY;

    @NotNull
    private static final String APPLICATION_ID;
    public static final int DEFAULT_END_HOUR = 2000;
    public static final int DEFAULT_START_HOUR = 800;
    public static final int DETECT_IGNORE_NOTICE_END = 1400;
    public static final int DETECT_IGNORE_NOTICE_START = 1200;

    @NotNull
    public static final String DETECT_SPF_NAME = "stand_detect";

    @NotNull
    public static final StandDetectConstants INSTANCE = new StandDetectConstants();

    @NotNull
    public static final String KEY_TIME = "key_time";
    public static final int REMIND_DURATION = 50;
    public static final int REMIND_TAIL = 10;
    public static final int REQUEST_CODE_STAND_REMINDER_CANCEL = 1;
    public static final int REQUEST_CODE_STAND_REMINDER_SHOW = 0;
    public static final int STEP_MIN_COUNT = 100;

    @NotNull
    public static final String TAG = "StandDetector";

    static {
        String packageName = ApplicationExtKt.getApplication().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        APPLICATION_ID = packageName;
        ACTION_STAND_REMINDER_SHOW = packageName + ".action.ACTION_STAND_REMINDER_SHOW";
        ACTION_STAND_REMINDER_CANCEL = packageName + ".action.ACTION_STAND_REMINDER_CANCEL";
        ACTION_STAND_RECORD = packageName + ".action.ACTION_STAND_RECORD";
        ACTION_STAND_STOP_REMIND = packageName + ".action.ACTION_STOP_REMIND";
        ACTION_STAND_STOP_REMIND_TODAY = packageName + ".action.ACTION_STOP_REMIND_TODAY";
        ACTION_STAND_DETAIL = packageName + ".action.ACTION_STAND_DETAIL";
    }

    private StandDetectConstants() {
    }

    @NotNull
    public final String getACTION_STAND_DETAIL() {
        return ACTION_STAND_DETAIL;
    }

    @NotNull
    public final String getACTION_STAND_RECORD() {
        return ACTION_STAND_RECORD;
    }

    @NotNull
    public final String getACTION_STAND_REMINDER_CANCEL() {
        return ACTION_STAND_REMINDER_CANCEL;
    }

    @NotNull
    public final String getACTION_STAND_REMINDER_SHOW() {
        return ACTION_STAND_REMINDER_SHOW;
    }

    @NotNull
    public final String getACTION_STAND_STOP_REMIND() {
        return ACTION_STAND_STOP_REMIND;
    }

    @NotNull
    public final String getACTION_STAND_STOP_REMIND_TODAY() {
        return ACTION_STAND_STOP_REMIND_TODAY;
    }
}
