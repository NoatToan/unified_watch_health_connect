package com.xiaomi.fitness.watch.face.export.exportview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.ni4;
import defpackage.ooi;

/* JADX INFO: loaded from: classes10.dex */
public class RectView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static float f13382b = FaceIcon.WIDTH * 1.5f;
    public static float c = FaceIcon.HEIGHT * 1.5f;
    public static float d = FaceIcon.RADIUS * 1.5f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GradientDrawable f13383a;

    public RectView(Context context) {
        this(context, null);
    }

    public static void a() {
        f13382b = FaceIcon.ORI_WIDTH * 1.5f;
        c = FaceIcon.ORI_HEIGHT * 1.5f;
        d = FaceIcon.ORI_RADIUS * 1.5f;
        Logger.d("RectView", "w = " + f13382b + "; radius = " + d);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f13383a.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension((int) f13382b, (int) c);
    }

    public RectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Rect rect = new Rect(0, 0, (int) f13382b, (int) c);
        GradientDrawable gradientDrawable = (GradientDrawable) ni4.e(getContext(), ooi.f29342b);
        this.f13383a = gradientDrawable;
        gradientDrawable.setCornerRadius(d);
        this.f13383a.setBounds(rect);
    }
}
