package com.huami.sky.lib.utils;

import androidx.exifinterface.media.ExifInterface;
import com.huami.http.HttpError;
import com.huami.sky.lib.utils.SkyApiWrapperKt;
import com.huami.tools.log.HMLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "api", "wrapperApiLog", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "", "args", "", "getMethodLog", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/String;", "sky-lib_release"}, k = 2, mv = {1, 5, 1})
public final class SkyApiWrapperKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Method b;
        public final /* synthetic */ Object[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Method method, Object[] objArr) {
            super(0);
            this.a = str;
            this.b = method;
            this.c = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " 方法参数=" + SkyApiWrapperKt.getMethodLog(this.b, this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Ref.ObjectRef<Object> b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Ref.ObjectRef<Object> objectRef, long j) {
            super(0);
            this.a = str;
            this.b = objectRef;
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " 执行结果 " + this.b.element + ", 执行耗时 " + (System.currentTimeMillis() - this.c) + "ms";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ HttpError b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, HttpError httpError) {
            super(0);
            this.a = str;
            this.b = httpError;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " 执行错误 code=" + this.b.getCode() + ",message=" + this.b.get_message();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Exception exc) {
            super(0);
            this.a = str;
            this.b = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " 执行错误, message=" + this.b.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Object] */
    public static final Object b(Object obj, Object obj2, Method method, Object[] objArr) {
        String name = method.getName();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        HMLog.info$default(null, new a(name, method, objArr), 1, null);
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (objArr == null) {
                objArr = new Object[0];
            }
            objectRef.element = method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
            HMLog.info$default(null, new b(name, objectRef, jCurrentTimeMillis), 1, null);
        } catch (HttpError e) {
            HMLog.info$default(null, new c(name, e), 1, null);
        } catch (Exception e2) {
            HMLog.info$default(null, new d(name, e2), 1, null);
        }
        return objectRef.element;
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
    public static final <T> T wrapperApiLog(@NotNull final T t) {
        Class<?> cls = t.getClass();
        T t2 = (T) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new InvocationHandler() { // from class: cx6
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return SkyApiWrapperKt.b(t, obj, method, objArr);
            }
        });
        Objects.requireNonNull(t2, "null cannot be cast to non-null type T of com.huami.sky.lib.utils.SkyApiWrapperKt.wrapperApiLog");
        return t2;
    }
}
