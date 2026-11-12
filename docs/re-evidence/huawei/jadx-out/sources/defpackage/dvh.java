package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.health.device.ui.measure.activity.WifiDeviceShareActivity;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.webview.WebViewActivity;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dvh {
    public static void e(Context context, String str, String str2, String str3, HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        String str4;
        if (qrs.r()) {
            LogUtil.j("JumpDetailsManager", "openSettingHelp:click too fast.");
            return;
        }
        if (!(dmp.d().b(str, true) instanceof efx)) {
            LogUtil.a("JumpDetailsManager", "openSettingHelp showSelectBindDeviceDialog");
            hagridDeviceManagerFragment.showSelectBindDeviceDialog();
            return;
        }
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010034.value(), new HashMap(16), 0);
        if (dxn.e(BaseApplication.getContext(), str)) {
            String strD = lon.c().d("scale_new_honor_help");
            if (!TextUtils.isEmpty(strD)) {
                str3 = strD;
            }
            str4 = str3 + dxm.k(strD);
        } else {
            str4 = str3 + dxm.d(str2);
        }
        LogUtil.d("JumpDetailsManager", "openSettingHelp url:", str4);
        e(context, str4);
    }

    private static void e(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.putExtra("WebViewActivity.REQUEST_URL_KEY", str);
        intent.putExtra(Constants.JUMP_MODE_KEY, 8);
        context.startActivity(intent);
    }

    public static void e(Context context, String str, eby ebyVar, ContentValues contentValues, HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        if (qrs.r()) {
            LogUtil.j("JumpDetailsManager", "startDeviceShare: click too fast.");
            return;
        }
        if (!(dmp.d().b(str, true) instanceof efx)) {
            LogUtil.a("JumpDetailsManager", "startDeviceShare showSelectBindDeviceDialog");
            hagridDeviceManagerFragment.showSelectBindDeviceDialog();
        } else if (ebyVar != null) {
            Intent intent = new Intent(context, (Class<?>) WifiDeviceShareActivity.class);
            intent.putExtra("deviceId", ebyVar.e());
            intent.putExtra("commonDeviceInfo", contentValues);
            intent.putExtra("isSubUser", ebyVar.a().m() != 1);
            context.startActivity(intent);
        }
    }

    public static void b(Context context, String str, String str2) {
        eds next;
        if (context == null) {
            return;
        }
        List<eds> listB = b();
        if (listB == null) {
            LogUtil.j("JumpDetailsManager", "startPairingGuideActivity deviceInfos is null");
            return;
        }
        Iterator<eds> it = listB.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.aa().contains(str));
        if (next == null) {
            LogUtil.j("JumpDetailsManager", "startPairingGuideActivity pluginInfoBean is empty");
            return;
        }
        String strR = next.r();
        if (TextUtils.isEmpty(strR)) {
            LogUtil.j("JumpDetailsManager", "pairGuid is empty");
            return;
        }
        String strS = next.s();
        if (TextUtils.isEmpty(strS)) {
            LogUtil.j("JumpDetailsManager", "kindId is empty");
            return;
        }
        List<String> listAa = next.aa();
        if (njy.e(listAa)) {
            LogUtil.j("JumpDetailsManager", "uuidList is empty");
            return;
        }
        Iterator<String> it2 = listAa.iterator();
        while (it2.hasNext()) {
            LogUtil.d("JumpDetailsManager", "uuidList uuid = ", it2.next());
        }
        LogUtil.j("JumpDetailsManager", "pairGuide = ", strR, "kindId = ", strS);
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(context, "com.huawei.ui.device.activity.adddevice.PairingGuideActivity");
        if (listAa instanceof ArrayList) {
            intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, (ArrayList) listAa);
        }
        intent.putExtra("is_invalidation", true);
        intent.putExtra("kind_id", strS);
        intent.putExtra("pair_guide", strR);
        intent.putExtra("uniqueId", str2);
        context.startActivity(intent);
    }

    private static List<eds> b() {
        return ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList();
    }
}
