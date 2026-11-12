package com.huawei.appgallery.marketinstallerservice.impl.download;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.appgallery.marketinstallerservice.api.InstallParamSpec;
import com.huawei.appgallery.marketinstallerservice.api.MarketInfo;
import com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean.ResponseBean;
import com.huawei.hms.network.embedded.j2;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactory;
import defpackage.bid;
import defpackage.bif;
import defpackage.big;
import defpackage.bip;
import defpackage.bir;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes23.dex */
public class a extends AsyncTask<Void, Integer, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0059a f5233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MarketInfo f5234c;
    private String d;
    private String e;
    private String h = null;
    private int i = 0;
    private int j = 0;

    /* JADX INFO: renamed from: com.huawei.appgallery.marketinstallerservice.impl.download.a$a, reason: collision with other inner class name */
    public interface InterfaceC0059a {
        void a(int i, int i2);

        void a(MarketInfo marketInfo, int i, int i2);

        Context b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Integer... numArr) {
        if (numArr.length < 2) {
            return;
        }
        int iIntValue = numArr[0].intValue();
        int iIntValue2 = numArr[1].intValue();
        if (iIntValue == 0) {
            this.f5233b.a(this.f5234c, this.i, this.j);
            return;
        }
        if (iIntValue == 1 || iIntValue == 2 || iIntValue == 3 || iIntValue == 4 || iIntValue == 5) {
            this.f5233b.a(iIntValue, iIntValue2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Void... voidArr) {
        if (this.f5233b == null) {
            bir.d("MarketDownloadTask", "the callback is null error!");
            return null;
        }
        if (this.f5234c == null) {
            bir.e("MarketDownloadTask", "start getMarketInfo");
            com.huawei.appgallery.marketinstallerservice.a.e.a aVarNewInstance = com.huawei.appgallery.marketinstallerservice.a.e.a.newInstance(this.f5233b.b());
            aVarNewInstance.setServiceUrl(this.f5232a);
            aVarNewInstance.setSubsystem(this.e);
            aVarNewInstance.setMarketPkg(this.d);
            ResponseBean responseBeanE = bif.e(aVarNewInstance);
            if (!(responseBeanE instanceof big)) {
                bir.d("MarketDownloadTask", "getMarketInfo error response is null!");
                this.i = -1;
                publishProgress(0, 0);
                return null;
            }
            this.i = responseBeanE.getResponseCode();
            int rtnCode = responseBeanE.getRtnCode();
            this.j = rtnCode;
            if (this.i == 0 && rtnCode == 0) {
                big bigVar = (big) responseBeanE;
                if (bigVar.getHiAppInfo() != null) {
                    this.f5234c = bigVar.getHiAppInfo();
                    publishProgress(0, 0);
                }
            }
            bir.d("MarketDownloadTask", "getMarketInfo error: responseCode:" + this.i + ", returnCode:" + this.i);
            publishProgress(0, 0);
            return null;
        }
        bir.e("MarketDownloadTask", "allready has marketinfo!");
        publishProgress(0, 0);
        if (TextUtils.isEmpty(this.f5234c.getPkgName()) || this.f5234c.getFileSize() == 0 || TextUtils.isEmpty(this.f5234c.getSha256()) || TextUtils.isEmpty(this.f5234c.getDownUrl())) {
            bir.d("MarketDownloadTask", "getMarketInfo content is error!");
            publishProgress(4, 0);
            return null;
        }
        this.h = bid.c(this.f5233b.b());
        if (c()) {
            b();
            return null;
        }
        publishProgress(2, 0);
        return null;
    }

    private void b() {
        HttpURLConnection httpURLConnectionA = a();
        if (httpURLConnectionA == null) {
            publishProgress(2, 0);
            return;
        }
        if (!e(httpURLConnectionA)) {
            publishProgress(2, 0);
        } else if (e()) {
            publishProgress(3, 0);
        } else {
            bir.a("MarketDownloadTask", "checkDownloadedFile failed");
            publishProgress(5, 0);
        }
    }

    private boolean c() {
        File file = new File(this.h);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            bir.d("MarketDownloadTask", "createDownloadFile failed");
            return false;
        }
        if (!file.exists() || file.delete()) {
            return true;
        }
        bir.d("MarketDownloadTask", "createDownloadFile failed");
        return false;
    }

    private HttpURLConnection a() {
        String str;
        try {
            HttpURLConnection httpURLConnectionE = e(this.f5234c.getDownUrl());
            httpURLConnectionE.connect();
            int responseCode = httpURLConnectionE.getResponseCode();
            if (responseCode == 200) {
                return httpURLConnectionE;
            }
            bir.a("MarketDownloadTask", "AppDownloadTask responseCode error:" + responseCode);
            return null;
        } catch (IOException unused) {
            str = "AppDownloadTask connect IOException!";
            bir.a("MarketDownloadTask", str);
            return null;
        } catch (IllegalAccessException unused2) {
            str = "AppDownloadTask connect IllegalAccessException!";
            bir.a("MarketDownloadTask", str);
            return null;
        } catch (KeyManagementException unused3) {
            str = "AppDownloadTask connect KeyManagementException!";
            bir.a("MarketDownloadTask", str);
            return null;
        } catch (KeyStoreException unused4) {
            str = "AppDownloadTask connect KeyStoreException!";
            bir.a("MarketDownloadTask", str);
            return null;
        } catch (NoSuchAlgorithmException unused5) {
            str = "AppDownloadTask connect NoSuchAlgorithmException!";
            bir.a("MarketDownloadTask", str);
            return null;
        } catch (CertificateException unused6) {
            str = "AppDownloadTask connect CertificateException!";
            bir.a("MarketDownloadTask", str);
            return null;
        }
    }

    private boolean e(HttpURLConnection httpURLConnection) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(this.h)));
            try {
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpURLConnection.getInputStream());
                    try {
                        byte[] bArr = new byte[8192];
                        long j = 0;
                        int i = 0;
                        while (true) {
                            int i2 = bufferedInputStream2.read(bArr);
                            if (i2 == -1) {
                                bip.e(bufferedInputStream2);
                                bip.e(bufferedOutputStream);
                                return true;
                            }
                            bufferedOutputStream.write(bArr, 0, i2);
                            j += (long) i2;
                            int fileSize = (int) ((100 * j) / this.f5234c.getFileSize());
                            if (fileSize != i) {
                                publishProgress(1, Integer.valueOf(fileSize));
                                i = fileSize;
                            }
                        }
                    } catch (IOException unused) {
                        bufferedInputStream = bufferedInputStream2;
                        bir.a("MarketDownloadTask", "AppDownloadTask readStream exception IOException!");
                        bip.e(bufferedInputStream);
                        bip.e(bufferedOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        bip.e(bufferedInputStream);
                        bip.e(bufferedOutputStream);
                        throw th;
                    }
                } catch (IOException unused2) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused3) {
            bufferedOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
    }

    private boolean e() throws Throwable {
        String strD = bip.d(this.h, "SHA-256");
        if (strD != null) {
            return strD.equalsIgnoreCase(this.f5234c.getSha256());
        }
        bir.a("MarketDownloadTask", "checkDownloadedFile: file hash is null");
        return false;
    }

    private HttpURLConnection e(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty(j2.v, "identity");
        httpURLConnection.setInstanceFollowRedirects(true);
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(SecureSSLSocketFactory.getInstance(this.f5233b.b()));
            httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        }
        return httpURLConnection;
    }

    public a(InterfaceC0059a interfaceC0059a, InstallParamSpec installParamSpec) {
        this.f5232a = null;
        this.e = null;
        this.d = null;
        this.f5233b = interfaceC0059a;
        this.f5234c = installParamSpec.getMarketInfo();
        this.f5232a = installParamSpec.getServerUrl();
        this.e = installParamSpec.getSubsystem();
        this.d = installParamSpec.getMarketPkg();
    }
}
