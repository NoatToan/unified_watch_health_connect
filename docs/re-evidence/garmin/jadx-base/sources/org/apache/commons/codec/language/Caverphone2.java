package org.apache.commons.codec.language;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class Caverphone2 extends AbstractCaverphone {
    private static final String TEN_1 = "1111111111";

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        if (SoundexUtils.isEmpty(str)) {
            return TEN_1;
        }
        return (str.toLowerCase(Locale.ENGLISH).replaceAll("[^a-z]", "").replaceAll("e$", "").replaceAll("^cough", "cou2f").replaceAll("^rough", "rou2f").replaceAll("^tough", "tou2f").replaceAll("^enough", "enou2f").replaceAll("^trough", "trou2f").replaceAll("^gn", "2n").replaceAll("mb$", "m2").replace("cq", "2q").replace("ci", "si").replace("ce", "se").replace("cy", "sy").replace("tch", "2ch").replace("c", JWKParameterNames.OCT_KEY_VALUE).replace(JWKParameterNames.RSA_SECOND_PRIME_FACTOR, JWKParameterNames.OCT_KEY_VALUE).replace("x", JWKParameterNames.OCT_KEY_VALUE).replace("v", "f").replace("dg", "2g").replace("tio", "sio").replace("tia", "sia").replace("d", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT).replace("ph", "fh").replace("b", "p").replace("sh", "s2").replace("z", "s").replaceAll("^[aeiou]", "A").replaceAll("[aeiou]", "3").replace("j", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE).replaceAll("^y3", "Y3").replaceAll("^y", "A").replace(JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "3").replace("3gh3", "3kh3").replace("gh", "22").replace("g", JWKParameterNames.OCT_KEY_VALUE).replaceAll("s+", "S").replaceAll("t+", "T").replaceAll("p+", "P").replaceAll("k+", "K").replaceAll("f+", "F").replaceAll("m+", "M").replaceAll("n+", "N").replace("w3", "W3").replace("wh3", "Wh3").replaceAll("w$", "3").replace("w", "2").replaceAll("^h", "A").replace("h", "2").replace("r3", "R3").replaceAll("r$", "3").replace(JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "2").replace("l3", "L3").replaceAll("l$", "3").replace("l", "2").replace("2", "").replaceAll("3$", "A").replace("3", "") + TEN_1).substring(0, 10);
    }
}
