package com.scwang.smartrefresh.layout.footer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.ballpulse.BallPulseView;
import com.scwang.smartrefresh.layout.util.DensityUtil;

/* JADX INFO: loaded from: classes18.dex */
public class BallPulseFooter extends ViewGroup implements RefreshFooter {
    private BallPulseView a;
    private SpinnerStyle b;

    public BallPulseFooter(@NonNull Context context) {
        super(context);
        this.b = SpinnerStyle.Translate;
        a(context, null, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        BallPulseView ballPulseView = new BallPulseView(context);
        this.a = ballPulseView;
        addView(ballPulseView, -2, -2);
        setMinimumHeight(DensityUtil.dp2px(60.0f));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BallPulseFooter);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.BallPulseFooter_srlPrimaryColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.BallPulseFooter_srlAccentColor, 0);
        if (color != 0) {
            this.a.setNormalColor(color);
        }
        if (color2 != 0) {
            this.a.setAnimatingColor(color2);
        }
        this.b = SpinnerStyle.values()[typedArrayObtainStyledAttributes.getInt(R.styleable.BallPulseFooter_srlClassicsSpinnerStyle, this.b.ordinal())];
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public SpinnerStyle getSpinnerStyle() {
        return this.b;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @NonNull
    public View getView() {
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public boolean isSupportHorizontalDrag() {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(RefreshLayout refreshLayout, boolean z) {
        this.a.stopAnim();
        return 0;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onHorizontalDrag(float f, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onInitialized(RefreshKernel refreshKernel, int i, int i2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredWidth2 = this.a.getMeasuredWidth();
        int measuredHeight2 = this.a.getMeasuredHeight();
        int i5 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i6 = (measuredHeight / 2) - (measuredHeight2 / 2);
        this.a.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.a.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), Integer.MIN_VALUE));
        setMeasuredDimension(ViewGroup.resolveSize(this.a.getMeasuredWidth(), i), ViewGroup.resolveSize(this.a.getMeasuredHeight(), i2));
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshFooter
    public void onPullReleasing(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshFooter
    public void onPullingUp(float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onStartAnimator(RefreshLayout refreshLayout, int i, int i2) {
        this.a.startAnim();
    }

    @Override // com.scwang.smartrefresh.layout.listener.OnStateChangedListener
    public void onStateChanged(RefreshLayout refreshLayout, RefreshState refreshState, RefreshState refreshState2) {
    }

    public BallPulseFooter setAnimatingColor(@ColorInt int i) {
        this.a.setAnimatingColor(i);
        return this;
    }

    public BallPulseFooter setIndicatorColor(@ColorInt int i) {
        this.a.setIndicatorColor(i);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshFooter
    public boolean setLoadmoreFinished(boolean z) {
        return false;
    }

    public BallPulseFooter setNormalColor(@ColorInt int i) {
        this.a.setNormalColor(i);
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @Deprecated
    public void setPrimaryColors(@ColorInt int... iArr) {
        if (iArr.length > 1) {
            this.a.setNormalColor(iArr[1]);
            this.a.setAnimatingColor(iArr[0]);
        } else if (iArr.length > 0) {
            this.a.setNormalColor(ColorUtils.compositeColors(-1711276033, iArr[0]));
            this.a.setAnimatingColor(iArr[0]);
        }
    }

    public BallPulseFooter setSpinnerStyle(SpinnerStyle spinnerStyle) {
        this.b = spinnerStyle;
        return this;
    }

    public BallPulseFooter(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = SpinnerStyle.Translate;
        a(context, attributeSet, 0);
    }

    public BallPulseFooter(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        this.b = SpinnerStyle.Translate;
        a(context, attributeSet, i);
    }
}
