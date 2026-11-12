package com.huawei.hms.network.embedded;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.PLSharedPreferences;
import com.huawei.hms.framework.common.Utils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.network.inner.DomainManager;
import com.huawei.hms.network.inner.api.NetworkService;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes34.dex */
public class t {
    public static final int A = 5;
    public static final int B = 3;
    public static final String C = "airoute_conf";
    public static final String D = "launch_used_domain";
    public static final long E = 300000;
    public static final long F = 120000;
    public static volatile t G = null;
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 4;
    public static final int K = 16;
    public static final String y = "DNManager";
    public static final String z = "DnsManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f15359b;
    public s0.c i;
    public Context j;
    public l0 k;
    public n0 l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<String> f15358a = new LinkedHashSet<>(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PLSharedPreferences f15360c = new PLSharedPreferences(ContextHolder.getAppContext(), C);
    public volatile boolean d = false;
    public boolean e = false;
    public volatile boolean f = false;
    public final Object g = new Object();
    public final Object h = new Object();
    public boolean m = true;
    public boolean n = false;
    public long o = 1300;
    public final ConcurrentHashMap<String, x> q = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, i> r = new ConcurrentHashMap<>();
    public final ExecutorService s = ExecutorsUtils.newSingleThreadExecutor(z);
    public final ThreadLocal<Integer> t = new a();
    public final ThreadLocal<Long> u = new b();
    public final ThreadLocal<Integer> v = new c();
    public final ThreadLocal<Long> w = new d();
    public final ThreadLocal<Integer> x = new e();
    public NetworkService p = m4.c().b("ai");

    /* JADX INFO: loaded from: classes3.dex */
    public @interface k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f15375a = "dns_init";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f15376b = "dns_prefecth";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f15377c = "dns_lazy_update";
        public static final String d = "dns_sync_query";
        public static final String e = "dns_network_change";
        public static final String f = "dns_file_load";
    }

    /* JADX INFO: loaded from: classes3.dex */
    public @interface l {
        public static final int g = 0;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 3;
    }

    public void l() {
        this.w.set(Long.valueOf(Utils.getCurrentTime(true)));
    }

    public boolean k() {
        return this.e;
    }

    public ThreadLocal<Long> j() {
        return this.w;
    }

    public int i() {
        return this.x.get().intValue();
    }

    public long h() {
        return this.u.get().longValue();
    }

    public void g(String str) {
        l();
        f(f(str));
        if (DomainManager.getInstance().isExcludePrefetch(str)) {
            Logger.v(y, "exclude save sp");
        } else {
            m(str);
        }
    }

    public int g() {
        return this.v.get().intValue();
    }

    public void f(int i2) {
        this.x.set(Integer.valueOf(i2));
    }

    public int f(String str) {
        x xVarE = e(str);
        if (xVarE == null) {
            return 2;
        }
        return xVarE.d();
    }

    public int f() {
        return this.t.get().intValue();
    }

    public void e(int i2) {
        this.v.set(Integer.valueOf(i2));
    }

