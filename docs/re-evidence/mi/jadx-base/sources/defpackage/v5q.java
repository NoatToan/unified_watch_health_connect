package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class v5q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, h0a.c> f36511a = new ConcurrentHashMap<>();

    public class a implements b<j0a.b> {
        public a() {
        }

        @Override // v5q.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(j0a.b bVar) {
            return bVar.e();
        }

        @Override // v5q.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(j0a.b bVar) {
            return bVar.f();
        }
    }

    public interface b<T> {
        int a(T t);

        boolean b(T t);
    }

    public static <T> T d(T[] tArr, int i, b<T> bVar) {
        return (T) e(tArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, bVar);
    }

    public static <T> T e(T[] tArr, int i, boolean z, b<T> bVar) {
        T t = null;
        int i2 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(bVar.a(t2) - i) * 2) + (bVar.b(t2) == z ? 0 : 1);
            if (t == null || i2 > iAbs) {
                t = t2;
                i2 = iAbs;
            }
        }
        return t;
    }

    public Typeface a(Context context, h0a.c cVar, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, j0a.b[] bVarArr, int i) {
        throw null;
    }

    public Typeface c(Context context, Resources resources, int i, String str, int i2) {
        File fileD = w5q.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (w5q.b(fileD, resources, i)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public j0a.b f(j0a.b[] bVarArr, int i) {
        return (j0a.b) d(bVarArr, i, new a());
    }
}
