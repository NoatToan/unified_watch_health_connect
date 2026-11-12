package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class lft extends xdt {
    public long d = -1;
    public long e;

    public lft(long j) {
        this.e = j;
    }

    @Override // defpackage.xdt
    public vr a() {
        return vr.ECG;
    }

    public void b(long j) {
        this.d = j;
    }

    public String toString() {
        return "[" + this.e + "]";
    }
}
