package we2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lwe2/e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum e {
    ACCOUNT_VERIFICATION,
    AUTHENTICATION,
    CHANGE_PASSWORD,
    CONSENT,
    CREATE_ACCOUNT,
    MFA_SETUP,
    MFA_VALIDATION,
    PHONE_VERIFICATION,
    PROMOTE_CUSTOMER
}
