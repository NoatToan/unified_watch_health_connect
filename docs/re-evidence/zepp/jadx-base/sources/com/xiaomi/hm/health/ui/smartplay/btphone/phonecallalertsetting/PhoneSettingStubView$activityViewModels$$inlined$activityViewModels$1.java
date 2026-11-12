package com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting;

import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.ViewModelStore;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "androidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class PhoneSettingStubView$activityViewModels$$inlined$activityViewModels$1 extends Lambda implements Function0<ViewModelStore> {
    public final /* synthetic */ Fragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneSettingStubView$activityViewModels$$inlined$activityViewModels$1(Fragment fragment) {
        super(0);
        this.a = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ViewModelStore invoke() {
        return this.a.requireActivity().getViewModelStore();
    }
}
