package com.xiaomi.fitness.baseui.view;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.component.StandardComponentEvent;
import defpackage.pwk;
import defpackage.vde;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 '*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006:\u0001'B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0014J\b\u0010 \u001a\u00020\u001aH\u0014J\u0012\u0010!\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\"\u001a\u00020\u001aH\u0014J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0010H\u0014R\u001c\u0010\t\u001a\u00028\u0001X\u0084.¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u0010X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "VM", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Lcom/xiaomi/fitness/baseui/view/BaseViewModelActivity;", "Lcom/xiaomi/fitness/baseui/view/ViewDataBinder;", "<init>", "()V", "mBinding", "getMBinding", "()Landroidx/databinding/ViewDataBinding;", "setMBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "enableAutoSetLayoutUiMode", "", "getEnableAutoSetLayoutUiMode", "()Z", "setEnableAutoSetLayoutUiMode", "(Z)V", "viewModelId", "", "getViewModelId", "()I", "initOnCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setContentView", "layoutResID", LifecycleConstantKt.ON_DESTROY, "onRelease", "onCreate", LifecycleConstantKt.ON_RESUME, "onConfigurationChanged", StandardComponentEvent.KEY_NEW_CONFIG, "Landroid/content/res/Configuration;", "isNeedRestore", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseBindingActivity<VM extends AbsViewModel, VDB extends ViewDataBinding> extends BaseViewModelActivity<VM> implements ViewDataBinder<VM, VDB> {

    @NotNull
    public static final String TAG = "BaseBindingActivity";
    private boolean enableAutoSetLayoutUiMode = pwk.e();
    protected VDB mBinding;

    public void bindView(@NotNull VDB vdb) {
        ViewDataBinder.DefaultImpls.bindView(this, vdb);
    }

    @Override // com.xiaomi.fitness.baseui.view.ViewDataBinder
    @NotNull
    public VDB binding(@NotNull LayoutInflater layoutInflater, int i, @Nullable ViewGroup viewGroup) {
        return (VDB) ViewDataBinder.DefaultImpls.binding(this, layoutInflater, i, viewGroup);
    }

    public boolean getEnableAutoSetLayoutUiMode() {
        return this.enableAutoSetLayoutUiMode;
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

    public abstract int getViewModelId();

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelActivity
    public void initOnCreate(@Nullable Bundle savedInstanceState) {
        getMBinding().q0(getViewModelId(), getMViewModel());
        getLifecycle().addObserver(getMViewModel());
        getMBinding().l0(this);
        bindView(getMBinding());
        getMViewModel().attach(savedInstanceState);
    }

    public boolean isNeedRestore() {
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (getEnableAutoSetLayoutUiMode()) {
            vde.a(this);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        if (!isNeedRestore() && savedInstanceState != null) {
            savedInstanceState.clear();
        }
        super.onCreate(savedInstanceState);
        if (getEnableAutoSetLayoutUiMode()) {
            vde.a(this);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this.mBinding != null) {
            onRelease();
            getMBinding().u0();
        }
        super.onDestroy();
    }

    public void onRelease() {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (getEnableAutoSetLayoutUiMode()) {
            vde.a(this);
        }
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void setContentView(int layoutResID) {
        LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
        setMBinding(binding(layoutInflater, getLayoutId(), null));
        super.setContentView(getMBinding().getRoot());
    }

    public void setEnableAutoSetLayoutUiMode(boolean z) {
        this.enableAutoSetLayoutUiMode = z;
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
}
