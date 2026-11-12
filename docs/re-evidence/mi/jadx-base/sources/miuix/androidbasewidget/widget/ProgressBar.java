package miuix.androidbasewidget.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.e5j;
import defpackage.gbk;
import defpackage.y1j;
import defpackage.y2j;
import defpackage.yhi;

/* JADX INFO: loaded from: classes3.dex */
public class ProgressBar extends android.widget.ProgressBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f26251a;

    public ProgressBar(Context context) {
        this(context, null);
    }

    public void a(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e5j.X, i, y2j.c);
        Drawable drawable = this.f26251a;
        if (drawable != null && drawable.getClass().getName().equals("android.graphics.drawable.AnimatedRotateDrawable")) {
            int i2 = typedArrayObtainStyledAttributes.getInt(e5j.Y, 48);
            Class<?> cls = drawable.getClass();
            Class cls2 = Integer.TYPE;
            gbk.g(drawable, gbk.f(cls, "setFramesCount", cls2), Integer.valueOf(i2));
            gbk.g(drawable, gbk.f(cls, "setFramesDuration", cls2), Integer.valueOf(typedArrayObtainStyledAttributes.getInt(e5j.Z, 25)));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public CharSequence getAccessibilityClassName() {
        return View.class.getName();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.getRangeInfo() == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                accessibilityNodeInfo.setStateDescription(getContext().getString(y1j.f39687b));
            } else {
                accessibilityNodeInfo.setContentDescription(getContext().getString(y1j.f39687b));
            }
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.f26251a != drawable) {
            this.f26251a = drawable;
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, yhi.h);
    }

    public ProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }
}
