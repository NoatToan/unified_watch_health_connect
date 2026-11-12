package com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions;

import ch.qos.logback.classic.Logger;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;
import vb.h;
import zn2.g1;
import zn2.t;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerTermsConditionViewModel$startCreditCardPolling$2", f = "FitPayIssuerTermsConditionViewModel.kt", l = {239}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b f51652b;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerTermsConditionViewModel$startCreditCardPolling$2$1", f = "FitPayIssuerTermsConditionViewModel.kt", l = {PsExtractor.VIDEO_STREAM_MASK}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b f51654b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f51654b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f51654b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws NewFitPayException {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51653a;
            com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar = this.f51654b;
            if (i14 == 0) {
                r.b(obj);
                g1 g1Var = bVar.A4().f205979a;
                String str = bVar.f51612b;
                if (str == null) {
                    s.m("creditCardId");
                    throw null;
                }
                t tVar = bVar.f51611a;
                if (tVar == null) {
                    s.m("deviceServiceProvider");
                    throw null;
                }
                fo2.s sVar = tVar.f205819e.f205629a;
                this.f51653a = 1;
                Logger logger = g1.f205525n;
                obj = g1Var.A(str, sVar, false, this);
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
            yo2.b bVar2 = (yo2.b) obj;
            bVar.f51617g.j(bVar2);
            String cardState = bVar2.getCardState();
            org.slf4j.Logger logger2 = com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n;
            if (s.g(cardState, "ELIGIBLE")) {
                logger2.warn("handleCreditCardState: card is still in eligible state, continue  polling");
            } else {
                com.airbnb.lottie.animation.keyframe.a.u("handleCreditCardState: card state changes to ", cardState, ", notifying listener", logger2);
                bVar.f51613c.j(com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.CARD_PROVISION_COMPLETE);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerTermsConditionViewModel$startCreditCardPolling$2$2", f = "FitPayIssuerTermsConditionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b f51655a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar, t13.d<? super b> dVar) {
            super(1, dVar);
            this.f51655a = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new b(this.f51655a, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n.error("handleAcceptTermsSuccess: creditCard polling time out");
            this.f51655a.f51613c.j(com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.CARD_PROVISION_TIMEOUT);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f51652b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f51652b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f51651a;
        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar = this.f51652b;
        try {
            if (i14 == 0) {
                r.b(obj);
                com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n.debug("startCreditCardPolling");
                a aVar2 = new a(bVar, null);
                b bVar2 = new b(bVar, null);
                this.f51651a = 1;
                if (jg.b.s(1500L, 5000L, 2.0d, 120000L, aVar2, bVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.f51610n.error("startCreditCardPolling: error getting credit card ", (Throwable) e4);
            bVar.f51613c.j(com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.FAILED_TO_RETRIEVE_CARD);
        }
        return Unit.INSTANCE;
    }
}
