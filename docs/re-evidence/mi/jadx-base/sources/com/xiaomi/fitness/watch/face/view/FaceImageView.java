package com.xiaomi.fitness.watch.face.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import defpackage.iki;
import defpackage.k47;
import defpackage.ni4;
import defpackage.noi;

/* JADX INFO: loaded from: classes10.dex */
public class FaceImageView extends FaceIcon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GradientDrawable f13389a;

    public FaceImageView(Context context) {
        this(context, null, 0);
    }

    @Override // com.xiaomi.fitness.watch.face.export.exportview.FaceIcon
    public int getH() {
        return FaceIcon.HEIGHT;
    }

    @Override // com.xiaomi.fitness.watch.face.export.exportview.FaceIcon
    public float getRadius() {
        return FaceIcon.RADIUS;
    }

    public final int getValidColor(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            Logger.e(FaceIcon.TAG, "getValidColor error ");
            return 0;
        }
    }

    @Override // com.xiaomi.fitness.watch.face.export.exportview.FaceIcon
    public int getW() {
        return FaceIcon.WIDTH;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f13389a.setCornerRadius(FaceIcon.RADIUS + FaceIcon.CUR_BORDER_WIDTH);
        this.f13389a.setStroke(FaceIcon.CUR_BORDER_WIDTH, ni4.c(getContext(), iki.common_main_dark_gray_color));
        if (this.mIsCurrent) {
            this.f13389a.setBounds(0, 0, getW(), getH());
            this.f13389a.draw(canvas);
        }
    }

    public void tintColor(String str) {
        if (str == null || str.isEmpty() || getDrawable() == null) {
            return;
        }
        int validColor = getValidColor(str);
        Drawable drawableR = k47.r(getDrawable());
        if (drawableR != null) {
            k47.n(drawableR, validColor);
            setImageDrawable(drawableR);
        }
    }

    public FaceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FaceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13389a = (GradientDrawable) ni4.e(getContext(), noi.f);
    }
}
