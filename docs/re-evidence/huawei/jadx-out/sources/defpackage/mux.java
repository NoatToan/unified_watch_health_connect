package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.IBaseCommonCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.upload.ErrorCodeUploadApi;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.upload.ErrorCodeUploadInfo;
import com.huawei.hwdevicemgr.R;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.pluginachievement.manager.model.ResultCode;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.HEXUtils;
import health.compact.a.HwEncryptUtil;
import health.compact.a.Utils;
import health.compact.a.WhiteBoxManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mux {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42467b = new Object();
    private static mux d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseCommonCallback f42468a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42469c;
    private String e;

    private mux() {
    }

    public static mux b() {
        mux muxVar;
        synchronized (f42467b) {
            if (d == null) {
                d = new mux();
            }
            muxVar = d;
        }
        return muxVar;
    }

    public void b(DeviceInfo deviceInfo, String str, IBaseCommonCallback iBaseCommonCallback) throws Throwable {
        if (iBaseCommonCallback == null) {
            ReleaseLogUtil.e("Dfx_FileUploadLogRelease", "startUploadLog, ", "callback is null");
            return;
        }
        this.f42468a = iBaseCommonCallback;
        this.e = str;
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("Dfx_FileUploadLogRelease", "startUploadLog, ", "fileName is empty");
            muy.c(this.f42468a, 1, "fileName is empty");
            return;
        }
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.e("Dfx_FileUploadLogRelease", "startUploadLog, filePath empty");
            muy.c(this.f42468a, 1, "fileName is empty");
        } else {
            d(d(deviceInfo, str, strA, ""));
        }
    }

    public void c(Context context) {
        ReleaseLogUtil.d("Dfx_FileUploadLogRelease", "startUploadLogWithWifi enter");
        if (context == null) {
            LogUtil.d("FileUploadLogRelease", "startUploadLogWithWifi context is null");
            return;
        }
        mve.a().c(muy.e);
        String str = muy.e;
        File file = new File(str);
        if (!file.exists()) {
            LogUtil.d("FileUploadLogRelease", "dir is not exists");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.a("FileUploadLogRelease", "uploadZip files is null.");
            return;
        }
        if (!muy.b()) {
            ReleaseLogUtil.e("Dfx_FileUploadLogRelease", "isCanUpload is false");
            return;
        }
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            String str2 = str + "/" + file2.getName();
            LogUtil.a("FileUploadLogRelease", "targetPath: ", str2);
            if (!muy.a(name)) {
                ReleaseLogUtil.e("Dfx_FileUploadLogRelease", "isUpload is false");
            } else if (mjh.e(context) && name.contains("_WearableCommercial")) {
                lwq lwqVarD = d((DeviceInfo) null, name, str2, muy.a(str2, context));
                lwqVarD.d(name);
                d(lwqVarD);
            }
        }
    }

    public lwq d(DeviceInfo deviceInfo, String str, String str2, String str3) {
        String str4;
        String lowerCase;
        lwv lwvVar = new lwv();
        lwvVar.e(BaseApplication.getAppPackage());
        lwvVar.e(1);
        lwvVar.a(Integer.parseInt(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009)));
        lwvVar.b(2);
        lwvVar.b(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008));
        lwvVar.c(ThirdLoginDataStorageUtil.getTokenTypeValue());
        lwvVar.a(new Date().getTime());
        lwq lwqVar = new lwq();
        if (Utils.o()) {
            str4 = "1012";
        } else {
            str4 = ResultCode.ERROR_TS_TIMEOUT;
        }
        lwqVar.a(str4);
        ReleaseLogUtil.d("Dfx_FileUploadLogRelease", "getEvenLogUpload appId: ", lwqVar.b());
        lwqVar.b(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        lwqVar.m(CommonUtil.a(BaseApplication.getContext()));
        lwqVar.f(str2);
        lwqVar.a(lwvVar);
        lwqVar.c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        lwqVar.e(CommonUtil.ag());
        String strC = c(str);
        if (TextUtils.isEmpty(strC)) {
            strC = Build.MODEL;
        }
        lwqVar.j(strC);
        lwqVar.h(Build.VERSION.RELEASE);
        lwqVar.g(a(BaseApplication.getContext()));
        if (!TextUtils.isEmpty(str3)) {
            deviceInfo = mjh.j(str3);
        }
        if (deviceInfo == null) {
            lowerCase = "0000000000000000";
        } else {
            lowerCase = nio.c(deviceInfo.getSecurityDeviceId()).toLowerCase(Locale.ENGLISH);
        }
        lwqVar.i(lowerCase);
        return lwqVar;
    }

    private String a(String str) {
        File file = new File(muy.e);
        String canonicalPath = "";
        if (!file.exists()) {
            LogUtil.d("FileUploadLogRelease", "file not exists");
            return "";
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            LogUtil.d("FileUploadLogRelease", "files is empty");
            return "";
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().equals(str)) {
                try {
                    canonicalPath = file2.getCanonicalPath();
                    break;
                } catch (IOException unused) {
                    ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "startUploadLog IOException");
                }
            }
        }
        if (TextUtils.isEmpty(canonicalPath)) {
            ReleaseLogUtil.e("Dfx_FileUploadLogRelease", "target files is empty");
        }
        return canonicalPath;
    }

    public void d(lwq lwqVar) throws Throwable {
        String strD;
        LogUtil.a("FileUploadLogRelease", "getServerDomain logPath:", lwqVar.h());
        if (TextUtils.equals(ResultCode.ERROR_TS_TIMEOUT, lwqVar.b())) {
            strD = e();
        } else {
            strD = d();
        }
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        this.f42469c = a();
        String strE = e(":443/v2/getServerDomain?appID=" + lwqVar.b());
        LogUtil.a("FileUploadLogRelease", "getServerDomainUrl url:", strE);
        String strE2 = e(lwqVar);
        LogUtil.a("FileUploadLogRelease", "getServerDomainUrl serverDomainParams:", strE2);
        try {
            b(lwqVar, d(strE, mjc.d(FeedbackWebConstants.SERVER_DOMAIN + lwqVar.b(), strE2, strD), strE2));
        } catch (UnsupportedEncodingException unused) {
            muy.c(this.f42468a, 1, TrackConstants$Events.EXCEPTION);
            ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "getErrorCodeLogUrl UnsupportedEncodingException");
        }
    }

    private String e() {
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        return whiteBoxManagerB.a(1, 44) + whiteBoxManagerB.a(1, 1044) + whiteBoxManagerB.a(1, 2044);
    }

    private String d() {
        String str = BaseApplication.getContext().getString(R.string.detect_oversea_word_f) + BaseApplication.getContext().getString(R.string.detect_oversea_word_s) + BaseApplication.getContext().getString(R.string.detect_oversea_word_l);
        return new String(ckg.a("AES/CBC/PKCS5Padding", HEXUtils.a(str.substring(64)), HEXUtils.a(str.substring(0, 32)), HEXUtils.a(str.substring(32, 64))));
    }

    private String a() {
        String countryCode = com.huawei.common.util.Utils.getCountryCode();
        String[] stringArray = BaseApplication.getContext().getResources().getStringArray(R.array.CountryCodes);
        ReleaseLogUtil.d("Dfx_FileUploadLogRelease", "getCountryCode stringCountryId:", countryCode);
        String str = "";
        if (stringArray == null) {
            return "";
        }
        for (String str2 : stringArray) {
            String[] strArrSplit = str2.split(",");
            if (strArrSplit.length > 1 && strArrSplit[1].trim().equals(countryCode.trim())) {
                str = strArrSplit[0];
                break;
            }
        }
        ReleaseLogUtil.d("Dfx_FileUploadLogRelease", "getCountryCode resourceCountryCode:", str);
        return str;
    }

    private String e(String str) {
        return GRSManager.c(BaseApplication.getContext()).getUrl("domainLogserviceHicloud") + str;
    }

    private String e(lwq lwqVar) {
        StringBuffer stringBuffer = new StringBuffer("model=");
        stringBuffer.append(lwqVar.c()).append("&romVersion=");
        stringBuffer.append(lwqVar.f()).append("&emuiVersion=");
        stringBuffer.append(lwqVar.a()).append("&osVersion=");
        stringBuffer.append(lwqVar.d()).append("&countryCode=");
        stringBuffer.append(this.f42469c).append("&shaSN=");
        stringBuffer.append(lwqVar.g());
        return stringBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [mux] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.io.BufferedReader] */
    private JSONObject d(String str, String str2, String str3) throws Throwable {
        Throwable th;
        ?? r12;
        JSONObject jSONObject;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        BufferedReader bufferedReader3;
        JSONObject jSONObject2;
        BufferedReader bufferedReader4;
        char c2;
        LogUtil.a("FileUploadLogRelease", "processResult urlPath: ", str);
        InputStream inputStream = null;
        jSONObject = null;
        jSONObject = null;
        JSONObject jSONObject3 = null;
        JSONObject jSONObject4 = null;
        BufferedReader bufferedReader5 = null;
        InputStream inputStream2 = null;
        inputStream = null;
        inputStream = null;
        inputStream = null;
        try {
            try {
                ErrorCodeUploadApi errorCodeUploadApi = (ErrorCodeUploadApi) oet.c(c()).e(ErrorCodeUploadApi.class);
                HashMap map = new HashMap();
                map.put("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
                map.put("Authorization", str2);
                Response<ResponseBody> responseExecute = errorCodeUploadApi.errorCodeUploadPost(str, map, str3).execute();
                int code = responseExecute.getCode();
                if (responseExecute.isOK()) {
                    ResponseBody body = responseExecute.getBody();
                    if (body != null && body.getInputStream() != null) {
                        InputStream inputStream3 = body.getInputStream();
                        try {
                            bufferedReader4 = new BufferedReader(new InputStreamReader(inputStream3, "utf-8"));
                            try {
                                try {
                                    StringBuffer stringBuffer = new StringBuffer(16);
                                    while (true) {
                                        int i = bufferedReader4.read();
                                        if (i == -1 || (c2 = (char) i) == '\n') {
                                            break;
                                            break;
                                        }
                                        if (stringBuffer.length() >= 104857600) {
                                            throw new IllegalStateException("input too long");
                                        }
                                        stringBuffer.append(c2);
                                    }
                                    jSONObject2 = new JSONObject(stringBuffer.toString());
                                    try {
                                        LogUtil.a("FileUploadLogRelease", "processResult jsonObject:", jSONObject2);
                                        inputStream2 = inputStream3;
                                        bufferedReader3 = bufferedReader4;
                                    } catch (IOException unused) {
                                        jSONObject3 = jSONObject2;
                                        JSONObject jSONObject5 = jSONObject3;
                                        inputStream = inputStream3;
                                        jSONObject = jSONObject5;
                                        bufferedReader2 = bufferedReader4;
                                        ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "processResult IOException");
                                        str2 = bufferedReader2;
                                        d(inputStream);
                                        a(str2);
                                        return jSONObject;
                                    } catch (JSONException unused2) {
                                        jSONObject4 = jSONObject2;
                                        JSONObject jSONObject6 = jSONObject4;
                                        inputStream = inputStream3;
                                        jSONObject = jSONObject6;
                                        bufferedReader = bufferedReader4;
                                        ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "processResult JSONException");
                                        str2 = bufferedReader;
                                        d(inputStream);
                                        a(str2);
                                        return jSONObject;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader5 = bufferedReader4;
                                    r12 = bufferedReader5;
                                    inputStream = inputStream3;
                                    d(inputStream);
                                    a(r12);
                                    throw th;
                                }
                            } catch (IOException unused3) {
                            } catch (JSONException unused4) {
                            }
                        } catch (IOException unused5) {
                            bufferedReader4 = null;
                        } catch (JSONException unused6) {
                            bufferedReader4 = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    ReleaseLogUtil.e("Dfx_FileUploadLogRelease", "requestUtil responseBody or responseBody.getInputStream() is null");
                    d(null);
                    a(null);
                    return null;
                }
                ReleaseLogUtil.e("Dfx_FileUploadLogRelease", "processResult responseCode: ", Integer.valueOf(code));
                bufferedReader3 = null;
                jSONObject2 = null;
                d(inputStream2);
                a(bufferedReader3);
                return jSONObject2;
            } catch (Throwable th4) {
                th = th4;
                r12 = str2;
            }
        } catch (IOException unused7) {
            jSONObject = null;
            bufferedReader2 = null;
        } catch (JSONException unused8) {
            jSONObject = null;
            bufferedReader = null;
        } catch (Throwable th5) {
            th = th5;
            r12 = 0;
        }
    }

    private HttpClient c() {
        RestClientGlobalInstance.getInstance().init(BaseApplication.getContext());
        return new HttpClient.Builder().connectTimeout(120000).readTimeout(120000).build();
    }

    private void d(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "closeInputStream IOException");
            }
        }
    }

    private void a(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused) {
                ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "closeBufferedReader IOException");
            }
        }
    }

    private void b(lwq lwqVar, JSONObject jSONObject) throws Throwable {
        try {
            if (jSONObject == null) {
                ReleaseLogUtil.e("Dfx_FileUploadLogRelease", "jsonObject is null.");
                muy.c(this.f42468a, 1, "null object");
                return;
            }
            if (jSONObject.has("resCode")) {
                int i = jSONObject.getInt("resCode");
                ReleaseLogUtil.d("Dfx_FileUploadLogRelease", "handleResult resCode:", Integer.valueOf(i));
                if (i == 0) {
                    if (jSONObject.has("reason")) {
                        ReleaseLogUtil.d("Dfx_FileUploadLogRelease", "result success");
                    }
                    if (jSONObject.has("accessToken")) {
                        c(lwqVar, jSONObject.getString("accessToken"));
                        return;
                    }
                    return;
                }
                if (jSONObject.has("reason")) {
                    ReleaseLogUtil.d("Dfx_FileUploadLogRelease", "result failed, code:", jSONObject.getString("reason"));
                    muy.c(this.f42468a, 1, jSONObject.getString("reason"));
                }
            }
        } catch (JSONException unused) {
            muy.c(this.f42468a, 1, TrackConstants$Events.EXCEPTION);
            ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "getErrorcodLogUrl JSONException");
        }
    }

    private void c(lwq lwqVar, String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File file = new File(lwqVar.h());
                fileInputStream = new FileInputStream(file);
                try {
                    int iAvailable = fileInputStream.available();
                    LogUtil.a("FileUploadLogRelease", "getErrorCodeUploadInfo size:", Integer.valueOf(iAvailable));
                    byte[] bArr = new byte[iAvailable];
                    LogUtil.a("FileUploadLogRelease", "getErrorCodeUploadInfo ret:", Integer.valueOf(fileInputStream.read(bArr)));
                    String strA = a(lwqVar, file, URLEncoder.encode(file.getName(), "UTF-8"), mjc.d(bArr));
                    LogUtil.a("FileUploadLogRelease", "getErrorCodeUploadInfo uploadInfoParams:", strA);
                    String strD = mjc.d(FeedbackWebConstants.UPLOAD_INFO + lwqVar.b(), strA, str);
                    String strE = e(":443/v2/getUploadInfo?appID=" + lwqVar.b());
                    LogUtil.a("FileUploadLogRelease", "getErrorCodeUploadInfo", strE);
                    JSONObject jSONObjectD = d(strE, strD, strA);
                    if (jSONObjectD != null) {
                        d(bArr, lwqVar, jSONObjectD, str);
                    }
                    a(fileInputStream);
                } catch (IOException unused) {
                    fileInputStream2 = fileInputStream;
                    muy.c(this.f42468a, 1, TrackConstants$Events.EXCEPTION);
                    ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "getErrorCodeUploadInfo IOException");
                    a(fileInputStream2);
                } catch (OutOfMemoryError unused2) {
                    fileInputStream2 = fileInputStream;
                    muy.c(this.f42468a, 1, TrackConstants$Events.EXCEPTION);
                    ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "getErrorCodeUploadInfo OutOfMemoryError");
                    a(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    a(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        } catch (IOException unused3) {
        } catch (OutOfMemoryError unused4) {
        }
    }

    private void a(FileInputStream fileInputStream) {
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
                ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "close IOException");
            }
        }
    }

    private String a(lwq lwqVar, File file, String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer("model=");
        stringBuffer.append(lwqVar.c()).append("&romVersion=");
        stringBuffer.append(lwqVar.f()).append("&emuiVersion=");
        stringBuffer.append(lwqVar.a()).append("&osVersion=");
        stringBuffer.append(lwqVar.d()).append("&countryCode=");
        stringBuffer.append(this.f42469c).append("&shaSN=");
        stringBuffer.append(lwqVar.g()).append("&logType=0&fileName=");
        stringBuffer.append(str).append("&fileHashList=[{\"fileMd5\":\"\",\"fileSha256\":\"");
        stringBuffer.append(str2).append("\",\"fileSize\":\"").append(file.length()).append("\"}]&fileSize=");
        stringBuffer.append(file.length()).append("&encryptKey=000000&patchSize=");
        stringBuffer.append(mjc.d(file)).append("&patchNum=1&patchVer=0");
        return stringBuffer.toString();
    }

    private void d(byte[] bArr, lwq lwqVar, JSONObject jSONObject, String str) {
        if (!jSONObject.has("resCode")) {
            ReleaseLogUtil.e("Dfx_FileUploadLogRelease", "errorCodeUpload failed, ", "wrong code");
            muy.c(this.f42468a, 1, "wrong code");
            return;
        }
        try {
            int i = jSONObject.getInt("resCode");
            if (i != 0) {
                ReleaseLogUtil.e("Dfx_FileUploadLogRelease", "errorCodeUpload failed, resCode ", Integer.valueOf(i));
                muy.c(this.f42468a, 1, "wrong code");
            } else if (jSONObject.has("uploadInfoList")) {
                JSONArray jSONArray = jSONObject.getJSONArray("uploadInfoList");
                ReleaseLogUtil.d("Dfx_FileUploadLogRelease", "uploadInfoList length ", Integer.valueOf(jSONArray.length()));
                a(jSONArray, bArr, jSONObject, lwqVar, str);
            }
        } catch (JSONException unused) {
            muy.c(this.f42468a, 1, TrackConstants$Events.EXCEPTION);
            ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "errorCodeUpload JSONException");
        }
    }

    private void a(JSONArray jSONArray, byte[] bArr, final JSONObject jSONObject, final lwq lwqVar, final String str) {
        if (jSONArray.length() == 0) {
            ReleaseLogUtil.e("Dfx_FileUploadLogRelease", "startUpload, ", "list is empty");
            muy.c(this.f42468a, 1, "list is empty");
            return;
        }
        try {
            Object obj = jSONArray.get(0);
            LogUtil.a("FileUploadLogRelease", "Object Object", obj.toString());
            ErrorCodeUploadInfo errorCodeUploadInfo = (ErrorCodeUploadInfo) b(obj.toString(), ErrorCodeUploadInfo.class);
            mjp.e(errorCodeUploadInfo.getUploadUrl(), errorCodeUploadInfo.getMethod(), bArr, b(new JSONObject(new Gson().toJson(errorCodeUploadInfo.getHeaders()))), new IBaseResponseCallback() { // from class: mux.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj2) {
                    if (i == 200) {
                        muy.c(mux.this.f42468a, 0, mux.this.e);
                        try {
                            String string = jSONObject.has("fileUniqueFlag") ? jSONObject.getString("fileUniqueFlag") : null;
                            String string2 = jSONObject.has("currentTime") ? jSONObject.getString("currentTime") : null;
                            ReleaseLogUtil.d("Dfx_FileUploadLogRelease", "uploadSuccess result ok");
                            muy.e(lwqVar.e());
                            mux.this.b(lwqVar, string, string2, str);
                            mux.this.a(lwqVar);
                        } catch (JSONException unused) {
                            ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "onResponse JSONException");
                            muy.c(mux.this.f42468a, 1, TrackConstants$Events.EXCEPTION);
                        }
                    }
                }
            });
        } catch (NullPointerException e) {
            ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "setJson NullPointerException ", ExceptionUtils.c(e));
            muy.c(this.f42468a, 1, TrackConstants$Events.EXCEPTION);
        } catch (JSONException e2) {
            ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "setJson JSONException ", ExceptionUtils.c(e2));
            muy.c(this.f42468a, 1, TrackConstants$Events.EXCEPTION);
        }
    }

    private <T> T b(String str, Class<T> cls) {
        LogUtil.a("FileUploadLogRelease", "jsonStr:", str);
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        LogUtil.a("FileUploadLogRelease", "getModelFromJson:111111");
        return (T) new Gson().fromJson(CommonUtil.ac(str), (Class) cls);
    }

    private Map<String, String> b(JSONObject jSONObject) {
        HashMap map = new HashMap(16);
        try {
            if (jSONObject.has("Authorization")) {
                map.put("Authorization", jSONObject.getString("Authorization"));
            }
            if (jSONObject.has("x-amz-content-sha256")) {
                map.put("x-amz-content-sha256", jSONObject.getString("x-amz-content-sha256"));
            }
            if (jSONObject.has("x-amz-date")) {
                map.put("x-amz-date", jSONObject.getString("x-amz-date"));
            }
            if (jSONObject.has("Host")) {
                map.put("Host", jSONObject.getString("Host"));
            }
            if (jSONObject.has("Content-Length")) {
                map.put("Content-Length", jSONObject.getString("Content-Length"));
            }
            if (jSONObject.has(FeedbackWebConstants.CONTENT_MD5)) {
                map.put(FeedbackWebConstants.CONTENT_MD5, jSONObject.getString(FeedbackWebConstants.CONTENT_MD5));
            }
            if (jSONObject.has("Content-Type")) {
                map.put("Content-Type", jSONObject.getString("Content-Type"));
            }
            if (jSONObject.has(FeedbackWebConstants.USER_AGENT)) {
                map.put(FeedbackWebConstants.USER_AGENT, jSONObject.getString(FeedbackWebConstants.USER_AGENT));
                return map;
            }
        } catch (JSONException unused) {
            LogUtil.a("FileUploadLogRelease", " putHashMap JSONException");
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(lwq lwqVar, String str, String str2, String str3) {
        LogUtil.a("FileUploadLogRelease", "getUploadSuccess filePath:", lwqVar.h());
        try {
            String strB = b(lwqVar, str, str2);
            LogUtil.a("FileUploadLogRelease", "getUploadSuccess uploadSuccessParams:", strB);
            String strD = mjc.d(FeedbackWebConstants.NOTIFY_UPLOAD_SUCC + lwqVar.b(), strB, str3);
            String strE = e(":443/v2/notifyUploadSucc?appID=" + lwqVar.b());
            LogUtil.a("FileUploadLogRelease", "getUploadSuccess successUrl:", strE);
            if (d(strE, strD, strB) == null) {
                ReleaseLogUtil.e("Dfx_FileUploadLogRelease", "jsonObject is null");
            }
        } catch (UnsupportedEncodingException unused) {
            muy.c(this.f42468a, 1, TrackConstants$Events.EXCEPTION);
            ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "getUploadSuccess UnsupportedEncodingException");
        }
    }

    private String b(lwq lwqVar, String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer("model=");
        stringBuffer.append(lwqVar.c()).append("&romVersion=");
        stringBuffer.append(lwqVar.f()).append("&emuiVersion=");
        stringBuffer.append(lwqVar.a()).append("&osVersion=");
        stringBuffer.append(lwqVar.d()).append("&countryCode=");
        stringBuffer.append(this.f42469c).append("&fileUniqueFlag=");
        stringBuffer.append(str).append("&uploadTime=");
        stringBuffer.append(str2).append("&shaSN=");
        stringBuffer.append(lwqVar.g());
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(lwq lwqVar) {
        String strH = lwqVar.h();
        LogUtil.a("FileUploadLogRelease", "encryfilePath", strH);
        if (TextUtils.isEmpty(strH)) {
            return;
        }
        File file = new File(strH);
        try {
            LogUtil.a("FileUploadLogRelease", "encryfilePath", file.getCanonicalPath());
        } catch (IOException e) {
            ReleaseLogUtil.a("Dfx_FileUploadLogRelease", e.getMessage());
        }
        if (!file.exists() || !file.delete()) {
            ReleaseLogUtil.e("Dfx_FileUploadLogRelease", "The file does not exist or is incorrect. Failed to delete the file.");
            try {
                xjt.r("FileUploadLogRelease, deleteEncryFile failed file name = " + HwEncryptUtil.b(BaseApplication.getContext()).e(2, strH));
                return;
            } catch (GeneralSecurityException unused) {
                ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "encryptData exception");
                return;
            }
        }
        ReleaseLogUtil.d("Dfx_FileUploadLogRelease", "File deleted successfully.");
    }

    private String c(String str) {
        if (str == null) {
            return "";
        }
        if (str.contains("Talos-")) {
            return "Talos-";
        }
        if (str.contains("Fortuna-")) {
            return "Fortuna-";
        }
        if (str.contains("Latona")) {
            return "Latona";
        }
        if (str.contains("ELA")) {
            return "ELA";
        }
        if (str.contains("Crius")) {
            return "Crius";
        }
        if (str.contains("TerraB09")) {
            return "TerraB09";
        }
        if (str.contains("Terra")) {
            return "Terra";
        }
        if (!str.contains("Diana")) {
            return "";
        }
        return "Diana";
    }

    private String a(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            ReleaseLogUtil.a("Dfx_FileUploadLogRelease", "getAppVersionName() NameNotFoundException");
            str = "2.0";
        }
        LogUtil.e("FileUploadLogRelease", "getAppVersionName() return=", str);
        return str;
    }
}
