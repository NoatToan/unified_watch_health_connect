package cf2;

import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcf2/r;", "Lcf2/l;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f27082j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.library.promotionlibrary.data.SendCampaignEmailOperation$sendCampaignEmail$1", f = "SendCampaignEmailOperation.kt", l = {27}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f27083a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27085c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f27083a = obj;
            this.f27085c |= Integer.MIN_VALUE;
            return r.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar) {
        super(sVar);
        this.f27082j = sVar;
        sVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // cf2.l
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f27085c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f27085c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objB4 = aVar.f27083a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f27085c;
        s sVar = this.f27082j;
        if (i15 == 0) {
            o13.r.b(objB4);
            ((Logger) sVar.f27090p.getValue()).debug("executeTask: ");
            aVar.f27085c = 1;
            objB4 = g.b4(new q(sVar, null), aVar);
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
            com.airbnb.lottie.animation.keyframe.a.w("Task failed: ", ((p.a) pVar).f27075a.getMessage(), (Logger) sVar.f27090p.getValue());
            e23.l<Boolean, Unit> lVar = sVar.f27089o;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
            return com.garmin.android.library.backgroundtaskmanagement.b.c.RECOVERABLE;
        }
        int i16 = ((p.b) pVar).f27079b;
        if (i16 == kf2.d.SUCCESS.f104671a) {
            ((Logger) sVar.f27090p.getValue()).debug("Task finished successfully");
            e23.l<Boolean, Unit> lVar2 = sVar.f27089o;
            if (lVar2 != null) {
                lVar2.invoke(Boolean.TRUE);
            }
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        z.i("Task failed: response code[", i16, (Logger) sVar.f27090p.getValue());
        e23.l<Boolean, Unit> lVar3 = sVar.f27089o;
        if (lVar3 != null) {
            lVar3.invoke(Boolean.FALSE);
        }
        return com.garmin.android.library.backgroundtaskmanagement.b.c.RECOVERABLE;
    }
}
