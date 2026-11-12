package org.koin.bundle;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"defaultExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "koin-core-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CreationExtrasExtKt {
    public static final CreationExtras defaultExtras(ViewModelStoreOwner viewModelStoreOwner) {
        viewModelStoreOwner.getClass();
        return viewModelStoreOwner instanceof y ? ((y) viewModelStoreOwner).getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
    }
}
