package com.huami.wallet.accessdoor.fragment;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.wallet.accessdoor.databinding.FragmentSupportsEmulationCardBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "p1", "invoke", "(Landroidx/fragment/app/Fragment;)Landroidx/viewbinding/ViewBinding;", "com/huami/viewbindingx/fragment/FragmentInflateViewBindingsKt$viewBindingByBind$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final /* synthetic */ class SupportsEmulationCardFragment$special$$inlined$viewBindingByBind$1 extends FunctionReferenceImpl implements Function1<Fragment, FragmentSupportsEmulationCardBinding> {
    public SupportsEmulationCardFragment$special$$inlined$viewBindingByBind$1(BindViewBinder bindViewBinder) {
        super(1, bindViewBinder, BindViewBinder.class, "bind", "bind(Landroidx/fragment/app/Fragment;)Landroidx/viewbinding/ViewBinding;", 0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.viewbinding.ViewBinding, com.huami.wallet.accessdoor.databinding.FragmentSupportsEmulationCardBinding] */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final FragmentSupportsEmulationCardBinding invoke(@NotNull Fragment fragment) {
        return ((BindViewBinder) this.receiver).bind(fragment);
    }
}
