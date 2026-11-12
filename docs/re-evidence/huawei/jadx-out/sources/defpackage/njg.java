package defpackage;

import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class njg implements Serializable, TimeSequence {
    private static final long serialVersionUID = 7816239952862604274L;
    private long d;
    private int e;

    public njg() {
    }

    public njg(long j, int i) {
        this.e = i;
        this.d = j;
    }

    public int c() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public void b(long j) {
        this.d = j;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.d;
    }
}
