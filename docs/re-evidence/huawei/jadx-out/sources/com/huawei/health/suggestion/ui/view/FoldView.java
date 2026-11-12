package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes31.dex */
public class FoldView extends FrameLayout {
    private int d;
    private View e;

    public FoldView(Context context) {
        this(context, null);
    }

    public FoldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setView(View view) {
        this.e = view;
        addView(view);
    }

    public void setFiexdHeight(int i) {
        this.d = i;
    }

    private void setAnimatedHeight(int i) {
        if (this.e.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e.getLayoutParams();
            layoutParams.height = i;
            this.e.setLayoutParams(layoutParams);
        }
    }
}
