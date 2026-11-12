package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes9.dex */
public class AniFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AniBlackView f10169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f10170b;

    public AniFrameLayout(Context context) {
        super(context);
        d(context);
    }

    public AniFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context);
    }

    private void d(Context context) {
        this.f10169a = new AniBlackView(context);
        this.f10170b = new HealthTextView(context);
        addView(this.f10169a, -1, -1);
        addView(this.f10170b, -2, -2);
        ViewGroup.LayoutParams layoutParams = this.f10170b.getLayoutParams();
        if (layoutParams instanceof ViewGroup.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
    }

    public void b(int i) {
        this.f10170b.e(i);
    }

    public void b() {
        d();
        this.f10169a.e(false);
    }

    public void e() {
        d();
        this.f10169a.e(true);
    }

    public void d() {
        this.f10169a.d();
    }
}
