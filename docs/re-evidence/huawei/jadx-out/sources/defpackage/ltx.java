package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.StorageParams;
import health.compact.a.StorageResult;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class ltx {
    public static void c(Context context, HashMap<Long, Long> map, String str, StorageDataCallback storageDataCallback) {
        HashMap map2 = new HashMap();
        if (context == null) {
            LogUtil.j("NotifyTrackUtils", "getNotifyTrackMap context == null");
            storageDataCallback.onProcessed(new StorageResult());
            return;
        }
        String strE = nio.e("notifyTrackUtils" + str);
        KeyValDbManager keyValDbManagerD = KeyValDbManager.d(context);
        String strB = keyValDbManagerD.b(strE, new StorageParams(1));
        Gson gson = new Gson();
        if (!TextUtils.isEmpty(strB)) {
            try {
                map2 = (HashMap) gson.fromJson(CommonUtil.ac(strB), new TypeToken<HashMap<Long, Long>>() { // from class: com.huawei.hwdataaccessmodel.sport.NotifyTrackUtils$1
                }.getType());
            } catch (JsonSyntaxException unused) {
                map2 = new HashMap();
                LogUtil.e("NotifyTrackUtils", "getNotifyTrackMap json exception");
            }
        }
        if (map2 == null) {
            LogUtil.e("NotifyTrackUtils", "map is null");
            map2 = new HashMap();
        }
        LogUtil.a("NotifyTrackUtils", "getTrackList", Integer.valueOf(map2.size()), map2);
        if (map != null) {
            map.putAll(map2);
        }
        if (map2.size() != 0) {
            keyValDbManagerD.a(strE, gson.toJson(new HashMap()), new StorageParams(1), storageDataCallback);
        } else {
            storageDataCallback.onProcessed(new StorageResult());
        }
    }

    public static void e(Context context, HashMap<Long, Long> map, String str, StorageDataCallback storageDataCallback) throws Throwable {
        HashMap map2;
        if (context == null || map == null || map.size() == 0) {
            LogUtil.j("NotifyTrackUtils", "saveTrackList context == null || map == null || map.size() == 0");
            return;
        }
        KeyValDbManager keyValDbManagerD = KeyValDbManager.d(context);
        String strE = nio.e("notifyTrackUtils" + str);
        String strB = keyValDbManagerD.b(strE, new StorageParams(1));
        Gson gson = new Gson();
        if (!TextUtils.isEmpty(strB)) {
            try {
                map2 = (HashMap) gson.fromJson(CommonUtil.ac(strB), new TypeToken<HashMap<Long, Long>>() { // from class: com.huawei.hwdataaccessmodel.sport.NotifyTrackUtils$2
                }.getType());
            } catch (JsonSyntaxException unused) {
                LogUtil.e("NotifyTrackUtils", "saveTrackList json exception");
                map2 = null;
            }
            if (map2 == null) {
                LogUtil.j("NotifyTrackUtils", "lastNotifyMap == null");
            } else {
                map.putAll(map2);
            }
        }
        LogUtil.a("NotifyTrackUtils", "saveTrackList", Integer.valueOf(map.size()), map);
        keyValDbManagerD.a(strE, gson.toJson(map), new StorageParams(1), storageDataCallback);
    }
}
