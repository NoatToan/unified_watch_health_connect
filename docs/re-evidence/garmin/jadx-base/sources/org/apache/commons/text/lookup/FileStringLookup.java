package org.apache.commons.text.lookup;

import ch.qos.logback.core.CoreConstants;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
final class FileStringLookup extends AbstractStringLookup {
    static final AbstractStringLookup INSTANCE = new FileStringLookup();

    private FileStringLookup() {
    }

    @Override // org.apache.commons.text.lookup.StringLookup
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(String.valueOf(CoreConstants.COLON_CHAR));
        if (strArrSplit.length < 2) {
            throw IllegalArgumentExceptions.format("Bad file key format [%s], expected format is CharsetName:DocumentPath.", str);
        }
        String str2 = strArrSplit[0];
        String strSubstringAfter = StringUtils.substringAfter(str, 58);
        try {
            return new String(Files.readAllBytes(Paths.get(strSubstringAfter, new String[0])), str2);
        } catch (Exception e4) {
            throw IllegalArgumentExceptions.format(e4, "Error looking up file [%s] with charset [%s].", strSubstringAfter, str2);
        }
    }
}
