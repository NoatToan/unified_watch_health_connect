package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class dfn implements Serializable {
    private static final long serialVersionUID = 3401094552994390416L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("planEndTime")
    private long f31744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("lastSystolic")
    private int f31745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("lastDiastolic")
    private int f31746c;

    @SerializedName("planId")
    private String d;

    @SerializedName("lastTimestamp")
    private long e;

    @SerializedName(ParsedFieldTag.EXCHANGE_PROPORTION)
    private float f;

    @SerializedName("planStartTime")
    private long h;

    @SerializedName("planLocalDate")
    private int i;

    public String c() {
        return this.d;
    }

    public long i() {
        return this.h;
    }

    public long b() {
        return this.f31744a;
    }

    public float h() {
        return this.f;
    }

    public int d() {
        return this.f31745b;
    }

    public int a() {
        return this.f31746c;
    }

    public long e() {
        return this.e;
    }

    public String toString() {
        return "DynamicBloodPressureStatus{mPlanId='" + this.d + "', mPlanStartTime=" + this.h + ", mPlanEndTime=" + this.f31744a + ", mPlanLocalDate=" + this.i + ", mRatio=" + this.f + ", mLastSystolic=" + this.f31745b + ", mLastDiastolic=" + this.f31746c + ", mLastTimestamp=" + this.e + '}';
    }
}
