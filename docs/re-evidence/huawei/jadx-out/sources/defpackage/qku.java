package defpackage;

import android.graphics.RectF;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;

/* JADX INFO: loaded from: classes16.dex */
public class qku {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f46403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46404c;
    private int j = 40;
    private int g = HeartRateThresholdConfig.HEART_RATE_LIMIT;
    private int d = 0;
    private int e = 0;
    private int f = 0;

    public qku(int i, int i2) {
        this.f46404c = i2;
        this.f46403b = new float[i2];
        this.f46402a = i;
    }

    public void a(int i, int i2) {
        this.j = i;
        this.g = i2;
    }

    public void c(float f) {
        float[] fArr = this.f46403b;
        int i = this.e;
        fArr[i] = f;
        int i2 = i + 1;
        this.e = i2;
        int i3 = this.f46404c;
        int i4 = i2 % i3;
        this.e = i4;
        int i5 = this.d;
        int i6 = i4 < i5 ? (i4 + i3) - i5 : i4 - i5;
        int i7 = this.f46402a;
        if (i6 > i7) {
            int i8 = i5 + 1;
            this.d = i8;
            int i9 = i8 % i3;
            this.d = i9;
            if (((i4 + i3) - this.f) % i3 > i7) {
                this.f = i9;
            }
        }
    }

    public float[] e() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.e;
        int i6 = this.f;
        if (i5 == i6) {
            i = 0;
        } else {
            if (i5 < i6) {
                i5 += this.f46404c;
            }
            i = (i5 - i6) - 1;
        }
        float[] fArr = new float[i * 4];
        int i7 = 0;
        while (true) {
            int i8 = this.e;
            if (i6 == i8 || (i4 = (i2 = i6 + 1) % (i3 = this.f46404c)) == i8) {
                break;
            }
            fArr[i7] = i6;
            float[] fArr2 = this.f46403b;
            fArr[i7 + 1] = fArr2[i6];
            fArr[i7 + 2] = i2;
            if (i2 == i3) {
                fArr[i7 + 3] = fArr2[0];
            } else {
                fArr[i7 + 3] = fArr2[i2];
            }
            i7 += 4;
            i6 = i4;
        }
        return fArr;
    }

    public RectF[] d() {
        int i = this.e;
        int i2 = this.d;
        if (i == i2) {
            return new RectF[0];
        }
        if (i > i2) {
            return new RectF[]{new RectF(this.d, this.g, this.e - 1, this.j)};
        }
        if (i == 0) {
            return new RectF[]{new RectF(this.d, this.g, this.f46404c - 1, this.j)};
        }
        if (i == 1) {
            return new RectF[]{new RectF(this.d, this.g, this.f46404c, this.j)};
        }
        return new RectF[]{new RectF(this.d, this.g, this.f46404c, this.j), new RectF(0.0f, this.g, this.e - 1, this.j)};
    }

    public void c() {
        int i = this.e;
        if (i == this.d) {
            this.f = i;
        } else {
            int i2 = this.f46404c;
            this.f = ((i + i2) - 1) % i2;
        }
    }
}
