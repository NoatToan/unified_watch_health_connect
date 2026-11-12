package com.huami.watchfacesstore.view.recycleview;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.huami.watchfacesstore.R;

/* JADX INFO: loaded from: classes17.dex */
class d extends ConstraintLayout {
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    private TextView a;
    private ImageView b;

    public d(Context context) {
        super(context);
        a(context);
    }

    @TargetApi(17)
    private void a(Context context) {
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setId(ViewGroup.generateViewId());
        int iApplyDimension = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iApplyDimension, iApplyDimension);
        layoutParams.horizontalChainStyle = 2;
        layoutParams.horizontalBias = 0.5f;
        addView(this.b, layoutParams);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setText(R.string.wf_page_loading);
        this.a.setTextColor(-3355444);
        this.a.setId(ViewGroup.generateViewId());
        addView(this.a, new ConstraintLayout.LayoutParams(-2, -2));
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        constraintSet.connect(this.b.getId(), 3, 0, 3);
        constraintSet.connect(this.b.getId(), 4, 0, 4);
        constraintSet.connect(this.b.getId(), 1, 0, 1);
        constraintSet.connect(this.b.getId(), 2, this.a.getId(), 1);
        constraintSet.connect(this.a.getId(), 3, 0, 3, 8);
        constraintSet.connect(this.a.getId(), 4, 0, 4, 8);
        constraintSet.connect(this.a.getId(), 1, this.b.getId(), 2, 8);
        constraintSet.connect(this.a.getId(), 2, 0, 2, 0);
        constraintSet.applyTo(this);
    }

    private void c() {
    }

    private void d() {
    }

    public void b(int state) {
        if (state == 0) {
            c();
            this.b.setVisibility(0);
            this.a.setText(R.string.wf_page_loading);
            return;
        }
        if (state == 1) {
            this.b.setVisibility(8);
            this.a.setText("");
            d();
        } else if (state == 2) {
            this.b.setVisibility(8);
            this.a.setText(R.string.wf_page_load_no_more);
            d();
        } else {
            if (state != 3) {
                return;
            }
            this.b.setVisibility(8);
            this.a.setText("·—· 点击重试 ·—·");
            d();
        }
    }
}
