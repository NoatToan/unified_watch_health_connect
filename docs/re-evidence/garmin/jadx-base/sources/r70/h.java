package r70;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.i2;
import java.util.LinkedHashMap;
import o4.v0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.i0;
import p13.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$checkCampaign$1", f = "DashboardActivity.kt", l = {330}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f151057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DashboardActivity f151058c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo13/p;", "Lff2/a;", "Lo4/v0;", "<destruct>", "", "<anonymous>", "(Lo13/p;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity$checkCampaign$1$1", f = "DashboardActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o13.p<? extends ff2.a, ? extends v0>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f151059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b0 f151060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DashboardActivity f151061c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var, DashboardActivity dashboardActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f151060b = b0Var;
            this.f151061c = dashboardActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f151060b, this.f151061c, dVar);
            aVar.f151059a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o13.p<? extends ff2.a, ? extends v0> pVar, t13.d<? super Unit> dVar) {
            return ((a) create(pVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            o13.p pVar = (o13.p) this.f151059a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ff2.a aVar2 = (ff2.a) pVar.f128594a;
            i2.f36769a.getClass();
            i2.a.b(a2.DASHBOARD, "DashboardActivity", "[checkCampaign] campaignDTO: " + aVar2);
            if (aVar2 != null) {
                C2841a c2841a = new i0() { // from class: r70.h.a.a
                    @Override // p005kotlin.jvm.internal.i0, k23.n
                    public final Object get(Object obj2) {
                        return ((kf2.b) obj2).name();
                    }
                };
                String offerType = aVar2.getOfferType();
                kf2.b[] bVarArrValues = kf2.b.values();
                int iA = t0.a(bVarArrValues.length);
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (kf2.b bVar : bVarArrValues) {
                    linkedHashMap.put(c2841a.invoke(bVar), bVar);
                }
                kf2.b bVar2 = (kf2.b) ((Enum) linkedHashMap.get(offerType));
                if (bVar2 == kf2.b.MODAL_POPUP_TOP || bVar2 == kf2.b.MODAL_POPUP_BOTTOM) {
                    a2 a2Var = a2.DASHBOARD;
                    String strE = org.apache.commons.lang3.e.e(aVar2.getCampaignId(), "Launching campaign with ID ");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "DashboardActivity", strE);
                    DashboardActivity dashboardActivity = this.f151061c;
                    yb1.b bVarO = dashboardActivity.f33449i.o(aVar2);
                    if (bVarO != null) {
                        bVarO.show(dashboardActivity.getSupportFragmentManager(), "CAMPAIGN");
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DashboardActivity dashboardActivity, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f151058c = dashboardActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f151058c, dVar);
        hVar.f151057b = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f151057b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151056a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = DashboardActivity.f33444q;
            DashboardActivity dashboardActivity = this.f151058c;
            gf2.e eVar = dashboardActivity.na().f33548e;
            gf2.d dVar = new gf2.d(r53.s.f(new ff2.e(eVar.f77096a, true, null)), eVar);
            a aVar2 = new a(b0Var, dashboardActivity, null);
            this.f151057b = null;
            this.f151056a = 1;
            if (r53.s.k(dVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
