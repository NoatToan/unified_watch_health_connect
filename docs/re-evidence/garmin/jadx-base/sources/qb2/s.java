package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/s;", "Lvh/a;", "Lpb2/e$d;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s implements vh.a<pb2.e.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f144260a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144261b = p13.x.k("totalCalories", "activeCalories", "restingCalories");

    private s() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.d dVar) {
        pb2.e.d dVar2 = dVar;
        gVar.getClass();
        zVar.getClass();
        dVar2.getClass();
        gVar.v1("totalCalories");
        vh.k0<Double> k0Var = vh.c.f178275j;
        k0Var.a(gVar, zVar, dVar2.f136988a);
        gVar.v1("activeCalories");
        k0Var.a(gVar, zVar, dVar2.f136989b);
        gVar.v1("restingCalories");
        k0Var.a(gVar, zVar, dVar2.f136990c);
    }

    @Override // vh.a
    public final pb2.e.d b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Double dB = null;
        Double dB2 = null;
        Double dB3 = null;
        while (true) {
            int iS1 = fVar.S1(f144261b);
            if (iS1 == 0) {
                dB = vh.c.f178275j.b(fVar, zVar);
            } else if (iS1 == 1) {
                dB2 = vh.c.f178275j.b(fVar, zVar);
            } else {
                if (iS1 != 2) {
                    return new pb2.e.d(dB, dB2, dB3);
                }
                dB3 = vh.c.f178275j.b(fVar, zVar);
            }
        }
    }
}
