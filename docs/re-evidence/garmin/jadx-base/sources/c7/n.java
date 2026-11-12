package c7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.google.firebase.perf.util.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public final ConcurrentHashMap<Long, b7.e.b> f25213a = new ConcurrentHashMap<>();

    public class a implements b<i7.l> {
        public a(n nVar) {
        }

        @Override // c7.n.b
        public final int a(i7.l lVar) {
            return lVar.f91939c;
        }

        @Override // c7.n.b
        public final boolean b(i7.l lVar) {
            return lVar.f91940d;
        }
    }

    public interface b<T> {
        int a(T t7);

        boolean b(T t7);
    }

    public static <T> T f(T[] tArr, int i14, b<T> bVar) {
        int i15 = (i14 & 1) == 0 ? 400 : Constants.FROZEN_FRAME_TIME;
        boolean z14 = (i14 & 2) != 0;
        T t7 = null;
        int i16 = Integer.MAX_VALUE;
        for (T t14 : tArr) {
            int iAbs = (Math.abs(bVar.a(t14) - i15) * 2) + (bVar.b(t14) == z14 ? 0 : 1);
            if (t7 == null || i16 > iAbs) {
                t7 = t14;
                i16 = iAbs;
            }
        }
        return t7;
    }

    public Typeface a(Context context, b7.e.b bVar, Resources resources, int i14) {
        long jLongValue;
        b7.e.c cVar = (b7.e.c) f(bVar.f16242a, i14, new o(this));
        if (cVar == null) {
            return null;
        }
        int i15 = cVar.f16248f;
        String str = cVar.f16243a;
        Typeface typefaceE = h.f25197a.e(context, resources, i15, str, i14);
        if (typefaceE != null) {
            h.f25198b.put(h.b(resources, i15, str, 0, i14), typefaceE);
        }
        if (typefaceE == null) {
            jLongValue = 0;
        } else {
            try {
                Field declaredField = Typeface.class.getDeclaredField("native_instance");
                declaredField.setAccessible(true);
                jLongValue = ((Number) declaredField.get(typefaceE)).longValue();
            } catch (IllegalAccessException | NoSuchFieldException unused) {
                jLongValue = 0;
            }
        }
        if (jLongValue != 0) {
            this.f25213a.put(Long.valueOf(jLongValue), bVar);
        }
        return typefaceE;
    }

    public Typeface b(Context context, i7.l[] lVarArr, int i14) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (lVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(g(i14, lVarArr).f91937a);
            try {
                Typeface typefaceD = d(context, inputStreamOpenInputStream);
                p.a(inputStreamOpenInputStream);
                return typefaceD;
            } catch (IOException unused) {
                p.a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th3) {
                th = th3;
                inputStream = inputStreamOpenInputStream;
                p.a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public Typeface c(Context context, List list, int i14) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File fileC = p.c(context);
        if (fileC == null) {
            return null;
        }
        try {
            if (p.b(inputStream, fileC)) {
                return Typeface.createFromFile(fileC.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileC.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i14, String str, int i15) {
        InputStream inputStreamOpenRawResource;
        File fileC = p.c(context);
        try {
            if (fileC == null) {
                return null;
            }
            try {
                inputStreamOpenRawResource = resources.openRawResource(i14);
                try {
                    boolean zB = p.b(inputStreamOpenRawResource, fileC);
                    p.a(inputStreamOpenRawResource);
                    if (!zB) {
                        fileC.delete();
                        return null;
                    }
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(fileC.getPath());
                    fileC.delete();
                    return typefaceCreateFromFile;
                } catch (Throwable th3) {
                    th = th3;
                    p.a(inputStreamOpenRawResource);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStreamOpenRawResource = null;
            }
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileC.delete();
        }
    }

    public i7.l g(int i14, i7.l[] lVarArr) {
        return (i7.l) f(lVarArr, i14, new a(this));
    }
}
