package com.xiaomi.fitness.configwifi;

import android.annotation.SuppressLint;
import android.widget.AutoCompleteTextView;
import com.xiaomi.fitness.configwifi.ConfigWifiActivity$loopConfigWifiStatus$1$1;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.electronic.scale.WifiStatusExtKt;
import defpackage.cz7;
import defpackage.f4b;
import defpackage.jz6;
import defpackage.jz7;
import defpackage.u7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"com/xiaomi/fitness/configwifi/ConfigWifiActivity$loopConfigWifiStatus$1$1", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "onSuccess", "", "did", "", "type", "", "result", "Lcom/xiaomi/fitness/eco/device/contact/export/EcoSyncResult;", "onError", "code", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConfigWifiActivity$loopConfigWifiStatus$1$1 implements OnEcoSyncCallback {
    final /* synthetic */ ConfigWifiActivity this$0;

    public ConfigWifiActivity$loopConfigWifiStatus$1$1(ConfigWifiActivity configWifiActivity) {
        this.this$0 = configWifiActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$0(ConfigWifiActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.displaySaveSuccess();
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
    public void onError(String did, int type, int code) {
        ConfigWifiLogExtKt.loge(ConfigWifiActivity.TAG, "loopConfigWifiStatus onError, did: " + did + " , type: " + type + ", code: " + code + " " + WifiPBApi.INSTANCE.toStrErrorCode(code));
    }

    @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
    @SuppressLint({"SetTextI18n"})
    public void onSuccess(String did, int type, EcoSyncResult result) {
        u7r packet;
        cz7 cz7VarP;
        jz7 jz7VarT;
        ConfigWifiLogExtKt.logi(ConfigWifiActivity.TAG, "loopConfigWifiStatus, onSuccess, result" + f4b.c(result));
        if (result == null || (packet = result.getPacket()) == null || (cz7VarP = packet.p()) == null || (jz7VarT = cz7VarP.t()) == null || !WifiStatusExtKt.isConfiguredSuccess(jz7VarT)) {
            return;
        }
        jz6 jz6Var = this.this$0.subscribe;
        if (jz6Var != null) {
            jz6Var.dispose();
        }
        AutoCompleteTextView autoCompleteTextView = this.this$0.ssid;
        if (autoCompleteTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ssid");
            autoCompleteTextView = null;
        }
        final ConfigWifiActivity configWifiActivity = this.this$0;
        autoCompleteTextView.post(new Runnable() { // from class: jd4
            @Override // java.lang.Runnable
            public final void run() {
                ConfigWifiActivity$loopConfigWifiStatus$1$1.onSuccess$lambda$0(configWifiActivity);
            }
        });
    }
}
