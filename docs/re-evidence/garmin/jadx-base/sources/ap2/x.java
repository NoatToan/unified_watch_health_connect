package ap2;

import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import java.util.concurrent.atomic.AtomicReference;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.g1;
import zn2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$startCreditCardPollJob$2", f = "FitPayAddCardViewModel.kt", l = {686}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f11796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11797c;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$startCreditCardPollJob$2$1", f = "FitPayAddCardViewModel.kt", l = {688}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AtomicReference f11798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f11800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f11801d;

        /* JADX INFO: renamed from: ap2.x$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0168a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11802a;

            static {
                int[] iArr = new int[z.values().length];
                try {
                    iArr[z.NOT_FOUND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f11802a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, String str, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f11800c = hVar;
            this.f11801d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f11800c, this.f11801d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            AtomicReference atomicReference;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f11799b;
            h hVar = this.f11800c;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    AtomicReference<yo2.b> atomicReference2 = hVar.f11707k;
                    g1 g1Var = hVar.E4().f205979a;
                    fo2.p pVar = new fo2.p(this.f11801d, false);
                    fo2.s sVar = hVar.f11703g;
                    this.f11798a = atomicReference2;
                    this.f11799b = 1;
                    Object objZ = g1Var.z(pVar, sVar, false, this);
                    if (objZ == aVar) {
                        return aVar;
                    }
                    atomicReference = atomicReference2;
                    obj = objZ;
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    atomicReference = this.f11798a;
                    o13.r.b(obj);
                }
                atomicReference.set(obj);
                yo2.b bVar = hVar.f11707k.get();
                bVar.getClass();
                h.A4(hVar, bVar);
            } catch (Exception e4) {
                if (e4 instanceof NewFitPayException) {
                    if (C0168a.f11802a[((NewFitPayException) e4).getErrorFlag().ordinal()] == 1) {
                        h.a.a(h.f11695y).debug("startCreditCardPollJob: card is not available on the cloud");
                    } else {
                        h.a.a(h.f11695y).error("startCreditCardPollJob: ");
                        hVar.f11706j.j(gp2.f.CARD_CREATED_BUT_CAN_NOT_PROCEED_FURTHER);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardViewModel$startCreditCardPollJob$2$2", f = "FitPayAddCardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f11803a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, t13.d<? super b> dVar) {
            super(1, dVar);
            this.f11803a = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new b(this.f11803a, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            h.a.a(h.f11695y).error("startCreditCardPollJob: polling timed out, notifying the listener");
            this.f11803a.f11706j.j(gp2.f.CREATE_CREDIT_CARD_REQUEST_TIMED_OUT);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(h hVar, String str, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f11796b = hVar;
        this.f11797c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f11796b, this.f11797c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11795a;
        if (i14 == 0) {
            o13.r.b(obj);
            h.a.a(h.f11695y).debug("startCreditCardPollJob");
            String str = this.f11797c;
            h hVar = this.f11796b;
            a aVar2 = new a(hVar, str, null);
            b bVar = new b(hVar, null);
            this.f11795a = 1;
            if (jg.b.s(1500L, 5000L, 2.0d, 180000L, aVar2, bVar, this) == aVar) {
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
