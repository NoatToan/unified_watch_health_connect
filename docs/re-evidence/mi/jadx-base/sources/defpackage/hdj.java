package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class hdj {
    public static final String[] c = {"", "_bold", "_italic", "_bold_italic"};
    public static final String[] d = {".ttf", ".otf"};
    public static hdj e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, b> f19954a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Typeface> f19955b = new HashMap();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray<Typeface> f19956a;

        public Typeface a(int i) {
            return this.f19956a.get(i);
        }

        public void b(int i, Typeface typeface) {
            this.f19956a.put(i, typeface);
        }

        public b() {
            this.f19956a = new SparseArray<>(4);
        }
    }

    public static Typeface a(String str, int i, AssetManager assetManager) {
        String str2 = c[i];
        for (String str3 : d) {
            try {
                return Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
            } catch (RuntimeException unused) {
                if (i77.b().c(str)) {
                    String strA = i77.b().a(str + str3);
                    if (TextUtils.isEmpty(strA)) {
                        continue;
                    } else {
                        try {
                            return Typeface.create(Typeface.createFromFile(strA), i);
                        } catch (RuntimeException unused2) {
                            continue;
                        }
                    }
                }
            }
        }
        return Typeface.create(str, i);
    }

    public static hdj b() {
        if (e == null) {
            e = new hdj();
        }
        return e;
    }

    public Typeface c(String str, int i, int i2, AssetManager assetManager) {
        if (this.f19955b.containsKey(str)) {
            Typeface typeface = this.f19955b.get(str);
            if (Build.VERSION.SDK_INT < 28 || i2 < 100 || i2 > 1000) {
                return Typeface.create(typeface, i);
            }
            return Typeface.create(typeface, i2, (i & 2) != 0);
        }
        b bVar = this.f19954a.get(str);
        if (bVar == null) {
            bVar = new b();
            this.f19954a.put(str, bVar);
        }
        Typeface typefaceA = bVar.a(i);
        if (typefaceA == null && (typefaceA = a(str, i, assetManager)) != null) {
            bVar.b(i, typefaceA);
        }
        return typefaceA;
    }

    public Typeface d(String str, int i, AssetManager assetManager) {
        return c(str, i, 0, assetManager);
    }
}
