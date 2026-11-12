package miuix.appcompat.internal.app.widget;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.awi;
import defpackage.md0;

/* JADX INFO: loaded from: classes3.dex */
public class CollapseTabContainer extends ScrollingTabContainerView {
    public CollapseTabContainer(Context context) {
        super(context);
        setContentHeight(getTabContainerHeight());
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    public int getDefaultTabTextStyle() {
        return R.attr.actionBarTabTextStyle;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    public int getTabBarLayoutRes() {
        return awi.h;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    public int getTabContainerHeight() {
        return md0.b(getContext()).d();
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    public int getTabViewLayoutRes() {
        return awi.f;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    public int getTabViewMarginHorizontal() {
        return 0;
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = getMeasuredHeight();
        int measuredHeight2 = this.f.getMeasuredHeight();
        int i5 = (measuredHeight - measuredHeight2) / 2;
        this.f.layout(i, i5, this.f.getMeasuredWidth(), measuredHeight2 + i5);
    }

    @Override // miuix.appcompat.internal.app.widget.ScrollingTabContainerView
    public View p(ViewGroup viewGroup, View view, TextView textView, ImageView imageView) {
        ViewParent parent = view.getParent();
        if (parent != this) {
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
            }
            viewGroup.addView(view);
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        return view;
    }
}
