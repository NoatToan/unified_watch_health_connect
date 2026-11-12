package com.huami.core.device.feature.encrypt.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/huami/core/device/feature/encrypt/api/KeyShareApi;", "", "", "randomKey", "privateKey", "generatePublicKey", "publicKey", "generateSharedSecKey", "encrypt_release"}, k = 1, mv = {1, 4, 0})
public interface KeyShareApi {
    @NotNull
    byte[] generatePublicKey(@NotNull byte[] privateKey);

    @NotNull
    byte[] generateSharedSecKey(@NotNull byte[] privateKey, @NotNull byte[] publicKey);

    @NotNull
    byte[] randomKey();
}
