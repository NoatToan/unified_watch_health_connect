package com.huami.ai.uitls;

import com.google.android.material.datepicker.UtcDates;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0000\u001a\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000\u001a\u0014\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a \u0010\u000e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0000H\u0002¨\u0006\u000f"}, d2 = {"", "Ljava/util/Date;", "iso0860ToDate", "Ljava/util/Calendar;", "iso0860ToCalendar", "zoneId", "utcString", "symbol", "b", "sourceStr", "", "offsetIndex", "c", "offsetChar", "a", "speech-skill_release"}, k = 2, mv = {1, 5, 1})
public final class ISO8601DateFormatterKt {
    private static final String a(String str, int i, String str2) {
        return (str.length() + (-1)) - StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, i, false, 4, (Object) null) <= 2 ? Intrinsics.stringPlus(str, "00") : str;
    }

    private static final String b(String str, String str2) {
        String strC = c(str, StringsKt__StringsKt.indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null));
        return a(strC, StringsKt__StringsKt.indexOf$default((CharSequence) strC, str2, 0, false, 6, (Object) null), str2);
    }

    private static final String c(String str, int i) {
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        return StringsKt__StringsKt.contains$default((CharSequence) str.substring(i), (CharSequence) ":", false, 2, (Object) null) ? Intrinsics.stringPlus(str.substring(0, i), m.replace$default(str.substring(i), ":", "", false, 4, (Object) null)) : str;
    }

    @Nullable
    public static final Calendar iso0860ToCalendar(@NotNull String str) {
        Date dateIso0860ToDate = iso0860ToDate(str);
        if (dateIso0860ToDate == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateIso0860ToDate);
        return calendar;
    }

    @Nullable
    public static final Date iso0860ToDate(@NotNull String str) {
        String strB;
        String string = StringsKt__StringsKt.trim(str).toString();
        Locale locale = Locale.getDefault();
        Objects.requireNonNull(string, "null cannot be cast to non-null type java.lang.String");
        if (StringsKt__StringsKt.indexOf$default((CharSequence) string.toUpperCase(locale), "Z", 0, false, 6, (Object) null) > 0) {
            strB = m.replace$default(string.toUpperCase(Locale.getDefault()), "Z", "+0000", false, 4, (Object) null);
        } else if (StringsKt__StringsKt.indexOf$default((CharSequence) string, "+", 0, false, 6, (Object) null) > 0) {
            strB = b(string, "+");
        } else {
            strB = StringsKt__StringsKt.indexOf$default((CharSequence) string, Constants.ACCEPT_TIME_SEPARATOR_SERVER, 0, false, 6, (Object) null) > 0 ? b(string, Constants.ACCEPT_TIME_SEPARATOR_SERVER) : "";
        }
        if (m.isBlank(strB)) {
            return null;
        }
        return StringsKt__StringsKt.contains$default((CharSequence) strB, (CharSequence) ":", false, 2, (Object) null) ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.getDefault()).parse(strB) : new SimpleDateFormat("yyyy-MM-dd'T'HHmmssZ", Locale.getDefault()).parse(strB);
    }

    @Nullable
    public static final String utcString(@NotNull String str, @NotNull String str2) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            TimeZone timeZone = TimeZone.getTimeZone(str2);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
            simpleDateFormat.setTimeZone(timeZone);
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
            objM3845constructorimpl = Result.m3845constructorimpl(Intrinsics.stringPlus(simpleDateFormat.format(date), "+0000"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }
}
