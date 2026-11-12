package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class fj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ct f34122c;
    private final AssetManager d;
    private final fv<String> i = new fv<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<fv<String>, Typeface> f34121b = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Typeface> f34120a = new HashMap();
    private String e = WatchFaceProvider.SVG_TTF;

    public fj(Drawable.Callback callback, ct ctVar) {
        this.f34122c = ctVar;
        if (!(callback instanceof View)) {
            iy.d("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        } else {
            this.d = ((View) callback).getContext().getAssets();
        }
    }

    public void a(ct ctVar) {
        this.f34122c = ctVar;
    }

    public void b(String str) {
        this.e = str;
    }

    public Typeface d(fs fsVar) {
        this.i.d(fsVar.e(), fsVar.d());
        Typeface typeface = this.f34121b.get(this.i);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceC = c(a(fsVar), fsVar.d());
        this.f34121b.put(this.i, typefaceC);
        return typefaceC;
    }

    private Typeface a(fs fsVar) {
        Typeface typefaceCreateFromAsset;
        String strE = fsVar.e();
        Typeface typeface = this.f34120a.get(strE);
        if (typeface != null) {
            return typeface;
        }
        String strD = fsVar.d();
        String strA = fsVar.a();
        ct ctVar = this.f34122c;
        if (ctVar != null) {
            typefaceCreateFromAsset = ctVar.e(strE, strD, strA);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.f34122c.e(strE);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        ct ctVar2 = this.f34122c;
        if (ctVar2 != null && typefaceCreateFromAsset == null) {
            String strA2 = ctVar2.a(strE, strD, strA);
            if (strA2 == null) {
                strA2 = this.f34122c.d(strE);
            }
            if (strA2 != null) {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.d, strA2);
            }
        }
        if (fsVar.c() != null) {
            return fsVar.c();
        }
        if (typefaceCreateFromAsset == null) {
            typefaceCreateFromAsset = Typeface.createFromAsset(this.d, "fonts/" + strE + this.e);
        }
        this.f34120a.put(strE, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    private Typeface c(Typeface typeface, String str) {
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
