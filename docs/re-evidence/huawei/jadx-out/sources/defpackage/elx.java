package defpackage;

import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.api.MeasureKitManagerApi;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.health.device.manager.ResourceFileListener;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.wifi.lib.db.dbtable.DeviceListManager;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hihealthservice.util.HttpRequestApi;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import io.jsonwebtoken.Header;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes7.dex */
public class elx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f33155b = new Object();
    private static elx e;

    private elx() {
    }

    public static elx a() {
        elx elxVar;
        synchronized (f33155b) {
            if (e == null) {
                e = new elx();
            }
            elxVar = e;
        }
        return elxVar;
    }

    public boolean e() {
        String strB;
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d(), "devicedownloadtime");
        if (!Utils.o()) {
            LogUtil.a("ResourceManagerHelper", " isToUpdate freshTime");
            strB = deviceCloudSharePreferencesManager.b("freshtime");
        } else {
            LogUtil.a("ResourceManagerHelper", " isToUpdate abroadFreshTime");
            strB = deviceCloudSharePreferencesManager.b("abroadfreshtime");
        }
        try {
            if ((new Date().getTime() - new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(strB).getTime()) / 86400000 >= 1) {
                LogUtil.a("ResourceManagerHelper", " isToUpdate");
                return true;
            }
        } catch (ParseException e2) {
            LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper isToUpdate", e2.getMessage());
        }
        return false;
    }

    public boolean b() {
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d(), "devicedownloadtime");
        if (!Utils.o()) {
            if (!"0".equals(deviceCloudSharePreferencesManager.b("freshtime"))) {
                return false;
            }
            LogUtil.a("ResourceManagerHelper", " group isFirstToDownload");
            return true;
        }
        if (!"0".equals(deviceCloudSharePreferencesManager.b("abroadfreshtime"))) {
            return false;
        }
        LogUtil.a("ResourceManagerHelper", " group_abroad isFirstToDownload");
        return true;
    }

    public boolean c(String str) {
        return new File(j(str)).exists() && new File(f(str)).exists() && new File(d(str)).exists();
    }

    public String d(String str) {
        return dxc.d + str + File.separator + str + File.separator + "img";
    }

    public String f(String str) {
        String country = Locale.getDefault().getCountry();
        if (str == null) {
            LogUtil.j("ResourceManagerHelper", " getStringPath productId is empty");
            return "";
        }
        if (new File(dxc.d.concat(str).concat(File.separator).concat(str).concat(File.separator).concat("product.xml")).exists()) {
            String strConcat = dxc.d.concat(str).concat(File.separator).concat(str).concat(File.separator);
            String strConcat2 = strConcat.concat("lang/strings").concat(LanguageUtil.b(BaseApplication.getContext()));
            String strConcat3 = strConcat2.concat(WatchFaceConstant.XML_SUFFIX);
            String strConcat4 = strConcat2.concat(Constants.LINK).concat(country).concat(WatchFaceConstant.XML_SUFFIX);
            if (new File(strConcat4).exists()) {
                return strConcat4;
            }
            if (new File(strConcat3).exists()) {
                return strConcat3;
            }
            if ("CN".equals(country)) {
                return strConcat.concat("lang/stringszh-rCN.xml");
            }
            return strConcat.concat("lang/strings.xml");
        }
        if ("CN".equals(country)) {
            return dxc.f32475b.concat(str).concat(File.separator).concat("lang/stringszh-rCN.xml");
        }
        return dxc.f32475b.concat(str).concat(File.separator).concat("lang/strings.xml");
    }

    public String j(String str) {
        return dxc.d + str + File.separator + str + File.separator + "product.xml";
    }

    public boolean h(String str) {
        return new File(str).exists();
    }

    public String a(String str) {
        StringBuilder sb = new StringBuilder(16);
        sb.append(dxc.d);
        sb.append(str);
        sb.append(File.separator);
        sb.append(str);
        sb.append(File.separator);
        sb.append("conf/main_help.json");
        return sb.toString();
    }

    public String e(String str) {
        int iLastIndexOf;
        return (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(".")) >= 0) ? str.substring(iLastIndexOf) : "";
    }

    public void a(String str, String str2, ResourceFileListener resourceFileListener) {
        LogUtil.d("ResourceManagerHelper", "HttpUtil postRequest url servicesupport/updateserver/getLatestVersion");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(str, str2, resourceFileListener);
    }

    private HttpClient c() {
        RestClientGlobalInstance.getInstance().init(BaseApplication.getContext());
        return new HttpClient.Builder().connectTimeout(10000).readTimeout(10000).build();
    }

    public Map<String, Object> d() {
        HashMap map = new HashMap();
        map.put("Content-type", "application/json");
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d8 A[PHI: r0 r6 r11 r12
      0x00d8: PHI (r0v6 java.lang.String) = (r0v4 java.lang.String), (r0v7 java.lang.String) binds: [B:41:0x00ba, B:48:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r6v7 java.io.InputStreamReader) = (r6v5 java.io.InputStreamReader), (r6v8 java.io.InputStreamReader) binds: [B:41:0x00ba, B:48:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r11v15 ??) = (r11v28 ??), (r11v29 ??) binds: [B:41:0x00ba, B:48:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r12v11 ??) = (r12v14 ??), (r12v15 ??) binds: [B:41:0x00ba, B:48:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [int] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.huawei.health.device.manager.ResourceFileListener] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public void c(String str, String str2, ResourceFileListener resourceFileListener) throws Throwable {
        Throwable th;
        InputStreamReader inputStreamReader;
        IOException e2;
        MalformedURLException e3;
        ?? r12;
        ?? r11;
        ?? r13;
        String str3 = "";
        LogUtil.d("ResourceManagerHelper", "HttpUtil postRequest url servicesupport/updateserver/getLatestVersion");
        ?? r5 = -1;
        InputStreamReader inputStreamReader2 = null;
        try {
            try {
                Response<ResponseBody> responseExecute = ((HttpRequestApi) oet.c(c()).e(HttpRequestApi.class)).getPostReq((String) str, d(), (String) str2).execute();
                str2 = responseExecute.getCode();
                try {
                    LogUtil.a("ResourceManagerHelper", " postHttpRequest HttpUtil postRequest connect code = ", Integer.valueOf((int) str2));
                    if (str2 == 200) {
                        str = responseExecute.getBody().getInputStream();
                        try {
                            inputStreamReader = new InputStreamReader((InputStream) str, "UTF-8");
                            try {
                                str3 = "" + b(inputStreamReader);
                                LogUtil.d("ResourceManagerHelper", " postHttpRequest HttpUtil postRequest result = ", str3);
                                inputStreamReader2 = inputStreamReader;
                                r13 = str;
                            } catch (MalformedURLException e4) {
                                e3 = e4;
                                inputStreamReader2 = inputStreamReader;
                                LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper postHttpRequest HttpUtil postRequest MalformedURLException :", e3.getMessage());
                                IoUtils.c(inputStreamReader2);
                                IoUtils.c(str);
                                r11 = str;
                                r12 = str2;
                                str = str;
                                str2 = str2;
                                if (resourceFileListener != 0) {
                                    resourceFileListener.onResult(-1, str3);
                                    str = r11;
                                    str2 = r12;
                                }
                            } catch (IOException e5) {
                                e2 = e5;
                                inputStreamReader2 = inputStreamReader;
                                LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper postHttpRequest HttpUtil postRequest IOException:  ", e2.getMessage());
                                IoUtils.c(inputStreamReader2);
                                IoUtils.c(str);
                                r11 = str;
                                r12 = str2;
                                str = str;
                                str2 = str2;
                                if (resourceFileListener != 0) {
                                    resourceFileListener.onResult(-1, str3);
                                    str = r11;
                                    str2 = r12;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                str = str;
                                inputStreamReader2 = inputStreamReader;
                                IoUtils.c(inputStreamReader2);
                                IoUtils.c(str);
                                if (resourceFileListener != 0) {
                                    resourceFileListener.onResult(str2, str3);
                                }
                                throw th;
                            }
                        } catch (MalformedURLException e6) {
                            e3 = e6;
                        } catch (IOException e7) {
                            e2 = e7;
                        } catch (Throwable th3) {
                            th = th3;
                            IoUtils.c(inputStreamReader2);
                            IoUtils.c(str);
                            if (resourceFileListener != 0) {
                                resourceFileListener.onResult(str2, str3);
                            }
                            throw th;
                        }
                    } else {
                        r13 = 0;
                    }
                    IoUtils.c(inputStreamReader2);
                    IoUtils.c(r13);
                    if (resourceFileListener != 0) {
                        resourceFileListener.onResult(str2, str3);
                    }
                } catch (MalformedURLException e8) {
                    e = e8;
                    e3 = e;
                    str = 0;
                    LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper postHttpRequest HttpUtil postRequest MalformedURLException :", e3.getMessage());
                    IoUtils.c(inputStreamReader2);
                    IoUtils.c(str);
                    r11 = str;
                    r12 = str2;
                    str = str;
                    str2 = str2;
                    if (resourceFileListener != 0) {
                        resourceFileListener.onResult(-1, str3);
                        str = r11;
                        str2 = r12;
                    }
                } catch (IOException e9) {
                    e = e9;
                    e2 = e;
                    str = 0;
                    LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper postHttpRequest HttpUtil postRequest IOException:  ", e2.getMessage());
                    IoUtils.c(inputStreamReader2);
                    IoUtils.c(str);
                    r11 = str;
                    r12 = str2;
                    str = str;
                    str2 = str2;
                    if (resourceFileListener != 0) {
                        resourceFileListener.onResult(-1, str3);
                        str = r11;
                        str2 = r12;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r5 = str2;
                    str2 = r5;
                    str = 0;
                    IoUtils.c(inputStreamReader2);
                    IoUtils.c(str);
                    if (resourceFileListener != 0) {
                        resourceFileListener.onResult(str2, str3);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = inputStreamReader2;
            }
        } catch (MalformedURLException e10) {
            e = e10;
            str2 = -1;
        } catch (IOException e11) {
            e = e11;
            str2 = -1;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private String b(InputStreamReader inputStreamReader) {
        int i;
        char[] cArr = new char[1024];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                i = inputStreamReader.read(cArr, 0, 1024);
                if (i == -1) {
                    break;
                }
                sb.append(cArr, 0, i);
            } catch (IOException e2) {
                LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper postRequestResult postRequest result e:", e2.getMessage());
            }
        } while (sb.length() + i <= 104857600);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040 A[PHI: r5
      0x0040: PHI (r5v11 long) = (r5v7 long), (r5v12 long) binds: [B:20:0x0060, B:11:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x013c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0158  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public void e(eky ekyVar, String str, String str2, ResourceFileListener resourceFileListener) {
        long j;
        int i;
        FileOutputStream fileOutputStream;
        String message;
        InputStream inputStream;
        FileOutputStream fileOutputStream2;
        int iE;
        long jCurrentTimeMillis;
        LogUtil.a("ResourceManagerHelper", " download file");
        if (a(ekyVar, resourceFileListener)) {
            return;
        }
        ekyVar.d();
        InputStream inputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        FileOutputStream fileOutputStream4 = null;
        inputStream2 = null;
        long j2 = 0;
        try {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            try {
                HttpURLConnection httpURLConnectionM = m(str);
                if (httpURLConnectionM == null) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    c((InputStream) null, (FileOutputStream) null);
                    if (!TextUtils.isEmpty(str2)) {
                        b(str2, resourceFileListener, -1, "faild");
                    }
                    iE = -1;
                } else {
                    e(httpURLConnectionM);
                    if (b(httpURLConnectionM)) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        c((InputStream) null, (FileOutputStream) null);
                        if (!TextUtils.isEmpty(str2)) {
                            b(str2, resourceFileListener, -1, "faild");
                        }
                        iE = -1;
                    } else {
                        InputStream inputStream3 = httpURLConnectionM.getInputStream();
                        try {
                            LogUtil.a("ResourceManagerHelper", " download health_file = ", str2);
                            l(str2);
                            String strI = i(str2);
                            if (strI == null) {
                                long jCurrentTimeMillis3 = System.currentTimeMillis();
                                c(inputStream3, (FileOutputStream) null);
                                if (!TextUtils.isEmpty(str2)) {
                                    b(str2, resourceFileListener, -1, "faild");
                                }
                                iE = -1;
                                jCurrentTimeMillis = jCurrentTimeMillis3;
                            } else {
                                FileOutputStream fileOutputStream5 = new FileOutputStream(o(strI));
                                try {
                                    d(inputStream3, fileOutputStream5);
                                    fileOutputStream2 = fileOutputStream5;
                                    inputStream = inputStream3;
                                    try {
                                        try {
                                            a aVarC = new a(ekyVar, resourceFileListener, -1, "faild", strI).c();
                                            iE = aVarC.e();
                                            try {
                                                String strA = aVarC.a();
                                                jCurrentTimeMillis = System.currentTimeMillis();
                                                c(inputStream, fileOutputStream2);
                                                if (!TextUtils.isEmpty(str2)) {
                                                    b(str2, resourceFileListener, iE, strA);
                                                }
                                            } catch (IOException e2) {
                                                e = e2;
                                                i = iE;
                                                fileOutputStream3 = fileOutputStream2;
                                                fileOutputStream = fileOutputStream3;
                                                inputStream2 = inputStream;
                                                j = jCurrentTimeMillis2;
                                                try {
                                                    LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper download IOException e = ", e.getMessage());
                                                    try {
                                                        message = e.getMessage();
                                                        long jCurrentTimeMillis4 = System.currentTimeMillis();
                                                        c(inputStream2, fileOutputStream);
                                                        if (!TextUtils.isEmpty(str2)) {
                                                            b(str2, resourceFileListener, -1, message);
                                                        }
                                                        b(-1, j, jCurrentTimeMillis4);
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        i = -1;
                                                        long jCurrentTimeMillis5 = System.currentTimeMillis();
                                                        c(inputStream2, fileOutputStream);
                                                        if (!TextUtils.isEmpty(str2)) {
                                                            b(str2, resourceFileListener, i, "faild");
                                                        }
                                                        b(i, j, jCurrentTimeMillis5);
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                i = iE;
                                                fileOutputStream4 = fileOutputStream2;
                                                fileOutputStream = fileOutputStream4;
                                                inputStream2 = inputStream;
                                                j = jCurrentTimeMillis2;
                                                long jCurrentTimeMillis6 = System.currentTimeMillis();
                                                c(inputStream2, fileOutputStream);
                                                if (!TextUtils.isEmpty(str2)) {
                                                    b(str2, resourceFileListener, i, "faild");
                                                }
                                                b(i, j, jCurrentTimeMillis6);
                                                throw th;
                                            }
                                        } catch (IOException e3) {
                                            e = e3;
                                            i = -1;
                                            fileOutputStream3 = fileOutputStream2;
                                            fileOutputStream = fileOutputStream3;
                                            inputStream2 = inputStream;
                                            j = jCurrentTimeMillis2;
                                            LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper download IOException e = ", e.getMessage());
                                            message = e.getMessage();
                                            long jCurrentTimeMillis7 = System.currentTimeMillis();
                                            c(inputStream2, fileOutputStream);
                                            if (!TextUtils.isEmpty(str2)) {
                                                b(str2, resourceFileListener, -1, message);
                                            }
                                            b(-1, j, jCurrentTimeMillis7);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            i = -1;
                                            fileOutputStream4 = fileOutputStream2;
                                            fileOutputStream = fileOutputStream4;
                                            inputStream2 = inputStream;
                                            j = jCurrentTimeMillis2;
                                            long jCurrentTimeMillis8 = System.currentTimeMillis();
                                            c(inputStream2, fileOutputStream);
                                            if (!TextUtils.isEmpty(str2)) {
                                                b(str2, resourceFileListener, i, "faild");
                                            }
                                            b(i, j, jCurrentTimeMillis8);
                                            throw th;
                                        }
                                    } catch (IOException e4) {
                                        e = e4;
                                        fileOutputStream3 = fileOutputStream2;
                                        i = -1;
                                        fileOutputStream = fileOutputStream3;
                                        inputStream2 = inputStream;
                                        j = jCurrentTimeMillis2;
                                        LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper download IOException e = ", e.getMessage());
                                        message = e.getMessage();
                                        long jCurrentTimeMillis9 = System.currentTimeMillis();
                                        c(inputStream2, fileOutputStream);
                                        if (!TextUtils.isEmpty(str2)) {
                                            b(str2, resourceFileListener, -1, message);
                                        }
                                        b(-1, j, jCurrentTimeMillis9);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fileOutputStream4 = fileOutputStream2;
                                        i = -1;
                                        fileOutputStream = fileOutputStream4;
                                        inputStream2 = inputStream;
                                        j = jCurrentTimeMillis2;
                                        long jCurrentTimeMillis10 = System.currentTimeMillis();
                                        c(inputStream2, fileOutputStream);
                                        if (!TextUtils.isEmpty(str2)) {
                                            b(str2, resourceFileListener, i, "faild");
                                        }
                                        b(i, j, jCurrentTimeMillis10);
                                        throw th;
                                    }
                                } catch (IOException e5) {
                                    e = e5;
                                    fileOutputStream2 = fileOutputStream5;
                                    inputStream = inputStream3;
                                } catch (Throwable th6) {
                                    th = th6;
                                    fileOutputStream2 = fileOutputStream5;
                                    inputStream = inputStream3;
                                }
                            }
                        } catch (IOException e6) {
                            e = e6;
                            inputStream = inputStream3;
                        } catch (Throwable th7) {
                            th = th7;
                            inputStream = inputStream3;
                        }
                    }
                }
                b(iE, jCurrentTimeMillis2, jCurrentTimeMillis);
            } catch (IOException e7) {
                e = e7;
                j2 = jCurrentTimeMillis2;
                j = j2;
                i = -1;
                fileOutputStream = null;
                LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper download IOException e = ", e.getMessage());
                message = e.getMessage();
                long jCurrentTimeMillis11 = System.currentTimeMillis();
                c(inputStream2, fileOutputStream);
                if (!TextUtils.isEmpty(str2)) {
                    b(str2, resourceFileListener, -1, message);
                }
                b(-1, j, jCurrentTimeMillis11);
            } catch (Throwable th8) {
                th = th8;
                j2 = jCurrentTimeMillis2;
                j = j2;
                i = -1;
                fileOutputStream = null;
                long jCurrentTimeMillis12 = System.currentTimeMillis();
                c(inputStream2, fileOutputStream);
                if (!TextUtils.isEmpty(str2)) {
                    b(str2, resourceFileListener, i, "faild");
                }
                b(i, j, jCurrentTimeMillis12);
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
        } catch (Throwable th9) {
            th = th9;
        }
    }

    private boolean a(eky ekyVar, ResourceFileListener resourceFileListener) {
        if (ekyVar != null) {
            return false;
        }
        if (resourceFileListener == null) {
            return true;
        }
        resourceFileListener.onResult(-1, "groupFileParser is null");
        return true;
    }

    private String i(String str) {
        return CommonUtil.c(str);
    }

    private void d(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                fileOutputStream.write(bArr, 0, i);
            } else {
                fileOutputStream.flush();
                return;
            }
        }
    }

    private File o(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            LogUtil.a("ResourceManagerHelper", " getTemp create_result is ", Boolean.valueOf(file.createNewFile()));
        }
        return file;
    }

    private boolean b(HttpURLConnection httpURLConnection) throws IOException {
        int responseCode = httpURLConnection.getResponseCode();
        LogUtil.a("ResourceManagerHelper", " isFailedCode resCode = ", Integer.valueOf(responseCode));
        return responseCode != 200;
    }

    private void l(String str) {
        File file = new File(str.substring(0, str.lastIndexOf(File.separator)));
        if (file.exists()) {
            return;
        }
        LogUtil.a("ResourceManagerHelper", " initDirectoryFile isCreateResult is ", Boolean.valueOf(file.mkdirs()));
    }

    private HttpURLConnection m(String str) throws IOException {
        URL url = new URL(str);
        if (ProxyConfig.MATCH_HTTPS.equals(url.getProtocol().toLowerCase(Locale.ENGLISH))) {
            LogUtil.a("ResourceManagerHelper", " getHttpUrlConnection download https");
            if (url.openConnection() instanceof HttpsURLConnection) {
                return (HttpsURLConnection) url.openConnection();
            }
            return null;
        }
        if (url.openConnection() instanceof HttpURLConnection) {
            return (HttpURLConnection) url.openConnection();
        }
        return null;
    }

    private void e(HttpURLConnection httpURLConnection) throws ProtocolException {
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setRequestMethod("GET");
    }

    private void b(int i, long j, long j2) {
        int i2 = i == 200000 ? 0 : 1;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("target", "2");
        linkedHashMap.put(OpAnalyticsConstants.TARGET_SOURCE_TYPE, "6");
        linkedHashMap.put(OpAnalyticsConstants.DELAY_MS, String.valueOf(j2 - j));
        linkedHashMap.put("flag", String.valueOf(i2));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_DEPEND_85040001.value(), linkedHashMap);
    }

    private void b(String str, ResourceFileListener resourceFileListener, int i, String str2) {
        if (i == -1 && ".zip".equals(e(str))) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            if (!file.delete()) {
                LogUtil.j("ResourceManagerHelper", " deleteFileAndCallbackResult delete file failed");
            }
        }
        if (resourceFileListener != null) {
            resourceFileListener.onResult(i, str2);
        }
    }

    private void c(InputStream inputStream, FileOutputStream fileOutputStream) {
        IoUtils.c(fileOutputStream);
        IoUtils.c(inputStream);
    }

    public void c(String str, InputStream inputStream, String str2, ResourceFileListener resourceFileListener, boolean z) {
        ZipEntry zipEntryB;
        if (TextUtils.isEmpty(CommonUtil.c(str))) {
            if (resourceFileListener != null) {
                resourceFileListener.onResult(-1, "unzipfaild");
                return;
            }
            return;
        }
        b bVarF = new b(str2).f();
        try {
            if (!new File(str).exists()) {
                zipEntryB = b(str, bVarF);
            } else {
                zipEntryB = b(str, inputStream, bVarF);
            }
            d(z, bVarF);
            if (e(z, bVarF, zipEntryB)) {
                return;
            }
            if (CommonUtil.cj()) {
                String strA = bVarF.a();
                StringBuilder sb = new StringBuilder(16);
                sb.append(str2);
                sb.append(File.separator);
                sb.append(strA);
                b(sb.toString(), bVarF.a());
            }
            bVarF.e(200);
            bVarF.c(bVarF.a());
            String strC = CommonUtil.c(a(bVarF.a()));
            if (!TextUtils.isEmpty(strC)) {
                g(strC);
            }
        } catch (IOException unused) {
            LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper unUpdateZip IOException:");
        } finally {
            d(str, resourceFileListener, z, bVarF);
        }
    }

    public void b(String str, String str2) {
        File file = new File(str);
        String strE = SharedPreferenceManager.e(dxw.d(), String.valueOf(10000), "import_zip_product_id");
        if (e(file) && str2.equals(strE)) {
            StringBuilder sb = new StringBuilder(16);
            sb.append("com.huawei.health.device.");
            sb.append(strE);
            sb.append(".hpk");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(16);
            sb2.append(dxw.d().getExternalFilesDir(""));
            sb2.append(File.separator);
            sb2.append("h5pro");
            sb2.append(File.separator);
            sb2.append("com.huawei.health.device.");
            sb2.append(str2);
            sb2.append(File.separator);
            sb2.append(string);
            File file2 = new File(sb2.toString());
            File fileD = d(file);
            LogUtil.a("ResourceManagerHelper", "sourceHpkFile : ", fileD);
            c(fileD, file2);
            b(strE);
        }
    }

    public void b(String str) {
        try {
            StringBuilder sb = new StringBuilder(16);
            sb.append(dxw.d().getExternalFilesDir("").getCanonicalPath());
            sb.append(File.separator);
            sb.append("h5pro");
            File file = new File(sb.toString());
            if (file.exists() && file.isDirectory()) {
                c(sb.toString(), str);
                return;
            }
            boolean zMkdir = file.mkdir();
            LogUtil.a("ResourceManagerHelper", "mkdir : ", Boolean.valueOf(zMkdir));
            if (zMkdir) {
                c(sb.toString(), str);
            }
        } catch (IOException unused) {
            LogUtil.j("ResourceManagerHelper", "createInstalledFile failed : IOException");
        }
    }

    private void c(String str, String str2) {
        StringBuilder sb = new StringBuilder(16);
        sb.append(str);
        sb.append(File.separator);
        sb.append("com.huawei.health.device.");
        sb.append(str2);
        sb.append(".installed");
        try {
            n(sb.toString());
        } catch (IOException unused) {
            LogUtil.j("ResourceManagerHelper", "writeInstallTime exception : IOException");
        }
    }

    private void n(String str) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        try {
            fileOutputStream.write(Long.toString(new Date().getTime()).getBytes(StandardCharsets.UTF_8));
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
                LogUtil.j("ResourceManagerHelper", "fout close failed : IOException");
            }
        }
    }

    private boolean e(File file) {
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return false;
            }
            for (File file2 : fileArrListFiles) {
                if (e(file2)) {
                    return true;
                }
            }
            return false;
        }
        return file.getName().trim().endsWith(".hpk");
    }

    private File d(File file) {
        File fileD = null;
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    fileD = d(file2);
                    if (fileD != null) {
                        return fileD;
                    }
                }
                return fileD;
            }
        } else if (file.getName().trim().endsWith(".hpk")) {
            return file;
        }
        return null;
    }

    public void c(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            LogUtil.a("ResourceManagerHelper", "copyFile failed, fromFile is null, or is not exists or is not fileor cannot read, or toFile's parentFile is null");
            return;
        }
        if (file2.getParentFile() == null) {
            LogUtil.a("ResourceManagerHelper", "copyFile failed, toFile.getParentFile() is null");
            return;
        }
        if (!file2.getParentFile().exists() && !file2.getParentFile().mkdirs()) {
            LogUtil.a("ResourceManagerHelper", "copyFile : make parentFile dir failed");
            return;
        }
        if (file2.exists() && !file2.delete()) {
            LogUtil.a("ResourceManagerHelper", "copyFile : delete origin file failed");
            return;
        }
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream3 = null;
        FileOutputStream fileOutputStream4 = null;
        fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream5 = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream2.read(bArr);
                        if (i <= 0) {
                            LogUtil.a("ResourceManagerHelper", "copyFile : copy %s to %s, success", file.getCanonicalPath(), file2.getCanonicalPath());
                            c(fileInputStream2, fileOutputStream5);
                            return;
                        }
                        fileOutputStream5.write(bArr, 0, i);
                    }
                } catch (IOException unused) {
                    fileOutputStream3 = fileOutputStream5;
                    fileOutputStream2 = fileOutputStream3;
                    fileInputStream = fileInputStream2;
                    try {
                        LogUtil.j("ResourceManagerHelper", "copy file failed : IOException");
                        c(fileInputStream, fileOutputStream2);
                    } catch (Throwable th) {
                        fileOutputStream = fileOutputStream2;
                        th = th;
                        c(fileInputStream, fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream4 = fileOutputStream5;
                    fileOutputStream = fileOutputStream4;
                    fileInputStream = fileInputStream2;
                    c(fileInputStream, fileOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused3) {
            fileOutputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private void c(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
                LogUtil.e("ResourceManagerHelper", "streamClose failed : IOException");
                return;
            }
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
    }

    private boolean e(boolean z, b bVar, ZipEntry zipEntry) throws IOException {
        String strD = bVar.d();
        int iB = 0;
        int i = 0;
        while (zipEntry != null) {
            String name = zipEntry.getName();
            if (zipEntry.isDirectory()) {
                String strSubstring = name.substring(0, name.length() - 1);
                boolean zC = ekn.c(strD + File.separator + strSubstring);
                if (CommonUtil.br()) {
                    zC = !zC;
                }
                if (zC) {
                    return true;
                }
                LogUtil.a("ResourceManagerHelper", " unUpdateZip create File is error", strD, File.separator, strSubstring);
            } else {
                String strA = ekn.a(name, strD);
                if (z) {
                    strA = new File(strD, name).getCanonicalPath();
                }
                String strC = CommonUtil.c(strA);
                if (strC == null) {
                    LogUtil.j("ResourceManagerHelper", " unUpdateZip canonicalPath == null");
                    return true;
                }
                iB = b(bVar, iB, strC);
            }
            i++;
            if (i > 1024) {
                throw new IOException("Too many files to unzip.");
            }
            if (iB > 104857600) {
                throw new IOException("File being unzipped is too big.");
            }
            ZipInputStream zipInputStreamI = bVar.i();
            if (zipInputStreamI != null) {
                zipEntry = zipInputStreamI.getNextEntry();
            }
        }
        return false;
    }

    private int b(b bVar, int i, String str) {
        int i2;
        try {
            try {
                bVar.c(new FileOutputStream(new File(str)));
                byte[] bArr = new byte[1024];
                while (true) {
                    int i3 = bVar.i().read(bArr);
                    if (i3 == -1) {
                        c((InputStream) null, bVar.e());
                        return i;
                    }
                    i2 = i + i3;
                    if (i2 > 104857600) {
                        throw new IOException("File being unzipped is too big.");
                    }
                    bVar.e().write(bArr, 0, i3);
                    try {
                        bVar.e().flush();
                        i = i2;
                    } catch (IOException unused) {
                    }
                    LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper unUpdateZip IOException");
                    c((InputStream) null, bVar.e());
                    return i2;
                }
            } catch (Throwable th) {
                c((InputStream) null, bVar.e());
                throw th;
            }
        } catch (IOException unused2) {
            i2 = i;
        }
    }

    private void d(boolean z, b bVar) {
        ArrayList arrayList = new ArrayList();
        String strD = bVar.d();
        String strA = bVar.a();
        arrayList.add(strD + File.separator + strA + File.separator + strA);
        if (!z) {
            arrayList.add(strD + File.separator + strA + File.separator + strA + File.separator + "img");
            arrayList.add(strD + File.separator + strA + File.separator + strA + File.separator + "lang");
            arrayList.add(strD + File.separator + strA + File.separator + strA + File.separator + "H5");
            arrayList.add(strD + File.separator + strA + File.separator + strA + File.separator + "libs");
            arrayList.add(strD + File.separator + strA + File.separator + strA + File.separator + "conf");
        } else {
            arrayList.clear();
            arrayList.add(strD + File.separator + strA);
        }
        ekn.b((ArrayList<String>) arrayList);
        if (!"6d5416d9-2167-41df-ab10-c492e152b44f".equals(strA) && !"am16".equals(strA)) {
            bVar.e(strD + File.separator + strA);
            return;
        }
        arrayList.clear();
        arrayList.add(strD + File.separator + strA + File.separator + "img");
        arrayList.add(strD + File.separator + strA + File.separator + "lang");
        arrayList.add(strD + File.separator + strA + File.separator + strA + File.separator + "H5");
        StringBuilder sb = new StringBuilder();
        sb.append(strD);
        sb.append(File.separator);
        sb.append(strA);
        sb.append(File.separator);
        sb.append("libs");
        arrayList.add(sb.toString());
        arrayList.add(strD + File.separator + strA + File.separator + "conf");
        ekn.b((ArrayList<String>) arrayList);
    }

    private void d(String str, ResourceFileListener resourceFileListener, boolean z, b bVar) {
        String strA = bVar.a();
        String strC = bVar.c();
        int iB = bVar.b();
        LogUtil.a("ResourceManagerHelper", " exitUnzip finished resCode:", Integer.valueOf(iB), ":result:", strC);
        e(bVar.i(), bVar.e());
        if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHonourDevice(strA)) {
            b(str, bVar.d(), strA, iB);
            b(resourceFileListener, iB, strC);
            d(strA, resourceFileListener, iB);
        } else if (!z) {
            b(str, bVar.d(), strA, iB);
            b(resourceFileListener, iB, strC);
        } else if (resourceFileListener != null) {
            resourceFileListener.onResult(iB, strA);
        }
    }

    private ZipEntry b(String str, InputStream inputStream, b bVar) throws IOException {
        if (CommonUtil.cj()) {
            bVar.b(new ZipInputStream(inputStream));
        } else {
            bVar.b(new ZipInputStream(new FileInputStream(str)));
        }
        ZipEntry nextEntry = bVar.i().getNextEntry();
        if (nextEntry == null || nextEntry.getName() == null || nextEntry.getName().contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) {
            LogUtil.j("ResourceManagerHelper", " getExistsZipEntry zipEntry is null");
            return nextEntry;
        }
        bVar.b(nextEntry.getName());
        String strA = bVar.a();
        int iLastIndexOf = strA.indexOf("/") <= 0 ? strA.lastIndexOf(".") : strA.indexOf("/");
        if (iLastIndexOf > 0 && iLastIndexOf <= strA.length()) {
            bVar.b(strA.substring(0, iLastIndexOf));
        }
        LogUtil.a("ResourceManagerHelper", " getExistsZipEntry sdcard productId = ", strA);
        return nextEntry;
    }

    private ZipEntry b(String str, b bVar) throws IOException {
        bVar.b(str);
        bVar.b(new ZipInputStream(dxw.d().getAssets().open(str + ".zip")));
        return bVar.i().getNextEntry();
    }

    private void g(String str) throws FileNotFoundException {
        File file = new File(str);
        if (file.exists()) {
            b(file);
        }
    }

    private void b(ResourceFileListener resourceFileListener, int i, String str) {
        if (resourceFileListener != null) {
            LogUtil.a("ResourceManagerHelper", " resourceFileListenerResult resultCallBack is not null,resCode = ", Integer.valueOf(i), ",result = ", str);
            resourceFileListener.onResult(i, str);
        } else {
            ResourceManager.c().c(i, str);
        }
    }

    public void c(String str, InputStream inputStream, String str2, ResourceFileListener resourceFileListener) {
        c(str, inputStream, str2, resourceFileListener, false);
    }

    private void d(final String str, final ResourceFileListener resourceFileListener, final int i) {
        final elh elhVarD;
        if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHonourDevice(str) && (elhVarD = ResourceManager.c().d(str)) != null) {
            File file = new File(dxc.f32475b + str + File.separator + (elhVarD.o().substring(0, elhVarD.o().indexOf(":") - 3) + Header.COMPRESSION_ALGORITHM));
            LogUtil.a("ResourceManagerHelper", " unSoZip jniLibs ");
            if (!file.exists()) {
                if (resourceFileListener != null) {
                    LogUtil.a("ResourceManagerHelper", " unSoZip resultCallBack is not null");
                    resourceFileListener.onResult(i, str);
                    return;
                } else {
                    LogUtil.j("ResourceManagerHelper", " unSoZip resultCallBack is null");
                    return;
                }
            }
            try {
                String canonicalPath = file.getCanonicalPath();
                int iLastIndexOf = canonicalPath.lastIndexOf("/");
                if (iLastIndexOf == -1) {
                    return;
                }
                c(file.getCanonicalPath(), null, canonicalPath.substring(0, iLastIndexOf), new ResourceFileListener() { // from class: elw
                    @Override // com.huawei.health.device.manager.ResourceFileListener
                    public final void onResult(int i2, String str2) {
                        elx.d(elhVarD, str, resourceFileListener, i, i2, str2);
                    }
                });
            } catch (IOException e2) {
                LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper unSoZip IOException is ", e2.getMessage());
            }
        }
    }

    static /* synthetic */ void d(elh elhVar, String str, ResourceFileListener resourceFileListener, int i, int i2, String str2) {
        LogUtil.a("ResourceManagerHelper", " unSoZip jniLibs resultCode ", Integer.valueOf(i2));
        ((MeasureKitManagerApi) Services.b("PluginDevice", MeasureKitManagerApi.class)).registerExternalKit(elhVar.q(), ResourceManager.c().a(str) + File.separator + elhVar.o());
        if (resourceFileListener != null) {
            LogUtil.a("ResourceManagerHelper", " unSoZip onResult resultCallBack is not null");
            resourceFileListener.onResult(i, str);
        } else {
            LogUtil.j("ResourceManagerHelper", " unSoZip resultCallBack is null");
        }
    }

    private void b(String str, String str2, String str3, int i) {
        if (i == 200) {
            if (new DeviceCloudSharePreferencesManager(dxw.d(), "devicedownloadtime").d("isdemo")) {
                return;
            }
            File file = new File(str);
            if (file.exists() && !file.delete()) {
                LogUtil.j("ResourceManagerHelper", " deleteZipFileAndCallbackResult delete file failed");
                return;
            }
            return;
        }
        if (i == -1) {
            LogUtil.a("ResourceManagerHelper", " deleteZipFileAndCallbackResult UNZIP_FAIL_CODE delete file , path is ", str2, str3);
            File file2 = new File(str2 + str3);
            if (file2.exists() && !file2.delete()) {
                LogUtil.j("ResourceManagerHelper", " deleteZipFileAndCallbackResult delete unzipFile failed");
                return;
            }
            return;
        }
        LogUtil.j("ResourceManagerHelper", " deleteZipFileAndCallbackResult delete unzipFile can't find resCode");
    }

    private void e(ZipInputStream zipInputStream, FileOutputStream fileOutputStream) {
        IoUtils.c(fileOutputStream);
        IoUtils.c(zipInputStream);
    }

    public String a(String str, String str2) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                fileInputStream = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i != -1) {
                            messageDigest.update(bArr, 0, i);
                        } else {
                            String strB = b(messageDigest.digest());
                            IoUtils.c(fileInputStream);
                            return strB;
                        }
                    }
                } catch (IOException | NoSuchAlgorithmException unused) {
                    fileInputStream2 = fileInputStream;
                    LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper getHashCode Exception");
                    IoUtils.c(fileInputStream2);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(fileInputStream);
                    throw th;
                }
            } catch (IOException | NoSuchAlgorithmException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStream2;
        }
    }

    private void b(File file) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            LogUtil.a("ResourceManagerHelper", " addMainHelp in");
            Gson gson = new Gson();
            byte[] bArr = new byte[fileInputStream.available()];
            if (fileInputStream.read(bArr) != -1) {
                LogUtil.a("ResourceManagerHelper", " addMainHelp reading");
                String str = new String(bArr, "UTF-8");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                List<eto> list = (List) gson.fromJson(CommonUtil.ac(str), new TypeToken<List<eto>>() { // from class: com.huawei.health.ecologydevice.manager.ResourceManagerHelper$1
                }.getType());
                if (list != null && list.size() > 0) {
                    if (DeviceListManager.c(dxw.d()).d(list) > 0) {
                        LogUtil.d("ResourceManagerHelper", "insertDevice ------ success");
                    } else {
                        LogUtil.d("ResourceManagerHelper", "insertDevice ------ fail");
                    }
                }
            }
        } catch (IOException unused) {
            LogUtil.e("ResourceManagerHelper", "ResourceManagerHelper addMainHelp inputStream IO exception");
        } finally {
            IoUtils.c(fileInputStream);
        }
    }

    public String b(byte[] bArr) {
        String strA = erh.a(bArr, null);
        if (strA != null) {
            return strA.toUpperCase(Locale.ENGLISH);
        }
        return null;
    }

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f33156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f33157b;
        private eky d;
        private String e;
        private ResourceFileListener g;

        a(eky ekyVar, ResourceFileListener resourceFileListener, int i, String str, String str2) {
            this.d = ekyVar;
            this.g = resourceFileListener;
            this.f33156a = i;
            this.f33157b = str;
            this.e = str2;
        }

        public int e() {
            return this.f33156a;
        }

        public String a() {
            return this.f33157b;
        }

        public a c() {
            if (WatchFaceConstant.XML_SUFFIX.equals(elx.this.e(this.e))) {
                LogUtil.a("ResourceManagerHelper", " FileManager download the extension is xml");
                String str = this.e;
                ArrayList<elj> arrayListC = c(this.d, str.substring(str.lastIndexOf("/") + 1));
                LogUtil.a("ResourceManagerHelper", "  group parse success ");
                if (this.g != null) {
                    LogUtil.a("ResourceManagerHelper", "  group parse success callback");
                    this.g.onResult(200, MessageConstant.GROUP_MEDAL_TYPE);
                }
                if (arrayListC.size() > 0) {
                    LogUtil.a("ResourceManagerHelper", " ====toDownloadList size=", Integer.valueOf(arrayListC.size()));
                    this.f33156a = 4000;
                    this.f33157b = WatchFaceConstant.XML_SUFFIX;
                    ResourceManager.c().c(arrayListC);
                } else {
                    this.f33156a = 4001;
                    this.f33157b = WatchFaceConstant.XML_SUFFIX;
                }
            }
            if (".zip".equals(elx.this.e(this.e))) {
                LogUtil.a("ResourceManagerHelper", " FileManager download the extension is zip");
                this.f33156a = AwarenessConstants.REGISTER_SUCCESS_CODE;
                this.f33157b = this.e;
            }
            return this;
        }

        private ArrayList<elj> c(eky ekyVar, String str) {
            String strA;
            ArrayList<elk> arrayListA;
            String strA2;
            if (str.equals("groups.xml") || CommonUtil.cj()) {
                strA = eky.a();
                arrayListA = eky.a("groups.xml");
                strA2 = eky.a();
                new DeviceCloudSharePreferencesManager(dxw.d(), "devicedownloadtime").b("freshtime", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
            } else {
                strA = eky.a();
                arrayListA = eky.a("groups_abroad.xml");
                strA2 = eky.a();
                new DeviceCloudSharePreferencesManager(dxw.d(), "devicedownloadtime").b("abroadfreshtime", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
            }
            ArrayList<elj> arrayList = new ArrayList<>();
            if (strA2 == null || strA2.equals(strA)) {
                LogUtil.a("ResourceManagerHelper", " getProductFileInfos oldVersion == newVersion");
                return arrayList;
            }
            LogUtil.a("ResourceManagerHelper", " getProductFileInfos oldVersion != newVersion");
            return ekyVar.e(arrayListA);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f33159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f33160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private FileOutputStream f33161c;
        private String d;
        private String e;
        private String g;
        private ZipInputStream j;

        b(String str) {
            this.d = str;
        }

        public int b() {
            return this.f33160b;
        }

        public void e(int i) {
            this.f33160b = i;
        }

        public String c() {
            return this.e;
        }

        public void c(String str) {
            this.e = str;
        }

        public String d() {
            return this.g;
        }

        public void e(String str) {
            this.g = str;
        }

        public String a() {
            return this.f33159a;
        }

        public void b(String str) {
            this.f33159a = str;
        }

        public ZipInputStream i() {
            return this.j;
        }

        public void b(ZipInputStream zipInputStream) {
            this.j = zipInputStream;
        }

        public FileOutputStream e() {
            return this.f33161c;
        }

        public void c(FileOutputStream fileOutputStream) {
            this.f33161c = fileOutputStream;
        }

        public b f() {
            this.f33160b = -1;
            this.e = "unzipfaild";
            this.g = this.d;
            this.f33159a = "";
            this.j = null;
            this.f33161c = null;
            return this;
        }
    }
}
