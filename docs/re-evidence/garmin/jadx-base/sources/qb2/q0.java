package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/q0;", "Lvh/a;", "Lpb2/e$c0;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q0 implements vh.a<pb2.e.c0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f144255a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144256b = p13.x.k("weekNum", "lowWeightGoalInGrams", "highWeightGoalInGrams");

    private q0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.c0 c0Var) {
        pb2.e.c0 c0Var2 = c0Var;
        gVar.getClass();
        zVar.getClass();
        c0Var2.getClass();
        gVar.v1("weekNum");
        vh.c.f178276k.a(gVar, zVar, c0Var2.f136985a);
        gVar.v1("lowWeightGoalInGrams");
        vh.k0<Double> k0Var = vh.c.f178275j;
        k0Var.a(gVar, zVar, c0Var2.f136986b);
        gVar.v1("highWeightGoalInGrams");
        k0Var.a(gVar, zVar, c0Var2.f136987c);
    }

    @Override // vh.a
    public final pb2.e.c0 b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Integer numB = null;
        Double dB = null;
        Double dB2 = null;
        while (true) {
            int iS1 = fVar.S1(f144256b);
            if (iS1 == 0) {
                numB = vh.c.f178276k.b(fVar, zVar);
            } else if (iS1 == 1) {
                dB = vh.c.f178275j.b(fVar, zVar);
            } else {
                if (iS1 != 2) {
                    return new pb2.e.c0(numB, dB, dB2);
                }
                dB2 = vh.c.f178275j.b(fVar, zVar);
            }
        }
    }
}
