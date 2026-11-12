package com.huawei.thirdloginbasemodule;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lsp;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.StorageParams;
import health.compact.a.ThirdLoginFreshAccessToken;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class ThirdLoginDataStorageUtil {
    private static final long AT_REFRESH_INTERVAL = 30000;
    private static final int AT_TOKEN_TYPE = 2;
    private static final String LITE_ACCESS_TOKEN_EXPIRE_TIME_KEY = "accessTokenExpireTime";
    private static final String LITE_ACCESS_TOKEN_KEY = "lite_access_token";
    private static final String LITE_LOGOUT_KEY = "logout_flag";
    private static final String LITE_REFRESH_TOKEN_EXPIRE_TIME_KEY = "refreshTokenExpireTime";
    private static final String LITE_REFRESH_TOKEN_KEY = "lite_refresh_token";
    private static final String LITE_SERVER_TIME_KEY = "serverTimestamp";
    private static final String LITE_USER_ID_KEY = "lite_uid";
    public static final long REFRESH_TOKEN_INTERVAL = 15552000000L;
    private static final String RELEASE_TAG = "R_3rdLoginDataStrgUt";
    public static final String START_DAEMON_FOR_REFRESH_TOKEN = "REFRESH_TOKEN_START_DAEMON_SERVICE";
    private static final String TAG = "3rdLoginDataStrgUt";
    private static long sClickTimeStamp;

    public static int getTokenTypeValue() {
        return 2;
    }

    private ThirdLoginDataStorageUtil() {
    }

    public static String getAccessTokenFromDb() {
        if (isAccessTokenOverTime() && needRefresh()) {
            ReleaseLogUtil.e(RELEASE_TAG, "isAccessTokenOverTime");
            ThirdLoginFreshAccessToken.b();
        }
        return KeyValDbManager.d(BaseApplication.getContext()).b(LITE_ACCESS_TOKEN_KEY, new StorageParams(1));
    }

    public static void saveAccessTokenToDb(String str) {
        KeyValDbManager.d(BaseApplication.getContext()).a(LITE_ACCESS_TOKEN_KEY, str, new StorageParams(1), null);
    }

    public static int deleteAccessTokenFromDb() {
        return KeyValDbManager.d(BaseApplication.getContext()).d(LITE_ACCESS_TOKEN_KEY);
    }

    public static String getAccessTokenExpireTimeFromDb() {
        return KeyValDbManager.d(BaseApplication.getContext()).b(LITE_ACCESS_TOKEN_EXPIRE_TIME_KEY, new StorageParams(1));
    }

    public static void saveAccessTokenExpireTimeToDb(String str) {
        KeyValDbManager.d(BaseApplication.getContext()).a(LITE_ACCESS_TOKEN_EXPIRE_TIME_KEY, str, new StorageParams(1), null);
    }

    public static String getRefreshTokenFromDb() {
        return KeyValDbManager.d(BaseApplication.getContext()).b(LITE_REFRESH_TOKEN_KEY, new StorageParams(1));
    }

    public static void saveRefreshTokenToDb(String str) {
        KeyValDbManager.d(BaseApplication.getContext()).a(LITE_REFRESH_TOKEN_KEY, str, new StorageParams(1), null);
    }

    public static String getRefreshTokenExpireTimeFromDb() {
        return KeyValDbManager.d(BaseApplication.getContext()).b(LITE_REFRESH_TOKEN_EXPIRE_TIME_KEY, new StorageParams(1));
    }

    public static void saveRefreshTokenExpireTimeToDb(String str) {
        KeyValDbManager.d(BaseApplication.getContext()).a(LITE_REFRESH_TOKEN_EXPIRE_TIME_KEY, str, new StorageParams(1), null);
        LogUtil.a(TAG, "saveRefreshTokenExpireTimeToDb expireTime = ", str);
    }

    public static String getServerTimestamp() {
        return KeyValDbManager.d(BaseApplication.getContext()).b(LITE_SERVER_TIME_KEY, new StorageParams(1));
    }

    public static void saveServerTimestamp(String str) {
        KeyValDbManager.d(BaseApplication.getContext()).a(LITE_SERVER_TIME_KEY, str, new StorageParams(1), null);
    }

    public static void setUserId(String str) {
        KeyValDbManager.d(BaseApplication.getContext()).a(LITE_USER_ID_KEY, str, new StorageParams(1), null);
        LogUtil.d(TAG, "setUserId completed uid = ", str);
    }

    public static String getUserId() {
        LogUtil.d(TAG, "Enter getUID");
        return KeyValDbManager.d(BaseApplication.getContext()).b(LITE_USER_ID_KEY, new StorageParams(1));
    }

    public static void setLogoutFlag(boolean z) {
        KeyValDbManager.d(BaseApplication.getContext()).a(LITE_LOGOUT_KEY, String.valueOf(z), new StorageParams(1), null);
    }

    public static String getLogoutFlag() {
        LogUtil.a(TAG, "Enter getLogoutFlag");
        return KeyValDbManager.d(BaseApplication.getContext()).b(LITE_LOGOUT_KEY, new StorageParams(1));
    }

    public static boolean isAccessTokenOverTime() {
        String accessTokenExpireTimeFromDb = getAccessTokenExpireTimeFromDb();
        LogUtil.d(TAG, "isAccessTokenOverTime oldAtExpireTime = ", accessTokenExpireTimeFromDb, " serverTime = ", Long.valueOf(CommonUtil.i(getServerTimestamp())));
        return TextUtils.isEmpty(accessTokenExpireTimeFromDb) || CommonUtil.i(accessTokenExpireTimeFromDb) <= System.currentTimeMillis();
    }

    public static boolean isRefreshTokenOverTime() {
        String refreshTokenExpireTimeFromDb = getRefreshTokenExpireTimeFromDb();
        LogUtil.a(TAG, "isRefreshTokenOverTime oldRtExpireTime = ", refreshTokenExpireTimeFromDb);
        return TextUtils.isEmpty(refreshTokenExpireTimeFromDb) || CommonUtil.i(refreshTokenExpireTimeFromDb) <= System.currentTimeMillis();
    }

    public static String saveProfileImage(Context context, String str, Bitmap bitmap) throws Throwable {
        String str2;
        FileOutputStream fileOutputStream;
        LogUtil.a(TAG, "saveImage");
        if (context == null || bitmap == null) {
            LogUtil.j(TAG, "context is null or bitmap is null");
            return "";
        }
        File file = new File(context.getFilesDir() + File.separator + "photos" + File.separator + "headimage");
        if (!file.exists() && !file.mkdirs()) {
            LogUtil.j(TAG, "create file error");
        }
        try {
            str2 = file.getCanonicalPath() + File.separator + lsp.b(context, str);
        } catch (IOException unused) {
            LogUtil.e(TAG, "IOException");
            str2 = "";
        }
        File file2 = new File(str2);
        if (file2.exists() && !file2.delete()) {
            LogUtil.j(TAG, "delete old file error");
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (!file2.createNewFile()) {
                    LogUtil.e(TAG, "saveImage createNewFile error");
                    closeResourceObj(null);
                    return "";
                }
                fileOutputStream = new FileOutputStream(file2);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    try {
                        try {
                            fileOutputStream.flush();
                        } finally {
                            closeResourceObj(fileOutputStream);
                        }
                    } catch (IOException unused2) {
                        LogUtil.e(TAG, "saveImage finally flush IOException");
                    }
                } catch (FileNotFoundException unused3) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e(TAG, "saveImage FileNotFoundException");
                    if (fileOutputStream2 != null) {
                        try {
                            try {
                                fileOutputStream2.flush();
                            } catch (IOException unused4) {
                                LogUtil.e(TAG, "saveImage finally flush IOException");
                            }
                        } finally {
                            closeResourceObj(fileOutputStream2);
                        }
                    }
                } catch (IOException unused5) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e(TAG, "saveImage IOException");
                    try {
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.flush();
                            } catch (IOException unused6) {
                                LogUtil.e(TAG, "saveImage finally flush IOException");
                            }
                        }
                    } finally {
                        closeResourceObj(fileOutputStream2);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            try {
                                fileOutputStream.flush();
                            } catch (IOException unused7) {
                                LogUtil.e(TAG, "saveImage finally flush IOException");
                            }
                        } finally {
                            closeResourceObj(fileOutputStream);
                        }
                    }
                    throw th;
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException unused8) {
        } catch (IOException unused9) {
        }
    }

    private static void closeResourceObj(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
                LogUtil.e(TAG, "saveImage finally close IOException");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:76:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static Bitmap loadRemoteImage(String str) throws Throwable {
        Throwable th;
        InputStream inputStream;
        ?? r4 = 0;
        bitmapDecodeByteArray = null;
        bitmapDecodeByteArray = null;
        bitmapDecodeByteArray = null;
        bitmapDecodeByteArray = null;
        bitmapDecodeByteArray = null;
        Bitmap bitmapDecodeByteArray = null;
        try {
            try {
                URL url = new URL(str);
                if (str.contains(ProxyConfig.MATCH_HTTPS) && (url.openConnection() instanceof HttpsURLConnection)) {
                    LogUtil.d(TAG, "imgUrl.contains(https)");
                    str = (HttpsURLConnection) url.openConnection();
                } else {
                    if (!(url.openConnection() instanceof HttpURLConnection)) {
                        LogUtil.e(TAG, "loadRemoteImage connection is null");
                        return null;
                    }
                    LogUtil.d(TAG, "imgUrl not contains(https)");
                    str = (HttpURLConnection) url.openConnection();
                }
                try {
                    str.setDoInput(true);
                    str.connect();
                    inputStream = str.getInputStream();
                    try {
                        int contentLength = str.getContentLength();
                        LogUtil.d(TAG, "connection.getContentLength()=", Integer.valueOf(contentLength));
                        if (contentLength <= 0) {
                            LogUtil.e(TAG, "loadRemoteImage length invalid");
                            if (str != 0) {
                                str.disconnect();
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                    return null;
                                } catch (IOException unused) {
                                    LogUtil.e(TAG, "loadRemoteImage close Exception");
                                }
                            }
                            return null;
                        }
                        byte[] bArr = new byte[contentLength];
                        byte[] bArr2 = new byte[512];
                        int i = 0;
                        while (true) {
                            int i2 = inputStream.read(bArr2);
                            if (i2 <= 0) {
                                break;
                            }
                            System.arraycopy(bArr2, 0, bArr, i, i2);
                            i += i2;
                        }
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i);
                        if (str != 0) {
                            str.disconnect();
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                                LogUtil.e(TAG, "loadRemoteImage close Exception");
                            }
                        }
                        return bitmapDecodeByteArray;
                    } catch (MalformedURLException unused3) {
                        LogUtil.e(TAG, "Exception xception = MalformedURLException");
                        if (str != 0) {
                            str.disconnect();
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused4) {
                                LogUtil.e(TAG, "loadRemoteImage close Exception");
                            }
                        }
                    } catch (IOException unused5) {
                        LogUtil.e(TAG, "loadRemoteImage throw Exception");
                        if (str != 0) {
                            str.disconnect();
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused6) {
                                LogUtil.e(TAG, "loadRemoteImage close Exception");
                            }
                        }
                    }
                } catch (MalformedURLException unused7) {
                    inputStream = null;
                } catch (IOException unused8) {
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    r4 = str;
                    if (r4 != 0) {
                        r4.disconnect();
                    }
                    if (r4 != 0) {
                        try {
                            r4.close();
                        } catch (IOException unused9) {
                            LogUtil.e(TAG, "loadRemoteImage close Exception");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (MalformedURLException unused10) {
            str = 0;
            inputStream = null;
        } catch (IOException unused11) {
            str = 0;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            if (r4 != 0) {
                r4.disconnect();
            }
            if (r4 != 0) {
                r4.close();
            }
            throw th;
        }
    }

    private static boolean needRefresh() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - sClickTimeStamp < 30000) {
            return false;
        }
        LogUtil.a(TAG, "AT needRefresh");
        sClickTimeStamp = jElapsedRealtime;
        return true;
    }
}
