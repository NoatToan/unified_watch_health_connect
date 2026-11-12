package org.conscrypt;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import kg.f;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OpenSSLMac extends MacSpi {
    private NativeRef.HMAC_CTX ctx;
    private final long evp_md;
    private byte[] keyBytes;
    private final byte[] singleByte;
    private final int size;

    public static final class HmacMD5 extends OpenSSLMac {
        public HmacMD5() {
            super(EvpMdRef.MD5.EVP_MD, EvpMdRef.MD5.SIZE_BYTES);
        }
    }

    public static final class HmacSHA1 extends OpenSSLMac {
        public HmacSHA1() {
            super(EvpMdRef.SHA1.EVP_MD, EvpMdRef.SHA1.SIZE_BYTES);
        }
    }

    public static final class HmacSHA224 extends OpenSSLMac {
        public HmacSHA224() {
            super(EvpMdRef.SHA224.EVP_MD, EvpMdRef.SHA224.SIZE_BYTES);
        }
    }

    public static final class HmacSHA256 extends OpenSSLMac {
        public HmacSHA256() {
            super(EvpMdRef.SHA256.EVP_MD, EvpMdRef.SHA256.SIZE_BYTES);
        }
    }

    public static final class HmacSHA384 extends OpenSSLMac {
        public HmacSHA384() {
            super(EvpMdRef.SHA384.EVP_MD, EvpMdRef.SHA384.SIZE_BYTES);
        }
    }

    public static final class HmacSHA512 extends OpenSSLMac {
        public HmacSHA512() {
            super(EvpMdRef.SHA512.EVP_MD, EvpMdRef.SHA512.SIZE_BYTES);
        }
    }

    private OpenSSLMac(long j8, int i14) {
        this.singleByte = new byte[1];
        this.evp_md = j8;
        this.size = i14;
    }

    private final void resetContext() {
        NativeRef.HMAC_CTX hmac_ctx = new NativeRef.HMAC_CTX(NativeCrypto.HMAC_CTX_new());
        byte[] bArr = this.keyBytes;
        if (bArr != null) {
            NativeCrypto.HMAC_Init_ex(hmac_ctx, bArr, this.evp_md);
        }
        this.ctx = hmac_ctx;
    }

    @Override // javax.crypto.MacSpi
    public byte[] engineDoFinal() {
        byte[] bArrHMAC_Final = NativeCrypto.HMAC_Final(this.ctx);
        resetContext();
        return bArrHMAC_Final;
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return this.size;
    }

    @Override // javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(key instanceof SecretKey)) {
            e.q("key must be a SecretKey");
            return;
        }
        if (algorithmParameterSpec != null) {
            e.t("unknown parameter type");
            return;
        }
        byte[] encoded = key.getEncoded();
        this.keyBytes = encoded;
        if (encoded != null) {
            resetContext();
        } else {
            e.q("key cannot be encoded");
        }
    }

    @Override // javax.crypto.MacSpi
    public void engineReset() {
        resetContext();
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            if (!byteBuffer.isDirect()) {
                super.engineUpdate(byteBuffer);
                return;
            }
            long directBufferAddress = NativeCrypto.getDirectBufferAddress(byteBuffer);
            if (directBufferAddress == 0) {
                super.engineUpdate(byteBuffer);
                return;
            }
            int iPosition = byteBuffer.position();
            if (iPosition < 0) {
                f.n("Negative position");
                return;
            }
            long j8 = directBufferAddress + ((long) iPosition);
            int iRemaining = byteBuffer.remaining();
            if (iRemaining < 0) {
                f.n("Negative remaining amount");
            } else {
                NativeCrypto.HMAC_UpdateDirect(this.ctx, j8, iRemaining);
                byteBuffer.position(iPosition + iRemaining);
            }
        }
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte[] bArr, int i14, int i15) {
        NativeCrypto.HMAC_Update(this.ctx, bArr, i14, i15);
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte b14) {
        byte[] bArr = this.singleByte;
        bArr[0] = b14;
        engineUpdate(bArr, 0, 1);
    }
}
