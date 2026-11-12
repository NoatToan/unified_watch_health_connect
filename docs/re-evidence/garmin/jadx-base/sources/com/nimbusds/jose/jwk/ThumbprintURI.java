package com.nimbusds.jose.jwk;

import com.mapbox.maps.p;
import com.nimbusds.jose.shaded.jcip.Immutable;
import com.nimbusds.jose.util.Base64URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public class ThumbprintURI {
    public static final String PREFIX = "urn:ietf:params:oauth:jwk-thumbprint:";
    private final String hashAlg;
    private final Base64URL thumbprint;

    public ThumbprintURI(String str, Base64URL base64URL) {
        if (str.isEmpty()) {
            h.s("The hash algorithm must not be empty");
            throw null;
        }
        this.hashAlg = str;
        if (base64URL.toString().isEmpty()) {
            h.s("The thumbprint must not be empty");
            throw null;
        }
        this.thumbprint = base64URL;
    }

    public static ThumbprintURI compute(JWK jwk) {
        return new ThumbprintURI("sha-256", jwk.computeThumbprint());
    }

    public static ThumbprintURI parse(URI uri) throws ParseException {
        String string = uri.toString();
        if (!string.startsWith(PREFIX)) {
            p.i(0, "Illegal JWK thumbprint prefix");
            return null;
        }
        String strSubstring = string.substring(37);
        if (strSubstring.isEmpty()) {
            p.i(0, "Illegal JWK thumbprint: Missing value");
            return null;
        }
        String[] strArrSplit = strSubstring.split(":");
        if (strArrSplit.length != 2) {
            p.i(0, "Illegal JWK thumbprint: Unexpected number of components");
            return null;
        }
        if (!strArrSplit[0].isEmpty()) {
            return new ThumbprintURI(strArrSplit[0], new Base64URL(strArrSplit[1]));
        }
        p.i(0, "Illegal JWK thumbprint: The hash algorithm must not be empty");
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbprintURI)) {
            return false;
        }
        ThumbprintURI thumbprintURI = (ThumbprintURI) obj;
        return this.hashAlg.equals(thumbprintURI.hashAlg) && getThumbprint().equals(thumbprintURI.getThumbprint());
    }

    public String getAlgorithmString() {
        return this.hashAlg;
    }

    public Base64URL getThumbprint() {
        return this.thumbprint;
    }

    public int hashCode() {
        return Objects.hash(this.hashAlg, getThumbprint());
    }

    public String toString() {
        return PREFIX + this.hashAlg + ":" + this.thumbprint;
    }

    public URI toURI() {
        return URI.create(toString());
    }

    public static ThumbprintURI parse(String str) throws ParseException {
        try {
            return parse(new URI(str));
        } catch (URISyntaxException e4) {
            p.i(0, e4.getMessage());
            return null;
        }
    }
}
