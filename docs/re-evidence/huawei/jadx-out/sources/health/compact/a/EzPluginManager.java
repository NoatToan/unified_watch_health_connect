package health.compact.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.haf.download.DownloadPluginUrl;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.pluginmgr.DownloadGreyDomainApi;
import com.huawei.pluginmgr.filedownload.PullListener;
import defpackage.njy;
import defpackage.phr;
import defpackage.phs;
import defpackage.phw;
import defpackage.phy;
import defpackage.phz;
import defpackage.pic;
import defpackage.pig;
import defpackage.pik;
import defpackage.pim;
import defpackage.pio;
import defpackage.pip;
import defpackage.piq;
import defpackage.pis;
import defpackage.pit;
import defpackage.piu;
import defpackage.pjc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class EzPluginManager extends HwBaseManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile EzPluginManager f36550c;
    private pio d;
    private pio f;
    private pio g;
    private pio h;
    private pio i;
    private pio j;
    private pio k;
    private CopyOnWriteArrayList<pic> l;
    private pio m;
    private Context n;
    private DownloadPluginUrl o;
    private pio p;
    private pio q;
    private pio r;
    private pio s;
    private pio t;
    private pio u;
    private pio v;
    private pio x;
    private pio y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String[] f36548a = {"sr-Latn", "jv-Latn"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<String, String> f36549b = new HashMap<String, String>() { // from class: health.compact.a.EzPluginManager.1
        private static final long serialVersionUID = 1212859686823339267L;

        {
            put("sr-Latn", "b+sr+Latn");
            put("jv-Latn", "b+jv+Latn");
        }
    };
    private static List<pic> e = new ArrayList(16);

    private EzPluginManager(Context context) {
        super(context);
        this.r = new pio();
        this.d = new pio();
        this.j = new pio();
        this.f = new pio();
        this.i = new pio();
        this.g = new pio();
        this.m = new pio();
        this.y = new pio();
        this.s = new pio();
        this.x = new pio();
        this.k = new pio();
        this.q = new pio();
        this.h = new pio();
        this.u = new pio();
        this.v = new pio();
        this.t = new pio();
        this.p = new pio();
        this.l = new CopyOnWriteArrayList<>();
        this.n = BaseApplication.getContext();
        d(piu.c().d());
    }

    public static EzPluginManager b() {
        if (f36550c == null) {
            synchronized (pik.f45440c) {
                if (f36550c == null) {
                    f36550c = new EzPluginManager(BaseApplication.getContext());
                }
            }
        }
        return f36550c;
    }

    public void d(DownloadPluginUrl downloadPluginUrl) {
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "enter setDownloadPluginUrl ");
        this.o = downloadPluginUrl;
    }

    public phz e(String str) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "getPluginIndexInfo uuid is empty");
            return null;
        }
        List<phz> listJ = j();
        if (!njy.e(listJ)) {
            com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "getPluginIndexInfo ezPluginInfos size is :", Integer.valueOf(listJ.size()));
            for (phz phzVar : listJ) {
                if (str.equals(phzVar.a())) {
                    return phzVar;
                }
            }
        }
        return null;
    }

    public pic a(String str) {
        pic picVarE = pik.e(this.r, e, str);
        if (picVarE != null) {
            com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "getPluginInfo get cachePluginInfo");
            return picVarE;
        }
        boolean zI = i(str);
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "enter to getPluginInfo isDeprecated is :", Boolean.valueOf(zI));
        pic picVarC = !zI ? pik.c(this.n, str) : null;
        d(picVarC, str);
        return picVarC;
    }

    public void d(pic picVar, String str) {
        pik.a(e, picVar, str);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 20010;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    private pio l(String str) {
        pio pioVarP = p(str);
        if (pioVarP != null && !TextUtils.isEmpty(pioVarP.d())) {
            return pioVarP;
        }
        str.hashCode();
        switch (str) {
            case "HDK_ROPE_SKIPPING":
                pioVarP = this.s;
                break;
            case "HDK_ROWING_MACHINE":
                pioVarP = this.q;
                break;
            case "HDK_SMART_WATCH":
                pioVarP = this.v;
                break;
            case "HDK_ELLIPTICAL_MACHINE":
                pioVarP = this.h;
                break;
            case "HDK_TREADMILL":
                pioVarP = this.x;
                break;
            case "HDK_SMART_PILLOW":
                pioVarP = this.t;
                break;
            case "HDK_EXERCISE_BIKE":
                pioVarP = this.k;
                break;
            case "HDK_WALKING_MACHINE":
                pioVarP = this.u;
                break;
            case "HDK_MASSAGE_GUN":
                pioVarP = this.p;
                break;
        }
        if (pioVarP == null || TextUtils.isEmpty(pioVarP.d())) {
            return null;
        }
        return pioVarP;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    private pio p(String str) {
        str.hashCode();
        switch (str) {
            case "HDK_BODY_TEMPERATURE":
                return this.y;
            case "HDK_WEIGHT":
                return this.g;
            case "HDK_HEART_RATE":
                return this.m;
            case "HDK_BLOOD_OXYGEN":
                return this.d;
            case "HDK_BLOOD_PRESSURE":
                return this.f;
            case "HDK_ECG":
                return this.j;
            case "HDK_BLOOD_SUGAR":
                return this.i;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    private void e(String str, pio pioVar) {
        if (c(str, pioVar)) {
            return;
        }
        str.hashCode();
        switch (str) {
            case "HDK_ROWING_MACHINE":
                this.q = pioVar;
                break;
            case "HDK_SMART_WATCH":
                this.v = pioVar;
                break;
            case "HDK_ELLIPTICAL_MACHINE":
                this.h = pioVar;
                break;
            case "HDK_TREADMILL":
                this.x = pioVar;
                break;
            case "HDK_SMART_PILLOW":
                this.t = pioVar;
                break;
            case "HDK_EXERCISE_BIKE":
                this.k = pioVar;
                break;
            case "HDK_WALKING_MACHINE":
                this.u = pioVar;
                break;
            case "HDK_MASSAGE_GUN":
                this.p = pioVar;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    private boolean c(String str, pio pioVar) {
        str.hashCode();
        switch (str) {
            case "HDK_BODY_TEMPERATURE":
                this.y = pioVar;
                return true;
            case "HDK_ROPE_SKIPPING":
                this.s = pioVar;
                return true;
            case "HDK_WEIGHT":
                this.g = pioVar;
                return true;
            case "HDK_HEART_RATE":
                this.m = pioVar;
                return true;
            case "HDK_BLOOD_OXYGEN":
                this.d = pioVar;
                return true;
            case "HDK_BLOOD_PRESSURE":
                this.f = pioVar;
                return true;
            case "HDK_ECG":
                this.j = pioVar;
                return true;
            case "HDK_BLOOD_SUGAR":
                this.i = pioVar;
                return true;
            default:
                return false;
        }
    }

    public List<phz> d() {
        synchronized (this) {
            com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "getIndexList enter to GetPluginsIndexInfos");
            ArrayList arrayList = new ArrayList();
            List<pjc> listD = piq.e().d();
            ArrayList<pjc> arrayList2 = new ArrayList();
            arrayList2.addAll(listD);
            for (pjc pjcVar : arrayList2) {
                if (pjcVar == null) {
                    com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "getIndexList devicePluginInfoBeans is null ");
                } else {
                    List<phz> listH = pjcVar.h();
                    if (njy.b(listH)) {
                        arrayList.addAll(listH);
                    }
                }
            }
            if (this.r.c() != null) {
                com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "mIndexFileStruct.getPlugins start");
                arrayList.addAll(this.r.c());
                return arrayList;
            }
            String strE = pik.e();
            boolean zExists = new File(strE).exists();
            com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "getIndexList isExistThisIndex is =", Boolean.valueOf(zExists));
            if (zExists) {
                String strB = pik.b(this.n, strE);
                com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "getIndex indexJson = ", strB);
                r(strB);
                if (this.r.c() != null) {
                    com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "mIndexFileStruct.getPlugins");
                    arrayList.addAll(this.r.c());
                    return arrayList;
                }
            }
            return null;
        }
    }

    public List<phz> c(String str) {
        pio pioVarL = l(str);
        List<phz> listC = pioVarL != null ? pioVarL.c() : null;
        if (listC == null) {
            String strA = pik.a(str);
            if (new File(strA).exists()) {
                String strB = pik.b(this.n, strA);
                com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "index Data:", strB, TextUtils.isEmpty(strB) ? ",indexJson is null" : "");
                if (TextUtils.isEmpty(strB)) {
                    return null;
                }
                pio pioVarC = phw.c(strB);
                e(str, pioVarC);
                return pioVarC.c();
            }
        }
        return listC;
    }

    private List<phz> j() {
        com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "getAllIndexList");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = pip.f45449c.keySet().iterator();
        while (it.hasNext()) {
            List<phz> listC = c(it.next());
            if (listC != null) {
                arrayList.addAll(listC);
            }
        }
        List<phz> listD = d();
        if (listD != null) {
            arrayList.addAll(listD);
        }
        return arrayList;
    }

    public List<phz> c() {
        com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "getThirdPartIndexList");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = pip.f45449c.keySet().iterator();
        while (it.hasNext()) {
            List<phz> listC = c(it.next());
            if (listC != null) {
                arrayList.addAll(listC);
            }
        }
        return arrayList;
    }

    private void r(String str) {
        String strD;
        if (TextUtils.isEmpty(str)) {
            com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "parseVersionIndexFile indexJson is null");
            return;
        }
        try {
            pio pioVar = this.r;
            if (pioVar == null) {
                strD = "";
            } else {
                strD = pioVar.d();
            }
            if (TextUtils.isEmpty(strD)) {
                this.r = phw.c(str);
                pik.e(e);
            } else {
                if (strD.equals(new JSONObject(str).optString("version"))) {
                    return;
                }
                this.r = phw.c(str);
                pik.e(e);
            }
        } catch (JSONException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", "parseVersionIndexFile JSONException");
        }
    }

    @Deprecated
    public pic c(int i) {
        pic picVarA;
        List<phz> listD = d();
        if (listD == null || listD.size() == 0) {
            return null;
        }
        com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "getPluginInfoByType indexInfos.size > 0");
        for (phz phzVar : listD) {
            if (phzVar.a() != null && (phzVar.k().equals("SMART_WATCH") || phzVar.k().equals("SMART_BAND"))) {
                if (b().j(phzVar.a()) && (picVarA = b().a(phzVar.a())) != null && picVarA.h() != null && picVarA.h().d() == i) {
                    return picVarA;
                }
            }
        }
        return null;
    }

    public boolean j(String str) {
        return pik.d(str, i(str));
    }

    public boolean i(String str) {
        return pik.c(str, e(str));
    }

    public void a(String str, PullListener pullListener) {
        a(str, (CommonUtil.af(this.n) || h()) ? "com.huawei.health_HwWear_deviceConfig" : "com.huawei.health_HwWear_deviceConfigBeta", "", pullListener);
    }

    public void a(final String str, final String str2, final String str3, final PullListener pullListener) {
        PullListener pullListener2 = new PullListener() { // from class: pij
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public final void onPullingChange(pis pisVar, pit pitVar) {
                this.f45437b.d(str2, str, str3, pullListener, pisVar, pitVar);
            }
        };
        String strK = k(str2);
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "updateDescription file id ", strK);
        c(strK, str2, n(str2), pullListener2);
    }

    public /* synthetic */ void d(String str, String str2, String str3, PullListener pullListener, pis pisVar, pit pitVar) {
        int iF = pitVar.f();
        if (iF != 1 && iF != -11) {
            if (iF == 0) {
                com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "updateDescription Downloading index file");
                return;
            } else {
                if (pullListener != null) {
                    pullListener.onPullingChange(pisVar, pitVar);
                    return;
                }
                return;
            }
        }
        String strN = n(str);
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "updateDescription savePathIndex is =", strN);
        String strB = pik.b(this.n, strN);
        com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "updateDescription indexJson = ", strB);
        r(strB);
        SharedPreferenceManager.e(this.n, String.valueOf(getModuleId()), "updateTime", String.valueOf(new Date().getTime()), null);
        phz phzVarE = e(str2);
        String strD = str + str3;
        if (TextUtils.equals(str3, "?deviceType=bodyFatScales")) {
            com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "matchRules is equals MATCH_RULES");
            strD = phr.d(this.n, "HDK_WEIGHT");
        }
        c(phzVarE, strD, pullListener, pisVar, pitVar);
    }

    private String n(String str) {
        String strT = t(str);
        return !TextUtils.isEmpty(strT) ? pik.a(strT) : pik.e();
    }

    public void b(final String str, final PullListener pullListener) {
        pic picVarA = a(str);
        if (picVarA != null) {
            c(str, this.o, pullListener, picVarA);
        } else {
            a(str, new PullListener() { // from class: pih
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public final void onPullingChange(pis pisVar, pit pitVar) {
                    this.d.b(str, pullListener, pisVar, pitVar);
                }
            });
        }
    }

    public /* synthetic */ void b(String str, PullListener pullListener, pis pisVar, pit pitVar) {
        int iF = pitVar.f();
        if (iF == 1) {
            if (a(str) != null) {
                b(str, pullListener);
                return;
            } else {
                com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "inform error");
                return;
            }
        }
        if (iF == 0 || pullListener == null) {
            return;
        }
        pullListener.onPullingChange(pisVar, pitVar);
    }

    private String o(String str) {
        String str2 = str + "com.huawei.health_HwWear_deviceConfigBeta";
        if (!CommonUtil.af(this.n) && !h()) {
            return str2;
        }
        return str + "com.huawei.health_HwWear_deviceConfig";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void c(final String str, final DownloadPluginUrl downloadPluginUrl, final PullListener pullListener, final pic picVar) {
        String downloadPluginUrl2;
        if (downloadPluginUrl == null) {
            downloadPluginUrl2 = "";
        } else {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: pii
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.c(str, downloadPluginUrl, pullListener, picVar);
                    }
                });
                return;
            }
            downloadPluginUrl2 = downloadPluginUrl.getDownloadPluginUrl(null, true);
        }
        String strO = o(downloadPluginUrl2);
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "startUpdatePlugin pluginUrl is = ", strO);
        pig.c().e(str, strO, piu.a(), picVar, pullListener);
    }

    public void d(String str, String str2, PullListener pullListener) {
        d(str, str2, "", pullListener);
    }

    public void d(final String str, final String str2, String str3, final PullListener pullListener) {
        String downloadPluginUrl;
        pic picVarA = a(str);
        if (picVarA != null && !TextUtils.isEmpty(str) && str.equals(picVarA.b())) {
            String strD = str2 + str3;
            if (TextUtils.equals(str3, "?deviceType=bodyFatScales")) {
                com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "matchRules is equals MATCH_RULES");
                strD = phr.d(this.n, "HDK_WEIGHT");
            }
            DownloadPluginUrl downloadPluginUrl2 = this.o;
            if (downloadPluginUrl2 != null) {
                downloadPluginUrl = downloadPluginUrl2.getDownloadPluginUrl(null, true);
            } else {
                com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "updateThirdPartyPlugin : mDownloadPluginUrl = null");
                downloadPluginUrl = "";
            }
            String str4 = downloadPluginUrl + strD;
            com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "updateThirdPartyPlugin thirdPartyPluginUrl is = ", str4);
            phy phyVar = new phy(str, str4, null, picVarA);
            pig.c().b(str + "_new_v1.1", phyVar, pullListener);
            return;
        }
        a(str, str2, str3, new PullListener() { // from class: pie
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public final void onPullingChange(pis pisVar, pit pitVar) {
                this.e.b(str, str2, pullListener, pisVar, pitVar);
            }
        });
    }

    public /* synthetic */ void b(String str, String str2, PullListener pullListener, pis pisVar, pit pitVar) {
        int iF = pitVar.f();
        if (iF == 1) {
            if (a(str) == null) {
                com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "updateThirdPartyPlugininform error");
                return;
            } else {
                d(str, str2, pullListener);
                return;
            }
        }
        if (iF == 0) {
            com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "updateThirdPartyPlugin description file is updating");
        } else if (pullListener != null) {
            pullListener.onPullingChange(pisVar, pitVar);
        }
    }

    private void c(phz phzVar, String str, String str2, PullListener pullListener) {
        if (phzVar != null) {
            if (!i(str)) {
                c(str, this.o, str2, pullListener);
                return;
            }
            pit pitVar = new pit();
            pis pisVar = new pis();
            pitVar.e(-5);
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "downloadDescriptioninform error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void c(final String str, final DownloadPluginUrl downloadPluginUrl, final String str2, final PullListener pullListener) {
        String downloadPluginUrl2;
        if (downloadPluginUrl == null) {
            downloadPluginUrl2 = "";
        } else {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: pid
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f45421b.c(str, downloadPluginUrl, str2, pullListener);
                    }
                });
                return;
            }
            downloadPluginUrl2 = downloadPluginUrl.getDownloadPluginUrl(null, true);
        }
        String str3 = downloadPluginUrl2 + str2;
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "startUpdateDescription pluginUrl is = ", str3);
        pig.c().d(str, str3, pullListener, q(str3) ? piu.a() : null);
    }

    private boolean q(String str) {
        return str.contains("com.huawei.health_HwWear_deviceConfigBeta") || str.contains("com.huawei.health_HwWear_deviceConfig");
    }

    public void c(PullListener pullListener) {
        c("plugin_index", (CommonUtil.af(this.n) || h()) ? "com.huawei.health_HwWear_deviceConfig" : "com.huawei.health_HwWear_deviceConfigBeta", pik.e(), pullListener);
    }

    public void c(String str, String str2, String str3, PullListener pullListener) {
        String strA = a((String) null, true);
        pis pisVar = new pis();
        pit pitVar = new pit();
        pitVar.e(-1);
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(str2)) {
            com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "updateIndex base url is empty");
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "updateIndex base fileId is empty");
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        b(str, strA + str2, str3, pullListener);
    }

    public void e(String str, String str2, PullListener pullListener) {
        DownloadPluginUrl downloadPluginUrl = this.o;
        if (downloadPluginUrl != null) {
            com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "updateIndex mDownloadPluginUrl=", downloadPluginUrl);
        }
        DownloadPluginUrl downloadPluginUrl2 = this.o;
        if (downloadPluginUrl2 != null && !downloadPluginUrl2.isNetworkConnected()) {
            com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "updateIndex isNetworkConnected = false");
        } else {
            com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "updateIndex download is null");
            e(str, str2, pik.a(str), pullListener);
        }
    }

    private void b(String str, String str2, String str3, PullListener pullListener) {
        phy phyVar = new phy();
        phyVar.d(str2);
        c(str, phyVar, str3, pullListener);
    }

    private void c(final String str, final phy phyVar, final String str2, final PullListener pullListener) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: pif
                @Override // java.lang.Runnable
                public final void run() {
                    pig.c().c(str, phyVar, str2, true, pullListener);
                }
            });
        } else {
            pig.c().c(str, phyVar, str2, true, pullListener);
        }
    }

    public void a() {
        DownloadPluginUrl downloadPluginUrl = this.o;
        if (downloadPluginUrl == null) {
            com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "resetIndexEtag mDownloadPluginUrl = null");
            return;
        }
        String downloadPluginUrl2 = downloadPluginUrl.getDownloadPluginUrl(null, true);
        if (CommonUtil.af(this.n)) {
            Iterator<String> it = pip.e.values().iterator();
            while (it.hasNext()) {
                String str = downloadPluginUrl2 + it.next();
                com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "resetIndexEtag indexDownLoadUrlRelease = ", str);
                piu.c().d(str, "");
            }
        } else {
            Iterator<String> it2 = pip.f45448b.values().iterator();
            while (it2.hasNext()) {
                String str2 = downloadPluginUrl2 + it2.next();
                com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "resetIndexEtag indexDownLoadUrlBeta = ", str2);
                piu.c().d(str2, "");
            }
        }
        String strO = o(downloadPluginUrl2);
        com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "resetIndexEtag hwWearPluginIndexUrl = ", strO);
        piu.c().d(strO, "");
        piu.c().d(strO + "device_index_all", "");
        for (String str3 : pip.f45447a.values()) {
            com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "resetIndexEtag indexFileId = ", str3);
            piu.c().a(str3, "");
        }
        piu.c().a("plugin_index", "");
        piu.c().a("device_index_all", "");
    }

    private void x(String str) {
        String str2;
        if (this.o == null) {
            com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "resetIndexEtagAndFileVer mDownloadPluginUrl is null");
            return;
        }
        health.compact.a.hwlogsmodel.ReleaseLogUtil.d("DEVMGR_EzPlugin_EzPluginManager", "resetIndexEtagAndFileVer deviceType is ", str);
        String downloadPluginUrl = this.o.getDownloadPluginUrl(null, true);
        if (CommonUtil.af(this.n)) {
            str2 = downloadPluginUrl + pip.e.get(str);
        } else {
            str2 = downloadPluginUrl + pip.f45448b.get(str);
        }
        com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "updateAndParseThirdIndex indexDownLoadUrl = ", str2);
        piu.c().d(str2, "");
        String str3 = pip.f45447a.get(str);
        com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "updateAndParseThirdIndex indexFileId = ", str3);
        piu.c().a(str3, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(final String str, final String str2, final String str3, final PullListener pullListener) {
        String downloadPluginUrl;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: pib
                @Override // java.lang.Runnable
                public final void run() {
                    this.f45415b.e(str, str2, str3, pullListener);
                }
            });
            return;
        }
        DownloadPluginUrl downloadPluginUrl2 = this.o;
        if (downloadPluginUrl2 != null) {
            downloadPluginUrl = downloadPluginUrl2.getDownloadPluginUrl(null, true);
        } else {
            com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "startUpdateThirdIndex : mDownloadPluginUrl = null");
            downloadPluginUrl = "";
        }
        phy phyVar = new phy();
        phyVar.d(downloadPluginUrl + str2);
        pig.c().c(pip.f45447a.get(str), phyVar, str3, true, pullListener);
    }

    private void c(phz phzVar, String str, PullListener pullListener, pis pisVar, pit pitVar) {
        String str2 = "";
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "checkAppVersion enter check version", phzVar == null ? ",checkAppVersion:ezPluginIndexInfo is null" : "");
        if (phzVar == null) {
            return;
        }
        String strA = phzVar.a();
        pim pimVarH = phzVar.h();
        if (pimVarH == null) {
            com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "checkAppVersion no have ApplyRules");
            c(phzVar, strA, str, pullListener);
            return;
        }
        if (pimVarH.a() == null) {
            com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "checkAppVersion not have minAppVersion");
            d(phzVar, str, pullListener, pisVar, pitVar);
            return;
        }
        int iN = CommonUtil.n(this.n, pimVarH.a());
        int iE = CommonUtil.e(this.n);
        if (iE < iN) {
            str2 = ",checkAppVersion appVersion less than this plugin minAppVersion";
        }
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "checkAppVersion minAppVersionCode is ", Integer.valueOf(iN), " appCode is ", Integer.valueOf(iE), str2);
        if (iE < iN) {
            pitVar.e(-30);
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        d(phzVar, str, pullListener, pisVar, pitVar);
    }

    private void d(phz phzVar, String str, PullListener pullListener, pis pisVar, pit pitVar) {
        pim pimVarH = phzVar.h();
        String strA = phzVar.a();
        if (this.r != null) {
            if (pik.b(this.n, pimVarH.b(), this.r.d())) {
                c(phzVar, strA, str, pullListener);
                return;
            }
            com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "checkIndexVersion indexVersion less than this plugin minIndexVersion");
            pitVar.e(-20);
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "checkIndexVersion mIndexFileStruct is null");
    }

    public void c(pis pisVar) {
        if (pisVar != null) {
            pig.c().c(pisVar);
        } else {
            com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "canclePluginDownload cancle task failure ,task param is null");
        }
    }

    public void e(String str, PullListener pullListener) {
        String str2;
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "enter checkPluginNewVersionForWear");
        pit pitVar = new pit();
        pis pisVar = new pis();
        phz phzVarE = e(str);
        pic picVarA = a(str);
        if (picVarA == null || phzVarE == null) {
            com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "checkPluginNewVersionForWear ezPluginInfo is null");
            pitVar.e(20);
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        String strG = phzVarE.g();
        String strG2 = picVarA.g();
        String str3 = phzVarE.a() + "_version";
        String strE = SharedPreferenceManager.e(this.n, String.valueOf(1003), str3);
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "checkPluginNewVersionForWear getKey is ", str3, ",spVersion is ", strE, ",indexPluginVersion is:", strG, ",descVersion is:", strG2);
        boolean zA = pik.a(strG2, strG);
        if (TextUtils.isEmpty(strG2) || !pik.e(str)) {
            zA = true;
        }
        boolean zA2 = pik.a(strE, strG);
        if (zA || zA2) {
            str2 = "checkPluginNewVersionForWear have new version";
        } else {
            str2 = "checkPluginNewVersionForWear not have new version";
        }
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", str2);
        boolean zExists = new File(pig.c().e(str) + File.separator + str + File.separator + "img").exists();
        boolean zExists2 = new File(pig.c().e(str) + File.separator + str + File.separator + "lang").exists();
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "imgFile is exist:", Boolean.valueOf(zExists), "langFile is exist:", Boolean.valueOf(zExists2));
        if (zA || zA2 || (!zExists && zExists2)) {
            pitVar.e(20);
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        pitVar.e(1);
        if (pullListener != null) {
            pullListener.onPullingChange(pisVar, pitVar);
        }
    }

    public void d(String str, PullListener pullListener) {
        a(str, (CommonUtil.af(this.n) || h()) ? "com.huawei.health_HwWear_deviceConfig" : "com.huawei.health_HwWear_deviceConfigBeta", pullListener);
    }

    public void a(String str, String str2, PullListener pullListener) {
        c(e(str), str2, pullListener, new pis(), new pit());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Bitmap a(pic picVar, String str) throws Throwable {
        InputStream inputStreamOpenRawResource;
        Bitmap bitmapDecodeFile;
        Bitmap bitmap;
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "loadImageForWear enter loadImageForWear", picVar == null ? ",loadImageForWear ezPluginInfo is null" : "");
        InputStream inputStream = null;
        InputStream inputStream2 = null;
        inputStream = null;
        Bitmap bitmapDecodeStream = null;
        if (picVar == null) {
            return null;
        }
        try {
            try {
                String str2 = pig.c().e(picVar.b()) + File.separator + picVar.b() + File.separator + "img" + File.separator + str + ".png";
                if (new File(str2).exists()) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    options.inInputShareable = true;
                    bitmapDecodeFile = BitmapFactory.decodeFile(str2, options);
                    try {
                        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "enter loadImageForWear have bitmap imageKey:", str, " fetchPluginUuid:", picVar.b());
                        bitmap = bitmapDecodeFile;
                        IoUtils.c(inputStream2);
                        return bitmap;
                    } catch (Resources.NotFoundException unused) {
                    }
                } else {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inPreferredConfig = Bitmap.Config.RGB_565;
                    options2.inPurgeable = true;
                    options2.inInputShareable = true;
                    inputStreamOpenRawResource = BaseApplication.getContext().getResources().openRawResource(m("hw_device_default"));
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource, null, options2);
                        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "enter loadImageForWear have no bitmap :", str, " fetchPluginUuid:", picVar.b());
                        bitmap = bitmapDecodeStream;
                        inputStream2 = inputStreamOpenRawResource;
                        IoUtils.c(inputStream2);
                        return bitmap;
                    } catch (Resources.NotFoundException unused2) {
                        bitmapDecodeFile = bitmapDecodeStream;
                        inputStream = inputStreamOpenRawResource;
                    } catch (Throwable th) {
                        th = th;
                        IoUtils.c(inputStreamOpenRawResource);
                        throw th;
                    }
                }
            } catch (Resources.NotFoundException unused3) {
                bitmapDecodeFile = inputStream;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
        com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", "loadImageForWear loadImage NotFoundException");
        IoUtils.c(inputStream);
        return bitmapDecodeFile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Bitmap h(String str) throws Throwable {
        InputStream inputStreamOpenRawResource;
        Bitmap bitmapDecodeFile;
        Bitmap bitmap;
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "enter loadImageForImagePath", TextUtils.isEmpty(str) ? ",loadImageForImagePath imagePath is null" : "");
        InputStream inputStream = null;
        InputStream inputStream2 = null;
        inputStream = null;
        Bitmap bitmapDecodeStream = null;
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            try {
                if (new File(str).exists()) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    options.inInputShareable = true;
                    bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
                    try {
                        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "enter loadImageForImagePath have bitmap imageKey");
                        bitmap = bitmapDecodeFile;
                        IoUtils.c(inputStream2);
                        return bitmap;
                    } catch (Resources.NotFoundException | OutOfMemoryError unused) {
                    }
                } else {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inPreferredConfig = Bitmap.Config.RGB_565;
                    options2.inPurgeable = true;
                    options2.inInputShareable = true;
                    inputStreamOpenRawResource = BaseApplication.getContext().getResources().openRawResource(m("hw_device_default"));
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource, null, options2);
                        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "enter loadImageForImagePath have no bitmap");
                        bitmap = bitmapDecodeStream;
                        inputStream2 = inputStreamOpenRawResource;
                        IoUtils.c(inputStream2);
                        return bitmap;
                    } catch (Resources.NotFoundException | OutOfMemoryError unused2) {
                        bitmapDecodeFile = bitmapDecodeStream;
                        inputStream = inputStreamOpenRawResource;
                    } catch (Throwable th) {
                        th = th;
                        IoUtils.c(inputStreamOpenRawResource);
                        throw th;
                    }
                }
            } catch (Resources.NotFoundException | OutOfMemoryError unused3) {
                bitmapDecodeFile = inputStream;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
        com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", "loadImageForImagePath loadImage NotFoundException");
        IoUtils.c(inputStream);
        return bitmapDecodeFile;
    }

    private int m(String str) {
        return BaseApplication.getContext().getResources().getIdentifier(str, "drawable", BaseApplication.getContext().getPackageName());
    }

    public void e() {
        String strE = pik.e();
        boolean zExists = new File(strE).exists();
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "updateIndexCacheForWear isExistThisIndex is = ", Boolean.valueOf(zExists));
        if (zExists) {
            String strB = pik.b(this.n, strE);
            com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "updateIndexCacheForWear indexJson = ", strB);
            r(strB);
            com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "updateIndexCacheForWear end");
        }
    }

    public void g(String str) {
        String strA = pik.a(str);
        if (new File(strA).exists()) {
            String strB = pik.b(this.n, strA);
            com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "index Data:", strB);
            if (TextUtils.isEmpty(strB)) {
                com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "indexJson is null");
                x(str);
            } else {
                e(str, phw.c(strB));
            }
        }
    }

    public void b(String str) {
        File file = new File((phs.d + str + File.separator) + "description.json");
        if (file.exists()) {
            com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "isDeleteDescriptionForwear is = ", Boolean.valueOf(file.delete()));
        }
    }

    public static List<String> e(pic picVar, String str) {
        synchronized (EzPluginManager.class) {
            com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", " enter loadStringForWear.");
            File fileB = b(picVar);
            ArrayList arrayList = new ArrayList(10);
            if (fileB == null) {
                com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "loadStringForWear jsonFile == null.");
                return arrayList;
            }
            com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "loadStringForWear jsonFile.name is ", fileB.getName());
            try {
                JSONObject jSONObjectC = c(fileB);
                if (jSONObjectC == null) {
                    return arrayList;
                }
                if (!jSONObjectC.has(str)) {
                    com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "loadStringForWear jsonObject not has key");
                    return arrayList;
                }
                Object obj = jSONObjectC.get(str);
                if (obj instanceof String) {
                    arrayList.add((String) obj);
                    return arrayList;
                }
                if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                    return arrayList;
                }
                return arrayList;
            } catch (JSONException unused) {
                com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", "loadStringForWear JSONException");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    public static JSONObject c(File file) throws Throwable {
        FileInputStream fileInputStream;
        String str;
        try {
            try {
                String strC = CommonUtil.c(file.getCanonicalPath());
                if (TextUtils.isEmpty(strC)) {
                    com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "getJsonObjectFromFile safePath is empty");
                    if (!TextUtils.isEmpty(null)) {
                        com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", null);
                    }
                    IoUtils.c(null);
                    return null;
                }
                fileInputStream = new FileInputStream(strC);
                try {
                    StringBuilder sb = new StringBuilder(16);
                    long length = file.length();
                    if (length > 0) {
                        byte[] bArr = new byte[(int) length];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            sb.append(new String(bArr, 0, i, StandardCharsets.UTF_8));
                        }
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        if (!TextUtils.isEmpty(null)) {
                            com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", null);
                        }
                        IoUtils.c(fileInputStream);
                        return jSONObject;
                    }
                    if (!TextUtils.isEmpty(null)) {
                        com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", null);
                    }
                } catch (FileNotFoundException unused) {
                    if (!TextUtils.isEmpty("getJsonObjectFromFile FileNotFoundException")) {
                        com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", "getJsonObjectFromFile FileNotFoundException");
                    }
                } catch (UnsupportedEncodingException unused2) {
                    if (!TextUtils.isEmpty("getJsonObjectFromFile UnsupportedEncodingException")) {
                        com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", "getJsonObjectFromFile UnsupportedEncodingException");
                    }
                } catch (IOException e2) {
                    e = e2;
                    str = "getJsonObjectFromFile " + e.getClass().getSimpleName();
                    if (!TextUtils.isEmpty(str)) {
                        com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", str);
                    }
                } catch (JSONException e3) {
                    e = e3;
                    str = "getJsonObjectFromFile " + e.getClass().getSimpleName();
                    if (!TextUtils.isEmpty(str)) {
                        com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", str);
                    }
                }
                IoUtils.c(fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                if (!TextUtils.isEmpty(null)) {
                    com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", null);
                }
                IoUtils.c(null);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            fileInputStream = null;
        } catch (UnsupportedEncodingException unused4) {
            fileInputStream = null;
        } catch (IOException e4) {
            e = e4;
            fileInputStream = null;
            str = "getJsonObjectFromFile " + e.getClass().getSimpleName();
            if (!TextUtils.isEmpty(str)) {
                com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", str);
            }
            IoUtils.c(fileInputStream);
            return null;
        } catch (JSONException e5) {
            e = e5;
            fileInputStream = null;
            str = "getJsonObjectFromFile " + e.getClass().getSimpleName();
            if (!TextUtils.isEmpty(str)) {
                com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", str);
            }
            IoUtils.c(fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (!TextUtils.isEmpty(null)) {
                com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", null);
            }
            IoUtils.c(null);
            throw th;
        }
    }

    private static File b(pic picVar) {
        Locale locale = Resources.getSystem().getConfiguration().locale;
        return d(picVar, LanguageUtil.b(BaseApplication.getContext()), locale.getCountry(), locale.toLanguageTag());
    }

    private static File d(pic picVar, String str, String str2, String str3) {
        String str4;
        com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", " enter getTargetJsonFile.");
        if (TextUtils.isEmpty(str)) {
            com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", " getTargetJsonFile TextUtils.isEmpty(language).");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str4 = str + ".json";
        } else {
            str4 = str + "-r" + str2 + ".json";
        }
        String str5 = pig.c().e(picVar.b()) + File.separator + picVar.b() + File.separator + "lang";
        File file = new File(str5);
        if (file.exists() && file.isDirectory()) {
            return c(file.listFiles(), str3, str4, str);
        }
        com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "getTargetJsonFile wrong dir path, not exists or should be dir but is file : ", str5);
        com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "getTargetJsonFile can not find target file, return null.");
        return null;
    }

    private static File c(File[] fileArr, String str, String str2, String str3) {
        String strF;
        if (fileArr == null || fileArr.length == 0) {
            com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "getFileByName wrong dir.no file. can not find target file, return null.");
            return null;
        }
        if (str != null && (strF = f(str)) != null) {
            String str4 = f36549b.get(strF) + ".json";
            com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "getFileByName fileNameTag : ", str4);
            File fileC = c(fileArr, str4);
            if (fileC != null && fileC.length() > 0) {
                com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "getFileByName file is ok");
                return fileC;
            }
            File fileC2 = c(fileArr, "en.json");
            if (fileC2 != null && fileC2.length() > 0) {
                com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "getFileByName en file is ok");
                return fileC2;
            }
        }
        for (File file : fileArr) {
            if (str2.equals(file.getName())) {
                return file;
            }
        }
        com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "getFileByName can not find file : ", str2);
        if (str2.contains("-r")) {
            str2 = d(str3) + ".json";
            for (File file2 : fileArr) {
                if (str2.equals(file2.getName())) {
                    return file2;
                }
            }
        }
        com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "getFileByName can not find file : ", str2);
        for (File file3 : fileArr) {
            if ("en.json".equals(file3.getName())) {
                return file3;
            }
        }
        com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "getFileByName can not find file : ", "en.json");
        com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "getFileByName can not find target file, return null.");
        return null;
    }

    private static File c(File[] fileArr, String str) {
        for (File file : fileArr) {
            if (str.equals(file.getName())) {
                return file;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    public static String d(String str) {
        byte b2;
        Locale locale = Resources.getSystem().getConfiguration().locale;
        String script = locale.getScript();
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 3149) {
            if (iHashCode != 3241) {
                if (iHashCode != 3500) {
                    if (iHashCode == 3886 && str.equals(MLAsrConstants.LAN_ZH)) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("my")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("en")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("bo")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return "bo-rCN";
        }
        if (b2 == 1) {
            return "Qaag".equals(script) ? "en-rGB" : str;
        }
        if (b2 == 2) {
            return "Qaag".equals(script) ? "my-rZG" : "my";
        }
        if (b2 != 3) {
            return str;
        }
        if (locale.toString().endsWith("#Hans")) {
            return "zh-rCN";
        }
        return "zh-rTW";
    }

    private static String f(String str) {
        for (String str2 : f36548a) {
            if (str.startsWith(str2)) {
                com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "changeTag is ", str, "after changeTag is ", str2);
                return str2;
            }
        }
        str2 = null;
        com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "changeTag is ", str, "after changeTag is ", str2);
        return str2;
    }

    public static List<String> b(String str, pic picVar) {
        ArrayList arrayList = new ArrayList(16);
        List<String> listE = e(picVar, str);
        if (listE.size() != 0) {
            for (int i = 0; i < listE.size(); i++) {
                List<String> listE2 = e(picVar, str + "Other" + i);
                String strReplace = listE.get(i);
                if (listE2.size() == 0) {
                    arrayList.add(strReplace);
                } else {
                    List<Object> listE3 = e(listE2);
                    int i2 = 0;
                    while (i2 < listE3.size()) {
                        i2++;
                        strReplace = strReplace.replace("%" + i2 + "$d", "%" + i2 + "$s");
                    }
                    arrayList.add(String.format(Locale.ROOT, strReplace, listE3.toArray()));
                }
            }
        }
        return arrayList;
    }

    private static List<Object> e(List<String> list) {
        ArrayList arrayList = new ArrayList(16);
        for (String strE : list) {
            if (s(strE)) {
                try {
                    String strE2 = UnitUtil.e(Long.parseLong(strE), 1, 0);
                    com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "isNumber formatValue:", strE2);
                    arrayList.add(strE2);
                } catch (NumberFormatException e2) {
                    com.huawei.hwlogsmodel.LogUtil.e("EzPlugin_EzPluginManager", e2.getMessage());
                }
            } else {
                try {
                    String[] strArrSplit = strE.split("\\.");
                    if (strArrSplit.length > 1) {
                        strE = UnitUtil.e(Double.parseDouble(strE), 1, strArrSplit[1].length());
                    }
                } catch (NumberFormatException unused) {
                }
                com.huawei.hwlogsmodel.LogUtil.d("EzPlugin_EzPluginManager", "string formatValue:", strE);
                arrayList.add(strE);
            }
        }
        return arrayList;
    }

    private static boolean s(String str) {
        return Pattern.compile("[0-9]+").matcher(str).matches();
    }

    public String a(String str, boolean z) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch");
        String greyDownloadDomain = ((DownloadGreyDomainApi) Services.b("ConfigResourceServiceModule", DownloadGreyDomainApi.class)).getGreyDownloadDomain("EzPlugin_EzPluginManager");
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "key_test_to_beta_switch_ui");
        boolean zBooleanValue = !TextUtils.isEmpty(strE2) ? Boolean.valueOf(strE2).booleanValue() : false;
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "developer:", strE, ", testToBeta: ", strE2);
        if (CommonUtil.cl() && "1".equals(strE) && zBooleanValue) {
            return "https://" + greyDownloadDomain + "/servicesupport/updateserver/data/";
        }
        DownloadPluginUrl downloadPluginUrl = this.o;
        if (downloadPluginUrl == null || !downloadPluginUrl.isNetworkConnected()) {
            com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "updateIndex download is null");
            return "";
        }
        return this.o.getDownloadPluginUrl(str, z);
    }

    private String k(String str) {
        String strT = t(str);
        if (TextUtils.isEmpty(strT)) {
            return "plugin_index";
        }
        return pip.f45447a.get(strT);
    }

    private String t(String str) {
        String key = "";
        if (CloudUtils.d() && !CommonUtil.cl()) {
            return "";
        }
        if (CommonUtil.bu()) {
            for (Map.Entry<String, String> entry : pip.e.entrySet()) {
                if (TextUtils.equals(entry.getValue(), str)) {
                    key = entry.getKey();
                    break;
                }
            }
        } else {
            for (Map.Entry<String, String> entry2 : pip.f45448b.entrySet()) {
                if (TextUtils.equals(entry2.getValue(), str)) {
                    key = entry2.getKey();
                    break;
                }
            }
        }
        com.huawei.hwlogsmodel.LogUtil.j("EzPlugin_EzPluginManager", "getThirdDeviceType deviceType is ", key);
        return key;
    }

    private static boolean h() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch");
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), "APP_TEST_SITE", "app_test_site_type");
        com.huawei.hwlogsmodel.LogUtil.a("EzPlugin_EzPluginManager", "deviceSite:", strE2);
        return CommonUtil.ap() && "1".equals(strE) && "release".equals(strE2);
    }
}
