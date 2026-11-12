package com.xiaomi.fitness.aivs.capability;

import android.net.wifi.WifiManager;
import com.xiaomi.ai.android.capability.ConnectionCapability;
import com.xiaomi.fitness.aivs.base.BaseAivsService;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/aivs/capability/ConnectionCapabilityImpl;", "Lcom/xiaomi/ai/android/capability/ConnectionCapability;", "did", "", "<init>", "(Ljava/lang/String;)V", "getDid", "()Ljava/lang/String;", "onConnected", "", "onDisconnected", "onGetSSID", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConnectionCapabilityImpl extends ConnectionCapability {

    @NotNull
    private final String did;

    public ConnectionCapabilityImpl(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        this.did = did;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    @Override // com.xiaomi.ai.android.capability.ConnectionCapability
    public void onConnected() {
        Logger.e(BaseAivsService.TAG, this.did + " onConnected");
    }

    @Override // com.xiaomi.ai.android.capability.ConnectionCapability
    public void onDisconnected() {
        Logger.e(BaseAivsService.TAG, this.did + " onDisconnected");
    }

    @Override // com.xiaomi.ai.android.capability.ConnectionCapability
    @Nullable
    public String onGetSSID() {
        if (NetUtil.INSTANCE.getNetWorkState(AppUtil.getApp()) != 1) {
            return null;
        }
        Object systemService = AppUtil.getApp().getApplicationContext().getSystemService("wifi");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return ((WifiManager) systemService).getConnectionInfo().getSSID();
    }
}
