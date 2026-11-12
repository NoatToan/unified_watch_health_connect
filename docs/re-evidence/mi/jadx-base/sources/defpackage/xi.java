package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a \u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0002¨\u0006\n"}, d2 = {"", "Ljava/util/Date;", PluginDeviceInfo.FDESC, "Ljava/util/Calendar;", PluginDeviceInfo.FMODEL, "symbol", "sourceStr", "", "offsetIndex", "offsetChar", "btData_wearRelease"}, k = 2, mv = {1, 7, 1})
public final class xi {
    @Nullable
    public static final Calendar a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Date dateB = b(str);
        if (dateB == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateB);
        return calendar;
    }

    @Nullable
    public static final Date b(@NotNull String str) {
        String strA;
        Intrinsics.checkNotNullParameter(str, "<this>");
        String string = StringsKt__StringsKt.trim((CharSequence) str).toString();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (StringsKt__StringsKt.indexOf$default((CharSequence) upperCase, "Z", 0, false, 6, (Object) null) > 0) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
            String upperCase2 = string.toUpperCase(locale2);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
            strA = StringsKt__StringsJVMKt.replace$default(upperCase2, "Z", "+0000", false, 4, (Object) null);
        } else if (StringsKt__StringsKt.indexOf$default((CharSequence) string, Marker.ANY_NON_NULL_MARKER, 0, false, 6, (Object) null) > 0) {
            strA = a(string, Marker.ANY_NON_NULL_MARKER);
        } else {
            strA = StringsKt__StringsKt.indexOf$default((CharSequence) string, "-", 0, false, 6, (Object) null) > 0 ? a(string, "-") : "";
        }
        if (StringsKt__StringsKt.isBlank(strA)) {
            return null;
        }
        return StringsKt__StringsKt.contains$default((CharSequence) strA, (CharSequence) ":", false, 2, (Object) null) ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.getDefault()).parse(strA) : new SimpleDateFormat("yyyy-MM-dd'T'HHmmssZ", Locale.getDefault()).parse(strA);
    }

    public static final String a(String str, String str2) {
        String strA = a(str, StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null));
        return a(strA, StringsKt__StringsKt.indexOf$default((CharSequence) strA, str2, 0, false, 6, (Object) null), str2);
    }

    public static final String a(String str, int i) {
        String strSubstring = str.substring(i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        if (!StringsKt__StringsKt.contains$default((CharSequence) strSubstring, (CharSequence) ":", false, 2, (Object) null)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strSubstring2 = str.substring(0, i);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(strSubstring2);
        String strSubstring3 = str.substring(i);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
        sb.append(StringsKt__StringsJVMKt.replace$default(strSubstring3, ":", "", false, 4, (Object) null));
        return sb.toString();
    }

    public static final String a(String str, int i, String str2) {
        if ((str.length() - 1) - StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, i, false, 4, (Object) null) > 2) {
            return str;
        }
        return str + "00";
    }
}
