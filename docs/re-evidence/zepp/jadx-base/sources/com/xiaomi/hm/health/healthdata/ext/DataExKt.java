package com.xiaomi.hm.health.healthdata.ext;

import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.watch.companion.util.NumberFormatter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "", AnimatorViewWrapper.SCALE, "", "formatWithDecimal", "(Ljava/lang/Float;I)Ljava/lang/String;", "formatWithDecimalFloat", "(Ljava/lang/Float;I)F", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class DataExKt {
    @NotNull
    public static final String formatWithDecimal(@Nullable Float f, int i) {
        if (f == null) {
            return "";
        }
        float fFloatValue = f.floatValue();
        return Float.isNaN(fFloatValue) ? "" : NumberFormatter.formatFloat2String(fFloatValue, i, 4);
    }

    public static final float formatWithDecimalFloat(@Nullable Float f, int i) {
        if (f == null) {
            return 0.0f;
        }
        float fFloatValue = f.floatValue();
        if (Float.isNaN(fFloatValue)) {
            return 0.0f;
        }
        return NumberFormatter.format(fFloatValue, i, 4);
    }
}
