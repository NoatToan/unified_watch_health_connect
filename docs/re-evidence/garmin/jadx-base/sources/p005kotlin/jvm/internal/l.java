package p005kotlin.jvm.internal;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/jvm/internal/l;", "Lkotlin/jvm/internal/e0;", "", "", "size", "<init>", "(I)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends e0<double[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f105802d;

    public l(int i14) {
        super(i14);
        this.f105802d = new double[i14];
    }

    public final double[] a() {
        int length;
        int i14;
        int i15 = this.f105793a;
        int i16 = i15 - 1;
        Object[] objArr = this.f105795c;
        int i17 = 0;
        if (i16 >= 0) {
            length = 0;
            int i18 = 0;
            while (true) {
                Object obj = objArr[i18];
                length += obj != null ? ((double[]) obj).length : 1;
                if (i18 == i16) {
                    break;
                }
                i18++;
            }
        } else {
            length = 0;
        }
        double[] dArr = new double[length];
        double[] dArr2 = this.f105802d;
        dArr2.getClass();
        if (i16 >= 0) {
            int i19 = 0;
            int i24 = 0;
            i14 = 0;
            while (true) {
                Object obj2 = objArr[i19];
                if (obj2 != null) {
                    if (i24 < i19) {
                        int i25 = i19 - i24;
                        System.arraycopy(dArr2, i24, dArr, i14, i25);
                        i14 += i25;
                    }
                    int length2 = ((double[]) obj2).length;
                    System.arraycopy(obj2, 0, dArr, i14, length2);
                    i14 += length2;
                    i24 = i19 + 1;
                }
                if (i19 == i16) {
                    break;
                }
                i19++;
            }
            i17 = i24;
        } else {
            i14 = 0;
        }
        if (i17 < i15) {
            System.arraycopy(dArr2, i17, dArr, i14, i15 - i17);
        }
        return dArr;
    }
}
