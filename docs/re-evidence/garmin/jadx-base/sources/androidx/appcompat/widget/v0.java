package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class v0 extends m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f5252b;

    public v0(Context context, Resources resources) {
        super(resources);
        this.f5252b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.m0, android.content.res.Resources
    public final Drawable getDrawable(int i14) {
        Drawable drawableA = a(i14);
        Context context = this.f5252b.get();
        if (drawableA != null && context != null) {
            l0.b().h(i14, context, drawableA);
        }
        return drawableA;
    }
}
