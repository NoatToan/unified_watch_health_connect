package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.haf.download.DownloadPluginUrl;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginmgr.DownloadGreyDomainApi;
import com.huawei.pluginmgr.filedownload.PullListener;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes26.dex */
public class dkz extends HwBaseManager {
    private static volatile dkz d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private dkw f31932b;
    private dkw f;
    private dkw g;
    private dkw h;
    private dkw i;
    private dkw j;
    private dkw k;
    private Context l;
    private DownloadPluginUrl m;
    private dkw n;
    private dkw o;
    private dkw p;
    private dkw q;
    private dkw r;
    private dkw s;
    private dkw t;
    private dkw u;
    private dkw v;
    private dkw x;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String[] f31931c = {"sr-Latn", "jv-Latn"};
    private static HashMap<String, String> e = new HashMap<String, String>() { // from class: dkz.2
        private static final long serialVersionUID = 1212859686823339267L;

        {
            put("sr-Latn", "b+sr+Latn");
            put("jv-Latn", "b+jv+Latn");
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<edl> f31930a = new ArrayList(16);

    private dkz(Context context) {
        super(context);
        this.n = new dkw();
        this.f31932b = new dkw();
        this.i = new dkw();
        this.f = new dkw();
        this.g = new dkw();
        this.j = new dkw();
        this.k = new dkw();
        this.r = new dkw();
        this.p = new dkw();
        this.x = new dkw();
        this.o = new dkw();
        this.q = new dkw();
        this.h = new dkw();
        this.u = new dkw();
        this.v = new dkw();
        this.t = new dkw();
        this.s = new dkw();
        this.l = BaseApplication.getContext();
        e(piu.c().d());
    }

    public static dkz d() {
        if (d == null) {
            synchronized (dll.e) {
                if (d == null) {
                    d = new dkz(BaseApplication.getContext());
                }
            }
        }
        return d;
    }

    private void e(DownloadPluginUrl downloadPluginUrl) {
        LogUtil.a("ResourceHandleManager", "enter setDownloadPluginUrl ");
        this.m = downloadPluginUrl;
    }

    public edx d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ResourceHandleManager", "getPluginIndexInfo uuid is empty");
            return null;
        }
        List<edx> listC = c();
        if (!njy.e(listC)) {
            LogUtil.d("ResourceHandleManager", "getPluginIndexInfo ezPluginInfos size is :", Integer.valueOf(listC.size()));
            for (edx edxVar : listC) {
                if (str.equals(edxVar.b())) {
                    return edxVar;
                }
            }
        }
        return null;
    }

    public edl b(String str) {
        LogUtil.a("ResourceHandleManager", "enter getPluginInfo");
        edl edlVarA = dll.a(this.n, f31930a, str);
        if (edlVarA != null) {
            LogUtil.d("ResourceHandleManager", "getPluginInfo get cachePluginInfo");
            return edlVarA;
        }
        boolean zP = p(str);
        LogUtil.a("ResourceHandleManager", "enter to getPluginInfo isDeprecated is :", Boolean.valueOf(zP));
        edl edlVarC = !zP ? dll.c(this.l, str) : null;
        b(edlVarC, str);
        return edlVarC;
    }

    public edl c(String str) {
        boolean zP = p(str);
        LogUtil.a("ResourceHandleManager", "enter to getPluginInfoNotCache isDeprecated is :", Boolean.valueOf(zP));
        edl edlVarC = !zP ? dll.c(this.l, str) : null;
        b(edlVarC, str);
        return edlVarC;
    }

