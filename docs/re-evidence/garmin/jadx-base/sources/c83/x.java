package c83;

import android.annotation.TargetApi;
import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes11.dex */
public class x {

    @TargetApi(24)
    @IgnoreJRERequirement
    public static final class a extends x {
        @Override // c83.x
        public final Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return j.a(method, cls, obj, objArr);
        }

        @Override // c83.x
        public final boolean c(Method method) {
            return method.isDefault();
        }
    }

    @IgnoreJRERequirement
    public static class b extends x {
        @Override // c83.x
        public final String a(Method method, int i14) {
            Parameter parameter = method.getParameters()[i14];
            if (!parameter.isNamePresent()) {
                return super.a(method, i14);
            }
            return "parameter '" + parameter.getName() + CoreConstants.SINGLE_QUOTE_CHAR;
        }

        @Override // c83.x
        public final Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
            return j.a(method, cls, obj, objArr);
        }

        @Override // c83.x
        public final boolean c(Method method) {
            return method.isDefault();
        }
    }

    public String a(Method method, int i14) {
        return "parameter #" + (i14 + 1);
    }

    public Object b(Method method, Class<?> cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean c(Method method) {
        return false;
    }
}
