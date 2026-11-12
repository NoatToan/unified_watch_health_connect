package com.huawei.openalliance.ad.views.linkscroll;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes12.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f21282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f21283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21284c;
    private int[] d;

    public void c() {
        ViewParent viewParent = this.f21283b;
        if (viewParent != null) {
            d.a(viewParent, this.f21282a);
            this.f21283b = null;
        }
    }

    public boolean b() {
        return this.f21283b != null;
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2) {
        int i3;
        int i4;
        if (a() && this.f21283b != null) {
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.f21282a.getLocationInWindow(iArr2);
                    i3 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    if (this.d == null) {
                        this.d = new int[2];
                    }
                    iArr = this.d;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                d.a(this.f21283b, this.f21282a, i, i2, iArr);
                if (iArr2 != null) {
                    this.f21282a.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i3;
                    iArr2[1] = iArr2[1] - i4;
                }
                return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
            }
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        if (a() && this.f21283b != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    this.f21282a.getLocationInWindow(iArr);
                    i5 = iArr[0];
                    i6 = iArr[1];
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                d.a(this.f21283b, this.f21282a, i, i2, i3, i4);
                if (iArr != null) {
                    this.f21282a.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i5;
                    iArr[1] = iArr[1] - i6;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
        }
        return false;
    }

    public boolean a(int i) {
        if (b()) {
            return true;
        }
        if (!a()) {
            return false;
        }
        View view = this.f21282a;
        for (ViewParent parent = this.f21282a.getParent(); parent != null; parent = parent.getParent()) {
            if (d.a(parent, view, this.f21282a, i)) {
                this.f21283b = parent;
                d.b(parent, view, this.f21282a, i);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public boolean a(float f, float f2) {
        ViewParent viewParent;
        if (!a() || (viewParent = this.f21283b) == null) {
            return false;
        }
        return d.a(viewParent, this.f21282a, f, f2);
    }

    public boolean a() {
        return this.f21284c;
    }

    public void a(boolean z) {
        if (this.f21284c) {
            a(this.f21282a);
        }
        this.f21284c = z;
    }

    public void a(View view) {
        if (view instanceof a) {
            ((e) view).a();
        }
    }

    public c(View view) {
        this.f21282a = view;
    }
}
