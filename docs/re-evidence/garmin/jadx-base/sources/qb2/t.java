package qb2;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/t;", "Lvh/a;", "Lpb2/e$f;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class t implements vh.a<pb2.e.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f144264a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144265b = p13.x.k("calendarDate", "totalTracking", "completedTracking");

    private t() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.f fVar) {
        pb2.e.f fVar2 = fVar;
        gVar.getClass();
        zVar.getClass();
        fVar2.getClass();
        gVar.v1("calendarDate");
        ub2.s.f169889a.getClass();
        vh.a aVarD = zVar.d(ub2.s.f169890b);
        vh.c.g gVar2 = vh.c.f178266a;
        new vh.k0(aVarD).a(gVar, zVar, fVar2.f136991a);
        gVar.v1("totalTracking");
        vh.k0<Integer> k0Var = vh.c.f178276k;
        k0Var.a(gVar, zVar, fVar2.f136992b);
        gVar.v1("completedTracking");
        k0Var.a(gVar, zVar, fVar2.f136993c);
    }

    @Override // vh.a
    public final pb2.e.f b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        DateTime dateTime = null;
        Integer numB = null;
        Integer numB2 = null;
        while (true) {
            int iS1 = fVar.S1(f144265b);
            if (iS1 == 0) {
                ub2.s.f169889a.getClass();
                vh.a aVarD = zVar.d(ub2.s.f169890b);
                vh.c.g gVar = vh.c.f178266a;
                dateTime = (DateTime) q6.f.m(aVarD, fVar, zVar);
            } else if (iS1 == 1) {
                numB = vh.c.f178276k.b(fVar, zVar);
            } else {
                if (iS1 != 2) {
                    return new pb2.e.f(dateTime, numB, numB2);
                }
                numB2 = vh.c.f178276k.b(fVar, zVar);
            }
        }
    }
}
