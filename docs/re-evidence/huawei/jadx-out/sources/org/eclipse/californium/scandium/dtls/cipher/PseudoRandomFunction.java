package org.eclipse.californium.scandium.dtls.cipher;

import defpackage.aadd;
import defpackage.zzg;
import defpackage.zzl;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import org.eclipse.californium.elements.util.StandardCharsets;

/* JADX INFO: loaded from: classes20.dex */
public final class PseudoRandomFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f44575a = "EXPORTER".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f44576b = "EXPERIMENTAL".getBytes(StandardCharsets.UTF_8);

    public enum Label {
        MASTER_SECRET_LABEL("master secret", 48),
        KEY_EXPANSION_LABEL("key expansion", 128),
        CLIENT_FINISHED_LABEL("client finished", 12),
        SERVER_FINISHED_LABEL("server finished", 12),
        EXTENDED_MASTER_SECRET_LABEL("extended master secret", 48);

        private final byte[] bytesValue;
        private final int length;
        private final String value;

        Label(String str, int i) {
            this.value = str;
            this.bytesValue = str.getBytes(StandardCharsets.UTF_8);
            this.length = i;
        }

        public String value() {
            return this.value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] getBytes() {
            return this.bytesValue;
        }

        public int length() {
            return this.length;
        }
    }

    static byte[] e(Mac mac, SecretKey secretKey, byte[] bArr, byte[] bArr2, int i) {
        try {
            mac.init(secretKey);
            byte[] bArrA = a(mac, bArr, bArr2, i);
            mac.reset();
            return bArrA;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException("Cannot run Pseudo Random Function with invalid key", e);
        }
    }

    public static final byte[] a(Mac mac, SecretKey secretKey, Label label, byte[] bArr) {
        return e(mac, secretKey, label.getBytes(), bArr, label.length());
    }

    public static final byte[] c(Mac mac, SecretKey secretKey, Label label, byte[] bArr, int i) {
        return e(mac, secretKey, label.getBytes(), bArr, i);
    }

    static final byte[] a(Mac mac, byte[] bArr, byte[] bArr2, int i) {
        int macLength = mac.getMacLength();
        byte[] bArr3 = new byte[bArr.length + macLength + bArr2.length];
        byte[] bArr4 = new byte[i];
        try {
            System.arraycopy(bArr, 0, bArr3, macLength, bArr.length);
            System.arraycopy(bArr2, 0, bArr3, bArr.length + macLength, bArr2.length);
            mac.update(bArr);
            mac.update(bArr2);
            int i2 = 0;
            while (true) {
                mac.doFinal(bArr3, 0);
                mac.update(bArr3);
                int i3 = i2 + macLength;
                if (i3 > i) {
                    mac.doFinal(bArr3, 0);
                    System.arraycopy(bArr3, 0, bArr4, i2, i - i2);
                    break;
                }
                mac.doFinal(bArr4, i2);
                if (i3 == i) {
                    break;
                }
                mac.update(bArr3, 0, macLength);
                i2 = i3;
            }
        } catch (ShortBufferException e) {
            e.printStackTrace();
        }
        zzg.a(bArr3);
        return bArr4;
    }

    public static SecretKey c(Mac mac, SecretKey secretKey, byte[] bArr, boolean z) {
        byte[] bArrA = a(mac, secretKey, z ? Label.EXTENDED_MASTER_SECRET_LABEL : Label.MASTER_SECRET_LABEL, bArr);
        SecretKey secretKeyE = aadd.e(bArrA, "MAC");
        zzg.a(bArrA);
        return secretKeyE;
    }

    public static SecretKey d(SecretKey secretKey, SecretKey secretKey2) {
        byte[] encoded = secretKey2.getEncoded();
        int length = encoded.length;
        byte[] encoded2 = secretKey != null ? secretKey.getEncoded() : new byte[length];
        zzl zzlVar = new zzl(encoded2.length + length + 4, true);
        zzlVar.b(encoded2, 16);
        zzlVar.b(encoded, 16);
        byte[] bArrD = zzlVar.d();
        zzlVar.b();
        SecretKey secretKeyE = aadd.e(bArrD, "MAC");
        zzg.a(encoded);
        zzg.a(encoded2);
        zzg.a(bArrD);
        return secretKeyE;
    }
}
