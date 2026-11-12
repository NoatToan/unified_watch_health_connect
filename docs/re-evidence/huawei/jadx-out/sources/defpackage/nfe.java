package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.framework.network.restclient.RestClientGlobalInstance;
import com.huawei.hms.framework.network.restclient.hwhttp.HttpClient;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwdfxmgr.upload.ErrorCodeUploadInfo;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.GRSManager;
import health.compact.a.HwEncryptUtil;
import health.compact.a.WhiteBoxManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class nfe {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f43056c;

    public static void d(lwq lwqVar) {
        String strH = lwqVar.h();
        LogUtil.a("LogUpload Service errorcode", "encryfilePath", strH);
        if (TextUtils.isEmpty(strH)) {
            return;
        }
        File file = new File(strH);
        try {
            LogUtil.a("LogUpload Service errorcode", "encryfilePath", file.getCanonicalPath());
        } catch (IOException e) {
            LogUtil.a("LogUpload Service errorcode", e.getMessage());
        }
        if (file.exists() && file.delete()) {
            LogUtil.a("LogUpload Service errorcode", "File deleted successfully.");
        } else {
            LogUtil.a("LogUpload Service errorcode", "The file does not exist or is incorrect. Failed to delete the file.");
        }
    }

    private static String d(boolean z) {
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        StringBuilder sb = new StringBuilder();
        int i = z ? 41 : 34;
        int i2 = z ? 1041 : 1034;
        int i3 = z ? 2041 : 2034;
        sb.append(whiteBoxManagerB.a(1, i));
        sb.append(whiteBoxManagerB.a(1, i2));
        sb.append(whiteBoxManagerB.a(1, i3));
        return sb.toString();
    }

    public static void a(final lwq lwqVar) {
        if (lwqVar == null || TextUtils.isEmpty(lwqVar.b())) {
            ReleaseLogUtil.a("Dfx_LogUpload Service errorcode", "getErrorCodeLogUrl invalid params");
            return;
        }
        LogUtil.a("LogUpload Service errorcode", "getErrorCodeLogUrl logPath:", lwqVar.h());
        String strD = d(lwqVar.i());
        if (TextUtils.isEmpty(strD)) {
            return;
        }
        f43056c = e();
        final String strC = c(lwqVar);
        LogUtil.a("LogUpload Service errorcode", "getServerDomainUrl url:", strC);
        final String strB = b(lwqVar);
        try {
            final String strD2 = mjc.d(FeedbackWebConstants.SERVER_DOMAIN + lwqVar.b(), strB, strD);
            ThreadPoolManager.c().b("Dfx_LogUpload Service errorcode", new Runnable() { // from class: nfd
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    nfe.b(lwqVar, nfe.b(strC, strD2, strB));
                }
            });
        } catch (UnsupportedEncodingException unused) {
            ReleaseLogUtil.a("Dfx_LogUpload Service errorcode", "getErrorCodeLogUrl UnsupportedEncodingException");
        }
    }

    private static String e() {
        String commonCountryCode = GRSManager.c(BaseApplication.getContext()).getCommonCountryCode();
        String[] stringArray = BaseApplication.getContext().getResources().getStringArray(R.array.CountryCodes);
        ReleaseLogUtil.d("Dfx_LogUpload Service errorcode", "getCountryCode stringCountryId:", commonCountryCode);
        String str = "";
        if (stringArray == null) {
            return "";
        }
        for (String str2 : stringArray) {
            String[] strArrSplit = str2.split(",");
            if (strArrSplit.length > 1 && strArrSplit[1].trim().equals(commonCountryCode.trim())) {
                str = strArrSplit[0];
                break;
            }
        }
        ReleaseLogUtil.d("Dfx_LogUpload Service errorcode", "getCountryCode resourceCountryCode:", str);
        return str;
    }

    private static String c(lwq lwqVar) {
        String str;
        String str2;
        boolean zI = lwqVar.i();
        if (zI) {
            str = "/v2/getServerDomain?appID=2019";
            str2 = ":443/v2/getServerDomain?appID=2019";
        } else {
            str = "/v2/getServerDomain?appID=1019";
            str2 = ":443/v2/getServerDomain?appID=1019";
        }
        return c(zI, str, str2);
    }

    private static String b(lwq lwqVar) {
        StringBuffer stringBuffer = new StringBuffer("model=");
        stringBuffer.append(lwqVar.c()).append("&romVersion=");
        stringBuffer.append(lwqVar.f()).append("&emuiVersion=");
        stringBuffer.append(lwqVar.a()).append("&osVersion=");
        stringBuffer.append(lwqVar.d()).append("&countryCode=");
        stringBuffer.append(f43056c).append("&shaSN=");
        stringBuffer.append(lwqVar.g());
        return stringBuffer.toString();
    }

    private static String c(boolean z, String str, String str2) {
        if (CompileParameterUtil.d("IS_TEST_VERSION")) {
            return GRSManager.c(BaseApplication.getContext()).getUrl("biOperation") + str;
        }
        if (z) {
            return lon.c().d("domain_log_service_hicloud_honor") + str2;
        }
        return GRSManager.c(BaseApplication.getContext()).getUrl("domainLogserviceHicloud") + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(lwq lwqVar, JSONObject jSONObject) throws Throwable {
        try {
            if (jSONObject == null) {
                LogUtil.a("LogUpload Service errorcode", "jsonObject is null.");
                return;
            }
            if (jSONObject.has("resCode")) {
                int i = jSONObject.getInt("resCode");
                ReleaseLogUtil.d("Dfx_LogUpload Service errorcode", "handleResult resCode:", Integer.valueOf(i));
                b(i, lwqVar.h(), "getServerDomain");
                if (i == 0) {
                    if (jSONObject.has("reason")) {
                        ReleaseLogUtil.d("Dfx_LogUpload Service errorcode", "result success");
                    }
                    if (jSONObject.has("accessToken")) {
                        b(lwqVar, jSONObject.getString("accessToken"));
                        return;
                    }
                    return;
                }
                if (jSONObject.has("reason")) {
                    ReleaseLogUtil.e("Dfx_LogUpload Service errorcode", "result failed, reason:", jSONObject.getString("reason"));
                }
            }
        } catch (JSONException unused) {
            ReleaseLogUtil.a("Dfx_LogUpload Service errorcode", "getErrorcodLogUrl JSONException");
        }
    }

    private static void b(int i, String str, String str2) {
        if (i != 302002 && i != 302003 && i != 302004) {
            ReleaseLogUtil.d("Dfx_LogUpload Service errorcode", "updateFileBlockRetryRecord ignore");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("Dfx_LogUpload Service errorcode", "updateFileBlockRetryRecord filePath error");
            return;
        }
        File file = new File(str);
        if (!file.exists() || TextUtils.isEmpty(file.getName())) {
            ReleaseLogUtil.e("Dfx_LogUpload Service errorcode", "updateFileBlockRetryRecord fileName error");
            return;
        }
        String name = file.getName();
        ReleaseLogUtil.d("Dfx_LogUpload Service errorcode", "updateFileBlockRetryRecord resultCode = ", Integer.valueOf(i), ", fileName = ", name, ", tag = ", str2);
        mjh.c(name);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.FileInputStream] */
    private static void b(lwq lwqVar, String str) throws Throwable {
        ?? fileInputStream;
        ?? r5 = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        ?? r6 = 0;
        ?? r7 = 0;
        try {
            try {
                File file = new File(lwqVar.h());
                LogUtil.a("LogUpload Service errorcode", "file name:", file.getPath());
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr3 = new byte[fileInputStream.available()];
                    if (fileInputStream.read(bArr3) != -1) {
                        try {
                            byte[] bArrA = HwEncryptUtil.b(BaseApplication.getContext()).a(2, new String(bArr3, "utf-8"));
                            int iD = lww.d(bArrA);
                            bArr = new byte[iD];
                            System.arraycopy(bArrA, 4, bArr, 0, iD);
                            bArr2 = bArr;
                        } catch (Exception unused) {
                            ReleaseLogUtil.a("Dfx_LogUpload Service errorcode", "decryptByteData Exception");
                            bArr2 = bArr;
                        }
                    }
                    if (bArr2 == null || bArr2.length <= 0) {
                        try {
                            fileInputStream.close();
                            r5 = bArr2;
                        } catch (IOException unused2) {
                            ReleaseLogUtil.a("LogUpload Service errorcode", "fis.close IOException");
                            r5 = bArr2;
                        }
                    } else {
                        String strA = a(lwqVar, file, bArr2, URLEncoder.encode(file.getName(), "UTF-8"));
                        String strD = mjc.d(FeedbackWebConstants.UPLOAD_INFO + lwqVar.b(), strA, str);
                        byte[] bArr4 = (byte[]) bArr2.clone();
                        String strE = e(lwqVar);
                        LogUtil.a("LogUpload Service errorcode", "getUploadInfoUrl", strE);
                        JSONObject jSONObjectB = b(strE, strD, strA);
                        if (jSONObjectB != null) {
                            a(bArr4, lwqVar, jSONObjectB, str);
                        }
                        try {
                            fileInputStream.close();
                            r5 = bArr4;
                        } catch (IOException unused3) {
                            ReleaseLogUtil.a("LogUpload Service errorcode", "fis.close IOException");
                            r5 = bArr4;
                        }
                    }
                } catch (IOException unused4) {
                    r6 = fileInputStream;
                    ReleaseLogUtil.a("Dfx_LogUpload Service errorcode", "getErrorCodeUploadInfo IOException");
                    r5 = r6;
                    if (r6 != 0) {
                        try {
                            r6.close();
                            r5 = r6;
                        } catch (IOException unused5) {
                            ReleaseLogUtil.a("LogUpload Service errorcode", "fis.close IOException");
                            r5 = r6;
                        }
                    }
                } catch (OutOfMemoryError unused6) {
                    r7 = fileInputStream;
                    ReleaseLogUtil.a("Dfx_LogUpload Service errorcode", "getErrorCodeUploadInfo OutOfMemoryError");
                    r5 = r7;
                    if (r7 != 0) {
                        try {
                            r7.close();
                            r5 = r7;
                        } catch (IOException unused7) {
                            ReleaseLogUtil.a("LogUpload Service errorcode", "fis.close IOException");
                            r5 = r7;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != 0) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused8) {
                            ReleaseLogUtil.a("LogUpload Service errorcode", "fis.close IOException");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = r5;
            }
        } catch (IOException unused9) {
        } catch (OutOfMemoryError unused10) {
        }
    }

    private static String e(lwq lwqVar) {
        String str;
        String str2;
        boolean zI = lwqVar.i();
        if (zI) {
            str = "/v2/getUploadInfo?appID=2019";
            str2 = ":443/v2/getUploadInfo?appID=2019";
        } else {
            str = "/v2/getUploadInfo?appID=1019";
            str2 = ":443/v2/getUploadInfo?appID=1019";
        }
        return c(zI, str, str2);
    }

    private static String a(lwq lwqVar, File file, byte[] bArr, String str) {
        StringBuffer stringBuffer = new StringBuffer("model=");
        stringBuffer.append(lwqVar.c()).append("&romVersion=");
        stringBuffer.append(lwqVar.f()).append("&emuiVersion=");
        stringBuffer.append(lwqVar.a()).append("&osVersion=");
        stringBuffer.append(lwqVar.d()).append("&countryCode=");
        stringBuffer.append(f43056c).append("&shaSN=");
        stringBuffer.append(lwqVar.g()).append("&logType=0&fileName=");
        stringBuffer.append(str).append("&fileHashList=[{\"fileMd5\":\"\",\"fileSha256\":\"");
        stringBuffer.append(mjc.d(bArr)).append("\",\"fileSize\":\"").append(bArr.length).append("\"}]&fileSize=");
        stringBuffer.append(bArr.length).append("&encryptKey=000000&patchSize=");
        stringBuffer.append(mjc.d(file)).append("&patchNum=1&patchVer=0");
        return stringBuffer.toString();
    }

    private static void a(byte[] bArr, lwq lwqVar, JSONObject jSONObject, String str) {
        if (jSONObject.has("resCode")) {
            try {
                int i = jSONObject.getInt("resCode");
                b(i, lwqVar.h(), "getUploadInfo");
                if (i == 0) {
                    if (jSONObject.has("reason")) {
                        LogUtil.a("LogUpload Service errorcode", "errorCodeUpload success, code", jSONObject.getString("reason"));
                    }
                    if (jSONObject.has("uploadInfoList")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("uploadInfoList");
                        LogUtil.a("LogUpload Service errorcode", "uploadInfoList length ", Integer.valueOf(jSONArray.length()));
                        a(jSONArray, bArr, jSONObject, lwqVar, str);
                        return;
                    }
                    return;
                }
                if (jSONObject.has("reason")) {
                    LogUtil.a("LogUpload Service errorcode", "errorcodeUpload failed, code ", jSONObject.getString("reason"));
                }
            } catch (JSONException unused) {
                ReleaseLogUtil.a("Dfx_LogUpload Service errorcode", " errorcodeUpload JSONException");
            }
        }
    }

    private static <T> T c(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        return (T) new Gson().fromJson(CommonUtil.ac(str), (Class) cls);
    }

    private static void a(JSONArray jSONArray, byte[] bArr, final JSONObject jSONObject, final lwq lwqVar, final String str) {
        if (jSONArray.length() > 0) {
            try {
                Object obj = jSONArray.get(0);
                LogUtil.a("LogUpload Service errorcode", "Object Object", obj.toString());
                ErrorCodeUploadInfo errorCodeUploadInfo = (ErrorCodeUploadInfo) c(obj.toString(), ErrorCodeUploadInfo.class);
                mjp.e(errorCodeUploadInfo.getUploadUrl(), errorCodeUploadInfo.getMethod(), bArr, e(new JSONObject(new Gson().toJson(errorCodeUploadInfo.getHeaders()))), new IBaseResponseCallback() { // from class: nfe.3
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj2) throws Throwable {
                        ReleaseLogUtil.d("Dfx_LogUpload Service errorcode", "response code:", Integer.valueOf(i), ", isNewHonorDeviceLog:", Boolean.valueOf(lwqVar.i()));
                        if (i == 200) {
                            try {
                                nfe.b(lwqVar, jSONObject.has("fileUniqueFlag") ? jSONObject.getString("fileUniqueFlag") : null, jSONObject.has("currentTime") ? jSONObject.getString("currentTime") : null, str);
                                mjh.c(lwqVar.h(), "uploadSuccess", new Gson());
                                nfe.d(lwqVar);
                            } catch (JSONException unused) {
                                LogUtil.e("LogUpload Service errorcode", "onResponse JSONException");
                            }
                        }
                    }
                });
            } catch (NullPointerException unused) {
                LogUtil.e("LogUpload Service errorcode", "setJson NullPointerException");
            } catch (JSONException unused2) {
                LogUtil.e("LogUpload Service errorcode", "setJson JSONException");
            }
        }
    }

    private static Map<String, String> e(JSONObject jSONObject) {
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
        } catch (JSONException e) {
            LogUtil.a("LogUpload Service errorcode", " putHashMap JSONException ", e.getMessage());
        }
        return map;
    }

    public static void b(lwq lwqVar, String str, String str2, String str3) throws Throwable {
        LogUtil.a("LogUpload Service errorcode", "uploadSuccess filePath:", lwqVar.h());
        ReleaseLogUtil.d("Dfx_LogUpload Service errorcode", "ErrorCodeUploadRequest uploadSuccess().");
        try {
            String strE = e(lwqVar, str, str2);
            String strD = mjc.d(FeedbackWebConstants.NOTIFY_UPLOAD_SUCC + lwqVar.b(), strE, str3);
            String strG = g(lwqVar);
            LogUtil.e("LogUpload Service errorcode", "getUploadSuccessUrl:", strG);
            JSONObject jSONObjectB = b(strG, strD, strE);
            if (jSONObjectB == null) {
                LogUtil.j("LogUpload Service errorcode", "jsonObject is null");
                return;
            }
            if (jSONObjectB.has("reason")) {
                LogUtil.a("LogUpload Service errorcode", "uploadSuccess reason", jSONObjectB.getString("reason"));
            }
            if (jSONObjectB.has("resCode")) {
                Object obj = jSONObjectB.get("resCode");
                if (!(obj instanceof Integer)) {
                    ReleaseLogUtil.e("Dfx_LogUpload Service errorcode", "handleResult resCode: errorType");
                } else {
                    ReleaseLogUtil.d("Dfx_LogUpload Service errorcode", "handleResult resCode:", obj);
                    b(((Integer) obj).intValue(), lwqVar.h(), "notifyUploadSucc");
                }
            }
        } catch (UnsupportedEncodingException unused) {
            ReleaseLogUtil.a("Dfx_LogUpload Service errorcode", "uploadSuccess UnsupportedEncodingException");
        } catch (JSONException unused2) {
            ReleaseLogUtil.a("Dfx_LogUpload Service errorcode", "uploadSuccess JSONException");
        }
    }

    private static String g(lwq lwqVar) {
        String str;
        String str2;
        boolean zI = lwqVar.i();
        if (zI) {
            str = "/v2/notifyUploadSucc?appID=2019";
            str2 = ":443/v2/notifyUploadSucc?appID=2019";
        } else {
            str = "/v2/notifyUploadSucc?appID=1019";
            str2 = ":443/v2/notifyUploadSucc?appID=1019";
        }
        return c(zI, str, str2);
    }

    private static String e(lwq lwqVar, String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer("model=");
        stringBuffer.append(lwqVar.c()).append("&romVersion=");
        stringBuffer.append(lwqVar.f()).append("&emuiVersion=");
        stringBuffer.append(lwqVar.a()).append("&osVersion=");
        stringBuffer.append(lwqVar.d()).append("&countryCode=");
        stringBuffer.append(f43056c).append("&fileUniqueFlag=");
        stringBuffer.append(str).append("&uploadTime=");
        stringBuffer.append(str2).append("&shaSN=");
        stringBuffer.append(lwqVar.g());
        return stringBuffer.toString();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 2951. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static org.json.JSONObject b(java.lang.String r9, java.lang.String r10, java.lang.String r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfe.b(java.lang.String, java.lang.String, java.lang.String):org.json.JSONObject");
    }

    private static HttpClient a() {
        RestClientGlobalInstance.getInstance().init(BaseApplication.getContext());
        return new HttpClient.Builder().connectTimeout(120000).readTimeout(120000).build();
    }

    private static void d(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                LogUtil.e("LogUpload Service errorcode", "requestUtil br IOException ", e.getMessage());
            }
        }
    }

    private static void d(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                LogUtil.e("LogUpload Service errorcode", "requestUtil br IOException ", e.getMessage());
            }
        }
    }
}
