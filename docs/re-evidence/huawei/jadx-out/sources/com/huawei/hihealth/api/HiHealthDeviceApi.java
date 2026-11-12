package com.huawei.hihealth.api;

import android.content.Context;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.listener.HiRegisterClientListener;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthDeviceApi implements IDeviceApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f12033c;
    private HiHealthNativeApi e;

    private HiHealthDeviceApi() {
        this.e = HiHealthNativeApi.a(f12033c);
    }

    public static HiHealthDeviceApi d(Context context) {
        f12033c = context.getApplicationContext();
        return Instance.f12034a;
    }

    @Override // com.huawei.hihealth.api.IDeviceApi
    public void registerDataClient(HiDeviceInfo hiDeviceInfo, List<Integer> list, HiRegisterClientListener hiRegisterClientListener) {
        this.e.registerDataClient(hiDeviceInfo, list, hiRegisterClientListener);
    }

    @Override // com.huawei.hihealth.api.IDeviceApi
    public void registerDataClient(HiDeviceInfo hiDeviceInfo, HiUserInfo hiUserInfo, List<Integer> list, HiRegisterClientListener hiRegisterClientListener) {
        this.e.registerDataClient(hiDeviceInfo, list, hiRegisterClientListener);
    }

    @Override // com.huawei.hihealth.api.IDeviceApi
    public void fetchDataClientByUniqueId(int i, String str, HiDataClientListener hiDataClientListener) {
        this.e.fetchDataClientByUniqueId(i, str, hiDataClientListener);
    }

    @Override // com.huawei.hihealth.api.IDeviceApi
    public void fetchDataSourceByType(int i, HiTimeInterval hiTimeInterval, HiDataClientListener hiDataClientListener) {
        this.e.fetchDataSourceByType(i, hiTimeInterval, hiDataClientListener);
    }

    static class Instance {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HiHealthDeviceApi f12034a = new HiHealthDeviceApi();

        private Instance() {
        }
    }
}
