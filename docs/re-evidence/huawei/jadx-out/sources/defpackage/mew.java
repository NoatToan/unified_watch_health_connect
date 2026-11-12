package defpackage;

import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mew {
    private List<Integer> e;

    static class c {
        static final mew d = new mew();
    }

    public static mew a() {
        return c.d;
    }

    public void d() {
        HiHealthNativeApi.a(BaseApplication.getContext()).subscribeHiHealthData(102, new HiSubscribeListener() { // from class: mew.4
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                LogUtil.a("DeviceSwitchSubscribe", "subscribeHiHealthData onResult");
                mew.this.e = list;
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                if (i == 102 && "HiSyncUserData".equals(str)) {
                    LogUtil.a("DeviceSwitchSubscribe", "subscribeHiHealthData HiSyncUserData onChange");
                    mfd.a().b();
                }
            }
        });
    }

    public void e() {
        HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(this.e, new HiUnSubscribeListener() { // from class: mew.3
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public void onResult(boolean z) {
                LogUtil.a("DeviceSwitchSubscribe", "unsubscribeHiHealthData, isSuccess is ", Boolean.valueOf(z));
            }
        });
    }
}
