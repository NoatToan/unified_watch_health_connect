package com.xiaomi.fitness.baseui.view;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.view.BaseViewModelFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\t\u0010\rB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010#\u001a\u00020\u0015H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00028\u00008DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/baseui/view/BaseViewModelFragment;", "VM", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Lcom/xiaomi/fitness/baseui/view/ViewModelCreator;", "contentLayoutId", "", "mSharedViewModel", "", "<init>", "(IZ)V", "(I)V", "sharedViewModel", "(Z)V", "()V", "mViewModel", "getMViewModel", "()Lcom/xiaomi/fitness/baseui/AbsViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initOnViewCreate", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", LifecycleConstantKt.ON_DESTROY, "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseViewModelFragment<VM extends AbsViewModel> extends BaseFragment implements ViewModelCreator<VM> {
    private final boolean mSharedViewModel;

    /* JADX INFO: renamed from: mViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    public /* synthetic */ BaseViewModelFragment(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? false : z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbsViewModel mViewModel_delegate$lambda$0(BaseViewModelFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return ViewModelCreator.DefaultImpls.initViewModel$default(this$0, this$0, null, 2, null);
    }

    @NotNull
    public final VM getMViewModel() {
        return (VM) this.mViewModel.getValue();
    }

    @Override // com.xiaomi.fitness.baseui.view.ViewModelCreator
    @NotNull
    public ViewModelProvider.Factory getViewModelFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.mSharedViewModel ? requireActivity().getDefaultViewModelProviderFactory() : getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "<get-defaultViewModelProviderFactory>(...)");
        return defaultViewModelProviderFactory;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.ViewModelStoreOwner
    @NotNull
    public ViewModelStore getViewModelStore() {
        ViewModelStore viewModelStore = this.mSharedViewModel ? requireActivity().getViewModelStore() : super.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "<get-viewModelStore>(...)");
        return viewModelStore;
    }

    public void initOnViewCreate(@Nullable Bundle savedInstanceState) {
        getLifecycle().addObserver(getMViewModel());
        getMViewModel().attach(savedInstanceState);
    }

    @Override // com.xiaomi.fitness.baseui.view.ViewModelCreator
    @NotNull
    public VM initViewModel(@Nullable ViewModelStoreOwner viewModelStoreOwner, @Nullable KClass<VM> kClass) {
        return (VM) ViewModelCreator.DefaultImpls.initViewModel(this, viewModelStoreOwner, kClass);
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getLifecycle().removeObserver(getMViewModel());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initOnViewCreate(savedInstanceState);
    }

    public BaseViewModelFragment(int i, boolean z) {
        super(i);
        this.mSharedViewModel = z;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pf2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseViewModelFragment.mViewModel_delegate$lambda$0(this.f30339a);
            }
        });
    }

    public BaseViewModelFragment(int i) {
        this(i, false);
    }

    public BaseViewModelFragment(boolean z) {
        this(-1, z);
    }

    public BaseViewModelFragment() {
        this(-1, false);
    }
}
