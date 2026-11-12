package com.huami.device.core.sync.api;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/huami/device/core/sync/api/Interruptable;", "", "", "interrupt", "", "isInterrupted", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public interface Interruptable {
    void interrupt();

    boolean isInterrupted();
}
