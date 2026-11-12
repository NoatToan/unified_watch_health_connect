package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.device.wifi.entity.utils.JsonParser;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wuf {
    public static void e(final Context context) {
        final ArrayList<ContentValues> arrayListF = dmp.d().f();
        lsy.a(new Runnable() { // from class: wuf.2
            @Override // java.lang.Runnable
            public void run() {
                wuf.e(arrayListF, wuf.a(context), context);
            }
        });
    }

    public static void d(final Context context) {
        lsy.a(new Runnable() { // from class: wuf.3
            @Override // java.lang.Runnable
            public void run() {
                if (wuf.a(context)) {
                    wuf.e(dmp.d().f(), true, context);
                }
            }
        });
    }

    public static boolean a(Context context) {
        String value;
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("privacy_data_source_language_write_key_FEF629A75A8B472D886BABB73BE88952");
        if (userPreference == null || (value = userPreference.getValue()) == null) {
            return false;
        }
        Map<String, Object> mapA = JsonParser.a(value);
        String string = context.getResources().getConfiguration().locale.toString();
        String strValueOf = String.valueOf(mapA.get("language"));
        if (Constants.NULL.equals(strValueOf)) {
            return false;
        }
        return !strValueOf.equals(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(ArrayList<ContentValues> arrayList, boolean z, Context context) {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("privacy_data_source_device_name_4F32F873AE094ACAA75E35D53690B72C");
        Map map = new HashMap();
        if (userPreference == null) {
            userPreference = new HiUserPreference();
        } else {
            map = JsonParser.a(userPreference.getValue());
            if (z) {
                map.clear();
            }
            userPreference.setSyncStatus(0);
        }
        c(map, arrayList);
        userPreference.setKey("privacy_data_source_device_name_4F32F873AE094ACAA75E35D53690B72C");
        userPreference.setValue(JsonParser.a((Map<?, ?>) map).toString());
        LogUtil.a("DevicesLanguageChangeUtils", "privacy hiUserPreference set ", Boolean.valueOf(HiHealthManager.d(BaseApplication.getContext()).setUserPreference(userPreference)));
        c(context);
    }

    private static void c(Context context) {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("privacy_data_source_language_write_key_FEF629A75A8B472D886BABB73BE88952");
        if (userPreference == null) {
            userPreference = new HiUserPreference();
        } else {
            userPreference.setSyncStatus(0);
        }
        HashMap map = new HashMap();
        map.put("language", context.getResources().getConfiguration().locale.toString());
        userPreference.setKey("privacy_data_source_language_write_key_FEF629A75A8B472D886BABB73BE88952");
        userPreference.setValue(JsonParser.a(map).toString());
        LogUtil.a("DevicesLanguageChangeUtils", "updata wirte and language chage flags： ", Boolean.valueOf(HiHealthManager.d(BaseApplication.getContext()).setUserPreference(userPreference)));
    }

    private static void c(Map<String, Object> map, ArrayList<ContentValues> arrayList) {
        elh elhVarD;
        for (ContentValues contentValues : arrayList) {
            String asString = contentValues.getAsString("productId");
            String asString2 = contentValues.getAsString("uniqueId");
            if (asString2 != null && asString != null && (elhVarD = ResourceManager.c().d(asString)) != null) {
                String asString3 = contentValues.getAsString("sn");
                String strA = elo.a(asString, elhVarD.l().d());
                if (!TextUtils.isEmpty(asString3)) {
                    String str = strA + com.huawei.openalliance.ad.constant.Constants.LINK + e(asString3);
                    map.put(asString2, str);
                    map.put(asString3, str);
                } else {
                    map.put(asString2, strA + com.huawei.openalliance.ad.constant.Constants.LINK + e(asString2));
                }
            }
        }
    }

    private static String e(String str) {
        String strReplaceAll = str.replaceAll(":", "");
        return strReplaceAll.length() < 3 ? strReplaceAll : strReplaceAll.substring(strReplaceAll.length() - 3);
    }
}
