package com.google.android.material.motion;

import android.animation.ValueAnimator;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.media3.ui.b;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.mapbox.maps.plugin.compass.CompassViewPlugin;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator;
import j1.t;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53214b;

    public /* synthetic */ a(Object obj, int i14) {
        this.f53213a = i14;
        this.f53214b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i14 = this.f53213a;
        Object obj = this.f53214b;
        switch (i14) {
            case 0:
                MaterialMainContainerBackHelper.lambda$createCornerAnimator$0((ClippableRoundedCornerLayout) obj, valueAnimator);
                break;
            case 1:
                DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0((DrawerLayout) obj, valueAnimator);
                break;
            case 2:
                CompassViewPlugin.lambda$2$lambda$1((CompassViewPlugin) obj, valueAnimator);
                break;
            case 3:
                PuckAnimator._init_$lambda$0((PuckAnimator) obj, valueAnimator);
                break;
            case 4:
                t tVar = (t) obj;
                int i15 = t.f96310d;
                tVar.getClass();
                ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                b bVar = (b) obj;
                int i16 = b.O0;
                bVar.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bVar.invalidate(bVar.f10011a);
                break;
        }
    }
}