    public x e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        x xVar = this.q.get(str);
        if (xVar == null) {
            xVar = new x();
            xVar.a(k() ? 3 : 2);
            x xVarPutIfAbsent = this.q.putIfAbsent(str, xVar);
            if (xVarPutIfAbsent != null) {
                return xVarPutIfAbsent;
            }
        }
        return xVar;
    }

    public n0 e() {
        return this.l;
    }

    public void d(int i2) {
        this.t.set(Integer.valueOf(i2));
    }

    public String d(String str) {
        return a(f(str));
    }

    public s0.c d() {
        if (this.i == null) {
            this.i = s0.a(s0.f15318a);
        }
        return this.i;
    }

    public void c(boolean z2) {
        this.n = z2;
    }

    public void c(int i2) {
        l0 l0Var = this.k;
        if (l0Var != null) {
            l0Var.a(i2);
        }
    }

    public List<InetAddress> c(String str) throws UnknownHostException {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        int i2 = i();
        if (i2 == 0) {
            i2 = f(str);
        }
        m0 m0VarA = i2 != 1 ? a0.a(str) : null;
        if (y.b(m0VarA)) {
            Logger.v(y, "cache is empty, sync query host: " + str);
            m0VarA = g0.a(str, i2);
        }
        Logger.i(y, str + " resolve source:" + a(i2) + ",result:" + m0VarA);
        if (!y.b(m0VarA)) {
            List<String> listD = m0VarA.d();
            Logger.v(y, "Compound ips of %s:" + listD, str);
            a(listD, str);
            List<InetAddress> listA = y.a(listD);
            if (!listA.isEmpty()) {
                b(m0VarA.h());
                e(m0VarA.e());
                d(m0VarA.a());
                f(m0VarA.f());
                if (i2 == 1 && !k()) {
                    ArrayList arrayList = new ArrayList(listA);
                    if (this.n) {
                        Logger.v(y, "Begin do siteConnect");
                        k(str);
                    } else {
                        r0.a().a(new g(str, arrayList));
                    }
                }
                try {
                    return a(listA);
                } catch (ConcurrentModificationException e2) {
                    e = e2;
                    Logger.w(y, "the ai module has exception: %s ,and skip it", e.getClass().getName());
                    HianalyticsHelper.getInstance().reportException(e, CrashHianalyticsData.EVENT_ID_CRASH);
                    return listA;
                } catch (Throwable th) {
                    e = th;
                    Logger.w(y, "the ai module has throwable: %s ,and skip it", e.getClass().getName());
                    HianalyticsHelper.getInstance().reportException(e, CrashHianalyticsData.EVENT_ID_CRASH);
                    return listA;
                }
            }
        }
        return y.b(str);
    }

    public l0 c() {
        return this.k;
    }

    public void b(boolean z2) {
        this.m = z2;
    }

    public void b(long j2) {
        this.u.set(Long.valueOf(j2));
    }

    public void b(int i2) {
        int i3 = i2 * 1000;
        if (i3 < 60000 || i3 >= 86400000) {
            Logger.w(y, "the ttl parameter invalid, set to default:600000");
            i3 = 600000;
        }
        w.a(i3);
        Logger.v(y, "setDnsTtl:" + i2);
    }

    public i b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.r.get(str);
    }

    public Context b() {
        return this.j;
    }

    public void a(boolean z2) {
        if (!z2) {
            this.e = false;
            return;
        }
        if (!this.d) {
            Logger.w(y, "RestClient or DNManager must init first");
            return;
        }
        if (!this.f) {
            synchronized (this.g) {
                if (!this.f) {
                    this.f = true;
                    if (this.l == null) {
                        this.l = new n0();
                    }
                    if (TextUtils.isEmpty(this.l.a())) {
                        Logger.w(y, "HttpDns baseUrl is null");
                        return;
                    }
                    this.s.execute(new f());
                }
            }
        }
        this.e = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void a(String str, T t) {
        int iA;
        Logger.v(y, "enter DnsUtil.doResponse");
        if (TextUtils.isEmpty(str) || t == 0) {
            Logger.w(y, "invalid parameter");
            return;
        }
        if (t instanceof IOException) {
            iA = z.a((IOException) t);
        } else {
            iA = t instanceof Integer ? z.a(((Integer) t).intValue()) : 0;
        }
        int i2 = i();
        if (c() != null && iA != 0) {
            long currentTime = Utils.getCurrentTime(true);
            if (i2 == 2 && p4.f().b(this.w.get().longValue(), currentTime) && !n(str)) {
                this.w.set(Long.valueOf(currentTime));
                Logger.i(y, "network has changed,and dns_type needn't change");
            } else {
                j(str);
            }
        }
        if (iA == 0) {
            a(str);
            return;
        }
        if (c() != null) {
            if (i2 == 1) {
                c().a(str);
            }
            i iVarB = b(str);
            if (iVarB != null) {
                iVarB.a(iA);
            }
        }
    }

    public void a(String str, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.q.put(str, xVar);
    }

    public void a(String str, i iVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.r.put(str, iVar);
    }

    public void a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        x xVar = this.q.get(str);
        if (xVar == null) {
            xVar = new x();
        }
        xVar.a(i2);
        this.q.put(str, xVar);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.r.remove(str);
        h(str);
    }

    public void a(s0.c cVar) {
        if (cVar == null) {
            return;
        }
        this.i = cVar;
    }

    public void a(Context context, l0 l0Var) {
        if (context == null) {
            Logger.e(y, "invalid parameter");
            return;
        }
        this.j = context.getApplicationContext();
        if (l0Var != null) {
            Logger.v(y, "enter DnsUtil.doRespone" + l0Var);
            this.k = l0Var;
        }
        if (this.d) {
            return;
        }
        synchronized (t.class) {
            if (!this.d) {
                this.d = true;
                this.s.execute(new j(context));
            }
        }
    }

    public void a(long j2) {
        if (j2 > 0) {
            this.o = j2;
        }
    }

    public void a() {
        Logger.v(y, "Clear the related datas");
        SharedPreferences.Editor editorEdit = this.f15360c.edit();
        if (editorEdit != null) {
            editorEdit.clear().commit();
            this.f15359b = null;
            a0.b();
            Logger.v(y, "Clear the related datas successfully");
        }
    }

    public String a(int i2) {
        if (i2 == 1) {
            return w.l;
        }
        if (i2 != 2) {
            return i2 != 3 ? "Default" : w.m;
        }
        return w.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String[] n() {
        if (this.f15359b == null) {
            this.f15359b = this.f15360c.getString(D, "").split("&");
        }
        String[] strArr = this.f15359b;
        return (strArr.length == 1 && TextUtils.isEmpty(strArr[0])) ? new String[0] : (String[]) this.f15359b.clone();
    }

    private boolean n(String str) {
        x xVar = this.q.get(str);
        if (xVar == null) {
            return false;
        }
        long jE = xVar.e();
        long jAbs = Math.abs(Utils.getCurrentTime(true) - xVar.c());
        if (jE > 3 && jAbs > 120000) {
            return true;
        }
        Logger.v(y, "domain = %s ,times = %d, and failure interval = %d", str, Long.valueOf(jE), Long.valueOf(jAbs));
        return false;
    }

    private void m(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.h) {
            if (this.f15358a.size() < 5 && !o0.e().b().equalsIgnoreCase(str)) {
                this.f15358a.add(str);
                this.f15360c.edit().putString(D, ContainerUtils.toString(new LinkedList(this.f15358a))).apply();
            }
        }
    }

    public static t m() {
        if (G == null) {
            synchronized (t.class) {
                if (G == null) {
                    G = new t();
                }
            }
        }
        return G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l(String str) {
        String str2;
        x xVar = this.q.get(str);
        if (xVar == null) {
            str2 = "the dnsInfo is empty from map,and return";
        } else {
            if (Math.abs(Utils.getCurrentTime(true) - xVar.b()) >= 300000) {
                Logger.v(y, "the dns change time is not in hibit period");
                return false;
            }
            str2 = "the dns change time is less than 5 min, and return";
        }
        Logger.w(y, str2);
        return true;
    }

    private void k(String str) {
        try {
            r0.a().a(new h(str));
        } catch (RejectedExecutionException e2) {
            Logger.w(y, "Execute connectTast reject ", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        x xVarE = e(str);
        if (xVarE == null) {
            xVarE = new x();
        }
        int i2 = i();
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2 || (i2 == 3 && e() != null && !str.equals(e().b().b()))) {
                xVarE.a(Utils.getCurrentTime(true));
                i3 = 1;
            }
        } else if (k()) {
            i3 = 3;
        }
        f(i3);
        xVarE.a(i3);
        a(str, xVarE);
        Logger.i(y, str + " %s switch to: %s", a(i2), a(xVarE.d()));
    }

    public static void i(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.w(y, "dnsPrefetch, domain is empty");
        } else {
            g0.a(str, k.f15376b, 2);
        }
    }

    private void h(String str) {
        x xVar = this.q.get(str);
        if (xVar == null || xVar.d() != 2) {
            return;
        }
        xVar.a();
    }

    private List<InetAddress> b(List<InetAddress> list, List<InetAddress> list2) {
        List<InetAddress> list3;
        List<InetAddress> list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(list);
        arrayList.add(list2);
        List<List<InetAddress>> arrayList2 = new ArrayList<>();
        NetworkService networkService = this.p;
        if (networkService != null) {
            arrayList2 = networkService.ipListsSort(arrayList);
        } else {
            arrayList2.addAll(arrayList);
        }
        if (this.m) {
            list3 = arrayList2.get(1);
            list4 = arrayList2.get(0);
        } else {
            list3 = arrayList2.get(0);
            list4 = arrayList2.get(1);
        }
        return a(list3, list4);
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f15372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15373b = 0;

        public String b() {
            return this.f15372a;
        }

        public void a(String str) {
            this.f15372a = str;
        }

        public void a(int i) {
            this.f15373b = i;
        }

        public int a() {
            return this.f15373b;
        }
    }

    private void a(List<String> list, String str) {
        if (list == null || list.size() <= 0) {
            return;
        }
        i iVar = new i();
        iVar.a(list.get(0));
        a(str, iVar);
    }

    public class a extends ThreadLocal<Integer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Integer initialValue() {
            return -1;
        }

        public a() {
        }
    }

    public class b extends ThreadLocal<Long> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Long initialValue() {
            return Long.valueOf(w.a());
        }

        public b() {
        }
    }

    public class c extends ThreadLocal<Integer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Integer initialValue() {
            return -1;
        }

        public c() {
        }
    }

    public class d extends ThreadLocal<Long> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Long initialValue() {
            return Long.valueOf(Utils.getCurrentTime(true));
        }

        public d() {
        }
    }

    public class e extends ThreadLocal<Integer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Integer initialValue() {
            return 0;
        }

        public e() {
        }
    }

    public class f implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            for (m0 m0Var : t.this.l.a(new ArrayList(Arrays.asList(t.this.n())))) {
                if (!TextUtils.isEmpty(m0Var.c())) {
                    a0.a(m0Var.c(), m0Var);
                }
            }
        }

        public f() {
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f15368b;

        @Override // java.lang.Runnable
        public void run() {
            String str;
            try {
                if (t.this.l(this.f15367a)) {
                    return;
                }
                m0 m0VarA = a0.a(this.f15367a);
                if (m0VarA == null) {
                    str = "the domainResult is empty from cache,and return";
                } else {
                    List<InetAddress> listA = y.a(m0VarA.d());
                    if (listA.size() == 0 || this.f15368b.size() == 0) {
                        str = "the address or list is empty,and return";
                    } else {
                        if (!this.f15368b.contains(listA.get(0))) {
                            int iCompareIp = t.this.p != null ? t.this.p.compareIp(listA.get(0), (InetAddress) this.f15368b.get(0)) : -1;
                            x xVar = (x) t.this.q.get(this.f15367a);
                            if (iCompareIp == 1) {
                                xVar.a(2);
                                Logger.i(t.y, "after checking the threshold, the dns_type: %d need to change, and the host is %s", Integer.valueOf(xVar.d()), this.f15367a);
                                return;
                            } else {
                                xVar.a(Utils.getCurrentTime(true));
                                Logger.i(t.y, "after checking the threshold, the dns_type: %d will use the origin status,the host is %s", Integer.valueOf(xVar.d()), this.f15367a);
                                return;
                            }
                        }
                        str = "the ip from local and the ip from dnkeeper is same,and return";
                    }
                }
                Logger.v(t.y, str);
            } catch (ConcurrentModificationException unused) {
                Logger.i(t.y, "dns and dnkeeper has exception with racing,and you need not care it");
            } catch (Throwable unused2) {
                Logger.v(t.y, "dns and dnkeeper has throwable with racing,and you need not care it");
            }
        }

        public g(String str, List list) {
            this.f15367a = str;
            this.f15368b = list;
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f15370a;

        @Override // java.lang.Runnable
        public void run() {
            n5 n5VarA;
            if (t.this.l(this.f15370a)) {
                return;
            }
            try {
                p4 p4VarF = p4.f();
                String str = this.f15370a;
                n5VarA = p4VarF.a(str, y.a(str, w.k));
            } catch (UnknownHostException e) {
                Logger.w(t.y, "Connect detect with UnknownHostException ", e);
                n5VarA = null;
            } catch (Throwable unused) {
                Logger.w(t.y, "Connect detect with error ");
                n5VarA = null;
            }
            if (n5VarA != null && n5VarA.h() && n5VarA.b() < t.this.o && t.this.i() == 1) {
                t.this.j(this.f15370a);
            }
            HianalyticsBaseData hianalyticsBaseDataA = y.a(n5VarA, t.this.o);
            if (hianalyticsBaseDataA != null) {
                HianalyticsHelper.getInstance().executeReportHa(hianalyticsBaseDataA, "dns_request");
            }
        }

        public h(String str) {
            this.f15370a = str;
        }
    }

    public class j implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            l4.b().a(new u());
            if (w.b() == 0) {
                a0.d();
            }
            for (String str : t.this.n()) {
                Logger.v(t.y, "init dnsLazyUpdate domain: " + str);
                g0.a(str, "dns_init", 2);
            }
        }

        public j(Context context) {
        }
    }

    private List<InetAddress> a(List<InetAddress> list, List<InetAddress> list2) {
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < iMax; i2++) {
            if (i2 < list.size()) {
                arrayList.add(list.get(i2));
            }
            if (i2 < list2.size()) {
                arrayList.add(list2.get(i2));
            }
        }
        return arrayList;
    }

    private List<InetAddress> a(List<InetAddress> list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            InetAddress inetAddress = list.get(i2);
            if (inetAddress.getAddress().length == 16) {
                arrayList3.add(inetAddress);
            } else if (inetAddress.getAddress().length == 4) {
                arrayList2.add(inetAddress);
            } else {
                Logger.w(y, "checkIpList is not IPv6 or IPv4");
            }
        }
        if (arrayList2.size() != 0 || arrayList3.size() != 0) {
            return b(arrayList2, arrayList3);
        }
        Logger.w(y, "checkIpList IPv6 and IPv4 are not available");
        return list;
    }
}
