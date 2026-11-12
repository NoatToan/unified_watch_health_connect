package bo2;

import android.content.Intent;
import com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.onboarding.NewDeviceOnBoardingActivity;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationActivity$navigateToDeviceOnBoarding$1", f = "AlipayAppletInstallationActivity.kt", l = {211}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlipayAppletInstallationActivity f19246b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationActivity$navigateToDeviceOnBoarding$1$1", f = "AlipayAppletInstallationActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AlipayAppletInstallationActivity f19247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sd2.f f19248b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AlipayAppletInstallationActivity alipayAppletInstallationActivity, sd2.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f19247a = alipayAppletInstallationActivity;
            this.f19248b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f19247a, this.f19248b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            NewDeviceOnBoardingActivity.a aVar2 = NewDeviceOnBoardingActivity.f51700k;
            sd2.f fVar = this.f19248b;
            long unitID = fVar.getUnitID();
            String productDisplayName = fVar.getProductDisplayName();
            productDisplayName.getClass();
            String imageURL = fVar.getImageURL();
            if (imageURL == null) {
                imageURL = "";
            }
            aVar2.getClass();
            AlipayAppletInstallationActivity alipayAppletInstallationActivity = this.f19247a;
            Intent intentA = NewDeviceOnBoardingActivity.a.a(alipayAppletInstallationActivity, unitID, productDisplayName, imageURL);
            f.c<Intent> cVar = alipayAppletInstallationActivity.f51099h;
            if (cVar != null) {
                cVar.a(intentA, null);
                return Unit.INSTANCE;
            }
            s.m("onboardingActivityResultLauncher");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AlipayAppletInstallationActivity alipayAppletInstallationActivity, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f19246b = alipayAppletInstallationActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f19246b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19245a;
        if (i14 == 0) {
            r.b(obj);
            AlipayAppletInstallationActivity.a aVar2 = AlipayAppletInstallationActivity.f51097j;
            AlipayAppletInstallationActivity alipayAppletInstallationActivity = this.f19246b;
            sd2.f fVarA4 = alipayAppletInstallationActivity.ea().A4();
            x53.c cVar = s0.f129406a;
            t1 t1Var = u53.o.f168762a;
            a aVar3 = new a(alipayAppletInstallationActivity, fVarA4, null);
            this.f19245a = 1;
            if (ge1.b.e0(t1Var, aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
