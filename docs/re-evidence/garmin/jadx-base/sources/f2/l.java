package f2;

import com.google.firebase.analytics.FirebaseAnalytics;
import g2.p1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\tB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lf2/l;", "Lf2/j0;", "Lg2/u;", "Lf2/k;", "Lkotlin/Function1;", "", FirebaseAnalytics.Param.CONTENT, "<init>", "(Le23/l;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l extends g2.u<k> implements j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ex.b f68229d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f68230a = new n0(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1<k> f68231b = new p1<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f68232c;

    static {
        new a(null);
        f68229d = new ex.b(4);
    }

    public l(e23.l<? super j0, Unit> lVar) {
        lVar.invoke(this);
    }

    @Override // f2.j0
    public final void d(e23.l lVar, e23.q qVar) {
        this.f68231b.a(1, new k(null, lVar != null ? new b71.n(lVar, 6, (byte) 0) : f68229d, new ep0.a(25), new z3.e(-291643851, true, new e2.l(qVar, 1))));
        if (lVar != null) {
            this.f68232c = true;
        }
    }

    @Override // f2.j0
    public final void g(int i14, e23.l lVar, e23.p pVar, e23.l lVar2, z3.e eVar) {
        this.f68231b.a(i14, new k(lVar, pVar == null ? f68229d : pVar, lVar2, eVar));
        if (pVar != null) {
            this.f68232c = true;
        }
    }

    @Override // g2.u
    /* JADX INFO: renamed from: m, reason: from getter */
    public final p1 getF81020c() {
        return this.f68231b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf2/l$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
