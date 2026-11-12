package com.huawei.watchface.mvp.model.filedownload;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.ssl.SSFCompatiableSystemCA;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.b2;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.f4;
import com.huawei.watchface.j2;
import com.huawei.watchface.manager.WatchFacePhotoAlbumManager;
import com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.n;
import com.huawei.watchface.n0;
import com.huawei.watchface.s0;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.HwSfpPolicyManagerHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.callback.OperationCallback;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes20.dex */
public class FilePuller {
    private static final int ARRAY_LENGTH = 2;
    private static final int BUFFER_SIZE = 1024;
    public static final int DOWNLOAD_FILE_SIZE_LIMIT = 209715200;
    private static final int INDEX_FIRST = 0;
    private static final int INDEX_SECOND = 1;
    private static final Object LOCK = new Object();
    private static final int MAX_DOWNLOAD_TASK = 5;
    private static final int PAUSE_TASK = 1;
    private static final int RESULT_SUCCESS = 0;
    private static final String SPLIT = "_";
    private static final int STATE_FIND_ERROR = 0;
    private static final int STATE_FIND_NEW = 2;
    private static final int STATE_FIND_OLD = 1;
    private static final String TAG = "HwWatchFace_FilePuller";
    private static FilePuller sInstance;
    private Context mContext;
    private final ConcurrentHashMap<String, Boolean> isMultipleTaskMap = new ConcurrentHashMap<>(32);
    private ConcurrentHashMap<String, PullResult> mDownloadingMap = new ConcurrentHashMap<>(32);
    private ConcurrentHashMap<String, PullTask> mWaitQueue = new ConcurrentHashMap<>(32);
    private ConcurrentHashMap<String, PullTask> mPauseQueue = new ConcurrentHashMap<>(32);
    private ConcurrentHashMap<String, PullTask> mWatchFaceDownloadList = new ConcurrentHashMap<>(32);
    private ThreadPoolManager mThreadPoolManager = ThreadPoolManager.make(5, 5);

    private FilePuller(Context context) {
        this.mContext = context;
    }

    private boolean cancelDownloadTask(PullTask pullTask, PullResult pullResult) {
        if (pullResult.fetchStatus() != -10) {
            if (pullResult.fetchStatus() != 3) {
                if (pullResult.fetchStatus() == 0) {
                    pullTask.informResult(pullResult);
                    return false;
                }
                HwLog.i(TAG, "cancelDownloadTask, fetchStatus is not right");
                return true;
            }
            HwLog.i(TAG, "cancelDownloadTask, download break  , task id :" + pullTask.fetchUUID() + ", fetchStatus: " + pullResult.fetchStatus());
            return true;
        }
        String[] strArrSplit = pullTask.fetchUUID().split("_");
        if (strArrSplit.length >= 2) {
            removeTask(strArrSplit[0], strArrSplit[1]);
        }
        HwLog.i(TAG, "cancelDownloadTask, PulledSize :" + pullResult.fetchPulledSize() + " , result id :" + pullResult.fetchUuid() + " , task id :" + pullTask.fetchUUID() + ", fetchStatus: " + pullResult.fetchStatus());
        return true;
    }

