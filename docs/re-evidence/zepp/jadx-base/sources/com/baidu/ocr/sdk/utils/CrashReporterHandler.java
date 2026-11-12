package com.baidu.ocr.sdk.utils;

import android.content.Context;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.baidu.ocr.sdk.OCR;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class CrashReporterHandler implements Thread.UncaughtExceptionHandler {
    private static final String EMPTY_STR = "";
    private static final String HTTP_HEADER_CONTENTTYPE = "application/x-www-form-urlencoded;charset=utf-8";
    private static final String HTTP_URL = "https://verify.baidubce.com/verify/1.0/sdk/report";
    private static final String REPORT_FILENAME = "bd_aip_crashreport_file";
    private static final String REPORT_TIME_FORMATTER = "yyyy-MM-dd HH:mm:ss";
    private static Thread.UncaughtExceptionHandler defaultHandler;
    private static CrashReporterHandler instance;
    private Context ctx;
    private Set<Class> sourceClassSet = new HashSet();

    public CrashReporterHandler(Context context) {
        this.ctx = context;
    }

    private String createReport(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", DeviceUtil.getDeviceId(this.ctx));
            jSONObject.put("time", getCurrentTime());
            jSONObject.put("system", DeviceUtil.getDeviceInfo(this.ctx));
            jSONObject.put("sdkver", OCR.OCR_SDK_VERSION);
            jSONObject.put("appnm", getPackageName());
            jSONObject.put("detail", str);
            return jSONObject.toString();
        } catch (JSONException e) {
            return e.toString();
        }
    }

    private String exDetailContent(Throwable th) {
        if (th.getCause() == null) {
            return genContent(th);
        }
        return genContent(th) + exDetailContent(th.getCause());
    }

    private String genContent(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("!" + th.getMessage());
        stringBuffer.append(AESEncryptionHelper.SEPARATOR);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            stringBuffer.append(stackTraceElement.getClassName() + " [" + stackTraceElement.getMethodName() + ": " + stackTraceElement.getLineNumber() + "] ");
            stringBuffer.append(AESEncryptionHelper.SEPARATOR);
        }
        return stringBuffer.toString();
    }

    private String getCurrentTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    private String getPackageName() {
        return this.ctx.getPackageName();
    }

    public static CrashReporterHandler init(Context context) {
        if (instance == null) {
            instance = new CrashReporterHandler(context);
        }
        if (defaultHandler == null) {
            defaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        }
        Thread.setDefaultUncaughtExceptionHandler(instance);
        instance.sendPreviousReport();
        return instance;
    }

    private boolean isCauseBySource(Throwable th) {
        if (isStackCauseBySource(th.getStackTrace())) {
            return true;
        }
        if (th.getCause() == null) {
            return false;
        }
        return isCauseBySource(th.getCause());
    }

    private boolean isStackCauseBySource(StackTraceElement[] stackTraceElementArr) {
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            try {
                if (this.sourceClassSet.contains(Class.forName(stackTraceElement.getClassName()))) {
                    return true;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        return false;
    }

    private String readFile() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileInputStream fileInputStreamOpenFileInput = this.ctx.openFileInput(REPORT_FILENAME);
            while (true) {
                int i = fileInputStreamOpenFileInput.read();
                if (i == -1) {
                    fileInputStreamOpenFileInput.close();
                    return stringBuffer.toString();
                }
                stringBuffer.append((char) i);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean writeFile(String str) {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = this.ctx.openFileOutput(REPORT_FILENAME, 0);
            fileOutputStreamOpenFileOutput.write(str.getBytes("utf8"));
            fileOutputStreamOpenFileOutput.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public CrashReporterHandler addSourceClass(Class cls) {
        this.sourceClassSet.add(cls);
        return instance;
    }

    public void postBody(String str) {
        HttpsClient httpsClient = new HttpsClient();
        HttpsClient.RequestBody requestBody = new HttpsClient.RequestBody();
        requestBody.setBody(str);
        HttpsClient.RequestInfo requestInfo = new HttpsClient.RequestInfo(HTTP_URL, requestBody);
        requestInfo.setHeader("Content-Type", HTTP_HEADER_CONTENTTYPE);
        requestInfo.build();
        httpsClient.newCall(requestInfo).enqueue(new HttpsClient.Callback() { // from class: com.baidu.ocr.sdk.utils.CrashReporterHandler.1
            @Override // com.baidu.ocr.sdk.utils.HttpsClient.Callback
            public void onFailure(Throwable th) {
            }

            @Override // com.baidu.ocr.sdk.utils.HttpsClient.Callback
            public void onResponse(String str2) {
                CrashReporterHandler.this.writeFile("");
            }
        });
    }

    public void release() {
        this.ctx = null;
    }

    public void resolveException(Throwable th) {
        try {
            if (isCauseBySource(th)) {
                String strCreateReport = createReport(exDetailContent(th));
                if (writeFile(strCreateReport)) {
                    return;
                }
                postBody(strCreateReport);
            }
        } catch (Throwable th2) {
            String strCreateReport2 = createReport(exDetailContent(th2));
            if (writeFile(strCreateReport2)) {
                return;
            }
            postBody(strCreateReport2);
        }
    }

    public void sendPreviousReport() {
        String file = readFile();
        if (file == null || file == "") {
            return;
        }
        postBody(file);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            resolveException(th);
        } catch (Throwable unused) {
        }
        defaultHandler.uncaughtException(thread, th);
    }
}
