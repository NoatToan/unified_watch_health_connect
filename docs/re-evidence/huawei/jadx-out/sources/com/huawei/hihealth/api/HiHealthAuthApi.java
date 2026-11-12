package com.huawei.hihealth.api;

import android.content.Context;
import com.huawei.hihealth.HiAuthorizationOption;
import com.huawei.hihealth.data.listener.HiAuthorizationListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HiHealthAuthApi implements IAuthApi {
    private static Context d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HiHealthNativeApi f12032a;

    private HiHealthAuthApi() {
        this.f12032a = HiHealthNativeApi.a(d);
    }

    @Override // com.huawei.hihealth.api.IAuthApi
    public void requestAuthorization(HiAuthorizationOption hiAuthorizationOption, HiAuthorizationListener hiAuthorizationListener) {
        this.f12032a.requestAuthorization(hiAuthorizationOption, hiAuthorizationListener);
    }

    @Override // com.huawei.hihealth.api.IAuthApi
    public void subscribeHiHealthData(List<Integer> list, HiSubscribeListener hiSubscribeListener) {
        this.f12032a.subscribeHiHealthData(list, hiSubscribeListener);
    }

    @Override // com.huawei.hihealth.api.IAuthApi
    public void unSubscribeHiHealthData(List<Integer> list, HiUnSubscribeListener hiUnSubscribeListener) {
        this.f12032a.unSubscribeHiHealthData(list, hiUnSubscribeListener);
    }

    static class Instance {
        public static final HiHealthAuthApi d = new HiHealthAuthApi();

        private Instance() {
        }
    }
}
