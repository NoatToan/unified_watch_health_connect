package com.huawei.health.h5pro.jsbridge.system.storage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.core.b;
import com.huawei.health.h5pro.utils.AppInfoUtil;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker;
import com.huawei.health.h5pro.webkit.FileDownloadManager;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
class FileOperateApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<String> f6921c = Collections.synchronizedList(new ArrayList());
    private static Handler e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExecutorService f6922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6923b;
    private final WeakReference<Context> d;
    private final WeakReference<H5ProInstance> i;

    public enum FileType {
        BASE64("base64"),
        PATH(BleConstants.KEY_PATH);

        private String type;

        FileType(String str) {
            this.type = str;
        }
    }

    public static class e extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<H5ProJsCbkInvoker<Object>> f6930c;

        public e(H5ProInstance h5ProInstance) {
            super(Looper.getMainLooper());
            this.f6930c = h5ProInstance == null ? null : new WeakReference<>(h5ProInstance.getJsCbkInvoker());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            H5ProJsCbkInvoker h5ProJsCbkInvoker = (H5ProJsCbkInvoker) GeneralUtil.getReferent(this.f6930c);
            if (h5ProJsCbkInvoker == null) {
                LogUtil.w("H5PRO_FileOperateApi", "handleMessage: h5ProJsCbkInvoker is null");
                return;
            }
            Object obj = message.obj;
            if (!(obj instanceof String)) {
                if (!(obj instanceof Double) || message.what != 0) {
                    h5ProJsCbkInvoker.onFailure(message.arg1, "Data type error", message.arg2);
                    return;
                }
                Double d = (Double) obj;
                d.doubleValue();
                h5ProJsCbkInvoker.onSuccess(d, message.arg2);
                return;
            }
            int i = message.what;
            if (i == -1) {
                h5ProJsCbkInvoker.onFailure(message.arg1, (String) obj, message.arg2);
                return;
            }
            if (i == 0) {
                h5ProJsCbkInvoker.onSuccess((String) obj, message.arg2);
            } else {
                if (i == 1) {
                    h5ProJsCbkInvoker.onComplete(message.arg1, (String) obj, message.arg2);
                    return;
                }
                LogUtil.w("H5PRO_FileOperateApi", "what: " + message.what);
            }
        }
    }

    public FileOperateApi(Context context, H5ProInstance h5ProInstance) {
        this.d = new WeakReference<>(context);
        this.i = new WeakReference<>(h5ProInstance);
        e = new e(h5ProInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        String str2 = this.f6923b;
        String str3 = File.separator;
        if (str2.endsWith(str3)) {
            Locale locale = Locale.ENGLISH;
            return this.f6923b + str;
        }
        Locale locale2 = Locale.ENGLISH;
        return this.f6923b + str3 + str;
    }

    private void a(final String str, final String str2, final String str3, final long j) {
        if (f6921c.contains(str)) {
            LogUtil.d("H5PRO_FileOperateApi", a.a("downloading -> ", str));
            Locale locale = Locale.ENGLISH;
            d(-1, 2, j, "Downloading( " + str + " )");
            return;
        }
        if (!FileDownloadManager.mkdirs(this.f6923b)) {
            LogUtil.w("H5PRO_FileOperateApi", "saveFile: Failed to create the file directory -> " + this.f6923b);
            d(-1, -1, j, "Failed to create the file directory");
            return;
        }
        f6921c.add(str);
        final double[] dArr = {0.0d};
        Locale locale2 = Locale.ENGLISH;
        final String str4 = "_" + str2;
        FileDownloadManager.download(str, this.f6923b, str4, new FileDownloadManager.DownloadCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.storage.FileOperateApi.3
            @Override // com.huawei.health.h5pro.webkit.FileDownloadManager.DownloadCallback
            public void onFailure(int i, String str5) {
                LogUtil.w("H5PRO_FileOperateApi", "download: onFailed -> " + i + "_" + str5);
                FileOperateApi.this.d(-1, i, j, str5);
                FileOperateApi.f6921c.remove(str);
            }

            @Override // com.huawei.health.h5pro.webkit.FileDownloadManager.DownloadCallback
            public void onProgress(long j2, long j3) {
                super.onProgress(j2, j3);
                double dDoubleValue = new BigDecimal(j3 / j2).setScale(1, 1).doubleValue();
                if (CommonUtil.isNearZero(dDoubleValue - dArr[0])) {
                    double[] dArr2 = dArr;
                    dArr2[0] = dArr2[0] + 0.1d;
                    FileOperateApi.this.d(0, 0, j, Double.valueOf(dDoubleValue));
                }
            }

            @Override // com.huawei.health.h5pro.webkit.FileDownloadManager.DownloadCallback
            public void onSuccess(File file) {
                if (file == null || !file.exists()) {
                    FileOperateApi.this.d(-1, -1, j, "Failed to save the file.");
                    FileOperateApi.f6921c.remove(str);
                    return;
                }
                File file2 = new File(FileOperateApi.this.f6923b, str2);
                if (!file.renameTo(file2)) {
                    Locale locale3 = Locale.ENGLISH;
                    onFailure(-1, "Rename failed(" + str4 + Constants.RIGHT_BRACKET_ONLY);
                    return;
                }
                if (TextUtils.equals(str3, FileType.PATH.type)) {
                    FileOperateApi fileOperateApi = FileOperateApi.this;
                    fileOperateApi.d(1, 0, j, fileOperateApi.a(str2));
                } else if (TextUtils.equals(str3, FileType.BASE64.type)) {
                    FileOperateApi.this.d(file2, str2, j);
                } else {
                    FileOperateApi.this.d(1, 0, j, "File downloaded successfully");
                }
                FileOperateApi.f6921c.remove(str);
            }
        });
    }

    private String b(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace(".", "_").toUpperCase(Locale.ENGLISH);
    }

    private void c(String str) {
        String nativeFilePath;
        String strD = d(str);
        Context context = (Context) GeneralUtil.getReferent(this.d);
        if (context == null) {
            nativeFilePath = "";
        } else {
            try {
                nativeFilePath = StorageUtil.getNativeFilePath(context, strD);
            } catch (IOException e2) {
                LogUtil.e("H5PRO_FileOperateApi", "initFilePath: ioException -> " + e2.getMessage());
                this.f6923b = "";
            }
        }
        this.f6923b = nativeFilePath;
        LogUtil.d("H5PRO_FileOperateApi", "initFilePath: mFilePath -> " + this.f6923b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File d(String str, String str2) {
        if (!TextUtils.equals(str2, FileType.PATH.type)) {
            if (!TextUtils.equals(str2, FileType.BASE64.type)) {
                LogUtil.w("H5PRO_FileOperateApi", a.a("fileFiltering: Unknown type -> ", str2));
                return null;
            }
            str = b(str);
        }
        File[] fileArrListFiles = FileDownloadManager.exists(this.f6923b) ? new File(this.f6923b).listFiles() : null;
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            for (File file : fileArrListFiles) {
                if (TextUtils.equals(file.getName(), str)) {
                    return file;
                }
            }
        }
        return null;
    }

    private String d(String str) {
        H5ProInstance h5ProInstance = (H5ProInstance) GeneralUtil.getReferent(this.i);
        H5ProAppInfo appInfo = h5ProInstance == null ? null : h5ProInstance.getAppInfo();
        if (appInfo != null) {
            String hostFromUrl = appInfo.getH5ProAppType() == H5ProAppInfo.H5ProAppType.H5_LIGHT_APP ? AppInfoUtil.getInstance().getHostFromUrl(h5ProInstance.getUrl()) : appInfo.getPkgName();
            if (!TextUtils.isEmpty(hostFromUrl)) {
                return hostFromUrl + File.separator + str;
            }
            if (TextUtils.isEmpty(str)) {
                return "DEFAULT_APP_ID";
            }
        } else if (TextUtils.isEmpty(str)) {
            return "DEFAULT_APP_ID";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void d(int i, int i2, long j, T t) {
        Handler handler = e;
        if (handler == null) {
            LogUtil.w("H5PRO_FileOperateApi", "sendSuccessMessage: mHandler is null");
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        if (messageObtainMessage == null) {
            messageObtainMessage = new Message();
        }
        messageObtainMessage.what = i;
        messageObtainMessage.arg1 = i2;
        messageObtainMessage.arg2 = (int) j;
        messageObtainMessage.obj = t;
        e.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(File file, long j) {
        String str;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                str = new String(bArr, StandardCharsets.UTF_8);
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            LogUtil.e("H5PRO_FileOperateApi", "getContentFromBase64File: ioException -> " + e2.getMessage());
            str = "";
        }
        d(0, 0, j, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(File file, String str, long j) {
        LogUtil.i("H5PRO_FileOperateApi", "encodeSourceFileToBase64File");
        if (file == null || !file.exists()) {
            d(-1, -1, j, "The source file does not exist");
            return;
        }
        if (!GeneralUtil.isSafePath(str)) {
            d(-1, -1, j, "Invalid source file name");
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Base64OutputStream base64OutputStream = new Base64OutputStream(new FileOutputStream(new File(this.f6923b, b(str))), 2);
                try {
                    byte[] bArr = new byte[2097152];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        }
                        base64OutputStream.write(bArr, 0, i);
                        base64OutputStream.flush();
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                            throw th;
                        }
                    }
                    if (!file.delete()) {
                        LogUtil.w("H5PRO_FileOperateApi", "Failed to delete the source file");
                    }
                    d(1, 0, j, "The encoding file is saved successfully");
                    base64OutputStream.close();
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        base64OutputStream.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                fileInputStream.close();
                throw th4;
            }
        } catch (IOException e2) {
            LogUtil.e("H5PRO_FileOperateApi", "saveFileToBase64: ioException -> " + e2.getMessage());
            d(-1, -1, j, "Failed to convert the source file to Base64");
        }
    }

    public void c(long j, String str) {
        LogUtil.i("H5PRO_FileOperateApi", "saveFile");
        if (TextUtils.isEmpty(str)) {
            d(-1, -1, j, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            if (TextUtils.isEmpty(strOptString)) {
                d(-1, -1, j, "url is empty");
                return;
            }
            String strOptString2 = jSONObject.optString(ContentResource.FILE_NAME);
            if (!GeneralUtil.isSafePath(strOptString2)) {
                d(-1, -1, j, "invalid fileName");
            } else {
                c(jSONObject.optString("fileSubDir"));
                a(strOptString, strOptString2, jSONObject.optString("type", FileType.BASE64.type), j);
            }
        } catch (JSONException e2) {
            LogUtil.e("H5PRO_FileOperateApi", b.a(e2, new StringBuilder("saveFile: jsonException -> ")));
            d(-1, -1, j, e2.getMessage());
        }
    }

    public void d(final long j, String str) {
        LogUtil.i("H5PRO_FileOperateApi", "getFile");
        if (TextUtils.isEmpty(str)) {
            d(-1, -1, j, "param is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            final String strOptString = jSONObject.optString(ContentResource.FILE_NAME);
            final String strOptString2 = jSONObject.optString("type", FileType.BASE64.type);
            if (!GeneralUtil.isSafePath(strOptString)) {
                d(-1, -1, j, "invalid fileName");
                return;
            }
            c(jSONObject.optString("fileSubDir"));
            if (this.f6922a == null) {
                this.f6922a = Executors.newSingleThreadExecutor();
            }
            this.f6922a.execute(new Runnable() { // from class: com.huawei.health.h5pro.jsbridge.system.storage.FileOperateApi.4
                @Override // java.lang.Runnable
                public void run() {
                    File fileD = FileOperateApi.this.d(strOptString, strOptString2);
                    if (fileD != null) {
                        if (TextUtils.equals(strOptString2, FileType.BASE64.type)) {
                            FileOperateApi.this.d(fileD, j);
                            return;
                        } else {
                            FileOperateApi fileOperateApi = FileOperateApi.this;
                            fileOperateApi.d(0, 0, j, fileOperateApi.a(strOptString));
                            return;
                        }
                    }
                    FileOperateApi.this.d(-1, -1, j, "File " + strOptString + " not found");
                }
            });
        } catch (JSONException e2) {
            LogUtil.e("H5PRO_FileOperateApi", b.a(e2, new StringBuilder("getFile: jsonException -> ")));
            d(-1, -1, j, e2.getMessage());
        }
    }
}
