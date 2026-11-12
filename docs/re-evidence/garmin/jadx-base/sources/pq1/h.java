package pq1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ch.qos.logback.core.net.SyslogConstants;
import e23.p;
import g22.k;
import g22.l;
import o13.r;
import o53.b0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.c2;
import r53.j;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.steps.presentation.StepsReportsScreenKt$StepsReportsScreen$1$1", f = "StepsReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ yq1.e f139581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f139582b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yq1.e eVar, n82.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f139581a = eVar;
            this.f139582b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f139581a, this.f139582b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f139581a.z4(this.f139582b.f124961b.a() == o82.g.f130850c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.steps.presentation.StepsReportsScreenKt$StepsReportsScreen$3$1$2$1$1$1", f = "StepsReportsScreen.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f139583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f139584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f139585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ yq1.e f139586d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.steps.presentation.StepsReportsScreenKt$StepsReportsScreen$3$1$2$1$1$1$3", f = "StepsReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o82.a f139587a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yq1.e f139588b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o82.a aVar, yq1.e eVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f139587a = aVar;
                this.f139588b = eVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f139587a, this.f139588b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                boolean zG = k.g(l.h(this.f139587a.f130843a), LocalDate.now());
                yq1.e eVar = this.f139588b;
                eVar.x4(zG);
                eVar.z4(true);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: pq1.h$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2642b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f139589a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f139590b;

            /* JADX INFO: renamed from: pq1.h$b$b$a */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f139591a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f139592b;

                /* JADX INFO: renamed from: pq1.h$b$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.steps.presentation.StepsReportsScreenKt$StepsReportsScreen$3$1$2$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "StepsReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C2643a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f139593a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f139594b;

                    public C2643a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f139593a = obj;
                        this.f139594b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(j jVar, o82.a aVar) {
                    this.f139591a = jVar;
                    this.f139592b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C2643a c2643a;
                    if (dVar instanceof C2643a) {
                        c2643a = (C2643a) dVar;
                        int i14 = c2643a.f139594b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c2643a.f139594b = i14 - Integer.MIN_VALUE;
                        } else {
                            c2643a = new C2643a(dVar);
                        }
                    } else {
                        c2643a = new C2643a(dVar);
                    }
                    Object obj2 = c2643a.f139593a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c2643a.f139594b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f139592b)) {
                            c2643a.f139594b = 1;
                            if (this.f139591a.emit(obj, c2643a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public C2642b(r53.i iVar, o82.a aVar) {
                this.f139589a = iVar;
                this.f139590b = aVar;
            }

            @Override // r53.i
            public final Object collect(j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f139589a.collect(new a(jVar, this.f139590b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n82.f fVar, o82.a aVar, yq1.e eVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f139584b = fVar;
            this.f139585c = aVar;
            this.f139586d = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f139584b, this.f139585c, this.f139586d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f139583a;
            if (i14 == 0) {
                r.b(obj);
                c2 c2VarS = p0.s(new d52.p(this.f139584b, 10));
                o82.a aVar2 = this.f139585c;
                C2642b c2642b = new C2642b(c2VarS, aVar2);
                a aVar3 = new a(aVar2, this.f139586d, null);
                this.f139583a = 1;
                if (r53.s.k(c2642b, aVar3, this) == aVar) {
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

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139596a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130850c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130851d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130853f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o82.g.f130856i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f139596a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(yq1.e eVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, m mVar, int i14) {
        o0 o0Var;
        eVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(1668813042);
        int i15 = i14 | (o0VarE.r(eVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024) | (o0VarE.r(aVar4) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(eVar.f198806g, o0VarE);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new pk0.m(2);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                n82.f.a aVar5 = new n82.f.a(((yq1.d) p1VarC.getF182175a()).f198792b, null, ((yq1.d) p1VarC.getF182175a()).f198791a, 2, null);
                o0VarE.K(aVar5);
                objQ2 = aVar5;
            }
            n82.f fVarA = n82.j.a((n82.f.a) objQ2, null, o0VarE, 2);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = i53.a.a(o82.g.f130850c, o82.g.f130851d, o82.g.f130853f, o82.g.f130856i);
                o0VarE.K(objQ3);
            }
            i53.f fVar = (i53.f) objQ3;
            boolean zK = o0VarE.k(((yq1.d) p1VarC.getF182175a()).f198793c.ordinal());
            Object objQ4 = o0VarE.q();
            if (zK || objQ4 == c2565a) {
                objQ4 = new yd1.c(context, ((yq1.d) p1VarC.getF182175a()).f198793c);
                o0VarE.K(objQ4);
            }
            yd1.c cVar = (yd1.c) objQ4;
            o82.g gVarA = fVarA.f124961b.a();
            boolean zR = o0VarE.r(eVar) | o0VarE.B(fVarA);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new a(eVar, fVarA, null);
                o0VarE.K(objQ5);
            }
            l0.e((p) objQ5, gVarA, o0VarE);
            boolean z14 = ((yq1.d) p1VarC.getF182175a()).f198794d;
            z3.e eVarC = z3.f.c(-2141098249, new d52.l(aVar, aVar4, aVar3, p1VarC, 1), o0VarE);
            z3.e eVarC2 = z3.f.c(-1894534917, new b21.l0(fVar, (Object) fVarA, (Object) eVar, (Object) cVar, (Object) p1VarC, (Object) p1Var, (Object) aVar2, 26), o0VarE);
            o0Var = o0VarE;
            z02.d.a(z14, eVarC, null, null, null, eVarC2, o0Var, 196656, 28);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ob0.e((Object) eVar, (Object) aVar, (Object) aVar2, (o13.h) aVar3, (o13.h) aVar4, i14, 12);
        }
    }
}
