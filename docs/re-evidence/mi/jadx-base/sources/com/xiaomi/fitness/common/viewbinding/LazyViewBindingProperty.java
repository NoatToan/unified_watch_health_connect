package com.xiaomi.fitness.common.viewbinding;

import androidx.annotation.RestrictTo;
import androidx.health.connect.client.records.CervicalMucusRecord;
import defpackage.bsq;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0097\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/common/viewbinding/LazyViewBindingProperty;", "", "R", "Lbsq;", "T", "Lcom/xiaomi/fitness/common/viewbinding/ViewBindingProperty;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lbsq;", "", CervicalMucusRecord.Appearance.CLEAR, "()V", "Lkotlin/Function1;", "viewBinder", "Lkotlin/jvm/functions/Function1;", "getViewBinder", "()Lkotlin/jvm/functions/Function1;", "viewBinding", "Ljava/lang/Object;", "getViewBinding", "()Ljava/lang/Object;", "setViewBinding", "(Ljava/lang/Object;)V", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "common_release"}, k = 1, mv = {2, 0, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class LazyViewBindingProperty<R, T extends bsq> implements ViewBindingProperty<R, T> {

    @NotNull
    private final Function1<R, T> viewBinder;

    @Nullable
    private Object viewBinding;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyViewBindingProperty(@NotNull Function1<? super R, ? extends T> viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        this.viewBinder = viewBinder;
    }

    @Override // com.xiaomi.fitness.common.viewbinding.ViewBindingProperty
    public void clear() {
        this.viewBinding = null;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    @NotNull
    public T getValue(@NotNull R thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj = this.viewBinding;
        T t = obj instanceof bsq ? (T) obj : null;
        if (t != null) {
            return t;
        }
        T tInvoke = this.viewBinder.invoke(thisRef);
        this.viewBinding = tInvoke;
        return tInvoke;
    }

    @NotNull
    public final Function1<R, T> getViewBinder() {
        return this.viewBinder;
    }

    @Nullable
    public final Object getViewBinding() {
        return this.viewBinding;
    }

    public final void setViewBinding(@Nullable Object obj) {
        this.viewBinding = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue(obj, (KProperty<?>) kProperty);
    }
}
