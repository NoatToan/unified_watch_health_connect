package com.huami.bloodpressure_ui.ext;

import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\n\u001a\u00020\t*\u00020\b\u001a\u001a\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u00030\u0003*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¨\u0006\u000f"}, d2 = {"", "", AnimatorViewWrapper.SCALE, "", "formatWithDecimal", "(Ljava/lang/Float;I)Ljava/lang/String;", "formatWithDecimalFloat", "(Ljava/lang/Float;I)F", "", "", "isToday", "Ljava/text/DateFormat;", TrainingWebConst.QueryParam.VIDEO_FORMAT, "kotlin.jvm.PlatformType", "millis2String", "bloodpressure-ui_release"}, k = 2, mv = {1, 5, 1})
public final class DataExKt {
    @NotNull
    public static final String formatWithDecimal(@Nullable Float f, int i) {
        if (f == null) {
            return "";
        }
        float fFloatValue = f.floatValue();
        return Float.isNaN(fFloatValue) ? "" : NumberFormatter.INSTANCE.formatFloat2String(fFloatValue, i, 4);
    }

    public static final float formatWithDecimalFloat(@Nullable Float f, int i) {
        if (f == null) {
            return 0.0f;
        }
        float fFloatValue = f.floatValue();
        if (Float.isNaN(fFloatValue)) {
            return 0.0f;
        }
        return NumberFormatter.INSTANCE.format(fFloatValue, i, 4);
    }

    public static final boolean isToday(long j) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        return calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2) && calendar2.get(5) == calendar.get(5);
    }

    public static final String millis2String(long j, @NotNull DateFormat dateFormat) {
        return dateFormat.format(new Date(j));
    }
}
