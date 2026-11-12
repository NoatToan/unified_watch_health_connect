package j53;

import c22.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj53/c;", "T", "Lj53/a;", "", "buffer", "", FirebaseAnalytics.Param.INDEX, "size", "<init>", "([Ljava/lang/Object;II)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T[] f97112c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(T[] tArr, int i14, int i15) {
        super(i14, i15);
        tArr.getClass();
        this.f97112c = tArr;
    }

    @Override // j53.a, java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            t.g();
            return null;
        }
        int i14 = this.f97110a;
        this.f97110a = i14 + 1;
        return this.f97112c[i14];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            t.g();
            return null;
        }
        int i14 = this.f97110a - 1;
        this.f97110a = i14;
        return this.f97112c[i14];
    }
}
