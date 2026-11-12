package defpackage;

import com.huawei.basichealthmodel.DeveloperKitProxy;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes23.dex */
public class cdy {
    private static boolean d;

    public static void b() {
        HiHealthNativeApi.a(BaseApplication.getContext()).setBinder("HealthCapabilityService", new DeveloperKitProxy(), new HiCommonListener() { // from class: cdy.1
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a("HL_OpenInterfaceUtils", "setBinder onSuccess errorCode ", Integer.valueOf(i), " object ", obj);
                boolean unused = cdy.d = true;
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j("HL_OpenInterfaceUtils", "setBinder onFailure errorCode ", Integer.valueOf(i), " object ", obj);
            }
        });
    }

    public static boolean d() {
        return d;
    }
}
