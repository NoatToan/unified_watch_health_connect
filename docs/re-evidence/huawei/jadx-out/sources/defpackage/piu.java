package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.security.SecurityUtils;
import com.huawei.haf.download.DownloadPluginUrl;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.hms.network.embedded.b6;
import com.huawei.hms.network.embedded.r1;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.CommonApi;
import com.huawei.pluginmgr.filedownload.FilePullerApi;
import com.huawei.pluginmgr.filedownload.PullListener;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.tencent.open.SocialOperation;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.IoUtils;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class piu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f45461a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f45462b = "and_health_" + EnvironmentUtils.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static piu f45463c;
    private static String d;
    private DownloadPluginUrl j;
    private ConcurrentHashMap<pis, pit> i = new ConcurrentHashMap<>(16);
    private ThreadPoolManager f = ThreadPoolManager.b(5, 5, "FilePuller");
    private Context e = BaseApplication.getContext();

    public static piu c() {
        piu piuVar;
        synchronized (f45461a) {
            if (f45463c == null) {
                f45463c = new piu();
            }
            piuVar = f45463c;
        }
        return piuVar;
    }

    public static String a() {
        return d;
    }

    public static void a(String str) {
        d = str;
    }

    public void c(DownloadPluginUrl downloadPluginUrl) {
        LogUtil.a("EzPlugin_FilePuller", "enter setDownloadPluginUrl.");
        this.j = downloadPluginUrl;
    }

    public DownloadPluginUrl d() {
        LogUtil.a("EzPlugin_FilePuller", "getDownloadPluginUrl.");
        return this.j;
    }

    public static boolean b(String str, String str2) {
        if (str != null) {
            String strA = SecurityUtils.a(new File(str2), (byte[]) null, true);
            LogUtil.a("EzPlugin_FilePuller", "verifyHashCode digest is =", str, " hashcode is =", strA);
            if (!str.equalsIgnoreCase(strA)) {
                LogUtil.a("EzPlugin_FilePuller", "verifyHashCode hashcode checkout failure");
                d(new File(str2), "verifyHashCode deleteFile is = ");
                return false;
            }
            LogUtil.a("EzPlugin_FilePuller", "verifyHashCode hashcode checkout success");
        }
        return true;
    }

    private static void d(File file, String str) {
        if (file.exists() && file.isFile()) {
            LogUtil.a("EzPlugin_FilePuller", str, Boolean.valueOf(file.delete()));
        }
    }

    private static String a(pis pisVar, pit pitVar) {
        String strE;
        String strH = pisVar.h();
        if (!TextUtils.isEmpty(strH)) {
            return strH;
        }
        LogUtil.a("EzPlugin_FilePuller", "getFileUrl start: ", pisVar.j());
        String strTrim = null;
        if (TextUtils.isEmpty(pisVar.j())) {
            LogUtil.j("EzPlugin_FilePuller", "getFileUrl http url isEmpty");
            return null;
        }
        if (b(pisVar.j())) {
            strE = b(pisVar, pitVar);
        } else {
            strE = e(pisVar, pitVar);
        }
        if (!TextUtils.isEmpty(strE)) {
            strTrim = strE.trim();
            if ("Not Modified".equals(strTrim)) {
                return strTrim;
            }
        }
        if ("plugin_index".equals(pisVar.b())) {
            LogUtil.d("EzPlugin_FilePuller", "getFileUrl to cache, fileUrlJson is :", strTrim);
            a(strTrim);
            return strTrim;
        }
        LogUtil.a("EzPlugin_FilePuller", "getFileUrl fileUrlJson is :", strTrim);
        return strTrim;
    }

    private static String b(pis pisVar, pit pitVar) {
        return b(pisVar, pitVar, false);
    }

    public static String e() {
        if (!CommonUtil.bu() && "1".equals(SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch"))) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "app_enter_module", "app_environment_change_url");
            if (!TextUtils.isEmpty(strE)) {
                LogUtil.a("EzPlugin_FilePuller", "grayEnvironmentUrl length:", Integer.valueOf(strE.length()));
                return strE;
            }
        }
        return "";
    }

    private static String e(pis pisVar, pit pitVar) {
        return b(pisVar, pitVar, true);
    }

    private static String b(pis pisVar, pit pitVar, boolean z) throws Throwable {
        InputStream inputStream;
        String str;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        String str2 = null;
        inputStreamReader2 = null;
        InputStream inputStream2 = null;
        try {
            FilePullerApi filePullerApi = (FilePullerApi) oet.c(h()).e(FilePullerApi.class);
            Map<String, String> mapC = c(pisVar);
            Response<ResponseBody> responseExecute = ("GET".equals(pisVar.i()) ? filePullerApi.getFileUrlGet(pisVar.j(), mapC) : filePullerApi.getFileUrlPost(pisVar.j(), mapC, pisVar.k())).execute();
            int code = responseExecute.getCode();
            if (code != 200) {
                String strB = b(code, pisVar, z, null);
                IoUtils.c(null);
                IoUtils.c(null);
                return strB;
            }
            ResponseBody body = responseExecute.getBody();
            if (body != null && body.getInputStream() != null) {
                if (!TextUtils.isEmpty(responseExecute.getHeaders().get("ETag"))) {
                    pitVar.e(responseExecute.getHeaders().get("ETag"));
                }
                inputStream = body.getInputStream();
                try {
                    inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                    try {
                        try {
                            StringBuilder sb = new StringBuilder(4096);
                            char[] cArr = new char[4096];
                            while (true) {
                                int i = inputStreamReader.read(cArr, 0, 4096);
                                if (i != -1) {
                                    sb.append(cArr, 0, i);
                                } else {
                                    String string = sb.toString();
                                    try {
                                        pisVar.d(code, string);
                                        IoUtils.c(inputStreamReader);
                                        IoUtils.c(inputStream);
                                        return string;
                                    } catch (IOException e) {
                                        e = e;
                                        str2 = string;
                                    }
                                }
                                String str3 = str2;
                                inputStream2 = inputStream;
                                str = str3;
                                try {
                                    ReleaseLogUtil.a("PluginDevice_FilePuller", "getFileUrlContent ex=", ExceptionUtils.c(e));
                                    IoUtils.c(inputStreamReader);
                                    IoUtils.c(inputStream2);
                                    return str;
                                } catch (Throwable th) {
                                    th = th;
                                    inputStream = inputStream2;
                                    inputStreamReader2 = inputStreamReader;
                                    IoUtils.c(inputStreamReader2);
                                    IoUtils.c(inputStream);
                                    throw th;
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = inputStream;
                        inputStream = inputStream2;
                        inputStreamReader2 = inputStreamReader;
                        IoUtils.c(inputStreamReader2);
                        IoUtils.c(inputStream);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    inputStreamReader = null;
                    inputStream2 = inputStream;
                    str = null;
                } catch (Throwable th3) {
                    th = th3;
                    IoUtils.c(inputStreamReader2);
                    IoUtils.c(inputStream);
                    throw th;
                }
            }
            LogUtil.j("EzPlugin_FilePuller", "getFileUrlContent responseBody or responseBody.getInputStream() is null");
            IoUtils.c(null);
            IoUtils.c(null);
            return null;
        } catch (IOException e4) {
            e = e4;
            str = null;
            inputStreamReader = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    private static String b(int i, pis pisVar, boolean z, String str) {
        if (i == 304) {
            ReleaseLogUtil.d("PluginDevice_FilePuller", "getFileUrlJson not modified");
            pisVar.d(i, "");
            return "Not Modified";
        }
        LogUtil.j("PluginDevice_FilePuller", z ? "getFileURLHttps" : "getFileURLHttp", " ConRspCode = ", Integer.valueOf(i));
        pisVar.d(i, "");
        return str;
    }

    private static HttpClient h() {
        RestClientGlobalInstance.getInstance().init(BaseApplication.getContext());
        if (CloudUtils.d()) {
            LogUtil.a("EzPlugin_FilePuller", "getHttpClient oversea download device file");
            return new HttpClient.Builder().connectTimeout(20000).readTimeout(20000).build();
        }
        return new HttpClient.Builder().connectTimeout(10000).readTimeout(10000).build();
    }

    private static Map<String, String> c(pis pisVar) {
        HashMap map = new HashMap();
        if (!pisVar.f()) {
            String strE = e();
            if (!TextUtils.isEmpty(strE)) {
                map.put("Device-ID", strE);
            }
        }
        map.put("Content-Type", "application/json");
        if (pisVar.c()) {
            if (pisVar.f()) {
                map.put("x-version", f45462b);
            } else {
                map.put(b6.a.f14602b, "HealthApp");
            }
            map.put("traceId", "afe21fcf-2ff0-4b63-a3ef-a04136517298");
        }
        if ("GET".equals(pisVar.i()) && !TextUtils.isEmpty(pisVar.d())) {
            map.put(r1.b.n, pisVar.d());
        }
        return map;
    }

    private static String d(String str, String str2, boolean z, pit pitVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (z && str2 != null && !jSONObject.isNull("fileList")) {
                return e(jSONObject.getJSONArray("fileList"), str2, pitVar);
            }
            if (!jSONObject.isNull(RecommendConstants.DOWNLOAD_URL)) {
                return jSONObject.getString(RecommendConstants.DOWNLOAD_URL);
            }
            LogUtil.j("EzPlugin_FilePuller", "parseJsonObjectUrl jsonObject url key is null, text=", String.valueOf(jSONObject));
            return null;
        } catch (JSONException unused) {
            LogUtil.e("EzPlugin_FilePuller", "parseJsonObjectUrl parse fileUrlJson JSONException");
            return null;
        }
    }

    private static String e(String str, String str2, pit pitVar) {
        try {
            return e(new JSONArray(str), str2, pitVar);
        } catch (JSONException unused) {
            LogUtil.e("EzPlugin_FilePuller", "parseJsonArrayUrl parse fileUrlJson JSONException");
            return null;
        }
    }

    private static String e(JSONArray jSONArray, String str, pit pitVar) throws JSONException {
        JSONObject jSONObject;
        int i = 0;
        while (true) {
            if (i >= jSONArray.length()) {
                jSONObject = null;
                break;
            }
            jSONObject = jSONArray.getJSONObject(i);
            if (!jSONObject.isNull(RecommendConstants.FILE_ID) && str.equals(jSONObject.getString(RecommendConstants.FILE_ID))) {
                break;
            }
            i++;
        }
        if (jSONObject == null) {
            LogUtil.j("EzPlugin_FilePuller", "parseJsonArrayUrl jsonObject is null");
            return null;
        }
        if (!jSONObject.isNull(RecommendConstants.VER) && !jSONObject.isNull(SocialOperation.GAME_SIGNATURE)) {
            pitVar.a(jSONObject.getString(RecommendConstants.VER));
            pitVar.c(jSONObject.getString(SocialOperation.GAME_SIGNATURE));
        }
        if (jSONObject.isNull(RecommendConstants.DOWNLOAD_URL)) {
            LogUtil.j("EzPlugin_FilePuller", "parseJsonArrayUrl jsonObject url key is null, text=", String.valueOf(jSONObject));
            return null;
        }
        return jSONObject.getString(RecommendConstants.DOWNLOAD_URL);
    }

    private static String a(String str, String str2, boolean z, pit pitVar) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("EzPlugin_FilePuller", "parseJsonUrl fileUrlJson is empty");
            return null;
        }
        if (!z && str2 != null && str.charAt(0) == '[') {
            return e(str, str2, pitVar);
        }
        return d(str, str2, z, pitVar);
    }

    private static void b(File file, boolean z) throws IOException {
        if (z ? file.exists() : file.exists() & file.isFile()) {
            LogUtil.a("EzPlugin_FilePuller", "initializeDestFile deleteDestFile existed: ", Boolean.valueOf(file.delete()));
        }
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            LogUtil.a("EzPlugin_FilePuller", "initializeDestFile mkdirFile is =", Boolean.valueOf(file.getParentFile().mkdirs()));
        }
        if (file.isFile()) {
            return;
        }
        LogUtil.a("EzPlugin_FilePuller", "initializeDestFile createNewFile is =", Boolean.valueOf(file.createNewFile()));
    }

    private static void e(String str, String str2) {
        Closeable closeable;
        synchronized (piu.class) {
            LogUtil.a("EzPlugin_FilePuller", "renameFile oldPath is = ", str, ", destPath is =", str2);
            File file = new File(str);
            File file2 = new File(str2);
            Closeable closeable2 = null;
            try {
                b(file2, false);
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] bArr = new byte[4096];
                        for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                            fileOutputStream.write(bArr, 0, i);
                        }
                        fileOutputStream.flush();
                        IoUtils.c(fileInputStream);
                        IoUtils.c(fileOutputStream);
                    } catch (IOException e) {
                        e = e;
                        closeable2 = fileOutputStream;
                        closeable = closeable2;
                        closeable2 = fileInputStream;
                        try {
                            LogUtil.e("PluginDevice_FilePuller", "renameFile file ex=", ExceptionUtils.c(e));
                            IoUtils.c(closeable2);
                            IoUtils.c(closeable);
                        } catch (Throwable th) {
                            th = th;
                            IoUtils.c(closeable2);
                            IoUtils.c(closeable);
                            d(file, "renameFile isOldFileDeleted: ");
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        closeable2 = fileOutputStream;
                        closeable = closeable2;
                        closeable2 = fileInputStream;
                        IoUtils.c(closeable2);
                        IoUtils.c(closeable);
                        d(file, "renameFile isOldFileDeleted: ");
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e3) {
                e = e3;
                closeable = null;
            } catch (Throwable th4) {
                th = th4;
                closeable = null;
            }
            d(file, "renameFile isOldFileDeleted: ");
        }
    }

    private static boolean b(String str) {
        int iIndexOf;
        if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(":")) >= 0) {
            return "http".equalsIgnoreCase(str.substring(0, iIndexOf));
        }
        return false;
    }

    public void e(final pis pisVar) {
        if (pisVar == null) {
            LogUtil.j("EzPlugin_FilePuller", "addTask task is null");
            return;
        }
        pit pitVar = new pit();
        pitVar.c(0);
        pitVar.e(-8);
        LogUtil.a("EzPlugin_FilePuller", "addTask download file total size:", Integer.valueOf(pisVar.l()));
        pitVar.b(pisVar.l());
        this.i.put(pisVar, pitVar);
        this.f.execute(new Runnable() { // from class: piu.3
            @Override // java.lang.Runnable
            public void run() {
                pit pitVar2 = (pit) piu.this.i.get(pisVar);
                if (pitVar2 != null) {
                    pitVar2.e(0);
                    pitVar2.c(0);
                    piu.this.i(pisVar, pitVar2);
                }
            }
        });
    }

    public void a(pis pisVar) {
        pit pitVar = this.i.get(pisVar);
        if (pitVar != null) {
            switch (pitVar.f()) {
                case -8:
                case -6:
                case -5:
                case -4:
                case -3:
                case -2:
                case -1:
                case 1:
                    pitVar.e(-10);
                    this.i.remove(pisVar);
                    break;
                case 0:
                    pitVar.e(-10);
                    break;
            }
        }
    }

    public pit b(pis pisVar) {
        pit pitVar = this.i.get(pisVar);
        if (pitVar == null) {
            pit pitVar2 = new pit();
            pitVar2.c(0);
            pitVar2.e(-7);
            return pitVar2;
        }
        int iF = pitVar.f();
        if (iF != 0 && iF != -8) {
            this.i.remove(pisVar);
        }
        return pitVar;
    }

    public pis e(String str) {
        if (str == null) {
            return null;
        }
        for (pis pisVar : this.i.keySet()) {
            if (str.equals(pisVar.o())) {
                return pisVar;
            }
        }
        return null;
    }

    private String d(pis pisVar) {
        if ((pisVar.g() & 6) != 0) {
            try {
                String str = this.e.getDir("cache", 0).getCanonicalPath() + File.pathSeparator;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(lsp.b(this.e, pisVar.j() + pisVar.o()));
                return sb.toString();
            } catch (IOException e) {
                LogUtil.e("EzPlugin_FilePuller", "getPathName:getCanonicalPath ex=", ExceptionUtils.c(e));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(File.pathSeparator);
                sb2.append(lsp.b(this.e, pisVar.j() + pisVar.o()));
                return sb2.toString();
            }
        }
        return pisVar.a() + ".tmp";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(pis pisVar, pit pitVar) {
        pitVar.d(d(pisVar));
        LogUtil.a("EzPlugin_FilePuller", "processTask pathname is = ", pitVar.c());
        String strA = a(pisVar, pitVar);
        if (strA == null) {
            LogUtil.j("EzPlugin_FilePuller", "processTask fileUrlJson is null");
            pitVar.e(-1);
            pisVar.c(pitVar);
            pisVar.b((PullListener) null);
            return;
        }
        if ("Not Modified".equals(strA)) {
            LogUtil.a("EzPlugin_FilePuller", "processTask fileUrlJson not modified");
            pitVar.e(-11);
            pisVar.c(pitVar);
            pisVar.b((PullListener) null);
            return;
        }
        pitVar.b(strA);
        String strA2 = a(strA, pisVar.b(), pisVar.f(), pitVar);
        if (strA2 == null) {
            LogUtil.j("EzPlugin_FilePuller", "processTask fileUrlResult is null");
            pitVar.e(-5);
            pisVar.c(pitVar);
            pisVar.b((PullListener) null);
            return;
        }
        if (!e(pisVar, pitVar.e())) {
            LogUtil.a("EzPlugin_FilePuller", "processTask file not modified");
            pitVar.e(-11);
            pisVar.c(pitVar);
            pisVar.b((PullListener) null);
            return;
        }
        String strJ = pisVar.j();
        pisVar.i(strA2);
        pisVar.c(pitVar);
        a(d(pisVar, pitVar), pisVar, pitVar, strJ);
        LogUtil.a("EzPlugin_FilePuller", "processTask result status : ", Integer.valueOf(pitVar.f()));
        pisVar.c(pitVar);
        pisVar.b((PullListener) null);
    }

    private boolean e(pis pisVar, String str) {
        if (!"GET".equals(pisVar.i()) || TextUtils.isEmpty(str)) {
            return true;
        }
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), j() + pisVar.b() + "_version");
        LogUtil.a("EzPlugin_FilePuller", "indexSpVer:", strE, " indexVersion:", str);
        return TextUtils.isEmpty(strE) || str.compareTo(strE) > 0;
    }

    private String j() {
        if (CommonUtil.bu()) {
            return "Release_";
        }
        if (CommonUtil.ap()) {
            return "Beta_";
        }
        if (CommonUtil.cl()) {
            return "Test_";
        }
        LogUtil.j("EzPlugin_FilePuller", "indexKeySuffix else branch");
        return "";
    }

    private void a(int i, pis pisVar, pit pitVar, String str) {
        if (i != 0) {
            if (i == -3) {
                d(new File(pitVar.c()), "timeout deleteFile is = ");
                pitVar.e(-3);
                return;
            } else if (i == -10) {
                d(new File(pitVar.c()), "cancel deleteFile is = ");
                pitVar.e(-10);
                return;
            } else {
                d(new File(pitVar.c()), "unexpected deleteFile is = ");
                pitVar.e(-1);
                return;
            }
        }
        if (!b(pisVar.e(), pitVar.c())) {
            pitVar.e(-6);
            return;
        }
        if ("plugin_index".equals(pisVar.b()) || "device_index_all".equals(pisVar.b()) || pip.f45447a.containsValue(pisVar.b()) || "index_sport_intensity".equals(pisVar.b())) {
            if (!a(pitVar)) {
                pitVar.e(-6);
                d(new File(pitVar.c()), "incomplete deleteFile is = ");
                return;
            }
            if ("device_index_all".equals(pisVar.b())) {
                str = str + "device_index_all";
            }
            d(str, pitVar.a());
            a(pisVar.b(), pitVar.e());
        }
        pitVar.e(1);
        LogUtil.a("EzPlugin_FilePuller", "processTask resource type : ", Integer.valueOf(pisVar.g()));
        g(pisVar, pitVar);
    }

    private boolean a(pit pitVar) {
        String strA = SecurityUtils.a(new File(pitVar.c()), pitVar.e().getBytes(StandardCharsets.UTF_8), true);
        LogUtil.a("EzPlugin_FilePuller", "verifySignature signature is ", pitVar.h(), ", hashSignature is ", strA);
        return strA != null && strA.equalsIgnoreCase(pitVar.h());
    }

    public void a(String str, String str2) {
        String str3 = j() + str + "_version";
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), str3, str2, storageParams);
    }

    public void d(String str, String str2) {
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(1003), str, str2, storageParams);
    }

    private void g(pis pisVar, pit pitVar) {
        if ((pisVar.g() & 4) != 0) {
            String strC = pitVar.c();
            if ((pisVar.g() & 2) != 0) {
                pitVar.d(pitVar.c() + ".d");
            }
            if (!pil.c(strC, pitVar.c())) {
                LogUtil.a("EzPlugin_FilePuller", "processTaskOption decryptFile failure");
                pitVar.e(-6);
            }
            d(new File(strC), "decrypt deleteFile is = ");
        }
        if ((pisVar.g() & 2) != 0) {
            if (pil.e(pitVar.c(), pisVar.a()) <= 0) {
                LogUtil.a("EzPlugin_FilePuller", "processTaskOption unzip failure");
                pitVar.e(-6);
            }
            d(new File(pitVar.c()), "unzip deleteFile is = ");
            return;
        }
        if ((pisVar.g() & 4) == 0) {
            e(pitVar.c(), pisVar.a());
        }
    }

    private int d(pis pisVar, pit pitVar) {
        LogUtil.a("EzPlugin_FilePuller", "downloadFile start: ", pisVar.j());
        if (!TextUtils.isEmpty(pisVar.j())) {
            return c(pisVar, pitVar);
        }
        LogUtil.j("EzPlugin_FilePuller", "downloadFile http url isEmpty");
        return -1;
    }

    private int c(pis pisVar, pit pitVar) {
        try {
            Response<ResponseBody> responseExecute = ((CommonApi) oet.c(h()).e(CommonApi.class)).commonDownload(pisVar.j()).execute();
            int code = responseExecute.getCode();
            if (code == 200) {
                return d(pisVar, pitVar, responseExecute.getBody());
            }
            LogUtil.j("PluginDevice_FilePuller", b(pisVar.j()) ? "downloadFileHttps" : "downloadFileHttp", " ConRspCode = ", Integer.valueOf(code));
            return -3;
        } catch (IOException e) {
            ReleaseLogUtil.a("PluginDevice_FilePuller", "downloadFileContent ex=", ExceptionUtils.c(e));
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private int d(pis pisVar, pit pitVar, ResponseBody responseBody) throws IOException {
        if (responseBody == null || responseBody.getInputStream() == null) {
            LogUtil.j("EzPlugin_FilePuller", "downloadFileContent responseBody or responseBody.getInputStream() is null");
            return -1;
        }
        File file = new File(pitVar.c());
        b(file, true);
        InputStream inputStream = responseBody.getInputStream();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    pitVar.c(pitVar.d() + i);
                    fileOutputStream.write(bArr, 0, i);
                    if (pitVar.f() == -10) {
                        this.i.remove(pisVar);
                        break;
                    }
                    pisVar.c(pitVar);
                }
                fileOutputStream.flush();
                if (pitVar.f() != -10) {
                    fileOutputStream.close();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return 0;
                }
                LogUtil.a("EzPlugin_FilePuller", "downloadFileContent cancel download task");
                fileOutputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                }
                return -10;
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
        if (inputStream != null) {
            inputStream.close();
        }
        throw th3;
    }

    public ArrayList<pis> b() {
        ArrayList<pis> arrayList = new ArrayList<>(this.i.keySet().size());
        Iterator<pis> it = this.i.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
