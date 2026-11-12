package od;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import nd.e;
import o13.q;
import o72.v3;
import p3.m2;
import p3.y3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m2<e> f131173a;

    static {
        Object bVar;
        try {
            int i14 = q.f128596b;
            ClassLoader classLoader = e.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
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
        m2<e> y3Var = (m2) (bVar instanceof q.b ? null : bVar);
        if (y3Var == null) {
            y3Var = new y3(new v3(28));
        }
        f131173a = y3Var;
    }
}
