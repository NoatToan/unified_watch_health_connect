package com.huawei.hms.scankit.p;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate;
import com.huawei.hms.scankit.util.OpencvJNI;

/* JADX INFO: loaded from: classes34.dex */
public class h4 extends IRemoteFrameDecoderDelegate.Stub {
    private static volatile h4 d = new h4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Point f16114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f16115b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Rect f16116c;

    @Override // com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate
    public s6[] decode(byte[] bArr, int i, int i2, int i3, int i4, IObjectWrapper iObjectWrapper) {
        boolean z;
        if (!r3.A) {
            OpencvJNI.init();
        }
        boolean z2 = false;
        boolean z3 = true;
        if (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) {
            z = false;
        } else {
            Bundle bundle = (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
            this.f16114a = (Point) bundle.getParcelable("Screen");
            this.f16116c = (Rect) bundle.getParcelable("Rect");
            z = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getBoolean(DetailRect.USE_APK, false);
            z2 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getBoolean(DetailRect.SUPPORT_ROLLBACK, false);
            z3 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper)).getBoolean(DetailRect.PARSE_RESULT, true);
        }
        r3.f = z3;
        if (z2 && !r3.f16300a && z) {
            return new s6[]{r6.c()};
        }
        if (this.f16116c == null) {
            this.f16116c = new Rect(-1, -1, -1, -1);
        }
        if (this.f16114a == null) {
            this.f16114a = new Point(1080, 1920);
        }
        e6 e6VarA = a(bArr, i, i2, i3);
        byte[] bArrB = e6VarA.b();
        x6 x6Var = new x6(e6VarA.c(), e6VarA.a(), i4);
        int i5 = this.f16115b;
        this.f16115b = i5 + 1;
        return n1.c(bArrB, x6Var.a(i5));
    }

    private h4() {
    }

    public Rect b(int i, int i2) {
        synchronized (this) {
            Rect rect = new Rect(a(i, i2));
            Point point = new Point(i, i2);
            Point point2 = this.f16114a;
            if (point2 == null) {
                return null;
            }
            int i3 = point2.x;
            int i4 = point2.y;
            if (i3 < i4) {
                int i5 = rect.left;
                int i6 = point.y;
                rect.left = (i5 * i6) / i3;
                rect.right = (rect.right * i6) / i3;
                int i7 = rect.top;
                int i8 = point.x;
                rect.top = (i7 * i8) / i4;
                rect.bottom = (rect.bottom * i8) / i4;
            } else {
                int i9 = rect.top;
                int i10 = point.y;
                rect.top = (i9 * i10) / i4;
                rect.bottom = (rect.bottom * i10) / i4;
                int i11 = rect.left;
                int i12 = point.x;
                rect.left = (i11 * i12) / i3;
                rect.right = (rect.right * i12) / i3;
            }
            return rect;
        }
    }

    public e6 a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (b(i, i2) == null) {
            return null;
        }
        int iMin = (int) (((double) Math.min(i, i2)) * 0.8d);
        int i10 = (i - iMin) / 2;
        int i11 = (i2 - iMin) / 2;
        Rect rect = this.f16116c;
        if (rect == null) {
            i3 = iMin;
            i4 = i11;
        } else if (rect.left == -1 && rect.right == -1 && rect.top == -1 && rect.bottom == -1) {
            iMin = (int) (((double) i) * 0.85d);
            i10 = (i - iMin) / 2;
            double d2 = i2;
            i3 = (int) (0.8d * d2);
            i4 = (int) (d2 * 0.1d);
        } else {
            iMin = (int) (((double) Math.min(i, i2)) * 0.9d);
            i10 = (i - iMin) / 2;
            Rect rect2 = this.f16116c;
            Rect rect3 = new Rect(rect2.left, rect2.top, rect2.right, rect2.bottom);
            int iMax = Math.max(i, i2);
            Point point = this.f16114a;
            if (point != null) {
                i9 = point.x;
                i8 = point.y;
            } else {
                i8 = iMax;
                i9 = i8;
            }
            float fMax = iMax / Math.max(i9, i8);
            Rect rect4 = this.f16116c;
            int i12 = (int) (rect4.top * fMax);
            rect3.top = i12;
            int i13 = (int) (rect4.bottom * fMax);
            rect3.bottom = i13;
            float f = i2 / 14.0f;
            if (i12 > f) {
                i12 -= (int) f;
            }
            i4 = i12 < 0 ? 0 : i12;
            i3 = i13 - i4;
            if (i4 + i3 > i2) {
                i11 = (i2 - iMin) / 2;
                i3 = iMin;
                i4 = i11;
            }
        }
        o4.a("ScanSize", "top:" + i4 + "scanSizeHeight" + i3 + "mHeight:" + i2);
        if (i2 < i4 + i3) {
            i5 = i2;
            i4 = 0;
        } else {
            i5 = i3;
        }
        if (i < i10 + iMin) {
            i6 = i;
            i7 = 0;
        } else {
            i6 = iMin;
            i7 = i10;
        }
        return new e6(bArr, i, i2, i7, i4, i6, i5, false);
    }

    private e6 a(byte[] bArr, int i, int i2, int i3) {
        if (i3 == 0) {
            byte[] bArr2 = new byte[bArr.length];
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i; i5++) {
                    bArr2[(((i5 * i2) + i2) - i4) - 1] = bArr[(i4 * i) + i5];
                }
            }
            return a(bArr2, i2, i);
        }
        if (i3 == 2) {
            byte[] bArr3 = new byte[bArr.length];
            for (int i6 = 0; i6 < i2; i6++) {
                for (int i7 = 0; i7 < i; i7++) {
                    bArr3[(((i - 1) - i7) * i2) + i6] = bArr[(i6 * i) + i7];
                }
            }
            return a(bArr3, i2, i);
        }
        if (i3 != 3) {
            return a(bArr, i, i2);
        }
        byte[] bArr4 = new byte[bArr.length];
        for (int i8 = 0; i8 < i2; i8++) {
            for (int i9 = 0; i9 < i; i9++) {
                bArr4[(((((i2 - 1) - i8) * i) + i) - 1) - i9] = bArr[(i8 * i) + i9];
            }
        }
        return a(bArr4, i, i2);
    }

    public Rect a(int i, int i2) {
        Rect rect;
        synchronized (this) {
            int iMin = Math.min(i, i2);
            int i3 = (i - iMin) / 2;
            int i4 = (i2 - iMin) / 2;
            rect = new Rect(i3, i4, i3 + iMin, iMin + i4);
        }
        return rect;
    }

    public static h4 a() {
        return d;
    }
}
