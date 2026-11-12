package qb2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lqb2/n;", "Lvh/a;", "Lpb2/d$b;", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n implements vh.a<pb2.d.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f144242a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f144243b = p13.x.k("adhocChallengesScalar", "badgeChallengesScalar", "expeditionsChallengesScalar", "adhocChallengePendingInviteScalar");

    private n() {
    }

    @Override // vh.a
    public final void a(zh.g gVar, vh.z zVar, pb2.d.b bVar) {
        pb2.d.b bVar2 = bVar;
        gVar.getClass();
        zVar.getClass();
        bVar2.getClass();
        gVar.v1("adhocChallengesScalar");
        vh.k0<Object> k0Var = vh.c.f178278m;
        k0Var.a(gVar, zVar, bVar2.f136931a);
        gVar.v1("badgeChallengesScalar");
        k0Var.a(gVar, zVar, bVar2.f136932b);
        gVar.v1("expeditionsChallengesScalar");
        k0Var.a(gVar, zVar, bVar2.f136933c);
        gVar.v1("adhocChallengePendingInviteScalar");
        k0Var.a(gVar, zVar, bVar2.f136934d);
    }

    @Override // vh.a
    public final pb2.d.b b(zh.f fVar, vh.z zVar) {
        fVar.getClass();
        zVar.getClass();
        Object objB = null;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        while (true) {
            int iS1 = fVar.S1(f144243b);
            if (iS1 == 0) {
                objB = vh.c.f178278m.b(fVar, zVar);
            } else if (iS1 == 1) {
                objB2 = vh.c.f178278m.b(fVar, zVar);
            } else if (iS1 == 2) {
                objB3 = vh.c.f178278m.b(fVar, zVar);
            } else {
                if (iS1 != 3) {
                    return new pb2.d.b(objB, objB2, objB3, objB4);
                }
                objB4 = vh.c.f178278m.b(fVar, zVar);
            }
        }
    }
}
