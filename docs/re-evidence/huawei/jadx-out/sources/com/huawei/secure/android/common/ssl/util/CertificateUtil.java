package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes42.dex */
public final class CertificateUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22901a = "CertificateUtil";

    private CertificateUtil() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    public static X509Certificate getHwCbgRootCA(Context context) throws Throwable {
        Throwable e;
        InputStream inputStreamOpen;
        ?? r0 = 0;
        X509Certificate x509Certificate = null;
        try {
            try {
                KeyStore keyStore = KeyStore.getInstance(g.e);
                inputStreamOpen = context.getAssets().open("hmsrootcas.bks");
                try {
                    inputStreamOpen.reset();
                    keyStore.load(inputStreamOpen, "".toCharArray());
                    x509Certificate = (X509Certificate) keyStore.getCertificate(g.f);
                    context = inputStreamOpen;
                } catch (IOException e2) {
                    e = e2;
                    d.b(f22901a, "loadBksCA: exception : " + e.getMessage());
                    context = inputStreamOpen;
                } catch (RuntimeException e3) {
                    e = e3;
                    d.b(f22901a, "loadBksCA: exception : " + e.getMessage());
                    context = inputStreamOpen;
                } catch (KeyStoreException e4) {
                    e = e4;
                    d.b(f22901a, "loadBksCA: exception : " + e.getMessage());
                    context = inputStreamOpen;
                } catch (NoSuchAlgorithmException e5) {
                    e = e5;
                    d.b(f22901a, "loadBksCA: exception : " + e.getMessage());
                    context = inputStreamOpen;
                } catch (CertificateException e6) {
                    e = e6;
                    d.b(f22901a, "loadBksCA: exception : " + e.getMessage());
                    context = inputStreamOpen;
                }
            } catch (Throwable th) {
                r0 = context;
                th = th;
                c.a((InputStream) r0);
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            e = e;
            inputStreamOpen = null;
            d.b(f22901a, "loadBksCA: exception : " + e.getMessage());
            context = inputStreamOpen;
            c.a((InputStream) context);
            return x509Certificate;
        } catch (RuntimeException e8) {
            e = e8;
            e = e;
            inputStreamOpen = null;
            d.b(f22901a, "loadBksCA: exception : " + e.getMessage());
            context = inputStreamOpen;
            c.a((InputStream) context);
            return x509Certificate;
        } catch (KeyStoreException e9) {
            e = e9;
            e = e;
            inputStreamOpen = null;
            d.b(f22901a, "loadBksCA: exception : " + e.getMessage());
            context = inputStreamOpen;
            c.a((InputStream) context);
            return x509Certificate;
        } catch (NoSuchAlgorithmException e10) {
            e = e10;
            e = e;
            inputStreamOpen = null;
            d.b(f22901a, "loadBksCA: exception : " + e.getMessage());
            context = inputStreamOpen;
            c.a((InputStream) context);
            return x509Certificate;
        } catch (CertificateException e11) {
            e = e11;
            e = e;
            inputStreamOpen = null;
            d.b(f22901a, "loadBksCA: exception : " + e.getMessage());
            context = inputStreamOpen;
            c.a((InputStream) context);
            return x509Certificate;
        } catch (Throwable th2) {
            th = th2;
            c.a((InputStream) r0);
            throw th;
        }
        c.a((InputStream) context);
        return x509Certificate;
    }
}
