package qb2;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/x0;", "Lvh/a;", "Lpb2/g$e;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x0 implements vh.a<pb2.g.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f144281a = new x0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144282b = p13.x.k("__typename", "calendarDate", "wellnessChronology");

    private x0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.g.e eVar) {
        pb2.g.e eVar2 = eVar;
        gVar.getClass();
        zVar.getClass();
        eVar2.getClass();
        gVar.v1("__typename");
        vh.c.f178266a.a(gVar, zVar, eVar2.f137145a);
        gVar.v1("calendarDate");
        ub2.s.f169889a.getClass();
        new vh.k0(zVar.d(ub2.s.f169890b)).a(gVar, zVar, eVar2.f137146b);
        gVar.v1("wellnessChronology");
        new vh.k0(vh.c.b(y0.f144285a, false)).a(gVar, zVar, eVar2.f137147c);
        rb2.p pVar = eVar2.f137148d;
        if (pVar != null) {
            rb2.t.f151766a.getClass();
            rb2.t.d(gVar, zVar, pVar);
        }
        rb2.l lVar = eVar2.f137149e;
        if (lVar != null) {
            rb2.o.f151747a.getClass();
            rb2.o.d(gVar, zVar, lVar);
        }
        rb2.i iVar = eVar2.f137150f;
        if (iVar != null) {
            rb2.k.f151736a.getClass();
            rb2.k.d(gVar, zVar, iVar);
        }
    }

    @Override // vh.a
    public final pb2.g.e b(zh.f fVar, vh.z zVar) {
        rb2.p pVarC;
        rb2.l lVarC;
        fVar.getClass();
        zVar.getClass();
        vh.b bVar = zVar.f178398b;
        rb2.i iVarC = null;
        String str = null;
        DateTime dateTime = null;
        pb2.g.f fVar2 = null;
        while (true) {
            int iS1 = fVar.S1(f144282b);
            if (iS1 == 0) {
                str = (String) vh.c.f178266a.b(fVar, zVar);
            } else if (iS1 == 1) {
                ub2.s.f169889a.getClass();
                vh.a aVarD = zVar.d(ub2.s.f169890b);
                vh.c.g gVar = vh.c.f178266a;
                dateTime = (DateTime) q6.f.m(aVarD, fVar, zVar);
            } else {
                if (iS1 != 2) {
                    break;
                }
                fVar2 = (pb2.g.f) q6.f.o(vh.c.b(y0.f144285a, false), fVar, zVar);
            }
        }
        if (vh.m.a(vh.m.c("includeMovement"), bVar.b(), bVar)) {
            fVar.rewind();
            rb2.t.f151766a.getClass();
            pVarC = rb2.t.c(fVar, zVar);
        } else {
            pVarC = null;
        }
        if (vh.m.a(vh.m.c("includeHeartRate"), bVar.b(), bVar)) {
            fVar.rewind();
            rb2.o.f151747a.getClass();
            lVarC = rb2.o.c(fVar, zVar);
        } else {
            lVarC = null;
        }
        if (vh.m.a(vh.m.c("includeCalories"), bVar.b(), bVar)) {
            fVar.rewind();
            rb2.k.f151736a.getClass();
            iVarC = rb2.k.c(fVar, zVar);
        }
        str.getClass();
        return new pb2.g.e(str, dateTime, fVar2, pVarC, lVarC, iVarC);
    }
}
