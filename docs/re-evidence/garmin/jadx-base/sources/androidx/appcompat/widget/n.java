package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f5178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u0 f5179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5180c = 0;

    public n(ImageView imageView) {
        this.f5178a = imageView;
    }

    public final void a() {
        u0 u0Var;
        ImageView imageView = this.f5178a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            c0.a(drawable);
        }
        if (drawable == null || (u0Var = this.f5179b) == null) {
            return;
        }
        i.e(drawable, u0Var, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i14) {
        int resourceId;
        ImageView imageView = this.f5178a;
        Context context = imageView.getContext();
        int[] iArr = h.a.f80426f;
        w0 w0VarG = w0.g(context, attributeSet, iArr, i14, 0);
        TypedArray typedArray = w0VarG.f5271b;
        ImageView imageView2 = this.f5178a;
        androidx.core.view.s0.q(imageView2, imageView2.getContext(), iArr, attributeSet, w0VarG.f5271b, i14, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = j.a.a(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                c0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(w0VarG.a(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(c0.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            w0VarG.h();
        }
    }

    public final void c(int i14) {
        ImageView imageView = this.f5178a;
        if (i14 != 0) {
            Drawable drawableA = j.a.a(imageView.getContext(), i14);
            if (drawableA != null) {
                c0.a(drawableA);
            }
            imageView.setImageDrawable(drawableA);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
