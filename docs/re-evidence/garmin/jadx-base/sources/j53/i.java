package j53;

import c22.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj53/i;", "E", "Lj53/a;", "element", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Ljava/lang/Object;I)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i<E> extends a<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E f97131c;

    public i(E e4, int i14) {
        super(i14, 1);
        this.f97131c = e4;
    }

    @Override // j53.a, java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (hasNext()) {
            this.f97110a++;
            return this.f97131c;
        }
        t.g();
        return null;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            this.f97110a--;
            return this.f97131c;
        }
        t.g();
        return null;
    }
}
