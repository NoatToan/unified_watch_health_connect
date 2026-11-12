package t23;

/* JADX INFO: loaded from: classes3.dex */
public class k0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x33.c f162027a;

    public k0(x33.c cVar) {
        this.f162027a = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        x33.c cVar = (x33.c) obj;
        cVar.getClass();
        return Boolean.valueOf(!cVar.f188596a.c() && cVar.b().equals(this.f162027a));
    }
}
