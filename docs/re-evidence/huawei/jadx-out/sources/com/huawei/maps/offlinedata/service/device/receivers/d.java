package com.huawei.maps.offlinedata.service.device.receivers;

import android.text.TextUtils;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity;
import com.huawei.maps.offlinedata.health.init.OfflineMapPoint;
import com.huawei.maps.offlinedata.health.init.OnDownloadByWearListener;
import com.huawei.maps.offlinedata.health.init.OnOfflineMapListListener;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class d implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile d f17947c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17948a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set f17949b;

    class a implements OnOfflineMapListListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MapOfflineDataItemEntity f17950a;

        a(MapOfflineDataItemEntity mapOfflineDataItemEntity) {
            this.f17950a = mapOfflineDataItemEntity;
        }

        @Override // com.huawei.maps.offlinedata.health.init.OnOfflineMapListListener
        public void onOfflineMapInfoResult(List list, List list2) {
            com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadByWear cloudData mapList is size: " + list.size());
            com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadByWear cloudData mapContourList is size: " + list2.size());
            if (list.isEmpty()) {
                com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "load cloud map data is empty");
                return;
            }
            d.this.a(this.f17950a, "watch_map", list);
            if (d.this.f17949b.size() > 1) {
                if (list2.isEmpty()) {
                    com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "load cloud map contour data is empty");
                } else {
                    d.this.a(this.f17950a, "watch_map_contour", list2);
                }
            }
        }
    }

    private d() {
    }

    public static d a() {
        if (f17947c == null) {
            synchronized (d.class) {
                if (f17947c == null) {
                    f17947c = new d();
                }
            }
        }
        return f17947c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(List list, OnDownloadByWearListener onDownloadByWearListener) {
        try {
            com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "Check offline map getDownloadByLatLngs...");
            com.huawei.maps.offlinedata.service.cloud.a.c().a();
            com.huawei.maps.offlinedata.service.cloud.c.b().a(list, onDownloadByWearListener);
        } catch (Exception e) {
            onDownloadByWearListener.onResult(new ArrayList());
            com.huawei.maps.offlinedata.utils.g.b("DownloadByWearReceiver", "getDownloadByLatLngs exception:" + e.getMessage());
        }
    }

    public void b(final List list, final OnDownloadByWearListener onDownloadByWearListener) {
        boolean zIsSmartWatchApMode = OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().isSmartWatchApMode();
        com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "getDownloadMap isSmartWatchApMode: " + zIsSmartWatchApMode);
        if (!zIsSmartWatchApMode) {
            a(list, onDownloadByWearListener);
            return;
        }
        com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "call queryDevicePing from getDownloadMap");
        com.huawei.maps.offlinedata.service.device.d.a().a(new IOfflineMapPingCallback() { // from class: com.huawei.maps.offlinedata.service.device.receivers.d$$ExternalSyntheticLambda2
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
            if (dVarB == null) {
                com.huawei.maps.offlinedata.utils.g.d("DownloadByWearReceiver", "downloadByWear receiver TlvByteFather is null");
                return;
            }
            int networkType = NetworkUtil.getNetworkType(com.huawei.maps.offlinedata.utils.a.b());
            com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadByWear networkType:" + networkType);
            if (networkType != -1 && networkType == 1) {
                if (!com.huawei.maps.offlinedata.service.init.a.a().b()) {
                    com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadByWear init service is error");
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
                        this.f17948a = com.huawei.maps.offlinedata.service.device.tlvtools.a.b(fVar.b(), -1);
                        com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadByWear downloadType:" + this.f17948a);
                    }
                }
                ArrayList arrayList = new ArrayList();
                OfflineMapPoint offlineMapPoint = new OfflineMapPoint();
                offlineMapPoint.setLat(dA2);
                offlineMapPoint.setLng(dA);
                arrayList.add(offlineMapPoint);
                b(arrayList, new OnDownloadByWearListener() { // from class: com.huawei.maps.offlinedata.service.device.receivers.d$$ExternalSyntheticLambda1
                    @Override // com.huawei.maps.offlinedata.health.init.OnDownloadByWearListener
                    public final void onResult(List list) {
                        this.f$0.a(list);
                    }
                });
                return;
            }
            com.huawei.maps.offlinedata.service.device.d.a().c();
        } catch (com.huawei.maps.offlinedata.service.device.tlvtools.g unused) {
            com.huawei.maps.offlinedata.utils.g.b("DownloadByWearReceiver", "downloadByWear catch TlvException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        if (list != null && list.size() != 0) {
            MapOfflineDataItemEntity mapOfflineDataItemEntity = (MapOfflineDataItemEntity) list.get(0);
            if (com.huawei.maps.offlinedata.service.a.a().b()) {
                com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadByWear h5");
                com.huawei.maps.offlinedata.jsbridge.b.a().a("downloadHandler.autoDownload", mapOfflineDataItemEntity.getCityId());
                return;
            } else {
                com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadByWear native");
                a(mapOfflineDataItemEntity);
                return;
            }
        }
        com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadByWear download map form cloud is null or empty");
    }

    public void a(MapOfflineDataItemEntity mapOfflineDataItemEntity) {
        this.f17949b = com.huawei.maps.offlinedata.service.config.a.h().d();
        OfflineDataTaskEntity offlineDataTaskEntityA = com.huawei.maps.offlinedata.service.persist.b.e().a(mapOfflineDataItemEntity.getCityId(), "watch_map");
        OfflineDataTaskEntity offlineDataTaskEntityA2 = this.f17949b.size() > 1 ? com.huawei.maps.offlinedata.service.persist.b.e().a(mapOfflineDataItemEntity.getCityId(), "watch_map_contour") : null;
        if (offlineDataTaskEntityA == null && offlineDataTaskEntityA2 == null) {
            com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadByWear mapInfo is " + com.huawei.maps.offlinedata.utils.d.a(mapOfflineDataItemEntity));
            com.huawei.maps.offlinedata.service.cloud.b.a().a(new a(mapOfflineDataItemEntity));
            return;
        }
        if (offlineDataTaskEntityA != null) {
            a(offlineDataTaskEntityA, (MapOfflineDataItemEntity) null);
        } else {
            a(offlineDataTaskEntityA2, (MapOfflineDataItemEntity) null);
        }
    }

    public void a(MapOfflineDataItemEntity mapOfflineDataItemEntity, String str, List list) {
        MapOfflineDataItemEntity mapOfflineDataItemEntity2;
        String strI = com.huawei.maps.offlinedata.service.cloud.a.c().i();
        String strG = com.huawei.maps.offlinedata.service.cloud.a.c().g();
        if (!"watch_map".equals(str)) {
            strI = strG;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                mapOfflineDataItemEntity2 = null;
                break;
            }
            mapOfflineDataItemEntity2 = (MapOfflineDataItemEntity) it.next();
            if (mapOfflineDataItemEntity2.getDataType().equals(str) && mapOfflineDataItemEntity2.getCityId().equals(mapOfflineDataItemEntity.getCityId()) && mapOfflineDataItemEntity2.getVersion().equals(strI)) {
                break;
            }
        }
        if (mapOfflineDataItemEntity2 == null) {
            com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadMapByType dataItem is null");
        } else {
            a(com.huawei.maps.offlinedata.service.persist.b.e().a(mapOfflineDataItemEntity.getCityId(), str), mapOfflineDataItemEntity2);
        }
    }

    private void a(OfflineDataTaskEntity offlineDataTaskEntity, MapOfflineDataItemEntity mapOfflineDataItemEntity) {
        if (mapOfflineDataItemEntity == null && offlineDataTaskEntity != null) {
            mapOfflineDataItemEntity = com.huawei.maps.offlinedata.service.persist.b.e().b(offlineDataTaskEntity.getDataType(), offlineDataTaskEntity.getCityId(), offlineDataTaskEntity.getVersion());
        }
        if (offlineDataTaskEntity == null) {
            com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadMapByType dataTask is null, start new task");
            a(this.f17948a, mapOfflineDataItemEntity);
            return;
        }
        com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadMapByType dataTask: " + offlineDataTaskEntity.getPrintState());
        String taskState = offlineDataTaskEntity.getTaskState();
        if (!TextUtils.equals(taskState, "{\"download\":\"doing\"}") && !TextUtils.equals(taskState, "{\"transmit\":\"doing\"}")) {
            offlineDataTaskEntity.setDownloadType(1);
            com.huawei.maps.offlinedata.service.persist.b.e().b(offlineDataTaskEntity.getId(), offlineDataTaskEntity.getDownloadType().intValue());
            if (taskState.contains("download")) {
                com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadMapByType taskState is download, start new task");
                a(offlineDataTaskEntity.getDownloadType().intValue(), mapOfflineDataItemEntity);
                return;
            }
            if (taskState.contains("transmit")) {
                String fileId = mapOfflineDataItemEntity.getFileId();
                if (!com.huawei.maps.offlinedata.utils.c.b(new File(com.huawei.maps.offlinedata.service.storage.a.e().c() + fileId.substring(fileId.lastIndexOf(47)))) && TextUtils.equals(taskState, "{\"transmit\":\"error\"}")) {
                    com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadMapByType taskState is transmit, start new task");
                    com.huawei.maps.offlinedata.service.persist.b.e().a(offlineDataTaskEntity.getId());
                    a(offlineDataTaskEntity.getDownloadType().intValue(), mapOfflineDataItemEntity);
                    return;
                } else {
                    com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadMapByType taskState is transmit");
                    com.huawei.maps.offlinedata.service.device.f.b().a(offlineDataTaskEntity, mapOfflineDataItemEntity);
                    return;
                }
            }
            return;
        }
        com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadMapByType dataTask is doing");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, OnDownloadByWearListener onDownloadByWearListener, int i) {
        com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "getDownloadMap onPingResult code:" + i);
        if (i == 202) {
            a(list, onDownloadByWearListener);
        } else {
            com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "getDownloadMap ping failed.");
            onDownloadByWearListener.onResult(new ArrayList());
        }
    }

    private void a(final List list, final OnDownloadByWearListener onDownloadByWearListener) {
        new Thread(new Runnable() { // from class: com.huawei.maps.offlinedata.service.device.receivers.d$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                d.c(list, onDownloadByWearListener);
            }
        }).start();
    }

    public void a(int i, MapOfflineDataItemEntity mapOfflineDataItemEntity) {
        OfflineDataTaskEntity offlineDataTaskEntity = new OfflineDataTaskEntity();
        offlineDataTaskEntity.setId(String.valueOf(mapOfflineDataItemEntity.getId()));
        offlineDataTaskEntity.setDataType(mapOfflineDataItemEntity.getDataType());
        offlineDataTaskEntity.setCountryId(mapOfflineDataItemEntity.getCountryId());
        offlineDataTaskEntity.setCountryName(mapOfflineDataItemEntity.getCountryName());
        offlineDataTaskEntity.setRegionId(mapOfflineDataItemEntity.getRegionId());
        offlineDataTaskEntity.setRegionName(mapOfflineDataItemEntity.getRegionName());
        offlineDataTaskEntity.setCityId(mapOfflineDataItemEntity.getCityId());
        offlineDataTaskEntity.setCityName(mapOfflineDataItemEntity.getCityName());
        offlineDataTaskEntity.setVersion(mapOfflineDataItemEntity.getVersion());
        offlineDataTaskEntity.setPolitical(com.huawei.maps.offlinedata.service.cloud.a.c().e());
        offlineDataTaskEntity.setDownloadType(Integer.valueOf(i));
        offlineDataTaskEntity.setItemState("processing");
        com.huawei.maps.offlinedata.utils.g.c("DownloadByWearReceiver", "downloadMapByType dataTask: " + offlineDataTaskEntity.getPrintId());
        com.huawei.maps.offlinedata.service.download.b.b().a(offlineDataTaskEntity, mapOfflineDataItemEntity);
    }
}
