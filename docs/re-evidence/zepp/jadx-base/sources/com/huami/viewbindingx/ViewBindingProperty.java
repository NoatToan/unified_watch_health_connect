package com.huami.viewbindingx;

import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u001b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0097\u0002¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR(\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/viewbindingx/ViewBindingProperty;", "", "R", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/properties/ReadOnlyProperty;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;", "a", "Landroidx/viewbinding/ViewBinding;", "viewBinding", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "getViewBinder", "()Lkotlin/jvm/functions/Function1;", "viewBinder", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "viewbindingx_release"}, k = 1, mv = {1, 4, 1})
public class ViewBindingProperty<R, T extends ViewBinding> implements ReadOnlyProperty<R, T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private T viewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function1<R, T> viewBinder;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewBindingProperty(@NotNull Function1<? super R, ? extends T> function1) {
        this.viewBinder = function1;
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

    @Override // kotlin.properties.ReadOnlyProperty
    @MainThread
    @NotNull
    public T getValue(@NotNull R thisRef, @NotNull KProperty<?> property) {
        T t = this.viewBinding;
        if (t != null) {
            return t;
        }
        T tInvoke = this.viewBinder.invoke(thisRef);
        this.viewBinding = tInvoke;
        return tInvoke;
    }
}
