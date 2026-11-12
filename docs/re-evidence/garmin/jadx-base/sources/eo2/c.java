package eo2;

import ap2.h;
import com.garmin.feature.garminpay.providers.gpay.ecom.EcomMainActivity;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.providers.gpay.ecom.EcomMainActivity$navigateWalletWithCardRefresh$1", f = "EcomMainActivity.kt", l = {142}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EcomMainActivity f64791b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.feature.garminpay.providers.gpay.ecom.EcomMainActivity$navigateWalletWithCardRefresh$1$1", f = "EcomMainActivity.kt", l = {143}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f64792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EcomMainActivity f64793b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EcomMainActivity ecomMainActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f64793b = ecomMainActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f64793b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f64792a;
            if (i14 == 0) {
                r.b(obj);
                EcomMainActivity.a aVar2 = EcomMainActivity.f51133k;
                h hVar = (h) this.f64793b.f51137i.getValue();
                this.f64792a = 1;
                if (hVar.G4(this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EcomMainActivity ecomMainActivity, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f64791b = ecomMainActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f64791b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64790a;
        EcomMainActivity ecomMainActivity = this.f64791b;
        try {
            if (i14 == 0) {
                r.b(obj);
                hn2.c.ba(ecomMainActivity, Boolean.TRUE, null, null, 14);
                x53.c cVar = s0.f129406a;
                a aVar2 = new a(ecomMainActivity, null);
                this.f64790a = 1;
                if (ge1.b.e0(cVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            EcomMainActivity.f51134l.error("finishWithCancellation:", (Throwable) e4);
        }
        hn2.c.U9(ecomMainActivity, ecomMainActivity, null, 10);
        return Unit.INSTANCE;
    }
}
