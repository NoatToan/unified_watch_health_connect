package com.xiaomi.fitness.sport_eco.view.interval;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import dagger.hilt.android.internal.managers.a;
import defpackage.b7a;
import defpackage.e6i;
import defpackage.gbq;
import defpackage.tgd;
import defpackage.txa;
import defpackage.xx5;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_IntervalTrainingNumberFragment<VM extends AbsViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> implements txa {
    private ContextWrapper componentContext;
    private volatile a componentManager;
    private final Object componentManagerLock;
    private boolean disableGetContextFix;
    private boolean injected;

    public Hilt_IntervalTrainingNumberFragment(int i, int i2, boolean z) {
        super(i, i2, z);
        this.componentManagerLock = new Object();
        this.injected = false;
    }

    private void initializeComponentContext() {
        if (this.componentContext == null) {
            this.componentContext = a.b(super.getContext(), this);
            this.disableGetContextFix = b7a.a(super.getContext());
        }
    }

    public a createComponentManager() {
        return new a(this);
    }

    @Override // defpackage.sxa
    public final Object generatedComponent() {
        return m590componentManager().generatedComponent();
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
        ((tgd) generatedComponent()).Y((IntervalTrainingNumberFragment) gbq.a(this));
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
        return layoutInflaterOnGetLayoutInflater.cloneInContext(a.c(layoutInflaterOnGetLayoutInflater, this));
    }

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final a m590componentManager() {
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

    public Hilt_IntervalTrainingNumberFragment(int i, int i2) {
        super(i, i2);
        this.componentManagerLock = new Object();
        this.injected = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.componentContext;
        e6i.d(contextWrapper == null || a.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }

    public Hilt_IntervalTrainingNumberFragment(int i) {
        super(i);
        this.componentManagerLock = new Object();
        this.injected = false;
    }

    public Hilt_IntervalTrainingNumberFragment() {
        this.componentManagerLock = new Object();
        this.injected = false;
    }
}
