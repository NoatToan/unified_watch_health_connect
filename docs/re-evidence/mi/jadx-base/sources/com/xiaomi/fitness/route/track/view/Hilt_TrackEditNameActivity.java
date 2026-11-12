package com.xiaomi.fitness.route.track.view;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.p004activity.contextaware.OnContextAvailableListener;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import defpackage.gbq;
import defpackage.hi0;
import defpackage.rmp;
import defpackage.sxa;
import defpackage.txa;
import defpackage.u9l;
import defpackage.xx5;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Hilt_TrackEditNameActivity extends BaseActivity implements txa {
    private volatile hi0 componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;
    private u9l savedStateHandleHolder;

    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.p004activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_TrackEditNameActivity.this.inject();
        }
    }

    public Hilt_TrackEditNameActivity() {
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof sxa) {
            u9l u9lVarB = m553componentManager().b();
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
        return m553componentManager().generatedComponent();
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
        ((rmp) generatedComponent()).N1((TrackEditNameActivity) gbq.a(this));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        u9l u9lVar = this.savedStateHandleHolder;
        if (u9lVar != null) {
            u9lVar.a();
        }
    }

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final hi0 m553componentManager() {
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
