package com.xiaomi.fitness.baseui.view;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.view.BaseViewModelActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0014R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00028\u00008DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/baseui/view/BaseViewModelActivity;", "VM", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Lcom/xiaomi/fitness/baseui/view/ViewModelCreator;", "<init>", "()V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "mViewModel", "getMViewModel", "()Lcom/xiaomi/fitness/baseui/AbsViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initOnCreate", LifecycleConstantKt.ON_DESTROY, "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseViewModelActivity<VM extends AbsViewModel> extends BaseActivity implements ViewModelCreator<VM> {

    /* JADX INFO: renamed from: mViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: of2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseViewModelActivity.mViewModel_delegate$lambda$0(this.f29097a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbsViewModel mViewModel_delegate$lambda$0(BaseViewModelActivity this$0) {
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
        ViewModelProvider.Factory defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "<get-defaultViewModelProviderFactory>(...)");
        return defaultViewModelProviderFactory;
    }

    public void initOnCreate(@Nullable Bundle savedInstanceState) {
        getLifecycle().addObserver(getMViewModel());
        getMViewModel().attach(savedInstanceState);
    }

    @Override // com.xiaomi.fitness.baseui.view.ViewModelCreator
    @NotNull
    public VM initViewModel(@Nullable ViewModelStoreOwner viewModelStoreOwner, @Nullable KClass<VM> kClass) {
        return (VM) ViewModelCreator.DefaultImpls.initViewModel(this, viewModelStoreOwner, kClass);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initOnCreate(savedInstanceState);
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getLifecycle().removeObserver(getMViewModel());
    }
}
