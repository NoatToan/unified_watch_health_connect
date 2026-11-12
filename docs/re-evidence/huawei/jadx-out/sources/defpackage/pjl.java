package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.download.DownloadPluginCallback;
import com.huawei.haf.download.DownloadPluginUrl;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.pluginmgr.EzPluginConfigBase;
import com.huawei.pluginmgr.filedownload.PullListener;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class pjl {
    private static int d;
    private final pia e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<Integer, e> f45497c = new HashMap<>(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, File> f45496b = new HashMap<>(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f45495a = new b(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int i) {
        if (i == -10) {
            return 1;
        }
        if (i == -5) {
            return 4;
        }
        if (i == -4) {
            return 6;
        }
        if (i == -3) {
            return 2;
        }
        if (i != -1) {
            return (i == 0 || i == 1) ? 0 : 3;
        }
        return 4;
    }

    public pjl(EzPluginConfigBase ezPluginConfigBase) {
        this.e = new pia(ezPluginConfigBase);
    }

    public EzPluginConfigBase b() {
        return this.e.b();
    }

    public File e(String str) {
        File file;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f45496b) {
            file = this.f45496b.get(str);
        }
        if (file == null) {
            return a(str);
        }
        if (file.exists()) {
            return file;
        }
        synchronized (this.f45496b) {
            this.f45496b.remove(str);
        }
        return null;
    }

    /* JADX INFO: loaded from: classes3.dex */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        pis f45508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f45509b;
        e d;
        String e;

        private c() {
            this.d = null;
            this.e = null;
            this.f45508a = null;
            this.f45509b = 0;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f45510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f45511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        DownloadPluginCallback f45512c;
        boolean d;
        DownloadPluginUrl e;
        int f;
        pia g;
        int h;
        int i;
        int j;
        int k;
        int l;
        int m;
        int n;
        List<String> o;

        private e() {
            this.o = null;
            this.i = 0;
            this.j = 0;
            this.d = false;
            this.h = 0;
            this.f45512c = null;
            this.e = null;
            this.g = null;
            this.k = 0;
            this.m = 0;
            this.l = 0;
            this.n = 0;
            this.f45510a = 0;
            this.f45511b = 0;
            this.f = -1;
        }
    }

    public int d(List<String> list, int i, DownloadPluginCallback downloadPluginCallback, DownloadPluginUrl downloadPluginUrl) {
        if (list == null || list.isEmpty()) {
            return -1;
        }
        return c(new ArrayList(list), i, downloadPluginCallback, downloadPluginUrl);
    }

    private int c(List<String> list, int i, DownloadPluginCallback downloadPluginCallback, DownloadPluginUrl downloadPluginUrl) {
        e eVar = new e();
        eVar.o = list;
        eVar.k = eVar.o.size();
        eVar.j = 1;
        eVar.d = i <= 0;
        if (i <= 0) {
            i = 10000;
        }
        eVar.h = i;
        eVar.f45512c = downloadPluginCallback;
        eVar.e = downloadPluginUrl;
        int iC = c(eVar);
        b(this.f45495a, eVar, this.e);
        return iC;
    }

    public void c(int i) {
        e eVarJ = j(i);
        if (eVarJ == null) {
            return;
        }
        Handler handler = this.f45495a;
        handler.sendMessage(Message.obtain(handler, 1102, eVarJ));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final Handler handler, final e eVar, final pia piaVar) {
        boolean z = true;
        boolean z2 = piaVar == eVar.g;
        if (eVar.e != null) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                ThreadPoolManager.c().b(handler.toString(), new Runnable() { // from class: pjl.3
                    @Override // java.lang.Runnable
                    public void run() {
                        pjl.b(handler, eVar, piaVar);
                    }
                });
                return;
            }
            String downloadPluginUrl = eVar.e.getDownloadPluginUrl(null, true);
            String strE = eVar.g.e(downloadPluginUrl, c(eVar.g.b(), downloadPluginUrl, eVar));
            String strA = eVar.g.a();
            if (z2 || TextUtils.isEmpty(strA) || !strA.equals(piaVar.a())) {
                z = z2;
            } else {
                eVar.g = piaVar;
            }
            LogUtil.b("Login_DownloadPluginHelper", "updatePluginDownloadUrl success. queryStr=(", strE, "), default=", Boolean.valueOf(z2), ", reuse=", Boolean.valueOf(z));
        }
        handler.sendMessageDelayed(Message.obtain(handler, 1000, eVar), (z2 || piaVar.d()) ? 0L : 500L);
    }

    private static String c(EzPluginConfigBase ezPluginConfigBase, String str, e eVar) {
        if (TextUtils.isEmpty(str) || !str.contains("/commonAbility/configCenter/")) {
            return ezPluginConfigBase.getPluginQueryString(eVar.o.isEmpty() ? null : eVar.o.get(0));
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(pia piaVar) {
        boolean zG = true;
        if (piaVar.d()) {
            return true;
        }
        synchronized (piaVar) {
            if (!piaVar.d()) {
                zG = piaVar.g();
                piaVar.d(zG);
            }
        }
        LogUtil.b("Login_DownloadPluginHelper", "updateIndex file, updateIndexCache result=", Boolean.valueOf(zG));
        return zG;
    }

    private static phz c(pia piaVar, String str) {
        b(piaVar);
        return piaVar.a(str);
    }

    private static List<String> d(pia piaVar) {
        if (!b(piaVar)) {
            return Collections.EMPTY_LIST;
        }
        List<phz> listE = piaVar.e();
        if (listE == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(listE.size());
        Iterator<phz> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    private boolean a(e eVar, boolean z, int i) {
        eVar.o = d(eVar.g);
        eVar.k = eVar.o.size();
        if (!eVar.o.isEmpty()) {
            return true;
        }
        if (z) {
            i = 4;
        }
        b(eVar, i);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final Handler handler, final e eVar) {
        if (eVar.g.d()) {
            handler.sendMessage(Message.obtain(handler, 1001, eVar));
            return;
        }
        eVar.g.e(null);
        handler.sendMessageDelayed(Message.obtain(handler, 1101, eVar), eVar.h);
        eVar.g.a(new PullListener() { // from class: pjl.1
            /* JADX WARN: Code duplicated, block: B:11:0x0058  */
            /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                int iD;
                int iF = pitVar.f();
                if (iF != 0) {
                    if (iF != 1) {
                        iD = pjl.d(pitVar.f());
                    } else {
                        pjl.b(eVar.g);
                        eVar.g.e(pitVar.b());
                        Handler handler2 = handler;
                        handler2.sendMessage(Message.obtain(handler2, 1001, eVar));
                    }
                    if (iD != 0) {
                        ReleaseLogUtil.c("Login_DownloadPluginHelper", "updateIndex file fail(", pjl.a(pitVar.f()), "), reason=", Integer.valueOf(iD));
                        Handler handler3 = handler;
                        handler3.sendMessage(Message.obtain(handler3, 1002, iD, 0, eVar));
                    }
                }
                c cVar = new c();
                cVar.d = eVar;
                cVar.f45508a = pisVar;
                eVar.g.e(pitVar.b());
                Handler handler4 = handler;
                handler4.sendMessage(Message.obtain(handler4, 1003, cVar));
                iD = 0;
                if (iD != 0) {
                    ReleaseLogUtil.c("Login_DownloadPluginHelper", "updateIndex file fail(", pjl.a(pitVar.f()), "), reason=", Integer.valueOf(iD));
                    Handler handler5 = handler;
                    handler5.sendMessage(Message.obtain(handler5, 1002, iD, 0, eVar));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Handler handler, e eVar, boolean z, int i) {
        handler.removeMessages(1101);
        if (!eVar.o.isEmpty() || a(eVar, z, i)) {
            if (!z) {
                e(eVar, i);
                return;
            }
            for (String str : (String[]) eVar.o.toArray(new String[eVar.o.size()])) {
                c cVar = new c();
                cVar.d = eVar;
                cVar.e = str;
                phz phzVarC = c(eVar.g, cVar.e);
                if (phzVarC == null) {
                    LogUtil.b("Login_DownloadPluginHelper", "updateDescrption file fail(index not exist the plugin), mUuid=", cVar.e);
                    d(cVar, 4);
                } else {
                    pis pisVarB = pig.c().b(cVar.e);
                    if (pisVarB != null) {
                        LogUtil.b("Login_DownloadPluginHelper", "updateDescrption file(cancel existing tasks), mUuid=", cVar.e);
                        pig.c().c(pisVarB);
                    }
                    if (eVar.g.b(cVar.e)) {
                        LogUtil.b("Login_DownloadPluginHelper", "updateDescrption file success(plugin is avaiable), mUuid=", cVar.e);
                        d(cVar, 0);
                    } else {
                        if (!a(eVar)) {
                            c(handler, eVar);
                        }
                        if (!eVar.g.b().needDescriptionFile()) {
                            cVar.f45509b = phzVarC.b();
                            handler.sendMessageDelayed(Message.obtain(handler, 1004, cVar), pisVarB == null ? 0L : 500L);
                        } else {
                            c(handler, cVar);
                        }
                    }
                }
            }
            if (a(eVar) && eVar.o.isEmpty()) {
                a(handler, eVar, 0);
            }
        }
    }

    private void c(final Handler handler, final c cVar) {
        cVar.d.g.d(cVar.e, new PullListener() { // from class: pjl.2
            /* JADX WARN: Code duplicated, block: B:11:0x006b  */
            /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                int iD;
                int iF = pitVar.f();
                if (iF != 0) {
                    if (iF != 1) {
                        iD = pjl.d(pitVar.f());
                    } else {
                        LogUtil.b("Login_DownloadPluginHelper", "updateDescrption file success, mUuid=", cVar.e);
                        cVar.f45508a = null;
                        cVar.f45509b = pitVar.g();
                        cVar.d.g.e(pitVar.b());
                        Handler handler2 = handler;
                        handler2.sendMessage(Message.obtain(handler2, 1004, cVar));
                    }
                    if (iD != 0) {
                        ReleaseLogUtil.c("Login_DownloadPluginHelper", "updateDescrption file fail(", pjl.a(pitVar.f()), "), mUuid=", cVar.e, ", reason=", Integer.valueOf(iD));
                        cVar.f45508a = null;
                        Handler handler3 = handler;
                        handler3.sendMessage(Message.obtain(handler3, 1005, iD, 0, cVar));
                    }
                }
                cVar.f45508a = pisVar;
                cVar.d.g.e(pitVar.b());
                Handler handler4 = handler;
                handler4.sendMessage(Message.obtain(handler4, 1006, cVar));
                iD = 0;
                if (iD != 0) {
                    ReleaseLogUtil.c("Login_DownloadPluginHelper", "updateDescrption file fail(", pjl.a(pitVar.f()), "), mUuid=", cVar.e, ", reason=", Integer.valueOf(iD));
                    cVar.f45508a = null;
                    Handler handler5 = handler;
                    handler5.sendMessage(Message.obtain(handler5, 1005, iD, 0, cVar));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Handler handler, c cVar, boolean z, int i) {
        if (cVar.d.o.isEmpty()) {
            return;
        }
        if (!z) {
            d(cVar, i);
        } else {
            cVar.d.f45510a++;
            cVar.d.n += cVar.f45509b;
        }
        if (cVar.d.f45510a == cVar.d.o.size()) {
            LogUtil.b("Login_DownloadPluginHelper", "collectDescrptions success, mTotalSize=", Integer.valueOf(cVar.d.n));
            if (cVar.d.o.isEmpty()) {
                a(handler, cVar.d, 0);
                return;
            }
            cVar.e = cVar.d.o.get(0);
            cVar.f45509b = 0;
            e(handler, cVar);
        }
    }

    private void e(final Handler handler, final c cVar) {
        if (cVar.d.j == 2) {
            a(handler, cVar.d, 1);
            return;
        }
        handler.removeMessages(1101);
        handler.sendMessageDelayed(Message.obtain(handler, 1101, cVar.d), cVar.d.h);
        cVar.d.g.e(cVar.e, new PullListener() { // from class: pjl.5
            /* JADX WARN: Code duplicated, block: B:11:0x0073  */
            /* JADX WARN: Code duplicated, block: B:13:? A[RETURN, SYNTHETIC] */
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                int iD;
                int iF = pitVar.f();
                if (iF != 0) {
                    if (iF != 1) {
                        iD = pjl.d(pitVar.f());
                    } else {
                        LogUtil.b("Login_DownloadPluginHelper", "updatePlugin file success, mUuid=", cVar.e);
                        cVar.f45508a = null;
                        cVar.f45509b = pitVar.g();
                        cVar.d.g.e(pitVar.b());
                        Handler handler2 = handler;
                        handler2.sendMessage(Message.obtain(handler2, 1007, cVar));
                    }
                    if (iD != 0) {
                        ReleaseLogUtil.c("Login_DownloadPluginHelper", "updatePlugin file fail(", pjl.a(pitVar.f()), "), mUuid=", cVar.e, ", reason=", Integer.valueOf(iD));
                        cVar.f45508a = null;
                        Handler handler3 = handler;
                        handler3.sendMessage(Message.obtain(handler3, 1008, iD, 0, cVar));
                    }
                }
                cVar.f45508a = pisVar;
                cVar.f45509b = pitVar.d();
                cVar.d.g.e(pitVar.b());
                Handler handler4 = handler;
                handler4.sendMessage(Message.obtain(handler4, 1009, cVar));
                iD = 0;
                if (iD != 0) {
                    ReleaseLogUtil.c("Login_DownloadPluginHelper", "updatePlugin file fail(", pjl.a(pitVar.f()), "), mUuid=", cVar.e, ", reason=", Integer.valueOf(iD));
                    cVar.f45508a = null;
                    Handler handler5 = handler;
                    handler5.sendMessage(Message.obtain(handler5, 1008, iD, 0, cVar));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Handler handler, c cVar, boolean z, int i) {
        boolean zD = d(cVar, i);
        if (!z && !zD) {
            a(handler, cVar.d, i);
            return;
        }
        cVar.d.f45511b += cVar.f45509b;
        if (cVar.d.o.isEmpty()) {
            a(handler, cVar.d, 0);
            return;
        }
        cVar.e = cVar.d.o.get(0);
        cVar.f45509b = 0;
        e(handler, cVar);
    }

    private boolean a(e eVar) {
        return eVar.f != -1;
    }

    private void c(Handler handler, e eVar) {
        handler.sendMessageDelayed(Message.obtain(handler, 1101, eVar), eVar.h);
        eVar.f = 0;
        if (eVar.f45512c != null) {
            eVar.f45512c.startDownloadProgress(eVar.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(c cVar) {
        if (cVar.d.n <= 0) {
            LogUtil.d("Login_DownloadPluginHelper", "mTotalSize error, mTotalSize=", Integer.valueOf(cVar.d.n));
            return;
        }
        int i = cVar.f45509b + cVar.d.f45511b;
        int i2 = (int) ((((long) i) * 100) / ((long) cVar.d.n));
        if (cVar.d.f >= i2) {
            return;
        }
        cVar.d.f = i2;
        if (cVar.d.f45512c != null) {
            cVar.d.f45512c.showDownloadProgress(cVar.d.i, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Handler handler, e eVar, int i) {
        handler.removeMessages(1101);
        if (i == 2 && eVar.d) {
            eVar.l += eVar.h;
            LogUtil.b("Login_DownloadPluginHelper", "mTaskNo=", Integer.valueOf(eVar.i), ", mLastProgress=", Integer.valueOf(eVar.f), ", mTimeout=", Integer.valueOf(eVar.h), ", mTotalCheckTimeout=", Integer.valueOf(eVar.l));
            if (eVar.l < 120000) {
                handler.sendMessageDelayed(Message.obtain(handler, 1101, eVar), eVar.h);
                return;
            }
        }
        e(eVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(e eVar) {
        if (eVar.j == 1) {
            eVar.j = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(c cVar) {
        pis pisVar;
        if (cVar.d.j != 2 || (pisVar = cVar.f45508a) == null) {
            return;
        }
        pig.c().c(pisVar);
    }

    private void e(e eVar, int i) {
        if (eVar.o.isEmpty()) {
            b(eVar, i);
            return;
        }
        c cVar = new c();
        for (String str : (String[]) eVar.o.toArray(new String[eVar.o.size()])) {
            cVar.d = eVar;
            cVar.e = str;
            d(cVar, i);
        }
    }

    private boolean d(c cVar, int i) {
        boolean zOnDownloadPluginResult = false;
        int i2 = (i != 0 || a(cVar.e) == null) ? -1 : 0;
        e eVar = cVar.d;
        if (eVar.o.remove(cVar.e)) {
            if (i2 == 0) {
                eVar.m++;
            }
            zOnDownloadPluginResult = eVar.f45512c != null ? eVar.f45512c.onDownloadPluginResult(eVar.i, cVar.e, i2) : false;
            b(eVar, i);
        }
        return zOnDownloadPluginResult;
    }

    private void b(e eVar, int i) {
        if (eVar.o.isEmpty()) {
            j(eVar.i);
            eVar.j = 0;
            if (eVar.f45512c == null) {
                return;
            }
            if (eVar.k > 0 && eVar.k == eVar.m) {
                i = 0;
            } else if (i == 0 && eVar.m > 0) {
                i = 5;
            }
            eVar.f45512c.onDownloadResult(eVar.i, i);
            eVar.f45512c = null;
        }
    }

    private File a(String str) {
        String strB = this.e.b(str, true);
        if (strB == null) {
            return null;
        }
        File file = new File(strB);
        if (file.exists()) {
            synchronized (this.f45496b) {
                this.f45496b.put(str, file);
            }
            LogUtil.b("Login_DownloadPluginHelper", file.getName(), " is exists.");
            return file;
        }
        LogUtil.b("Login_DownloadPluginHelper", file.getName(), " is not exists.");
        return null;
    }

    /* JADX INFO: loaded from: classes3.dex */
    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.obj instanceof c) {
                c((c) message.obj, message.what, message.arg1);
            } else if (message.obj instanceof e) {
                e((e) message.obj, message.what, message.arg1);
            }
        }

        private void c(c cVar, int i, int i2) {
            switch (i) {
                case 1003:
                    pjl.b(cVar);
                    break;
                case 1004:
                    pjl.this.d((Handler) this, cVar, true, 0);
                    break;
                case 1005:
                    pjl.this.d((Handler) this, cVar, false, i2);
                    break;
                case 1006:
                    pjl.b(cVar);
                    break;
                case 1007:
                    pjl.this.c((Handler) this, cVar, true, 0);
                    break;
                case 1008:
                    pjl.this.c((Handler) this, cVar, false, i2);
                    break;
                case 1009:
                    pjl.this.d(cVar);
                    pjl.b(cVar);
                    break;
                default:
                    LogUtil.e("Login_DownloadPluginHelper", "handleTaskInfoMessage, what=", Integer.valueOf(i), "reason=", Integer.valueOf(i2));
                    break;
            }
        }

        private void e(e eVar, int i, int i2) {
            if (i == 1101) {
                pjl.this.a(this, eVar, 2);
                return;
            }
            if (i != 1102) {
                switch (i) {
                    case 1000:
                        pjl.this.e(this, eVar);
                        break;
                    case 1001:
                        pjl.this.b(this, eVar, true, 0);
                        break;
                    case 1002:
                        pjl.this.b(this, eVar, false, i2);
                        break;
                    default:
                        LogUtil.e("Login_DownloadPluginHelper", "handleTaskInfosMessages, what=", Integer.valueOf(i), "reason=", Integer.valueOf(i2));
                        break;
                }
                return;
            }
            pjl.b(eVar);
        }
    }

    private int c(e eVar) {
        boolean zIsEmpty;
        eVar.i = d();
        synchronized (this.f45497c) {
            zIsEmpty = this.f45497c.isEmpty();
            this.f45497c.put(Integer.valueOf(eVar.i), eVar);
        }
        if (zIsEmpty) {
            eVar.g = this.e;
            if (eVar.g.b().needDescriptionFile()) {
                eVar.g.h();
            }
        } else {
            eVar.g = new pia(b());
        }
        return eVar.i;
    }

    private e j(int i) {
        e eVarRemove;
        synchronized (this.f45497c) {
            eVarRemove = this.f45497c.remove(Integer.valueOf(i));
        }
        return eVarRemove;
    }

    private static int d() {
        int i;
        synchronized (pjl.class) {
            i = d + 1;
            d = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(int i) {
        switch (i) {
            case -11:
                return "PULL_NOT_MODIFIED";
            case -10:
                return "PULL_CANCEL";
            case -9:
                return "PULL_STORAGE_NOT_ENOUGH";
            case -8:
                return "PULL_TASK_IS_PENDING";
            case -7:
                return "PULL_NO_SUCH_TASK";
            case -6:
                return "PULL_DECOMPRESS_FAIL";
            case -5:
                return "PULL_NO_SUCH_FILE";
            case -4:
                return "PULL_NETWORK_ERROR";
            case -3:
                return "PULL_TIMEOUT";
            case -2:
                return "PULL_VERIFICATION_FAILED";
            case -1:
                return "PULL_UNEXPECTED_INTERRUPTION";
            default:
                return "status:" + i;
        }
    }
}
