package com.huawei.maps.offlinedata.service.init;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.maps.offlinedata.DeviceTypeConsts;
import com.huawei.maps.offlinedata.handler.AuthClient4H5;
import com.huawei.maps.offlinedata.handler.ConfigHolder;
import com.huawei.maps.offlinedata.handler.DecompressHandler;
import com.huawei.maps.offlinedata.handler.DeviceClient;
import com.huawei.maps.offlinedata.handler.DownloadHandler;
import com.huawei.maps.offlinedata.handler.H5StateHandler;
import com.huawei.maps.offlinedata.handler.PagesDirection;
import com.huawei.maps.offlinedata.handler.Repository;
import com.huawei.maps.offlinedata.handler.StorageHandler;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.maps.offlinedata.health.p2p.sender.IWearEngine4OfflineMap;
import com.huawei.maps.offlinedata.service.download.b;
import com.huawei.maps.offlinedata.utils.d;
import com.huawei.maps.offlinedata.utils.g;
import com.huawei.maps.offlinedata.utils.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f17981a;

    /* JADX INFO: renamed from: com.huawei.maps.offlinedata.service.init.a$a, reason: collision with other inner class name */
    class C0189a extends TypeToken<Set<String>> {
        C0189a() {
        }
    }

    private a() {
    }

    public static a a() {
        if (f17981a == null) {
            synchronized (a.class) {
                if (f17981a == null) {
                    f17981a = new a();
                }
            }
        }
        return f17981a;
    }

    public boolean b() {
        com.huawei.maps.offlinedata.service.config.a.h().c(DeviceTypeConsts.WATCH);
        b.b().c().set(false);
        IWearEngine4OfflineMap wearEngine4OfflineMap = OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap();
        if (wearEngine4OfflineMap == null) {
            g.b("InitService", "wearEngine is null.");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        com.huawei.maps.offlinedata.consts.a aVar = com.huawei.maps.offlinedata.consts.a.IS_SUPPORT_OFFLINE_MAP;
        arrayList.add(Integer.valueOf(aVar.b()));
        com.huawei.maps.offlinedata.consts.a aVar2 = com.huawei.maps.offlinedata.consts.a.IS_SUPPORT_CONTOUR_MAP;
        arrayList.add(Integer.valueOf(aVar2.b()));
        com.huawei.maps.offlinedata.consts.a aVar3 = com.huawei.maps.offlinedata.consts.a.IS_SUPPORT_SKI_MAP;
        arrayList.add(Integer.valueOf(aVar3.b()));
        com.huawei.maps.offlinedata.consts.a aVar4 = com.huawei.maps.offlinedata.consts.a.IS_SUPPORT_AUTO_DOWNLOAD_MAP;
        arrayList.add(Integer.valueOf(aVar4.b()));
        Map<Integer, Boolean> mapQueryDeviceCapability = wearEngine4OfflineMap.queryDeviceCapability(arrayList);
        g.c("InitService", "offlineMapCapability resultMap: " + d.a(mapQueryDeviceCapability));
        com.huawei.maps.offlinedata.service.config.a.h().a();
        Boolean bool = Boolean.TRUE;
        if (bool.equals(mapQueryDeviceCapability.get(Integer.valueOf(aVar.b())))) {
            com.huawei.maps.offlinedata.service.config.a.h().a("watch_map");
        }
        if (bool.equals(mapQueryDeviceCapability.get(Integer.valueOf(aVar2.b())))) {
            com.huawei.maps.offlinedata.service.config.a.h().a("watch_map_contour");
        }
        com.huawei.maps.offlinedata.service.config.a.h().b(false);
        if (bool.equals(mapQueryDeviceCapability.get(Integer.valueOf(aVar3.b())))) {
            com.huawei.maps.offlinedata.service.config.a.h().b(true);
        }
        com.huawei.maps.offlinedata.service.config.a.h().a(false);
        if (bool.equals(mapQueryDeviceCapability.get(Integer.valueOf(aVar4.b())))) {
            com.huawei.maps.offlinedata.service.config.a.h().a(true);
        }
        String strC = com.huawei.maps.offlinedata.utils.a.c();
        if (com.huawei.maps.offlinedata.utils.a.a() == 1) {
            g.c("InitService", "offlineMapCapability pre put autoDownload / mapSki / category");
            j.b("autoDownloadIfWifi" + strC, com.huawei.maps.offlinedata.service.config.a.h().c(), com.huawei.maps.offlinedata.utils.a.b());
            j.b("dataMapSki" + strC, com.huawei.maps.offlinedata.service.config.a.h().i(), com.huawei.maps.offlinedata.utils.a.b());
            j.b("dataTypeCategory" + strC, d.a(com.huawei.maps.offlinedata.service.config.a.h().d()), com.huawei.maps.offlinedata.utils.a.b());
        } else {
            boolean zA = j.a("autoDownloadIfWifi" + strC, false, com.huawei.maps.offlinedata.utils.a.b());
            com.huawei.maps.offlinedata.service.config.a.h().a(zA);
            g.c("InitService", "offlineMapCapability pre get autoDownload: " + zA);
            boolean zA2 = j.a("dataMapSki" + strC, false, com.huawei.maps.offlinedata.utils.a.b());
            com.huawei.maps.offlinedata.service.config.a.h().b(zA2);
            g.c("InitService", "offlineMapCapability pre get mapSki: " + zA2);
            String strA = j.a("dataTypeCategory" + strC, "", com.huawei.maps.offlinedata.utils.a.b());
            g.c("InitService", "offlineMapCapability pre get category: " + strA);
            if (!TextUtils.isEmpty(strA)) {
                Iterator it = ((Set) d.a(strA, new C0189a().getType())).iterator();
                while (it.hasNext()) {
                    com.huawei.maps.offlinedata.service.config.a.h().a((String) it.next());
                }
            }
        }
        return true;
    }

    public void a(Context context, String str, boolean z) {
        H5ProLaunchOption h5ProLaunchOptionBuild = new H5ProLaunchOption.Builder().addCustomizeJsModule("configHolder", ConfigHolder.class).addCustomizeJsModule("repository", Repository.class).addCustomizeJsModule("storageHandler", StorageHandler.class).addCustomizeJsModule("downloadHandler", DownloadHandler.class).addCustomizeJsModule("decompressHandler", DecompressHandler.class).addCustomizeJsModule("deviceClient", DeviceClient.class).addCustomizeJsModule("PagesDirection", PagesDirection.class).addCustomizeJsModule("H5StateHandler", H5StateHandler.class).addCustomizeJsModule("AuthClient4H5", AuthClient4H5.class).addPath("#/?authResult=".concat(z ? "1" : "0")).setForceDarkMode(1).enableOnDestroyCallback().setImmerse().showStatusBar().build();
        H5ProClient.setBaseUrl("com.huawei.health.h5.offline-map", str);
        if (context == null) {
            H5ProClient.startH5MiniProgram(com.huawei.maps.offlinedata.utils.a.b(), "com.huawei.health.h5.offline-map", h5ProLaunchOptionBuild);
        } else {
            H5ProClient.startH5MiniProgram(context, "com.huawei.health.h5.offline-map", h5ProLaunchOptionBuild);
        }
    }
}
