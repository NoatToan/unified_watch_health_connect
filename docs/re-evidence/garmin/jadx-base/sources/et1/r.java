package et1;

import c2.k3;
import c2.m3;
import ch.qos.logback.core.net.SyslogConstants;
import i3.e5;
import i3.e9;
import i3.mc;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.SingleTrailMapScreenKt$SingleTrailMapScreen$6$1$2$2$1$1", f = "SingleTrailMapScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Boolean> f65794a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p3.p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f65794a = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f65794a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f65794a.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.SingleTrailMapScreenKt$SingleTrailMapScreen$6$1$2$3$1$1", f = "SingleTrailMapScreen.kt", l = {139}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f65795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ je2.b<?> f65796b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(je2.b<?> bVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f65796b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f65796b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f65795a;
            if (i14 == 0) {
                o13.r.b(obj);
                je2.b<?> bVar = this.f65796b;
                if (bVar != null) {
                    this.f65795a = 1;
                    if (bVar.h(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.SingleTrailMapScreenKt$SingleTrailMapScreen$6$2$1", f = "SingleTrailMapScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f65797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f65798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Boolean> f65799c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.SingleTrailMapScreenKt$SingleTrailMapScreen$6$2$1$1", f = "SingleTrailMapScreen.kt", l = {150, SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f65800a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ mc f65801b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p3.p1<Boolean> f65802c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(mc mcVar, p3.p1<Boolean> p1Var, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f65801b = mcVar;
                this.f65802c = p1Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f65801b, this.f65802c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
            
                if (r1.g(r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
            
                if (r1.d(r4) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
            
                return r0;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f65800a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    boolean zBooleanValue = this.f65802c.getF182175a().booleanValue();
                    mc mcVar = this.f65801b;
                    if (zBooleanValue) {
                        this.f65800a = 1;
                    } else {
                        this.f65800a = 2;
                    }
                } else {
                    if (i14 != 1 && i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o53.b0 b0Var, mc mcVar, p3.p1<Boolean> p1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f65797a = b0Var;
            this.f65798b = mcVar;
            this.f65799c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f65797a, this.f65798b, this.f65799c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ge1.b.T(this.f65797a, null, null, new a(this.f65798b, this.f65799c, null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.garmin.android.library.mapsdkadapter.i.d dVar, String str, pt1.s sVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.p1 p1Var;
        p3.n1 n1Var;
        final p3.p1 p1Var2;
        dVar.getClass();
        str.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1621235418);
        int i15 = i14 | (o0VarE.k(dVar.ordinal()) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(sVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = (qw0.s) KoinJavaComponent.get$default(qw0.s.class, null, null, 6, null);
                o0VarE.K(objQ2);
            }
            final qw0.s sVar2 = (qw0.s) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var3 = (p3.p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(dVar);
                o0VarE.K(objQ4);
            }
            final p3.p1 p1Var4 = (p3.p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = e5.o(3, o0VarE);
            }
            p3.n1 n1Var2 = (p3.n1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p3.p0.n(Boolean.valueOf(sVar2.n()));
                o0VarE.K(objQ6);
            }
            p3.p1 p1Var5 = (p3.p1) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = p3.p0.n(Boolean.valueOf(sVar2.c()));
                o0VarE.K(objQ7);
            }
            p3.p1 p1Var6 = (p3.p1) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = p3.p0.n(Float.valueOf(0.0f));
                o0VarE.K(objQ8);
            }
            p3.p1 p1Var7 = (p3.p1) objQ8;
            ie2.n.f93149a.getClass();
            com.garmin.android.library.mapsdkadapter.k kVarA = ie2.n.a();
            com.garmin.android.library.mapsdkadapter.i.d dVar2 = (com.garmin.android.library.mapsdkadapter.i.d) p1Var4.getF182175a();
            ke2.b bVar = new ke2.b(0.0d, 0.0d, null, 4, null);
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = new e51.c(22);
                o0VarE.K(objQ9);
            }
            p3.o0 o0Var2 = o0VarE;
            je2.b<?> bVarE = ((com.garmin.android.library.mapsdkadapter.r) kVarA).e(dVar2, bVar, (e23.a) objQ9, o0Var2, (ke2.b.f104550d << 3) | 384);
            Object objQ10 = o0Var2.q();
            if (objQ10 == c2565a) {
                objQ10 = new ep0.a(11);
                o0Var2.K(objQ10);
            }
            mc mcVarF = e9.f(true, (e23.l) objQ10, o0Var2, 54, 0);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0Var2.C(1318303678);
                int intValue = n1Var2.getIntValue();
                com.garmin.android.library.mapsdkadapter.i.d dVar3 = (com.garmin.android.library.mapsdkadapter.i.d) p1Var4.getF182175a();
                boolean zBooleanValue = ((Boolean) p1Var5.getF182175a()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) p1Var6.getF182175a()).booleanValue();
                Object objQ11 = o0Var2.q();
                if (objQ11 == c2565a) {
                    n1Var = n1Var2;
                    objQ11 = new a11.h0(n1Var, 7);
                    o0Var2.K(objQ11);
                } else {
                    n1Var = n1Var2;
                }
                e23.l lVar = (e23.l) objQ11;
                boolean zR = o0Var2.r(sVar2);
                n1Var2 = n1Var;
                Object objQ12 = o0Var2.q();
                if (zR || objQ12 == c2565a) {
                    final int i16 = 0;
                    objQ12 = new e23.l() { // from class: et1.q
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i16) {
                                case 0:
                                    com.garmin.android.library.mapsdkadapter.i.d dVar4 = (com.garmin.android.library.mapsdkadapter.i.d) obj;
                                    dVar4.getClass();
                                    sVar2.p(dVar4);
                                    p1Var4.setValue(dVar4);
                                    break;
                                default:
                                    Boolean bool = (Boolean) obj;
                                    sVar2.x(bool.booleanValue());
                                    p1Var4.setValue(bool);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var2.K(objQ12);
                }
                e23.l lVar2 = (e23.l) objQ12;
                boolean zR2 = o0Var2.r(sVar2);
                Object objQ13 = o0Var2.q();
                if (zR2 || objQ13 == c2565a) {
                    p1Var2 = p1Var5;
                    final int i17 = 1;
                    objQ13 = new e23.l() { // from class: et1.q
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            switch (i17) {
                                case 0:
                                    com.garmin.android.library.mapsdkadapter.i.d dVar4 = (com.garmin.android.library.mapsdkadapter.i.d) obj;
                                    dVar4.getClass();
                                    sVar2.p(dVar4);
                                    p1Var2.setValue(dVar4);
                                    break;
                                default:
                                    Boolean bool = (Boolean) obj;
                                    sVar2.x(bool.booleanValue());
                                    p1Var2.setValue(bool);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var2.K(objQ13);
                } else {
                    p1Var2 = p1Var5;
                }
                e23.l lVar3 = (e23.l) objQ13;
                Object objQ14 = o0Var2.q();
                if (objQ14 == c2565a) {
                    objQ14 = new dv0.f(p1Var3, 26);
                    o0Var2.K(objQ14);
                }
                p1Var5 = p1Var2;
                p1Var = p1Var3;
                rw0.l.a(mcVarF, intValue, dVar3, zBooleanValue, zBooleanValue2, lVar, lVar2, lVar3, (e23.a) objQ14, o0Var2, 100859904);
                o0Var2 = o0Var2;
                o0Var2.g0(false);
            } else {
                p1Var = p1Var3;
                o0Var2.C(1319112840);
                o0Var2.g0(false);
            }
            z3.e eVarC = z3.f.c(-473762337, new ao1.g(str, aVar, 5), o0Var2);
            int i18 = k3.f22728a;
            m3.f22753w.getClass();
            p3.o0 o0Var3 = o0Var2;
            z02.d.a(false, eVarC, null, null, m3.a.c(o0Var2).f22769o, z3.f.c(17853411, new a11.j(sVar, b0Var, mcVarF, bVarE, n1Var2, p1Var5, p1Var7, sVar2, p1Var4, p1Var), o0Var2), o0Var3, 196656, 13);
            o0Var = o0Var3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.i(dVar, str, sVar, (e23.a) aVar, i14);
        }
    }
}
