package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class tx5 implements i2q.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Format> f35156b;

    public tx5(int i) {
        this(i, ImmutableList.of());
    }

    @Override // i2q.c
    public i2q a(int i, i2q.b bVar) {
        if (i == 2) {
            return new bth(new ocb(d(bVar)));
        }
        if (i == 3 || i == 4) {
            return new bth(new i9g(bVar.f20716b));
        }
        if (i == 21) {
            return new bth(new b2d());
        }
        if (i == 27) {
            if (f(4)) {
                return null;
            }
            return new bth(new qcb(c(bVar), f(1), f(8)));
        }
        if (i == 36) {
            return new bth(new rcb(c(bVar)));
        }
        if (i == 89) {
            return new bth(new x67(bVar.c));
        }
        if (i != 138) {
            if (i == 172) {
                return new bth(new h20(bVar.f20716b));
            }
            if (i == 257) {
                return new dql(new nlh("application/vnd.dvb.ait"));
            }
            if (i != 129) {
                if (i != 130) {
                    if (i == 134) {
                        if (f(16)) {
                            return null;
                        }
                        return new dql(new nlh("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                if (f(2)) {
                                    return null;
                                }
                                return new bth(new uu0(false, bVar.f20716b));
                            case 16:
                                return new bth(new pcb(d(bVar)));
                            case 17:
                                if (f(2)) {
                                    return null;
                                }
                                return new bth(new x2e(bVar.f20716b));
                            default:
                                return null;
                        }
                    }
                } else if (!f(64)) {
                    return null;
                }
            }
            return new bth(new d20(bVar.f20716b));
        }
        return new bth(new l67(bVar.f20716b));
    }

    @Override // i2q.c
    public SparseArray<i2q> b() {
        return new SparseArray<>();
    }

    public final jrl c(i2q.b bVar) {
        return new jrl(e(bVar));
    }

    public final ifq d(i2q.b bVar) {
        return new ifq(e(bVar));
    }

    public final List<Format> e(i2q.b bVar) {
        String str;
        int i;
        if (f(32)) {
            return this.f35156b;
        }
        okh okhVar = new okh(bVar.d);
        List<Format> arrayList = this.f35156b;
        while (okhVar.a() > 0) {
            int iD = okhVar.D();
            int iE = okhVar.e() + okhVar.D();
            if (iD == 134) {
                arrayList = new ArrayList<>();
                int iD2 = okhVar.D() & 31;
                for (int i2 = 0; i2 < iD2; i2++) {
                    String strA = okhVar.A(3);
                    int iD3 = okhVar.D();
                    boolean z = (iD3 & 128) != 0;
                    if (z) {
                        i = iD3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bD = (byte) okhVar.D();
                    okhVar.Q(1);
                    arrayList.add(new Format.b().e0(str).V(strA).F(i).T(z ? m34.b((bD & 64) != 0) : null).E());
                }
            }
            okhVar.P(iE);
        }
        return arrayList;
    }

    public final boolean f(int i) {
        return (i & this.f35155a) != 0;
    }

    public tx5(int i, List<Format> list) {
        this.f35155a = i;
        this.f35156b = list;
    }
}
