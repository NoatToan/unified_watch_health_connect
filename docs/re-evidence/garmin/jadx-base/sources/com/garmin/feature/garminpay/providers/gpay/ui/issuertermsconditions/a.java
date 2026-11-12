package com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions;

import android.content.ComponentName;
import android.content.Intent;
import com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import e23.p;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerBankTermsConditionActivity$launchCardVerificationScreen$1", f = "FitPayIssuerBankTermsConditionActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FitPayIssuerBankTermsConditionActivity f51609a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FitPayIssuerBankTermsConditionActivity fitPayIssuerBankTermsConditionActivity, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f51609a = fitPayIssuerBankTermsConditionActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f51609a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:20:0x008e  */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x008e, please report this as an issue */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Long l14;
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        FitPayIssuerBankTermsConditionActivity.a aVar2 = FitPayIssuerBankTermsConditionActivity.f51592t;
        Logger loggerA = FitPayIssuerBankTermsConditionActivity.a.a(aVar2);
        FitPayIssuerBankTermsConditionActivity fitPayIssuerBankTermsConditionActivity = this.f51609a;
        ComponentName callingActivity = fitPayIssuerBankTermsConditionActivity.getCallingActivity();
        Unit unit = null;
        com.airbnb.lottie.animation.keyframe.a.w("launchCardVerificationScreen: For ", callingActivity != null ? callingActivity.getClassName() : null, loggerA);
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
        if (s.g(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51192c.get(), Boolean.TRUE)) {
            ComponentName callingActivity2 = fitPayIssuerBankTermsConditionActivity.getCallingActivity();
            if (s.g(callingActivity2 != null ? callingActivity2.getClassName() : null, PushProvMainActivity.class.getName())) {
                Intent intent = new Intent();
                intent.putExtra("EXTRA_DEVICE_ID", fitPayIssuerBankTermsConditionActivity.f51594g);
                intent.putExtra("EXTRA_CREDIT_CARD_ID", fitPayIssuerBankTermsConditionActivity.f51595h);
                fitPayIssuerBankTermsConditionActivity.setResult(14, intent);
                fitPayIssuerBankTermsConditionActivity.finish();
            } else {
                l14 = fitPayIssuerBankTermsConditionActivity.f51594g;
                str = fitPayIssuerBankTermsConditionActivity.f51595h;
                if (l14 != null) {
                    long jLongValue = l14.longValue();
                    FitPayCardVerificationActivity.b bVar = FitPayCardVerificationActivity.f51449m;
                    Long l15 = new Long(jLongValue);
                    boolean z14 = fitPayIssuerBankTermsConditionActivity.f51597j;
                    gp2.e eVar = fitPayIssuerBankTermsConditionActivity.f51600m;
                    bVar.getClass();
                    fitPayIssuerBankTermsConditionActivity.startActivity(FitPayCardVerificationActivity.b.a(l15, str, z14, eVar));
                    fitPayIssuerBankTermsConditionActivity.finish();
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    FitPayIssuerBankTermsConditionActivity.a.a(aVar2).error("launchCardVerificationScreen: deviceId or creditCard is null (" + fitPayIssuerBankTermsConditionActivity.f51594g + ", " + fitPayIssuerBankTermsConditionActivity.f51595h + ")");
                    fitPayIssuerBankTermsConditionActivity.fa();
                }
            }
        } else {
            l14 = fitPayIssuerBankTermsConditionActivity.f51594g;
            str = fitPayIssuerBankTermsConditionActivity.f51595h;
            if (l14 != null && str != null) {
                long jLongValue2 = l14.longValue();
                FitPayCardVerificationActivity.b bVar2 = FitPayCardVerificationActivity.f51449m;
                Long l16 = new Long(jLongValue2);
                boolean z15 = fitPayIssuerBankTermsConditionActivity.f51597j;
                gp2.e eVar2 = fitPayIssuerBankTermsConditionActivity.f51600m;
                bVar2.getClass();
                fitPayIssuerBankTermsConditionActivity.startActivity(FitPayCardVerificationActivity.b.a(l16, str, z15, eVar2));
                fitPayIssuerBankTermsConditionActivity.finish();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                FitPayIssuerBankTermsConditionActivity.a.a(aVar2).error("launchCardVerificationScreen: deviceId or creditCard is null (" + fitPayIssuerBankTermsConditionActivity.f51594g + ", " + fitPayIssuerBankTermsConditionActivity.f51595h + ")");
                fitPayIssuerBankTermsConditionActivity.fa();
            }
        }
        return Unit.INSTANCE;
    }
}
