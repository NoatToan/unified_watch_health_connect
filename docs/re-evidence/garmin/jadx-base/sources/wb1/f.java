package wb1;

import c2.x2;
import c2.y;
import c2.z;
import e23.p;
import h5.e0;
import l72.f0;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import zd0.q0;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.presentation.dev.PromosDevMenuManageCacheScreenKt$PromosDevMenuManageCacheScreen$1$2$1$1", f = "PromosDevMenuManageCacheScreen.kt", l = {33}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f183880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0 f183881b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0 q0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f183881b = q0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f183881b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f183880a;
            if (i14 == 0) {
                r.b(obj);
                this.f183880a = 1;
                if (this.f183881b.k(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.presentation.dev.PromosDevMenuManageCacheScreenKt$PromosDevMenuManageCacheScreen$1$3$1$1", f = "PromosDevMenuManageCacheScreen.kt", l = {43}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f183882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q0 f183883b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0 q0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f183883b = q0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f183883b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f183882a;
            if (i14 == 0) {
                r.b(obj);
                this.f183882a = 1;
                if (this.f183883b.f(this) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:27:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00df  */
    /* JADX WARN: Code duplicated, block: B:37:0x0107  */
    public static final void a(final q0 q0Var, p3.m mVar, int i14) {
        q0Var.getClass();
        o0 o0VarE = mVar.E(1480406221);
        final int i15 = 2;
        int i16 = (o0VarE.r(q0Var) ? 4 : 2) | i14;
        final int i17 = 0;
        final int i18 = 1;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            f0 f0Var = f0.f110999a;
            h4.r rVarF = x2.f(aVar, 1.0f);
            boolean zR = o0VarE.r(q0Var);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new e23.a() { // from class: wb1.d
                    @Override // e23.a
                    public final Object invoke() {
                        int i19 = i17;
                        q0 q0Var2 = q0Var;
                        switch (i19) {
                            case 0:
                                q0Var2.b();
                                break;
                            case 1:
                                x53.c cVar = s0.f129406a;
                                ge1.b.T(c0.a(x53.b.f189152a), null, null, new f.a(q0Var2, null), 3);
                                break;
                            default:
                                x53.c cVar2 = s0.f129406a;
                                ge1.b.T(c0.a(x53.b.f189152a), null, null, new f.b(q0Var2, null), 3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e23.a() { // from class: wb1.d
                        @Override // e23.a
                        public final Object invoke() {
                            int i19 = i17;
                            q0 q0Var2 = q0Var;
                            switch (i19) {
                                case 0:
                                    q0Var2.b();
                                    break;
                                case 1:
                                    x53.c cVar = s0.f129406a;
                                    ge1.b.T(c0.a(x53.b.f189152a), null, null, new f.a(q0Var2, null), 3);
                                    break;
                                default:
                                    x53.c cVar2 = s0.f129406a;
                                    ge1.b.T(c0.a(x53.b.f189152a), null, null, new f.b(q0Var2, null), 3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                }
            }
            f0Var.d(432, 9, (e23.a) objQ, rVarF, "Delete images", o0VarE, null, false);
            h4.r rVarF2 = x2.f(aVar, 1.0f);
            boolean zR2 = o0VarE.r(q0Var);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new e23.a() { // from class: wb1.d
                    @Override // e23.a
                    public final Object invoke() {
                        int i19 = i18;
                        q0 q0Var2 = q0Var;
                        switch (i19) {
                            case 0:
                                q0Var2.b();
                                break;
                            case 1:
                                x53.c cVar = s0.f129406a;
                                ge1.b.T(c0.a(x53.b.f189152a), null, null, new f.a(q0Var2, null), 3);
                                break;
                            default:
                                x53.c cVar2 = s0.f129406a;
                                ge1.b.T(c0.a(x53.b.f189152a), null, null, new f.b(q0Var2, null), 3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new e23.a() { // from class: wb1.d
                        @Override // e23.a
                        public final Object invoke() {
                            int i19 = i18;
                            q0 q0Var2 = q0Var;
                            switch (i19) {
                                case 0:
                                    q0Var2.b();
                                    break;
                                case 1:
                                    x53.c cVar = s0.f129406a;
                                    ge1.b.T(c0.a(x53.b.f189152a), null, null, new f.a(q0Var2, null), 3);
                                    break;
                                default:
                                    x53.c cVar2 = s0.f129406a;
                                    ge1.b.T(c0.a(x53.b.f189152a), null, null, new f.b(q0Var2, null), 3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                }
            }
            f0Var.d(432, 9, (e23.a) objQ2, rVarF2, "Reset promos", o0VarE, null, false);
            h4.r rVarF3 = x2.f(aVar, 1.0f);
            boolean zR3 = o0VarE.r(q0Var);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new e23.a() { // from class: wb1.d
                    @Override // e23.a
                    public final Object invoke() {
                        int i19 = i15;
                        q0 q0Var2 = q0Var;
                        switch (i19) {
                            case 0:
                                q0Var2.b();
                                break;
                            case 1:
                                x53.c cVar = s0.f129406a;
                                ge1.b.T(c0.a(x53.b.f189152a), null, null, new f.a(q0Var2, null), 3);
                                break;
                            default:
                                x53.c cVar2 = s0.f129406a;
                                ge1.b.T(c0.a(x53.b.f189152a), null, null, new f.b(q0Var2, null), 3);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new e23.a() { // from class: wb1.d
                        @Override // e23.a
                        public final Object invoke() {
                            int i19 = i15;
                            q0 q0Var2 = q0Var;
                            switch (i19) {
                                case 0:
                                    q0Var2.b();
                                    break;
                                case 1:
                                    x53.c cVar = s0.f129406a;
                                    ge1.b.T(c0.a(x53.b.f189152a), null, null, new f.a(q0Var2, null), 3);
                                    break;
                                default:
                                    x53.c cVar2 = s0.f129406a;
                                    ge1.b.T(c0.a(x53.b.f189152a), null, null, new f.b(q0Var2, null), 3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ3);
                }
            }
            f0Var.d(432, 9, (e23.a) objQ3, rVarF3, "Remove pending dismissed promo ids from storage", o0VarE, null, false);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(q0Var, i14);
        }
    }
}
