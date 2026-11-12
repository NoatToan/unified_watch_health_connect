package g1;

/* JADX INFO: loaded from: classes.dex */
public class s implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p.a f74787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f74788b;

    public s(p.a aVar, c0 c0Var) {
        this.f74787a = aVar;
        this.f74788b = c0Var;
    }

    @Override // g1.c0
    public final long a() {
        return ((Long) this.f74787a.mo330apply(Long.valueOf(this.f74788b.a()))).longValue();
    }

    @Override // g1.c0
    public final long b() {
        return ((Long) this.f74787a.mo330apply(Long.valueOf(this.f74788b.b()))).longValue();
    }
}
