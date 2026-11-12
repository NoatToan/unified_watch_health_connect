package jp2;

import ch.qos.logback.classic.Logger;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationViewModel$reloadCreditCard$1", f = "FitPayCardVerificationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a f99941a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationViewModel$reloadCreditCard$1$1", f = "FitPayCardVerificationViewModel.kt", l = {96}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f99942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a f99943b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f99943b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f99943b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f99942a;
            com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar2 = this.f99943b;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.f51466j.debug("reloadCreditCard - start");
                    g1 g1Var = aVar2.A4().f205979a;
                    String str = aVar2.f51474h;
                    if (str == null) {
                        s.m("creditCardId");
                        throw null;
                    }
                    fo2.s sVar = aVar2.z4().f205819e.f205629a;
                    this.f99942a = 1;
                    Logger logger = g1.f205525n;
                    obj = g1Var.A(str, sVar, false, this);
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
                yo2.b bVar = (yo2.b) obj;
                aVar2.getClass();
                bVar.getClass();
                aVar2.f51473g = bVar;
                com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.f51466j.debug("reloadCreditCard - response: " + bVar);
            } catch (Exception e4) {
                com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.f51466j.error("reloadCreditCard: error getting credit card ", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f99941a = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f99941a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        ge1.b.W(t13.h.f161748a, new a(this.f99941a, null));
        return Unit.INSTANCE;
    }
}
