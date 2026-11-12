package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.util.LocationUtil;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class KeyStoreFactoryBean {
    private String location;
    private String password;
    private String provider;
    private String type;

    private KeyStore newKeyStore() {
        return getProvider() != null ? KeyStore.getInstance(getType(), getProvider()) : KeyStore.getInstance(getType());
    }

    public KeyStore createKeyStore() {
        if (getLocation() == null) {
            h.s("location is required");
            return null;
        }
        InputStream inputStreamOpenStream = null;
        try {
            try {
                try {
                    try {
                        inputStreamOpenStream = LocationUtil.urlForResource(getLocation()).openStream();
                        KeyStore keyStoreNewKeyStore = newKeyStore();
                        keyStoreNewKeyStore.load(inputStreamOpenStream, getPassword().toCharArray());
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                                return keyStoreNewKeyStore;
                            } catch (IOException e4) {
                                e4.printStackTrace(System.err);
                            }
                        }
                        return keyStoreNewKeyStore;
                    } catch (Throwable th3) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (IOException e14) {
                                e14.printStackTrace(System.err);
                            }
                        }
                        throw th3;
                    }
                } catch (FileNotFoundException unused) {
                    throw new KeyStoreException(getLocation() + ": file not found");
                }
            } catch (Exception e15) {
                throw new KeyStoreException(getLocation() + ": " + e15.getMessage(), e15);
            }
        } catch (NoSuchAlgorithmException unused2) {
            throw new NoSuchAlgorithmException("no such keystore type: " + getType());
        } catch (NoSuchProviderException unused3) {
            throw new NoSuchProviderException("no such keystore provider: " + getProvider());
        }
    }

    public String getLocation() {
        return this.location;
    }

    public String getPassword() {
        String str = this.password;
        return str == null ? SSL.DEFAULT_KEYSTORE_PASSWORD : str;
    }

    public String getProvider() {
        return this.provider;
    }

    public String getType() {
        String str = this.type;
        return str == null ? SSL.DEFAULT_KEYSTORE_TYPE : str;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
