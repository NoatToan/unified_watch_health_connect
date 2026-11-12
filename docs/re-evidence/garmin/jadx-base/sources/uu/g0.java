package uu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.ConnectionsWithBadgesFragment$fetchConnectionsWithBadge$1$2", f = "ConnectionsWithBadgesFragment.kt", l = {87, 94}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f172702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.redesign.h f172703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<String> f172704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0<ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.p>> f172705d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.ConnectionsWithBadgesFragment$fetchConnectionsWithBadge$1$2$2", f = "ConnectionsWithBadgesFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.badges.redesign.h f172706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0<ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.p>> f172707b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.badges.redesign.h hVar, r0<ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.p>> r0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f172706a = hVar;
            this.f172707b = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f172706a, this.f172707b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            com.garmin.android.apps.connectmobile.badges.redesign.h hVar = this.f172706a;
            com.garmin.android.apps.connectmobile.badges.redesign.f fVar = hVar.f30489o;
            r0<ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.p>> r0Var = this.f172707b;
            if (fVar != null) {
                ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.p> arrayList = r0Var.f105810a;
                arrayList.getClass();
                com.garmin.android.apps.connectmobile.badges.redesign.g.b bVar = fVar.f30465d.f30481b;
                bVar.getClass();
                bVar.f30484a.addAll(arrayList);
                com.garmin.android.apps.connectmobile.badges.redesign.g.this.g();
            }
            hVar.X6(r0Var.f105810a.size());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.garmin.android.apps.connectmobile.badges.redesign.h hVar, List<String> list, r0<ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.p>> r0Var, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f172703b = hVar;
        this.f172704c = list;
        this.f172705d = r0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g0(this.f172703b, this.f172704c, this.f172705d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        if (ge1.b.e0(r11, r4, r10) == r0) goto L29;
     */
    /* JADX WARN: Type inference failed for: r11v5, types: [T, java.util.ArrayList] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f172702a;
        com.garmin.android.apps.connectmobile.badges.redesign.h hVar = this.f172703b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        a22.i iVar = hVar.f30490p;
        List<? extends com.garmin.android.apps.connectmobile.userprofile.model.k> listC = p13.w.c(com.garmin.android.apps.connectmobile.userprofile.model.k.PREMIUM_FRIEND);
        this.f172702a = 1;
        obj = iVar.a(this.f172704c, listC, this);
        if (obj != aVar) {
        }
        return aVar;
        Map map = (Map) obj;
        r0<ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.p>> r0Var = this.f172705d;
        ArrayList<com.garmin.android.apps.connectmobile.badges.service.model.p> arrayList = r0Var.f105810a;
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        for (com.garmin.android.apps.connectmobile.badges.service.model.p pVar : arrayList) {
            Long userProfileId = pVar.getUserProfileId();
            com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) map.get(userProfileId != null ? new Integer((int) userProfileId.longValue()) : null);
            arrayList2.add(com.garmin.android.apps.connectmobile.badges.service.model.p.b(pVar, (lVar == null || (profileImageUrls = lVar.getProfileImageUrls()) == null) ? null : profileImageUrls.f46879h, null, 247));
        }
        r0Var.f105810a = new ArrayList(arrayList2);
        x53.c cVar = s0.f129406a;
        t1 t1Var = u53.o.f168762a;
        a aVar2 = new a(hVar, r0Var, null);
        this.f172702a = 2;
    }
}
