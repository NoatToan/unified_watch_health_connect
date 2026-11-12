package com.zhouyou.recyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.animation.LinearInterpolator;
import com.zhouyou.recyclerviewsdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class ClifeIndicator extends BaseIndicatorController {
    private Context e;
    private int[] c = {R.mipmap.loading_0, R.mipmap.loading_1, R.mipmap.loading_2};
    private int d = 0;
    private float f = 1.0f;
    private float g = 1.0f;
    public boolean h = true;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (iIntValue != ClifeIndicator.this.d) {
                ClifeIndicator.this.postInvalidate();
            }
            ClifeIndicator.this.d = iIntValue;
        }
    }

    public ClifeIndicator(Context context) {
        this.e = context;
    }

    @Override // com.zhouyou.recyclerview.progressindicator.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 10);
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.addUpdateListener(new a());
        valueAnimatorOfInt.start();
        arrayList.add(valueAnimatorOfInt);
        return arrayList;
    }

    @Override // com.zhouyou.recyclerview.progressindicator.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        canvas.save();
        Matrix matrix = new Matrix();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.e.getResources(), this.c[this.d % 3]);
        if (bitmapDecodeResource == null) {
            return;
        }
        if (this.h) {
            this.f = getWidth() / bitmapDecodeResource.getWidth();
            this.g = getHeight() / bitmapDecodeResource.getHeight();
            this.h = false;
        }
        matrix.setScale(this.f, this.g);
        canvas.drawBitmap(bitmapDecodeResource, matrix, paint);
        bitmapDecodeResource.recycle();
        canvas.restore();
    }
}
