package w2;

import ch.qos.logback.core.net.SyslogConstants;
import h5.c1;
import kotlin.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.p0;
import p5.k0;
import u1.i1;
import u1.j1;
import v2.g2;
import v2.h2;
import z2.d1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lw2/k;", "Lw2/h;", "Lh5/h;", "Lv2/h2;", "textFieldState", "Lw2/n;", "textFieldSelectionState", "Lv2/g2;", "textLayoutState", "", "visible", "<init>", "(Lv2/h2;Lw2/n;Lv2/g2;Z)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends h implements h5.h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f181346k = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h2 f181347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f181348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g2 f181349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f181350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f181351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s1.b<n4.c, s1.o> f181352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i1 f181353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o53.c2 f181354j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", f = "AndroidTextFieldMagnifier.android.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f181355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f181356b;

        /* JADX INFO: renamed from: w2.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C3382a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k f181358a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o53.b0 f181359b;

            public C3382a(k kVar, o53.b0 b0Var) {
                this.f181358a = kVar;
                this.f181359b = b0Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                long j8 = ((n4.c) obj).f123544a;
                k kVar = this.f181358a;
                s1.b<n4.c, s1.o> bVar = kVar.f181352h;
                if ((bVar.e().f123544a & 9223372034707292159L) == 9205357640488583168L || (j8 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (bVar.e().f123544a & 4294967295L)) == Float.intBitsToFloat((int) (j8 & 4294967295L))) {
                    Object objG = bVar.g(n4.c.a(j8), dVar);
                    return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
                }
                ge1.b.T(this.f181359b, null, null, new j(kVar, j8, null), 3);
                return Unit.INSTANCE;
            }
        }

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = k.this.new a(dVar);
            aVar.f181356b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f181355a;
            if (i14 == 0) {
                o13.r.b(obj);
                o53.b0 b0Var = (o53.b0) this.f181356b;
                k kVar = k.this;
                r53.c2 c2VarS = p0.s(new vc0.v(kVar, 20));
                C3382a c3382a = new C3382a(kVar, b0Var);
                this.f181355a = 1;
                if (c2VarS.collect(c3382a, this) == aVar) {
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
    public k(h2 h2Var, n nVar, g2 g2Var, boolean z14) {
        this.f181347c = h2Var;
        this.f181348d = nVar;
        this.f181349e = g2Var;
        this.f181350f = z14;
        g6.m.f76012b.getClass();
        c2 c2VarN = p0.n(g6.m.a(0L));
        this.f181351g = c2VarN;
        this.f181352h = new s1.b<>(n4.c.a(g.a(this.f181347c, this.f181348d, this.f181349e, ((g6.m) c2VarN.getF182175a()).f76013a)), d1.f201560b, n4.c.a(d1.f201561c), null, 8, null);
        final int i14 = 0;
        e23.l lVar = new e23.l(this) { // from class: w2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f181338b;

            {
                this.f181338b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                k kVar = this.f181338b;
                switch (i15) {
                    case 0:
                        return kVar.f181352h.e();
                    default:
                        g6.h hVar = (g6.h) obj;
                        int i16 = k.f181346k;
                        g6.c cVar = (g6.c) h5.i.a(kVar, t1.f91490h);
                        long jF0 = (((long) cVar.f0(g6.h.c(hVar.f76002a))) << 32) | (((long) cVar.f0(g6.h.b(hVar.f76002a))) & 4294967295L);
                        g6.m.a aVar = g6.m.f76012b;
                        kVar.f181351g.setValue(g6.m.a(jF0));
                        return Unit.INSTANCE;
                }
            }
        };
        final int i15 = 1;
        i1 i1Var = new i1(lVar, null, new e23.l(this) { // from class: w2.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f181338b;

            {
                this.f181338b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                k kVar = this.f181338b;
                switch (i16) {
                    case 0:
                        return kVar.f181352h.e();
                    default:
                        g6.h hVar = (g6.h) obj;
                        int i17 = k.f181346k;
                        g6.c cVar = (g6.c) h5.i.a(kVar, t1.f91490h);
                        long jF0 = (((long) cVar.f0(g6.h.c(hVar.f76002a))) << 32) | (((long) cVar.f0(g6.h.b(hVar.f76002a))) & 4294967295L);
                        g6.m.a aVar = g6.m.f76012b;
                        kVar.f181351g.setValue(g6.m.a(jF0));
                        return Unit.INSTANCE;
                }
            }
        }, 0.0f, true, 0L, 0.0f, 0.0f, false, null, 1002, null);
        U1(i1Var);
        this.f181353i = i1Var;
    }

    @Override // w2.h, h5.y1
    public final void D1(k0 k0Var) {
        this.f181353i.D1(k0Var);
    }

    @Override // w2.h
    public final void X1(h2 h2Var, n nVar, g2 g2Var, boolean z14) {
        h2 h2Var2 = this.f181347c;
        n nVar2 = this.f181348d;
        g2 g2Var2 = this.f181349e;
        boolean z15 = this.f181350f;
        this.f181347c = h2Var;
        this.f181348d = nVar;
        this.f181349e = g2Var;
        this.f181350f = z14;
        if (p005kotlin.jvm.internal.s.g(h2Var, h2Var2) && p005kotlin.jvm.internal.s.g(nVar, nVar2) && p005kotlin.jvm.internal.s.g(g2Var, g2Var2) && z14 == z15) {
            return;
        }
        Y1();
    }

    public final void Y1() {
        o53.c2 c2Var = this.f181354j;
        if (c2Var != null) {
            c2Var.c(null);
        }
        this.f181354j = null;
        p5.j0<e23.a<n4.c>> j0Var = j1.f167577a;
        this.f181354j = ge1.b.T(getCoroutineScope(), null, null, new a(null), 3);
    }

    @Override // w2.h, f5.i1
    public final void o(c1 c1Var) {
        this.f181353i.o(c1Var);
    }

    @Override // h4.r.c
    public final void onAttach() {
        Y1();
    }

    @Override // w2.h, h5.s
    public final void p(h5.h0 h0Var) {
        h0Var.m1();
        this.f181353i.p(h0Var);
    }
}
