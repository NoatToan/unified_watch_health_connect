package u63;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.signature.OAuthMessageSigner;

/* JADX INFO: loaded from: classes3.dex */
public class b extends OAuthMessageSigner {
    @Override // oauth.signpost.signature.OAuthMessageSigner
    public final String getSignatureMethod() {
        return "HMAC-SHA1";
    }

    @Override // oauth.signpost.signature.OAuthMessageSigner
    public final String sign(t63.b bVar, t63.a aVar) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec((r63.b.d(getConsumerSecret()) + '&' + r63.b.d(getTokenSecret())).getBytes("UTF-8"), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            String strA = new c(bVar, aVar).a();
            r63.b.a("SBS", strA);
            return base64Encode(mac.doFinal(strA.getBytes("UTF-8"))).trim();
        } catch (UnsupportedEncodingException e4) {
            throw new OAuthMessageSignerException(e4);
        } catch (GeneralSecurityException e14) {
            throw new OAuthMessageSignerException(e14);
        }
    }
}
