package com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions;

import androidx.lifecycle.y0;
import e23.p;
import fo2.l;
import java.util.List;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerTermsConditionViewModel$fetchTermsConditionInfo$1", f = "FitPayIssuerTermsConditionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f51644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f51645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yo2.b f51646c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/issuertermsconditions/d$a", "Lj13/a;", "Lfo2/l;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends j13.a<l> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f51647b;

        public a(b bVar) {
            this.f51647b = bVar;
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            th3.getClass();
            b.f51610n.error("fetchTermsConditionInfo: failed to get TermsCondition info, ", th3);
            this.f51647b.f51613c.j(b.EnumC1070b.FAILED_TO_RETRIEVE_TERMS_AND_CONDITIONS);
        }

        @Override // q03.t
        public final void onSuccess(Object obj) {
            l.b bVar;
            List<l.c> listB;
            l lVar = (l) obj;
            lVar.getClass();
            b.f51610n.debug("fetchTermsConditionInfo: " + lVar);
            y0<Boolean> y0Var = this.f51647b.f51614d;
            l.d templates = lVar.getTemplates();
            y0Var.j(Boolean.valueOf((templates == null || (bVar = templates.getDefault()) == null || (listB = bVar.b()) == null || listB.size() <= 0) ? false : true));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, yo2.b bVar2, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f51645b = bVar;
        this.f51646c = bVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f51645b, this.f51646c, dVar);
        dVar2.f51644a = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        b.f51610n.debug("fetchTermsConditionInfo");
        b bVar2 = this.f51645b;
        y0<yo2.b> y0Var = bVar2.f51617g;
        yo2.b bVar3 = this.f51646c;
        y0Var.j(bVar3);
        String link = bVar3.getAcceptTermsLink().getLink();
        if (link != null) {
            try {
                int i14 = q.f128596b;
                bVar = b.x4(bVar2, link);
            } catch (Throwable th3) {
                int i15 = q.f128596b;
                bVar = new q.b(th3);
            }
            if (bVar instanceof q.b) {
                bVar = null;
            }
            q03.r rVar = (q03.r) bVar;
            if (rVar != null) {
                rVar.j(l13.a.f108327b).g(r03.a.a()).a(new a(bVar2));
            }
        }
        return Unit.INSTANCE;
    }
}
