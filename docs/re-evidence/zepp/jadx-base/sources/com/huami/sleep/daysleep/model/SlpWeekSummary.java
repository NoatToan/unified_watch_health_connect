package com.huami.sleep.daysleep.model;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\bD\u0018\u0000 M2\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001c\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\u0015R$\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\b\"\u0004\b\u001d\u0010\u0015R$\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\b\"\u0004\b!\u0010\u0015R\"\u0010&\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\f\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\"\u0010*\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\f\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010R\"\u0010.\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\f\u001a\u0004\b,\u0010\u000e\"\u0004\b-\u0010\u0010R\"\u00102\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\f\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\u0010R\"\u00106\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\f\u001a\u0004\b4\u0010\u000e\"\u0004\b5\u0010\u0010R\"\u0010:\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\f\u001a\u0004\b8\u0010\u000e\"\u0004\b9\u0010\u0010R\"\u0010>\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\f\u001a\u0004\b<\u0010\u000e\"\u0004\b=\u0010\u0010R\"\u0010B\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010\f\u001a\u0004\b@\u0010\u000e\"\u0004\bA\u0010\u0010R\"\u0010F\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\f\u001a\u0004\bD\u0010\u000e\"\u0004\bE\u0010\u0010R\"\u0010J\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010\f\u001a\u0004\bH\u0010\u000e\"\u0004\bI\u0010\u0010¨\u0006N"}, d2 = {"Lcom/huami/sleep/daysleep/model/SlpWeekSummary;", "", "", "a", "", "toString", "Ljava/lang/String;", "getMTag", "()Ljava/lang/String;", "mTag", "", "b", LogUtil.I, "getMStatus", "()I", "setMStatus", "(I)V", "mStatus", "c", "getWeekStartDate", "setWeekStartDate", "(Ljava/lang/String;)V", "weekStartDate", GoogleApiAvailabilityLight.a, "getWeekEndDate", "setWeekEndDate", "weekEndDate", "e", "getBestScoreDate", "setBestScoreDate", "bestScoreDate", "f", "getWorstScoreDate", "setWorstScoreDate", "worstScoreDate", "g", "getDaySleep", "setDaySleep", "daySleep", "h", "getDayDeepSleep", "setDayDeepSleep", "dayDeepSleep", "i", "getDayLowSleep", "setDayLowSleep", "dayLowSleep", z.j, "getDayIntoSleepTime", "setDayIntoSleepTime", "dayIntoSleepTime", hl.k, "getDayWakeUpTime", "setDayWakeUpTime", "dayWakeUpTime", "l", "getDayAWake", "setDayAWake", "dayAWake", "m", "getDayIntoSleepCoast", "setDayIntoSleepCoast", "dayIntoSleepCoast", GoogleApiAvailabilityLight.b, "getDayLazyBedTime", "setDayLazyBedTime", "dayLazyBedTime", "o", "getDayRem", "setDayRem", "dayRem", b.r, "getDayScore", "setDayScore", "dayScore", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SlpWeekSummary {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "SlpWeekSummery";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String weekStartDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String weekEndDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String bestScoreDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private String worstScoreDate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int daySleep;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int dayDeepSleep;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int dayLowSleep;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int dayIntoSleepTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int dayWakeUpTime;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int dayAWake;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int dayIntoSleepCoast;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int dayLazyBedTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int dayRem;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int dayScore;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/huami/sleep/daysleep/model/SlpWeekSummary$Companion;", "", "", "userId", "Lcom/huami/sleep/daysleep/model/SlpWeekSummary;", "weekSummery", "fillWeekSummary", "(Ljava/lang/String;Lcom/huami/sleep/daysleep/model/SlpWeekSummary;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.daysleep.model.SlpWeekSummary$Companion", f = "SlpWeekSummary.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {78}, m = "fillWeekSummary", n = {"userId", "weekSummery", "wStart", "totalMinutesSleep", "validSleepDays", "validDpSleepDays", "bScore", "wScore", "offset", "i"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$2"})
        public static final class a extends ContinuationImpl {
            public Object a;
            public Object b;
            public Object c;
            public Object d;
            public Object e;
            public Object f;
            public Object g;
            public Object h;
            public int i;
            public int j;
            public int k;
            public /* synthetic */ Object l;
            public int n;

            public a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.l = obj;
                this.n |= Integer.MIN_VALUE;
                return Companion.this.fillWeekSummary(null, null, this);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ SlpWeekSummary a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SlpWeekSummary slpWeekSummary) {
                super(0);
                this.a = slpWeekSummary;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "weekStart = " + this.a.getWeekStartDate() + ";weekEnd = " + this.a.getWeekEndDate();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ Ref.IntRef a;
            public final /* synthetic */ Ref.IntRef b;
            public final /* synthetic */ SlpWeekSummary c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Ref.IntRef intRef, Ref.IntRef intRef2, SlpWeekSummary slpWeekSummary) {
                super(0);
                this.a = intRef;
                this.b = intRef2;
                this.c = slpWeekSummary;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "validSleepDays = " + this.a.element + ",validDpSleepDays = " + this.b.element + "\n本周活动数据如下：" + this.c;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00f0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:23:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:24:0x0106  */
        /* JADX WARN: Code duplicated, block: B:26:0x0199  */
        /* JADX WARN: Code duplicated, block: B:28:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:29:0x01d0  */
        /* JADX WARN: Code duplicated, block: B:32:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:35:0x01ed  */
        /* JADX WARN: Code duplicated, block: B:38:0x020c  */
        /* JADX WARN: Code duplicated, block: B:40:0x0212  */
        /* JADX WARN: Code duplicated, block: B:41:0x0220  */
        /* JADX WARN: Code duplicated, block: B:43:0x0228  */
        /* JADX WARN: Code duplicated, block: B:44:0x0236  */
        /* JADX WARN: Code duplicated, block: B:47:0x0240  */
        /* JADX WARN: Code duplicated, block: B:48:0x0245  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00f1 -> B:21:0x00f6). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object fillWeekSummary(@org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.NotNull com.huami.sleep.daysleep.model.SlpWeekSummary r23, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.huami.sleep.daysleep.model.SlpWeekSummary> r24) {
            /*
                Method dump skipped, instruction units count: 738
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.sleep.daysleep.model.SlpWeekSummary.Companion.fillWeekSummary(java.lang.String, com.huami.sleep.daysleep.model.SlpWeekSummary, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        this.daySleep = 0;
        this.dayDeepSleep = 0;
        this.dayLowSleep = 0;
        this.dayIntoSleepTime = 0;
        this.dayWakeUpTime = 0;
        this.dayAWake = 0;
        this.mStatus = 0;
        this.dayIntoSleepCoast = 0;
        this.dayLazyBedTime = 0;
        this.dayRem = 0;
        this.dayScore = 0;
    }

    @Nullable
    public final String getBestScoreDate() {
        return this.bestScoreDate;
    }

    public final int getDayAWake() {
        return this.dayAWake;
    }

    public final int getDayDeepSleep() {
        return this.dayDeepSleep;
    }

    public final int getDayIntoSleepCoast() {
        return this.dayIntoSleepCoast;
    }

    public final int getDayIntoSleepTime() {
        return this.dayIntoSleepTime;
    }

    public final int getDayLazyBedTime() {
        return this.dayLazyBedTime;
    }

    public final int getDayLowSleep() {
        return this.dayLowSleep;
    }

    public final int getDayRem() {
        return this.dayRem;
    }

    public final int getDayScore() {
        return this.dayScore;
    }

    public final int getDaySleep() {
        return this.daySleep;
    }

    public final int getDayWakeUpTime() {
        return this.dayWakeUpTime;
    }

    public final int getMStatus() {
        return this.mStatus;
    }

    @NotNull
    public final String getMTag() {
        return this.mTag;
    }

    @Nullable
    public final String getWeekEndDate() {
        return this.weekEndDate;
    }

    @Nullable
    public final String getWeekStartDate() {
        return this.weekStartDate;
    }

    @Nullable
    public final String getWorstScoreDate() {
        return this.worstScoreDate;
    }

    public final void setBestScoreDate(@Nullable String str) {
        this.bestScoreDate = str;
    }

    public final void setDayAWake(int i) {
        this.dayAWake = i;
    }

    public final void setDayDeepSleep(int i) {
        this.dayDeepSleep = i;
    }

    public final void setDayIntoSleepCoast(int i) {
        this.dayIntoSleepCoast = i;
    }

    public final void setDayIntoSleepTime(int i) {
        this.dayIntoSleepTime = i;
    }

    public final void setDayLazyBedTime(int i) {
        this.dayLazyBedTime = i;
    }

    public final void setDayLowSleep(int i) {
        this.dayLowSleep = i;
    }

    public final void setDayRem(int i) {
        this.dayRem = i;
    }

    public final void setDayScore(int i) {
        this.dayScore = i;
    }

    public final void setDaySleep(int i) {
        this.daySleep = i;
    }

    public final void setDayWakeUpTime(int i) {
        this.dayWakeUpTime = i;
    }

    public final void setMStatus(int i) {
        this.mStatus = i;
    }

    public final void setWeekEndDate(@Nullable String str) {
        this.weekEndDate = str;
    }

    public final void setWeekStartDate(@Nullable String str) {
        this.weekStartDate = str;
    }

    public final void setWorstScoreDate(@Nullable String str) {
        this.worstScoreDate = str;
    }

    @NotNull
    public String toString() {
        return "weekStartDate : " + this.weekStartDate + ";weekEndDate = " + this.weekEndDate + "\ndaySleep = " + this.daySleep + "\ndayDeepSleep = " + this.dayDeepSleep + "\ndayLowSleep = " + this.dayLowSleep + "\ndayAWake = " + this.dayAWake + "\ndayIntoSleep = " + this.dayIntoSleepTime + "\ndayWakeUp = " + this.dayWakeUpTime;
    }
}
