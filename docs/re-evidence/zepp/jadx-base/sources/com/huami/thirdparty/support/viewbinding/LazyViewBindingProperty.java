package com.huami.thirdparty.support.viewbinding;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u001b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0097\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0017R(\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00018\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/thirdparty/support/viewbinding/LazyViewBindingProperty;", "", "R", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", "", "clear", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "getViewBinder", "()Lkotlin/jvm/functions/Function1;", "viewBinder", "b", "Landroidx/viewbinding/ViewBinding;", "getViewBinding", "()Landroidx/viewbinding/ViewBinding;", "setViewBinding", "(Landroidx/viewbinding/ViewBinding;)V", "viewBinding", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "support_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class LazyViewBindingProperty<R, T extends ViewBinding> implements ViewBindingProperty<R, T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function1<R, T> viewBinder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private T viewBinding;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyViewBindingProperty(@NotNull Function1<? super R, ? extends T> function1) {
        this.viewBinder = function1;
    }

    @Override // com.huami.thirdparty.support.viewbinding.ViewBindingProperty
    @MainThread
    public void clear() {
        this.viewBinding = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue(obj, (KProperty<?>) kProperty);
    }

    @NotNull
    public final Function1<R, T> getViewBinder() {
        return this.viewBinder;
    }

    @Nullable
    public final T getViewBinding() {
        return this.viewBinding;
    }

    public final void setViewBinding(@Nullable T t) {
        this.viewBinding = t;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    @MainThread
    @NotNull
    public T getValue(@NotNull R thisRef, @NotNull KProperty<?> property) {
        T t = this.viewBinding;
        if (t != null) {
            return t;
        }
        T tInvoke = this.viewBinder.invoke(thisRef);
        setViewBinding(tInvoke);
        return tInvoke;
    }
}
