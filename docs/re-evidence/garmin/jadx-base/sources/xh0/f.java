package xh0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e23.p;
import et.o;
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
import p3.x1;
import r53.c2;
import r53.j;
import r53.p2;
import ta0.g0;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.floors.presentation.FloorsReportsScreenKt$FloorsReportsScreen$1$1", f = "FloorsReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f190984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f190985b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, n82.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f190984a = hVar;
            this.f190985b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f190984a, this.f190985b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean z14 = this.f190985b.f124961b.a() == o82.g.f130850c;
            p2 p2Var = this.f190984a.f191013f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, g.a((g) value, null, null, false, false, false, false, z14, false, 191)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.floors.presentation.FloorsReportsScreenKt$FloorsReportsScreen$3$1$2$1$1$1", f = "FloorsReportsScreen.kt", l = {140}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f190986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f190987b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f190988c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f190989d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.floors.presentation.FloorsReportsScreenKt$FloorsReportsScreen$3$1$2$1$1$1$3", f = "FloorsReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o82.a f190990a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f190991b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o82.a aVar, h hVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f190990a = aVar;
                this.f190991b = hVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f190990a, this.f190991b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                this.f190991b.x4(k.g(l.h(this.f190990a.f130843a), LocalDate.now()));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: xh0.f$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3555b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f190992a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f190993b;

            /* JADX INFO: renamed from: xh0.f$b$b$a */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f190994a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f190995b;

                /* JADX INFO: renamed from: xh0.f$b$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.floors.presentation.FloorsReportsScreenKt$FloorsReportsScreen$3$1$2$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "FloorsReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C3556a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f190996a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f190997b;

                    public C3556a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f190996a = obj;
                        this.f190997b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(j jVar, o82.a aVar) {
                    this.f190994a = jVar;
                    this.f190995b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C3556a c3556a;
                    if (dVar instanceof C3556a) {
                        c3556a = (C3556a) dVar;
                        int i14 = c3556a.f190997b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c3556a.f190997b = i14 - Integer.MIN_VALUE;
                        } else {
                            c3556a = new C3556a(dVar);
                        }
                    } else {
                        c3556a = new C3556a(dVar);
                    }
                    Object obj2 = c3556a.f190996a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c3556a.f190997b;
                    if (i15 == 0) {
                        r.b(obj2);
                        if (s.g((o82.a) obj, this.f190995b)) {
                            c3556a.f190997b = 1;
                            if (this.f190994a.emit(obj, c3556a) == aVar) {
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

            public C3555b(r53.i iVar, o82.a aVar) {
                this.f190992a = iVar;
                this.f190993b = aVar;
            }

            @Override // r53.i
            public final Object collect(j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f190992a.collect(new a(jVar, this.f190993b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n82.f fVar, o82.a aVar, h hVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f190987b = fVar;
            this.f190988c = aVar;
            this.f190989d = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f190987b, this.f190988c, this.f190989d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190986a;
            if (i14 == 0) {
                r.b(obj);
                c2 c2VarS = p0.s(new d52.p(this.f190987b, 23));
                o82.a aVar2 = this.f190988c;
                C3555b c3555b = new C3555b(c2VarS, aVar2);
                a aVar3 = new a(aVar2, this.f190989d, null);
                this.f190986a = 1;
                if (r53.s.k(c3555b, aVar3, this) == aVar) {
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
        public static final /* synthetic */ int[] f190999a;

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
            f190999a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h hVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        hVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(343314488);
        int i15 = i14 | (o0VarE.r(hVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(hVar.f191013f, o0VarE);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new d(0);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                n82.f.a aVar3 = new n82.f.a(((g) p1VarC.getF182175a()).f191001b, null, ((g) p1VarC.getF182175a()).f191000a, 2, null);
                o0VarE.K(aVar3);
                objQ2 = aVar3;
            }
            n82.f fVarA = n82.j.a((n82.f.a) objQ2, null, o0VarE, 2);
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = i53.a.a(o82.g.f130850c, o82.g.f130851d, o82.g.f130853f, o82.g.f130856i);
                o0VarE.K(objQ3);
            }
            i53.f fVar = (i53.f) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new yd1.a(context);
                o0VarE.K(objQ4);
            }
            yd1.a aVar4 = (yd1.a) objQ4;
            o82.g gVarA = fVarA.f124961b.a();
            boolean zR = o0VarE.r(hVar) | o0VarE.B(fVarA);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new a(hVar, fVarA, null);
                o0VarE.K(objQ5);
            }
            l0.e((p) objQ5, gVarA, o0VarE);
            o0Var = o0VarE;
            z02.d.a(((g) p1VarC.getF182175a()).f191002c, z3.f.c(-1625384899, new o(aVar, aVar2, p1VarC, 2), o0VarE), null, null, null, z3.f.c(-570596799, new g0(fVar, fVarA, hVar, aVar4, p1VarC, p1Var, 15), o0VarE), o0Var, 196656, 28);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.b(hVar, aVar, aVar2, i14, 29);
        }
    }
}
