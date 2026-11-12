package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LocalBroadcast;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class ipi {
    public static Bundle b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
        } catch (JSONException unused) {
            LogUtil.e("YoYoWidgetUtil", "jsonToBundle is errors");
        }
        return bundle;
    }

    public static void d(Context context) {
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setAction("com.huawei.bone.action.UNITSWITCH");
        if (LocalBroadcastManager.getInstance() != null) {
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
        }
        if (context != null) {
            LogUtil.a("YoYoWidgetUtil", "----send broadcast to social----");
            context.sendBroadcast(intent, LocalBroadcast.f36595c);
        } else {
            LogUtil.a("YoYoWidgetUtil", "----mContext is null----");
        }
    }

    public static void a(String str, Context context, long j) {
        LogUtil.a("YoYoWidgetUtil", "yoyowidget removeCard", str);
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setAction("com.huawei.bone.action.REMOVECARD");
        intent.putExtra("type", str);
        intent.putExtra("EndTime", j);
        if (LocalBroadcastManager.getInstance() != null) {
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
        }
        if (context != null) {
            LogUtil.a("YoYoWidgetUtil", "----removeCard send broadcast to social----");
            context.sendBroadcast(intent, LocalBroadcast.f36595c);
        } else {
            LogUtil.a("YoYoWidgetUtil", "----removeCard mContext is null----");
        }
    }
}
