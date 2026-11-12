package o72;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ch.qos.logback.core.net.SyslogConstants;
import i3.e9;
import i3.mc;
import i3.uh;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.BottomSheetExamplesKt$BottomSheetExamples$1$1$1", f = "BottomSheetExamples.kt", l = {132}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f130421b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f130421b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f130421b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130420a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130420a = 1;
                if (this.f130421b.d(this) == aVar) {
                    return aVar;
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
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.BottomSheetExamplesKt$BottomSheetExamples$11$1$1", f = "BottomSheetExamples.kt", l = {295}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f130423b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f130423b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f130423b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130422a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130422a = 1;
                if (this.f130423b.d(this) == aVar) {
                    return aVar;
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
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.BottomSheetExamplesKt$BottomSheetExamples$12$1$1", f = "BottomSheetExamples.kt", l = {302}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f130425b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc mcVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f130425b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f130425b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130424a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130424a = 1;
                if (this.f130425b.d(this) == aVar) {
                    return aVar;
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
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.BottomSheetExamplesKt$BottomSheetExamples$5$1$1", f = "BottomSheetExamples.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f130427b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mc mcVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f130427b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f130427b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130426a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130426a = 1;
                if (this.f130427b.d(this) == aVar) {
                    return aVar;
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
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.BottomSheetExamplesKt$BottomSheetExamples$6$1$1", f = "BottomSheetExamples.kt", l = {191}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f130429b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(mc mcVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f130429b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f130429b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130428a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130428a = 1;
                if (this.f130429b.d(this) == aVar) {
                    return aVar;
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
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.BottomSheetExamplesKt$BottomSheetExamples$8$1$1", f = "BottomSheetExamples.kt", l = {239}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f130431b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(mc mcVar, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f130431b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f130431b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130430a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130430a = 1;
                if (this.f130431b.d(this) == aVar) {
                    return aVar;
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
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.BottomSheetExamplesKt$BottomSheetExamples$9$1$1", f = "BottomSheetExamples.kt", l = {246}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f130433b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(mc mcVar, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f130433b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f130433b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130432a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130432a = 1;
                if (this.f130433b.d(this) == aVar) {
                    return aVar;
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
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.BottomSheetExamplesKt$BottomSheetExamples$onDismiss$1$1$1", f = "BottomSheetExamples.kt", l = {94}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f130434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f130435b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(mc mcVar, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f130435b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new h(this.f130435b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130434a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f130434a = 1;
                if (this.f130435b.d(this) == aVar) {
                    return aVar;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(p3.m mVar, int i14) {
        int i15;
        z3.e eVar;
        p3.p1 p1Var;
        p3.p1 p1Var2;
        p3.p1 p1Var3;
        Throwable th3;
        p3.p1 p1Var4;
        p3.m.a.C2565a c2565a;
        p3.p1 p1Var5;
        p3.p1 p1Var6;
        p3.p1 p1Var7;
        p3.p1 p1Var8;
        p3.p1 p1Var9;
        p3.p1 p1Var10;
        boolean z14;
        p3.p1 p1Var11;
        p3.o0 o0VarE = mVar.E(591293557);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = new nw1.e(29);
                o0VarE.K(objQ);
            }
            final p3.p1 p1Var12 = (p3.p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var13 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a2) {
                objQ3 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ3);
            }
            final o53.b0 b0Var = (o53.b0) objQ3;
            final mc mcVarF = e9.f(((Boolean) p1Var13.getF182175a()).booleanValue(), null, o0VarE, 0, 2);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a2) {
                objQ4 = p3.p0.n(Boolean.TRUE);
                o0VarE.K(objQ4);
            }
            p3.p1 p1Var14 = (p3.p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a2) {
                objQ5 = p3.p0.n("Subhead");
                o0VarE.K(objQ5);
            }
            p3.p1 p1Var15 = (p3.p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a2) {
                objQ6 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ6);
            }
            p3.p1 p1Var16 = (p3.p1) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a2) {
                objQ7 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ7);
            }
            final p3.p1 p1Var17 = (p3.p1) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a2) {
                objQ8 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ8);
            }
            p3.p1 p1Var18 = (p3.p1) objQ8;
            if (((Boolean) p1Var16.getF182175a()).booleanValue()) {
                x.f130662a.getClass();
                eVar = x.f130663b;
            } else {
                eVar = null;
            }
            final Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean z15 = ((String) p1Var15.getF182175a()) != null || ((Boolean) p1Var16.getF182175a()).booleanValue();
            if (((Boolean) p1Var12.getF182175a()).booleanValue()) {
                o0VarE.C(1567207477);
                if (b(p1Var17) && z15) {
                    o0VarE.C(1567038124);
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("close", "Close");
                    b92.a aVarB = c0235a.b();
                    boolean zR = o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.B(p1Var12);
                    Object objQ9 = o0VarE.q();
                    if (zR || objQ9 == c2565a2) {
                        objQ9 = new fo.j(b0Var, mcVarF, p1Var12, 7);
                        o0VarE.K(objQ9);
                    }
                    e23.a aVar = (e23.a) objQ9;
                    l72.w wVar = l72.w.f111301a;
                    boolean zC = c(p1Var14);
                    boolean zBooleanValue = ((Boolean) p1Var17.getF182175a()).booleanValue();
                    boolean zR2 = o0VarE.r(context) | o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.B(p1Var12);
                    Object objQ10 = o0VarE.q();
                    if (zR2 || objQ10 == c2565a2) {
                        final int i16 = 0;
                        objQ10 = new e23.a() { // from class: o72.h
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                            Toast.makeText(context, "Action clicked", 0).show();
                                        }
                                        mc mcVar = mcVarF;
                                        ge1.b.T(b0Var, null, null, new i.a(mcVar, null), 3).J(new et.f(mcVar, p1Var12, 6));
                                        break;
                                    case 1:
                                        if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                            Toast.makeText(context, "Action clicked", 0).show();
                                        }
                                        mc mcVar2 = mcVarF;
                                        ge1.b.T(b0Var, null, null, new i.d(mcVar2, null), 3).J(new et.f(mcVar2, p1Var12, 3));
                                        break;
                                    case 2:
                                        if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                            Toast.makeText(context, "Action clicked", 0).show();
                                        }
                                        mc mcVar3 = mcVarF;
                                        ge1.b.T(b0Var, null, null, new i.f(mcVar3, null), 3).J(new et.f(mcVar3, p1Var12, 9));
                                        break;
                                    default:
                                        if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                            Toast.makeText(context, "Action clicked", 0).show();
                                        }
                                        mc mcVar4 = mcVarF;
                                        ge1.b.T(b0Var, null, null, new i.b(mcVar4, null), 3).J(new et.f(mcVar4, p1Var12, 5));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        p1Var11 = p1Var12;
                        o0VarE.K(objQ10);
                    } else {
                        p1Var11 = p1Var12;
                    }
                    z3.e eVarD = d(zC, zBooleanValue, (e23.a) objQ10, o0VarE);
                    p1Var3 = p1Var14;
                    p1Var4 = p1Var15;
                    z3.e eVarC = z3.f.c(2028830680, new mw0.h(aVar, eVar, p1Var14, p1Var15, 1), o0VarE);
                    boolean zB = o0VarE.B(aVar);
                    Object objQ11 = o0VarE.q();
                    if (zB || objQ11 == c2565a2) {
                        objQ11 = new nw0.x(aVar, 6);
                        o0VarE.K(objQ11);
                    }
                    o01.e eVar2 = new o01.e(21);
                    x.f130662a.getClass();
                    z3.e eVar3 = x.f130667f;
                    int i17 = b92.a.f16960b;
                    p1Var5 = p1Var18;
                    p1Var2 = p1Var13;
                    p1Var6 = p1Var16;
                    wVar.c(eVarC, eVarD, (e23.a) objQ11, mcVarF, aVarB, eVar2, eVar3, o0VarE, 1572870, 0);
                    o0VarE = o0VarE;
                    z14 = false;
                    o0VarE.g0(false);
                    th3 = null;
                    p1Var = p1Var11;
                    c2565a = c2565a2;
                    p1Var17 = p1Var17;
                } else {
                    p1Var2 = p1Var13;
                    p1Var3 = p1Var14;
                    p1Var4 = p1Var15;
                    z3.e eVar4 = eVar;
                    p1Var5 = p1Var18;
                    p1Var6 = p1Var16;
                    if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                        o0VarE.C(1570649159);
                        b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                        c0235a2.f16962a.put("close", "Close");
                        b92.a aVarB2 = c0235a2.b();
                        l72.w wVar2 = l72.w.f111301a;
                        boolean zC2 = c(p1Var3);
                        boolean zBooleanValue2 = ((Boolean) p1Var17.getF182175a()).booleanValue();
                        boolean zR3 = o0VarE.r(context) | o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.B(p1Var12);
                        Object objQ12 = o0VarE.q();
                        if (zR3 || objQ12 == c2565a2) {
                            p1Var17 = p1Var17;
                            final int i18 = 1;
                            objQ12 = new e23.a() { // from class: o72.h
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                                Toast.makeText(context, "Action clicked", 0).show();
                                            }
                                            mc mcVar = mcVarF;
                                            ge1.b.T(b0Var, null, null, new i.a(mcVar, null), 3).J(new et.f(mcVar, p1Var12, 6));
                                            break;
                                        case 1:
                                            if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                                Toast.makeText(context, "Action clicked", 0).show();
                                            }
                                            mc mcVar2 = mcVarF;
                                            ge1.b.T(b0Var, null, null, new i.d(mcVar2, null), 3).J(new et.f(mcVar2, p1Var12, 3));
                                            break;
                                        case 2:
                                            if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                                Toast.makeText(context, "Action clicked", 0).show();
                                            }
                                            mc mcVar3 = mcVarF;
                                            ge1.b.T(b0Var, null, null, new i.f(mcVar3, null), 3).J(new et.f(mcVar3, p1Var12, 9));
                                            break;
                                        default:
                                            if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                                Toast.makeText(context, "Action clicked", 0).show();
                                            }
                                            mc mcVar4 = mcVarF;
                                            ge1.b.T(b0Var, null, null, new i.b(mcVar4, null), 3).J(new et.f(mcVar4, p1Var12, 5));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ12);
                        } else {
                            p1Var17 = p1Var17;
                        }
                        z3.e eVarD2 = d(zC2, zBooleanValue2, (e23.a) objQ12, o0VarE);
                        boolean zR4 = o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.B(p1Var12);
                        Object objQ13 = o0VarE.q();
                        if (zR4 || objQ13 == c2565a2) {
                            objQ13 = new fo.j(b0Var, mcVarF, p1Var12, 9);
                            o0VarE.K(objQ13);
                        }
                        e23.a<Unit> aVar2 = (e23.a) objQ13;
                        o01.e eVar5 = new o01.e(22);
                        x.f130662a.getClass();
                        z3.e eVar6 = x.f130671j;
                        int i19 = b92.a.f16960b;
                        wVar2.d("Header", eVarD2, aVar2, mcVarF, aVarB2, eVar5, eVar6, o0VarE, 1572870, 0);
                        o0VarE = o0VarE;
                        z14 = false;
                        o0VarE.g0(false);
                    } else if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                        o0VarE.C(1573065733);
                        l72.w wVar3 = l72.w.f111301a;
                        String str = (String) p1Var4.getF182175a();
                        boolean zC3 = c(p1Var3);
                        boolean zBooleanValue3 = ((Boolean) p1Var17.getF182175a()).booleanValue();
                        boolean zR5 = o0VarE.r(context) | o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.B(p1Var12);
                        Object objQ14 = o0VarE.q();
                        if (zR5 || objQ14 == c2565a2) {
                            p1Var17 = p1Var17;
                            final int i24 = 2;
                            objQ14 = new e23.a() { // from class: o72.h
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i24) {
                                        case 0:
                                            if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                                Toast.makeText(context, "Action clicked", 0).show();
                                            }
                                            mc mcVar = mcVarF;
                                            ge1.b.T(b0Var, null, null, new i.a(mcVar, null), 3).J(new et.f(mcVar, p1Var12, 6));
                                            break;
                                        case 1:
                                            if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                                Toast.makeText(context, "Action clicked", 0).show();
                                            }
                                            mc mcVar2 = mcVarF;
                                            ge1.b.T(b0Var, null, null, new i.d(mcVar2, null), 3).J(new et.f(mcVar2, p1Var12, 3));
                                            break;
                                        case 2:
                                            if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                                Toast.makeText(context, "Action clicked", 0).show();
                                            }
                                            mc mcVar3 = mcVarF;
                                            ge1.b.T(b0Var, null, null, new i.f(mcVar3, null), 3).J(new et.f(mcVar3, p1Var12, 9));
                                            break;
                                        default:
                                            if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                                Toast.makeText(context, "Action clicked", 0).show();
                                            }
                                            mc mcVar4 = mcVarF;
                                            ge1.b.T(b0Var, null, null, new i.b(mcVar4, null), 3).J(new et.f(mcVar4, p1Var12, 5));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ14);
                        }
                        z3.e eVarD3 = d(zC3, zBooleanValue3, (e23.a) objQ14, o0VarE);
                        boolean zR6 = o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.B(p1Var12);
                        Object objQ15 = o0VarE.q();
                        if (zR6 || objQ15 == c2565a2) {
                            objQ15 = new fo.j(b0Var, mcVarF, p1Var12, 8);
                            o0VarE.K(objQ15);
                        }
                        boolean zBooleanValue4 = ((Boolean) p1Var2.getF182175a()).booleanValue();
                        o01.e eVar7 = new o01.e(23);
                        x.f130662a.getClass();
                        wVar3.h(str, eVar4, eVarD3, (e23.a) objQ15, mcVarF, zBooleanValue4, eVar7, x.f130675n, o0VarE, 805306374);
                        o0VarE = o0VarE;
                        z14 = false;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1297748645);
                        l72.w wVar4 = l72.w.f111301a;
                        String str2 = (String) p1Var4.getF182175a();
                        boolean zC4 = c(p1Var3);
                        boolean zBooleanValue5 = ((Boolean) p1Var17.getF182175a()).booleanValue();
                        boolean zR7 = o0VarE.r(context) | o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.B(p1Var12);
                        Object objQ16 = o0VarE.q();
                        if (zR7 || objQ16 == c2565a2) {
                            p1Var17 = p1Var17;
                            final int i25 = 3;
                            objQ16 = new e23.a() { // from class: o72.h
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i25) {
                                        case 0:
                                            if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                                Toast.makeText(context, "Action clicked", 0).show();
                                            }
                                            mc mcVar = mcVarF;
                                            ge1.b.T(b0Var, null, null, new i.a(mcVar, null), 3).J(new et.f(mcVar, p1Var12, 6));
                                            break;
                                        case 1:
                                            if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                                Toast.makeText(context, "Action clicked", 0).show();
                                            }
                                            mc mcVar2 = mcVarF;
                                            ge1.b.T(b0Var, null, null, new i.d(mcVar2, null), 3).J(new et.f(mcVar2, p1Var12, 3));
                                            break;
                                        case 2:
                                            if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                                Toast.makeText(context, "Action clicked", 0).show();
                                            }
                                            mc mcVar3 = mcVarF;
                                            ge1.b.T(b0Var, null, null, new i.f(mcVar3, null), 3).J(new et.f(mcVar3, p1Var12, 9));
                                            break;
                                        default:
                                            if (((Boolean) p1Var17.getF182175a()).booleanValue()) {
                                                Toast.makeText(context, "Action clicked", 0).show();
                                            }
                                            mc mcVar4 = mcVarF;
                                            ge1.b.T(b0Var, null, null, new i.b(mcVar4, null), 3).J(new et.f(mcVar4, p1Var12, 5));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            p1Var10 = p1Var12;
                            o0VarE.K(objQ16);
                        } else {
                            p1Var10 = p1Var12;
                        }
                        z3.e eVarD4 = d(zC4, zBooleanValue5, (e23.a) objQ16, o0VarE);
                        boolean zR8 = o0VarE.r(b0Var) | o0VarE.B(mcVarF) | o0VarE.B(p1Var10);
                        Object objQ17 = o0VarE.q();
                        if (zR8 || objQ17 == c2565a2) {
                            objQ17 = new fo.j(b0Var, mcVarF, p1Var10, 10);
                            o0VarE.K(objQ17);
                        }
                        boolean zBooleanValue6 = ((Boolean) p1Var2.getF182175a()).booleanValue();
                        o01.e eVar8 = new o01.e(24);
                        x.f130662a.getClass();
                        th3 = null;
                        c2565a = c2565a2;
                        p1Var = p1Var10;
                        wVar4.f("Header", str2, eVar4, eVarD4, (e23.a) objQ17, mcVarF, zBooleanValue6, eVar8, x.f130679r, o0VarE, 805306374, 128);
                        o0VarE = o0VarE;
                        z14 = false;
                        o0VarE.g0(false);
                    }
                    th3 = null;
                    p1Var = p1Var12;
                    c2565a = c2565a2;
                }
                o0VarE.g0(z14);
            } else {
                p1Var = p1Var12;
                p1Var2 = p1Var13;
                p1Var3 = p1Var14;
                th3 = null;
                p1Var4 = p1Var15;
                c2565a = c2565a2;
                p1Var5 = p1Var18;
                p1Var6 = p1Var16;
                o0VarE.C(1577778477);
                o0VarE.g0(false);
            }
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarB = u1.a2.b(c2.x2.d(aVar3, 1.0f), u1.a2.a(o0VarE), true);
            float f14 = 16;
            g6.f.a aVar4 = g6.f.f75994b;
            h4.r rVarY = c2.l.y(rVarB, f14);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            boolean zBooleanValue7 = ((Boolean) p1Var2.getF182175a()).booleanValue();
            boolean z16 = !b(p1Var17);
            Object objQ18 = o0VarE.q();
            if (objQ18 == c2565a) {
                p1Var7 = p1Var2;
                objQ18 = new md0.f(p1Var7, 7);
                o0VarE.K(objQ18);
            } else {
                p1Var7 = p1Var2;
            }
            y72.a.a("Skip Half Expanded State", zBooleanValue7, z16, null, (e23.l) objQ18, o0VarE, 24582, 8);
            c2.l.f(c2.x2.h(aVar3, f14), o0VarE);
            boolean zC5 = c(p1Var3);
            boolean z17 = !((Boolean) p1Var17.getF182175a()).booleanValue() || z15;
            Object objQ19 = o0VarE.q();
            if (objQ19 == c2565a) {
                objQ19 = new md0.f(p1Var3, 8);
                o0VarE.K(objQ19);
            }
            y72.a.a("Show Close button", zC5, z17, null, (e23.l) objQ19, o0VarE, 24582, 8);
            c2.l.f(c2.x2.h(aVar3, f14), o0VarE);
            boolean z18 = ((String) p1Var4.getF182175a()) != null;
            Object objQ20 = o0VarE.q();
            if (objQ20 == c2565a) {
                objQ20 = new md0.f(p1Var4, 9);
                o0VarE.K(objQ20);
            }
            y72.a.a("Show Subhead", z18, false, null, (e23.l) objQ20, o0VarE, 24582, 12);
            c2.l.f(c2.x2.h(aVar3, f14), o0VarE);
            boolean zBooleanValue8 = ((Boolean) p1Var6.getF182175a()).booleanValue();
            Object objQ21 = o0VarE.q();
            if (objQ21 == c2565a) {
                objQ21 = new md0.f(p1Var6, 10);
                o0VarE.K(objQ21);
            }
            y72.a.a("Custom Subhead", zBooleanValue8, false, null, (e23.l) objQ21, o0VarE, 24582, 12);
            c2.l.f(c2.x2.h(aVar3, f14), o0VarE);
            boolean zBooleanValue9 = ((Boolean) p1Var17.getF182175a()).booleanValue();
            boolean z19 = !((Boolean) p1Var5.getF182175a()).booleanValue();
            Object objQ22 = o0VarE.q();
            if (objQ22 == c2565a) {
                p1Var8 = p1Var17;
                p1Var9 = p1Var5;
                objQ22 = new uh(p1Var7, p1Var9, p1Var8, 1);
                o0VarE.K(objQ22);
            } else {
                p1Var8 = p1Var17;
                p1Var9 = p1Var5;
            }
            y72.a.a("Action header", zBooleanValue9, z19, null, (e23.l) objQ22, o0VarE, 24582, 8);
            c2.l.f(c2.x2.h(aVar3, f14), o0VarE);
            boolean zBooleanValue10 = ((Boolean) p1Var9.getF182175a()).booleanValue();
            boolean z24 = !((Boolean) p1Var8.getF182175a()).booleanValue();
            Object objQ23 = o0VarE.q();
            if (objQ23 == c2565a) {
                objQ23 = new am.c1(p1Var8, p1Var9, 21);
                o0VarE.K(objQ23);
            }
            y72.a.a("No drag handle", zBooleanValue10, z24, null, (e23.l) objQ23, o0VarE, 24582, 8);
            i15 = 20;
            c2.l.f(c2.x2.h(aVar3, 20), o0VarE);
            l72.f0 f0Var = l72.f0.f110999a;
            p3.p1 p1Var19 = p1Var;
            boolean zB2 = o0VarE.B(p1Var19);
            Object objQ24 = o0VarE.q();
            if (zB2 || objQ24 == c2565a) {
                objQ24 = new n02.c(p1Var19, 13);
                o0VarE.K(objQ24);
            }
            p3.o0 o0Var = o0VarE;
            f0Var.d(48, 13, (e23.a) objQ24, null, "Click to show sheet", o0Var, null, false);
            o0VarE = o0Var;
            o0VarE.g0(true);
        } else {
            i15 = 20;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o01.e(i14, i15);
        }
    }

    public static final boolean b(p3.p1<Boolean> p1Var) {
        return p1Var.getF182175a().booleanValue();
    }

    public static final boolean c(p3.p1<Boolean> p1Var) {
        return p1Var.getF182175a().booleanValue();
    }

    public static final z3.e d(boolean z14, boolean z15, e23.a aVar, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        if (z15) {
            mVar.C(-451169999);
            z3.e eVarC = z3.f.c(-735289056, new ll1.g(aVar, 24), mVar);
            mVar.f();
            return eVarC;
        }
        if (!z14) {
            mVar.C(-450840594);
            mVar.f();
            return null;
        }
        mVar.C(-451046929);
        z3.e eVarC2 = z3.f.c(-661385335, new ll1.g(aVar, 25), mVar);
        mVar.f();
        return eVarC2;
    }
}
