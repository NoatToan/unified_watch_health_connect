package c7;

import android.graphics.Typeface;
import com.google.android.exoplayer2.C;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class k extends j {
    @Override // c7.j
    public final Typeface k(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f25206g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f25212m.invoke(null, objNewInstance, C.SANS_SERIF_NAME, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            o2.c.p(e4);
            return null;
        }
    }

    @Override // c7.j
    public final Method n(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
