package com.huawei.uikit.hwcommon.anim;

import android.animation.Animator;
import android.content.res.ColorStateList;
import android.util.Pair;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes44.dex */
public class HwFocusColorGradientAnimListener implements HwGradientAnimatorMgr.OnAnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ColorStateList f29355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f29356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private UpdateColorCallback f29357c;
    private boolean d;
    private boolean e;
    private UpdateColorCallback f;
    private ColorStateList g;
    private UpdateColorCallback h;
    private boolean i;

    public interface UpdateColorCallback {
        void onEnd(ColorStateList colorStateList);

        void onStart();

        void onUpdate(int i);
    }

    private int c(int[] iArr, ColorStateList colorStateList) {
        if (colorStateList != null) {
            return colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        }
        return 0;
    }

    @Override // com.huawei.uikit.hwcommon.anim.HwGradientAnimatorMgr.OnAnimatorListener
    public void onAnimationCancel(Animator animator, String str) {
        onAnimationEnd(animator, str);
    }

    @Override // com.huawei.uikit.hwcommon.anim.HwGradientAnimatorMgr.OnAnimatorListener
    public void onAnimationEnd(Animator animator, String str) {
        UpdateColorCallback updateColorCallback;
        ColorStateList colorStateList;
        UpdateColorCallback updateColorCallback2;
        ColorStateList colorStateList2;
        if (this.d && "icon_color".equals(str) && (updateColorCallback2 = this.h) != null && (colorStateList2 = this.f29355a) != null) {
            updateColorCallback2.onEnd(colorStateList2);
        }
        if (this.i && "text_color".equals(str) && (updateColorCallback = this.f) != null && (colorStateList = this.g) != null) {
            updateColorCallback.onEnd(colorStateList);
        }
        if ("background_color".equals(str)) {
            ColorStateList backgroundTintList = this.f29356b.getBackgroundTintList();
            UpdateColorCallback updateColorCallback3 = this.f29357c;
            if (updateColorCallback3 == null || backgroundTintList == null) {
                return;
            }
            updateColorCallback3.onEnd(backgroundTintList);
        }
    }

    @Override // com.huawei.uikit.hwcommon.anim.HwGradientAnimatorMgr.OnAnimatorListener
    public void onAnimationStart(Animator animator, String str) {
        UpdateColorCallback updateColorCallback;
        UpdateColorCallback updateColorCallback2;
        UpdateColorCallback updateColorCallback3;
        if (this.d && "icon_color".equals(str) && (updateColorCallback3 = this.h) != null && this.f29355a != null) {
            updateColorCallback3.onStart();
        }
        if (this.i && "text_color".equals(str) && (updateColorCallback2 = this.f) != null && this.g != null) {
            updateColorCallback2.onStart();
        }
        if (!"background_color".equals(str) || (updateColorCallback = this.f29357c) == null) {
            return;
        }
        updateColorCallback.onStart();
    }

    @Override // com.huawei.uikit.hwcommon.anim.HwGradientAnimatorMgr.OnAnimatorListener
    public void onAnimationUpdate(Animator animator, String str, int i) {
        UpdateColorCallback updateColorCallback;
        UpdateColorCallback updateColorCallback2;
        if (this.d && "icon_color".equals(str) && (updateColorCallback2 = this.h) != null && this.f29355a != null) {
            updateColorCallback2.onUpdate(i);
        }
        if (this.i && "text_color".equals(str) && (updateColorCallback = this.f) != null && this.g != null) {
            updateColorCallback.onUpdate(i);
        }
        if ("background_color".equals(str)) {
            e(i);
        }
    }

    @Override // com.huawei.uikit.hwcommon.anim.HwGradientAnimatorMgr.OnAnimatorListener
    public boolean onPrepareAnimation(int[] iArr, int[] iArr2, int i, int i2, Map<String, Pair<Integer, Integer>> map) {
        int iC;
        int iC2;
        boolean z;
        int iC3;
        int iC4;
        boolean z2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!this.e) {
            return false;
        }
        boolean zD = d(iArr2);
        boolean zD2 = d(iArr);
        if ((!zD || zD2) && (zD || !zD2)) {
            e(i);
            return false;
        }
        boolean z3 = i != i2;
        if (!this.d || (colorStateList2 = this.f29355a) == null || this.h == null) {
            iC = 0;
            iC2 = 0;
            z = false;
        } else {
            iC = c(iArr2, colorStateList2);
            iC2 = c(iArr, this.f29355a);
            z = iC != iC2;
        }
        if (!this.i || (colorStateList = this.g) == null || this.f == null) {
            iC3 = 0;
            iC4 = 0;
            z2 = false;
        } else {
            iC4 = c(iArr2, colorStateList);
            iC3 = c(iArr, this.g);
            z2 = iC4 != iC3;
        }
        if (!z3 && !z && !z2) {
            e(i);
            return false;
        }
        if (z3) {
            map.put("background_color", new Pair<>(Integer.valueOf(i2), Integer.valueOf(i)));
        }
        if (z) {
            map.put("icon_color", new Pair<>(Integer.valueOf(iC), Integer.valueOf(iC2)));
        }
        if (z2) {
            map.put("text_color", new Pair<>(Integer.valueOf(iC4), Integer.valueOf(iC3)));
        }
        return true;
    }

    private boolean d(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842908) {
                z = true;
            }
            if (i == 16842909) {
                z2 = true;
            }
        }
        return z && z2;
    }

    private void e(int i) {
        UpdateColorCallback updateColorCallback = this.f29357c;
        if (updateColorCallback == null) {
            this.f29356b.getBackground().setTint(i);
        } else {
            updateColorCallback.onUpdate(i);
        }
        this.f29356b.invalidate();
    }
}
