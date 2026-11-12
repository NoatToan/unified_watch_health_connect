package com.huami.bluetooth.profile.channel.encrypt.impl;

import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.encrypt.EncryptApi;
import com.huami.bluetooth.profile.channel.encrypt.EncryptKeyStore;
import com.huami.bluetooth.profile.channel.encrypt.KeyStoreManager;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.network.hmnetwork.utils.a;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.utils.CRCUtilsKt;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/encrypt/impl/EncryptApiImpl;", "Lcom/huami/bluetooth/profile/channel/encrypt/EncryptApi;", "", "data", "", "crc32Value", "", GoogleApiAvailabilityLight.a, "", "sessionId", "c", "src", "key", "b", "a", "encryptData", "dataSize", "decryptData", "", "updateNOnce", "", "keyStoreBriefInfo", "Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "<init>", "(Ljava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class EncryptApiImpl implements EncryptApi {

    @NotNull
    private static final String b = "EncryptApiImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String address;

    public EncryptApiImpl(@NotNull String str) {
        this.address = str;
    }

    private final byte[] a(byte[] src, byte[] key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, a.a);
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        cipher.init(2, secretKeySpec);
        return cipher.doFinal(src);
    }

    private final byte[] b(byte[] src, byte[] key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, a.a);
        Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        return cipher.doFinal(src);
    }

    private final byte[] c(int sessionId) throws Exception {
        EncryptKeyStore keyStore = KeyStoreManager.INSTANCE.getKeyStore(this.address);
        if (keyStore == null) {
            throw new Exception("No encrypt key when generate key");
        }
        byte[] key = keyStore.getKey();
        ArrayList arrayList = new ArrayList(key.length);
        for (byte b2 : key) {
            arrayList.add(Byte.valueOf((byte) (b2 ^ ((byte) sessionId))));
        }
        return CollectionsKt___CollectionsKt.toByteArray(arrayList);
    }

    private final boolean d(byte[] data, long crc32Value) {
        return CRCUtilsKt.getCRC32(data, data.length) == crc32Value;
    }

    @Override // com.huami.bluetooth.profile.channel.encrypt.EncryptApi
    @NotNull
    public byte[] decryptData(int sessionId, int dataSize, @NotNull byte[] data) throws Exception {
        BufByteDecoder bufByteDecoder = new BufByteDecoder(a(data, c(sessionId)), 0, 2, null);
        byte[] bytes = bufByteDecoder.readBytes(dataSize);
        long j = bufByteDecoder.readLong(4);
        if (!d(ArraysKt___ArraysJvmKt.plus(bytes, GattUtils.numberToBytes(j, 4)), bufByteDecoder.readLong(4))) {
            throw new Exception("CRC not match");
        }
        if (bytes.length == 0) {
            throw new Exception("Wrong play load");
        }
        EncryptKeyStore keyStore = KeyStoreManager.INSTANCE.getKeyStore(this.address);
        if (keyStore == null) {
            throw new Exception("No encrypt key when decrypt data");
        }
        if (keyStore.validRemoteNOnce(j)) {
            return bytes;
        }
        throw new Exception("NOnce not valid,may be replay attacks");
    }

    @Override // com.huami.bluetooth.profile.channel.encrypt.EncryptApi
    @NotNull
    public byte[] encryptData(int sessionId, @NotNull byte[] data) throws Exception {
        EncryptKeyStore keyStore = KeyStoreManager.INSTANCE.getKeyStore(this.address);
        if (keyStore == null) {
            throw new Exception("No encrypt key when encrypt data");
        }
        long r0 = keyStore.getR0();
        long cRC32$default = CRCUtilsKt.getCRC32$default(ArraysKt___ArraysJvmKt.plus(data, GattUtils.numberToBytes(r0, 4)), 0, 2, null);
        byte[] bArrC = c(sessionId);
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(data, GattUtils.numberToBytes(r0, 4)), GattUtils.numberToBytes(cRC32$default, 4));
        return b(ArraysKt___ArraysJvmKt.plus(bArrPlus, new byte[(16 - (bArrPlus.length % 16)) % 16]), bArrC);
    }

    @Override // com.huami.bluetooth.profile.channel.encrypt.EncryptApi
    @NotNull
    public String keyStoreBriefInfo() {
        String string;
        EncryptKeyStore keyStore = KeyStoreManager.INSTANCE.getKeyStore(this.address);
        return (keyStore == null || (string = keyStore.toString()) == null) ? "" : string;
    }

    @Override // com.huami.bluetooth.profile.channel.encrypt.EncryptApi
    public void updateNOnce() {
        EncryptKeyStore keyStore = KeyStoreManager.INSTANCE.getKeyStore(this.address);
        if (keyStore == null) {
            return;
        }
        keyStore.updateLocalNOnce();
    }
}
