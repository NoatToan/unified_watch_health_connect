package com.huawei.maps.offlinedata.service.device;

import android.text.TextUtils;
import com.huawei.maps.offlinedata.handler.dto.device.DownloadMapInfo;
import com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.health.init.OnCheckRegionListListener;
import com.huawei.maps.offlinedata.health.init.OnCheckUpdatesListListener;
import com.huawei.maps.offlinedata.health.init.OnCheckUpdatesListener;
import com.huawei.maps.offlinedata.health.init.OnObtainMapDataListener;
import com.huawei.maps.offlinedata.utils.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class b implements OnObtainMapDataListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f17893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static OnCheckUpdatesListener f17894c;
    private static OnCheckUpdatesListListener d;
    private static OnCheckRegionListListener e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f17895a;

    private b() {
    }

    public static b a() {
        if (f17893b == null) {
            synchronized (b.class) {
                if (f17893b == null) {
                    f17893b = new b();
                }
            }
        }
        return f17893b;
    }

    public String b() {
        return com.huawei.maps.offlinedata.service.cloud.a.c().g();
    }

    public String c() {
        return com.huawei.maps.offlinedata.service.cloud.a.c().i();
    }

    public String d() {
        return com.huawei.maps.offlinedata.service.cloud.a.c().h();
    }

    @Override // com.huawei.maps.offlinedata.health.init.OnObtainMapDataListener
    public void downLoadInfo(List list, int i) {
        g.c("DeviceReceiverService", "Received device response for check updates.");
        if (i == 10003) {
            a(list);
            return;
        }
        if (!list.isEmpty()) {
            if (i == 10001) {
                c(list);
                return;
            } else {
                b(list);
                return;
            }
        }
        g.c("DeviceReceiverService", "The device map list is empty.");
        if (i == 10001) {
            f17894c.onResult(false);
        } else {
            d.onOfflineMapsInfoResult(new ArrayList());
        }
    }

    private void b(List list) {
        g.c("DeviceReceiverService", "Contrast map data version for auto updates.");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DownloadMapInfo downloadMapInfo = (DownloadMapInfo) it.next();
            String strValueOf = String.valueOf(downloadMapInfo.getVersion());
            int mspType = downloadMapInfo.getMspType();
            if (mspType == 1 && !TextUtils.equals(strValueOf, b())) {
                arrayList.add(downloadMapInfo);
            } else if (mspType == 3 && !TextUtils.equals(strValueOf, d())) {
                arrayList.add(downloadMapInfo);
            } else if (!TextUtils.equals(strValueOf, c())) {
                arrayList.add(downloadMapInfo);
            }
        }
        g.c("DeviceReceiverService", "the device map data needed updated size is " + arrayList.size());
        if (!arrayList.isEmpty()) {
            com.huawei.maps.offlinedata.service.cloud.b.a().a(arrayList, d);
        } else {
            g.c("DeviceReceiverService", "the device map data no need update.");
            d.onOfflineMapsInfoResult(new ArrayList());
        }
    }

    private void c(List list) {
        g.c("DeviceReceiverService", "Contrast map data version for check updates.");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DownloadMapInfo downloadMapInfo = (DownloadMapInfo) it.next();
            String strValueOf = String.valueOf(downloadMapInfo.getVersion());
            int mspType = downloadMapInfo.getMspType();
            if (mspType == 1 && !TextUtils.equals(strValueOf, b())) {
                g.c("DeviceReceiverService", "The offline contour map has update.");
                f17894c.onResult(true);
                return;
            } else if (mspType == 0 && !TextUtils.equals(strValueOf, c())) {
                g.c("DeviceReceiverService", "The offline map has update.");
                f17894c.onResult(true);
                return;
            } else if (mspType == 3 && !TextUtils.equals(strValueOf, d())) {
                g.c("DeviceReceiverService", "The offline ski has update.");
                f17894c.onResult(true);
                return;
            }
        }
        f17894c.onResult(false);
    }

    public void a(OnCheckUpdatesListener onCheckUpdatesListener) {
        f17894c = onCheckUpdatesListener;
        g.c("DeviceReceiverService", "queryDeviceDownloadedMapInfo for check update red.");
        d.a().a(0L, (Integer) 10001);
    }

    public void a(OnCheckUpdatesListListener onCheckUpdatesListListener) {
        d = onCheckUpdatesListListener;
        g.c("DeviceReceiverService", "queryDeviceDownloadedMapInfo for auto update.");
        d.a().a(0L, (Integer) 10000);
    }

    public void a(List list, OnCheckRegionListListener onCheckRegionListListener) {
        this.f17895a = list;
        e = onCheckRegionListListener;
        g.c("DeviceReceiverService", "queryDeviceDownloadedMapInfo for region.");
        d.a().a(0L, (Integer) 10003);
    }

    private void a(List list) {
        List list2 = this.f17895a;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (MapOfflineDataItemEntity mapOfflineDataItemEntity : this.f17895a) {
                if (!list.isEmpty()) {
                    g.c("DeviceReceiverService", "The device map list is not empty.");
                    Iterator it = list.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!TextUtils.equals(mapOfflineDataItemEntity.getCityId(), ((DownloadMapInfo) it.next()).getCityId()));
                }
                arrayList.add(mapOfflineDataItemEntity.getCityId());
            }
            e.onResult(arrayList);
            return;
        }
        g.c("DeviceReceiverService", "getRegionByLatLngs getRegions is null or empty");
        e.onResult(new ArrayList());
    }
}
