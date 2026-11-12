package org.conscrypt;

import androidx.core.view.j;
import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class OAEPParameters extends AlgorithmParametersSpi {
    private static final String MGF1_OID = "1.2.840.113549.1.1.8";
    private static final Map<String, String> NAME_TO_OID;
    private static final Map<String, String> OID_TO_NAME;
    private static final String PSPECIFIED_OID = "1.2.840.113549.1.1.9";
    private OAEPParameterSpec spec = OAEPParameterSpec.DEFAULT;

    static {
        HashMap map = new HashMap();
        OID_TO_NAME = map;
        NAME_TO_OID = new HashMap();
        map.put("1.3.14.3.2.26", MessageDigestAlgorithms.SHA_1);
        map.put("2.16.840.1.101.3.4.2.4", MessageDigestAlgorithms.SHA_224);
        map.put("2.16.840.1.101.3.4.2.1", MessageDigestAlgorithms.SHA_256);
        map.put("2.16.840.1.101.3.4.2.2", MessageDigestAlgorithms.SHA_384);
        map.put("2.16.840.1.101.3.4.2.3", MessageDigestAlgorithms.SHA_512);
        for (Map.Entry entry : map.entrySet()) {
            NAME_TO_OID.put((String) entry.getValue(), (String) entry.getKey());
        }
    }

    private static String getHashName(long j8) throws Throwable {
        long jAsn1_read_sequence;
        try {
            jAsn1_read_sequence = NativeCrypto.asn1_read_sequence(j8);
            try {
                String strAsn1_read_oid = NativeCrypto.asn1_read_oid(jAsn1_read_sequence);
                if (!NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence)) {
                    NativeCrypto.asn1_read_null(jAsn1_read_sequence);
                }
                if (NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence)) {
                    Map<String, String> map = OID_TO_NAME;
                    if (map.containsKey(strAsn1_read_oid)) {
                        String str = map.get(strAsn1_read_oid);
                        NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                        return str;
                    }
                }
                throw new IOException("Error reading ASN.1 encoding");
            } catch (Throwable th3) {
                th = th3;
                NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            jAsn1_read_sequence = 0;
        }
    }

    public static String readHash(long j8) throws Throwable {
        long jAsn1_read_tagged;
        if (!NativeCrypto.asn1_read_next_tag_is(j8, 0)) {
            return MessageDigestAlgorithms.SHA_1;
        }
        try {
            jAsn1_read_tagged = NativeCrypto.asn1_read_tagged(j8);
            try {
                String hashName = getHashName(jAsn1_read_tagged);
                NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                return hashName;
            } catch (Throwable th3) {
                th = th3;
                NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            jAsn1_read_tagged = 0;
        }
    }

    public static String readMgfHash(long j8) throws Throwable {
        long jAsn1_read_tagged;
        if (!NativeCrypto.asn1_read_next_tag_is(j8, 1)) {
            return MessageDigestAlgorithms.SHA_1;
        }
        try {
            jAsn1_read_tagged = NativeCrypto.asn1_read_tagged(j8);
            try {
                long jAsn1_read_sequence = NativeCrypto.asn1_read_sequence(jAsn1_read_tagged);
                if (!NativeCrypto.asn1_read_oid(jAsn1_read_sequence).equals(MGF1_OID)) {
                    throw new IOException("Error reading ASN.1 encoding");
                }
                String hashName = getHashName(jAsn1_read_sequence);
                if (!NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence)) {
                    throw new IOException("Error reading ASN.1 encoding");
                }
                NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                return hashName;
            } catch (Throwable th3) {
                th = th3;
                NativeCrypto.asn1_read_free(0L);
                NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            jAsn1_read_tagged = 0;
        }
    }

    private static long writeAlgorithmIdentifier(long j8, String str) throws IOException {
        long jAsn1_write_sequence;
        try {
            jAsn1_write_sequence = NativeCrypto.asn1_write_sequence(j8);
            try {
                NativeCrypto.asn1_write_oid(jAsn1_write_sequence, str);
                return jAsn1_write_sequence;
            } catch (IOException e4) {
                e = e4;
                NativeCrypto.asn1_write_free(jAsn1_write_sequence);
                throw e;
            }
        } catch (IOException e14) {
            e = e14;
            jAsn1_write_sequence = 0;
        }
    }

    public static void writeHashAndMgfHash(long j8, String str, MGF1ParameterSpec mGF1ParameterSpec) throws Throwable {
        long jAsn1_write_tag;
        long jWriteAlgorithmIdentifier;
        long jAsn1_write_tag2;
        long jWriteAlgorithmIdentifier2 = 0;
        if (!str.equals(MessageDigestAlgorithms.SHA_1)) {
            try {
                jAsn1_write_tag2 = NativeCrypto.asn1_write_tag(j8, 0);
                try {
                    long jWriteAlgorithmIdentifier3 = writeAlgorithmIdentifier(jAsn1_write_tag2, NAME_TO_OID.get(str));
                    try {
                        NativeCrypto.asn1_write_null(jWriteAlgorithmIdentifier3);
                        NativeCrypto.asn1_write_flush(j8);
                        NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier3);
                        NativeCrypto.asn1_write_free(jAsn1_write_tag2);
                    } catch (Throwable th3) {
                        th = th3;
                        jWriteAlgorithmIdentifier2 = jWriteAlgorithmIdentifier3;
                        NativeCrypto.asn1_write_flush(j8);
                        NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier2);
                        NativeCrypto.asn1_write_free(jAsn1_write_tag2);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                jAsn1_write_tag2 = 0;
            }
        }
        if (mGF1ParameterSpec.getDigestAlgorithm().equals(MessageDigestAlgorithms.SHA_1)) {
            return;
        }
        try {
            jAsn1_write_tag = NativeCrypto.asn1_write_tag(j8, 1);
            try {
                jWriteAlgorithmIdentifier = writeAlgorithmIdentifier(jAsn1_write_tag, MGF1_OID);
                try {
                    jWriteAlgorithmIdentifier2 = writeAlgorithmIdentifier(jWriteAlgorithmIdentifier, NAME_TO_OID.get(mGF1ParameterSpec.getDigestAlgorithm()));
                    NativeCrypto.asn1_write_null(jWriteAlgorithmIdentifier2);
                    NativeCrypto.asn1_write_flush(j8);
                    NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier2);
                    NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier);
                    NativeCrypto.asn1_write_free(jAsn1_write_tag);
                } catch (Throwable th6) {
                    th = th6;
                    NativeCrypto.asn1_write_flush(j8);
                    NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier2);
                    NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier);
                    NativeCrypto.asn1_write_free(jAsn1_write_tag);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                jWriteAlgorithmIdentifier = 0;
            }
        } catch (Throwable th8) {
            th = th8;
            jAsn1_write_tag = 0;
            jWriteAlgorithmIdentifier = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded() throws Throwable {
        long j8;
        Throwable th3;
        long jAsn1_write_init;
        IOException e4;
        long jAsn1_write_tag;
        long jWriteAlgorithmIdentifier = 0;
        try {
            try {
                jAsn1_write_init = NativeCrypto.asn1_write_init();
                try {
                    long jAsn1_write_sequence = NativeCrypto.asn1_write_sequence(jAsn1_write_init);
                    try {
                        writeHashAndMgfHash(jAsn1_write_sequence, this.spec.getDigestAlgorithm(), (MGF1ParameterSpec) this.spec.getMGFParameters());
                        PSource.PSpecified pSpecified = (PSource.PSpecified) this.spec.getPSource();
                        if (pSpecified.getValue().length != 0) {
                            try {
                                jAsn1_write_tag = NativeCrypto.asn1_write_tag(jAsn1_write_sequence, 2);
                                try {
                                    jWriteAlgorithmIdentifier = writeAlgorithmIdentifier(jAsn1_write_tag, PSPECIFIED_OID);
                                    NativeCrypto.asn1_write_octetstring(jWriteAlgorithmIdentifier, pSpecified.getValue());
                                    NativeCrypto.asn1_write_flush(jAsn1_write_sequence);
                                    NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier);
                                    NativeCrypto.asn1_write_free(jAsn1_write_tag);
                                } catch (Throwable th4) {
                                    th = th4;
                                    NativeCrypto.asn1_write_flush(jAsn1_write_sequence);
                                    NativeCrypto.asn1_write_free(jWriteAlgorithmIdentifier);
                                    NativeCrypto.asn1_write_free(jAsn1_write_tag);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                jAsn1_write_tag = 0;
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
                } catch (Throwable th6) {
                    th3 = th6;
                    j8 = 0;
                    NativeCrypto.asn1_write_free(j8);
                    NativeCrypto.asn1_write_free(jAsn1_write_init);
                    throw th3;
                }
            } catch (Throwable th7) {
                th3 = th7;
            }
        } catch (IOException e16) {
            e4 = e16;
            jAsn1_write_init = 0;
        } catch (Throwable th8) {
            j8 = 0;
            th3 = th8;
            jAsn1_write_init = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls == null || cls != OAEPParameterSpec.class) {
            throw new InvalidParameterSpecException(j.h(cls, "Unsupported class: "));
        }
        return this.spec;
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr) throws Throwable {
        long jAsn1_read_init;
        long jAsn1_read_tagged;
        long j8 = 0;
        try {
            jAsn1_read_init = NativeCrypto.asn1_read_init(bArr);
            try {
                long jAsn1_read_sequence = NativeCrypto.asn1_read_sequence(jAsn1_read_init);
                try {
                    PSource.PSpecified pSpecified = PSource.PSpecified.DEFAULT;
                    String hash = readHash(jAsn1_read_sequence);
                    String mgfHash = readMgfHash(jAsn1_read_sequence);
                    if (NativeCrypto.asn1_read_next_tag_is(jAsn1_read_sequence, 2)) {
                        try {
                            jAsn1_read_tagged = NativeCrypto.asn1_read_tagged(jAsn1_read_sequence);
                            try {
                                long jAsn1_read_sequence2 = NativeCrypto.asn1_read_sequence(jAsn1_read_tagged);
                                if (!NativeCrypto.asn1_read_oid(jAsn1_read_sequence2).equals(PSPECIFIED_OID)) {
                                    throw new IOException("Error reading ASN.1 encoding");
                                }
                                pSpecified = new PSource.PSpecified(NativeCrypto.asn1_read_octetstring(jAsn1_read_sequence2));
                                if (!NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence2)) {
                                    throw new IOException("Error reading ASN.1 encoding");
                                }
                                NativeCrypto.asn1_read_free(jAsn1_read_sequence2);
                                NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                            } catch (Throwable th3) {
                                th = th3;
                                NativeCrypto.asn1_read_free(0L);
                                NativeCrypto.asn1_read_free(jAsn1_read_tagged);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            jAsn1_read_tagged = 0;
                        }
                    }
                    if (!NativeCrypto.asn1_read_is_empty(jAsn1_read_sequence) || !NativeCrypto.asn1_read_is_empty(jAsn1_read_init)) {
                        throw new IOException("Error reading ASN.1 encoding");
                    }
                    this.spec = new OAEPParameterSpec(hash, "MGF1", new MGF1ParameterSpec(mgfHash), pSpecified);
                    NativeCrypto.asn1_read_free(jAsn1_read_sequence);
                    NativeCrypto.asn1_read_free(jAsn1_read_init);
                } catch (Throwable th5) {
                    th = th5;
                    j8 = jAsn1_read_sequence;
                    NativeCrypto.asn1_read_free(j8);
                    NativeCrypto.asn1_read_free(jAsn1_read_init);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            jAsn1_read_init = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "Conscrypt OAEP AlgorithmParameters";
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
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
            this.spec = (OAEPParameterSpec) algorithmParameterSpec;
            return;
        }
        throw new InvalidParameterSpecException("Only OAEPParameterSpec is supported");
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
