package com.huawei.uikit.hwtimepicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import com.huawei.uikit.hwtimepicker.R;
import defpackage.xfu;

/* JADX INFO: loaded from: classes44.dex */
public class HwTimePickerDialogBottomBar extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f29788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwTextView f29789c;
    private float d;
    private HwTextView e;

    public HwTimePickerDialogBottomBar(Context context) {
        super(context);
        this.f29788b = context;
    }

    private void a() {
        HwTextView hwTextView = this.f29789c;
        if (hwTextView == null || this.e == null) {
            return;
        }
        float fMin = Math.min(hwTextView.getTextSize(), this.e.getTextSize());
        this.f29789c.setTextSize(0, fMin);
        this.e.setTextSize(0, fMin);
        b();
    }

    private void b() {
        if (xfu.c(this.f29788b) && Float.compare(xfu.d(this.f29788b), 1.75f) >= 0) {
            if (xfu.a(this.f29788b)) {
                this.e.setTextSize(1, 16.0f);
                this.f29789c.setTextSize(1, 16.0f);
            } else if (Float.compare(xfu.d(this.f29788b), 2.0f) > 0 && this.f29788b.getResources().getConfiguration().orientation == 2) {
                this.e.setTextSize(1, 32.0f);
                this.f29789c.setTextSize(1, 32.0f);
            }
        }
    }

    private void d() {
        HwTextView hwTextView = this.f29789c;
        if (hwTextView == null || this.e == null) {
            return;
        }
        hwTextView.setTextSize(this.d);
        this.e.setTextSize(this.d);
    }

    private void e() {
        this.f29789c = (HwTextView) findViewById(R.id.hwtimepicker_negative_btn);
        this.e = (HwTextView) findViewById(R.id.hwtimepicker_positive_btn);
        this.d = getResources().getDimension(R.dimen.hwtimepicker_alert_dialog_button_text_size);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        d();
        super.onMeasure(i, i2);
        a();
    }

    public HwTimePickerDialogBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29788b = context;
    }

    public HwTimePickerDialogBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29788b = context;
    }
}
