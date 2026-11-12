package cf2;

import com.google.gson.Gson;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcf2/n;", "Lcf2/l;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f27064j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.library.promotionlibrary.data.FetchCampaignsOperation$fetchCampaigns$1", f = "FetchCampaignsOperation.kt", l = {29}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f27065a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27067c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f27065a = obj;
            this.f27067c |= Integer.MIN_VALUE;
            return n.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar) {
        super(oVar);
        this.f27064j = oVar;
        oVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // cf2.l
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f27067c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f27067c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objB4 = aVar.f27065a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f27067c;
        o oVar = this.f27064j;
        if (i15 == 0) {
            o13.r.b(objB4);
            oVar.m().debug("executeTask: ");
            aVar.f27067c = 1;
            objB4 = g.b4(new m(oVar, null), aVar);
            if (objB4 == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB4);
        }
        p pVar = (p) objB4;
        if (!(pVar instanceof p.b)) {
            if (!(pVar instanceof p.a)) {
                u0.r();
                return null;
            }
            oVar.m().error("executeTask: Received unsuccessful response, code " + ((p.a) pVar).f27076b + ":");
            return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
        }
        p.b bVar = (p.b) pVar;
        int i16 = bVar.f27079b;
        if (i16 == kf2.d.SUCCESS.f104671a) {
            oVar.m().debug("executeTask: Received successful response, code 200:");
            oVar.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, (ff2.f) new Gson().fromJson((String) bVar.f27078a, ff2.f.class));
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (i16 == kf2.d.NO_OFFERS.f104671a) {
            oVar.m().debug("executeTask: Received successful response, code 204:");
            return com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA;
        }
        oVar.m().error("executeTask: Received unsuccessful response, code " + i16 + ":");
        return com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE;
    }
}
