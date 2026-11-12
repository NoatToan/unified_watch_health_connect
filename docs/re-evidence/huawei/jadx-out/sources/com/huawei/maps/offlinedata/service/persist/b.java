package com.huawei.maps.offlinedata.service.persist;

import android.text.TextUtils;
import com.huawei.maps.offlinedata.handler.dto.persist.MapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.handler.dto.persist.OfflineDataTaskEntity;
import com.huawei.maps.offlinedata.handler.dto.persist.WorldMapOfflineDataItemEntity;
import com.huawei.maps.offlinedata.service.persist.dao.c;
import com.huawei.maps.offlinedata.service.persist.dao.e;
import com.huawei.maps.offlinedata.utils.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes12.dex */
public class b {
    private static volatile b e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f17996a = a.b().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.huawei.maps.offlinedata.service.persist.dao.a f17997b = OfflineMapDatabase.b(com.huawei.maps.offlinedata.utils.a.b()).a();
    private final e d = OfflineMapDatabase.b(com.huawei.maps.offlinedata.utils.a.b()).c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f17998c = OfflineMapDatabase.b(com.huawei.maps.offlinedata.utils.a.b()).b();

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WorldMapOfflineDataItemEntity worldMapOfflineDataItemEntity) {
        try {
            this.d.a(worldMapOfflineDataItemEntity);
        } catch (Exception e2) {
            g.b("RepositoryManager", "addWorldMapDataItem failed , e:" + e2.getMessage());
        }
    }

    public static b e() {
        if (e == null) {
            synchronized (b.class) {
                if (e == null) {
                    e = new b();
                }
            }
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(com.huawei.maps.offlinedata.utils.b bVar) {
        try {
            bVar.a(this.d.b());
        } catch (Exception e2) {
            g.b("RepositoryManager", "getWorldMapDataItemList failed , e:" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        try {
            this.f17998c.a();
        } catch (Exception e2) {
            g.b("RepositoryManager", "deleteAllTasks failed , e:" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        try {
            this.d.a();
        } catch (Exception e2) {
            g.b("RepositoryManager", "deleteAllWorldMapDataItems failed , e:" + e2.getMessage());
        }
    }

    public void a() {
        d();
        b();
        c();
    }

    public void c(final com.huawei.maps.offlinedata.utils.b bVar) {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f(bVar);
            }
        });
    }

    public void d() {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.h();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(String str) {
        try {
            this.f17998c.a(str);
        } catch (Exception e2) {
            g.b("RepositoryManager", "deleteById failed , e:" + e2.getMessage());
        }
    }

    public void c(final String str, final String str2, final String str3) {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, str2, str3);
            }
        });
    }

    public void c() {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.g();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(com.huawei.maps.offlinedata.utils.b bVar) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add("processing");
            arrayList.add("updating");
            bVar.a(this.f17998c.a(arrayList));
        } catch (Exception e2) {
            g.b("RepositoryManager", "queryOfflineDataDoingTasks failed , e:" + e2.getMessage());
        }
    }

    public void a(final WorldMapOfflineDataItemEntity worldMapOfflineDataItemEntity) {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(worldMapOfflineDataItemEntity);
            }
        });
    }

    public void b(final String str) {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e(str);
            }
        });
    }

    public OfflineDataTaskEntity c(String str) {
        try {
            return this.f17998c.b(str);
        } catch (Exception e2) {
            g.b("RepositoryManager", "getOfflineDataTaskById failed , e:" + e2.getMessage());
            return null;
        }
    }

    public void h(final com.huawei.maps.offlinedata.utils.b bVar) {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.g(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        try {
            this.f17997b.a(list);
        } catch (Exception e2) {
            g.b("RepositoryManager", "addMapDataItems failed , e:" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(com.huawei.maps.offlinedata.utils.b bVar) {
        try {
            bVar.a(this.f17998c.b());
        } catch (Exception e2) {
            g.b("RepositoryManager", "getDataTaskList failed , e:" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            this.f17997b.b();
        } catch (Exception e2) {
            g.b("RepositoryManager", "deleteAllItems failed , e:" + e2.getMessage());
        }
    }

    public void a(final List list) {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(list);
            }
        });
    }

    public void a(final String str, final List list, final Runnable runnable) {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(str, list, runnable);
            }
        });
    }

    public void a(final OfflineDataTaskEntity offlineDataTaskEntity) {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(offlineDataTaskEntity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, List list, Runnable runnable) {
        try {
            this.f17997b.a(str);
            this.f17997b.a(list);
            runnable.run();
        } catch (Exception e2) {
            g.b("RepositoryManager", "addMapDataItems2 failed , e:" + e2.getMessage());
        }
    }

    public void a(final String str) {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, int i, int i2) {
        try {
            this.f17998c.a(str, i, i2);
        } catch (Exception e2) {
            g.b("RepositoryManager", "updateProgressById failed , e:" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str) {
        try {
            this.d.a(str);
        } catch (Exception e2) {
            g.b("RepositoryManager", "deleteWorldMapDataItems failed , e:" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3) {
        try {
            this.f17998c.a(str, str2, str3);
        } catch (Exception e2) {
            g.b("RepositoryManager", "updateStatusById failed , e:" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(com.huawei.maps.offlinedata.utils.b bVar) {
        try {
            bVar.a(this.f17997b.a());
        } catch (Exception e2) {
            g.b("RepositoryManager", "getMapDataItemList failed , e:" + e2.getMessage());
        }
    }

    public void b() {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.f();
            }
        });
    }

    public void b(final com.huawei.maps.offlinedata.utils.b bVar) {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, int i) {
        try {
            this.f17998c.a(str, i);
        } catch (Exception e2) {
            g.b("RepositoryManager", "updateDownloadTypeById failed , e:" + e2.getMessage());
        }
    }

    public MapOfflineDataItemEntity b(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            WorldMapOfflineDataItemEntity worldMapOfflineDataItemEntityB = this.d.b(str);
            if (worldMapOfflineDataItemEntityB != null) {
                return new MapOfflineDataItemEntity(worldMapOfflineDataItemEntityB);
            }
            return null;
        }
        return this.f17997b.a(str2, str, str3);
    }

    public void a(final com.huawei.maps.offlinedata.utils.b bVar) {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d(bVar);
            }
        });
    }

    public OfflineDataTaskEntity a(String str, String str2) {
        return this.f17998c.a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(OfflineDataTaskEntity offlineDataTaskEntity) {
        try {
            if (offlineDataTaskEntity.getDownloadType() == null) {
                offlineDataTaskEntity.setDownloadType(0);
            }
            this.f17998c.a(offlineDataTaskEntity);
        } catch (Exception e2) {
            g.b("RepositoryManager", "addDataTask failed , e:" + e2.getMessage());
        }
    }

    public void b(final String str, final int i, final int i2) {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, i, i2);
            }
        });
    }

    public void b(final String str, final int i) {
        this.f17996a.execute(new Runnable() { // from class: com.huawei.maps.offlinedata.service.persist.b$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, i);
            }
        });
    }
}
