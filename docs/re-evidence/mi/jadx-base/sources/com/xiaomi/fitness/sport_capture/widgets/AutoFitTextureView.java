package com.xiaomi.fitness.sport_capture.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import com.xiaomi.fitness.common.log.Logger;

/* JADX INFO: loaded from: classes10.dex */
public class AutoFitTextureView extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13038b;

    public AutoFitTextureView(Context context) {
        this(context, null);
    }

    public void a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Size cannot be negative.");
        }
        this.f13037a = i;
        this.f13038b = i2;
        requestLayout();
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Logger.i("AutoFitTextureView", "width:" + getWidth() + " height:" + getHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.f13037a;
        if (i4 == 0 || (i3 = this.f13038b) == 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int i5 = (size2 * i4) / i3;
        if (size >= i5) {
            setMeasuredDimension(i5, size2);
            Logger.i("AutoFitTextureView", "openCamera width:" + i5 + " height:" + size2);
            return;
        }
        int i6 = (i3 * size) / i4;
        setMeasuredDimension(size, i6);
        Logger.i("AutoFitTextureView", "openCamera width:" + size + " height:" + i6);
    }

    public AutoFitTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13037a = 0;
        this.f13038b = 0;
    }
}
