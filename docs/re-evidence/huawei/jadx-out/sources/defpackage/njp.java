package defpackage;

import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class njp implements Serializable, TimeSequence {
    private static final long serialVersionUID = 7290174584790198637L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f43098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43099b;

    public njp(long j, int i) {
        this.f43098a = j;
        this.f43099b = i;
    }

    public int e() {
        return this.f43099b;
    }

    public String toString() {
        return this.f43098a + ":" + this.f43099b;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.f43098a;
    }
}
