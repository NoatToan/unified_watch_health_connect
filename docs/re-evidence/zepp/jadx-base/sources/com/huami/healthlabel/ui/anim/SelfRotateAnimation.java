package com.huami.healthlabel.ui.anim;

import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/huami/healthlabel/ui/anim/SelfRotateAnimation;", "Landroid/view/animation/RotateAnimation;", "", "fromDegrees", "toDegrees", "", "durationMillis", "", "repeatNumber", "<init>", "(FFJI)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class SelfRotateAnimation extends RotateAnimation {
    public SelfRotateAnimation() {
        this(0.0f, 0.0f, 0L, 0, 15, null);
    }

    public /* synthetic */ SelfRotateAnimation(float f, float f2, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 45.0f : f2, (i2 & 4) != 0 ? 200L : j, (i2 & 8) != 0 ? 0 : i);
    }

    public SelfRotateAnimation(float f, float f2, long j, int i) {
        super(f, f2, 1, 0.5f, 1, 0.5f);
        setDuration(j);
        setRepeatCount(i);
        setInterpolator(new LinearInterpolator());
        setFillAfter(true);
    }
}
