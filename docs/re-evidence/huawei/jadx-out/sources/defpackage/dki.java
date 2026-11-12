package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.haf.download.DownloadPluginUrl;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.configresource.downloaddevicemanager.DownloadPullerCallback;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DeviceDownloadSourceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.filedownload.PullHealthBiListener;
import com.huawei.pluginmgr.filedownload.PullListener;
import health.compact.a.CommonUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes26.dex */
public class dki extends HwBaseManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<edl> f31854a = new ArrayList(16);
    private static volatile dki e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private dkw f31855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f31856c;
    private Map<String, dkw> d;

    private dki(Context context) {
        super(context);
        this.f31855b = new dkw();
        this.d = new HashMap();
        this.f31856c = BaseApplication.getContext();
    }

    public static dki a() {
        if (e == null) {
            synchronized (dll.e) {
                if (e == null) {
                    e = new dki(BaseApplication.getContext());
                }
            }
        }
        return e;
    }

    private edx e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("DownloadHealthCloudManager", "getPluginIndexInfo uuid is empty");
            return null;
        }
        List<edx> listC = c(str);
        if (!njy.e(listC)) {
            LogUtil.d("DownloadHealthCloudManager", "getPluginIndexInfo indexInfos size is :", Integer.valueOf(listC.size()));
            for (edx edxVar : listC) {
                if (str2.equals(edxVar.b())) {
                    return edxVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public edl d(String str, String str2) {
        edl edlVarA = dll.a(this.f31855b, f31854a, str2);
        if (edlVarA != null) {
            LogUtil.d("DownloadHealthCloudManager", "getPluginInfo get cachePluginInfo");
            return edlVarA;
        }
        boolean zA = a(str, str2);
        LogUtil.a("DownloadHealthCloudManager", "enter to getPluginInfo isDeprecated is :", Boolean.valueOf(zA));
        edl edlVarC = !zA ? dll.c(this.f31856c, str2) : null;
        c(edlVarC, str2);
        return edlVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(edl edlVar, String str) {
        dll.a(f31854a, edlVar, str);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 20010;
    }

    private dkw e(String str) {
        return this.d.get(str);
    }

    private void a(String str, dkw dkwVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d.put(str, dkwVar);
    }

    private List<edx> c() {
        LogUtil.d("DownloadHealthCloudManager", "getIndexList enter to GetPluginsIndexInfos");
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(dkg.d().e());
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            List<edx> listQ = ((eds) copyOnWriteArrayList.get(i)).q();
            if (listQ != null && listQ.size() > 0) {
                arrayList.addAll(((eds) copyOnWriteArrayList.get(i)).q());
            }
        }
        String strC = dll.c();
        boolean zExists = new File(strC).exists();
        LogUtil.a("DownloadHealthCloudManager", "getIndexList isExistThisIndex is =", Boolean.valueOf(zExists));
        if (zExists) {
            String strA = dll.a(this.f31856c, strC);
            LogUtil.d("DownloadHealthCloudManager", "getIndex indexJson = ", strA);
            d(strA);
        }
        if (this.f31855b.b() != null) {
            arrayList.addAll(this.f31855b.b());
        }
        return arrayList;
    }

    private List<edx> b(String str) {
        dkw dkwVarE = e(str);
        List<edx> listB = dkwVarE != null ? dkwVarE.b() : null;
        if (listB == null) {
            String strA = dll.a(str);
            if (new File(strA).exists()) {
                String strA2 = dll.a(this.f31856c, strA);
                LogUtil.a("DownloadHealthCloudManager", "index Data:", strA2, TextUtils.isEmpty(strA2) ? ",indexJson is null" : "");
                if (!TextUtils.isEmpty(strA2)) {
                    dkw dkwVarA = dlb.a(strA2);
                    a(str, dkwVarA);
                    return dkwVarA.b();
                }
            }
        }
        return listB;
    }

    private List<edx> c(String str) {
        LogUtil.d("DownloadHealthCloudManager", "getAllIndexList");
        ArrayList arrayList = new ArrayList();
        List<edx> listB = b(str);
        if (listB != null) {
            arrayList.addAll(listB);
        }
        List<edx> listC = c();
        if (listC != null) {
            arrayList.addAll(listC);
        }
        return arrayList;
    }

    private void d(String str) {
        String strC;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DownloadHealthCloudManager", "parseVersionIndexFile indexJson is null");
            return;
        }
        try {
            dkw dkwVar = this.f31855b;
            if (dkwVar == null) {
                strC = "";
            } else {
                strC = dkwVar.c();
            }
            if (TextUtils.isEmpty(strC)) {
                this.f31855b = dlb.a(str);
                b();
            } else {
                if (strC.equals(new JSONObject(str).optString("version"))) {
                    return;
                }
                this.f31855b = dlb.a(str);
                b();
            }
        } catch (JSONException unused) {
            LogUtil.e("DownloadHealthCloudManager", "parseVersionIndexFile JSONException");
        }
    }

    private boolean a(String str, String str2) {
        return dll.a(str2, e(str, str2));
    }

    public void c(final DeviceDownloadSourceInfo deviceDownloadSourceInfo, final String str, final PullListener pullListener, final PullHealthBiListener pullHealthBiListener) {
        edl edlVarD = d(deviceDownloadSourceInfo.getIndexName(), str);
        if (edlVarD != null && !TextUtils.isEmpty(str) && str.equals(edlVarD.c())) {
            dky dkyVar = new dky(str, c(deviceDownloadSourceInfo), null, edlVarD);
            dkyVar.a(deviceDownloadSourceInfo);
            dli.c().e(str + "_new_v1.1", dkyVar, pullListener, pullHealthBiListener);
            return;
        }
        b(deviceDownloadSourceInfo, str, new PullListener() { // from class: dki.5
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) {
                int iF = pitVar.f();
                if (iF == 1) {
                    if (dki.this.d(deviceDownloadSourceInfo.getIndexName(), str) == null) {
                        LogUtil.j("DownloadHealthCloudManager", "updateThirdPartyPlugin inform error");
                        return;
                    } else {
                        dki.this.c(deviceDownloadSourceInfo, str, pullListener, pullHealthBiListener);
                        return;
                    }
                }
                if (iF == 0) {
                    LogUtil.a("DownloadHealthCloudManager", "updateThirdPartyPlugin description file is updating");
                    return;
                }
                PullListener pullListener2 = pullListener;
                if (pullListener2 != null) {
                    pullListener2.onPullingChange(pisVar, pitVar);
                }
            }
        }, pullHealthBiListener);
    }

    private void b(DeviceDownloadSourceInfo deviceDownloadSourceInfo, edx edxVar, String str, PullListener pullListener, PullHealthBiListener pullHealthBiListener) {
        if (edxVar != null) {
            if (!a(deviceDownloadSourceInfo.getIndexName(), str)) {
                d(deviceDownloadSourceInfo, str, pullListener, pullHealthBiListener);
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
        LogUtil.j("DownloadHealthCloudManager", "downloadDescription inform error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final DeviceDownloadSourceInfo deviceDownloadSourceInfo, final String str, final PullListener pullListener, final PullHealthBiListener pullHealthBiListener) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: dki.3
                @Override // java.lang.Runnable
                public void run() {
                    dki.this.d(deviceDownloadSourceInfo, str, pullListener, pullHealthBiListener);
                }
            });
            return;
        }
        String strC = c(deviceDownloadSourceInfo);
        dky dkyVar = new dky();
        dkyVar.a(str);
        dkyVar.e(strC);
        dkyVar.a(deviceDownloadSourceInfo);
        dli.c().b(dkyVar, pullListener, new DownloadPullerCallback() { // from class: dki.2
            @Override // com.huawei.health.configresource.downloaddevicemanager.DownloadPullerCallback
            public void setDescriptionInfoCache(edl edlVar, String str2) {
                dki.this.c(edlVar, str2);
            }
        }, pullHealthBiListener);
    }

    private void a(DeviceDownloadSourceInfo deviceDownloadSourceInfo, edx edxVar, PullListener pullListener, PullHealthBiListener pullHealthBiListener) {
        LogUtil.a("DownloadHealthCloudManager", "checkAppVersion enter check version", edxVar == null ? ",checkAppVersion:indexInfo is null" : "");
        if (edxVar == null) {
            return;
        }
        String strB = edxVar.b();
        edw edwVarA = edxVar.a();
        if (edwVarA == null) {
            LogUtil.j("DownloadHealthCloudManager", "checkAppVersion no have ApplyRules");
            b(deviceDownloadSourceInfo, edxVar, strB, pullListener, pullHealthBiListener);
            return;
        }
        if (edwVarA.a() == null) {
            LogUtil.j("DownloadHealthCloudManager", "checkAppVersion not have minAppVersion");
            d(deviceDownloadSourceInfo, edxVar, pullListener, pullHealthBiListener);
            return;
        }
        int iN = CommonUtil.n(this.f31856c, edwVarA.a());
        int iE = CommonUtil.e(this.f31856c);
        LogUtil.a("DownloadHealthCloudManager", "checkAppVersion minAppVersionCode is ", Integer.valueOf(iN), " appCode is ", Integer.valueOf(iE));
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
        d(deviceDownloadSourceInfo, edxVar, pullListener, pullHealthBiListener);
    }

    private void d(DeviceDownloadSourceInfo deviceDownloadSourceInfo, edx edxVar, PullListener pullListener, PullHealthBiListener pullHealthBiListener) {
        edw edwVarA = edxVar.a();
        pit pitVar = new pit();
        pis pisVar = new pis();
        String strB = edxVar.b();
        if (this.f31855b != null) {
            if (dll.d(this.f31856c, edwVarA.e(), this.f31855b.c())) {
                b(deviceDownloadSourceInfo, edxVar, strB, pullListener, pullHealthBiListener);
                return;
            }
            LogUtil.a("DownloadHealthCloudManager", "checkIndexVersion indexVersion less than this plugin minIndexVersion");
            pitVar.e(-20);
            if (pullListener != null) {
                pullListener.onPullingChange(pisVar, pitVar);
                return;
            }
            return;
        }
        LogUtil.j("DownloadHealthCloudManager", "checkIndexVersion mIndexFileStruct is null");
    }

    public void b(DeviceDownloadSourceInfo deviceDownloadSourceInfo, String str, PullListener pullListener, PullHealthBiListener pullHealthBiListener) {
        if (deviceDownloadSourceInfo == null || pullListener == null) {
            LogUtil.a("DownloadHealthCloudManager", "ezPluginFileInfo or callback is null");
        } else {
            a(deviceDownloadSourceInfo, e(deviceDownloadSourceInfo.getIndexName(), str), pullListener, pullHealthBiListener);
        }
    }

    private static void b() {
        dll.a(f31854a);
    }

    private String c(DeviceDownloadSourceInfo deviceDownloadSourceInfo) {
        String downloadPluginUrl;
        String configurationPoint = deviceDownloadSourceInfo.getConfigurationPoint();
        DownloadPluginUrl downloadPluginUrlD = piu.c().d();
        if (downloadPluginUrlD != null && deviceDownloadSourceInfo.getSite() == 1) {
            downloadPluginUrl = a(downloadPluginUrlD);
            configurationPoint = a(configurationPoint);
        } else if (downloadPluginUrlD != null) {
            downloadPluginUrl = downloadPluginUrlD.getDownloadPluginUrl(null, true);
        } else {
            LogUtil.d("DownloadHealthCloudManager", "getDownLoadFileUrl is null");
            downloadPluginUrl = "";
        }
        return downloadPluginUrl + configurationPoint;
    }

    private String a(DownloadPluginUrl downloadPluginUrl) {
        String downloadPluginUrl2 = downloadPluginUrl.getDownloadPluginUrl("domainHealthCloudCommon", true);
        LogUtil.a("DownloadHealthCloudManager", "getDefaultHealthCloudUrl url null is ", downloadPluginUrl2);
        return downloadPluginUrl2 + "/commonAbility/configCenter/";
    }

    private String a(String str) {
        String strE = piu.e();
        if (TextUtils.isEmpty(strE)) {
            return str;
        }
        return str + "?Device-ID=" + strE;
    }
}
