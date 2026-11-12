package org.conscrypt;

import androidx.core.view.j;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class PSSParameters extends AlgorithmParametersSpi {
    private PSSParameterSpec spec = PSSParameterSpec.DEFAULT;

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws Throwable {
        long j8;
        Throwable th3;
        long jAsn1_write_init;
        IOException e4;
        long jAsn1_write_tag = 0;
        try {
            try {
                jAsn1_write_init = NativeCrypto.asn1_write_init();
                try {
                    long jAsn1_write_sequence = NativeCrypto.asn1_write_sequence(jAsn1_write_init);
                    try {
                        OAEPParameters.writeHashAndMgfHash(jAsn1_write_sequence, this.spec.getDigestAlgorithm(), (MGF1ParameterSpec) this.spec.getMGFParameters());
                        if (this.spec.getSaltLength() != 20) {
                            try {
                                jAsn1_write_tag = NativeCrypto.asn1_write_tag(jAsn1_write_sequence, 2);
                                NativeCrypto.asn1_write_uint64(jAsn1_write_tag, this.spec.getSaltLength());
                                NativeCrypto.asn1_write_flush(jAsn1_write_sequence);
                                NativeCrypto.asn1_write_free(jAsn1_write_tag);
                            } catch (Throwable th4) {
                                NativeCrypto.asn1_write_flush(jAsn1_write_sequence);
                                NativeCrypto.asn1_write_free(jAsn1_write_tag);
                                throw th4;
                            }
                        }
                        byte[] bArrAsn1_write_finish = NativeCrypto.asn1_write_finish(jAsn1_write_init);
                        NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                        NativeCrypto.asn1_write_free(jAsn1_write_init);
                        return bArrAsn1_write_finish;
                    } catch (IOException e14) {
                        e4 = e14;
                        NativeCrypto.asn1_write_cleanup(jAsn1_write_init);
                        throw e4;
                    }
                } catch (IOException e15) {
                    e4 = e15;
                } catch (Throwable th5) {
                    th3 = th5;
                    j8 = 0;
                    NativeCrypto.asn1_write_free(j8);
                    NativeCrypto.asn1_write_free(jAsn1_write_init);
                    throw th3;
                }
            } catch (Throwable th6) {
                th3 = th6;
            }
        } catch (IOException e16) {
            e4 = e16;
            jAsn1_write_init = 0;
        } catch (Throwable th7) {
            j8 = 0;
            th3 = th7;
            jAsn1_write_init = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls == null || cls != PSSParameterSpec.class) {
            throw new InvalidParameterSpecException(j.h(cls, "Unsupported class: "));
        }
        return this.spec;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws Throwable {
        Throwable th3;
        long jAsn1_read_init;
        int iAsn1_read_uint64;
        long jAsn1_read_tagged = 0;
        try {
            jAsn1_read_init = NativeCrypto.asn1_read_init(bArr);
            try {
                long jAsn1_read_sequence = NativeCrypto.asn1_read_sequence(jAsn1_read_init);
                try {
                    String hash = OAEPParameters.readHash(jAsn1_read_sequence);
                    String mgfHash = OAEPParameters.readMgfHash(jAsn1_read_sequence);
                    if (NativeCrypto.asn1_read_next_tag_is(jAsn1_read_sequence, 2)) {
                        try {
                            long jAsn1_read_tagged2 = NativeCrypto.asn1_read_tagged(jAsn1_read_sequence);
                            try {
                                iAsn1_read_uint64 = (int) NativeCrypto.asn1_read_uint64(jAsn1_read_tagged2);
                                NativeCrypto.asn1_read_free(jAsn1_read_tagged2);
                            } catch (Throwable th4) {
                                th = th4;
                                jAsn1_read_tagged = jAsn1_read_tagged2;
                                Throwable th5 = th;
                                NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                                throw th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } else {
                        iAsn1_read_uint64 = 20;
                    }
                    int i14 = iAsn1_read_uint64;
                    if (NativeCrypto.asn1_read_next_tag_is(jAsn1_read_sequence, 3)) {
                        try {
                            jAsn1_read_tagged = NativeCrypto.asn1_read_tagged(jAsn1_read_sequence);
                            long jAsn1_read_uint64 = (int) NativeCrypto.asn1_read_uint64(jAsn1_read_tagged);
                            NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                            if (jAsn1_read_uint64 != 1) {
                                throw new IOException("Error reading ASN.1 encoding");
                            }
                        } catch (Throwable th7) {
                            NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                            throw th7;
                        }
                    }
                    if (!NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence) || !NativeCrypto.asn1_read_is_empty(jAsn1_read_init)) {
                        throw new IOException("Error reading ASN.1 encoding");
                    }
                    this.spec = new PSSParameterSpec(hash, "MGF1", new MGF1ParameterSpec(mgfHash), i14, 1);
                    NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                    NativeCrypto.asn1_read_free(jAsn1_read_init);
                } catch (Throwable th8) {
                    th3 = th8;
                    jAsn1_read_tagged = jAsn1_read_sequence;
                    NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                    NativeCrypto.asn1_read_free(jAsn1_read_init);
                    throw th3;
                }
            } catch (Throwable th9) {
                th3 = th9;
            }
        } catch (Throwable th10) {
            th3 = th10;
            jAsn1_read_init = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "Conscrypt PSS AlgorithmParameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        if (str != null && !str.equals("ASN.1") && !str.equals("X.509")) {
            h.C("Unsupported format: ".concat(str));
            return null;
        }
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (algorithmParameterSpec instanceof PSSParameterSpec) {
            this.spec = (PSSParameterSpec) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("Only PSSParameterSpec is supported");
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws Throwable {
        if (str != null && !str.equals("ASN.1") && !str.equals("X.509")) {
            h.C("Unsupported format: ".concat(str));
        } else {
            engineInit(bArr);
        }
    }
}
