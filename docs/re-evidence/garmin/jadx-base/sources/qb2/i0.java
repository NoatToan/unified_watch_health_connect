package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/i0;", "Lvh/a;", "Lpb2/e$u;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i0 implements vh.a<pb2.e.u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f144226a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144227b = p13.x.k("calories", "carbs", "fat", "protein", "caloriesPercentage");

    private i0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.u uVar) {
        pb2.e.u uVar2 = uVar;
        gVar.getClass();
        zVar.getClass();
        uVar2.getClass();
        gVar.v1("calories");
        vh.c.f178276k.a(gVar, zVar, uVar2.f137098a);
        gVar.v1("carbs");
        vh.k0<Double> k0Var = vh.c.f178275j;
        k0Var.a(gVar, zVar, uVar2.f137099b);
        gVar.v1("fat");
        k0Var.a(gVar, zVar, uVar2.f137100c);
        gVar.v1("protein");
        k0Var.a(gVar, zVar, uVar2.f137101d);
        gVar.v1("caloriesPercentage");
        k0Var.a(gVar, zVar, uVar2.f137102e);
    }

    @Override // vh.a
    public final pb2.e.u b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Integer numB = null;
        Double dB = null;
        Double dB2 = null;
        Double dB3 = null;
        Double dB4 = null;
        while (true) {
            int iS1 = fVar.S1(f144227b);
            if (iS1 == 0) {
                numB = vh.c.f178276k.b(fVar, zVar);
            } else if (iS1 == 1) {
                dB = vh.c.f178275j.b(fVar, zVar);
            } else if (iS1 == 2) {
                dB2 = vh.c.f178275j.b(fVar, zVar);
            } else if (iS1 == 3) {
                dB3 = vh.c.f178275j.b(fVar, zVar);
            } else {
                if (iS1 != 4) {
                    return new pb2.e.u(numB, dB, dB2, dB3, dB4);
                }
                dB4 = vh.c.f178275j.b(fVar, zVar);
            }
        }
    }
}
