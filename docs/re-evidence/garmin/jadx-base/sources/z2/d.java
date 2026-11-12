package z2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import z2.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001\u000fB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lz2/d;", "T", "", "Ls5/c;", "originalText", "Ls5/w0;", "originalSelection", "Ls5/q0;", "layoutResult", "Lx5/c0;", "offsetMapping", "Lz2/s2;", RemoteConfigConstants.ResponseFieldKey.STATE, "<init>", "(Ls5/c;JLs5/q0;Lx5/c0;Lz2/s2;Lkotlin/jvm/internal/j;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class d<T extends d<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.c f201543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f201544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s5.q0 f201545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x5.c0 f201546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s2 f201547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f201548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s5.c f201549g;

    static {
        new a(null);
    }

    private d(s5.c cVar, long j8, s5.q0 q0Var, x5.c0 c0Var, s2 s2Var) {
        this.f201543a = cVar;
        this.f201544b = j8;
        this.f201545c = q0Var;
        this.f201546d = c0Var;
        this.f201547e = s2Var;
        this.f201548f = j8;
        this.f201549g = cVar;
    }

    public final Integer a() {
        s5.q0 q0Var = this.f201545c;
        if (q0Var == null) {
            return null;
        }
        s5.o oVar = q0Var.f157281b;
        int iG = s5.w0.g(this.f201548f);
        x5.c0 c0Var = this.f201546d;
        return Integer.valueOf(c0Var.a(oVar.c(oVar.d(c0Var.b(iG)), true)));
    }

    public final Integer b() {
        s5.q0 q0Var = this.f201545c;
        if (q0Var == null) {
            return null;
        }
        int iH = s5.w0.h(this.f201548f);
        x5.c0 c0Var = this.f201546d;
        return Integer.valueOf(c0Var.a(q0Var.i(q0Var.f157281b.d(c0Var.b(iH)))));
    }

    public final Integer c() {
        int length;
        s5.q0 q0Var = this.f201545c;
        if (q0Var == null) {
            return null;
        }
        int iP = p();
        while (true) {
            s5.c cVar = this.f201543a;
            if (iP < cVar.f157138b.length()) {
                int length2 = this.f201549g.f157138b.length() - 1;
                if (iP <= length2) {
                    length2 = iP;
                }
                long jL = q0Var.l(length2);
                s5.w0.a aVar = s5.w0.f157315b;
                int i14 = (int) (jL & 4294967295L);
                if (i14 > iP) {
                    length = this.f201546d.a(i14);
                    break;
                }
                iP++;
            } else {
                length = cVar.f157138b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer d() {
        int iA;
        s5.q0 q0Var = this.f201545c;
        if (q0Var == null) {
            return null;
        }
        for (int iP = p(); iP > 0; iP--) {
            int length = this.f201549g.f157138b.length() - 1;
            if (iP <= length) {
                length = iP;
            }
            long jL = q0Var.l(length);
            s5.w0.a aVar = s5.w0.f157315b;
            int i14 = (int) (jL >> 32);
            if (i14 < iP) {
                iA = this.f201546d.a(i14);
                return Integer.valueOf(iA);
            }
        }
        iA = 0;
        return Integer.valueOf(iA);
    }

    public final boolean e() {
        s5.q0 q0Var = this.f201545c;
        return (q0Var != null ? q0Var.j(p()) : null) != d6.g.Rtl;
    }

    public final int f(s5.q0 q0Var, int i14) {
        int iP = p();
        s2 s2Var = this.f201547e;
        if (s2Var.f201787a == null) {
            s2Var.f201787a = Float.valueOf(q0Var.c(iP).f123547a);
        }
        s5.o oVar = q0Var.f157281b;
        int iD = oVar.d(iP) + i14;
        if (iD < 0) {
            return 0;
        }
        if (iD >= oVar.f157257f) {
            return this.f201549g.f157138b.length();
        }
        float fB = oVar.b(iD) - 1;
        Float f14 = s2Var.f201787a;
        f14.getClass();
        float fFloatValue = f14.floatValue();
        if ((e() && fFloatValue >= q0Var.h(iD)) || (!e() && fFloatValue <= q0Var.g(iD))) {
            return oVar.c(iD, true);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f14.floatValue()) << 32);
        n4.c.a aVar = n4.c.f123541b;
        return this.f201546d.a(oVar.g(jFloatToRawIntBits));
    }

    public final void g() {
        s2 s2Var = this.f201547e;
        s2Var.f201787a = null;
        s5.c cVar = this.f201549g;
        if (cVar.f157138b.length() > 0) {
            if (e()) {
                i();
                return;
            }
            s2Var.f201787a = null;
            if (cVar.f157138b.length() > 0) {
                String str = cVar.f157138b;
                long j8 = this.f201548f;
                s5.w0.a aVar = s5.w0.f157315b;
                int iU = ge1.b.u((int) (j8 & 4294967295L), str);
                if (iU != -1) {
                    o(iU, iU);
                }
            }
        }
    }

    public final void h() {
        this.f201547e.f201787a = null;
        s5.c cVar = this.f201549g;
        String str = cVar.f157138b;
        String str2 = cVar.f157138b;
        if (str.length() > 0) {
            int iX = g8.i.x(s5.w0.g(this.f201548f), str2);
            if (iX == s5.w0.g(this.f201548f) && iX != str2.length()) {
                iX = g8.i.x(iX + 1, str2);
            }
            o(iX, iX);
        }
    }

    public final void i() {
        this.f201547e.f201787a = null;
        s5.c cVar = this.f201549g;
        if (cVar.f157138b.length() > 0) {
            String str = cVar.f157138b;
            long j8 = this.f201548f;
            s5.w0.a aVar = s5.w0.f157315b;
            int iV = ge1.b.v((int) (j8 & 4294967295L), str);
            if (iV != -1) {
                o(iV, iV);
            }
        }
    }

    public final void j() {
        this.f201547e.f201787a = null;
        s5.c cVar = this.f201549g;
        String str = cVar.f157138b;
        String str2 = cVar.f157138b;
        if (str.length() > 0) {
            int iY = g8.i.y(s5.w0.h(this.f201548f), str2);
            if (iY == s5.w0.h(this.f201548f) && iY != 0) {
                iY = g8.i.y(iY - 1, str2);
            }
            o(iY, iY);
        }
    }

    public final void k() {
        s2 s2Var = this.f201547e;
        s2Var.f201787a = null;
        s5.c cVar = this.f201549g;
        if (cVar.f157138b.length() > 0) {
            if (!e()) {
                i();
                return;
            }
            s2Var.f201787a = null;
            if (cVar.f157138b.length() > 0) {
                String str = cVar.f157138b;
                long j8 = this.f201548f;
                s5.w0.a aVar = s5.w0.f157315b;
                int iU = ge1.b.u((int) (j8 & 4294967295L), str);
                if (iU != -1) {
                    o(iU, iU);
                }
            }
        }
    }

    public final void l() {
        Integer numA;
        this.f201547e.f201787a = null;
        if (this.f201549g.f157138b.length() <= 0 || (numA = a()) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        o(iIntValue, iIntValue);
    }

    public final void m() {
        Integer numB;
        this.f201547e.f201787a = null;
        if (this.f201549g.f157138b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        o(iIntValue, iIntValue);
    }

    public final void n() {
        if (this.f201549g.f157138b.length() > 0) {
            s5.w0.a aVar = s5.w0.f157315b;
            this.f201548f = og.a.l((int) (this.f201544b >> 32), (int) (this.f201548f & 4294967295L));
        }
    }

    public final void o(int i14, int i15) {
        this.f201548f = og.a.l(i14, i15);
    }

    public final int p() {
        long j8 = this.f201548f;
        s5.w0.a aVar = s5.w0.f157315b;
        return this.f201546d.b((int) (j8 & 4294967295L));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz2/d$a;", "", "<init>", "()V", "", "NoCharacterFound", "I", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(s5.c cVar, long j8, s5.q0 q0Var, x5.c0 c0Var, s2 s2Var, p005kotlin.jvm.internal.j jVar) {
        this(cVar, j8, q0Var, c0Var, s2Var);
    }
}
