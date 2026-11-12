package defpackage;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.jwk.KeyOperation;
import com.nimbusds.jose.jwk.KeyType;
import com.nimbusds.jose.jwk.KeyUse;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class jqd {
    public static Algorithm a(Map<String, Object> map) throws ParseException {
        return Algorithm.parse(npd.h(map, "alg"));
    }

    public static String b(Map<String, Object> map) throws ParseException {
        return npd.h(map, "kid");
    }

    public static Set<KeyOperation> c(Map<String, Object> map) throws ParseException {
        return KeyOperation.parse(npd.j(map, "key_ops"));
    }

    public static KeyType d(Map<String, Object> map) throws ParseException {
        try {
            return KeyType.parse(npd.h(map, "kty"));
        } catch (IllegalArgumentException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    public static KeyUse e(Map<String, Object> map) throws ParseException {
        return KeyUse.parse(npd.h(map, "use"));
    }

    public static List<Base64> f(Map<String, Object> map) throws ParseException {
        List<Base64> listB = ppr.b(npd.e(map, "x5c"));
        if (listB == null || !listB.isEmpty()) {
            return listB;
        }
        return null;
    }

    public static Base64URL g(Map<String, Object> map) throws ParseException {
        return npd.a(map, "x5t#S256");
    }

    public static Base64URL h(Map<String, Object> map) throws ParseException {
        return npd.a(map, "x5t");
    }

    public static URI i(Map<String, Object> map) throws ParseException {
        return npd.k(map, "x5u");
    }
}
