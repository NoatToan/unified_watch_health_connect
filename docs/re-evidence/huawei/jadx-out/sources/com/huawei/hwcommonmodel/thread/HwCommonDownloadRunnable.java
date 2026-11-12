package com.huawei.hwcommonmodel.thread;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.secure.android.common.SecureSSLSocketFactory;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes37.dex */
public class HwCommonDownloadRunnable implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static CopyOnWriteArraySet<Integer> f17222b = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17223a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DownloadFileListener f17224c;
    private long d;
    private String e;
    private String f;
    private boolean g;
    private final int h;
    private int i;
    private int j;
    private int k;
    private String m;

    public interface DownloadFileListener {
        void onCancel();

        void onComplete();

        void onFailure(int i);

        void onProgress(int i);
    }

    @Override // java.lang.Runnable
    public void run() {
        LogUtil.a("HwCommonDownloadRunnable", "start run, managerId:", Integer.valueOf(this.h));
        if (a()) {
            return;
        }
        b();
    }

    private boolean a() {
        if (this.e == null || this.f == null || this.f17224c == null) {
            LogUtil.j("HwCommonDownloadRunnable", "mDownLoadUrl or mFilePath or mDownloadListener is null");
            return true;
        }
        f17222b.remove(Integer.valueOf(this.h));
        File file = new File(this.f);
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            try {
                if (!parentFile.exists()) {
                    LogUtil.a("HwCommonDownloadRunnable", "parentFile.mkdirs(): ", Boolean.valueOf(parentFile.mkdirs()));
                }
                if (!file.exists()) {
                    LogUtil.a("HwCommonDownloadRunnable", "file.createNewFile(): ", Boolean.valueOf(file.createNewFile()));
                }
            } catch (IOException unused) {
                this.f17224c.onFailure(1001);
            }
        }
        if (file.exists()) {
            if (this.g) {
                long length = file.length();
                this.d = length;
                LogUtil.a("HwCommonDownloadRunnable", "resume mDownloadedSize :", Long.valueOf(length));
            } else {
                LogUtil.a("HwCommonDownloadRunnable", "not resume isDelete :", Boolean.valueOf(file.delete()));
                this.d = 0L;
            }
            return false;
        }
        LogUtil.j("HwCommonDownloadRunnable", "file path is error");
        this.f17224c.onFailure(1001);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    private void b() {
        int responseCode;
        int contentLength;
        InputStream inputStream = null;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(this.e).openConnection();
            LogUtil.a("HwCommonDownloadRunnable", "downloadFile openConnection success");
            if (a(this.e)) {
                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnectionE = e((HttpURLConnection) uRLConnectionOpenConnection);
                    responseCode = httpURLConnectionE.getResponseCode();
                    if (a(responseCode)) {
                        return;
                    }
                    contentLength = httpURLConnectionE.getContentLength();
                    inputStream = httpURLConnectionE.getInputStream();
                } else {
                    responseCode = 0;
                    contentLength = 0;
                }
            } else if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                HttpsURLConnection httpsURLConnectionE = e((HttpsURLConnection) uRLConnectionOpenConnection);
                if (httpsURLConnectionE == null) {
                    return;
                }
                responseCode = httpsURLConnectionE.getResponseCode();
                if (a(responseCode)) {
                    return;
                }
                contentLength = httpsURLConnectionE.getContentLength();
                inputStream = httpsURLConnectionE.getInputStream();
            } else {
                responseCode = 0;
                contentLength = 0;
            }
            if (e(responseCode, contentLength)) {
                return;
            }
            c(contentLength, inputStream);
        } catch (IOException unused) {
            LogUtil.e("HwCommonDownloadRunnable", "downloadFile IOException");
            e();
        } catch (MalformedURLException unused2) {
            LogUtil.e("HwCommonDownloadRunnable", "downloadFile MalformedURLException");
            e();
        } catch (ProtocolException unused3) {
            LogUtil.e("HwCommonDownloadRunnable", "downloadFile ProtocolException");
            e();
        } finally {
            c(inputStream);
        }
    }

    private void e() {
        if (CommonUtil.ab(BaseApplication.getContext())) {
            d(1003);
            return;
        }
        LogUtil.j("HwCommonDownloadRunnable", "checkExceptionReason network not connect");
        DownloadFileListener downloadFileListener = this.f17224c;
        if (downloadFileListener != null) {
            downloadFileListener.onFailure(1007);
        }
    }

    private HttpsURLConnection e(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        if (c(httpsURLConnection)) {
            this.f17224c.onFailure(1002);
            return null;
        }
        httpsURLConnection.setRequestMethod("GET");
        httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        httpsURLConnection.setConnectTimeout(10000);
        if (this.g && this.d > 0) {
            httpsURLConnection.setRequestProperty("Range", "bytes=" + this.d + Constants.LINK);
        }
        return httpsURLConnection;
    }

    private HttpURLConnection e(HttpURLConnection httpURLConnection) throws ProtocolException {
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(10000);
        if (this.g && this.d > 0) {
            httpURLConnection.setRequestProperty("Range", "bytes=" + this.d + Constants.LINK);
        }
        return httpURLConnection;
    }

    private boolean e(int i, int i2) {
        LogUtil.a("HwCommonDownloadRunnable", "checkResult responseCode", Integer.valueOf(i));
        if (i != 200 && i != 206) {
            LogUtil.j("HwCommonDownloadRunnable", "responseCode is :", Integer.valueOf(i));
            this.f17224c.onFailure(1003);
            return true;
        }
        if (i2 != 0) {
            return false;
        }
        LogUtil.j("HwCommonDownloadRunnable", "run file length is 0");
        this.f17224c.onFailure(1005);
        return true;
    }

    private boolean a(int i) {
        LogUtil.a("HwCommonDownloadRunnable", "checkResponseCode responseCode :", Integer.valueOf(i));
        if (i != 416) {
            return false;
        }
        if (!TextUtils.isEmpty(this.m) && this.m.equalsIgnoreCase(d(this.f))) {
            this.f17224c.onComplete();
            LogUtil.a("HwCommonDownloadRunnable", "checkResponseCode onComplete");
            return true;
        }
        d(1004);
        LogUtil.j("HwCommonDownloadRunnable", "checkResponseCode onFailure");
        return true;
    }

    private boolean a(String str) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf != -1) {
            return "http".equalsIgnoreCase(str.substring(0, iIndexOf));
        }
        return false;
    }

    private void c(int i, InputStream inputStream) throws IOException {
        if (inputStream == null) {
            LogUtil.j("HwCommonDownloadRunnable", "inputStream is null");
            this.f17224c.onFailure(1003);
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.f), "rw");
        long length = randomAccessFile.length();
        LogUtil.a("HwCommonDownloadRunnable", "initial size:", Long.valueOf(length));
        byte[] bArr = new byte[1024];
        while (!f17222b.contains(Integer.valueOf(this.h))) {
            int i2 = inputStream.read(bArr);
            if (i2 <= 0) {
                if (TextUtils.isEmpty(this.m)) {
                    LogUtil.a("HwCommonDownloadRunnable", "hashValue is empty,report complete");
                    this.f17224c.onComplete();
                } else {
                    if (this.m.equalsIgnoreCase(d(this.f))) {
                        LogUtil.a("HwCommonDownloadRunnable", "hashValue equals");
                        this.f17224c.onComplete();
                    } else {
                        d(1006);
                    }
                }
                randomAccessFile.close();
            }
            length += (long) i2;
            int i3 = (int) ((length / (((long) i) + this.d)) * 100.0f);
            if (i3 - this.f17223a >= this.i || i3 > 99) {
                this.f17224c.onProgress(i3);
                this.f17223a = i3;
            }
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write(bArr, 0, i2);
        }
        LogUtil.a("HwCommonDownloadRunnable", "need cancel");
        this.f17224c.onCancel();
        randomAccessFile.close();
    }

    private String d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwCommonDownloadRunnable", "path is null");
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(CommonUtil.c(str));
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] bArr = new byte[1024];
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    messageDigest.update(bArr, 0, 0);
                } else {
                    messageDigest.update(bArr, 0, i);
                    while (true) {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, i2);
                    }
                }
                return HEXUtils.a(messageDigest.digest());
            } catch (IOException unused) {
                LogUtil.e("HwCommonDownloadRunnable", "getShaValue IOException");
                return "";
            } catch (NoSuchAlgorithmException unused2) {
                LogUtil.e("HwCommonDownloadRunnable", "getShaValue NoSuchAlgorithmException");
                return "";
            } finally {
                c(fileInputStream);
            }
        } catch (FileNotFoundException unused3) {
            LogUtil.e("HwCommonDownloadRunnable", "getShaValue FileNotFoundException");
            return "";
        }
    }

    private boolean c(HttpsURLConnection httpsURLConnection) {
        try {
            httpsURLConnection.setSSLSocketFactory(SecureSSLSocketFactory.getInstance(BaseApplication.getContext()));
            return false;
        } catch (IOException | IllegalAccessException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            LogUtil.e("HwCommonDownloadRunnable", "setScoketFactoryFunc exception");
            return true;
        }
    }

    private void c(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                LogUtil.e("HwCommonDownloadRunnable", "closeStream: IOException");
                return;
            }
        }
        LogUtil.a("HwCommonDownloadRunnable", "closeStream");
    }

    private void d(int i) {
        LogUtil.a("HwCommonDownloadRunnable", "handleFailed :", Integer.valueOf(i));
        int i2 = this.j;
        if (i2 < this.k) {
            LogUtil.a("HwCommonDownloadRunnable", "handleFailed,retryNum:", Integer.valueOf(i2));
            if (i == 1006 || i == 1004) {
                e(i);
                return;
            } else {
                c();
                return;
            }
        }
        DownloadFileListener downloadFileListener = this.f17224c;
        if (downloadFileListener != null) {
            downloadFileListener.onFailure(i);
        }
        this.j = 0;
    }

    private void c() {
        this.j++;
        this.f17223a = 0;
        File file = new File(this.f);
        if (file.exists()) {
            if (this.g) {
                long length = file.length();
                this.d = length;
                LogUtil.a("HwCommonDownloadRunnable", "downloadRetry, resume mDownloadedSize :", Long.valueOf(length));
            } else {
                LogUtil.a("HwCommonDownloadRunnable", "downloadRetry, not resume isDelete :", Boolean.valueOf(file.delete()));
                this.d = 0L;
            }
        }
        j();
        b();
    }

    private void e(int i) {
        File file = new File(this.f);
        if (file.exists()) {
            if (file.delete()) {
                if (b(file)) {
                    d();
                    return;
                } else {
                    c();
                    return;
                }
            }
            DownloadFileListener downloadFileListener = this.f17224c;
            if (downloadFileListener != null) {
                downloadFileListener.onFailure(i);
                return;
            }
            return;
        }
        if (b(file)) {
            d();
        } else {
            c();
        }
    }

    private void d() {
        DownloadFileListener downloadFileListener = this.f17224c;
        if (downloadFileListener != null) {
            downloadFileListener.onFailure(1001);
        }
    }

    private boolean b(File file) {
        File parentFile = file.getParentFile();
        try {
            if (parentFile == null) {
                LogUtil.j("HwCommonDownloadRunnable", "createDownloadFileError parentFile is null");
                return true;
            }
            if (!parentFile.exists()) {
                boolean zMkdirs = parentFile.mkdirs();
                LogUtil.a("HwCommonDownloadRunnable", "createDownloadFileError parentFile.mkdirs(): ", Boolean.valueOf(zMkdirs));
                if (!zMkdirs) {
                    return true;
                }
            }
            if (!file.exists()) {
                boolean zCreateNewFile = file.createNewFile();
                LogUtil.a("HwCommonDownloadRunnable", "createDownloadFileError file.createNewFile(): ", Boolean.valueOf(zCreateNewFile));
                if (!zCreateNewFile) {
                    return true;
                }
            }
            return false;
        } catch (IOException unused) {
            LogUtil.e("HwCommonDownloadRunnable", "createDownloadFileError IOException");
            return true;
        }
    }

    private void j() {
        try {
            LogUtil.a("HwCommonDownloadRunnable", "startWait");
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
            LogUtil.e("HwCommonDownloadRunnable", "startWait InterruptedException");
        }
    }
}
