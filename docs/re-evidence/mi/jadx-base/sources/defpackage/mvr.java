package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.yrn.controller.ui.YRNCFragment;
import com.xiaomi.yrn.controller.ui.YRNCLiveSingleTaskMainActivity;
import com.xiaomi.yrn.controller.ui.YRNCMainActivity;
import com.xiaomi.yrn.controller.ui.YRNCSingleTaskMainActivity;
import com.xiaomi.yrn.controller.ui.YRNCTransparentMainActivity;

/* JADX INFO: loaded from: classes2.dex */
public class mvr {
    public static Fragment a(String str, Bundle bundle) {
        YRNCFragment yRNCFragment = new YRNCFragment();
        if (bundle == null) {
            bundle = new Bundle();
        }
        String rNAppNameByUrl = lwr.b().getRNAppNameByUrl(str);
        String rNModuleByUrl = lwr.b().getRNModuleByUrl(str);
        bundle.putString("appName", rNAppNameByUrl);
        bundle.putString(RnReportConst.ApiReport.PARAM_MODULE, rNModuleByUrl);
        bundle.putString(SportRecordBundleKey.BUNDLE_PARAM_URI, str);
        bundle.putString("url", str);
        yRNCFragment.setArguments(bundle);
        if (!TextUtils.isEmpty(rNAppNameByUrl) && !TextUtils.isEmpty(rNModuleByUrl) && !TextUtils.isEmpty(str)) {
            return yRNCFragment;
        }
        zxr.b("YRNCPageOpenHelper", "YRNCPageOpenHelper.newYRNFragment error! appName is " + rNAppNameByUrl + ",module is " + rNModuleByUrl + ",url is " + str);
        return new Fragment();
    }

    public static void b(Activity activity, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Uri uri = Uri.parse(str);
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("enableTransParent", false);
            boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("isSingleTask", false);
            Class cls = YRNCMainActivity.class;
            if (TextUtils.equals("live", lwr.b().getRNModuleByUrl(str))) {
                cls = YRNCLiveSingleTaskMainActivity.class;
            } else if (booleanQueryParameter2) {
                cls = YRNCSingleTaskMainActivity.class;
            } else if (booleanQueryParameter) {
                cls = YRNCTransparentMainActivity.class;
            }
            if (activity != null) {
                Intent intent = new Intent(activity, (Class<?>) cls);
                intent.setData(uri);
                activity.startActivityForResult(intent, i);
            } else {
                Context context = lwr.b().getContext();
                if (context != null) {
                    Intent intent2 = new Intent(context, (Class<?>) cls);
                    intent2.setFlags(268435456);
                    intent2.setData(uri);
                    context.startActivity(intent2);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
