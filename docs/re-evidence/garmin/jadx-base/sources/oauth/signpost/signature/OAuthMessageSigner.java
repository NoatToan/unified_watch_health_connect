package oauth.signpost.signature;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import t63.a;
import t63.b;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OAuthMessageSigner implements Serializable {
    private static final long serialVersionUID = 4445779788786131202L;
    private String consumerSecret;
    private String tokenSecret;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    public String base64Encode(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder();
        try {
            int length = bArr.length;
            for (int i14 = 0; i14 < length; i14 += 3) {
                int iMin = Math.min(3, length - i14);
                long j8 = 0;
                for (int i15 = 0; i15 < iMin; i15++) {
                    j8 = (j8 | ((long) (bArr[i14 + i15] & UnsignedBytes.MAX_VALUE))) << 8;
                }
                int i16 = ((iMin + 1) * 8) - 6;
                int i17 = 0;
                while (i17 < iMin * 8) {
                    sb3.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(((int) (j8 >>> (i16 - i17))) & 63));
                    i17 += 6;
                }
                while (i17 < 24) {
                    sb3.append('=');
                    i17 += 6;
                }
            }
            return sb3.toString();
        } catch (IOException e4) {
            l2.p(e4);
            return null;
        }
    }

    public byte[] decodeBase64(String str) {
        throw new UnsupportedOperationException();
    }

    public String getConsumerSecret() {
        return this.consumerSecret;
    }

    public abstract String getSignatureMethod();

    public String getTokenSecret() {
        return this.tokenSecret;
    }

    public void setConsumerSecret(String str) {
        this.consumerSecret = str;
    }

    public void setTokenSecret(String str) {
        this.tokenSecret = str;
    }

    public abstract String sign(b bVar, a aVar);
}
