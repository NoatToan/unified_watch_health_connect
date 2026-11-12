package po2;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.MaintenanceException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.ProviderErrorCodeException;
import o53.c2;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u000e\u000f\u0010\u0011BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lpo2/c;", "Lpo2/k0;", "", "", "targetPurchaseId", "targetPurchaseUrl", "targetCredentialId", "targetCredentialLink", "", "jobPollingIntervalInMs", "syncPollingIntervalInMs", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJ)V", "d", "b", "c", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends k0<Unit> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Logger f139075p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f139076l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f139077m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z53.b f139078n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d f139079o;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpo2/c$b;", "Lpo2/c$d;", "", "targetPurchaseId", "targetPurchaseUrl", "<init>", "(Lpo2/c;Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f139080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f139081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c2 f139082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f139083d;

        public b(c cVar, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f139083d = cVar;
            this.f139080a = str;
            this.f139081b = str2;
        }

        @Override // po2.c.d
        public final void b() {
            c2 c2Var = this.f139082c;
            if (c2Var != null) {
                c2Var.c(null);
            }
        }

        @Override // po2.c.d
        public final Unit d(boolean z14, to2.h hVar, g gVar) {
            String strF = hVar.f();
            if (strF == null) {
                c.f139075p.info("onPurchaseEvent: null purchaseId in " + hVar + ", ignore it");
                return Unit.INSTANCE;
            }
            String str = this.f139080a;
            if (!p005kotlin.jvm.internal.s.g(str, strF)) {
                c.f139075p.info("onPurchaseEvent: the purchase ID of " + hVar + " is not equal to " + str + ", ignore it");
                return Unit.INSTANCE;
            }
            c cVar = this.f139083d;
            if (!z14) {
                Object objB = cVar.b(gVar, new IllegalStateException("Purchase failed with " + hVar));
                return objB == u13.a.COROUTINE_SUSPENDED ? (Unit) objB : Unit.INSTANCE;
            }
            c.f139075p.info("onPurchaseEvent: received PURCHASE_COMPLETE, switch to Recharging state");
            C2630c c2630c = cVar.new C2630c();
            d dVar = cVar.f139079o;
            if (c2630c != dVar) {
                dVar.b();
                cVar.f139079o = c2630c;
                c2630c.e();
            }
            return Unit.INSTANCE;
        }

        @Override // po2.c.d
        public final void e() {
            c cVar = this.f139083d;
            this.f139082c = ge1.b.T(cVar.e(), null, null, new po2.d(cVar, this, null), 3);
        }
    }

    /* JADX INFO: renamed from: po2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpo2/c$c;", "Lpo2/c$d;", "<init>", "(Lpo2/c;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C2630c extends d {

        /* JADX INFO: renamed from: po2.c$c$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardChargingFlowBuilder$Recharging", f = "CardChargingFlowBuilder.kt", l = {SyslogConstants.LOG_LOCAL1, 141}, m = "onCredentialUpdated", v = 2)
        public static final class a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public to2.h f139085a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f139086b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f139088d;

            public a(t13.d<? super a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f139086b = obj;
                this.f139088d |= Integer.MIN_VALUE;
                return C2630c.this.a(false, null, this);
            }
        }

        public C2630c() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
        
            if (r10 == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
        
            if (r5.c(r8, r0) == r1) goto L35;
         */
        @Override // po2.c.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(boolean z14, to2.h hVar, t13.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i14 = aVar.f139088d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    aVar.f139088d = i14 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object objD = aVar.f139086b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = aVar.f139088d;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 == 2) {
                        o13.r.b(objD);
                        return Unit.INSTANCE;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hVar = aVar.f139085a;
                o13.r.b(objD);
                String str = (String) objD;
                if (str == null) {
                    throw new IllegalStateException("Credential update failed with " + hVar);
                }
                throw new ProviderErrorCodeException(str, "Credential update failed with " + hVar);
            }
            o13.r.b(objD);
            String strA = hVar.a();
            if (strA == null) {
                c.f139075p.info("onCredentialUpdated: null credential ID in " + hVar + ", ignore it");
                return Unit.INSTANCE;
            }
            c cVar = c.this;
            if (p005kotlin.jvm.internal.s.g(cVar.f139076l, strA)) {
                if (z14) {
                    Unit unit = Unit.INSTANCE;
                    aVar.f139085a = null;
                    aVar.f139088d = 2;
                } else {
                    String str2 = cVar.f139077m;
                    aVar.f139085a = hVar;
                    aVar.f139088d = 1;
                    objD = cVar.d(str2, aVar);
                }
                return aVar2;
            }
            c.f139075p.info("onCredentialUpdated: the credential ID of " + hVar + " is not equal to " + cVar.f139076l + ", ignore it");
            return Unit.INSTANCE;
        }

        @Override // po2.c.d
        public final Unit c(to2.h hVar, f fVar) {
            String strA = hVar.a();
            c cVar = c.this;
            if (!p005kotlin.jvm.internal.s.g(strA, cVar.f139076l)) {
                c.f139075p.info("onJobStatusEvent: the credential ID of " + hVar + " is not equal to " + cVar.f139076l + ", ignore it");
                return Unit.INSTANCE;
            }
            fo2.o oVarC = hVar.c();
            if (oVarC == fo2.o.PAUSED) {
                Object objB = cVar.b(fVar, new MaintenanceException("JobStatusEvent: " + oVarC));
                return objB == u13.a.COROUTINE_SUSPENDED ? (Unit) objB : Unit.INSTANCE;
            }
            c.f139075p.info("onJobStatusEvent: ignore " + oVarC);
            return Unit.INSTANCE;
        }

        @Override // po2.c.d
        public final void e() {
            c cVar = c.this;
            cVar.f(cVar.f139077m);
            cVar.g();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpo2/c$d;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class d {
        public Object a(boolean z14, to2.h hVar, t13.d<? super Unit> dVar) {
            return Unit.INSTANCE;
        }

        public void b() {
        }

        public Unit c(to2.h hVar, f fVar) {
            return Unit.INSTANCE;
        }

        public Unit d(boolean z14, to2.h hVar, g gVar) {
            return Unit.INSTANCE;
        }

        public void e() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardChargingFlowBuilder", f = "CardChargingFlowBuilder.kt", l = {190, 169}, m = "onCredentialUpdated", v = 2)
    public static final class e extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f139089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public to2.h f139090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z53.a f139091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f139093e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f139095g;

        public e(t13.d<? super e> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139093e = obj;
            this.f139095g |= Integer.MIN_VALUE;
            return c.this.k(false, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardChargingFlowBuilder", f = "CardChargingFlowBuilder.kt", l = {190, 173}, m = "onJobStatusEvent", v = 2)
    public static final class f extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public to2.h f139096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public z53.a f139097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139098c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f139099d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f139101f;

        public f(t13.d<? super f> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139099d = obj;
            this.f139101f |= Integer.MIN_VALUE;
            return c.this.m(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardChargingFlowBuilder", f = "CardChargingFlowBuilder.kt", l = {190, 165}, m = "onPurchaseEvent", v = 2)
    public static final class g extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f139102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public to2.h f139103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z53.a f139104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f139106e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f139108g;

        public g(t13.d<? super g> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139106e = obj;
            this.f139108g |= Integer.MIN_VALUE;
            return c.this.o(false, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.CardChargingFlowBuilder", f = "CardChargingFlowBuilder.kt", l = {190}, m = "onStart", v = 2)
    public static final class h extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z53.b f139109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f139110b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139112d;

        public h(t13.d<? super h> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139110b = obj;
            this.f139112d |= Integer.MIN_VALUE;
            return c.this.p(this);
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f139075p = gt2.b.f79005a.h("PAY#NEW_FITPAY#CardChargingFlowBuilder");
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, long j8, long j14, long j15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, str4, (i14 & 16) != 0 ? 5000L : j8, (i14 & 32) != 0 ? 10000L : j14, j15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.k0
    public final Object k(boolean z14, to2.h hVar, t13.d<? super Unit> dVar) throws Throwable {
        e eVar;
        z53.a aVar;
        int i14;
        z53.a aVar2;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i15 = eVar.f139095g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                eVar.f139095g = i15 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f139093e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = eVar.f139095g;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                eVar.f139090b = hVar;
                aVar = this.f139078n;
                eVar.f139091c = aVar;
                eVar.f139089a = z14;
                i14 = 0;
                eVar.f139092d = 0;
                eVar.f139095g = 1;
                if (aVar.c(eVar) != aVar3) {
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = eVar.f139091c;
                try {
                    o13.r.b(obj);
                    Unit unit = Unit.INSTANCE;
                    aVar2.e(null);
                    return unit;
                } catch (Throwable th3) {
                    th = th3;
                    aVar2.e(null);
                    throw th;
                }
            }
            int i17 = eVar.f139092d;
            boolean z15 = eVar.f139089a;
            z53.a aVar4 = eVar.f139091c;
            to2.h hVar2 = eVar.f139090b;
            o13.r.b(obj);
            aVar = aVar4;
            i14 = i17;
            z14 = z15;
            hVar = hVar2;
            d dVar2 = this.f139079o;
            eVar.f139090b = null;
            eVar.f139091c = aVar;
            eVar.f139089a = z14;
            eVar.f139092d = i14;
            eVar.f139095g = 2;
            if (dVar2.a(z14, hVar, eVar) != aVar3) {
                aVar2 = aVar;
                Unit unit2 = Unit.INSTANCE;
                aVar2.e(null);
                return unit2;
            }
            return aVar3;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
            aVar2.e(null);
            throw th;
        }
    }

    @Override // po2.k0
    public final Object l(r0 r0Var) {
        Unit unit = Unit.INSTANCE;
        Object objC = c(unit, r0Var);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.k0
    public final Object m(to2.h hVar, t13.d<? super Unit> dVar) throws Throwable {
        f fVar;
        z53.a aVar;
        int i14;
        Throwable th3;
        z53.a aVar2;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i15 = fVar.f139101f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                fVar.f139101f = i15 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f139099d;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = fVar.f139101f;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                fVar.f139096a = hVar;
                aVar = this.f139078n;
                fVar.f139097b = aVar;
                i14 = 0;
                fVar.f139098c = 0;
                fVar.f139101f = 1;
                if (aVar.c(fVar) != aVar3) {
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = fVar.f139097b;
                try {
                    o13.r.b(obj);
                    Unit unit = Unit.INSTANCE;
                    aVar2.e(null);
                    return unit;
                } catch (Throwable th4) {
                    th3 = th4;
                    aVar2.e(null);
                    throw th3;
                }
            }
            int i17 = fVar.f139098c;
            z53.a aVar4 = fVar.f139097b;
            to2.h hVar2 = fVar.f139096a;
            o13.r.b(obj);
            aVar = aVar4;
            i14 = i17;
            hVar = hVar2;
            d dVar2 = this.f139079o;
            fVar.f139096a = null;
            fVar.f139097b = aVar;
            fVar.f139098c = i14;
            fVar.f139101f = 2;
            if (dVar2.c(hVar, fVar) != aVar3) {
                aVar2 = aVar;
                Unit unit2 = Unit.INSTANCE;
                aVar2.e(null);
                return unit2;
            }
            return aVar3;
        } catch (Throwable th5) {
            z53.a aVar5 = aVar;
            th3 = th5;
            aVar2 = aVar5;
            aVar2.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.k0
    public final Object o(boolean z14, to2.h hVar, t13.d<? super Unit> dVar) throws Throwable {
        g gVar;
        z53.a aVar;
        int i14;
        z53.a aVar2;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i15 = gVar.f139108g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                gVar.f139108g = i15 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f139106e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i16 = gVar.f139108g;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                gVar.f139103b = hVar;
                aVar = this.f139078n;
                gVar.f139104c = aVar;
                gVar.f139102a = z14;
                i14 = 0;
                gVar.f139105d = 0;
                gVar.f139108g = 1;
                if (aVar.c(gVar) != aVar3) {
                }
                return aVar3;
            }
            if (i16 != 1) {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar2 = gVar.f139104c;
                try {
                    o13.r.b(obj);
                    Unit unit = Unit.INSTANCE;
                    aVar2.e(null);
                    return unit;
                } catch (Throwable th3) {
                    th = th3;
                    aVar2.e(null);
                    throw th;
                }
            }
            int i17 = gVar.f139105d;
            boolean z15 = gVar.f139102a;
            z53.a aVar4 = gVar.f139104c;
            to2.h hVar2 = gVar.f139103b;
            o13.r.b(obj);
            aVar = aVar4;
            i14 = i17;
            z14 = z15;
            hVar = hVar2;
            d dVar2 = this.f139079o;
            gVar.f139103b = null;
            gVar.f139104c = aVar;
            gVar.f139102a = z14;
            gVar.f139105d = i14;
            gVar.f139108g = 2;
            if (dVar2.d(z14, hVar, gVar) != aVar3) {
                aVar2 = aVar;
                Unit unit2 = Unit.INSTANCE;
                aVar2.e(null);
                return unit2;
            }
            return aVar3;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
            aVar2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.k0
    public final Object p(t13.d<? super Unit> dVar) {
        h hVar;
        z53.b bVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i14 = hVar.f139112d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f139112d = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object obj = hVar.f139110b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f139112d;
        if (i15 == 0) {
            o13.r.b(obj);
            z53.b bVar2 = this.f139078n;
            hVar.f139109a = bVar2;
            hVar.f139112d = 1;
            if (bVar2.c(hVar) == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = hVar.f139109a;
            o13.r.b(obj);
        }
        try {
            this.f139079o.e();
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpo2/c$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2, String str3, String str4, long j8, long j14, long j15) {
        super(j8, j14, j15);
        kg.f.p(str, str2, str3, str4);
        this.f139076l = str3;
        this.f139077m = str4;
        this.f139078n = z53.c.a();
        this.f139079o = new b(this, str, str2);
    }
}
