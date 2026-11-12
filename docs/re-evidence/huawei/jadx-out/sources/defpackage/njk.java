package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class njk implements Serializable, TimeSequence {
    private static final long serialVersionUID = -2532163149055420122L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mTime")
    private long f43091b;

    @SerializedName("mSlope")
    private int d;

    public njk() {
    }

    public njk(long j, int i) {
        this.f43091b = j;
        this.d = i;
    }

    public int e() {
        return this.d;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.f43091b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof njk) && ((njk) obj).f43091b == this.f43091b;
    }
}
