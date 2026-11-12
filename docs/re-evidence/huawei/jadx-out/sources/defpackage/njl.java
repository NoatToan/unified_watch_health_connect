package defpackage;

import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class njl implements Serializable, TimeSequence {
    private static final long serialVersionUID = 4279729944497991314L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f43092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43093b;

    public njl(long j, int i) {
        this.f43092a = j;
        this.f43093b = i;
    }

    public int e() {
        return this.f43093b;
    }

    public String toString() {
        return this.f43092a + ":" + this.f43093b;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.f43092a;
    }
}
