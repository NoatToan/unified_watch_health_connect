package com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions;

import androidx.lifecycle.v1;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerTermsConditionViewModel$onUserAcceptTermsCondition$1", f = "FitPayIssuerTermsConditionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f51648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f51649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dp2.a f51650c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, dp2.a aVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f51649b = bVar;
        this.f51650c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f51649b, this.f51650c, dVar);
        eVar.f51648a = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        fo2.p acceptTermsLink;
        String link;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        Logger logger = b.f51610n;
        logger.debug("onUserAcceptTermsCondition");
        b bVar = this.f51649b;
        yo2.b bVarD = bVar.f51617g.d();
        if (bVarD != null && (acceptTermsLink = bVarD.getAcceptTermsLink()) != null && (link = acceptTermsLink.getLink()) != null) {
            ge1.b.T(v1.a(bVar), s0.f129406a, null, new c(bVar, link, this.f51650c, null), 2);
            return Unit.INSTANCE;
        }
        logger.error("onUserAcceptTermsCondition: accept link is missing can not accept card");
        bVar.f51613c.j(b.EnumC1070b.FAILED_TO_ACCEPT_TERMS);
        return Unit.INSTANCE;
    }
}
