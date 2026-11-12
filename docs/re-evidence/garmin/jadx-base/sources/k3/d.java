package k3;

import com.google.firebase.analytics.FirebaseAnalytics;
import e23.l;
import f5.a1;
import f5.b1;
import f5.g0;
import f5.v1;
import f5.y0;
import f5.z0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class d implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f102506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<Float> f102507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.d.b f102508c;

    public d(String str, x3<Float> x3Var, h4.d.b bVar) {
        this.f102506a = str;
        this.f102507b = x3Var;
        this.f102508c = bVar;
    }

    @Override // f5.z0
    public final a1 f(final b1 b1Var, List<? extends y0> list, long j8) {
        long jC = g6.a.c(0, 0, 0, 0, 10, j8);
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            y0 y0Var = list.get(i14);
            if (s.g(g0.b(y0Var), "navigationSuite")) {
                final v1 v1VarQ = y0Var.Q(jC);
                int size2 = list.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    y0 y0Var2 = list.get(i15);
                    if (s.g(g0.b(y0Var2), "primaryActionContent")) {
                        final v1 v1VarQ2 = y0Var2.Q(jC);
                        float f14 = e.f102509a;
                        i.f102517b.getClass();
                        String str = i.f102518c;
                        String str2 = this.f102506a;
                        final boolean z14 = s.g(str2, str) || s.g(str2, i.f102519d) || s.g(str2, i.f102520e);
                        final int i16 = g6.a.i(j8);
                        final int iJ = g6.a.j(j8);
                        int size3 = list.size();
                        for (int i17 = 0; i17 < size3; i17++) {
                            y0 y0Var3 = list.get(i17);
                            if (s.g(g0.b(y0Var3), FirebaseAnalytics.Param.CONTENT)) {
                                x3<Float> x3Var = this.f102507b;
                                final v1 v1VarQ3 = y0Var3.Q(z14 ? g6.a.c(0, 0, i16 - ((int) (e.c(x3Var) * v1VarQ.f69145b)), i16 - ((int) (x3Var.getF182175a().floatValue() * v1VarQ.f69145b)), 3, j8) : g6.a.c(iJ - ((int) (e.c(x3Var) * v1VarQ.f69144a)), iJ - ((int) (x3Var.getF182175a().floatValue() * v1VarQ.f69144a)), 0, 0, 12, j8));
                                final h4.d.b bVar = this.f102508c;
                                final x3<Float> x3Var2 = this.f102507b;
                                return b1.h0(b1Var, iJ, i16, new l() { // from class: k3.c
                                    @Override // e23.l
                                    public final Object invoke(Object obj) {
                                        int iF0;
                                        v1.a aVar = (v1.a) obj;
                                        boolean z15 = z14;
                                        v1 v1Var = v1VarQ3;
                                        v1 v1Var2 = v1VarQ;
                                        x3 x3Var3 = x3Var2;
                                        if (z15) {
                                            v1.a.B(aVar, v1Var, 0, 0);
                                            int iC = (int) (e.c(x3Var3) * v1Var2.f69145b);
                                            int i18 = i16;
                                            v1.a.B(aVar, v1Var2, 0, i18 - iC);
                                            h4.d.f81522a.getClass();
                                            h4.g.a aVar2 = h4.d.a.f81536n;
                                            h4.d.b bVar2 = bVar;
                                            boolean zG = s.g(bVar2, aVar2);
                                            b1 b1Var2 = b1Var;
                                            v1 v1Var3 = v1VarQ2;
                                            if (zG) {
                                                iF0 = b1Var2.f0(e.f102509a);
                                            } else {
                                                boolean zG2 = s.g(bVar2, h4.d.a.f81537o);
                                                int i19 = iJ;
                                                iF0 = zG2 ? (i19 - v1Var3.f69144a) / 2 : (i19 - v1Var3.f69144a) - b1Var2.f0(e.f102509a);
                                            }
                                            v1.a.B(aVar, v1Var3, iF0, ((i18 - v1Var3.f69145b) - b1Var2.f0(e.f102509a)) - ((int) (((Number) x3Var3.getF182175a()).floatValue() * v1Var2.f69145b)));
                                        } else {
                                            v1.a.B(aVar, v1Var2, (int) (0 - ((1.0f - e.c(x3Var3)) * v1Var2.f69144a)), 0);
                                            v1.a.B(aVar, v1Var, (int) (((Number) x3Var3.getF182175a()).floatValue() * v1Var2.f69144a), 0);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                        }
                        throw hb.a.m("Collection contains no element matching the predicate.");
                    }
                }
                throw hb.a.m("Collection contains no element matching the predicate.");
            }
        }
        throw hb.a.m("Collection contains no element matching the predicate.");
    }
}
