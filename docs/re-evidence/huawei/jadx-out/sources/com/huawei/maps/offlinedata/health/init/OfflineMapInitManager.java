package com.huawei.maps.offlinedata.health.init;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity;
import com.huawei.maps.offlinedata.health.log.ILogHealth;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback;
import com.huawei.maps.offlinedata.service.cloud.c;
import com.huawei.maps.offlinedata.service.device.b;
import com.huawei.maps.offlinedata.service.device.d;
import com.huawei.maps.offlinedata.service.device.f;
import com.huawei.maps.offlinedata.utils.a;
import com.huawei.maps.offlinedata.utils.g;
import com.huawei.maps.offlinedata.utils.j;
import com.huawei.openalliance.ad.constant.VastAttribute;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class OfflineMapInitManager {
    private static final String TAG = "OfflineMapInitManager";
    private static volatile OfflineMapInitManager mInstance;

    private OfflineMapInitManager() {
    }

    public static OfflineMapInitManager getInstance() {
        if (mInstance == null) {
            synchronized (OfflineMapInitManager.class) {
                if (mInstance == null) {
                    mInstance = new OfflineMapInitManager();
                }
            }
        }
        return mInstance;
    }

    private void getRegionsByLatLngs(final Context context, final List<OfflineMapPoint> list, final OnCheckRegionListListener onCheckRegionListListener) {
        new Thread(new Runnable() { // from class: com.huawei.maps.offlinedata.health.init.OfflineMapInitManager$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                OfflineMapInitManager.lambda$getRegionsByLatLngs$6(context, list, onCheckRegionListListener);
            }
        }).start();
    }

    static /* synthetic */ void lambda$checkForUpdate$4(Context context, OnCheckUpdatesListener onCheckUpdatesListener, String str) {
        try {
            g.c(TAG, "Check offline map updates for red...");
            a.a(context);
            if (com.huawei.maps.offlinedata.service.a.a().c()) {
                g.c(TAG, "Auto update are enable. Skip check.");
                onCheckUpdatesListener.onResult(false);
                return;
            }
            g.c(TAG, "Auto update are disable.");
            com.huawei.maps.offlinedata.service.cloud.a.c().a();
            String strI = com.huawei.maps.offlinedata.service.cloud.a.c().i();
            String strG = com.huawei.maps.offlinedata.service.cloud.a.c().g();
            String strH = com.huawei.maps.offlinedata.service.cloud.a.c().h();
            if (TextUtils.isEmpty(strI) && TextUtils.isEmpty(strG) && TextUtils.isEmpty(strH)) {
                g.b(TAG, "Failed to obtain the data version. Can't check for updates.");
                onCheckUpdatesListener.onResult(false);
                return;
            }
            String strA = j.a("lastOfflineMapDataVersion" + str, (String) null, context);
            String strA2 = j.a("lastOfflineContourMapDataVersion" + str, (String) null, context);
            String strA3 = j.a("lastOfflineSkiMapDataVersion" + str, (String) null, context);
            if (!TextUtils.equals(strI, strA) || !TextUtils.equals(strG, strA2) || !TextUtils.equals(strH, strA3)) {
                b.a().a(onCheckUpdatesListener);
            } else {
                g.c(TAG, "The version of the offline map data on the cloud isn't updated. Skip check.");
                onCheckUpdatesListener.onResult(false);
            }
        } catch (Exception e) {
            g.b(TAG, "check4Updates exception:" + e.getMessage());
            onCheckUpdatesListener.onResult(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkForUpdates$3(Context context, String str, OnCheckUpdatesListener onCheckUpdatesListener, int i) {
        g.c(TAG, "checkForUpdates onPingResult code:" + i);
        if (i == 202) {
            checkForUpdate(context, str, onCheckUpdatesListener);
        } else {
            g.c(TAG, "checkForUpdates ping failed.");
            onCheckUpdatesListener.onResult(false);
        }
    }

    static /* synthetic */ void lambda$createOfflineDataMap$0(List list) {
        g.c(TAG, "no running task.will pause all task. size is " + list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OfflineDataTaskEntity offlineDataTaskEntity = (OfflineDataTaskEntity) it.next();
            if (!offlineDataTaskEntity.getTaskState().contains("transmit")) {
                String taskState = offlineDataTaskEntity.getTaskState();
                if (taskState.contains("pause") || taskState.contains(VastAttribute.ERROR)) {
                    g.c(TAG, "the task has paused or error. skip set download pause " + offlineDataTaskEntity.getPrintId());
                } else {
                    offlineDataTaskEntity.setTaskState("{\"download\":\"pause\"}");
                }
            } else if (!TextUtils.equals(offlineDataTaskEntity.getTaskState(), "{\"transmit\":\"parsing\"}")) {
                offlineDataTaskEntity.setTransmitProgress(0);
                offlineDataTaskEntity.setTaskState("{\"transmit\":\"pause\"}");
            }
            com.huawei.maps.offlinedata.service.persist.b.e().c(offlineDataTaskEntity.getId(), offlineDataTaskEntity.getItemState(), offlineDataTaskEntity.getTaskState());
            com.huawei.maps.offlinedata.service.persist.b.e().b(offlineDataTaskEntity.getId(), offlineDataTaskEntity.getDownloadProgress().intValue(), offlineDataTaskEntity.getTransmitProgress().intValue());
        }
    }

    static /* synthetic */ void lambda$createOfflineDataMap$2(Handler handler, final OfflineMapInitOptions offlineMapInitOptions, OnCreateResultListener onCreateResultListener) {
        try {
            if (com.huawei.maps.offlinedata.service.download.b.b().d().isEmpty() && f.b().c().get() == null) {
                com.huawei.maps.offlinedata.service.persist.b.e().h(new com.huawei.maps.offlinedata.utils.b() { // from class: com.huawei.maps.offlinedata.health.init.OfflineMapInitManager$$ExternalSyntheticLambda0
                    @Override // com.huawei.maps.offlinedata.utils.b
                    public final void a(Object obj) {
                        OfflineMapInitManager.lambda$createOfflineDataMap$0((List) obj);
                    }
                });
            }
            handler.post(new Runnable() { // from class: com.huawei.maps.offlinedata.health.init.OfflineMapInitManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineMapInitOptions offlineMapInitOptions2 = offlineMapInitOptions;
                    com.huawei.maps.offlinedata.service.init.a.a().a(offlineMapInitOptions2.getActivity(), offlineMapInitOptions2.getH5proUrl(), true);
                }
            });
            g.c(TAG, "save last watch map version.");
            String strI = com.huawei.maps.offlinedata.service.cloud.a.c().i();
            String strG = com.huawei.maps.offlinedata.service.cloud.a.c().g();
            String strH = com.huawei.maps.offlinedata.service.cloud.a.c().h();
            j.b("lastOfflineMapDataVersion" + offlineMapInitOptions.getUniqueDevice(), strI, offlineMapInitOptions.getContext());
            j.b("lastOfflineContourMapDataVersion" + offlineMapInitOptions.getUniqueDevice(), strG, offlineMapInitOptions.getContext());
            j.b("lastOfflineSkiMapDataVersion" + offlineMapInitOptions.getUniqueDevice(), strH, offlineMapInitOptions.getContext());
        } catch (Exception e) {
            g.b(TAG, "createOfflineDataMap exception:" + e.getMessage());
        }
        onCreateResultListener.onCreateResult(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getRegionByLatLngs$5(Context context, List list, OnCheckRegionListListener onCheckRegionListListener, int i) {
        g.c(TAG, "getRegionByLatLngs onPingResult code:" + i);
        if (i == 202) {
            getRegionsByLatLngs(context, list, onCheckRegionListListener);
        } else {
            g.c(TAG, "getRegionByLatLngs ping failed.");
            onCheckRegionListListener.onResult(new ArrayList());
        }
    }

    static /* synthetic */ void lambda$getRegionsByLatLngs$6(Context context, List list, OnCheckRegionListListener onCheckRegionListListener) {
        try {
            g.c(TAG, "Check offline map getRegionByLatLngs...");
            a.a(context);
            com.huawei.maps.offlinedata.service.cloud.a.c().a();
            c.b().a(list, onCheckRegionListListener);
        } catch (Exception e) {
            onCheckRegionListListener.onResult(new ArrayList());
            g.b(TAG, "getRegionByLatLngs exception:" + e.getMessage());
        }
    }

    public static void setLogHealth(ILogHealth iLogHealth) {
        g.a(iLogHealth);
    }

    public void checkForUpdate(final Context context, final String str, final OnCheckUpdatesListener onCheckUpdatesListener) {
        new Thread(new Runnable() { // from class: com.huawei.maps.offlinedata.health.init.OfflineMapInitManager$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                OfflineMapInitManager.lambda$checkForUpdate$4(context, onCheckUpdatesListener, str);
            }
        }).start();
    }

    public void checkForUpdates(final Context context, final String str, final OnCheckUpdatesListener onCheckUpdatesListener) {
        boolean zIsSmartWatchApMode = OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().isSmartWatchApMode();
        g.c(TAG, "checkForUpdates--isSmartWatchApMode--" + zIsSmartWatchApMode);
        if (!zIsSmartWatchApMode) {
            checkForUpdate(context, str, onCheckUpdatesListener);
            return;
        }
        g.c(TAG, "call queryDevicePing from checkForUpdates.");
        d.a().a(new IOfflineMapPingCallback() { // from class: com.huawei.maps.offlinedata.health.init.OfflineMapInitManager$$ExternalSyntheticLambda6
            @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback
            public final void onPingResult(int i) {
                this.f$0.lambda$checkForUpdates$3(context, str, onCheckUpdatesListener, i);
            }
        });
    }

    public void clearCacheOnDeviceChanged(String str) {
        a.a(str);
        String strA = j.a("unique_device", "", a.b());
        int iA = a.a();
        g.c(TAG, "clearCacheOnDeviceChanged status is " + iA);
        if (iA != 1) {
            if (iA == 0) {
                com.huawei.maps.offlinedata.service.config.a.h().c(!strA.equals(str));
            }
        } else {
            if (strA.equals(str)) {
                return;
            }
            g.d(TAG, "clearCacheOnDeviceChanged device changed.");
            com.huawei.maps.offlinedata.service.persist.b.e().a();
            com.huawei.maps.offlinedata.utils.c.c(new File(com.huawei.maps.offlinedata.service.storage.a.e().f()));
            j.b("unique_device", str, a.b());
        }
    }

    public boolean createOfflineDataMap(final OfflineMapInitOptions offlineMapInitOptions, final OnCreateResultListener onCreateResultListener) {
        String[] recommendCityIds = offlineMapInitOptions.getRecommendCityIds();
        a.a(offlineMapInitOptions.getContext());
        com.huawei.maps.offlinedata.logpush.dto.a aVarA = com.huawei.maps.offlinedata.logpush.dto.a.C0185a.c().a((recommendCityIds == null || recommendCityIds.length <= 0) ? "createOfflineDataMap" : "createOfflineDataMapFromRoutes").a();
        if (TextUtils.isEmpty(offlineMapInitOptions.getH5proUrl()) || TextUtils.isEmpty(offlineMapInitOptions.getUniqueDevice())) {
            g.b(TAG, "createOfflineDataMap uniqueDevice or h5proUrl is empty.");
            aVarA.b("060013");
            com.huawei.maps.offlinedata.logpush.b.b(aVarA);
            return false;
        }
        g.c(TAG, "h5proUrl():" + offlineMapInitOptions.getH5proUrl());
        clearCacheOnDeviceChanged(offlineMapInitOptions.getUniqueDevice());
        com.huawei.maps.offlinedata.service.config.a.h().b(offlineMapInitOptions.getDeviceName());
        com.huawei.maps.offlinedata.service.config.a.h().a(offlineMapInitOptions.getRecommendCityIds());
        if (!com.huawei.maps.offlinedata.service.init.a.a().b()) {
            aVarA.b("060014");
            com.huawei.maps.offlinedata.logpush.b.b(aVarA);
            return false;
        }
        final Handler handler = new Handler(offlineMapInitOptions.getContext().getMainLooper());
        new Thread(new Runnable() { // from class: com.huawei.maps.offlinedata.health.init.OfflineMapInitManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                OfflineMapInitManager.lambda$createOfflineDataMap$2(handler, offlineMapInitOptions, onCreateResultListener);
            }
        }).start();
        aVarA.b("0");
        com.huawei.maps.offlinedata.logpush.b.b(aVarA);
        return true;
    }

    public void getRegionByLatLngs(final Context context, final List<OfflineMapPoint> list, final OnCheckRegionListListener onCheckRegionListListener) {
        boolean zIsSmartWatchApMode = OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().isSmartWatchApMode();
        g.c(TAG, "getRegionByLatLngs--isSmartWatchApMode--" + zIsSmartWatchApMode);
        if (!zIsSmartWatchApMode) {
            getRegionsByLatLngs(context, list, onCheckRegionListListener);
            return;
        }
        g.c(TAG, "call queryDevicePing from getRegionByLatLngs.");
        d.a().a(new IOfflineMapPingCallback() { // from class: com.huawei.maps.offlinedata.health.init.OfflineMapInitManager$$ExternalSyntheticLambda2
            @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback
            public final void onPingResult(int i) {
                this.f$0.lambda$getRegionByLatLngs$5(context, list, onCheckRegionListListener, i);
            }
        });
    }
}
