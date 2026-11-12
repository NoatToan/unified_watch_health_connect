package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes3.dex */
public class Soundex implements StringEncoder {
    public static final char SILENT_MARKER = '-';

    @Deprecated
    private int maxLength;
    private final char[] soundexMapping;
    private final boolean specialCaseHW;
    public static final String US_ENGLISH_MAPPING_STRING = "01230120022455012623010202";
    private static final char[] US_ENGLISH_MAPPING = US_ENGLISH_MAPPING_STRING.toCharArray();
    public static final Soundex US_ENGLISH = new Soundex();
    public static final Soundex US_ENGLISH_SIMPLIFIED = new Soundex(US_ENGLISH_MAPPING_STRING, false);
    public static final Soundex US_ENGLISH_GENEALOGY = new Soundex("-123-12--22455-12623-1-2-2");

    public Soundex(char[] cArr) {
        this.maxLength = 4;
        char[] cArr2 = (char[]) cArr.clone();
        this.soundexMapping = cArr2;
        this.specialCaseHW = !hasMarker(cArr2);
    }

    private boolean hasMarker(char[] cArr) {
        for (char c14 : cArr) {
            if (c14 == '-') {
                return true;
            }
        }
        return false;
    }

    private char map(char c14) {
        int i14 = c14 - 'A';
        if (i14 >= 0) {
            char[] cArr = this.soundexMapping;
            if (i14 < cArr.length) {
                return cArr[i14];
            }
        }
        throw new IllegalArgumentException("The character is not mapped: " + c14 + " (index=" + i14 + ")");
    }

    public int difference(String str, String str2) {
        return SoundexUtils.difference(this, str, str2);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return soundex((String) obj);
        }
        throw new EncoderException("Parameter supplied to Soundex encode is not of type java.lang.String");
    }

    @Deprecated
    public int getMaxLength() {
        return this.maxLength;
    }

    @Deprecated
    public void setMaxLength(int i14) {
        this.maxLength = i14;
    }

    public String soundex(String str) {
        char map;
        if (str == null) {
            return null;
        }
        String strClean = SoundexUtils.clean(str);
        if (strClean.isEmpty()) {
            return strClean;
        }
        char[] cArr = {'0', '0', '0', '0'};
        char cCharAt = strClean.charAt(0);
        cArr[0] = cCharAt;
        char map2 = map(cCharAt);
        int i14 = 1;
        for (int i15 = 1; i15 < strClean.length() && i14 < 4; i15++) {
            char cCharAt2 = strClean.charAt(i15);
            if ((!this.specialCaseHW || (cCharAt2 != 'H' && cCharAt2 != 'W')) && (map = map(cCharAt2)) != '-') {
                if (map != '0' && map != map2) {
                    cArr[i14] = map;
                    i14++;
                }
                map2 = map;
            }
        }
        return new String(cArr);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return soundex(str);
    }

    public Soundex() {
        this.maxLength = 4;
        this.soundexMapping = US_ENGLISH_MAPPING;
        this.specialCaseHW = true;
    }

    public Soundex(String str) {
        this.maxLength = 4;
        char[] charArray = str.toCharArray();
        this.soundexMapping = charArray;
        this.specialCaseHW = !hasMarker(charArray);
    }

    public Soundex(String str, boolean z14) {
        this.maxLength = 4;
        this.soundexMapping = str.toCharArray();
        this.specialCaseHW = z14;
    }
}
