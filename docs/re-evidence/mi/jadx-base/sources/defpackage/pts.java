package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class pts extends xdt {
    public long d = -1;
    public long e;

    public pts(long j) {
        this.e = j;
    }

    @Override // defpackage.xdt
    public vr a() {
        return vr.PPG;
    }

    public void b(long j) {
        this.d = j;
    }

    public String toString() {
        return "[" + this.d + ":" + this.e + "]";
    }
}
