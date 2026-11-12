package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class hdt extends xdt {
    public long d = -1;
    public int e;
    public int f;
    public int g;

    public hdt(int i, int i2, int i3) {
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    @Override // defpackage.xdt
    public vr a() {
        return vr.GSENSOR;
    }

    public void b(long j) {
        this.d = j;
    }

    public String toString() {
        return "[" + this.d + ":" + this.e + "," + this.f + "," + this.g + "]";
    }
}
