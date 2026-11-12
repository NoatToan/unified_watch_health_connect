package defpackage;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.util.Base64URL;

/* JADX INFO: loaded from: classes6.dex */
public interface fqd extends iqd {
    byte[] b(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) throws JOSEException;
}
