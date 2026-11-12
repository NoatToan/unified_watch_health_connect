package com.xiaomi.fitness.health.bloodpressure.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel;
import defpackage.b7a;
import defpackage.e6i;
import defpackage.gbq;
import defpackage.txa;
import defpackage.uz2;
import defpackage.xx5;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Hilt_BloodPressureMonthItemFragment<VM extends BloodPressureViewModel, VDB extends ViewDataBinding> extends BloodPressureBaseWeekMonthFragment<VM, VDB> implements txa {
    private ContextWrapper componentContext;
    private volatile dagger.hilt.android.internal.managers.a componentManager;
    private boolean disableGetContextFix;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    private void initializeComponentContext() {
        if (this.componentContext == null) {
            this.componentContext = dagger.hilt.android.internal.managers.a.b(super.getContext(), this);
            this.disableGetContextFix = b7a.a(super.getContext());
        }
    }

    public dagger.hilt.android.internal.managers.a createComponentManager() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    @Override // defpackage.sxa
    public final Object generatedComponent() {
        return m346componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.disableGetContextFix) {
            return null;
        }
        initializeComponentContext();
        return this.componentContext;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return xx5.b(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((uz2) generatedComponent()).Q((BloodPressureMonthItemFragment) gbq.a(this));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.a.c(layoutInflaterOnGetLayoutInflater, this));
    }

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final dagger.hilt.android.internal.managers.a m346componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.componentManager;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.componentContext;
        e6i.d(contextWrapper == null || dagger.hilt.android.internal.managers.a.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
