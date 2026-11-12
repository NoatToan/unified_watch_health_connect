package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class gzr implements Serializable, TimeSequence {
    private static final long serialVersionUID = -5570737047355306335L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("cadence")
    private int f36296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("time")
    private long f36297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("sumCircle")
    private long f36298c;

    @SerializedName("deltaCircle")
    private long d;

    public gzr() {
        this.f36297b = -1L;
        this.f36296a = -1;
        this.d = -1L;
        this.f36298c = -1L;
    }

    public gzr(long j, int i) {
        this.d = -1L;
        this.f36298c = -1L;
        this.f36297b = j;
        this.f36296a = i;
    }

    public void c(long j) {
        this.f36297b = j;
    }

    public int c() {
        return this.f36296a;
    }

    public void e(int i) {
        this.f36296a = i;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.f36297b;
    }

    public void d(long j) {
        this.d = j;
    }

    public long d() {
        return this.f36298c;
    }

    public void e(long j) {
        this.f36298c = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzr) && this.f36297b == ((gzr) obj).f36297b;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public void c(int i, double d) {
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_CADENCE.value()) {
            e((int) d);
        } else if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_DELTA_CIRCLE.value()) {
            d((int) d);
        } else if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_SUM_CIRCLE.value()) {
            e((int) d);
        }
    }
}
