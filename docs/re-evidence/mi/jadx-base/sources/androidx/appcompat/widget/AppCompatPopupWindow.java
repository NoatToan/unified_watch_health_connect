package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import defpackage.m4i;
import defpackage.xfp;
import defpackage.z5j;

/* JADX INFO: loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f1580b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1581a;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        xfp xfpVarV = xfp.v(context, attributeSet, z5j.i2, i, i2);
        if (xfpVarV.s(z5j.k2)) {
            b(xfpVarV.a(z5j.k2, false));
        }
        setBackgroundDrawable(xfpVarV.g(z5j.j2));
        xfpVarV.w();
    }

    public final void b(boolean z) {
        if (f1580b) {
            this.f1581a = z;
        } else {
            m4i.a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f1580b && this.f1581a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1580b && this.f1581a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1580b && this.f1581a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
