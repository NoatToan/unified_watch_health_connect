package okhttp3.internal.tls;

import b71.i;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.garmin.android.gncs.NotificationConstants;
import d53.u;
import d53.w;
import j20.x;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\bH\u0002J\f\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "allSubjectAltNames", "", "", "certificate", "Ljava/security/cert/X509Certificate;", "getSubjectAltNames", NotificationConstants.KEY_DATA_MIME_TYPE, "verify", "", "host", "session", "Ljavax/net/ssl/SSLSession;", "verifyHostname", "hostname", "pattern", "verifyIpAddress", "ipAddress", "asciiToLowercase", "isAscii", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        return x.f(locale, str, locale);
    }

    private final List<String> getSubjectAltNames(X509Certificate certificate, int type) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return j0.f134944a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && s.g(list.get(0), Integer.valueOf(type)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return j0.f134944a;
        }
    }

    private final boolean isAscii(String str) {
        int i14;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            h.x(k.e(length2, 0, "endIndex < beginIndex: ", " < "));
            return false;
        }
        if (length2 > str.length()) {
            h.n(str.length(), i.i(length2, "endIndex > string.length: ", " > "));
            return false;
        }
        long j8 = 0;
        int i15 = 0;
        while (i15 < length2) {
            char cCharAt = str.charAt(i15);
            if (cCharAt < 128) {
                j8++;
            } else {
                if (cCharAt < 2048) {
                    i14 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i14 = 3;
                } else {
                    int i16 = i15 + 1;
                    char cCharAt2 = i16 < length2 ? str.charAt(i16) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j8++;
                        i15 = i16;
                    } else {
                        j8 += (long) 4;
                        i15 += 2;
                    }
                }
                j8 += (long) i14;
            }
            i15++;
        }
        return length == ((int) j8);
    }

    private final boolean verifyHostname(String hostname, String pattern) {
        int length;
        if (hostname != null && hostname.length() != 0 && !u.y(hostname, ".", false) && !u.p(hostname, CallerDataConverter.DEFAULT_RANGE_DELIMITER, false) && pattern != null && pattern.length() != 0 && !u.y(pattern, ".", false) && !u.p(pattern, CallerDataConverter.DEFAULT_RANGE_DELIMITER, false)) {
            if (!u.p(hostname, ".", false)) {
                hostname = hostname.concat(".");
            }
            if (!u.p(pattern, ".", false)) {
                pattern = pattern.concat(".");
            }
            String strAsciiToLowercase = asciiToLowercase(pattern);
            if (!w.z(strAsciiToLowercase, Marker.ANY_MARKER, false)) {
                return hostname.equals(strAsciiToLowercase);
            }
            if (u.y(strAsciiToLowercase, "*.", false) && w.G('*', 1, 4, strAsciiToLowercase) == -1 && hostname.length() >= strAsciiToLowercase.length() && !"*.".equals(strAsciiToLowercase)) {
                String strSubstring = strAsciiToLowercase.substring(1);
                if (u.p(hostname, strSubstring, false) && ((length = hostname.length() - strSubstring.length()) <= 0 || w.K('.', length - 1, 4, hostname) == -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String ipAddress, X509Certificate certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(ipAddress);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 7);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (s.g(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate certificate) {
        certificate.getClass();
        return h0.C0(getSubjectAltNames(certificate, 7), getSubjectAltNames(certificate, 2));
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        host.getClass();
        session.getClass();
        if (!isAscii(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            certificate.getClass();
            return verify(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String host, X509Certificate certificate) {
        host.getClass();
        certificate.getClass();
        return Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    private final boolean verifyHostname(String hostname, X509Certificate certificate) {
        String strAsciiToLowercase = asciiToLowercase(hostname);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 2);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
