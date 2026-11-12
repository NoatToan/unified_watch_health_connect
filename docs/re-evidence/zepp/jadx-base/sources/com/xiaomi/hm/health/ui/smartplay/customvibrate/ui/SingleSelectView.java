package com.xiaomi.hm.health.ui.smartplay.customvibrate.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.text.TextUtilsCompat;
import com.huami.lib.view.ViewUtils;
import com.huami.watch.hmwatchmanager.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes22.dex */
public class SingleSelectView extends LinearLayout {
    public static final int DIVIDER_GONE = 0;
    public static final int DIVIDER_LONG = 2;
    public static final int DIVIDER_SHORT = 1;
    private static final int l = 250;
    public TextView a;
    private AppCompatImageView b;
    public AppCompatImageView c;
    private View d;
    private boolean e;
    private c f;
    private int g;
    private int h;
    private int i;
    private ValueAnimator j;
    private b k;

    public class a extends AnimatorListenerAdapter {
        private c a;
        public final /* synthetic */ boolean b;

        private a(c state, final boolean val$edit) {
            this.b = val$edit;
            this.a = state;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            if (!this.b) {
                SingleSelectView.this.c.setVisibility(8);
            }
            SingleSelectView.this.k.a(this.a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            if (this.b) {
                SingleSelectView.this.c.setVisibility(0);
            }
        }
    }

    public interface b {
        void a(c state);
    }

    public enum c {
        EDIT,
        NORMAL,
        EDIT_2_NORMAL,
        NORMAL_2_EDIT
    }

    public SingleSelectView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(ValueAnimator valueAnimator) {
        this.c.setScaleX(((Float) valueAnimator.getAnimatedValue("scaleX")).floatValue());
        this.c.setScaleY(((Float) valueAnimator.getAnimatedValue("scaleY")).floatValue());
        this.c.setAlpha(((Float) valueAnimator.getAnimatedValue("alpha")).floatValue());
        this.a.setTranslationX(((Float) valueAnimator.getAnimatedValue("translateX")).floatValue());
    }

    public c getState() {
        return this.f;
    }

    public boolean itemSelected() {
        return this.e;
    }

    public void playAnim(boolean edit) {
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float[] fArr = new float[2];
        fArr[0] = edit ? 0.0f : 1.0f;
        fArr[1] = edit ? 1.0f : 0.0f;
        PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("scaleX", fArr);
        float[] fArr2 = new float[2];
        fArr2[0] = edit ? 0.0f : 1.0f;
        fArr2[1] = edit ? 1.0f : 0.0f;
        PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("scaleY", fArr2);
        float[] fArr3 = new float[2];
        fArr3[0] = edit ? 0.0f : 1.0f;
        fArr3[1] = edit ? 1.0f : 0.0f;
        PropertyValuesHolder propertyValuesHolderOfFloat3 = PropertyValuesHolder.ofFloat("alpha", fArr3);
        float[] fArr4 = new float[2];
        fArr4[0] = edit ? 0.0f : this.i;
        fArr4[1] = edit ? this.i : 0.0f;
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2, propertyValuesHolderOfFloat3, PropertyValuesHolder.ofFloat("translateX", fArr4));
        this.j = valueAnimatorOfPropertyValuesHolder;
        valueAnimatorOfPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fv6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.a.c(valueAnimator2);
            }
        });
        this.j.setDuration(250L);
        this.j.addListener(new a(this.f, edit));
        this.j.start();
    }

    public void setAnimListener(b listener) {
        this.k = listener;
    }

    public void setDividerVisibility(int mode) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.d.getLayoutParams();
        if (mode == 0) {
            this.d.setVisibility(8);
            return;
        }
        if (mode == 1) {
            this.d.setVisibility(0);
            layoutParams.setMarginStart((int) ViewUtils.dp2px(getContext(), 18.0f));
            layoutParams.setMarginEnd((int) ViewUtils.dp2px(getContext(), 18.0f));
            this.d.setLayoutParams(layoutParams);
            return;
        }
        if (mode != 2) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.setMarginStart(0);
        layoutParams2.setMarginEnd(0);
        this.d.setLayoutParams(layoutParams2);
    }

    public void setItemSelected(boolean selected) {
        this.e = selected;
        this.a.setTextColor(selected ? this.g : this.h);
        this.b.setVisibility(selected ? 0 : 8);
    }

    public void setStateWithAnim(c state) {
        if (state == this.f) {
            return;
        }
        this.f = state;
        c cVar = c.EDIT_2_NORMAL;
        if (cVar == state || c.EDIT == state) {
            this.c.setVisibility(0);
            this.c.setAlpha(1.0f);
            this.c.setScaleX(1.0f);
            this.c.setScaleY(1.0f);
            this.a.setTranslationX(this.i);
            if (cVar == state) {
                playAnim(false);
                return;
            }
            return;
        }
        c cVar2 = c.NORMAL_2_EDIT;
        if (cVar2 == state || c.NORMAL == state) {
            this.c.setVisibility(8);
            this.c.setAlpha(0.0f);
            this.c.setScaleX(0.0f);
            this.c.setScaleY(0.0f);
            this.a.setTranslationX(0.0f);
            if (cVar2 == state) {
                playAnim(true);
            }
        }
    }

    public void setText(@StringRes int stringRes) {
        this.a.setText(stringRes);
    }

    public SingleSelectView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public void setText(String text) {
        this.a.setText(text);
    }

    public SingleSelectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.e = false;
        this.f = c.NORMAL;
        this.g = ContextCompat.getColor(context, R.color.dark_sky_blue_three);
        this.h = ContextCompat.getColor(context, R.color.s2);
        this.i = (int) ViewUtils.dp2px(context, TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? -34.0f : 34.0f);
        LayoutInflater.from(context).inflate(R.layout.layout_single_select, this);
        this.a = (TextView) findViewById(R.id.title_tv);
        this.b = (AppCompatImageView) findViewById(R.id.arrow_img);
        this.c = (AppCompatImageView) findViewById(R.id.delete_img);
        this.d = findViewById(R.id.divider);
        setItemSelected(false);
    }
}
