package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class f3b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f17359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f17360b;

    public f3b(float[] fArr, int[] iArr) {
        this.f17359a = fArr;
        this.f17360b = iArr;
    }

    public f3b a(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = b(fArr[i]);
        }
        return new f3b(fArr, iArr);
    }

    public final int b(float f) {
        int iBinarySearch = Arrays.binarySearch(this.f17359a, f);
        if (iBinarySearch >= 0) {
            return this.f17360b[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        if (i == 0) {
            return this.f17360b[0];
        }
        int[] iArr = this.f17360b;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f17359a;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return gxa.c((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }

    public int[] c() {
        return this.f17360b;
    }

    public float[] d() {
        return this.f17359a;
    }

    public int e() {
        return this.f17360b.length;
    }

    public void f(f3b f3bVar, f3b f3bVar2, float f) {
        if (f3bVar.f17360b.length == f3bVar2.f17360b.length) {
            for (int i = 0; i < f3bVar.f17360b.length; i++) {
                this.f17359a[i] = d5g.i(f3bVar.f17359a[i], f3bVar2.f17359a[i], f);
                this.f17360b[i] = gxa.c(f, f3bVar.f17360b[i], f3bVar2.f17360b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + f3bVar.f17360b.length + " vs " + f3bVar2.f17360b.length + ")");
    }
}
