package nc;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import lc.h0;
import lc.o0;
import lc.v0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.p0;
import p3.x1;
import r1.u1;
import r1.w1;

/* JADX INFO: loaded from: classes.dex */
@v0.a("composable")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lnc/e;", "Llc/v0;", "Lnc/e$b;", "<init>", "()V", "b", "a", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends v0<b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f125265c;

    static {
        new a(null);
    }

    public e() {
        super("composable");
        this.f125265c = p0.n(Boolean.FALSE);
    }

    @Override // lc.v0
    public final h0 a() {
        nc.b.f125259a.getClass();
        return new b(this, (e23.r<? super r1.l, lc.v, ? super p3.m, ? super Integer, Unit>) nc.b.f125260b);
    }

    @Override // lc.v0
    public final void d(List list, o0 o0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().h((lc.v) it.next());
        }
        this.f125265c.setValue(Boolean.FALSE);
    }

    @Override // lc.v0
    public final void i(lc.v vVar, boolean z14) {
        b().e(vVar, z14);
        this.f125265c.setValue(Boolean.TRUE);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnc/e$a;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Lnc/e$b;", "Llc/h0;", "Lnc/e;", "navigator", "Lkotlin/Function2;", "Lr1/l;", "Llc/v;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Lnc/e;Le23/r;)V", "Lkotlin/Function1;", "(Lnc/e;Le23/q;)V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends h0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e23.r<r1.l, lc.v, p3.m, Integer, Unit> f125266g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public e23.l<r1.n<lc.v>, u1> f125267h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public e23.l<r1.n<lc.v>, w1> f125268i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public e23.l<r1.n<lc.v>, u1> f125269j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public e23.l<r1.n<lc.v>, w1> f125270k;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements e23.r<r1.l, lc.v, p3.m, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e23.q<lc.v, p3.m, Integer, Unit> f125271a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(e23.q<? super lc.v, ? super p3.m, ? super Integer, Unit> qVar) {
                this.f125271a = qVar;
            }

            @Override // e23.r
            public final Unit invoke(r1.l lVar, lc.v vVar, p3.m mVar, Integer num) {
                int iIntValue = num.intValue();
                x1 x1Var = p3.n.f135158a;
                Integer numValueOf = Integer.valueOf((iIntValue >> 3) & 14);
                this.f125271a.invoke(vVar, mVar, numValueOf);
                return Unit.INSTANCE;
            }
        }

        @o13.e
        public b(e eVar, e23.q qVar) {
            this(eVar, (e23.r<? super r1.l, lc.v, ? super p3.m, ? super Integer, Unit>) new z3.e(1587956030, true, new a(qVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(e eVar, e23.r<? super r1.l, lc.v, ? super p3.m, ? super Integer, Unit> rVar) {
            super(eVar);
            this.f125266g = rVar;
        }
    }
}
