package com.zhouyou.recyclerview.progressindicator.indicator;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class SquareSpinIndicator extends BaseIndicatorController {
    @Override // com.zhouyou.recyclerview.progressindicator.indicator.BaseIndicatorController
    public List<Animator> createAnimation() {
        ArrayList arrayList = new ArrayList();
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("rotationX", 0.0f, 180.0f, 180.0f, 0.0f, 0.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(getTarget(), PropertyValuesHolder.ofFloat("rotationY", 0.0f, 0.0f, 180.0f, 180.0f, 0.0f), propertyValuesHolderOfFloat);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new LinearInterpolator());
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
        objectAnimatorOfPropertyValuesHolder.setDuration(2500L);
        objectAnimatorOfPropertyValuesHolder.start();
        arrayList.add(objectAnimatorOfPropertyValuesHolder);
        return arrayList;
    }

    @Override // com.zhouyou.recyclerview.progressindicator.indicator.BaseIndicatorController
    public void draw(Canvas canvas, Paint paint) {
        canvas.drawRect(new RectF(getWidth() / 5, getHeight() / 5, (getWidth() * 4) / 5, (getHeight() * 4) / 5), paint);
    }
}
