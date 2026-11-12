package nc;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import lc.h0;
import lc.o0;
import lc.v0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@v0.a("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lnc/k;", "Llc/v0;", "Lnc/k$b;", "<init>", "()V", "b", "a", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends v0<b> {
    static {
        new a(null);
    }

    public k() {
        super("dialog");
    }

    @Override // lc.v0
    public final h0 a() {
        c.f125262a.getClass();
        return new b(this, null, c.f125263b, 2, null);
    }

    @Override // lc.v0
    public final void d(List list, o0 o0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().g((lc.v) it.next());
        }
    }

    @Override // lc.v0
    public final void i(lc.v vVar, boolean z14) {
        b().e(vVar, z14);
        int iF0 = p13.h0.f0((Iterable) b().f111901f.f150540a.getValue(), vVar);
        int i14 = 0;
        for (Object obj : (Iterable) b().f111901f.f150540a.getValue()) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            lc.v vVar2 = (lc.v) obj;
            if (i14 > iF0) {
                b().b(vVar2);
            }
            i14 = i15;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnc/k$a;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnc/k$b;", "Llc/h0;", "Llc/k;", "Lnc/k;", "navigator", "Lk6/u;", "dialogProperties", "Lkotlin/Function1;", "Llc/v;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Lnc/k;Lk6/u;Le23/q;)V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends h0 implements lc.k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final p004k6.u f125296g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e23.q<lc.v, p3.m, Integer, Unit> f125297h;

        public /* synthetic */ b(k kVar, p004k6.u uVar, e23.q qVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(kVar, (i14 & 2) != 0 ? new p004k6.u(false, false, false, 7, (p005kotlin.jvm.internal.j) null) : uVar, qVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(k kVar, p004k6.u uVar, e23.q<? super lc.v, ? super p3.m, ? super Integer, Unit> qVar) {
            super(kVar);
            this.f125296g = uVar;
            this.f125297h = qVar;
        }
    }
}
