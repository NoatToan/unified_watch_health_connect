package ci0;

import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lci0/j;", "Lg32/b;", "Lsh0/d;", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements g32.b<sh0.d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f27657b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final th0.a f27658c = (th0.a) KoinJavaComponent.get$default(th0.a.class, null, null, 6, null);

    private j() {
    }

    @Override // g32.b
    public final boolean a() {
        return f27658c.c();
    }

    @Override // g32.b
    public final boolean b() {
        return f27658c.a();
    }

    @Override // g32.b
    public final boolean c(sh0.d dVar) {
        sh0.c cVar;
        sh0.d dVar2 = dVar;
        List<sh0.c.d> listD = (dVar2 == null || (cVar = dVar2.f159292a) == null) ? null : cVar.d();
        return !(listD == null || listD.isEmpty());
    }

    @Override // g32.b
    public final void d() {
        f27658c.b();
    }

    @Override // g32.b
    public final void e() {
        f27658c.d();
    }
}
