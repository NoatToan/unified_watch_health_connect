package org.apache.commons.text.lookup;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
final class UrlStringLookup extends AbstractStringLookup {
    static final UrlStringLookup INSTANCE = new UrlStringLookup();

    private UrlStringLookup() {
    }

    @Override // org.apache.commons.text.lookup.StringLookup
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(AbstractStringLookup.SPLIT_STR);
        if (strArrSplit.length < 2) {
            throw IllegalArgumentExceptions.format("Bad URL key format [%s]; expected format is DocumentPath:Key.", str);
        }
        String str2 = strArrSplit[0];
        String strSubstringAfter = StringUtils.substringAfter(str, 58);
        try {
            URL url = new URL(strSubstringAfter);
            StringWriter stringWriter = new StringWriter(8192);
            char[] cArr = new char[8192];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream, str2);
                while (true) {
                    try {
                        int i14 = inputStreamReader.read(cArr);
                        if (-1 == i14) {
                            inputStreamReader.close();
                            bufferedInputStream.close();
                            return stringWriter.toString();
                        }
                        stringWriter.write(cArr, 0, i14);
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            try {
                                inputStreamReader.close();
                            } catch (Throwable th5) {
                                th3.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    }
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th7) {
                            th.addSuppressed(th7);
                        }
                        throw th6;
                    }
                }
            } catch (Throwable th8) {
                throw th8;
            }
        } catch (Exception e4) {
            throw IllegalArgumentExceptions.format(e4, "Error looking up URL [%s] with Charset [%s].", strSubstringAfter, str2);
        }
    }
}
