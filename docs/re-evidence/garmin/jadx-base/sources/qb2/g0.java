package qb2;

import com.garmin.android.gncs.NotificationConstants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/g0;", "Lvh/a;", "Lpb2/e$s;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g0 implements vh.a<pb2.e.s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f144218a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144219b = p13.x.k("value", "baselineUpperLimit", "baselineLowerLimit", "status", "percentage", "feedbackKey", NotificationConstants.KEY_DATA_MIME_TYPE);

    private g0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.s sVar) {
        pb2.e.s sVar2 = sVar;
        gVar.getClass();
        zVar.getClass();
        sVar2.getClass();
        gVar.v1("value");
        vh.k0<Double> k0Var = vh.c.f178275j;
        k0Var.a(gVar, zVar, sVar2.f137086a);
        gVar.v1("baselineUpperLimit");
        k0Var.a(gVar, zVar, sVar2.f137087b);
        gVar.v1("baselineLowerLimit");
        k0Var.a(gVar, zVar, sVar2.f137088c);
        gVar.v1("status");
        vh.k0<String> k0Var2 = vh.c.f178274i;
        k0Var2.a(gVar, zVar, sVar2.f137089d);
        gVar.v1("percentage");
        k0Var.a(gVar, zVar, sVar2.f137090e);
        gVar.v1("feedbackKey");
        k0Var2.a(gVar, zVar, sVar2.f137091f);
        gVar.v1(NotificationConstants.KEY_DATA_MIME_TYPE);
        k0Var2.a(gVar, zVar, sVar2.f137092g);
    }

    @Override // vh.a
    public final pb2.e.s b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Double dB = null;
        Double dB2 = null;
        Double dB3 = null;
        String strB = null;
        Double dB4 = null;
        String strB2 = null;
        String strB3 = null;
        while (true) {
            switch (fVar.S1(f144219b)) {
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
                    strB = vh.c.f178274i.b(fVar, zVar);
                    break;
                case 4:
                    dB4 = vh.c.f178275j.b(fVar, zVar);
                    break;
                case 5:
                    strB2 = vh.c.f178274i.b(fVar, zVar);
                    break;
                case 6:
                    strB3 = vh.c.f178274i.b(fVar, zVar);
                    break;
                default:
                    return new pb2.e.s(dB, dB2, dB3, strB, dB4, strB2, strB3);
            }
        }
    }
}
