package org.conscrypt;

import fb1.c;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes3.dex */
final class CryptoUpcalls {
    private static final Logger logger = Logger.getLogger(CryptoUpcalls.class.getName());

    private CryptoUpcalls() {
    }

    public static byte[] ecSignDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr) {
        if ("EC".equals(privateKey.getAlgorithm())) {
            return signDigestWithPrivateKey(privateKey, bArr, "NONEwithECDSA");
        }
        throw new RuntimeException("Unexpected key type: " + privateKey.toString());
    }

    private static ArrayList<Provider> getExternalProviders(String str) {
        ArrayList<Provider> arrayList = new ArrayList<>(1);
        for (Provider provider : Security.getProviders(str)) {
            if (!Conscrypt.isConscrypt(provider)) {
                arrayList.add(provider);
            }
        }
        if (arrayList.isEmpty()) {
            logger.warning("Could not find external provider for algorithm: " + str);
        }
        return arrayList;
    }

    public static byte[] rsaDecryptWithPrivateKey(PrivateKey privateKey, int i14, byte[] bArr) {
        return rsaOpWithPrivateKey(privateKey, i14, 2, bArr);
    }

    private static byte[] rsaOpWithPrivateKey(PrivateKey privateKey, int i14, int i15, byte[] bArr) {
        String str;
        Cipher cipher;
        String algorithm = privateKey.getAlgorithm();
        if (!"RSA".equals(algorithm)) {
            logger.warning("Unexpected key type: " + algorithm);
            return null;
        }
        if (i14 == 1) {
            str = "PKCS1Padding";
        } else if (i14 == 3) {
            str = "NoPadding";
        } else {
            if (i14 != 4) {
                logger.warning("Unsupported OpenSSL/BoringSSL padding: " + i14);
                return null;
            }
            str = "OAEPPadding";
        }
        String strConcat = "RSA/ECB/".concat(str);
        try {
            cipher = Cipher.getInstance(strConcat);
            cipher.init(i15, privateKey);
            if (Conscrypt.isConscrypt(cipher.getProvider())) {
                cipher = null;
            }
        } catch (InvalidKeyException e4) {
            logger.log(Level.WARNING, "Preferred provider doesn't support key:", (Throwable) e4);
        } catch (NoSuchAlgorithmException unused) {
            logger.warning("Unsupported cipher algorithm: ".concat(strConcat));
            return null;
        } catch (NoSuchPaddingException unused2) {
            logger.warning("Unsupported cipher algorithm: ".concat(strConcat));
            return null;
        }
        if (cipher == null) {
            Iterator<Provider> it = getExternalProviders("Cipher.".concat(strConcat)).iterator();
            while (it.hasNext()) {
                try {
                    cipher = Cipher.getInstance(strConcat, it.next());
                    cipher.init(i15, privateKey);
                    break;
                } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused3) {
                    cipher = null;
                }
            }
            if (cipher == null) {
                logger.warning("Could not find provider for algorithm: ".concat(strConcat));
                return null;
            }
        }
        try {
            return cipher.doFinal(bArr);
        } catch (Exception e14) {
            logger.log(Level.WARNING, "Exception while decrypting message with " + privateKey.getAlgorithm() + " private key using " + strConcat + ":", (Throwable) e14);
            return null;
        }
    }

    public static byte[] rsaSignDigestWithPrivateKey(PrivateKey privateKey, int i14, byte[] bArr) {
        return rsaOpWithPrivateKey(privateKey, i14, 1, bArr);
    }

    private static byte[] signDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr, String str) {
        Signature signature;
        try {
            signature = Signature.getInstance(str);
            signature.initSign(privateKey);
            if (Conscrypt.isConscrypt(signature.getProvider())) {
                signature = null;
            }
        } catch (InvalidKeyException e4) {
            logger.warning("Preferred provider doesn't support key:");
            e4.printStackTrace();
        } catch (NoSuchAlgorithmException unused) {
            logger.warning("Unsupported signature algorithm: " + str);
            return null;
        }
        if (signature == null) {
            Iterator<Provider> it = getExternalProviders(c.n("Signature.", str)).iterator();
            RuntimeException runtimeException = null;
            while (it.hasNext()) {
                try {
                    signature = Signature.getInstance(str, it.next());
                    signature.initSign(privateKey);
                    break;
                } catch (RuntimeException e14) {
                    if (runtimeException == null) {
                        runtimeException = e14;
                    }
                    signature = null;
                } catch (InvalidKeyException | NoSuchAlgorithmException unused2) {
                    signature = null;
                }
            }
            if (signature == null) {
                if (runtimeException != null) {
                    throw runtimeException;
                }
                logger.warning("Could not find provider for algorithm: " + str);
                return null;
            }
        }
        try {
            signature.update(bArr);
            return signature.sign();
        } catch (Exception e15) {
            logger.log(Level.WARNING, "Exception while signing message with " + privateKey.getAlgorithm() + " private key:", (Throwable) e15);
            return null;
        }
    }
}
