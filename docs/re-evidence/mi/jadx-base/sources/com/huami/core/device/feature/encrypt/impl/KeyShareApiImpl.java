package com.huami.core.device.feature.encrypt.impl;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.security.SecureRandom;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0086 J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/core/device/feature/encrypt/impl/KeyShareApiImpl;", "", "", "privateKey", "generatePublicKeyExternal", "publicKey", "generatePrivateKeyExternal", PluginDeviceInfo.FMODEL, "<init>", "()V", "encrypt_release"}, k = 1, mv = {1, 4, 0})
public final class KeyShareApiImpl {
    public KeyShareApiImpl() {
        System.loadLibrary("device-encrypt");
    }

    @NotNull
    public byte[] a() {
        byte[] bArr = new byte[24];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    @Nullable
    public final native byte[] generatePrivateKeyExternal(@NotNull byte[] privateKey, @NotNull byte[] publicKey);

    @Nullable
    public final native byte[] generatePublicKeyExternal(@NotNull byte[] privateKey);

    @NotNull
    public byte[] a(@NotNull byte[] privateKey) throws Exception {
        byte[] bArrGeneratePublicKeyExternal = generatePublicKeyExternal(privateKey);
        if (bArrGeneratePublicKeyExternal != null) {
            return bArrGeneratePublicKeyExternal;
        }
        throw new Exception("Pub key failed");
    }

    @NotNull
    public byte[] a(@NotNull byte[] privateKey, @NotNull byte[] publicKey) throws Exception {
        byte[] bArrGeneratePrivateKeyExternal = generatePrivateKeyExternal(privateKey, publicKey);
        if (bArrGeneratePrivateKeyExternal != null) {
            return bArrGeneratePrivateKeyExternal;
        }
        throw new Exception("Share key failed");
    }
}
