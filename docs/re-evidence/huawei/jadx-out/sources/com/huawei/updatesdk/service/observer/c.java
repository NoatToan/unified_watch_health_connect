package com.huawei.updatesdk.service.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static c f29964a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static com.huawei.updatesdk.service.observer.a f29965b = new a();

    public void c(com.huawei.updatesdk.sdk.service.secure.b bVar) {
        f29965b.a(2, bVar);
    }

    public void b(com.huawei.updatesdk.sdk.service.secure.b bVar) {
        f29965b.a(0, bVar);
    }

    class a implements com.huawei.updatesdk.service.observer.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<b> f29966a = new ArrayList();

        @Override // com.huawei.updatesdk.service.observer.a
        public void b(b bVar) {
            synchronized (this.f29966a) {
                try {
                    this.f29966a.remove(bVar);
                } catch (UnsupportedOperationException unused) {
                    com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("InstallObserverManager", "unRegisterObserver UnsupportedOperationException");
                }
            }
        }

        @Override // com.huawei.updatesdk.service.observer.a
        public void a(b bVar) {
            String str;
            synchronized (this.f29966a) {
                try {
                    if (bVar == null) {
                        return;
                    }
                    if (!this.f29966a.contains(bVar)) {
                        try {
                            this.f29966a.add(bVar);
                        } catch (ClassCastException unused) {
                            str = "registerObserver ClassCastException";
                            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("InstallObserverManager", str);
                        } catch (IllegalArgumentException unused2) {
                            str = "registerObserver IllegalArgumentException";
                            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("InstallObserverManager", str);
                        } catch (UnsupportedOperationException unused3) {
                            str = "registerObserver UnsupportedOperationException";
                            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("InstallObserverManager", str);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.updatesdk.service.observer.a
        public void a(int i, com.huawei.updatesdk.sdk.service.secure.b bVar) {
            synchronized (this.f29966a) {
                Iterator<b> it = this.f29966a.iterator();
                while (it.hasNext()) {
                    it.next().a(i, bVar);
                }
            }
        }

        a() {
        }
    }

    public void a(com.huawei.updatesdk.sdk.service.secure.b bVar) {
        f29965b.a(1, bVar);
    }

    public static c b() {
        return f29964a;
    }

    public static com.huawei.updatesdk.service.observer.a a() {
        return f29965b;
    }

    private c() {
    }
}
