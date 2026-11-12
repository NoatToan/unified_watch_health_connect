package m3;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.e2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u001d\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lm3/s;", "Lm3/r;", "Ls1/b;", "", "Ls1/n;", "anim", "<init>", "(Ls1/b;)V", "()V", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f116298b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d4.l f116299c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1.b<Float, s1.n> f116300a;

    static {
        lr2.o oVar = new lr2.o(8);
        lq1.a aVar = new lq1.a(28);
        d4.l lVar = d4.m.f57455a;
        f116299c = new d4.l(oVar, aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s() {
        Float fValueOf = Float.valueOf(0.0f);
        p005kotlin.jvm.internal.m mVar = p005kotlin.jvm.internal.m.f105803a;
        this(new s1.b(fValueOf, e2.f155568a, null, null, 12, null));
    }

    public static s f(float f14) {
        Float fValueOf = Float.valueOf(f14);
        p005kotlin.jvm.internal.m mVar = p005kotlin.jvm.internal.m.f105803a;
        return new s(new s1.b(fValueOf, e2.f155568a, null, null, 12, null));
    }

    @Override // m3.r
    public final Object a(m mVar) {
        Object objC = s1.b.c(this.f116300a, new Float(0.0f), null, null, mVar, 14);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    @Override // m3.r
    public final float b() {
        return this.f116300a.e().floatValue();
    }

    @Override // m3.r
    public final Object c(float f14, v13.i iVar) {
        Object objG = this.f116300a.g(new Float(f14), iVar);
        return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
    }

    @Override // m3.r
    public final Object d(n nVar) {
        Object objC = s1.b.c(this.f116300a, new Float(1.0f), null, null, nVar, 14);
        return objC == u13.a.COROUTINE_SUSPENDED ? objC : Unit.INSTANCE;
    }

    @Override // m3.r
    public final boolean e() {
        return this.f116300a.f();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm3/s$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private s(s1.b<Float, s1.n> bVar) {
        this.f116300a = bVar;
    }
}
