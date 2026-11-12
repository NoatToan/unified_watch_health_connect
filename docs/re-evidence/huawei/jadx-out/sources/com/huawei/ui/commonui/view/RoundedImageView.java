package com.huawei.ui.commonui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.qrs;

/* JADX INFO: loaded from: classes16.dex */
public class RoundedImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RectF f24003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f24004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Path f24005c;
    private Context d;

    public RoundedImageView(Context context) {
        super(context);
        this.f24005c = new Path();
        this.f24003a = new RectF();
        this.f24004b = new float[8];
        this.d = context;
        setRadius(qrs.d(context, 4.0f));
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24005c = new Path();
        this.f24003a = new RectF();
        this.f24004b = new float[8];
        this.d = context;
        setRadius(qrs.d(context, 4.0f));
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24005c = new Path();
        this.f24003a = new RectF();
        this.f24004b = new float[8];
        this.d = context;
        setRadius(qrs.d(context, 4.0f));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        this.f24003a.right = getWidth();
        this.f24003a.bottom = getHeight();
        this.f24005c.addRoundRect(this.f24003a, this.f24004b, Path.Direction.CW);
        canvas.clipPath(this.f24005c);
        super.onDraw(canvas);
    }

    public final void setRadius(float f) {
        int i = 0;
        while (true) {
            float[] fArr = this.f24004b;
            if (i >= fArr.length) {
                return;
            }
            fArr[i] = f;
            i++;
        }
    }

    public final void setRadius(float[] fArr) {
        if (fArr == null || fArr.length != 8) {
            return;
        }
        this.f24004b = fArr;
    }
}
