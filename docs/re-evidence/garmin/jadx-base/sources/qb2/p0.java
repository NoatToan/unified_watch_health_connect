package qb2;

import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/p0;", "Lvh/a;", "Lpb2/e$b0;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p0 implements vh.a<pb2.e.b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f144251a = new p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144252b = p13.x.k("startDate", "endDate", "userProfilePk", "cyclingAbilitiesMap");

    private p0() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.e.b0 b0Var) {
        pb2.e.b0 b0Var2 = b0Var;
        gVar.getClass();
        zVar.getClass();
        b0Var2.getClass();
        gVar.v1("startDate");
        ub2.s.f169889a.getClass();
        vh.a0 a0Var = ub2.s.f169890b;
        zVar.d(a0Var).a(gVar, zVar, b0Var2.f136975a);
        gVar.v1("endDate");
        zVar.d(a0Var).a(gVar, zVar, b0Var2.f136976b);
        gVar.v1("userProfilePk");
        vh.c.f178276k.a(gVar, zVar, b0Var2.f136977c);
        gVar.v1("cyclingAbilitiesMap");
        vh.c.f178278m.a(gVar, zVar, b0Var2.f136978d);
    }

    @Override // vh.a
    public final pb2.e.b0 b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        DateTime dateTime = null;
        DateTime dateTime2 = null;
        Integer numB = null;
        Object objB = null;
        while (true) {
            int iS1 = fVar.S1(f144252b);
            if (iS1 == 0) {
                ub2.s.f169889a.getClass();
                dateTime = (DateTime) zVar.d(ub2.s.f169890b).b(fVar, zVar);
            } else if (iS1 == 1) {
                ub2.s.f169889a.getClass();
                dateTime2 = (DateTime) zVar.d(ub2.s.f169890b).b(fVar, zVar);
            } else if (iS1 == 2) {
                numB = vh.c.f178276k.b(fVar, zVar);
            } else {
                if (iS1 != 3) {
                    dateTime.getClass();
                    dateTime2.getClass();
                    return new pb2.e.b0(dateTime, dateTime2, numB, objB);
                }
                objB = vh.c.f178278m.b(fVar, zVar);
            }
        }
    }
}
