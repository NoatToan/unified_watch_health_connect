package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class b {

    @NotNull
    public static final b a = new b();

    private b() {
    }

    @NotNull
    public final String a(@NotNull Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        int i = 0;
        while (i < length) {
            Class<?> cls = parameterTypes[i];
            i++;
            sb.append(ReflectClassUtilKt.getDesc(cls));
        }
        sb.append(")V");
        return sb.toString();
    }

    @NotNull
    public final String b(@NotNull Field field) {
        return ReflectClassUtilKt.getDesc(field.getType());
    }

    @NotNull
    public final String c(@NotNull Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        int i = 0;
        while (i < length) {
            Class<?> cls = parameterTypes[i];
            i++;
            sb.append(ReflectClassUtilKt.getDesc(cls));
        }
        sb.append(")");
        sb.append(ReflectClassUtilKt.getDesc(method.getReturnType()));
        return sb.toString();
    }
}
