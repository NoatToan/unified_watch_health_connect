package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.c;

/* JADX INFO: loaded from: classes5.dex */
public final class w93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f37739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f37740b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final r2m f;

    public w93(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, r2m r2mVar, Rect rect) {
        g6i.d(rect.left);
        g6i.d(rect.top);
        g6i.d(rect.right);
        g6i.d(rect.bottom);
        this.f37739a = rect;
        this.f37740b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = r2mVar;
    }

    public static w93 a(Context context, int i) {
        g6i.b(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, b4j.A4);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(b4j.B4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(b4j.D4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(b4j.C4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(b4j.E4, 0));
        ColorStateList colorStateListB = k8f.b(context, typedArrayObtainStyledAttributes, b4j.F4);
        ColorStateList colorStateListB2 = k8f.b(context, typedArrayObtainStyledAttributes, b4j.K4);
        ColorStateList colorStateListB3 = k8f.b(context, typedArrayObtainStyledAttributes, b4j.I4);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b4j.J4, 0);
        r2m r2mVarM = r2m.b(context, typedArrayObtainStyledAttributes.getResourceId(b4j.G4, 0), typedArrayObtainStyledAttributes.getResourceId(b4j.H4, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new w93(colorStateListB, colorStateListB2, colorStateListB3, dimensionPixelSize, r2mVarM, rect);
    }

    public int b() {
        return this.f37739a.bottom;
    }

    public int c() {
        return this.f37739a.top;
    }

    public void d(TextView textView) {
        l8f l8fVar = new l8f();
        l8f l8fVar2 = new l8f();
        l8fVar.setShapeAppearanceModel(this.f);
        l8fVar2.setShapeAppearanceModel(this.f);
        l8fVar.b0(this.c);
        l8fVar.k0(this.e, this.d);
        textView.setTextColor(this.f37740b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f37740b.withAlpha(30), l8fVar, l8fVar2);
        Rect rect = this.f37739a;
        c.v0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
