package d52;

import a42.z;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import o53.b0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r53.c2;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesReportsScreenKt$PushesReportsScreen$1$1", f = "PushesReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f57594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f57595b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar, n82.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f57594a = qVar;
            this.f57595b = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f57594a, this.f57595b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f57594a.z4(this.f57595b.f124961b.a() == o82.g.f130850c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesReportsScreenKt$PushesReportsScreen$3$1$2$1$1$1", f = "PushesReportsScreen.kt", l = {150}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f57596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n82.f f57597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o82.a f57598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q f57599d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo82/a;", "it", "", "<anonymous>", "(Lo82/a;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesReportsScreenKt$PushesReportsScreen$3$1$2$1$1$1$3", f = "PushesReportsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<o82.a, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ o82.a f57600a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f57601b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o82.a aVar, q qVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f57600a = aVar;
                this.f57601b = qVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f57600a, this.f57601b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o82.a aVar, t13.d<? super Unit> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                boolean zG = g22.k.g(g22.l.h(this.f57600a.f130843a), LocalDate.now());
                q qVar = this.f57601b;
                qVar.x4(zG);
                qVar.z4(true);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: d52.o$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1231b implements r53.i<o82.a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.i f57602a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f57603b;

            /* JADX INFO: renamed from: d52.o$b$b$a */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a<T> implements r53.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ r53.j f57604a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o82.a f57605b;

                /* JADX INFO: renamed from: d52.o$b$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @v13.e(c = "com.garmin.android.apps.connectmobile.wheelchair.presentation.PushesReportsScreenKt$PushesReportsScreen$3$1$2$1$1$1$invokeSuspend$$inlined$filter$1$2", f = "PushesReportsScreen.kt", l = {50}, m = "emit", v = 2)
                public static final class C1232a extends v13.c {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f57606a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f57607b;

                    public C1232a(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.f57606a = obj;
                        this.f57607b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(r53.j jVar, o82.a aVar) {
                    this.f57604a = jVar;
                    this.f57605b = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    C1232a c1232a;
                    if (dVar instanceof C1232a) {
                        c1232a = (C1232a) dVar;
                        int i14 = c1232a.f57607b;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            c1232a.f57607b = i14 - Integer.MIN_VALUE;
                        } else {
                            c1232a = new C1232a(dVar);
                        }
                    } else {
                        c1232a = new C1232a(dVar);
                    }
                    Object obj2 = c1232a.f57606a;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = c1232a.f57607b;
                    if (i15 == 0) {
                        o13.r.b(obj2);
                        if (p005kotlin.jvm.internal.s.g((o82.a) obj, this.f57605b)) {
                            c1232a.f57607b = 1;
                            if (this.f57604a.emit(obj, c1232a) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            public C1231b(r53.i iVar, o82.a aVar) {
                this.f57602a = iVar;
                this.f57603b = aVar;
            }

            @Override // r53.i
            public final Object collect(r53.j<? super o82.a> jVar, t13.d dVar) {
                Object objCollect = this.f57602a.collect(new a(jVar, this.f57603b), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n82.f fVar, o82.a aVar, q qVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f57597b = fVar;
            this.f57598c = aVar;
            this.f57599d = qVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f57597b, this.f57598c, this.f57599d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f57596a;
            if (i14 == 0) {
                o13.r.b(obj);
                c2 c2VarS = p0.s(new p(this.f57597b, 0));
                o82.a aVar2 = this.f57598c;
                C1231b c1231b = new C1231b(c2VarS, aVar2);
                a aVar3 = new a(aVar2, this.f57599d, null);
                this.f57596a = 1;
                if (r53.s.k(c1231b, aVar3, this) == aVar) {
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

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57609a;

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
            f57609a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(q qVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, p3.m mVar, int i14) {
        o0 o0Var;
        qVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(1298154736);
        int i15 = i14 | (o0VarE.r(qVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024) | (o0VarE.r(aVar4) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(qVar.f57618g, o0VarE);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new d4.h(3);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                n82.f.a aVar5 = new n82.f.a(((r) p1VarC.getF182175a()).f57657b, null, ((r) p1VarC.getF182175a()).f57656a, 2, null);
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
            boolean zK = o0VarE.k(((r) p1VarC.getF182175a()).f57658c.ordinal());
            Object objQ4 = o0VarE.q();
            if (zK || objQ4 == c2565a) {
                objQ4 = new yd1.c(context, ((r) p1VarC.getF182175a()).f57658c);
                o0VarE.K(objQ4);
            }
            yd1.c cVar = (yd1.c) objQ4;
            o82.g gVarA = fVarA.f124961b.a();
            boolean zR = o0VarE.r(qVar) | o0VarE.B(fVarA);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new a(qVar, fVarA, null);
                o0VarE.K(objQ5);
            }
            l0.e((e23.p) objQ5, gVarA, o0VarE);
            boolean z14 = ((r) p1VarC.getF182175a()).f57659d;
            z3.e eVarC = z3.f.c(-1733788597, new l(aVar, aVar3, aVar2, p1VarC, 0), o0VarE);
            z3.e eVarC2 = z3.f.c(825323975, new b21.l0(fVar, (Object) fVarA, (Object) qVar, (Object) cVar, (Object) p1VarC, (Object) p1Var, (Object) aVar4, 5), o0VarE);
            o0Var = o0VarE;
            z02.d.a(z14, eVarC, null, null, null, eVarC2, o0Var, 196656, 28);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z(qVar, (e23.a) aVar, (e23.a) aVar2, (e23.a) aVar3, (e23.a) aVar4, i14);
        }
    }
}
