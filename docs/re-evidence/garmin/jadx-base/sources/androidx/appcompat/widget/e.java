package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.g1;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5092a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u0 f5095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u0 f5096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u0 f5097f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5094c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f5093b = i.a();

    public e(View view2) {
        this.f5092a = view2;
    }

    public final void a() {
        View view2 = this.f5092a;
        Drawable background = view2.getBackground();
        if (background != null) {
            if (this.f5095d != null) {
                if (this.f5097f == null) {
                    this.f5097f = new u0();
                }
                u0 u0Var = this.f5097f;
                u0Var.f5248a = null;
                u0Var.f5251d = false;
                u0Var.f5249b = null;
                u0Var.f5250c = false;
                WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
                ColorStateList backgroundTintList = view2.getBackgroundTintList();
                if (backgroundTintList != null) {
                    u0Var.f5251d = true;
                    u0Var.f5248a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view2.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    u0Var.f5250c = true;
                    u0Var.f5249b = backgroundTintMode;
                }
                if (u0Var.f5251d || u0Var.f5250c) {
                    i.e(background, u0Var, view2.getDrawableState());
                    return;
                }
            }
            u0 u0Var2 = this.f5096e;
            if (u0Var2 != null) {
                i.e(background, u0Var2, view2.getDrawableState());
                return;
            }
            u0 u0Var3 = this.f5095d;
            if (u0Var3 != null) {
                i.e(background, u0Var3, view2.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        u0 u0Var = this.f5096e;
        if (u0Var != null) {
            return u0Var.f5248a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        u0 u0Var = this.f5096e;
        if (u0Var != null) {
            return u0Var.f5249b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i14) {
        ColorStateList colorStateListF;
        View view2 = this.f5092a;
        Context context = view2.getContext();
        int[] iArr = h.a.B;
        w0 w0VarG = w0.g(context, attributeSet, iArr, i14, 0);
        TypedArray typedArray = w0VarG.f5271b;
        View view3 = this.f5092a;
        androidx.core.view.s0.q(view3, view3.getContext(), iArr, attributeSet, w0VarG.f5271b, i14, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f5094c = typedArray.getResourceId(0, -1);
                i iVar = this.f5093b;
                Context context2 = view2.getContext();
                int i15 = this.f5094c;
                synchronized (iVar) {
                    colorStateListF = iVar.f5125a.f(i15, context2);
                }
                if (colorStateListF != null) {
                    g(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                view2.setBackgroundTintList(w0VarG.a(1));
            }
            if (typedArray.hasValue(2)) {
                view2.setBackgroundTintMode(c0.c(typedArray.getInt(2, -1), null));
            }
            w0VarG.h();
        } catch (Throwable th3) {
            w0VarG.h();
            throw th3;
        }
    }

    public final void e() {
        this.f5094c = -1;
        g(null);
        a();
    }

    public final void f(int i14) {
        ColorStateList colorStateListF;
        this.f5094c = i14;
        i iVar = this.f5093b;
        if (iVar != null) {
            Context context = this.f5092a.getContext();
            synchronized (iVar) {
                colorStateListF = iVar.f5125a.f(i14, context);
            }
        } else {
            colorStateListF = null;
        }
        g(colorStateListF);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f5095d == null) {
                this.f5095d = new u0();
            }
            u0 u0Var = this.f5095d;
            u0Var.f5248a = colorStateList;
            u0Var.f5251d = true;
        } else {
            this.f5095d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f5096e == null) {
            this.f5096e = new u0();
        }
        u0 u0Var = this.f5096e;
        u0Var.f5248a = colorStateList;
        u0Var.f5251d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f5096e == null) {
            this.f5096e = new u0();
        }
        u0 u0Var = this.f5096e;
        u0Var.f5249b = mode;
        u0Var.f5250c = true;
        a();
    }
}
