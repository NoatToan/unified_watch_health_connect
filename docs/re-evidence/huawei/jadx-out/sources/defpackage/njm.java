package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class njm implements Serializable, TimeSequence {
    private static final long serialVersionUID = -2003020627619347417L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mAltitude")
    private double f43094a;

    @SerializedName("mTime")
    private long d;

    public njm(long j, double d) {
        this.d = j;
        this.f43094a = d;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.d;
    }

    public double a() {
        return this.f43094a;
    }

    public String toString() {
        return this.d + ":" + this.f43094a;
    }
}
