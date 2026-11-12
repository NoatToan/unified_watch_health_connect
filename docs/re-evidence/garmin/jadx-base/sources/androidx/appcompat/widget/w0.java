package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f5271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f5272c;

    private w0(Context context, TypedArray typedArray) {
        this.f5270a = context;
        this.f5271b = typedArray;
    }

    public static w0 e(Context context, int i14, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(i14, iArr));
    }

    public static w0 f(Context context, AttributeSet attributeSet, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static w0 g(Context context, AttributeSet attributeSet, int[] iArr, int i14, int i15) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i14, i15));
    }

    public final ColorStateList a(int i14) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = this.f5271b;
        return (!typedArray.hasValue(i14) || (resourceId = typedArray.getResourceId(i14, 0)) == 0 || (colorStateList = a7.b.getColorStateList(this.f5270a, resourceId)) == null) ? typedArray.getColorStateList(i14) : colorStateList;
    }

    public final Drawable b(int i14) {
        int resourceId;
        TypedArray typedArray = this.f5271b;
        return (!typedArray.hasValue(i14) || (resourceId = typedArray.getResourceId(i14, 0)) == 0) ? typedArray.getDrawable(i14) : j.a.a(this.f5270a, resourceId);
    }

    public final Drawable c(int i14) {
        int resourceId;
        Drawable drawableD;
        if (!this.f5271b.hasValue(i14) || (resourceId = this.f5271b.getResourceId(i14, 0)) == 0) {
            return null;
        }
        i iVarA = i.a();
        Context context = this.f5270a;
        synchronized (iVarA) {
            drawableD = iVarA.f5125a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public final Typeface d(int i14, int i15, w.a aVar) {
        int resourceId = this.f5271b.getResourceId(i14, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f5272c == null) {
            this.f5272c = new TypedValue();
        }
        TypedValue typedValue = this.f5272c;
        ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
        Context context = this.f5270a;
        if (context.isRestricted()) {
            return null;
        }
        return b7.g.b(context, resourceId, typedValue, i15, aVar, true, false);
    }

    public final void h() {
        this.f5271b.recycle();
    }
}
