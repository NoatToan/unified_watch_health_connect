package com.garmin.android.library.handalignment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class AutoFitTextureView extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50157d;

    public AutoFitTextureView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f50154a = 0;
        this.f50155b = 0;
        this.f50156c = 0;
        this.f50157d = 0;
    }

    public int getViewHeight() {
        return this.f50157d;
    }

    public int getViewWidth() {
        return this.f50156c;
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        int i16;
        super.onMeasure(i14, i15);
        int size = View.MeasureSpec.getSize(i14);
        int size2 = View.MeasureSpec.getSize(i15);
        int i17 = this.f50154a;
        if (i17 == 0 || (i16 = this.f50155b) == 0) {
            setMeasuredDimension(size, size2);
        } else if (size < (size2 * i17) / i16) {
            setMeasuredDimension(size, (i16 * size) / i17);
        } else {
            setMeasuredDimension((i17 * size2) / i16, size2);
        }
    }

    public AutoFitTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoFitTextureView(Context context) {
        this(context, null);
    }
}
