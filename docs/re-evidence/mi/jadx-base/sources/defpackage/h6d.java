package defpackage;

import android.media.ImageWriter;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public final class h6d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f19741a;

    static {
        try {
            Class cls = Integer.TYPE;
            f19741a = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException unused) {
        }
    }

    public static ImageWriter a(Surface surface, @IntRange(from = 1) int i, int i2) {
        try {
            return (ImageWriter) g6i.g(f19741a.invoke(null, surface, Integer.valueOf(i), Integer.valueOf(i2)));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", e);
        }
    }
}
