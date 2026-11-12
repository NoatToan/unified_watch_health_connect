package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes23.dex */
public class bct {
    public static int d(Context context) {
        try {
            if (context == null) {
                bcw.e("BaseQueryHwCloud", "getCloudMateDateVersionCode context is null");
                return 0;
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                bcw.e("BaseQueryHwCloud", "getCloudMateDateVersionCode packageManager is null");
                return 0;
            }
            int i = packageManager.getApplicationInfo("com.huawei.hidisk", 128).metaData.getInt("com.huawei.hicloud.ability.version", 0);
            bcw.c("BaseQueryHwCloud", "metata ability.version: " + i);
            return i;
        } catch (Exception e) {
            bcw.d("BaseQueryHwCloud", "getCloudMateDateVersionCode: " + e.toString());
            return 0;
        }
    }
}
