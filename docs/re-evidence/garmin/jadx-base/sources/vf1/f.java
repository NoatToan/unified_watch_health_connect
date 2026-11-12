package vf1;

import am.j;
import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.samd.exception.MFARequiredException;
import e23.l;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c0;
import o53.e2;
import o53.s0;
import o72.t;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u;
import px2.o;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lvf1/f;", "Lvf1/a;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements vf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f177895a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.samd.domain.session.SaMDAppSessionImpl$launchWithCoroutineScope$1", f = "SaMDAppSessionImpl.kt", l = {97}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f177896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<t13.d<? super Unit>, Object> f177897b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(l<? super t13.d<? super Unit>, ? extends Object> lVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f177897b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f177897b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f177896a;
            if (i14 == 0) {
                r.b(obj);
                this.f177896a = 1;
                if (this.f177897b.invoke(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.samd.domain.session.SaMDAppSessionImpl$updateSaMDCustomerGUIDMismatch$1", f = "SaMDAppSessionImpl.kt", l = {85}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f177898a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f177900c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, t13.d<? super c> dVar) {
            super(1, dVar);
            this.f177900c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return f.this.new c(this.f177900c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f177898a;
            if (i14 == 0) {
                r.b(obj);
                a2 a2Var = a2.USER;
                long j8 = this.f177900c;
                String strE = org.apache.commons.lang3.e.e(j8, "[updateSaMDCustomerGUIDMismatch] customer GUID mismatch deviceUnitId=");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SaMDAppSession", strE);
                new gx2.b();
                this.f177898a = 1;
                gx2.b.d dVar = gx2.b.f80060a;
                dVar.getClass();
                gx2.b.d.b().warn("onCustomerGUIDMismatch -> unitId " + j8);
                dVar.getClass();
                Object objE0 = ge1.b.e0(gx2.b.d.a(), new gx2.c(j8, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.samd.domain.session.SaMDAppSessionImpl$updateSaMDDevicePaired$1", f = "SaMDAppSessionImpl.kt", l = {64}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f177901a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f177903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f177904d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j8, String str, t13.d<? super d> dVar) {
            super(1, dVar);
            this.f177903c = j8;
            this.f177904d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return f.this.new d(this.f177903c, this.f177904d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f177901a;
            if (i14 == 0) {
                r.b(obj);
                a2 a2Var = a2.USER;
                long j8 = this.f177903c;
                String str = this.f177904d;
                String strU = v.h.u(j8, "[updateSaMDDevicePaired] device paired deviceUnitId=", " macAddress=", str);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SaMDAppSession", strU);
                gx2.b bVar = new gx2.b();
                this.f177901a = 1;
                if (bVar.b(j8, str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.samd.domain.session.SaMDAppSessionImpl$updateSaMDDeviceRemoved$1", f = "SaMDAppSessionImpl.kt", l = {71}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f177905a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f177907c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j8, t13.d<? super e> dVar) {
            super(1, dVar);
            this.f177907c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return f.this.new e(this.f177907c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f177905a;
            if (i14 == 0) {
                r.b(obj);
                a2 a2Var = a2.USER;
                long j8 = this.f177907c;
                String strE = org.apache.commons.lang3.e.e(j8, "[updateSaMDDeviceRemoved] device removed deviceUnitId=");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SaMDAppSession", strE);
                new gx2.b();
                this.f177905a = 1;
                gx2.b.d dVar = gx2.b.f80060a;
                dVar.getClass();
                gx2.b.d.b().debug("onDeviceRemoved -> unitId " + j8);
                dVar.getClass();
                Object objE0 = ge1.b.e0(gx2.b.d.a(), new gx2.c(j8, null), this);
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 != obj2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: vf1.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.samd.domain.session.SaMDAppSessionImpl$updateSaMDUploadConsentChanged$1", f = "SaMDAppSessionImpl.kt", l = {78}, m = "invokeSuspend", v = 2)
    public static final class C3327f extends i implements l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f177908a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f177910c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3327f(boolean z14, t13.d<? super C3327f> dVar) {
            super(1, dVar);
            this.f177910c = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return f.this.new C3327f(this.f177910c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((C3327f) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f177908a;
            if (i14 == 0) {
                r.b(obj);
                a2 a2Var = a2.USER;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SaMDAppSession", "[updateSaMDUploadConsentChanged] upload consent changed");
                new gx2.b();
                this.f177908a = 1;
                gx2.b.f80060a.getClass();
                if (ge1.b.e0(gx2.b.d.a(), new gx2.g(this.f177910c, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.samd.domain.session.SaMDAppSessionImpl$updateSaMDUserSignedIn$1", f = "SaMDAppSessionImpl.kt", l = {32, 33}, m = "invokeSuspend", v = 2)
    public static final class g extends i implements l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f177911a;

        public g(t13.d<? super g> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return f.this.new g(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        
            if (r4 == r3) goto L20;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object objE0;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f177911a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    gx2.b bVar = new gx2.b();
                    gx2.b.f80060a.getClass();
                    gx2.b.d.b().debug("onUserSignedIn");
                    ge1.b.T(c0.a(gx2.b.d.a()), null, null, new gx2.h(bVar, null), 3);
                    this.f177911a = 1;
                    objA = gx2.b.a(this);
                    if (objA == aVar) {
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    r.b(obj);
                    objA = obj;
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                    objE0 = obj;
                }
                kx2.a[] aVarArr = (kx2.a[]) objE0;
                if (aVarArr.length == 0) {
                    a2 a2Var = a2.USER;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "SaMDAppSession", "[updateSaMDUserSignedIn] no device health features enabled");
                } else {
                    a2 a2Var2 = a2.USER;
                    String strConcat = "[updateSaMDUserSignedIn] device health features enabled: ".concat(u.P(aVarArr, null, null, null, null, 63));
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "SaMDAppSession", strConcat);
                    boolean z14 = u.z(aVarArr, kx2.a.ECG);
                    ((jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null)).c().d(z14);
                    i2.a.b(a2Var2, "SaMDAppSession", "[updateSaMDUserSignedIn] ECG preference updated enabled=" + z14);
                }
                return Unit.INSTANCE;
                jx2.b bVar2 = (jx2.b) objA;
                this.f177911a = 2;
                jx2.b.a aVar2 = jx2.b.f101511b;
                bVar2.getClass();
                gx2.b.f80060a.getClass();
                objE0 = ge1.b.e0(gx2.b.d.a(), new jx2.f(bVar2, 3600000L, null), this);
            } catch (Throwable th3) {
                if (th3 instanceof MFARequiredException) {
                    a2 a2Var3 = a2.USER;
                    i2.f36769a.getClass();
                    i2.a.p(a2Var3, "SaMDAppSession", "[updateSaMDUserSignedIn] MFA required");
                    ((vf1.b) KoinJavaComponent.get$default(vf1.b.class, null, null, 6, null)).k(kx2.a.ECG);
                } else {
                    a2 a2Var4 = a2.USER;
                    String strP = j.p("[updateSaMDUserSignedIn] ", th3);
                    i2.f36769a.getClass();
                    i2.a.f(a2Var4, "SaMDAppSession", strP);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.samd.domain.session.SaMDAppSessionImpl$updateSaMDUserSignedOut$1", f = "SaMDAppSessionImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends i implements l<t13.d<? super Unit>, Object> {
        public h(t13.d<? super h> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return f.this.new h(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a2 a2Var = a2.USER;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SaMDAppSession", "[updateSaMDUserSignedOut] user signed out");
            new gx2.b();
            gx2.b.f80060a.getClass();
            gx2.b.d.b().debug("onUserSignedOut");
            ge1.b.T(c0.a(gx2.b.d.a()), null, null, new gx2.i(null), 3);
            return Unit.INSTANCE;
        }
    }

    public static void i(l lVar) {
        e2 e2VarH = ge1.b.h();
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(t13.g.a.C3052a.d(x53.b.f189152a, e2VarH)), null, null, new b(lVar, null), 3);
    }

    @Override // vf1.a
    public final void a(long j8, String str) {
        i(new d(j8, str, null));
    }

    @Override // vf1.a
    public final void b() {
        i(new h(null));
    }

    @Override // vf1.a
    public final void c(boolean z14) {
        i(new C3327f(z14, null));
    }

    @Override // vf1.a
    public final void d(long j8) {
        i(new e(j8, null));
    }

    @Override // vf1.a
    public final void e(long j8) {
        i(new c(j8, null));
    }

    @Override // vf1.a
    public final void f(Context context, vf1.b bVar) {
        bVar.getClass();
        gx2.b.f80060a.getClass();
        gx2.b.f80062c = context.getApplicationContext();
        gx2.b.f80061b = bVar;
        Context context2 = gx2.b.f80062c;
        context2.getClass();
        t.f130587a = wc2.c.b(context2, "SAMD", "5.2.1");
        t.f130588b = wc2.c.a(context2);
        gx2.b.d.b().debug("initialized");
    }

    @Override // vf1.a
    public final void g() {
        i(new g(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vf1.a
    public final o h(rs2.c cVar) {
        cVar.getClass();
        new gx2.b();
        kx2.d dVar = new kx2.d(true, true, true);
        o.f141834m.getClass();
        boolean z14 = dVar.f107130b || dVar.f107129a || dVar.f107131c;
        zj2.e eVar = null;
        Object[] objArr = 0;
        if (z14) {
            synchronized (qx2.a.f148445a) {
                qx2.a.g(dVar, "APP_SAMD_CAPABILITIES");
            }
            return new o(cVar, dVar, eVar, objArr == true ? 1 : 0);
        }
        if (z14) {
            u0.r();
            return null;
        }
        Logger loggerL = ge1.b.L("ProtoHandler_" + cVar.getF92746j() + "_noinstance");
        StringBuilder sb3 = new StringBuilder("create: app -> ");
        sb3.append(dVar);
        loggerL.error(sb3.toString());
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvf1/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
