package com.huami.sleep.util;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.sleep.daysleep.quotient.SleepQuotientProviderKt;
import com.huami.sleep.service.bean.Stage;
import com.huami.sleep.service.bean.SummeryOnSleep;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005J*\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\nR\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/huami/sleep/util/SleepDataTransmitUtil;", "", "", "summery", "dateString", "", "fromSevenDay", "isEar", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "transmitSummeryToSleepInfo", "", "start", "end", "Lkotlin/Pair;", "Ljava/util/Date;", "calculateStartEndDate", "baseDate", "minute", "handleMinuteCalendar", "a", "Ljava/lang/String;", "TAG", "b", LogUtil.I, "ALL_DAY_MINUTE", "c", "SECOND_TO_MINUTE", GoogleApiAvailabilityLight.a, "DATE_YMD_FORMAT", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepDataTransmitUtil {

    @NotNull
    public static final SleepDataTransmitUtil INSTANCE = new SleepDataTransmitUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "SleepDataTransmitUtil";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int ALL_DAY_MINUTE = 1440;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int SECOND_TO_MINUTE = 60;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String DATE_YMD_FORMAT = "yyyy-MM-dd";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i, int i2) {
            super(0);
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "dateString = " + this.a + " - start = " + this.b + " - end = " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "calculateStartEndDate parse error";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ long b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, long j, boolean z, boolean z2) {
            super(0);
            this.a = str;
            this.b = j;
            this.c = z;
            this.d = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "dateString = " + this.a + " - timeLong = " + this.b + " - fromSevenDay = " + this.c + " - isEar = " + this.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "transmitSummeryToSleepInfo SummeryOnSleep Happen Exception = " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "transmitSummeryToSleepInfo SummeryOnSleep Happen Exception = " + this.a;
        }
    }

    private SleepDataTransmitUtil() {
    }

    public static /* synthetic */ SleepInfo transmitSummeryToSleepInfo$default(SleepDataTransmitUtil sleepDataTransmitUtil, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return sleepDataTransmitUtil.transmitSummeryToSleepInfo(str, str2, z, z2);
    }

    @NotNull
    public final Pair<Date, Date> calculateStartEndDate(@NotNull String dateString, int start, int end) {
        HMLog.info(TAG, new a(dateString, start, end));
        Date date = new Date();
        Date date2 = new Date();
        try {
            Date date3 = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).parse(dateString);
            date = handleMinuteCalendar(date3, start);
            date2 = handleMinuteCalendar(date3, end + 1);
        } catch (Exception e2) {
            HMLog.error$default(TAG, null, e2, b.a, 2, null);
        }
        return new Pair<>(date, date2);
    }

    @NotNull
    public final Date handleMinuteCalendar(@NotNull Date baseDate, int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTime(baseDate);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(12, minute + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN);
        return calendar.getTime();
    }

    @NotNull
    public final SleepInfo transmitSummeryToSleepInfo(@Nullable String summery, @NotNull String dateString, boolean fromSevenDay, boolean isEar) {
        long stringToLong = TimeUtils.parseStringToLong("yyyy-MM-dd", dateString);
        HMLog.info(TAG, new c(dateString, stringToLong, fromSevenDay, isEar));
        SleepInfo sleepInfo = new SleepInfo();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(stringToLong);
        Unit unit = Unit.INSTANCE;
        sleepInfo.setSportDay(new SportDay(calendar));
        if (summery == null) {
            HMLog.info(TAG, new d(summery));
            return sleepInfo;
        }
        try {
            SummeryOnSleep summeryOnSleep = (SummeryOnSleep) new Gson().fromJson(summery, SummeryOnSleep.class);
            sleepInfo.setSleepScore(summeryOnSleep.getSlp().getSs());
            sleepInfo.setNonRemCount(summeryOnSleep.getSlp().getDp());
            sleepInfo.setRemCount(summeryOnSleep.getSlp().getLt());
            sleepInfo.setAwakeCount(summeryOnSleep.getSlp().getWk());
            sleepInfo.setAwakeNum(summeryOnSleep.getSlp().getWc());
            sleepInfo.setDreamTime(summeryOnSleep.getSlp().getDt());
            String string = sleepInfo.getSportDay().toString();
            Stage stage = (Stage) CollectionsKt.firstOrNull((List) summeryOnSleep.getSlp().getStage());
            boolean z = false;
            int start = stage == null ? 0 : stage.getStart();
            Stage stage2 = (Stage) CollectionsKt.lastOrNull((List) summeryOnSleep.getSlp().getStage());
            Pair<Date, Date> pairCalculateStartEndDate = calculateStartEndDate(string, start, stage2 == null ? 0 : stage2.getStop());
            sleepInfo.setStartDate(pairCalculateStartEndDate.getFirst());
            sleepInfo.setStopDate(pairCalculateStartEndDate.getSecond());
            sleepInfo.setSleepCount(((summeryOnSleep.getSlp().getEd() - summeryOnSleep.getSlp().getSt()) / 60) - summeryOnSleep.getSlp().getWk());
            for (Stage stage3 : summeryOnSleep.getSlp().getStage()) {
                StageSleep stageSleep = new StageSleep();
                stageSleep.setInfos(stage3.getStart(), stage3.getStop(), stage3.getMode());
                sleepInfo.getStageSleep().add(stageSleep);
            }
            for (Stage stage4 : summeryOnSleep.getSlp().getOddStage()) {
                StageSleep stageSleep2 = new StageSleep();
                stageSleep2.setInfos(stage4.getStart(), stage4.getStop(), stage4.getMode());
                sleepInfo.getOddStageSleep().add(stageSleep2);
            }
            if (sleepInfo.getStageSleep().size() > 0 && sleepInfo.getSleepCount() > 0) {
                z = true;
            }
            sleepInfo.setHasSleep(z);
        } catch (Exception e2) {
            HMLog.error$default(TAG, null, e2, new e(summery), 2, null);
        }
        return sleepInfo;
    }
}
