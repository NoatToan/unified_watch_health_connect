package com.xiaomi.fitness.route.track.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import defpackage.b7a;
import defpackage.e6i;
import defpackage.gbq;
import defpackage.txa;
import defpackage.xkp;
import defpackage.xx5;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Hilt_TrackCollectListFragment<VM extends AbsViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> implements txa {
    private ContextWrapper componentContext;
    private volatile dagger.hilt.android.internal.managers.a componentManager;
    private final Object componentManagerLock;
    private boolean disableGetContextFix;
    private boolean injected;

    public Hilt_TrackCollectListFragment(int i, int i2, boolean z) {
        super(i, i2, z);
        this.componentManagerLock = new Object();
        this.injected = false;
    }

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
        return m550componentManager().generatedComponent();
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
        ((xkp) generatedComponent()).S((TrackCollectListFragment) gbq.a(this));
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
    public final dagger.hilt.android.internal.managers.a m550componentManager() {
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

    public Hilt_TrackCollectListFragment(int i, int i2) {
        super(i, i2);
        this.componentManagerLock = new Object();
        this.injected = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.componentContext;
        e6i.d(contextWrapper == null || dagger.hilt.android.internal.managers.a.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }

    public Hilt_TrackCollectListFragment(int i) {
        super(i);
        this.componentManagerLock = new Object();
        this.injected = false;
    }

    public Hilt_TrackCollectListFragment() {
        this.componentManagerLock = new Object();
        this.injected = false;
    }
}
