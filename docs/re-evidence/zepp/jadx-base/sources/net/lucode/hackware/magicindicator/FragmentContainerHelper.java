package net.lucode.hackware.magicindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.model.PositionData;

/* JADX INFO: loaded from: classes23.dex */
@TargetApi(11)
public class FragmentContainerHelper {
    private ValueAnimator b;
    private int c;
    private List<MagicIndicator> a = new ArrayList();
    private int d = 150;
    private Interpolator e = new AccelerateDecelerateInterpolator();
    private Animator.AnimatorListener f = new a();
    private ValueAnimator.AnimatorUpdateListener g = new b();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FragmentContainerHelper.this.d(0);
            FragmentContainerHelper.this.b = null;
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            int i = (int) fFloatValue;
            float f = fFloatValue - i;
            if (fFloatValue < 0.0f) {
                i--;
                f += 1.0f;
            }
            FragmentContainerHelper.this.e(i, f, 0);
        }
    }

    public FragmentContainerHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        Iterator<MagicIndicator> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().onPageScrollStateChanged(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, float f, int i2) {
        Iterator<MagicIndicator> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().onPageScrolled(i, f, i2);
        }
    }

    private void f(int i) {
        Iterator<MagicIndicator> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().onPageSelected(i);
        }
    }

    public static PositionData getImitativePositionData(List<PositionData> list, int i) {
        PositionData positionData;
        if (i >= 0 && i <= list.size() - 1) {
            return list.get(i);
        }
        PositionData positionData2 = new PositionData();
        if (i < 0) {
            positionData = list.get(0);
        } else {
            i = (i - list.size()) + 1;
            positionData = list.get(list.size() - 1);
        }
        positionData2.mLeft = positionData.mLeft + (positionData.width() * i);
        positionData2.mTop = positionData.mTop;
        positionData2.mRight = positionData.mRight + (positionData.width() * i);
        positionData2.mBottom = positionData.mBottom;
        positionData2.mContentLeft = positionData.mContentLeft + (positionData.width() * i);
        positionData2.mContentTop = positionData.mContentTop;
        positionData2.mContentRight = positionData.mContentRight + (i * positionData.width());
        positionData2.mContentBottom = positionData.mContentBottom;
        return positionData2;
    }

    public void attachMagicIndicator(MagicIndicator magicIndicator) {
        this.a.add(magicIndicator);
    }

    public void handlePageSelected(int i) {
        handlePageSelected(i, true);
    }

    public void setDuration(int i) {
        this.d = i;
    }

    public void setInterpolator(Interpolator interpolator) {
        if (interpolator == null) {
            this.e = new AccelerateDecelerateInterpolator();
        } else {
            this.e = interpolator;
        }
    }

    public void handlePageSelected(int i, boolean z) {
        if (this.c == i) {
            return;
        }
        if (z) {
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                d(2);
            }
            f(i);
            float fFloatValue = this.c;
            ValueAnimator valueAnimator2 = this.b;
            if (valueAnimator2 != null) {
                fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                this.b.cancel();
                this.b = null;
            }
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.b = valueAnimator3;
            valueAnimator3.setFloatValues(fFloatValue, i);
            this.b.addUpdateListener(this.g);
            this.b.addListener(this.f);
            this.b.setInterpolator(this.e);
            this.b.setDuration(this.d);
            this.b.start();
        } else {
            f(i);
            ValueAnimator valueAnimator4 = this.b;
            if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                e(this.c, 0.0f, 0);
            }
            d(0);
            e(i, 0.0f, 0);
        }
        this.c = i;
    }

    public FragmentContainerHelper(MagicIndicator magicIndicator) {
        this.a.add(magicIndicator);
    }
}
