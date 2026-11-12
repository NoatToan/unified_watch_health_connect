package com.huawei.uikit.hwswiperefreshlayout.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.huawei.uikit.hwprogressbar.widget.HwProgressBar;
import com.huawei.uikit.hwswiperefreshlayout.R;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import defpackage.xdb;
import defpackage.xfu;

/* JADX INFO: loaded from: classes20.dex */
public class HwRefreshHeadView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f29756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwTextView f29758c;
    private RelativeLayout d;
    private HwProgressBar e;

    public HwRefreshHeadView(Context context) {
        super(context);
        this.f29756a = context;
    }

    private void d() {
        this.d = (RelativeLayout) findViewById(R.id.hwswiperefreshlayout_layout);
        HwProgressBar hwProgressBar = (HwProgressBar) findViewById(R.id.hwswiperefreshlayout_progressbar);
        this.e = hwProgressBar;
        hwProgressBar.setVisibility(4);
        a();
    }

    private void e() {
        this.f29758c = (HwTextView) findViewById(R.id.hwswiperefreshlayout_textview);
        Context context = this.f29756a;
        if (context != null && xfu.c(context) && Float.compare(xfu.d(this.f29756a), 1.75f) >= 0) {
            this.f29758c.setAutoTextSize(1, 24.5f);
        }
        this.f29758c.setVisibility(4);
    }

    void a() {
        Drawable indeterminateDrawable = this.e.getIndeterminateDrawable();
        if (indeterminateDrawable instanceof xdb) {
            ((xdb) indeterminateDrawable).c();
        }
    }

    public void b(int i) {
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, i);
        }
    }

    void c() {
        Drawable indeterminateDrawable = this.e.getIndeterminateDrawable();
        if (indeterminateDrawable instanceof xdb) {
            ((xdb) indeterminateDrawable).a();
        }
    }

    public void d(Context context) {
        this.f29756a = context;
        d();
        e();
    }

    public HwTextView getTextView() {
        return this.f29758c;
    }

    public void setProgressBarAlpha(float f) {
        this.e.setAlpha(f);
    }

    public void setProgressBarColor(int i) {
        Drawable indeterminateDrawable = this.e.getIndeterminateDrawable();
        if (indeterminateDrawable instanceof xdb) {
            ((xdb) indeterminateDrawable).a(i);
        }
    }

    void setProgressBarDragFraction(float f) {
        Drawable indeterminateDrawable = this.e.getIndeterminateDrawable();
        if (indeterminateDrawable instanceof xdb) {
            indeterminateDrawable.setLevel((int) (f * 10000.0f));
        }
    }

    @Deprecated
    public void setProgressBarRollingStatus(int i) {
    }

    public void setProgressBarScaleSize(int i) {
        this.f29757b = i;
    }

    public void setProgressBarScaleX(float f) {
        this.e.setScaleX(f);
    }

    public void setProgressBarScaleY(float f) {
        this.e.setScaleY(f);
    }

    public void setProgressBarVisibility(int i) {
        this.e.setVisibility(i);
    }

    public void setTextViewAlpha(float f) {
        this.f29758c.setAlpha(f);
    }

    public void setTextViewColor(int i) {
        this.f29758c.setTextColor(i);
    }

    public void setTextViewText(CharSequence charSequence) {
        this.f29758c.setText(charSequence);
    }

    public void setTextViewVisibility(int i) {
        this.f29758c.setVisibility(i);
    }

    public HwRefreshHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29756a = context;
    }

    public HwRefreshHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29756a = context;
    }
}
