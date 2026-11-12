package com.huami.core.device.feature.encrypt.impl;

import com.huami.core.device.feature.encrypt.api.KeyShareApi;
import java.security.SecureRandom;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0086 J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/huami/core/device/feature/encrypt/impl/KeyShareApiImpl;", "Lcom/huami/core/device/feature/encrypt/api/KeyShareApi;", "", "privateKey", "generatePublicKeyExternal", "publicKey", "generatePrivateKeyExternal", "randomKey", "generatePublicKey", "generateSharedSecKey", "<init>", "()V", "Companion", "encrypt_release"}, k = 1, mv = {1, 4, 0})
public final class KeyShareApiImpl implements KeyShareApi {
    public static final int PRV_KEY_SIZE = 24;

    public KeyShareApiImpl() {
        System.loadLibrary("device-encrypt");
    }

    @Nullable
    public final native byte[] generatePrivateKeyExternal(@NotNull byte[] privateKey, @NotNull byte[] publicKey);

    @Override // com.huami.core.device.feature.encrypt.api.KeyShareApi
    @NotNull
    public byte[] generatePublicKey(@NotNull byte[] privateKey) throws Exception {
        byte[] bArrGeneratePublicKeyExternal = generatePublicKeyExternal(privateKey);
        if (bArrGeneratePublicKeyExternal != null) {
            return bArrGeneratePublicKeyExternal;
        }
        throw new Exception("Pub key failed");
    }

    @Nullable
    public final native byte[] generatePublicKeyExternal(@NotNull byte[] privateKey);

    @Override // com.huami.core.device.feature.encrypt.api.KeyShareApi
    @NotNull
    public byte[] generateSharedSecKey(@NotNull byte[] privateKey, @NotNull byte[] publicKey) throws Exception {
        byte[] bArrGeneratePrivateKeyExternal = generatePrivateKeyExternal(privateKey, publicKey);
        if (bArrGeneratePrivateKeyExternal != null) {
            return bArrGeneratePrivateKeyExternal;
        }
        throw new Exception("Share key failed");
    }

    @Override // com.huami.core.device.feature.encrypt.api.KeyShareApi
    @NotNull
    public byte[] randomKey() {
        byte[] bArr = new byte[24];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
