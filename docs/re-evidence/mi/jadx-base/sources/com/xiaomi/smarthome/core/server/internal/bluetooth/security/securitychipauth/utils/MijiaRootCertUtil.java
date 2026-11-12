package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils;

import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes10.dex */
public class MijiaRootCertUtil {
    public static X509Certificate getMijiaRootCertificateFromAssets() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            InputStream inputStreamOpen = BluetoothContextManager.getContext().getAssets().open("MijiaRootCert.der");
            X509Certificate x509Certificate = (X509Certificate) certificateFactory.generateCertificate(inputStreamOpen);
            inputStreamOpen.close();
            return x509Certificate;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (CertificateException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static javax.security.cert.X509Certificate getMijiaRootCertificateFromAssetsX() throws Throwable {
        InputStream inputStreamOpen;
        Throwable th;
        try {
            inputStreamOpen = BluetoothContextManager.getContext().getAssets().open("MijiaRootCert.der");
            try {
                try {
                    javax.security.cert.X509Certificate x509Certificate = javax.security.cert.X509Certificate.getInstance(inputStreamOpen);
                    IOUtils.closeQuietly(inputStreamOpen);
                    return x509Certificate;
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    IOUtils.closeQuietly(inputStreamOpen);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                IOUtils.closeQuietly(inputStreamOpen);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            inputStreamOpen = null;
        } catch (Throwable th3) {
            inputStreamOpen = null;
            th = th3;
            IOUtils.closeQuietly(inputStreamOpen);
            throw th;
        }
    }

    public static boolean verifyX509Certificate(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        try {
            x509Certificate2.verify(x509Certificate.getPublicKey());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean verifyX509CertificateX(javax.security.cert.X509Certificate x509Certificate, javax.security.cert.X509Certificate x509Certificate2) {
        try {
            x509Certificate2.verify(x509Certificate.getPublicKey());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
