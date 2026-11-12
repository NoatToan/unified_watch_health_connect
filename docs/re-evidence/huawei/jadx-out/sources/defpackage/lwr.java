package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.StorageParams;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Integer> f40980a = new HashMap(16);
    private static volatile lwr e;

    private lwr() {
        c();
    }

    public static lwr e() {
        if (e == null) {
            synchronized (lwr.class) {
                if (e == null) {
                    e = new lwr();
                }
            }
        }
        return e;
    }

    public void b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WearPlaceInfo", "configWearPlaceCode id is empty");
        } else {
            f40980a.put(str, Integer.valueOf(i));
            e(f40980a);
        }
    }

    public int e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WearPlaceInfo", "fetchWearPlaceCode id is empty");
            return -1;
        }
        Integer num = f40980a.get(str);
        if (num == null) {
            LogUtil.j("WearPlaceInfo", "wearPlaceCode is null");
            return -1;
        }
        return num.intValue();
    }

    public String d(int i) {
        BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_wear_unrecognized);
        if (i == 8) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_wear_waist);
        }
        if (i == 13) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_wear_foot);
        }
        if (i == 53) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_wear_bike_spoke);
        }
        if (i == 0) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_wear_not_installed);
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_wear_unrecognized);
    }

    private static void c() {
        f40980a = b();
    }

    private static Map<String, Integer> b() throws Throwable {
        Map<String, Integer> map;
        try {
            map = (Map) new Gson().fromJson(KeyValDbManager.d(BaseApplication.getContext()).b("cached_wear_place_info", new StorageParams(1)), new TypeToken<Map<String, Integer>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwdevicemodemgr.WearPlaceInfo$1
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("WearPlaceInfo", "savedMessage jsonSyntaxException ");
            map = null;
        } catch (NumberFormatException unused2) {
            LogUtil.e("WearPlaceInfo", "savedMessage NumberFormatException");
            map = null;
        }
        if (map == null) {
            map = new HashMap<>(16);
        }
        LogUtil.a("WearPlaceInfo", "getWearPlaceInfoFromDb: cachedMap.size = ", Integer.valueOf(map.size()));
        return map;
    }

    private void e(Map<String, Integer> map) {
        LogUtil.a("WearPlaceInfo", "setWearPlaceToDb: wearPlaceMap.size = ", Integer.valueOf(map.size()));
        KeyValDbManager.d(BaseApplication.getContext()).b("cached_wear_place_info", new Gson().toJson(map), new StorageParams(1));
    }
}
