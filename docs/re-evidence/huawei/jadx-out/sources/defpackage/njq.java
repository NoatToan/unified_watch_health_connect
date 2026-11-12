package defpackage;

import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class njq implements Serializable, TimeSequence {
    private static final long serialVersionUID = -1245764951606553008L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f43100a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43101c;

    public njq(long j, int i) {
        this.f43100a = j;
        this.f43101c = i;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.f43100a;
    }

    public int c() {
        return this.f43101c;
    }

    public String toString() {
        return this.f43100a + ":" + this.f43101c;
    }
}
