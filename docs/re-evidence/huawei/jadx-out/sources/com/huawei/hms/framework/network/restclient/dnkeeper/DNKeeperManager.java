package com.huawei.hms.framework.network.restclient.dnkeeper;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.CheckParamUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.ThreadPoolExcutorEnhance;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.restclient.hwhttp.dns.DnsResult;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.network.httpclient.HttpClient;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class DNKeeperManager {
    private static final String m = "DNKeeperManager";
    private static final String n = "DNKeeperManager";
    private static volatile DNKeeperManager o = new DNKeeperManager();
    private static final int p = 8;
    private static final String q = ":";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile HttpClient f13355a;
    private String e;
    private int f;
    private PLSharedPreferences h;
    private String k;
    private List<String> l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f13356b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f13357c = false;
    private volatile int d = 60000;
    private ConcurrentHashMap<String, h> g = new ConcurrentHashMap<>();
    private final ExecutorService i = new ThreadPoolExcutorEnhance(8, 16, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), ExecutorsUtils.createThreadFactory("DNKeeperManager"));
    private final Object j = new Object();

    public void setRequestIntervalFailed(int i) {
        if (i >= 30000 && i < 600000) {
            this.d = i;
            return;
        }
        Logger.w("DNKeeperManager", "the setRequestIntervalFailed, set to default:" + i);
    }

    public boolean removeCache(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Logger.v("DNKeeperManager", "removeCache host: " + str);
        h hVar = this.g.get(str);
        if (hVar != null) {
            hVar.a(true);
        }
        return true;
    }

    public DnsResult queryIpsSync(RequestHost requestHost) {
        DnsResult dnsResult = new DnsResult();
        if (requestHost != null) {
            String domainName = requestHost.getDomainName();
            Logger.i("DNKeeperManager", domainName + " query mode is single");
            e eVar = new e();
            if (!TextUtils.isEmpty(domainName) && ContextHolder.getAppContext() != null) {
                String strSubstring = StringUtils.substring(domainName, domainName.lastIndexOf(".", domainName.lastIndexOf(".") - 1) + 1);
                List<String> list = this.l;
                if (list == null || list.contains(strSubstring) || this.l.isEmpty()) {
                    h hVar = this.g.get(domainName);
                    if (hVar != null) {
                        dnsResult = hVar.a();
                        if (!f.a(dnsResult)) {
                            Logger.i("DNKeeperManager", domainName + " queryIps from Map");
                            if (hVar.d() && System.currentTimeMillis() - dnsResult.getCreateTime() > 60000) {
                                Logger.i("DNKeeperManager", "lazyUpdate domain: " + domainName);
                                a(requestHost, domainName, eVar);
                            }
                            dnsResult.setCache(1);
                            return dnsResult;
                        }
                    }
                    PLSharedPreferences pLSharedPreferences = this.h;
                    if (pLSharedPreferences != null) {
                        dnsResult = f.a(pLSharedPreferences.getString(domainName));
                        int status = dnsResult.getStatus();
                        if (!f.a(dnsResult) && status != 2) {
                            dnsResult.setCache(1);
                            Logger.i("DNKeeperManager", domainName + " queryIps from SharePreference");
                            if (status == 1) {
                                a(requestHost, domainName, eVar);
                            }
                            return dnsResult;
                        }
                    }
                    String domainName2 = getDomainName();
                    if (!TextUtils.isEmpty(domainName2)) {
                        if (domainName.equals(domainName2)) {
                            return a(dnsResult, domainName);
                        }
                        b(domainName2);
                        Future futureA = a(requestHost, domainName2);
                        if (futureA != null) {
                            try {
                                dnsResult = (DnsResult) futureA.get(this.f, TimeUnit.MILLISECONDS);
                            } catch (Exception e) {
                                Logger.w("DNKeeperManager", "queryIpsSync failed ", e);
                            }
                            if (!f.a(dnsResult)) {
                                dnsResult.setCache(0);
                                Logger.i("DNKeeperManager", domainName + " queryIps from dnkeeper service");
                            }
                        }
                    }
                }
            }
        }
        return dnsResult;
    }

    public DnsResult queryIpsFromSp(String str) {
        Logger.v("DNKeeperManager", "queryIps from SharePreference: %s", str);
        PLSharedPreferences pLSharedPreferences = this.h;
        if (pLSharedPreferences == null) {
            return null;
        }
        DnsResult dnsResultA = f.a(pLSharedPreferences.getString(str));
        dnsResultA.setCache(1);
        return dnsResultA;
    }

    public DnsResult queryIpsFromCache(String str) {
        DnsResult dnsResult = new DnsResult();
        if (TextUtils.isEmpty(str)) {
            Logger.v("DNKeeperManager", "queryIpsFromCache domain is null");
            return dnsResult;
        }
        h hVar = this.g.get(str);
        if (hVar != null) {
            dnsResult = hVar.a();
        }
        if (f.a(dnsResult)) {
            Logger.v("DNKeeperManager", "no local data = %s", str);
        }
        dnsResult.setCache(1);
        return dnsResult;
    }

    public void queryIpsAsync(RequestHost requestHost, DNSCallback dNSCallback) {
        if (dNSCallback == null) {
            return;
        }
        Logger.v("DNKeeperManager", "queryIpsAsync future = " + this.i.submit(new b(dNSCallback, requestHost)));
    }

    public boolean isInit() {
        return this.f13356b;
    }

    public void init(Context context, int i) {
        CheckParamUtils.checkNotNull(context, "context == null");
        Context applicationContext = context.getApplicationContext();
        NetworkKit.init(applicationContext, null);
        try {
            this.e = ContextHolder.getResourceContext().getString(R.string.networkkit_dnkeeper_domain);
        } catch (Throwable th) {
            Logger.v("DNKeeperManager", "DEFAULT_DOMAIN_NAME failed: " + th);
        }
        Logger.v("DNKeeperManager", "defaultDomain " + this.e);
        if (i < 0 || i > 10000) {
            Logger.w("DNKeeperManager", "maybe you need set a time between 0-10000");
            i = 10000;
        }
        this.f = i;
        if (this.f13356b) {
            return;
        }
        this.f13356b = true;
        this.i.execute(new a(applicationContext));
    }

    public void init(Context context) {
        init(context, 10000);
    }

    public h getRequestRecord(String str) {
        return this.g.get(str);
    }

    public HttpClient getHttpClient() {
        if (this.f13355a == null) {
            synchronized (this.j) {
                if (this.f13355a == null) {
                    this.f13355a = new HttpClient.Builder().build();
                }
            }
        }
        return this.f13355a;
    }

    public String getDomainName() {
        String strSynGetGrsUrl = new GrsClient(ContextHolder.getResourceContext(), new GrsBaseInfo()).synGetGrsUrl(com.huawei.hms.framework.network.restclient.dnkeeper.d.k, "ROOT");
        Logger.v("DNKeeperManager", "getDomainName: " + strSynGetGrsUrl);
        if (!TextUtils.isEmpty(strSynGetGrsUrl) && strSynGetGrsUrl.contains(":")) {
            String[] strArrSplit = strSynGetGrsUrl.split(":");
            if (strArrSplit.length == 3) {
                strSynGetGrsUrl = strArrSplit[0] + ":" + strArrSplit[1];
                this.k = strArrSplit[2];
            }
        }
        if (TextUtils.isEmpty(NetworkUtil.getHost(strSynGetGrsUrl))) {
            PLSharedPreferences pLSharedPreferences = this.h;
            if (pLSharedPreferences != null) {
                strSynGetGrsUrl = pLSharedPreferences.getString(com.huawei.hms.framework.network.restclient.dnkeeper.d.e);
            }
            if (TextUtils.isEmpty(NetworkUtil.getHost(strSynGetGrsUrl))) {
                strSynGetGrsUrl = this.e;
            }
        }
        return NetworkUtil.getHost(strSynGetGrsUrl);
    }

    public HashMap<String, DnsResult> batchQueryIpsSync(HashSet<RequestHost> hashSet) {
        HashMap map;
        e eVar = new e();
        HashMap<String, DnsResult> map2 = new HashMap<>();
        HashSet<RequestHost> hashSet2 = new HashSet<>();
        HashSet<RequestHost> hashSet3 = new HashSet<>();
        String domainName = getDomainName();
        if (hashSet != null && ContextHolder.getAppContext() != null && !TextUtils.isEmpty(domainName)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<RequestHost> it = hashSet.iterator();
            while (true) {
                map = null;
                if (!it.hasNext()) {
                    break;
                }
                RequestHost next = it.next();
                String domainName2 = next.getDomainName();
                if (!TextUtils.isEmpty(domainName2)) {
                    String strSubstring = StringUtils.substring(domainName2, domainName2.lastIndexOf(".", domainName2.lastIndexOf(".") - 1) + 1);
                    List<String> list = this.l;
                    if (list != null && !list.contains(strSubstring) && !this.l.isEmpty()) {
                        Logger.i("DNKeeperManager", domainName2 + " is not included in allowlist");
                    } else if (domainName2.equals(domainName)) {
                        Logger.i("DNKeeperManager", "DNKeeper domainName queryIps from SharePreference");
                        PLSharedPreferences pLSharedPreferences = this.h;
                        DnsResult dnsResultA = pLSharedPreferences != null ? f.a(pLSharedPreferences.getString(domainName2)) : null;
                        if (f.a(dnsResultA)) {
                            dnsResultA = f.a(dnsResultA, this.k);
                        }
                        map2.put(domainName2, dnsResultA);
                    } else {
                        h hVar = this.g.get(domainName2);
                        if (hVar != null) {
                            DnsResult dnsResultA2 = hVar.a();
                            if (!f.a(dnsResultA2)) {
                                if (hVar.d() && jCurrentTimeMillis - dnsResultA2.getCreateTime() > 60000) {
                                    hashSet3.add(next);
                                }
                                map2.put(domainName2, dnsResultA2);
                            }
                        }
                        hashSet2.add(next);
                    }
                }
            }
            if (hashSet2.isEmpty()) {
                if (!hashSet3.isEmpty()) {
                    Logger.v("DNKeeperManager", "lazyUpdate domains: " + hashSet3);
                    eVar.put("trigger_type", "dns_lazy_update");
                    a(hashSet3, domainName, eVar);
                }
                Logger.i("DNKeeperManager", map2.keySet().toString() + " queryIps from Map");
                return map2;
            }
            hashSet2.addAll(hashSet3);
            eVar.put("trigger_type", "dns_sync_query");
            HashSet<Future> hashSetA = a(hashSet2, domainName, eVar);
            if (hashSetA != null && !hashSetA.isEmpty()) {
                if (hashSetA.size() != 1) {
                    Logger.i("DNKeeperManager", "queryIps from futureSet");
                    try {
                        Iterator<Future> it2 = hashSetA.iterator();
                        while (it2.hasNext()) {
                            it2.next().get(this.f, TimeUnit.MILLISECONDS);
                        }
                    } catch (Exception e) {
                        Logger.w("DNKeeperManager", "queryIpsSync failed ", e);
                    }
                    Iterator<RequestHost> it3 = hashSet2.iterator();
                    while (it3.hasNext()) {
                        String domainName3 = it3.next().getDomainName();
                        h hVar2 = this.g.get(domainName3);
                        if (hVar2 != null) {
                            map2.put(domainName3, hVar2.a());
                        }
                    }
                    Logger.v("DNKeeperManager", map2.toString());
                    return map2;
                }
                try {
                    map = (HashMap) hashSetA.iterator().next().get(this.f, TimeUnit.MILLISECONDS);
                } catch (Exception e2) {
                    Logger.w("DNKeeperManager", "queryIpsSync failed ", e2);
                }
                if (map != null) {
                    Iterator it4 = map.entrySet().iterator();
                    while (it4.hasNext()) {
                        if (f.a((DnsResult) ((Map.Entry) it4.next()).getValue())) {
                            it4.remove();
                        }
                    }
                    map2.putAll(map);
                    Logger.i("DNKeeperManager", map2.keySet().toString() + " queryIps from dnkeeper service");
                    return map2;
                }
                Logger.i("DNKeeperManager", "dnsResults is null");
            }
            Logger.i("DNKeeperManager", "queryIps from SharePreference");
            if (this.h != null) {
                for (RequestHost requestHost : hashSet2) {
                    map2.put(requestHost.getDomainName(), f.a(this.h.getString(requestHost.getDomainName())));
                }
            }
        }
        return map2;
    }

    public void batchQueryIpsAsync(HashSet<RequestHost> hashSet, DNSBatchCallback dNSBatchCallback) {
        if (dNSBatchCallback == null) {
            return;
        }
        Logger.v("DNKeeperManager", "batchQueryIpsAsync future = " + this.i.submit(new d(dNSBatchCallback, hashSet)));
    }

    public static DNKeeperManager getInstance() {
        return o;
    }

    private void b(String str) {
        if (this.f13357c) {
            return;
        }
        synchronized (DNKeeperManager.class) {
            if (this.f13357c) {
                return;
            }
            this.f13357c = true;
            this.i.execute(new c(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(RequestHost requestHost, String str, e eVar) {
        String domainName = requestHost.getDomainName();
        h hVarA = a(domainName);
        if (a(hVarA)) {
            return;
        }
        Set<String> setA = a();
        HashSet<RequestHost> hashSetA = a(setA);
        HashMap<String, h> mapB = b(setA);
        mapB.put(domainName, hVarA);
        hashSetA.add(requestHost);
        synchronized (this.j) {
            Future futureB = hVarA.b();
            if (futureB == null) {
                futureB = a(hashSetA, str, mapB, eVar);
                Logger.i("DNKeeperManager", "future == null");
                hVarA.a(0L);
                hVarA.a(futureB);
            }
            Logger.v("DNKeeperManager", "submitLazyRequest future = " + futureB);
        }
    }

    private HashMap<String, h> b(Set<String> set) {
        h hVarPutIfAbsent;
        HashMap<String, h> map = new HashMap<>();
        if (set != null) {
            for (String str : set) {
                h hVar = this.g.get(str);
                if (hVar == null && (hVarPutIfAbsent = this.g.putIfAbsent(str, (hVar = new h()))) != null) {
                    hVar = hVarPutIfAbsent;
                }
                map.put(str, hVar);
            }
        }
        return map;
    }

    private boolean a(h hVar) {
        long jCurrentTimeMillis = System.currentTimeMillis() - hVar.c();
        if (jCurrentTimeMillis >= this.d) {
            return false;
        }
        Logger.i("DNKeeperManager", "now - time = " + jCurrentTimeMillis);
        return true;
    }

    private void a(RequestHost requestHost, String str, e eVar) {
        String domainName = getDomainName();
        if (TextUtils.isEmpty(domainName) || str.equals(domainName)) {
            return;
        }
        eVar.put("trigger_type", "dns_lazy_update");
        b(requestHost, domainName, eVar);
    }

    private Future a(HashSet<RequestHost> hashSet, String str, HashMap<String, h> map, e eVar) {
        return this.i.submit(new com.huawei.hms.framework.network.restclient.dnkeeper.b(hashSet, str, map, this.h, eVar));
    }

    private Future a(RequestHost requestHost, String str) {
        Future futureB;
        h hVarA = a(requestHost.getDomainName());
        if (a(hVarA)) {
            return null;
        }
        synchronized (this.j) {
            futureB = hVarA.b();
            if (futureB == null) {
                Logger.i("DNKeeperManager", "future == null");
                futureB = this.i.submit(new com.huawei.hms.framework.network.restclient.dnkeeper.c(requestHost, str, hVarA, this.h));
                hVarA.a(0L);
                hVarA.a(futureB);
            }
            Logger.v("DNKeeperManager", "submitRequest future = " + futureB);
        }
        return futureB;
    }

    private Set<String> a() {
        Map<String, ?> all;
        PLSharedPreferences pLSharedPreferences = this.h;
        Set<String> setKeySet = (pLSharedPreferences == null || (all = pLSharedPreferences.getAll()) == null) ? null : all.keySet();
        if (setKeySet != null) {
            setKeySet.remove(com.huawei.hms.framework.network.restclient.dnkeeper.d.n);
            setKeySet.remove(com.huawei.hms.framework.network.restclient.dnkeeper.d.e);
        }
        return setKeySet;
    }

    private HashSet<RequestHost> a(Set<String> set) {
        HashSet<RequestHost> hashSet = new HashSet<>();
        if (set != null) {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                RequestHost requestHost = new RequestHost(it.next());
                requestHost.enableAccelerate(true);
                requestHost.setDnsFailType("lazyUpdate");
                hashSet.add(requestHost);
            }
        }
        return hashSet;
    }

    private HashSet<Future> a(HashSet<RequestHost> hashSet, String str, e eVar) {
        HashSet<Future> hashSet2 = new HashSet<>();
        HashMap<String, h> map = new HashMap<>();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Logger.v("DNKeeperManager", "requestHosts: " + Arrays.toString(hashSet.toArray()));
        Iterator<RequestHost> it = hashSet.iterator();
        boolean z = true;
        boolean z2 = true;
        while (it.hasNext()) {
            String domainName = it.next().getDomainName();
            h hVarA = a(domainName);
            map.put(domainName, hVarA);
            long jC = jCurrentTimeMillis - hVarA.c();
            if (jC < this.d) {
                Logger.v("DNKeeperManager", "now - time = " + jC);
            } else {
                z = false;
            }
            if (hVarA.b() == null) {
                z2 = false;
            } else {
                hashSet2.add(hVarA.b());
            }
        }
        if (z) {
            Logger.i("DNKeeperManager", "request needSuppressed");
            return null;
        }
        if (!z2) {
            Logger.i("DNKeeperManager", "request use NewFuture instead of ExistedFuture");
            Future futureA = a(hashSet, str, map, eVar);
            hashSet2.clear();
            hashSet2.add(futureA);
            for (h hVar : map.values()) {
                hVar.a(0L);
                hVar.a(futureA);
            }
        }
        return hashSet2;
    }

    class b implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DNSCallback f13360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RequestHost f13361b;

        @Override // java.util.concurrent.Callable
        public Void call() {
            this.f13360a.onResult(DNKeeperManager.this.queryIpsSync(this.f13361b));
            return null;
        }

        b(DNSCallback dNSCallback, RequestHost requestHost) {
            this.f13360a = dNSCallback;
            this.f13361b = requestHost;
        }
    }

    class d implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DNSBatchCallback f13365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashSet f13366b;

        @Override // java.util.concurrent.Callable
        public Void call() {
            this.f13365a.onResult(DNKeeperManager.this.batchQueryIpsSync(this.f13366b));
            return null;
        }

        d(DNSBatchCallback dNSBatchCallback, HashSet hashSet) {
            this.f13365a = dNSBatchCallback;
            this.f13366b = hashSet;
        }
    }

    private DnsResult a(DnsResult dnsResult, String str) {
        PLSharedPreferences pLSharedPreferences = this.h;
        if (pLSharedPreferences != null) {
            dnsResult = f.a(pLSharedPreferences.getString(str));
        }
        if (f.a(dnsResult)) {
            dnsResult = f.a(dnsResult, this.k);
        }
        dnsResult.setCache(1);
        return dnsResult;
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f13358a;

        @Override // java.lang.Runnable
        public void run() {
            DNKeeperManager.this.h = new PLSharedPreferences(this.f13358a, com.huawei.hms.framework.network.restclient.dnkeeper.d.m);
            String string = DNKeeperManager.this.h.getString(com.huawei.hms.framework.network.restclient.dnkeeper.d.n);
            if (!TextUtils.isEmpty(string)) {
                DNKeeperManager.this.l = Arrays.asList(string.split("&"));
            }
            DNKeeperManager dNKeeperManager = DNKeeperManager.this;
            dNKeeperManager.f13355a = dNKeeperManager.getHttpClient();
        }

        a(Context context) {
            this.f13358a = context;
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13363a;

        @Override // java.lang.Runnable
        public void run() {
            boolean zA = f.a(DNKeeperManager.this.h, this.f13363a);
            Logger.v("DNKeeperManager", "checkDNKeeperIP " + zA);
            if (zA) {
                RequestHost requestHost = new RequestHost(this.f13363a);
                requestHost.enableAccelerate(true);
                e eVar = new e();
                eVar.put("trigger_type", "dns_init");
                DNKeeperManager.this.b(requestHost, this.f13363a, eVar);
            }
        }

        c(String str) {
            this.f13363a = str;
        }
    }

    private h a(String str) {
        h hVarPutIfAbsent;
        synchronized (this.j) {
            h hVar = this.g.get(str);
            if (hVar != null || (hVarPutIfAbsent = this.g.putIfAbsent(str, (hVar = new h()))) == null) {
                hVarPutIfAbsent = hVar;
            }
        }
        return hVarPutIfAbsent;
    }

    private DNKeeperManager() {
    }
}
