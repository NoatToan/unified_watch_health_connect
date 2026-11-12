package defpackage;

import android.os.Bundle;
import com.huawei.health.device.api.EventBusApi;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.devicemgr.api.constant.ExecuteMode;
import com.huawei.hmf.annotation.ApiDefine;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = EventBusApi.class)
public class fmw implements EventBusApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static EventBus.ICallback f34270b = new EventBus.ICallback() { // from class: fmw.1
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            if ("sub_am16_bind_success".equals(dVar.e())) {
                ecu.d().executeDeviceRelatedLogic(ExecuteMode.FORCE_INIT_PHONE_SERVICE, null, "EventBusImpl");
            } else {
                LogUtil.d("EventBusImpl", "event.getAction() is not am16 bind success");
            }
        }
    };

    @Override // com.huawei.health.device.api.EventBusApi
    public void publishDeviceDownMsg() {
        LogUtil.a("EventBusImpl", "publishDeviceDownMsg");
        EventBus.a(new EventBus.d("device_download_dialog"));
    }

    @Override // com.huawei.health.device.api.EventBusApi
    public void publishSingleDeviceDownMsg() {
        LogUtil.a("EventBusImpl", "publishSingleDeviceDownMsg");
        EventBus.a(new EventBus.d("single_device_download_dialog"));
    }

    @Override // com.huawei.health.device.api.EventBusApi
    public void subscribeAm16Bind() {
        EventBus.b(f34270b, 0, "sub_am16_bind_success");
    }

    @Override // com.huawei.health.device.api.EventBusApi
    public void publishHmsLoginState(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("sign_account_hms_login_state_key", str);
        EventBus.a(new EventBus.d("sign_account_hms_login_state_action", bundle));
    }
}
