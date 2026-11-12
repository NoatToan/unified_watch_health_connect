package z23;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f202064a;

    public n(t tVar) {
        this.f202064a = tVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean zEquals;
        Method method = (Method) obj;
        boolean z14 = false;
        if (!method.isSynthetic()) {
            if (this.f202064a.f202070a.isEnum()) {
                String name = method.getName();
                if (p005kotlin.jvm.internal.s.g(name, "values")) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 0) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                } else if (p005kotlin.jvm.internal.s.g(name, CoreConstants.VALUE_OF)) {
                    zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                } else {
                    zEquals = false;
                }
                if (!zEquals) {
                    z14 = true;
                }
            } else {
                z14 = true;
            }
        }
        return Boolean.valueOf(z14);
    }
}
