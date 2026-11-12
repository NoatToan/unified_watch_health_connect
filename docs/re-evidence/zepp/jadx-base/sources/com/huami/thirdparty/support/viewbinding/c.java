package com.huami.thirdparty.support.viewbinding;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huami/thirdparty/support/viewbinding/c;", "Landroidx/fragment/app/Fragment;", "F", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/thirdparty/support/viewbinding/LifecycleViewBindingProperty;", "thisRef", "Landroidx/lifecycle/LifecycleOwner;", "c", "(Landroidx/fragment/app/Fragment;)Landroidx/lifecycle/LifecycleOwner;", "Lkotlin/Function1;", "viewBinder", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "support_release"}, k = 1, mv = {1, 5, 1})
final class c<F extends Fragment, T extends ViewBinding> extends LifecycleViewBindingProperty<F, T> {
    public c(@NotNull Function1<? super F, ? extends T> function1) {
        super(function1);
    }

    @Override // com.huami.thirdparty.support.viewbinding.LifecycleViewBindingProperty
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public LifecycleOwner getLifecycleOwner(@NotNull F thisRef) {
        return thisRef.getViewLifecycleOwner();
    }
}
