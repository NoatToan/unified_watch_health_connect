package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.d;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class eig implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f16682b;
    public Bundle c;
    public final LifecycleRegistry d;
    public final SavedStateRegistryController e;
    public final UUID f;
    public Lifecycle.State g;
    public Lifecycle.State h;
    public fig i;
    public ViewModelProvider.Factory j;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16683a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            f16683a = iArr;
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16683a[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16683a[Lifecycle.Event.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16683a[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16683a[Lifecycle.Event.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16683a[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16683a[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public eig(Context context, d dVar, Bundle bundle, LifecycleOwner lifecycleOwner, fig figVar) {
        this(context, dVar, bundle, lifecycleOwner, figVar, UUID.randomUUID(), null);
    }

    public static Lifecycle.State d(Lifecycle.Event event) {
        switch (a.f16683a[event.ordinal()]) {
            case 1:
            case 2:
                return Lifecycle.State.CREATED;
            case 3:
            case 4:
                return Lifecycle.State.STARTED;
            case 5:
                return Lifecycle.State.RESUMED;
            case 6:
                return Lifecycle.State.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + event);
        }
    }

    public Bundle a() {
        return this.c;
    }

    public d b() {
        return this.f16682b;
    }

    public Lifecycle.State c() {
        return this.h;
    }

    public void e(Lifecycle.Event event) {
        this.g = d(event);
        i();
    }

    public void f(Bundle bundle) {
        this.c = bundle;
    }

    public void g(Bundle bundle) {
        this.e.performSave(bundle);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        if (this.j == null) {
            this.j = new SavedStateViewModelFactory((Application) this.f16681a.getApplicationContext(), this, this.c);
        }
        return this.j;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.d;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        return this.e.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        fig figVar = this.i;
        if (figVar != null) {
            return figVar.c(this.f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public void h(Lifecycle.State state) {
        this.h = state;
        i();
    }

    public void i() {
        if (this.g.ordinal() < this.h.ordinal()) {
            this.d.setCurrentState(this.g);
        } else {
            this.d.setCurrentState(this.h);
        }
    }

    public eig(Context context, d dVar, Bundle bundle, LifecycleOwner lifecycleOwner, fig figVar, UUID uuid, Bundle bundle2) {
        this.d = new LifecycleRegistry(this);
        SavedStateRegistryController savedStateRegistryControllerCreate = SavedStateRegistryController.create(this);
        this.e = savedStateRegistryControllerCreate;
        this.g = Lifecycle.State.CREATED;
        this.h = Lifecycle.State.RESUMED;
        this.f16681a = context;
        this.f = uuid;
        this.f16682b = dVar;
        this.c = bundle;
        this.i = figVar;
        savedStateRegistryControllerCreate.performRestore(bundle2);
        if (lifecycleOwner != null) {
            this.g = lifecycleOwner.getLifecycle().getState();
        }
    }
}
