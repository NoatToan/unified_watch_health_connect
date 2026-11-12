package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class xfp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f39083b;
    public TypedValue c;

    public xfp(Context context, TypedArray typedArray) {
        this.f39082a = context;
        this.f39083b = typedArray;
    }

    public static xfp t(Context context, int i, int[] iArr) {
        return new xfp(context, context.obtainStyledAttributes(i, iArr));
    }

    public static xfp u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new xfp(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static xfp v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new xfp(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public boolean a(int i, boolean z) {
        return this.f39083b.getBoolean(i, z);
    }

    public int b(int i, int i2) {
        return this.f39083b.getColor(i, i2);
    }

    public ColorStateList c(int i) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f39083b.hasValue(i) || (resourceId = this.f39083b.getResourceId(i, 0)) == 0 || (colorStateListA = of1.a(this.f39082a, resourceId)) == null) ? this.f39083b.getColorStateList(i) : colorStateListA;
    }

    public float d(int i, float f) {
        return this.f39083b.getDimension(i, f);
    }

    public int e(int i, int i2) {
        return this.f39083b.getDimensionPixelOffset(i, i2);
    }

    public int f(int i, int i2) {
        return this.f39083b.getDimensionPixelSize(i, i2);
    }

    public Drawable g(int i) {
        int resourceId;
        return (!this.f39083b.hasValue(i) || (resourceId = this.f39083b.getResourceId(i, 0)) == 0) ? this.f39083b.getDrawable(i) : of1.b(this.f39082a, resourceId);
    }

    public Drawable h(int i) {
        int resourceId;
        if (!this.f39083b.hasValue(i) || (resourceId = this.f39083b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return jf1.b().d(this.f39082a, resourceId, true);
    }

    public float i(int i, float f) {
        return this.f39083b.getFloat(i, f);
    }

    public Typeface j(int i, int i2, jrk.e eVar) {
        int resourceId = this.f39083b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return jrk.i(this.f39082a, resourceId, this.c, i2, eVar);
    }

    public int k(int i, int i2) {
        return this.f39083b.getInt(i, i2);
    }

    public int l(int i, int i2) {
        return this.f39083b.getInteger(i, i2);
    }

    public int m(int i, int i2) {
        return this.f39083b.getLayoutDimension(i, i2);
    }

    public int n(int i, int i2) {
        return this.f39083b.getResourceId(i, i2);
    }

    public String o(int i) {
        return this.f39083b.getString(i);
    }

    public CharSequence p(int i) {
        return this.f39083b.getText(i);
    }

    public CharSequence[] q(int i) {
        return this.f39083b.getTextArray(i);
    }

    public TypedArray r() {
        return this.f39083b;
    }

    public boolean s(int i) {
        return this.f39083b.hasValue(i);
    }

    public void w() {
        this.f39083b.recycle();
    }
}
