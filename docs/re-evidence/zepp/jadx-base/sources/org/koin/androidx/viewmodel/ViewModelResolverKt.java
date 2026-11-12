package org.koin.androidx.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.StateViewModelFactory;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.factory.DefaultViewModelFactory;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a$\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¨\u0006\n"}, d2 = {"Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModelProvider;", "Lorg/koin/androidx/viewmodel/ViewModelParameter;", "viewModelParameters", "resolveInstance", "(Landroidx/lifecycle/ViewModelProvider;Lorg/koin/androidx/viewmodel/ViewModelParameter;)Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/scope/Scope;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "pickFactory", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class ViewModelResolverKt {
    @NotNull
    public static final <T extends ViewModel> ViewModelProvider.Factory pickFactory(@NotNull Scope scope, @NotNull ViewModelParameter<T> viewModelParameter) {
        return viewModelParameter.getRegistryOwner() != null ? new StateViewModelFactory(scope, viewModelParameter) : new DefaultViewModelFactory(scope, viewModelParameter);
    }

    @NotNull
    public static final <T extends ViewModel> T resolveInstance(@NotNull ViewModelProvider viewModelProvider, @NotNull ViewModelParameter<T> viewModelParameter) {
        Class<T> javaClass = JvmClassMappingKt.getJavaClass((KClass) viewModelParameter.getClazz());
        return viewModelParameter.getQualifier() != null ? (T) viewModelProvider.get(viewModelParameter.getQualifier().toString(), javaClass) : (T) viewModelProvider.get(javaClass);
    }
}
