package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.huawei.hiar.HuaweiArApkBase;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes33.dex */
public class kri extends HuaweiArApkBase {
    private static final String d = "c";
    private static final kri e = new kri();

    long b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return -1L;
            }
            long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageManager.getPackageInfo(Constants.AR_ENGINE_PACKAGE, 0).getLongVersionCode() : packageManager.getPackageInfo(Constants.AR_ENGINE_PACKAGE, 0).versionCode;
            Log.i(d, "getHuaweiArApkVersionNumber version:" + longVersionCode);
            return longVersionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(d, "getHuaweiArApkVersionNumber NameNotFoundException.");
            return -1L;
        }
    }

    @Override // com.huawei.hiar.HuaweiArApkBase
    public boolean a(Context context) {
        return b(context) >= 55;
    }

    public static kri c() {
        return e;
    }

    private kri() {
    }
}
