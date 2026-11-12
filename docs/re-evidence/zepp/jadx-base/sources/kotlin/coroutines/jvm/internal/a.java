package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
final class a {

    @NotNull
    public static final a a = new a();

    @NotNull
    private static final C1159a b = new C1159a(null, null, null);

    @Nullable
    private static C1159a c;

    /* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.a$a, reason: collision with other inner class name */
    public static final class C1159a {

        @JvmField
        @Nullable
        public final Method a;

        @JvmField
        @Nullable
        public final Method b;

        @JvmField
        @Nullable
        public final Method c;

        public C1159a(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    private a() {
    }

    private final C1159a a(BaseContinuationImpl baseContinuationImpl) {
        try {
            C1159a c1159a = new C1159a(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            c = c1159a;
            return c1159a;
        } catch (Exception unused) {
            C1159a c1159a2 = b;
            c = c1159a2;
            return c1159a2;
        }
    }

    @Nullable
    public final String b(@NotNull BaseContinuationImpl baseContinuationImpl) {
        C1159a c1159aA = c;
        if (c1159aA == null) {
            c1159aA = a(baseContinuationImpl);
        }
        if (c1159aA == b) {
            return null;
        }
        Method method = c1159aA.a;
        Object objInvoke = method == null ? null : method.invoke(baseContinuationImpl.getClass(), new Object[0]);
        if (objInvoke == null) {
            return null;
        }
        Method method2 = c1159aA.b;
        Object objInvoke2 = method2 == null ? null : method2.invoke(objInvoke, new Object[0]);
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = c1159aA.c;
        Object objInvoke3 = method3 == null ? null : method3.invoke(objInvoke2, new Object[0]);
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
