package ca0;

import androidx.lifecycle.ViewModelStoreOwner;
import b21.a5;
import b21.d7;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.Collection;
import java.util.Map;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class x1 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupNavHostKt$DeviceSetupNavHost$1$1", f = "DeviceSetupNavHost.kt", l = {72}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f26522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x80.e f26523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<com.garmin.android.apps.connectmobile.device.setup.a, Unit> f26524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ lc.m0 f26525e;

        /* JADX INFO: renamed from: ca0.x1$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C0405a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o53.b0 f26526a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e23.l<com.garmin.android.apps.connectmobile.device.setup.a, Unit> f26527b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x80.e f26528c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ lc.m0 f26529d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0405a(o53.b0 b0Var, e23.l<? super com.garmin.android.apps.connectmobile.device.setup.a, Unit> lVar, x80.e eVar, lc.m0 m0Var) {
                this.f26526a = b0Var;
                this.f26527b = lVar;
                this.f26528c = eVar;
                this.f26529d = m0Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Collection collection;
                l90.b bVar;
                d90.d dVar2;
                com.garmin.android.apps.connectmobile.device.setup.a aVar = (com.garmin.android.apps.connectmobile.device.setup.a) obj;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.a(com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP, "Device setup flow finished with redirect: " + aVar);
                boolean zG = p005kotlin.jvm.internal.s.g(aVar, com.garmin.android.apps.connectmobile.device.setup.a.c.INSTANCE);
                e23.l<com.garmin.android.apps.connectmobile.device.setup.a, Unit> lVar = this.f26527b;
                if (zG || (aVar instanceof com.garmin.android.apps.connectmobile.device.setup.a.b)) {
                    lVar.invoke(aVar);
                } else {
                    q90.c cVarZ4 = this.f26528c.z4();
                    if (cVarZ4 == null || (bVar = cVarZ4.f143495c) == null || (dVar2 = bVar.f111531p) == null || (collection = dVar2.f58447m) == null) {
                        collection = p13.j0.f134944a;
                    }
                    if (collection.isEmpty()) {
                        lVar.invoke(aVar);
                    } else {
                        z1.k kVar = z1.k.INSTANCE;
                        lc.m0 m0Var = this.f26529d;
                        m0Var.h(zf.b.g(m0Var), kVar);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x80.e eVar, e23.l<? super com.garmin.android.apps.connectmobile.device.setup.a, Unit> lVar, lc.m0 m0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f26523c = eVar;
            this.f26524d = lVar;
            this.f26525e = m0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f26523c, this.f26524d, this.f26525e, dVar);
            aVar.f26522b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to ca0.x1$a for r7v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f26522b
                o53.b0 r0 = (o53.b0) r0
                u13.a r1 = u13.a.COROUTINE_SUSPENDED
                int r2 = r7.f26521a
                r3 = 1
                if (r2 == 0) goto L18
                if (r2 == r3) goto L14
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r8)
            L12:
                r8 = 0
                return r8
            L14:
                o13.r.b(r8)
                goto L36
            L18:
                o13.r.b(r8)
                x80.e r8 = r7.f26523c
                r53.a2 r2 = r8.f189516r
                ca0.x1$a$a r4 = new ca0.x1$a$a
                e23.l<com.garmin.android.apps.connectmobile.device.setup.a, kotlin.Unit> r5 = r7.f26524d
                lc.m0 r6 = r7.f26525e
                r4.<init>(r0, r5, r8, r6)
                r8 = 0
                r7.f26522b = r8
                r7.f26521a = r3
                r53.d2<T> r8 = r2.f150526a
                java.lang.Object r8 = r8.collect(r4, r7)
                if (r8 != r1) goto L36
                return r1
            L36:
                o2.c.f()
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: ca0.x1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupNavHostKt$DeviceSetupNavHost$4$5$1$1$1$1", f = "DeviceSetupNavHost.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lc.m0 f26530a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lc.m0 m0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f26530a = m0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f26530a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            z1.c cVar = new z1.c(true);
            lc.m0 m0Var = this.f26530a;
            m0Var.h(zf.b.g(m0Var), cVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.DeviceSetupNavHostKt$DeviceSetupNavHost$4$5$1$30$1$1", f = "DeviceSetupNavHost.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x80.e f26531a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x80.e eVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f26531a = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f26531a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            x80.e eVar = this.f26531a;
            eVar.getClass();
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            String str = "Device setup flow finished triggering end flow actions for flow: " + eVar.f189500b;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DeviceSetupViewModel", str);
            ge1.b.T(androidx.lifecycle.v1.a(eVar), null, null, new com.garmin.android.apps.connectmobile.device.setup.b(eVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f26533b;

        static {
            int[] iArr = new int[o1.values().length];
            try {
                iArr[o1.CREATE_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o1.SIGN_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o1.ADD_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26532a = iArr;
            int[] iArr2 = new int[n90.b.values().length];
            try {
                iArr2[n90.b.f125028y.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            f26533b = iArr2;
        }
    }

    public static final void a(final o1 o1Var, final l90.d dVar, final q90.d.a aVar, final e23.a<Unit> aVar2, final e23.a<Unit> aVar3, final e23.a<Unit> aVar4, final e23.p<? super n90.b, ? super q90.c, Unit> pVar, final e23.l<? super com.garmin.android.apps.connectmobile.device.setup.a, Unit> lVar, final e23.p<? super l90.i, ? super l90.b, Unit> pVar2, p3.m mVar, int i14) {
        p3.o0 o0Var;
        Object obj;
        final int i15;
        final int i16;
        lc.m0 m0Var;
        o1Var.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        pVar.getClass();
        lVar.getClass();
        pVar2.getClass();
        p3.o0 o0VarE = mVar.E(680347906);
        int i17 = i14 | (o0VarE.k(o1Var.ordinal()) ? 4 : 2) | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192) | (o0VarE.r(aVar4) ? 131072 : 65536) | (o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar) ? 8388608 : 4194304) | (o0VarE.r(pVar2) ? 67108864 : 33554432);
        int i18 = 0;
        if (o0VarE.n(i17 & 1, (i17 & 38347923) != 38347922)) {
            p3.x1 x1Var = p3.n.f135158a;
            final lc.m0 m0VarI = gl1.y.I(new lc.v0[0], o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = n23.j.o(0.0f, o0VarE);
            }
            p3.m1 m1Var = (p3.m1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new q1(m1Var, i18);
                o0VarE.K(objQ2);
            }
            e23.l lVar2 = (e23.l) objQ2;
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(m0VarI);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new r1(m0VarI, lVar2, 0);
                o0VarE.K(objQ3);
            }
            p3.l0.a(unit, (e23.l) objQ3, o0VarE);
            o13.p pVar3 = new o13.p(m1Var, lVar2);
            p3.m1 m1Var2 = (p3.m1) pVar3.f128594a;
            final e23.l lVar3 = (e23.l) pVar3.f128595b;
            int i19 = i17 & 14;
            boolean z14 = i19 == 4;
            Object objQ4 = o0VarE.q();
            if (z14 || objQ4 == c2565a) {
                objQ4 = new c32.k(o1Var, 11);
                o0VarE.K(objQ4);
            }
            e23.a aVar5 = (e23.a) objQ4;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(x80.e.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar5);
            o0VarE.g0(false);
            final x80.e eVar = (x80.e) u1VarResolveViewModel;
            int i24 = 29360128 & i17;
            boolean zR2 = (i24 == 8388608) | o0VarE.r(eVar) | o0VarE.r(m0VarI);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new a(eVar, lVar, m0VarI, null);
                o0VarE.K(objQ5);
            }
            p3.l0.f(eVar, m0VarI, (e23.p) objQ5, o0VarE);
            boolean zR3 = o0VarE.r(eVar);
            Object objQ6 = o0VarE.q();
            if (zR3 || objQ6 == c2565a) {
                objQ6 = new s1(eVar, 2);
                o0VarE.K(objQ6);
            }
            final e23.a aVar6 = (e23.a) objQ6;
            boolean zR4 = o0VarE.r(m0VarI);
            Object objQ7 = o0VarE.q();
            if (zR4 || objQ7 == c2565a) {
                objQ7 = new u0(m0VarI, 10);
                o0VarE.K(objQ7);
            }
            final e23.a aVar7 = (e23.a) objQ7;
            boolean zB = o0VarE.B(aVar7);
            Object objQ8 = o0VarE.q();
            if (zB || objQ8 == c2565a) {
                objQ8 = new v0(aVar7, 4);
                o0VarE.K(objQ8);
            }
            c.w.a(0, 1, (e23.a) objQ8, o0VarE, false);
            h4.r rVarE = u1.n.e(c2.x2.d(h4.r.S, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = new k(29);
                o0VarE.K(objQ9);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ9, rVarE, false);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar8 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            da0.i.a(m1Var2.getFloatValue(), o0VarE, 0);
            final s1.b2 b2VarD = s1.l.d(500, 0, s1.e0.f155560a, 2);
            if (c22.s3.b()) {
                obj = z1.o.INSTANCE;
            } else if (aVar != null) {
                eVar.getClass();
                eVar.f189519w = aVar;
                obj = z1.l.INSTANCE;
            } else {
                obj = z1.f.INSTANCE;
            }
            Object obj2 = obj;
            boolean zB2 = o0VarE.B(b2VarD);
            Object objQ10 = o0VarE.q();
            if (zB2 || objQ10 == c2565a) {
                i15 = 0;
                objQ10 = new e23.l() { // from class: ca0.w1
                    @Override // e23.l
                    public final Object invoke(Object obj3) {
                        int i25 = i15;
                        s1.b2 b2Var = b2VarD;
                        r1.n nVar = (r1.n) obj3;
                        switch (i25) {
                            case 0:
                                nVar.getClass();
                                a81.m mVar2 = new a81.m(26);
                                s1.d2 d2Var = r1.u0.f149280a;
                                return new r1.v1(new r1.o2(null, new r1.l2(new r1.o1(mVar2), b2Var), null, null, null, false, null, 125, null));
                            case 1:
                                nVar.getClass();
                                k kVar = new k(28);
                                s1.d2 d2Var2 = r1.u0.f149280a;
                                return new r1.x1(new r1.o2(null, new r1.l2(new r1.r1(kVar), b2Var), null, null, null, false, null, 125, null));
                            case 2:
                                nVar.getClass();
                                k kVar2 = new k(27);
                                s1.d2 d2Var3 = r1.u0.f149280a;
                                return new r1.v1(new r1.o2(null, new r1.l2(new r1.o1(kVar2), b2Var), null, null, null, false, null, 125, null));
                            default:
                                nVar.getClass();
                                a81.m mVar3 = new a81.m(26);
                                s1.d2 d2Var4 = r1.u0.f149280a;
                                return new r1.x1(new r1.o2(null, new r1.l2(new r1.r1(mVar3), b2Var), null, null, null, false, null, 125, null));
                        }
                    }
                };
                o0VarE.K(objQ10);
            } else {
                i15 = 0;
            }
            e23.l lVar4 = (e23.l) objQ10;
            boolean zB3 = o0VarE.B(b2VarD);
            Object objQ11 = o0VarE.q();
            if (zB3 || objQ11 == c2565a) {
                i16 = 1;
                objQ11 = new e23.l() { // from class: ca0.w1
                    @Override // e23.l
                    public final Object invoke(Object obj3) {
                        int i25 = i16;
                        s1.b2 b2Var = b2VarD;
                        r1.n nVar = (r1.n) obj3;
                        switch (i25) {
                            case 0:
                                nVar.getClass();
                                a81.m mVar2 = new a81.m(26);
                                s1.d2 d2Var = r1.u0.f149280a;
                                return new r1.v1(new r1.o2(null, new r1.l2(new r1.o1(mVar2), b2Var), null, null, null, false, null, 125, null));
                            case 1:
                                nVar.getClass();
                                k kVar = new k(28);
                                s1.d2 d2Var2 = r1.u0.f149280a;
                                return new r1.x1(new r1.o2(null, new r1.l2(new r1.r1(kVar), b2Var), null, null, null, false, null, 125, null));
                            case 2:
                                nVar.getClass();
                                k kVar2 = new k(27);
                                s1.d2 d2Var3 = r1.u0.f149280a;
                                return new r1.v1(new r1.o2(null, new r1.l2(new r1.o1(kVar2), b2Var), null, null, null, false, null, 125, null));
                            default:
                                nVar.getClass();
                                a81.m mVar3 = new a81.m(26);
                                s1.d2 d2Var4 = r1.u0.f149280a;
                                return new r1.x1(new r1.o2(null, new r1.l2(new r1.r1(mVar3), b2Var), null, null, null, false, null, 125, null));
                        }
                    }
                };
                o0VarE.K(objQ11);
            } else {
                i16 = 1;
            }
            e23.l lVar5 = (e23.l) objQ11;
            boolean zB4 = o0VarE.B(b2VarD);
            Object objQ12 = o0VarE.q();
            if (zB4 || objQ12 == c2565a) {
                final int i25 = 2;
                objQ12 = new e23.l() { // from class: ca0.w1
                    @Override // e23.l
                    public final Object invoke(Object obj3) {
                        int i26 = i25;
                        s1.b2 b2Var = b2VarD;
                        r1.n nVar = (r1.n) obj3;
                        switch (i26) {
                            case 0:
                                nVar.getClass();
                                a81.m mVar2 = new a81.m(26);
                                s1.d2 d2Var = r1.u0.f149280a;
                                return new r1.v1(new r1.o2(null, new r1.l2(new r1.o1(mVar2), b2Var), null, null, null, false, null, 125, null));
                            case 1:
                                nVar.getClass();
                                k kVar = new k(28);
                                s1.d2 d2Var2 = r1.u0.f149280a;
                                return new r1.x1(new r1.o2(null, new r1.l2(new r1.r1(kVar), b2Var), null, null, null, false, null, 125, null));
                            case 2:
                                nVar.getClass();
                                k kVar2 = new k(27);
                                s1.d2 d2Var3 = r1.u0.f149280a;
                                return new r1.v1(new r1.o2(null, new r1.l2(new r1.o1(kVar2), b2Var), null, null, null, false, null, 125, null));
                            default:
                                nVar.getClass();
                                a81.m mVar3 = new a81.m(26);
                                s1.d2 d2Var4 = r1.u0.f149280a;
                                return new r1.x1(new r1.o2(null, new r1.l2(new r1.r1(mVar3), b2Var), null, null, null, false, null, 125, null));
                        }
                    }
                };
                o0VarE.K(objQ12);
            }
            e23.l lVar6 = (e23.l) objQ12;
            boolean zB5 = o0VarE.B(b2VarD);
            Object objQ13 = o0VarE.q();
            if (zB5 || objQ13 == c2565a) {
                final int i26 = 3;
                objQ13 = new e23.l() { // from class: ca0.w1
                    @Override // e23.l
                    public final Object invoke(Object obj3) {
                        int i27 = i26;
                        s1.b2 b2Var = b2VarD;
                        r1.n nVar = (r1.n) obj3;
                        switch (i27) {
                            case 0:
                                nVar.getClass();
                                a81.m mVar2 = new a81.m(26);
                                s1.d2 d2Var = r1.u0.f149280a;
                                return new r1.v1(new r1.o2(null, new r1.l2(new r1.o1(mVar2), b2Var), null, null, null, false, null, 125, null));
                            case 1:
                                nVar.getClass();
                                k kVar = new k(28);
                                s1.d2 d2Var2 = r1.u0.f149280a;
                                return new r1.x1(new r1.o2(null, new r1.l2(new r1.r1(kVar), b2Var), null, null, null, false, null, 125, null));
                            case 2:
                                nVar.getClass();
                                k kVar2 = new k(27);
                                s1.d2 d2Var3 = r1.u0.f149280a;
                                return new r1.v1(new r1.o2(null, new r1.l2(new r1.o1(kVar2), b2Var), null, null, null, false, null, 125, null));
                            default:
                                nVar.getClass();
                                a81.m mVar3 = new a81.m(26);
                                s1.d2 d2Var4 = r1.u0.f149280a;
                                return new r1.x1(new r1.o2(null, new r1.l2(new r1.r1(mVar3), b2Var), null, null, null, false, null, 125, null));
                        }
                    }
                };
                o0VarE.K(objQ13);
            }
            e23.l lVar7 = (e23.l) objQ13;
            int i27 = (((((((((((((i19 == 4 ? i16 : i15) | (o0VarE.r(m0VarI) ? 1 : 0)) | ((i17 & 112) != 32 ? i15 : i16)) | (o0VarE.B(lVar3) ? 1 : 0)) | ((458752 & i17) == 131072 ? i16 : i15)) | (o0VarE.r(eVar) ? 1 : 0)) | ((234881024 & i17) == 67108864 ? i16 : i15)) | (o0VarE.B(aVar6) ? 1 : 0)) | ((57344 & i17) == 16384 ? i16 : i15)) | (o0VarE.B(aVar7) ? 1 : 0)) | ((i17 & 7168) == 2048 ? i16 : i15)) | (o0VarE.r(aVar) ? 1 : 0)) == true ? 1 : 0) | (i24 == 8388608 ? i16 : i15);
            if ((i17 & 3670016) == 1048576) {
                i15 = i16;
            }
            int i28 = i27 | i15;
            Object objQ14 = o0VarE.q();
            if (i28 != 0 || objQ14 == c2565a) {
                e23.l lVar8 = new e23.l() { // from class: ca0.p1
                    @Override // e23.l
                    public final Object invoke(Object obj3) {
                        lc.k0 k0Var = (lc.k0) obj3;
                        k0Var.getClass();
                        lc.m0 m0Var2 = m0VarI;
                        z3.e eVar2 = new z3.e(-1611909093, true, new b21.m(m0Var2, 5));
                        p13.k0 k0Var2 = p13.k0.f134949a;
                        k0Var2.getClass();
                        p13.j0 j0Var = p13.j0.f134944a;
                        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                        nc.n.a(k0Var, t0Var.b(z1.o.class), k0Var2, j0Var, null, null, null, null, eVar2);
                        u0 u0Var = new u0(m0Var2, 9);
                        x80.e eVar3 = eVar;
                        u1 u1Var = new u1(eVar3, m0Var2);
                        t1 t1Var = new t1(1, m0Var2, eVar3);
                        o1 o1Var2 = o1Var;
                        o1Var2.getClass();
                        m0Var2.getClass();
                        e23.l lVar9 = lVar3;
                        lVar9.getClass();
                        e23.a aVar9 = aVar4;
                        aVar9.getClass();
                        e23.p pVar4 = pVar2;
                        pVar4.getClass();
                        c42.c0 c0Var = new c42.c0(7, pVar4, m0Var2);
                        c50.f fVar = new c50.f(pVar4, 4, m0Var2, t1Var);
                        o0 o0Var2 = new o0(m0Var2, o1Var2, aVar9, 0);
                        ge1.b.U(k0Var, t0Var.b(z1.f.class), b1.q.INSTANCE, k0Var2, new s0(u1Var, m0Var2, o1Var2, dVar, u0Var, aVar9, lVar9, fVar, c0Var, o0Var2, t1Var, 0));
                        s1 s1Var = new s1(eVar3, 3);
                        aa2.f fVar2 = new aa2.f(17, eVar3, m0Var2);
                        o0 o0Var3 = new o0(m0Var2, o1Var2, aVar9, 2);
                        d7 d7Var = new d7(m0Var2, 14);
                        n1.b bVar2 = n1.b.INSTANCE;
                        n1.Companion.getClass();
                        ge1.b.U(k0Var, t0Var.b(z1.l.class), bVar2, n1.a.a(), new b82.l0(s1Var, o0Var3, m0Var2, d7Var, lVar9, fVar2, o1Var2));
                        u1 u1Var2 = new u1(6, m0Var2, eVar3);
                        e23.a aVar10 = aVar6;
                        aVar10.getClass();
                        d.b bVar3 = d.b.INSTANCE;
                        d.Companion.getClass();
                        k23.p pVarC = p005kotlin.jvm.internal.s0.c(q90.c.class);
                        n63.b.a aVar11 = n63.b.f123892d;
                        nc.n.d(k0Var, bVar3, t0Var.b(z1.a.class), p13.t0.b(new o13.p(pVarC, new c(aVar11))), j0Var, new a03.n0(m0Var2, aVar10, u1Var2, lVar9, 12));
                        u1 u1Var3 = new u1(7, m0Var2, eVar3);
                        f1.c cVar = f1.c.INSTANCE;
                        f1.Companion.getClass();
                        nc.n.d(k0Var, cVar, t0Var.b(z1.e.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(q90.c.class), new g1(aVar11))), j0Var, new a4.a(m0Var2, 26, u1Var3, aVar10));
                        s1 s1Var2 = new s1(eVar3, 0);
                        t1 t1Var2 = new t1(0, m0Var2, eVar3);
                        e23.a aVar12 = aVar3;
                        aVar12.getClass();
                        e23.a aVar13 = aVar7;
                        aVar13.getClass();
                        c4.j jVar = c4.j.INSTANCE;
                        c4.Companion.getClass();
                        nc.n.d(k0Var, jVar, t0Var.b(z1.q.class), c4.f.a(), j0Var, new a5(t1Var2, aVar10, m0Var2, o1Var2, s1Var2, aVar13, lVar9, aVar12));
                        s1 s1Var3 = new s1(eVar3, 1);
                        u1 u1Var4 = new u1(0, m0Var2, eVar3);
                        i0.q qVar = i0.q.INSTANCE;
                        i0.Companion.getClass();
                        nc.n.d(k0Var, qVar, t0Var.b(z1.d.class), i0.m.a(), j0Var, new aa2.p(m0Var2, aVar10, s1Var3, lVar9, aVar13, u1Var4));
                        u1 u1Var5 = new u1(1, m0Var2, eVar3);
                        ge1.b.U(k0Var, t0Var.b(z1.m.class), u2.h.INSTANCE, k0Var2, new am.e1(m0Var2, u1Var5, aVar10, aVar13, k0Var, 8));
                        c50.f fVar3 = new c50.f(m0Var2, 5, eVar3, aVar);
                        u0 u0Var2 = new u0(m0Var2, 8);
                        e23.a aVar14 = aVar2;
                        aVar14.getClass();
                        j.b bVar4 = j.b.INSTANCE;
                        j.Companion.getClass();
                        nc.n.d(k0Var, bVar4, t0Var.b(z1.c.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(g90.a.class), new i(aVar11))), j0Var, new b82.l0(fVar3, m0Var2, o1Var2, aVar10, u0Var2, aVar14, aVar13, 1));
                        u1 u1Var6 = new u1(2, m0Var2, eVar3);
                        k2.i iVar = k2.i.INSTANCE;
                        k2.Companion.getClass();
                        nc.n.d(k0Var, iVar, t0Var.b(z1.p.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(q90.c.class), new j2(aVar11))), j0Var, new am.e1(m0Var2, u1Var6, lVar9, aVar13, aVar10, 7));
                        nc.n.a(k0Var, t0Var.b(z1.h.class), k0Var2, j0Var, null, null, null, null, new z3.e(411782532, true, new a42.d0(aVar13, (Object) m0Var2, (Object) eVar3, aVar10, 8)));
                        nc.n.a(k0Var, t0Var.b(z1.i.class), i0.m.a(), j0Var, null, null, null, null, new z3.e(-981150877, true, new a42.c0((Object) aVar13, (Object) aVar10, (Object) m0Var2, (Object) eVar3, lVar9, 6)));
                        v0 v0Var = new v0(aVar10, 2);
                        u1 u1Var7 = new u1(3, m0Var2, eVar3);
                        q2.b bVar5 = q2.b.INSTANCE;
                        q2.Companion.getClass();
                        nc.n.d(k0Var, bVar5, t0Var.b(z1.j.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(q90.c.class), new p2(aVar11))), j0Var, new a03.n0(u1Var7, m0Var2, v0Var, aVar13, 14));
                        u1 u1Var8 = new u1(4, m0Var2, eVar3);
                        g4.g gVar = g4.g.INSTANCE;
                        g4.Companion.getClass();
                        nc.n.d(k0Var, gVar, t0Var.b(z1.r.class), p13.t0.b(new o13.p(p005kotlin.jvm.internal.s0.c(q90.c.class), new h4(aVar11))), j0Var, new a03.n0(u1Var8, m0Var2, aVar10, aVar13, 15));
                        Map mapA = i0.m.a();
                        e23.l lVar10 = lVar;
                        nc.n.a(k0Var, t0Var.b(z1.k.class), mapA, j0Var, null, null, null, null, new z3.e(1920883010, true, new a42.d0(lVar10, aVar10, m0Var2, pVar)));
                        nc.n.a(k0Var, t0Var.b(z1.n.class), i0.m.a(), j0Var, null, null, null, null, new z3.e(527949601, true, new a42.d0(aVar10, lVar10, lVar9, aVar13)));
                        nc.n.a(k0Var, t0Var.b(z1.g.class), k0Var2, j0Var, new k(23), new k(24), new k(25), new k(26), new z3.e(-864983808, true, new a6.c(eVar3, 5)));
                        return Unit.INSTANCE;
                    }
                };
                m0Var = m0VarI;
                o0VarE.K(lVar8);
                objQ14 = lVar8;
            } else {
                m0Var = m0VarI;
            }
            o0Var = o0VarE;
            nc.y.a(m0Var, obj2, null, null, null, lVar4, lVar5, lVar6, lVar7, (e23.l) objQ14, o0Var, 0, 1084);
            o0Var.g0(true);
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.d(o1Var, dVar, aVar, aVar2, aVar3, aVar4, pVar, lVar, pVar2, i14);
        }
    }
}
