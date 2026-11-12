package ya0;

import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lya0/c;", "Landroidx/lifecycle/u1;", "Lq90/d$a;", "device", "Lp90/d;", "bleDevicePairUseCase", "Lp90/k;", "checkCtkdDualPairFailureUseCase", "<init>", "(Lq90/d$a;Lp90/d;Lp90/k;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q90.d.a f195404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p90.d f195405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p90.k f195406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f195407d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lq90/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.BlePairingViewModel$bleDevicePairState$2$1", f = "BlePairingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super q90.a>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f195408a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = c.this.new b(dVar);
            bVar.f195408a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super q90.a> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a2 a2Var = a2.DEVICE_SETUP;
            c cVar = c.this;
            String strN = fb1.c.n("Starting BLE pairing for device: ", cVar.f195404a.f143506b.f111521f);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "BlePairingViewModel", strN);
            cVar.f195406c.f136540b.b();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: ya0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3638c implements r53.i<q90.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f195410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f195411b;

        /* JADX INFO: renamed from: ya0.c$c$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f195412a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f195413b;

            /* JADX INFO: renamed from: ya0.c$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.BlePairingViewModel$bleDevicePairState_delegate$lambda$0$$inlined$map$1$2", f = "BlePairingViewModel.kt", l = {53, 50}, m = "emit", v = 2)
            public static final class C3639a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f195414a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f195415b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public r53.j f195417d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public q90.a.g f195418e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public int f195419f;

                public C3639a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f195414a = obj;
                    this.f195415b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, c cVar) {
                this.f195412a = jVar;
                this.f195413b = cVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
            
                if (r5.emit(r2, r0) == r1) goto L29;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // r53.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, t13.d dVar) {
                C3639a c3639a;
                Object bVar;
                int i14;
                r53.j jVar;
                r53.j jVar2;
                r53.j jVar3;
                if (dVar instanceof C3639a) {
                    c3639a = (C3639a) dVar;
                    int i15 = c3639a.f195415b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c3639a.f195415b = i15 - Integer.MIN_VALUE;
                    } else {
                        c3639a = new C3639a(dVar);
                    }
                } else {
                    c3639a = new C3639a(dVar);
                }
                Object obj2 = c3639a.f195414a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i16 = c3639a.f195415b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        i14 = c3639a.f195419f;
                        bVar = c3639a.f195418e;
                        r53.j jVar4 = c3639a.f195417d;
                        o13.r.b(obj2);
                        jVar2 = jVar4;
                    } else {
                        if (i16 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj2);
                bVar = (q90.a) obj;
                boolean z14 = bVar instanceof q90.a.g;
                i14 = 0;
                jVar = this.f195412a;
                if (z14) {
                    p90.k kVar = this.f195413b.f195406c;
                    q90.a.g gVar = (q90.a.g) bVar;
                    long j8 = gVar.f143478a;
                    String str = gVar.f143480c.f111522g;
                    c3639a.f195417d = jVar;
                    c3639a.f195418e = gVar;
                    c3639a.f195419f = 0;
                    c3639a.f195415b = 1;
                    Object objA = kVar.a(j8, str, c3639a);
                    if (objA != aVar) {
                        jVar3 = jVar;
                        obj2 = objA;
                        i14 = 0;
                        jVar2 = jVar;
                    }
                } else {
                    jVar3 = jVar;
                    c3639a.f195417d = null;
                    c3639a.f195418e = null;
                    c3639a.f195419f = i14;
                    c3639a.f195415b = 2;
                }
                jVar3 = jVar;
                return aVar;
                if (((Boolean) obj2).booleanValue()) {
                    q90.a.g gVar2 = (q90.a.g) bVar;
                    bVar = new q90.a.b(gVar2.f143478a, gVar2.f143479b, gVar2.f143480c, gVar2.f143481d);
                }
                jVar3 = jVar2;
                jVar3 = jVar;
                c3639a.f195417d = null;
                c3639a.f195418e = null;
                c3639a.f195419f = i14;
                c3639a.f195415b = 2;
            }
        }

        public C3638c(r53.i iVar, c cVar) {
            this.f195410a = iVar;
            this.f195411b = cVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super q90.a> jVar, t13.d dVar) {
            Object objCollect = this.f195410a.collect(new a(jVar, this.f195411b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public c(q90.d.a aVar, p90.d dVar, p90.k kVar) {
        aVar.getClass();
        dVar.getClass();
        kVar.getClass();
        this.f195404a = aVar;
        this.f195405b = dVar;
        this.f195406c = kVar;
        this.f195407d = o13.m.b(new xn.r(this, 14));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lya0/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
