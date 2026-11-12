package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import com.miui.tsmclient.entity.CardInfo;
import defpackage.dvq;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\b\u001a\u00028\u0000\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0005*\u00020\u0007H\u0087\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/ViewModelStoreOwner;", CardInfo.KEY_OWNER, "Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultCreationExtras", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/viewmodel/CreationExtras;", "Ldvq;", "VM", "Landroidx/lifecycle/ViewModelProvider;", "get", "(Landroidx/lifecycle/ViewModelProvider;)Ldvq;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "ViewModelProviderGetKt")
public final class ViewModelProviderGetKt {
    @NotNull
    public static final CreationExtras defaultCreationExtras(@NotNull ViewModelStoreOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
    }

    public static final /* synthetic */ <VM extends dvq> VM get(ViewModelProvider viewModelProvider) {
        Intrinsics.checkNotNullParameter(viewModelProvider, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        return (VM) viewModelProvider.get(dvq.class);
    }
}
