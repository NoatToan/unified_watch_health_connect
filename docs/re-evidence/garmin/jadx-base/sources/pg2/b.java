package pg2;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import java.util.Map;
import java.util.Timer;
import o13.r;
import of2.c0;
import og2.v;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.i;
import r53.j;
import r53.k2;
import r53.n2;
import r53.o2;
import r53.q2;
import r53.s;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpg2/b;", "Landroidx/lifecycle/u1;", "Lorg/koin/core/component/KoinComponent;", "Lqg2/c;", "chartType", "Lr53/o2;", "", "isPaused", "isDisconnected", "<init>", "(Lqg2/c;Lr53/o2;Lr53/o2;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg2.c f137617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final of2.b f137618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f137619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f137620d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements i<pg2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f137621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f137622b;

        /* JADX INFO: renamed from: pg2.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2606a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f137623a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f137624b;

            /* JADX INFO: renamed from: pg2.b$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.charts.landscape.ChartViewModel$special$$inlined$map$1$2", f = "ChartViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2607a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f137625a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f137626b;

                public C2607a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f137625a = obj;
                    this.f137626b |= Integer.MIN_VALUE;
                    return C2606a.this.emit(null, this);
                }
            }

            public C2606a(j jVar, b bVar) {
                this.f137623a = jVar;
                this.f137624b = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
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
                C2607a c2607a;
                if (dVar instanceof C2607a) {
                    c2607a = (C2607a) dVar;
                    int i14 = c2607a.f137626b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2607a.f137626b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2607a = new C2607a(dVar);
                    }
                } else {
                    c2607a = new C2607a(dVar);
                }
                Object obj2 = c2607a.f137625a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2607a.f137626b;
                if (i15 == 0) {
                    r.b(obj2);
                    Object obj3 = (pg2.a) ((Map) obj).get(this.f137624b.f137617a);
                    if (obj3 == null) {
                        pg2.a.f137610c.getClass();
                        obj3 = pg2.a.f137611d;
                    }
                    c2607a.f137626b = 1;
                    if (this.f137623a.emit(obj3, c2607a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public a(i iVar, b bVar) {
            this.f137621a = iVar;
            this.f137622b = bVar;
        }

        @Override // r53.i
        public final Object collect(j<? super pg2.a> jVar, t13.d dVar) {
            Object objCollect = this.f137621a.collect(new C2606a(jVar, this.f137622b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: pg2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2608b implements i<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f137628a;

        /* JADX INFO: renamed from: pg2.b$b$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f137629a;

            /* JADX INFO: renamed from: pg2.b$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.charts.landscape.ChartViewModel$special$$inlined$map$2$2", f = "ChartViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2609a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f137630a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f137631b;

                public C2609a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f137630a = obj;
                    this.f137631b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(j jVar) {
                this.f137629a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2609a c2609a;
                if (dVar instanceof C2609a) {
                    c2609a = (C2609a) dVar;
                    int i14 = c2609a.f137631b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2609a.f137631b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2609a = new C2609a(dVar);
                    }
                } else {
                    c2609a = new C2609a(dVar);
                }
                Object obj2 = c2609a.f137630a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2609a.f137631b;
                if (i15 == 0) {
                    r.b(obj2);
                    Integer num = new Integer(((pg2.a) obj).f137613b);
                    c2609a.f137631b = 1;
                    if (this.f137629a.emit(num, c2609a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public C2608b(i iVar) {
            this.f137628a = iVar;
        }

        @Override // r53.i
        public final Object collect(j<? super Integer> jVar, t13.d dVar) {
            Object objCollect = this.f137628a.collect(new a(jVar), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public b(qg2.c cVar, o2<Boolean> o2Var, o2<Boolean> o2Var2) {
        o2 o2VarA;
        b2 b2Var;
        cVar.getClass();
        o2Var.getClass();
        o2Var2.getClass();
        this.f137617a = cVar;
        of2.b bVar = (of2.b) ((c0) KoinJavaComponent.get$default(c0.class, null, null, 6, null)).f131778g.getValue();
        this.f137618b = bVar;
        if (bVar == null || (b2Var = bVar.f131734m) == null) {
            pg2.a.f137610c.getClass();
            o2VarA = q2.a(pg2.a.f137611d);
        } else {
            a aVar = new a(b2Var, this);
            w9.a aVarA = v1.a(this);
            n2 n2VarA = k2.a.a(k2.f150703a, 2);
            pg2.a.f137610c.getClass();
            o2VarA = s.K(aVar, aVarA, n2VarA, pg2.a.f137611d);
        }
        this.f137619c = o2VarA;
        this.f137620d = new v(cVar, bVar, o2Var, o2Var2, v1.a(this), (pg2.a) o2VarA.getValue());
    }

    @Override // org.koin.core.component.KoinComponent
    public final /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        v vVar = this.f137620d;
        Timer timer = vVar.f132118m;
        if (timer != null) {
            timer.cancel();
        }
        vVar.f132118m = null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, r53.i, r53.o2] */
    public final o2<Integer> x4() {
        ?? r14 = this.f137619c;
        return s.K(new C2608b(r14), v1.a(this), k2.a.a(k2.f150703a, 2), Integer.valueOf(((pg2.a) r14.getValue()).f137613b));
    }
}
