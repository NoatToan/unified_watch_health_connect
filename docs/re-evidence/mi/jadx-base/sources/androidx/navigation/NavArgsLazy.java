package androidx.navigation;

import android.os.Bundle;
import defpackage.dig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/navigation/NavArgsLazy;", "Ldig;", "Args", "Lkotlin/Lazy;", "", "isInitialized", "()Z", "cached", "Ldig;", "Lkotlin/reflect/KClass;", "navArgsClass", "Lkotlin/reflect/KClass;", "Lkotlin/Function0;", "Landroid/os/Bundle;", "argumentProducer", "Lkotlin/jvm/functions/Function0;", "getValue", "()Ldig;", "value", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)V", "navigation-common-ktx_release"}, k = 1, mv = {1, 4, 0})
public final class NavArgsLazy<Args extends dig> implements Lazy<Args> {
    private final Function0<Bundle> argumentProducer;
    private Args cached;
    private final KClass<Args> navArgsClass;

    public NavArgsLazy(@NotNull KClass<Args> kClass, @NotNull Function0<Bundle> function0) {
        this.navArgsClass = kClass;
        this.argumentProducer = function0;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.cached != null;
    }

    @Override // kotlin.Lazy
    @NotNull
    public Args getValue() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle bundleInvoke = this.argumentProducer.invoke();
        Method method = NavArgsLazyKt.getMethodMap().get(this.navArgsClass);
        if (method == null) {
            Class javaClass = JvmClassMappingKt.getJavaClass((KClass) this.navArgsClass);
            Class<Bundle>[] methodSignature = NavArgsLazyKt.getMethodSignature();
            method = javaClass.getMethod("fromBundle", (Class[]) Arrays.copyOf(methodSignature, methodSignature.length));
            NavArgsLazyKt.getMethodMap().put(this.navArgsClass, method);
            Intrinsics.checkExpressionValueIsNotNull(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Object objInvoke = method.invoke(null, bundleInvoke);
        if (objInvoke == null) {
            throw new TypeCastException("null cannot be cast to non-null type Args");
        }
        Args args2 = (Args) objInvoke;
        this.cached = args2;
        return args2;
    }
}
