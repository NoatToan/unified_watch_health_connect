package org.conscrypt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactorySpi;
import javax.net.ssl.ManagerFactoryParameters;
import org.conscrypt.io.IoUtils;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class KeyManagerFactoryImpl extends KeyManagerFactorySpi {
    private KeyStore keyStore;
    private char[] pwd;

    @Override // javax.net.ssl.KeyManagerFactorySpi
    public KeyManager[] engineGetKeyManagers() {
        if (this.keyStore != null) {
            return new KeyManager[]{new KeyManagerImpl(this.keyStore, this.pwd)};
        }
        h.z("KeyManagerFactory is not initialized");
        return null;
    }

    @Override // javax.net.ssl.KeyManagerFactorySpi
    public void engineInit(KeyStore keyStore, char[] cArr) throws Throwable {
        if (keyStore != null) {
            this.keyStore = keyStore;
            if (cArr != null) {
                this.pwd = (char[]) cArr.clone();
                return;
            } else {
                this.pwd = EmptyArray.CHAR;
                return;
            }
        }
        this.keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        String property = System.getProperty("javax.net.ssl.keyStore");
        FileInputStream fileInputStream = null;
        if (property == null || property.equalsIgnoreCase("NONE") || property.isEmpty()) {
            try {
                this.keyStore.load(null, null);
                return;
            } catch (IOException e4) {
                throw new KeyStoreException(e4);
            } catch (CertificateException e14) {
                throw new KeyStoreException(e14);
            }
        }
        String property2 = System.getProperty("javax.net.ssl.keyStorePassword");
        if (property2 == null) {
            this.pwd = EmptyArray.CHAR;
        } else {
            this.pwd = property2.toCharArray();
        }
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(new File(property));
                try {
                    this.keyStore.load(fileInputStream2, this.pwd);
                    IoUtils.closeQuietly(fileInputStream2);
                } catch (FileNotFoundException e15) {
                    e = e15;
                    throw new KeyStoreException(e);
                } catch (IOException e16) {
                    e = e16;
                    throw new KeyStoreException(e);
                } catch (CertificateException e17) {
                    e = e17;
                    throw new KeyStoreException(e);
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = fileInputStream2;
                    IoUtils.closeQuietly(fileInputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (FileNotFoundException e18) {
            e = e18;
        } catch (IOException e19) {
            e = e19;
        } catch (CertificateException e24) {
            e = e24;
        }
    }

    @Override // javax.net.ssl.KeyManagerFactorySpi
    public void engineInit(ManagerFactoryParameters managerFactoryParameters) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("ManagerFactoryParameters not supported");
    }
}
