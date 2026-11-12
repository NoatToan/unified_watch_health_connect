package defpackage;

import com.miui.circulate.api.bean.ResponseParam;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;

/* JADX INFO: loaded from: classes.dex */
public interface yw3 {
    void anyProtocolInitFail(int i);

    void anyProtocolInitSuccess(int i);

    void initFail(ResponseParam responseParam);

    void initSuccess();

    void onConnectStateChange(int i, CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo);

    default void onDiscoveryStateChange(int i) {
    }

    void onServiceFound(CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo);

    void onServiceLost(CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo);

    void onServiceUpdate(CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo);
}
