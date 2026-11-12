package i3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Li3/g2;", "Lh5/m;", "Lh5/u1;", "Lh5/h;", "Lh5/b0;", "Li3/p;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "autoSwitchToMinute", "Li3/qi;", "selection", "Ls1/k;", "", "animationSpec", "<init>", "(Li3/p;ZILs1/k;Lkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g2 extends h5.m implements h5.u1, h5.h, h5.b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f88156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1.k<Float> f88159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f88160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f88161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p3.c2 f88162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b5.u0 f88163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b5.u0 f88164k;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: i3.g2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", f = "TimePicker.kt", l = {1532}, m = "invokeSuspend")
        public static final class C1735a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f88166a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g2 f88167b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1735a(g2 g2Var, t13.d<? super C1735a> dVar) {
                super(2, dVar);
                this.f88167b = g2Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1735a(this.f88167b, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1735a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f88166a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    g2 g2Var = this.f88167b;
                    if (g2Var.f88157d) {
                        p pVar = g2Var.f88156c;
                        qi.f89469b.getClass();
                        pVar.d(qi.f89470c);
                    }
                    p pVar2 = g2Var.f88156c;
                    s1.k<Float> kVar = g2Var.f88159f;
                    this.f88166a = 1;
                    int iC = pVar2.f89247a.c();
                    qi.f89469b.getClass();
                    Object objB = pVar2.f89253g.b(u1.k1.PreventUserInput, new n(pVar2, pVar2.h(iC == 0 ? pVar2.f89250d : pVar2.f89251e), kVar, null), this);
                    if (objB != aVar) {
                        objB = Unit.INSTANCE;
                    }
                    if (objB == aVar) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", l = {1539}, m = "invokeSuspend")
        public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f88168a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g2 f88169b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n4.c f88170c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g2 g2Var, n4.c cVar, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f88169b = g2Var;
                this.f88170c = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f88169b, this.f88170c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f88168a;
                g2 g2Var = this.f88169b;
                if (i14 == 0) {
                    o13.r.b(obj);
                    float f14 = g2Var.f88160g;
                    p3.c2 c2Var = g2Var.f88162i;
                    n4.c cVar = this.f88170c;
                    g2Var.f88160g = Float.intBitsToFloat((int) (cVar.f123544a >> 32)) + f14;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.f123544a & 4294967295L)) + g2Var.f88161h;
                    g2Var.f88161h = fIntBitsToFloat;
                    p pVar = g2Var.f88156c;
                    float f15 = fIntBitsToFloat - ((int) (((g6.k) c2Var.getF182175a()).f76005a & 4294967295L));
                    float f16 = g2Var.f88160g - ((int) (((g6.k) c2Var.getF182175a()).f76005a >> 32));
                    float f17 = bi.f87631a;
                    float fAtan2 = ((float) Math.atan2(f15, f16)) - 1.5707964f;
                    if (fAtan2 < 0.0f) {
                        fAtan2 += 6.2831855f;
                    }
                    float f18 = fAtan2;
                    s1.k<Float> kVar = g2Var.f88159f;
                    this.f88168a = 1;
                    pVar.f89248b.f82011a = Boolean.FALSE;
                    Object objB = pVar.f89253g.b(u1.k1.UserInput, new o(pVar, f18, false, kVar, null), this);
                    if (objB != aVar) {
                        objB = Unit.INSTANCE;
                    }
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                bi.x(g2Var.f88156c, g2Var.f88160g, g2Var.f88161h, g2.X1(g2Var), ((g6.k) g2Var.f88162i.getF182175a()).f76005a);
                return Unit.INSTANCE;
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
            g2 g2Var = g2.this;
            Object objF = p008y1.m0.f(h0Var, new xd2.m0(29), new f2(g2Var, 0), new xh0.d(16), new fp0.l(g2Var, 21), dVar);
            return objF == u13.a.COROUTINE_SUSPENDED ? objF : Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements PointerInputEventHandler {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly1/c2;", "Ln4/c;", "it", "", "<anonymous>", "(Ly1/c2;Ln4/c;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.q<p008y1.c2, n4.c, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ long f88172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g2 f88173b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g2 g2Var, t13.d<? super a> dVar) {
                super(3, dVar);
                this.f88173b = g2Var;
            }

            @Override // e23.q
            public final Object invoke(p008y1.c2 c2Var, n4.c cVar, t13.d<? super Unit> dVar) {
                long j8 = cVar.f123544a;
                a aVar = new a(this.f88173b, dVar);
                aVar.f88172a = j8;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                long j8 = this.f88172a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
                g2 g2Var = this.f88173b;
                g2Var.f88160g = fIntBitsToFloat;
                g2Var.f88161h = Float.intBitsToFloat((int) (j8 & 4294967295L));
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: i3.g2$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
        @v13.e(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", f = "TimePicker.kt", l = {1509}, m = "invokeSuspend")
        public static final class C1736b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f88174a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g2 f88175b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n4.c f88176c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1736b(g2 g2Var, n4.c cVar, t13.d<? super C1736b> dVar) {
                super(2, dVar);
                this.f88175b = g2Var;
                this.f88176c = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1736b(this.f88175b, this.f88176c, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1736b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f88174a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    g2 g2Var = this.f88175b;
                    p pVar = g2Var.f88156c;
                    n4.c cVar = this.f88176c;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.f123544a >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar.f123544a & 4294967295L));
                    float fX1 = g2.X1(g2Var);
                    boolean z14 = g2Var.f88157d;
                    long j8 = ((g6.k) g2Var.f88162i.getF182175a()).f76005a;
                    s1.k<Float> kVar = g2Var.f88159f;
                    this.f88174a = 1;
                    if (bi.s(pVar, fIntBitsToFloat, fIntBitsToFloat2, fX1, z14, j8, kVar, this) == aVar) {
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

        public b() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(b5.h0 h0Var, t13.d<? super Unit> dVar) {
            g2 g2Var = g2.this;
            Object objF = p008y1.k3.f(h0Var, null, new a(g2Var, null), new ho0.g(g2Var, 13), dVar, 3);
            return objF == u13.a.COROUTINE_SUSPENDED ? objF : Unit.INSTANCE;
        }
    }

    private g2(p pVar, boolean z14, int i14, s1.k<Float> kVar) {
        this.f88156c = pVar;
        this.f88157d = z14;
        this.f88158e = i14;
        this.f88159f = kVar;
        g6.k.f76003b.getClass();
        this.f88162i = p3.p0.n(g6.k.a(0L));
        b5.v0 v0VarA = b5.s0.a(new b());
        U1(v0VarA);
        this.f88163j = v0VarA;
        b5.v0 v0VarA2 = b5.s0.a(new a());
        U1(v0VarA2);
        this.f88164k = v0VarA2;
    }

    public static final float X1(g2 g2Var) {
        g2Var.getClass();
        g6.c cVar = h5.k.g(g2Var).A;
        float fS0 = cVar.s0(bi.f87638h) * cVar.f0(g2Var.f88156c.i());
        n3.f1.f122826a.getClass();
        return fS0 / cVar.f0(n3.f1.f122828c);
    }

    @Override // h5.u1
    public final void a1() {
        this.f88163j.a1();
        this.f88164k.a1();
    }

    @Override // h5.b0, h5.w0
    public final void e(long j8) {
        this.f88162i.setValue(g6.k.a(g6.n.b(j8)));
        this.f88156c.f89249c.setValue(g6.f.a(h5.k.g(this).A.c1((int) (j8 >> 32))));
    }

    @Override // h5.u1
    public final void u1(b5.q qVar, b5.s sVar, long j8) {
        this.f88163j.u1(qVar, sVar, j8);
        this.f88164k.u1(qVar, sVar, j8);
    }

    public /* synthetic */ g2(p pVar, boolean z14, int i14, s1.k kVar, p005kotlin.jvm.internal.j jVar) {
        this(pVar, z14, i14, kVar);
    }
}
