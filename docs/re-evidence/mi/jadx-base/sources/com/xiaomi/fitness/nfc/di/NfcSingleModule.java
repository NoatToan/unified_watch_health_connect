package com.xiaomi.fitness.nfc.di;

import com.xiaomi.fitness.nfc.export.NfcManager;
import com.xiaomi.fitness.nfc.export.NfcManagerImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/nfc/di/NfcSingleModule;", "", "<init>", "()V", "bindDeviceManager", "Lcom/xiaomi/fitness/nfc/export/NfcManager;", "nfcManager", "Lcom/xiaomi/fitness/nfc/export/NfcManagerImpl;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NfcSingleModule {
    @NotNull
    public abstract NfcManager bindDeviceManager(@NotNull NfcManagerImpl nfcManager);
}
