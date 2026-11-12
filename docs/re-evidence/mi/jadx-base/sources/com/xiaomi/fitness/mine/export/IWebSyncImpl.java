package com.xiaomi.fitness.mine.export;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/mine/export/IWebSyncImpl;", "Lcom/xiaomi/fitness/mine/export/IWebSync;", "<init>", "()V", "onWebSyncAccepted", "", "onWebSyncDenied", "mine-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class IWebSyncImpl implements IWebSync {
    @Override // com.xiaomi.fitness.mine.export.IWebSync
    public void onPrivacyNotAgree() {
        IWebSync.DefaultImpls.onPrivacyNotAgree(this);
    }

    @Override // com.xiaomi.fitness.mine.export.IWebSync
    public void onWebSyncAccepted() {
    }

    @Override // com.xiaomi.fitness.mine.export.IWebSync
    public void onWebSyncDenied() {
    }
}
