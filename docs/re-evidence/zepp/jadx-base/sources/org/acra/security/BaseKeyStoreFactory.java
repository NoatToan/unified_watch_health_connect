package org.acra.security;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import org.acra.ACRA;
import org.acra.ACRAConstants;
import org.acra.util.IOUtils;

/* JADX INFO: loaded from: classes23.dex */
public abstract class BaseKeyStoreFactory implements KeyStoreFactory {
    private final String a;

    public enum Type {
        CERTIFICATE,
        KEYSTORE
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Type.values().length];
            a = iArr;
            try {
                iArr[Type.CERTIFICATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Type.KEYSTORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public BaseKeyStoreFactory() {
        this(ACRAConstants.DEFAULT_CERTIFICATE_TYPE);
    }

    @Override // org.acra.security.KeyStoreFactory
    @Nullable
    public final KeyStore create(@NonNull Context context) {
        InputStream inputStream = getInputStream(context);
        if (inputStream != null) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                try {
                    try {
                        try {
                            KeyStore keyStore = KeyStore.getInstance(getKeyStoreType());
                            int i = a.a[getStreamType().ordinal()];
                            if (i == 1) {
                                Certificate certificateGenerateCertificate = CertificateFactory.getInstance(this.a).generateCertificate(bufferedInputStream);
                                keyStore.load(null, null);
                                keyStore.setCertificateEntry("ca", certificateGenerateCertificate);
                            } else if (i == 2) {
                                keyStore.load(bufferedInputStream, getPassword());
                            }
                            return keyStore;
                        } catch (KeyStoreException e) {
                            ACRA.log.e(ACRA.LOG_TAG, "Could not load keystore", e);
                            return null;
                        }
                    } catch (CertificateException e2) {
                        ACRA.log.e(ACRA.LOG_TAG, "Could not load certificate", e2);
                        return null;
                    }
                } catch (IOException e3) {
                    ACRA.log.e(ACRA.LOG_TAG, "Could not load keystore", e3);
                    return null;
                } catch (NoSuchAlgorithmException e4) {
                    ACRA.log.e(ACRA.LOG_TAG, "Could not load keystore", e4);
                    return null;
                }
            } finally {
                IOUtils.safeClose(bufferedInputStream);
            }
        }
        return null;
    }

    @Nullable
    public abstract InputStream getInputStream(@NonNull Context context);

    public String getKeyStoreType() {
        return KeyStore.getDefaultType();
    }

    @Nullable
    public char[] getPassword() {
        return null;
    }

    @NonNull
    public Type getStreamType() {
        return Type.CERTIFICATE;
    }

    public BaseKeyStoreFactory(String str) {
        this.a = str;
    }
}
