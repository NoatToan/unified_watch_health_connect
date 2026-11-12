package defpackage;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.util.Base64URL;

/* JADX INFO: loaded from: classes6.dex */
public interface lqd extends kqd {
    Base64URL a(JWSHeader jWSHeader, byte[] bArr) throws JOSEException;
}
