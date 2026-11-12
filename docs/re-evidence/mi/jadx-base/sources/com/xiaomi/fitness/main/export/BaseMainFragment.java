package com.xiaomi.fitness.main.export;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.component.StandardComponentEvent;
import defpackage.rv1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000fB\t\b\u0016¢\u0006\u0004\b\u000b\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001fH&J\u0012\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J(\u0010#\u001a\u0004\u0018\u00010\u001f2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010*\u001a\u00020\u0018H\u0016J(\u0010+\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u001f2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0018\u0018\u00010-H\u0004R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/main/export/BaseMainFragment;", "VM", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "contentLayoutId", "", "mViewModelId", "sharedViewModel", "", "<init>", "(IIZ)V", "viewModelId", "(II)V", "(I)V", "()V", "mBaseFragmentDelegate", "Lcom/xiaomi/fitness/main/export/BaseMainFragmentDelegate;", "getMBaseFragmentDelegate", "()Lcom/xiaomi/fitness/main/export/BaseMainFragmentDelegate;", "setMBaseFragmentDelegate", "(Lcom/xiaomi/fitness/main/export/BaseMainFragmentDelegate;)V", "onAttach", "", "context", "Landroid/content/Context;", "onConfigurationChanged", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "getContentView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInflateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", LifecycleConstantKt.ON_DESTROY, "showPopupMenu", "onMenuClickListener", "Lkotlin/Function1;", "Landroid/view/MenuItem;", "main-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseMainFragment<VM extends AbsViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> {
    public BaseMainFragmentDelegate mBaseFragmentDelegate;
    private final int mViewModelId;

    public BaseMainFragment(int i, int i2, boolean z) {
        super(i, i2, z);
        this.mViewModelId = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showPopupMenu$default(BaseMainFragment baseMainFragment, View view, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showPopupMenu");
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        baseMainFragment.showPopupMenu(view, function1);
    }

    @Nullable
    public abstract View getContentView();

    @NotNull
    public final BaseMainFragmentDelegate getMBaseFragmentDelegate() {
        BaseMainFragmentDelegate baseMainFragmentDelegate = this.mBaseFragmentDelegate;
        if (baseMainFragmentDelegate != null) {
            return baseMainFragmentDelegate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBaseFragmentDelegate");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        getMBaseFragmentDelegate().onAttach(context, this);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        getMBaseFragmentDelegate().onConfigurationChanged(newConfig, getContentView());
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMBaseFragmentDelegate().onCreate(savedInstanceState);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getMBaseFragmentDelegate().onDestroy();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        BaseMainFragmentDelegate mBaseFragmentDelegate = getMBaseFragmentDelegate();
        Intrinsics.checkNotNull(inflater);
        Pair pairOnInflateView = mBaseFragmentDelegate.onInflateView(inflater, container, savedInstanceState, getLayoutId());
        setMBinding((ViewDataBinding) pairOnInflateView.getSecond());
        setRootView((View) pairOnInflateView.getFirst());
        return getRootView();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getMBaseFragmentDelegate().onViewCreated(view, getContentView(), savedInstanceState);
    }

    public final void setMBaseFragmentDelegate(@NotNull BaseMainFragmentDelegate baseMainFragmentDelegate) {
        Intrinsics.checkNotNullParameter(baseMainFragmentDelegate, "<set-?>");
        this.mBaseFragmentDelegate = baseMainFragmentDelegate;
    }

    public final void showPopupMenu(@NotNull View view, @Nullable Function1<? super MenuItem, Unit> onMenuClickListener) {
        Intrinsics.checkNotNullParameter(view, "view");
        getMBaseFragmentDelegate().showPopupMenu(getActivity(), view, onMenuClickListener);
    }

    public BaseMainFragment(int i, int i2) {
        this(i, i2, false);
    }

    public BaseMainFragment(int i) {
        this(i, rv1.f32936a, false);
    }

    public BaseMainFragment() {
        this(-1, rv1.f32936a, false);
    }
}
