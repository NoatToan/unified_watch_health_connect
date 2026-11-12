package r1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lr1/h2;", "Lr1/c2;", "Ls1/k;", "Lg6/m;", "animationSpec", "Lh4/d;", "alignment", "Lkotlin/Function2;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ls1/k;Lh4/d;Le23/p;)V", "a", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h2 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s1.k<g6.m> f149100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h4.d f149101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.p<? super g6.m, ? super g6.m, Unit> f149102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f149103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f149104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f149105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p3.c2 f149106g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.l<f5.v1.a, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f149110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f149111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f149112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f5.b1 f149113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f5.v1 f149114f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j8, int i14, int i15, f5.b1 b1Var, f5.v1 v1Var) {
            super(1);
            this.f149110b = j8;
            this.f149111c = i14;
            this.f149112d = i15;
            this.f149113e = b1Var;
            this.f149114f = v1Var;
        }

        @Override // e23.l
        public final Unit invoke(f5.v1.a aVar) {
            h4.d dVar = h2.this.f149101b;
            long j8 = (((long) this.f149112d) & 4294967295L) | (((long) this.f149111c) << 32);
            g6.m.a aVar2 = g6.m.f76012b;
            f5.v1.a.y(aVar, this.f149114f, dVar.a(this.f149110b, j8, this.f149113e.getF69049a()));
            return Unit.INSTANCE;
        }
    }

    public h2(s1.k<g6.m> kVar, h4.d dVar, e23.p<? super g6.m, ? super g6.m, Unit> pVar) {
        this.f149100a = kVar;
        this.f149101b = dVar;
        this.f149102c = pVar;
        this.f149103d = g0.f149086a;
        this.f149104e = g6.b.b(0, 0, 15);
        this.f149106g = p3.p0.n(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        f5.v1 v1VarQ;
        char c14;
        long j14;
        a aVar;
        long jD;
        a aVar2;
        if (b1Var.t1()) {
            this.f149104e = j8;
            this.f149105f = true;
            v1VarQ = y0Var.Q(j8);
        } else {
            v1VarQ = y0Var.Q(this.f149105f ? this.f149104e : j8);
        }
        f5.v1 v1Var = v1VarQ;
        long j15 = (((long) v1Var.f69145b) & 4294967295L) | (((long) v1Var.f69144a) << 32);
        g6.m.a aVar3 = g6.m.f76012b;
        if (b1Var.t1()) {
            this.f149103d = j15;
            c14 = ' ';
            jD = j15;
            j14 = 4294967295L;
        } else {
            long j16 = !g6.m.c(this.f149103d, g0.f149086a) ? this.f149103d : j15;
            p3.c2 c2Var = this.f149106g;
            a aVar4 = (a) c2Var.getF182175a();
            p005kotlin.jvm.internal.j jVar = null;
            if (aVar4 != null) {
                s1.b<g6.m, s1.o> bVar = aVar4.f149107a;
                c14 = ' ';
                j14 = 4294967295L;
                boolean z14 = (g6.m.c(j16, bVar.e().f76013a) || bVar.f()) ? false : true;
                if (!g6.m.c(j16, ((g6.m) bVar.f155491e.getF182175a()).f76013a) || z14) {
                    aVar4.f149108b = bVar.e().f76013a;
                    aVar2 = aVar4;
                    ge1.b.T(getCoroutineScope(), null, null, new i2(aVar2, j16, this, null), 3);
                } else {
                    aVar2 = aVar4;
                }
                aVar = aVar2;
            } else {
                c14 = ' ';
                j14 = 4294967295L;
                long j17 = 1;
                aVar = new a(new s1.b(g6.m.a(j16), s1.e2.f155575h, g6.m.a((j17 & 4294967295L) | (j17 << 32)), null, 8, null), j16, jVar);
            }
            c2Var.setValue(aVar);
            jD = g6.b.d(j8, aVar.f149107a.e().f76013a);
        }
        int i14 = (int) (jD >> c14);
        int i15 = (int) (jD & j14);
        return f5.b1.h0(b1Var, i14, i15, new b(j15, i14, i15, b1Var, v1Var));
    }

    @Override // h4.r.c
    public final void onAttach() {
        super.onAttach();
        this.f149103d = g0.f149086a;
        this.f149105f = false;
    }

    @Override // h4.r.c
    public final void onReset() {
        super.onReset();
        this.f149106g.setValue(null);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lr1/h2$a;", "", "Ls1/b;", "Lg6/m;", "Ls1/o;", "anim", "startSize", "<init>", "(Ls1/b;JLkotlin/jvm/internal/j;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s1.b<g6.m, s1.o> f149107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f149108b;

        private a(s1.b<g6.m, s1.o> bVar, long j8) {
            this.f149107a = bVar;
            this.f149108b = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f149107a, aVar.f149107a) && g6.m.c(this.f149108b, aVar.f149108b);
        }

        public final int hashCode() {
            int iHashCode = this.f149107a.hashCode() * 31;
            long j8 = this.f149108b;
            g6.m.a aVar = g6.m.f76012b;
            return Long.hashCode(j8) + iHashCode;
        }

        public final String toString() {
            return "AnimData(anim=" + this.f149107a + ", startSize=" + ((Object) g6.m.d(this.f149108b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ a(s1.b bVar, long j8, p005kotlin.jvm.internal.j jVar) {
            this(bVar, j8);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h2(s1.k kVar, h4.d dVar, e23.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            h4.d.f81522a.getClass();
            dVar = h4.d.a.f81524b;
        }
        this(kVar, dVar, (i14 & 4) != 0 ? null : pVar);
    }
}
