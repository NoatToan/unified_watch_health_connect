package defpackage;

import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.Verification;

/* JADX INFO: loaded from: classes21.dex */
public class px {
    private final rl d = new rl();

    public static DecodedJWT d(String str) throws rf {
        return new pv(str);
    }

    public static Verification a(Algorithm algorithm) {
        return pt.b(algorithm);
    }
}
