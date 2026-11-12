package com.xiaomi.fitness.base;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.p004activity.contextaware.OnContextAvailableListener;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import defpackage.gbq;
import defpackage.hi0;
import defpackage.sxa;
import defpackage.txa;
import defpackage.u9l;
import defpackage.xlo;
import defpackage.xx5;

/* JADX INFO: loaded from: classes7.dex */
abstract class Hilt_StubActivity extends BaseActivity implements txa {
    public u9l h;
    public volatile hi0 i;
    public final Object j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11586k = false;

    public class a implements OnContextAvailableListener {
        public a() {
        }

        @Override // androidx.p004activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_StubActivity.this.inject();
        }
    }

    public Hilt_StubActivity() {
        _initHiltInternal();
    }

    public final void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    public final hi0 componentManager() {
        if (this.i == null) {
            synchronized (this.j) {
                try {
                    if (this.i == null) {
                        this.i = createComponentManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.i;
    }

    public hi0 createComponentManager() {
        return new hi0(this);
    }

    @Override // defpackage.sxa
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.p004activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return xx5.a(this, super.getDefaultViewModelProviderFactory());
    }

    public final void initSavedStateHandleHolder() {
        if (getApplication() instanceof sxa) {
            u9l u9lVarB = componentManager().b();
            this.h = u9lVarB;
            if (u9lVarB.b()) {
                this.h.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    public void inject() {
        if (this.f11586k) {
            return;
        }
        this.f11586k = true;
        ((xlo) generatedComponent()).i2((StubActivity) gbq.a(this));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        u9l u9lVar = this.h;
        if (u9lVar != null) {
            u9lVar.a();
        }
    }
}
