package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import defpackage.dvq;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "Ldvq;", "VM", "Lkotlin/Lazy;", "", "isInitialized", "()Z", "Lkotlin/reflect/KClass;", "viewModelClass", "Lkotlin/reflect/KClass;", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "Lkotlin/jvm/functions/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "cached", "Ldvq;", "getValue", "()Ldvq;", "value", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public final class ViewModelLazy<VM extends dvq> implements Lazy<VM> {

    @Nullable
    private VM cached;

    @NotNull
    private final Function0<CreationExtras> extrasProducer;

    @NotNull
    private final Function0<ViewModelProvider.Factory> factoryProducer;

    @NotNull
    private final Function0<ViewModelStore> storeProducer;

    @NotNull
    private final KClass<VM> viewModelClass;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ViewModelLazy(@NotNull KClass<VM> viewModelClass, @NotNull Function0<? extends ViewModelStore> storeProducer, @NotNull Function0<? extends ViewModelProvider.Factory> factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.cached != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ViewModelLazy(@NotNull KClass<VM> viewModelClass, @NotNull Function0<? extends ViewModelStore> storeProducer, @NotNull Function0<? extends ViewModelProvider.Factory> factoryProducer, @NotNull Function0<? extends CreationExtras> extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // kotlin.Lazy
    @NotNull
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(JvmClassMappingKt.getJavaClass((KClass) this.viewModelClass));
        this.cached = vm2;
        return vm2;
    }

    public /* synthetic */ ViewModelLazy(KClass kClass, Function0 function0, Function0 function1, Function0 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, function0, function1, (i & 8) != 0 ? new Function0<CreationExtras.Empty>() { // from class: androidx.lifecycle.ViewModelLazy.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras.Empty invoke() {
                return CreationExtras.Empty.INSTANCE;
            }
        } : function2);
    }
}
