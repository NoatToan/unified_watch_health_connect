package com.huawei.health.ecologydevice.kit.blp;

import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.ecologydevice.callback.ConnectStatusCallback;
import com.huawei.health.ecologydevice.callback.DataChangedCallback;
import com.huawei.health.ecologydevice.callback.NfcMeasureCallback;
import defpackage.efd;
import defpackage.eff;
import defpackage.eij;
import defpackage.emk;
import defpackage.ete;
import health.compact.a.Services;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseBloodPressureManager implements ConnectStatusCallback, DataChangedCallback {
    private String mMessageReceiveCallbackId;

    public boolean init(NfcMeasureCallback nfcMeasureCallback) {
        if (!ete.d().b()) {
            return false;
        }
        this.mMessageReceiveCallbackId = UUID.randomUUID().toString();
        String name = BaseBloodPressureManager.class.getName();
        ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).putUdsClassMap(name, eij.c());
        emk.c().d(this.mMessageReceiveCallbackId, new eff(name));
        emk.c().c(this.mMessageReceiveCallbackId, new efd(name));
        return false;
    }

    public void releaseResource() {
        if (ete.d().b()) {
            emk.c().b(this.mMessageReceiveCallbackId);
            emk.c().a(this.mMessageReceiveCallbackId);
            ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).clearUdsClassMap();
        }
    }
}
