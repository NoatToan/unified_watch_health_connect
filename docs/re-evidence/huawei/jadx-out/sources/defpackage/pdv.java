package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.operation.ble.BleConstants;

/* JADX INFO: loaded from: classes41.dex */
public class pdv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("totalCalorie")
    private int f45212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("finishedRate")
    private double f45213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("totalDuration")
    private int f45214c;

    @SerializedName(BleConstants.TOTAL_DISTANCE)
    private double d;

    @SerializedName("finishedPlanNum")
    private int e;
}
