package pl2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f138576a = LoggerFactory.getLogger("PAY#NFC#Auth");

    public static byte[] a(String str) throws NoSuchAlgorithmException {
        short s8;
        if (str == null || (s8 = Short.parseShort(str)) > 9999) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort(s8);
        f138576a.debug("SHA256 : " + com.garmin.device.nfc.j.a(byteBufferAllocate.array()));
        messageDigest.update(byteBufferAllocate.array());
        return messageDigest.digest();
    }

    public static byte[] b(byte b14, byte[] bArr, PublicKey publicKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        int length = bArr.length;
        Logger logger = f138576a;
        if (length != 32) {
            logger.debug("Invalid length of sha256 passcode");
            return null;
        }
        logger.error("getEncryptedPayloadForAuthCommand: not able to get encrypted payload");
        byte[] bArr2 = new byte[33];
        bArr2[0] = b14;
        System.arraycopy(bArr, 0, bArr2, 1, 32);
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, publicKey);
        return cipher.doFinal(bArr2);
    }
}
