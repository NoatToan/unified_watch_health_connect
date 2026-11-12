package com.huawei.ui.main.stories.recommendcloud.util;

import android.content.Context;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.ui.main.stories.recommendcloud.constants.RecommendConstants;
import com.huawei.ui.main.stories.recommendcloud.data.RecommendCloudObject;
import com.huawei.ui.main.stories.recommendcloud.service.RecommendCloudCallBack;
import com.huawei.ui.main.stories.recommendcloud.service.RecommendCloudHttpCallBack;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.Normalizer;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes19.dex */
public class FileUtil {
    private static final int BUFFER_SIZE = 1024;
    private static final int MAXSIZE = 10485760;
    private static final String TAG = "UIDV_RecommendFileUtil";
    private static volatile FileUtil sInstance;
    private Context mContext;
    private ExecutorService mExecutorService;

    private FileUtil(Context context) {
        LogUtil.a(TAG, com.huawei.android.hicloud.sync.util.FileUtil.TAG);
        this.mContext = context.getApplicationContext();
        this.mExecutorService = Executors.newSingleThreadExecutor();
    }

    public static FileUtil getInstance(Context context) {
        LogUtil.a(TAG, "getInstance");
        if (sInstance == null) {
            synchronized (FileUtil.class) {
                if (sInstance == null) {
                    sInstance = new FileUtil(context);
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isRightFileName(String str, String str2) {
        try {
            return Normalizer.normalize(new File(str2, str).getCanonicalPath(), Normalizer.Form.NFKC).startsWith(Normalizer.normalize(new File(str2).getCanonicalPath(), Normalizer.Form.NFKC));
        } catch (IOException unused) {
            LogUtil.e(TAG, "isRightFileName IOException");
            return false;
        }
    }

    public void doDownload(RecommendCloudObject recommendCloudObject, final RecommendCloudHttpCallBack recommendCloudHttpCallBack) {
        LogUtil.a(TAG, "doDownload");
        if (recommendCloudHttpCallBack == null) {
            LogUtil.j(TAG, "doDownload callBack is null");
            return;
        }
        if (recommendCloudObject == null) {
            LogUtil.j(TAG, "RecommendCloudObject is null");
            recommendCloudHttpCallBack.onResponce(-1, RecommendConstants.DOWNLOAD_FAIL);
            return;
        }
        final String fileId = recommendCloudObject.getFileId();
        final String downloadUrl = recommendCloudObject.getDownloadUrl();
        if (TextUtils.isEmpty(fileId) || TextUtils.isEmpty(downloadUrl)) {
            LogUtil.j(TAG, "fileId or downloadUrl is null");
            recommendCloudHttpCallBack.onResponce(-1, RecommendConstants.DOWNLOAD_FAIL);
            return;
        }
        try {
            final String str = this.mContext.getFilesDir().getCanonicalPath() + File.separator + RecommendConstants.DOWNLOAD_DIR + File.separator;
            final String str2 = str + fileId;
            LogUtil.a(TAG, "savePath :", str2, "downloadUrl :", downloadUrl);
            if (TextUtils.isEmpty(str2)) {
                LogUtil.j(TAG, "savePath is null");
                recommendCloudHttpCallBack.onResponce(-1, RecommendConstants.DOWNLOAD_FAIL);
                return;
            }
            ExecutorService executorService = this.mExecutorService;
            if (executorService == null || executorService.isShutdown()) {
                this.mExecutorService = Executors.newSingleThreadExecutor();
            }
            this.mExecutorService.execute(new Runnable() { // from class: com.huawei.ui.main.stories.recommendcloud.util.FileUtil.5
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    if (FileUtil.this.isRightFileName(fileId, str)) {
                        FileUtil.this.download(downloadUrl, str2, recommendCloudHttpCallBack);
                    } else {
                        LogUtil.j(FileUtil.TAG, "savePath is not sanitze");
                        recommendCloudHttpCallBack.onResponce(-1, RecommendConstants.DOWNLOAD_FAIL);
                    }
                }
            });
        } catch (IOException unused) {
            LogUtil.e(TAG, "doDownload IOException");
            recommendCloudHttpCallBack.onResponce(-1, RecommendConstants.DOWNLOAD_FAIL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void download(String str, String str2, RecommendCloudHttpCallBack recommendCloudHttpCallBack) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        LogUtil.a(TAG, "download");
        String str3 = RecommendConstants.DOWNLOAD_FAIL;
        int i = 0;
        InputStream inputStream2 = null;
        fileOutputStream = null;
        InputStream inputStream3 = null;
        fileOutputStream = null;
        inputStream2 = null;
        FileOutputStream fileOutputStream2 = null;
        int i2 = -1;
        try {
            try {
                URL url = new URL(str);
                if (ProxyConfig.MATCH_HTTPS.equals(url.getProtocol().toLowerCase(Locale.ENGLISH))) {
                    LogUtil.a(TAG, "download https");
                    httpURLConnection = (HttpsURLConnection) url.openConnection();
                } else {
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                }
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setRequestMethod("GET");
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    LogUtil.a(TAG, "resultCode = ", Integer.valueOf(responseCode));
                    if (responseCode == 200) {
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            LogUtil.a(TAG, "saveFile");
                            if (!createFileDir(str2)) {
                                LogUtil.j(TAG, "createFileDir false");
                                closeInputStream(inputStream);
                                closeFileOutputStream(null);
                                recommendCloudHttpCallBack.onResponce(responseCode, RecommendConstants.DOWNLOAD_FAIL);
                                return;
                            }
                            String str4 = str2 + ".zip";
                            LogUtil.d(TAG, "zipPath = ", str4);
                            int iLastIndexOf = str2.lastIndexOf(47);
                            String fileDir = getFileDir(str2, iLastIndexOf);
                            String strSubstring = str4.substring(iLastIndexOf + 1, str4.length());
                            LogUtil.a(TAG, "fileName = ", strSubstring);
                            File file = new File(fileDir + File.separator + "_" + strSubstring);
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i3 = inputStream.read(bArr);
                                    if (i3 == -1) {
                                        break;
                                    } else {
                                        fileOutputStream.write(bArr, 0, i3);
                                    }
                                }
                                fileOutputStream.flush();
                                boolean zRenameTo = file.renameTo(new File(str4));
                                LogUtil.a(TAG, "isRenameOk = ", Boolean.valueOf(zRenameTo));
                                if (zRenameTo) {
                                    str3 = "success";
                                } else {
                                    if (file.exists()) {
                                        LogUtil.a(TAG, "isDeleted = ", Boolean.valueOf(file.delete()));
                                    }
                                    str3 = "rename fail";
                                    i = -1;
                                }
                                inputStream3 = inputStream;
                            } catch (IOException e) {
                                e = e;
                                fileOutputStream2 = fileOutputStream;
                                String message = e.getMessage();
                                LogUtil.e(TAG, "download IOException");
                                closeInputStream(inputStream);
                                closeFileOutputStream(fileOutputStream2);
                                recommendCloudHttpCallBack.onResponce(-1, message);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                inputStream2 = inputStream;
                                i2 = responseCode;
                                closeInputStream(inputStream2);
                                closeFileOutputStream(fileOutputStream);
                                recommendCloudHttpCallBack.onResponce(i2, RecommendConstants.DOWNLOAD_FAIL);
                                throw th;
                            }
                        } catch (IOException e2) {
                            e = e2;
                        }
                    } else {
                        fileOutputStream = null;
                        i = responseCode;
                    }
                    closeInputStream(inputStream3);
                    closeFileOutputStream(fileOutputStream);
                    recommendCloudHttpCallBack.onResponce(i, str3);
                } catch (IOException e3) {
                    e = e3;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                    i2 = responseCode;
                    closeInputStream(inputStream2);
                    closeFileOutputStream(fileOutputStream);
                    recommendCloudHttpCallBack.onResponce(i2, RecommendConstants.DOWNLOAD_FAIL);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e4) {
            e = e4;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            closeInputStream(inputStream2);
            closeFileOutputStream(fileOutputStream);
            recommendCloudHttpCallBack.onResponce(i2, RecommendConstants.DOWNLOAD_FAIL);
            throw th;
        }
    }

    public void doUnZip(final RecommendCloudObject recommendCloudObject, final RecommendCloudCallBack recommendCloudCallBack) {
        LogUtil.a(TAG, "doUnZip doUnZip");
        if (recommendCloudCallBack == null) {
            LogUtil.j(TAG, "doUnZip callBack is null");
            return;
        }
        if (recommendCloudObject == null) {
            LogUtil.j(TAG, "RecommendCloudObject is null");
            recommendCloudCallBack.onResponce("", -3);
            return;
        }
        String fileId = recommendCloudObject.getFileId();
        if (TextUtils.isEmpty(fileId)) {
            LogUtil.j(TAG, "fileId is null");
            recommendCloudCallBack.onResponce("", -3);
            return;
        }
        if (TextUtils.isEmpty(recommendCloudObject.getVer())) {
            LogUtil.j(TAG, "ver is null");
            recommendCloudCallBack.onResponce("", -3);
            return;
        }
        try {
            final String str = this.mContext.getFilesDir().getCanonicalPath() + File.separator + RecommendConstants.DOWNLOAD_DIR + File.separator + fileId;
            final String str2 = str + ".zip";
            ExecutorService executorService = this.mExecutorService;
            if (executorService == null || executorService.isShutdown()) {
                this.mExecutorService = Executors.newSingleThreadExecutor();
            }
            this.mExecutorService.execute(new Runnable() { // from class: com.huawei.ui.main.stories.recommendcloud.util.FileUtil.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    LogUtil.a(FileUtil.TAG, "zipFileString :", str2, " outPathString :", str, " RecommendCloudObject :", recommendCloudObject);
                    FileUtil.this.unZip(str2, str, recommendCloudObject, recommendCloudCallBack);
                    File file = new File(str2);
                    if (file.exists()) {
                        LogUtil.a(FileUtil.TAG, "isDelete=", Boolean.valueOf(file.delete()));
                    }
                }
            });
        } catch (IOException unused) {
            LogUtil.e(TAG, "doUnZip IOException");
            recommendCloudCallBack.onResponce("", -3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unZip(String str, String str2, RecommendCloudObject recommendCloudObject, RecommendCloudCallBack recommendCloudCallBack) throws Throwable {
        FileOutputStream fileOutputStream;
        ZipInputStream zipInputStream;
        FileInputStream fileInputStream;
        int i;
        int i2 = 0;
        FileInputStream fileInputStream2 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    zipInputStream = new ZipInputStream(fileInputStream);
                    int i3 = 0;
                    while (i3 + 1024 <= MAXSIZE) {
                        try {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry == null) {
                                break;
                            }
                            String name = nextEntry.getName();
                            if (!isRightFileName(name, str2) || name.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) {
                                LogUtil.j(TAG, "outPath is not right");
                            } else if (nextEntry.isDirectory()) {
                                LogUtil.a(TAG, "entryName isCreated ", Boolean.valueOf(createFileDir(str2 + File.separator + name.substring(0, name.length() - 1))));
                            } else {
                                String str3 = str2 + File.separator + name;
                                if (TextUtils.isEmpty(CommonUtil.c(str3))) {
                                    closeFileInputStream(fileInputStream);
                                    closeZipInputStream(zipInputStream);
                                    closeFileOutputStream(fileOutputStream3);
                                    return;
                                }
                                File file = new File(str3);
                                File parentFile = file.getParentFile();
                                if (parentFile != null && !parentFile.exists()) {
                                    LogUtil.a(TAG, "parent isCreated ", Boolean.valueOf(parentFile.mkdirs()));
                                }
                                LogUtil.a(TAG, "isCreatedNew ", Boolean.valueOf(file.createNewFile()));
                                closeFileOutputStream(fileOutputStream3);
                                String strE = CommonUtil.e(file.getCanonicalPath());
                                if (TextUtils.isEmpty(strE)) {
                                    LogUtil.j(TAG, "unZip legalPath is empty");
                                    closeFileInputStream(fileInputStream);
                                    closeZipInputStream(zipInputStream);
                                    closeFileOutputStream(fileOutputStream3);
                                    return;
                                }
                                FileOutputStream fileOutputStream4 = new FileOutputStream(strE);
                                try {
                                    byte[] bArr = new byte[1024];
                                    while (i3 + 1024 <= MAXSIZE && (i = zipInputStream.read(bArr)) != -1) {
                                        fileOutputStream4.write(bArr, 0, i);
                                        i3 += i;
                                        fileOutputStream4.flush();
                                    }
                                    if (i3 > MAXSIZE) {
                                        LogUtil.j(TAG, "File being unzipped is too big.");
                                        closeFileInputStream(fileInputStream);
                                        closeZipInputStream(zipInputStream);
                                        closeFileOutputStream(fileOutputStream4);
                                        return;
                                    }
                                    fileOutputStream3 = fileOutputStream4;
                                } catch (IOException e) {
                                    e = e;
                                    fileOutputStream3 = fileOutputStream4;
                                    LogUtil.e(TAG, "unZip Exception = ", e.getClass());
                                    closeFileInputStream(fileInputStream);
                                    closeZipInputStream(zipInputStream);
                                    closeFileOutputStream(fileOutputStream3);
                                    i2 = -3;
                                    unZipCallback(str2, recommendCloudObject, recommendCloudCallBack, i2);
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    fileOutputStream3 = fileOutputStream4;
                                    LogUtil.e(TAG, "unZip Exception = ", e.getClass());
                                    closeFileInputStream(fileInputStream);
                                    closeZipInputStream(zipInputStream);
                                    closeFileOutputStream(fileOutputStream3);
                                    i2 = -3;
                                    unZipCallback(str2, recommendCloudObject, recommendCloudCallBack, i2);
                                } catch (IllegalStateException e3) {
                                    e = e3;
                                    fileOutputStream3 = fileOutputStream4;
                                    LogUtil.e(TAG, "unZip Exception = ", e.getClass());
                                    closeFileInputStream(fileInputStream);
                                    closeZipInputStream(zipInputStream);
                                    closeFileOutputStream(fileOutputStream3);
                                    i2 = -3;
                                    unZipCallback(str2, recommendCloudObject, recommendCloudCallBack, i2);
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream2 = fileOutputStream4;
                                    fileOutputStream = fileOutputStream2;
                                    fileInputStream2 = fileInputStream;
                                    closeFileInputStream(fileInputStream2);
                                    closeZipInputStream(zipInputStream);
                                    closeFileOutputStream(fileOutputStream);
                                    throw th;
                                }
                            }
                        } catch (IOException e4) {
                            e = e4;
                        } catch (IllegalArgumentException e5) {
                            e = e5;
                        } catch (IllegalStateException e6) {
                            e = e6;
                        }
                        LogUtil.e(TAG, "unZip Exception = ", e.getClass());
                        closeFileInputStream(fileInputStream);
                        closeZipInputStream(zipInputStream);
                        closeFileOutputStream(fileOutputStream3);
                        i2 = -3;
                        unZipCallback(str2, recommendCloudObject, recommendCloudCallBack, i2);
                    }
                    closeFileInputStream(fileInputStream);
                    closeZipInputStream(zipInputStream);
                    closeFileOutputStream(fileOutputStream3);
                } catch (IOException e7) {
                    e = e7;
                    zipInputStream = null;
                } catch (IllegalArgumentException e8) {
                    e = e8;
                    zipInputStream = null;
                } catch (IllegalStateException e9) {
                    e = e9;
                    zipInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    zipInputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e10) {
            e = e10;
            fileInputStream = null;
            zipInputStream = null;
        } catch (IllegalArgumentException e11) {
            e = e11;
            fileInputStream = null;
            zipInputStream = null;
        } catch (IllegalStateException e12) {
            e = e12;
            fileInputStream = null;
            zipInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            zipInputStream = null;
            closeFileInputStream(fileInputStream2);
            closeZipInputStream(zipInputStream);
            closeFileOutputStream(fileOutputStream);
            throw th;
        }
        unZipCallback(str2, recommendCloudObject, recommendCloudCallBack, i2);
    }

    private void unZipCallback(String str, RecommendCloudObject recommendCloudObject, RecommendCloudCallBack recommendCloudCallBack, int i) {
        if (new File(str).isDirectory() && i == 0) {
            LogUtil.a(TAG, "unZip finish");
            StorageParams storageParams = new StorageParams();
            SharedPreferenceManager.e(this.mContext, String.valueOf(10000), recommendCloudObject.getFileId() + RecommendConstants.VER_POSTFIX, recommendCloudObject.getVer(), storageParams);
            recommendCloudCallBack.onResponce(recommendCloudObject.getFileId(), i);
            return;
        }
        LogUtil.j(TAG, "unZip and the dir fail");
        recommendCloudCallBack.onResponce(recommendCloudObject.getFileId(), -3);
    }

    private static String getFileDir(String str, int i) {
        try {
            return str.substring(0, i);
        } catch (StringIndexOutOfBoundsException unused) {
            LogUtil.e(TAG, "getFileDir StringIndexOutOfBoundsException");
            return "";
        }
    }

    private static boolean createFileDir(String str) {
        if (TextUtils.isEmpty(CommonUtil.e(str))) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        boolean zMkdirs = file.mkdirs();
        LogUtil.a(TAG, "isCreated ", zMkdirs ? "success" : ParamConstants.CallbackMethod.ON_FAIL);
        return zMkdirs;
    }

    private static void closeInputStream(InputStream inputStream) {
        LogUtil.a(TAG, "closeInputStream");
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                LogUtil.e(TAG, "closeInputStream IOException");
            }
        }
    }

    private static void closeFileOutputStream(FileOutputStream fileOutputStream) {
        LogUtil.a(TAG, "closeFileOutputStream");
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
                LogUtil.e(TAG, "closeFileOutputStream IOException");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    LogUtil.e(TAG, "closeFileOutputStream IOException");
                }
            }
        }
    }

    private static void closeFileInputStream(FileInputStream fileInputStream) {
        LogUtil.a(TAG, "closeFileOutputStream");
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
                LogUtil.e(TAG, "closeFileInputStream IOException");
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                    LogUtil.e(TAG, "closeFileInputStream IOException");
                }
            }
        }
    }

    private static void closeZipInputStream(ZipInputStream zipInputStream) {
        LogUtil.a(TAG, "closeZipInputStream");
        if (zipInputStream != null) {
            try {
                zipInputStream.close();
            } catch (IOException unused) {
                LogUtil.e(TAG, "closeZipInputStream IOException");
            } finally {
                try {
                    zipInputStream.close();
                } catch (IOException unused2) {
                    LogUtil.e(TAG, "closeZipInputStream IOException");
                }
            }
        }
    }
}
