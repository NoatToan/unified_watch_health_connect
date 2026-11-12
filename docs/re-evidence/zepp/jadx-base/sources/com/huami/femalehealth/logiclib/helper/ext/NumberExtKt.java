package com.huami.femalehealth.logiclib.helper.ext;

import com.huami.femalehealth.logiclib.helper.DateHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007\u001a\u001a\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000b¨\u0006\f"}, d2 = {"", "", "fmt", "dateFormat", "Ljava/util/Locale;", "locale", "pattern", "", "min", "max", "limit", "", "logiclib_release"}, k = 2, mv = {1, 5, 1})
public final class NumberExtKt {
    @NotNull
    public static final String dateFormat(long j, @NotNull String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j));
    }

    public static /* synthetic */ String dateFormat$default(long j, Locale locale, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "MM-dd";
        }
        return dateFormat(j, locale, str);
    }

    public static final int limit(int i, int i2, int i3) {
        return Math.min(i3, Math.max(i, i2));
    }

    @NotNull
    public static final String dateFormat(long j) {
        return DateHelper.convertUTCDate$default(DateHelper.INSTANCE, j, false, 2, null);
    }

    public static final float limit(float f, float f2, float f3) {
        return Math.min(f3, Math.max(f, f2));
    }

    @NotNull
    public static final String dateFormat(long j, @NotNull Locale locale, @NotNull String str) {
        return new SimpleDateFormat(str, locale).format(new Date(j));
    }
}
