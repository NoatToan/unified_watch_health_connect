package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bumptech.glide.Glide;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.common.dfx.storage.DefaultStorageHandler;
import com.huawei.haf.common.os.FileFilterUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LogUtil;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class llk extends DefaultStorageHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f40419b = "files/" + BaseApplication.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f40418a = "files/huaweisystem/" + BaseApplication.d();

    public llk() {
        super("TimeEat_StorageHandler");
    }

    @Override // com.huawei.haf.common.dfx.storage.DefaultStorageHandler
    public boolean d() {
        long jI;
        if (!LogUtil.c() && !LogUtil.b()) {
            return false;
        }
        Context context = getContext();
        String strC = KeyValDbManager.d(context).c("app_last_storage_check_time");
        if (TextUtils.isEmpty(strC)) {
            jI = AppInfoUtils.c();
            KeyValDbManager.d(context).b("app_last_storage_check_time", String.valueOf(jI));
        } else {
            jI = CommonUtil.i(strC);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - jI < 604800000) {
            return false;
        }
        KeyValDbManager.d(context).b("app_last_storage_check_time", String.valueOf(jCurrentTimeMillis));
        return true;
    }

    @Override // com.huawei.haf.common.dfx.storage.DefaultStorageHandler
    public Map<String, Long> b() {
        HashMap map = new HashMap();
        map.put("cache", 0L);
        map.put("files", 0L);
        map.put("files/h5pro", 0L);
        map.put(f40419b, 0L);
        map.put("files/mmkv", 0L);
        map.put("files/achievemedal", 0L);
        map.put("files/achievemedalpng", 0L);
        map.put("files/fitness", 0L);
        map.put("files/sleepMonitor", 0L);
        map.put("files/plugins", 0L);
        map.put("databases", 0L);
        map.put("app_bundle", 0L);
        map.put("app_webview", 0L);
        map.put("app_hws_webview", 0L);
        return map;
    }

    @Override // com.huawei.haf.common.dfx.storage.DefaultStorageHandler
    public Map<String, Long> a() {
        HashMap map = new HashMap();
        map.put("cache", 0L);
        map.put("files", 0L);
        map.put("files/h5pro", 0L);
        map.put("files/huaweisystem", 0L);
        map.put(f40418a, 0L);
        map.put("files/huaweisystem/BetaClub", 0L);
        map.put("files/Huawei/Health", 0L);
        map.put("files/amap", 0L);
        map.put("files/RunwayRoutes", 0L);
        return map;
    }

    @Override // com.huawei.haf.common.dfx.storage.DefaultStorageHandler
    public void e(String str, long j, long j2, Map<String, Long> map, Map<String, Long> map2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(OpAnalyticsConstants.MONITOR_INFO, "storage_total_size(M)=" + (((j + j2) / 1024.0f) / 1024.0f));
        linkedHashMap.put("internal_total_size", String.valueOf(j));
        if (!map.isEmpty()) {
            linkedHashMap.put("internal_cache", String.valueOf(map.get("cache")));
            linkedHashMap.put("internal_files", String.valueOf(map.get("files")));
            linkedHashMap.put("internal_h5pro", String.valueOf(map.get("files/h5pro")));
            linkedHashMap.put("internal_healthlog", String.valueOf(map.get(f40419b)));
            linkedHashMap.put("internal_mmkv", String.valueOf(map.get("files/mmkv")));
            linkedHashMap.put("internal_plugins", String.valueOf(map.get("files/plugins")));
            linkedHashMap.put("internal_chievemedalpng", String.valueOf(map.get("files/achievemedalpng")));
            linkedHashMap.put("internal_achievemedal", String.valueOf(map.get("files/achievemedal")));
            linkedHashMap.put("internal_fitness", String.valueOf(map.get("files/fitness")));
            linkedHashMap.put("internal_sleepmonitor", String.valueOf(map.get("files/sleepMonitor")));
            linkedHashMap.put("internal_databases", String.valueOf(map.get("databases")));
            linkedHashMap.put("internal_app_bundle", String.valueOf(map.get("app_bundle")));
            linkedHashMap.put("internal_app_webview", String.valueOf(map.get("app_webview")));
            linkedHashMap.put("internal_app_hws_weview", String.valueOf(map.get("app_hws_webview")));
        }
        linkedHashMap.put("external_total_size", String.valueOf(j2));
        if (!map2.isEmpty()) {
            linkedHashMap.put("external_cache", String.valueOf(map2.get("cache")));
            linkedHashMap.put("external_files", String.valueOf(map2.get("files")));
            linkedHashMap.put("external_h5pro", String.valueOf(map2.get("files/h5pro")));
            linkedHashMap.put("external_huaweisystem", String.valueOf(map2.get("files/huaweisystem")));
            linkedHashMap.put("external_healthlog", String.valueOf(map2.get(f40418a)));
            linkedHashMap.put("external_betaclub", String.valueOf(map2.get("files/huaweisystem/BetaClub")));
            linkedHashMap.put("external_huaweihealth", String.valueOf(map2.get("files/Huawei/Health")));
            linkedHashMap.put("external_amap", String.valueOf(map2.get("files/amap")));
            linkedHashMap.put("external_runwayroutes", String.valueOf(map2.get("files/RunwayRoutes")));
        }
        if (!LogUtil.c()) {
            for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                LogUtil.b("TimeEat_StorageHandler", entry.getKey(), " = ", entry.getValue());
            }
        } else {
            super.e(str, j, j2, map, map2);
        }
        linkedHashMap.put(OpAnalyticsConstants.MONITOR_KEY, str);
        linkedHashMap.put("deviceType", Build.MANUFACTURER);
        linkedHashMap.put(DeviceCategoryFragment.DEVICE_TYPE, Build.BOARD);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_STORAGE_90030006.value(), linkedHashMap);
    }

    @Override // com.huawei.haf.common.dfx.storage.DefaultStorageHandler
    public void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        i();
        e();
        LogUtil.b("TimeEat_StorageHandler", "pre auto clean storage, cost time=", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    @Override // com.huawei.haf.common.dfx.storage.DefaultStorageHandler
    public void b(Map<String, Long> map, Map<String, Long> map2) {
        LogUtil.b("TimeEat_StorageHandler", "post auto clean storage, cost time=", Long.valueOf(System.currentTimeMillis() - System.currentTimeMillis()));
    }

    private void i() {
        FileUtils.a(AppInfoUtils.g(null), new FileFilterUtils.FilePrefixCollectFilter("HiTrack_", 86400000L));
        Glide.get(getContext()).clearDiskCache();
        FileUtils.e(AppInfoUtils.d(Constants.PPS_ROOT_PATH), false);
        FileUtils.e(AppInfoUtils.g("Log"), false);
        if (LogUtil.b()) {
            FileUtils.e(AppInfoUtils.g(getContext().getPackageName()), false);
        }
    }

    private void e() {
        FileUtils.e(AppInfoUtils.c("nanotraceFiles"), false);
        FileUtils.e(AppInfoUtils.a((String) null), false);
        FileUtils.e(AppInfoUtils.e("Log"), false);
        DfxBaseHandler.deleteHprofData();
        if (LogUtil.c()) {
            FileUtils.e(AppInfoUtils.e("huaweisystem"), false);
        }
    }
}
