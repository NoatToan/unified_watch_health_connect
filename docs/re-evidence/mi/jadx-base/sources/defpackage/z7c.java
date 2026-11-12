package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProvider;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureAddFragment;
import dagger.hilt.android.internal.managers.a;

/* JADX INFO: loaded from: classes9.dex */
public abstract class z7c extends BaseFragment implements txa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ContextWrapper f40979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40980b;
    public volatile a c;
    public final Object d = new Object();
    public boolean e = false;

    public final a componentManager() {
        if (this.c == null) {
            synchronized (this.d) {
                try {
                    if (this.c == null) {
                        this.c = createComponentManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public a createComponentManager() {
        return new a(this);
    }

    @Override // defpackage.sxa
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f40980b) {
            return null;
        }
        initializeComponentContext();
        return this.f40979a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return xx5.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initializeComponentContext() {
        if (this.f40979a == null) {
            this.f40979a = a.b(super.getContext(), this);
            this.f40980b = b7a.a(super.getContext());
        }
    }

    public void inject() {
        if (this.e) {
            return;
        }
        this.e = true;
        ((ny2) generatedComponent()).I((BloodPressureAddFragment) gbq.a(this));
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

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f40979a;
        e6i.d(contextWrapper == null || a.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
