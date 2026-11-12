package cz1;

import androidx.lifecycle.y0;
import cq0.g;
import ez1.e;
import fg0.u;
import fg0.x;
import g22.n;
import gg0.f;
import gg0.j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import my1.d;
import o13.m;
import o13.p;
import o13.t;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.c0;
import p13.h0;
import zf0.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcz1/a;", "Lzf0/j0;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends j0 {
    public static final /* synthetic */ int Q0 = 0;
    public final t H0;
    public d I;
    public final t I0;
    public final y0 J0;
    public final t K0;
    public final y0 L0;
    public final t M0;
    public final y0 N0;
    public final t O0;
    public boolean P;
    public final t P0;
    public boolean T;
    public f X;
    public final t Y = m.b(new com.google.accompanist.drawablepainter.a(22));
    public final y0 Z = a5();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f56874k0;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f56876b;

        static {
            int[] iArr = new int[ny1.b.values().length];
            try {
                iArr[ny1.b.RUNNING_DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f56875a = iArr;
            int[] iArr2 = new int[bg0.a.b.values().length];
            try {
                iArr2[bg0.a.b.METER.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[bg0.a.b.KILOMETER.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[bg0.a.b.MILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[bg0.a.b.YARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            f56876b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((j) t7).ordinal()), Integer.valueOf(((j) t14).ordinal()));
        }
    }

    static {
        new C1218a(null);
    }

    public a() {
        t tVarB = m.b(new com.google.accompanist.drawablepainter.a(23));
        this.f56874k0 = tVarB;
        t tVarB2 = m.b(new com.google.accompanist.drawablepainter.a(24));
        this.H0 = tVarB2;
        this.I0 = m.b(new com.google.accompanist.drawablepainter.a(25));
        this.J0 = Y4();
        this.K0 = m.b(new com.google.accompanist.drawablepainter.a(26));
        this.L0 = Z4();
        t tVarB3 = m.b(new com.google.accompanist.drawablepainter.a(27));
        this.M0 = tVarB3;
        this.N0 = (y0) tVarB3.getValue();
        this.O0 = m.b(new com.google.accompanist.drawablepainter.a(28));
        this.P0 = m.b(new g(this, 5));
    }

    public static /* synthetic */ void h5(a aVar, ny1.f fVar, String str, String str2, int i14) {
        if ((i14 & 2) != 0) {
            str = null;
        }
        if ((i14 & 4) != 0) {
            str2 = null;
        }
        aVar.f5(fVar, str, str2);
    }

    public final ny1.b X4() {
        d dVarD = Z4().d();
        if (dVarD != null) {
            return dVarD.f121492i;
        }
        return null;
    }

    public final y0<ny1.f> Y4() {
        return (y0) this.I0.getValue();
    }

    public final y0<d> Z4() {
        return (y0) this.K0.getValue();
    }

    public final y0<String> a5() {
        return (y0) this.Y.getValue();
    }

    public final ez1.c b5() {
        d dVarD = Z4().d();
        if (dVarD != null) {
            return dVarD.f121493j;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c5() {
        d dVar = this.I;
        y0 y0Var = this.L0;
        if (!s.g(dVar, y0Var.d())) {
            return true;
        }
        f fVar = this.X;
        d dVar2 = (d) y0Var.d();
        return fVar != (dVar2 != null ? dVar2.f121487d : null);
    }

    public final void d5(boolean z14) {
        d dVarD = Z4().d();
        Z4().m(dVarD != null ? d.b(dVarD, null, null, null, null, null, null, null, z14, null, null, null, 0.0d, 0.0d, null, null, null, 1048447) : null);
    }

    public final void e5(j jVar) {
        List<j> list;
        jVar.getClass();
        this.P = true;
        d dVarD = Z4().d();
        ArrayList arrayList = (dVarD == null || (list = dVarD.f121490g) == null) ? new ArrayList() : new ArrayList(list);
        int iIndexOf = arrayList.indexOf(jVar);
        if (iIndexOf > -1) {
            arrayList.remove(iIndexOf);
        } else {
            arrayList.add(jVar);
        }
        if (arrayList.size() > 1) {
            c0.u(arrayList, new c());
        }
        Z4().m(dVarD != null ? d.b(dVarD, null, null, null, null, null, null, h0.b1(arrayList), false, null, null, null, 0.0d, 0.0d, null, null, null, 1048511) : null);
    }

    public final void f5(ny1.f fVar, String str, String str2) {
        fVar.getClass();
        d dVarD = Z4().d();
        d dVarB = null;
        if (n.d(str) && n.d(str2)) {
            y0<d> y0VarZ4 = Z4();
            if (dVarD != null) {
                str.getClass();
                str2.getClass();
                dVarB = d.b(dVarD, str, str2, fVar, null, null, null, null, false, null, null, null, 0.0d, 0.0d, null, null, null, 1048568);
            }
            y0VarZ4.m(dVarB);
            return;
        }
        if (n.d(str)) {
            y0<d> y0VarZ5 = Z4();
            if (dVarD != null) {
                str.getClass();
                dVarB = d.b(dVarD, str, null, fVar, null, null, null, null, false, null, null, null, 0.0d, 0.0d, null, null, null, 1048570);
            }
            y0VarZ5.m(dVarB);
            return;
        }
        if (n.d(str2)) {
            y0<d> y0VarZ6 = Z4();
            if (dVarD != null) {
                str2.getClass();
                dVarB = d.b(dVarD, null, str2, fVar, null, null, null, null, false, null, null, null, 0.0d, 0.0d, null, null, null, 1048569);
            }
            y0VarZ6.m(dVarB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x014f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i5(d dVar) {
        u uVar;
        x xVar;
        d dVarB;
        p pVarN;
        ez1.d dVar2;
        d dVarB2;
        dVar.getClass();
        u uVar2 = dVar.f121503v;
        x xVar2 = dVar.f121502t;
        String str = dVar.f121484a;
        if (str == null || str.length() == 0) {
            c22.j0 j0Var = c22.j0.f23099a;
            String string = DateTime.now().toLocalDate().toString();
            j0Var.getClass();
            dVar.f121484a = c22.j0.c(string, "yyyy-MM-dd", "MM/dd/yy", "").toString();
        }
        String str2 = dVar.f121485b;
        if (str2 == null || str2.length() == 0) {
            c22.j0 j0Var2 = c22.j0.f23099a;
            String string2 = DateTime.now().plusDays(7).toLocalDate().toString();
            j0Var2.getClass();
            dVar.f121485b = c22.j0.c(string2, "yyyy-MM-dd", "MM/dd/yy", "").toString();
        }
        if (this.I == null) {
            if (xVar2 == null && uVar2 == null) {
                uVar = uVar2;
                xVar = xVar2;
                dVarB = new d(null, null, null, null, null, null, null, false, null, null, null, null, 0.0d, 0.0d, null, null, null, null, null, null, 1048575, null);
            } else {
                uVar = uVar2;
                xVar = xVar2;
                dVarB = d.b(dVar, null, null, null, null, null, null, null, false, null, null, null, 0.0d, 0.0d, null, null, null, 1048575);
            }
            this.I = dVarB;
            LocalDate localDate = dVar.f121499p;
            if (localDate != null) {
                lz1.f.a aVar = lz1.f.f115404a;
                LocalDate localDatePlusMonths = s.g(this.f204392i, Boolean.TRUE) ? localDate.plusMonths(3) : null;
                aVar.getClass();
                pVarN = lz1.f.a.n(localDate, localDatePlusMonths);
            } else {
                pVarN = null;
            }
            Boolean bool = dVar.f121501r;
            Boolean bool2 = Boolean.TRUE;
            if (s.g(bool, bool2)) {
                bg0.a.f17827a.getClass();
                dVar2 = bg0.a.C0255a.e() ? e.KM_100 : ez1.f.MILES_50;
            } else {
                dVar2 = ez1.f.WORLD_WIDE;
            }
            ez1.d dVar3 = dVar2;
            if (xVar == null && uVar == null) {
                d dVar4 = this.I;
                if (dVar4 != null) {
                    dVarB2 = d.b(dVar4, pVarN != null ? (String) pVarN.f128594a : null, pVarN != null ? (String) pVarN.f128595b : null, s.g(this.f204392i, bool2) ? ny1.f.THREEMONTHS : ny1.f.CUSTOM, null, null, dVar3, null, false, null, null, null, 0.0d, 0.0d, null, dVar.f121499p, dVar.f121501r, 884696);
                } else {
                    dVarB2 = null;
                }
            } else {
                d dVar5 = this.I;
                if (dVar5 != null) {
                    j.f77174c.getClass();
                    dVarB2 = d.b(dVar5, null, null, null, null, null, dVar3, j.a.a(), false, null, null, null, 0.0d, 0.0d, null, null, null, 1048479);
                } else {
                    dVarB2 = null;
                }
            }
            this.I = dVarB2;
            this.X = dVarB2 != null ? dVarB2.f121487d : null;
        }
        Y4().m(dVar.f121486c);
        Z4().j(dVar);
        ((y0) this.O0.getValue()).m(dVar.f121487d);
    }

    public final void j5(boolean z14) {
        ((y0) this.M0.getValue()).j(Boolean.valueOf(z14));
    }

    public final void k5(ny1.b bVar) {
        bVar.getClass();
        d dVarD = Z4().d();
        Z4().m(dVarD != null ? d.b(dVarD, null, null, null, null, null, null, null, false, bVar, null, null, 0.0d, 0.0d, null, null, null, 1048319) : null);
    }

    public final void l5(double d14) {
        d dVarD = Z4().d();
        Z4().m(dVarD != null ? d.b(dVarD, null, null, null, null, null, null, null, false, null, null, null, d14, 0.0d, null, null, null, 1044479) : null);
    }

    public final void m5(double d14) {
        d dVarD = Z4().d();
        Z4().m(dVarD != null ? d.b(dVarD, null, null, null, null, null, null, null, false, null, null, null, 0.0d, d14, null, null, null, 1040383) : null);
    }

    public final void n5(ez1.c cVar) {
        cVar.getClass();
        d dVarD = Z4().d();
        Z4().m(dVarD != null ? d.b(dVarD, null, null, null, null, null, null, null, false, null, cVar, null, 0.0d, 0.0d, null, null, null, 1048063) : null);
    }

    public final void o5(ez1.c cVar) {
        cVar.getClass();
        d dVarD = Z4().d();
        Z4().m(dVarD != null ? d.b(dVarD, null, null, null, null, null, null, null, false, null, null, cVar, 0.0d, 0.0d, null, null, null, 1047551) : null);
    }

    /* JADX INFO: renamed from: cz1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcz1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1218a {
        public /* synthetic */ C1218a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1218a() {
        }
    }
}
