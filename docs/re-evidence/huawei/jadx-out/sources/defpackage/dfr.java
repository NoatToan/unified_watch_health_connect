package defpackage;

import android.content.Context;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.ArkUIJsApi;

/* JADX INFO: loaded from: classes7.dex */
public class dfr {
    public static boolean b() {
        return true;
    }

    public static void c(Context context, dfi dfiVar) {
        if (context == null || dfiVar == null) {
            LogUtil.j("BloodPressureH5Utils", "startInputBloodPressurePage fail: context or param is null");
            return;
        }
        boolean zD = dfiVar.d();
        String strC = dfiVar.c();
        long jE = dfiVar.e();
        boolean zA = dfiVar.a();
        int i = dfiVar.i();
        int iB = dfiVar.b();
        StringBuilder sb = new StringBuilder("#/bloodPressureManualInput?isManualInput=" + zD);
        if (strC != null) {
            sb.append("&biSourceFrom=");
            sb.append(strC);
        }
        if (jE > 0) {
            sb.append("&measureTime=");
            sb.append(jE);
        }
        if (zA) {
            sb.append("&isForResult=true");
        }
        if (iB > 0) {
            sb.append("&clientId=");
            sb.append(iB);
        }
        H5ProLaunchOption.Builder builderC = c();
        builderC.addPath(sb.toString());
        builderC.setIsForResult(zA);
        builderC.setRequestCode(i);
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.health-data-subpage", builderC);
    }

    private static H5ProLaunchOption.Builder c() {
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule(ArkUIJsApi.MODEL, ddv.b().getCommonJsModule(ArkUIJsApi.MODEL)).addCustomizeJsModule("BloodPressureImpl", ddv.b().getCommonJsModule("BloodPressureImpl"));
        builder.setImmerse();
        builder.showStatusBar();
        builder.setForceDarkMode(1);
        return builder;
    }
}
