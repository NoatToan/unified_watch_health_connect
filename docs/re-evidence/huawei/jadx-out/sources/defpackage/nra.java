package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.operation.ble.BleConstants;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nra implements Serializable {
    private static final long serialVersionUID = 6629007919723398305L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mChildSportItems")
    private List<RelativeSportData> f43501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("startTime")
    private long f43502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(BleConstants.TOTAL_CALORIES)
    private int f43503c;

    @SerializedName("endTime")
    private long d;

    @SerializedName(BleConstants.SPORT_TYPE)
    private int e;

    @SerializedName(BleConstants.TOTAL_DISTANCE)
    private int f;

    @SerializedName("trackType")
    private int h;

    @SerializedName("totalTime")
    private long j;

    public String toString() {
        return "Summary{childSportItems=" + this.f43501a + ", sportType=" + this.e + ", startTime=" + this.f43502b + ", endTime=" + this.d + ", totalCalories=" + this.f43503c + ", totalDistance=" + this.f + ", totalTime=" + this.j + ", trackType=" + this.h + '}';
    }
}
