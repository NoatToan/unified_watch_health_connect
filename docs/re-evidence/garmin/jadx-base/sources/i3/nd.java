package i3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class nd implements f5.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ud f89079a;

    public nd(ud udVar) {
        this.f89079a = udVar;
    }

    @Override // f5.z0
    public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
        int iMax;
        int iMax2;
        int i14;
        int i15;
        int iC;
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            f5.y0 y0Var = list.get(i16);
            if (f5.g0.b(y0Var) == vc.THUMB) {
                f5.v1 v1VarQ = y0Var.Q(j8);
                int size2 = list.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    f5.y0 y0Var2 = list.get(i17);
                    if (f5.g0.b(y0Var2) == vc.TRACK) {
                        ud udVar = this.f89079a;
                        p008y1.b2 b2Var = udVar.f89922m;
                        int i18 = udVar.f89910a;
                        float[] fArr = udVar.f89916g;
                        p008y1.b2 b2Var2 = p008y1.b2.Vertical;
                        boolean z14 = true;
                        f5.v1 v1VarQ2 = b2Var == b2Var2 ? y0Var2.Q(g6.a.c(0, 0, 0, 0, 14, g6.b.j(0, -v1VarQ.f69145b, 1, j8))) : y0Var2.Q(g6.a.c(0, 0, 0, 0, 11, g6.b.j(-v1VarQ.f69144a, 0, 2, j8)));
                        p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
                        float fC = udVar.c();
                        if (!p005kotlin.jvm.internal.s.b(fC, p13.u.G(fArr)) && !p005kotlin.jvm.internal.s.b(fC, p13.u.S(fArr))) {
                            z14 = false;
                        }
                        int iE = v1VarQ2.E(kd.f88709f);
                        int i19 = iE != Integer.MIN_VALUE ? iE : 0;
                        if (udVar.f89922m == b2Var2) {
                            iMax = Math.max(v1VarQ2.f69144a, v1VarQ.f69144a);
                            int i24 = v1VarQ.f69145b;
                            int i25 = v1VarQ2.f69145b;
                            iMax2 = i24 + i25;
                            i14 = (iMax - v1VarQ2.f69144a) / 2;
                            i15 = i24 / 2;
                            iC = (iMax - v1VarQ.f69144a) / 2;
                            p0Var.f105807a = (i18 <= 0 || z14) ? MathKt.c(i25 * fC) : MathKt.c((i25 - (i19 * 2)) * fC) + i19;
                        } else {
                            iMax = v1VarQ.f69144a + v1VarQ2.f69144a;
                            iMax2 = Math.max(v1VarQ2.f69145b, v1VarQ.f69145b);
                            i14 = v1VarQ.f69144a / 2;
                            i15 = (iMax2 - v1VarQ2.f69145b) / 2;
                            iC = (i18 <= 0 || z14) ? MathKt.c(v1VarQ2.f69144a * fC) : MathKt.c((v1VarQ2.f69144a - (i19 * 2)) * fC) + i19;
                            p0Var.f105807a = (iMax2 - v1VarQ.f69145b) / 2;
                        }
                        int i26 = iMax2;
                        int i27 = i14;
                        int i28 = i15;
                        udVar.f89917h.t(iMax);
                        udVar.f89918i.t(i26);
                        return f5.b1.h0(b1Var, iMax, i26, new gs.h(v1VarQ2, i27, i28, v1VarQ, iC, p0Var));
                    }
                }
                throw hb.a.m("Collection contains no element matching the predicate.");
            }
        }
        throw hb.a.m("Collection contains no element matching the predicate.");
    }
}
