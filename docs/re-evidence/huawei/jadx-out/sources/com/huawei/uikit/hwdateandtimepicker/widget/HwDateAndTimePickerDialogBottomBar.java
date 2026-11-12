package com.huawei.uikit.hwdateandtimepicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.huawei.uikit.hwdateandtimepicker.R;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import defpackage.xfu;

/* JADX INFO: loaded from: classes44.dex */
public class HwDateAndTimePickerDialogBottomBar extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HwTextView f29383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwTextView f29384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f29385c;
    private Context d;

    public HwDateAndTimePickerDialogBottomBar(Context context) {
        super(context);
        this.d = context;
    }

    private void b() {
        if (xfu.c(this.d) && Float.compare(xfu.d(this.d), 1.75f) >= 0) {
            if (xfu.a(this.d)) {
                this.f29383a.setTextSize(1, 16.0f);
                this.f29384b.setTextSize(1, 16.0f);
            } else if (Float.compare(xfu.d(this.d), 2.0f) > 0 && this.d.getResources().getConfiguration().orientation == 2) {
                this.f29383a.setTextSize(1, 32.0f);
                this.f29384b.setTextSize(1, 32.0f);
            }
        }
    }

    private void c() {
        HwTextView hwTextView = this.f29384b;
        if (hwTextView == null || this.f29383a == null) {
            return;
        }
        float fMin = Math.min(hwTextView.getTextSize(), this.f29383a.getTextSize());
        this.f29384b.setTextSize(0, fMin);
        this.f29383a.setTextSize(0, fMin);
        b();
    }

    private void d() {
        this.f29384b = (HwTextView) findViewById(R.id.hwdateandtimepicker_dialog_negative_btn);
        this.f29383a = (HwTextView) findViewById(R.id.hwdateandtimepicker_dialog_positive_btn);
        this.f29385c = getResources().getDimension(R.dimen.hwdateandtimepicker_alert_dialog_button_text_size);
    }

    private void e() {
        HwTextView hwTextView = this.f29384b;
        if (hwTextView == null || this.f29383a == null) {
            return;
        }
        hwTextView.setTextSize(this.f29385c);
        this.f29383a.setTextSize(this.f29385c);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        e();
        super.onMeasure(i, i2);
        c();
    }

    public HwDateAndTimePickerDialogBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = context;
    }

    public HwDateAndTimePickerDialogBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = context;
    }
}
