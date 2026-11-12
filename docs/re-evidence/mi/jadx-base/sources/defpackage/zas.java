package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amap.api.col.p0003sl.bb;
import com.amap.api.col.p0003sl.ik;
import com.amap.api.col.p0003sl.j1;
import com.amap.api.col.p0003sl.r;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class zas {
    public static String o = "";
    public static boolean p = false;
    public static volatile zas q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static String f41085r = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f41086a;
    public d d;
    public dcs e;
    public zcs f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public qbs f41088k;
    public vbs l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41087b = true;
    public List<bb> c = new Vector();
    public j1 g = null;
    public j1 h = null;
    public j1 i = null;
    public e j = null;
    public mbs m = null;
    public boolean n = true;

    public class a extends f7t {
        public final /* synthetic */ String d;

        public a(String str) {
            this.d = str;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            bb bbVarI = zas.this.I(this.d);
            if (bbVarI != null) {
                try {
                    if (!bbVarI.B().equals(bbVarI.h) && !bbVarI.B().equals(bbVarI.j)) {
                        String pinyin = bbVarI.getPinyin();
                        if (pinyin.length() > 0) {
                            String strN = zas.this.f.n(pinyin);
                            if (strN == null) {
                                strN = bbVarI.getVersion();
                            }
                            if (zas.f41085r.length() > 0 && strN != null && zas.n(zas.f41085r, strN)) {
                                bbVarI.L();
                            }
                        }
                    }
                    if (zas.this.d != null) {
                        synchronized (zas.this) {
                            try {
                                zas.this.d.b(bbVarI);
                            } catch (Throwable th) {
                                m2t.r(th, "OfflineDownloadManager", "checkUpdatefinally");
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    if (zas.this.d != null) {
                        synchronized (zas.this) {
                            try {
                                zas.this.d.b(bbVarI);
                            } catch (Throwable th2) {
                                m2t.r(th2, "OfflineDownloadManager", "checkUpdatefinally");
                            }
                            return;
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    if (zas.this.d != null) {
                        synchronized (zas.this) {
                            try {
                                zas.this.d.b(bbVarI);
                            } catch (Throwable th4) {
                                m2t.r(th4, "OfflineDownloadManager", "checkUpdatefinally");
                            }
                        }
                    }
                    throw th3;
                }
            }
            zas.this.L();
            dbs dbsVarF = new com.amap.api.col.p0003sl.b(zas.this.f41086a, zas.f41085r).f();
            if (zas.this.d != null) {
                if (dbsVarF == null) {
                    if (zas.this.d != null) {
                        synchronized (zas.this) {
                            try {
                                zas.this.d.b(bbVarI);
                            } catch (Throwable th5) {
                                m2t.r(th5, "OfflineDownloadManager", "checkUpdatefinally");
                            }
                        }
                        return;
                    }
                    return;
                }
                if (dbsVarF.c()) {
                    zas.this.p();
                }
            }
            if (zas.this.d != null) {
                synchronized (zas.this) {
                    try {
                        zas.this.d.b(bbVarI);
                    } catch (Throwable th6) {
                        m2t.r(th6, "OfflineDownloadManager", "checkUpdatefinally");
                    }
                }
            }
        }
    }

    public class b extends f7t {
        public final /* synthetic */ bb d;
        public final /* synthetic */ boolean e;

        public b(bb bbVar, boolean z) {
            this.d = bbVar;
            this.e = z;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            try {
                if (this.d.B().equals(this.d.f)) {
                    if (zas.this.d != null) {
                        zas.this.d.c(this.d);
                        return;
                    }
                    return;
                }
                if (this.d.getState() != 7 && this.d.getState() != -1) {
                    zas.this.l.a(this.d);
                    if (zas.this.d != null) {
                        zas.this.d.c(this.d);
                        return;
                    }
                    return;
                }
                zas.this.l.a(this.d);
                if (!this.e || zas.this.d == null) {
                    return;
                }
                zas.this.d.c(this.d);
            } catch (Throwable th) {
                m2t.r(th, "requestDelete", "removeExcecRunnable");
            }
        }
    }

    public class c extends f7t {
        public final /* synthetic */ bb d;

        public c(bb bbVar) {
            this.d = bbVar;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            try {
                if (zas.this.f41087b) {
                    zas.this.L();
                    dbs dbsVarF = new com.amap.api.col.p0003sl.b(zas.this.f41086a, zas.f41085r).f();
                    if (dbsVarF != null) {
                        zas.D(zas.this);
                        if (dbsVarF.c()) {
                            zas.this.p();
                        }
                    }
                }
                this.d.setVersion(zas.f41085r);
                this.d.F();
            } catch (AMapException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                m2t.r(th, "OfflineDownloadManager", "startDownloadRunnable");
            }
        }
    }

    public interface d {
        void a();

        void a(bb bbVar);

        void b(bb bbVar);

        void c(bb bbVar);
    }

    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                message.getData();
                Object obj = message.obj;
                if (obj instanceof bb) {
                    bb bbVar = (bb) obj;
                    bbVar.getCity();
                    bbVar.getcompleteCode();
                    bbVar.getState();
                    if (zas.this.d != null) {
                        zas.this.d.a(bbVar);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public zas(Context context) {
        this.f41086a = context;
    }

    public static /* synthetic */ boolean D(zas zasVar) {
        zasVar.f41087b = false;
        return false;
    }

    public static void M() {
        q = null;
        p = true;
    }

    public static void N(String str) {
        o = str;
    }

    public static zas a(Context context) {
        if (q == null) {
            synchronized (zas.class) {
                try {
                    if (q == null && !p) {
                        q = new zas(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return q;
    }

    public static boolean n(String str, String str2) {
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

    public final void A() {
        j1 j1Var = this.g;
        if (j1Var != null) {
            j1Var.g();
        }
        j1 j1Var2 = this.i;
        if (j1Var2 != null) {
            j1Var2.g();
            this.i = null;
        }
        mbs mbsVar = this.m;
        if (mbsVar != null) {
            if (mbsVar.isAlive()) {
                this.m.interrupt();
            }
            this.m = null;
        }
        e eVar = this.j;
        if (eVar != null) {
            eVar.removeCallbacksAndMessages(null);
            this.j = null;
        }
        dcs dcsVar = this.e;
        if (dcsVar != null) {
            dcsVar.d();
            this.e = null;
        }
        qbs qbsVar = this.f41088k;
        if (qbsVar != null) {
            qbsVar.w();
        }
        M();
        this.f41087b = true;
        O();
    }

    public final void B(bb bbVar) throws AMapException {
        L();
        if (bbVar == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        if (this.i == null) {
            this.i = r.b("AMapOfflineDownload");
        }
        try {
            this.i.b(new c(bbVar));
        } catch (Throwable th) {
            m2t.r(th, "startDownload", "downloadExcecRunnable");
        }
    }

    public final void C(String str) throws AMapException {
        bb bbVarK = K(str);
        if (bbVarK == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        B(bbVarK);
    }

    public final String E(String str) {
        bb bbVarI;
        return (str == null || (bbVarI = I(str)) == null) ? "" : bbVarI.getAdcode();
    }

    public final void F() {
        try {
            gcs gcsVarA = this.f.a("000001");
            if (gcsVarA != null) {
                this.f.m("000001");
                gcsVarA.b("100000");
                this.f.e(gcsVarA);
            }
        } catch (Throwable th) {
            m2t.r(th, "OfflineDownloadManager", "changeBadCase");
        }
    }

    public final void G() {
        if ("".equals(zns.h0(this.f41086a))) {
            return;
        }
        File file = new File(zns.h0(this.f41086a) + "offlinemapv4.png");
        String strD = !file.exists() ? bes.d(this.f41086a, "offlinemapv4.png") : bes.n(file);
        if (strD != null) {
            try {
                H(strD);
            } catch (JSONException e2) {
                if (file.exists()) {
                    file.delete();
                }
                m2t.r(e2, "MapDownloadManager", "paseJson io");
                e2.printStackTrace();
            }
        }
    }

    public final void H(String str) throws JSONException {
        qbs qbsVar;
        List<OfflineMapProvince> listF = bes.f(str, this.f41086a.getApplicationContext());
        if (listF == null || listF.size() == 0 || (qbsVar = this.f41088k) == null) {
            return;
        }
        qbsVar.i(listF);
    }

    public final bb I(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        synchronized (this.c) {
            try {
                for (bb bbVar : this.c) {
                    if (!str.equals(bbVar.getCity()) && !str.equals(bbVar.getPinyin())) {
                    }
                    return bbVar;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void J() {
        for (gcs gcsVar : this.f.c()) {
            if (gcsVar != null && gcsVar.a() != null && gcsVar.e().length() > 0) {
                int i = gcsVar.l;
                if (i != 4 && i != 7 && i >= 0) {
                    gcsVar.l = 3;
                }
                bb bbVarI = I(gcsVar.a());
                if (bbVarI != null) {
                    String strC = gcsVar.c();
                    if (strC == null || !n(f41085r, strC)) {
                        bbVarI.v(gcsVar.l);
                        bbVarI.setCompleteCode(gcsVar.i());
                    } else {
                        bbVarI.v(7);
                    }
                    if (gcsVar.c().length() > 0) {
                        bbVarI.setVersion(gcsVar.c());
                    }
                    List<String> listI = this.f.i(gcsVar.e());
                    StringBuffer stringBuffer = new StringBuffer();
                    Iterator<String> it = listI.iterator();
                    while (it.hasNext()) {
                        stringBuffer.append(it.next());
                        stringBuffer.append(";");
                    }
                    bbVarI.z(stringBuffer.toString());
                    qbs qbsVar = this.f41088k;
                    if (qbsVar != null) {
                        qbsVar.d(bbVarI);
                    }
                }
            }
        }
    }

    public final bb K(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        synchronized (this.c) {
            try {
                for (bb bbVar : this.c) {
                    if (str.equals(bbVar.getCode())) {
                        return bbVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void L() throws AMapException {
        if (!zns.j0(this.f41086a)) {
            throw new AMapException(AMapException.ERROR_CONNECTION);
        }
    }

    public final void O() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void d() {
        this.f = zcs.b(this.f41086a.getApplicationContext());
        F();
        this.j = new e(this.f41086a.getMainLooper());
        this.f41088k = new qbs(this.f41086a);
        this.e = dcs.a();
        N(zns.h0(this.f41086a));
        try {
            G();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        synchronized (this.c) {
            try {
                Iterator<OfflineMapProvince> it = this.f41088k.b().iterator();
                while (it.hasNext()) {
                    for (OfflineMapCity offlineMapCity : it.next().getCityList()) {
                        if (offlineMapCity != null) {
                            this.c.add(new bb(this.f41086a, offlineMapCity));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        mbs mbsVar = new mbs(this.f41086a);
        this.m = mbsVar;
        mbsVar.start();
    }

    public final void e(d dVar) {
        this.d = dVar;
    }

    public final void f(bb bbVar) {
        g(bbVar, false);
    }

    public final void g(bb bbVar, boolean z) {
        if (this.l == null) {
            this.l = new vbs(this.f41086a);
        }
        if (this.h == null) {
            this.h = r.b("AMapOfflineRemove");
        }
        try {
            this.h.b(new b(bbVar, z));
        } catch (Throwable th) {
            m2t.r(th, "requestDelete", "removeExcecRunnable");
        }
    }

    public final void h(String str) {
        try {
            if (str != null) {
                if (this.g == null) {
                    this.g = r.b("AMapOfflineCheckUpdate");
                }
                this.g.b(new a(str));
            } else {
                d dVar = this.d;
                if (dVar != null) {
                    dVar.b(null);
                }
            }
        } catch (Throwable th) {
            m2t.r(th, "OfflineDownloadManager", "checkUpdate");
        }
    }

    public final void j() {
        J();
        d dVar = this.d;
        if (dVar != null) {
            try {
                dVar.a();
            } catch (Throwable th) {
                m2t.r(th, "OfflineDownloadManager", "verifyCallBack");
            }
        }
    }

    public final void l(bb bbVar) {
        try {
            dcs dcsVar = this.e;
            if (dcsVar != null) {
                dcsVar.c(bbVar, this.f41086a);
            }
        } catch (ik e2) {
            e2.printStackTrace();
        }
    }

    public final boolean m(String str) {
        return I(str) != null;
    }

    public final void p() throws AMapException {
        if (this.f41088k == null) {
            return;
        }
        com.amap.api.col.p0003sl.d dVar = new com.amap.api.col.p0003sl.d(this.f41086a, "");
        dVar.h(this.f41086a);
        List<OfflineMapProvince> listF = dVar.f();
        if (this.c != null) {
            this.f41088k.i(listF);
        }
        List<bb> list = this.c;
        if (list != null) {
            synchronized (list) {
                try {
                    Iterator<OfflineMapProvince> it = this.f41088k.b().iterator();
                    while (it.hasNext()) {
                        for (OfflineMapCity offlineMapCity : it.next().getCityList()) {
                            for (bb bbVar : this.c) {
                                if (offlineMapCity.getPinyin().equals(bbVar.getPinyin())) {
                                    String version = bbVar.getVersion();
                                    if (bbVar.getState() == 4 && f41085r.length() > 0 && n(f41085r, version)) {
                                        bbVar.L();
                                        bbVar.setUrl(offlineMapCity.getUrl());
                                        bbVar.V();
                                    } else {
                                        bbVar.setCity(offlineMapCity.getCity());
                                        bbVar.setUrl(offlineMapCity.getUrl());
                                        bbVar.V();
                                        bbVar.setAdcode(offlineMapCity.getAdcode());
                                        bbVar.setVersion(offlineMapCity.getVersion());
                                        bbVar.setSize(offlineMapCity.getSize());
                                        bbVar.setCode(offlineMapCity.getCode());
                                        bbVar.setJianpin(offlineMapCity.getJianpin());
                                        bbVar.setPinyin(offlineMapCity.getPinyin());
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void q(bb bbVar) {
        qbs qbsVar = this.f41088k;
        if (qbsVar != null) {
            qbsVar.d(bbVar);
        }
        e eVar = this.j;
        if (eVar != null) {
            Message messageObtainMessage = eVar.obtainMessage();
            messageObtainMessage.obj = bbVar;
            this.j.sendMessage(messageObtainMessage);
        }
    }

    public final void r(String str) {
        bb bbVarI = I(str);
        if (bbVarI != null) {
            u(bbVarI);
            g(bbVarI, true);
            return;
        }
        d dVar = this.d;
        if (dVar != null) {
            try {
                dVar.c(bbVarI);
            } catch (Throwable th) {
                m2t.r(th, "OfflineDownloadManager", "remove");
            }
        }
    }

    public final void t() {
        synchronized (this.c) {
            try {
                for (bb bbVar : this.c) {
                    if (bbVar.B().equals(bbVar.h) || bbVar.B().equals(bbVar.g)) {
                        u(bbVar);
                        bbVar.G();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(bb bbVar) {
        dcs dcsVar = this.e;
        if (dcsVar != null) {
            dcsVar.b(bbVar);
        }
    }

    public final void v(String str) {
        bb bbVarI = I(str);
        if (bbVarI != null) {
            bbVarI.F();
        }
    }

    public final void w() {
        synchronized (this.c) {
            try {
                for (bb bbVar : this.c) {
                    if (bbVar.B().equals(bbVar.h)) {
                        bbVar.G();
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(bb bbVar) {
        dcs dcsVar = this.e;
        if (dcsVar != null) {
            dcsVar.e(bbVar);
        }
    }

    public final void y(String str) throws AMapException {
        bb bbVarI = I(str);
        if (str == null || str.length() <= 0 || bbVarI == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        B(bbVarI);
    }
}
