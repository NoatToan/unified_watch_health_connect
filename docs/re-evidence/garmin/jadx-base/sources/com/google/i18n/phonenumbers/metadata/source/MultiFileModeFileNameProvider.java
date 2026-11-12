package com.google.i18n.phonenumbers.metadata.source;

import fb1.c;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiFileModeFileNameProvider implements PhoneMetadataFileNameProvider {
    private final String phoneMetadataFileNamePrefix;

    public MultiFileModeFileNameProvider(String str) {
        this.phoneMetadataFileNamePrefix = k.g(str, "_");
    }

    private boolean isAlphanumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (!Character.isLetterOrDigit(iCodePointAt)) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return true;
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider
    public String getFor(Object obj) {
        String string = obj.toString();
        if (!isAlphanumeric(string)) {
            h.s(c.n("Invalid key: ", string));
            return null;
        }
        return this.phoneMetadataFileNamePrefix + obj;
    }
}
