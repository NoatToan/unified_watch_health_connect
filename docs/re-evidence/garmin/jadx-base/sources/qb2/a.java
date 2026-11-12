package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/a;", "Lvh/a;", "Lpb2/a$b;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements vh.a<pb2.a.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f144190a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144191b = p13.x.k("activitiesScalar", "workoutScheduleSummariesScalar", "healthSnapshotScalar", "golfScorecardScalar", "pendingActivities");

    private a() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.a.b bVar) {
        pb2.a.b bVar2 = bVar;
        gVar.getClass();
        zVar.getClass();
        bVar2.getClass();
        gVar.v1("activitiesScalar");
        vh.k0<Object> k0Var = vh.c.f178278m;
        k0Var.a(gVar, zVar, bVar2.f136887a);
        gVar.v1("workoutScheduleSummariesScalar");
        k0Var.a(gVar, zVar, bVar2.f136888b);
        gVar.v1("healthSnapshotScalar");
        k0Var.a(gVar, zVar, bVar2.f136889c);
        gVar.v1("golfScorecardScalar");
        k0Var.a(gVar, zVar, bVar2.f136890d);
        gVar.v1("pendingActivities");
        new vh.k0(vh.c.b(b.f144196a, false)).a(gVar, zVar, bVar2.f136891e);
    }

    @Override // vh.a
    public final pb2.a.b b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Object objB = null;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        pb2.a.c cVar = null;
        while (true) {
            int iS1 = fVar.S1(f144191b);
            if (iS1 == 0) {
                objB = vh.c.f178278m.b(fVar, zVar);
            } else if (iS1 == 1) {
                objB2 = vh.c.f178278m.b(fVar, zVar);
            } else if (iS1 == 2) {
                objB3 = vh.c.f178278m.b(fVar, zVar);
            } else if (iS1 == 3) {
                objB4 = vh.c.f178278m.b(fVar, zVar);
            } else {
                if (iS1 != 4) {
                    return new pb2.a.b(objB, objB2, objB3, objB4, cVar);
                }
                cVar = (pb2.a.c) q6.f.o(vh.c.b(b.f144196a, false), fVar, zVar);
            }
        }
    }
}
