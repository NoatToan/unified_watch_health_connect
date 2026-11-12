package com.xiaomi.fitness.service;

import android.os.IBinder;
import android.os.IInterface;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.service.BinderDelegate;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u0000 %*\b\b\u0000\u0010\u0001*\u00020\u00022\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u00032\u00020\u0005:\u0001%B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0012\u001a\u0004\u0018\u00018\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\u000eJ.\u0010\u0018\u001a\u00020\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u001a\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001bJ6\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0010\u0010 \u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0002\u0010\"J\u001e\u0010#\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/service/BinderDelegate;", "T", "Landroid/os/IInterface;", "Lkotlin/properties/ReadWriteProperty;", "", "Ljava/lang/reflect/InvocationHandler;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "field", "getField", "()Landroid/os/IInterface;", "setField", "(Landroid/os/IInterface;)V", "Landroid/os/IInterface;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroid/os/IInterface;", "getProxy", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Landroid/os/IInterface;)V", "invoke", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "getDefaultValue", "returnValue", "Companion", "service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BinderDelegate<T extends IInterface> implements ReadWriteProperty<Object, T>, InvocationHandler {

    @NotNull
    private static final String TAG = "BinderDelegate";

    @Nullable
    private volatile T field;

    @NotNull
    private final String name;

    public BinderDelegate(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
    }

    private final Object getDefaultValue(Object returnValue, Method method) {
        if (returnValue != null) {
            return returnValue;
        }
        Class<?> returnType = method != null ? method.getReturnType() : null;
        Class cls = Integer.TYPE;
        if (Intrinsics.areEqual(returnType, cls) || Intrinsics.areEqual(returnType, cls)) {
            return -1;
        }
        Class cls2 = Boolean.TYPE;
        if (Intrinsics.areEqual(returnType, cls2) || Intrinsics.areEqual(returnType, cls2)) {
            return Boolean.FALSE;
        }
        Class cls3 = Float.TYPE;
        if (Intrinsics.areEqual(returnType, cls3) || Intrinsics.areEqual(returnType, cls3)) {
            return Float.valueOf(-1.0f);
        }
        Class cls4 = Long.TYPE;
        if (Intrinsics.areEqual(returnType, cls4) || Intrinsics.areEqual(returnType, cls4)) {
            return -1L;
        }
        Class cls5 = Double.TYPE;
        if (Intrinsics.areEqual(returnType, cls5) || Intrinsics.areEqual(returnType, cls5)) {
            return -1;
        }
        Class cls6 = Short.TYPE;
        if (Intrinsics.areEqual(returnType, cls6) || Intrinsics.areEqual(returnType, cls6)) {
            return -1;
        }
        Class cls7 = Byte.TYPE;
        return (Intrinsics.areEqual(returnType, cls7) || Intrinsics.areEqual(returnType, cls7)) ? -1 : null;
    }

    private final T getProxy() {
        if (this.field == null) {
            return null;
        }
        if (ApplicationExtKt.isSameProcess(ApplicationExtKt.getApplication(), ":device")) {
            return this.field;
        }
        T t = this.field;
        Intrinsics.checkNotNull(t);
        Class<?> cls = t.getClass();
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setValue$lambda$0(BinderDelegate this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.field = null;
        Logger.i(TAG, "binder dead " + this$0.name + ", field = null");
    }

    @Nullable
    public final T getField() {
        return this.field;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue(obj, (KProperty<?>) kProperty);
    }

    @Override // java.lang.reflect.InvocationHandler
    @Nullable
    public Object invoke(@Nullable Object proxy, @Nullable Method method, @Nullable Object[] args) {
        String strJoinToString$default;
        Object objInvoke;
        try {
            if (this.field != null) {
                if (args == null || args.length == 0) {
                    if (method != null) {
                        objInvoke = method.invoke(this.field, new Object[0]);
                    }
                } else if (method != null) {
                    objInvoke = method.invoke(this.field, Arrays.copyOf(args, args.length));
                }
                return getDefaultValue(objInvoke, method);
            }
            Logger.i(this.name + " is null, can't invoke method", new Object[0]);
            objInvoke = null;
            return getDefaultValue(objInvoke, method);
        } catch (Exception e) {
            if (args == null || (strJoinToString$default = ArraysKt___ArraysKt.joinToString$default(args, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null)) == null) {
                strJoinToString$default = "";
            }
            Logger.e("Can't invoke " + method + "(" + strJoinToString$default + "), exception", e);
            return getDefaultValue(null, method);
        }
    }

    public final void setField(@Nullable T t) {
        this.field = t;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
        setValue(obj, (KProperty<?>) kProperty, (IInterface) obj2);
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    @Nullable
    public synchronized T getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (this.field == null) {
            Logger.i(TAG, "binder died or not init " + this.name);
        }
        try {
        } catch (NullPointerException unused) {
            Logger.e("get proxy null", new Object[0]);
            return null;
        }
        return (T) getProxy();
    }

    public synchronized void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, @Nullable T value) {
        try {
            Intrinsics.checkNotNullParameter(property, "property");
            Logger.i(TAG, "binder " + this.name + " init: " + value + " ");
            if (value != null) {
                try {
                    IBinder iBinderAsBinder = value.asBinder();
                    if (iBinderAsBinder != null) {
                        iBinderAsBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: xo2
                            @Override // android.os.IBinder.DeathRecipient
                            public final void binderDied() {
                                BinderDelegate.setValue$lambda$0(this.f39302a);
                            }
                        }, 0);
                    }
                } catch (Exception e) {
                    Logger.i(TAG, "binder set exception : " + e.getMessage() + " , name = " + this.name);
                }
            }
            this.field = value;
        } catch (Throwable th) {
            throw th;
        }
    }
}
