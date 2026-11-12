package po2;

import com.garmin.feature.garminpay.providers.gpay.snowball.exception.ProviderErrorCodeException;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lpo2/j;", "Lpo2/k0;", "", "", "targetCredentialId", "credentialLink", "", "jobPollingIntervalInMs", "syncPollingIntervalInMs", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJ)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends k0<Unit> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Logger f139232n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f139233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f139234m;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139235a;

        static {
            int[] iArr = new int[fo2.o.values().length];
            try {
                iArr[fo2.o.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f139235a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CredentialDeletionFlowBuilder", f = "CredentialDeletionFlowBuilder.kt", l = {38, 44}, m = "onCredentialDeleted", v = 2)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public to2.h f139236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f139237b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139239d;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139237b = obj;
            this.f139239d |= Integer.MIN_VALUE;
            return j.this.j(false, null, this);
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f139232n = gt2.b.f79005a.h("PAY#NEW_FITPAY#CredentialDeletionFlowBuilder");
    }

    public /* synthetic */ j(String str, String str2, long j8, long j14, long j15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? 5000L : j8, (i14 & 8) != 0 ? 10000L : j14, j15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:
    
        if (c(r7, r0) == r1) goto L35;
     */
    @Override // po2.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(boolean z14, to2.h hVar, t13.d<? super Unit> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f139239d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f139239d = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objD = cVar.f139237b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar.f139239d;
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 == 2) {
                    o13.r.b(objD);
                    return Unit.INSTANCE;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hVar = cVar.f139236a;
            o13.r.b(objD);
            String str = (String) objD;
            if (str == null) {
                throw new IllegalStateException("Card deletion failed with " + hVar);
            }
            throw new ProviderErrorCodeException(str, "Card deletion failed with " + hVar);
        }
        o13.r.b(objD);
        String strA = hVar.a();
        Logger logger = f139232n;
        if (strA == null) {
            logger.info("onCredentialDeleted: null credential ID in " + hVar + ", ignore it");
            return Unit.INSTANCE;
        }
        String str2 = this.f139233l;
        if (p005kotlin.jvm.internal.s.g(str2, strA)) {
            if (z14) {
                Object obj2 = Unit.INSTANCE;
                cVar.f139236a = null;
                cVar.f139239d = 2;
            } else {
                cVar.f139236a = hVar;
                cVar.f139239d = 1;
                objD = d(this.f139234m, cVar);
            }
            return obj;
        }
        logger.info("onCredentialDeleted: the credential ID of " + hVar + " is not equal to " + str2 + ", ignore " + hVar);
        return Unit.INSTANCE;
    }

    @Override // po2.k0
    public final Object l(r0 r0Var) {
        Unit unit = Unit.INSTANCE;
        Object objC = c(unit, r0Var);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : unit;
    }

    @Override // po2.k0
    public final Object m(to2.h hVar, t13.d<? super Unit> dVar) {
        String strA = hVar.a();
        String str = this.f139233l;
        boolean zG = p005kotlin.jvm.internal.s.g(strA, str);
        Logger logger = f139232n;
        if (!zG) {
            logger.info("onJobStatusEvent: the credential ID of " + hVar + " is not equal to " + str + ", ignore it");
            return Unit.INSTANCE;
        }
        fo2.o oVarC = hVar.c();
        if ((oVarC == null ? -1 : b.f139235a[oVarC.ordinal()]) == 1) {
            androidx.room.a0.v(oVarC, "JobStatusEvent: ");
            return null;
        }
        logger.info("onJobStatusEvent: ignore " + oVarC);
        return Unit.INSTANCE;
    }

    @Override // po2.k0
    public final Object p(t13.d<? super Unit> dVar) {
        f(this.f139234m);
        g();
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpo2/j$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, String str2, long j8, long j14, long j15) {
        super(j8, j14, j15);
        str.getClass();
        str2.getClass();
        this.f139233l = str;
        this.f139234m = str2;
    }
}
