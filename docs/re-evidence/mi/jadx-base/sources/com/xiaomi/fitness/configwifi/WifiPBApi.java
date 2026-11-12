package com.xiaomi.fitness.configwifi;

import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.electronic.scale.OTALogExtKt;
import defpackage.cz7;
import defpackage.dz7;
import defpackage.ez7;
import defpackage.f4b;
import defpackage.hz7;
import defpackage.u7r;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000bJ*\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\n\u0010\u0011\u001a\u00020\u0007*\u00020\u0012¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/configwifi/WifiPBApi;", "", "<init>", "()V", "configWifi", "", "did", "", "ssidStr", "passwordStr", "onSyncCallback", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "configWifiExtra", "uid", "bindKey", "getWifi", "restoreWifi", "toStrErrorCode", "", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WifiPBApi {

    @NotNull
    public static final WifiPBApi INSTANCE = new WifiPBApi();

    private WifiPBApi() {
    }

    public final void configWifi(@NotNull String did, @Nullable String ssidStr, @Nullable String passwordStr, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 33;
        u7rVar.f = 4;
        u7rVar.A(new cz7());
        u7rVar.p().v(new dz7());
        u7rVar.p().o().c = ssidStr;
        u7rVar.p().o().d = passwordStr;
        OTALogExtKt.logi("MainViewModel", "configWifi, modifyWifi: " + f4b.c(u7rVar.p().o()));
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, onSyncCallback, 2000);
    }

    public final void configWifiExtra(@NotNull String did, @Nullable String uid, @Nullable String bindKey, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 33;
        u7rVar.f = 5;
        u7rVar.A(new cz7());
        u7rVar.p().w(new ez7());
        u7rVar.p().p().c = uid;
        u7rVar.p().p().d = bindKey;
        u7rVar.p().p().f = TimeZone.getDefault().getID();
        u7rVar.p().p().e = "";
        OTALogExtKt.logi("MainViewModel", "configWifi, netConfig: " + f4b.c(u7rVar.p().p()));
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, onSyncCallback, (int) TimeUnit.MINUTES.toMillis(30L));
    }

    public final void getWifi(@NotNull String did, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 33;
        u7rVar.f = 2;
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, onSyncCallback, 2000);
    }

    public final void restoreWifi(@NotNull String did, @NotNull OnEcoSyncCallback onSyncCallback) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(onSyncCallback, "onSyncCallback");
        u7r u7rVar = new u7r();
        u7rVar.e = 33;
        u7rVar.f = 30;
        u7rVar.A(new cz7());
        u7rVar.p().x(new hz7());
        u7rVar.p().s().c = 1;
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).call(did, u7rVar, true, onSyncCallback, 2000);
    }

    @NotNull
    public final String toStrErrorCode(int i) {
        if (i == -4) {
            return "EcoApiConstants.RESULT_BUSY";
        }
        if (i == -3) {
            return "EcoApiConstants.RESULT_DISCONNECTED";
        }
        if (i != -2) {
            return i != -1 ? String.valueOf(i) : "EcoApiConstants.RESULT_TIMEOUT";
        }
        return "EcoApiConstants.RESULT_FAILED";
    }
}
