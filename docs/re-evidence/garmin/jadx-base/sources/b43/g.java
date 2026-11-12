package b43;

/* JADX INFO: loaded from: classes3.dex */
public class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t23.a f15726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t23.a f15727b;

    public g(t23.a aVar, t23.a aVar2) {
        this.f15726a = aVar;
        this.f15727b = aVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        t23.l lVar = (t23.l) obj2;
        p005kotlin.reflect.jvm.internal.impl.resolve.a aVar = p005kotlin.reflect.jvm.internal.impl.resolve.a.f105943a;
        return Boolean.valueOf(p005kotlin.jvm.internal.s.g((t23.l) obj, this.f15726a) && p005kotlin.jvm.internal.s.g(lVar, this.f15727b));
    }
}
