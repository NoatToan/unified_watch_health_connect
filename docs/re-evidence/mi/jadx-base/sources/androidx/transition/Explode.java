package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import defpackage.d0q;
import defpackage.ww3;
import defpackage.ypi;

/* JADX INFO: loaded from: classes.dex */
public class Explode extends Visibility {
    public static final TimeInterpolator M = new DecelerateInterpolator();
    public static final TimeInterpolator N = new AccelerateInterpolator();
    public int[] L;

    public Explode() {
        this.L = new int[2];
        g0(new ww3());
    }

    private void k0(d0q d0qVar) {
        View view = d0qVar.f14938b;
        view.getLocationOnScreen(this.L);
        int[] iArr = this.L;
        int i = iArr[0];
        int i2 = iArr[1];
        d0qVar.f14937a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    public static float t0(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public static float u0(View view, int i, int i2) {
        return t0(Math.max(i, view.getWidth() - i), Math.max(i2, view.getHeight() - i2));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void g(d0q d0qVar) {
        super.g(d0qVar);
        k0(d0qVar);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void j(d0q d0qVar) {
        super.j(d0qVar);
        k0(d0qVar);
    }

    @Override // androidx.transition.Visibility
    public Animator p0(ViewGroup viewGroup, View view, d0q d0qVar, d0q d0qVar2) {
        if (d0qVar2 == null) {
            return null;
        }
        Rect rect = (Rect) d0qVar2.f14937a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        v0(viewGroup, rect, this.L);
        int[] iArr = this.L;
        return e.a(view, d0qVar2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, M, this);
    }

    @Override // androidx.transition.Visibility
    public Animator r0(ViewGroup viewGroup, View view, d0q d0qVar, d0q d0qVar2) {
        float f;
        float f2;
        if (d0qVar == null) {
            return null;
        }
        Rect rect = (Rect) d0qVar.f14937a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) d0qVar.f14938b.getTag(ypi.f);
        if (iArr != null) {
            int i3 = iArr[0];
            f = (i3 - rect.left) + translationX;
            int i4 = iArr[1];
            f2 = (i4 - rect.top) + translationY;
            rect.offsetTo(i3, i4);
        } else {
            f = translationX;
            f2 = translationY;
        }
        v0(viewGroup, rect, this.L);
        int[] iArr2 = this.L;
        return e.a(view, d0qVar, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], N, this);
    }

    public final void v0(View view, Rect rect, int[] iArr) {
        int iCenterY;
        int width;
        view.getLocationOnScreen(this.L);
        int[] iArr2 = this.L;
        int i = iArr2[0];
        int i2 = iArr2[1];
        Rect rectT = t();
        if (rectT == null) {
            width = (view.getWidth() / 2) + i + Math.round(view.getTranslationX());
            iCenterY = (view.getHeight() / 2) + i2 + Math.round(view.getTranslationY());
        } else {
            int iCenterX = rectT.centerX();
            iCenterY = rectT.centerY();
            width = iCenterX;
        }
        float fCenterX = rect.centerX() - width;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fT0 = t0(fCenterX, fCenterY);
        float fU0 = u0(view, width - i, iCenterY - i2);
        iArr[0] = Math.round((fCenterX / fT0) * fU0);
        iArr[1] = Math.round(fU0 * (fCenterY / fT0));
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = new int[2];
        g0(new ww3());
    }
}
