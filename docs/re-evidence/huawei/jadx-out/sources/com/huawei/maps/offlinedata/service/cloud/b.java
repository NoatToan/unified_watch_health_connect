package com.huawei.maps.offlinedata.service.cloud;

import android.text.TextUtils;
import com.huawei.maps.offlinedata.handler.dto.device.DownloadMapInfo;
import com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.health.init.OnCheckUpdatesListListener;
import com.huawei.maps.offlinedata.health.init.OnOfflineMapListListener;
import com.huawei.maps.offlinedata.utils.d;
import com.huawei.maps.offlinedata.utils.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes12.dex */
public class b {
    private static volatile b h;
    private OnCheckUpdatesListListener d;
    private OnOfflineMapListListener e;
    private CountDownLatch g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f17879a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f17880b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f17881c = new ArrayList();
    private boolean f = false;

    private b() {
    }

    public static b a() {
        if (h == null) {
            synchronized (b.class) {
                if (h == null) {
                    h = new b();
                }
            }
        }
        return h;
    }

    private void c() {
        if (this.f) {
            g.b("CloudDeviceDataContrast", "device or cloud data not ready.");
            this.d.onOfflineMapsInfoResult(new ArrayList());
            return;
        }
        g.c("CloudDeviceDataContrast", "device and cloud data all ready.");
        ArrayList arrayList = new ArrayList();
        for (DownloadMapInfo downloadMapInfo : this.f17881c) {
            int mspType = downloadMapInfo.getMspType();
            if (mspType == 1) {
                for (MapOfflineDataItemEntity mapOfflineDataItemEntity : this.f17880b) {
                    if (TextUtils.equals(mapOfflineDataItemEntity.getCityId(), downloadMapInfo.getCityId()) && !TextUtils.equals(mapOfflineDataItemEntity.getVersion(), String.valueOf(downloadMapInfo.getVersion()))) {
                        arrayList.add(mapOfflineDataItemEntity);
                        break;
                    }
                }
            } else if (mspType == 0) {
                for (MapOfflineDataItemEntity mapOfflineDataItemEntity2 : this.f17879a) {
                    if (TextUtils.equals(mapOfflineDataItemEntity2.getCityId(), downloadMapInfo.getCityId()) && !TextUtils.equals(mapOfflineDataItemEntity2.getVersion(), String.valueOf(downloadMapInfo.getVersion()))) {
                        arrayList.add(mapOfflineDataItemEntity2);
                        break;
                    }
                }
            } else if (mspType == 2) {
                for (MapOfflineDataItemEntity mapOfflineDataItemEntity3 : this.f17879a) {
                    if (mapOfflineDataItemEntity3.isGlobal() && !TextUtils.equals(mapOfflineDataItemEntity3.getVersion(), String.valueOf(downloadMapInfo.getVersion()))) {
                        arrayList.add(mapOfflineDataItemEntity3);
                        break;
                    }
                }
            } else if (mspType == 3) {
                for (MapOfflineDataItemEntity mapOfflineDataItemEntity4 : this.f17879a) {
                    if (mapOfflineDataItemEntity4.isSki() && !TextUtils.equals(mapOfflineDataItemEntity4.getVersion(), String.valueOf(downloadMapInfo.getVersion()))) {
                        arrayList.add(mapOfflineDataItemEntity4);
                        break;
                    }
                }
            }
        }
        if (arrayList.size() != this.f17881c.size()) {
            g.d("CloudDeviceDataContrast", "some item in device are not find in cloud data.");
        }
        g.c("CloudDeviceDataContrast", "the map list needed updated size is " + arrayList.size());
        this.d.onOfflineMapsInfoResult(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f = false;
        Set setD = com.huawei.maps.offlinedata.service.config.a.h().d();
        g.c("CloudDeviceDataContrast", "getCloudData categories: " + d.a(setD));
        this.g = new CountDownLatch(setD.size());
        Iterator it = setD.iterator();
        while (it.hasNext()) {
            c.b().c((String) it.next());
        }
        try {
            this.g.await();
            b();
        } catch (InterruptedException e) {
            g.b("CloudDeviceDataContrast", "getCloudData failed." + e.getMessage());
            this.e.onOfflineMapInfoResult(new ArrayList(), new ArrayList());
        }
    }

    public void b(List list) {
        if (list.isEmpty()) {
            this.f = true;
        }
        g.c("CloudDeviceDataContrast", "watchMapRegionData load finish.");
        this.f17879a.addAll(list);
        CountDownLatch countDownLatch = this.g;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    private void b() {
        g.c("CloudDeviceDataContrast", "handlerCloudList");
        if (this.f) {
            g.b("CloudDeviceDataContrast", "cloud data not ready.");
            this.e.onOfflineMapInfoResult(new ArrayList(), new ArrayList());
            return;
        }
        g.c("CloudDeviceDataContrast", "watch map data size is: " + this.f17879a.size());
        g.c("CloudDeviceDataContrast", "watch map contour data size is: " + this.f17880b.size());
        this.e.onOfflineMapInfoResult(this.f17879a, this.f17880b);
    }

    public void a(MapOfflineDataItemEntity mapOfflineDataItemEntity) {
        if (mapOfflineDataItemEntity != null) {
            this.f17879a.add(mapOfflineDataItemEntity);
        } else {
            this.f = true;
        }
        g.c("CloudDeviceDataContrast", "watchMapGlobalData load finish.");
        CountDownLatch countDownLatch = this.g;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void a(List list) {
        if (list.isEmpty()) {
            this.f = true;
        }
        g.c("CloudDeviceDataContrast", "watchContourMapRegionData load finish.");
        this.f17880b.addAll(list);
        CountDownLatch countDownLatch = this.g;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void a(List list, final OnCheckUpdatesListListener onCheckUpdatesListListener) {
        this.f17881c = list;
        this.d = onCheckUpdatesListListener;
        this.f17879a.clear();
        this.f17880b.clear();
        new Thread(new Runnable() { // from class: com.huawei.maps.offlinedata.service.cloud.b$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(onCheckUpdatesListListener);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(OnCheckUpdatesListListener onCheckUpdatesListListener) {
        this.f = false;
        Set setD = com.huawei.maps.offlinedata.service.config.a.h().d();
        int size = setD.size();
        int i = size + 1;
        if (com.huawei.maps.offlinedata.service.config.a.h().i()) {
            i = size + 2;
        }
        this.g = new CountDownLatch(i);
        if (com.huawei.maps.offlinedata.service.config.a.h().i()) {
            c.b().b("watch_map_ski");
        }
        c.b().b("");
        Iterator it = setD.iterator();
        while (it.hasNext()) {
            c.b().c((String) it.next());
        }
        try {
            this.g.await();
            c();
        } catch (InterruptedException e) {
            g.b("CloudDeviceDataContrast", "check auto update failed." + e.getMessage());
            onCheckUpdatesListListener.onOfflineMapsInfoResult(new ArrayList());
        }
    }

    public void a(OnOfflineMapListListener onOfflineMapListListener) {
        this.e = onOfflineMapListListener;
        this.f17879a.clear();
        this.f17880b.clear();
        new Thread(new Runnable() { // from class: com.huawei.maps.offlinedata.service.cloud.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        }).start();
    }
}
