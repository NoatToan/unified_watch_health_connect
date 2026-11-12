package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class b1 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5036c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f5037b;

    public b1(Context context, Resources resources) {
        super(resources);
        this.f5037b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.m0, android.content.res.Resources
    public final Drawable getDrawable(int i14) {
        Context context = this.f5037b.get();
        if (context == null) {
            return a(i14);
        }
        l0 l0VarB = l0.b();
        synchronized (l0VarB) {
            Drawable drawableA = a(i14);
            if (drawableA == null) {
                return null;
            }
            return l0VarB.g(context, i14, false, drawableA);
        }
    }
}
