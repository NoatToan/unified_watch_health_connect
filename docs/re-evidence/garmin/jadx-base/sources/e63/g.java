package e63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le63/g;", "T", "E", "Le63/v;", "expectedValue", "Lkotlin/Function1;", "getter", "<init>", "(Ljava/lang/Object;Le23/l;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g<T, E> implements v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f63246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<T, E> f63247b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(E e4, e23.l<? super T, ? extends E> lVar) {
        lVar.getClass();
        this.f63246a = e4;
        this.f63247b = lVar;
    }

    @Override // e63.v
    public final boolean test(T t7) {
        return p005kotlin.jvm.internal.s.g(this.f63247b.invoke(t7), this.f63246a);
    }
}
