package com.huawei.ui.commonui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ucd.cloveranimation.AddFrameListener;
import com.huawei.ucd.cloveranimation.CloverView;
import com.huawei.ui.commonui.R;
import defpackage.qhx;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class Clover extends CloverView {
    public Clover(Context context) {
        this(context, null);
    }

    public Clover(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Clover(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
    }

    private void d() {
        qhx cloverData = getCloverData();
        if (cloverData == null) {
            ReleaseLogUtil.d("R_Clover", "initColor cloverData is null");
            return;
        }
        cloverData.e(d(R.color.clover_petal_background_left_start));
        cloverData.b(d(R.color.clover_petal_background_left_end));
        cloverData.h(d(R.color.clover_petal_background_middle_start));
        cloverData.g(d(R.color.clover_petal_background_middle_end));
        cloverData.m(d(R.color.clover_petal_background_right_start));
        cloverData.o(d(R.color.clover_petal_background_right_end));
        cloverData.j(d(R.color.clover_petal_left_start));
        cloverData.c(d(R.color.clover_petal_left_end));
        cloverData.f(d(R.color.clover_petal_middle_start));
        cloverData.i(d(R.color.clover_petal_middle_end));
        cloverData.l(d(R.color.clover_petal_right_start));
        cloverData.n(d(R.color.clover_petal_right_end));
        cloverData.d(d(R.color.clover_petal_health_start));
        cloverData.a(d(R.color.clover_petal_health_end));
    }

    private int d(int i) {
        return ContextCompat.getColor(BaseApplication.b(), i);
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public qhx getCloverData() {
        return super.getCloverData();
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void setInvalid(boolean z) {
        super.setInvalid(z);
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void setContentsRunIcon(boolean z) {
        super.setContentsRunIcon(z);
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void setPlayRunAnimAnimator(boolean z) {
        super.setPlayRunAnimAnimator(z);
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void setPlayAllFrameAnimation(boolean z) {
        super.setPlayAllFrameAnimation(z);
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void setPlayEncourageAnimAnimator(boolean z) {
        super.setPlayEncourageAnimAnimator(z);
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void setAddFrameListener(AddFrameListener addFrameListener) {
        super.setAddFrameListener(addFrameListener);
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void e() {
        super.e();
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void a() {
        super.a();
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void e(float f) {
        super.e(f);
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void b() {
        super.b();
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void setValuesWithoutAnim(float f, float f2, float f3) {
        super.setValuesWithoutAnim(f, f2, f3);
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void setValuesWithAnim(float f, float f2, float f3) {
        super.setValuesWithAnim(f, f2, f3);
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void setCutValuesWithAnim(float f, float f2, float f3) {
        super.setCutValuesWithAnim(f, f2, f3);
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void a(float f, float f2, float f3) {
        super.a(f, f2, f3);
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void setMaxOutsideScale(float f) {
        super.setMaxOutsideScale(f);
    }

    @Override // com.huawei.ucd.cloveranimation.CloverView
    public void setDefaultOutsideScale() {
        super.setDefaultOutsideScale();
    }

    public void setClover(float f, float f2, float f3) {
        setContentsRunIcon(false);
        setPlayRunAnimAnimator(false);
        setPlayEncourageAnimAnimator(false);
        setValuesWithoutAnim(f, f2, f3);
    }

    public void setCloverWithIcon(float f, float f2, float f3) {
        setContentsRunIcon(true);
        setPlayRunAnimAnimator(false);
        setPlayEncourageAnimAnimator(false);
        setValuesWithoutAnim(f, f2, f3);
    }

    public void setCloverRunAnimator(float f, float f2, float f3) {
        setContentsRunIcon(true);
        setPlayRunAnimAnimator(false);
        setPlayEncourageAnimAnimator(false);
        setValuesWithAnim(f, f2, f3);
    }

    public void setCloverCutValuesWithAnim(float f, float f2, float f3) {
        setContentsRunIcon(true);
        setPlayRunAnimAnimator(false);
        setPlayEncourageAnimAnimator(false);
        setCutValuesWithAnim(f, f2, f3);
    }

    public void setCloverRunGrowAnimator(float f, float f2, float f3) {
        setContentsRunIcon(true);
        setPlayRunAnimAnimator(true);
        setPlayEncourageAnimAnimator(false);
        a(f, f2, f3);
    }
}
