package com.xiaomi.fitness.login.welcome;

import android.content.Context;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import androidx.p004activity.contextaware.OnContextAvailableListener;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import defpackage.gbq;
import defpackage.hi0;
import defpackage.shr;
import defpackage.sxa;
import defpackage.txa;
import defpackage.u9l;
import defpackage.xx5;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Hilt_WelcomeActivity<VM extends AbsViewModel, VDB extends ViewDataBinding> extends BaseBindingActivity<VM, VDB> implements txa {
    private volatile hi0 componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;
    private u9l savedStateHandleHolder;

    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.p004activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_WelcomeActivity.this.inject();
        }
    }

    public Hilt_WelcomeActivity() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof sxa) {
            u9l u9lVarB = m486componentManager().b();
            this.savedStateHandleHolder = u9lVarB;
            if (u9lVarB.b()) {
                this.savedStateHandleHolder.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public hi0 createComponentManager() {
        return new hi0(this);
    }

    @Override // defpackage.sxa
    public final Object generatedComponent() {
        return m486componentManager().generatedComponent();
    }

    @Override // androidx.p004activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return xx5.a(this, super.getDefaultViewModelProviderFactory());
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((shr) generatedComponent()).r0((WelcomeActivity) gbq.a(this));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        u9l u9lVar = this.savedStateHandleHolder;
        if (u9lVar != null) {
            u9lVar.a();
        }
    }

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final hi0 m486componentManager() {
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
}
