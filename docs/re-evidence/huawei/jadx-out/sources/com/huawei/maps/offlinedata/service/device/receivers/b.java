package com.huawei.maps.offlinedata.service.device.receivers;

import android.text.TextUtils;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.health.init.OfflineMapPoint;
import com.huawei.maps.offlinedata.health.init.OnDownloadByWearListener;
import com.huawei.maps.offlinedata.health.init.OnOfflineMapListListener;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class b implements f {
    private static volatile b g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17943c;
    private Set d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17941a = 0;
    private boolean e = false;
    private boolean f = false;

    private b() {
    }

    public static b a() {
        if (g == null) {
            synchronized (b.class) {
                if (g == null) {
                    g = new b();
                }
            }
        }
        return g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(List list, OnDownloadByWearListener onDownloadByWearListener) {
        try {
            com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "check offline map getDownloadByLatLngs...");
            com.huawei.maps.offlinedata.service.cloud.c.b().a(list, onDownloadByWearListener);
        } catch (Exception e) {
            onDownloadByWearListener.onResult(new ArrayList());
            com.huawei.maps.offlinedata.utils.g.b("DeviceQueryMapSizeReceiver", "getDownloadByLatLngs exception:" + e.getMessage());
        }
    }

    public void b(final List list, final OnDownloadByWearListener onDownloadByWearListener) {
        boolean zIsSmartWatchApMode = OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().isSmartWatchApMode();
        com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "getDownloadMap isSmartWatchApMode: " + zIsSmartWatchApMode);
        if (!zIsSmartWatchApMode) {
            a(list, onDownloadByWearListener);
            return;
        }
        com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "call queryDevicePing from getDownloadMap");
        com.huawei.maps.offlinedata.service.device.d.a().a(new IOfflineMapPingCallback() { // from class: com.huawei.maps.offlinedata.service.device.receivers.b$$ExternalSyntheticLambda1
            @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback
            public final void onPingResult(int i) {
                this.f$0.a(list, onDownloadByWearListener, i);
            }
        });
    }

    @Override // com.huawei.maps.offlinedata.service.device.receivers.f
    public void a(int i, byte[] bArr) {
        try {
            com.huawei.maps.offlinedata.service.device.tlvtools.d dVarB = com.huawei.maps.offlinedata.service.device.tlvtools.e.b(bArr);
            com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "deviceQueryMapSize tlvBytes:" + bArr);
            if (dVarB == null) {
                com.huawei.maps.offlinedata.utils.g.d("DeviceQueryMapSizeReceiver", "deviceQueryMapSize receiver TlvByteFather is null");
                return;
            }
            int networkType = NetworkUtil.getNetworkType(com.huawei.maps.offlinedata.utils.a.b());
            com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "deviceQueryMapSize networkType:" + networkType);
            if (networkType == -1) {
                com.huawei.maps.offlinedata.service.device.d.a().c();
                return;
            }
            if (networkType != 1) {
                com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "current network type is not wifi: " + networkType);
                com.huawei.maps.offlinedata.service.device.d.a().a(0);
                return;
            }
            if (!com.huawei.maps.offlinedata.service.cloud.a.c().a()) {
                com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "deviceQueryMapSize auth fail");
                com.huawei.maps.offlinedata.service.device.d.a().a(0);
                return;
            }
            if (!com.huawei.maps.offlinedata.service.init.a.a().b()) {
                com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "deviceQueryMapSize init service is error");
                com.huawei.maps.offlinedata.service.device.d.a().a(0);
                return;
            }
            double dA = 0.0d;
            double dA2 = 0.0d;
            for (com.huawei.maps.offlinedata.service.device.tlvtools.f fVar : dVarB.b()) {
                if (fVar.a() == 23) {
                    dA = com.huawei.maps.offlinedata.service.device.tlvtools.a.a(fVar.b(), 0.0d);
                }
                if (fVar.a() == 24) {
                    dA2 = com.huawei.maps.offlinedata.service.device.tlvtools.a.a(fVar.b(), 0.0d);
                }
                if (fVar.a() == 22) {
                    this.f17941a = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(fVar.b(), -1);
                    com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "deviceQueryMapSize downloadType:" + this.f17941a);
                }
            }
            ArrayList arrayList = new ArrayList();
            OfflineMapPoint offlineMapPoint = new OfflineMapPoint();
            offlineMapPoint.setLat(dA2);
            offlineMapPoint.setLng(dA);
            arrayList.add(offlineMapPoint);
            b(arrayList, new OnDownloadByWearListener() { // from class: com.huawei.maps.offlinedata.service.device.receivers.b$$ExternalSyntheticLambda2
                @Override // com.huawei.maps.offlinedata.health.init.OnDownloadByWearListener
                public final void onResult(List list) {
                    this.f$0.a(list);
                }
            });
        } catch (com.huawei.maps.offlinedata.service.device.tlvtools.g unused) {
            com.huawei.maps.offlinedata.utils.g.b("DeviceQueryMapSizeReceiver", "deviceQueryMapSize catch TlvException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        if (list != null && list.size() != 0) {
            a((MapOfflineDataItemEntity) list.get(0));
        } else {
            com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "deviceQueryMapSize download map form cloud is null or empty");
            com.huawei.maps.offlinedata.service.device.d.a().a(0);
        }
    }

    public void a(MapOfflineDataItemEntity mapOfflineDataItemEntity) {
        com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "deviceQueryMapSize mapInfo is " + com.huawei.maps.offlinedata.utils.d.a(mapOfflineDataItemEntity));
        this.f17942b = com.huawei.maps.offlinedata.service.cloud.a.c().i();
        this.f17943c = com.huawei.maps.offlinedata.service.cloud.a.c().g();
        Set<String> setD = com.huawei.maps.offlinedata.service.config.a.h().d();
        this.d = setD;
        for (String str : setD) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "deviceQueryMapSize cloud dataType is " + str);
            if (com.huawei.maps.offlinedata.service.persist.b.e().b(str, mapOfflineDataItemEntity.getCityId(), "watch_map".equals(str) ? this.f17942b : this.f17943c) == null) {
                if ("watch_map".equals(str)) {
                    this.e = true;
                } else {
                    this.f = true;
                }
            }
        }
        if (!this.e && !this.f) {
            double dA = 0.0d;
            for (String str2 : this.d) {
                com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "deviceQueryMapSize cloud dataType is " + str2);
                dA += a(mapOfflineDataItemEntity, str2, new ArrayList());
            }
            com.huawei.maps.offlinedata.service.device.d.a().a((int) Math.ceil(dA));
            return;
        }
        com.huawei.maps.offlinedata.service.cloud.b.a().a(new a(mapOfflineDataItemEntity));
    }

    public double a(MapOfflineDataItemEntity mapOfflineDataItemEntity, String str, List list) {
        MapOfflineDataItemEntity mapOfflineDataItemEntityB;
        String str2 = "watch_map".equals(str) ? this.f17942b : this.f17943c;
        if (list.isEmpty()) {
            mapOfflineDataItemEntityB = com.huawei.maps.offlinedata.service.persist.b.e().b(str, mapOfflineDataItemEntity.getCityId(), str2);
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    mapOfflineDataItemEntityB = null;
                    break;
                }
                MapOfflineDataItemEntity mapOfflineDataItemEntity2 = (MapOfflineDataItemEntity) it.next();
                if (TextUtils.equals(mapOfflineDataItemEntity2.getDataType(), str) && TextUtils.equals(mapOfflineDataItemEntity2.getCityId(), mapOfflineDataItemEntity.getCityId()) && TextUtils.equals(mapOfflineDataItemEntity2.getVersion(), str2)) {
                    mapOfflineDataItemEntityB = mapOfflineDataItemEntity2;
                    break;
                }
            }
        }
        if (mapOfflineDataItemEntityB == null) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "downloadMapByType dataItem is null");
            return 0.0d;
        }
        double d = Double.parseDouble(mapOfflineDataItemEntityB.getOriginalSize());
        com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "deviceQueryMapSize mapSize is " + d);
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, OnDownloadByWearListener onDownloadByWearListener, int i) {
        com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "getDownloadMap onPingResult code:" + i);
        if (i == 202) {
            a(list, onDownloadByWearListener);
        } else {
            com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "getDownloadMap ping failed.");
            onDownloadByWearListener.onResult(new ArrayList());
        }
    }

    private void a(final List list, final OnDownloadByWearListener onDownloadByWearListener) {
        new Thread(new Runnable() { // from class: com.huawei.maps.offlinedata.service.device.receivers.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                b.c(list, onDownloadByWearListener);
            }
        }).start();
    }

    class a implements OnOfflineMapListListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MapOfflineDataItemEntity f17944a;

        a(MapOfflineDataItemEntity mapOfflineDataItemEntity) {
            this.f17944a = mapOfflineDataItemEntity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b() {
        }

        @Override // com.huawei.maps.offlinedata.health.init.OnOfflineMapListListener
        public void onOfflineMapInfoResult(List list, List list2) {
            com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "deviceQueryMapSize cloudData mapList is size: " + list.size());
            com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "deviceQueryMapSize cloudData mapContourList is size: " + list2.size());
            double dA = 0.0d;
            for (String str : b.this.d) {
                com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "deviceQueryMapSize cloud dataType is " + str);
                if ("watch_map".equals(str)) {
                    if (list.isEmpty()) {
                        com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "load cloud mapList data is empty");
                    } else {
                        if (b.this.e) {
                            com.huawei.maps.offlinedata.service.persist.b.e().a("watch_map", list, new Runnable() { // from class: com.huawei.maps.offlinedata.service.device.receivers.b$a$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    b.a.a();
                                }
                            });
                        }
                        dA += b.this.a(this.f17944a, str, list);
                    }
                }
                if ("watch_map_contour".equals(str)) {
                    if (list2.isEmpty()) {
                        com.huawei.maps.offlinedata.utils.g.c("DeviceQueryMapSizeReceiver", "load cloud data is empty");
                    } else {
                        if (b.this.f) {
                            com.huawei.maps.offlinedata.service.persist.b.e().a("watch_map_contour", list2, new Runnable() { // from class: com.huawei.maps.offlinedata.service.device.receivers.b$a$$ExternalSyntheticLambda1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    b.a.b();
                                }
                            });
                        }
                        dA += b.this.a(this.f17944a, str, list2);
                    }
                }
            }
            com.huawei.maps.offlinedata.service.device.d.a().a((int) Math.ceil(dA));
        }
    }
}
