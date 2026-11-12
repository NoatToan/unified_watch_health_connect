package org.koin.bundle;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.m1;
import androidx.lifecycle.viewmodel.CreationExtras;
import e23.a;
import nd.e;
import o13.q;
import org.koin.core.annotation.KoinInternalApi;
import p005kotlin.Metadata;
import z41.j;

/* JADX INFO: renamed from: org.koin.viewmodel.BundleExtKt, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00000\u0006j\u0002`\u0007¢\u0006\u0004\b\b\u0010\t*\u0016\u0010\n\"\b\u0012\u0004\u0012\u00020\u00000\u00062\b\u0012\u0004\u0012\u00020\u00000\u0006¨\u0006\u000b"}, d2 = {"Landroidx/core/bundle/Bundle;", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "Landroidx/lifecycle/viewmodel/CreationExtras;", "toExtras", "(Landroidx/core/bundle/Bundle;Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/viewmodel/CreationExtras;", "Lkotlin/Function0;", "Lorg/koin/viewmodel/BundleDefinition;", "emptyState", "()Le23/a;", "BundleDefinition", "koin-core-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class Bundle {
    public static final a<androidx.core.bundle.Bundle> emptyState() {
        return new j(15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.core.bundle.Bundle emptyState$lambda$2() {
        return new androidx.core.bundle.Bundle();
    }

    @KoinInternalApi
    public static final CreationExtras toExtras(androidx.core.bundle.Bundle bundle, ViewModelStoreOwner viewModelStoreOwner) {
        Object bVar;
        bundle.getClass();
        viewModelStoreOwner.getClass();
        if (bundle.keySet().isEmpty()) {
            return null;
        }
        try {
            int i14 = q.f128596b;
            androidx.lifecycle.viewmodel.a aVar = new androidx.lifecycle.viewmodel.a(null, 1, null);
            aVar.b(m1.f7962c, bundle);
            aVar.b(m1.f7961b, viewModelStoreOwner);
            aVar.b(m1.f7960a, (e) viewModelStoreOwner);
            bVar = aVar;
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            bVar = new q.b(th3);
        }
        return (CreationExtras) (bVar instanceof q.b ? null : bVar);
    }
}
