package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.l1;
import androidx.core.view.m1;
import com.google.android.material.animation.AnimationUtils;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
class InsetsAnimationCallback extends l1.b {
    private int startTranslationY;
    private int startY;
    private final int[] tmpLocation;

    /* JADX INFO: renamed from: view, reason: collision with root package name */
    private final View f53166view;

    public InsetsAnimationCallback(View view2) {
        super(0);
        this.tmpLocation = new int[2];
        this.f53166view = view2;
    }

    @Override // androidx.core.view.l1.b
    public void onEnd(l1 l1Var) {
        this.f53166view.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.l1.b
    public void onPrepare(l1 l1Var) {
        this.f53166view.getLocationOnScreen(this.tmpLocation);
        this.startY = this.tmpLocation[1];
    }

    @Override // androidx.core.view.l1.b
    public m1 onProgress(m1 m1Var, List<l1> list) {
        for (l1 l1Var : list) {
            if ((l1Var.f6472a.d() & 8) != 0) {
                this.f53166view.setTranslationY(AnimationUtils.lerp(this.startTranslationY, 0, l1Var.f6472a.c()));
                break;
            }
        }
        return m1Var;
    }

    @Override // androidx.core.view.l1.b
    public l1.a onStart(l1 l1Var, l1.a aVar) {
        this.f53166view.getLocationOnScreen(this.tmpLocation);
        int i14 = this.startY - this.tmpLocation[1];
        this.startTranslationY = i14;
        this.f53166view.setTranslationY(i14);
        return aVar;
    }
}
