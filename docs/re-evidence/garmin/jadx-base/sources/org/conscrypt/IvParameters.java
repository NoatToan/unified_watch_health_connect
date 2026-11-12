package org.conscrypt;

import androidx.core.view.j;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class IvParameters extends AlgorithmParametersSpi {

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f133488iv;

    public static class AES extends IvParameters {
    }

    public static class ChaCha20 extends IvParameters {
    }

    public static class DESEDE extends IvParameters {
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        if (str == null || str.equals("ASN.1")) {
            return engineGetEncoded();
        }
        if (str.equals("RAW")) {
            return (byte[]) this.f133488iv.clone();
        }
        h.C("Unsupported format: ".concat(str));
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class) {
            return new IvParameterSpec(this.f133488iv);
        }
        throw new InvalidParameterSpecException(j.h(cls, "Incompatible AlgorithmParametersSpec class: "));
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws Throwable {
        if (str == null || str.equals("ASN.1")) {
            engineInit(bArr);
        } else if (str.equals("RAW")) {
            this.f133488iv = (byte[]) bArr.clone();
        } else {
            h.C("Unsupported format: ".concat(str));
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "Conscrypt IV AlgorithmParameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws Throwable {
        long jAsn1_read_init;
        try {
            jAsn1_read_init = NativeCrypto.asn1_read_init(bArr);
            try {
                byte[] bArrAsn1_read_octetstring = NativeCrypto.asn1_read_octetstring(jAsn1_read_init);
                if (NativeCrypto.asn1_read_is_empty(jAsn1_read_init)) {
                    this.f133488iv = bArrAsn1_read_octetstring;
                    NativeCrypto.asn1_read_free(jAsn1_read_init);
                    return;
                }
                throw new IOException("Error reading ASN.1 encoding");
            } catch (Throwable th3) {
                th = th3;
                NativeCrypto.asn1_read_free(jAsn1_read_init);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            jAsn1_read_init = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() {
        long jAsn1_write_init = 0;
        try {
            try {
                jAsn1_write_init = NativeCrypto.asn1_write_init();
                NativeCrypto.asn1_write_octetstring(jAsn1_write_init, this.f133488iv);
                byte[] bArrAsn1_write_finish = NativeCrypto.asn1_write_finish(jAsn1_write_init);
                NativeCrypto.asn1_write_free(jAsn1_write_init);
                return bArrAsn1_write_finish;
            } catch (IOException e4) {
                NativeCrypto.asn1_write_cleanup(jAsn1_write_init);
                throw e4;
            }
        } catch (Throwable th3) {
            NativeCrypto.asn1_write_free(jAsn1_write_init);
            throw th3;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            this.f133488iv = (byte[]) ((IvParameterSpec) algorithmParameterSpec).getIV().clone();
            return;
        }
        throw new InvalidParameterSpecException("Only IvParameterSpec is supported");
    }
}
