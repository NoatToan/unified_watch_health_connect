package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes3.dex */
public class RefinedSoundex implements StringEncoder {
    private final char[] soundexMapping;
    public static final String US_ENGLISH_MAPPING_STRING = "01360240043788015936020505";
    private static final char[] US_ENGLISH_MAPPING = US_ENGLISH_MAPPING_STRING.toCharArray();
    public static final RefinedSoundex US_ENGLISH = new RefinedSoundex();

    public RefinedSoundex(char[] cArr) {
        this.soundexMapping = (char[]) cArr.clone();
    }

    public int difference(String str, String str2) {
        return SoundexUtils.difference(this, str, str2);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return soundex((String) obj);
        }
        throw new EncoderException("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
    }

    public char getMappingCode(char c14) {
        int upperCase;
        if (Character.isLetter(c14) && (upperCase = Character.toUpperCase(c14) - 'A') >= 0) {
            char[] cArr = this.soundexMapping;
            if (upperCase < cArr.length) {
                return cArr[upperCase];
            }
        }
        return (char) 0;
    }

    public String soundex(String str) {
        if (str == null) {
            return null;
        }
        String strClean = SoundexUtils.clean(str);
        if (strClean.isEmpty()) {
            return strClean;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strClean.charAt(0));
        char c14 = '*';
        for (int i14 = 0; i14 < strClean.length(); i14++) {
            char mappingCode = getMappingCode(strClean.charAt(i14));
            if (mappingCode != c14) {
                if (mappingCode != 0) {
                    sb3.append(mappingCode);
                }
                c14 = mappingCode;
            }
        }
        return sb3.toString();
    }

    public RefinedSoundex() {
        this.soundexMapping = US_ENGLISH_MAPPING;
    }

    public RefinedSoundex(String str) {
        this.soundexMapping = str.toCharArray();
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return soundex(str);
    }
}
