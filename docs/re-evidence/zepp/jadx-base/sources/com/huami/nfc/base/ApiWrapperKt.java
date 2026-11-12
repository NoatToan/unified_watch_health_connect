package com.huami.nfc.base;

import androidx.exifinterface.media.ExifInterface;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.nfc.base.ApiWrapperKt;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u001a/\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\b\u0010\u0007\u001a)\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f\u001a\u001f\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00102\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "isNeedLogMethodArgs", "Lkotlin/Function0;", "action", "wrapperLogAndAnalysis", "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "wrapperLog", "api", "wrapperTimeLog", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "", "args", "", "getMethodLog", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/String;", "getOnlyMethodNameLog", "apiAnalysis", "(Ljava/lang/Object;)Ljava/lang/Object;", "getMethodParam", "([Ljava/lang/Object;)Ljava/lang/String;", "nfc-base_release"}, k = 2, mv = {1, 5, 1})
public final class ApiWrapperKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return Intrinsics.stringPlus("api --> ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, long j) {
            super(0);
            this.a = str;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "api <-- " + this.a + "【执行成功】， 耗时: " + this.b + " ms";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, long j) {
            super(0);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "api <-- " + this.a + "【执行失败】，错误码: " + this.b + ", 错误描述: " + ((Object) this.c) + "), 耗时: " + this.d + " ms";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Exception b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Exception exc, long j) {
            super(0);
            this.a = str;
            this.b = exc;
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "api <-- " + this.a + ", 日志打印出错(" + ((Object) this.b.getMessage()) + ")，耗时 = " + this.c + " ms";
        }
    }

    @NotNull
    public static final <T> T apiAnalysis(@NotNull final T t) {
        Class<?> cls = t.getClass();
        T t2 = (T) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new InvocationHandler() { // from class: lg
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return ApiWrapperKt.c(t, obj, method, objArr);
            }
        });
        Objects.requireNonNull(t2, "null cannot be cast to non-null type T of com.huami.nfc.base.ApiWrapperKt.apiAnalysis");
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(Object obj, Object obj2, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        long jNanoTime = System.nanoTime();
        Object[] objArr2 = objArr == null ? new Object[0] : objArr;
        Object objInvoke = method.invoke(obj, Arrays.copyOf(objArr2, objArr2.length));
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Analysis.PARAM_METHOD, method.getName());
        linkedHashMap.put("TIME", String.valueOf(millis));
        try {
            if (objInvoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.huami.nfc.base.PayResponse<*>");
            }
            linkedHashMap.put(Analysis.PARAM_RESULT, "code: " + ((PayResponse) objInvoke).getCode() + ", msg: " + ((Object) ((PayResponse) objInvoke).getMessage()));
            String methodParam = getMethodParam(objArr);
            if (methodParam.length() > 0) {
                linkedHashMap.put(Analysis.PARAM_PARAM, methodParam);
            }
            Analytics.recordEvent(new CountEventBuilder(Analysis.EVENT_KEY).putExtras(linkedHashMap));
            return objInvoke;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(boolean z, Object obj, Object obj2, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        String methodLog = z ? getMethodLog(method, objArr) : getOnlyMethodNameLog(method);
        Logcat logcat = Logcat.INSTANCE;
        LogcatKt.info$default(logcat, null, new a(methodLog), 1, null);
        long jNanoTime = System.nanoTime();
        Object[] objArr2 = objArr == null ? new Object[0] : objArr;
        Object objInvoke = method.invoke(obj, Arrays.copyOf(objArr2, objArr2.length));
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
        String strStringPlus = Intrinsics.stringPlus(method.getName(), "()");
        try {
            if (objInvoke == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.huami.nfc.base.PayResponse<*>");
            }
            String code = ((PayResponse) objInvoke).getCode();
            String message = ((PayResponse) objInvoke).getMessage();
            if (((PayResponse) objInvoke).isSuccessful()) {
                LogcatKt.info$default(logcat, null, new b(strStringPlus, millis), 1, null);
            } else {
                LogcatKt.error$default(logcat, null, new c(strStringPlus, code, message, millis), 1, null);
            }
            return objInvoke;
        } catch (Exception e) {
            LogcatKt.info$default(Logcat.INSTANCE, null, new d(strStringPlus, e, millis), 1, null);
        }
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
    public static final String getMethodParam(@Nullable Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        if (objArr != null) {
            int i = 0;
            if (!(objArr.length == 0)) {
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
                return sb.toString();
            }
        }
        sb.append("");
        return sb.toString();
    }

    @NotNull
    public static final String getOnlyMethodNameLog(@NotNull Method method) {
        return method.getName() + "() ";
    }

    @NotNull
    public static final <T> T wrapperLog(boolean z, @NotNull Function0<? extends T> function0) {
        return (T) wrapperTimeLog(function0.invoke(), z);
    }

    public static /* synthetic */ Object wrapperLog$default(boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return wrapperLog(z, function0);
    }

    @NotNull
    public static final <T> T wrapperLogAndAnalysis(boolean z, @NotNull Function0<? extends T> function0) {
        return (T) wrapperTimeLog(apiAnalysis(function0.invoke()), z);
    }

    public static /* synthetic */ Object wrapperLogAndAnalysis$default(boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return wrapperLogAndAnalysis(z, function0);
    }

    @NotNull
    public static final <T> T wrapperTimeLog(@NotNull final T t, final boolean z) {
        Class<?> cls = t.getClass();
        T t2 = (T) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new InvocationHandler() { // from class: mg
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return ApiWrapperKt.d(z, t, obj, method, objArr);
            }
        });
        Objects.requireNonNull(t2, "null cannot be cast to non-null type T of com.huami.nfc.base.ApiWrapperKt.wrapperTimeLog");
        return t2;
    }

    public static /* synthetic */ Object wrapperTimeLog$default(Object obj, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        return wrapperTimeLog(obj, z);
    }
}
