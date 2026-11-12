package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class njt implements Serializable, TimeSequence {
    private static final long serialVersionUID = -1986945515238572057L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mRealTimeSpeed")
    private float f43103a;

    @SerializedName("mTime")
    private long d;

    public njt(long j, float f) {
        this.d = j;
        this.f43103a = f;
    }

    public float b() {
        return this.f43103a;
    }

    public float e() {
        return (this.f43103a / 10.0f) * 3.6f;
    }

    public float c() {
        if (Math.abs(this.f43103a) > 1.0E-5d) {
            return 10000.0f / this.f43103a;
        }
        return 0.0f;
    }

    public String toString() {
        return this.d + ":" + this.f43103a;
    }

    public njl a() {
        return new njl(this.d, Math.round(c()));
    }

    public njr d() {
        return new njr(this.d, e());
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.d;
    }
}
