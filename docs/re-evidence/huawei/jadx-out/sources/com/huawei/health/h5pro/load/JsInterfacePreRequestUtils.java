package com.huawei.health.h5pro.load;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.GsonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class JsInterfacePreRequestUtils {
    private JsInterfacePreRequestUtils() {
    }

    private static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str.contains("?")) {
            str = str.substring(0, str.indexOf("?"));
        }
        if (str2.contains("?")) {
            str2 = str2.substring(0, str2.indexOf("?"));
        }
        return str.equals(str2);
    }

    private static String b(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                } catch (IOException e) {
                    LogUtil.e("H5PRO_JsInterfacePreRequestUtils", "convertInputStreamToString,  IOException: " + e.getMessage());
                    CommonUtil.closeStream(bufferedReader);
                }
            } catch (Throwable th) {
                CommonUtil.closeStream(bufferedReader);
                throw th;
            }
        }
        CommonUtil.closeStream(bufferedReader);
        return sb.toString().replaceAll(System.lineSeparator(), "");
    }

    public static Map<Long, JsInterfacePreRequestObj> getPreRequestList(Context context, String str, String str2, String str3) {
        if ((context != null ? context.getApplicationContext() : null) == null) {
            LogUtil.e("H5PRO_JsInterfacePreRequestUtils", "getPreRequestList: appContext is null");
            return new HashMap(0);
        }
        if (TextUtils.isEmpty(str3) && "com.huawei.health.h5.weight".equals(str)) {
            str3 = e(context, str);
        }
        if (TextUtils.isEmpty(str3)) {
            return new HashMap(0);
        }
        JsInterfacePreRequestObj[] jsInterfacePreRequestObjArr = (JsInterfacePreRequestObj[]) GsonUtil.parseJson(str3, JsInterfacePreRequestObj[].class);
        if (jsInterfacePreRequestObjArr == null || jsInterfacePreRequestObjArr.length == 0) {
            return new HashMap(0);
        }
        HashMap map = new HashMap();
        long j = -1000;
        for (JsInterfacePreRequestObj jsInterfacePreRequestObj : jsInterfacePreRequestObjArr) {
            if (jsInterfacePreRequestObj == null) {
                LogUtil.w("H5PRO_JsInterfacePreRequestUtils", "getPreRequestList: preRequest is null -> return");
            } else {
                List<String> platformList = jsInterfacePreRequestObj.getPlatformList();
                if (platformList != null && !platformList.contains("adr")) {
                    LogUtil.w("H5PRO_JsInterfacePreRequestUtils", "getPreRequestList: platformList -> return");
                } else if (a(jsInterfacePreRequestObj.getPath(), str2)) {
                    map.put(Long.valueOf(j), jsInterfacePreRequestObj);
                    j--;
                } else {
                    LogUtil.w("H5PRO_JsInterfacePreRequestUtils", "getPreRequestList: checkPrePath -> return");
                }
            }
        }
        return map;
    }

    private static String e(Context context, String str) {
        LogUtil.i("H5PRO_JsInterfacePreRequestUtils", a.a("readFromAssets enter: ", str));
        AssetManager assets = context.getAssets();
        if (assets == null) {
            LogUtil.e("H5PRO_JsInterfacePreRequestUtils", "getPreRequestList: assetManager is null");
            return "";
        }
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = assets.open(str + ".json");
            return b(inputStreamOpen);
        } catch (IOException e) {
            LogUtil.e("H5PRO_JsInterfacePreRequestUtils", "getPreRequestList: assetManager.open -> " + e.getMessage());
            return "";
        } finally {
            CommonUtil.closeStream(inputStreamOpen);
        }
    }
}
