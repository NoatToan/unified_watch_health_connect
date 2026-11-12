package defpackage;

import com.huawei.operation.utils.Constants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public class gl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f35457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f35458c;

    public gl(float[] fArr, int[] iArr) {
        this.f35457b = fArr;
        this.f35458c = iArr;
    }

    public float[] d() {
        return this.f35457b;
    }

    public int[] b() {
        return this.f35458c;
    }

    public int c() {
        return this.f35458c.length;
    }

    public void e(gl glVar, gl glVar2, float f) {
        int[] iArr;
        if (glVar.equals(glVar2)) {
            c(glVar);
            return;
        }
        if (f <= 0.0f) {
            c(glVar);
            return;
        }
        if (f >= 1.0f) {
            c(glVar2);
            return;
        }
        if (glVar.f35458c.length != glVar2.f35458c.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + glVar.f35458c.length + " vs " + glVar2.f35458c.length + Constants.RIGHT_BRACKET_ONLY);
        }
        int i = 0;
        while (true) {
            iArr = glVar.f35458c;
            if (i >= iArr.length) {
                break;
            }
            this.f35457b[i] = jc.a(glVar.f35457b[i], glVar2.f35457b[i], f);
            this.f35458c[i] = ix.b(f, glVar.f35458c[i], glVar2.f35458c[i]);
            i++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.f35457b;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = glVar.f35458c;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.f35458c;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public gl a(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = c(fArr[i]);
        }
        return new gl(fArr, iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gl glVar = (gl) obj;
        return Arrays.equals(this.f35457b, glVar.f35457b) && Arrays.equals(this.f35458c, glVar.f35458c);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f35457b) * 31) + Arrays.hashCode(this.f35458c);
    }

    private int c(float f) {
        int iBinarySearch = Arrays.binarySearch(this.f35457b, f);
        if (iBinarySearch >= 0) {
            return this.f35458c[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        if (i == 0) {
            return this.f35458c[0];
        }
        int[] iArr = this.f35458c;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f35457b;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return ix.b((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }

    private void c(gl glVar) {
        int i = 0;
        while (true) {
            int[] iArr = glVar.f35458c;
            if (i >= iArr.length) {
                return;
            }
            this.f35457b[i] = glVar.f35457b[i];
            this.f35458c[i] = iArr[i];
            i++;
        }
    }
}
