package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class wfp extends mrk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f37928b;

    public wfp(Context context, Resources resources) {
        super(resources);
        this.f37928b = new WeakReference<>(context);
    }

    @Override // defpackage.mrk, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawableA = a(i);
        Context context = this.f37928b.get();
        if (drawableA != null && context != null) {
            crk.g().w(context, i, drawableA);
        }
        return drawableA;
    }
}
