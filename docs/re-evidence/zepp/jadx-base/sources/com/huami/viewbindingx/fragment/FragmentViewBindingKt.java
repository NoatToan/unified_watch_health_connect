package com.huami.viewbindingx.fragment;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.huami.viewbindingx.LifeViewBindingProperty;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\b"}, d2 = {"Landroidx/fragment/app/Fragment;", "F", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "viewBinder", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "viewBinding", "viewbindingx_release"}, k = 2, mv = {1, 4, 1})
public final class FragmentViewBindingKt {
    @NotNull
    public static final <F extends Fragment, T extends ViewBinding> LifeViewBindingProperty<F, T> viewBinding(@NotNull Function1<? super F, ? extends T> function1) {
        return new a(function1);
    }
}
