package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource;

/* JADX INFO: loaded from: classes16.dex */
public class rfi {
    private DownloadCloudDeviceResource e;

    public void b(DownloadCloudDeviceResource downloadCloudDeviceResource, String str, boolean z, String str2, Context context) {
        this.e = downloadCloudDeviceResource;
        if (downloadCloudDeviceResource == null) {
            this.e = new DownloadCloudDeviceResource();
        }
        boolean zB = this.e.b(str, z);
        LogUtil.a("SendPushMessage", "getDeviceProfileId: ", str, "isSupportSeizePush", Boolean.valueOf(zB));
        if (zB) {
            mga.a(str2, context);
        }
        this.e.b();
    }
}
