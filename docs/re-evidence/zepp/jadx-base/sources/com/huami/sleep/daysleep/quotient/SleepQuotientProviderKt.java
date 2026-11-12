package com.huami.sleep.daysleep.quotient;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0014\"\u0016\u0010\u0001\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0016\u0010\u0004\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0016\u0010\u0005\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0016\u0010\u0006\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0016\u0010\u0007\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0016\u0010\b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0016\u0010\t\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u0016\u0010\n\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0016\u0010\u000b\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0002\"\u0016\u0010\f\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0016\u0010\r\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0002\"\u0016\u0010\u000e\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0002\"\u0016\u0010\u000f\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0002\"\u0016\u0010\u0010\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0002\"\u0016\u0010\u0011\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0002\"\u0016\u0010\u0012\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0002\"\u0016\u0010\u0013\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0002¨\u0006\u0014"}, d2 = {"", "DEEP_MAX", LogUtil.I, "DEEP_MIN", "LIGHT_MAX", "LIGHT_MIN", "INTO_SLEEP_MAX", "INTO_SLEEP_MIN", "REM_MAX", "REM_MIN", "AWAKE_COUNT_MAX", "AWAKE_COUNT_MIN", "BREATH_QUALITY_MAX", "BREATH_QUALITY_MIN", "SLEEP_DURATION_MAX", "SLEEP_DURATION_MIN", "SLEEP_FALL_ASLEEP_MIN", "SLEEP_FALL_ASLEEP_MAX", "SLEEP_WAKE_UP_MIN", "SLEEP_WAKE_UP_MAX", "sleep_release"}, k = 2, mv = {1, 5, 1})
public final class SleepQuotientProviderKt {
    public static final int AWAKE_COUNT_MAX = 2;
    public static final int AWAKE_COUNT_MIN = 0;
    public static final int BREATH_QUALITY_MAX = 100;
    public static final int BREATH_QUALITY_MIN = 90;
    public static final int DEEP_MAX = 60;
    public static final int DEEP_MIN = 20;
    public static final int INTO_SLEEP_MAX = 30;
    public static final int INTO_SLEEP_MIN = 0;
    public static final int LIGHT_MAX = 55;
    public static final int LIGHT_MIN = 0;
    public static final int REM_MAX = 30;
    public static final int REM_MIN = 10;
    public static final int SLEEP_DURATION_MAX = 600;
    public static final int SLEEP_DURATION_MIN = 360;
    public static final int SLEEP_FALL_ASLEEP_MAX = 0;
    public static final int SLEEP_FALL_ASLEEP_MIN = -1440;
    public static final int SLEEP_WAKE_UP_MAX = 1440;
    public static final int SLEEP_WAKE_UP_MIN = 360;
}
