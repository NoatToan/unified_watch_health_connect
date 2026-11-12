package com.huawei.operation.h5pro.jsmodules.device;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.h5pro.jsbridge.base.JsBaseModule;
import com.huawei.health.h5pro.jsbridge.system.media.MediaUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class FileServiceJsApi extends JsBaseModule {
    private static final String TAG_RELEASE = "DEVMGR_FileServiceJsApi";

    @JavascriptInterface
    public void convertFileToBase64(long j, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "convertFileToBase64 JSONException ", ExceptionUtils.c(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "convertFileToBase64 jsonObject is null");
            onFailureCallback(j, "jsonObject is null", -1);
            return;
        }
        String strOptString = jSONObject.optString("filePath");
        if (TextUtils.isEmpty(strOptString)) {
            ReleaseLogUtil.e(TAG_RELEASE, "convertFileToBase64 filePath is empty");
            onFailureCallback(j, "filePath is empty", -1);
            return;
        }
        String strFileToBase64 = MediaUtils.fileToBase64(strOptString);
        if (TextUtils.isEmpty(strFileToBase64)) {
            ReleaseLogUtil.e(TAG_RELEASE, "convertFileToBase64 result is empty");
            onFailureCallback(j, "result is empty", -1);
        } else {
            onSuccessCallback(j, strFileToBase64);
        }
    }

    @JavascriptInterface
    public void saveBase64ToFile(long j, String str) throws Throwable {
        JSONObject jSONObject;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "saveBase64ToFile JSONException ", ExceptionUtils.c(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "saveBase64ToFile jsonObject is null");
            onFailureCallback(j, "jsonObject is null");
            return;
        }
        String strC = CommonUtil.c(jSONObject.optString("filePath"));
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.e(TAG_RELEASE, "saveBase64ToFile path error");
            onFailureCallback(j, "path error");
            return;
        }
        File file = new File(strC);
        initializeDestFile(file);
        byte[] bArrDecode = Base64.decode(Pattern.compile("data:\\w+/\\w+;base64,").matcher(jSONObject.optString("fileData")).replaceFirst(""), 0);
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArrDecode);
                    fileOutputStream.flush();
                    IoUtils.c(fileOutputStream);
                    if (file.exists()) {
                        ReleaseLogUtil.d(TAG_RELEASE, "saveBase64ToFile destFile length is:", Long.valueOf(file.length()));
                    }
                    onSuccessCallback(j, 0);
                } catch (FileNotFoundException e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    ReleaseLogUtil.a(TAG_RELEASE, "saveBase64ToFile FileNotFoundException:", ExceptionUtils.c(e));
                    onFailureCallback(j, "FileNotFoundException");
                    IoUtils.c(fileOutputStream2);
                } catch (IOException e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    ReleaseLogUtil.a(TAG_RELEASE, "saveBase64ToFile IOException:", ExceptionUtils.c(e));
                    onFailureCallback(j, "IOException");
                    IoUtils.c(fileOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException e4) {
            e = e4;
        } catch (IOException e5) {
            e = e5;
        }
    }

    private static void initializeDestFile(File file) {
        try {
            if (file.exists()) {
                ReleaseLogUtil.d(TAG_RELEASE, "initializeDestFile deleteDestFile isDeleteFile :", Boolean.valueOf(FileUtils.b(file)));
            }
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                ReleaseLogUtil.d(TAG_RELEASE, "initializeDestFile isMkdirFile :", Boolean.valueOf(parentFile.mkdirs()));
            }
            if (file.isFile()) {
                return;
            }
            ReleaseLogUtil.d(TAG_RELEASE, "initializeDestFile isCreateNewFile :", Boolean.valueOf(file.createNewFile()));
        } catch (IOException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "initializeDestFile IOException :", ExceptionUtils.c(e));
        } catch (SecurityException e2) {
            ReleaseLogUtil.a(TAG_RELEASE, "initializeDestFile SecurityException :", ExceptionUtils.c(e2));
        }
    }

    @JavascriptInterface
    public void isFileExistsAtPath(long j, String str) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "isFileExistsAtPath JSONException ", ExceptionUtils.c(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "isFileExistsAtPath jsonObject is null");
            onFailureCallback(j, "jsonObject is null");
            return;
        }
        String strC = CommonUtil.c(jSONObject.optString("filePath"));
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.e(TAG_RELEASE, "isFileExistsAtPath path error");
            onFailureCallback(j, "path error");
        } else {
            boolean zExists = new File(strC).exists();
            ReleaseLogUtil.d(TAG_RELEASE, "isFileExistsAtPath isFileExist:", Boolean.valueOf(zExists));
            onSuccessCallback(j, Boolean.valueOf(zExists));
        }
    }

    @JavascriptInterface
    public void removeFileAtPath(long j, String str) {
        try {
            String strC = CommonUtil.c(new JSONObject(str).optString("filePath"));
            if (TextUtils.isEmpty(strC)) {
                ReleaseLogUtil.e(TAG_RELEASE, "removeFileAtPath path error");
                onFailureCallback(j, "path error");
                return;
            }
            File file = new File(strC);
            if (!file.exists()) {
                LogUtil.a(this.TAG, "removeFileAtPath file not exist");
                onSuccessCallback(j, false);
            } else {
                boolean zDelete = file.delete();
                LogUtil.a(this.TAG, "removeFileAtPath result:", Boolean.valueOf(zDelete));
                onSuccessCallback(j, Boolean.valueOf(zDelete));
            }
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "removeFileAtPath JSONException ", ExceptionUtils.c(e));
            onFailureCallback(j, "removeFileAtPath JSONException");
        }
    }

    @JavascriptInterface
    public void getFilesNameByPath(long j, String str) {
        File[] fileArrListFiles;
        try {
            String strC = CommonUtil.c(new JSONObject(str).getString("filePath"));
            if (TextUtils.isEmpty(strC)) {
                onFailureCallback(j, "getFilesNameByPath path is empty");
                return;
            }
            ArrayList arrayList = new ArrayList();
            File file = new File(strC);
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    arrayList.add(file2.getName());
                }
            }
            onSuccessCallback(j, arrayList);
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getFilesNameByPath JSONException ", ExceptionUtils.c(e));
            onFailureCallback(j, "getFilesNameByPath JSONException");
        }
    }
}
