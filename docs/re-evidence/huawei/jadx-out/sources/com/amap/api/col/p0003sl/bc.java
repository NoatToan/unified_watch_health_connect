package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import ohos.ace.plugin.taskmanagerplugin.EventType;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f2249a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f2250b = false;
    public static String d = "";
    private static volatile bc k;
    public bg f;
    bi g;
    private Context i;
    private a l;
    private bl m;
    private br n;
    private boolean j = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<bb> f2251c = new Vector();
    private ma o = null;
    private ma p = null;
    private ma q = null;
    b e = null;
    bf h = null;
    private boolean r = true;

    public interface a {
        void a();

        void a(bb bbVar);

        void b(bb bbVar);

        void c(bb bbVar);
    }

    static /* synthetic */ boolean f(bc bcVar) {
        bcVar.j = false;
        return false;
    }

    private bc(Context context) {
        this.i = context;
    }

    public static bc a(Context context) {
        if (k == null) {
            synchronized (bc.class) {
                if (k == null && !f2250b) {
                    k = new bc(context.getApplicationContext());
                }
            }
        }
        return k;
    }

    public final void a() {
        this.n = br.a(this.i.getApplicationContext());
        g();
        this.e = new b(this.i.getMainLooper());
        this.f = new bg(this.i);
        this.m = bl.a();
        k(eb.c(this.i));
        try {
            h();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        synchronized (this.f2251c) {
            Iterator<OfflineMapProvince> it = this.f.a().iterator();
            while (it.hasNext()) {
                for (OfflineMapCity offlineMapCity : it.next().getCityList()) {
                    if (offlineMapCity != null) {
                        this.f2251c.add(new bb(this.i, offlineMapCity));
                    }
                }
            }
        }
        bf bfVar = new bf(this.i);
        this.h = bfVar;
        bfVar.start();
    }

    private void g() {
        try {
            bm bmVarA = this.n.a("000001");
            if (bmVarA != null) {
                this.n.c("000001");
                bmVarA.c(SmartMsgConstant.SHOW_METHOD_SMART_CARD);
                this.n.a(bmVarA);
            }
        } catch (Throwable th) {
            jv.c(th, "OfflineDownloadManager", "changeBadCase");
        }
    }

    private void h() {
        String strC;
        if ("".equals(eb.c(this.i))) {
            return;
        }
        File file = new File(eb.c(this.i) + "offlinemapv4.png");
        if (!file.exists()) {
            strC = bz.a(this.i, "offlinemapv4.png");
        } else {
            strC = bz.c(file);
        }
        if (strC != null) {
            try {
                h(strC);
            } catch (JSONException e) {
                if (file.exists()) {
                    file.delete();
                }
                jv.c(e, "MapDownloadManager", "paseJson io");
                e.printStackTrace();
            }
        }
    }

    private void h(String str) throws JSONException {
        bg bgVar;
        List<OfflineMapProvince> listA = bz.a(str, this.i.getApplicationContext());
        if (listA == null || listA.size() == 0 || (bgVar = this.f) == null) {
            return;
        }
        bgVar.a(listA);
    }

    private void i() {
        for (bm bmVar : this.n.a()) {
            if (bmVar != null && bmVar.c() != null && bmVar.e().length() > 0) {
                if (bmVar.l != 4 && bmVar.l != 7 && bmVar.l >= 0) {
                    bmVar.l = 3;
                }
                bb bbVarI = i(bmVar.c());
                if (bbVarI != null) {
                    String strD = bmVar.d();
                    if (strD != null && b(d, strD)) {
                        bbVarI.a(7);
                    } else {
                        bbVarI.a(bmVar.l);
                        bbVarI.setCompleteCode(bmVar.g());
                    }
                    if (bmVar.d().length() > 0) {
                        bbVarI.setVersion(bmVar.d());
                    }
                    List<String> listB = this.n.b(bmVar.e());
                    StringBuffer stringBuffer = new StringBuffer();
                    Iterator<String> it = listB.iterator();
                    while (it.hasNext()) {
                        stringBuffer.append(it.next());
                        stringBuffer.append(";");
                    }
                    bbVarI.a(stringBuffer.toString());
                    bg bgVar = this.f;
                    if (bgVar != null) {
                        bgVar.a(bbVarI);
                    }
                }
            }
        }
    }

    public final void b() {
        i();
        a aVar = this.l;
        if (aVar != null) {
            try {
                aVar.a();
            } catch (Throwable th) {
                jv.c(th, "OfflineDownloadManager", "verifyCallBack");
            }
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
                this.o = ea.a("AMapOfflineCheckUpdate");
            }
            this.o.a(new mb() { // from class: com.amap.api.col.3sl.bc.1
                @Override // com.amap.api.col.p0003sl.mb
                public final void runTask() {
                    bb bbVarI = bc.this.i(str);
                    if (bbVarI != null) {
                        try {
                            if (!bbVarI.c().equals(bbVarI.f2244c) && !bbVarI.c().equals(bbVarI.e)) {
                                String pinyin = bbVarI.getPinyin();
                                if (pinyin.length() > 0) {
                                    String strD = bc.this.n.d(pinyin);
                                    if (strD == null) {
                                        strD = bbVarI.getVersion();
                                    }
                                    if (bc.d.length() > 0 && strD != null && bc.b(bc.d, strD)) {
                                        bbVarI.j();
                                    }
                                }
                            }
                            if (bc.this.l != null) {
                                synchronized (bc.this) {
                                    try {
                                        bc.this.l.b(bbVarI);
                                    } catch (Throwable th) {
                                        jv.c(th, "OfflineDownloadManager", "checkUpdatefinally");
                                    }
                                }
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            if (bc.this.l != null) {
                                synchronized (bc.this) {
                                    try {
                                        bc.this.l.b(bbVarI);
                                    } catch (Throwable th2) {
                                        jv.c(th2, "OfflineDownloadManager", "checkUpdatefinally");
                                    }
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th3) {
                            if (bc.this.l != null) {
                                synchronized (bc.this) {
                                    try {
                                        bc.this.l.b(bbVarI);
                                    } catch (Throwable th4) {
                                        jv.c(th4, "OfflineDownloadManager", "checkUpdatefinally");
                                    }
                                }
                            }
                            throw th3;
                        }
                    }
                    bc.this.j();
                    bd bdVarC = new be(bc.this.i, bc.d).c();
                    if (bc.this.l != null) {
                        if (bdVarC == null) {
                            if (bc.this.l != null) {
                                synchronized (bc.this) {
                                    try {
                                        bc.this.l.b(bbVarI);
                                    } catch (Throwable th5) {
                                        jv.c(th5, "OfflineDownloadManager", "checkUpdatefinally");
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        if (bdVarC.a()) {
                            bc.this.c();
                        }
                    }
                    if (bc.this.l != null) {
                        synchronized (bc.this) {
                            try {
                                bc.this.l.b(bbVarI);
                            } catch (Throwable th6) {
                                jv.c(th6, "OfflineDownloadManager", "checkUpdatefinally");
                            }
                        }
                    }
                }
            });
        } catch (Throwable th) {
            jv.c(th, "OfflineDownloadManager", "checkUpdate");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() throws AMapException {
        if (!eb.d(this.i)) {
            throw new AMapException(AMapException.ERROR_CONNECTION);
        }
    }

    protected final void c() throws AMapException {
        if (this.f == null) {
            return;
        }
        bj bjVar = new bj(this.i, "");
        bjVar.a(this.i);
        List<OfflineMapProvince> listC = bjVar.c();
        if (this.f2251c != null) {
            this.f.a(listC);
        }
        List<bb> list = this.f2251c;
        if (list != null) {
            synchronized (list) {
                Iterator<OfflineMapProvince> it = this.f.a().iterator();
                while (it.hasNext()) {
                    for (OfflineMapCity offlineMapCity : it.next().getCityList()) {
                        for (bb bbVar : this.f2251c) {
                            if (offlineMapCity.getPinyin().equals(bbVar.getPinyin())) {
                                String version = bbVar.getVersion();
                                if (bbVar.getState() == 4 && d.length() > 0 && b(d, version)) {
                                    bbVar.j();
                                    bbVar.setUrl(offlineMapCity.getUrl());
                                    bbVar.s();
                                } else {
                                    bbVar.setCity(offlineMapCity.getCity());
                                    bbVar.setUrl(offlineMapCity.getUrl());
                                    bbVar.s();
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
            }
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

    public final boolean b(String str) {
        return i(str) != null;
    }

    public final void c(String str) {
        bb bbVarI = i(str);
        if (bbVarI == null) {
            a aVar = this.l;
            if (aVar != null) {
                try {
                    aVar.c(bbVarI);
                    return;
                } catch (Throwable th) {
                    jv.c(th, "OfflineDownloadManager", EventType.REMOVE);
                    return;
                }
            }
            return;
        }
        d(bbVarI);
        a(bbVarI, true);
    }

    public final void a(bb bbVar) {
        a(bbVar, false);
    }

    private void a(final bb bbVar, final boolean z) {
        if (this.g == null) {
            this.g = new bi(this.i);
        }
        if (this.p == null) {
            this.p = ea.a("AMapOfflineRemove");
        }
        try {
            this.p.a(new mb() { // from class: com.amap.api.col.3sl.bc.2
                @Override // com.amap.api.col.p0003sl.mb
                public final void runTask() {
                    try {
                        if (bbVar.c().equals(bbVar.f2242a)) {
                            if (bc.this.l != null) {
                                bc.this.l.c(bbVar);
                                return;
                            }
                            return;
                        }
                        if (bbVar.getState() != 7 && bbVar.getState() != -1) {
                            bc.this.g.a(bbVar);
                            if (bc.this.l != null) {
                                bc.this.l.c(bbVar);
                                return;
                            }
                            return;
                        }
                        bc.this.g.a(bbVar);
                        if (!z || bc.this.l == null) {
                            return;
                        }
                        bc.this.l.c(bbVar);
                    } catch (Throwable th) {
                        jv.c(th, "requestDelete", "removeExcecRunnable");
                    }
                }
            });
        } catch (Throwable th) {
            jv.c(th, "requestDelete", "removeExcecRunnable");
        }
    }

    public final void b(bb bbVar) {
        try {
            bl blVar = this.m;
            if (blVar != null) {
                blVar.a(bbVar, this.i);
            }
        } catch (ik e) {
            e.printStackTrace();
        }
    }

    public final void c(bb bbVar) {
        bg bgVar = this.f;
        if (bgVar != null) {
            bgVar.a(bbVar);
        }
        b bVar = this.e;
        if (bVar != null) {
            Message messageObtainMessage = bVar.obtainMessage();
            messageObtainMessage.obj = bbVar;
            this.e.sendMessage(messageObtainMessage);
        }
    }

    public final void d() {
        synchronized (this.f2251c) {
            for (bb bbVar : this.f2251c) {
                if (bbVar.c().equals(bbVar.f2244c) || bbVar.c().equals(bbVar.f2243b)) {
                    d(bbVar);
                    bbVar.g();
                }
            }
        }
    }

    public final void e() {
        synchronized (this.f2251c) {
            for (bb bbVar : this.f2251c) {
                if (bbVar.c().equals(bbVar.f2244c)) {
                    bbVar.g();
                    break;
                }
            }
        }
    }

    public final void d(String str) {
        bb bbVarI = i(str);
        if (bbVarI != null) {
            bbVarI.f();
        }
    }

    public final void f() {
        ma maVar = this.o;
        if (maVar != null) {
            maVar.e();
        }
        ma maVar2 = this.q;
        if (maVar2 != null) {
            maVar2.e();
            this.q = null;
        }
        bf bfVar = this.h;
        if (bfVar != null) {
            if (bfVar.isAlive()) {
                this.h.interrupt();
            }
            this.h = null;
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.removeCallbacksAndMessages(null);
            this.e = null;
        }
        bl blVar = this.m;
        if (blVar != null) {
            blVar.b();
            this.m = null;
        }
        bg bgVar = this.f;
        if (bgVar != null) {
            bgVar.g();
        }
        k();
        this.j = true;
        l();
    }

    private static void k() {
        k = null;
        f2250b = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bb i(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        synchronized (this.f2251c) {
            for (bb bbVar : this.f2251c) {
                if (str.equals(bbVar.getCity()) || str.equals(bbVar.getPinyin())) {
                    return bbVar;
                }
            }
            return null;
        }
    }

    private bb j(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        synchronized (this.f2251c) {
            for (bb bbVar : this.f2251c) {
                if (str.equals(bbVar.getCode())) {
                    return bbVar;
                }
            }
            return null;
        }
    }

    public final void e(String str) throws AMapException {
        bb bbVarI = i(str);
        if (str == null || str.length() <= 0 || bbVarI == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        f(bbVarI);
    }

    public final void f(String str) throws AMapException {
        bb bbVarJ = j(str);
        if (bbVarJ != null) {
            f(bbVarJ);
            return;
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }

    private void f(final bb bbVar) throws AMapException {
        j();
        if (bbVar == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        if (this.q == null) {
            this.q = ea.a("AMapOfflineDownload");
        }
        try {
            this.q.a(new mb() { // from class: com.amap.api.col.3sl.bc.3
                @Override // com.amap.api.col.p0003sl.mb
                public final void runTask() {
                    try {
                        if (bc.this.j) {
                            bc.this.j();
                            bd bdVarC = new be(bc.this.i, bc.d).c();
                            if (bdVarC != null) {
                                bc.f(bc.this);
                                if (bdVarC.a()) {
                                    bc.this.c();
                                }
                            }
                        }
                        bbVar.setVersion(bc.d);
                        bbVar.f();
                    } catch (AMapException e) {
                        e.printStackTrace();
                    } catch (Throwable th) {
                        jv.c(th, "OfflineDownloadManager", "startDownloadRunnable");
                    }
                }
            });
        } catch (Throwable th) {
            jv.c(th, "startDownload", "downloadExcecRunnable");
        }
    }

    public final void d(bb bbVar) {
        bl blVar = this.m;
        if (blVar != null) {
            blVar.a(bbVar);
        }
    }

    public final void e(bb bbVar) {
        bl blVar = this.m;
        if (blVar != null) {
            blVar.b(bbVar);
        }
    }

    public final void a(a aVar) {
        this.l = aVar;
    }

    private void l() {
        synchronized (this) {
            this.l = null;
        }
    }

    final class b extends Handler {
        public b(Looper looper) {
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
                    if (bc.this.l != null) {
                        bc.this.l.a(bbVar);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final String g(String str) {
        bb bbVarI;
        if (str == null || (bbVarI = i(str)) == null) {
            return "";
        }
        return bbVarI.getAdcode();
    }

    private static void k(String str) {
        f2249a = str;
    }
}