    public void b(edl edlVar, String str) {
        dll.a(f31930a, edlVar, str);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 20010;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    private dkw m(String str) {
        dkw dkwVarT = t(str);
        if (dkwVarT != null && !TextUtils.isEmpty(dkwVarT.c())) {
            return dkwVarT;
        }
        str.hashCode();
        switch (str) {
            case "HDK_ROPE_SKIPPING":
                dkwVarT = this.p;
                break;
            case "HDK_ROWING_MACHINE":
                dkwVarT = this.q;
                break;
            case "HDK_SMART_WATCH":
                dkwVarT = this.v;
                break;
            case "HDK_ELLIPTICAL_MACHINE":
                dkwVarT = this.h;
                break;
            case "HDK_TREADMILL":
                dkwVarT = this.x;
                break;
            case "HDK_SMART_PILLOW":
                dkwVarT = this.t;
                break;
            case "HDK_EXERCISE_BIKE":
                dkwVarT = this.o;
                break;
            case "HDK_WALKING_MACHINE":
                dkwVarT = this.u;
                break;
            case "HDK_MASSAGE_GUN":
                dkwVarT = this.s;
                break;
        }
        if (dkwVarT == null || TextUtils.isEmpty(dkwVarT.c())) {
            return null;
        }
        return dkwVarT;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    private dkw t(String str) {
        str.hashCode();
        switch (str) {
            case "HDK_BODY_TEMPERATURE":
                return this.r;
            case "HDK_WEIGHT":
                return this.j;
            case "HDK_HEART_RATE":
                return this.k;
            case "HDK_BLOOD_OXYGEN":
                return this.f31932b;
            case "HDK_BLOOD_PRESSURE":
                return this.f;
            case "HDK_ECG":
                return this.i;
            case "HDK_BLOOD_SUGAR":
                return this.g;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    private void b(String str, dkw dkwVar) {
        if (a(str, dkwVar)) {
            return;
        }
        str.hashCode();
        switch (str) {
            case "HDK_ROWING_MACHINE":
                this.q = dkwVar;
                break;
            case "HDK_SMART_WATCH":
                this.v = dkwVar;
                break;
            case "HDK_ELLIPTICAL_MACHINE":
                this.h = dkwVar;
                break;
            case "HDK_TREADMILL":
                this.x = dkwVar;
                break;
            case "HDK_SMART_PILLOW":
                this.t = dkwVar;
                break;
            case "HDK_EXERCISE_BIKE":
                this.o = dkwVar;
                break;
            case "HDK_WALKING_MACHINE":
                this.u = dkwVar;
                break;
            case "HDK_MASSAGE_GUN":
                this.s = dkwVar;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    private boolean a(String str, dkw dkwVar) {
        str.hashCode();
        switch (str) {
            case "HDK_BODY_TEMPERATURE":
                this.r = dkwVar;
                return true;
            case "HDK_ROPE_SKIPPING":
                this.p = dkwVar;
                return true;
            case "HDK_WEIGHT":
                this.j = dkwVar;
                return true;
            case "HDK_HEART_RATE":
                this.k = dkwVar;
                return true;
            case "HDK_BLOOD_OXYGEN":
                this.f31932b = dkwVar;
                return true;
            case "HDK_BLOOD_PRESSURE":
                this.f = dkwVar;
                return true;
            case "HDK_ECG":
                this.i = dkwVar;
                return true;
            case "HDK_BLOOD_SUGAR":
                this.g = dkwVar;
                return true;
            default:
                return false;
        }
    }

    public List<edx> b() {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            List<eds> listE = dkg.d().e();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listE);
            for (int i = 0; i < arrayList2.size(); i++) {
                List<edx> listQ = ((eds) arrayList2.get(i)).q();
                if (listQ != null && listQ.size() > 0) {
                    arrayList.addAll(listQ);
                }
            }
            if (!njy.e(this.n.b())) {
                LogUtil.a("ResourceHandleManager", "mIndexFileStruct.getPlugins start");
                arrayList.addAll(this.n.b());
                return arrayList;
            }
            String strC = dll.c();
            boolean zExists = new File(strC).exists();
            LogUtil.a("ResourceHandleManager", "getIndexList isExistThisIndex is =", Boolean.valueOf(zExists));
            if (zExists) {
                String strA = dll.a(this.l, strC);
                LogUtil.d("ResourceHandleManager", "getIndex indexJson = ", strA);
                s(strA);
                if (this.n.b() != null) {
                    LogUtil.a("ResourceHandleManager", "mIndexFileStruct.getPlugins");
                    arrayList.addAll(this.n.b());
                    return arrayList;
                }
            }
            return null;
        }
    }

    public List<edx> e(String str) {
        synchronized (this) {
            dkw dkwVarM = m(str);
            List<edx> listB = dkwVarM != null ? dkwVarM.b() : null;
            if (listB != null) {
                return listB;
            }
            String strE = dll.e(str);
            if (new File(strE).exists()) {
                String strA = dll.a(this.l, strE);
                LogUtil.a("ResourceHandleManager", "index Data:", strA, TextUtils.isEmpty(strA) ? ",indexJson is null" : "");
                if (TextUtils.isEmpty(strA)) {
                    return null;
                }
                dkw dkwVarA = dlb.a(strA);
                b(str, dkwVarA);
                listB = dkwVarA.b();
            }
            return listB;
        }
    }

    public List<edx> c() {
        LogUtil.d("ResourceHandleManager", "getAllIndexList");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = pip.f45449c.keySet().iterator();
        while (it.hasNext()) {
            List<edx> listE = e(it.next());
            if (listE != null) {
                arrayList.addAll(listE);
            }
        }
        List<edx> listB = b();
        if (listB != null) {
            arrayList.addAll(listB);
        }
        return arrayList;
    }

    private void s(String str) {
        String strC;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ResourceHandleManager", "parseVersionIndexFile indexJson is null");
            return;
        }
        try {
            dkw dkwVar = this.n;
            if (dkwVar == null) {
                strC = "";
            } else {
                strC = dkwVar.c();
            }
            if (TextUtils.isEmpty(strC)) {
                this.n = dlb.a(str);
                dll.a(f31930a);
            } else {
                if (strC.equals(new JSONObject(str).optString("version"))) {
                    return;
                }
                this.n = dlb.a(str);
                dll.a(f31930a);
            }
        } catch (JSONException unused) {
            LogUtil.e("ResourceHandleManager", "parseVersionIndexFile JSONException");
        }
    }

    public edl b(int i) {
        edl edlVarB;
        List<edx> listB = b();
        if (njy.e(listB)) {
            return null;
        }
        LogUtil.d("ResourceHandleManager", "getPluginInfoByType indexInfos.size > 0");
        for (edx edxVar : listB) {
            if (edxVar.b() != null && (edxVar.g().equals("SMART_WATCH") || edxVar.g().equals("SMART_BAND"))) {
                if (d().j(edxVar.b()) && (edlVarB = d().b(edxVar.b())) != null && edlVarB.i() != null && edlVarB.i().ag() == i) {
                    return edlVarB;
                }
            }
        }
        return null;
    }

    public edl a(int i) {
        edl edlVarB;
        List<edx> listB = b();
        if (njy.e(listB)) {
            return null;
        }
        LogUtil.a("ResourceHandleManager", "getPluginInfoByHiType indexInfos.size > 0 , hitype:", Integer.valueOf(i));
        for (edx edxVar : listB) {
            if (edxVar.b() != null && d().j(edxVar.b()) && (edlVarB = d().b(edxVar.b())) != null && edlVarB.i() != null && c(edlVarB, i)) {
                LogUtil.a("ResourceHandleManager", "getPluginInfoByHiType match info success pluginInfoHiType is ", Integer.valueOf(i));
                return edlVarB;
            }
        }
        return null;
    }

    private boolean c(edl edlVar, int i) {
        if (edlVar.i().at() == i) {
            LogUtil.a("ResourceHandleManager", "match getOldHiyType enter hiType is ", Integer.valueOf(i));
            return true;
        }
        try {
            String strE = edlVar.i().e();
            LogUtil.a("ResourceHandleManager", "isMatchHitype aitipeProduct is ", strE);
            JSONObject jSONObject = new JSONObject(strE);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!next.contains("ai_tips_product")) {
                    LogUtil.a("ResourceHandleManager", "isMatchHitype key is ", next, " not contains ai_tips_product");
                } else if (i(jSONObject.getString(next)) == i) {
                    LogUtil.a("ResourceHandleManager", "isMatchHitype retur true");
                    return true;
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("ResourceHandleManager", "isMatchHitype JSONException");
        }
        return false;
    }

    private int i(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("health_cloud_productId")) {
            int i = jSONObject.getInt("health_cloud_productId");
            LogUtil.a("ResourceHandleManager", "getAitipsPriductType productType is ", Integer.valueOf(i));
            return i;
        }
        LogUtil.a("ResourceHandleManager", "getAitipsPriductType no key");
        return -1;
    }

    public boolean j(String str) {
        return dll.b(str, p(str));
    }

    private boolean p(String str) {
        return dll.a(str, d(str));
    }

    public void b(String str, PullListener pullListener) {
        e(str, (CommonUtil.af(this.l) || h()) ? "com.huawei.health_HwWear_deviceConfig" : "com.huawei.health_HwWear_deviceConfigBeta", "", pullListener);
    }

    public void e(final String str, final String str2, final String str3, final PullListener pullListener) {
        PullListener pullListener2 = new PullListener() { // from class: dld
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public final void onPullingChange(pis pisVar, pit pitVar) {
                this.e.b(str2, str, str3, pullListener, pisVar, pitVar);
            }
        };
        String strK = k(str2);
        LogUtil.a("ResourceHandleManager", "updateDescription file id ", strK);
        String strL = l(str2);
        String strC = dll.c();
        if (!TextUtils.isEmpty(strL)) {
            strC = dll.e(strL);
        }
        c(strK, str2, strC, pullListener2);
    }

    /* synthetic */ void b(String str, String str2, String str3, PullListener pullListener, pis pisVar, pit pitVar) {
        int iF = pitVar.f();
        if (iF != 1 && iF != -11) {
            if (iF == 0) {
                LogUtil.a("ResourceHandleManager", "updateDescription Downloading index file");
                return;
            } else {
                if (pullListener != null) {
                    pullListener.onPullingChange(pisVar, pitVar);
                    return;
                }
                return;
            }
        }
        String strO = o(str);
        LogUtil.a("ResourceHandleManager", "updateDescription savePathIndex is =", strO);
        String strA = dll.a(this.l, strO);
        LogUtil.d("ResourceHandleManager", "updateDescription indexJson = ", strA);
        s(strA);
        SharedPreferenceManager.e(this.l, String.valueOf(getModuleId()), "updateTime", String.valueOf(new Date().getTime()), null);
        edx edxVarD = d(str2);
        String strD = str + str3;
        if (TextUtils.equals(str3, "?deviceType=bodyFatScales")) {
            LogUtil.a("ResourceHandleManager", "matchRules is equals MATCH_RULES");
            strD = phr.d(this.l, "HDK_WEIGHT");
        }
        a(edxVarD, strD, pullListener, pisVar, pitVar);
    }

    private String o(String str) {
        String strL = l(str);
        return !TextUtils.isEmpty(strL) ? dll.e(strL) : dll.d();
    }

    public void c(final String str, final PullListener pullListener) {
        edl edlVarB = b(str);
        if (edlVarB != null) {
            e(str, this.m, pullListener, edlVarB);
        } else {
            b(str, new PullListener() { // from class: dle
                @Override // com.huawei.pluginmgr.filedownload.PullListener
                public final void onPullingChange(pis pisVar, pit pitVar) {
                    this.f31940a.c(str, pullListener, pisVar, pitVar);
                }
            });
        }
    }

    /* synthetic */ void c(String str, PullListener pullListener, pis pisVar, pit pitVar) {
        int iF = pitVar.f();
        if (iF == 1) {
            if (b(str) != null) {
                c(str, pullListener);
                return;
            } else {
                LogUtil.j("ResourceHandleManager", "inform error");
                return;
            }
        }
        if (iF == 0 || pullListener == null) {
            return;
        }
        pullListener.onPullingChange(pisVar, pitVar);
    }

    private String n(String str) {
        String str2 = str + "com.huawei.health_HwWear_deviceConfigBeta";
        if (!CommonUtil.af(this.l) && !h()) {
            return str2;
        }
        return str + "com.huawei.health_HwWear_deviceConfig";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void e(final String str, final DownloadPluginUrl downloadPluginUrl, final PullListener pullListener, final edl edlVar) {
        String downloadPluginUrl2;
        if (downloadPluginUrl == null) {
            downloadPluginUrl2 = "";
        } else {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: dlc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31935b.e(str, downloadPluginUrl, pullListener, edlVar);
                    }
                });
                return;
            }
            downloadPluginUrl2 = downloadPluginUrl.getDownloadPluginUrl(null, true);
        }
        String strN = n(downloadPluginUrl2);
        LogUtil.a("ResourceHandleManager", "startUpdatePlugin pluginUrl is = ", strN);
        dli dliVarC = dli.c();
        piu.c();
        dliVarC.c(str, strN, piu.a(), edlVar, pullListener);
    }

    private void a(edx edxVar, String str, String str2, PullListener pullListener) {
        if (edxVar != null) {
            if (!p(str)) {
                c(str, this.m, str2, pullListener);
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
        LogUtil.j("ResourceHandleManager", "downloadDescriptioninform error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void c(final String str, final DownloadPluginUrl downloadPluginUrl, final String str2, final PullListener pullListener) {
        String downloadPluginUrl2;
        String strA = null;
        if (downloadPluginUrl == null) {
            downloadPluginUrl2 = "";
        } else {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: dlg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f31946c.c(str, downloadPluginUrl, str2, pullListener);
                    }
                });
                return;
            }
            downloadPluginUrl2 = downloadPluginUrl.getDownloadPluginUrl(null, true);
        }
        String str3 = downloadPluginUrl2 + str2;
        LogUtil.a("ResourceHandleManager", "startUpdateDescription pluginUrl is = ", str3);
        if (r(str3)) {
            piu.c();
            strA = piu.a();
        }
        dli.c().c(str, str3, pullListener, strA);
    }

    private boolean r(String str) {
        return str.contains("com.huawei.health_HwWear_deviceConfigBeta") || str.contains("com.huawei.health_HwWear_deviceConfig");
    }

    public void b(PullListener pullListener) {
        c("plugin_index", (CommonUtil.af(this.l) || h()) ? "com.huawei.health_HwWear_deviceConfig" : "com.huawei.health_HwWear_deviceConfigBeta", dll.d(), pullListener);
    }

    public void c(String str, String str2, String str3, PullListener pullListener) {
        String strE = e((String) null, true);
        pis pisVar = new pis();
        pit pitVar = new pit();
        pitVar.e(-1);
        if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(str2)) {
            xjt.o("updateIndex base url or configServiceName is empty.");
            LogUtil.j("ResourceHandleManager", "updateIndex base url is empty");
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            xjt.o("updateIndex base fileId is empty.");
            LogUtil.j("ResourceHandleManager", "updateIndex base fileId is empty");
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        b(str, strE + str2, str3, pullListener);
    }

    private void b(String str, String str2, String str3, PullListener pullListener) {
        dky dkyVar = new dky();
        dkyVar.e(str2);
        d(str, dkyVar, str3, pullListener);
    }

    private void d(final String str, final dky dkyVar, final String str2, final PullListener pullListener) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: dlf
                @Override // java.lang.Runnable
                public final void run() {
                    dli.c().d(str, dkyVar, str2, true, pullListener);
                }
            });
        } else {
            dli.c().d(str, dkyVar, str2, true, pullListener);
        }
    }

    private void a(edx edxVar, String str, PullListener pullListener, pis pisVar, pit pitVar) {
        String str2 = "";
        LogUtil.a("ResourceHandleManager", "checkAppVersion enter check version", edxVar == null ? ",checkAppVersion:ezPluginIndexInfo is null" : "");
        if (edxVar == null) {
            return;
        }
        String strB = edxVar.b();
        edw edwVarA = edxVar.a();
        if (edwVarA == null) {
            LogUtil.j("ResourceHandleManager", "checkAppVersion no have ApplyRules");
            a(edxVar, strB, str, pullListener);
            return;
        }
        if (edwVarA.a() == null) {
            LogUtil.j("ResourceHandleManager", "checkAppVersion not have minAppVersion");
            d(edxVar, str, pullListener, pisVar, pitVar);
            return;
        }
        int iN = CommonUtil.n(this.l, edwVarA.a());
        int iE = CommonUtil.e(this.l);
        if (iE < iN) {
            str2 = ",checkAppVersion appVersion less than this plugin minAppVersion";
        }
        LogUtil.a("ResourceHandleManager", "checkAppVersion minAppVersionCode is ", Integer.valueOf(iN), " appCode is ", Integer.valueOf(iE), str2);
        if (iE < iN) {
            pitVar.e(-30);
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        d(edxVar, str, pullListener, pisVar, pitVar);
    }

    private void d(edx edxVar, String str, PullListener pullListener, pis pisVar, pit pitVar) {
        edw edwVarA = edxVar.a();
        String strB = edxVar.b();
        if (this.n != null) {
            if (dll.d(this.l, edwVarA.e(), this.n.c())) {
                a(edxVar, strB, str, pullListener);
                return;
            }
            LogUtil.a("ResourceHandleManager", "checkIndexVersion indexVersion less than this plugin minIndexVersion");
            pitVar.e(-20);
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        LogUtil.j("ResourceHandleManager", "checkIndexVersion mIndexFileStruct is null");
    }

    public void d(pis pisVar) {
        if (pisVar != null) {
            dli.c().b(pisVar);
        } else {
            LogUtil.j("ResourceHandleManager", "canclePluginDownload cancle task failure ,task param is null");
        }
    }

    public void d(String str, PullListener pullListener) {
        String str2;
        LogUtil.a("ResourceHandleManager", "enter checkPluginNewVersionForWear");
        pit pitVar = new pit();
        pis pisVar = new pis();
        edx edxVarD = d(str);
        edl edlVarB = b(str);
        if (edlVarB == null || edxVarD == null) {
            LogUtil.j("ResourceHandleManager", "checkPluginNewVersionForWear descriptionInfo is null");
            pitVar.e(20);
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        String strE = edxVarD.e();
        String strB = edlVarB.b();
        String str3 = edxVarD.b() + "_version";
        String strE2 = SharedPreferenceManager.e(this.l, String.valueOf(1003), str3);
        LogUtil.a("ResourceHandleManager", "checkPluginNewVersionForWear getKey is ", str3, ",spVersion is ", strE2, ",indexPluginVersion is:", strE, ",descVersion is:", strB);
        boolean zE = dll.e(strB, strE);
        if (TextUtils.isEmpty(strB) || !dll.b(str)) {
            zE = true;
        }
        boolean zE2 = dll.e(strE2, strE);
        if (zE || zE2) {
            str2 = "checkPluginNewVersionForWear have new version";
        } else {
            str2 = "checkPluginNewVersionForWear not have new version";
        }
        LogUtil.a("ResourceHandleManager", str2);
        boolean zExists = new File(dli.c().d(str) + File.separator + str + File.separator + "img").exists();
        boolean zExists2 = new File(dli.c().d(str) + File.separator + str + File.separator + "lang").exists();
        LogUtil.a("ResourceHandleManager", "imgFile is exist:", Boolean.valueOf(zExists), "langFile is exist:", Boolean.valueOf(zExists2));
        if (zE || zE2 || (!zExists && zExists2)) {
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

    public void a(String str, PullListener pullListener) {
        c(str, (CommonUtil.af(this.l) || h()) ? "com.huawei.health_HwWear_deviceConfig" : "com.huawei.health_HwWear_deviceConfigBeta", pullListener);
    }

    public void c(String str, String str2, PullListener pullListener) {
        a(d(str), str2, pullListener, new pis(), new pit());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Bitmap e(edl edlVar, String str) throws Throwable {
        InputStream inputStreamOpenRawResource;
        Bitmap bitmapDecodeFile;
        Bitmap bitmap;
        LogUtil.a("ResourceHandleManager", "loadImageForWear enter loadImageForWear", edlVar == null ? ",loadImageForWear descriptionInfo is null" : "");
        InputStream inputStream = null;
        InputStream inputStream2 = null;
        inputStream = null;
        Bitmap bitmapDecodeStream = null;
        if (edlVar == null) {
            return null;
        }
        try {
            try {
                String str2 = dli.c().d(edlVar.c()) + File.separator + edlVar.c() + File.separator + "img" + File.separator + str + ".png";
                if (new File(str2).exists()) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    options.inInputShareable = true;
                    bitmapDecodeFile = BitmapFactory.decodeFile(str2, options);
                    try {
                        LogUtil.a("ResourceHandleManager", "enter loadImageForWear have bitmap imageKey:", str, " fetchPluginUuid:", edlVar.c());
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
                    inputStreamOpenRawResource = BaseApplication.getContext().getResources().openRawResource(f("hw_device_default"));
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource, null, options2);
                        LogUtil.a("ResourceHandleManager", "enter loadImageForWear have no bitmap :", str, " fetchPluginUuid:", edlVar.c());
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
        LogUtil.e("ResourceHandleManager", "loadImageForWear loadImage NotFoundException");
        IoUtils.c(inputStream);
        return bitmapDecodeFile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Bitmap h(String str) throws Throwable {
        InputStream inputStreamOpenRawResource;
        Bitmap bitmapDecodeFile;
        Bitmap bitmap;
        LogUtil.a("ResourceHandleManager", "enter loadImageForImagePath", TextUtils.isEmpty(str) ? ",loadImageForImagePath imagePath is null" : "");
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
                        LogUtil.a("ResourceHandleManager", "enter loadImageForImagePath have bitmap imageKey");
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
                    inputStreamOpenRawResource = BaseApplication.getContext().getResources().openRawResource(f("hw_device_default"));
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource, null, options2);
                        LogUtil.a("ResourceHandleManager", "enter loadImageForImagePath have no bitmap");
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
        LogUtil.e("ResourceHandleManager", "loadImageForImagePath loadImage NotFoundException");
        IoUtils.c(inputStream);
        return bitmapDecodeFile;
    }

    private int f(String str) {
        return BaseApplication.getContext().getResources().getIdentifier(str, "drawable", BaseApplication.getContext().getPackageName());
    }

    public void a() {
        String strC = dll.c();
        boolean zExists = new File(strC).exists();
        LogUtil.a("ResourceHandleManager", "updateIndexCacheForWear isExistThisIndex is = ", Boolean.valueOf(zExists));
        if (zExists) {
            String strA = dll.a(this.l, strC);
            if (!TextUtils.isEmpty(strA)) {
                if (strA.contains("updatedTime")) {
                    LogUtil.a("ResourceHandleManager", "updateIndexCacheForWear indexJson = ", strA.substring(0, strA.indexOf("updatedTime")));
                } else {
                    LogUtil.a("ResourceHandleManager", "updateIndexCacheForWear indexJson = ", strA);
                }
            }
            s(strA);
            LogUtil.a("ResourceHandleManager", "updateIndexCacheForWear end");
        }
    }

    public static void e() {
        dll.a(f31930a);
    }

    public void a(String str) {
        File file = new File((edf.f32777a + str + File.separator) + "description.json");
        if (file.exists()) {
            LogUtil.a("ResourceHandleManager", "isDeleteDescriptionForwear is = ", Boolean.valueOf(file.delete()));
        }
    }

    private static List<String> c(edl edlVar, String str) {
        synchronized (dkz.class) {
            LogUtil.d("ResourceHandleManager", " enter loadStringForWear.");
            File fileC = c(edlVar);
            ArrayList arrayList = new ArrayList(10);
            if (fileC == null) {
                LogUtil.j("ResourceHandleManager", "loadStringForWear jsonFile == null.");
                return arrayList;
            }
            LogUtil.d("ResourceHandleManager", "loadStringForWear jsonFile.name is ", fileC.getName());
            try {
                JSONObject jSONObjectB = eek.b(fileC);
                if (jSONObjectB == null) {
                    return arrayList;
                }
                if (!jSONObjectB.has(str)) {
                    LogUtil.d("ResourceHandleManager", "loadStringForWear jsonObject not has key");
                    return arrayList;
                }
                Object obj = jSONObjectB.get(str);
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
                LogUtil.e("ResourceHandleManager", "loadStringForWear JSONException");
            }
        }
    }

    private static File c(edl edlVar) {
        Locale locale = Resources.getSystem().getConfiguration().locale;
        return c(edlVar, locale.getLanguage(), locale.getCountry(), locale.toLanguageTag());
    }

    private static File c(edl edlVar, String str, String str2, String str3) {
        String str4;
        LogUtil.d("ResourceHandleManager", " enter getTargetJsonFile.", str2, Constants.LINK, str3);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ResourceHandleManager", " getTargetJsonFile TextUtils.isEmpty(language).");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str4 = str + ".json";
        } else {
            str4 = str + "-r" + str2 + ".json";
        }
        String str5 = dli.c().d(edlVar.c()) + File.separator + edlVar.c() + File.separator + "lang";
        File file = new File(str5);
        if (file.exists() && file.isDirectory()) {
            return d(file.listFiles(), str3, str4, str);
        }
        LogUtil.j("ResourceHandleManager", "getTargetJsonFile wrong dir path, not exists or should be dir but is file : ", str5);
        return null;
    }

    private static File d(File[] fileArr, String str, String str2, String str3) {
        String str4;
        if (fileArr == null || fileArr.length == 0) {
            LogUtil.j("ResourceHandleManager", "getFileByName wrong dir.no file. can not find target file, return null.");
            return null;
        }
        if (str == null) {
            str4 = str2;
            break;
        }
        String strG = g(str);
        if (strG != null) {
            String str5 = e.get(strG) + ".json";
            LogUtil.a("ResourceHandleManager", "getFileByName fileNameTag : ", str5);
            File fileA = a(fileArr, str5);
            if (fileA != null && fileA.length() > 0) {
                LogUtil.a("ResourceHandleManager", "getFileByName file is ok");
                return fileA;
            }
            File fileA2 = a(fileArr, "en.json");
            if (fileA2 != null && fileA2.length() > 0) {
                LogUtil.a("ResourceHandleManager", "getFileByName en file is ok");
                return fileA2;
            }
        }
        String[] strArr = {"es-AR", "es-BO", "es-CL", "es-CO", "es-CR", "es-CU", "es-DO", "es-EC", "es-GT", "es-HN", "es-MX", "es-NI", "es-PA", "es-PE", "es-PR", "es-PY", "es-SV", "es-UY", "es-VE"};
        int i = 0;
        while (true) {
            if (i >= 19) {
                str4 = str2;
                break;
            }
            if (strArr[i].equals(str)) {
                str4 = "es-rUS.json";
                break;
            }
            i++;
        }
        for (File file : fileArr) {
            if (str4.equals(file.getName())) {
                return file;
            }
        }
        LogUtil.d("ResourceHandleManager", "getFileByName can not find file : ", str4);
        if (str4.contains("-r")) {
            str4 = eek.a(str3) + ".json";
            for (File file2 : fileArr) {
                if (str4.equals(file2.getName())) {
                    return file2;
                }
            }
        }
        LogUtil.d("ResourceHandleManager", "getFileByName can not find file : ", str4);
        for (File file3 : fileArr) {
            if ("en.json".equals(file3.getName())) {
                return file3;
            }
        }
        LogUtil.d("ResourceHandleManager", "getFileByName can not find file : ", "en.json");
        LogUtil.j("ResourceHandleManager", "getFileByName can not find target file, return null.");
        return null;
    }

    private static File a(File[] fileArr, String str) {
        for (File file : fileArr) {
            if (str.equals(file.getName())) {
                return file;
            }
        }
        return null;
    }

    private static String g(String str) {
        for (String str2 : f31931c) {
            if (str.startsWith(str2)) {
                LogUtil.d("ResourceHandleManager", "changeTag is ", str, "after changeTag is ", str2);
                return str2;
            }
        }
        str2 = null;
        LogUtil.d("ResourceHandleManager", "changeTag is ", str, "after changeTag is ", str2);
        return str2;
    }

    protected static List<String> d(String str, edl edlVar) {
        ArrayList arrayList = new ArrayList(16);
        List<String> listC = c(edlVar, str);
        if (listC.size() != 0) {
            for (int i = 0; i < listC.size(); i++) {
                List<String> listC2 = c(edlVar, str + "Other" + i);
                String strReplace = listC.get(i);
                if (listC2.size() == 0) {
                    arrayList.add(strReplace);
                } else {
                    List<Object> listA = a(listC2);
                    int i2 = 0;
                    while (i2 < listA.size()) {
                        i2++;
                        strReplace = strReplace.replace("%" + i2 + "$d", "%" + i2 + "$s");
                    }
                    arrayList.add(String.format(Locale.ROOT, strReplace, listA.toArray()));
                }
            }
        }
        return arrayList;
    }

    private static List<Object> a(List<String> list) {
        ArrayList arrayList = new ArrayList(16);
        for (String strE : list) {
            if (q(strE)) {
                try {
                    String strE2 = UnitUtil.e(Long.parseLong(strE), 1, 0);
                    LogUtil.d("ResourceHandleManager", "isNumber formatValue:", strE2);
                    arrayList.add(strE2);
                } catch (NumberFormatException e2) {
                    LogUtil.e("ResourceHandleManager", e2.getMessage());
                }
            } else {
                try {
                    String[] strArrSplit = strE.split("\\.");
                    if (strArrSplit.length > 1) {
                        strE = UnitUtil.e(Double.parseDouble(strE), 1, strArrSplit[1].length());
                    }
                } catch (NumberFormatException unused) {
                }
                LogUtil.d("ResourceHandleManager", "string formatValue:", strE);
                arrayList.add(strE);
            }
        }
        return arrayList;
    }

    private static boolean q(String str) {
        return Pattern.compile("[0-9]+").matcher(str).matches();
    }

    protected String e(String str, boolean z) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch");
        String greyDownloadDomain = ((DownloadGreyDomainApi) Services.b("ConfigResourceServiceModule", DownloadGreyDomainApi.class)).getGreyDownloadDomain("ResourceHandleManager");
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "key_test_to_beta_switch_ui");
        boolean zBooleanValue = !TextUtils.isEmpty(strE2) ? Boolean.valueOf(strE2).booleanValue() : false;
        LogUtil.a("ResourceHandleManager", "developer:", strE, ", testToBeta: ", strE2, "deviceServer: ", CommonUtil.n(greyDownloadDomain));
        if (CommonUtil.cl() && "1".equals(strE) && zBooleanValue) {
            return "https://" + greyDownloadDomain + "/servicesupport/updateserver/data/";
        }
        DownloadPluginUrl downloadPluginUrl = this.m;
        if (downloadPluginUrl == null || !downloadPluginUrl.isNetworkConnected()) {
            LogUtil.j("ResourceHandleManager", "updateIndex download is null");
            return "";
        }
        return this.m.getDownloadPluginUrl(str, z);
    }

    private String k(String str) {
        String strL = l(str);
        if (TextUtils.isEmpty(strL)) {
            return "plugin_index";
        }
        return pip.f45447a.get(strL);
    }

    private String l(String str) {
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
        LogUtil.j("ResourceHandleManager", "getThirdDeviceType deviceType is ", key);
        return key;
    }

    private static boolean h() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch");
        String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), "APP_TEST_SITE", "app_test_site_type");
        LogUtil.a("ResourceHandleManager", "deviceSite:", strE2);
        return CommonUtil.ap() && "1".equals(strE) && "release".equals(strE2);
    }
}
