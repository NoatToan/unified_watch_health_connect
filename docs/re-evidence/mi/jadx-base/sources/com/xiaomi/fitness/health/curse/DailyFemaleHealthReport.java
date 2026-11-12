package com.xiaomi.fitness.health.curse;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u0000 %2\u00020\u0001:\u0001%B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010#\u001a\u00020\u0013H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010\fR\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\n\"\u0004\b\"\u0010\f¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/health/curse/DailyFemaleHealthReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", "sid", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "getSid", "setSid", "(Ljava/lang/String;)V", "curseValueValid", "", "getCurseValueValid", "()Z", "setCurseValueValid", "(Z)V", "isFemale", "setFemale", "menstrualStartTime", "getMenstrualStartTime", "setMenstrualStartTime", "menstrualEndTime", "getMenstrualEndTime", "setMenstrualEndTime", "todayTime", "getTodayTime", "setTodayTime", "isEmpty", "toString", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DailyFemaleHealthReport extends DailyBasicReport {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean curseValueValid;
    private boolean isFemale;
    private long menstrualEndTime;
    private long menstrualStartTime;

    @Nullable
    private String sid;

    @NotNull
    private final String tag;
    private long time;
    private long todayTime;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/health/curse/DailyFemaleHealthReport$Companion;", "", "<init>", "()V", "createDailyFemaleHealthReport", "Lcom/xiaomi/fitness/health/curse/DailyFemaleHealthReport;", "time", "", "tag", "", "sid", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ DailyFemaleHealthReport createDailyFemaleHealthReport$default(Companion companion, long j, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "home";
            }
            if ((i & 4) != 0) {
                str2 = "";
            }
            return companion.createDailyFemaleHealthReport(j, str, str2);
        }

        @NotNull
        public final DailyFemaleHealthReport createDailyFemaleHealthReport(long time, @NotNull String tag, @NotNull String sid) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(sid, "sid");
            DailyFemaleHealthReport dailyFemaleHealthReport = new DailyFemaleHealthReport(time, tag, sid);
            long beginOfToday = TimeUtils.getBeginOfToday() / ((long) 1000);
            long seconds = TimeUnit.DAYS.toSeconds(1L);
            long j = beginOfToday - (((long) 3) * seconds);
            dailyFemaleHealthReport.setCurseValueValid(true);
            dailyFemaleHealthReport.setMenstrualStartTime(j);
            dailyFemaleHealthReport.setMenstrualEndTime(j + (((long) 6) * seconds));
            dailyFemaleHealthReport.setTodayTime(beginOfToday);
            return dailyFemaleHealthReport;
        }
    }

    public DailyFemaleHealthReport(long j, @NotNull String tag, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.time = j;
        this.tag = tag;
        this.sid = str;
    }

    public final boolean getCurseValueValid() {
        return this.curseValueValid;
    }

    public final long getMenstrualEndTime() {
        return this.menstrualEndTime;
    }

    public final long getMenstrualStartTime() {
        return this.menstrualStartTime;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public long getTime() {
        return this.time;
    }

    public final long getTodayTime() {
        return this.todayTime;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        return this.curseValueValid;
    }

    /* JADX INFO: renamed from: isFemale, reason: from getter */
    public final boolean getIsFemale() {
        return this.isFemale;
    }

    public final void setCurseValueValid(boolean z) {
        this.curseValueValid = z;
    }

    public final void setFemale(boolean z) {
        this.isFemale = z;
    }

    public final void setMenstrualEndTime(long j) {
        this.menstrualEndTime = j;
    }

    public final void setMenstrualStartTime(long j) {
        this.menstrualStartTime = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    public final void setTodayTime(long j) {
        this.todayTime = j;
    }

    @NotNull
    public String toString() {
        return "DailyFemaleHealthReport(time=" + getTime() + ", tag='" + getTag() + "', sid=" + getSid() + ", curseValueValid=" + this.curseValueValid + ", isFemale=" + this.isFemale + ", menstrualStartTime=" + this.menstrualStartTime + ", menstrualEndTime=" + this.menstrualEndTime + ", todayTime=" + this.todayTime + ")";
    }
}
