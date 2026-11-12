package cf2;

import com.google.gson.Gson;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcf2/i;", "Lcf2/l;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f27043j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.library.promotionlibrary.data.CampaignValidOperation$checkValidity$1", f = "CampaignValidOperation.kt", l = {31}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f27044a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27046c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f27044a = obj;
            this.f27046c |= Integer.MIN_VALUE;
            return i.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar) {
        super(kVar);
        this.f27043j = kVar;
        kVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // cf2.l
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f27046c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f27046c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objB4 = aVar.f27044a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f27046c;
        k kVar = this.f27043j;
        if (i15 == 0) {
            o13.r.b(objB4);
            kVar.m().debug("executeTask: ");
            aVar.f27046c = 1;
            objB4 = g.b4(new j(kVar, null), aVar);
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
            kVar.m().debug("executeTask: Received " + ((p.a) pVar).f27076b + " error for campaign " + kVar.f27051n);
            e23.p<ff2.a, kf2.d, Unit> pVar2 = kVar.f27052o;
            if (pVar2 != null) {
                pVar2.invoke(null, kf2.d.INTERNAL_ERROR);
            }
            return com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK;
        }
        p.b bVar = (p.b) pVar;
        int i16 = bVar.f27079b;
        kf2.d dVar2 = kf2.d.SUCCESS;
        if (i16 == dVar2.f104671a) {
            kVar.m().debug("executeTask: Received successful response, code SUCCESS : ");
            ff2.a aVar3 = (ff2.a) new Gson().fromJson((String) bVar.f27078a, ff2.a.class);
            e23.p<ff2.a, kf2.d, Unit> pVar3 = kVar.f27052o;
            if (pVar3 != null) {
                pVar3.invoke(aVar3, dVar2);
            }
            kVar.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, aVar3);
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        kf2.d dVar3 = kf2.d.NO_OFFERS;
        if (i16 == dVar3.f104671a) {
            wr.g.w("executeTask: Received NO_OFFERS for campaign ", kVar.f27051n, kVar.m());
            e23.p<ff2.a, kf2.d, Unit> pVar4 = kVar.f27052o;
            if (pVar4 != null) {
                pVar4.invoke(null, dVar3);
            }
            return com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA;
        }
        kf2.d dVar4 = kf2.d.KILL_SWITCH_ACTIVATED;
        if (i16 == dVar4.f104671a) {
            wr.g.w("executeTask: Received KILL_SWITCH_ACTIVATED for campaign ", kVar.f27051n, kVar.m());
            e23.p<ff2.a, kf2.d, Unit> pVar5 = kVar.f27052o;
            if (pVar5 != null) {
                pVar5.invoke(null, dVar4);
            }
            return com.garmin.android.library.backgroundtaskmanagement.b.c.RECOVERABLE;
        }
        kVar.m().debug("executeTask: Received " + i16 + " error for campaign " + kVar.f27051n);
        e23.p<ff2.a, kf2.d, Unit> pVar6 = kVar.f27052o;
        if (pVar6 != null) {
            pVar6.invoke(null, kf2.d.INTERNAL_ERROR);
        }
        return com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK;
    }
}
