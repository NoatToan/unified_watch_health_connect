package com.huawei.agconnect.common.server;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.credential.internal.DomainInfo;
import com.huawei.agconnect.credential.internal.GetDomainRequest;
import com.huawei.agconnect.credential.internal.GetDomainResponse;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskExecutors;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class AGCHostManager {
    private static final String f = "AGCHost";
    private static final AGCHostManager g = new AGCHostManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<SiteUrl>> f4859a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, SiteUrl> f4860b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f4861c = new AtomicBoolean(false);
    private String d;
    private final Handler e;

    List<SiteUrl> b(AGConnectInstance aGConnectInstance) {
        List<SiteUrl> listSingletonList;
        List<SiteUrl> list;
        String identifier = aGConnectInstance.getIdentifier();
        if (this.f4859a.containsKey(identifier)) {
            list = this.f4859a.get(identifier);
        } else {
            SiteUrl siteUrl = new SiteUrl(aGConnectInstance.getOptions().getString("agcgw/url"), aGConnectInstance.getOptions().getString("agcgw/backurl"));
            SiteUrl siteUrl2 = this.f4860b.get(identifier);
            if (siteUrl2 != null) {
                listSingletonList = Arrays.asList(siteUrl2, siteUrl);
            } else {
                SiteUrl siteUrlA = SiteUrl.a(identifier);
                this.f4860b.put(identifier, siteUrlA);
                listSingletonList = !siteUrlA.g() ? Collections.singletonList(siteUrl) : Arrays.asList(siteUrlA, siteUrl);
            }
            this.f4859a.put(identifier, listSingletonList);
            list = listSingletonList;
        }
        a(aGConnectInstance);
        return list;
    }

    public void a(String str) {
        if ("agconnect-credential".equals(str)) {
            return;
        }
        this.d = str;
    }

    private boolean a(long j) {
        return Calendar.getInstance().getTime().after(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AGConnectInstance aGConnectInstance, GetDomainResponse getDomainResponse) {
        String strA = a(aGConnectInstance, getDomainResponse.b());
        String strA2 = a(aGConnectInstance, getDomainResponse.a());
        String identifier = aGConnectInstance.getIdentifier();
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strA2)) {
            SiteUrl.b(identifier);
            return;
        }
        Logger.d(f, "cached main host:");
        Logger.d(f, "cached backup host:");
        SiteUrl siteUrl = new SiteUrl(strA, strA2);
        this.f4860b.put(identifier, siteUrl);
        siteUrl.c(identifier);
    }

    private void a(final AGConnectInstance aGConnectInstance) {
        Logger.i(f, "getCachedHostAsync");
        SiteUrl siteUrl = this.f4860b.get(aGConnectInstance.getIdentifier());
        long j = siteUrl != null ? siteUrl.validTime : 0L;
        if (!a(j)) {
            Logger.i(f, "isTTLValid false：" + j);
        } else if (this.f4861c.get()) {
            Logger.i(f, "requestOnce is true");
        } else {
            this.f4861c.set(true);
            this.e.postDelayed(new Runnable() { // from class: com.huawei.agconnect.common.server.AGCHostManager.1
                @Override // java.lang.Runnable
                public void run() {
                    Logger.i(AGCHostManager.f, "getCachedHostAsync#start");
                    GetDomainRequest getDomainRequest = new GetDomainRequest(aGConnectInstance);
                    getDomainRequest.a(AGCHostManager.this.d);
                    BackendService.sendRequest(getDomainRequest, 1, GetDomainResponse.class, new BackendService.Options.Builder().app(aGConnectInstance).clientToken(false).build()).addOnCompleteListener(TaskExecutors.immediate(), new OnCompleteListener<GetDomainResponse>() { // from class: com.huawei.agconnect.common.server.AGCHostManager.1.1
                        @Override // com.huawei.hmf.tasks.OnCompleteListener
                        public void onComplete(Task<GetDomainResponse> task) {
                            int iNextInt = new Random().nextInt(172801) + 86400;
                            Logger.i(AGCHostManager.f, "getCachedHostAsync success, default ttl=" + iNextInt);
                            if (task.isSuccessful()) {
                                GetDomainResponse result = task.getResult();
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                AGCHostManager.this.a(aGConnectInstance, result);
                                try {
                                    iNextInt = Integer.parseInt(result.d());
                                } catch (NumberFormatException unused) {
                                    Logger.i(AGCHostManager.f, "parse ttl failed, use default instead");
                                }
                            }
                            AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                            AGCHostManager.this.a(iNextInt, aGConnectInstance.getIdentifier());
                        }
                    });
                }
            }, 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, i);
        long time = calendar.getTime().getTime();
        SiteUrl siteUrl = this.f4860b.get(str);
        if (siteUrl != null) {
            siteUrl.validTime = time;
        }
        Logger.i(f, "updateTTL:" + time);
        SiteUrl.a(str, time);
    }

    private String a(AGConnectInstance aGConnectInstance, List<DomainInfo> list) {
        for (DomainInfo domainInfo : list) {
            if (domainInfo.b().equalsIgnoreCase(aGConnectInstance.getOptions().getRoutePolicy().getRouteName())) {
                return domainInfo.a();
            }
        }
        return null;
    }

    public static AGCHostManager a() {
        return g;
    }

    private AGCHostManager() {
        HandlerThread handlerThread = new HandlerThread("subThread");
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
    }
}
