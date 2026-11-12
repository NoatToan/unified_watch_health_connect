package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class nx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f28531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f28532b;
    public int c;
    public View d;

    public nx1(Context context) {
        this(context, 2);
    }

    public void a(View view) {
        b(view, this.c);
    }

    public void b(View view, int i) {
        c(view, i, 0);
    }

    public void c(View view, int i, int i2) {
        g(i);
        Rect rectF = f(view, i2);
        if (rectF == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        this.f28531a.setBounds(rectF);
        view.getOverlay().add(this.f28531a);
        this.d = view;
    }

    public void d() {
        View view = this.d;
        if (view != null) {
            view.getOverlay().clear();
        }
    }

    public final Drawable e() {
        return hm1.h(this.f28532b, zhi.j);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    public final Rect f(View view, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (view == null || this.f28531a == null) {
            return null;
        }
        Rect rect = new Rect();
        int intrinsicWidth = this.f28531a.getCurrent().getIntrinsicWidth();
        int intrinsicHeight = this.f28531a.getCurrent().getIntrinsicHeight();
        view.getDrawingRect(rect);
        boolean zE = dyq.e(view);
        int i8 = this.c;
        int i9 = 0;
        if (i8 == 0) {
            if (i == 1) {
                i2 = rect.top - (intrinsicHeight / 2);
            } else {
                i2 = rect.top;
            }
            int i10 = intrinsicHeight + i2;
            if ((zE && i8 == 0) || (zE && i8 == 2)) {
            }
            if (i == 1) {
                if (i9 != 0) {
                    i7 = rect.left;
                } else {
                    i7 = rect.right;
                }
                i3 = i7 - (intrinsicWidth / 2);
            } else if (i9 != 0) {
                i3 = rect.left;
            } else {
                i3 = rect.right - intrinsicWidth;
            }
            int i11 = i3;
            i4 = i11 + intrinsicWidth;
            i5 = i10;
            i6 = i11;
            i9 = i2;
        } else if (i8 == 1) {
            i9 = rect.bottom - intrinsicHeight;
            i5 = i9 + intrinsicHeight;
            i6 = ((zE && i8 == 1) || (zE && i8 == 3)) ? rect.left : rect.right - intrinsicWidth;
            i4 = intrinsicWidth + i6;
        } else if (i8 == 2) {
            if (i == 1) {
                i2 = rect.top - (intrinsicHeight / 2);
            } else {
                i2 = rect.top;
            }
            int i12 = intrinsicHeight + i2;
            i9 = zE ? 1 : 1;
            if (i == 1) {
                if (i9 != 0) {
                    i7 = rect.left;
                } else {
                    i7 = rect.right;
                }
                i3 = i7 - (intrinsicWidth / 2);
            } else if (i9 != 0) {
                i3 = rect.left;
            } else {
                i3 = rect.right - intrinsicWidth;
            }
            int i13 = i3;
            i4 = i13 + intrinsicWidth;
            i5 = i12;
            i6 = i13;
            i9 = i2;
        } else if (i8 != 3) {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        } else {
            i9 = rect.bottom - intrinsicHeight;
            i5 = i9 + intrinsicHeight;
            if (zE) {
            }
            i4 = intrinsicWidth + i6;
        }
        rect.top = i9;
        rect.left = i6;
        rect.bottom = i5;
        rect.right = i4;
        return rect;
    }

    public void g(int i) {
        if (i < 0 || i > 3) {
            this.c = 2;
        } else {
            this.c = i;
        }
    }

    public nx1(Context context, int i) {
        g(i);
        this.f28532b = context;
        this.f28531a = e();
    }
}
