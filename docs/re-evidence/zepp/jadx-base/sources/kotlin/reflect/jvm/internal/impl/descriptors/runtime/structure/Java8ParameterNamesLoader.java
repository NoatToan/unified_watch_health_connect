package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
final class Java8ParameterNamesLoader {

    @NotNull
    public static final Java8ParameterNamesLoader a = new Java8ParameterNamesLoader();

    @Nullable
    private static Cache b;

    public static final class Cache {

        @Nullable
        private final Method a;

        @Nullable
        private final Method b;

        public Cache(@Nullable Method method, @Nullable Method method2) {
            this.a = method;
            this.b = method2;
        }

        @Nullable
        public final Method getGetName() {
            return this.b;
        }

        @Nullable
        public final Method getGetParameters() {
            return this.a;
        }
    }

    private Java8ParameterNamesLoader() {
    }

    @NotNull
    public final Cache a(@NotNull Member member) {
        Class<?> cls = member.getClass();
        try {
            return new Cache(cls.getMethod("getParameters", new Class[0]), ReflectClassUtilKt.getSafeClassLoader(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    @Nullable
    public final List<String> b(@NotNull Member member) throws IllegalAccessException, InvocationTargetException {
        Method getName;
        Cache cacheA = b;
        if (cacheA == null) {
            cacheA = a(member);
            b = cacheA;
        }
        Method getParameters = cacheA.getGetParameters();
        if (getParameters == null || (getName = cacheA.getGetName()) == null) {
            return null;
        }
        Object objInvoke = getParameters.invoke(member, new Object[0]);
        Objects.requireNonNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = getName.invoke(obj, new Object[0]);
            Objects.requireNonNull(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
