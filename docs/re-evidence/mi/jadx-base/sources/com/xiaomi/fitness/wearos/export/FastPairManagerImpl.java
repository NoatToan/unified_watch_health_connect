package com.xiaomi.fitness.wearos.export;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.mibi.sdk.component.params.SdkContants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0005H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/wearos/export/FastPairManagerImpl;", "Lcom/xiaomi/fitness/wearos/export/FastPairManager;", "<init>", "()V", "fastPairExtras", "Landroid/os/Bundle;", "saveFastPairingExtra", "", "intent", "Landroid/content/Intent;", "maybeStartFastPairing", "context", "Landroid/content/Context;", "productId", "", "productName", "", "getFastPairExtras", "removeFastPairExtras", "saveToPendingSetup", "extras", "cacheOrProcessFastPairBundle", SdkContants.KEY_BUNDLE, "wearos_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FastPairManagerImpl implements FastPairManager {

    @Nullable
    private Bundle fastPairExtras;

    private final void cacheOrProcessFastPairBundle(Bundle bundle) {
    }

    private final void saveToPendingSetup(Bundle extras) {
    }

    @Override // com.xiaomi.fitness.wearos.export.FastPairManager
    @Nullable
    public Bundle getFastPairExtras() {
        return this.fastPairExtras;
    }

    @Override // com.xiaomi.fitness.wearos.export.FastPairManager
    public void maybeStartFastPairing(@NotNull Context context, int productId, @NotNull String productName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productName, "productName");
    }

    @Override // com.xiaomi.fitness.wearos.export.FastPairManager
    public void removeFastPairExtras() {
        this.fastPairExtras = null;
    }

    @Override // com.xiaomi.fitness.wearos.export.FastPairManager
    public void saveFastPairingExtra(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
    }
}
