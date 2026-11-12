package p13;

import java.util.RandomAccess;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lp13/r;", "Lp13/c;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends c<Boolean> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f134960b;

    public r(boolean[] zArr) {
        this.f134960b = zArr;
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF97116d() {
        return this.f134960b.length;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0020 A[RETURN] */
    @Override // p13.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            boolean[] zArr = this.f134960b;
            zArr.getClass();
            int length = zArr.length;
            int i14 = 0;
            while (i14 < length) {
                if (zBooleanValue != zArr[i14]) {
                    i14++;
                } else if (i14 >= 0) {
                    return true;
                }
            }
            i14 = -1;
            if (i14 >= 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        return Boolean.valueOf(this.f134960b[i14]);
    }

    @Override // p13.c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean[] zArr = this.f134960b;
        zArr.getClass();
        int length = zArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (zBooleanValue == zArr[i14]) {
                return i14;
            }
        }
        return -1;
    }

    @Override // p13.a, java.util.Collection
    public final boolean isEmpty() {
        return this.f134960b.length == 0;
    }

    @Override // p13.c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean[] zArr = this.f134960b;
        zArr.getClass();
        int length = zArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i14 = length - 1;
                if (zBooleanValue == zArr[length]) {
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
