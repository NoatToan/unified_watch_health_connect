package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.miui.tsmclient.entity.CardInfo;
import defpackage.dvq;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b!\u0010\"B\u001b\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%B%\b\u0017\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b!\u0010&J/\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\rJ'\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006'"}, d2 = {"Landroidx/lifecycle/SavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Ldvq;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Ldvq;", "", "key", "(Ljava/lang/String;Ljava/lang/Class;)Ldvq;", "(Ljava/lang/Class;)Ldvq;", "viewModel", "", "onRequery", "(Ldvq;)V", "Landroid/app/Application;", "application", "Landroid/app/Application;", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroid/os/Bundle;", "defaultArgs", "Landroid/os/Bundle;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "<init>", "()V", "Landroidx/savedstate/SavedStateRegistryOwner;", CardInfo.KEY_OWNER, "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;)V", "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    @Nullable
    private Application application;

    @Nullable
    private Bundle defaultArgs;

    @NotNull
    private final ViewModelProvider.Factory factory;

    @Nullable
    private Lifecycle lifecycle;

    @Nullable
    private SavedStateRegistry savedStateRegistry;

    public SavedStateViewModelFactory() {
        this.factory = new ViewModelProvider.AndroidViewModelFactory();
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends dvq> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) create(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onRequery(@NotNull dvq viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.lifecycle != null) {
            SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
            Intrinsics.checkNotNull(savedStateRegistry);
            Lifecycle lifecycle = this.lifecycle;
            Intrinsics.checkNotNull(lifecycle);
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SavedStateViewModelFactory(@Nullable Application application, @NotNull SavedStateRegistryOwner owner) {
        this(application, owner, null);
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public SavedStateViewModelFactory(@Nullable Application application, @NotNull SavedStateRegistryOwner owner, @Nullable Bundle bundle) {
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.savedStateRegistry = owner.getSavedStateRegistry();
        this.lifecycle = owner.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.INSTANCE.getInstance(application);
        } else {
            androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory();
        }
        this.factory = androidViewModelFactory;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends dvq> T create(@NotNull Class<T> modelClass, @NotNull CreationExtras extras) {
        Constructor constructorFindMatchingConstructor;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str != null) {
            if (extras.get(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) != null && extras.get(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) != null) {
                Application application = (Application) extras.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
                boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
                if (zIsAssignableFrom && application != null) {
                    constructorFindMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE);
                } else {
                    constructorFindMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE);
                }
                if (constructorFindMatchingConstructor == null) {
                    return (T) this.factory.create(modelClass, extras);
                }
                if (zIsAssignableFrom && application != null) {
                    return (T) SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, application, SavedStateHandleSupport.createSavedStateHandle(extras));
                }
                return (T) SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, SavedStateHandleSupport.createSavedStateHandle(extras));
            }
            if (this.lifecycle != null) {
                return (T) create(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @NotNull
    public final <T extends dvq> T create(@NotNull String key, @NotNull Class<T> modelClass) {
        Constructor constructorFindMatchingConstructor;
        T t;
        Application application;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
            if (zIsAssignableFrom && this.application != null) {
                constructorFindMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE);
            } else {
                constructorFindMatchingConstructor = SavedStateViewModelFactoryKt.findMatchingConstructor(modelClass, SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE);
            }
            if (constructorFindMatchingConstructor == null) {
                return this.application != null ? (T) this.factory.create(modelClass) : (T) ViewModelProvider.NewInstanceFactory.INSTANCE.getInstance().create(modelClass);
            }
            SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
            Intrinsics.checkNotNull(savedStateRegistry);
            SavedStateHandleController savedStateHandleControllerCreate = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, key, this.defaultArgs);
            if (zIsAssignableFrom && (application = this.application) != null) {
                Intrinsics.checkNotNull(application);
                t = (T) SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, application, savedStateHandleControllerCreate.getHandle());
            } else {
                t = (T) SavedStateViewModelFactoryKt.newInstance(modelClass, constructorFindMatchingConstructor, savedStateHandleControllerCreate.getHandle());
            }
            t.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerCreate);
            return t;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
