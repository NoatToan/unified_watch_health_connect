package p13;

import java.util.RandomAccess;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lp13/q;", "Lp13/c;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends c<Double> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double[] f134959b;

    public q(double[] dArr) {
        this.f134959b = dArr;
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF97116d() {
        return this.f134959b.length;
    }

    @Override // p13.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Double)) {
            return false;
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        for (double d14 : this.f134959b) {
            if (Double.doubleToLongBits(d14) == Double.doubleToLongBits(dDoubleValue)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        return Double.valueOf(this.f134959b[i14]);
    }

    @Override // p13.c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        double[] dArr = this.f134959b;
        int length = dArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (Double.doubleToLongBits(dArr[i14]) == Double.doubleToLongBits(dDoubleValue)) {
                return i14;
            }
        }
        return -1;
    }

    @Override // p13.a, java.util.Collection
    public final boolean isEmpty() {
        return this.f134959b.length == 0;
    }

    @Override // p13.c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Number) obj).doubleValue();
        double[] dArr = this.f134959b;
        int length = dArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i14 = length - 1;
                if (Double.doubleToLongBits(dArr[length]) == Double.doubleToLongBits(dDoubleValue)) {
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
