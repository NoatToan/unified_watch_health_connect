package defpackage;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: classes3.dex */
public class o4i implements hwc {
    @Override // defpackage.hwc
    public int a(n4i n4iVar) {
        int absoluteGravity = Gravity.getAbsoluteGravity(n4iVar.i, n4iVar.s) & 7;
        if (absoluteGravity != 1) {
            return absoluteGravity != 5 ? g(n4iVar) : e(n4iVar);
        }
        return f(n4iVar);
    }

    @Override // defpackage.hwc
    public boolean b(int i, n4i n4iVar) {
        int i2 = n4iVar.f;
        return i2 > i || i2 > n4iVar.c;
    }

    @Override // defpackage.hwc
    public void c(n4i n4iVar) {
        int[][] iArr = n4iVar.n;
        if (iArr == null) {
            Rect rect = n4iVar.o;
            n4iVar.f = rect.height();
            n4iVar.g = rect.width();
            n4iVar.h = rect.height();
            return;
        }
        int i = n4iVar.f27537a;
        int i2 = n4iVar.c;
        int i3 = 0;
        int iMax = 0;
        for (int[] iArr2 : iArr) {
            int i4 = iArr2[0];
            int i5 = iArr2[1];
            if (i4 > i) {
                i4 = i;
            }
            iMax = Math.max(i4, iMax);
            i3 += i5;
        }
        n4iVar.f = i3;
        if (i3 <= i2) {
            i2 = i3;
        }
        n4iVar.h = i2;
        int iMax2 = Math.max(iMax, n4iVar.f27538b);
        n4iVar.e = iMax2;
        n4iVar.g = iMax2;
    }

    @Override // defpackage.hwc
    public int d(n4i n4iVar) {
        return (n4iVar.i & 112) != 48 ? h(n4iVar) : i(n4iVar);
    }

    public final int e(n4i n4iVar) {
        Rect rect = n4iVar.q;
        Rect rect2 = n4iVar.p;
        Rect rect3 = n4iVar.f27540r;
        int i = n4iVar.g;
        int i2 = rect.right;
        int i3 = rect2.right;
        int i4 = rect3.right;
        if (i2 > i3 - i4) {
            i2 = i3 - i4;
        }
        int i5 = i2 - i;
        int i6 = rect2.left;
        int i7 = rect3.left;
        if (i5 < i6 + i7) {
            i5 = i6 + i7;
        }
        if (i5 + i > i3 - i4) {
            i = (i3 - i4) - i5;
        }
        n4iVar.g = i;
        return i5;
    }

    public final int f(n4i n4iVar) {
        Rect rect = n4iVar.q;
        Rect rect2 = n4iVar.p;
        Rect rect3 = n4iVar.f27540r;
        int i = n4iVar.g;
        int iCenterX = rect.centerX() - (i / 2);
        int i2 = iCenterX + i;
        int i3 = rect2.right;
        int i4 = rect3.right;
        if (i2 > i3 - i4) {
            iCenterX = (i3 - i4) - i;
        }
        int i5 = rect2.left;
        int i6 = rect3.left;
        if (iCenterX < i5 + i6) {
            iCenterX = i5 + i6;
        }
        if (iCenterX + i > i3 - i4) {
            i = (i3 - i4) - iCenterX;
        }
        n4iVar.g = i;
        return iCenterX;
    }

    public final int g(n4i n4iVar) {
        Rect rect = n4iVar.q;
        Rect rect2 = n4iVar.p;
        Rect rect3 = n4iVar.f27540r;
        int i = n4iVar.g;
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect3.left;
        if (i2 < i3 + i4) {
            i2 = i3 + i4;
        }
        int i5 = i2 + i;
        int i6 = rect2.right;
        int i7 = rect3.right;
        if (i5 > i6 - i7) {
            i5 = i6 - i7;
        }
        int i8 = i5 - i;
        if (i8 >= i3 + i4) {
            return i8;
        }
        int i9 = i3 + i4;
        n4iVar.g = i5 - i9;
        return i9;
    }

    public final int h(n4i n4iVar) {
        Rect rect = n4iVar.q;
        Rect rect2 = n4iVar.p;
        Rect rect3 = n4iVar.f27540r;
        int i = n4iVar.h;
        int i2 = rect.bottom;
        int i3 = rect2.top;
        int i4 = rect3.top;
        if (i2 < i3 + i4) {
            i2 = i3 + i4;
        }
        int i5 = i2 + i;
        int i6 = rect2.bottom;
        int i7 = rect3.bottom;
        if (i5 < i6 - i7) {
            return i2;
        }
        int i8 = rect.top;
        if (i6 - i8 < i8 - i3) {
            int iMin = Math.min(i, (i8 - i3) - i4);
            if (iMin < n4iVar.d) {
                iMin = Math.min(i, (rect2.height() - rect3.top) - rect3.bottom);
            }
            n4iVar.h = iMin;
            return rect.top - iMin;
        }
        int iMin2 = (i6 - i7) - i2;
        if (iMin2 < n4iVar.d) {
            iMin2 = Math.min(i, (rect2.height() - rect3.top) - rect3.bottom);
            i2 = (rect2.bottom - rect3.bottom) - iMin2;
        }
        n4iVar.h = iMin2;
        return i2;
    }

    public final int i(n4i n4iVar) {
        Rect rect = n4iVar.q;
        Rect rect2 = n4iVar.p;
        Rect rect3 = n4iVar.f27540r;
        int i = n4iVar.h;
        int i2 = rect.top;
        int i3 = rect2.top;
        int i4 = rect3.top;
        int i5 = i2 < i3 + i4 ? i3 + i4 : i2;
        int i6 = i5 + i;
        int i7 = rect2.bottom;
        int i8 = rect3.bottom;
        if (i6 < i7 - i8) {
            return i5;
        }
        if (i7 - i2 >= i2 - i3) {
            int iMin = (i7 - i8) - i5;
            if (iMin < n4iVar.d) {
                iMin = Math.min(i, (rect2.height() - rect3.top) - rect3.bottom);
                i5 = (rect2.bottom - rect3.bottom) - iMin;
            }
            n4iVar.h = iMin;
            return i5;
        }
        int iMin2 = Math.min(i, (i2 - i3) - i4);
        if (iMin2 < n4iVar.d) {
            iMin2 = Math.min(i, (rect2.height() - rect3.top) - rect3.bottom);
        }
        int i9 = rect.top - iMin2;
        n4iVar.h = iMin2;
        return i9;
    }
}
