package com.xiaomi.fitness.common.viewbinding;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import defpackage.bsq;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/common/viewbinding/FragmentViewBindingProperty;", "Landroidx/fragment/app/Fragment;", "F", "Lbsq;", "T", "Lcom/xiaomi/fitness/common/viewbinding/LifecycleViewBindingProperty;", "thisRef", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "(Landroidx/fragment/app/Fragment;)Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/Function1;", "viewBinder", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "common_release"}, k = 1, mv = {2, 0, 0})
final class FragmentViewBindingProperty<F extends Fragment, T extends bsq> extends LifecycleViewBindingProperty<F, T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewBindingProperty(@NotNull Function1<? super F, ? extends T> viewBinder) {
        super(viewBinder);
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
    }

    @Override // com.xiaomi.fitness.common.viewbinding.LifecycleViewBindingProperty
    @NotNull
    public LifecycleOwner getLifecycleOwner(@NotNull F thisRef) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        try {
            LifecycleOwner viewLifecycleOwner = thisRef.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            return viewLifecycleOwner;
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("Fragment doesn't have view associated with it or the view has been destroyed".toString());
        }
    }
}
