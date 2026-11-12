package defpackage;

import com.nimbusds.jose.util.Base64;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ppr {
    public static List<X509Certificate> a(List<Base64> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                X509Certificate x509CertificateB = qpr.b(list.get(i).decode());
                if (x509CertificateB == null) {
                    throw new ParseException("Invalid X.509 certificate at position " + i, 0);
                }
                linkedList.add(x509CertificateB);
            }
        }
        return linkedList;
    }

    public static List<Base64> b(List<Object> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj == null) {
                throw new ParseException("The X.509 certificate at position " + i + " must not be null", 0);
            }
            if (!(obj instanceof String)) {
                throw new ParseException("The X.509 certificate at position " + i + " must be encoded as a Base64 string", 0);
            }
            linkedList.add(new Base64((String) obj));
        }
        return linkedList;
    }
}
