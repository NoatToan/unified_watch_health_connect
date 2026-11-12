package com.huawei.hms.network.netdiag;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import com.huawei.hms.network.embedded.o4;
import com.huawei.hms.network.embedded.p4;
import com.huawei.hms.network.embedded.t5;
import com.huawei.hms.network.embedded.w4;
import com.huawei.hms.network.embedded.x5;
import com.huawei.hms.network.embedded.y4;
import com.huawei.hms.network.embedded.z4;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.inner.api.NetDiagnosisNetworkService;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import com.huawei.hms.network.netdiag.qoe.QoeMetrics;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class NetDiagnosisService extends NetDiagnosisNetworkService {
    public static final String TAG = "NetDiagnosisService";

    @Override // com.huawei.hms.network.inner.api.InterceptorNetworkService
    public boolean isNetworkInterceptor() {
        return true;
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public void onDestroy(Context context) {
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public void serviceOptions(Map<String, String> map) {
        String str = map.get(PolicyNetworkService.GlobalConstants.ENABLE_DETECT_WITH_HTTP);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        p4.f().b(Boolean.parseBoolean(str));
    }

    @Override // com.huawei.hms.network.inner.api.NetDiagnosisNetworkService
    public void requestThirdMetrics(String str) {
        p4.f().a(str);
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public void onCreate(Context context, Bundle bundle) {
        p4.f().a(context);
    }

    @Override // com.huawei.hms.network.inner.api.NetDiagnosisNetworkService
    public boolean networkUnavailable(long j, long j2) {
        return p4.f().b(j, j2);
    }

    @Override // com.huawei.hms.network.inner.api.NetDiagnosisNetworkService
    public Map<String, String> getWebsocketNetworkData(long j, long j2) {
        z4 z4VarA = p4.f().a(j, j2);
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        if (z4VarA == null) {
            return linkedHashMapPack.getAll();
        }
        linkedHashMapPack.put("network_changed", z4VarA.h()).put("mobile_signal_strength", z4VarA.c().getMobileSignalStrength()).put("wifi_signal_strength", z4VarA.c().getWifiSignalStrength());
        return linkedHashMapPack.getAll();
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public String getVersion() {
        return "8.0.1.320";
    }

    @Override // com.huawei.hms.network.inner.api.NetDiagnosisNetworkService
    public Map<String, String> getSyncNetDiagnosisInfo(long j, long j2, boolean z, boolean z2) {
        z4 z4VarA = p4.f().a(j, j2);
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        if (z4VarA == null) {
            return linkedHashMapPack.getAll();
        }
        linkedHashMapPack.putIfNotDefault("network_changed", z4VarA.h(), 0L).putIfNotDefault(x5.e, z4VarA.a(), 0L).put("mobile_signal_strength", z4VarA.c().getMobileSignalStrength()).put("wifi_signal_strength", z4VarA.c().getWifiSignalStrength()).put(x5.q, z4VarA.c().getLteCqi()).put(x5.n, z4VarA.c().getLteRsrp()).put(x5.m, z4VarA.c().getLteRsrq()).put(x5.p, z4VarA.c().getLteRssi()).put(x5.o, z4VarA.c().getLteRssnr());
        if (z) {
            linkedHashMapPack.put(x5.f15596b, z4VarA.g().c()).put(x5.f15597c, z4VarA.g().b());
            w4 w4VarB = z4VarA.b();
            y4 y4VarB = w4VarB.b(0);
            y4 y4VarB2 = w4VarB.b(1);
            if (y4VarB != null && y4VarB.c() != 0) {
                linkedHashMapPack.put(x5.f, y4VarB.b());
                linkedHashMapPack.put(x5.g, y4VarB.c());
                linkedHashMapPack.put(x5.h, y4VarB.e());
            }
            if (y4VarB2 != null && y4VarB2.c() != 0) {
                linkedHashMapPack.put(x5.i, y4VarB2.b());
                linkedHashMapPack.put(x5.j, y4VarB2.c());
                linkedHashMapPack.put(x5.k, y4VarB2.e());
            }
        }
        if (z2) {
            Logger.d(TAG, "enable report qoe");
            t5 t5VarA = p4.f().a(true);
            if (t5VarA == null || !t5VarA.isSuccess()) {
                return linkedHashMapPack.getAll();
            }
            linkedHashMapPack.put(x5.z, t5VarA.getChannelNum()).put(x5.y, t5VarA.getChannelIndex()).put(x5.x, t5VarA.getDlRate()).put(x5.w, t5VarA.getUlRate()).put(x5.v, t5VarA.getDlBandwidth()).put(x5.u, t5VarA.getUlBandwidth()).put(x5.t, t5VarA.getDlRtt()).put(x5.s, t5VarA.getUlRtt()).put(x5.r, t5VarA.getUlPkgLossRate());
        }
        return linkedHashMapPack.getAll();
    }

    @Override // com.huawei.hms.network.inner.api.NetDiagnosisNetworkService
    public Map<String, Integer> getSignalMetrics() {
        return p4.f().c();
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public String getServiceType() {
        return NetDiagnosisService.class.getName();
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public String getServiceName() {
        return "netdiag";
    }

    @Override // com.huawei.hms.network.inner.api.NetDiagnosisNetworkService
    public QoeMetrics getQoeMetrics(boolean z) {
        return p4.f().a(z);
    }

    @Override // com.huawei.hms.network.inner.api.NetDiagnosisNetworkService
    public String getNetworkMetrics() {
        return p4.f().b();
    }

    @Override // com.huawei.hms.network.inner.api.InterceptorNetworkService
    public Interceptor getInterceptor() {
        return new o4();
    }

    @Override // com.huawei.hms.network.inner.api.NetDiagnosisNetworkService
    public boolean checkConnectivity() {
        return p4.f().a();
    }
}
