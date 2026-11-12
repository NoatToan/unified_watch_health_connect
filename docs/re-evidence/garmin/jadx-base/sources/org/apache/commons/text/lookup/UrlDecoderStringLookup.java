package org.apache.commons.text.lookup;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
final class UrlDecoderStringLookup extends AbstractStringLookup {
    static final UrlDecoderStringLookup INSTANCE = new UrlDecoderStringLookup();

    public String decode(String str, String str2) {
        return URLDecoder.decode(str, str2);
    }

    @Override // org.apache.commons.text.lookup.StringLookup
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        String strName = StandardCharsets.UTF_8.name();
        try {
            return decode(str, strName);
        } catch (UnsupportedEncodingException e4) {
            throw IllegalArgumentExceptions.format(e4, "%s: source=%s, encoding=%s", e4, str, strName);
        }
    }
}
