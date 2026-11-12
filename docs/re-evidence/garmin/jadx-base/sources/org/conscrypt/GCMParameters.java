package org.conscrypt;

import androidx.core.view.j;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class GCMParameters extends AlgorithmParametersSpi {
    private static final int DEFAULT_TLEN = 96;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f133487iv;
    private int tLen;

    public GCMParameters(int i14, byte[] bArr) {
        this.tLen = i14;
        this.f133487iv = bArr;
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws Throwable {
        long jAsn1_write_init;
        long j8;
        long jAsn1_write_sequence = 0;
        try {
            jAsn1_write_init = NativeCrypto.asn1_write_init();
            try {
                jAsn1_write_sequence = NativeCrypto.asn1_write_sequence(jAsn1_write_init);
                NativeCrypto.asn1_write_octetstring(jAsn1_write_sequence, this.f133487iv);
                int i14 = this.tLen;
                if (i14 != 96) {
                    NativeCrypto.asn1_write_uint64(jAsn1_write_sequence, i14 / 8);
                }
                byte[] bArrAsn1_write_finish = NativeCrypto.asn1_write_finish(jAsn1_write_init);
                NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                NativeCrypto.asn1_write_free(jAsn1_write_init);
                return bArrAsn1_write_finish;
            } catch (IOException e4) {
                e = e4;
                j8 = jAsn1_write_sequence;
                jAsn1_write_sequence = jAsn1_write_init;
                try {
                    NativeCrypto.asn1_write_cleanup(jAsn1_write_sequence);
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    long j14 = j8;
                    jAsn1_write_init = jAsn1_write_sequence;
                    jAsn1_write_sequence = j14;
                    NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                    NativeCrypto.asn1_write_free(jAsn1_write_init);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                NativeCrypto.asn1_write_free(jAsn1_write_init);
                throw th;
            }
        } catch (IOException e14) {
            e = e14;
            j8 = 0;
        } catch (Throwable th5) {
            th = th5;
            jAsn1_write_init = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls == null || !cls.getName().equals("javax.crypto.spec.GCMParameterSpec")) {
            throw new InvalidParameterSpecException(j.h(cls, "Unsupported class: "));
        }
        return cls.cast(Platform.toGCMParameterSpec(this.tLen, this.f133487iv));
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws Throwable {
        long jAsn1_read_init;
        try {
            jAsn1_read_init = NativeCrypto.asn1_read_init(bArr);
            try {
                long jAsn1_read_sequence = NativeCrypto.asn1_read_sequence(jAsn1_read_init);
                byte[] bArrAsn1_read_octetstring = NativeCrypto.asn1_read_octetstring(jAsn1_read_sequence);
                int iAsn1_read_uint64 = !NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence) ? ((int) NativeCrypto.asn1_read_uint64(jAsn1_read_sequence)) * 8 : 96;
                if (!NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence) || !NativeCrypto.asn1_read_is_empty(jAsn1_read_init)) {
                    throw new IOException("Error reading ASN.1 encoding");
                }
                this.f133487iv = bArrAsn1_read_octetstring;
                this.tLen = iAsn1_read_uint64;
                NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                NativeCrypto.asn1_read_free(jAsn1_read_init);
            } catch (Throwable th3) {
                th = th3;
                NativeCrypto.asn1_read_free(0L);
                NativeCrypto.asn1_read_free(jAsn1_read_init);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            jAsn1_read_init = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "Conscrypt GCM AlgorithmParameters";
    }

    public byte[] getIV() {
        return this.f133487iv;
    }

    public int getTLen() {
        return this.tLen;
    }

    public GCMParameters() {
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        if (str != null && !str.equals("ASN.1")) {
            h.C("Unsupported format: ".concat(str));
            return null;
        }
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        GCMParameters gCMParametersFromGCMParameterSpec = Platform.fromGCMParameterSpec(algorithmParameterSpec);
        if (gCMParametersFromGCMParameterSpec != null) {
            this.tLen = gCMParametersFromGCMParameterSpec.tLen;
            this.f133487iv = gCMParametersFromGCMParameterSpec.f133487iv;
            return;
        }
        throw new InvalidParameterSpecException("Only GCMParameterSpec is supported");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws Throwable {
        if (str != null && !str.equals("ASN.1")) {
            h.C("Unsupported format: ".concat(str));
        } else {
            engineInit(bArr);
        }
    }
}
