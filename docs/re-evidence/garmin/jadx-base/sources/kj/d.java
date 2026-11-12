package kj;

import android.content.Context;
import i3.e5;
import java.lang.reflect.InvocationTargetException;
import kg.f;
import n23.j;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f104929a;

    public d(Context context) {
        this.f104929a = context;
    }

    public static b a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof b) {
                    return (b) objNewInstance;
                }
                f.n(e5.f(objNewInstance, "Expected instanceof GlideModule, but found: "));
                return null;
            } catch (IllegalAccessException e4) {
                b(cls, e4);
                throw null;
            } catch (InstantiationException e14) {
                b(cls, e14);
                throw null;
            } catch (NoSuchMethodException e15) {
                b(cls, e15);
                throw null;
            } catch (InvocationTargetException e16) {
                b(cls, e16);
                throw null;
            }
        } catch (ClassNotFoundException e17) {
            j.w("Unable to find GlideModule implementation", e17);
            return null;
        }
    }

    public static void b(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(androidx.core.view.j.h(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }
}
