package defpackage;

import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class njr implements Serializable, TimeSequence {
    private static final long serialVersionUID = 3734895889084885412L;
    private long d;
    private double e;

    public njr(long j, double d) {
        this.d = j;
        this.e = d;
    }

    public double c() {
        return this.e;
    }

    public String toString() {
        return this.d + ":" + this.e;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.d;
    }
}
