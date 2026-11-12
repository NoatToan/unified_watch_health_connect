package org.apache.commons.codec.language;

import java.util.regex.Pattern;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* JADX INFO: loaded from: classes3.dex */
public class Nysiis implements StringEncoder {
    private static final char SPACE = ' ';
    private static final int TRUE_LENGTH = 6;
    private final boolean strict;
    private static final char[] CHARS_A = {'A'};
    private static final char[] CHARS_AF = {'A', 'F'};
    private static final char[] CHARS_C = {'C'};
    private static final char[] CHARS_FF = {'F', 'F'};
    private static final char[] CHARS_G = {'G'};
    private static final char[] CHARS_N = {'N'};
    private static final char[] CHARS_NN = {'N', 'N'};
    private static final char[] CHARS_S = {'S'};
    private static final char[] CHARS_SSS = {'S', 'S', 'S'};
    private static final Pattern PAT_MAC = Pattern.compile("^MAC");
    private static final Pattern PAT_KN = Pattern.compile("^KN");
    private static final Pattern PAT_K = Pattern.compile("^K");
    private static final Pattern PAT_PH_PF = Pattern.compile("^(PH|PF)");
    private static final Pattern PAT_SCH = Pattern.compile("^SCH");
    private static final Pattern PAT_EE_IE = Pattern.compile("(EE|IE)$");
    private static final Pattern PAT_DT_ETC = Pattern.compile("(DT|RT|RD|NT|ND)$");

    public Nysiis(boolean z14) {
        this.strict = z14;
    }

    private static boolean isVowel(char c14) {
        return c14 == 'A' || c14 == 'E' || c14 == 'I' || c14 == 'O' || c14 == 'U';
    }

    private static char[] transcodeRemaining(char c14, char c15, char c16, char c17) {
        if (c15 == 'E' && c16 == 'V') {
            return CHARS_AF;
        }
        if (isVowel(c15)) {
            return CHARS_A;
        }
        if (c15 == 'K') {
            return c16 == 'N' ? CHARS_NN : CHARS_C;
        }
        if (c15 == 'M') {
            return CHARS_N;
        }
        if (c15 == 'Q') {
            return CHARS_G;
        }
        if (c15 == 'Z') {
            return CHARS_S;
        }
        if (c15 == 'S' && c16 == 'C' && c17 == 'H') {
            return CHARS_SSS;
        }
        if (c15 == 'P' && c16 == 'H') {
            return CHARS_FF;
        }
        if (c15 != 'H' || (isVowel(c14) && isVowel(c16))) {
            return (c15 == 'W' && isVowel(c14)) ? new char[]{c14} : new char[]{c15};
        }
        return new char[]{c14};
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return nysiis((String) obj);
        }
        throw new EncoderException("Parameter supplied to Nysiis encode is not of type java.lang.String");
    }

    public boolean isStrict() {
        return this.strict;
    }

    public String nysiis(String str) {
        if (str == null) {
            return null;
        }
        String strClean = SoundexUtils.clean(str);
        if (strClean.isEmpty()) {
            return strClean;
        }
        String strReplaceFirst = PAT_DT_ETC.matcher(PAT_EE_IE.matcher(PAT_SCH.matcher(PAT_PH_PF.matcher(PAT_K.matcher(PAT_KN.matcher(PAT_MAC.matcher(strClean).replaceFirst("MCC")).replaceFirst("NN")).replaceFirst("C")).replaceFirst("FF")).replaceFirst("SSS")).replaceFirst("Y")).replaceFirst("D");
        StringBuilder sb3 = new StringBuilder(strReplaceFirst.length());
        sb3.append(strReplaceFirst.charAt(0));
        char[] charArray = strReplaceFirst.toCharArray();
        int length = charArray.length;
        int i14 = 1;
        while (i14 < length) {
            int i15 = length - 1;
            char c14 = SPACE;
            char c15 = i14 < i15 ? charArray[i14 + 1] : ' ';
            if (i14 < length - 2) {
                c14 = charArray[i14 + 2];
            }
            int i16 = i14 - 1;
            char[] cArrTranscodeRemaining = transcodeRemaining(charArray[i16], charArray[i14], c15, c14);
            System.arraycopy(cArrTranscodeRemaining, 0, charArray, i14, cArrTranscodeRemaining.length);
            char c16 = charArray[i14];
            if (c16 != charArray[i16]) {
                sb3.append(c16);
            }
            i14++;
        }
        if (sb3.length() > 1) {
            char cCharAt = sb3.charAt(sb3.length() - 1);
            if (cCharAt == 'S') {
                sb3.deleteCharAt(sb3.length() - 1);
                cCharAt = sb3.charAt(sb3.length() - 1);
            }
            if (sb3.length() > 2 && sb3.charAt(sb3.length() - 2) == 'A' && cCharAt == 'Y') {
                sb3.deleteCharAt(sb3.length() - 2);
            }
            if (cCharAt == 'A') {
                sb3.deleteCharAt(sb3.length() - 1);
            }
        }
        String string = sb3.toString();
        return isStrict() ? string.substring(0, Math.min(6, string.length())) : string;
    }

    public Nysiis() {
        this(true);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return nysiis(str);
    }
}
