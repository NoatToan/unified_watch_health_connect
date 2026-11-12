package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;

/* JADX INFO: loaded from: classes.dex */
public class q5q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v5q f31146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LruCache<String, Typeface> f31147b;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class a extends j0a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public jrk.e f31148a;

        public a(jrk.e eVar) {
            this.f31148a = eVar;
        }

        @Override // j0a.c
        public void a(int i) {
            jrk.e eVar = this.f31148a;
            if (eVar != null) {
                eVar.f(i);
            }
        }

        @Override // j0a.c
        public void b(Typeface typeface) {
            jrk.e eVar = this.f31148a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f31146a = new u5q();
        } else if (i >= 28) {
            f31146a = new t5q();
        } else {
            f31146a = new s5q();
        }
        f31147b = new LruCache<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Typeface b(Context context, CancellationSignal cancellationSignal, j0a.b[] bVarArr, int i) {
        return f31146a.b(context, cancellationSignal, bVarArr, i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface c(Context context, h0a.b bVar, Resources resources, int i, String str, int i2, int i3, jrk.e eVar, Handler handler, boolean z) {
        Typeface typefaceA;
        if (bVar instanceof h0a.e) {
            h0a.e eVar2 = (h0a.e) bVar;
            Typeface typefaceG = g(eVar2.c());
            if (typefaceG != null) {
                if (eVar != null) {
                    eVar.d(typefaceG, handler);
                }
                return typefaceG;
            }
            typefaceA = j0a.c(context, eVar2.b(), i3, !z ? eVar != null : eVar2.a() != 0, z ? eVar2.d() : -1, jrk.e.e(handler), new a(eVar));
        } else {
            typefaceA = f31146a.a(context, (h0a.c) bVar, resources, i3);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f31147b.put(e(resources, i, str, i2, i3), typefaceA);
        }
        return typefaceA;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceC = f31146a.c(context, resources, i, str, i3);
        if (typefaceC != null) {
            f31147b.put(e(resources, i, str, i2, i3), typefaceC);
        }
        return typefaceC;
    }

    public static String e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static Typeface f(Resources resources, int i, String str, int i2, int i3) {
        return f31147b.get(e(resources, i, str, i2, i3));
    }

    public static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
