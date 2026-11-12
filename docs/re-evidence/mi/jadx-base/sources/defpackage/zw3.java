package defpackage;

import com.miui.circulate.api.bean.ResponseParam;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;

/* JADX INFO: loaded from: classes.dex */
public interface zw3 {
    void a(int i, CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo);

    void b(int i, ResponseParam responseParam);

    void c(int i);

    void d(int i, CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo);

    void e(int i, CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo);

    void onConnectStateChange(int i, CirculateDeviceInfo circulateDeviceInfo, CirculateServiceInfo circulateServiceInfo);
}
