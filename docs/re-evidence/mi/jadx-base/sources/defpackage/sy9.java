package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(21)
public class sy9 extends com.google.android.material.floatingactionbutton.a {

    public static class a extends l8f {
        public a(r2m r2mVar) {
            super(r2mVar);
        }

        @Override // defpackage.l8f, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public sy9(FloatingActionButton floatingActionButton, p2m p2mVar) {
        super(floatingActionButton, p2mVar);
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void B() {
        e0();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void D(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void E(float f, float f2, float f3) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.E, i0(f, f3));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.F, i0(f, f2));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.G, i0(f, f2));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.H, i0(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.w, BizTypeConstants.ELEVATION, f).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.D);
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.I, animatorSet);
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.J, i0(0.0f, 0.0f));
        this.w.setStateListAnimator(stateListAnimator);
        if (Y()) {
            e0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public boolean J() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void U(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(auk.d(colorStateList));
        } else {
            super.U(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public boolean Y() {
        return this.x.b() || !a0();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void c0() {
    }

    public u43 h0(int i, ColorStateList colorStateList) {
        Context context = this.w.getContext();
        u43 u43Var = new u43((r2m) g6i.g(this.f8718a));
        u43Var.e(ni4.c(context, xki.f), ni4.c(context, xki.e), ni4.c(context, xki.c), ni4.c(context, xki.d));
        u43Var.d(i);
        u43Var.c(colorStateList);
        return u43Var;
    }

    public final Animator i0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.w, BizTypeConstants.ELEVATION, f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.w, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.D);
        return animatorSet;
    }

    public l8f j0() {
        return new a((r2m) g6i.g(this.f8718a));
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public float m() {
        return this.w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void r(Rect rect) {
        if (this.x.b()) {
            super.r(rect);
        } else if (a0()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f8720k - this.w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        l8f l8fVarJ0 = j0();
        this.f8719b = l8fVarJ0;
        l8fVarJ0.setTintList(colorStateList);
        if (mode != null) {
            this.f8719b.setTintMode(mode);
        }
        this.f8719b.Q(this.w.getContext());
        if (i > 0) {
            this.d = h0(i, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) g6i.g(this.d), (Drawable) g6i.g(this.f8719b)});
        } else {
            this.d = null;
            layerDrawable = this.f8719b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(auk.d(colorStateList2), layerDrawable, null);
        this.c = rippleDrawable;
        this.e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public void z() {
    }
}
