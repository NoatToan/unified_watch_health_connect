package com.huami.moving.ui.sport.in;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.moving.datacenter.SportDataType;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.watch.companion.dataflow.Constant;
import com.huami.watch.companion.ui.activity.PBTabActivity;
import com.loc.z;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002GHB\u0011\u0012\b\b\u0002\u0010%\u001a\u00020\u001e¢\u0006\u0004\bF\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R*\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R*\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R*\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R*\u0010%\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010)\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R*\u0010-\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\f\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010\u0010R*\u00101\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\f\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010\u0010R*\u00109\u001a\u0002022\u0006\u0010\u000b\u001a\u0002028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u0010A\u001a\u00020:2\u0006\u0010\u000b\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060B8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006I"}, d2 = {"Lcom/huami/moving/ui/sport/in/SportDataCenter;", "", "Lcom/huami/moving/datacenter/SportDataType;", "type", "", "a", "Lcom/huami/moving/ui/sport/in/SportDataCenter$DataObserver;", "observer", "registerDataObserver", "unregisterDataObserver", "", "value", "F", "getAltitude", "()F", "setAltitude", "(F)V", "altitude", "b", "getCalorie", "setCalorie", "calorie", "c", "getClimb", "setClimb", PBTabActivity.APP_GOTO_CLIMB, GoogleApiAvailabilityLight.a, "getDistance", "setDistance", "distance", "Lcom/huami/moving/ui/sport/in/SportDataCenter$HeartRate;", "e", "Lcom/huami/moving/ui/sport/in/SportDataCenter$HeartRate;", "getHeartRate", "()Lcom/huami/moving/ui/sport/in/SportDataCenter$HeartRate;", "setHeartRate", "(Lcom/huami/moving/ui/sport/in/SportDataCenter$HeartRate;)V", Constant.KEY_HR_VALUE, "f", "getPace", "setPace", "pace", "g", "getAvgPace", "setAvgPace", Constants.DATA_KEY_AVG_PACE, "h", "getStepFreq", "setStepFreq", Constants.DATA_KEY_STEP_FREQ, "", "i", LogUtil.I, "getSteps", "()I", "setSteps", "(I)V", GetWatermarkAPI.KEY_NAME_STEPS, "", z.j, "J", "getTime", "()J", "setTime", "(J)V", "time", "", hl.k, "Ljava/util/List;", "dataObservers", "<init>", "DataObserver", SportAnalytics.ParamValue.DataName.HEARTRATE, "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportDataCenter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float altitude;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float calorie;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float climb;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float distance;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private HeartRate heartRate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private float pace;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private float avgPace;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private float stepFreq;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int steps;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private long time;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final List<DataObserver> dataObservers;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/moving/ui/sport/in/SportDataCenter$DataObserver;", "", "Lcom/huami/moving/datacenter/SportDataType;", "type", "Lcom/huami/moving/ui/sport/in/SportDataCenter;", "dataCenter", "", "onDataChanged", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface DataObserver {
        void onDataChanged(@NotNull SportDataType type, @NotNull SportDataCenter dataCenter);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/moving/ui/sport/in/SportDataCenter$HeartRate;", "", "", "component1", "component2", "status", Constant.KEY_HR_VALUE, "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getStatus", "()I", "b", "getHeartRate", "<init>", "(II)V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class HeartRate {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int status;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int heartRate;

        /* JADX WARN: Illegal instructions before constructor call */
        public HeartRate() {
            int i = 0;
            this(i, i, 3, null);
        }

        public HeartRate(int i, int i2) {
            this.status = i;
            this.heartRate = i2;
        }

        public static /* synthetic */ HeartRate copy$default(HeartRate heartRate, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = heartRate.status;
            }
            if ((i3 & 2) != 0) {
                i2 = heartRate.heartRate;
            }
            return heartRate.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHeartRate() {
            return this.heartRate;
        }

        @NotNull
        public final HeartRate copy(int status, int heartRate) {
            return new HeartRate(status, heartRate);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeartRate)) {
                return false;
            }
            HeartRate heartRate = (HeartRate) other;
            return this.status == heartRate.status && this.heartRate == heartRate.heartRate;
        }

        public final int getHeartRate() {
            return this.heartRate;
        }

        public final int getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (this.status * 31) + this.heartRate;
        }

        @NotNull
        public String toString() {
            return "HeartRate(status=" + this.status + ", heartRate=" + this.heartRate + ")";
        }

        public /* synthetic */ HeartRate(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportDataCenter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SportDataCenter(@NotNull HeartRate heartRate) {
        this.heartRate = heartRate;
        this.dataObservers = new ArrayList();
    }

    private final void a(SportDataType type) {
        Iterator<T> it2 = this.dataObservers.iterator();
        while (it2.hasNext()) {
            ((DataObserver) it2.next()).onDataChanged(type, this);
        }
    }

    public final float getAltitude() {
        return this.altitude;
    }

    public final float getAvgPace() {
        return this.avgPace;
    }

    public final float getCalorie() {
        return this.calorie;
    }

    public final float getClimb() {
        return this.climb;
    }

    public final float getDistance() {
        return this.distance;
    }

    @NotNull
    public final HeartRate getHeartRate() {
        return this.heartRate;
    }

    public final float getPace() {
        return this.pace;
    }

    public final float getStepFreq() {
        return this.stepFreq;
    }

    public final int getSteps() {
        return this.steps;
    }

    public final long getTime() {
        return this.time;
    }

    public final void registerDataObserver(@NotNull DataObserver observer) {
        this.dataObservers.add(observer);
    }

    public final void setAltitude(float f) {
        this.altitude = f;
        a(SportDataType.ALTITUDE);
    }

    public final void setAvgPace(float f) {
        this.avgPace = f;
        a(SportDataType.AVG_PACE);
    }

    public final void setCalorie(float f) {
        this.calorie = f;
        a(SportDataType.CALORY);
    }

    public final void setClimb(float f) {
        this.climb = f;
        a(SportDataType.CLIMB);
    }

    public final void setDistance(float f) {
        this.distance = f;
        a(SportDataType.DISTANCE);
    }

    public final void setHeartRate(@NotNull HeartRate heartRate) {
        this.heartRate = heartRate;
        a(SportDataType.HEART_RATE);
    }

    public final void setPace(float f) {
        this.pace = f;
        a(SportDataType.PACE);
    }

    public final void setStepFreq(float f) {
        this.stepFreq = f;
        a(SportDataType.STEP_FREQ);
    }

    public final void setSteps(int i) {
        this.steps = i;
        a(SportDataType.STEPS);
    }

    public final void setTime(long j) {
        this.time = j;
        a(SportDataType.TIME);
    }

    public final void unregisterDataObserver(@NotNull DataObserver observer) {
        this.dataObservers.remove(observer);
    }

    public /* synthetic */ SportDataCenter(HeartRate heartRate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 0;
            heartRate = new HeartRate(i2, i2, 3, null);
        }
        this(heartRate);
    }
}
