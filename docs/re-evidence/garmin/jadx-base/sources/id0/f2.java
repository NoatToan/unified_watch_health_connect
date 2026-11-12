package id0;

import android.content.Context;
import android.util.Base64;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.List;
import java.util.Set;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleDSLKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lid0/f2;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2 f92728a = new f2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Module f92729b = ModuleDSLKt.module$default(false, new r1(11), 1, null);

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id0/f2$a", "Ltg2/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements tg2.a {
        @Override // tg2.a
        public final void a(h4.r rVar, p3.m mVar, int i14) {
            rVar.getClass();
            mVar.C(1232440741);
            p3.x1 x1Var = p3.n.f135158a;
            g02.s0.b(rVar, 0.0f, mVar, i14 & 14, 2);
            mVar.f();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id0/f2$b", "Lfg2/z;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements fg2.z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Scope f92730a;

        public b(Scope scope) {
            this.f92730a = scope;
        }

        @Override // fg2.z
        public final Object a(v13.c cVar) {
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            if (((kg1.a) Scope.get$default(this.f92730a, t0Var.b(kg1.a.class), (Qualifier) null, (e23.a) null, 6, (Object) null)).H()) {
                return Boolean.FALSE;
            }
            return ((zd0.j1) Scope.get$default(this.f92730a, t0Var.b(zd0.j1.class), (Qualifier) null, (e23.a) null, 6, (Object) null)).l(c80.q.LIVE_ACTIVITY, cVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id0/f2$c", "Lfg2/c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements fg2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zd0.b0 f92731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final au0.x f92732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Scope f92733c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.di.LiveActivityAppDI$module$1$7$1", f = "LiveActivityAppDI.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "getDeviceInfo", v = 2)
        public static final class a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f92734a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f92736c;

            public a(t13.d<? super a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f92734a = obj;
                this.f92736c |= Integer.MIN_VALUE;
                return c.this.g(0L, this);
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id0/f2$c$b", "Lrs2/c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements rs2.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f92737a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f92738b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f92739c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final p13.l0 f92740d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final String f92741e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f92742f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f92743g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final int f92744h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final int f92745i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final long f92746j;

            public b(sd2.f fVar) {
                Integer numI;
                String strD0 = fVar.d0();
                this.f92737a = strD0;
                int iIntValue = -1;
                this.f92738b = -1;
                String strQ = fVar.Q();
                this.f92739c = strQ;
                this.f92740d = p13.l0.f134950a;
                this.f92741e = strD0 == null ? strQ == null ? "" : strQ : strD0;
                String productDisplayName = fVar.getProductDisplayName();
                productDisplayName.getClass();
                this.f92742f = productDisplayName;
                this.f92743g = fVar.isDualBluetoothConnection();
                String productNumber = fVar.getProductNumber();
                productNumber.getClass();
                Integer numI2 = d53.t.i(productNumber);
                this.f92744h = numI2 != null ? numI2.intValue() : -1;
                String softwareVersion = fVar.getSoftwareVersion();
                if (softwareVersion != null && (numI = d53.t.i(softwareVersion)) != null) {
                    iIntValue = numI.intValue();
                }
                this.f92745i = iIntValue;
                this.f92746j = fVar.getUnitID();
            }

            @Override // rs2.c
            /* JADX INFO: renamed from: getBleMacAddress, reason: from getter */
            public final String getF92737a() {
                return this.f92737a;
            }

            @Override // rs2.c
            /* JADX INFO: renamed from: getBluetoothLimitation, reason: from getter */
            public final int getF92738b() {
                return this.f92738b;
            }

            @Override // rs2.c
            /* JADX INFO: renamed from: getBtcMacAddress, reason: from getter */
            public final String getF92739c() {
                return this.f92739c;
            }

            @Override // rs2.c
            public final Set<Integer> getConfigurationFlags() {
                return this.f92740d;
            }

            @Override // rs2.c
            /* JADX INFO: renamed from: getConnectionId, reason: from getter */
            public final String getF92741e() {
                return this.f92741e;
            }

            @Override // rs2.c
            /* JADX INFO: renamed from: getDeviceName, reason: from getter */
            public final String getF92742f() {
                return this.f92742f;
            }

            @Override // rs2.c
            /* JADX INFO: renamed from: getProductNumber, reason: from getter */
            public final int getF92744h() {
                return this.f92744h;
            }

            @Override // rs2.c
            /* JADX INFO: renamed from: getSoftwareVersion, reason: from getter */
            public final int getF92745i() {
                return this.f92745i;
            }

            @Override // rs2.c
            /* JADX INFO: renamed from: getUnitId, reason: from getter */
            public final long getF92746j() {
                return this.f92746j;
            }

            @Override // rs2.c
            /* JADX INFO: renamed from: isDualBluetoothConnection, reason: from getter */
            public final boolean getF92743g() {
                return this.f92743g;
            }
        }

        /* JADX INFO: renamed from: id0.f2$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lsd2/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.di.LiveActivityAppDI$module$1$7$1$getDeviceInfo$deviceRecord$1", f = "LiveActivityAppDI.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1772c extends v13.i implements e23.p<o53.b0, t13.d<? super sd2.f>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f92747a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1772c(long j8, t13.d<? super C1772c> dVar) {
                super(2, dVar);
                this.f92747a = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1772c(this.f92747a, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super sd2.f> dVar) {
                return ((C1772c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                rd2.f.a().f152045a.getClass();
                return rd2.j.i(this.f92747a, null);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.di.LiveActivityAppDI$module$1$7$1", f = "LiveActivityAppDI.kt", l = {126}, m = "getUnsupportedItemsByDeviceId", v = 2)
        public static final class d extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f92748a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f92750c;

            public d(t13.d<? super d> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f92748a = obj;
                this.f92750c |= Integer.MIN_VALUE;
                return c.this.f(0L, this);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsd2/f;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.di.LiveActivityAppDI$module$1$7$1$getUnsupportedItemsByDeviceId$device$1", f = "LiveActivityAppDI.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super sd2.f>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f92751a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(long j8, t13.d<? super e> dVar) {
                super(2, dVar);
                this.f92751a = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new e(this.f92751a, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super sd2.f> dVar) {
                return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                rd2.f.a().f152045a.getClass();
                return rd2.j.i(this.f92751a, null);
            }
        }

        public c(Scope scope) {
            this.f92733c = scope;
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            this.f92731a = (zd0.b0) Scope.get$default(scope, t0Var.b(zd0.b0.class), (Qualifier) null, (e23.a) null, 6, (Object) null);
            this.f92732b = (au0.x) Scope.get$default(scope, t0Var.b(au0.x.class), (Qualifier) null, (e23.a) null, 6, (Object) null);
        }

        @Override // fg2.c
        public final String a(String str) {
            str.getClass();
            cx2.j.a aVar = cx2.j.f56682a;
            Context contextAndroidContext = ModuleExtKt.androidContext(this.f92733c);
            byte[] bytes = str.getBytes(d53.c.f57666b);
            bytes.getClass();
            return cx2.j.a.b(aVar, contextAndroidContext, Base64.encodeToString(bytes, 0));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // fg2.c
        public final Object b(long j8, v13.c cVar) throws Throwable {
            g2 g2Var;
            u53.d dVar;
            if (cVar instanceof g2) {
                g2Var = (g2) cVar;
                int i14 = g2Var.f92766d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    g2Var.f92766d = i14 - Integer.MIN_VALUE;
                } else {
                    g2Var = new g2(this, cVar);
                }
            } else {
                g2Var = new g2(this, cVar);
            }
            Object obj = g2Var.f92764b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = g2Var.f92766d;
            if (i15 == 0) {
                o13.r.b(obj);
                x53.c cVar2 = o53.s0.f129406a;
                u53.d dVarA = o53.c0.a(x53.b.f189152a);
                try {
                    ic0.a aVar2 = (ic0.a) KoinJavaComponent.get$default(ic0.a.class, null, new i3.f2(dVarA, 7), 2, null);
                    g2Var.f92763a = dVarA;
                    g2Var.f92766d = 1;
                    Object objA = aVar2.a(j8, g2Var);
                    if (objA == aVar) {
                        return aVar;
                    }
                    obj = objA;
                    dVar = dVarA;
                } catch (Exception unused) {
                    dVar = dVarA;
                    o53.c0.c(dVar, null);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    dVar = dVarA;
                    o53.c0.c(dVar, null);
                    throw th;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = g2Var.f92763a;
                try {
                    o13.r.b(obj);
                } catch (Exception unused2) {
                    o53.c0.c(dVar, null);
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    o53.c0.c(dVar, null);
                    throw th;
                }
            }
            jc0.c cVar3 = (jc0.c) obj;
            Integer num = cVar3 != null ? new Integer(cVar3.f98131a) : null;
            o53.c0.c(dVar, null);
            return num;
        }

        @Override // fg2.c
        public final void c(int i14, long j8) {
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.k(com.garmin.android.apps.connectmobile.a2.SUBSCRIPTIONS, "LiveActivityDeviceProvider", "Live Activity protocol version for " + j8 + ": " + i14);
            au0.x xVar = this.f92732b;
            if (i14 > xVar.b()) {
                xVar.a(i14);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // fg2.c
        public final Object d(long j8, v13.c cVar) throws Throwable {
            j2 j2Var;
            if (cVar instanceof j2) {
                j2Var = (j2) cVar;
                int i14 = j2Var.f92807c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    j2Var.f92807c = i14 - Integer.MIN_VALUE;
                } else {
                    j2Var = new j2(this, cVar);
                }
            } else {
                j2Var = new j2(this, cVar);
            }
            Object objE0 = j2Var.f92805a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = j2Var.f92807c;
            if (i15 == 0) {
                o13.r.b(objE0);
                x53.c cVar2 = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                k2 k2Var = new k2(j8, null);
                j2Var.f92807c = 1;
                objE0 = ge1.b.e0(bVar, k2Var, j2Var);
                if (objE0 == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objE0);
            }
            sd2.f fVar = (sd2.f) objE0;
            return fVar == null ? Boolean.FALSE : Boolean.valueOf(this.f92731a.a(fVar));
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // fg2.c
        public final Object e(long j8, v13.c cVar) throws Throwable {
            h2 h2Var;
            if (cVar instanceof h2) {
                h2Var = (h2) cVar;
                int i14 = h2Var.f92781c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    h2Var.f92781c = i14 - Integer.MIN_VALUE;
                } else {
                    h2Var = new h2(this, cVar);
                }
            } else {
                h2Var = new h2(this, cVar);
            }
            Object objE0 = h2Var.f92779a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = h2Var.f92781c;
            if (i15 == 0) {
                o13.r.b(objE0);
                x53.c cVar2 = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                i2 i2Var = new i2(j8, null);
                h2Var.f92781c = 1;
                objE0 = ge1.b.e0(bVar, i2Var, h2Var);
                if (objE0 == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objE0);
            }
            sd2.f fVar = (sd2.f) objE0;
            return new zf2.e(fVar != null ? fVar.getProductDisplayName() : null, fVar != null ? fVar.getImageURL() : null);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // fg2.c
        public final Object f(long j8, t13.d<? super List<? extends ag2.c.a>> dVar) throws Throwable {
            d dVar2;
            if (dVar instanceof d) {
                dVar2 = (d) dVar;
                int i14 = dVar2.f92750c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    dVar2.f92750c = i14 - Integer.MIN_VALUE;
                } else {
                    dVar2 = new d(dVar);
                }
            } else {
                dVar2 = new d(dVar);
            }
            Object objE0 = dVar2.f92748a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = dVar2.f92750c;
            if (i15 == 0) {
                o13.r.b(objE0);
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                e eVar = new e(j8, null);
                dVar2.f92750c = 1;
                objE0 = ge1.b.e0(bVar, eVar, dVar2);
                if (objE0 == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objE0);
            }
            sd2.f fVar = (sd2.f) objE0;
            if (fVar != null && zb0.u0.s(fVar.getProductNumber())) {
                return p13.x.k(ag2.c.a.REPS, ag2.c.a.JUMP_ROPE_LAST_ROUND_REPS, ag2.c.a.JUMP_ROPE_ROUNDS, ag2.c.a.JUMP_ROPE_REPS, ag2.c.a.JUMP_ROPE_AVG_SPEED);
            }
            return p13.j0.f134944a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // fg2.c
        public final Object g(long j8, t13.d<? super rs2.c> dVar) throws Throwable {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i14 = aVar.f92736c;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    aVar.f92736c = i14 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object objE0 = aVar.f92734a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = aVar.f92736c;
            if (i15 == 0) {
                o13.r.b(objE0);
                x53.c cVar = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                C1772c c1772c = new C1772c(j8, null);
                aVar.f92736c = 1;
                objE0 = ge1.b.e0(bVar, c1772c, aVar);
                if (objE0 == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objE0);
            }
            sd2.f fVar = (sd2.f) objE0;
            if (fVar != null) {
                return new b(fVar);
            }
            return null;
        }

        @Override // fg2.c
        public final Object h(long j8, v13.c cVar) {
            return d(j8, cVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id0/f2$d", "Lfg2/d;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements fg2.d {
    }

    private f2() {
    }
}
