package com.huami.bluetooth.profile.channel.encrypt;

import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.moving.ui.utils.SportAnalytics;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004R\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/encrypt/KeyStoreManager;", "", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/huami/bluetooth/profile/channel/encrypt/EncryptKeyStore;", "getKeyStore", "keyStore", "", "updateKeyStore", "Ljava/util/concurrent/ConcurrentHashMap;", "a", "Ljava/util/concurrent/ConcurrentHashMap;", SportAnalytics.ParamValue.MapButtonType.MAP, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class KeyStoreManager {

    @NotNull
    public static final KeyStoreManager INSTANCE = new KeyStoreManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final ConcurrentHashMap<String, EncryptKeyStore> map = new ConcurrentHashMap<>();

    private KeyStoreManager() {
    }

    @Nullable
    public final EncryptKeyStore getKeyStore(@NotNull String address) {
        return map.get(address);
    }

    public final void updateKeyStore(@NotNull String address, @NotNull EncryptKeyStore keyStore) {
        Debug.fi("KeyStoreManager", "Update key store while auth success");
        map.put(address, keyStore);
    }
}
