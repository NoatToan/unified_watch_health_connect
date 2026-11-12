package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.res.Resources;
import com.huawei.hms.ads.jsb.inner.data.DeviceInfo;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class aa extends j {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.a(cc.a(context).d());
        deviceInfo.a(com.huawei.openalliance.ad.utils.d.a());
        deviceInfo.b(b(context));
        a(remoteCallResultCallback, this.f19295a, 1000, com.huawei.openalliance.ad.utils.bk.a(deviceInfo), true);
    }

    private int c(String str) {
        try {
            return R.string.class.getField(str).getInt(null);
        } catch (Throwable th) {
            hw.c("JsbReqSettings", "getResourceId err, " + th.getClass().getSimpleName());
            return 0;
        }
    }

    private String b(Context context) {
        Resources resources = context.getResources();
        Map<String, String> mapA = com.huawei.openalliance.ad.utils.bk.a(resources.getString(R.string.hiad_jssdk_i18n));
        if (mapA == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : mapA.entrySet()) {
            int iC = c(entry.getValue());
            if (iC > 0) {
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(resources.getString(iC));
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public aa() {
        super("pps.settings");
    }
}
