package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ay {
    public static String a = "";
    public static boolean b = false;
    public static String d = "";
    private static volatile ay k;
    public bc f;
    public be g;
    private Context i;
    private a l;
    private bh m;
    private bn n;
    private boolean j = true;
    public List<ax> c = new Vector();
    private ExecutorService o = null;
    private ExecutorService p = null;
    private ExecutorService q = null;
    public b e = null;
    public bb h = null;
    private boolean r = true;

    public interface a {
        void a();

        void a(ax axVar);

        void b(ax axVar);

        void c(ax axVar);
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                message.getData();
                Object obj = message.obj;
                if (obj instanceof ax) {
                    ax axVar = (ax) obj;
                    axVar.getCity();
                    axVar.getcompleteCode();
                    axVar.getState();
                    if (ay.this.l != null) {
                        ay.this.l.a(axVar);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private ay(Context context) {
        this.i = context;
    }

    public static /* synthetic */ boolean f(ay ayVar) {
        ayVar.j = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() throws AMapException {
        if (!er.d(this.i)) {
            throw new AMapException(AMapException.ERROR_CONNECTION);
        }
    }

    private ax h(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        synchronized (this.c) {
            for (ax axVar : this.c) {
                if (str.equals(axVar.getCode())) {
                    return axVar;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(String str, String str2) {
        for (int i = 0; i < str2.length(); i++) {
            try {
                if (str.charAt(i) > str2.charAt(i)) {
                    return true;
                }
                if (str.charAt(i) < str2.charAt(i)) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final void c() throws AMapException {
        if (this.f == null) {
            return;
        }
        bf bfVar = new bf(this.i, "");
        bfVar.a(this.i);
        List<OfflineMapProvince> listC = bfVar.c();
        if (this.c != null) {
            this.f.a(listC);
        }
        List<ax> list = this.c;
        if (list != null) {
            synchronized (list) {
                Iterator<OfflineMapProvince> it2 = this.f.a().iterator();
                while (it2.hasNext()) {
                    for (OfflineMapCity offlineMapCity : it2.next().getCityList()) {
                        for (ax axVar : this.c) {
                            if (offlineMapCity.getPinyin().equals(axVar.getPinyin())) {
                                String version = axVar.getVersion();
                                if (axVar.getState() == 4 && d.length() > 0 && b(d, version)) {
                                    axVar.f();
                                    axVar.setUrl(offlineMapCity.getUrl());
                                    axVar.o();
                                } else {
                                    axVar.setCity(offlineMapCity.getCity());
                                    axVar.setUrl(offlineMapCity.getUrl());
                                    axVar.o();
                                    axVar.setAdcode(offlineMapCity.getAdcode());
                                    axVar.setVersion(offlineMapCity.getVersion());
                                    axVar.setSize(offlineMapCity.getSize());
                                    axVar.setCode(offlineMapCity.getCode());
                                    axVar.setJianpin(offlineMapCity.getJianpin());
                                    axVar.setPinyin(offlineMapCity.getPinyin());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        synchronized (this.c) {
            for (ax axVar : this.c) {
                if (axVar.l.equals(axVar.c) || axVar.l.equals(axVar.b)) {
                    c(axVar);
                    axVar.l.e();
                }
            }
        }
    }

    public final void e() {
        synchronized (this.c) {
            for (ax axVar : this.c) {
                if (axVar.l.equals(axVar.c)) {
                    axVar.l.e();
                    break;
                }
            }
        }
    }

    public final void f() {
        ExecutorService executorService = this.o;
        if (executorService != null && !executorService.isShutdown()) {
            this.o.shutdownNow();
        }
        ExecutorService executorService2 = this.q;
        if (executorService2 != null && !executorService2.isShutdown()) {
            this.q.shutdownNow();
        }
        bb bbVar = this.h;
        if (bbVar != null) {
            if (bbVar.isAlive()) {
                this.h.interrupt();
            }
            this.h = null;
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.removeCallbacksAndMessages(null);
            this.e = null;
        }
        bh bhVar = this.m;
        if (bhVar != null) {
            bhVar.b();
        }
        bc bcVar = this.f;
        if (bcVar != null) {
            bcVar.g();
        }
        k = null;
        b = true;
        this.j = true;
        synchronized (this) {
            this.l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ax g(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        synchronized (this.c) {
            for (ax axVar : this.c) {
                if (str.equals(axVar.getCity()) || str.equals(axVar.getPinyin())) {
                    return axVar;
                }
            }
            return null;
        }
    }

    public static ay a(Context context) {
        if (k == null) {
            synchronized (ay.class) {
                if (k == null && !b) {
                    k = new ay(context.getApplicationContext());
                }
            }
        }
        return k;
    }

    public final boolean b(String str) {
        return g(str) != null;
    }

    public final void b(ax axVar) {
        try {
            bh bhVar = this.m;
            if (bhVar != null) {
                bhVar.a(axVar, this.i);
            }
        } catch (gi e) {
            e.printStackTrace();
        }
    }

    public final void e(String str) throws AMapException {
        ax axVarH = h(str);
        if (axVarH != null) {
            e(axVarH);
            return;
        }
        throw new AMapException(AMapException.ERROR_INVALID_PARAMETER);
    }

    public final void b() {
        for (bi biVar : this.n.a()) {
            if (biVar != null && biVar.c() != null && biVar.e().length() > 0) {
                int i = biVar.l;
                if (i != 4 && i != 7 && i >= 0) {
                    biVar.l = 3;
                }
                ax axVarG = g(biVar.c());
                if (axVarG != null) {
                    String strD = biVar.d();
                    if (strD != null && b(d, strD)) {
                        axVarG.a(7);
                    } else {
                        axVarG.a(biVar.l);
                        axVarG.setCompleteCode(biVar.g());
                    }
                    if (biVar.d().length() > 0) {
                        axVarG.setVersion(biVar.d());
                    }
                    List<String> listB = this.n.b(biVar.e());
                    StringBuffer stringBuffer = new StringBuffer();
                    Iterator<String> it2 = listB.iterator();
                    while (it2.hasNext()) {
                        stringBuffer.append(it2.next());
                        stringBuffer.append(";");
                    }
                    axVarG.a(stringBuffer.toString());
                    bc bcVar = this.f;
                    if (bcVar != null) {
                        bcVar.a(axVarG);
                    }
                }
            }
        }
        a aVar = this.l;
        if (aVar != null) {
            try {
                aVar.a();
            } catch (Throwable th) {
                hn.c(th, "OfflineDownloadManager", "verifyCallBack");
            }
        }
    }

    private void e(final ax axVar) throws AMapException {
        g();
        if (axVar != null) {
            if (this.q == null) {
                this.q = new ThreadPoolExecutor(1, 2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ee("AMapOfflineDownload"), new ThreadPoolExecutor.AbortPolicy());
            }
            try {
                this.q.execute(new Runnable() { // from class: com.amap.api.mapcore.util.ay.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (ay.this.j) {
                                ay.this.g();
                                az azVarC = new ba(ay.this.i, ay.d).c();
                                if (azVarC != null) {
                                    ay.f(ay.this);
                                    if (azVarC.a()) {
                                        ay.this.c();
                                    }
                                }
                            }
                            axVar.setVersion(ay.d);
                            ax axVar2 = axVar;
                            axVar2.l.b();
                            if (axVar2.l.equals(axVar2.d)) {
                                axVar2.l.d();
                                return;
                            }
                            if (axVar2.l.equals(axVar2.c)) {
                                axVar2.l.e();
                                return;
                            }
                            boolean z = true;
                            if (!axVar2.l.equals(axVar2.g) && !axVar2.l.equals(axVar2.h)) {
                                if (!axVar2.l.equals(axVar2.j) && !axVar2.l.equals(axVar2.i)) {
                                    if (axVar2.k.b() != axVar2.l.b()) {
                                        z = false;
                                    }
                                    if (!z) {
                                        axVar2.l.h();
                                        return;
                                    }
                                }
                                axVar2.l.c();
                                return;
                            }
                            ay ayVarA = ay.a(axVar2.m);
                            if (ayVarA != null) {
                                ayVarA.a(axVar2);
                            }
                            axVar2.n = true;
                        } catch (AMapException e) {
                            e.printStackTrace();
                        } catch (Throwable th) {
                            hn.c(th, "OfflineDownloadManager", "startDownloadRunnable");
                        }
                    }
                });
                return;
            } catch (Throwable th) {
                hn.c(th, "startDownload", "downloadExcecRunnable");
                return;
            }
        }
        throw new AMapException(AMapException.ERROR_INVALID_PARAMETER);
    }

    public final void a() {
        String strC;
        List<OfflineMapProvince> listA;
        bc bcVar;
        bn bnVarA = bn.a(this.i.getApplicationContext());
        this.n = bnVarA;
        try {
            bi biVarA = bnVarA.a("000001");
            if (biVarA != null) {
                this.n.c("000001");
                biVarA.c("100000");
                this.n.a(biVarA);
            }
        } catch (Throwable th) {
            hn.c(th, "OfflineDownloadManager", "changeBadCase");
        }
        this.e = new b(this.i.getMainLooper());
        this.f = new bc(this.i);
        this.m = bh.a();
        a = er.c(this.i);
        try {
            if (!"".equals(er.c(this.i))) {
                File file = new File(er.c(this.i) + "offlinemapv4.png");
                if (!file.exists()) {
                    strC = bv.a(this.i, "offlinemapv4.png");
                } else {
                    strC = bv.c(file);
                }
                if (strC != null) {
                    try {
                        Context applicationContext = this.i.getApplicationContext();
                        if ("".equals(strC)) {
                            listA = new ArrayList<>();
                        } else {
                            listA = bv.a(new JSONObject(strC), applicationContext);
                        }
                        if (listA.size() != 0 && (bcVar = this.f) != null) {
                            bcVar.a(listA);
                        }
                    } catch (JSONException e) {
                        if (file.exists()) {
                            file.delete();
                        }
                        hn.c(e, "MapDownloadManager", "paseJson io");
                        e.printStackTrace();
                    }
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        synchronized (this.c) {
            Iterator<OfflineMapProvince> it2 = this.f.a().iterator();
            while (it2.hasNext()) {
                for (OfflineMapCity offlineMapCity : it2.next().getCityList()) {
                    if (offlineMapCity != null) {
                        this.c.add(new ax(this.i, offlineMapCity));
                    }
                }
            }
        }
        bb bbVar = new bb(this.i);
        this.h = bbVar;
        bbVar.start();
    }

    public final void d(String str) throws AMapException {
        ax axVarG = g(str);
        if (str != null && str.length() > 0 && axVarG != null) {
            e(axVarG);
            return;
        }
        throw new AMapException(AMapException.ERROR_INVALID_PARAMETER);
    }

    public final void d(ax axVar) {
        bh bhVar = this.m;
        if (bhVar != null) {
            bhVar.b(axVar);
        }
    }

    public final String f(String str) {
        ax axVarG;
        return (str == null || (axVarG = g(str)) == null) ? "" : axVarG.getAdcode();
    }

    public final void c(String str) {
        ax axVarG = g(str);
        if (axVarG == null) {
            a aVar = this.l;
            if (aVar != null) {
                try {
                    aVar.c(axVarG);
                    return;
                } catch (Throwable th) {
                    hn.c(th, "OfflineDownloadManager", "remove");
                    return;
                }
            }
            return;
        }
        c(axVarG);
        a(axVarG, true);
    }

    public final void c(ax axVar) {
        bh bhVar = this.m;
        if (bhVar != null) {
            bhVar.a(axVar);
        }
    }

    public final void a(final String str) {
        try {
            if (str == null) {
                a aVar = this.l;
                if (aVar != null) {
                    aVar.b(null);
                    return;
                }
                return;
            }
            if (this.o == null) {
                this.o = new ThreadPoolExecutor(1, 2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ee("AMapOfflineCheckUpdate"), new ThreadPoolExecutor.AbortPolicy());
            }
            this.o.execute(new Runnable() { // from class: com.amap.api.mapcore.util.ay.1
                @Override // java.lang.Runnable
                public final void run() {
                    ax axVarG = ay.this.g(str);
                    if (axVarG != null) {
                        try {
                            if (!axVarG.l.equals(axVarG.c) && !axVarG.l.equals(axVarG.e)) {
                                String pinyin = axVarG.getPinyin();
                                if (pinyin.length() > 0) {
                                    String strD = ay.this.n.d(pinyin);
                                    if (strD == null) {
                                        strD = axVarG.getVersion();
                                    }
                                    if (ay.d.length() > 0 && strD != null && ay.b(ay.d, strD)) {
                                        axVarG.f();
                                    }
                                }
                            }
                            if (ay.this.l != null) {
                                synchronized (ay.this) {
                                    try {
                                        ay.this.l.b(axVarG);
                                    } catch (Throwable th) {
                                        hn.c(th, "OfflineDownloadManager", "checkUpdatefinally");
                                    }
                                }
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            if (ay.this.l != null) {
                                synchronized (ay.this) {
                                    try {
                                        ay.this.l.b(axVarG);
                                    } catch (Throwable th2) {
                                        hn.c(th2, "OfflineDownloadManager", "checkUpdatefinally");
                                    }
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th3) {
                            if (ay.this.l != null) {
                                synchronized (ay.this) {
                                    try {
                                        ay.this.l.b(axVarG);
                                    } catch (Throwable th4) {
                                        hn.c(th4, "OfflineDownloadManager", "checkUpdatefinally");
                                    }
                                }
                            }
                            throw th3;
                        }
                    }
                    ay.this.g();
                    az azVarC = new ba(ay.this.i, ay.d).c();
                    if (ay.this.l != null) {
                        if (azVarC == null) {
                            if (ay.this.l != null) {
                                synchronized (ay.this) {
                                    try {
                                        ay.this.l.b(axVarG);
                                    } catch (Throwable th5) {
                                        hn.c(th5, "OfflineDownloadManager", "checkUpdatefinally");
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        if (azVarC.a()) {
                            ay.this.c();
                        }
                    }
                    if (ay.this.l != null) {
                        synchronized (ay.this) {
                            try {
                                ay.this.l.b(axVarG);
                            } catch (Throwable th6) {
                                hn.c(th6, "OfflineDownloadManager", "checkUpdatefinally");
                            }
                        }
                    }
                }
            });
        } catch (Throwable th) {
            hn.c(th, "OfflineDownloadManager", "checkUpdate");
        }
    }

    public final void a(ax axVar) {
        a(axVar, false);
    }

    private void a(final ax axVar, final boolean z) {
        if (this.g == null) {
            this.g = new be(this.i);
        }
        if (this.p == null) {
            this.p = new ThreadPoolExecutor(1, 2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ee("AMapOfflineRemove"), new ThreadPoolExecutor.AbortPolicy());
        }
        try {
            this.p.execute(new Runnable() { // from class: com.amap.api.mapcore.util.ay.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ax axVar2 = axVar;
                        if (axVar2.l.equals(axVar2.a)) {
                            if (ay.this.l != null) {
                                ay.this.l.c(axVar);
                                return;
                            }
                            return;
                        }
                        if (axVar.getState() != 7 && axVar.getState() != -1) {
                            ay.this.g.a(axVar);
                            if (ay.this.l != null) {
                                ay.this.l.c(axVar);
                                return;
                            }
                            return;
                        }
                        ay.this.g.a(axVar);
                        if (!z || ay.this.l == null) {
                            return;
                        }
                        ay.this.l.c(axVar);
                    } catch (Throwable th) {
                        hn.c(th, "requestDelete", "removeExcecRunnable");
                    }
                }
            });
        } catch (Throwable th) {
            hn.c(th, "requestDelete", "removeExcecRunnable");
        }
    }

    public final void a(a aVar) {
        this.l = aVar;
    }
}
