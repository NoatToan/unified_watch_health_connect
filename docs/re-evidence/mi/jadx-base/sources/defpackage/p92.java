package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class p92 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExtendedFloatingActionButton f30142b;
    public final ArrayList<Animator.AnimatorListener> c = new ArrayList<>();
    public final ad1 d;
    public u8g e;
    public u8g f;

    public class a extends Property<ExtendedFloatingActionButton, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(wc1.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.G.getColorForState(extendedFloatingActionButton.getDrawableState(), p92.this.f30142b.G.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.G.getColorForState(extendedFloatingActionButton.getDrawableState(), p92.this.f30142b.G.getDefaultColor());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (wc1.a(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.B(extendedFloatingActionButton.G);
            } else {
                extendedFloatingActionButton.B(colorStateListValueOf);
            }
        }
    }

    public p92(ExtendedFloatingActionButton extendedFloatingActionButton, ad1 ad1Var) {
        this.f30142b = extendedFloatingActionButton;
        this.f30141a = extendedFloatingActionButton.getContext();
        this.d = ad1Var;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public u8g a() {
        return this.f;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void c(u8g u8gVar) {
        this.f = u8gVar;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public AnimatorSet e() {
        return k(l());
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void h() {
        this.d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final List<Animator.AnimatorListener> i() {
        return this.c;
    }

    public AnimatorSet k(u8g u8gVar) {
        ArrayList arrayList = new ArrayList();
        if (u8gVar.j("opacity")) {
            arrayList.add(u8gVar.f("opacity", this.f30142b, View.ALPHA));
        }
        if (u8gVar.j("scale")) {
            arrayList.add(u8gVar.f("scale", this.f30142b, View.SCALE_Y));
            arrayList.add(u8gVar.f("scale", this.f30142b, View.SCALE_X));
        }
        if (u8gVar.j("width")) {
            arrayList.add(u8gVar.f("width", this.f30142b, ExtendedFloatingActionButton.I));
        }
        if (u8gVar.j("height")) {
            arrayList.add(u8gVar.f("height", this.f30142b, ExtendedFloatingActionButton.J));
        }
        if (u8gVar.j("paddingStart")) {
            arrayList.add(u8gVar.f("paddingStart", this.f30142b, ExtendedFloatingActionButton.K));
        }
        if (u8gVar.j("paddingEnd")) {
            arrayList.add(u8gVar.f("paddingEnd", this.f30142b, ExtendedFloatingActionButton.L));
        }
        if (u8gVar.j("labelOpacity")) {
            arrayList.add(u8gVar.f("labelOpacity", this.f30142b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        zc1.a(animatorSet, arrayList);
        return animatorSet;
    }

    public final u8g l() {
        u8g u8gVar = this.f;
        if (u8gVar != null) {
            return u8gVar;
        }
        if (this.e == null) {
            this.e = u8g.d(this.f30141a, d());
        }
        return (u8g) g6i.g(this.e);
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void onAnimationEnd() {
        this.d.b();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public void onAnimationStart(Animator animator) {
        this.d.c(animator);
    }
}
