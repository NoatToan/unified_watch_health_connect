package com.huawei.health.h5pro.webkit;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hms.network.embedded.y;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class FileDownloadManager {

    public static abstract class DownloadCallback {
        public abstract void onFailure(int i, String str);

        public void onProgress(long j, long j2) {
        }

        public abstract void onSuccess(File file);
    }

    private FileDownloadManager() {
    }

    public static String readFileContent(Context context, String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.w("H5PRO_FileDownloadOperate", "readFileContent: Invalid file path.");
            return "";
        }
        return readFileContent(context, new File(str));
    }

    public static String readFileContent(Context context, File file) {
        if (file == null || !file.getAbsolutePath().startsWith(HpkManager.e.getRootDir(context))) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                sb.append(line);
                            } else {
                                String string = sb.toString();
                                bufferedReader.close();
                                inputStreamReader.close();
                                fileInputStream.close();
                                return string;
                            }
                            try {
                                inputStreamReader.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    inputStreamReader.close();
                    throw th4;
                }
            } catch (Throwable th5) {
                try {
                    fileInputStream.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (IOException unused) {
            return "";
        }
    }

    public static void download(final String str, String str2, final String str3, final DownloadCallback downloadCallback) {
        if (TextUtils.isEmpty(str) || !Patterns.WEB_URL.matcher(str).matches()) {
            downloadCallback.onFailure(-1, "Invalid URL.");
            return;
        }
        if (!GeneralUtil.isSafePath(str2) || !GeneralUtil.isSafePath(str3)) {
            downloadCallback.onFailure(-1, "Invalid file path or file name.");
            return;
        }
        final File file = new File(str2);
        if (file.exists() || file.mkdirs()) {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.huawei.health.h5pro.webkit.FileDownloadManager.3
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    FileDownloadManager.download(str, new File(file, str3), downloadCallback);
                }
            });
            executorServiceNewSingleThreadExecutor.shutdown();
            return;
        }
        downloadCallback.onFailure(-1, "Invalid file path.");
    }

    public static void download(String str, File file, DownloadCallback downloadCallback) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        IOException e;
        FileOutputStream fileOutputStream;
        LogUtil.i("H5PRO_FileDownloadOperate", "download start");
        if (TextUtils.isEmpty(str) || !Patterns.WEB_URL.matcher(str).matches()) {
            downloadCallback.onFailure(-1, "Invalid URL.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        HttpURLConnection httpURLConnection2 = null;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                downloadCallback.onFailure(-1, "urlConnection error");
                a(null, null, null);
                return;
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                try {
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(y.f15619c);
                    httpURLConnection.setRequestProperty(j2.v, "identity");
                    httpURLConnection.setRequestProperty("Charset", StandardCharsets.UTF_8.name());
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        try {
                            downloadCallback.onFailure(responseCode, "Download failed,The return code is " + responseCode + ".");
                            a(null, null, httpURLConnection);
                            return;
                        } catch (IOException e2) {
                            e = e2;
                            inputStream = null;
                        }
                    } else {
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[1048576];
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                long contentLength = httpURLConnection.getContentLength();
                                long j = 0;
                                while (true) {
                                    int i = inputStream.read(bArr);
                                    if (i <= 0) {
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        downloadCallback.onSuccess(file);
                                        LogUtil.i("H5PRO_FileDownloadOperate", "Download duration: " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " ms");
                                        a(fileOutputStream, inputStream, httpURLConnection);
                                        return;
                                    }
                                    fileOutputStream.write(bArr, 0, i);
                                    j += (long) i;
                                    downloadCallback.onProgress(contentLength, j);
                                }
                            } catch (IOException e3) {
                                e = e3;
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream2 = fileOutputStream;
                                a(fileOutputStream2, inputStream, httpURLConnection);
                                throw th;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            fileOutputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            a(fileOutputStream2, inputStream, httpURLConnection);
                            throw th;
                        }
                    }
                    fileOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                }
            } catch (IOException e5) {
                e = e5;
                inputStream = null;
                fileOutputStream = null;
            }
            httpURLConnection2 = httpURLConnection;
            try {
                downloadCallback.onFailure(-1, e.getMessage());
                a(fileOutputStream, inputStream, httpURLConnection2);
            } catch (Throwable th5) {
                th = th5;
                httpURLConnection = httpURLConnection2;
                fileOutputStream2 = fileOutputStream;
                a(fileOutputStream2, inputStream, httpURLConnection);
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            inputStream = null;
            fileOutputStream = null;
        } catch (Throwable th6) {
            th = th6;
            httpURLConnection = null;
            inputStream = null;
        }
    }

    private static void a(OutputStream outputStream, InputStream inputStream, HttpURLConnection httpURLConnection) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                LogUtil.e("H5PRO_FileDownloadOperate", "IO close faile");
                return;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static boolean exists(String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.w("H5PRO_FileDownloadOperate", "exists: Invalid file path.");
            return false;
        }
        return new File(str).exists();
    }

    public static boolean mkdirs(String str) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.w("H5PRO_FileDownloadOperate", "mkdirs: Invalid file path.");
            return false;
        }
        File file = new File(str);
        return file.exists() || file.mkdirs();
    }

    public static void deleteFiles(String str, boolean z) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.w("H5PRO_FileDownloadOperate", "deleteFiles: Invalid file path.");
        } else {
            deleteFiles(new File(str), z);
        }
    }

    public static void deleteFiles(File file, boolean z) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                deleteFiles(file2, true);
            }
        }
        if (z) {
            file.delete();
        }
    }
}
