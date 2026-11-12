package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class r5q extends v5q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class<?> f32218b = null;
    public static Constructor<?> c = null;
    public static Method d = null;
    public static Method e = null;
    public static boolean f = false;

    public static boolean g(Object obj, String str, int i, boolean z) {
        i();
        try {
            return ((Boolean) d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Typeface h(Object obj) {
        i();
        try {
            Object objNewInstance = Array.newInstance(f32218b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void i() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f) {
            return;
        }
        f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        c = constructor;
        f32218b = cls;
        d = method2;
        e = method;
    }

    private static Object j() {
        i();
        try {
            return c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.v5q
    public Typeface a(Context context, h0a.c cVar, Resources resources, int i) {
        Object objJ = j();
        for (h0a.d dVar : cVar.a()) {
            File fileD = w5q.d(context);
            if (fileD == null) {
                return null;
            }
            try {
                if (!w5q.b(fileD, resources, dVar.b())) {
                    return null;
                }
                if (!g(objJ, fileD.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                fileD.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileD.delete();
            }
        }
        return h(objJ);
    }
}
