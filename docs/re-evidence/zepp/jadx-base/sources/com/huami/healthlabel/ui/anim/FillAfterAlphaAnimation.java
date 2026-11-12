package com.huami.healthlabel.ui.anim;

import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/huami/healthlabel/ui/anim/FillAfterAlphaAnimation;", "Landroid/view/animation/AlphaAnimation;", "", "fromAlpha", "toAlpha", "", "durationMillis", "<init>", "(FFJ)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class FillAfterAlphaAnimation extends AlphaAnimation {
    public FillAfterAlphaAnimation() {
        this(0.0f, 0.0f, 0L, 7, null);
    }

    public /* synthetic */ FillAfterAlphaAnimation(float f, float f2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 1.0f : f2, (i & 4) != 0 ? 200L : j);
    }

    public FillAfterAlphaAnimation(float f, float f2, long j) {
        super(f, f2);
        setInterpolator(new LinearInterpolator());
        setDuration(j);
        setFillAfter(true);
    }
}
