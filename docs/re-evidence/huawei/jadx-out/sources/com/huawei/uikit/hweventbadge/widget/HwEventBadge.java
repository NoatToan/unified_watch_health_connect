package com.huawei.uikit.hweventbadge.widget;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.uikit.hweventbadge.R;
import defpackage.xen;
import defpackage.xfs;

/* JADX INFO: loaded from: classes44.dex */
public class HwEventBadge extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private xen f29490b;

    public HwEventBadge(Context context) {
        this(context, null);
    }

    private static Context d(Context context, int i) {
        return xfs.c(context, i, R.style.Theme_Emui_HwEventBadge);
    }

    public xen getHwEventBadgeDrawable() {
        return this.f29490b;
    }

    public int getMode() {
        xen xenVar = this.f29490b;
        if (xenVar != null) {
            return xenVar.a();
        }
        return -1;
    }

    public TextPaint getTextPaint() {
        xen xenVar = this.f29490b;
        if (xenVar == null) {
            return null;
        }
        return xenVar.e();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(b(getSuggestedMinimumWidth(), i), b(getSuggestedMinimumHeight(), i2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        xen xenVar = this.f29490b;
        if (xenVar != null) {
            xenVar.b(i);
        }
    }

    public void setCount(int i) {
        xen xenVar = this.f29490b;
        if (xenVar == null || xenVar.c() == i) {
            return;
        }
        this.f29490b.a(i);
        if (this.f29490b.a() == 2) {
            requestLayout();
            invalidate();
        }
    }

    public void setHwEventBadgeDrawable(xen xenVar) {
        this.f29490b = xenVar;
    }

    public void setMode(int i) {
        xen xenVar = this.f29490b;
        if (xenVar == null || xenVar.a() == i) {
            return;
        }
        this.f29490b.c(i);
        requestLayout();
        invalidate();
    }

    public void setTextColor(int i) {
        xen xenVar = this.f29490b;
        if (xenVar != null) {
            xenVar.d(i);
        }
    }

    public HwEventBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hwEventBadgeStyle);
    }

    private int b(int i, int i2) {
        return View.MeasureSpec.getMode(i2) != 1073741824 ? i : View.MeasureSpec.getSize(i2);
    }

    public HwEventBadge(Context context, AttributeSet attributeSet, int i) {
        super(d(context, i), attributeSet, i);
        xen xenVar = new xen();
        this.f29490b = xenVar;
        xenVar.c(super.getContext(), attributeSet, i);
        setBackground(this.f29490b);
    }

    public void setCount(int i, int i2) {
        xen xenVar = this.f29490b;
        if (xenVar != null) {
            int iC = xenVar.c();
            int iB = this.f29490b.b();
            if (iC == i && iB == i2) {
                return;
            }
            this.f29490b.b(i, i2);
            if (this.f29490b.a() == 2) {
                requestLayout();
                invalidate();
            }
        }
    }
}
