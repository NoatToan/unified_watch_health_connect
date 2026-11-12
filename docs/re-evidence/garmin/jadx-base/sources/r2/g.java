package r2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.h0;
import b5.s0;
import f5.c0;
import h5.c1;
import h5.u;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.h1;
import p3.c2;
import p3.t1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\f\rB-\u0012$\u0010\t\u001a \b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lr2/g;", "Lh5/m;", "Lh5/h;", "Lh5/u;", "Lkotlin/Function2;", "Ln4/c;", "Lt13/d;", "", "", "onPreShowContextMenu", "<init>", "(Le23/p;)V", "c", "b", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends h5.m implements h5.h, u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f149437e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.p<? super n4.c, ? super t13.d<? super Unit>, ? extends Object> f149438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f149439d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: r2.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class C2816a extends p005kotlin.jvm.internal.q implements e23.l<n4.c, Unit> {
            public C2816a(Object obj) {
                super(1, obj, g.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0);
            }

            @Override // e23.l
            public final Unit invoke(n4.c cVar) {
                long j8 = cVar.f123544a;
                g gVar = (g) this.receiver;
                int i14 = g.f149437e;
                gVar.getClass();
                s2.f fVar = (s2.f) h5.i.a(gVar, s2.g.f156002a);
                if (fVar != null) {
                    ge1.b.T(gVar.getCoroutineScope(), null, null, new h(gVar, j8, fVar, new b(gVar, j8, null), null), 3);
                }
                return Unit.INSTANCE;
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(h0 h0Var, t13.d<? super Unit> dVar) {
            Object objC = h1.c(h0Var, new p2.b(new C2816a(g.this), null), dVar);
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (objC != aVar) {
                objC = Unit.INSTANCE;
            }
            return objC == aVar ? objC : Unit.INSTANCE;
        }
    }

    static {
        new c(null);
    }

    public g(e23.p<? super n4.c, ? super t13.d<? super Unit>, ? extends Object> pVar) {
        this.f149438c = pVar;
        t1 t1Var = t1.f135313a;
        t1Var.getClass();
        this.f149439d = new c2(null, t1Var);
        U1(s0.a(new a()));
    }

    @Override // h5.u
    public final void o(c1 c1Var) {
        this.f149439d.setValue(c1Var);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr2/g$c;", "", "<init>", "()V", "", "MESSAGE", "Ljava/lang/String;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr2/g$b;", "Ls2/e;", "Ln4/c;", "localClickOffset", "<init>", "(Lr2/g;JLkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class b implements s2.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f149441a;

        private b(long j8) {
            this.f149441a = j8;
        }

        @Override // s2.e
        public final o2.d F() {
            return j.a(g.this);
        }

        @Override // s2.e
        public final long e0(c0 c0Var) {
            c0 c0Var2 = (c0) g.this.f149439d.getF182175a();
            if (c0Var2 != null) {
                return c0Var.b0(c0Var2, this.f149441a);
            }
            b2.e.d("Tried to open context menu before the anchor was placed.");
            o2.c.f();
            return 0L;
        }

        @Override // s2.e
        public final n4.d v1(c0 c0Var) {
            long jE0 = e0(c0Var);
            n4.g.f123559b.getClass();
            return g8.i.g(jE0, 0L);
        }

        public /* synthetic */ b(g gVar, long j8, p005kotlin.jvm.internal.j jVar) {
            this(j8);
        }
    }
}
