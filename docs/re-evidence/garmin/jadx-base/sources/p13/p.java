package p13;

import java.util.RandomAccess;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lp13/p;", "Lp13/c;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends c<Long> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long[] f134958b;

    public p(long[] jArr) {
        this.f134958b = jArr;
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF168272d() {
        return this.f134958b.length;
    }

    @Override // p13.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Long)) {
            return false;
        }
        return u.y(this.f134958b, ((Number) obj).longValue());
    }

    @Override // java.util.List
    public final Object get(int i14) {
        return Long.valueOf(this.f134958b[i14]);
    }

    @Override // p13.c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Number) obj).longValue();
        long[] jArr = this.f134958b;
        jArr.getClass();
        int length = jArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (jLongValue == jArr[i14]) {
                return i14;
            }
        }
        return -1;
    }

    @Override // p13.a, java.util.Collection
    public final boolean isEmpty() {
        return this.f134958b.length == 0;
    }

    @Override // p13.c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Number) obj).longValue();
        long[] jArr = this.f134958b;
        jArr.getClass();
        int length = jArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i14 = length - 1;
                if (jLongValue == jArr[length]) {
                    return length;
                }
                if (i14 >= 0) {
                    length = i14;
                }
            }
        }
        return -1;
    }
}
