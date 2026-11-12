package po2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.TransitCardOperationFlowBuilder$onTransitCardEvent$1", f = "TransitCardOperationFlowBuilder.kt", l = {83, 87, 91, 95, 99, 103, 107, 111, 115, 122}, m = "invokeSuspend", v = 2)
public final class u0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f139389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ to2.h f139390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0<Object> f139391c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139392a;

        static {
            int[] iArr = new int[to2.c.values().length];
            try {
                iArr[to2.c.PURCHASE_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[to2.c.PURCHASE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[to2.c.CREDENTIAL_CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[to2.c.CREDENTIAL_ACTIVATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[to2.c.CREDENTIAL_DELETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[to2.c.CREDENTIAL_DELETE_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[to2.c.CREDENTIAL_UPDATE_SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[to2.c.CREDENTIAL_UPDATE_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[to2.c.JOB_STATUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f139392a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(to2.h hVar, k0<Object> k0Var, t13.d<? super u0> dVar) {
        super(2, dVar);
        this.f139390b = hVar;
        this.f139391c = k0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u0(this.f139390b, this.f139391c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
    
        if (r4.o(true, r0, r6) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        if (r4.b(r6, r7) == r2) goto L49;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        to2.h hVar = this.f139390b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f139389a;
        k0<Object> k0Var = this.f139391c;
        try {
            switch (i14) {
                case 0:
                    o13.r.b(obj);
                    to2.c sseEventsTypes = hVar.getSseEventsTypes();
                    switch (sseEventsTypes == null ? -1 : a.f139392a[sseEventsTypes.ordinal()]) {
                        case 1:
                            k0.a aVar2 = k0.f139256j;
                            k0Var.r();
                            this.f139389a = 1;
                            break;
                        case 2:
                            k0.a aVar3 = k0.f139256j;
                            k0Var.r();
                            this.f139389a = 2;
                            if (k0Var.o(false, hVar, this) == aVar) {
                                return aVar;
                            }
                            return Unit.INSTANCE;
                        case 3:
                            k0.a aVar4 = k0.f139256j;
                            k0Var.r();
                            this.f139389a = 3;
                            if (k0Var.i(hVar, this) == aVar) {
                                return aVar;
                            }
                            return Unit.INSTANCE;
                        case 4:
                            k0.a aVar5 = k0.f139256j;
                            k0Var.r();
                            this.f139389a = 4;
                            if (k0Var.h(hVar, this) == aVar) {
                                return aVar;
                            }
                            return Unit.INSTANCE;
                        case 5:
                            k0.a aVar6 = k0.f139256j;
                            k0Var.r();
                            this.f139389a = 5;
                            if (k0Var.j(true, hVar, this) == aVar) {
                                return aVar;
                            }
                            return Unit.INSTANCE;
                        case 6:
                            k0.a aVar7 = k0.f139256j;
                            k0Var.r();
                            this.f139389a = 6;
                            if (k0Var.j(false, hVar, this) == aVar) {
                                return aVar;
                            }
                            return Unit.INSTANCE;
                        case 7:
                            k0.a aVar8 = k0.f139256j;
                            k0Var.r();
                            this.f139389a = 7;
                            if (k0Var.k(true, hVar, this) == aVar) {
                                return aVar;
                            }
                            return Unit.INSTANCE;
                        case 8:
                            k0.a aVar9 = k0.f139256j;
                            k0Var.r();
                            this.f139389a = 8;
                            if (k0Var.k(false, hVar, this) == aVar) {
                                return aVar;
                            }
                            return Unit.INSTANCE;
                        case 9:
                            k0.a aVar10 = k0.f139256j;
                            k0Var.r();
                            this.f139389a = 9;
                            if (k0Var.m(hVar, this) == aVar) {
                                return aVar;
                            }
                            return Unit.INSTANCE;
                        default:
                            throw new ns2.d("Unhandled event in transit card provision, throw for " + hVar);
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                case 10:
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                default:
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th3) {
            k0.f139257k.error("onTransitEvent stops for unhandled exception", th3);
            this.f139389a = 10;
        }
    }
}
