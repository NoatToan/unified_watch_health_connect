package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.download.DownloadPluginUrl;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.EzPluginPullerCallback;
import com.huawei.pluginmgr.filedownload.PullHealthBiListener;
import com.huawei.pluginmgr.filedownload.PullListener;
import com.huawei.pluginmgr.hwwear.bean.DeviceDownloadSourceInfo;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class efz extends HwBaseManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile efz f32915b;
    private static List<pic> d = new ArrayList(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f32916a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private pio f32917c;
    private Map<String, pio> e;

    private efz(Context context) {
        super(context);
        this.f32917c = new pio();
        this.e = new HashMap();
        this.f32916a = context;
    }

    public static efz b() {
        if (f32915b == null) {
            synchronized (pik.f45440c) {
                if (f32915b == null) {
                    f32915b = new efz(BaseApplication.getContext());
                }
            }
        }
        return f32915b;
    }

    public void c(DeviceDownloadSourceInfo deviceDownloadSourceInfo, DownloadCallback<fcz> downloadCallback, PullHealthBiListener pullHealthBiListener) {
        LogUtil.a("HealthCloudDownloadManager", "updateThirdIndex");
        if (deviceDownloadSourceInfo == null || downloadCallback == null) {
            LogUtil.a("HealthCloudDownloadManager", "updateThirdIndex deviceDownloadSourceInfo or callback null");
        } else {
            f(deviceDownloadSourceInfo.getIndexName());
            a(deviceDownloadSourceInfo, egk.c(deviceDownloadSourceInfo.getIndexName()), downloadCallback, pullHealthBiListener);
        }
    }

    private void a(final DeviceDownloadSourceInfo deviceDownloadSourceInfo, final String str, final DownloadCallback<fcz> downloadCallback, final PullHealthBiListener pullHealthBiListener) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: egd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32924c.d(deviceDownloadSourceInfo, str, downloadCallback, pullHealthBiListener);
                }
            });
        } else {
            LogUtil.a("HealthCloudDownloadManager", "startUpdateThirdIndex");
            egf.b().e(deviceDownloadSourceInfo, str, downloadCallback, pullHealthBiListener);
        }
    }

    /* synthetic */ void d(DeviceDownloadSourceInfo deviceDownloadSourceInfo, String str, DownloadCallback downloadCallback, PullHealthBiListener pullHealthBiListener) {
        a(deviceDownloadSourceInfo, str, (DownloadCallback<fcz>) downloadCallback, pullHealthBiListener);
    }

    public phz b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("HealthCloudDownloadManager", "getPluginIndexInfo uuid is empty");
            return null;
        }
        List<phz> listD = d(str);
        if (!njy.e(listD)) {
            LogUtil.a("HealthCloudDownloadManager", "getPluginIndexInfo ezPluginInfos size is :", Integer.valueOf(listD.size()));
            for (phz phzVar : listD) {
                if (str2.equals(phzVar.a())) {
                    return phzVar;
                }
            }
        }
        return null;
    }

    public List<phz> d(String str) {
        LogUtil.d("HealthCloudDownloadManager", "getAllIndexList");
        ArrayList arrayList = new ArrayList();
        List<phz> listE = e(str);
        if (listE != null) {
            arrayList.addAll(listE);
        }
        List<phz> listD = d();
        if (listD != null) {
            arrayList.addAll(listD);
        }
        return arrayList;
    }

    public pic a(String str, String str2) {
        pic picVarE = pik.e(this.f32917c, d, str2);
        if (picVarE != null) {
            LogUtil.d("HealthCloudDownloadManager", "getPluginInfo get cachePluginInfo");
            return picVarE;
        }
        boolean zC = c(str, str2);
        LogUtil.a("HealthCloudDownloadManager", "enter to getPluginInfo isDeprecated is :", Boolean.valueOf(zC));
        pic picVarC = !zC ? pik.c(this.f32916a, str2) : null;
        c(picVarC, str2);
        return picVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(pic picVar, String str) {
        pik.a(d, picVar, str);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 20010;
    }

    private pio b(String str) {
        return this.e.get(str);
    }

    private void c(String str, pio pioVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.put(str, pioVar);
    }

    public List<phz> d() {
        List<phz> listH;
        LogUtil.d("HealthCloudDownloadManager", "getIndexList enter to GetPluginsIndexInfos");
        ArrayList arrayList = new ArrayList();
        List<pjc> listD = piq.e().d();
        for (int i = 0; i < listD.size(); i++) {
            pjc pjcVar = listD.get(i);
            if (pjcVar != null && (listH = pjcVar.h()) != null && listH.size() > 0) {
                arrayList.addAll(listH);
            }
        }
        if (this.f32917c.c() != null) {
            arrayList.addAll(this.f32917c.c());
            return arrayList;
        }
        String strE = pik.e();
        boolean zExists = new File(strE).exists();
        LogUtil.a("HealthCloudDownloadManager", "getIndexList isExistThisIndex is =", Boolean.valueOf(zExists));
        if (zExists) {
            String strB = pik.b(this.f32916a, strE);
            LogUtil.d("HealthCloudDownloadManager", "getIndex indexJson = ", strB);
            i(strB);
            if (this.f32917c.c() != null) {
                arrayList.addAll(this.f32917c.c());
            }
        }
        return arrayList;
    }

    public List<phz> e(String str) {
        pio pioVarB = b(str);
        List<phz> listC = pioVarB != null ? pioVarB.c() : null;
        if (listC == null) {
            String strC = egk.c(str);
            if (new File(strC).exists()) {
                String strB = pik.b(this.f32916a, strC);
                LogUtil.a("HealthCloudDownloadManager", "index Data:", strB, TextUtils.isEmpty(strB) ? ",indexJson is null" : "");
                if (!TextUtils.isEmpty(strB)) {
                    pio pioVarC = phw.c(strB);
                    c(str, pioVarC);
                    return pioVarC.c();
                }
            }
        }
        return listC;
    }

    private void i(String str) {
        String strD;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HealthCloudDownloadManager", "parseVersionIndexFile indexJson is null");
            return;
        }
        try {
            pio pioVar = this.f32917c;
            if (pioVar == null) {
                strD = "";
            } else {
                strD = pioVar.d();
            }
            if (TextUtils.isEmpty(strD)) {
                this.f32917c = phw.c(str);
                e();
            } else {
                if (strD.equals(new JSONObject(str).optString("version"))) {
                    return;
                }
                this.f32917c = phw.c(str);
                e();
            }
        } catch (JSONException unused) {
            LogUtil.e("HealthCloudDownloadManager", "parseVersionIndexFile JSONException");
        }
    }

    public boolean e(String str, String str2) {
        return pik.d(str2, c(str, str2));
    }

    private boolean c(String str, String str2) {
        return pik.c(str2, b(str, str2));
    }

    public void a(final DeviceDownloadSourceInfo deviceDownloadSourceInfo, final String str, final PullListener pullListener, final PullHealthBiListener pullHealthBiListener) {
        pic picVarA = a(deviceDownloadSourceInfo.getIndexName(), str);
        if (picVarA != null && !TextUtils.isEmpty(str) && str.equals(picVarA.b())) {
            phy phyVar = new phy(str, d(deviceDownloadSourceInfo), null, picVarA);
            phyVar.b(deviceDownloadSourceInfo);
            egf.b().b(str + "_new_v1.1", phyVar, pullListener, pullHealthBiListener);
            return;
        }
        b(deviceDownloadSourceInfo, str, new PullListener() { // from class: egb
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public final void onPullingChange(pis pisVar, pit pitVar) {
                this.f32920c.b(deviceDownloadSourceInfo, str, pullListener, pullHealthBiListener, pisVar, pitVar);
            }
        }, pullHealthBiListener);
    }

    /* synthetic */ void b(DeviceDownloadSourceInfo deviceDownloadSourceInfo, String str, PullListener pullListener, PullHealthBiListener pullHealthBiListener, pis pisVar, pit pitVar) {
        int iF = pitVar.f();
        if (iF == 1) {
            if (a(deviceDownloadSourceInfo.getIndexName(), str) == null) {
                LogUtil.j("HealthCloudDownloadManager", "updateThirdPartyPlugin inform error");
                return;
            } else {
                a(deviceDownloadSourceInfo, str, pullListener, pullHealthBiListener);
                return;
            }
        }
        if (iF == 0) {
            LogUtil.a("HealthCloudDownloadManager", "updateThirdPartyPlugin description file is updating");
        } else if (pullListener != null) {
            pullListener.onPullingChange(pisVar, pitVar);
        }
    }

    private void b(DeviceDownloadSourceInfo deviceDownloadSourceInfo, phz phzVar, String str, PullListener pullListener, PullHealthBiListener pullHealthBiListener) {
        if (phzVar != null) {
            if (!c(deviceDownloadSourceInfo.getIndexName(), str)) {
                c(deviceDownloadSourceInfo, str, pullListener, pullHealthBiListener);
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
        LogUtil.j("HealthCloudDownloadManager", "downloadDescription inform error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(final DeviceDownloadSourceInfo deviceDownloadSourceInfo, final String str, final PullListener pullListener, final PullHealthBiListener pullHealthBiListener) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ege
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32926b.c(deviceDownloadSourceInfo, str, pullListener, pullHealthBiListener);
                }
            });
            return;
        }
        String strD = d(deviceDownloadSourceInfo);
        phy phyVar = new phy();
        phyVar.e(str);
        phyVar.d(strD);
        phyVar.b(deviceDownloadSourceInfo);
        egf.b().b(phyVar, pullListener, new EzPluginPullerCallback() { // from class: egc
            @Override // com.huawei.pluginmgr.EzPluginPullerCallback
            public final void setEzPluginInfoCache(pic picVar, String str2) {
                this.f32921b.c(picVar, str2);
            }
        }, pullHealthBiListener);
    }

    private void a(DeviceDownloadSourceInfo deviceDownloadSourceInfo, phz phzVar, PullListener pullListener, PullHealthBiListener pullHealthBiListener) {
        LogUtil.a("HealthCloudDownloadManager", "checkAppVersion enter check version", phzVar == null ? ",checkAppVersion:ezPluginIndexInfo is null" : "");
        if (phzVar == null) {
            return;
        }
        String strA = phzVar.a();
        pim pimVarH = phzVar.h();
        if (pimVarH == null) {
            LogUtil.j("HealthCloudDownloadManager", "checkAppVersion no have ApplyRules");
            b(deviceDownloadSourceInfo, phzVar, strA, pullListener, pullHealthBiListener);
            return;
        }
        if (pimVarH.a() == null) {
            LogUtil.j("HealthCloudDownloadManager", "checkAppVersion not have minAppVersion");
            d(deviceDownloadSourceInfo, phzVar, pullListener, pullHealthBiListener);
            return;
        }
        int iN = CommonUtil.n(this.f32916a, pimVarH.a());
        int iE = CommonUtil.e(this.f32916a);
        LogUtil.a("HealthCloudDownloadManager", "checkAppVersion minAppVersionCode is ", Integer.valueOf(iN), " appCode is ", Integer.valueOf(iE));
        if (iE < iN) {
            pit pitVar = new pit();
            pis pisVar = new pis();
            pitVar.e(-30);
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        d(deviceDownloadSourceInfo, phzVar, pullListener, pullHealthBiListener);
    }

    private void d(DeviceDownloadSourceInfo deviceDownloadSourceInfo, phz phzVar, PullListener pullListener, PullHealthBiListener pullHealthBiListener) {
        pim pimVarH = phzVar.h();
        pit pitVar = new pit();
        pis pisVar = new pis();
        String strA = phzVar.a();
        if (this.f32917c != null) {
            if (pik.b(this.f32916a, pimVarH.b(), this.f32917c.d())) {
                b(deviceDownloadSourceInfo, phzVar, strA, pullListener, pullHealthBiListener);
                return;
            }
            LogUtil.a("HealthCloudDownloadManager", "checkIndexVersion indexVersion less than this plugin minIndexVersion");
            pitVar.e(-20);
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        LogUtil.j("HealthCloudDownloadManager", "checkIndexVersion mIndexFileStruct is null");
    }

    public void a(String str, String str2, PullListener pullListener) {
        String str3;
        if (pullListener == null) {
            LogUtil.a("HealthCloudDownloadManager", "checkPluginNewVersion callback is null");
            return;
        }
        LogUtil.a("HealthCloudDownloadManager", "enter checkPluginNewVersion");
        pit pitVar = new pit();
        pis pisVar = new pis();
        phz phzVarB = b(str, str2);
        pic picVarA = a(str, str2);
        if (picVarA == null || phzVarB == null) {
            LogUtil.j("HealthCloudDownloadManager", "checkPluginNewVersion ezPluginInfo is null");
            pitVar.e(20);
            pullListener.onPullingChange(pisVar, pitVar);
            return;
        }
        String strG = phzVarB.g();
        String strG2 = picVarA.g();
        String str4 = phzVarB.a() + "_version";
        String strE = SharedPreferenceManager.e(this.f32916a, String.valueOf(1003), str4);
        LogUtil.a("HealthCloudDownloadManager", "checkPluginNewVersion getKey is ", str4, ",spVersion is ", strE, ",indexPluginVersion is:", strG, ",descVersion is:", strG2);
        boolean zA = pik.a(strG2, strG);
        if (TextUtils.isEmpty(strG2) || !pik.e(str2)) {
            zA = true;
        }
        boolean zA2 = pik.a(strE, strG);
        if (zA || zA2) {
            str3 = "checkPluginNewVersion have new version";
        } else {
            str3 = "checkPluginNewVersion not have new version";
        }
        LogUtil.a("HealthCloudDownloadManager", str3);
        boolean zExists = new File(d(str2, "img")).exists();
        boolean zExists2 = new File(d(str2, "lang")).exists();
        LogUtil.a("HealthCloudDownloadManager", "imgFile is exist:", Boolean.valueOf(zExists), " langFile is exist:", Boolean.valueOf(zExists2));
        if (zA || zA2 || (!zExists && zExists2)) {
            pitVar.e(20);
            pullListener.onPullingChange(pisVar, pitVar);
        } else {
            pitVar.e(1);
            pullListener.onPullingChange(pisVar, pitVar);
        }
    }

    private String d(String str, String str2) {
        return egk.d(str) + File.separator + str + File.separator + str2;
    }

    public void b(DeviceDownloadSourceInfo deviceDownloadSourceInfo, String str, PullListener pullListener, PullHealthBiListener pullHealthBiListener) {
        if (deviceDownloadSourceInfo == null || pullListener == null) {
            LogUtil.a("HealthCloudDownloadManager", "ezPluginFileInfo or callback is null");
        } else {
            a(deviceDownloadSourceInfo, b(deviceDownloadSourceInfo.getIndexName(), str), pullListener, pullHealthBiListener);
        }
    }

    public void a(String str) {
        String strC = egk.c(str);
        if (new File(strC).exists()) {
            String strB = pik.b(this.f32916a, strC);
            LogUtil.a("HealthCloudDownloadManager", "index Data:", strB);
            if (TextUtils.isEmpty(strB)) {
                LogUtil.j("HealthCloudDownloadManager", "indexJson is null");
            } else {
                c(str, phw.c(strB));
            }
        }
    }

    public static void e() {
        pik.e(d);
    }

    private String d(DeviceDownloadSourceInfo deviceDownloadSourceInfo) {
        String downloadPluginUrl;
        String configurationPoint = deviceDownloadSourceInfo.getConfigurationPoint();
        DownloadPluginUrl downloadPluginUrlD = piu.c().d();
        if (downloadPluginUrlD != null && deviceDownloadSourceInfo.getSite() == 1) {
            downloadPluginUrl = b(downloadPluginUrlD);
            configurationPoint = c(configurationPoint);
        } else if (downloadPluginUrlD != null) {
            downloadPluginUrl = downloadPluginUrlD.getDownloadPluginUrl(null, true);
        } else {
            LogUtil.d("HealthCloudDownloadManager", "getDownLoadFileUrl is null");
            downloadPluginUrl = "";
        }
        return downloadPluginUrl + configurationPoint;
    }

    private String b(DownloadPluginUrl downloadPluginUrl) {
        String downloadPluginUrl2 = downloadPluginUrl.getDownloadPluginUrl("domainHealthCloudCommon", true);
        LogUtil.a("HealthCloudDownloadManager", "getDefaultHealthCloudUrl url null is ", downloadPluginUrl2);
        return downloadPluginUrl2 + "/commonAbility/configCenter/";
    }

    private String c(String str) {
        String strE = piu.e();
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        return str + "?Device-ID=" + strE;
    }

    private void f(String str) {
        String sharedPreference = getSharedPreference("key_ezplugin_healthcloud_mgr");
        Gson gson = new Gson();
        HashSet hashSet = (HashSet) gson.fromJson(sharedPreference, new TypeToken<HashSet<String>>() { // from class: com.huawei.health.ecologydevice.downloadutil.HealthCloudDownloadManager$1
        }.getType());
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        hashSet.add(str);
        setSharedPreference("key_ezplugin_healthcloud_mgr", gson.toJson(hashSet), null);
    }
}
