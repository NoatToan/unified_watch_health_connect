package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class uz9 {
    public final AssetManager d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ndg<String> f36305a = new ndg<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<ndg<String>, Typeface> f36306b = new HashMap();
    public final Map<String, Typeface> c = new HashMap();
    public String e = ".ttf";

    public uz9(Drawable.Callback callback, tz9 tz9Var) {
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            rpe.c("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }

    public final Typeface a(sz9 sz9Var) {
        String strA = sz9Var.a();
        Typeface typeface = this.c.get(strA);
        if (typeface != null) {
            return typeface;
        }
        sz9Var.c();
        sz9Var.b();
        if (sz9Var.d() != null) {
            return sz9Var.d();
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.d, "fonts/" + strA + this.e);
        this.c.put(strA, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public Typeface b(sz9 sz9Var) {
        this.f36305a.b(sz9Var.a(), sz9Var.c());
        Typeface typeface = this.f36306b.get(this.f36305a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(sz9Var), sz9Var.c());
        this.f36306b.put(this.f36305a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.e = str;
    }

    public void d(tz9 tz9Var) {
    }

    public final Typeface e(Typeface typeface, String str) {
        int i;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i = 3;
        } else if (zContains) {
            i = 2;
        } else {
            i = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
