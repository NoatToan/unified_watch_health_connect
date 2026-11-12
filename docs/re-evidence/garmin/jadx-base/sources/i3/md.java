package i3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class md implements f5.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cb f88999a;

    public md(cb cbVar) {
        this.f88999a = cbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f5.z0
    public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
        int size = list.size();
        int i14 = 0;
        int i15 = 0;
        while (i15 < size) {
            f5.y0 y0Var = list.get(i15);
            if (f5.g0.b(y0Var) == ya.STARTTHUMB) {
                f5.v1 v1VarQ = y0Var.Q(j8);
                int size2 = list.size();
                int i16 = i14;
                while (i16 < size2) {
                    f5.y0 y0Var2 = list.get(i16);
                    if (f5.g0.b(y0Var2) == ya.ENDTHUMB) {
                        f5.v1 v1VarQ2 = y0Var2.Q(j8);
                        int size3 = list.size();
                        int i17 = i14;
                        while (i17 < size3) {
                            f5.y0 y0Var3 = list.get(i17);
                            if (f5.g0.b(y0Var3) == ya.TRACK) {
                                f5.v1 v1VarQ3 = y0Var3.Q(g6.a.c(0, 0, 0, 0, 11, g6.b.j((-(v1VarQ.f69144a + v1VarQ2.f69144a)) / 2, i14, 2, j8)));
                                int i18 = ((v1VarQ.f69144a + v1VarQ2.f69144a) / 2) + v1VarQ3.f69144a;
                                int iMax = Math.max(v1VarQ3.f69145b, Math.max(v1VarQ.f69145b, v1VarQ2.f69145b));
                                cb cbVar = this.f88999a;
                                p3.a2 a2Var = cbVar.f87751l;
                                int i19 = cbVar.f87740a;
                                p3.z1 z1Var = cbVar.f87744e;
                                p3.z1 z1Var2 = cbVar.f87743d;
                                float[] fArr = cbVar.f87746g;
                                a2Var.t(i18);
                                p3.z1 z1Var3 = cbVar.f87757r;
                                p3.z1 z1Var4 = cbVar.f87758s;
                                float f14 = 2;
                                float fMax = Math.max(cbVar.f87751l.getIntValue() - (cbVar.f87749j.getFloatValue() / f14), 0.0f);
                                float fMin = Math.min(cbVar.f87747h.getFloatValue() / f14, fMax);
                                if (!((Boolean) cbVar.f87754o.getF182175a()).booleanValue() && (z1Var4.getFloatValue() != fMin || z1Var3.getFloatValue() != fMax || z1Var2.getFloatValue() != z1Var.getFloatValue())) {
                                    z1Var4.i(fMin);
                                    z1Var3.i(fMax);
                                    cbVar.f87752m.i(cbVar.f(z1Var4.getFloatValue(), z1Var3.getFloatValue(), z1Var2.getFloatValue()));
                                    cbVar.f87753n.i(cbVar.f(z1Var4.getFloatValue(), z1Var3.getFloatValue(), z1Var.getFloatValue()));
                                }
                                float fB = cbVar.b();
                                boolean z14 = true;
                                boolean z15 = p005kotlin.jvm.internal.s.b(fB, p13.u.G(fArr)) || p005kotlin.jvm.internal.s.b(fB, p13.u.S(fArr));
                                float fA = cbVar.a();
                                if (!p005kotlin.jvm.internal.s.b(fA, p13.u.G(fArr)) && !p005kotlin.jvm.internal.s.b(fA, p13.u.S(fArr))) {
                                    z14 = false;
                                }
                                int i24 = v1VarQ.f69144a / 2;
                                int iE = v1VarQ3.E(kd.f88709f);
                                int i25 = iE != Integer.MIN_VALUE ? iE : 0;
                                int iC = (i19 <= 0 || z15) ? MathKt.c(v1VarQ3.f69144a * fB) : MathKt.c((v1VarQ3.f69144a - (i25 * 2)) * fB) + i25;
                                int i26 = (v1VarQ.f69144a - v1VarQ2.f69144a) / 2;
                                return f5.b1.h0(b1Var, i18, iMax, new p9(v1VarQ3, i24, (iMax - v1VarQ3.f69145b) / 2, v1VarQ, iC, (iMax - v1VarQ.f69145b) / 2, v1VarQ2, (i19 <= 0 || z14) ? MathKt.c((v1VarQ3.f69144a * fA) + i26) : MathKt.c(((v1VarQ3.f69144a - (i25 * 2)) * fA) + i26) + i25, (iMax - v1VarQ2.f69145b) / 2));
                            }
                            i17++;
                            i14 = 0;
                        }
                        throw hb.a.m("Collection contains no element matching the predicate.");
                    }
                    i16++;
                    i14 = 0;
                }
                throw hb.a.m("Collection contains no element matching the predicate.");
            }
            i15++;
            i14 = 0;
        }
        throw hb.a.m("Collection contains no element matching the predicate.");
    }
}
