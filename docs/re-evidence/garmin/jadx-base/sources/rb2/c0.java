package rb2;

import java.util.List;
import p005kotlin.Metadata;
import ub2.h0;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/c0;", "Lvh/a;", "Lrb2/b0$a;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c0 implements vh.a<b0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f151713a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151714b = p13.x.k("weight", "weightDelta", "bodyFat", "bodyWater", "boneMass", "muscleMass", "sourceType", "bmi", "visceralFat", "timestampGMT");

    private c0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, b0.a aVar) {
        b0.a aVar2 = aVar;
        gVar.getClass();
        zVar.getClass();
        aVar2.getClass();
        gVar.v1("weight");
        k0<Double> k0Var = vh.c.f178275j;
        k0Var.a(gVar, zVar, aVar2.f151696a);
        gVar.v1("weightDelta");
        k0Var.a(gVar, zVar, aVar2.f151697b);
        gVar.v1("bodyFat");
        k0Var.a(gVar, zVar, aVar2.f151698c);
        gVar.v1("bodyWater");
        k0Var.a(gVar, zVar, aVar2.f151699d);
        gVar.v1("boneMass");
        k0Var.a(gVar, zVar, aVar2.f151700e);
        gVar.v1("muscleMass");
        k0Var.a(gVar, zVar, aVar2.f151701f);
        gVar.v1("sourceType");
        vh.c.f178274i.a(gVar, zVar, aVar2.f151702g);
        gVar.v1("bmi");
        k0Var.a(gVar, zVar, aVar2.f151703h);
        gVar.v1("visceralFat");
        k0Var.a(gVar, zVar, aVar2.f151704i);
        gVar.v1("timestampGMT");
        h0.f169841a.getClass();
        new k0(zVar.d(h0.f169842b)).a(gVar, zVar, aVar2.f151705j);
    }

    @Override // vh.a
    public final b0.a b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Double dB = null;
        Double dB2 = null;
        Double dB3 = null;
        Double dB4 = null;
        Double dB5 = null;
        Double dB6 = null;
        String strB = null;
        Double dB7 = null;
        Double dB8 = null;
        Long l14 = null;
        while (true) {
            switch (fVar.S1(f151714b)) {
                case 0:
                    dB = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 1:
                    dB2 = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 2:
                    dB3 = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 3:
                    dB4 = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 4:
                    dB5 = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 5:
                    dB6 = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 6:
                    strB = vh.c.f178274i.b(fVar, zVar);
                    break;
                case 7:
                    dB7 = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 8:
                    dB8 = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 9:
                    h0.f169841a.getClass();
                    vh.a aVarD = zVar.d(h0.f169842b);
                    vh.c.g gVar = vh.c.f178266a;
                    l14 = (Long) q6.f.m(aVarD, fVar, zVar);
                    break;
                default:
                    return new b0.a(dB, dB2, dB3, dB4, dB5, dB6, strB, dB7, dB8, l14);
            }
        }
    }
}
