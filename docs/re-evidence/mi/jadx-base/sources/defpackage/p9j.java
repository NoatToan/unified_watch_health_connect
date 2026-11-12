package defpackage;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: loaded from: classes6.dex */
public class p9j {
    /* JADX WARN: Code duplicated, block: B:43:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Signature a(JWSAlgorithm jWSAlgorithm, Provider provider) throws JOSEException {
        PSSParameterSpec pSSParameterSpec;
        String str;
        PSSParameterSpec pSSParameterSpec2;
        String str2;
        Signature signatureB;
        String str3 = null;
        try {
            if (jWSAlgorithm.equals(JWSAlgorithm.RS256)) {
                str2 = "SHA256withRSA";
            } else {
                if (!jWSAlgorithm.equals(JWSAlgorithm.RS384)) {
                    if (jWSAlgorithm.equals(JWSAlgorithm.RS512)) {
                        str2 = "SHA512withRSA";
                    } else {
                        if (jWSAlgorithm.equals(JWSAlgorithm.PS256)) {
                            pSSParameterSpec = new PSSParameterSpec(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM, "MGF1", MGF1ParameterSpec.SHA256, 32, 1);
                            str = "SHA256withRSAandMGF1";
                        } else if (jWSAlgorithm.equals(JWSAlgorithm.PS384)) {
                            pSSParameterSpec = new PSSParameterSpec("SHA-384", "MGF1", MGF1ParameterSpec.SHA384, 48, 1);
                            str = "SHA384withRSAandMGF1";
                        } else {
                            if (!jWSAlgorithm.equals(JWSAlgorithm.PS512)) {
                                throw new JOSEException(x51.d(jWSAlgorithm, q9j.c));
                            }
                            pSSParameterSpec = new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1);
                            str = "SHA512withRSAandMGF1";
                        }
                        String str4 = str;
                        pSSParameterSpec2 = pSSParameterSpec;
                        str2 = "RSASSA-PSS";
                        str3 = str4;
                    }
                    signatureB = b(str2, provider);
                    if (pSSParameterSpec2 != null) {
                        try {
                            signatureB.setParameter(pSSParameterSpec2);
                        } catch (InvalidAlgorithmParameterException e) {
                            throw new JOSEException("Invalid RSASSA-PSS salt length parameter: " + e.getMessage(), e);
                        }
                    }
                    return signatureB;
                }
                str2 = "SHA384withRSA";
            }
            signatureB = b(str2, provider);
        } catch (NoSuchAlgorithmException e2) {
            if (str3 == null) {
                throw new JOSEException("Unsupported RSASSA algorithm: " + e2.getMessage(), e2);
            }
            try {
                signatureB = b(str3, provider);
            } catch (NoSuchAlgorithmException e3) {
                throw new JOSEException("Unsupported RSASSA algorithm (after retry with alternative): " + e3.getMessage(), e3);
            }
        }
        pSSParameterSpec2 = null;
        if (pSSParameterSpec2 != null) {
            signatureB.setParameter(pSSParameterSpec2);
        }
        return signatureB;
    }

    public static Signature b(String str, Provider provider) throws NoSuchAlgorithmException {
        return provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
    }
}