    private void closeStream(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                HwLog.e(TAG, "close stream IoException");
            }
        }
    }

    private HttpURLConnection configHttpUrlConnection(PullTask pullTask) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(pullTask.fetchHttpUrl()).openConnection();
            httpURLConnection.setConnectTimeout(7000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setRequestMethod("GET");
            return httpURLConnection;
        } catch (IOException unused) {
            HwLog.e(TAG, "configHttpUrlConnection IOEexception");
            return null;
        }
    }

    private HttpsURLConnection configHttpsUrlConnection(PullTask pullTask) {
        try {
            URL url = new URL(pullTask.fetchHttpUrl());
            SSFCompatiableSystemCA sSFCompatiableSystemCA = SSFCompatiableSystemCA.getInstance(Environment.getApplicationContext(), EncryptUtil.genSecureRandom());
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            httpsURLConnection.setSSLSocketFactory(sSFCompatiableSystemCA);
            httpsURLConnection.setHostnameVerifier(HttpsURLConnection.getDefaultHostnameVerifier());
            httpsURLConnection.setConnectTimeout(7000);
            httpsURLConnection.setReadTimeout(10000);
            httpsURLConnection.setRequestMethod("GET");
            return httpsURLConnection;
        } catch (IOException unused) {
            HwLog.e(TAG, "configHttpUrlConnection IOEexception.");
            return null;
        } catch (KeyManagementException unused2) {
            HwLog.e(TAG, "configHttpUrlConnection KeyManagementException.");
            return null;
        } catch (KeyStoreException unused3) {
            HwLog.e(TAG, "configHttpUrlConnection KeyStoreException.");
            return null;
        } catch (NoSuchAlgorithmException unused4) {
            HwLog.e(TAG, "configHttpUrlConnection NoSuchAlgorithmException.");
            return null;
        } catch (CertificateException unused5) {
            HwLog.e(TAG, "configHttpUrlConnection CertificateException.");
            return null;
        } catch (Exception e) {
            HwLog.e(TAG, "configHttpUrlConnection exception:" + HwLog.printException(e));
            return null;
        }
    }

    private void decrptFile(PullTask pullTask, PullResult pullResult) {
        String strFetchPathName = pullResult.fetchPathName();
        pullResult.addDescInfo("sourceFile=" + strFetchPathName);
        if (TextUtils.isEmpty(strFetchPathName)) {
            HwLog.e(TAG, "sourceFile is null");
            return;
        }
        String strFilterFilePath = CommonUtils.filterFilePath(strFetchPathName);
        if (FileHelper.i(strFilterFilePath)) {
            HwLog.e(TAG, "sourceFile is IllegalPath");
            return;
        }
        byte[] bArrA = n0.a(strFilterFilePath);
        if (bArrA == null || bArrA.length <= 0) {
            HwLog.e(TAG, "decryptFile failure");
            pullResult.configStatus(-12);
            return;
        }
        byte[] bArrA2 = b2.a().a(bArrA);
        StringBuilder sb = new StringBuilder("comHuaweiWatchface is null=");
        sb.append(bArrA2 == null);
        pullResult.addDescInfo(sb.toString());
        if (bArrA2 == null || bArrA2.length <= 0) {
            HwLog.i(TAG, "decryptFile failure <= 0");
            pullResult.configStatus(-6);
            return;
        }
        HwLog.i(TAG, "decrptFile com.huawei.watchface.length: " + bArrA2.length);
        String strFetchUUID = pullTask.fetchUUID();
        HwLog.i(TAG, "uuid: " + strFetchUUID);
        pullResult.addDescInfo("uuid=" + strFetchUUID);
        String[] strArrSplit = strFetchUUID.split("_");
        String str = strArrSplit[0];
        String str2 = strArrSplit[1];
        boolean zIsSupportSync = HwWatchFaceBtManager.getInstance(this.mContext).isSupportSync();
        boolean zM = j2.g().m(str, str2);
        boolean zC = f4.c(str2);
        HwLog.i(TAG, "decrypt, sync watchface: " + zIsSupportSync);
        HwLog.i(TAG, "decrypt, tryout task: " + zM);
        HwLog.i(TAG, "decrypt,isVersionTwo:" + zC);
        pullResult.addDescInfo("isSyncWatchFace=" + zIsSupportSync);
        pullResult.addDescInfo("isTryOutTask=" + zM);
        pullResult.addDescInfo("isVersionTwo=" + zC);
        s0.a().a(strFetchUUID, (zIsSupportSync && !zM && zC) ? b2.a().a(bArrA2, str, str2) : b2.a().a(this.mContext, bArrA2, pullTask.fetchZip(), zM));
    }

    private void deleteFile(PullResult pullResult) {
        if (pullResult == null) {
            HwLog.w(TAG, "deleteFile result is null");
        } else {
            deleteFile(pullResult.fetchPathName());
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0152  */
    private int doHttpDownloadFile(HttpURLConnection httpURLConnection, PullTask pullTask, PullResult pullResult) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        Closeable closeable = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                HwLog.w(TAG, "httpDownloadFile ConRspCode : " + responseCode);
                closeStream(null);
                closeStream(null);
                httpURLConnection.disconnect();
                return -3;
            }
            if (FileHelper.i(pullResult.fetchPathName())) {
                closeStream(null);
                closeStream(null);
                httpURLConnection.disconnect();
                return -14;
            }
            File file = new File(pullResult.fetchPathName());
            if (!isValidFile(file)) {
                closeStream(null);
                closeStream(null);
                httpURLConnection.disconnect();
                return -14;
            }
            inputStream = httpURLConnection.getInputStream();
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                            pullResult.configUuid(pullResult.fetchUuid());
                            pullResult.configPulledSize(pullResult.fetchPulledSize() + i);
                            HwLog.i(TAG, "doHttpDownloadFile, PulledSize :" + pullResult.fetchPulledSize() + " , result id :" + pullResult.fetchUuid() + " , task id :" + pullTask.fetchUUID());
                            if (pullResult.fetchPulledSize() > 209715200) {
                                HwLog.d(TAG, "fetchPulledSize is Exceeded the limit");
                                closeStream(inputStream);
                                closeStream(fileOutputStream);
                                httpURLConnection.disconnect();
                                return -15;
                            }
                            fileOutputStream.write(bArr, 0, i);
                            if (pullResult.fetchStatus() == -10) {
                                String[] strArrSplit = pullTask.fetchUUID().split("_");
                                if (strArrSplit.length < 2) {
                                    break;
                                }
                                removeTask(strArrSplit[0], strArrSplit[1]);
                                break;
                            }
                            pullTask.informResult(pullResult);
                        }
                        fileOutputStream.flush();
                        if (pullResult.fetchStatus() != -10) {
                            closeStream(inputStream);
                            closeStream(fileOutputStream);
                            httpURLConnection.disconnect();
                            return 0;
                        }
                        HwLog.i(TAG, "cancel download task");
                        closeStream(inputStream);
                        closeStream(fileOutputStream);
                        httpURLConnection.disconnect();
                        return -10;
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream2 = fileOutputStream;
                        HwLog.e(TAG, "doHttpDownloadFile download IOEexception:" + HwLog.printException((Exception) e));
                        pullResult.addDescInfo(e.toString());
                        closeStream(inputStream);
                        closeStream(fileOutputStream2);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return -15;
                    } catch (Throwable th) {
                        th = th;
                        closeable = inputStream;
                        closeStream(closeable);
                        closeStream(fileOutputStream);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException e3) {
            e = e3;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            closeStream(closeable);
            closeStream(fileOutputStream);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0110: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:50:0x010f */
    private int doHttpsDownloadFile(HttpsURLConnection httpsURLConnection, PullTask pullTask, PullResult pullResult) throws Throwable {
        Closeable closeable;
        InputStream inputStream;
        Closeable closeable2;
        Closeable closeable3 = null;
        try {
            try {
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode != 200) {
                    HwLog.w(TAG, "httpsDownloadFile ConRspCode:" + responseCode);
                    closeStream(null);
                    closeStream(null);
                    httpsURLConnection.disconnect();
                    return -3;
                }
                if (FileHelper.i(pullResult.fetchPathName())) {
                    closeStream(null);
                    closeStream(null);
                    httpsURLConnection.disconnect();
                    return -14;
                }
                File file = new File(pullResult.fetchPathName());
                if (!isValidFile(file)) {
                    closeStream(null);
                    closeStream(null);
                    httpsURLConnection.disconnect();
                    return -14;
                }
                inputStream = httpsURLConnection.getInputStream();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                            pullResult.configUuid(pullResult.fetchUuid());
                            pullResult.configPulledSize(pullResult.fetchPulledSize() + i);
                            if (pullResult.fetchPulledSize() > 209715200) {
                                HwLog.d(TAG, "fetchPulledSize is Exceeded the limit");
                                closeStream(inputStream);
                                closeStream(fileOutputStream);
                                httpsURLConnection.disconnect();
                                return -15;
                            }
                            fileOutputStream.write(bArr, 0, i);
                            if (cancelDownloadTask(pullTask, pullResult)) {
                                break;
                            }
                        }
                        HwLog.i(TAG, "doHttpsDownloadFile, PulledSize: " + pullResult.fetchPulledSize() + ", result fetchUuid(): " + pullResult.fetchUuid());
                        fileOutputStream.flush();
                        HwSfpPolicyManagerHelper.setDefaultCeLabel(file);
                        if (pullResult.fetchStatus() == -10) {
                            HwLog.i(TAG, "cancle download task");
                            closeStream(inputStream);
                            closeStream(fileOutputStream);
                            httpsURLConnection.disconnect();
                            return -10;
                        }
                        if (pullResult.fetchStatus() != 3) {
                            closeStream(inputStream);
                            closeStream(fileOutputStream);
                            httpsURLConnection.disconnect();
                            return 0;
                        }
                        HwLog.i(TAG, "pause download task");
                        closeStream(inputStream);
                        closeStream(fileOutputStream);
                        httpsURLConnection.disconnect();
                        return 3;
                    } catch (IOException e) {
                        e = e;
                        closeable3 = fileOutputStream;
                        HwLog.e(TAG, "doHttpsDownloadFile download IOEexception" + HwLog.printException((Exception) e));
                        pullResult.addDescInfo(e.toString());
                        closeStream(inputStream);
                        closeStream(closeable3);
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        return -15;
                    } catch (Exception e2) {
                        e = e2;
                        closeable3 = fileOutputStream;
                        HwLog.e(TAG, "doHttpsDownloadFile download exception" + HwLog.printException(e));
                        pullResult.addDescInfo(e.toString());
                        closeStream(inputStream);
                        closeStream(closeable3);
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        return -15;
                    } catch (Throwable th) {
                        th = th;
                        closeable3 = inputStream;
                        closeable = fileOutputStream;
                        closeStream(closeable3);
                        closeStream(closeable);
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                closeable3 = closeable2;
            }
        } catch (IOException e5) {
            e = e5;
            inputStream = null;
        } catch (Exception e6) {
            e = e6;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
        }
    }

    private void doUnzip(PullTask pullTask, PullResult pullResult) throws Throwable {
        HwLog.i(TAG, "doUnzip() enter.");
        if ((pullTask.fetchOption() & 4) == 0) {
            removeFile(pullResult.fetchPathName(), pullTask.fetchDestPath());
            return;
        }
        HwLog.i(TAG, "doUnzip() -- to decrypt file");
        decrptFile(pullTask, pullResult);
        deleteFile(pullResult.fetchPathName());
    }

    private int downloadFile(PullTask pullTask, PullResult pullResult) {
        if (TextUtils.isEmpty(pullTask.fetchHttpUrl())) {
            HwLog.w(TAG, "http url isEmpty");
            return -13;
        }
        if (isHttpProtocol(pullTask.fetchHttpUrl())) {
            HwLog.i(TAG, "download http");
            pullTask.configHttpUrl(WatchFaceHttpUtil.g(pullTask.fetchHttpUrl()));
        } else {
            HwLog.i(TAG, "download https");
        }
        return httpsDownloadFile(pullTask, pullResult);
    }

    private String getFileUrl(PullTask pullTask) {
        String strFetchFileUrlJson = pullTask.fetchFileUrlJson();
        return !TextUtils.isEmpty(strFetchFileUrlJson) ? strFetchFileUrlJson : pullTask.fetchHttpUrl();
    }

    public static FilePuller getInstance(Context context) {
        FilePuller filePuller;
        synchronized (LOCK) {
            if (sInstance == null) {
                sInstance = new FilePuller(context.getApplicationContext());
            }
            filePuller = sInstance;
        }
        return filePuller;
    }

    private String getPathName(PullTask pullTask) {
        HwLog.i(TAG, "enter getPathName");
        return pullTask.fetchDestPath() + ".tmp";
    }

    private boolean hashCodeCheck(PullTask pullTask, PullResult pullResult) {
        String strFetchDigest = pullTask.fetchDigest();
        String strSha256File = FileHelper.sha256File(pullResult.fetchPathName());
        HwLog.i(TAG, "processTask() digest is :" + strFetchDigest + " ,hashcode is :" + strSha256File);
        if (TextUtils.isEmpty(strFetchDigest) || strFetchDigest.equalsIgnoreCase(strSha256File)) {
            return true;
        }
        pullResult.configStatus(-11);
        deleteFile(pullResult);
        pullTask.informResult(pullResult);
        return false;
    }

    private int httpDownloadFile(PullTask pullTask, PullResult pullResult) {
        HttpURLConnection httpURLConnectionConfigHttpUrlConnection = configHttpUrlConnection(pullTask);
        if (httpURLConnectionConfigHttpUrlConnection != null) {
            return doHttpDownloadFile(httpURLConnectionConfigHttpUrlConnection, pullTask, pullResult);
        }
        HwLog.w(TAG, "httpDownloadFile httpUrlConnection is null");
        return -106;
    }

    private int httpsDownloadFile(PullTask pullTask, PullResult pullResult) {
        HttpsURLConnection httpsURLConnectionConfigHttpsUrlConnection = configHttpsUrlConnection(pullTask);
        if (httpsURLConnectionConfigHttpsUrlConnection != null) {
            return doHttpsDownloadFile(httpsURLConnectionConfigHttpsUrlConnection, pullTask, pullResult);
        }
        HwLog.w(TAG, "httpsDownloadFile error httpsURLConnection is null");
        return -106;
    }

    private static boolean isHttpProtocol(String str) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf == -1) {
            return false;
        }
        return SafeString.substring(str, 0, iIndexOf).equalsIgnoreCase("http");
    }

    private boolean isValidFile(File file) {
        if (file.exists() && file.isFile()) {
            HwLog.i(TAG, "deleteFo is : " + file.delete());
        }
        if (!file.getParentFile().exists()) {
            HwLog.i(TAG, "makeParentFile is :" + file.getParentFile().mkdirs());
        }
        if (file.isFile()) {
            return true;
        }
        try {
            HwLog.i(TAG, "createNewFile is :" + file.createNewFile());
            return true;
        } catch (IOException unused) {
            HwLog.e(TAG, "createNewFile error");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processTask(PullTask pullTask, PullResult pullResult) throws Throwable {
        if (pullTask == null || pullResult == null) {
            HwLog.w(TAG, "processTask() illegal param");
            return;
        }
        if (!pullTask.fetchUUID().equals(pullResult.fetchUuid())) {
            HwLog.w(TAG, "processTask() task id : " + pullTask.fetchUUID() + " , result id :" + pullResult.fetchUuid());
            return;
        }
        pullResult.configPathName(getPathName(pullTask));
        String fileUrl = getFileUrl(pullTask);
        if (fileUrl == null) {
            HwLog.w(TAG, "processTask() fileUrlJson is null");
            pullResult.configStatus(-5);
        }
        pullResult.configFileUrlJson(fileUrl);
        pullTask.configHttpUrl(fileUrl);
        int iDownloadFile = downloadFile(pullTask, pullResult);
        HwLog.w(TAG, "processTask() downloadResult: " + iDownloadFile);
        if (iDownloadFile == 0) {
            pullResult.configStatus(1);
            if (!hashCodeCheck(pullTask, pullResult)) {
                HwLog.w(TAG, "processTask() hashcode checkout failure");
                return;
            }
            HwLog.i(TAG, "processTask() resource type : " + pullTask.fetchOption());
            doUnzip(pullTask, pullResult);
        } else {
            pullResult.configStatus(iDownloadFile);
        }
        HwLog.i(TAG, "processTask() result status: " + pullResult.fetchStatus());
        pullTask.informResult(pullResult);
    }

    private void removeFile(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        File file = new File(str);
        File file2 = new File(str2);
        Closeable closeable = null;
        try {
            if (file2.exists()) {
                HwLog.i(TAG, "removeFile() deleteFile is : " + file2.delete());
            }
            if (!file2.getParentFile().exists()) {
                HwLog.i(TAG, "removeFile() mkdirFile is : " + file2.getParentFile().mkdirs());
            }
            if (!file2.isFile()) {
                HwLog.i(TAG, "removeFile() createNewFile is : " + file2.createNewFile());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                        fileOutputStream.write(bArr, 0, i);
                    }
                    fileOutputStream.flush();
                    HwSfpPolicyManagerHelper.setDefaultCeLabel(str2);
                    if (file.exists() && file.isFile()) {
                        HwLog.i(TAG, "removeFile() isDeleteSuc: " + file.delete());
                    }
                    closeStream(fileInputStream);
                    closeStream(fileOutputStream);
                } catch (IOException unused) {
                    closeable = fileInputStream;
                    try {
                        HwLog.e(TAG, "removeFile() remove file IoException");
                        if (file.exists() && file.isFile()) {
                            HwLog.i(TAG, "removeFile() isDeleteSuc: " + file.delete());
                        }
                        closeStream(closeable);
                        closeStream(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        if (file.exists() && file.isFile()) {
                            HwLog.i(TAG, "removeFile() isDeleteSuc: " + file.delete());
                        }
                        closeStream(closeable);
                        closeStream(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable = fileInputStream;
                    if (file.exists()) {
                        HwLog.i(TAG, "removeFile() isDeleteSuc: " + file.delete());
                    }
                    closeStream(closeable);
                    closeStream(fileOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException unused3) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public void addTask(final PullTask pullTask) {
        if (pullTask == null) {
            HwLog.w(TAG, "addTask, task is null");
            return;
        }
        if (this.mDownloadingMap.containsKey(pullTask.fetchUUID()) && Boolean.FALSE.equals(this.isMultipleTaskMap.get(pullTask.fetchUUID()))) {
            HwLog.w(TAG, "addTask, the thread multiple false: " + pullTask.fetchUUID());
            this.isMultipleTaskMap.put(pullTask.fetchUUID(), Boolean.TRUE);
            return;
        }
        this.isMultipleTaskMap.put(pullTask.fetchUUID(), Boolean.FALSE);
        pullTask.configStatus(-8);
        PullResult pullResult = new PullResult();
        pullResult.configPulledSize(0);
        pullResult.configUuid(pullTask.fetchUUID());
        pullResult.configStatus(-8);
        HwLog.i(TAG, "addTask, file total size:" + pullTask.fetchTotalSize() + " addTask mWatchFaceDownloadList add ：" + pullTask.fetchUUID());
        pullResult.configTotalSize(pullTask.fetchTotalSize());
        pullResult.setInstallationType(pullTask.getInstallationType());
        this.mWatchFaceDownloadList.put(pullTask.fetchUUID(), pullTask);
        if (this.mDownloadingMap.size() == 5) {
            notifyDownloadStatus(pullTask.fetchUUID(), -8);
            this.mWaitQueue.put(pullTask.fetchUUID(), pullTask);
            pullResult.configStatus(-8);
            pullTask.informResult(pullResult);
            HwLog.i(TAG, "addTask, add wait queue");
            return;
        }
        this.mDownloadingMap.put(pullTask.fetchUUID(), pullResult);
        notifyDownloadStatus(pullTask.fetchUUID(), 7);
        pullResult.configStatus(7);
        pullTask.informResult(pullResult);
        this.mThreadPoolManager.tagExecute(TAG, new Runnable() { // from class: com.huawei.watchface.mvp.model.filedownload.FilePuller.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                PullResult pullResult2 = (PullResult) FilePuller.this.mDownloadingMap.get(pullTask.fetchUUID());
                if (pullResult2 != null) {
                    pullResult2.configStatus(0);
                    pullResult2.configPulledSize(0);
                    FilePuller.this.processTask(pullTask, pullResult2);
                }
            }
        });
    }

    public String buildTaskId(String str, String str2) {
        if (str == null || str2 == null) {
            HwLog.w(TAG, "buildTaskId() param illegal");
            return "";
        }
        return str + "_" + str2;
    }

    public void cancelTask(String str, String str2) {
        cancelTask(str, str2, true);
    }

    public void clearTask() {
        HwLog.i(TAG, "clearTask");
        this.mWatchFaceDownloadList.clear();
        this.mPauseQueue.clear();
        this.mWaitQueue.clear();
    }

    public void downloadSuccessAutoDownloadNextTask(String str, String str2) {
        String strBuildTaskId = buildTaskId(str, str2);
        if (this.mDownloadingMap.containsKey(strBuildTaskId)) {
            HwLog.i(TAG, "mDownloadingMap remove task, taskId:" + strBuildTaskId);
            this.mDownloadingMap.remove(strBuildTaskId);
        }
        if (this.mWaitQueue.isEmpty()) {
            HwLog.w(TAG, "removeTask, mWaitQueue is empty");
            return;
        }
        HwLog.i(TAG, "remove done");
        addTask(this.mWaitQueue.entrySet().iterator().next().getValue());
        this.mWaitQueue.remove(strBuildTaskId);
    }

    public void downloadSuccessRemoveTask(String str, String str2) {
        HwLog.i(TAG, "enter downloadSuccessRemoveTask");
        String strBuildTaskId = buildTaskId(str, str2);
        if (this.mPauseQueue.containsKey(strBuildTaskId)) {
            HwLog.i(TAG, "mPauseQueue remove task, taskId:" + strBuildTaskId);
            this.mPauseQueue.remove(strBuildTaskId);
        }
        if (this.mWaitQueue.containsKey(strBuildTaskId)) {
            HwLog.i(TAG, "mWaitQueue remove task, taskId:" + strBuildTaskId);
            this.mWaitQueue.remove(strBuildTaskId);
        }
        downloadSuccessAutoDownloadNextTask(str, str2);
    }

    public int getCurrentTaskStatus(String str) {
        if (str == null) {
            HwLog.w(TAG, "getCurrentTaskStatus, taskId is null");
            return -100;
        }
        PullTask pullTask = this.mWatchFaceDownloadList.get(str);
        if (!this.mWatchFaceDownloadList.containsKey(str) || pullTask == null) {
            HwLog.w(TAG, "getCurrentTaskStatus, result is empty");
            return -100;
        }
        int iFetchStatus = pullTask.fetchStatus();
        HwLog.i(TAG, "getCurrentTaskStatus, status" + iFetchStatus);
        return iFetchStatus;
    }

    public ConcurrentHashMap<String, PullTask> getDownloadTaskList() {
        HwLog.i(TAG, "getDownloadTaskList() enter.");
        String strT = WatchFacePhotoAlbumManager.getInstance(this.mContext).t();
        String videoPackageName = HwWatchFaceBtManager.getInstance(this.mContext).getVideoPackageName();
        String wearPackageName = HwWatchFaceBtManager.getInstance(this.mContext).getWearPackageName();
        String kaleidoscopePackageName = HwWatchFaceBtManager.getInstance(this.mContext).getKaleidoscopePackageName();
        Iterator<Map.Entry<String, PullTask>> it = this.mWatchFaceDownloadList.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, PullTask> next = it.next();
            if ((!TextUtils.isEmpty(strT) && next.getKey().contains(strT)) || ((!TextUtils.isEmpty(videoPackageName) && next.getKey().contains(videoPackageName)) || ((!TextUtils.isEmpty(wearPackageName) && next.getKey().contains(wearPackageName)) || (!TextUtils.isEmpty(kaleidoscopePackageName) && next.getKey().contains(kaleidoscopePackageName))))) {
                it.remove();
            }
        }
        return this.mWatchFaceDownloadList;
    }

    public int getDownloadTaskStatus(String str) {
        HwLog.i(TAG, "enter getInstallTaskStatus");
        if (str == null) {
            HwLog.w(TAG, "getDownloadTaskStatus, taskId is null");
            return -100;
        }
        if (this.mWatchFaceDownloadList.containsKey(str)) {
            return this.mWatchFaceDownloadList.get(str).fetchStatus();
        }
        return -100;
    }

    public int getDownloadingMapTotalSize() {
        ConcurrentHashMap<String, PullTask> concurrentHashMap = this.mWatchFaceDownloadList;
        int iFetchTotalSize = 0;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            HwLog.w(TAG, "getDownloadingMapTotalSize, mWatchFaceDownloadList is empty");
            return 0;
        }
        String strT = WatchFacePhotoAlbumManager.getInstance(this.mContext).t();
        String videoPackageName = HwWatchFaceBtManager.getInstance(this.mContext).getVideoPackageName();
        String wearPackageName = HwWatchFaceBtManager.getInstance(this.mContext).getWearPackageName();
        String kaleidoscopePackageName = HwWatchFaceBtManager.getInstance(this.mContext).getKaleidoscopePackageName();
        for (Map.Entry<String, PullTask> entry : this.mWatchFaceDownloadList.entrySet()) {
            if (!entry.getKey().contains(strT) && !entry.getKey().contains(videoPackageName) && !entry.getKey().contains(wearPackageName) && !entry.getKey().contains(kaleidoscopePackageName)) {
                iFetchTotalSize += entry.getValue().fetchTotalSize();
            }
        }
        HwLog.i(TAG, "getDownloadingMapTotalSize, total:" + iFetchTotalSize);
        return iFetchTotalSize;
    }

    public void installSuccessRemoveTask(String str, String str2) {
        HwLog.i(TAG, "enter installSuccessRemoveTask");
        String strBuildTaskId = buildTaskId(str, str2);
        if (!this.mWatchFaceDownloadList.containsKey(strBuildTaskId)) {
            HwLog.w(TAG, "removeTask, no contain hiTopId");
            n.e().a(str, str2, this.mWatchFaceDownloadList);
        } else {
            HwLog.i(TAG, "mWatchFaceDownloadList remove where3 hiTopId:" + str);
            this.mWatchFaceDownloadList.remove(strBuildTaskId);
        }
    }

    public void notifyAllTaskPause() {
        HwLog.i(TAG, "notifyAllTaskPause");
        if (this.mWatchFaceDownloadList.isEmpty()) {
            HwLog.w(TAG, "notifyAllTaskPause, mWatchFaceDownloadList is empty");
            return;
        }
        for (Map.Entry<String, PullTask> entry : this.mWatchFaceDownloadList.entrySet()) {
            HwLog.d(TAG, "notifyAllTaskPause, taskId:" + entry.getKey());
            notifyDownloadStatus(entry.getKey(), 3);
        }
    }

    public void notifyDownloadStatus(String str, int i) {
        if (str == null) {
            HwLog.w(TAG, "notifyDownloadStatus, param illegal");
            return;
        }
        if (this.mWatchFaceDownloadList.isEmpty() || !this.mWatchFaceDownloadList.containsKey(str)) {
            HwLog.w(TAG, "notifyDownloadStatus, list is empty or not contain taskId :" + str);
        } else {
            PullTask pullTask = this.mWatchFaceDownloadList.get(str);
            if (pullTask == null) {
                HwLog.w(TAG, "notifyDownloadStatus, task is null");
            } else {
                pullTask.configStatus(i);
            }
        }
    }

    public void notifyMapTaskPause(LinkedHashMap<String, String> linkedHashMap, int i) {
        HwLog.i(TAG, "notifyMapTaskPause");
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            HwLog.w(TAG, "notifyMapTaskPause, map is empty");
            return;
        }
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            HwLog.d(TAG, "notifyMapTaskPause, taskId:" + entry.getKey());
            notifyDownloadStatus(buildTaskId(entry.getKey(), entry.getValue()), i);
        }
    }

    public void operationDownloadTask(String str, String str2, int i, OperationCallback operationCallback) {
        PullResult pullResult;
        HwLog.i(TAG, "operationDownloadTask enter");
        String strBuildTaskId = buildTaskId(str, str2);
        if (!this.mWatchFaceDownloadList.containsKey(strBuildTaskId)) {
            HwLog.w(TAG, "downloadOperation, not contain hiTopId");
            return;
        }
        PullTask pullTask = this.mWatchFaceDownloadList.get(strBuildTaskId);
        if (this.mDownloadingMap.containsKey(strBuildTaskId) && (pullResult = this.mDownloadingMap.get(strBuildTaskId)) != null) {
            pullResult.configStatus(i == 1 ? 3 : 4);
        }
        if (i != 1) {
            if (this.mPauseQueue.containsKey(strBuildTaskId)) {
                this.mPauseQueue.remove(strBuildTaskId);
            }
            notifyDownloadStatus(strBuildTaskId, -8);
            operationCallback.operationResult(0);
            return;
        }
        if (this.mDownloadingMap.containsKey(strBuildTaskId)) {
            HwLog.i(TAG, "taskId pause：" + strBuildTaskId);
            this.mPauseQueue.put(strBuildTaskId, pullTask);
            this.mDownloadingMap.remove(strBuildTaskId);
        }
        if (this.mWaitQueue.containsKey(strBuildTaskId)) {
            this.mPauseQueue.put(strBuildTaskId, pullTask);
            this.mWaitQueue.remove(strBuildTaskId);
        }
        notifyDownloadStatus(strBuildTaskId, 3);
        operationCallback.operationResult(0);
        if (this.mWaitQueue.isEmpty() || this.mDownloadingMap.size() >= 5) {
            return;
        }
        addTask(this.mWaitQueue.entrySet().iterator().next().getValue());
        this.mWaitQueue.remove(strBuildTaskId);
    }

    public void removeTask(String str, String str2) {
        removeTask(str, str2, true);
    }

    public void setDownloadTaskList(List<PullTask> list) {
        HwLog.i(TAG, "setDownloadTaskList() enter.");
        if (list == null || list.isEmpty()) {
            HwLog.e(TAG, "setDownloadTaskList() param illegal.");
            return;
        }
        this.mWatchFaceDownloadList.clear();
        for (PullTask pullTask : list) {
            if (pullTask == null || pullTask.fetchUUID() == null) {
                HwLog.e(TAG, "setDownloadTaskList() task is null.");
            } else {
                pullTask.configStatus(3);
                HwLog.i(TAG, "setDownloadTaskList mWatchFaceDownloadList add where 1 fetchUUID：" + pullTask.fetchUUID());
                this.mWatchFaceDownloadList.put(pullTask.fetchUUID(), pullTask);
            }
        }
        HwLog.i(TAG, "setDownloadTaskList() complete.");
    }

    public void removeTask(String str, String str2, boolean z) {
        HwLog.i(TAG, "removeTask hiTopId:" + str + ",version:" + str2);
        String strBuildTaskId = buildTaskId(str, str2);
        String strBuildTaskId2 = buildTaskId(n.e().f(str), str2);
        this.mWatchFaceDownloadList.remove(strBuildTaskId);
        this.mWatchFaceDownloadList.remove(strBuildTaskId2);
        if (this.mPauseQueue.containsKey(strBuildTaskId)) {
            HwLog.i(TAG, "removeTask() mPauseQueue taskId:" + strBuildTaskId);
            this.mPauseQueue.remove(strBuildTaskId);
        }
        if (this.mPauseQueue.containsKey(strBuildTaskId2)) {
            HwLog.i(TAG, "removeTask() mPauseQueue taskId:" + strBuildTaskId2);
            this.mPauseQueue.remove(strBuildTaskId2);
        }
        if (this.mWaitQueue.containsKey(strBuildTaskId)) {
            HwLog.i(TAG, "removeTask() mWaitQueue taskId:" + strBuildTaskId);
            this.mWaitQueue.remove(strBuildTaskId);
        }
        if (this.mWaitQueue.containsKey(strBuildTaskId2)) {
            HwLog.i(TAG, "removeTask() mWaitQueue taskId:" + strBuildTaskId2);
            this.mWaitQueue.remove(strBuildTaskId2);
        }
        if (z) {
            downloadSuccessAutoDownloadNextTask(str, str2);
        }
    }

    private void deleteFile(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.w(TAG, "deleteFile pathName is empty");
            return;
        }
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            HwLog.i(TAG, "deleteFile is : " + file.delete());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void cancelTask(String str, String str2, boolean z) {
        String strBuildTaskId = buildTaskId(str, str2);
        String strH = n.e().h(str);
        String strBuildTaskId2 = buildTaskId(strH, str2);
        HwLog.i(TAG, "cancelTask, taskId:" + strBuildTaskId + ", installNext: " + z + " aodCancelTaskid:" + strBuildTaskId2 + " mWatchFaceDownloadList:" + GsonHelper.toJson(this.mWatchFaceDownloadList.keySet()));
        boolean zContainsKey = this.mWatchFaceDownloadList.containsKey(strBuildTaskId);
        boolean z2 = zContainsKey;
        if (this.mWatchFaceDownloadList.containsKey(strBuildTaskId2) && !zContainsKey) {
            z2 = zContainsKey;
            z2 = 2;
        }
        if (z2 == 0) {
            HwLog.e(TAG, "cancelTask,STATE_FIND_ERROR");
            return;
        }
        if (z2 == 2) {
            strBuildTaskId = strBuildTaskId2;
        }
        if (z2 == 2) {
            str = strH;
        }
        HwLog.i(TAG, "cancelTask, hiTopId:" + str + ",version: " + str2 + ",taskId:" + strBuildTaskId);
        PullTask pullTask = this.mWatchFaceDownloadList.get(strBuildTaskId);
        if (pullTask == null) {
            HwLog.w(TAG, "cancelTask, task is null");
            return;
        }
        if (this.mDownloadingMap.containsKey(strBuildTaskId)) {
            HwLog.i(TAG, "cancelTask, cancel task in mDownloadingMap");
            PullResult pullResult = this.mDownloadingMap.get(strBuildTaskId);
            if (pullResult == null) {
                HwLog.w(TAG, "cancelTask, result is null");
                return;
            } else {
                pullResult.configStatus(-10);
                removeTask(str, str2, z);
            }
        }
        if (pullTask.fetchStatus() == 6) {
            HwLog.i(TAG, "cancelTask, cancel task in installing");
            removeTask(str, str2, z);
        }
        if (this.mWaitQueue.containsKey(strBuildTaskId)) {
            HwLog.i(TAG, "cancelTask, cancel task in mWaitQueue");
            removeTask(str, str2, z);
        }
        if (this.mPauseQueue.containsKey(strBuildTaskId)) {
            HwLog.i(TAG, "cancelTask, cancel task in mPauseQueue");
            removeTask(str, str2, z);
        }
        if (pullTask.fetchStatus() == 3) {
            HwLog.i(TAG, "cancelTask, cancel task in pause");
            removeTask(str, str2, z);
        }
    }
}
