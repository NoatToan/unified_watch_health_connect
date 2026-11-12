package s1;

import p005kotlin.Metadata;
import s1.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ls1/d2;", "T", "Ls1/r;", "V", "Ls1/c2;", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "<init>", "(Le23/l;Le23/l;)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d2<T, V extends r> implements c2<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<T, V> f155546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<V, T> f155547b;

    /* JADX WARN: Multi-variable type inference failed */
    public d2(e23.l<? super T, ? extends V> lVar, e23.l<? super V, ? extends T> lVar2) {
        this.f155546a = lVar;
        this.f155547b = lVar2;
    }

    @Override // s1.c2
    public final e23.l<T, V> a() {
        return this.f155546a;
    }

    @Override // s1.c2
    public final e23.l<V, T> b() {
        return this.f155547b;
    }
}
