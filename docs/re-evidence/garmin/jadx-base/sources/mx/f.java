package mx;

import c22.l3;
import d53.w;
import e23.l;
import gg1.o0;
import java.text.NumberFormat;
import java.text.ParseException;
import lc.u0;
import m92.h0;
import m92.n;
import p005kotlin.Unit;
import p3.p1;
import s5.s0;
import sk0.n0;
import sk0.p;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121320a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f121321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f121322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f121323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f121324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f121325f;

    public /* synthetic */ f(NumberFormat numberFormat, p1 p1Var, p1 p1Var2, double d14, o0 o0Var) {
        this.f121322c = numberFormat;
        this.f121323d = p1Var;
        this.f121324e = p1Var2;
        this.f121321b = d14;
        this.f121325f = o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Number number;
        double d14;
        switch (this.f121320a) {
            case 0:
                h0.e.a aVar = (h0.e.a) this.f121322c;
                s5.c cVar = (s5.c) this.f121323d;
                s0 s0Var = (s0) this.f121325f;
                Float fValueOf = Float.valueOf(481.0f);
                s5.c cVar2 = (s5.c) this.f121324e;
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                if (aVar == null) {
                    return i53.a.c();
                }
                int i14 = (int) this.f121321b;
                n.a(fVar, cVar, s0Var, aVar, fValueOf, i14);
                return n.a(fVar, cVar2, s0Var, aVar, fValueOf, i14);
            default:
                NumberFormat numberFormat = (NumberFormat) this.f121322c;
                p1 p1Var = (p1) this.f121323d;
                p1 p1Var2 = (p1) this.f121324e;
                o0 o0Var = (o0) this.f121325f;
                String str = (String) obj;
                str.getClass();
                if (!w.J(str)) {
                    uk0.i.f171830a.getClass();
                    try {
                        number = numberFormat.parse(str);
                    } catch (ParseException unused) {
                        number = null;
                    }
                    if (number != null) {
                        double dAbs = Math.abs(number.doubleValue());
                        p1Var.setValue(dAbs >= this.f121321b ? sk0.o0.b((sk0.o0) p1Var.getF182175a(), false, false, false, true, false, 23) : sk0.o0.b((sk0.o0) p1Var.getF182175a(), false, false, false, false, false, 23));
                        int i15 = p.b.f159796a[o0Var.ordinal()];
                        if (i15 == 1 || i15 == 2) {
                            l3.f23124b.getClass();
                            d14 = 1609.344d;
                        } else {
                            if (i15 != 3) {
                                u0.r();
                                return null;
                            }
                            l3.f23124b.getClass();
                            d14 = 1000.0d;
                        }
                        p1Var2.setValue(n0.b((n0) p1Var2.getF182175a(), null, null, null, null, null, null, Double.valueOf(dAbs * d14), null, null, null, false, null, null, 8127));
                    }
                    break;
                } else {
                    p1Var.setValue(sk0.o0.b((sk0.o0) p1Var.getF182175a(), false, false, false, false, false, 23));
                    p1Var2.setValue(n0.b((n0) p1Var2.getF182175a(), null, null, null, null, null, null, null, null, null, null, false, null, null, 8127));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(h0.e.a aVar, s5.c cVar, s0 s0Var, double d14, s5.c cVar2) {
        this.f121322c = aVar;
        this.f121323d = cVar;
        this.f121325f = s0Var;
        this.f121321b = d14;
        this.f121324e = cVar2;
    }
}
