package defpackage;

/* JADX INFO: loaded from: classes9.dex */
public class sko implements Comparable<sko> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f33743b;

    public sko(int i, int i2) {
        this.f33742a = i;
        this.f33743b = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(sko skoVar) {
        return this.f33742a - skoVar.f33742a;
    }

    public int b() {
        int i = this.f33742a;
        if (i == 0) {
            return iji.a3;
        }
        if (i != 1) {
            return i != 2 ? iji.Z2 : iji.X2;
        }
        return iji.Y2;
    }

    public int c() {
        if (ou6.a()) {
            int i = this.f33742a;
            if (i == 0) {
                return pni.O0;
            }
            if (i != 1) {
                return i != 2 ? pni.P0 : pni.P0;
            }
            return pni.R0;
        }
        int i2 = this.f33742a;
        if (i2 == 0) {
            return pni.O0;
        }
        if (i2 == 1) {
            return pni.R0;
        }
        if (i2 != 2 && i2 == 3) {
            return pni.Q0;
        }
        return pni.P0;
    }

    public int d() {
        if (ou6.a()) {
            int i = this.f33742a;
            if (i == 0) {
                return c0j.zb;
            }
            if (i != 1) {
                return i != 2 ? c0j.wb : c0j.sb;
            }
            return c0j.ub;
        }
        int i2 = this.f33742a;
        if (i2 == 0) {
            return c0j.yb;
        }
        if (i2 != 1) {
            return i2 != 2 ? c0j.vb : c0j.rb;
        }
        return c0j.tb;
    }
}
