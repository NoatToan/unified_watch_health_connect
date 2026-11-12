package rg2;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.room.a0;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p13.k0;
import r53.b2;
import r53.e2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.s1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrg2/h;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f152708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f152709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f152710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f152711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f152712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f152713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f152714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f152715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f152716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f152717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f152718k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.stats.StatsViewModel$1", f = "StatsViewModel.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152719a;

        /* JADX INFO: renamed from: rg2.h$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2880a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f152721a;

            public C2880a(h hVar) {
                this.f152721a = hVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [p13.j0] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r8v2, types: [r53.p2] */
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
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Object value;
                ?? arrayList;
                List list = (List) obj;
                ?? r14 = this.f152721a.f152710c;
                do {
                    value = r14.getValue();
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (T t7 : list) {
                            ag2.c.a aVarA = ((ag2.c) t7).a();
                            if (aVarA != null && zg2.e.a(aVarA)) {
                                arrayList2.add(t7);
                            }
                        }
                        arrayList = new ArrayList();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ag2.c.a aVarA2 = ((ag2.c) it.next()).a();
                            if (aVarA2 != null) {
                                arrayList.add(aVarA2);
                            }
                        }
                    } else {
                        arrayList = j0.f134944a;
                    }
                } while (!r14.b(value, arrayList));
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to rg2.h$a for r4v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r4.f152719a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 == r2) goto L10
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r5)
            Le:
                r5 = 0
                return r5
            L10:
                o13.r.b(r5)
                goto L2f
            L14:
                o13.r.b(r5)
                rg2.h r5 = rg2.h.this
                fg2.f r1 = r5.z4()
                r53.b2 r1 = r1.A
                rg2.h$a$a r3 = new rg2.h$a$a
                r3.<init>(r5)
                r4.f152719a = r2
                r53.o2<T> r5 = r1.f150540a
                java.lang.Object r5 = r5.collect(r3, r4)
                if (r5 != r0) goto L2f
                return r0
            L2f:
                o2.c.f()
                goto Le
            */
            throw new UnsupportedOperationException("Method not decompiled: rg2.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.stats.StatsViewModel$2", f = "StatsViewModel.kt", l = {65}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152722a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f152724a;

            public a(h hVar) {
                this.f152724a = hVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [p13.j0] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r8v2, types: [r53.p2] */
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
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Object value;
                ?? arrayList;
                List list = (List) obj;
                ?? r14 = this.f152724a.f152711d;
                do {
                    value = r14.getValue();
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (T t7 : list) {
                            ag2.c.a aVarA = ((ag2.c) t7).a();
                            if (aVarA != null && zg2.e.a(aVarA)) {
                                arrayList2.add(t7);
                            }
                        }
                        arrayList = new ArrayList();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ag2.c.a aVarA2 = ((ag2.c) it.next()).a();
                            if (aVarA2 != null) {
                                arrayList.add(aVarA2);
                            }
                        }
                    } else {
                        arrayList = j0.f134944a;
                    }
                } while (!r14.b(value, arrayList));
                return Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to rg2.h$b for r4v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r4.f152722a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 == r2) goto L10
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r5)
            Le:
                r5 = 0
                return r5
            L10:
                o13.r.b(r5)
                goto L2f
            L14:
                o13.r.b(r5)
                rg2.h r5 = rg2.h.this
                fg2.f r1 = r5.z4()
                r53.b2 r1 = r1.C
                rg2.h$b$a r3 = new rg2.h$b$a
                r3.<init>(r5)
                r4.f152722a = r2
                r53.o2<T> r5 = r1.f150540a
                java.lang.Object r5 = r5.collect(r3, r4)
                if (r5 != r0) goto L2f
                return r0
            L2f:
                o2.c.f()
                goto Le
            */
            throw new UnsupportedOperationException("Method not decompiled: rg2.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.stats.StatsViewModel$3", f = "StatsViewModel.kt", l = {75}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152725a;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lof2/b0;", "sessionData", "", "<anonymous>", "(Lof2/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.stats.StatsViewModel$3$1", f = "StatsViewModel.kt", l = {81}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<of2.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f152727a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f152728b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f152729c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f152729c = hVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f152729c, dVar);
                aVar.f152728b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(of2.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                zf2.g gVar;
                of2.b0 b0Var = (of2.b0) this.f152728b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f152727a;
                if (i14 == 0) {
                    r.b(obj);
                    h hVar = this.f152729c;
                    hVar.f152714g.setValue(b0Var != null ? b0Var.f131747d : null);
                    hVar.f152715h.setValue(b0Var != null ? b0Var.f131752i : null);
                    hVar.f152718k.setValue((b0Var == null || (gVar = b0Var.f131756m) == null) ? null : new Integer(gVar.f204647a));
                    if (b0Var != null) {
                        tf2.c cVar = b0Var.f131754k;
                        this.f152728b = null;
                        this.f152727a = 1;
                        if (h.x4(hVar, cVar, this) == aVar) {
                            return aVar;
                        }
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

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152725a;
            if (i14 == 0) {
                r.b(obj);
                h hVar = h.this;
                p2 p2Var = hVar.z4().f71482f;
                a aVar2 = new a(hVar, null);
                this.f152725a = 1;
                if (s.k(p2Var, aVar2, this) == aVar) {
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
    @v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.stats.StatsViewModel$4", f = "StatsViewModel.kt", l = {87}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f152730a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f152732a;

            public a(h hVar) {
                this.f152732a = hVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.f152732a.f152716i.k(null, bool);
                return Unit.INSTANCE;
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f152730a;
            if (i14 == 0) {
                r.b(obj);
                h hVar = h.this;
                s1 s1Var = hVar.z4().f71478b.f131781j.f71436k;
                a aVar2 = new a(hVar);
                this.f152730a = 1;
                if (s1Var.collect(aVar2, this) == aVar) {
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

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f152733a;

        static {
            int[] iArr = new int[ag2.c.a.values().length];
            try {
                iArr[ag2.c.a.SPEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ag2.c.a.PACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f152733a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<fg2.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f152734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f152735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f152736c;

        public f(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f152734a = koinComponent;
            this.f152735b = qualifier;
            this.f152736c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [fg2.f, java.lang.Object] */
        @Override // e23.a
        public final fg2.f invoke() {
            KoinComponent koinComponent = this.f152734a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(fg2.f.class), this.f152735b, this.f152736c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<Context> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KoinComponent f152737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f152738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f152739c;

        public g(KoinComponent koinComponent, Qualifier qualifier, e23.a aVar) {
            this.f152737a = koinComponent;
            this.f152738b = qualifier;
            this.f152739c = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [android.content.Context, java.lang.Object] */
        @Override // e23.a
        public final Context invoke() {
            KoinComponent koinComponent = this.f152737a;
            boolean z14 = koinComponent instanceof KoinScopeComponent;
            return (z14 ? ((KoinScopeComponent) koinComponent).getScope() : a0.n(koinComponent)).get((k23.d<?>) s0.f105811a.b(Context.class), this.f152738b, this.f152739c);
        }
    }

    public h() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        this.f152708a = o13.m.a(koinPlatformTools.defaultLazyMode(), new f(this, null, null));
        this.f152709b = o13.m.a(koinPlatformTools.defaultLazyMode(), new g(this, null, null));
        j0 j0Var = j0.f134944a;
        this.f152710c = q2.a(j0Var);
        this.f152711d = q2.a(j0Var);
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        p2 p2VarA = q2.a(k0Var);
        this.f152712e = p2VarA;
        this.f152713f = s.d(p2VarA);
        this.f152714g = q2.a(null);
        this.f152715h = q2.a(null);
        p2 p2VarA2 = q2.a(Boolean.FALSE);
        this.f152716i = p2VarA2;
        this.f152717j = s.d(p2VarA2);
        this.f152718k = q2.a(null);
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
        ge1.b.T(v1.a(this), null, null, new b(null), 3);
        ge1.b.T(v1.a(this), null, null, new c(null), 3);
        ge1.b.T(v1.a(this), null, null, new d(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final u13.a x4(h hVar, tf2.c cVar, v13.c cVar2) {
        i iVar;
        hVar.getClass();
        if (cVar2 instanceof i) {
            iVar = (i) cVar2;
            int i14 = iVar.f152742c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f152742c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(hVar, cVar2);
            }
        } else {
            iVar = new i(hVar, cVar2);
        }
        Object obj = iVar.f152740a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f152742c;
        if (i15 == 0) {
            r.b(obj);
            e2 e2Var = cVar.f164470b.f164468a;
            m mVar = new m(hVar);
            iVar.f152742c = 1;
            e2Var.getClass();
            if (e2.m(e2Var, mVar, iVar) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        o2.c.f();
        return null;
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final String y4(ag2.c.a aVar, double d14, boolean z14) {
        aVar.getClass();
        int i14 = e.f152733a[aVar.ordinal()];
        if (i14 != 1) {
            return i14 != 2 ? z4().h().f3292a.h(Integer.valueOf((int) d14)) : z4().h().f3292a.o(Float.valueOf((float) d14), z14, !z14);
        }
        return z4().h().f3292a.r(Float.valueOf((float) d14), z14);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final fg2.f z4() {
        return (fg2.f) this.f152708a.getValue();
    }
}
