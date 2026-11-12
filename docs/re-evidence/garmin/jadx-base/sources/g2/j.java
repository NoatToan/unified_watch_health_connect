package g2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg2/j;", "T", "", "", "startIndex", "size", "value", "<init>", "(IILjava/lang/Object;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f75140c;

    public j(int i14, int i15, T t7) {
        this.f75138a = i14;
        this.f75139b = i15;
        this.f75140c = t7;
        if (!(i14 >= 0)) {
            b2.e.a("startIndex should be >= 0");
        }
        if (i15 > 0) {
            return;
        }
        b2.e.a("size should be > 0");
    }
}
