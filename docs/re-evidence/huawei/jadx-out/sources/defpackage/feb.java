package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class feb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile feb f33929a;
    private static fdp d;

    private feb() {
    }

    public static feb c() {
        if (f33929a == null) {
            synchronized (feb.class) {
                if (f33929a == null) {
                    f33929a = new feb();
                }
            }
        }
        return f33929a;
    }

    public void c(fdp fdpVar) {
        d = fdpVar;
    }

    public String d(String str) {
        Map<String, String> mapE;
        fdp fdpVar = d;
        if (fdpVar == null || fdpVar.a() == null || (mapE = d.a().e()) == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return mapE.get(str);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URI(str).getPath();
            if (TextUtils.isEmpty(path)) {
                return "";
            }
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String[] strArrSplit = path.split("/");
            if (strArrSplit.length > 0) {
                String str2 = strArrSplit[0];
                if (!TextUtils.isEmpty(str2)) {
                    return str2.toLowerCase(Locale.ENGLISH);
                }
            }
        } catch (Exception e) {
            LogUtil.e("MyHuawei", "extractCountryCodeFromUrl error", e);
        }
        return "";
    }

    public boolean c(String str) {
        fdp fdpVar = d;
        if (fdpVar == null || fdpVar.a() == null || TextUtils.isEmpty(str)) {
            return false;
        }
        List<String> listE = e();
        if (listE.isEmpty()) {
            return false;
        }
        return listE.contains(str.toLowerCase(Locale.ENGLISH));
    }

    public List<String> e() {
        List<String> listC;
        fdp fdpVar = d;
        return (fdpVar == null || fdpVar.a() == null || (listC = d.a().c()) == null) ? new ArrayList() : listC;
    }

    public static int b() {
        fdp fdpVar = d;
        if (fdpVar != null) {
            return fdpVar.d();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a() {
        fdp fdpVar;
        String strC = c(BaseApplication.getContext());
        Gson gson = new Gson();
        try {
            fdpVar = !TextUtils.isEmpty(strC) ? (fdp) gson.fromJson(strC, fdp.class) : null;
        } catch (Exception e) {
            LogUtil.e("MyHuaweiConfigManager", "Parse Cloud MyHuaweiFileInfo failed: " + e.getMessage());
        }
        if (fdpVar != null) {
            LogUtil.a("MyHuaweiConfigManager", "Cloud data exists, overriding with cloud config.");
            c().c(fdpVar);
            LogUtil.a("MyHuaweiConfigManager", "MyHuaweiFileInfo (Cloud): " + gson.toJson(fdpVar));
            return;
        }
        LogUtil.a("MyHuaweiConfigManager", "Cloud data invalid, loading default fallback config.");
        h();
    }

    private static String c(Context context) {
        String strC = CommonUtil.c(fdy.d("com.huawei.health_overseas_united_login_config", "myhuawei", "json"));
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("MyHuaweiConfigManager", "cloudConfigPath is illegal!");
            return null;
        }
        String strA = pia.a(new File(strC));
        LogUtil.j("MyHuaweiConfigManager", "EzPluginHelper.readFileToData jsonData = ", strA);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = a(context);
        LogUtil.j("MyHuaweiConfigManager", "parseAssestsJsonFile jsonData = ", strA2);
        return strA2;
    }

    private static String a(Context context) {
        try {
            return e(context.getAssets().open("myhuawei.json"));
        } catch (IOException unused) {
            LogUtil.e("MyHuaweiConfigManager", "getString IOException");
            return "";
        }
    }

    private static String e(InputStream inputStream) {
        String str = "";
        try {
            if (inputStream == null) {
                return "";
            }
            try {
                byte[] bArr = new byte[inputStream.available()];
                if (inputStream.read(bArr) > 0) {
                    str = new String(bArr, "UTF-8");
                }
            } catch (IOException unused) {
                LogUtil.e("MyHuaweiConfigManager", "getString IOException");
            }
            return str;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                LogUtil.e("MyHuaweiConfigManager", "getString ioException");
            }
        }
    }

    public void d(DownloadCallback<File> downloadCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis() - fdy.c("com.huawei.health_overseas_united_login_config_myhuawei");
        String strC = fdy.c("com.huawei.health_overseas_united_login_config", "myhuawei");
        if (jCurrentTimeMillis < 86400000 && jCurrentTimeMillis > 0 && strC != null) {
            LogUtil.a("MyHuaweiConfigManager", "downloadFiles, no need to update.");
            a();
            return;
        }
        HashMap map = new HashMap();
        if (CommonUtil.bu()) {
            map.put("configType", "RELEASE");
        } else if (CommonUtil.cl()) {
            map.put("configType", "TEST");
        } else {
            map.put("configType", "BETA");
        }
        fdy.d(new fda("com.huawei.health_overseas_united_login_config", map), "myhuawei", e("com.huawei.health_overseas_united_login_config_myhuawei"));
    }

    private static DownloadCallback<File> e(final String str) {
        return new DownloadCallback<File>() { // from class: feb.1
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onFinish(File file) {
                LogUtil.a("MyHuaweiConfigManager", "updateMyHuaweiConfig onFinish, data is: ", file.getName());
                fdy.c(System.currentTimeMillis(), str);
                feb.a();
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str2) {
                LogUtil.a("MyHuaweiConfigManager", "updateMyHuaweiConfig onProgress, handleBytes: ", Long.valueOf(j), ", contentLength: ", Long.valueOf(j2), ", isDone: ", Boolean.valueOf(z), ", fileId: ", str2);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                LogUtil.a("MyHuaweiConfigManager", "updateMyHuaweiConfig on Fail: ", LogAnonymous.b(th), ", errCode: ", Integer.valueOf(i));
                feb.a();
            }
        };
    }

    private static void h() {
        if (d == null) {
            AssetManager assets = BaseApplication.getContext().getAssets();
            try {
                if (assets.open("myhuawei.json") != null) {
                    d = (fdp) lls.a(assets.open("myhuawei.json"), fdp.class);
                    c().c(d);
                }
            } catch (IOException e) {
                ReleaseLogUtil.a("MyHuaweiConfigManager", "loadDefaultMyHuweiConfig failed, ", LogAnonymous.b(e));
            }
            LogUtil.a("MyHuaweiConfigManager", "mFileInfo : ", Integer.valueOf(b()));
        }
    }
}
