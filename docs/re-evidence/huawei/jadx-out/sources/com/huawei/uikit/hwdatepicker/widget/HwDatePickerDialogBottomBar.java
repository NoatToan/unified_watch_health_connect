package com.huawei.uikit.hwdatepicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.huawei.uikit.hwdatepicker.R;
import com.huawei.uikit.hwtextview.widget.HwTextView;
import defpackage.xfu;

/* JADX INFO: loaded from: classes44.dex */
public class HwDatePickerDialogBottomBar extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f29402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwTextView f29403b;
    private float d;
    private HwTextView e;

    public HwDatePickerDialogBottomBar(Context context) {
        super(context);
        this.f29402a = context;
    }

    private void a() {
        HwTextView hwTextView = this.f29403b;
        if (hwTextView == null || this.e == null) {
            return;
        }
        float fMin = Math.min(hwTextView.getTextSize(), this.e.getTextSize());
        this.f29403b.setTextSize(0, fMin);
        this.e.setTextSize(0, fMin);
        d();
    }

    private void c() {
        HwTextView hwTextView = this.f29403b;
        if (hwTextView == null || this.e == null) {
            return;
        }
        hwTextView.setTextSize(this.d);
        this.e.setTextSize(this.d);
    }

    private void d() {
        if (xfu.c(this.f29402a) && Float.compare(xfu.d(this.f29402a), 1.75f) >= 0) {
            if (xfu.a(this.f29402a)) {
                this.e.setTextSize(1, 16.0f);
                this.f29403b.setTextSize(1, 16.0f);
            } else if (Float.compare(xfu.d(this.f29402a), 2.0f) > 0 && this.f29402a.getResources().getConfiguration().orientation == 2) {
                this.e.setTextSize(1, 32.0f);
                this.f29403b.setTextSize(1, 32.0f);
            }
        }
    }

    private void e() {
        this.f29403b = (HwTextView) findViewById(R.id.hwdatepicker_dialog_negative_btn);
        this.e = (HwTextView) findViewById(R.id.hwdatepicker_dialog_positive_btn);
        this.d = getResources().getDimension(R.dimen.hwdatepicker_alert_dialog_button_text_size);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        c();
        super.onMeasure(i, i2);
        a();
    }

    public HwDatePickerDialogBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29402a = context;
    }

    public HwDatePickerDialogBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29402a = context;
    }
}
