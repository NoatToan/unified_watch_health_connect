package com.huawei.openalliance.ad.constant;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.utils.dg;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class DefaultUrlConstant {
    private static final Map<String, Integer> DEFAULT_URL_MAPS;

    public static String getUrl(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        Map<String, Integer> map = DEFAULT_URL_MAPS;
        if (!map.containsKey(str) || !cc.a(context).d()) {
            return "";
        }
        if (map.containsKey(str + dg.a(context))) {
            str = str + dg.a(context);
        }
        return context.getString(map.get(str).intValue());
    }

    static {
        HashMap map = new HashMap();
        DEFAULT_URL_MAPS = map;
        map.put("analyticsServer", Integer.valueOf(R.string.hiad_analyticsServer));
        map.put("eventServer", Integer.valueOf(R.string.hiad_eventServer));
        map.put("adxServer", Integer.valueOf(R.string.hiad_adxServer));
        map.put("adxServerFb", Integer.valueOf(R.string.hiad_adxServerFb));
        map.put("configServer", Integer.valueOf(R.string.hiad_configServer));
        map.put("dnkeeperServer", Integer.valueOf(R.string.hiad_dnkeeperServer));
        map.put("amsServer", Integer.valueOf(R.string.hiad_privacyServer));
        map.put("appDataServer", Integer.valueOf(R.string.hiad_appDataServer));
        map.put("consentConfigServer", Integer.valueOf(R.string.hiad_consentConfigServer));
        map.put("appInsListConfigServer", Integer.valueOf(R.string.hiad_appInsListConfigServer));
        map.put("permissionServer", Integer.valueOf(R.string.hiad_permissionServer));
        map.put("h5Server", Integer.valueOf(R.string.haid_h5_content_server));
        map.put(UrlConstant.BASE_COMPLAIN_H5_URL, Integer.valueOf(R.string.haid_complain_h5_server));
        map.put("analyticsServerTv", Integer.valueOf(R.string.hiad_analyticsServerTv));
        map.put("adxServerTv", Integer.valueOf(R.string.hiad_adxServerTv));
        map.put("adxServerFbTv", Integer.valueOf(R.string.hiad_adxServerFbTv));
        map.put("eventServerTv", Integer.valueOf(R.string.hiad_eventServerTv));
        map.put("configServerTv", Integer.valueOf(R.string.hiad_configServerTv));
        map.put("amsServerTv", Integer.valueOf(R.string.hiad_privacyServerTv));
        map.put("h5ServerTv", Integer.valueOf(R.string.haid_h5_content_serverTv));
    }
}
