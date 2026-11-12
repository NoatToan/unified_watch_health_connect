package androidx.p008lifecycle;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModel;
import androidx.p012savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.ViewModelParameter;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J7\u0010\u000e\u001a\u00028\u0001\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0011\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/StateViewModelFactory;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "addHandle", "", "key", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/scope/Scope;", "scope", "Lorg/koin/core/scope/Scope;", "getScope", "()Lorg/koin/core/scope/Scope;", "Lorg/koin/androidx/viewmodel/ViewModelParameter;", "parameters", "Lorg/koin/androidx/viewmodel/ViewModelParameter;", "getParameters", "()Lorg/koin/androidx/viewmodel/ViewModelParameter;", "<init>", "(Lorg/koin/core/scope/Scope;Lorg/koin/androidx/viewmodel/ViewModelParameter;)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public final class StateViewModelFactory<T extends ViewModel> extends AbstractSavedStateViewModelFactory {

    @NotNull
    private final ViewModelParameter<T> parameters;

    @NotNull
    private final Scope scope;

    /* JADX WARN: Illegal instructions before constructor call */
    public StateViewModelFactory(@NotNull Scope scope, @NotNull ViewModelParameter<T> viewModelParameter) {
        SavedStateRegistryOwner registryOwner = viewModelParameter.getRegistryOwner();
        if (registryOwner == null) {
            throw new IllegalStateException("Can't create SavedStateViewModelFactory without a proper stateRegistryOwner".toString());
        }
        Function0<Bundle> state = viewModelParameter.getState();
        super(registryOwner, state == null ? null : state.invoke());
        this.scope = scope;
        this.parameters = viewModelParameter;
    }

    private final Function0<ParametersHolder> addHandle(final SavedStateHandle handle) {
        Function0<ParametersHolder> parameters = this.parameters.getParameters();
        final ParametersHolder parametersHolderInvoke = parameters == null ? null : parameters.invoke();
        if (parametersHolderInvoke == null) {
            parametersHolderInvoke = ParametersHolderKt.emptyParametersHolder();
        }
        return new Function0<ParametersHolder>() { // from class: androidx.lifecycle.StateViewModelFactory.addHandle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ParametersHolder invoke() {
                return parametersHolderInvoke.add(handle);
            }
        };
    }

    @Override // androidx.p008lifecycle.AbstractSavedStateViewModelFactory
    @NotNull
    public <T extends ViewModel> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull SavedStateHandle handle) {
        return (T) this.scope.get(this.parameters.getClazz(), this.parameters.getQualifier(), addHandle(handle));
    }

    @NotNull
    public final ViewModelParameter<T> getParameters() {
        return this.parameters;
    }

    @NotNull
    public final Scope getScope() {
        return this.scope;
    }
}
