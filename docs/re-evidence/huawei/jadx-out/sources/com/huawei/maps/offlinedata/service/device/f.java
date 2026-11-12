package com.huawei.maps.offlinedata.service.device;

import android.text.TextUtils;
import com.huawei.maps.offlinedata.handler.dto.device.TransmitRequest;
import com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity;
import com.huawei.maps.offlinedata.health.p2p.OfflineMapWearEngineManager;
import com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback;
import com.huawei.maps.offlinedata.utils.g;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public class f {
    private static volatile f e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f17937b = new AtomicReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f17938c = new CopyOnWriteArrayList();
    private boolean d = true;

    private f() {
    }

    public static f b() {
        if (e == null) {
            synchronized (f.class) {
                if (e == null) {
                    e = new f();
                }
            }
        }
        return e;
    }

    public void a() {
        this.f17938c.clear();
    }

    public AtomicReference c() {
        return this.f17937b;
    }

    public void d(OfflineDataTaskEntity offlineDataTaskEntity) {
        g.c("OfflineMapTransmitManager", "transmitMap " + offlineDataTaskEntity.getPrintId());
        b(offlineDataTaskEntity, com.huawei.maps.offlinedata.service.persist.b.e().b(offlineDataTaskEntity.getDataType(), offlineDataTaskEntity.getCityId(), offlineDataTaskEntity.getVersion()));
    }

    public void a(boolean z) {
        this.d = z;
    }

    public void c(OfflineDataTaskEntity offlineDataTaskEntity) {
        this.d = false;
        this.f17937b.set(offlineDataTaskEntity);
    }

    public void a(final TransmitRequest transmitRequest, final long j) {
        g.c("OfflineMapTransmitManager", "the transmit file id is " + new File(transmitRequest.getFileDecompressDir()).getName());
        d.a().a(new IOfflineMapPingCallback() { // from class: com.huawei.maps.offlinedata.service.device.f$$ExternalSyntheticLambda1
            @Override // com.huawei.maps.offlinedata.health.p2p.sender.IOfflineMapPingCallback
            public final void onPingResult(int i) {
                this.f$0.a(j, transmitRequest, i);
            }
        });
    }

    public void c(String str) {
        com.huawei.maps.offlinedata.logpush.dto.a aVarA = com.huawei.maps.offlinedata.logpush.dto.a.C0185a.b().a("transmit").a();
        aVarA.b("0");
        com.huawei.maps.offlinedata.logpush.b.b(aVarA);
        if (!com.huawei.maps.offlinedata.service.a.a().b()) {
            this.d = true;
        }
        OfflineDataTaskEntity offlineDataTaskEntity = (OfflineDataTaskEntity) this.f17937b.get();
        this.f17937b.set(null);
        if (!this.d) {
            com.huawei.maps.offlinedata.jsbridge.b.a().a("deviceClient.success", String.valueOf(str));
            return;
        }
        Iterator it = this.f17938c.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(((OfflineDataTaskEntity) it.next()).getIndexId(), offlineDataTaskEntity.getIndexId())) {
                offlineDataTaskEntity.setTaskState("{\"transmit\":\"wait\"}");
            }
        }
        if (OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap() != null && OfflineMapWearEngineManager.getInstance().getWearEngine4OfflineMap().isSmartWatchApMode()) {
            offlineDataTaskEntity.setTaskState("{\"transmit\":\"parsing\"}");
        } else if (!TextUtils.equals(offlineDataTaskEntity.getTaskState(), "{\"transmit\":\"wait\"}")) {
            offlineDataTaskEntity.setTaskState("\"finished\"");
            offlineDataTaskEntity.setItemState("used");
        }
        com.huawei.maps.offlinedata.service.persist.b.e().b(offlineDataTaskEntity.getId(), 100, 100);
        com.huawei.maps.offlinedata.service.persist.b.e().c(offlineDataTaskEntity.getId(), offlineDataTaskEntity.getItemState(), offlineDataTaskEntity.getTaskState());
        com.huawei.maps.offlinedata.jsbridge.b.a().a("syncData", com.huawei.maps.offlinedata.utils.d.a(offlineDataTaskEntity));
        if (com.huawei.maps.offlinedata.service.a.a().b()) {
            return;
        }
        a(offlineDataTaskEntity);
    }

    public void b(OfflineDataTaskEntity offlineDataTaskEntity, MapOfflineDataItemEntity mapOfflineDataItemEntity) {
        offlineDataTaskEntity.setTaskState("{\"transmit\":\"queue\"}");
        if (offlineDataTaskEntity.equals(this.f17937b.get()) || this.f17938c.contains(offlineDataTaskEntity)) {
            g.d("OfflineMapTransmitManager", "the task contains.");
            return;
        }
        if (mapOfflineDataItemEntity == null) {
            mapOfflineDataItemEntity = com.huawei.maps.offlinedata.service.persist.b.e().b(offlineDataTaskEntity.getDataType(), offlineDataTaskEntity.getCityId(), offlineDataTaskEntity.getVersion());
        }
        if (mapOfflineDataItemEntity == null) {
            g.d("OfflineMapTransmitManager", "the task related item not find in db.");
            return;
        }
        if (this.f17937b.get() != null) {
            this.f17938c.add(offlineDataTaskEntity);
            g.c("OfflineMapTransmitManager", "A task is processing. the task will be added to waiting list. the current list size is " + this.f17938c.size());
            return;
        }
        this.d = true;
        this.f17937b.set(offlineDataTaskEntity);
        TransmitRequest transmitRequest = new TransmitRequest();
        String taskId = offlineDataTaskEntity.getTaskId();
        transmitRequest.setRequestId(TextUtils.isEmpty(taskId) ? 0L : Long.parseLong(taskId));
        transmitRequest.setMapType(offlineDataTaskEntity.getMapType());
        String fileId = mapOfflineDataItemEntity.getFileId();
        transmitRequest.setFileDecompressDir(a(fileId.substring(fileId.lastIndexOf(47))));
        transmitRequest.setSyncType(TextUtils.equals(offlineDataTaskEntity.getItemState(), "updating") ? 1 : 0);
        transmitRequest.setDownloadType(Integer.valueOf(offlineDataTaskEntity.getDownloadType() == null ? 0 : offlineDataTaskEntity.getDownloadType().intValue()));
        transmitRequest.setMapSize((int) Double.parseDouble(mapOfflineDataItemEntity.getOriginalSize()));
        offlineDataTaskEntity.setTaskState("{\"transmit\":\"doing\"}");
        a(transmitRequest, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j, TransmitRequest transmitRequest, int i) {
        g.c("OfflineMapTransmitManager", "onPingResult code:" + i);
        if (i == 202) {
            if (j != 0) {
                com.huawei.maps.offlinedata.jsbridge.a.a().a(Boolean.TRUE, j);
            }
            if (!transmitRequest.getFileNameInFileDecompressDir()) {
                g.b("OfflineMapTransmitManager", "transmitMap: fileDecompressDir invalid");
            }
            g.c("OfflineMapTransmitManager", "transmitFile request:" + transmitRequest);
            d.a().a(transmitRequest);
            return;
        }
        if (j != 0) {
            com.huawei.maps.offlinedata.jsbridge.a.a().a(-1, "device is not available", j);
        }
        g.b("OfflineMapTransmitManager", "device is not available");
        ((OfflineDataTaskEntity) this.f17937b.get()).setTaskState("{\"transmit\":\"error\"}");
        this.f17937b.set(null);
    }

    private String a(String str) {
        return com.huawei.maps.offlinedata.service.storage.a.e().c() + str;
    }

    private void a(final OfflineDataTaskEntity offlineDataTaskEntity) {
        new Thread(new Runnable() { // from class: com.huawei.maps.offlinedata.service.device.f$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(offlineDataTaskEntity);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(OfflineDataTaskEntity offlineDataTaskEntity) {
        g.c("OfflineMapTransmitManager", "will start task from the waiting list.");
        this.f17937b.set(null);
        if (this.f17938c.isEmpty()) {
            g.c("OfflineMapTransmitManager", "the waiting list is empty.");
            return;
        }
        for (OfflineDataTaskEntity offlineDataTaskEntity2 : this.f17938c) {
            if (TextUtils.equals(offlineDataTaskEntity.getIndexId(), offlineDataTaskEntity2.getIndexId())) {
                g.c("OfflineMapTransmitManager", "same city diff dataType firstly.");
                this.f17938c.remove(offlineDataTaskEntity2);
                d(offlineDataTaskEntity2);
                return;
            }
        }
        d((OfflineDataTaskEntity) this.f17938c.remove(0));
    }

    public void a(String str, String str2) {
        if (!com.huawei.maps.offlinedata.service.a.a().b()) {
            this.d = true;
        }
        if (!this.d) {
            com.huawei.maps.offlinedata.jsbridge.b.a().a("deviceClient.progress", str, str2);
            return;
        }
        OfflineDataTaskEntity offlineDataTaskEntity = (OfflineDataTaskEntity) this.f17937b.get();
        offlineDataTaskEntity.setTaskState("{\"transmit\":\"doing\"}");
        offlineDataTaskEntity.setTransmitProgress(Integer.valueOf(str2));
        com.huawei.maps.offlinedata.service.persist.b.e().b(offlineDataTaskEntity.getId(), offlineDataTaskEntity.getDownloadProgress().intValue(), offlineDataTaskEntity.getTransmitProgress().intValue());
        com.huawei.maps.offlinedata.service.persist.b.e().c(offlineDataTaskEntity.getId(), offlineDataTaskEntity.getItemState(), offlineDataTaskEntity.getTaskState());
        com.huawei.maps.offlinedata.jsbridge.b.a().a("syncData", com.huawei.maps.offlinedata.utils.d.a(offlineDataTaskEntity));
    }

    public void b(String str) {
        com.huawei.maps.offlinedata.logpush.dto.a aVarA = com.huawei.maps.offlinedata.logpush.dto.a.C0185a.b().a("transmit").a();
        aVarA.b("060016");
        com.huawei.maps.offlinedata.logpush.b.b(aVarA);
        if (!com.huawei.maps.offlinedata.service.a.a().b()) {
            this.d = true;
        }
        OfflineDataTaskEntity offlineDataTaskEntity = (OfflineDataTaskEntity) this.f17937b.get();
        this.f17937b.set(null);
        if (!this.d) {
            com.huawei.maps.offlinedata.jsbridge.b.a().a("deviceClient.error", String.valueOf(str));
            return;
        }
        offlineDataTaskEntity.setTaskState("{\"transmit\":\"error\"}");
        for (OfflineDataTaskEntity offlineDataTaskEntity2 : this.f17938c) {
            if (TextUtils.equals(offlineDataTaskEntity2.getIndexId(), offlineDataTaskEntity.getIndexId())) {
                this.f17938c.remove(offlineDataTaskEntity2);
            }
        }
        com.huawei.maps.offlinedata.service.persist.b.e().c(offlineDataTaskEntity.getId(), offlineDataTaskEntity.getItemState(), offlineDataTaskEntity.getTaskState());
        com.huawei.maps.offlinedata.jsbridge.b.a().a("syncData", com.huawei.maps.offlinedata.utils.d.a(offlineDataTaskEntity));
        if (com.huawei.maps.offlinedata.service.a.a().b()) {
            return;
        }
        a(offlineDataTaskEntity);
    }

    public void a(OfflineDataTaskEntity offlineDataTaskEntity, MapOfflineDataItemEntity mapOfflineDataItemEntity) {
        g.c("OfflineMapTransmitManager", "enterTransmitMap downloadTask: " + offlineDataTaskEntity.getPrintState());
        if (!TextUtils.equals(offlineDataTaskEntity.getTaskState(), "{\"transmit\":\"wait\"}") && !TextUtils.equals(offlineDataTaskEntity.getTaskState(), "{\"transmit\":\"parsing\"}") && !TextUtils.equals(offlineDataTaskEntity.getTaskState(), "{\"transmit\":\"finish\"}")) {
            offlineDataTaskEntity.setTaskState("{\"transmit\":\"queue\"}");
            com.huawei.maps.offlinedata.service.persist.b.e().c(offlineDataTaskEntity.getId(), offlineDataTaskEntity.getItemState(), offlineDataTaskEntity.getTaskState());
            if (!offlineDataTaskEntity.isGlobal() && !offlineDataTaskEntity.isSki() && com.huawei.maps.offlinedata.service.config.a.h().d().size() != 1) {
                OfflineDataTaskEntity offlineDataTaskEntityA = com.huawei.maps.offlinedata.service.persist.b.e().a(offlineDataTaskEntity.getCityId(), TextUtils.equals(offlineDataTaskEntity.getDataType(), "watch_map") ? "watch_map_contour" : "watch_map");
                if (offlineDataTaskEntityA != null && (offlineDataTaskEntityA.getItemState().contains("processing") || offlineDataTaskEntityA.getItemState().contains("updating"))) {
                    g.c("OfflineMapTransmitManager", "enterTransmitMap otherTask: " + offlineDataTaskEntityA.getPrintState());
                    this.f17936a = false;
                    Iterator it = this.f17938c.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals(((OfflineDataTaskEntity) it.next()).getPrintId(), offlineDataTaskEntityA.getPrintId())) {
                            g.c("OfflineMapTransmitManager", "same city diff dataType firstly.");
                            this.f17936a = true;
                            return;
                        }
                    }
                    if (TextUtils.equals(offlineDataTaskEntity.getDataType(), "watch_map") && offlineDataTaskEntityA.getTaskState().contains("transmit")) {
                        g.c("OfflineMapTransmitManager", "enterTransmitMap push watchMap downloadTask");
                        b(offlineDataTaskEntity, mapOfflineDataItemEntity);
                        if (!this.f17936a && TextUtils.equals(offlineDataTaskEntityA.getTaskState(), "{\"transmit\":\"queue\"}")) {
                            g.c("OfflineMapTransmitManager", "enterTransmitMap push watchMapContour otherTask");
                            b(offlineDataTaskEntityA, mapOfflineDataItemEntity);
                        }
                    }
                    if (TextUtils.equals(offlineDataTaskEntity.getDataType(), "watch_map_contour") && offlineDataTaskEntityA.getTaskState().contains("transmit")) {
                        if (!this.f17936a && TextUtils.equals(offlineDataTaskEntityA.getTaskState(), "{\"transmit\":\"queue\"}")) {
                            g.c("OfflineMapTransmitManager", "enterTransmitMap push watchMap otherTask");
                            b(offlineDataTaskEntityA, mapOfflineDataItemEntity);
                        }
                        g.c("OfflineMapTransmitManager", "enterTransmitMap push watchMapContour downloadTask");
                        b(offlineDataTaskEntity, mapOfflineDataItemEntity);
                    }
                    g.c("OfflineMapTransmitManager", "enterTransmitMap push delay downloadTask");
                    return;
                }
                g.c("OfflineMapTransmitManager", "enterTransmitMap push singleTask downloadTask");
                b(offlineDataTaskEntity, mapOfflineDataItemEntity);
                return;
            }
            g.c("OfflineMapTransmitManager", "enterTransmitMap push downloadTask");
            b(offlineDataTaskEntity, mapOfflineDataItemEntity);
            return;
        }
        g.c("OfflineMapTransmitManager", "enterTransmitMap downloadTask taskState is ok");
    }
}
