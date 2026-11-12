package po2;

import com.garmin.feature.garminpay.providers.gpay.snowball.exception.ProviderErrorCodeException;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lpo2/i;", "Lpo2/f;", "", "targetCredentialId", "targetCredentialLink", "", "jobPollingIntervalInMs", "syncPollingIntervalInMs", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJ)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Logger f139212n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f139213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f139214m;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139215a;

        static {
            int[] iArr = new int[fo2.o.values().length];
            try {
                iArr[fo2.o.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f139215a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardShiftInDownloadFlowBuilder", f = "CardShiftInDownloadFlowBuilder.kt", l = {41, 42}, m = "onCredentialActivated", v = 2)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f139216a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139218c;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139216a = obj;
            this.f139218c |= Integer.MIN_VALUE;
            return i.this.h(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardShiftInDownloadFlowBuilder", f = "CardShiftInDownloadFlowBuilder.kt", l = {57}, m = "onCredentialUpdated", v = 2)
    public static final class d extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f139219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f139220b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139222d;

        public d(t13.d<? super d> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139220b = obj;
            this.f139222d |= Integer.MIN_VALUE;
            return i.this.k(false, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardShiftInDownloadFlowBuilder", f = "CardShiftInDownloadFlowBuilder.kt", l = {24, 27}, m = "onStart", v = 2)
    public static final class e extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f139223a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139225c;

        public e(t13.d<? super e> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139223a = obj;
            this.f139225c |= Integer.MIN_VALUE;
            return i.this.p(this);
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f139212n = gt2.b.f79005a.h("PAY#NEW_FITPAY#CardShiftInDownloadFlowBuilder");
    }

    public /* synthetic */ i(String str, String str2, long j8, long j14, long j15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? 5000L : j8, (i14 & 8) != 0 ? 10000L : j14, j15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009e, code lost:
    
        if (c(r8, r0) == r1) goto L29;
     */
    @Override // po2.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(to2.h hVar, t13.d<? super Unit> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f139218c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f139218c = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f139216a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar.f139218c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        String strA = hVar.a();
        Logger logger = f139212n;
        if (strA == null) {
            logger.info("onCredentialActivated: null credential ID in " + hVar + ", ignore it");
            return Unit.INSTANCE;
        }
        String str = this.f139213l;
        if (p005kotlin.jvm.internal.s.g(str, strA)) {
            Object cVar2 = new aq2.l.c(100);
            cVar.f139218c = 1;
            if (q(cVar2, cVar) != obj2) {
            }
            return obj2;
        }
        logger.info("onCredentialActivated: the credential ID of " + hVar + " is not equal to " + str + ", ignore it");
        return Unit.INSTANCE;
        Object dVar2 = new aq2.l.d(Unit.INSTANCE);
        cVar.f139218c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.k0
    public final Object k(boolean z14, to2.h hVar, t13.d<? super Unit> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i14 = dVar2.f139222d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar2.f139222d = i14 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objD = dVar2.f139220b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar2.f139222d;
        if (i15 == 0) {
            o13.r.b(objD);
            String strA = hVar.a();
            Logger logger = f139212n;
            if (strA == null) {
                logger.info("onCredentialActivated: null credential ID in " + hVar + ", ignore it");
                return Unit.INSTANCE;
            }
            String str = this.f139213l;
            if (!p005kotlin.jvm.internal.s.g(str, strA)) {
                logger.info("onCredentialActivated: the credential ID of " + hVar + " is not equal to " + str + ", ignore it");
                return Unit.INSTANCE;
            }
            if (z14) {
                return Unit.INSTANCE;
            }
            dVar2.f139219a = z14;
            dVar2.f139222d = 1;
            objD = d(this.f139214m, dVar2);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = dVar2.f139219a;
            o13.r.b(objD);
        }
        String str2 = (String) objD;
        if (str2 == null) {
            throw new IllegalStateException(com.airbnb.lottie.animation.keyframe.a.h("onCredentialUpdated:", z14));
        }
        throw new ProviderErrorCodeException(str2, com.airbnb.lottie.animation.keyframe.a.h("onCredentialUpdated:", z14));
    }

    @Override // po2.k0
    public final Object m(to2.h hVar, t13.d<? super Unit> dVar) {
        String strA = hVar.a();
        String str = this.f139213l;
        boolean zG = p005kotlin.jvm.internal.s.g(strA, str);
        Logger logger = f139212n;
        if (zG) {
            fo2.o oVarC = hVar.c();
            if ((oVarC == null ? -1 : b.f139215a[oVarC.ordinal()]) == 1) {
                androidx.room.a0.v(oVarC, "JobStatusEvent: ");
                return null;
            }
            logger.info("onJobStatusEvent: ignore " + oVarC);
        } else {
            logger.info("onJobStatusEvent: the credential ID of " + hVar + " is not equal to " + str + ", ignore it");
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (q(r6, r0) == r1) goto L21;
     */
    @Override // po2.f, po2.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(t13.d<? super Unit> dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i14 = eVar.f139225c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f139225c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f139223a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f139225c;
        if (i15 == 0) {
            o13.r.b(obj);
            eVar.f139225c = 1;
            if (super.p(eVar) != obj2) {
            }
            return obj2;
        }
        if (i15 == 1) {
            o13.r.b(obj);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        f(this.f139214m);
        g();
        Object cVar = new aq2.l.c(20);
        eVar.f139225c = 2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpo2/i$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, String str2, long j8, long j14, long j15) {
        super(j8, j14, j15);
        str.getClass();
        str2.getClass();
        this.f139213l = str;
        this.f139214m = str2;
    }
}
