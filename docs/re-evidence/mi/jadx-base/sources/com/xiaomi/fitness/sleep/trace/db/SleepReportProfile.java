package com.xiaomi.fitness.sleep.trace.db;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.health.sleep.ui.SleepBreathRateDetailFragment;
import com.xiaomi.fitness.sleep.trace.util.DateNumHelper;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 22\u00020\u0001:\u00012B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0014\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\b\u0010-\u001a\u00020\u001aH\u0016J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u001aH\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001e\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001e\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001e\u0010\u0016\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\n\"\u0004\b\u0018\u0010\fR\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\u001e\u0010(\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u0011\u0010+\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\n¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/db/SleepReportProfile;", "Landroid/os/Parcelable;", "<init>", "()V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "dateNum", "", "getDateNum", "()J", "setDateNum", "(J)V", "sleepTime", "getSleepTime", "setSleepTime", "wakeTime", "getWakeTime", "setWakeTime", "manualSleepTime", "getManualSleepTime", "setManualSleepTime", "manualWakeTime", "getManualWakeTime", "setManualWakeTime", "analyzerVersion", "", "getAnalyzerVersion", "()I", "setAnalyzerVersion", "(I)V", "analyzerName", "", "getAnalyzerName", "()Ljava/lang/String;", "setAnalyzerName", "(Ljava/lang/String;)V", "reportCode", "getReportCode", "setReportCode", "version", "getVersion", "setVersion", "dateTime", "getDateTime", "describeContents", "writeToParcel", "", "dest", "flags", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepReportProfile implements Parcelable {
    public static final int CODE_EMPTY = 0;
    public static final int CODE_SUCCESS = 1;
    public static final int CODE_UNABLE_GENERATE = -1;

    @Nullable
    private static SleepReportProfile EMPTY;

    @ColumnInfo(name = "analyzer_name")
    @Nullable
    private String analyzerName;

    @ColumnInfo(name = "analyzer_version")
    private int analyzerVersion;

    @PrimaryKey
    @ColumnInfo(name = "date_num")
    private long dateNum;

    @ColumnInfo(name = "manual_sleep_time")
    private long manualSleepTime;

    @ColumnInfo(name = "manual_wake_time")
    private long manualWakeTime;

    @ColumnInfo(name = "report_code")
    private int reportCode;

    @ColumnInfo(name = "sleep_time")
    private long sleepTime;

    @ColumnInfo(name = "version")
    private int version;

    @ColumnInfo(name = SleepBreathRateDetailFragment.KEY_WAKE_TIME)
    private long wakeTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<SleepReportProfile> CREATOR = new Parcelable.Creator<SleepReportProfile>() { // from class: com.xiaomi.fitness.sleep.trace.db.SleepReportProfile$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SleepReportProfile createFromParcel(Parcel in) {
            Intrinsics.checkNotNullParameter(in, "in");
            return new SleepReportProfile(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SleepReportProfile[] newArray(int size) {
            return new SleepReportProfile[size];
        }
    };

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/db/SleepReportProfile$Companion;", "", "<init>", "()V", "CODE_SUCCESS", "", "CODE_EMPTY", "CODE_UNABLE_GENERATE", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/sleep/trace/db/SleepReportProfile;", "EMPTY", "empty", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SleepReportProfile empty() {
            return SleepReportProfile.EMPTY;
        }
    }

    static {
        SleepReportProfile sleepReportProfile = new SleepReportProfile();
        EMPTY = sleepReportProfile;
        Intrinsics.checkNotNull(sleepReportProfile);
        sleepReportProfile.reportCode = 0;
    }

    public SleepReportProfile() {
        this.reportCode = 1;
        this.version = 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getAnalyzerName() {
        return this.analyzerName;
    }

    public final int getAnalyzerVersion() {
        return this.analyzerVersion;
    }

    public final long getDateNum() {
        return this.dateNum;
    }

    public final long getDateTime() {
        return DateNumHelper.INSTANCE.calcTimestamp(this.dateNum);
    }

    public final long getManualSleepTime() {
        return this.manualSleepTime;
    }

    public final long getManualWakeTime() {
        return this.manualWakeTime;
    }

    public final int getReportCode() {
        return this.reportCode;
    }

    public final long getSleepTime() {
        return this.sleepTime;
    }

    public final int getVersion() {
        return this.version;
    }

    public final long getWakeTime() {
        return this.wakeTime;
    }

    public final void setAnalyzerName(@Nullable String str) {
        this.analyzerName = str;
    }

    public final void setAnalyzerVersion(int i) {
        this.analyzerVersion = i;
    }

    public final void setDateNum(long j) {
        this.dateNum = j;
    }

    public final void setManualSleepTime(long j) {
        this.manualSleepTime = j;
    }

    public final void setManualWakeTime(long j) {
        this.manualWakeTime = j;
    }

    public final void setReportCode(int i) {
        this.reportCode = i;
    }

    public final void setSleepTime(long j) {
        this.sleepTime = j;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setWakeTime(long j) {
        this.wakeTime = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.dateNum);
        dest.writeLong(this.sleepTime);
        dest.writeLong(this.wakeTime);
        dest.writeLong(this.manualSleepTime);
        dest.writeLong(this.manualWakeTime);
        dest.writeInt(this.analyzerVersion);
        dest.writeString(this.analyzerName);
        dest.writeInt(this.reportCode);
    }

    public SleepReportProfile(@NotNull Parcel in) {
        Intrinsics.checkNotNullParameter(in, "in");
        this.reportCode = 1;
        this.version = 1;
        this.dateNum = in.readLong();
        this.sleepTime = in.readLong();
        this.wakeTime = in.readLong();
        this.manualSleepTime = in.readLong();
        this.manualWakeTime = in.readLong();
        this.analyzerVersion = in.readInt();
        this.analyzerName = in.readString();
        this.reportCode = in.readInt();
    }
}
