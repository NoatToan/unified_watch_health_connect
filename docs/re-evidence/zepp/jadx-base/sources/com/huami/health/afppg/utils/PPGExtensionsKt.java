package com.huami.health.afppg.utils;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\t\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\r\u001a\u00020\f*\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000\u001a\u001a\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\nH\u0000\u001a\u001a\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\nH\u0000\u001a\u001a\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\nH\u0000\u001a\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\fH\u0000\u001a\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002\u001a\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007\u001a\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019\"\u0016\u0010\u001f\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u001e\"\u0016\u0010!\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0016\u0010#\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001e¨\u0006$"}, d2 = {"", "", "", "listToByteArray", "", "offset", "len", "", "byteToLong", "byteToInt", "Ljava/util/TimeZone;", "timeZone", "", "toYMDHMS", "timestamp", "timezone", "timestampToYMDHMS", "timestampToYMDHMSChinaLocale", "timestampToYMD", "date", "yMDHMSToTimestamp", TrainingWebConst.QueryParam.VIDEO_FORMAT, "a", "time", "getZeroClockTimestamp", "Ljava/util/Date;", "date1", "date2", "", "isSameDay", "Ljava/lang/String;", "YYYY_MM_DD_HH_MM_SS", "b", "YYYY_MM_DD", "c", "TAG", "afppg-core_release"}, k = 2, mv = {1, 5, 1})
public final class PPGExtensionsKt {

    @NotNull
    private static final String a = "yyyy-MM-dd'T'HH:mm:ss";

    @NotNull
    private static final String b = "yyyy-MM-dd'T'";

    @NotNull
    private static final String c = "af_ppg_PPGExtensions";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("dateToMillisecond error ", this.a.getMessage());
        }
    }

    private static final long a(String str, String str2) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Date date = new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
            objM3845constructorimpl = Result.m3845constructorimpl(Long.valueOf(date == null ? 0L : date.getTime()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(c, new a(thM3848exceptionOrNullimpl));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = 0L;
        }
        return ((Number) objM3845constructorimpl).longValue();
    }

    public static final int byteToInt(@NotNull byte[] bArr, int i, int i2) {
        return (int) byteToLong(bArr, i, i2);
    }

    public static final long byteToLong(@NotNull byte[] bArr, int i, int i2) {
        long j = 0;
        if (i2 > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                j |= (((long) bArr[i + i3]) & 255) << (i3 * 8);
                if (i4 >= i2) {
                    break;
                }
                i3 = i4;
            }
        }
        return j;
    }

    public static final long getZeroClockTimestamp(long j) {
        return j - ((((long) TimeZone.getDefault().getRawOffset()) + j) % ((long) 86400000));
    }

    public static final boolean isSameDay(@Nullable Date date, @Nullable Date date2) {
        if (date == null || date2 == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    @NotNull
    public static final byte[] listToByteArray(@NotNull List<Byte> list) {
        int size = list.size();
        byte[] bArr = new byte[size];
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Byte b2 = list.get(i);
                if (b2 != null) {
                    bArr[i] = b2.byteValue();
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return bArr;
    }

    @NotNull
    public static final String timestampToYMD(long j, @NotNull TimeZone timeZone) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(b);
            simpleDateFormat.setTimeZone(timeZone);
            objM3845constructorimpl = Result.m3845constructorimpl(simpleDateFormat.format(Long.valueOf(j)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = "";
        }
        return (String) objM3845constructorimpl;
    }

    public static /* synthetic */ String timestampToYMD$default(long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return timestampToYMD(j, timeZone);
    }

    @NotNull
    public static final String timestampToYMDHMS(long j, @NotNull TimeZone timeZone) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            simpleDateFormat.setTimeZone(timeZone);
            objM3845constructorimpl = Result.m3845constructorimpl(simpleDateFormat.format(Long.valueOf(j)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = "";
        }
        return (String) objM3845constructorimpl;
    }

    public static /* synthetic */ String timestampToYMDHMS$default(long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return timestampToYMDHMS(j, timeZone);
    }

    @NotNull
    public static final String timestampToYMDHMSChinaLocale(long j, @NotNull TimeZone timeZone) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.CHINA);
            simpleDateFormat.setTimeZone(timeZone);
            objM3845constructorimpl = Result.m3845constructorimpl(simpleDateFormat.format(Long.valueOf(j)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = "";
        }
        return (String) objM3845constructorimpl;
    }

    public static /* synthetic */ String timestampToYMDHMSChinaLocale$default(long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return timestampToYMDHMSChinaLocale(j, timeZone);
    }

    @NotNull
    public static final String toYMDHMS(long j, @NotNull TimeZone timeZone) {
        return timestampToYMDHMS(j * ((long) 1000), timeZone);
    }

    public static /* synthetic */ String toYMDHMS$default(long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 1) != 0) {
            timeZone = TimeZone.getDefault();
        }
        return toYMDHMS(j, timeZone);
    }

    public static final long yMDHMSToTimestamp(@NotNull String str) {
        return a(str, "yyyy-MM-dd'T'HH:mm:ss");
    }
}
