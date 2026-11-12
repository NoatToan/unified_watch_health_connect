package com.huawei.uikit.hwbottomsheet.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.xdw;

/* JADX INFO: loaded from: classes43.dex */
public class HwSoftLightAnimBottomSheet extends HwBottomSheet {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29289c;

    public HwSoftLightAnimBottomSheet(Context context) {
        super(context, null);
        this.f29289c = false;
    }

    @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet
    float b() {
        float fMax;
        if (e() || this.f29289c) {
            fMax = getSlideOffset() > 0.9f ? 1.0f : Math.max((getSlideOffset() * 20.0f) - 17.0f, 0.0f);
        } else {
            fMax = getViewDragHelper().b();
        }
        getSlidableView().setAlpha(fMax);
        return fMax;
    }

    @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet, android.view.View
    public void computeScroll() {
        if (getViewDragHelper() == null || !getViewDragHelper().c(true)) {
            this.f29289c = false;
        } else if (isEnabled()) {
            postInvalidateOnAnimation();
        } else {
            getViewDragHelper().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public xdw a() {
        return xdw.e(this, getNormalSensitivity(), d());
    }

    @Override // com.huawei.uikit.hwbottomsheet.widget.HwBottomSheet
    public void settleCapturedViewAt(int i, int i2) {
        this.f29289c = true;
        b();
        getViewDragHelper().e(i, i2);
    }

    public HwSoftLightAnimBottomSheet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29289c = false;
    }

    public HwSoftLightAnimBottomSheet(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29289c = false;
    }
}
