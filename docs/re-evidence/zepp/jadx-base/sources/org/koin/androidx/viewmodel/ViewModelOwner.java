package org.koin.androidx.viewmodel;

import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lorg/koin/androidx/viewmodel/ViewModelOwner;", "", "Landroidx/lifecycle/ViewModelStore;", "a", "Landroidx/lifecycle/ViewModelStore;", "getStore", "()Landroidx/lifecycle/ViewModelStore;", "store", "Landroidx/savedstate/SavedStateRegistryOwner;", "b", "Landroidx/savedstate/SavedStateRegistryOwner;", "getStateRegistry", "()Landroidx/savedstate/SavedStateRegistryOwner;", "stateRegistry", "<init>", "(Landroidx/lifecycle/ViewModelStore;Landroidx/savedstate/SavedStateRegistryOwner;)V", "Companion", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public final class ViewModelOwner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ViewModelStore store;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final SavedStateRegistryOwner stateRegistry;

    public ViewModelOwner(@NotNull ViewModelStore viewModelStore, @Nullable SavedStateRegistryOwner savedStateRegistryOwner) {
        this.store = viewModelStore;
        this.stateRegistry = savedStateRegistryOwner;
    }

    @Nullable
    public final SavedStateRegistryOwner getStateRegistry() {
        return this.stateRegistry;
    }

    @NotNull
    public final ViewModelStore getStore() {
        return this.store;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001¨\u0006\f"}, d2 = {"Lorg/koin/androidx/viewmodel/ViewModelOwner$Companion;", "", "Landroidx/lifecycle/ViewModelStoreOwner;", "storeOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "stateRegistry", "Lorg/koin/androidx/viewmodel/ViewModelOwner;", "from", DataCacher.o, "fromAny", "<init>", "()V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ViewModelOwner from$default(Companion companion, ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner, int i, Object obj) {
            if ((i & 2) != 0) {
                savedStateRegistryOwner = null;
            }
            return companion.from(viewModelStoreOwner, savedStateRegistryOwner);
        }

        @NotNull
        public final ViewModelOwner from(@NotNull ViewModelStoreOwner storeOwner, @Nullable SavedStateRegistryOwner stateRegistry) {
            return new ViewModelOwner(storeOwner.getViewModelStore(), stateRegistry);
        }

        @NotNull
        public final ViewModelOwner fromAny(@NotNull Object owner) {
            return new ViewModelOwner(((ViewModelStoreOwner) owner).getViewModelStore(), owner instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) owner : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final ViewModelOwner from(@NotNull ViewModelStoreOwner storeOwner) {
            return new ViewModelOwner(storeOwner.getViewModelStore(), null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ ViewModelOwner(ViewModelStore viewModelStore, SavedStateRegistryOwner savedStateRegistryOwner, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStore, (i & 2) != 0 ? null : savedStateRegistryOwner);
    }
}
