package com.huami.nfc.base;

import androidx.exifinterface.media.ExifInterface;
import com.huami.nfc.base.AppletApiWrapperKt;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/nfc/base/INfcChannel;", "channel", "api", "wrapperWithNfcChannel", "(Lcom/huami/nfc/base/INfcChannel;Ljava/lang/Object;)Ljava/lang/Object;", "nfc-base_release"}, k = 2, mv = {1, 5, 1})
public final class AppletApiWrapperKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/nfc/base/PayResponse;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PayResponse<? extends Object>> {
        public final /* synthetic */ Method a;
        public final /* synthetic */ T b;
        public final /* synthetic */ Object[] c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Method method, T t, Object[] objArr) {
            super(0);
            this.a = method;
            this.b = t;
            this.c = objArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PayResponse<Object> invoke() throws Throwable {
            try {
                Method method = this.a;
                Object obj = this.b;
                Object[] objArr = this.c;
                if (objArr == null) {
                    objArr = new Object[0];
                }
                Object objInvoke = method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                if (objInvoke != null) {
                    return (PayResponse) objInvoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.huami.nfc.base.PayResponse<*>");
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object b(INfcChannel iNfcChannel, Object obj, Object obj2, Method method, Object[] objArr) {
        return NfcChannelExtensionsKt.withOpenAndClose(iNfcChannel, new a(method, obj, objArr));
    }

    @NotNull
    public static final <T> T wrapperWithNfcChannel(@NotNull final INfcChannel iNfcChannel, @NotNull final T t) {
        Class<?> cls = t.getClass();
        T t2 = (T) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new InvocationHandler() { // from class: ni
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return AppletApiWrapperKt.b(iNfcChannel, t, obj, method, objArr);
            }
        });
        Objects.requireNonNull(t2, "null cannot be cast to non-null type T of com.huami.nfc.base.AppletApiWrapperKt.wrapperWithNfcChannel");
        return t2;
    }
}
