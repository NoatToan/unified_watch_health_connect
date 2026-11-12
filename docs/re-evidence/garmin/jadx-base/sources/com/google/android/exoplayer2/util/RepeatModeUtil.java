package com.google.android.exoplayer2.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes14.dex */
public final class RepeatModeUtil {
    public static final int REPEAT_TOGGLE_MODE_ALL = 2;
    public static final int REPEAT_TOGGLE_MODE_NONE = 0;
    public static final int REPEAT_TOGGLE_MODE_ONE = 1;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatToggleModes {
    }

    private RepeatModeUtil() {
    }

    public static int getNextRepeatMode(int i14, int i15) {
        for (int i16 = 1; i16 <= 2; i16++) {
            int i17 = (i14 + i16) % 3;
            if (isRepeatModeEnabled(i17, i15)) {
                return i17;
            }
        }
        return i14;
    }

    public static boolean isRepeatModeEnabled(int i14, int i15) {
        if (i14 == 0) {
            return true;
        }
        if (i14 != 1) {
            return i14 == 2 && (i15 & 2) != 0;
        }
        return (i15 & 1) != 0;
    }
}
