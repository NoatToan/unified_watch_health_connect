package defpackage;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.EzPluginPullerCallback;
import com.huawei.pluginmgr.filedownload.PullListener;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import health.compact.a.CommonUtil;
import health.compact.a.EzPluginManager;
import health.compact.a.IoUtils;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class pig {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f45427c = new Object();
    private static pig e;
    private Context d = BaseApplication.getContext();

    private pig() {
    }

    public static pig c() {
        pig pigVar;
        synchronized (f45427c) {
            if (e == null) {
                e = new pig();
            }
            pigVar = e;
        }
        return pigVar;
    }

    public void c(pis pisVar) {
        piu.c().a(pisVar);
    }

    public pis b(String str) {
        return piu.c().e(str);
    }

    public void c(String str, phy phyVar, String str2, boolean z, PullListener pullListener) {
        LogUtil.a("EzPlugin_EzPluginPuller", "pullIndexFile pull json task");
        pis pisVarE = e(str, phyVar, str2, z, pullListener);
        pisVarE.g(b(str, pisVarE, true));
        if (pip.f45447a.containsValue(str) || "device_index_all".equals(str) || "plugin_index".equals(str) || "index_sport_intensity".equals(pisVarE.b())) {
            c(str, phyVar, pisVarE);
            pisVarE.j("GET");
        }
        piu.c().e(pisVarE);
    }

    private pis e(String str, phy phyVar, String str2, boolean z, PullListener pullListener) {
        pis pisVar = new pis();
        pisVar.a(str2);
        pisVar.i(phyVar.d());
        pisVar.d(phyVar.a());
        pisVar.b(pullListener);
        pisVar.e(0);
        pisVar.d(z);
        pisVar.c(str);
        return pisVar;
    }

    private void c(String str, phy phyVar, pis pisVar) {
        String strD = phyVar.d();
        if ("device_index_all".equals(str)) {
            strD = phyVar.d() + "device_index_all";
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), strD);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        pisVar.e(strE);
    }

    private void d(String str, String str2, String str3, String str4, PullListener pullListener) {
        LogUtil.a("EzPlugin_EzPluginPuller", "pullDescriptionFile pull description task");
        pis pisVar = new pis();
        pisVar.g(b(c(str, str2, str3, pullListener, pisVar), pisVar, false));
        pisVar.d(str4);
        piu.c().e(pisVar);
    }

    private String c(String str, String str2, String str3, PullListener pullListener, pis pisVar) {
        pisVar.a(str3);
        pisVar.i(str2);
        pisVar.b(pullListener);
        pisVar.e(0);
        String str4 = str + "_description";
        pisVar.c(str4);
        return str4;
    }

    private String b(String str, pis pisVar, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!d(jSONObject, pisVar, z, true)) {
                jSONObject.put(RecommendConstants.FILE_ID, str);
                jSONObject.put(RecommendConstants.VER, "0");
            }
        } catch (JSONException unused) {
            LogUtil.e("EzPlugin_EzPluginPuller", "getDownloadParam JSONException");
        }
        return jSONObject.toString().trim();
    }

    private boolean d(JSONObject jSONObject, pis pisVar, boolean z, boolean z2) throws JSONException {
        String strJ = pisVar.j();
        if (TextUtils.isEmpty(strJ)) {
            return false;
        }
        int iIndexOf = strJ.indexOf("/commonAbility/configCenter/");
        pisVar.c(iIndexOf > 0);
        if (!z || !pisVar.f()) {
            return false;
        }
        pisVar.j("POST");
        a(jSONObject, pisVar, strJ, iIndexOf, z2);
        b(jSONObject);
        return true;
    }

    private void a(JSONObject jSONObject, pis pisVar, String str, int i, boolean z) throws JSONException {
        jSONObject.put("ts", System.currentTimeMillis());
        jSONObject.put("source", 1);
        int i2 = i + 28;
        pisVar.i(str.substring(0, i2) + "getConfigInfo");
        int iIndexOf = str.indexOf("?", i2);
        if (iIndexOf > 0) {
            jSONObject.put("configId", str.substring(i2, iIndexOf));
            if (z) {
                c(jSONObject, str.substring(iIndexOf + 1));
                return;
            }
            return;
        }
        jSONObject.put("configId", str.substring(i2));
    }

    private void c(JSONObject jSONObject, String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split("=");
        if (strArrSplit.length == 0 || strArrSplit.length % 2 != 0) {
            LogUtil.j("EzPlugin_EzPluginPuller", "not support queryString=\"", str, "\"");
            return;
        }
        HashMap map = new HashMap(strArrSplit.length / 2);
        for (int i = 0; i < strArrSplit.length; i += 2) {
            map.put(strArrSplit[i], strArrSplit[i + 1]);
        }
        jSONObject.put("matchRules", new JSONObject(map));
    }

    private void b(JSONObject jSONObject) throws JSONException {
        String strE = piu.e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        HashMap map = new HashMap(1);
        map.put("Device-ID", strE);
        jSONObject.put("greyRules", new JSONObject(map));
    }

    public void e(String str, String str2, String str3, pic picVar, PullListener pullListener) {
        LogUtil.a("EzPlugin_EzPluginPuller", "fileUrlJson is ", str3);
        e(str, new phy(str, str2, str3, picVar), null, pullListener);
    }

    public void c(phy phyVar, String str, PullListener pullListener) {
        e(phyVar.b(), phyVar, str, pullListener);
    }

    public void b(String str, phy phyVar, PullListener pullListener) {
        e(str, phyVar, e(phyVar.b()), pullListener);
    }

    private void e(final String str, phy phyVar, String str2, final PullListener pullListener) {
        c(str, phyVar, str2, new PullListener() { // from class: pig.4
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) throws Throwable {
                if (pitVar != null && pitVar.f() == 1) {
                    LogUtil.a("EzPlugin_EzPluginPuller", "onPullingChange onResult is 200");
                    String strA = pisVar.a();
                    if ("6d5416d9-2167-41df-ab10-c492e152b44f".equals(str)) {
                        strA = pig.this.e(str);
                    }
                    pig.this.b(strA, pullListener, pisVar, pitVar);
                    return;
                }
                PullListener pullListener2 = pullListener;
                if (pullListener2 != null) {
                    pullListener2.onPullingChange(pisVar, pitVar);
                }
            }
        });
    }

    private void c(String str, phy phyVar, String str2, PullListener pullListener) {
        pis pisVar = new pis();
        pic picVarC = phyVar.c();
        pisVar.i(phyVar.j());
        pisVar.d(phyVar.a());
        if ("6d5416d9-2167-41df-ab10-c492e152b44f".equals(str)) {
            String str3 = str + "_new_v1.1";
            pisVar.g(b(str3, pisVar, false));
            pisVar.a(phs.e);
            pisVar.c(str3);
        } else {
            pisVar.g(b(str, pisVar, false));
            pisVar.c(str);
        }
        e(phyVar, str2, pullListener, pisVar, picVarC);
    }

    private void e(phy phyVar, String str, PullListener pullListener, pis pisVar, pic picVar) {
        if (TextUtils.isEmpty(str)) {
            str = e(phyVar.b());
        }
        pisVar.a(str);
        pisVar.b(picVar.c());
        pisVar.b(pullListener);
        pisVar.e(CommonUtil.n(this.d, picVar.d()));
        pisVar.a(picVar.a());
        pisVar.h(phyVar.b());
        if (e() > picVar.a()) {
            LogUtil.a("EzPlugin_EzPluginPuller", "addTask plugin task");
            piu.c().e(pisVar);
        } else {
            LogUtil.a("EzPlugin_EzPluginPuller", "addTask this torage is not enough");
            pit pitVar = new pit();
            pitVar.e(-9);
            pullListener.onPullingChange(pisVar, pitVar);
        }
    }

    public void d(String str, String str2, PullListener pullListener, String str3) {
        LogUtil.a("EzPlugin_EzPluginPuller", "downloadDescription eneter downlodDescription.fileUrlJson is ", str3);
        b(str, str2, phs.d + str + File.separator + "description.json", str3, pullListener);
    }

    public void b(String str, String str2, final String str3, String str4, final PullListener pullListener) {
        d(str, str2, str3, str4, new PullListener() { // from class: pig.5
            @Override // com.huawei.pluginmgr.filedownload.PullListener
            public void onPullingChange(pis pisVar, pit pitVar) throws Throwable {
                pig.this.a(pisVar, pitVar, str3, pullListener, (EzPluginPullerCallback) null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(pis pisVar, pit pitVar, String str, PullListener pullListener, EzPluginPullerCallback ezPluginPullerCallback) throws Throwable {
        if (pitVar == null) {
            LogUtil.j("EzPlugin_EzPluginPuller", "downloadDescriptionFile onPullingChange result is null");
            pullListener.onPullingChange(pisVar, null);
            return;
        }
        int iF = pitVar.f();
        if (iF != 1) {
            if (iF == 0) {
                return;
            }
            pullListener.onPullingChange(pisVar, pitVar);
            return;
        }
        String strD = d(this.d, str);
        LogUtil.d("EzPlugin_EzPluginPuller", "downloadDescriptionFile descriptionJson success");
        pic picVarA = phw.a(strD);
        String strO = pisVar.o();
        if (ezPluginPullerCallback == null) {
            EzPluginManager.b().d(picVarA, strO);
        } else {
            ezPluginPullerCallback.setEzPluginInfoCache(picVarA, strO);
        }
        pitVar.b(picVarA.a());
        pullListener.onPullingChange(pisVar, pitVar);
    }

    private String d(Context context, String str) throws Throwable {
        FileInputStream fileInputStream;
        LogUtil.a("EzPlugin_EzPluginPuller", "enter readFileToData: filePath = ", str);
        FileInputStream fileInputStream2 = null;
        if (str == null || context == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(1024);
        try {
            try {
                fileInputStream = new FileInputStream(new File(str));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        sb.append(new String(bArr, 0, i, "UTF-8"));
                    }
                    IoUtils.c(fileInputStream);
                } catch (IOException unused) {
                    fileInputStream2 = fileInputStream;
                    LogUtil.e("EzPlugin_EzPluginPuller", "readFileToData IOException");
                    IoUtils.c(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(fileInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            }
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStream2;
        }
    }

    public String e(String str) {
        if ("6d5416d9-2167-41df-ab10-c492e152b44f".equals(str)) {
            return phs.e;
        }
        return phs.d + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, PullListener pullListener, pis pisVar, pit pitVar) throws Throwable {
        FileOutputStream fileOutputStream;
        LogUtil.a("EzPlugin_EzPluginPuller", "createDoneMarkFile enter create done file, path is ", str);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(str + File.separator + "done");
                if (!file.getParentFile().exists()) {
                    LogUtil.a("EzPlugin_EzPluginPuller", "createDoneMarkFile isDirMade is ", Boolean.valueOf(file.mkdir()));
                }
                if (!file.exists()) {
                    LogUtil.a("EzPlugin_EzPluginPuller", "createDoneMarkFile isNewFileCreated is ", Boolean.valueOf(file.createNewFile()));
                }
                String strValueOf = String.valueOf(new Date().getTime() / 1000);
                LogUtil.a("EzPlugin_EzPluginPuller", "createDoneMarkFile timeStamp is =", strValueOf);
                fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bytes = strValueOf.getBytes("UTF-8");
                    fileOutputStream.write(bytes, 0, bytes.length);
                    if (pullListener != null) {
                        pullListener.onPullingChange(pisVar, pitVar);
                    }
                    IoUtils.c(fileOutputStream);
                } catch (IOException unused) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e("EzPlugin_EzPluginPuller", "createDoneMarkFile createDoneFile IOException");
                    pitVar.e(-1);
                    if (pullListener != null) {
                        pullListener.onPullingChange(pisVar, pitVar);
                    }
                    IoUtils.c(fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(fileOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    public static long e() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(CommonUtil.f((Context) null).getPath());
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (IllegalArgumentException unused) {
            LogUtil.e("EzPlugin_EzPluginPuller", "getAvailCount Exception");
            return -1L;
        }
    }
}
