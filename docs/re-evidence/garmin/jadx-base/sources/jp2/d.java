package jp2;

import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import e23.p;
import o13.r;
import o53.b0;
import o53.f0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity$tryDeleteCreditCard$1", f = "FitPayCardVerificationActivity.kt", l = {236}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FitPayCardVerificationActivity f99923b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity$tryDeleteCreditCard$1$isSuccessful$1", f = "FitPayCardVerificationActivity.kt", l = {237}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f99924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FitPayCardVerificationActivity f99925b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FitPayCardVerificationActivity fitPayCardVerificationActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f99925b = fitPayCardVerificationActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f99925b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f99924a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2 = this.f99925b.f51455l;
            if (aVar2 == null) {
                s.m("viewModel");
                throw null;
            }
            this.f99924a = 1;
            String link = aVar2.y4().getCreditCardLink().getLink();
            Object objP = link == null ? Boolean.FALSE : aVar2.A4().f205979a.p(link, this);
            return objP == aVar ? aVar : objP;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FitPayCardVerificationActivity fitPayCardVerificationActivity, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f99923b = fitPayCardVerificationActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f99923b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f99922a;
        FitPayCardVerificationActivity fitPayCardVerificationActivity = this.f99923b;
        if (i14 == 0) {
            r.b(obj);
            FitPayCardVerificationActivity.b bVar = FitPayCardVerificationActivity.f51449m;
            fitPayCardVerificationActivity.ca().debug("tryDeleteCreditCard");
            hn2.c.ba(fitPayCardVerificationActivity, Boolean.TRUE, null, null, 14);
            t13.g gVarPlus = f0.w(fitPayCardVerificationActivity).f7937b.plus(s0.f129406a);
            a aVar2 = new a(fitPayCardVerificationActivity, null);
            this.f99922a = 1;
            obj = ge1.b.e0(gVarPlus, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            FitPayCardVerificationActivity.b bVar2 = FitPayCardVerificationActivity.f51449m;
            Logger loggerCa = fitPayCardVerificationActivity.ca();
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar3 = fitPayCardVerificationActivity.f51455l;
            if (aVar3 == null) {
                s.m("viewModel");
                throw null;
            }
            loggerCa.debug("tryDeleteCreditCard: creditCard: " + aVar3.y4().getCreditCardId() + " removed successfully, navigating to wallet view.");
            fitPayCardVerificationActivity.ca().debug("onCardVerificationFailed");
            fitPayCardVerificationActivity.da();
        } else {
            FitPayCardVerificationActivity.b bVar3 = FitPayCardVerificationActivity.f51449m;
            Logger loggerCa2 = fitPayCardVerificationActivity.ca();
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar4 = fitPayCardVerificationActivity.f51455l;
            if (aVar4 == null) {
                s.m("viewModel");
                throw null;
            }
            loggerCa2.error("tryDeleteCreditCard: failed to delete creditCard: " + aVar4.y4().getCreditCardId());
            fitPayCardVerificationActivity.fa(true);
        }
        return Unit.INSTANCE;
    }
}
