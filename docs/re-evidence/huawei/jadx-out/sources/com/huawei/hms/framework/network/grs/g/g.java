package com.huawei.hms.framework.network.grs.g;

import com.huawei.hms.framework.common.ContextCompat;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f13315b = ExecutorsUtils.newCachedThreadPool("GrsReqPool");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, com.huawei.hms.framework.network.grs.g.j.b> f13316c = new ConcurrentHashMap(16);
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f13317a;

    public void a(String str) {
        synchronized (d) {
            f13316c.remove(str);
        }
    }

    public void a(com.huawei.hms.framework.network.grs.g.j.c cVar, com.huawei.hms.framework.network.grs.b bVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i) {
        f13315b.execute(new b(cVar, str, cVar2, i, bVar));
    }

    public void a(com.huawei.hms.framework.network.grs.e.a aVar) {
        this.f13317a = aVar;
    }

    public d a(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i) {
        Future<d> futureSubmit;
        String str2;
        String str3;
        String str4;
        Logger.d("RequestController", "request to server with service name is: " + str);
        String grsParasKey = cVar.b().getGrsParasKey(true, true, cVar.a());
        Logger.v("RequestController", "request spUrlKey: " + grsParasKey);
        synchronized (d) {
            if (ContextCompat.checkSelfPermission(cVar.a(), "android.permission.ACCESS_NETWORK_STATE")) {
                if (com.huawei.hms.framework.network.grs.h.f.a.a(cVar.a())) {
                    com.huawei.hms.framework.network.grs.h.d.a aVarA = com.huawei.hms.framework.network.grs.h.d.a(grsParasKey);
                    Map<String, com.huawei.hms.framework.network.grs.g.j.b> map = f13316c;
                    com.huawei.hms.framework.network.grs.g.j.b bVar = map.get(grsParasKey);
                    if (bVar == null || !bVar.b()) {
                        if (aVarA != null) {
                            if (!aVarA.a()) {
                            }
                        }
                        Logger.d("RequestController", "hitGrsRequestBean == null or request block is released.");
                        futureSubmit = f13315b.submit(new a(cVar, str, cVar2));
                        map.put(grsParasKey, new com.huawei.hms.framework.network.grs.g.j.b(futureSubmit));
                    } else {
                        futureSubmit = bVar.a();
                    }
                    if (i == -1) {
                        com.huawei.hms.framework.network.grs.g.j.d dVarA = com.huawei.hms.framework.network.grs.g.i.a.a(cVar.a());
                        i = dVarA != null ? dVarA.c() : 10;
                    }
                    Logger.i("RequestController", "use grsQueryTimeout %d, pkg:%s", Integer.valueOf(i), cVar.a() == null ? "" : cVar.a().getPackageName());
                    try {
                        return futureSubmit.get(i, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        e = e;
                        str2 = "when check result, find InterruptedException, check others";
                        Logger.w("RequestController", str2, e);
                        return null;
                    } catch (CancellationException e2) {
                        e = e2;
                        str2 = "when check result, find CancellationException, check others";
                        Logger.w("RequestController", str2, e);
                        return null;
                    } catch (ExecutionException e3) {
                        e = e3;
                        str2 = "when check result, find ExecutionException, check others";
                        Logger.w("RequestController", str2, e);
                        return null;
                    } catch (TimeoutException e4) {
                        e = e4;
                        str2 = "when check result, find TimeoutException, check others";
                        Logger.w("RequestController", str2, e);
                        return null;
                    } catch (Exception e5) {
                        e = e5;
                        str2 = "when check result, find Other Exception, check others";
                        Logger.w("RequestController", str2, e);
                        return null;
                    }
                }
                str3 = "RequestController";
                str4 = "isNetCapabilityValidated false";
                return null;
            }
            str3 = "RequestController";
            str4 = "no has netPermission";
            Logger.i(str3, str4);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, com.huawei.hms.framework.network.grs.b bVar) {
        if (bVar != null) {
            if (dVar == null) {
                Logger.v("RequestController", "GrsResponse is null");
                bVar.a();
            } else {
                Logger.v("RequestController", "GrsResponse is not null");
                bVar.a(dVar);
            }
        }
    }

    class a implements Callable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.j.c f13318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c f13320c;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public d call() {
            return new c(this.f13318a, g.this.f13317a).a(g.f13315b, this.f13319b, this.f13320c);
        }

        a(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2) {
            this.f13318a = cVar;
            this.f13319b = str;
            this.f13320c = cVar2;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.j.c f13321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c f13323c;
        final /* synthetic */ int d;
        final /* synthetic */ com.huawei.hms.framework.network.grs.b e;

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.a(gVar.a(this.f13321a, this.f13322b, this.f13323c, this.d), this.e);
        }

        b(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i, com.huawei.hms.framework.network.grs.b bVar) {
            this.f13321a = cVar;
            this.f13322b = str;
            this.f13323c = cVar2;
            this.d = i;
            this.e = bVar;
        }
    }
}
