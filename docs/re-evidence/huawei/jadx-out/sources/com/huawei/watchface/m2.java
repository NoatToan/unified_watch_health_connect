package com.huawei.watchface;

import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import com.huawei.secure.android.common.ssl.SSFCompatiableSystemCA;
import com.huawei.watchface.api.ResponseListener;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.videoedit.utils.Utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes20.dex */
public class m2 {
    public m2(final String str, final LinkedHashMap linkedHashMap, final File file, final ResponseListener responseListener) {
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.m2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.a(str, linkedHashMap, responseListener, file);
            }
        });
    }

    public final /* synthetic */ void a(String str, LinkedHashMap linkedHashMap, ResponseListener responseListener, File file) throws Throwable {
        OutputStream outputStream;
        FileInputStream fileInputStreamA;
        BufferedReader bufferedReader;
        OutputStream outputStream2;
        BufferedReader bufferedReader2 = null;
        try {
            HttpsURLConnection httpsURLConnectionA = a(str, linkedHashMap);
            if (httpsURLConnectionA == null) {
                HwLog.i("ImagePutRequest", "ImagePutRequest connection is null");
                responseListener.onError();
                Utils.closeSilently(null);
                Utils.closeSilently(null);
                Utils.closeSilently(null);
                return;
            }
            outputStream = httpsURLConnectionA.getOutputStream();
            try {
                fileInputStreamA = PversionSdUtils.a(file);
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int i = fileInputStreamA.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            outputStream.write(bArr, 0, i);
                        }
                        outputStream2 = outputStream;
                        try {
                            HwLog.e("ImagePutRequest", "ImagePutRequest: " + HwLog.printException(e));
                            responseListener.onError();
                            outputStream = outputStream2;
                            bufferedReader2 = bufferedReader;
                            Utils.closeSilently(bufferedReader2);
                            Utils.closeSilently(outputStream);
                            Utils.closeSilently(fileInputStreamA);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            outputStream = outputStream2;
                            bufferedReader2 = bufferedReader;
                            Utils.closeSilently(bufferedReader2);
                            Utils.closeSilently(outputStream);
                            Utils.closeSilently(fileInputStreamA);
                            throw th;
                        }
                    }
                    outputStream.flush();
                    outputStream.close();
                    int responseCode = httpsURLConnectionA.getResponseCode();
                    HwLog.i("ImagePutRequest", "ImagePutRequest responseCode =" + responseCode);
                    if (httpsURLConnectionA.getResponseCode() != 200) {
                        BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(httpsURLConnectionA.getErrorStream(), StandardCharsets.UTF_8));
                        while (true) {
                            try {
                                String line = bufferedReader3.readLine();
                                if (line == null) {
                                    break;
                                } else {
                                    HwLog.i("ImagePutRequest", line);
                                }
                            } catch (Exception e) {
                                e = e;
                                bufferedReader = bufferedReader3;
                                outputStream2 = outputStream;
                                HwLog.e("ImagePutRequest", "ImagePutRequest: " + HwLog.printException(e));
                                responseListener.onError();
                                outputStream = outputStream2;
                                bufferedReader2 = bufferedReader;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader3;
                            }
                        }
                        bufferedReader2 = bufferedReader3;
                        httpsURLConnectionA.disconnect();
                        responseListener.onResponse(Integer.valueOf(responseCode));
                        Utils.closeSilently(bufferedReader2);
                        Utils.closeSilently(outputStream);
                        Utils.closeSilently(fileInputStreamA);
                        return;
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnectionA.getInputStream(), StandardCharsets.UTF_8));
                    while (true) {
                        try {
                            String line2 = bufferedReader.readLine();
                            if (line2 == null) {
                                break;
                            } else {
                                HwLog.i("ImagePutRequest", line2);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            outputStream2 = outputStream;
                            HwLog.e("ImagePutRequest", "ImagePutRequest: " + HwLog.printException(e));
                            responseListener.onError();
                            outputStream = outputStream2;
                            bufferedReader2 = bufferedReader;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader2 = bufferedReader;
                            Utils.closeSilently(bufferedReader2);
                            Utils.closeSilently(outputStream);
                            Utils.closeSilently(fileInputStreamA);
                            throw th;
                        }
                    }
                    bufferedReader2 = bufferedReader;
                    httpsURLConnectionA.disconnect();
                    responseListener.onResponse(Integer.valueOf(responseCode));
                    Utils.closeSilently(bufferedReader2);
                    Utils.closeSilently(outputStream);
                    Utils.closeSilently(fileInputStreamA);
                    return;
                } catch (Exception e3) {
                    e = e3;
                    bufferedReader = bufferedReader2;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Exception e4) {
                e = e4;
                fileInputStreamA = null;
            } catch (Throwable th5) {
                th = th5;
                fileInputStreamA = null;
            }
            Utils.closeSilently(bufferedReader2);
            Utils.closeSilently(outputStream);
            Utils.closeSilently(fileInputStreamA);
            throw th;
        } catch (Exception e5) {
            e = e5;
            outputStream = null;
            fileInputStreamA = null;
        } catch (Throwable th6) {
            th = th6;
            outputStream = null;
            fileInputStreamA = null;
        }
    }

    public final HttpsURLConnection a(String str, LinkedHashMap linkedHashMap) {
        try {
            URL url = new URL(str);
            SSFCompatiableSystemCA sSFCompatiableSystemCA = SSFCompatiableSystemCA.getInstance(Environment.getApplicationContext(), EncryptUtil.genSecureRandom());
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpsURLConnection.setSSLSocketFactory(sSFCompatiableSystemCA);
            httpsURLConnection.setHostnameVerifier(HttpsURLConnection.getDefaultHostnameVerifier());
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setRequestMethod(ProfileRequestConstants.PUT_TYPE);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setConnectTimeout(5000);
            httpsURLConnection.setReadTimeout(5000);
            httpsURLConnection.connect();
            return httpsURLConnection;
        } catch (IOException unused) {
            HwLog.e("ImagePutRequest", "configHttpUrlConnection IOEexception.");
            return null;
        } catch (KeyManagementException unused2) {
            HwLog.e("ImagePutRequest", "configHttpUrlConnection KeyManagementException.");
            return null;
        } catch (KeyStoreException unused3) {
            HwLog.e("ImagePutRequest", "configHttpUrlConnection KeyStoreException.");
            return null;
        } catch (NoSuchAlgorithmException unused4) {
            HwLog.e("ImagePutRequest", "configHttpUrlConnection NoSuchAlgorithmException.");
            return null;
        } catch (CertificateException unused5) {
            HwLog.e("ImagePutRequest", "configHttpUrlConnection CertificateException.");
            return null;
        } catch (Exception e) {
            HwLog.e("ImagePutRequest", "configHttpUrlConnection exception:" + HwLog.printException(e));
            return null;
        }
    }
}
