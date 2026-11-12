package com.huami.bluetooth.profile.channel.encrypt;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/channel/encrypt/EncryptApi;", "", "", "sessionId", "", "data", "encryptData", "dataSize", "decryptData", "", "updateNOnce", "", "keyStoreBriefInfo", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface EncryptApi {
    @NotNull
    byte[] decryptData(int sessionId, int dataSize, @NotNull byte[] data);

    @NotNull
    byte[] encryptData(int sessionId, @NotNull byte[] data);

    @NotNull
    String keyStoreBriefInfo();

    void updateNOnce();
}
