package md0;

import b63.o;
import b63.z;
import c2.l;
import c2.x2;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import e23.p;
import g02.k0;
import g02.l0;
import g02.r0;
import i3.bc;
import i3.d3;
import i3.m4;
import i3.x3;
import ky0.k;
import l72.f0;
import n23.j;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.m;
import p3.m1;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s1.e0;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.custom.DialogSampleKt$DialogSample$13$1", f = "DialogSample.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m1 f117905a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m1 m1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f117905a = m1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f117905a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f117905a.i(1.0f);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.custom.DialogSampleKt$DialogSample$15$1", f = "DialogSample.kt", l = {198}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f117906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f117907b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f117907b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f117907b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f117906a;
            if (i14 == 0) {
                r.b(obj);
                this.f117906a = 1;
                if (m0.b(3000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            this.f117907b.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.custom.DialogSampleKt$DialogSample$16$1", f = "DialogSample.kt", l = {208}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f117908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f117909b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p1<Boolean> p1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f117909b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f117909b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f117908a;
            if (i14 == 0) {
                r.b(obj);
                this.f117908a = 1;
                if (m0.b(5000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            this.f117909b.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.custom.DialogSampleKt$DialogSample$18$1", f = "DialogSample.kt", l = {223}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f117910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f117911b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p1<Boolean> p1Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f117911b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f117911b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f117910a;
            if (i14 == 0) {
                r.b(obj);
                this.f117910a = 1;
                if (m0.b(3000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            this.f117911b.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: md0.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"md0/e$e", "Li3/bc;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2241e implements bc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f117912a;

        public C2241e(o oVar) {
            this.f117912a = oVar;
        }

        @Override // i3.bc
        public final boolean a(long j8) {
            z.INSTANCE.getClass();
            return j8 <= b63.b.a(this.f117912a, z.f16226b).c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v105 */
    /* JADX WARN: Type inference failed for: r2v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(m mVar, int i14) {
        Object obj;
        p1 p1Var;
        Object obj2;
        p1 p1Var2;
        Object obj3;
        boolean z14;
        boolean z15;
        ?? r14;
        Object obj4;
        Object obj5;
        boolean z16;
        Object obj6;
        Object objO;
        p1 p1Var3;
        Object obj7;
        boolean z17;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        o0 o0VarE = mVar.E(-148797329);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                obj = objQ;
                c2 c2VarN = p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN);
                obj = c2VarN;
            }
            obj = objQ;
            p1 p1Var4 = (p1) obj;
            Object objQ2 = o0VarE.q();
            Object obj13 = objQ2;
            if (objQ2 == c2565a) {
                c2 c2VarN2 = p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN2);
                obj13 = c2VarN2;
            }
            p1 p1Var5 = (p1) obj13;
            Object objQ3 = o0VarE.q();
            Object obj14 = objQ3;
            if (objQ3 == c2565a) {
                c2 c2VarN3 = p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN3);
                obj14 = c2VarN3;
            }
            p1 p1Var6 = (p1) obj14;
            Object objQ4 = o0VarE.q();
            Object obj15 = objQ4;
            if (objQ4 == c2565a) {
                c2 c2VarN4 = p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN4);
                obj15 = c2VarN4;
            }
            p1 p1Var7 = (p1) obj15;
            Object objQ5 = o0VarE.q();
            Object obj16 = objQ5;
            if (objQ5 == c2565a) {
                c2 c2VarN5 = p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN5);
                obj16 = c2VarN5;
            }
            p1 p1Var8 = (p1) obj16;
            Object objQ6 = o0VarE.q();
            Object obj17 = objQ6;
            if (objQ6 == c2565a) {
                c2 c2VarN6 = p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN6);
                obj17 = c2VarN6;
            }
            p1 p1Var9 = (p1) obj17;
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            l.f(x2.h(aVar, f14), o0VarE);
            f0 f0Var = f0.f110999a;
            h4.r rVarA = l.A(x2.f(aVar, 1.0f), f14, 0.0f, 2);
            Object objQ7 = o0VarE.q();
            Object obj18 = objQ7;
            if (objQ7 == c2565a) {
                ly0.f fVar = new ly0.f(p1Var4, 7);
                o0VarE.K(fVar);
                obj18 = fVar;
            }
            f0Var.d(25008, 9, (e23.a) obj18, rVarA, "Delete Activity", o0VarE, null, false);
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0VarE.C(-414214243);
                Object objQ8 = o0VarE.q();
                if (objQ8 == c2565a) {
                    obj12 = objQ8;
                    ly0.f fVar2 = new ly0.f(p1Var4, 20);
                    o0VarE.K(fVar2);
                    obj12 = fVar2;
                }
                obj12 = objQ8;
                e23.a aVar3 = (e23.a) obj12;
                Object objQ9 = o0VarE.q();
                Object obj19 = objQ9;
                if (objQ9 == c2565a) {
                    ly0.f fVar3 = new ly0.f(p1Var4, 21);
                    o0VarE.K(fVar3);
                    obj19 = fVar3;
                }
                dh.b.c("[Activity Name]", null, aVar3, (e23.a) obj19, o0VarE, 3462);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-413977837);
                o0VarE.g0(false);
            }
            Object objQ10 = o0VarE.q();
            Object obj20 = objQ10;
            if (objQ10 == c2565a) {
                c2 c2VarN7 = p0.n(Boolean.FALSE);
                o0VarE.K(c2VarN7);
                obj20 = c2VarN7;
            }
            p1 p1Var10 = (p1) obj20;
            Object objQ11 = o0VarE.q();
            Object obj21 = objQ11;
            if (objQ11 == c2565a) {
                o.Companion companion = o.INSTANCE;
                z.INSTANCE.getClass();
                o oVarC = g22.l.c(companion, z.f16226b);
                o0VarE.K(oVarC);
                obj21 = oVarC;
            }
            o oVar = (o) obj21;
            Object objQ12 = o0VarE.q();
            Object obj22 = objQ12;
            if (objQ12 == c2565a) {
                o oVarC2 = b63.p.c(oVar, new b63.d(0, 1, 0, 5, null));
                o0VarE.K(oVarC2);
                obj22 = oVarC2;
            }
            o oVar2 = (o) obj22;
            z.INSTANCE.getClass();
            Long lValueOf = Long.valueOf(b63.b.a(oVar, z.f16226b).c());
            d3.f87817a.getClass();
            m4 m4VarP = x3.p(lValueOf, new j23.l(d3.f87818b.f96796a, oVar2.f16206a.getYear()), new C2241e(oVar2), o0VarE, 0, 10);
            l.f(x2.h(aVar, f14), o0VarE);
            h4.r rVarA2 = l.A(x2.f(aVar, 1.0f), f14, 0.0f, 2);
            Object objQ13 = o0VarE.q();
            Object obj23 = objQ13;
            if (objQ13 == c2565a) {
                ly0.f fVar4 = new ly0.f(p1Var10, 8);
                o0VarE.K(fVar4);
                obj23 = fVar4;
            }
            f0Var.d(25008, 9, (e23.a) obj23, rVarA2, "Calendar Date Picker", o0VarE, null, false);
            l.f(x2.h(aVar, f14), o0VarE);
            h4.r rVarA3 = l.A(x2.f(aVar, 1.0f), f14, 0.0f, 2);
            Object objQ14 = o0VarE.q();
            Object obj24 = objQ14;
            if (objQ14 == c2565a) {
                ly0.f fVar5 = new ly0.f(p1Var6, 9);
                o0VarE.K(fVar5);
                obj24 = fVar5;
            }
            f0Var.d(25008, 9, (e23.a) obj24, rVarA3, "Progress Alert Dialog: Progress Loading", o0VarE, null, false);
            l.f(x2.h(aVar, f14), o0VarE);
            h4.r rVarA4 = l.A(x2.f(aVar, 1.0f), f14, 0.0f, 2);
            Object objQ15 = o0VarE.q();
            Object obj25 = objQ15;
            if (objQ15 == c2565a) {
                ly0.f fVar6 = new ly0.f(p1Var7, 10);
                o0VarE.K(fVar6);
                obj25 = fVar6;
            }
            f0Var.d(25008, 9, (e23.a) obj25, rVarA4, "Progress Alert Dialog: Indeterminate Loading", o0VarE, null, false);
            l.f(x2.h(aVar, f14), o0VarE);
            h4.r rVarA5 = l.A(x2.f(aVar, 1.0f), f14, 0.0f, 2);
            Object objQ16 = o0VarE.q();
            Object obj26 = objQ16;
            if (objQ16 == c2565a) {
                ly0.f fVar7 = new ly0.f(p1Var5, 11);
                o0VarE.K(fVar7);
                obj26 = fVar7;
            }
            f0Var.d(25008, 9, (e23.a) obj26, rVarA5, "Progress Alert Dialog: Complete", o0VarE, null, false);
            l.f(x2.h(aVar, f14), o0VarE);
            h4.r rVarA6 = l.A(x2.f(aVar, 1.0f), f14, 0.0f, 2);
            Object objQ17 = o0VarE.q();
            if (objQ17 == c2565a) {
                p1Var = p1Var8;
                ly0.f fVar8 = new ly0.f(p1Var, 12);
                o0VarE.K(fVar8);
                obj2 = fVar8;
            } else {
                p1Var = p1Var8;
                obj2 = objQ17;
            }
            p1 p1Var11 = p1Var;
            f0Var.d(25008, 9, (e23.a) obj2, rVarA6, "Progress Indicator: Progress → Complete", o0VarE, null, false);
            l.f(x2.h(aVar, f14), o0VarE);
            h4.r rVarA7 = l.A(x2.f(aVar, 1.0f), f14, 0.0f, 2);
            Object objQ18 = o0VarE.q();
            if (objQ18 == c2565a) {
                p1Var2 = p1Var9;
                ly0.f fVar9 = new ly0.f(p1Var2, 13);
                o0VarE.K(fVar9);
                obj3 = fVar9;
            } else {
                p1Var2 = p1Var9;
                obj3 = objQ18;
            }
            f0Var.d(25008, 9, (e23.a) obj3, rVarA7, "Progress Indicator: Indeterminate → Complete", o0VarE, null, false);
            if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                o0VarE.C(-411349874);
                l0.a aVar4 = new l0.a(0, 1, null);
                Object objQ19 = o0VarE.q();
                if (objQ19 == c2565a) {
                    obj11 = objQ19;
                    ly0.f fVar10 = new ly0.f(p1Var5, 14);
                    o0VarE.K(fVar10);
                    obj11 = fVar10;
                }
                obj11 = objQ19;
                k0.c("Activity saved", "Your activity is ready to view", aVar4, (e23.a) obj11, o0VarE, 3126);
                z14 = false;
                o0VarE.g0(false);
            } else {
                z14 = false;
                o0VarE.C(-411099053);
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                o0VarE.C(-411053824);
                z15 = true;
                l0.b bVar = new l0.b(z14 ? 1 : 0, 1, null);
                Object objQ20 = o0VarE.q();
                if (objQ20 == c2565a) {
                    obj10 = objQ20;
                    ly0.f fVar11 = new ly0.f(p1Var6, 15);
                    o0VarE.K(fVar11);
                    obj10 = fVar11;
                }
                obj10 = objQ20;
                k0.c("Saving Activity", "Your activity will be ready to view soon", bVar, (e23.a) obj10, o0VarE, 3126);
                r14 = 0;
                o0VarE.g0(false);
            } else {
                z15 = true;
                o0VarE.C(-410789549);
                o0VarE.g0(z14);
                r14 = z14;
            }
            if (((Boolean) p1Var7.getF182175a()).booleanValue()) {
                o0VarE.C(-410731021);
                l0.c cVar = new l0.c(r14, r14, 3, null);
                Object objQ21 = o0VarE.q();
                if (objQ21 == c2565a) {
                    obj9 = objQ21;
                    ly0.f fVar12 = new ly0.f(p1Var7, 16);
                    o0VarE.K(fVar12);
                    obj9 = fVar12;
                }
                obj9 = objQ21;
                k0.c("Saving Activity", "Your activity will be ready to view soon", cVar, (e23.a) obj9, o0VarE, 3126);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-410454253);
                o0VarE.g0(r14);
            }
            if (((Boolean) p1Var11.getF182175a()).booleanValue()) {
                o0VarE.C(-410369654);
                Object objQ22 = o0VarE.q();
                if (objQ22 == c2565a) {
                    objO = objQ22;
                    objO = j.o(0.0f, o0VarE);
                }
                objO = objQ22;
                m1 m1Var = (m1) objO;
                p3.x3 x3VarB = s1.f.b(m1Var.getFloatValue(), s1.l.d(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, 0, e0.f155563d, 2), null, o0VarE, 0, 28);
                if (((Number) x3VarB.getF182175a()).floatValue() < 1.0f) {
                    z15 = false;
                }
                Unit unit = Unit.INSTANCE;
                Object objQ23 = o0VarE.q();
                Object obj27 = objQ23;
                if (objQ23 == c2565a) {
                    a aVar5 = new a(m1Var, null);
                    o0VarE.K(aVar5);
                    obj27 = aVar5;
                }
                p3.l0.e((p) obj27, unit, o0VarE);
                String str = z15 ? "Activity saved" : "Saving Activity";
                String str2 = z15 ? "Your activity is ready to view" : "Your activity will be ready to view soon";
                float fFloatValue = ((Number) x3VarB.getF182175a()).floatValue();
                Object objQ24 = o0VarE.q();
                if (objQ24 == c2565a) {
                    p1Var3 = p1Var11;
                    ly0.f fVar13 = new ly0.f(p1Var3, 17);
                    o0VarE.K(fVar13);
                    obj7 = fVar13;
                } else {
                    p1Var3 = p1Var11;
                    obj7 = objQ24;
                }
                p1 p1Var12 = p1Var3;
                r0.a(str, str2, fFloatValue, null, null, (e23.a) obj7, o0VarE, 1572864);
                if (z15) {
                    o0VarE.C(-409563561);
                    Object objQ25 = o0VarE.q();
                    if (objQ25 == c2565a) {
                        obj8 = objQ25;
                        b bVar2 = new b(p1Var12, null);
                        o0VarE.K(bVar2);
                        obj8 = bVar2;
                    }
                    obj8 = objQ25;
                    p3.l0.e((p) obj8, unit, o0VarE);
                    z17 = false;
                    o0VarE.g0(false);
                } else {
                    z17 = false;
                    o0VarE.C(-409413645);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z17);
            } else {
                o0VarE.C(-409407693);
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-409326132);
                Object objQ26 = o0VarE.q();
                if (objQ26 == c2565a) {
                    obj5 = objQ26;
                    c2 c2VarN8 = p0.n(Boolean.FALSE);
                    o0VarE.K(c2VarN8);
                    obj5 = c2VarN8;
                }
                obj5 = objQ26;
                p1 p1Var13 = (p1) obj5;
                Unit unit2 = Unit.INSTANCE;
                Object objQ27 = o0VarE.q();
                Object obj28 = objQ27;
                if (objQ27 == c2565a) {
                    c cVar2 = new c(p1Var13, null);
                    o0VarE.K(cVar2);
                    obj28 = cVar2;
                }
                p3.l0.e((p) obj28, unit2, o0VarE);
                String str3 = ((Boolean) p1Var13.getF182175a()).booleanValue() ? "Activity saved" : "Saving Activity";
                String str4 = ((Boolean) p1Var13.getF182175a()).booleanValue() ? "Your activity is ready to view" : "Your activity will be ready to view soon";
                boolean zBooleanValue = ((Boolean) p1Var13.getF182175a()).booleanValue();
                Object objQ28 = o0VarE.q();
                Object obj29 = objQ28;
                if (objQ28 == c2565a) {
                    ly0.f fVar14 = new ly0.f(p1Var2, 18);
                    o0VarE.K(fVar14);
                    obj29 = fVar14;
                }
                r0.c(str3, str4, zBooleanValue, null, null, (e23.a) obj29, o0VarE, 1572864, 56);
                if (((Boolean) p1Var13.getF182175a()).booleanValue()) {
                    o0VarE.C(-408772782);
                    Object objQ29 = o0VarE.q();
                    if (objQ29 == c2565a) {
                        obj6 = objQ29;
                        d dVar = new d(p1Var2, null);
                        o0VarE.K(dVar);
                        obj6 = dVar;
                    }
                    obj6 = objQ29;
                    p3.l0.e((p) obj6, unit2, o0VarE);
                    z16 = false;
                    o0VarE.g0(false);
                } else {
                    z16 = false;
                    o0VarE.C(-408618061);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z16);
            } else {
                o0VarE.C(-408612109);
                o0VarE.g0(false);
            }
            if (((Boolean) p1Var10.getF182175a()).booleanValue()) {
                o0VarE.C(-408569887);
                Object objQ30 = o0VarE.q();
                if (objQ30 == c2565a) {
                    obj4 = objQ30;
                    k kVar = new k(p1Var10, 29);
                    o0VarE.K(kVar);
                    obj4 = kVar;
                }
                obj4 = objQ30;
                e23.l lVar = (e23.l) obj4;
                Object objQ31 = o0VarE.q();
                Object obj30 = objQ31;
                if (objQ31 == c2565a) {
                    ly0.f fVar15 = new ly0.f(p1Var10, 19);
                    o0VarE.K(fVar15);
                    obj30 = fVar15;
                }
                vx.c.c(m4VarP, null, lVar, null, (e23.a) obj30, false, o0VarE, 24960, 42);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-408306573);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m72.o(i14, 20);
        }
    }
}
