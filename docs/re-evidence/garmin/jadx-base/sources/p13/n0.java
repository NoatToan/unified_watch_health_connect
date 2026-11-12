package p13;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp13/n0;", "T", "", "Lp13/m0;", "Lkotlin/Function0;", "", "iteratorFactory", "<init>", "(Le23/a;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n0<T> implements Iterable<m0<? extends T>>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Iterator<T>> f134954a;

    /* JADX WARN: Multi-variable type inference failed */
    public n0(e23.a<? extends Iterator<? extends T>> aVar) {
        aVar.getClass();
        this.f134954a = aVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<m0<T>> iterator() {
        return new o0(this.f134954a.invoke());
    }
}
