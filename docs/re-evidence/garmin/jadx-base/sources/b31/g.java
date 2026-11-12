package b31;

import d53.t;
import e23.p;
import i31.e0;
import i31.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import o53.b0;
import o53.c0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.c1;
import p13.h0;
import p13.l0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lb31/g;", "Lb31/f;", "", "Lf12/l;", "userSettings", "Lb31/a;", "onboardingRepository", "Li31/e0;", "updateDeviceOnboardingItemUseCase", "Li31/s;", "getOnboardingDeviceFilterTypeUseCase", "Lo53/z;", "ioDispatcher", "<init>", "(Lf12/l;Lb31/a;Li31/e0;Li31/s;Lo53/z;)V", "a", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f15611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b31.a f15612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f15613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f15614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f15615e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.data.OnboardingChecksRepositoryImpl$completeDeviceOnboardingCheck$1", f = "OnboardingChecksRepositoryImpl.kt", l = {63, 64, 70}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f15616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e31.a f15617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set f15618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator f15619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d31.a f15620e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f15621f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15622g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f15623h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f15624i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f15625j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f15627l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e31.a f15628m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Set<String> f15629n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, e31.a aVar, Set<String> set, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f15627l = j8;
            this.f15628m = aVar;
            this.f15629n = set;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = g.this.new b(this.f15627l, this.f15628m, this.f15629n, dVar);
            bVar.f15625j = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x008b  */
        /* JADX WARN: Code duplicated, block: B:22:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:25:0x00cd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00cd -> B:26:0x00e9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0177 -> B:38:0x017b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 414
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b31.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.data.OnboardingChecksRepositoryImpl$completeOnboardingCheck$1", f = "OnboardingChecksRepositoryImpl.kt", l = {32, 33, 39}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f15630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e31.a f15631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set f15632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator f15633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d31.a f15634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15636g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f15637h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f15638i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ e31.a f15640k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Set<String> f15641l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e31.a aVar, Set<String> set, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f15640k = aVar;
            this.f15641l = set;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = g.this.new c(this.f15640k, this.f15641l, dVar);
            cVar.f15638i = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x007e  */
        /* JADX WARN: Code duplicated, block: B:21:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:24:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:26:0x00df  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:30:0x00f8 A[LOOP:0: B:29:0x00f6->B:30:0x00f8, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:33:0x010c  */
        /* JADX WARN: Code duplicated, block: B:36:0x015f  */
        /* JADX WARN: Code duplicated, block: B:38:0x016c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00bf -> B:25:0x00d8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x015f -> B:37:0x0165). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 381
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b31.g.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    public g(f12.l lVar, b31.a aVar, e0 e0Var, s sVar, z zVar) {
        lVar.getClass();
        aVar.getClass();
        e0Var.getClass();
        sVar.getClass();
        zVar.getClass();
        this.f15611a = lVar;
        this.f15612b = aVar;
        this.f15613c = e0Var;
        this.f15614d = sVar;
        this.f15615e = zVar;
    }

    public static String q(long j8) {
        return org.apache.commons.lang3.e.e(j8, "onboarding_device_checks_completed_");
    }

    @Override // b31.f
    public final void a(long j8, e31.a aVar) {
        aVar.getClass();
        String strQ = q(j8);
        f12.l lVar = this.f15611a;
        LinkedHashSet linkedHashSetI = c1.i(lVar.L1(strQ), aVar.f62768a);
        lVar.X1(strQ, linkedHashSetI);
        ge1.b.T(c0.a(this.f15615e), null, null, new b(j8, aVar, linkedHashSetI, null), 3);
    }

    @Override // b31.f
    public final void b(e31.a aVar) {
        aVar.getClass();
        f12.l lVar = this.f15611a;
        LinkedHashSet linkedHashSetI = c1.i(lVar.L1("onboarding_checks_completed"), aVar.f62768a);
        lVar.X1("onboarding_checks_completed", linkedHashSetI);
        ge1.b.T(c0.a(this.f15615e), null, null, new c(aVar, linkedHashSetI, null), 3);
    }

    @Override // b31.f
    public final void c(long j8) {
        this.f15611a.h2(j8, "onboarding_prompts_server_call_timestamp");
    }

    @Override // b31.f
    public final Set<Long> d() {
        Set<String> setL1 = this.f15611a.L1("onboarding_device_server_call_devices");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setL1.iterator();
        while (it.hasNext()) {
            Long lJ = t.j((String) it.next());
            if (lJ != null) {
                arrayList.add(lJ);
            }
        }
        return h0.g1(arrayList);
    }

    @Override // b31.f
    public final boolean e(e31.a... aVarArr) {
        Set<String> setL1 = this.f15611a.L1("onboarding_checks_completed");
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (e31.a aVar : aVarArr) {
            arrayList.add(aVar.f62768a);
        }
        return setL1.containsAll(arrayList);
    }

    @Override // b31.f
    public final boolean f(long j8, e31.a... aVarArr) {
        Set<String> setL1 = this.f15611a.L1(q(j8));
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (e31.a aVar : aVarArr) {
            arrayList.add(aVar.f62768a);
        }
        return setL1.containsAll(arrayList);
    }

    @Override // b31.f
    public final void g(long j8) {
        this.f15611a.X1(q(j8), l0.f134950a);
    }

    @Override // b31.f
    public final void h(long j8, Set<Long> set) {
        set.getClass();
        f12.l lVar = this.f15611a;
        lVar.h2(j8, "onboarding_device_server_call_timestamp");
        Set<Long> set2 = set;
        ArrayList arrayList = new ArrayList(y.r(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        lVar.X1("onboarding_device_server_call_devices", h0.g1(arrayList));
    }

    @Override // b31.f
    public final void i(long j8) {
        f12.l lVar = this.f15611a;
        lVar.X1("onboarding_device_server_call_devices", c1.f(lVar.L1("onboarding_device_server_call_devices"), String.valueOf(j8)));
    }

    @Override // b31.f
    public final void j() {
        this.f15611a.X1("onboarding_device_server_call_devices", l0.f134950a);
    }

    @Override // b31.f
    public final void k(e31.a aVar) {
        aVar.getClass();
        f12.l lVar = this.f15611a;
        lVar.X1("onboarding_checks_completed", c1.f(lVar.L1("onboarding_checks_completed"), aVar.f62768a));
    }

    @Override // b31.f
    public final void l(long j8, e31.a aVar) {
        aVar.getClass();
        String strQ = q(j8);
        f12.l lVar = this.f15611a;
        lVar.X1(strQ, c1.f(lVar.L1(strQ), aVar.f62768a));
    }

    @Override // b31.f
    public final boolean m(String str) {
        return this.f15611a.L1("onboarding_partner_prompts_completed").contains(str);
    }

    @Override // b31.f
    public final long n() {
        return this.f15611a.D3(0L, "onboarding_device_server_call_timestamp");
    }

    @Override // b31.f
    public final void o(String str) {
        str.getClass();
        f12.l lVar = this.f15611a;
        lVar.X1("onboarding_partner_prompts_completed", c1.i(lVar.L1("onboarding_partner_prompts_completed"), str));
    }

    @Override // b31.f
    public final long p() {
        return this.f15611a.D3(0L, "onboarding_prompts_server_call_timestamp");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lb31/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "USER_ONBOARDING_CHECKS_COMPLETED", "USER_DEVICE_ONBOARDING_CHECKS_COMPLETED", "PARTNER_ONBOARDING_PROMPTS_COMPLETED", "ONBOARDING_PROMPTS_SERVER_CALL_TIMESTAMP", "ONBOARDING_DEVICE_SERVER_CALL_TIMESTAMP", "ONBOARDING_DEVICE_SERVER_CALL_DEVICES", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(f12.l lVar, b31.a aVar, e0 e0Var, s sVar, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 16) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(lVar, aVar, e0Var, sVar, zVar);
    }
}
