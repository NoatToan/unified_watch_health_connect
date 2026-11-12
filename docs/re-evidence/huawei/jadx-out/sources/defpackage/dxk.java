package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;

/* JADX INFO: loaded from: classes27.dex */
public class dxk {
    public static void b(Context context, Uri uri) {
        LogUtil.a("PluginDevice_JumpUtil", "enter scaleUpdateJump");
        if (context == null) {
            LogUtil.a("PluginDevice_JumpUtil", "context is null");
            return;
        }
        String queryParameter = uri.getQueryParameter(MedalConstants.EVENT_KEY);
        String queryParameter2 = uri.getQueryParameter("uniqueId");
        LogUtil.a("PluginDevice_JumpUtil", "scaleUpdateJump productId=", queryParameter, ", uniqueId isEmpty ", Boolean.valueOf(TextUtils.isEmpty(queryParameter2)));
        if (dmp.d().c(queryParameter, false) == null) {
            LogUtil.j("PluginDevice_JumpUtil", "scaleUpdateJump bondedDevice is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("productId", queryParameter);
        ContentValues contentValues = new ContentValues();
        if (dxm.y(queryParameter)) {
            queryParameter2 = dmp.d().b(queryParameter, queryParameter2);
            if (dxm.a(queryParameter, queryParameter2)) {
                c(context, intent, dmp.d().e(queryParameter, false));
            } else {
                c(context, intent, true);
            }
        } else if (dxm.at(queryParameter)) {
            c(context, intent, true);
        } else {
            c(context, intent, false);
        }
        contentValues.put("productId", queryParameter);
        contentValues.put("uniqueId", queryParameter2);
        intent.putExtra("commonDeviceInfo", contentValues);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("PluginDevice_JumpUtil", "scaleUpdateJump ActivityNotFoundException");
        }
    }

    private static void c(Context context, Intent intent, boolean z) {
        if (z) {
            intent.setClass(context, DeviceMainActivity.class);
            intent.putExtra("view", "WifiVersionDetails");
        } else {
            intent.setClassName(context, "com.huawei.ui.device.activity.update.WeightUpdateVersionActivity");
            intent.putExtra("isUpdateDialog", true);
            intent.putExtra("user_type", true);
            intent.putExtra("isFromNotify", true);
        }
    }
}
