package com.xiaomi.eco.api;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.gson.Gson;
import com.xiaomi.eco.EcoApiCallConfig;
import com.xiaomi.eco.api.bean.EcoConnectDeviceInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.onetrack.c.q;
import defpackage.wrc;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 '2\u00020\u0001:\u0002('B\t\b\u0002¢\u0006\u0004\b%\u0010&J=\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/xiaomi/eco/api/EcoApiCallManager;", "", "", "mac", "did", "", "isDeviceOwner", "Lcom/xiaomi/eco/api/bean/EcoConnectDeviceInfo;", "product", "Lwrc;", "callback", "Lcom/xiaomi/eco/api/a;", "createEcoApiCall", "(Ljava/lang/String;Ljava/lang/String;ZLcom/xiaomi/eco/api/bean/EcoConnectDeviceInfo;Lwrc;)Lcom/xiaomi/eco/api/a;", "isConnectActive", "(Ljava/lang/String;)Z", "coreId", "deviceInfo", "fetchEcoApiCall", "getEcoApiCall", "(Ljava/lang/String;)Lcom/xiaomi/eco/api/a;", "apiCall", "", "updateEcoApiCall", "(Ljava/lang/String;Lcom/xiaomi/eco/api/a;)V", "destroyEcoCall", "(Ljava/lang/String;)V", "Landroid/util/ArrayMap;", "mEcoApiCallMap", "Landroid/util/ArrayMap;", "Lcom/xiaomi/eco/EcoApiCallConfig;", "mEcoApiCallConfig", "Lcom/xiaomi/eco/EcoApiCallConfig;", "getMEcoApiCallConfig", "()Lcom/xiaomi/eco/EcoApiCallConfig;", "setMEcoApiCallConfig", "(Lcom/xiaomi/eco/EcoApiCallConfig;)V", "<init>", "()V", "Companion", "Holder", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0})
public final class EcoApiCallManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "EcoApiCallManager";
    public EcoApiCallConfig mEcoApiCallConfig;

    @NotNull
    private final ArrayMap<String, a<?>> mEcoApiCallMap;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/eco/api/EcoApiCallManager$Companion;", "", "<init>", "()V", "TAG", "", "get", "Lcom/xiaomi/eco/api/EcoApiCallManager;", q.f13857a, "", "Lcom/xiaomi/eco/EcoApiCallConfig;", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void config(@NotNull EcoApiCallConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            get().setMEcoApiCallConfig(config);
        }

        @JvmStatic
        @NotNull
        public final EcoApiCallManager get() {
            return Holder.INSTANCE.getINSTANCE();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\b\n\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/eco/api/EcoApiCallManager$Holder;", "", "<init>", "()V", "TAG", "", "INSTANCE", "Lcom/xiaomi/eco/api/EcoApiCallManager;", "getINSTANCE", "()Lcom/xiaomi/eco/api/EcoApiCallManager;", "INSTANCE$1", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Holder {

        @NotNull
        public static final Holder INSTANCE = new Holder();

        /* JADX INFO: renamed from: INSTANCE$1, reason: from kotlin metadata */
        @NotNull
        private static final EcoApiCallManager INSTANCE = new EcoApiCallManager(null);

        @NotNull
        private static final String TAG = "EcoApiCallManager";

        private Holder() {
        }

        @NotNull
        public final EcoApiCallManager getINSTANCE() {
            return INSTANCE;
        }
    }

    public /* synthetic */ EcoApiCallManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final a<?> createEcoApiCall(String mac, String did, boolean isDeviceOwner, EcoConnectDeviceInfo product, wrc callback) {
        i iVar = new i(did, mac, isDeviceOwner, product, callback);
        Logger.i(TAG, "createEcoApiCall() called with: mac = " + mac + ", did = " + did + ", product = " + new Gson().toJson(product) + ", callback = " + callback + ", call = " + iVar);
        if (!TextUtils.isEmpty(did)) {
            this.mEcoApiCallMap.put(did, iVar);
        }
        return iVar;
    }

    @JvmStatic
    @NotNull
    public static final EcoApiCallManager get() {
        return INSTANCE.get();
    }

    public final void destroyEcoCall(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i(TAG, "destroyCall: remove " + did + ", " + (this.mEcoApiCallMap.remove(did) != null ? "success" : "fail"));
    }

    @NotNull
    public final a<?> fetchEcoApiCall(@NotNull String coreId, @NotNull String did, boolean isDeviceOwner, @NotNull EcoConnectDeviceInfo deviceInfo, @Nullable wrc callback) {
        Intrinsics.checkNotNullParameter(coreId, "coreId");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Logger.d(TAG, "getEcoApiCall() called with: mac = [" + coreId + "], did = [" + did + "], product = [" + new Gson().toJson(deviceInfo) + "]");
        if (did.length() <= 0 || !this.mEcoApiCallMap.containsKey(did)) {
            return createEcoApiCall(coreId, did, isDeviceOwner, deviceInfo, callback);
        }
        Logger.d(TAG, "getEcoApiCall() user cache " + did);
        a<?> aVar = this.mEcoApiCallMap.get(did);
        Intrinsics.checkNotNull(aVar);
        a<?> aVar2 = aVar;
        if (aVar2.mCallback != null) {
            return aVar2;
        }
        aVar2.mCallback = callback;
        return aVar2;
    }

    @Nullable
    public final a<?> getEcoApiCall(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return this.mEcoApiCallMap.get(did);
    }

    @NotNull
    public final EcoApiCallConfig getMEcoApiCallConfig() {
        EcoApiCallConfig ecoApiCallConfig = this.mEcoApiCallConfig;
        if (ecoApiCallConfig != null) {
            return ecoApiCallConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mEcoApiCallConfig");
        return null;
    }

    public final boolean isConnectActive(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        return getMEcoApiCallConfig().isConnectActive(did);
    }

    public final void setMEcoApiCallConfig(@NotNull EcoApiCallConfig ecoApiCallConfig) {
        Intrinsics.checkNotNullParameter(ecoApiCallConfig, "<set-?>");
        this.mEcoApiCallConfig = ecoApiCallConfig;
    }

    public final void updateEcoApiCall(@NotNull String did, @NotNull a<?> apiCall) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(apiCall, "apiCall");
        this.mEcoApiCallMap.put(did, apiCall);
    }

    private EcoApiCallManager() {
        this.mEcoApiCallMap = new ArrayMap<>();
    }
}
