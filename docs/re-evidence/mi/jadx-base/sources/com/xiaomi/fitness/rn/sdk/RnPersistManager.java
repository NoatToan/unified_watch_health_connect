package com.xiaomi.fitness.rn.sdk;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.im9;
import defpackage.ush;
import defpackage.vsh;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/rn/sdk/RnPersistManager;", "", "<init>", "()V", "delAllSettingCacheData", "", "deleteDataAfterDeviceRemoved", "model", "", "did", "delDevicePrivacyNativeData", "setNativePrivacyConfirmationVersion", "version", "getNativePrivacyConfirmationVersion", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RnPersistManager {

    @NotNull
    public static final RnPersistManager INSTANCE = new RnPersistManager();

    private RnPersistManager() {
    }

    public final void delAllSettingCacheData() {
        File file = new File(ApplicationExtKt.getApplication().getFilesDir(), "/plugin/install/rn/std-plugin/data");
        Logger.i("RnPersistManager", "delAllSettingCacheData(" + file.getPath() + ")");
        im9.z(file);
    }

    public final void delDevicePrivacyNativeData(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i("RnPersistManager", "delDevicePrivacyNativeData");
        vsh.a(did);
    }

    public final void deleteDataAfterDeviceRemoved(@NotNull String model, @NotNull String did) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i("RnPersistManager", "deleteDataAfterDeviceRemoved");
        ush.a(model, did);
    }

    @Nullable
    public final String getNativePrivacyConfirmationVersion(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        String strB = vsh.b(did);
        Logger.i("RnPersistManager", "getNativePrivacyConfirmationVersion(" + strB + ")");
        return strB;
    }

    public final void setNativePrivacyConfirmationVersion(@NotNull String did, @Nullable String version) {
        Intrinsics.checkNotNullParameter(did, "did");
        Logger.i("RnPersistManager", "setNativePrivacyConfirmationVersion");
        vsh.c(did, version);
    }
}
