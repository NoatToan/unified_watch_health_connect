package s9;

import androidx.lifecycle.n0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import o13.q;
import p3.m2;
import p3.y3;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m2<n0> f158018a;

    static {
        Object bVar;
        try {
            int i14 = q.f128596b;
            ClassLoader classLoader = n0.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof m2) {
                        bVar = (m2) objInvoke;
                        break;
                    }
                } else if (!(annotations[i15] instanceof o13.e)) {
                    i15++;
                }
                bVar = null;
                break;
            }
        } catch (Throwable th3) {
            int i16 = q.f128596b;
            bVar = new q.b(th3);
        }
        int i17 = q.f128596b;
        m2<n0> y3Var = (m2) (bVar instanceof q.b ? null : bVar);
        if (y3Var == null) {
            y3Var = new y3(new ro0.h(27));
        }
        f158018a = y3Var;
    }
}
