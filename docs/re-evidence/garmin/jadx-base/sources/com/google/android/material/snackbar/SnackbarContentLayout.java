package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class SnackbarContentLayout extends LinearLayout implements ContentViewCallback {
    private Button actionView;
    private final TimeInterpolator contentInterpolator;
    private int maxInlineActionWidth;
    private TextView messageView;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.contentInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
    }

    private static void updateTopBottomPadding(View view2, int i14, int i15) {
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        if (view2.isPaddingRelative()) {
            view2.setPaddingRelative(view2.getPaddingStart(), i14, view2.getPaddingEnd(), i15);
        } else {
            view2.setPadding(view2.getPaddingLeft(), i14, view2.getPaddingRight(), i15);
        }
    }

    private boolean updateViewsWithinLayout(int i14, int i15, int i16) {
        boolean z14;
        if (i14 != getOrientation()) {
            setOrientation(i14);
            z14 = true;
        } else {
            z14 = false;
        }
        if (this.messageView.getPaddingTop() == i15 && this.messageView.getPaddingBottom() == i16) {
            return z14;
        }
        updateTopBottomPadding(this.messageView, i15, i16);
        return true;
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int i14, int i15) {
        this.messageView.setAlpha(0.0f);
        long j8 = i15;
        long j14 = i14;
        this.messageView.animate().alpha(1.0f).setDuration(j8).setInterpolator(this.contentInterpolator).setStartDelay(j14).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(0.0f);
            this.actionView.animate().alpha(1.0f).setDuration(j8).setInterpolator(this.contentInterpolator).setStartDelay(j14).start();
        }
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int i14, int i15) {
        this.messageView.setAlpha(1.0f);
        long j8 = i15;
        long j14 = i14;
        this.messageView.animate().alpha(0.0f).setDuration(j8).setInterpolator(this.contentInterpolator).setStartDelay(j14).start();
        if (this.actionView.getVisibility() == 0) {
            this.actionView.setAlpha(1.0f);
            this.actionView.animate().alpha(0.0f).setDuration(j8).setInterpolator(this.contentInterpolator).setStartDelay(j14).start();
        }
    }

    public Button getActionView() {
        return this.actionView;
    }

    public TextView getMessageView() {
        return this.messageView;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.messageView = (TextView) findViewById(R.id.snackbar_text);
        this.actionView = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.messageView.getLayout();
        boolean z14 = layout != null && layout.getLineCount() > 1;
        if (!z14 || this.maxInlineActionWidth <= 0 || this.actionView.getMeasuredWidth() <= this.maxInlineActionWidth) {
            if (!z14) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!updateViewsWithinLayout(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!updateViewsWithinLayout(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i14, i15);
    }

    public void setMaxInlineActionWidth(int i14) {
        this.maxInlineActionWidth = i14;
    }

    public void updateActionTextColorAlphaIfNeeded(float f14) {
        if (f14 != 1.0f) {
            this.actionView.setTextColor(MaterialColors.layer(MaterialColors.getColor(this, R.attr.colorSurface), this.actionView.getCurrentTextColor(), f14));
        }
    }

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }
}
