package tb2;

import com.mapbox.maps.MapboxMap;
import java.util.List;
import p005kotlin.Metadata;
import p13.x;
import ub2.f0;
import vh.a0;
import vh.o;
import vh.q;
import vh.w;
import vh.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltb2/d;", "", "<init>", "()V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f163764a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<w> f163765b;

    static {
        f0.a aVar = f0.f169829a;
        aVar.getClass();
        a0 a0Var = f0.f169830b;
        q.a aVar2 = new q.a("adhocChallengesScalar", a0Var);
        aVar2.f178380e = p13.w.c(new o.a(MapboxMap.QFE_LIMIT, new y(MapboxMap.QFE_LIMIT)).a());
        q qVarC = aVar2.c();
        aVar.getClass();
        q.a aVar3 = new q.a("badgeChallengesScalar", a0Var);
        aVar3.f178380e = p13.w.c(new o.a(MapboxMap.QFE_LIMIT, new y(MapboxMap.QFE_LIMIT)).a());
        q qVarC2 = aVar3.c();
        aVar.getClass();
        q qVarC3 = new q.a("expeditionsChallengesScalar", a0Var).c();
        aVar.getClass();
        f163765b = x.k(qVarC, qVarC2, qVarC3, new q.a("adhocChallengePendingInviteScalar", a0Var).c());
    }

    private d() {
    }
}
