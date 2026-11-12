package com.huawei.openalliance.ad.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.Key;
import com.huawei.openalliance.ad.gx;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes41.dex */
public class m extends k {
    protected ImageView f;

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        hw.b(getViewTag(), "w=%s, h=%s, oldw=%s, oldh=%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        this.f.post(new Runnable() { // from class: com.huawei.openalliance.ad.views.m.1
            @Override // java.lang.Runnable
            public void run() {
                hw.b(m.this.getViewTag(), "imageView %s %s", Integer.valueOf(m.this.f.getWidth()), Integer.valueOf(m.this.f.getHeight()));
                m.this.f.setPivotX(m.this.f.getWidth() / 2.0f);
                m.this.f.setPivotY(m.this.f.getHeight() + as.a(m.this.getContext(), 80.0f));
                m.this.b();
            }
        });
    }

    protected String getViewTag() {
        return "PPSBaseTwistView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new gx(0.33f, 0.0f, 0.67f, 1.0f));
        ArrayList arrayList = new ArrayList(4);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f, Key.ROTATION, 0.0f, -7.0f);
        objectAnimatorOfFloat.setDuration(150L);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f, Key.ROTATION, -7.0f, 7.0f);
        objectAnimatorOfFloat2.setDuration(400L);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f, Key.ROTATION, 7.0f, -4.5f);
        objectAnimatorOfFloat3.setDuration(350L);
        arrayList.add(objectAnimatorOfFloat3);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f, Key.ROTATION, -4.5f, 2.0f);
        objectAnimatorOfFloat4.setDuration(350L);
        arrayList.add(objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f, Key.ROTATION, 2.0f, 0.0f);
        objectAnimatorOfFloat5.setDuration(250L);
        arrayList.add(objectAnimatorOfFloat5);
        this.f.invalidate();
        animatorSet.playSequentially(arrayList);
        animatorSet.start();
    }

    public m(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public m(Context context) {
        super(context);
    }
}
