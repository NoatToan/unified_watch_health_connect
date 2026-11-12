package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.ui.commonui.webview.WebViewActivity;

/* JADX INFO: loaded from: classes19.dex */
public class vcu {
    public static boolean a(DeviceInboxInfo deviceInboxInfo) {
        if (deviceInboxInfo == null) {
            LogUtil.j("DeviceInboxUtil", "isEffectiveTime() mDeviceInboxInfo is null");
            return false;
        }
        long effectiveStartTime = deviceInboxInfo.getEffectiveStartTime();
        long effectiveEndTime = deviceInboxInfo.getEffectiveEndTime();
        long jH = ltb.h();
        return jH >= effectiveStartTime && jH <= effectiveEndTime;
    }

    public static boolean b(DeviceInboxInfo deviceInboxInfo) {
        if (deviceInboxInfo != null) {
            return deviceInboxInfo.getActiveStatus() == 1;
        }
        LogUtil.j("DeviceInboxUtil", "isActive() mDeviceInboxInfo is null");
        return false;
    }

    public static boolean e(DeviceInboxInfo deviceInboxInfo) {
        if (deviceInboxInfo == null) {
            LogUtil.j("DeviceInboxUtil", "checkBaseConditions mDeviceInboxInfo is null");
            return false;
        }
        if (b(deviceInboxInfo) && a(deviceInboxInfo)) {
            return true;
        }
        LogUtil.j("DeviceInboxUtil", "product isActived or Equity Expiration");
        return false;
    }

    public static boolean c(DeviceInboxInfo deviceInboxInfo) {
        if (deviceInboxInfo != null) {
            return e(deviceInboxInfo) && deviceInboxInfo.getBenefitType() == 2;
        }
        LogUtil.j("DeviceInboxUtil", "isShowServiceTips mDeviceInboxInfo is null");
        return false;
    }

    public static void a(Context context, int i, String str) {
        if (str == null) {
            LogUtil.j("DeviceInboxUtil", "clickDeviceInboxInfo can not jump");
            return;
        }
        try {
            if (i == 1) {
                Intent intent = new Intent();
                intent.setClass(context, WebViewActivity.class);
                intent.putExtra("url", str);
                context.startActivity(intent);
                return;
            }
            if (i != 2) {
                LogUtil.j("DeviceInboxUtil", "clickDeviceInboxInfo error linkType");
                return;
            }
            Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent2.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
            context.startActivity(intent2);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("DeviceInboxUtil", "ActivityNotFoundException", e.getMessage());
        }
    }

    public static String e(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            return BaseApplication.getContext().getResources().getString(i, str);
        }
        LogUtil.j("DeviceInboxUtil", "getTextTips timeStr is null");
        return null;
    }
}
