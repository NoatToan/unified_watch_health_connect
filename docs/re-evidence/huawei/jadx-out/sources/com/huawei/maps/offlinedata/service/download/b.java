package com.huawei.maps.offlinedata.service.download;

import android.text.TextUtils;
import com.huawei.maps.offlinedata.handler.dto.DownloadRequest;
import com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity;
import com.huawei.maps.offlinedata.service.cloud.c;
import com.huawei.maps.offlinedata.utils.g;
import com.huawei.openalliance.ad.constant.VastAttribute;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public class b {
    private static volatile b d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f17975a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f17976b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f17977c = new AtomicBoolean(false);

    private b() {
    }

    public static b b() {
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    d = new b();
                }
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            synchronized (b.class) {
                g.c("OfflineMapDownloadManager", "will start task from the waiting list.");
                if (this.f17976b.isEmpty()) {
                    g.c("OfflineMapDownloadManager", "the waiting list is empty.");
                    return;
                }
                for (OfflineDataTaskEntity offlineDataTaskEntity : this.f17976b) {
                    if (!a(offlineDataTaskEntity)) {
                        break;
                    }
                    this.f17976b.remove(offlineDataTaskEntity);
                    g.c("OfflineMapDownloadManager", "current the waiting list size is " + this.f17976b.size());
                    c(offlineDataTaskEntity);
                }
            }
        } catch (Exception e) {
            g.b("OfflineMapDownloadManager", VastAttribute.ERROR + e.getMessage());
        }
    }

    public void a() {
        this.f17976b.clear();
    }

    public AtomicBoolean c() {
        return this.f17977c;
    }

    public Set d() {
        return this.f17975a;
    }

    public List e() {
        return this.f17976b;
    }

    public void g() {
        g.c("OfflineMapDownloadManager", "will pause all download task.");
        this.f17977c.set(true);
        a.a().c();
        ArrayList<OfflineDataTaskEntity> arrayList = new ArrayList();
        arrayList.addAll(this.f17976b);
        arrayList.addAll(this.f17975a);
        g.c("OfflineMapDownloadManager", "the task size is " + arrayList.size());
        for (OfflineDataTaskEntity offlineDataTaskEntity : arrayList) {
            offlineDataTaskEntity.setTaskState("{\"download\":\"pause\"}");
            com.huawei.maps.offlinedata.service.persist.b.e().c(offlineDataTaskEntity.getId(), offlineDataTaskEntity.getItemState(), offlineDataTaskEntity.getTaskState());
        }
        this.f17976b.clear();
        this.f17975a.clear();
    }

    public void h() {
        new Thread(new Runnable() { // from class: com.huawei.maps.offlinedata.service.download.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f();
            }
        }).start();
    }

    private void a(OfflineDataTaskEntity offlineDataTaskEntity, String str, String str2, String str3) {
        com.huawei.maps.offlinedata.service.network.b.a().b();
        if (TextUtils.isEmpty(offlineDataTaskEntity.getTaskId()) || !a.a().a(Long.parseLong(offlineDataTaskEntity.getTaskId()), offlineDataTaskEntity)) {
            String strA = a.a().a(new DownloadRequest.Builder().downloadUri(str2).filePath(a(str)).sha256(str3).build(), offlineDataTaskEntity);
            if (!TextUtils.isEmpty(strA)) {
                offlineDataTaskEntity.setTaskId(strA);
                com.huawei.maps.offlinedata.service.persist.b.e().a(offlineDataTaskEntity);
                return;
            }
            g.d("OfflineMapDownloadManager", "failed to obtain the task id.");
            offlineDataTaskEntity.setTaskState("{\"download\":\"error\"}");
            com.huawei.maps.offlinedata.service.persist.b.e().c(offlineDataTaskEntity.getId(), offlineDataTaskEntity.getItemState(), offlineDataTaskEntity.getTaskState());
            this.f17975a.remove(offlineDataTaskEntity);
            h();
        }
    }

    public void c(OfflineDataTaskEntity offlineDataTaskEntity) {
        g.c("OfflineMapDownloadManager", "startOrResumeTask: " + offlineDataTaskEntity.getPrintId());
        b(offlineDataTaskEntity, com.huawei.maps.offlinedata.service.persist.b.e().b(offlineDataTaskEntity.getDataType(), offlineDataTaskEntity.getCityId(), offlineDataTaskEntity.getVersion()));
    }

    public void b(OfflineDataTaskEntity offlineDataTaskEntity, MapOfflineDataItemEntity mapOfflineDataItemEntity) {
        if (mapOfflineDataItemEntity == null) {
            g.d("OfflineMapDownloadManager", "the task related item not find in db.");
            return;
        }
        com.huawei.maps.offlinedata.service.persist.b.e().a(offlineDataTaskEntity);
        if (!a(offlineDataTaskEntity)) {
            this.f17976b.add(offlineDataTaskEntity);
            g.c("OfflineMapDownloadManager", "the process list is full. the task will be added to waiting list. the current list size is " + this.f17976b.size());
            return;
        }
        if (offlineDataTaskEntity.getTaskState().contains(VastAttribute.ERROR) || offlineDataTaskEntity.getTaskState().equals("\"finished\"")) {
            g.c("OfflineMapDownloadManager", "the task is finished or failed. clear the last taskId.");
            offlineDataTaskEntity.setTaskId(null);
        }
        String fileId = mapOfflineDataItemEntity.getFileId();
        String strSubstring = fileId.substring(fileId.lastIndexOf(47));
        String fileCheck = mapOfflineDataItemEntity.getFileCheck();
        String strA = c.b().a(fileId);
        if (!b().c().get()) {
            a(offlineDataTaskEntity, strSubstring, strA, fileCheck);
        } else {
            g.d("OfflineMapDownloadManager", "the network is change after get download url.");
        }
    }

    private String a(String str) {
        return com.huawei.maps.offlinedata.service.storage.a.e().d() + str;
    }

    private boolean a(OfflineDataTaskEntity offlineDataTaskEntity) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f17975a.iterator();
        while (it.hasNext()) {
            hashSet.add(((OfflineDataTaskEntity) it.next()).getIndexId());
        }
        if (!hashSet.contains(offlineDataTaskEntity.getIndexId()) && hashSet.size() >= 3) {
            return false;
        }
        this.f17975a.add(offlineDataTaskEntity);
        return true;
    }

    public void a(OfflineDataTaskEntity offlineDataTaskEntity, MapOfflineDataItemEntity mapOfflineDataItemEntity) {
        if (!this.f17975a.contains(offlineDataTaskEntity) && !this.f17976b.contains(offlineDataTaskEntity)) {
            offlineDataTaskEntity.setTaskState("{\"download\":\"queue\"}");
            b(offlineDataTaskEntity, mapOfflineDataItemEntity);
        } else {
            g.d("OfflineMapDownloadManager", "the task is contains.");
        }
    }

    public void b(OfflineDataTaskEntity offlineDataTaskEntity) {
        if (!this.f17975a.contains(offlineDataTaskEntity) && !this.f17976b.contains(offlineDataTaskEntity)) {
            offlineDataTaskEntity.setTaskState("{\"download\":\"queue\"}");
            c(offlineDataTaskEntity);
        } else {
            g.d("OfflineMapDownloadManager", "the task is contains.");
        }
    }
}
