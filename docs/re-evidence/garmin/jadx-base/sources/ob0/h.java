package ob0;

import androidx.lifecycle.u1;
import c22.l3;
import gg1.o0;
import o13.m;
import o13.t;
import o72.v3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r53.b2;
import r53.p2;
import r53.q2;
import r53.s;
import s5.w0;
import x5.l0;
import z80.k;
import z80.n;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lob0/h;", "Landroidx/lifecycle/u1;", "Lz80/n;", "data", "Lx90/a;", "getWeightDataUseCase", "<init>", "(Lz80/n;Lx90/a;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f131127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f131128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f131129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f131130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f131131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f131132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f131133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f131134h;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f131135a;

        static {
            int[] iArr = new int[o0.values().length];
            try {
                iArr[o0.METRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f131135a = iArr;
        }
    }

    public h(n nVar, x90.a aVar) {
        nVar.getClass();
        aVar.getClass();
        double dA = nVar.f203089a;
        k kVar = nVar.f203091c;
        o0 o0Var = nVar.f203090b;
        boolean zA = o0Var.a();
        if (Double.isNaN(dA) || dA == 0.0d) {
            dA = x90.a.a(o0Var, kVar);
        } else if (zA && ((int) dA) == ((int) x90.a.a(o0.STATUTE_US, kVar))) {
            dA = x90.a.a(o0.METRIC, kVar);
        } else if (!zA && ((int) dA) == ((int) x90.a.a(o0.METRIC, kVar))) {
            dA = x90.a.a(o0.STATUTE_US, kVar);
        }
        pb0.a aVar2 = new pb0.a(dA);
        p2 p2VarA = q2.a(aVar2);
        this.f131127a = p2VarA;
        this.f131128b = s.d(p2VarA);
        p2 p2VarA2 = q2.a(o0Var);
        this.f131129c = p2VarA2;
        this.f131130d = s.d(p2VarA2);
        this.f131131e = m.b(new v3(26));
        String strA = aVar2.a(o0Var);
        int length = aVar2.a(o0Var).length();
        p2 p2VarA3 = q2.a(new ob0.a(new l0(strA, og.a.l(length, length), (w0) null, 4, (j) null), true, false));
        this.f131132f = p2VarA3;
        this.f131133g = s.d(p2VarA3);
        this.f131134h = q2.a(Boolean.FALSE);
    }

    public final void x4() {
        p2 p2Var;
        Object value;
        int length;
        String strA = ((pb0.a) this.f131127a.getValue()).a((o0) this.f131129c.getValue());
        do {
            p2Var = this.f131132f;
            value = p2Var.getValue();
            length = strA.length();
        } while (!p2Var.b(value, ob0.a.a((ob0.a) value, new l0(strA, og.a.l(length, length), (w0) null, 4, (j) null), false, false, 6)));
    }

    public final void y4() {
        Object value;
        pb0.a aVar;
        p2 p2Var;
        Object value2;
        double d14;
        boolean zContains;
        o0 o0Var = (o0) this.f131129c.getValue();
        p2 p2Var2 = this.f131132f;
        String str = ((ob0.a) p2Var2.getValue()).f131100a.f188878a.f157138b;
        int length = str.length();
        t tVar = this.f131131e;
        boolean z14 = false;
        if (length > 0) {
            c cVar = (c) tVar.getValue();
            cVar.getClass();
            if (new d53.k("^[0-9]*[" + cVar.f131104a + "]?[0-9]*$").d(str)) {
                c cVar2 = (c) tVar.getValue();
                cVar2.getClass();
                String strReplace = str.replace(cVar2.f131104a, '.');
                strReplace.getClass();
                Double dF = d53.s.f(strReplace);
                if (dF != null) {
                    double dDoubleValue = dF.doubleValue();
                    o0Var.getClass();
                    int[] iArr = b.f131103a;
                    zContains = new j23.d(iArr[o0Var.ordinal()] == 1 ? 1 : 2, iArr[o0Var.ordinal()] == 1 ? 453 : 999).contains(Double.valueOf(dDoubleValue));
                } else {
                    zContains = false;
                }
                if (zContains) {
                    z14 = true;
                }
            }
        }
        do {
            value = p2Var2.getValue();
            aVar = null;
        } while (!p2Var2.b(value, ob0.a.a((ob0.a) value, null, z14, true, 1)));
        c cVar3 = (c) tVar.getValue();
        cVar3.getClass();
        String strReplace2 = str.replace(cVar3.f131104a, '.');
        strReplace2.getClass();
        Double dF2 = d53.s.f(strReplace2);
        if (dF2 != null) {
            double dDoubleValue2 = dF2.doubleValue();
            if (a.f131135a[o0Var.ordinal()] == 1) {
                l3.f23124b.getClass();
                d14 = 1000;
            } else {
                l3.f23124b.getClass();
                d14 = 453.592d;
            }
            aVar = new pb0.a(dDoubleValue2 * d14);
        }
        if (!z14 || aVar == null) {
            return;
        }
        do {
            p2Var = this.f131127a;
            value2 = p2Var.getValue();
        } while (!p2Var.b(value2, aVar));
        x4();
    }
}
