package androidx.fragment.app;

import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldvq;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class FragmentViewModelLazyKt$viewModels$owner$2 extends Lambda implements Function0<ViewModelStoreOwner> {
    final /* synthetic */ Function0<ViewModelStoreOwner> $ownerProducer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewModelLazyKt$viewModels$owner$2(Function0<? extends ViewModelStoreOwner> function0) {
        super(0);
        this.$ownerProducer = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ViewModelStoreOwner invoke() {
        return this.$ownerProducer.invoke();
    }
}
