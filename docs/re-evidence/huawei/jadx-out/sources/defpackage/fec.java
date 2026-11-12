package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.health.healthcloudconfig.listener.featureconfig.ConfigFileCallback;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fec {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile fec f33931b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f33930a = new Object();
    private static Map<String, ConfigFileCallback> e = new HashMap();

    private fec() {
    }

    public static fec d() {
        if (f33931b == null) {
            synchronized (fec.class) {
                if (f33931b == null) {
                    f33931b = new fec();
                }
            }
        }
        return f33931b;
    }

    public void a(String str, ConfigFileCallback configFileCallback) {
        LogUtil.a("FeatureConfigFileManager", "registerConfigFileInfoListener ConfigFileListener register start");
        if (configFileCallback == null || TextUtils.isEmpty(str)) {
            LogUtil.a("FeatureConfigFileManager", "registerConfigFileInfoListener DeviceIdentify or callback is null");
            return;
        }
        synchronized (f33930a) {
            if (e.containsKey(str)) {
                LogUtil.a("FeatureConfigFileManager", "registerConfigFileInfoListener Callback register failed: Device [", str, "] is already exist");
            } else {
                e.put(str, configFileCallback);
                LogUtil.a("FeatureConfigFileManager", "registerConfigFileInfoListener Device [", str, "] has been registered, current map size: ", Integer.valueOf(e.size()));
            }
        }
    }

    public void e(String str) {
        LogUtil.a("FeatureConfigFileManager", "unregisterConfigFileInfoListener ConfigFileListener unregistered start");
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("FeatureConfigFileManager", "unregisterConfigFileInfoListener DeviceIdentify is null");
            return;
        }
        synchronized (f33930a) {
            Map<String, ConfigFileCallback> map = e;
            if (map == null) {
                LogUtil.e("FeatureConfigFileManager", "unregisterConfigFileInfoListener Callback map does not exist, unregister failed");
            } else {
                map.remove(str);
                LogUtil.a("FeatureConfigFileManager", "unregisterConfigFileInfoListener Device [", str, "] has been unregistered, current map size: ", Integer.valueOf(e.size()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(String str) {
        try {
            return new JSONObject(CommonUtil.q(str)).getInt(RecommendConstants.VER);
        } catch (JSONException unused) {
            LogUtil.e("FeatureConfigFileManager", "getConfigFileVersion failed with JSONException");
            return -2;
        }
    }

    private ConfigFileCallback b(String str) {
        synchronized (f33930a) {
            Map<String, ConfigFileCallback> map = e;
            if (map == null) {
                return null;
            }
            return map.get(str);
        }
    }

    private String d(fdk fdkVar) {
        if (fdkVar == null) {
            return "";
        }
        String strC = fdkVar.c();
        return strC.endsWith(".txt") ? strC.substring(0, strC.lastIndexOf(".")) : strC;
    }

    public boolean d(String str) {
        if (str == null) {
            LogUtil.e("FeatureConfigFileManager", "isUpdate input hexString is null value");
            return false;
        }
        try {
            fdr fdrVar = (fdr) HiJsonUtil.d(HEXUtils.b(str), fdr.class);
            if (fdrVar == null) {
                LogUtil.e("FeatureConfigFileManager", "isUpdate input queryParams is null value");
                return false;
            }
            String strA = fdrVar.a();
            LogUtil.a("FeatureConfigFileManager", "queryConfigFileInfo: configId: ", strA);
            return !TextUtils.isEmpty(strA) && e(a(fdrVar), strA) == 1;
        } catch (JsonSyntaxException e2) {
            LogUtil.e("FeatureConfigFileManager", "queryConfigFileInfo Exception: ", e2.getMessage());
            return false;
        }
    }

    private void d(ConfigFileCallback configFileCallback, List<String> list, String str, String str2, String str3) {
        LogUtil.e("FeatureConfigFileManager", str3);
        configFileCallback.onFileResponse(list, str, str2);
    }

    public void b(String str, String str2, ConfigFileCallback configFileCallback) {
        if (configFileCallback == null) {
            LogUtil.e("FeatureConfigFileManager", "queryConfigFileInfo FileCallback is null");
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            d(configFileCallback, new ArrayList(), null, str2, "queryConfigFileInfo input params contains empty value");
            return;
        }
        String strB = HEXUtils.b(str);
        try {
            fdr fdrVar = (fdr) HiJsonUtil.d(strB, fdr.class);
            if (fdrVar == null) {
                d(configFileCallback, new ArrayList(), strB, str2, "queryConfigFileInfo QueryParams is null");
                return;
            }
            String strA = fdrVar.a();
            LogUtil.a("FeatureConfigFileManager", "queryConfigFileInfo: configId: ", strA);
            if (TextUtils.isEmpty(strA)) {
                d(configFileCallback, new ArrayList(), strB, str2, "queryConfigFileInfo ConfigId is null");
                return;
            }
            List<fdk> listA = a(fdrVar);
            fdrVar.e(d(fdrVar));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            b(strA, listA, arrayList, arrayList2);
            if (arrayList.size() == 0) {
                LogUtil.a("FeatureConfigFileManager", "queryConfigFileInfo No file needs to update, directly receive");
                configFileCallback.onFileResponse(arrayList2, HiJsonUtil.d(fdrVar), str2);
                return;
            }
            LogUtil.a("FeatureConfigFileManager", "queryConfigFileInfo ", Integer.valueOf(arrayList.size()), "files need to update, downloading");
            fdrVar.d(listA);
            d dVar = new d(arrayList, fdrVar, arrayList2, str2, configFileCallback);
            HashMap map = new HashMap();
            map.put("configType", TrackConstants$Events.FEATURE);
            fdy.a(new fda("com.huawei.health_deviceFeature_config", map), "FeatureConfigFileManager_BatchUpdateRequirement", arrayList, dVar);
        } catch (JsonSyntaxException e2) {
            d(configFileCallback, new ArrayList(), strB, str2, "queryConfigFileInfo Exception: " + e2.getMessage());
        }
    }

    private void b(String str, List<fdk> list, List<String> list2, List<String> list3) {
        for (fdk fdkVar : list) {
            String strD = d(fdkVar);
            String strD2 = fdy.d(str, strD, ".txt");
            int iA = a(strD2);
            int iA2 = fdkVar.a();
            list3.add(strD2);
            if (iA < iA2) {
                list2.add(strD);
            } else {
                fdkVar.a(iA);
            }
        }
    }

    static class d implements DownloadCallback<List<File>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List<String> f33932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        fdr f33933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f33934c;
        ConfigFileCallback d;
        List<String> e;

        d(List<String> list, fdr fdrVar, List<String> list2, String str, ConfigFileCallback configFileCallback) {
            this.f33932a = list;
            this.f33933b = fdrVar;
            this.e = list2;
            this.f33934c = str;
            this.d = configFileCallback;
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onFinish(List<File> list) {
            LogUtil.a("FeatureConfigFileManager", "updateFeatureConfig onFinish, data is: ", HiJsonUtil.d(list));
            for (String str : this.f33932a) {
                String strD = fdy.d(this.f33933b.a(), str, ".txt");
                e(str + ".txt", strD, fec.a(strD));
            }
            this.d.onFileResponse(this.e, HiJsonUtil.d(this.f33933b), this.f33934c);
        }

        private void e(String str, String str2, int i) {
            for (fdk fdkVar : this.f33933b.e()) {
                if (fdkVar.c().equals(str)) {
                    this.e.add(str2);
                    fdkVar.a(i);
                }
            }
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onProgress(long j, long j2, boolean z, String str) {
            LogUtil.a("FeatureConfigFileManager", "updateFeatureConfig onProgress, handleBytes: ", Long.valueOf(j), ", contentLength: ", Long.valueOf(j2), ", isDone: ", Boolean.valueOf(z), ", fileId: ", str);
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onFail(int i, Throwable th) {
            LogUtil.a("FeatureConfigFileManager", "updateFeatureConfig on Fail: ", th.getMessage(), ", errCode: ", Integer.valueOf(i));
            this.d.onFileResponse(new ArrayList(), HiJsonUtil.d(this.f33933b), this.f33934c);
        }
    }

    private int e(List<fdk> list, String str) {
        for (fdk fdkVar : list) {
            if (a(fdy.d(str, d(fdkVar), ".txt")) != fdkVar.a()) {
                return 1;
            }
        }
        return 0;
    }

    private List<fdj> d(fdr fdrVar) {
        List<fdj> listC = fdrVar.c();
        Iterator<fdj> it = listC.iterator();
        while (it.hasNext()) {
            fdj next = it.next();
            if (next == null || TextUtils.isEmpty(next.c())) {
                it.remove();
            }
        }
        if (listC.size() == 0) {
            fdj fdjVar = new fdj();
            fdjVar.e(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
            listC.add(fdjVar);
        }
        fdrVar.e(listC);
        return listC;
    }

    private List<fdk> a(fdr fdrVar) {
        List<fdk> listE = fdrVar.e();
        Iterator<fdk> it = listE.iterator();
        while (it.hasNext()) {
            fdk next = it.next();
            if (next == null || TextUtils.isEmpty(next.c())) {
                it.remove();
            }
        }
        if (listE.size() == 0) {
            fdk fdkVar = new fdk();
            fdkVar.e("feature_" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010) + "_device.txt");
            fdkVar.a(-1);
            listE.add(fdkVar);
        }
        fdrVar.d(listE);
        return listE;
    }

    public void b(String str, String str2, String str3) {
        LogUtil.a("FeatureConfigFileManager", "notifyUpdate start");
        String strD = fdy.d(str, str2, ".txt");
        ArrayList arrayList = new ArrayList();
        arrayList.add(strD);
        fdr fdrVar = new fdr(str);
        try {
            JSONObject jSONObject = new JSONObject(CommonUtil.q(strD));
            int i = jSONObject.getInt(RecommendConstants.VER);
            fdk fdkVar = new fdk();
            fdkVar.e(new File(strD).getName());
            fdkVar.a(i);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(fdkVar);
            fdrVar.d(arrayList2);
            String string = jSONObject.getString("country");
            fdj fdjVar = new fdj();
            fdjVar.e(string);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(fdjVar);
            fdrVar.e(arrayList3);
            LogUtil.a("FeatureConfigFileManager", "notifyUpdate Return param generate success");
            if (!TextUtils.isEmpty(str3)) {
                ConfigFileCallback configFileCallbackB = b(str3);
                if (configFileCallbackB != null) {
                    configFileCallbackB.onFileResponse(arrayList, HiJsonUtil.d(fdrVar), str3);
                    return;
                } else {
                    LogUtil.e("FeatureConfigFileManager", "notifyUpdate Callback not registered");
                    return;
                }
            }
            for (String str4 : e.keySet()) {
                ConfigFileCallback configFileCallbackB2 = b(str4);
                if (configFileCallbackB2 != null) {
                    configFileCallbackB2.onFileResponse(arrayList, HiJsonUtil.d(fdrVar), str4);
                }
            }
        } catch (JSONException unused) {
            LogUtil.e("FeatureConfigFileManager", "notifyUpdate: JSONException");
        } catch (Exception unused2) {
            LogUtil.e("FeatureConfigFileManager", "notifyUpdate: Uncaught Exception occurs");
        }
    }
}
