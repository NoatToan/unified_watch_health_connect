package com.xiaomi.fitness.sleep.trace.policy;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0014\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u001d\u001a\u00020\nJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010 \u001a\u00020\bJ\u000e\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#J\b\u0010&\u001a\u00020\bH\u0016J\u0018\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\bH\u0016J\b\u0010*\u001a\u00020+H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010$\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0011¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "Landroid/os/Parcelable;", "<init>", "()V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "sequenceId", "", "uptime", "", "realTime", "scheduleInterval", "", "value", "nextScheduleTime", "getNextScheduleTime", "()J", "beginSleepRealTime", "setNextTriggerTime", "", "nextTriggerTime", "getSequenceId", "setSequenceId", "updateTime", "uptimeOffset", "getUptimeOffset", "realTimeOffset", "getRealTimeOffset", "getScheduleInterval", "setScheduleInterval", "interval", "offset", "updateSleepState", "isSleep", "", "continuousSleepDuration", "getContinuousSleepDuration", "describeContents", "writeToParcel", "dest", "flags", "toString", "", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TraceSchedule implements Parcelable {
    private static final int INTERVAL_HISTORY_COUNT = 10;

    @NotNull
    private static final String KEY_BEGIN_SLEEP_REAL_TIME = "bsrt";

    @NotNull
    private static final String KEY_REAL_TIME = "rtm";

    @NotNull
    private static final String KEY_SCHEDULE_INTERVAL = "sci";

    @NotNull
    private static final String KEY_SEQUENCE_ID = "sid";

    @NotNull
    private static final String KEY_UPTIME = "utm";
    private long beginSleepRealTime;
    private transient long nextScheduleTime;
    private long realTime;

    @Nullable
    private long[] scheduleInterval;
    private int sequenceId;
    private long uptime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<TraceSchedule> CREATOR = new Parcelable.Creator<TraceSchedule>() { // from class: com.xiaomi.fitness.sleep.trace.policy.TraceSchedule$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TraceSchedule createFromParcel(Parcel in) {
            Intrinsics.checkNotNullParameter(in, "in");
            return new TraceSchedule(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TraceSchedule[] newArray(int size) {
            return new TraceSchedule[size];
        }
    };

    public TraceSchedule() {
        this.scheduleInterval = new long[10];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getContinuousSleepDuration() {
        if (this.beginSleepRealTime == 0) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.beginSleepRealTime;
    }

    public final long getNextScheduleTime() {
        return this.nextScheduleTime;
    }

    public final long getRealTimeOffset() {
        if (this.realTime == 0) {
            return 0L;
        }
        return SystemClock.elapsedRealtime() - this.realTime;
    }

    public final long getScheduleInterval() {
        return getScheduleInterval(0);
    }

    public final int getSequenceId() {
        return this.sequenceId;
    }

    public final long getUptimeOffset() {
        if (this.uptime == 0) {
            return 0L;
        }
        return SystemClock.uptimeMillis() - this.uptime;
    }

    public final void setNextTriggerTime(long nextTriggerTime) {
        this.nextScheduleTime = nextTriggerTime;
    }

    public final void setScheduleInterval(long interval) {
        long[] jArr = this.scheduleInterval;
        Intrinsics.checkNotNull(jArr);
        int length = jArr.length - 1;
        long[] jArr2 = this.scheduleInterval;
        System.arraycopy(jArr2, 1, jArr2, 0, length);
        long[] jArr3 = this.scheduleInterval;
        Intrinsics.checkNotNull(jArr3);
        jArr3[length] = interval;
    }

    public final void setSequenceId(int sequenceId) {
        this.sequenceId = sequenceId;
    }

    @NotNull
    public String toString() {
        return "{sequenceId=" + this.sequenceId + ", uptime=" + this.uptime + ", realTime=" + this.realTime + ", beginSleepRealTime=" + this.beginSleepRealTime + ", scheduleInterval=" + Arrays.toString(this.scheduleInterval) + "}";
    }

    public final void updateSleepState(boolean isSleep) {
        if (!isSleep || this.beginSleepRealTime == 0) {
            long j = this.beginSleepRealTime;
            StringBuilder sb = new StringBuilder();
            sb.append("updateSleepState: isSleep=");
            sb.append(isSleep);
            sb.append(", beginSleepRealTime=");
            sb.append(j);
            this.beginSleepRealTime = SystemClock.elapsedRealtime();
        }
    }

    public final void updateTime() {
        this.uptime = SystemClock.uptimeMillis();
        this.realTime = SystemClock.elapsedRealtime();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.sequenceId);
        dest.writeLong(this.uptime);
        dest.writeLong(this.realTime);
        dest.writeLong(this.beginSleepRealTime);
        dest.writeLongArray(this.scheduleInterval);
    }

    public final long getScheduleInterval(int offset) {
        long[] jArr = this.scheduleInterval;
        Intrinsics.checkNotNull(jArr);
        int length = (jArr.length - 1) - offset;
        long[] jArr2 = this.scheduleInterval;
        Intrinsics.checkNotNull(jArr2);
        if (length < 0) {
            length = 0;
        }
        return jArr2[length];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TraceSchedule(@NotNull Parcel in) {
        this();
        Intrinsics.checkNotNullParameter(in, "in");
        this.sequenceId = in.readInt();
        this.uptime = in.readLong();
        this.realTime = in.readLong();
        this.beginSleepRealTime = in.readLong();
        this.scheduleInterval = in.createLongArray();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0014R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule$Companion;", "", "<init>", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/sleep/trace/policy/TraceSchedule;", "KEY_SEQUENCE_ID", "", "KEY_UPTIME", "KEY_REAL_TIME", "KEY_SCHEDULE_INTERVAL", "KEY_BEGIN_SLEEP_REAL_TIME", "INTERVAL_HISTORY_COUNT", "", "from", "json", "toJSON", "traceSchedule", "toByteData", "", "schedule", "byteData", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TraceSchedule from(@NotNull String json) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObject = new JSONObject(json);
            TraceSchedule traceSchedule = new TraceSchedule();
            traceSchedule.sequenceId = jSONObject.optInt("sid");
            traceSchedule.uptime = jSONObject.optLong(TraceSchedule.KEY_UPTIME);
            traceSchedule.realTime = jSONObject.optLong(TraceSchedule.KEY_REAL_TIME);
            traceSchedule.beginSleepRealTime = jSONObject.optLong(TraceSchedule.KEY_BEGIN_SLEEP_REAL_TIME);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(TraceSchedule.KEY_SCHEDULE_INTERVAL);
            if (jSONArrayOptJSONArray == null) {
                return traceSchedule;
            }
            int length = jSONArrayOptJSONArray.length();
            if (length <= 10) {
                length = 10;
            }
            traceSchedule.scheduleInterval = new long[length];
            int iMin = Math.min(jSONArrayOptJSONArray.length(), length);
            for (int i = 0; i < iMin; i++) {
                long[] jArr = traceSchedule.scheduleInterval;
                Intrinsics.checkNotNull(jArr);
                jArr[i] = jSONArrayOptJSONArray.optLong(i);
            }
            return traceSchedule;
        }

        @NotNull
        public final byte[] toByteData(@NotNull TraceSchedule schedule) {
            Intrinsics.checkNotNullParameter(schedule, "schedule");
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
            schedule.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            Intrinsics.checkNotNull(bArrMarshall);
            return bArrMarshall;
        }

        @NotNull
        public final String toJSON(@NotNull TraceSchedule traceSchedule) throws JSONException {
            Intrinsics.checkNotNullParameter(traceSchedule, "traceSchedule");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sid", traceSchedule.sequenceId);
            jSONObject.put(TraceSchedule.KEY_UPTIME, traceSchedule.uptime);
            jSONObject.put(TraceSchedule.KEY_REAL_TIME, traceSchedule.realTime);
            jSONObject.put(TraceSchedule.KEY_BEGIN_SLEEP_REAL_TIME, traceSchedule.beginSleepRealTime);
            JSONArray jSONArray = new JSONArray();
            long[] jArr = traceSchedule.scheduleInterval;
            Intrinsics.checkNotNull(jArr);
            for (long j : jArr) {
                jSONArray.put(j);
            }
            jSONObject.put(TraceSchedule.KEY_SCHEDULE_INTERVAL, jSONArray);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        @NotNull
        public final TraceSchedule from(@NotNull byte[] byteData) {
            Intrinsics.checkNotNullParameter(byteData, "byteData");
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
            parcelObtain.unmarshall(byteData, 0, byteData.length);
            parcelObtain.setDataPosition(0);
            TraceSchedule traceScheduleCreateFromParcel = TraceSchedule.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            Intrinsics.checkNotNull(traceScheduleCreateFromParcel);
            return traceScheduleCreateFromParcel;
        }
    }
}
