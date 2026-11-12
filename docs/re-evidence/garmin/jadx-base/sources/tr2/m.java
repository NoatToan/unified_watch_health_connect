package tr2;

import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsActivity;
import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsActivity$validateInitializationState$1", f = "PaymentCardDetailsActivity.kt", l = {249}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentCardDetailsActivity f166155b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsActivity$validateInitializationState$1$1", f = "PaymentCardDetailsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PaymentCardDetailsActivity f166156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PaymentCardDetailsActivity paymentCardDetailsActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f166156a = paymentCardDetailsActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f166156a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            PaymentCardDetailsActivity paymentCardDetailsActivity = this.f166156a;
            try {
                rd2.j jVar = rd2.f.a().f152045a;
                vr2.i iVar = paymentCardDetailsActivity.f52180h;
                if (iVar == null) {
                    p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                    throw null;
                }
                long j8 = iVar.f179600c;
                jVar.getClass();
                sd2.f fVarI = rd2.j.i(j8, null);
                if (fVarI == null) {
                    return Unit.INSTANCE;
                }
                paymentCardDetailsActivity.f52182j = fVarI;
                return Unit.INSTANCE;
            } catch (Exception e4) {
                Logger logger = PaymentCardDetailsActivity.f52178q;
                vr2.i iVar2 = paymentCardDetailsActivity.f52180h;
                if (iVar2 == null) {
                    p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                    throw null;
                }
                logger.error("validateInitializationState: can not get device record for " + iVar2.f179600c, (Throwable) e4);
                return Unit.INSTANCE;
            }
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166157a;

        static {
            int[] iArr = new int[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.values().length];
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.SETUP_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.SETUP_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.UNDER_MAINTENANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f166157a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PaymentCardDetailsActivity paymentCardDetailsActivity, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f166155b = paymentCardDetailsActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f166155b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166154a;
        PaymentCardDetailsActivity paymentCardDetailsActivity = this.f166155b;
        if (i14 == 0) {
            o13.r.b(obj);
            PaymentCardDetailsActivity.f52178q.debug("validateInitializationState");
            x53.c cVar = s0.f129406a;
            a aVar2 = new a(paymentCardDetailsActivity, null);
            this.f166154a = 1;
            if (ge1.b.e0(cVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        sd2.f fVar = paymentCardDetailsActivity.f52182j;
        o13.t tVar = paymentCardDetailsActivity.f52183k;
        if (fVar == null) {
            Logger logger = PaymentCardDetailsActivity.f52178q;
            vr2.i iVar = paymentCardDetailsActivity.f52180h;
            if (iVar == null) {
                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                throw null;
            }
            logger.error("validateInitializationState: can not get device record for " + iVar.f179600c);
            paymentCardDetailsActivity.ha();
            return Unit.INSTANCE;
        }
        vr2.i iVar2 = paymentCardDetailsActivity.f52180h;
        if (iVar2 == null) {
            p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
            throw null;
        }
        z0 z0Var = iVar2.f179606i;
        z0 z0Var2 = z0Var != null ? z0Var : null;
        if (z0Var2 == null) {
            vb.h.z("FitPayServiceProvider must not be null");
            return null;
        }
        if (z0Var2.f205983e) {
            PaymentCardDetailsActivity.ca(paymentCardDetailsActivity);
        } else {
            ((com.garmin.feature.garminpay.providers.gpay.ui.common.a) tVar.getValue()).x4();
            ((com.garmin.feature.garminpay.providers.gpay.ui.common.a) tVar.getValue()).f51575b.f(paymentCardDetailsActivity, new iz1.g(paymentCardDetailsActivity, 20));
        }
        return Unit.INSTANCE;
    }
}
