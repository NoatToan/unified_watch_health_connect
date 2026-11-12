package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils;

import com.xiaomi.digitalkey.wearable.utils.IECDHAlgorithm;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1EncodableVector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.ASN1Integer;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.DEROutputStream;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.asn1.DERSequence;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.InvalidCipherTextException;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.engines.AESEngine;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.modes.CCMBlockCipher;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.params.AEADParameters;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.params.KeyParameter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public class SecurityChipUtil {
    public static final int AUTH_TAG_BIT_LENGTH = 32;

    public static byte[] AESDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            return AESDecryptWithAuth(new SecretKeySpec(bArr, "AES"), bArr2, Arrays.copyOfRange(bArr3, 0, bArr3.length - 4), null, Arrays.copyOfRange(bArr3, bArr3.length - 4, bArr3.length));
        } catch (InvalidCipherTextException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] AESDecryptWithAuth(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidCipherTextException {
        CCMBlockCipher cCMBlockCipherCreateAESCCMCipher = createAESCCMCipher(secretKey, false, bArr, bArr3);
        int length = bArr2.length + bArr4.length;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length, bArr4.length);
        byte[] bArr6 = new byte[cCMBlockCipherCreateAESCCMCipher.getOutputSize(length)];
        cCMBlockCipherCreateAESCCMCipher.doFinal(bArr6, cCMBlockCipherCreateAESCCMCipher.processBytes(bArr5, 0, length, bArr6, 0));
        return bArr6;
    }

    public static byte[] AESEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            return AESEncryptWithAuth(new SecretKeySpec(bArr, "AES"), bArr2, bArr3, null).getTotalData();
        } catch (InvalidCipherTextException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static AuthenticatedCipherText AESEncryptWithAuth(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) throws InvalidCipherTextException, IOException {
        CCMBlockCipher cCMBlockCipherCreateAESCCMCipher = createAESCCMCipher(secretKey, true, bArr, bArr3);
        byte[] bArr4 = new byte[cCMBlockCipherCreateAESCCMCipher.getOutputSize(bArr2.length)];
        int iProcessBytes = cCMBlockCipherCreateAESCCMCipher.processBytes(bArr2, 0, bArr2.length, bArr4, 0);
        int iDoFinal = (iProcessBytes + cCMBlockCipherCreateAESCCMCipher.doFinal(bArr4, iProcessBytes)) - 4;
        byte[] bArr5 = new byte[iDoFinal];
        byte[] bArr6 = new byte[4];
        System.arraycopy(bArr4, 0, bArr5, 0, iDoFinal);
        System.arraycopy(bArr4, iDoFinal, bArr6, 0, 4);
        return new AuthenticatedCipherText(bArr5, bArr6);
    }

    private static CCMBlockCipher createAESCCMCipher(SecretKey secretKey, boolean z, byte[] bArr, byte[] bArr2) {
        CCMBlockCipher cCMBlockCipher = new CCMBlockCipher(createAESCipher(secretKey, z));
        cCMBlockCipher.init(z, new AEADParameters(new KeyParameter(secretKey.getEncoded()), 32, bArr, bArr2));
        return cCMBlockCipher;
    }

    private static AESEngine createAESCipher(SecretKey secretKey, boolean z) {
        AESEngine aESEngine = new AESEngine();
        aESEngine.init(z, new KeyParameter(secretKey.getEncoded()));
        return aESEngine;
    }

    public static KeyPair generateEcc256KeyPair() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
            keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
            return keyPairGenerator.generateKeyPair();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] getDERSignature(byte[] bArr) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DEROutputStream dEROutputStream = new DEROutputStream(byteArrayOutputStream);
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(new BigInteger(1, bArrCopyOfRange)));
        aSN1EncodableVector.add(new ASN1Integer(new BigInteger(1, bArrCopyOfRange2)));
        try {
            dEROutputStream.writeObject(new DERSequence(aSN1EncodableVector));
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            dEROutputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return byteArray;
    }

    public static byte[] getRawPublicKey(PublicKey publicKey) {
        byte[] bArrPublicKeyToBytes = ECCPointConvert.publicKeyToBytes((ECPublicKey) publicKey);
        return bArrPublicKeyToBytes.length == 65 ? Arrays.copyOfRange(bArrPublicKeyToBytes, 1, 65) : bArrPublicKeyToBytes;
    }

    public static SecretKey getSecret(PublicKey publicKey, PrivateKey privateKey) {
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance(IECDHAlgorithm.ALGORITHM_ECDH);
            keyAgreement.init(privateKey);
            keyAgreement.doPhase(publicKey, true);
            return keyAgreement.generateSecret(IECDHAlgorithm.ALGORITHM_ECDH);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static boolean isEcdsaSignatureValid(byte[] bArr, byte[] bArr2, PublicKey publicKey) {
        try {
            Signature signature = Signature.getInstance("SHA256WithECDSA");
            signature.initVerify(publicKey);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return false;
        } catch (SignatureException e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public static byte[] sha256HMAC(byte[] bArr, byte[] bArr2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
            return mac.doFinal(bArr2);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] str2byteMac(String str) {
        byte[] bArr = new byte[6];
        String[] strArrSplit = str.split("[:]");
        int length = strArrSplit.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            bArr[i2] = (byte) Integer.parseInt(strArrSplit[i], 16);
            i++;
            i2++;
        }
        return bArr;
    }

    public static byte[] AESEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        try {
            return AESEncryptWithAuth(new SecretKeySpec(bArr, "AES"), bArr2, bArr3, bArr4).getTotalData();
        } catch (InvalidCipherTextException e) {
            e.printStackTrace();
            return null;
        }
    }
}
