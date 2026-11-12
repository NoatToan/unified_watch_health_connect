package com.huami.sky.ui.utils;

import android.content.res.Resources;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\b\u0010\u0002\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\"\u0016\u0010\n\u001a\u00020\u00008\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "screenWidth", "screenHeight", "hour24", "hour12Format", "hour12", "", "isMorning", "hour24Format", "isAfternoon", "HOUR_FORMAT_12", LogUtil.I, "sky-ui_release"}, k = 2, mv = {1, 5, 1})
public final class UtilsKt {
    public static final int HOUR_FORMAT_12 = 12;

    public static final int hour12Format(int i) {
        if (i > 12) {
            return i - 12;
        }
        if (i == 12 || i == 0) {
            return 12;
        }
        return i;
    }

    public static final int hour24Format(int i, boolean z) {
        if (z) {
            if (i == 12) {
                return 0;
            }
            return i;
        }
        if (i == 12) {
            return 12;
        }
        return i + 12;
    }

    public static final boolean isAfternoon(int i) {
        return i < 12;
    }

    public static final int screenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static final int screenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }
}
