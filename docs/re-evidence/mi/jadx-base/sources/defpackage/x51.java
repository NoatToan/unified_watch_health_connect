package defpackage;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWSAlgorithm;
import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public class x51 {
    public static String a(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                if (i < array.length - 1) {
                    sb.append(", ");
                } else if (i == array.length - 1) {
                    sb.append(" or ");
                }
            }
            sb.append(array[i].toString());
        }
        return sb.toString();
    }

    public static String b(EncryptionMethod encryptionMethod, Collection<EncryptionMethod> collection) {
        return "Unsupported JWE encryption method " + encryptionMethod + ", must be " + a(collection);
    }

    public static String c(JWEAlgorithm jWEAlgorithm, Collection<JWEAlgorithm> collection) {
        return "Unsupported JWE algorithm " + jWEAlgorithm + ", must be " + a(collection);
    }

    public static String d(JWSAlgorithm jWSAlgorithm, Collection<JWSAlgorithm> collection) {
        return "Unsupported JWS algorithm " + jWSAlgorithm + ", must be " + a(collection);
    }
}
