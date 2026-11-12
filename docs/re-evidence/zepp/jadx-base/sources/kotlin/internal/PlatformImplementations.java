package kotlin.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import kotlin.text.MatchGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public class PlatformImplementations {

    public static final class a {

        @NotNull
        public static final a a = new a();

        @JvmField
        @Nullable
        public static final Method b;

        @JvmField
        @Nullable
        public static final Method c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            do {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                } else {
                    method2 = methods[i2];
                    i2++;
                }
            } while (!(Intrinsics.areEqual(method2.getName(), "addSuppressed") && Intrinsics.areEqual(ArraysKt.singleOrNull(method2.getParameterTypes()), Throwable.class)));
            b = method2;
            int length2 = methods.length;
            while (i < length2) {
                Method method3 = methods[i];
                i++;
                if (Intrinsics.areEqual(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            c = method;
        }

        private a() {
        }
    }

    public void addSuppressed(@NotNull Throwable th, @NotNull Throwable th2) throws IllegalAccessException, InvocationTargetException {
        Method method = a.b;
        if (method == null) {
            return;
        }
        method.invoke(th, th2);
    }

    @NotNull
    public Random defaultPlatformRandom() {
        return new FallbackThreadLocalRandom();
    }

    @Nullable
    public MatchGroup getMatchResultNamedGroup(@NotNull MatchResult matchResult, @NotNull String str) {
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @NotNull
    public List<Throwable> getSuppressed(@NotNull Throwable th) {
        Method method = a.c;
        Object objInvoke = method == null ? null : method.invoke(th, new Object[0]);
        return objInvoke == null ? CollectionsKt__CollectionsKt.emptyList() : ArraysKt___ArraysJvmKt.asList((Throwable[]) objInvoke);
    }
}
