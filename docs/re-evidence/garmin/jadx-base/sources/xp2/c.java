package xp2;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c83.a0;
import ch.qos.logback.core.net.SyslogConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import e23.p;
import fo2.s;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import ms2.g;
import o13.r;
import o53.b0;
import o53.c2;
import o53.l1;
import o53.s0;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps2.n;
import ps2.w;
import v13.i;
import vb.h;
import wd2.h0;
import zn2.g1;
import zn2.t;
import zn2.u0;
import zn2.y;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001!B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0005J\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0005R$\u0010'\u001a\u0004\u0018\u00010 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R0\u00107\u001a\b\u0012\u0004\u0012\u00020\u0011012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0011018\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0011088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lxp2/c;", "Landroidx/lifecycle/u1;", "Lto2/b;", "Lxp2/a;", "<init>", "()V", "", "w3", "", "unitID", "Lo53/l1;", "S3", "(J)Lo53/l1;", "a2", "onCleared", "L4", "(JLt13/d;)Ljava/lang/Object;", "", "forceDelete", "updateUIOnFailure", "J4", "(JZZLt13/d;)Ljava/lang/Object;", "N4", "job", "O4", "(Lo53/l1;)V", "unitId", "M4", "(J)V", "Q4", "I4", "I", "Lzn2/z0;", "a", "Lzn2/z0;", "A1", "()Lzn2/z0;", "m1", "(Lzn2/z0;)V", "fitPayServiceProvider", "Ljava/util/concurrent/CopyOnWriteArrayList;", "b", "Ljava/util/concurrent/CopyOnWriteArrayList;", "pollJobs", "Ljava/util/concurrent/atomic/AtomicReference;", "Lfo2/s;", "c", "Ljava/util/concurrent/atomic/AtomicReference;", "currentFpDevice", "Landroidx/lifecycle/y0;", "value", "d", "Landroidx/lifecycle/y0;", "H4", "()Landroidx/lifecycle/y0;", "isDeviceAddedForCurrentUser", "Landroidx/lifecycle/z0;", JWKParameterNames.RSA_EXPONENT, "Landroidx/lifecycle/z0;", "deviceOnBoardingObserver", "f", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 implements to2.b, a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f191873g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Logger f191874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f191875i = 5000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f191876j = 30000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final double f191877k = 2.0d;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f191878l = 180000;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private z0 fitPayServiceProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<l1> pollJobs = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private AtomicReference<s> currentFpDevice = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private y0<Boolean> isDeviceAddedForCurrentUser = new y0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final androidx.lifecycle.z0<Boolean> deviceOnBoardingObserver = new h0(this, 12);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.onboarding.NewDeviceOnBoardingViewModel", f = "NewDeviceOnBoardingViewModel.kt", l = {SyslogConstants.LOG_LOCAL6}, m = "removeDeviceFromUser", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f191884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f191885b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f191887d;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f191885b = obj;
            this.f191887d |= Integer.MIN_VALUE;
            return c.this.J4(0L, false, false, this);
        }
    }

    /* JADX INFO: renamed from: xp2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.onboarding.NewDeviceOnBoardingViewModel$startDeviceOnBoarding$1", f = "NewDeviceOnBoardingViewModel.kt", l = {82}, m = "invokeSuspend", v = 2)
    public static final class C3572c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f191888a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f191890c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3572c(long j8, t13.d<? super C3572c> dVar) {
            super(2, dVar);
            this.f191890c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new C3572c(this.f191890c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C3572c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f191888a;
            if (i14 == 0) {
                r.b(obj);
                this.f191888a = 1;
                if (c.this.L4(this.f191890c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.onboarding.NewDeviceOnBoardingViewModel", f = "NewDeviceOnBoardingViewModel.kt", l = {99, 103, 109, 116, 121, 127, 130, 143, 157, 164}, m = "startDeviceOnBoardingSuspendable", v = 2)
    public static final class d extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f191891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AtomicReference f191892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f191893c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f191895e;

        public d(t13.d<? super d> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f191893c = obj;
            this.f191895e |= Integer.MIN_VALUE;
            return c.this.L4(0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.onboarding.NewDeviceOnBoardingViewModel$startPollJob$2", f = "NewDeviceOnBoardingViewModel.kt", l = {193}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f191896a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f191898c;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.onboarding.NewDeviceOnBoardingViewModel$startPollJob$2$1", f = "NewDeviceOnBoardingViewModel.kt", l = {194}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements l<t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public AtomicReference f191899a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f191900b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f191901c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f191902d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, long j8, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f191901c = cVar;
                this.f191902d = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f191901c, this.f191902d, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:27:0x0089  */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                AtomicReference atomicReference;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f191900b;
                long j8 = this.f191902d;
                c cVar = this.f191901c;
                if (i14 == 0) {
                    r.b(obj);
                    AtomicReference atomicReference2 = cVar.currentFpDevice;
                    z0 fitPayServiceProvider = cVar.getFitPayServiceProvider();
                    fitPayServiceProvider.getClass();
                    g1 g1Var = fitPayServiceProvider.f205979a;
                    this.f191899a = atomicReference2;
                    this.f191900b = 1;
                    Object objG = g1Var.G(j8, this, true);
                    if (objG == aVar) {
                        return aVar;
                    }
                    atomicReference = atomicReference2;
                    obj = objG;
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    atomicReference = this.f191899a;
                    r.b(obj);
                }
                atomicReference.set(obj);
                cVar.M4(j8);
                Logger logger = c.f191874h;
                s sVar = (s) cVar.currentFpDevice.get();
                logger.debug("startPoll: device state: " + (sVar != null ? sVar.f73106f : null));
                s sVar2 = (s) cVar.currentFpDevice.get();
                if ((sVar2 != null ? sVar2.f73106f : null) == y.INITIALIZED) {
                    cVar.Q4(j8);
                } else {
                    s sVar3 = (s) cVar.currentFpDevice.get();
                    if ((sVar3 != null ? sVar3.f73106f : null) == y.FAILED_INITIALIZATION) {
                        cVar.Q4(j8);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.onboarding.NewDeviceOnBoardingViewModel$startPollJob$2$2", f = "NewDeviceOnBoardingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends i implements l<t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f191903a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f191904b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, long j8, t13.d<? super b> dVar) {
                super(1, dVar);
                this.f191903a = cVar;
                this.f191904b = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new b(this.f191903a, this.f191904b, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super Unit> dVar) {
                return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f191903a.Q4(this.f191904b);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j8, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f191898c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new e(this.f191898c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f191896a;
            if (i14 == 0) {
                r.b(obj);
                c cVar = c.this;
                long j8 = this.f191898c;
                a aVar2 = new a(cVar, j8, null);
                b bVar = new b(cVar, j8, null);
                this.f191896a = 1;
                if (jg.b.s(5000L, 30000L, c.f191877k, c.f191878l, aVar2, bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.onboarding.NewDeviceOnBoardingViewModel$validateAndUpdateDeviceState$1", f = "NewDeviceOnBoardingViewModel.kt", l = {238, 248}, m = "invokeSuspend", v = 2)
    public static final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AtomicReference f191905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f191906b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f191908d;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f191909a;

            static {
                int[] iArr = new int[y.values().length];
                try {
                    iArr[y.INITIALIZED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y.FAILED_INITIALIZATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f191909a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j8, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f191908d = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new f(this.f191908d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00bf, code lost:
        
            if (r9.t(r2, r8) == r0) goto L38;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AtomicReference atomicReference;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f191906b;
            long j8 = this.f191908d;
            c cVar = c.this;
            try {
                try {
                    if (i14 != 0) {
                        if (i14 == 1) {
                            atomicReference = this.f191905a;
                            r.b(obj);
                        } else {
                            if (i14 != 2) {
                                h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r.b(obj);
                        }
                        cVar.L3().j(Boolean.TRUE);
                        return Unit.INSTANCE;
                    }
                    r.b(obj);
                    atomicReference = cVar.currentFpDevice;
                    z0 fitPayServiceProvider = cVar.getFitPayServiceProvider();
                    fitPayServiceProvider.getClass();
                    g1 g1Var = fitPayServiceProvider.f205979a;
                    this.f191905a = atomicReference;
                    this.f191906b = 1;
                    obj = g1Var.G(j8, this, true);
                    if (obj == aVar) {
                    }
                    return aVar;
                    atomicReference.set(obj);
                } catch (Exception unused) {
                    c.f191874h.error("validateAndUpdateDeviceState: failed to update device");
                    cVar.L3().j(Boolean.FALSE);
                }
            } catch (Exception unused2) {
                c.f191874h.error("validateAndUpdateDeviceState: failed to fetch fitPay device");
                cVar.L3().j(Boolean.FALSE);
            }
            s sVar = (s) cVar.currentFpDevice.get();
            y yVar = sVar != null ? sVar.f73106f : null;
            int i15 = yVar == null ? -1 : a.f191909a[yVar.ordinal()];
            if (i15 == 1) {
                z0 fitPayServiceProvider2 = cVar.getFitPayServiceProvider();
                if (fitPayServiceProvider2 != null) {
                    this.f191905a = null;
                    this.f191906b = 2;
                }
                cVar.L3().j(Boolean.TRUE);
            } else if (i15 != 2) {
                cVar.L3().j(Boolean.FALSE);
            } else {
                Logger logger = c.f191874h;
                s sVar2 = (s) cVar.currentFpDevice.get();
                logger.debug("validateAndUpdateDeviceState: Device " + (sVar2 != null ? sVar2.f73101a : null) + " failed to initialzie");
                cVar.L3().j(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f191874h = gt2.b.f79005a.h("PAY#NEW_FITPAY#NewDeviceOnBoardingViewModel");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G4(c cVar, boolean z14) {
        for (l1 l1Var : cVar.pollJobs) {
            l1Var.getClass();
            l1Var.c(null);
        }
    }

    private final void I() {
        L3().k(this.deviceOnBoardingObserver);
    }

    private final void I4() {
        L3().g(this.deviceOnBoardingObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J4(long j8, boolean z14, boolean z15, t13.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f191887d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f191887d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f191885b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f191887d;
        try {
            if (i15 == 0) {
                r.b(obj);
                Logger logger = f191874h;
                logger.debug("removeDeviceFromUser");
                if (!z14) {
                    zf.b.r();
                    if (!gh2.i.f77458c.a().f77477b.c("enable_nfc_device_clean_up")) {
                        logger.debug("removeDeviceFromUser: remote config flag is disabled, won't delete device");
                    }
                    if (z15) {
                        L3().j(Boolean.FALSE);
                    }
                    return Unit.INSTANCE;
                }
                z0 fitPayServiceProvider = getFitPayServiceProvider();
                fitPayServiceProvider.getClass();
                g1 g1Var = fitPayServiceProvider.f205979a;
                bVar.f191884a = z15;
                bVar.f191887d = 1;
                if (g1Var.i0(j8, bVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z15 = bVar.f191884a;
                r.b(obj);
            }
        } catch (Exception e4) {
            f191874h.error("removeDeviceFromUser: Device failed to remove", (Throwable) e4);
            Unit unit = Unit.INSTANCE;
        }
        if (z15) {
            L3().j(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object K4(c cVar, long j8, boolean z14, boolean z15, t13.d dVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z14 = false;
        }
        boolean z16 = z14;
        if ((i14 & 4) != 0) {
            z15 = true;
        }
        return cVar.J4(j8, z16, z15, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x01b3 A[Catch: Exception -> 0x01a7, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x01a7, blocks: (B:113:0x01e0, B:92:0x019f, B:102:0x01b3, B:110:0x01d8), top: B:151:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01b7 A[Catch: Exception -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0057, blocks: (B:24:0x0052, B:31:0x006c, B:82:0x017d, B:84:0x0182, B:86:0x0186, B:88:0x018c, B:100:0x01af, B:104:0x01b7, B:34:0x0077, B:74:0x0163, B:76:0x0169, B:78:0x016d, B:37:0x0083, B:60:0x00e2, B:62:0x00f4, B:64:0x00fc, B:40:0x0089, B:54:0x00ca, B:56:0x00d0), top: B:151:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01cc A[Catch: Exception -> 0x01ab, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x01ab, blocks: (B:90:0x0193, B:69:0x0123, B:71:0x012d, B:108:0x01cc, B:66:0x0100, B:52:0x00c6, B:49:0x00b0), top: B:144:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01de  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:126:0x021a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0258 A[PHI: r11
      0x0258: PHI (r11v57 long) = (r11v50 long), (r11v56 long), (r11v59 long) binds: [B:129:0x0240, B:133:0x0245, B:16:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:153:0x022d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0100 A[Catch: Exception -> 0x01ab, PHI: r3
      0x0100: PHI (r3v1 long) = (r3v0 long), (r3v0 long), (r3v2 long) binds: [B:53:0x00c8, B:55:0x00ce, B:65:0x00ff] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {Exception -> 0x01ab, blocks: (B:90:0x0193, B:69:0x0123, B:71:0x012d, B:108:0x01cc, B:66:0x0100, B:52:0x00c6, B:49:0x00b0), top: B:144:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:69:0x0123 A[Catch: Exception -> 0x01ab, PHI: r3 r13
      0x0123: PHI (r3v3 long) = (r3v1 long), (r3v4 long) binds: [B:67:0x0120, B:35:0x007a] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r13v17 java.lang.Object) = (r13v12 java.lang.Object), (r13v1 java.lang.Object) binds: [B:67:0x0120, B:35:0x007a] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x01ab, blocks: (B:90:0x0193, B:69:0x0123, B:71:0x012d, B:108:0x01cc, B:66:0x0100, B:52:0x00c6, B:49:0x00b0), top: B:144:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x012d A[Catch: Exception -> 0x01ab, TRY_LEAVE, TryCatch #1 {Exception -> 0x01ab, blocks: (B:90:0x0193, B:69:0x0123, B:71:0x012d, B:108:0x01cc, B:66:0x0100, B:52:0x00c6, B:49:0x00b0), top: B:144:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0163 A[Catch: Exception -> 0x0057, TRY_ENTER, TryCatch #6 {Exception -> 0x0057, blocks: (B:24:0x0052, B:31:0x006c, B:82:0x017d, B:84:0x0182, B:86:0x0186, B:88:0x018c, B:100:0x01af, B:104:0x01b7, B:34:0x0077, B:74:0x0163, B:76:0x0169, B:78:0x016d, B:37:0x0083, B:60:0x00e2, B:62:0x00f4, B:64:0x00fc, B:40:0x0089, B:54:0x00ca, B:56:0x00d0), top: B:151:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0169 A[Catch: Exception -> 0x0057, TryCatch #6 {Exception -> 0x0057, blocks: (B:24:0x0052, B:31:0x006c, B:82:0x017d, B:84:0x0182, B:86:0x0186, B:88:0x018c, B:100:0x01af, B:104:0x01b7, B:34:0x0077, B:74:0x0163, B:76:0x0169, B:78:0x016d, B:37:0x0083, B:60:0x00e2, B:62:0x00f4, B:64:0x00fc, B:40:0x0089, B:54:0x00ca, B:56:0x00d0), top: B:151:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0186 A[Catch: Exception -> 0x0057, TryCatch #6 {Exception -> 0x0057, blocks: (B:24:0x0052, B:31:0x006c, B:82:0x017d, B:84:0x0182, B:86:0x0186, B:88:0x018c, B:100:0x01af, B:104:0x01b7, B:34:0x0077, B:74:0x0163, B:76:0x0169, B:78:0x016d, B:37:0x0083, B:60:0x00e2, B:62:0x00f4, B:64:0x00fc, B:40:0x0089, B:54:0x00ca, B:56:0x00d0), top: B:151:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x018b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code duplicated, block: B:90:0x0193 A[Catch: Exception -> 0x01ab, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x01ab, blocks: (B:90:0x0193, B:69:0x0123, B:71:0x012d, B:108:0x01cc, B:66:0x0100, B:52:0x00c6, B:49:0x00b0), top: B:144:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ae  */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c6, code lost:
    
        if (K4(r10, r3, false, false, r7, 6, null) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x026b, code lost:
    
        if (N4(r11, r7) == r1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a3, code lost:
    
        if (K4(r10, r3, false, false, r7, 6, null) == r1) goto L136;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x012d, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L4(long j8, t13.d<? super Unit> dVar) {
        d dVar2;
        Exception exc;
        long j14;
        s sVar;
        long j15;
        n nVarI;
        ms2.d dVarG;
        Response response;
        c cVar;
        long j16;
        AtomicReference atomicReference;
        z0 fitPayServiceProvider;
        zn2.a aVar;
        g1 g1Var;
        long j17;
        String strA;
        Exception exc2;
        z0 fitPayServiceProvider2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i14 = dVar2.f191895e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar2.f191895e = i14 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        d dVar3 = dVar2;
        Object objG = dVar3.f191893c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        try {
            try {
                switch (dVar3.f191895e) {
                    case 0:
                        r.b(objG);
                        z0 fitPayServiceProvider3 = getFitPayServiceProvider();
                        if ((fitPayServiceProvider3 != null ? fitPayServiceProvider3.f205979a : null) == null) {
                            f191874h.error("startDeviceOnBoarding: userDataManage or service provider not available, can not provision device...");
                            L3().j(Boolean.FALSE);
                            return Unit.INSTANCE;
                        }
                        try {
                            z0 fitPayServiceProvider4 = getFitPayServiceProvider();
                            fitPayServiceProvider4.getClass();
                            g1 g1Var2 = fitPayServiceProvider4.f205979a;
                            dVar3.f191891a = j8;
                            dVar3.f191895e = 1;
                            objG = g1Var2.G(j8, dVar3, true);
                            if (objG != aVar2) {
                                j14 = j8;
                                sVar = (s) objG;
                                if (sVar != null || sVar.f73106f == y.INITIALIZED) {
                                    z0 fitPayServiceProvider5 = getFitPayServiceProvider();
                                    fitPayServiceProvider5.getClass();
                                    g1 g1Var3 = fitPayServiceProvider5.f205979a;
                                    dVar3.f191892b = null;
                                    dVar3.f191891a = j14;
                                    dVar3.f191895e = 3;
                                    g1Var3.getClass();
                                    u0.f205864a.getClass();
                                    objG = u0.h().e(j14, dVar3);
                                    if (objG != aVar2) {
                                        response = ((a0) objG).f25745a;
                                        if (response.isSuccessful()) {
                                            cVar = this;
                                            try {
                                                atomicReference = cVar.currentFpDevice;
                                                z0 fitPayServiceProvider6 = getFitPayServiceProvider();
                                                fitPayServiceProvider6.getClass();
                                                g1 g1Var4 = fitPayServiceProvider6.f205979a;
                                                dVar3.f191892b = atomicReference;
                                                dVar3.f191891a = j14;
                                                dVar3.f191895e = 8;
                                                objG = g1Var4.G(j14, dVar3, true);
                                                if (objG != aVar2) {
                                                    j16 = j14;
                                                    try {
                                                        atomicReference.set(objG);
                                                        f191874h.debug("startDeviceOnBoarding: initial device fetch complete");
                                                    } catch (Exception unused) {
                                                        f191874h.error("startDeviceOnBoarding: initial device fetch is failed, trying again");
                                                    }
                                                    if (cVar.currentFpDevice.get() == null) {
                                                        f191874h.error("startDeviceOnBoarding: received null response for device call, can not onBoard device");
                                                        L3().j(Boolean.FALSE);
                                                        return Unit.INSTANCE;
                                                    }
                                                    try {
                                                        fitPayServiceProvider2 = getFitPayServiceProvider();
                                                        fitPayServiceProvider2.getClass();
                                                        dVar3.f191892b = null;
                                                        dVar3.f191891a = j16;
                                                        dVar3.f191895e = 9;
                                                        if (fitPayServiceProvider2.t(j16, dVar3) != aVar2) {
                                                            f191874h.debug("startDeviceOnBoarding: starting poll");
                                                            dVar3.f191892b = null;
                                                            dVar3.f191891a = j16;
                                                            dVar3.f191895e = 10;
                                                        }
                                                    } catch (Exception e4) {
                                                        exc2 = e4;
                                                        f191874h.error("startDeviceOnBoarding: failed to update device " + j16, (Throwable) exc2);
                                                    }
                                                }
                                            } catch (Exception unused2) {
                                                j16 = j14;
                                                f191874h.error("startDeviceOnBoarding: initial device fetch is failed, trying again");
                                                if (cVar.currentFpDevice.get() == null) {
                                                    f191874h.error("startDeviceOnBoarding: received null response for device call, can not onBoard device");
                                                    L3().j(Boolean.FALSE);
                                                    return Unit.INSTANCE;
                                                }
                                                fitPayServiceProvider2 = getFitPayServiceProvider();
                                                fitPayServiceProvider2.getClass();
                                                dVar3.f191892b = null;
                                                dVar3.f191891a = j16;
                                                dVar3.f191895e = 9;
                                                if (fitPayServiceProvider2.t(j16, dVar3) != aVar2) {
                                                    f191874h.debug("startDeviceOnBoarding: starting poll");
                                                    dVar3.f191892b = null;
                                                    dVar3.f191891a = j16;
                                                    dVar3.f191895e = 10;
                                                    break;
                                                }
                                                return aVar2;
                                            }
                                            break;
                                        } else {
                                            f191874h.debug("startDeviceOnBoardingSuspendable: failed to add device for " + j14 + ", responseCode: " + response.code() + ", message: " + response.message() + StringUtils.SPACE);
                                            if (response.code() == 400) {
                                                dVar3.f191892b = null;
                                                dVar3.f191891a = j14;
                                                dVar3.f191895e = 7;
                                                if (K4(this, j14, false, false, dVar3, 6, null) == aVar2) {
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            fitPayServiceProvider = getFitPayServiceProvider();
                                            if (fitPayServiceProvider != null || (g1Var = fitPayServiceProvider.f205979a) == null) {
                                                aVar = null;
                                                Logger logger = f191874h;
                                                if (aVar != null) {
                                                    strA = aVar.a();
                                                } else {
                                                    strA = null;
                                                }
                                                logger.debug(strA);
                                                if (aVar instanceof zn2.a.f) {
                                                    dVar3.f191892b = null;
                                                    dVar3.f191891a = j14;
                                                    dVar3.f191895e = 5;
                                                    break;
                                                } else {
                                                    if (aVar instanceof zn2.a.e) {
                                                        dVar3.f191892b = null;
                                                        dVar3.f191891a = j14;
                                                        dVar3.f191895e = 6;
                                                    } else {
                                                        S3(j14);
                                                    }
                                                    break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            dVar3.f191892b = null;
                                            dVar3.f191891a = j14;
                                            dVar3.f191895e = 4;
                                            objG = g1Var.d(j14, dVar3);
                                            if (objG != aVar2) {
                                                j17 = j14;
                                                aVar = (zn2.a) objG;
                                                j14 = j17;
                                                Logger logger2 = f191874h;
                                                if (aVar != null) {
                                                    strA = aVar.a();
                                                } else {
                                                    strA = null;
                                                }
                                                logger2.debug(strA);
                                                if (aVar instanceof zn2.a.f) {
                                                    dVar3.f191892b = null;
                                                    dVar3.f191891a = j14;
                                                    dVar3.f191895e = 5;
                                                    break;
                                                } else {
                                                    if (aVar instanceof zn2.a.e) {
                                                        dVar3.f191892b = null;
                                                        dVar3.f191891a = j14;
                                                        dVar3.f191895e = 6;
                                                    } else {
                                                        S3(j14);
                                                    }
                                                    break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        return aVar2;
                                    }
                                } else {
                                    dVar3.f191892b = null;
                                    dVar3.f191891a = j14;
                                    dVar3.f191895e = 2;
                                    if (J4(j14, true, false, dVar3) != aVar2) {
                                        j15 = j14;
                                        getFitPayServiceProvider().getClass();
                                        w.f140538a.getClass();
                                        nVarI = w.i(j15);
                                        if (nVarI != null && (dVarG = nVarI.g(is2.b.FITPAY)) != null) {
                                            dVarG.j(null);
                                        }
                                        j14 = j15;
                                        z0 fitPayServiceProvider7 = getFitPayServiceProvider();
                                        fitPayServiceProvider7.getClass();
                                        g1 g1Var5 = fitPayServiceProvider7.f205979a;
                                        dVar3.f191892b = null;
                                        dVar3.f191891a = j14;
                                        dVar3.f191895e = 3;
                                        g1Var5.getClass();
                                        u0.f205864a.getClass();
                                        objG = u0.h().e(j14, dVar3);
                                        if (objG != aVar2) {
                                            response = ((a0) objG).f25745a;
                                            if (response.isSuccessful()) {
                                                f191874h.debug("startDeviceOnBoardingSuspendable: failed to add device for " + j14 + ", responseCode: " + response.code() + ", message: " + response.message() + StringUtils.SPACE);
                                                if (response.code() == 400) {
                                                    dVar3.f191892b = null;
                                                    dVar3.f191891a = j14;
                                                    dVar3.f191895e = 7;
                                                    if (K4(this, j14, false, false, dVar3, 6, null) == aVar2) {
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                                fitPayServiceProvider = getFitPayServiceProvider();
                                                if (fitPayServiceProvider != null) {
                                                }
                                                aVar = null;
                                                Logger logger3 = f191874h;
                                                if (aVar != null) {
                                                    strA = aVar.a();
                                                } else {
                                                    strA = null;
                                                }
                                                logger3.debug(strA);
                                                if (aVar instanceof zn2.a.f) {
                                                    dVar3.f191892b = null;
                                                    dVar3.f191891a = j14;
                                                    dVar3.f191895e = 5;
                                                    break;
                                                } else {
                                                    if (aVar instanceof zn2.a.e) {
                                                        dVar3.f191892b = null;
                                                        dVar3.f191891a = j14;
                                                        dVar3.f191895e = 6;
                                                    } else {
                                                        S3(j14);
                                                    }
                                                    break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                            cVar = this;
                                            atomicReference = cVar.currentFpDevice;
                                            z0 fitPayServiceProvider8 = getFitPayServiceProvider();
                                            fitPayServiceProvider8.getClass();
                                            g1 g1Var6 = fitPayServiceProvider8.f205979a;
                                            dVar3.f191892b = atomicReference;
                                            dVar3.f191891a = j14;
                                            dVar3.f191895e = 8;
                                            objG = g1Var6.G(j14, dVar3, true);
                                            if (objG != aVar2) {
                                                j16 = j14;
                                                atomicReference.set(objG);
                                                f191874h.debug("startDeviceOnBoarding: initial device fetch complete");
                                                if (cVar.currentFpDevice.get() == null) {
                                                    f191874h.error("startDeviceOnBoarding: received null response for device call, can not onBoard device");
                                                    L3().j(Boolean.FALSE);
                                                    return Unit.INSTANCE;
                                                }
                                                fitPayServiceProvider2 = getFitPayServiceProvider();
                                                fitPayServiceProvider2.getClass();
                                                dVar3.f191892b = null;
                                                dVar3.f191891a = j16;
                                                dVar3.f191895e = 9;
                                                if (fitPayServiceProvider2.t(j16, dVar3) != aVar2) {
                                                    f191874h.debug("startDeviceOnBoarding: starting poll");
                                                    dVar3.f191892b = null;
                                                    dVar3.f191891a = j16;
                                                    dVar3.f191895e = 10;
                                                }
                                            }
                                            break;
                                            return aVar2;
                                        }
                                    }
                                }
                            }
                            return aVar2;
                        } catch (Exception e14) {
                            e = e14;
                            exc = e;
                            f191874h.error("startDeviceOnBoarding: can not add device to user", (Throwable) exc);
                            L3().j(Boolean.FALSE);
                            return Unit.INSTANCE;
                        }
                    case 1:
                        j8 = dVar3.f191891a;
                        r.b(objG);
                        j14 = j8;
                        sVar = (s) objG;
                        if (sVar != null) {
                            z0 fitPayServiceProvider9 = getFitPayServiceProvider();
                            fitPayServiceProvider9.getClass();
                            g1 g1Var7 = fitPayServiceProvider9.f205979a;
                            dVar3.f191892b = null;
                            dVar3.f191891a = j14;
                            dVar3.f191895e = 3;
                            g1Var7.getClass();
                            u0.f205864a.getClass();
                            objG = u0.h().e(j14, dVar3);
                            if (objG != aVar2) {
                                response = ((a0) objG).f25745a;
                                if (response.isSuccessful()) {
                                    f191874h.debug("startDeviceOnBoardingSuspendable: failed to add device for " + j14 + ", responseCode: " + response.code() + ", message: " + response.message() + StringUtils.SPACE);
                                    if (response.code() == 400) {
                                        dVar3.f191892b = null;
                                        dVar3.f191891a = j14;
                                        dVar3.f191895e = 7;
                                        if (K4(this, j14, false, false, dVar3, 6, null) == aVar2) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    fitPayServiceProvider = getFitPayServiceProvider();
                                    if (fitPayServiceProvider != null) {
                                        break;
                                    }
                                    aVar = null;
                                    Logger logger4 = f191874h;
                                    if (aVar != null) {
                                        strA = aVar.a();
                                    } else {
                                        strA = null;
                                    }
                                    logger4.debug(strA);
                                    if (aVar instanceof zn2.a.f) {
                                        dVar3.f191892b = null;
                                        dVar3.f191891a = j14;
                                        dVar3.f191895e = 5;
                                        break;
                                    } else {
                                        if (aVar instanceof zn2.a.e) {
                                            dVar3.f191892b = null;
                                            dVar3.f191891a = j14;
                                            dVar3.f191895e = 6;
                                        } else {
                                            S3(j14);
                                        }
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                                cVar = this;
                                atomicReference = cVar.currentFpDevice;
                                z0 fitPayServiceProvider10 = getFitPayServiceProvider();
                                fitPayServiceProvider10.getClass();
                                g1 g1Var8 = fitPayServiceProvider10.f205979a;
                                dVar3.f191892b = atomicReference;
                                dVar3.f191891a = j14;
                                dVar3.f191895e = 8;
                                objG = g1Var8.G(j14, dVar3, true);
                                if (objG != aVar2) {
                                    j16 = j14;
                                    atomicReference.set(objG);
                                    f191874h.debug("startDeviceOnBoarding: initial device fetch complete");
                                    if (cVar.currentFpDevice.get() == null) {
                                        f191874h.error("startDeviceOnBoarding: received null response for device call, can not onBoard device");
                                        L3().j(Boolean.FALSE);
                                        return Unit.INSTANCE;
                                    }
                                    fitPayServiceProvider2 = getFitPayServiceProvider();
                                    fitPayServiceProvider2.getClass();
                                    dVar3.f191892b = null;
                                    dVar3.f191891a = j16;
                                    dVar3.f191895e = 9;
                                    if (fitPayServiceProvider2.t(j16, dVar3) != aVar2) {
                                        f191874h.debug("startDeviceOnBoarding: starting poll");
                                        dVar3.f191892b = null;
                                        dVar3.f191891a = j16;
                                        dVar3.f191895e = 10;
                                    }
                                }
                                break;
                                return aVar2;
                            }
                        } else {
                            z0 fitPayServiceProvider11 = getFitPayServiceProvider();
                            fitPayServiceProvider11.getClass();
                            g1 g1Var9 = fitPayServiceProvider11.f205979a;
                            dVar3.f191892b = null;
                            dVar3.f191891a = j14;
                            dVar3.f191895e = 3;
                            g1Var9.getClass();
                            u0.f205864a.getClass();
                            objG = u0.h().e(j14, dVar3);
                            if (objG != aVar2) {
                                response = ((a0) objG).f25745a;
                                if (response.isSuccessful()) {
                                    f191874h.debug("startDeviceOnBoardingSuspendable: failed to add device for " + j14 + ", responseCode: " + response.code() + ", message: " + response.message() + StringUtils.SPACE);
                                    if (response.code() == 400) {
                                        dVar3.f191892b = null;
                                        dVar3.f191891a = j14;
                                        dVar3.f191895e = 7;
                                        if (K4(this, j14, false, false, dVar3, 6, null) == aVar2) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    fitPayServiceProvider = getFitPayServiceProvider();
                                    if (fitPayServiceProvider != null) {
                                        break;
                                    }
                                    aVar = null;
                                    Logger logger5 = f191874h;
                                    if (aVar != null) {
                                        strA = aVar.a();
                                    } else {
                                        strA = null;
                                    }
                                    logger5.debug(strA);
                                    if (aVar instanceof zn2.a.f) {
                                        dVar3.f191892b = null;
                                        dVar3.f191891a = j14;
                                        dVar3.f191895e = 5;
                                        break;
                                    } else {
                                        if (aVar instanceof zn2.a.e) {
                                            dVar3.f191892b = null;
                                            dVar3.f191891a = j14;
                                            dVar3.f191895e = 6;
                                        } else {
                                            S3(j14);
                                        }
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                                cVar = this;
                                atomicReference = cVar.currentFpDevice;
                                z0 fitPayServiceProvider12 = getFitPayServiceProvider();
                                fitPayServiceProvider12.getClass();
                                g1 g1Var10 = fitPayServiceProvider12.f205979a;
                                dVar3.f191892b = atomicReference;
                                dVar3.f191891a = j14;
                                dVar3.f191895e = 8;
                                objG = g1Var10.G(j14, dVar3, true);
                                if (objG != aVar2) {
                                    j16 = j14;
                                    atomicReference.set(objG);
                                    f191874h.debug("startDeviceOnBoarding: initial device fetch complete");
                                    if (cVar.currentFpDevice.get() == null) {
                                        f191874h.error("startDeviceOnBoarding: received null response for device call, can not onBoard device");
                                        L3().j(Boolean.FALSE);
                                        return Unit.INSTANCE;
                                    }
                                    fitPayServiceProvider2 = getFitPayServiceProvider();
                                    fitPayServiceProvider2.getClass();
                                    dVar3.f191892b = null;
                                    dVar3.f191891a = j16;
                                    dVar3.f191895e = 9;
                                    if (fitPayServiceProvider2.t(j16, dVar3) != aVar2) {
                                        f191874h.debug("startDeviceOnBoarding: starting poll");
                                        dVar3.f191892b = null;
                                        dVar3.f191891a = j16;
                                        dVar3.f191895e = 10;
                                    }
                                }
                                break;
                                return aVar2;
                            }
                        }
                        return aVar2;
                    case 2:
                        j15 = dVar3.f191891a;
                        r.b(objG);
                        getFitPayServiceProvider().getClass();
                        w.f140538a.getClass();
                        nVarI = w.i(j15);
                        if (nVarI != null) {
                            dVarG.j(null);
                        }
                        j14 = j15;
                        z0 fitPayServiceProvider13 = getFitPayServiceProvider();
                        fitPayServiceProvider13.getClass();
                        g1 g1Var11 = fitPayServiceProvider13.f205979a;
                        dVar3.f191892b = null;
                        dVar3.f191891a = j14;
                        dVar3.f191895e = 3;
                        g1Var11.getClass();
                        u0.f205864a.getClass();
                        objG = u0.h().e(j14, dVar3);
                        if (objG != aVar2) {
                            response = ((a0) objG).f25745a;
                            if (response.isSuccessful()) {
                                f191874h.debug("startDeviceOnBoardingSuspendable: failed to add device for " + j14 + ", responseCode: " + response.code() + ", message: " + response.message() + StringUtils.SPACE);
                                if (response.code() == 400) {
                                    dVar3.f191892b = null;
                                    dVar3.f191891a = j14;
                                    dVar3.f191895e = 7;
                                    if (K4(this, j14, false, false, dVar3, 6, null) == aVar2) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                fitPayServiceProvider = getFitPayServiceProvider();
                                if (fitPayServiceProvider != null) {
                                    break;
                                }
                                aVar = null;
                                Logger logger6 = f191874h;
                                if (aVar != null) {
                                    strA = aVar.a();
                                } else {
                                    strA = null;
                                }
                                logger6.debug(strA);
                                if (aVar instanceof zn2.a.f) {
                                    dVar3.f191892b = null;
                                    dVar3.f191891a = j14;
                                    dVar3.f191895e = 5;
                                    break;
                                } else {
                                    if (aVar instanceof zn2.a.e) {
                                        dVar3.f191892b = null;
                                        dVar3.f191891a = j14;
                                        dVar3.f191895e = 6;
                                    } else {
                                        S3(j14);
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                            cVar = this;
                            atomicReference = cVar.currentFpDevice;
                            z0 fitPayServiceProvider14 = getFitPayServiceProvider();
                            fitPayServiceProvider14.getClass();
                            g1 g1Var12 = fitPayServiceProvider14.f205979a;
                            dVar3.f191892b = atomicReference;
                            dVar3.f191891a = j14;
                            dVar3.f191895e = 8;
                            objG = g1Var12.G(j14, dVar3, true);
                            if (objG != aVar2) {
                                j16 = j14;
                                atomicReference.set(objG);
                                f191874h.debug("startDeviceOnBoarding: initial device fetch complete");
                                if (cVar.currentFpDevice.get() == null) {
                                    f191874h.error("startDeviceOnBoarding: received null response for device call, can not onBoard device");
                                    L3().j(Boolean.FALSE);
                                    return Unit.INSTANCE;
                                }
                                fitPayServiceProvider2 = getFitPayServiceProvider();
                                fitPayServiceProvider2.getClass();
                                dVar3.f191892b = null;
                                dVar3.f191891a = j16;
                                dVar3.f191895e = 9;
                                if (fitPayServiceProvider2.t(j16, dVar3) != aVar2) {
                                    f191874h.debug("startDeviceOnBoarding: starting poll");
                                    dVar3.f191892b = null;
                                    dVar3.f191891a = j16;
                                    dVar3.f191895e = 10;
                                }
                            }
                            break;
                            return aVar2;
                        }
                        return aVar2;
                    case 3:
                        long j18 = dVar3.f191891a;
                        r.b(objG);
                        j14 = j18;
                        response = ((a0) objG).f25745a;
                        if (response.isSuccessful()) {
                            f191874h.debug("startDeviceOnBoardingSuspendable: failed to add device for " + j14 + ", responseCode: " + response.code() + ", message: " + response.message() + StringUtils.SPACE);
                            if (response.code() == 400) {
                                dVar3.f191892b = null;
                                dVar3.f191891a = j14;
                                dVar3.f191895e = 7;
                                if (K4(this, j14, false, false, dVar3, 6, null) == aVar2) {
                                }
                                return Unit.INSTANCE;
                            }
                            fitPayServiceProvider = getFitPayServiceProvider();
                            if (fitPayServiceProvider != null) {
                                break;
                            }
                            aVar = null;
                            Logger logger7 = f191874h;
                            if (aVar != null) {
                                strA = aVar.a();
                            } else {
                                strA = null;
                            }
                            logger7.debug(strA);
                            if (aVar instanceof zn2.a.f) {
                                dVar3.f191892b = null;
                                dVar3.f191891a = j14;
                                dVar3.f191895e = 5;
                                break;
                            } else {
                                if (aVar instanceof zn2.a.e) {
                                    dVar3.f191892b = null;
                                    dVar3.f191891a = j14;
                                    dVar3.f191895e = 6;
                                } else {
                                    S3(j14);
                                }
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        cVar = this;
                        atomicReference = cVar.currentFpDevice;
                        z0 fitPayServiceProvider15 = getFitPayServiceProvider();
                        fitPayServiceProvider15.getClass();
                        g1 g1Var13 = fitPayServiceProvider15.f205979a;
                        dVar3.f191892b = atomicReference;
                        dVar3.f191891a = j14;
                        dVar3.f191895e = 8;
                        objG = g1Var13.G(j14, dVar3, true);
                        if (objG != aVar2) {
                            j16 = j14;
                            atomicReference.set(objG);
                            f191874h.debug("startDeviceOnBoarding: initial device fetch complete");
                            if (cVar.currentFpDevice.get() == null) {
                                f191874h.error("startDeviceOnBoarding: received null response for device call, can not onBoard device");
                                L3().j(Boolean.FALSE);
                                return Unit.INSTANCE;
                            }
                            fitPayServiceProvider2 = getFitPayServiceProvider();
                            fitPayServiceProvider2.getClass();
                            dVar3.f191892b = null;
                            dVar3.f191891a = j16;
                            dVar3.f191895e = 9;
                            if (fitPayServiceProvider2.t(j16, dVar3) != aVar2) {
                                f191874h.debug("startDeviceOnBoarding: starting poll");
                                dVar3.f191892b = null;
                                dVar3.f191891a = j16;
                                dVar3.f191895e = 10;
                            }
                        }
                        break;
                        return aVar2;
                    case 4:
                        j17 = dVar3.f191891a;
                        r.b(objG);
                        aVar = (zn2.a) objG;
                        j14 = j17;
                        Logger logger8 = f191874h;
                        if (aVar != null) {
                            strA = aVar.a();
                        } else {
                            strA = null;
                        }
                        logger8.debug(strA);
                        if (aVar instanceof zn2.a.f) {
                            dVar3.f191892b = null;
                            dVar3.f191891a = j14;
                            dVar3.f191895e = 5;
                            break;
                        } else {
                            if (aVar instanceof zn2.a.e) {
                                dVar3.f191892b = null;
                                dVar3.f191891a = j14;
                                dVar3.f191895e = 6;
                            } else {
                                S3(j14);
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    case 5:
                        r.b(objG);
                        return Unit.INSTANCE;
                    case 6:
                        r.b(objG);
                        return Unit.INSTANCE;
                    case 7:
                        r.b(objG);
                        return Unit.INSTANCE;
                    case 8:
                        j16 = dVar3.f191891a;
                        atomicReference = dVar3.f191892b;
                        try {
                            r.b(objG);
                            cVar = this;
                            atomicReference.set(objG);
                            f191874h.debug("startDeviceOnBoarding: initial device fetch complete");
                            break;
                        } catch (Exception unused3) {
                            cVar = this;
                            f191874h.error("startDeviceOnBoarding: initial device fetch is failed, trying again");
                            if (cVar.currentFpDevice.get() == null) {
                                f191874h.error("startDeviceOnBoarding: received null response for device call, can not onBoard device");
                                L3().j(Boolean.FALSE);
                                return Unit.INSTANCE;
                            }
                            fitPayServiceProvider2 = getFitPayServiceProvider();
                            fitPayServiceProvider2.getClass();
                            dVar3.f191892b = null;
                            dVar3.f191891a = j16;
                            dVar3.f191895e = 9;
                            if (fitPayServiceProvider2.t(j16, dVar3) != aVar2) {
                                f191874h.debug("startDeviceOnBoarding: starting poll");
                                dVar3.f191892b = null;
                                dVar3.f191891a = j16;
                                dVar3.f191895e = 10;
                                break;
                            }
                            return aVar2;
                        }
                        if (cVar.currentFpDevice.get() == null) {
                            f191874h.error("startDeviceOnBoarding: received null response for device call, can not onBoard device");
                            L3().j(Boolean.FALSE);
                            return Unit.INSTANCE;
                        }
                        fitPayServiceProvider2 = getFitPayServiceProvider();
                        fitPayServiceProvider2.getClass();
                        dVar3.f191892b = null;
                        dVar3.f191891a = j16;
                        dVar3.f191895e = 9;
                        if (fitPayServiceProvider2.t(j16, dVar3) != aVar2) {
                            f191874h.debug("startDeviceOnBoarding: starting poll");
                            dVar3.f191892b = null;
                            dVar3.f191891a = j16;
                            dVar3.f191895e = 10;
                            break;
                        }
                        return aVar2;
                    case 9:
                        j16 = dVar3.f191891a;
                        try {
                            r.b(objG);
                        } catch (Exception e15) {
                            exc2 = e15;
                            f191874h.error("startDeviceOnBoarding: failed to update device " + j16, (Throwable) exc2);
                        }
                        f191874h.debug("startDeviceOnBoarding: starting poll");
                        dVar3.f191892b = null;
                        dVar3.f191891a = j16;
                        dVar3.f191895e = 10;
                        break;
                    case 10:
                        r.b(objG);
                        return Unit.INSTANCE;
                    default:
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Exception e16) {
                e = e16;
            }
        } catch (Exception e17) {
            exc = e17;
            f191874h.error("startDeviceOnBoarding: can not add device to user", (Throwable) exc);
            L3().j(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M4(long unitId) {
        w.f140538a.getClass();
        n nVarI = w.i(unitId);
        ms2.d dVarG = nVarI != null ? nVarI.g(is2.b.FITPAY) : null;
        t tVar = dVarG instanceof t ? (t) dVarG : null;
        if (tVar != null) {
            tVar.m();
            return;
        }
        f191874h.warn("startManualSync: device service provider is not available for " + unitId + ", can not start manual sync");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N4(long j8, t13.d<? super l1> dVar) {
        c2 c2VarT = ge1.b.T(v1.a(this), s0.f129406a, null, new e(j8, null), 2);
        O4(c2VarT);
        return c2VarT;
    }

    private final void O4(l1 job) {
        this.pollJobs.add(job);
        job.J(new x9.b(4, this, job));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P4(c cVar, l1 l1Var, Throwable th3) {
        cVar.pollJobs.remove(l1Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l1 Q4(long unitID) {
        return ge1.b.T(v1.a(this), s0.f129406a, null, new f(unitID, null), 2);
    }

    @Override // xp2.a
    /* JADX INFO: renamed from: A1, reason: from getter */
    public z0 getFitPayServiceProvider() {
        return this.fitPayServiceProvider;
    }

    @Override // xp2.a
    /* JADX INFO: renamed from: H4, reason: merged with bridge method [inline-methods] */
    public y0<Boolean> L3() {
        return this.isDeviceAddedForCurrentUser;
    }

    @Override // to2.b
    public /* bridge */ void P0() {
    }

    @Override // to2.b
    public void Q3(to2.c cVar) {
        cVar.getClass();
    }

    @Override // xp2.a
    public l1 S3(long unitID) {
        return ge1.b.T(v1.a(this), s0.f129406a, null, new C3572c(unitID, null), 2);
    }

    @Override // to2.b
    public void Y3(to2.h hVar) {
        hVar.getClass();
    }

    @Override // to2.b
    public void a2() {
        f191874h.debug("onDeviceStateUpdatedEvent");
        for (l1 l1Var : this.pollJobs) {
            l1Var.getClass();
            l1Var.c(null);
        }
    }

    @Override // to2.b
    public void i2(wo2.f fVar) {
        fVar.getClass();
    }

    @Override // to2.b
    public void j0(String str, Integer num) {
        str.getClass();
    }

    @Override // xp2.a
    public void m1(z0 z0Var) {
        this.fitPayServiceProvider = z0Var;
    }

    @Override // androidx.lifecycle.u1
    public void onCleared() {
        super.onCleared();
        I();
    }

    @Override // xp2.a
    public void w3() {
        g gVarA = w.f140538a.a(is2.b.FITPAY);
        m1(gVarA instanceof z0 ? (z0) gVarA : null);
        I4();
    }

    @Override // to2.b
    public void x1(String str) {
        str.getClass();
    }
}
