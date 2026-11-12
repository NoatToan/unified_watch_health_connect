package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import defpackage.awi;
import defpackage.c6q;
import defpackage.dmi;
import defpackage.pwk;
import defpackage.zhi;

/* JADX INFO: loaded from: classes3.dex */
public class ExpandTabContainer extends ScrollingTabContainerView {
    public int[] t;

    public ExpandTabContainer(Context context) {
        super(context);
        setContentHeight(getTabContainerHeight());
        this.t = new int[]{context.getResources().getDimensionPixelSize(dmi.j), 0, 0};
        this.t[1] = context.getResources().getDimensionPixelSize(dmi.f15696k);
        this.t[2] = context.getResources().getDimensionPixelSize(dmi.l);
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    public int getDefaultTabTextStyle() {
        return zhi.f41289k;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    public int getTabBarLayoutRes() {
        return awi.i;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    public int getTabContainerHeight() {
        return -2;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    public int getTabViewLayoutRes() {
        return awi.g;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    public int getTabViewMarginHorizontal() {
        return getContext().getResources().getDimensionPixelOffset(dmi.i);
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        s(this.t, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i2);
        super.onMeasure(i, i2);
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    public void r(TextView textView) {
        if (pwk.a() <= 1) {
            c6q.a(textView);
        }
    }

    public final void s(int[] iArr, int i, int i2) {
        int i3 = iArr[0];
        int tabViewMarginHorizontal = getTabViewMarginHorizontal();
        for (int i4 = 0; i4 < iArr.length; i4++) {
            i3 = iArr[i4];
            TextPaint textPaint = null;
            int iMeasureText = 0;
            for (int i5 = 0; i5 < this.f.getChildCount(); i5++) {
                TextView textView = ((ScrollingTabContainerView.TabView) this.f.getChildAt(i5)).getTextView();
                if (textView != null) {
                    if (textPaint == null) {
                        textPaint = new TextPaint(textView.getPaint());
                        iMeasureText += tabViewMarginHorizontal;
                    }
                    textPaint.setTextSize(i3);
                    iMeasureText = (int) (iMeasureText + textPaint.measureText(textView.getText().toString()));
                }
            }
            if (iMeasureText <= Math.max(getMeasuredWidth(), View.MeasureSpec.getSize(i))) {
                break;
            }
        }
        for (int i6 = 0; i6 < this.f.getChildCount(); i6++) {
            TextView textView2 = ((ScrollingTabContainerView.TabView) this.f.getChildAt(i6)).getTextView();
            if (textView2 != null) {
                textView2.setTextSize(0, i3);
            }
        }
    }
}
