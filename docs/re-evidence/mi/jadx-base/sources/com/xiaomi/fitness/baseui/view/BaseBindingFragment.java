package com.xiaomi.fitness.baseui.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import defpackage.rv1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010#\u001a\u00020!H\u0014J\b\u0010$\u001a\u00020!H\u0016R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u00028\u0001X\u0084.¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "VM", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Lcom/xiaomi/fitness/baseui/view/BaseViewModelFragment;", "Lcom/xiaomi/fitness/baseui/view/ViewDataBinder;", "contentLayoutId", "", "mViewModelId", "sharedViewModel", "", "<init>", "(IIZ)V", "viewModelId", "(II)V", "(I)V", "()V", "mBinding", "getMBinding", "()Landroidx/databinding/ViewDataBinding;", "setMBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "onInflateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "setListener", LifecycleConstantKt.ON_DESTROY, "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseBindingFragment<VM extends AbsViewModel, VDB extends ViewDataBinding> extends BaseViewModelFragment<VM> implements ViewDataBinder<VM, VDB> {
    protected VDB mBinding;
    private final int mViewModelId;

    public BaseBindingFragment(int i, int i2, boolean z) {
        super(i, z);
        this.mViewModelId = i2;
    }

    @Override // com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull VDB vdb) {
        ViewDataBinder.DefaultImpls.bindView(this, vdb);
    }

    @Override // com.xiaomi.fitness.baseui.view.ViewDataBinder
    @NotNull
    public VDB binding(@NotNull LayoutInflater layoutInflater, int i, @Nullable ViewGroup viewGroup) {
        return (VDB) ViewDataBinder.DefaultImpls.binding(this, layoutInflater, i, viewGroup);
    }

    @NotNull
    public final VDB getMBinding() {
        VDB vdb = this.mBinding;
        if (vdb != null) {
            return vdb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (this.mBinding != null) {
            getMBinding().u0();
        }
        super.onDestroy();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @Nullable
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (getLayoutId() == -1) {
            throw new IllegalArgumentException("The layoutId must be passed in the constructor or override layoutId");
        }
        Intrinsics.checkNotNull(inflater);
        setMBinding(binding(inflater, getLayoutId(), container));
        setRootView(getMBinding().getRoot());
        return getRootView();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this.mViewModelId > 0) {
            getMBinding().q0(this.mViewModelId, getMViewModel());
        }
        getLifecycle().addObserver(getMViewModel());
        getMBinding().l0(this);
        bindView(getMBinding());
        getMViewModel().attach(savedInstanceState);
        setListener();
    }

    public void setListener() {
    }

    public final void setMBinding(@NotNull VDB vdb) {
        Intrinsics.checkNotNullParameter(vdb, "<set-?>");
        this.mBinding = vdb;
    }

    @Override // com.xiaomi.fitness.baseui.view.ViewDataBinder
    @NotNull
    public VDB binding(@NotNull View view) {
        return (VDB) ViewDataBinder.DefaultImpls.binding(this, view);
    }

    public BaseBindingFragment(int i, int i2) {
        this(i, i2, false);
    }

    public BaseBindingFragment(int i) {
        this(i, rv1.f32936a, false);
    }

    public BaseBindingFragment() {
        this(-1, rv1.f32936a, false);
    }
}
