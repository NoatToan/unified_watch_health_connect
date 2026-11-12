package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;

/* JADX INFO: loaded from: classes.dex */
public class FragmentViewLifecycleOwner implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f2373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewModelStore f2374b;
    public ViewModelProvider.Factory c;
    public LifecycleRegistry d = null;
    public SavedStateRegistryController e = null;

    public FragmentViewLifecycleOwner(Fragment fragment, ViewModelStore viewModelStore) {
        this.f2373a = fragment;
        this.f2374b = viewModelStore;
    }

    public void a(Lifecycle.Event event) {
        this.d.handleLifecycleEvent(event);
    }

    public void b() {
        if (this.d == null) {
            this.d = new LifecycleRegistry(this);
            SavedStateRegistryController savedStateRegistryControllerCreate = SavedStateRegistryController.create(this);
            this.e = savedStateRegistryControllerCreate;
            savedStateRegistryControllerCreate.performAttach();
            SavedStateHandleSupport.enableSavedStateHandles(this);
        }
    }

    public boolean c() {
        return this.d != null;
    }

    public void d(Bundle bundle) {
        this.e.performRestore(bundle);
    }

    public void e(Bundle bundle) {
        this.e.performSave(bundle);
    }

    public void f(Lifecycle.State state) {
        this.d.setCurrentState(state);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f2373a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (this.f2373a.getArguments() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, this.f2373a.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.f2373a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f2373a.mDefaultFactory)) {
            this.c = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.c == null) {
            Context applicationContext = this.f2373a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.c = new SavedStateViewModelFactory(application, this, this.f2373a.getArguments());
        }
        return this.c;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        b();
        return this.d;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.e.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        b();
        return this.f2374b;
    }
}
