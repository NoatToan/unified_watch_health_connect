package com.huami.jac.repo.log;

import androidx.exifinterface.media.ExifInterface;
import com.huami.jac.repo.log.JacLogKt;
import com.huami.tools.log.HMLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "tag", "Lkotlin/Function0;", "action", "jacLogAndAnalysis", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "api", "jacTimeLog", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "", "args", "getMethodLog", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/String;", "jac-repo_release"}, k = 2, mv = {1, 5, 1})
public final class JacLogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object b(String str, Object obj, Object obj2, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        HMLog.i(str, Intrinsics.stringPlus("api --> ", getMethodLog(method, objArr)), new Object[0]);
        long jNanoTime = System.nanoTime();
        if (objArr == null) {
            objArr = new Object[0];
        }
        Object objInvoke = method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
        HMLog.i(str, "api <-- " + Intrinsics.stringPlus(method.getName(), "()") + "【执行完毕】， 耗时: " + millis + " ms \n" + objInvoke, new Object[0]);
        return objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @NotNull
    public static final String getMethodLog(@NotNull Method method, @Nullable Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        if (objArr != null) {
            int i = 0;
            if (objArr.length == 0) {
                sb.append("()");
            } else {
                sb.append("(");
                int length = objArr.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i2 = i + 1;
                        sb.append(objArr[i]);
                        if (i < objArr.length - 1) {
                            sb.append(", ");
                        }
                        if (i2 > length) {
                            break;
                        }
                        i = i2;
                    }
                }
                sb.append(")");
            }
        } else {
            sb.append("()");
        }
        sb.append(" ");
        return sb.toString();
    }

    @NotNull
    public static final <T> T jacLogAndAnalysis(@NotNull String str, @NotNull Function0<? extends T> function0) {
        return (T) jacTimeLog(str, function0.invoke());
    }

    @NotNull
    public static final <T> T jacTimeLog(@NotNull final String str, @NotNull final T t) {
        Class<?> cls = t.getClass();
        T t2 = (T) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new InvocationHandler() { // from class: ii4
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return JacLogKt.b(str, t, obj, method, objArr);
            }
        });
        Objects.requireNonNull(t2, "null cannot be cast to non-null type T of com.huami.jac.repo.log.JacLogKt.jacTimeLog");
        return t2;
    }
}
