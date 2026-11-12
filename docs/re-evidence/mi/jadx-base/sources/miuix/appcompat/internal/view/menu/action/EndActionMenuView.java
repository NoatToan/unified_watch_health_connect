package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.dmi;
import defpackage.dyq;
import defpackage.q56;

/* JADX INFO: loaded from: classes3.dex */
public class EndActionMenuView extends ActionMenuView {
    public Context f;
    public int g;
    public int h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26516k;
    public int l;

    public EndActionMenuView(Context context) {
        this(context, null);
    }

    private int getActionMenuItemCount() {
        return getChildCount();
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, miuix.appcompat.internal.view.menu.i
    public boolean b(int i) {
        ActionMenuView.LayoutParams layoutParams;
        View childAt = getChildAt(i);
        return !r(childAt) && ((layoutParams = (ActionMenuView.LayoutParams) childAt.getLayoutParams()) == null || !layoutParams.f26511a) && super.b(i);
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, miuix.appcompat.internal.view.menu.i
    public boolean d() {
        return false;
    }

    @Override // defpackage.b43
    public void e(boolean z) {
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public int getCollapsedHeight() {
        return this.h;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public ActionMenuView.LayoutParams l(View view) {
        ActionMenuView.LayoutParams layoutParamsGenerateLayoutParams = generateLayoutParams(view.getLayoutParams());
        layoutParamsGenerateLayoutParams.f26511a = true;
        return layoutParamsGenerateLayoutParams;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void n(int i, float f, boolean z, boolean z2) {
        if (q56.a()) {
            setAlpha(g(f, z, z2));
        }
        float fH = h(f, z, z2);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (!r(childAt)) {
                childAt.setTranslationY(fH);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int childCount = getChildCount();
        int measuredWidth = this.f26516k;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (!r(childAt)) {
                dyq.h(this, childAt, measuredWidth, 0, measuredWidth + childAt.getMeasuredWidth(), i5);
                measuredWidth += childAt.getMeasuredWidth() + this.j;
            }
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int actionMenuItemCount = getActionMenuItemCount();
        this.l = actionMenuItemCount;
        if (childCount == 0 || actionMenuItemCount == 0) {
            this.h = 0;
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int iMin = Math.min(size / this.l, this.i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        int iMin2 = 0;
        int iMax = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!r(childAt)) {
                measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i2, 0);
                iMin2 += Math.min(childAt.getMeasuredWidth(), iMin);
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
            }
        }
        int i4 = this.j * (this.l - 1);
        int i5 = this.f26516k;
        if (i5 + iMin2 + i4 > size) {
            this.j = 0;
        }
        int i6 = iMin2 + i4 + i5;
        this.g = i6;
        this.h = iMax;
        setMeasuredDimension(i6, iMax);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final boolean r(View view) {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void setEnableBlur(boolean z) {
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void setSupportBlur(boolean z) {
    }

    public EndActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 0;
        this.j = 0;
        this.f26516k = 0;
        this.l = 0;
        super.setBackground(null);
        this.f = context;
        this.j = context.getResources().getDimensionPixelSize(dmi.z);
        this.f26516k = context.getResources().getDimensionPixelSize(dmi.f15697r);
        this.i = context.getResources().getDimensionPixelSize(dmi.y);
    }
}
