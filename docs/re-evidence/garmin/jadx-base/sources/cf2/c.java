package cf2;

import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcf2/c;", "Lcf2/l;", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f27033j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.library.promotionlibrary.data.AnalyticsOperation$updateActionStatus$1", f = "AnalyticsOperation.kt", l = {34}, m = "executeBackgroundWork", v = 2)
    public static final class a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f27034a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27036c;

        public a(t13.d<? super a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f27034a = obj;
            this.f27036c |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(bVar);
        this.f27033j = bVar;
        bVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // cf2.l
    public final Object d(t13.d<? super com.garmin.android.library.backgroundtaskmanagement.b.c> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i14 = aVar.f27036c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f27036c = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objB4 = aVar.f27034a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = aVar.f27036c;
        b bVar = this.f27033j;
        if (i15 == 0) {
            o13.r.b(objB4);
            ((Logger) bVar.f27027o.getValue()).debug(v.h.u(bVar.f27026n, "Reporting action for campaign ", ": ", bVar.f27025m.name()));
            aVar.f27036c = 1;
            objB4 = g.b4(new cf2.a(bVar, null), aVar);
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
        if (pVar instanceof p.b) {
            ((Logger) bVar.f27027o.getValue()).debug("Status reported successfully");
            return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        }
        if (!(pVar instanceof p.a)) {
            u0.r();
            return null;
        }
        ((Logger) bVar.f27027o.getValue()).error("Status failed to report with exception: " + ((p.a) pVar).f27075a);
        return com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA;
    }
}
