package com.xiaomi.fitness.device.contact.export;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "onError", "code", "device-contact-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OnSyncCallback {
    void onError(@Nullable String did, int type, int code);

    void onSuccess(@Nullable String did, int type, @Nullable SyncResult result);
}
