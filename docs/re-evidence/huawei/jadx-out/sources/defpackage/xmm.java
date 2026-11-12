package defpackage;

import android.content.Context;
import com.huawei.wear.oversea.packageinfo.PackageUtilApi;
import com.huawei.wear.oversea.router.RouterRequest;

/* JADX INFO: loaded from: classes20.dex */
public class xmm {
    public static PackageUtilApi e(Context context) {
        xoe xoeVarC = xof.c().c(new RouterRequest(context).a("com.huawei.wallet.nfc").d("CommonWearProvider").c("CommonWearCreateAction"), null);
        if (xoeVarC.b("WearPackageUtil") instanceof PackageUtilApi) {
            return (PackageUtilApi) xoeVarC.b("WearPackageUtil");
        }
        return null;
    }
}
