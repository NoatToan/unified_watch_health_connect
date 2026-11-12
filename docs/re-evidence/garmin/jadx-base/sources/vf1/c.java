package vf1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIGarminHealth;
import com.garmin.proto.generated.SaMDEcg;
import e23.p;
import gg1.v0;
import java.util.ArrayList;
import java.util.Iterator;
import kd0.m;
import kx2.g;
import o13.r;
import o53.b0;
import o53.c0;
import o53.e2;
import o53.s0;
import o53.t1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import q92.x;
import u53.o;
import v13.i;
import vb.h;
import z10.d1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lvf1/c;", "Lvf1/b;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements vf1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f177874a = new ArrayList();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.samd.domain.session.SaMDAppSessionDelegateImpl$onMFARequired$1", f = "SaMDAppSessionDelegateImpl.kt", l = {92, 94}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f177875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f177876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ rf1.b f177877c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.samd.domain.session.SaMDAppSessionDelegateImpl$onMFARequired$1$1", f = "SaMDAppSessionDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f177878a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ rf1.b f177879b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f177880c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, rf1.b bVar, boolean z14, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f177878a = context;
                this.f177879b = bVar;
                this.f177880c = z14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f177878a, this.f177879b, this.f177880c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                new com.garmin.android.apps.connectmobile.samd.presentation.mfa.a(this.f177878a).a(this.f177879b, this.f177880c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, rf1.b bVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f177876b = context;
            this.f177877c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f177876b, this.f177877c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (ge1.b.e0(r1, r3, r7) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f177875a;
            if (i14 == 0) {
                r.b(obj);
                ff0.i iVar = (ff0.i) KoinJavaComponent.get$default(ff0.i.class, null, null, 6, null);
                this.f177875a = 1;
                obj = iVar.b(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            qu.c cVar = (qu.c) obj;
            cVar.getClass();
            x53.c cVar2 = s0.f129406a;
            t1 t1Var = o.f168762a;
            a aVar2 = new a(this.f177876b, this.f177877c, cVar instanceof qu.c.a, null);
            this.f177875a = 2;
        }
    }

    /* JADX INFO: renamed from: vf1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.samd.domain.session.SaMDAppSessionDelegateImpl$onMFATokenNotBoundToOAuth2DI$1", f = "SaMDAppSessionDelegateImpl.kt", l = {60}, m = "invokeSuspend", v = 2)
    public static final class C3326c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f177881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f177882b;

        /* JADX INFO: renamed from: vf1.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.samd.domain.session.SaMDAppSessionDelegateImpl$onMFATokenNotBoundToOAuth2DI$1$1", f = "SaMDAppSessionDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f177883a;

            public a(t13.d<? super a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(dVar);
                aVar.f177883a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                yr1.e.b("onMFATokenNotBoundToOAuth2DI");
                a2 a2Var = a2.USER;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SaMDAppSessionDelegate", "[onMFATokenNotBoundToOAuth2DI] Sync initiated for all devices");
                return Unit.INSTANCE;
            }
        }

        public C3326c(t13.d<? super C3326c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C3326c c3326c = new C3326c(dVar);
            c3326c.f177882b = obj;
            return c3326c;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C3326c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f177882b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f177881a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).u();
                    a2 a2Var = a2.USER;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "SaMDAppSessionDelegate", "[onMFATokenNotBoundToOAuth2DI] MFA token bound successfully");
                    x53.c cVar = s0.f129406a;
                    t1 t1Var = o.f168762a;
                    a aVar2 = new a(null);
                    this.f177882b = b0Var;
                    this.f177881a = 1;
                    if (ge1.b.e0(t1Var, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Exception e4) {
                a2 a2Var2 = a2.USER;
                i2.f36769a.getClass();
                i2.a.g(a2Var2, "SaMDAppSessionDelegate", e4);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    @Override // gx2.a
    public final boolean a() {
        return ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).a();
    }

    @Override // gx2.a
    public final boolean b() {
        return d1.h(x.DI_CONNECT_UPLOAD, true) && !d1.k();
    }

    @Override // gx2.a
    public final void c(kx2.e eVar) {
        String str = eVar.f107137f;
        a2 a2Var = a2.ACTIVITIES;
        long f92746j = eVar.f107136e.getF92746j();
        g gVar = eVar.f107132a;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SaMDAppSessionDelegate", "[onFileTransferUpdate] device=" + f92746j + " state=" + gVar);
        if (gVar == g.f107144b) {
            i2.a.b(a2Var, "SaMDAppSessionDelegate", "[onFileTransferUpdate] My Day refresh needed");
            bv.b.f21239a.getClass();
            ((m) bv.b.a()).p();
            if (eVar.f107133b == GDIGarminHealth.FileTransferRequest.FileType.ECG) {
                jf0.a aVar = (jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null);
                if (aVar.c().c()) {
                    i2.a.b(a2Var, "SaMDAppSessionDelegate", "[onFileTransferUpdate] display notification for activity " + str);
                    aVar.e(str);
                }
            }
        }
        Iterator it = this.f177874a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    @Override // gx2.a
    public final void d() {
        e2 e2VarH = ge1.b.h();
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(t13.g.a.C3052a.d(x53.b.f189152a, e2VarH)), null, null, new C3326c(null), 3);
    }

    @Override // gx2.a
    public final void e(long j8, String str, SaMDEcg.FirstReadResult firstReadResult) {
        str.getClass();
        a2 a2Var = a2.ONBOARDING;
        String str2 = "[onFirstECGReadResult] result status=" + firstReadResult.getStatus();
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SaMDAppSessionDelegate", str2);
        if (firstReadResult.getStatus() == SaMDEcg.FirstReadResult.Status.SUCCESS) {
            e2 e2VarH = ge1.b.h();
            x53.c cVar = s0.f129406a;
            ge1.b.T(c0.a(t13.g.a.C3052a.d(x53.b.f189152a, e2VarH)), null, null, new d(j8, str, this, null), 3);
        } else if (firstReadResult.getStatus() == SaMDEcg.FirstReadResult.Status.TIMEOUT) {
            Iterator it = this.f177874a.iterator();
            while (it.hasNext()) {
                ((e) it.next()).b(j8, str);
            }
        }
    }

    @Override // gx2.a
    public final String f() {
        return j().f204881b;
    }

    @Override // gx2.a
    public final String g() {
        return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).g();
    }

    @Override // vf1.b
    public final void h(e eVar) {
        this.f177874a.remove(eVar);
    }

    @Override // vf1.b
    public final void i(e eVar) {
        this.f177874a.add(eVar);
    }

    @Override // gx2.a
    public final zi2.a j() {
        v0.T.getClass();
        return v0.a.b().f77335a;
    }

    @Override // gx2.a
    public final void k(kx2.a aVar) {
        if (!((uf1.a) KoinJavaComponent.get$default(uf1.a.class, null, null, 6, null)).c().a()) {
            a2 a2Var = a2.USER;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SaMDAppSessionDelegate", "[onMFARequired] no GHS account");
            return;
        }
        i2.f36769a.getClass();
        i2.a.b(a2.USER, "SaMDAppSessionDelegate", "[onMFARequired] MFA required for " + aVar);
        rf1.b bVarA = aVar != null ? qf1.a.a(aVar) : null;
        Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).getF104108a();
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new b(contextC, bVarA, null), 3);
        Iterator it = this.f177874a.iterator();
        while (it.hasNext()) {
            ((e) it.next()).getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvf1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
