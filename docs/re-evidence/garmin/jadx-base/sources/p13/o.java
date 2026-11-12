package p13;

import java.util.RandomAccess;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lp13/o;", "Lp13/c;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends c<Integer> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int[] f134955b;

    public o(int[] iArr) {
        this.f134955b = iArr;
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF168272d() {
        return this.f134955b.length;
    }

    @Override // p13.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return u.x(this.f134955b, ((Number) obj).intValue());
    }

    @Override // java.util.List
    public final Object get(int i14) {
        return Integer.valueOf(this.f134955b[i14]);
    }

    @Override // p13.c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f134955b;
        iArr.getClass();
        int length = iArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (iIntValue == iArr[i14]) {
                return i14;
            }
        }
        return -1;
    }

    @Override // p13.a, java.util.Collection
    public final boolean isEmpty() {
        return this.f134955b.length == 0;
    }

    @Override // p13.c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f134955b;
        iArr.getClass();
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i14 = length - 1;
                if (iIntValue == iArr[length]) {
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
