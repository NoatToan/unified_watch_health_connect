package com.xiaomi.fitness.sport.view.sporting;

import android.content.Context;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import androidx.p004activity.contextaware.OnContextAvailableListener;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.viewmodel.BaseSportVM;
import defpackage.gbq;
import defpackage.hi0;
import defpackage.r74;
import defpackage.sxa;
import defpackage.txa;
import defpackage.u9l;
import defpackage.xx5;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Hilt_CommonSportActivity<VM extends BaseSportVM<CommonSportModel>, VDB extends ViewDataBinding> extends BaseSportingActivity<VM, VDB> implements txa {
    private volatile hi0 componentManager;
    private final Object componentManagerLock;
    private boolean injected;
    private u9l savedStateHandleHolder;

    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.p004activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_CommonSportActivity.this.inject();
        }
    }

    public Hilt_CommonSportActivity(int i, int i2) {
        super(i, i2);
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof sxa) {
            u9l u9lVarB = m577componentManager().b();
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
        return m577componentManager().generatedComponent();
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
        ((r74) generatedComponent()).q((CommonSportActivity) gbq.a(this));
    }

    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        u9l u9lVar = this.savedStateHandleHolder;
        if (u9lVar != null) {
            u9lVar.a();
        }
    }

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final hi0 m577componentManager() {
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
