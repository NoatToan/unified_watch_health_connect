package com.huawei.updatesdk.service.download;

/* JADX INFO: loaded from: classes20.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.huawei.updatesdk.service.otaupdate.b f29957a;

    static class a implements com.huawei.updatesdk.sdk.service.storekit.bean.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f29958a;

        @Override // com.huawei.updatesdk.sdk.service.storekit.bean.a
        public void a(com.huawei.updatesdk.sdk.service.storekit.bean.c cVar, com.huawei.updatesdk.sdk.service.storekit.bean.d dVar) {
        }

        @Override // com.huawei.updatesdk.sdk.service.storekit.bean.a
        public void b(com.huawei.updatesdk.sdk.service.storekit.bean.c cVar, com.huawei.updatesdk.sdk.service.storekit.bean.d dVar) {
            if (f.f29957a == null) {
                return;
            }
            if (!(dVar instanceof com.huawei.updatesdk.service.appmgr.bean.b)) {
                f.f29957a.a(dVar.d());
                return;
            }
            com.huawei.updatesdk.service.appmgr.bean.b bVar = (com.huawei.updatesdk.service.appmgr.bean.b) dVar;
            if (!bVar.e()) {
                f.f29957a.b(dVar.d());
                return;
            }
            com.huawei.updatesdk.service.appmgr.bean.c cVarF = bVar.f();
            if (cVarF == null) {
                f.f29957a.a(dVar.d());
                return;
            }
            if (!this.f29958a) {
                com.huawei.updatesdk.service.global.e.a(false).b(cVarF.d());
            }
            f.f29957a.a(cVarF);
        }

        a(boolean z) {
            this.f29958a = z;
        }
    }

    public static void a(boolean z) {
        com.huawei.updatesdk.service.store.b.a(new com.huawei.updatesdk.service.appmgr.bean.a(z ? com.huawei.updatesdk.service.otaupdate.f.c().d() : null), new a(z));
    }

    public static void a(com.huawei.updatesdk.service.otaupdate.b bVar) {
        f29957a = bVar;
    }
}
