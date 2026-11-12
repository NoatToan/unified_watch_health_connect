package com.xiaomi.fitness.eco.device.model.api;

import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import defpackage.sh7;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b&\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013Jm\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceManagerWrapper;", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceManager;", "", "mac", "model", "bleName", "oob", "shareId", "shareUserId", "shareDid", "shareModel", "Lsh7;", "callback", "", "bindDevice", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsh7;)V", "cancelBind", "(Ljava/lang/String;)V", "<init>", "()V", "Companion", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public abstract class EcoDeviceManagerWrapper extends EcoDeviceManager {
    public static /* synthetic */ void bindDevice$default(EcoDeviceManagerWrapper ecoDeviceManagerWrapper, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, sh7 sh7Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindDevice");
        }
        ecoDeviceManagerWrapper.bindDevice(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, sh7Var);
    }

    public abstract void bindDevice(@NotNull String mac, @NotNull String model, @Nullable String bleName, @Nullable String oob, @Nullable String shareId, @Nullable String shareUserId, @Nullable String shareDid, @Nullable String shareModel, @NotNull sh7 callback);

    public abstract void cancelBind(@NotNull String mac);
}
