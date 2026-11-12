package i3;

import com.google.firebase.messaging.Constants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class v9 implements f5.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.a<Float> f90001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f90003c;

    /* JADX WARN: Multi-variable type inference failed */
    public v9(e23.a<Float> aVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, boolean z14) {
        this.f90001a = aVar;
        this.f90002b = pVar;
        this.f90003c = z14;
    }

    @Override // f5.z0
    public final f5.a1 f(final f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
        f5.y0 y0Var;
        f5.v1 v1VarQ;
        final f5.v1 v1VarQ2;
        v9 v9Var = this;
        float fFloatValue = v9Var.f90001a.invoke().floatValue();
        float f14 = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
        long jC = g6.a.c(0, 0, 0, 0, 10, j8);
        int size = list.size();
        int i14 = 0;
        while (true) {
            String str = "Collection contains no element matching the predicate.";
            if (i14 >= size) {
                throw hb.a.m("Collection contains no element matching the predicate.");
            }
            f5.y0 y0Var2 = list.get(i14);
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var2), "icon")) {
                final f5.v1 v1VarQ3 = y0Var2.Q(jC);
                int i15 = v1VarQ3.f69144a;
                char c14 = 2;
                float f15 = 2;
                float f16 = w9.f90111d * f15;
                g6.f.a aVar = g6.f.f75994b;
                int iF0 = b1Var.f0(f16) + i15;
                int iC = MathKt.c(iF0 * f14);
                int iF1 = b1Var.f0(w9.f90112e * f15) + v1VarQ3.f69145b;
                int size2 = list.size();
                int i16 = 0;
                while (i16 < size2) {
                    f5.y0 y0Var3 = list.get(i16);
                    char c15 = c14;
                    final float f17 = f14;
                    if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var3), "indicatorRipple")) {
                        g6.a.f75987b.getClass();
                        String str2 = str;
                        final f5.v1 v1VarQ4 = y0Var3.Q(g6.a.C1525a.c(iF0, iF1));
                        int size3 = list.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size3) {
                                y0Var = null;
                                break;
                            }
                            y0Var = list.get(i17);
                            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var), "indicator")) {
                                break;
                            }
                            i17++;
                        }
                        f5.y0 y0Var4 = y0Var;
                        if (y0Var4 != null) {
                            g6.a.f75987b.getClass();
                            v1VarQ = y0Var4.Q(g6.a.C1525a.c(iC, iF1));
                        } else {
                            v1VarQ = null;
                        }
                        e23.p<p3.m, Integer, Unit> pVar = v9Var.f90002b;
                        if (pVar != null) {
                            int size4 = list.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 >= size4) {
                                    throw hb.a.m(str2);
                                }
                                f5.y0 y0Var5 = list.get(i18);
                                if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var5), Constants.ScionAnalytics.PARAM_LABEL)) {
                                    v1VarQ2 = y0Var5.Q(jC);
                                    break;
                                }
                                i18++;
                            }
                        } else {
                            v1VarQ2 = null;
                        }
                        if (pVar == null) {
                            int iF2 = g6.a.j(j8) == Integer.MAX_VALUE ? (b1Var.f0(w9.f90114g) * 2) + v1VarQ3.f69144a : g6.a.j(j8);
                            int iF = g6.b.f(b1Var.f0(w9.f90108a), j8);
                            return f5.b1.h0(b1Var, iF2, iF, new p9(v1VarQ, v1VarQ3, (iF2 - v1VarQ3.f69144a) / 2, (iF - v1VarQ3.f69145b) / 2, v1VarQ4, (iF2 - v1VarQ4.f69144a) / 2, (iF - v1VarQ4.f69145b) / 2, iF2, iF));
                        }
                        v1VarQ2.getClass();
                        float f18 = v1VarQ3.f69145b;
                        float f19 = w9.f90112e;
                        float fS0 = b1Var.s0(f19) + f18;
                        float f22 = w9.f90110c;
                        float fS1 = b1Var.s0(f22) + fS0 + v1VarQ2.f69145b;
                        float fK = (g6.a.k(j8) - fS1) / f15;
                        float fS2 = b1Var.s0(f19);
                        if (fK < fS2) {
                            fK = fS2;
                        }
                        float f24 = (fK * f15) + fS1;
                        final boolean z14 = v9Var.f90003c;
                        final float f25 = (1 - f17) * ((z14 ? fK : (f24 - v1VarQ3.f69145b) / f15) - fK);
                        final float fS3 = b1Var.s0(f22) + b1Var.s0(f19) + v1VarQ3.f69145b + fK;
                        final int iF3 = g6.a.j(j8) == Integer.MAX_VALUE ? (b1Var.f0(w9.f90114g) * 2) + v1VarQ3.f69144a : g6.a.j(j8);
                        final int i19 = (iF3 - v1VarQ2.f69144a) / 2;
                        final int i24 = (iF3 - v1VarQ3.f69144a) / 2;
                        final int i25 = (iF3 - v1VarQ4.f69144a) / 2;
                        final float fS4 = fK - b1Var.s0(f19);
                        final float f26 = fK;
                        final f5.v1 v1Var = v1VarQ;
                        return f5.b1.h0(b1Var, iF3, MathKt.c(f24), new e23.l() { // from class: i3.o9
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                f5.v1.a aVar2 = (f5.v1.a) obj;
                                f5.v1 v1Var2 = v1Var;
                                float f27 = f25;
                                float f28 = f26;
                                if (v1Var2 != null) {
                                    f5.v1.a.B(aVar2, v1Var2, (iF3 - v1Var2.f69144a) / 2, MathKt.c((f28 - b1Var.f0(w9.f90112e)) + f27));
                                }
                                if (z14 || f17 != 0.0f) {
                                    f5.v1.a.B(aVar2, v1VarQ2, i19, MathKt.c(fS3 + f27));
                                }
                                f5.v1.a.B(aVar2, v1VarQ3, i24, MathKt.c(f28 + f27));
                                f5.v1.a.B(aVar2, v1VarQ4, i25, MathKt.c(fS4 + f27));
                                return Unit.INSTANCE;
                            }
                        });
                    }
                    i16++;
                    v9Var = this;
                    str = str;
                    c14 = c15;
                    f14 = f17;
                }
                throw hb.a.m(str);
            }
            i14++;
            v9Var = this;
        }
    }
}
