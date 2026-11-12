package vr2;

import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.PaymentCardDetailsViewModel$refreshData$1", f = "PaymentCardDetailsViewModel.kt", l = {241}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f179651b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.ui.userwallet.viewmodels.PaymentCardDetailsViewModel$refreshData$1$1", f = "PaymentCardDetailsViewModel.kt", l = {242}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f179652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f179653b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f179653b = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f179653b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f179652a;
            if (i14 == 0) {
                o13.r.b(obj);
                g1 g1Var = this.f179653b.f179607j;
                if (g1Var == null) {
                    return null;
                }
                this.f179652a = 1;
                if (g1.g0(g1Var, null, this, 7) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(i iVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f179651b = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f179651b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179650a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                x53.c cVar = s0.f129406a;
                a aVar2 = new a(this.f179651b, null);
                this.f179650a = 1;
                obj = ge1.b.e0(cVar, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (Exception e4) {
            i.C.error("finishWithCancellation:", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
