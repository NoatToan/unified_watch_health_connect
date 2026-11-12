package com.xiaomi.fitness.mine.export;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/mine/export/IWebSync;", "", "onWebSyncAccepted", "", "onWebSyncDenied", "onPrivacyNotAgree", "mine-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IWebSync {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onPrivacyNotAgree(@NotNull IWebSync iWebSync) {
        }
    }

    void onPrivacyNotAgree();

    void onWebSyncAccepted();

    void onWebSyncDenied();
}
