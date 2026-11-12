package h3;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.p;
import g6.n;
import gl1.y;
import h4.r;
import h5.b0;
import h5.s;
import h5.t;
import java.util.ArrayList;
import o4.c0;
import o4.d0;
import o4.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.q0;
import p13.h0;
import s1.b2;
import s1.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lh3/i;", "Lh4/r$c;", "Lh5/h;", "Lh5/s;", "Lh5/b0;", "La2/i;", "interactionSource", "", "bounded", "Lg6/f;", "radius", "Lo4/j0;", TtmlNode.ATTR_TTS_COLOR, "Lkotlin/Function0;", "Lh3/b;", "rippleAlpha", "<init>", "(La2/i;ZFLo4/j0;Le23/a;Lkotlin/jvm/internal/j;)V", "material-ripple"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class i extends r.c implements h5.h, s, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.i f81246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f81248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f81249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.a<b> f81250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f81251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f81252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f81253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f81254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q0<a2.l> f81255j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {364}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f81256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f81257b;

        /* JADX INFO: renamed from: h3.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C1615a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f81259a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o53.b0 f81260b;

            public C1615a(i iVar, o53.b0 b0Var) {
                this.f81259a = iVar;
                this.f81260b = b0Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                float f14;
                a2.h hVar = (a2.h) obj;
                boolean z14 = hVar instanceof a2.l;
                i iVar = this.f81259a;
                if (!z14) {
                    l lVar = iVar.f81251f;
                    if (lVar == null) {
                        lVar = new l(iVar.f81247b, iVar.f81250e);
                        t.a(iVar);
                        iVar.f81251f = lVar;
                    }
                    ArrayList arrayList = lVar.f81271d;
                    if (hVar instanceof a2.e) {
                        arrayList.add(hVar);
                    } else if (hVar instanceof a2.f) {
                        arrayList.remove(((a2.f) hVar).f489a);
                    } else if (hVar instanceof a2.b) {
                        arrayList.add(hVar);
                    } else if (hVar instanceof a2.c) {
                        arrayList.remove(((a2.c) hVar).f483a);
                    } else if (hVar instanceof a2.a.b) {
                        arrayList.add(hVar);
                    } else if (hVar instanceof a2.a.c) {
                        arrayList.remove(((a2.a.c) hVar).f482a);
                    } else if (hVar instanceof a2.a.C0002a) {
                        arrayList.remove(((a2.a.C0002a) hVar).f481a);
                    }
                    a2.h hVar2 = (a2.h) h0.n0(arrayList);
                    if (!p005kotlin.jvm.internal.s.g(lVar.f81272e, hVar2)) {
                        o53.b0 b0Var = this.f81260b;
                        if (hVar2 != null) {
                            b bVarInvoke = lVar.f81269b.invoke();
                            boolean z15 = hVar2 instanceof a2.e;
                            if (z15) {
                                f14 = bVarInvoke.f81228c;
                            } else if (hVar2 instanceof a2.b) {
                                f14 = bVarInvoke.f81227b;
                            } else {
                                f14 = hVar2 instanceof a2.a.b ? bVarInvoke.f81226a : 0.0f;
                            }
                            b2<Float> b2Var = h.f81245a;
                            if (!z15 && ((hVar2 instanceof a2.b) || (hVar2 instanceof a2.a.b))) {
                                b2<Float> b2Var2 = new b2<>(45, 0, e0.f155563d, 2, null);
                                b2Var = b2Var2;
                            }
                            ge1.b.T(b0Var, null, null, new j(lVar, f14, b2Var, null), 3);
                        } else {
                            a2.h hVar3 = lVar.f81272e;
                            b2<Float> b2Var3 = h.f81245a;
                            if (!(hVar3 instanceof a2.e) && !(hVar3 instanceof a2.b) && (hVar3 instanceof a2.a.b)) {
                                b2Var3 = new b2<>(150, 0, e0.f155563d, 2, null);
                            }
                            ge1.b.T(b0Var, null, null, new k(lVar, b2Var3, null), 3);
                        }
                        lVar.f81272e = hVar2;
                    }
                } else if (iVar.f81254i) {
                    iVar.W1((a2.l) hVar);
                } else {
                    iVar.f81255j.g(hVar);
                }
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = i.this.new a(dVar);
            aVar.f81257b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f81256a;
            if (i14 == 0) {
                o13.r.b(obj);
                o53.b0 b0Var = (o53.b0) this.f81257b;
                i iVar = i.this;
                r53.i<a2.h> iVarC = iVar.f81246a.c();
                C1615a c1615a = new C1615a(iVar, b0Var);
                this.f81256a = 1;
                if (iVarC.collect(c1615a, this) == aVar) {
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

    private i(a2.i iVar, boolean z14, float f14, j0 j0Var, e23.a<b> aVar) {
        this.f81246a = iVar;
        this.f81247b = z14;
        this.f81248c = f14;
        this.f81249d = j0Var;
        this.f81250e = aVar;
        n4.g.f123559b.getClass();
        this.f81253h = 0L;
        this.f81255j = new q0<>(0, 1, null);
    }

    public abstract void U1(a2.l.b bVar, long j8, float f14);

    public abstract void V1(h5.h0 h0Var);

    public final void W1(a2.l lVar) {
        if (lVar instanceof a2.l.b) {
            U1((a2.l.b) lVar, this.f81253h, this.f81252g);
        } else if (lVar instanceof a2.l.c) {
            X1();
        } else if (lVar instanceof a2.l.a) {
            X1();
        }
    }

    public abstract void X1();

    @Override // h5.b0, h5.w0
    public final void e(long j8) {
        float fS0;
        this.f81254i = true;
        g6.c cVar = h5.k.g(this).A;
        this.f81253h = n.c(j8);
        float f14 = this.f81248c;
        if (Float.isNaN(f14)) {
            long j14 = this.f81253h;
            float f15 = c.f81230a;
            fS0 = n4.c.e(y.f(n4.g.g(j14), n4.g.d(j14))) / 2.0f;
            if (this.f81247b) {
                fS0 += cVar.s0(c.f81230a);
            }
        } else {
            fS0 = cVar.s0(f14);
        }
        this.f81252g = fS0;
        q0<a2.l> q0Var = this.f81255j;
        Object[] objArr = q0Var.f134667a;
        int i14 = q0Var.f134668b;
        for (int i15 = 0; i15 < i14; i15++) {
            W1((a2.l) objArr[i15]);
        }
        q0Var.j();
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h4.r.c
    public final void onAttach() {
        ge1.b.T(getCoroutineScope(), null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0076  */
    @Override // h5.s
    public final void p(h5.h0 h0Var) {
        h5.h0 h0Var2;
        q4.a aVar = h0Var.f81825a;
        h0Var.m1();
        l lVar = this.f81251f;
        if (lVar != null) {
            float f14 = this.f81252g;
            long jA = this.f81249d.a();
            float fFloatValue = lVar.f81270c.e().floatValue();
            if (fFloatValue > 0.0f) {
                long jC = d0.c(fFloatValue, jA, 14);
                if (lVar.f81268a) {
                    float fG = n4.g.g(aVar.b());
                    float fD = n4.g.d(aVar.b());
                    c0.f128819b.getClass();
                    int i14 = c0.f128820c;
                    q4.a.b bVar = aVar.f142543b;
                    long jB = bVar.b();
                    bVar.a().l();
                    try {
                        bVar.f142550a.a(0.0f, 0.0f, fG, fD, i14);
                        h0Var2 = h0Var;
                        q4.f.o0(h0Var2, jC, f14, 0L, null, 0, 124);
                        tn.k.p(bVar, jB);
                    } catch (Throwable th3) {
                        tn.k.p(bVar, jB);
                        throw th3;
                    }
                } else {
                    h0Var2 = h0Var;
                    q4.f.o0(h0Var2, jC, f14, 0L, null, 0, 124);
                }
            } else {
                h0Var2 = h0Var;
            }
        } else {
            h0Var2 = h0Var;
        }
        V1(h0Var2);
    }

    public /* synthetic */ i(a2.i iVar, boolean z14, float f14, j0 j0Var, e23.a aVar, p005kotlin.jvm.internal.j jVar) {
        this(iVar, z14, f14, j0Var, aVar);
    }
}
