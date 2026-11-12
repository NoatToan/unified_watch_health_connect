package defpackage;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.util.Base64URL;

/* JADX INFO: loaded from: classes6.dex */
public interface nqd extends kqd {
    boolean b(JWSHeader jWSHeader, byte[] bArr, Base64URL base64URL) throws JOSEException;
}
