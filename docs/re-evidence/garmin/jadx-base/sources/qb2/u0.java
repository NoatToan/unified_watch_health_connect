package qb2;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/u0;", "Lvh/a;", "Lpb2/g$b;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u0 implements vh.a<pb2.g.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f144269a = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144270b = p13.x.k("__typename", "date", "userMetrics");

    private u0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.g.b bVar) {
        pb2.g.b bVar2 = bVar;
        gVar.getClass();
        zVar.getClass();
        bVar2.getClass();
        gVar.v1("__typename");
        vh.c.f178266a.a(gVar, zVar, bVar2.f137136a);
        gVar.v1("date");
        ub2.s.f169889a.getClass();
        new vh.k0(zVar.d(ub2.s.f169890b)).a(gVar, zVar, bVar2.f137137b);
        gVar.v1("userMetrics");
        new vh.k0(vh.c.b(x0.f144281a, true)).a(gVar, zVar, bVar2.f137138c);
        rb2.b0 b0Var = bVar2.f137139d;
        if (b0Var != null) {
            rb2.f0.f151725a.getClass();
            rb2.f0.d(gVar, zVar, b0Var);
        }
        rb2.w wVar = bVar2.f137140e;
        if (wVar != null) {
            rb2.z.f151796a.getClass();
            rb2.z.d(gVar, zVar, wVar);
        }
    }

    @Override // vh.a
    public final pb2.g.b b(zh.f fVar, vh.z zVar) {
        rb2.b0 b0VarC;
        fVar.getClass();
        zVar.getClass();
        vh.b bVar = zVar.f178398b;
        rb2.w wVarC = null;
        String str = null;
        DateTime dateTime = null;
        pb2.g.e eVar = null;
        while (true) {
            int iS1 = fVar.S1(f144270b);
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
                eVar = (pb2.g.e) q6.f.o(vh.c.b(x0.f144281a, true), fVar, zVar);
            }
        }
        if (vh.m.a(vh.m.c("includeWeight"), bVar.b(), bVar)) {
            fVar.rewind();
            rb2.f0.f151725a.getClass();
            b0VarC = rb2.f0.c(fVar, zVar);
        } else {
            b0VarC = null;
        }
        if (vh.m.a(vh.m.c("includeSleep"), bVar.b(), bVar)) {
            fVar.rewind();
            rb2.z.f151796a.getClass();
            wVarC = rb2.z.c(fVar, zVar);
        }
        str.getClass();
        return new pb2.g.b(str, dateTime, eVar, b0VarC, wVarC);
    }
}
