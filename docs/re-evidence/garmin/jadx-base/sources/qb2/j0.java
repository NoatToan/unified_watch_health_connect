package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/j0;", "Lvh/a;", "Lpb2/e$v;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j0 implements vh.a<pb2.e.v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f144230a = new j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144231b = p13.x.k("calories", "adjustedCalories", "carbs", "adjustedCarbs", "fat", "adjustedFat", "protein", "adjustedProtein");

    private j0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.v vVar) {
        pb2.e.v vVar2 = vVar;
        gVar.getClass();
        zVar.getClass();
        vVar2.getClass();
        gVar.v1("calories");
        vh.k0<Integer> k0Var = vh.c.f178276k;
        k0Var.a(gVar, zVar, vVar2.f137103a);
        gVar.v1("adjustedCalories");
        k0Var.a(gVar, zVar, vVar2.f137104b);
        gVar.v1("carbs");
        vh.k0<Double> k0Var2 = vh.c.f178275j;
        k0Var2.a(gVar, zVar, vVar2.f137105c);
        gVar.v1("adjustedCarbs");
        k0Var2.a(gVar, zVar, vVar2.f137106d);
        gVar.v1("fat");
        k0Var2.a(gVar, zVar, vVar2.f137107e);
        gVar.v1("adjustedFat");
        k0Var2.a(gVar, zVar, vVar2.f137108f);
        gVar.v1("protein");
        k0Var2.a(gVar, zVar, vVar2.f137109g);
        gVar.v1("adjustedProtein");
        k0Var2.a(gVar, zVar, vVar2.f137110h);
    }

    @Override // vh.a
    public final pb2.e.v b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Integer numB = null;
        Integer numB2 = null;
        Double dB = null;
        Double dB2 = null;
        Double dB3 = null;
        Double dB4 = null;
        Double dB5 = null;
        Double dB6 = null;
        while (true) {
            switch (fVar.S1(f144231b)) {
                case 0:
                    numB = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 1:
                    numB2 = vh.c.f178276k.b(fVar, zVar);
                    break;
                case 2:
                    dB = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 3:
                    dB2 = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 4:
                    dB3 = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 5:
                    dB4 = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 6:
                    dB5 = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 7:
                    dB6 = vh.c.f178275j.b(fVar, zVar);
                    break;
                default:
                    return new pb2.e.v(numB, numB2, dB, dB2, dB3, dB4, dB5, dB6);
            }
        }
    }
}
