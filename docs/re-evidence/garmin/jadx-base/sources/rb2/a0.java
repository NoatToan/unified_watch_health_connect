package rb2;

import java.util.List;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import ub2.g0;
import vh.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrb2/a0;", "Lvh/a;", "Lrb2/w$c;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a0 implements vh.a<w.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f151691a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f151692b = p13.x.k("startGMT", "endGMT", "activityLevel");

    private a0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, w.c cVar) {
        w.c cVar2 = cVar;
        gVar.getClass();
        zVar.getClass();
        cVar2.getClass();
        gVar.v1("startGMT");
        g0.f169835a.getClass();
        vh.a0 a0Var = g0.f169836b;
        vh.a aVarD = zVar.d(a0Var);
        vh.c.g gVar2 = vh.c.f178266a;
        new k0(aVarD).a(gVar, zVar, cVar2.f151789a);
        gVar.v1("endGMT");
        new k0(zVar.d(a0Var)).a(gVar, zVar, cVar2.f151790b);
        gVar.v1("activityLevel");
        vh.c.f178275j.a(gVar, zVar, cVar2.f151791c);
    }

    @Override // vh.a
    public final w.c b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        LocalDateTime localDateTime = null;
        LocalDateTime localDateTime2 = null;
        Double dB = null;
        while (true) {
            int iS1 = fVar.S1(f151692b);
            if (iS1 == 0) {
                g0.f169835a.getClass();
                vh.a aVarD = zVar.d(g0.f169836b);
                vh.c.g gVar = vh.c.f178266a;
                localDateTime = (LocalDateTime) q6.f.m(aVarD, fVar, zVar);
            } else if (iS1 == 1) {
                g0.f169835a.getClass();
                vh.a aVarD2 = zVar.d(g0.f169836b);
                vh.c.g gVar2 = vh.c.f178266a;
                localDateTime2 = (LocalDateTime) q6.f.m(aVarD2, fVar, zVar);
            } else {
                if (iS1 != 2) {
                    return new w.c(localDateTime, localDateTime2, dB);
                }
                dB = vh.c.f178275j.b(fVar, zVar);
            }
        }
    }
}
