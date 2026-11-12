package defpackage;

import com.huawei.hwfoundationmodel.trackmodel.TimeSequence;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class njs implements Serializable, TimeSequence {
    private static final long serialVersionUID = -5697764361487114883L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f43102b;
    private int e;

    public njs() {
    }

    public njs(long j, int i) {
        this.e = i;
        this.f43102b = j;
    }

    public int e() {
        return this.e;
    }

    public void a(int i) {
        this.e = i;
    }

    public void b(long j) {
        this.f43102b = j;
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.f43102b;
    }
}
