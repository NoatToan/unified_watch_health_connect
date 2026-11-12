package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ProgressListener;
import com.huawei.networkclient.ResultCallback;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.pluginsocialshare.cloud.bean.DataCallback;
import com.huawei.pluginsocialshare.cloud.suggestcloud.ContinuesDayCloudFactory;
import com.huawei.pluginsocialshare.cloud.suggestcloud.ShareDataCloudFactory;
import com.huawei.pluginsocialshare.cloud.themecloud.ThemeCloudApi;
import com.huawei.pluginsocialshare.cloud.themecloud.ThemeDataFactory;
import com.huawei.pluginsocialshare.cloud.themecloud.ThemeSignData;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class pkl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ThemeCloudApi f45543a = null;
    private static String e = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<gyc> f45544b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ShareDataCloudFactory f45545c = new ShareDataCloudFactory(BaseApplication.b());
    private static ContinuesDayCloudFactory d = new ContinuesDayCloudFactory(BaseApplication.b());
    private static ConcurrentHashMap<String, String> j = new ConcurrentHashMap<>();

    public static void c(pkw pkwVar, ResultCallback<pkt> resultCallback) {
        oet.d().c(pkwVar.getUrl(), f45545c.getHeaders(), ofe.c(f45545c.getBody(pkwVar)), pkt.class, resultCallback);
    }

    public static void c(pkv pkvVar, ResultCallback<pku> resultCallback) {
        oet.d().c(pkvVar.getUrl(), f45545c.getHeaders(), ofe.c(f45545c.getBody(pkvVar)), pku.class, resultCallback);
    }

    public static void a(pkx pkxVar, ResultCallback<plb> resultCallback) {
        oet.d().c(pkxVar.getUrl(), f45545c.getHeaders(), ofe.c(f45545c.getBody(pkxVar)), plb.class, resultCallback);
    }

    public static void c(Map map, ResultCallback<pkp> resultCallback) {
        oet.d().e(GRSManager.c(BaseApplication.b()).getUrl("marketingGateWayUrl") + "/gateway/app/v1/sport/getSportContinueDay", d.getHeaders(), map, pkp.class, resultCallback);
    }

    private static String e() throws IOException {
        if ("".equals(e)) {
            if (f45543a == null) {
                f45543a = (ThemeCloudApi) oet.d().e(ThemeCloudApi.class);
            }
            ThemeSignData themeSignData = new ThemeSignData(null);
            Response<ThemeSignData> responseExecute = f45543a.getThemeSign(themeSignData.getUrl(), themeSignData.getHeaders(), themeSignData.getBody(null)).execute();
            if (responseExecute.isOK()) {
                ThemeSignData body = responseExecute.getBody();
                if (body.d() == 0) {
                    return body.e();
                }
            } else {
                LogUtil.e("TAG_CloudDataManager", "getSign network error");
            }
            return "";
        }
        return e;
    }

    public static List<gyc> c(int i, boolean z) throws IOException {
        plh body;
        if (f45543a == null) {
            f45543a = (ThemeCloudApi) oet.d().e(ThemeCloudApi.class);
        }
        pkz pkzVar = new pkz();
        String strValueOf = String.valueOf(pmo.c(i));
        pkzVar.b(e());
        pkzVar.e(strValueOf);
        pkzVar.a(String.valueOf(pmo.e(i)));
        LogUtil.a("TAG_CloudDataManager", "cursor = ", strValueOf, " isAdd = ", Boolean.valueOf(z));
        pkzVar.d("0");
        if (qrs.af(BaseApplication.b())) {
            pkzVar.c(HealthZonePushReceiver.DEAUTH_EVENT_NOTIFY);
        } else {
            pkzVar.c("10");
        }
        ThemeDataFactory themeDataFactory = new ThemeDataFactory(null);
        Response<plh> responseExecute = f45543a.getThemeList(pkzVar.getUrl(), themeDataFactory.getHeaders(), ofe.c(themeDataFactory.getBody(pkzVar))).execute();
        if (!responseExecute.isOK() || (body = responseExecute.getBody()) == null) {
            return null;
        }
        if (body.b() != null && ("0".equals(body.b()) || "3".equals(body.b()))) {
            if ("0".equals(body.b())) {
                pmo.c(i, Integer.parseInt(body.c()));
            }
            LogUtil.a("TAG_CloudDataManager", "rsp:", body.b());
            List listE = e(body.d(), i, z);
            if (listE == null) {
                listE = new ArrayList();
            }
            c(listE);
            return f45544b;
        }
        LogUtil.j("TAG_CloudDataManager", "getThemeList responseCode :", body.b());
        return null;
    }

    private static List<gyc> e(List<plf> list, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        gyc gycVarA = pmo.a(i);
        for (plf plfVar : list) {
            if (plfVar != null && (gycVarA == null || !String.valueOf(gycVarA.getId()).equals(plfVar.c()))) {
                plg plgVar = new plg();
                pky pkyVarB = plfVar.b();
                if (pkyVarB != null) {
                    plgVar.c(pkyVarB.c());
                    plgVar.setImageSize(Integer.parseInt(pkyVarB.a()));
                }
                List<ple> listD = plfVar.d();
                if (!njy.e(listD)) {
                    plgVar.setUrl(listD.get(0).b());
                }
                String str = pld.f45587c + File.separator + d(plgVar.c());
                if (pnn.c(str)) {
                    plgVar.e(true);
                }
                plgVar.setPath(str);
                plgVar.setId(Integer.parseInt(plfVar.c()));
                plgVar.setType(2);
                plgVar.setWeight(10000);
                plgVar.setValidityType(1);
                plgVar.setType(2);
                plgVar.setSportTypes(String.valueOf(i));
                LogUtil.a("TAG_CloudDataManager", "parseBackgroundInfoList info id= ", Integer.valueOf(Integer.parseInt(plfVar.c())), "info weight= ", Integer.valueOf(plgVar.getWeight()));
                arrayList.add(plgVar);
            }
        }
        if (gycVarA != null && !z) {
            gycVarA.setWeight(10001);
            arrayList.add(gycVarA);
        }
        return arrayList;
    }

    private static void c(List<gyc> list) {
        f45544b.clear();
        f45544b.addAll(list);
    }

    public static void b(String str, String str2, final DataCallback dataCallback) {
        String strC = CommonUtil.c(str2);
        if (strC == null || dataCallback == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            dataCallback.onFailure(9999, "url is null");
            return;
        }
        if (!new File(strC).exists()) {
            HashMap map = new HashMap();
            String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011);
            String strC2 = CommonUtil.c(BaseApplication.b());
            if (accountInfo != null) {
                map.put("x-huid", accountInfo);
            }
            map.put("x-version", strC2);
            File file = new File(str2);
            if (e(file)) {
                j.put(str2, str);
                pla plaVar = new pla(str, map, file, new ProgressListener<File>() { // from class: pkl.5
                    @Override // com.huawei.networkclient.ProgressListener
                    public void onFail(Throwable th) {
                    }

                    @Override // com.huawei.networkclient.ProgressListener
                    public void onProgress(long j2, long j3, boolean z) {
                    }

                    @Override // com.huawei.networkclient.ProgressListener
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public void onFinish(File file2) {
                        try {
                            if (!file2.exists() || file2.length() <= 0) {
                                return;
                            }
                            LogUtil.a("TAG_CloudDataManager", "exit:", file2.getAbsolutePath());
                            pkl.j.remove(file2.getAbsolutePath());
                            dataCallback.onSuccess(pkl.e(0, file2.getAbsolutePath()));
                        } catch (JSONException e2) {
                            LogUtil.e("TAG_CloudDataManager", "download fail Exception:", ExceptionUtils.c(e2));
                        }
                    }
                }, dataCallback);
                LogUtil.a("TAG_CloudDataManager", "downloading ...");
                oet.d().a(plaVar);
                return;
            }
            return;
        }
        dataCallback.onSuccess(new JSONObject());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject e(int i, String str) throws JSONException {
        return new JSONObject().put("resultCode", i).put("data", str);
    }

    private static boolean e(File file) {
        boolean zExists;
        synchronized (pkl.class) {
            if (file.getParentFile() != null) {
                zExists = file.getParentFile().exists();
                if (!zExists) {
                    zExists = file.getParentFile().mkdirs();
                }
            } else {
                zExists = false;
            }
        }
        return zExists;
    }

    public static void d() {
        LogUtil.a("TAG_CloudDataManager", "cancel download");
        HashMap map = new HashMap();
        map.putAll(j);
        j.clear();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            try {
                oet.d().b((String) ((Map.Entry) it.next()).getValue());
            } catch (ConcurrentModificationException e2) {
                LogUtil.j("TAG_CloudDataManager", "cancelDownloadFile e:", e2.getMessage());
            }
        }
    }

    private static String d(String str) {
        if (StringUtils.g(str)) {
            return "";
        }
        String[] strArrSplit = str.split("\\?")[0].split("/");
        if (strArrSplit.length <= 0) {
            return "";
        }
        return strArrSplit[strArrSplit.length - 1];
    }
}
