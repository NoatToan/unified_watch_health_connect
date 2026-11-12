package qt0;

import com.garmin.android.apps.connectmobile.userprofile.model.j;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.userprofile.model.l;
import e23.p;
import java.util.List;
import java.util.Map;
import mt0.p3;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q6.f;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.leaderboard.connections.ConnectionsLeaderboardBaseFragment$fetchDataInternal$1$1", f = "ConnectionsLeaderboardBaseFragment.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.connections.model.c> f147482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f147483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f147484d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "<anonymous>", "(Lo53/b0;)Ljava/util/Map;"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.leaderboard.connections.ConnectionsLeaderboardBaseFragment$fetchDataInternal$1$1$profileInfoMap$1", f = "ConnectionsLeaderboardBaseFragment.kt", l = {105}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Map<Integer, ? extends l>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f147485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f147486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f147487c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, List<Integer> list, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f147486b = cVar;
            this.f147487c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f147486b, this.f147487c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Map<Integer, ? extends l>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f147485a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            p3 p3Var = (p3) this.f147486b.f147466x.getValue();
            this.f147485a = 1;
            Object objX4 = p3Var.x4(this.f147487c, k.f46891k, this);
            return objX4 == aVar ? aVar : objX4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends com.garmin.android.apps.connectmobile.connections.model.c> list, c cVar, List<Integer> list2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f147482b = list;
        this.f147483c = cVar;
        this.f147484d = list2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f147482b, this.f147483c, this.f147484d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147481a;
        c cVar = this.f147483c;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(cVar, this.f147484d, null);
            this.f147481a = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        Map map = (Map) obj;
        for (com.garmin.android.apps.connectmobile.connections.model.c cVar3 : this.f147482b) {
            l lVar = (l) f.l((int) cVar3.f31695a, map);
            if (lVar != null) {
                j profileImageUrls = lVar.getProfileImageUrls();
                cVar3.f31701g = new b12.b(profileImageUrls != null ? profileImageUrls.f46879h : null, null, null, null, null, 30, null);
            }
        }
        cVar.c7();
        cVar.d7();
        return Unit.INSTANCE;
    }
}
