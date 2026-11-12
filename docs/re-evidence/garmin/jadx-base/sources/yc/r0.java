package yc;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B)\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyc/r0;", "T", "Lp13/c;", "", "placeholdersBefore", "placeholdersAfter", "", FirebaseAnalytics.Param.ITEMS, "<init>", "(IILjava/util/List;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r0<T> extends p13.c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f196334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f196335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<T> f196336d;

    /* JADX WARN: Multi-variable type inference failed */
    public r0(int i14, int i15, List<? extends T> list) {
        list.getClass();
        this.f196334b = i14;
        this.f196335c = i15;
        this.f196336d = list;
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF168272d() {
        return this.f196336d.size() + this.f196334b + this.f196335c;
    }

    @Override // java.util.List
    public final T get(int i14) {
        int i15 = this.f196334b;
        if (i14 >= 0 && i14 < i15) {
            return null;
        }
        List<T> list = this.f196336d;
        if (i14 < list.size() + i15 && i15 <= i14) {
            return list.get(i14 - i15);
        }
        int size = list.size() + i15;
        if (i14 < getF168272d() && size <= i14) {
            return null;
        }
        l2.j(getF168272d(), b71.i.i(i14, "Illegal attempt to access index ", " in ItemSnapshotList of size "));
        return null;
    }
}
