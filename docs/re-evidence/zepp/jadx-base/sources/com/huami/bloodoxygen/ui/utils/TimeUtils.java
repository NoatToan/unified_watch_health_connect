package com.huami.bloodoxygen.ui.utils;

import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.core.utils.BloodOxygenUtils;
import com.huami.bloodoxygen.ui.R;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bK\u0010LJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J \u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J \u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J \u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002J \u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u0016\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010#\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010$\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010&\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010'\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u001eJ\u000e\u0010+\u001a\n **\u0004\u0018\u00010)0)J\u0016\u0010.\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u0005J\u0016\u00100\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005J\u000e\u00101\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0005J\u000e\u00104\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0005J\u0016\u00106\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\u0006\u00105\u001a\u00020\u0002J\u001e\u00109\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\u0006\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0005R\u0018\u0010<\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020\u001e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010F\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010AR\u0016\u0010H\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010AR\u0016\u0010J\u001a\u00020\u001e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010>¨\u0006M"}, d2 = {"Lcom/huami/bloodoxygen/ui/utils/TimeUtils;", "Lorg/koin/core/component/KoinComponent;", "Ljava/util/Date;", "startDate", "endDate", "", "differSeconds", "", "differDays", "offset", "", "next", "offsetDay", "differWeeks", "offsetWeek", "differMonths", "offsetMonth", "differYear", "offsetYear", "currentDate", "time", "getDayStartTime", "getDayEndTime", "getFirstDayOfWeekTime", "getLastDayOfWeekTime", "getFirstDayOfMonthTime", "getLastDayOfMonthTime", "getFirstDayOfYearTime", "getLastDayOfYearTime", "getTimeToHour", "", "pattern", "formatTime", "formatTimeYMDHHmm", "formatTimeYMD", "formatTimeYM", "formatTimeM", "formatTimeMD", "formatTimeHM", "getEtcDayZeroTime", "getEtcTime", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "getEtcTimeZone", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "formatTimeHMInEtc", "anotherTime", "isTheSameDay", "getYear", "timestamp", "getDayOfWeek", "getFirstDayTimestampInWeek", "date", "formatYear", "timeA", "timeB", "isSameYear", "a", "Landroid/content/Context;", "applicationContext", "b", "Ljava/lang/String;", "TAG", "c", LogUtil.I, "MILLISECOND_ONE_SECOND", GoogleApiAvailabilityLight.a, "MILLISECOND_ONE_MINUTE", "e", "MILLISECOND_ONE_HOUR", "f", "MILLISECOND_ONE_DAY", "g", "INVALID_FORMAT_DATE_STR", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class TimeUtils implements KoinComponent {

    @NotNull
    public static final TimeUtils INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "TimeUtils";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int MILLISECOND_ONE_SECOND = 1000;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int MILLISECOND_ONE_MINUTE = 60000;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int MILLISECOND_ONE_HOUR = 3600000;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final int MILLISECOND_ONE_DAY = 86400000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String INVALID_FORMAT_DATE_STR = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "differMonths:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "differWeeks:" + this.a.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "differYear:" + this.a;
        }
    }

    static {
        TimeUtils timeUtils = new TimeUtils();
        INSTANCE = timeUtils;
        applicationContext = (Context) timeUtils.getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(Context.class), null, null);
    }

    private TimeUtils() {
    }

    public static /* synthetic */ int differDays$default(TimeUtils timeUtils, Date date, Date date2, int i, Object obj) {
        if ((i & 2) != 0) {
            date2 = timeUtils.currentDate();
        }
        return timeUtils.differDays(date, date2);
    }

    public static /* synthetic */ int differMonths$default(TimeUtils timeUtils, Date date, Date date2, int i, Object obj) {
        if ((i & 2) != 0) {
            date2 = timeUtils.currentDate();
        }
        return timeUtils.differMonths(date, date2);
    }

    public static /* synthetic */ long differSeconds$default(TimeUtils timeUtils, Date date, Date date2, int i, Object obj) {
        if ((i & 2) != 0) {
            date2 = timeUtils.currentDate();
        }
        return timeUtils.differSeconds(date, date2);
    }

    public static /* synthetic */ int differWeeks$default(TimeUtils timeUtils, Date date, Date date2, int i, Object obj) {
        if ((i & 2) != 0) {
            date2 = timeUtils.currentDate();
        }
        return timeUtils.differWeeks(date, date2);
    }

    public static /* synthetic */ int differYear$default(TimeUtils timeUtils, Date date, Date date2, int i, Object obj) {
        if ((i & 2) != 0) {
            date2 = timeUtils.currentDate();
        }
        return timeUtils.differYear(date, date2);
    }

    public static /* synthetic */ long offsetDay$default(TimeUtils timeUtils, Date date, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return timeUtils.offsetDay(date, i, z);
    }

    public static /* synthetic */ long offsetMonth$default(TimeUtils timeUtils, Date date, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return timeUtils.offsetMonth(date, i, z);
    }

    public static /* synthetic */ long offsetWeek$default(TimeUtils timeUtils, Date date, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return timeUtils.offsetWeek(date, i, z);
    }

    public static /* synthetic */ long offsetYear$default(TimeUtils timeUtils, Date date, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return timeUtils.offsetYear(date, i, z);
    }

    @NotNull
    public final Date currentDate() {
        return new Date(System.currentTimeMillis());
    }

    public final int differDays(@NotNull Date startDate, @NotNull Date endDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(endDate);
        int i = calendar.get(6);
        int i2 = calendar2.get(6);
        int i3 = calendar.get(1);
        int i4 = calendar2.get(1);
        if (i3 == i4) {
            return i2 - i;
        }
        int i5 = 0;
        if (i3 < i4) {
            while (true) {
                int i6 = i3 + 1;
                i5 += ((i3 % 4 != 0 || i3 % 100 == 0) && i3 % 400 != 0) ? 365 : 366;
                if (i6 >= i4) {
                    break;
                }
                i3 = i6;
            }
        }
        return i5 + (i2 - i);
    }

    public final int differMonths(@NotNull Date startDate, @NotNull Date endDate) {
        int i;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(endDate);
        if (calendar.get(1) == calendar2.get(1)) {
            i = calendar2.get(2) - calendar.get(2);
        } else {
            i = (calendar2.get(2) - calendar.get(2)) + ((calendar2.get(1) - calendar.get(1)) * 12);
        }
        HMLog.info(TAG, new a(i));
        return i;
    }

    public final long differSeconds(@NotNull Date startDate, @NotNull Date endDate) {
        return Math.abs((endDate.getTime() - startDate.getTime()) / ((long) 1000));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004f  */
    public final int differWeeks(@NotNull Date startDate, @NotNull Date endDate) {
        Calendar calendar = Calendar.getInstance();
        TimeUtils timeUtils = INSTANCE;
        calendar.setTimeInMillis(timeUtils.getFirstDayOfWeekTime(startDate.getTime()));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(timeUtils.getFirstDayOfWeekTime(endDate.getTime()));
        int i = -1;
        int i2 = calendar.get(7) - 1;
        if (i2 == 0) {
            i2 = 7;
        }
        int iDifferDays = differDays(calendar.getTime(), calendar2.getTime()) + 1;
        Ref.IntRef intRef = new Ref.IntRef();
        int i3 = iDifferDays / 7;
        intRef.element = i3;
        if (iDifferDays > 0) {
            if ((iDifferDays % 7) + i2 > 7) {
                i = 1;
            } else {
                i = 0;
            }
        } else if (i2 + (iDifferDays % 7) >= 1) {
            i = 0;
        }
        intRef.element = i3 + i;
        HMLog.info(TAG, new b(intRef));
        return intRef.element;
    }

    public final int differYear(@NotNull Date startDate, @NotNull Date endDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(endDate);
        int i = calendar2.get(1) - calendar.get(1);
        HMLog.info(TAG, new c(i));
        return i;
    }

    @NotNull
    public final String formatTime(@NotNull String pattern, long time) {
        return new SimpleDateFormat(pattern, Locale.getDefault()).format(new Date(time));
    }

    @NotNull
    public final String formatTimeHM(long time) {
        Context context = applicationContext;
        return context == null ? "" : com.xiaomi.hm.health.baseutil.TimeUtils.formatDate(context.getString(R.string.time_HHmm_pattern), time);
    }

    @NotNull
    public final String formatTimeHMInEtc(@NotNull Context context, long time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(context.getString(R.string.time_HHmm_pattern), Locale.getDefault());
        simpleDateFormat.setTimeZone(INSTANCE.getEtcTimeZone());
        return simpleDateFormat.format(Long.valueOf(time));
    }

    @NotNull
    public final String formatTimeM(long time) {
        return com.xiaomi.hm.health.baseutil.TimeUtils.formatDate("M", time);
    }

    @NotNull
    public final String formatTimeMD(long time) {
        Context context = applicationContext;
        return context == null ? "" : com.xiaomi.hm.health.baseutil.TimeUtils.formatDate(context.getString(R.string.date_Md_pattern), time);
    }

    @NotNull
    public final String formatTimeYM(long time) {
        Context context = applicationContext;
        if (context == null) {
            return "";
        }
        return com.xiaomi.hm.health.baseutil.TimeUtils.formatDate(Intrinsics.areEqual(Locale.getDefault().getLanguage(), "zh") ? "yyyy/M" : context.getString(R.string.date_yM_unit_pattern_escape), time);
    }

    @NotNull
    public final String formatTimeYMD(long time) {
        Context context = applicationContext;
        return context == null ? "" : com.xiaomi.hm.health.baseutil.TimeUtils.formatDate(context.getString(R.string.date_yMd_pattern), time);
    }

    @NotNull
    public final String formatTimeYMDHHmm(long time) {
        Context context = applicationContext;
        if (context == null) {
            return "";
        }
        return context.getString(R.string.date_time_format_one, com.xiaomi.hm.health.baseutil.TimeUtils.formatDate(context.getString(R.string.date_yMd_pattern), time), com.xiaomi.hm.health.baseutil.TimeUtils.formatDate(context.getString(R.string.time_HHmm_pattern), time));
    }

    @NotNull
    public final String formatYear(@NotNull Context context, @NotNull Date date) {
        return new SimpleDateFormat(context.getString(R.string.bo_ui_year_value), Locale.getDefault()).format(date);
    }

    public final long getDayEndTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(INSTANCE.getDayStartTime(time));
        calendar.add(6, 1);
        calendar.add(14, -1);
        return calendar.getTimeInMillis();
    }

    public final int getDayOfWeek(long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        int i = calendar.get(7) - 1;
        if (i == 0) {
            return 7;
        }
        return i;
    }

    public final long getDayStartTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final long getEtcDayZeroTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(INSTANCE.getEtcTimeZone());
        return simpleDateFormat.parse("2022-01-01T00:00:00").getTime();
    }

    public final long getEtcTime(@NotNull String time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(INSTANCE.getEtcTimeZone());
        return simpleDateFormat.parse(time).getTime();
    }

    public final TimeZone getEtcTimeZone() {
        return TimeZone.getTimeZone("Etc/GMT0");
    }

    public final long getFirstDayOfMonthTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(1, 0);
        calendar.add(2, 0);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final long getFirstDayOfWeekTime(long time) {
        return getFirstDayTimestampInWeek(time);
    }

    public final long getFirstDayOfYearTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(1, 0);
        calendar.add(2, 0);
        calendar.add(5, 0);
        calendar.set(6, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final long getFirstDayTimestampInWeek(long timestamp) {
        int dayOfWeek = getDayOfWeek(timestamp) - 1;
        BloodOxygenUtils bloodOxygenUtils = BloodOxygenUtils.INSTANCE;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        calendar.add(5, -dayOfWeek);
        Unit unit = Unit.INSTANCE;
        return bloodOxygenUtils.getZeroTimeInMillis(calendar.getTimeInMillis());
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final long getLastDayOfMonthTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(1, 0);
        calendar.add(2, 0);
        calendar.set(5, calendar.getActualMaximum(5));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public final long getLastDayOfWeekTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(INSTANCE.getFirstDayOfWeekTime(time));
        calendar.add(5, 7);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(14, -1);
        return calendar.getTimeInMillis();
    }

    public final long getLastDayOfYearTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        int i = calendar.get(1);
        calendar.clear();
        calendar.set(1, i);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        calendar.roll(6, -1);
        return calendar.getTimeInMillis();
    }

    public final long getTimeToHour(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    @NotNull
    public final String getYear(long time) {
        return com.xiaomi.hm.health.baseutil.TimeUtils.formatDate("yyyy", new Date(time));
    }

    public final boolean isSameYear(@NotNull Context context, long timeA, long timeB) {
        return Intrinsics.areEqual(formatYear(context, new Date(timeA)), formatYear(context, new Date(timeB)));
    }

    public final boolean isTheSameDay(long time, long anotherTime) {
        long j = 86400000;
        return (time + ((long) TimeZone.getDefault().getOffset(time))) / j == (anotherTime + ((long) TimeZone.getDefault().getOffset(anotherTime))) / j;
    }

    public final long offsetDay(@NotNull Date startDate, int offset, boolean next) {
        if (!next) {
            offset = -offset;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(6, offset);
        return calendar.getTimeInMillis();
    }

    public final long offsetMonth(@NotNull Date startDate, int offset, boolean next) {
        if (!next) {
            offset = -offset;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(2, offset);
        calendar.set(5, 1);
        return calendar.getTimeInMillis();
    }

    public final long offsetWeek(@NotNull Date startDate, int offset, boolean next) {
        if (!next) {
            offset = -offset;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(INSTANCE.getFirstDayOfWeekTime(startDate.getTime()));
        calendar.add(3, offset);
        return getFirstDayOfWeekTime(calendar.getTimeInMillis());
    }

    public final long offsetYear(@NotNull Date startDate, int offset, boolean next) {
        if (!next) {
            offset = -offset;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.add(1, offset);
        calendar.set(6, 1);
        return calendar.getTimeInMillis();
    }
}
