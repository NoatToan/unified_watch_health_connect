package j53;

import c22.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lj53/g;", "T", "Lj53/a;", "", "", "root", "tail", "", FirebaseAnalytics.Param.INDEX, "size", "trieHeight", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", "kotlinx-collections-immutable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T[] f97125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k<T> f97126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object[] objArr, T[] tArr, int i14, int i15, int i16) {
        super(i14, i15);
        objArr.getClass();
        tArr.getClass();
        this.f97125c = tArr;
        int i17 = (i15 - 1) & (-32);
        this.f97126d = new k<>(objArr, i14 > i17 ? i17 : i14, i17, i16);
    }

    @Override // j53.a, java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            t.g();
            return null;
        }
        k<T> kVar = this.f97126d;
        if (kVar.hasNext()) {
            this.f97110a++;
            return kVar.next();
        }
        int i14 = this.f97110a;
        this.f97110a = i14 + 1;
        return this.f97125c[i14 - kVar.f97111b];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            t.g();
            return null;
        }
        int i14 = this.f97110a;
        k<T> kVar = this.f97126d;
        int i15 = kVar.f97111b;
        if (i14 <= i15) {
            this.f97110a = i14 - 1;
            return kVar.previous();
        }
        int i16 = i14 - 1;
        this.f97110a = i16;
        return this.f97125c[i16 - i15];
    }
}
