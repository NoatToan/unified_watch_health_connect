package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public class DoubleMetaphone implements StringEncoder {
    private static final String VOWELS = "AEIOUY";
    private int maxCodeLen = 4;
    private static final String[] SILENT_START = {"GN", "KN", "PN", "WR", "PS"};
    private static final String[] L_R_N_M_B_H_F_V_W_SPACE = {"L", "R", "N", "M", "B", "H", "F", "V", "W", StringUtils.SPACE};
    private static final String[] ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER = {"ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER"};
    private static final String[] L_T_K_S_N_M_B_Z = {"L", "T", "K", "S", "N", "M", "B", "Z"};

    private String cleanInput(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return null;
        }
        return strTrim.toUpperCase(Locale.ENGLISH);
    }

    private boolean conditionC0(String str, int i14) {
        if (contains(str, i14, 4, "CHIA")) {
            return true;
        }
        if (i14 <= 1) {
            return false;
        }
        int i15 = i14 - 2;
        if (isVowel(charAt(str, i15)) || !contains(str, i14 - 1, 3, "ACH")) {
            return false;
        }
        char cCharAt = charAt(str, i14 + 2);
        return !(cCharAt == 'I' || cCharAt == 'E') || contains(str, i15, 6, "BACHER", "MACHER");
    }

    private boolean conditionCH0(String str, int i14) {
        if (i14 != 0) {
            return false;
        }
        int i15 = i14 + 1;
        if (contains(str, i15, 5, "HARAC", "HARIS") || contains(str, i15, 3, "HOR", "HYM", "HIA", "HEM")) {
            return !contains(str, 0, 5, "CHORE");
        }
        return false;
    }

    private boolean conditionCH1(String str, int i14) {
        if (!contains(str, 0, 4, "VAN ", "VON ") && !contains(str, 0, 3, "SCH") && !contains(str, i14 - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) {
            int i15 = i14 + 2;
            if (!contains(str, i15, 1, "T", "S") && ((!contains(str, i14 - 1, 1, "A", "O", "U", "E") && i14 != 0) || (!contains(str, i15, 1, L_R_N_M_B_H_F_V_W_SPACE) && i14 + 1 != str.length() - 1))) {
                return false;
            }
        }
        return true;
    }

    private boolean conditionL0(String str, int i14) {
        if (i14 == str.length() - 3 && contains(str, i14 - 1, 4, "ILLO", "ILLA", "ALLE")) {
            return true;
        }
        return (contains(str, str.length() - 2, 2, "AS", "OS") || contains(str, str.length() - 1, 1, "A", "O")) && contains(str, i14 - 1, 4, "ALLE");
    }

    private boolean conditionM0(String str, int i14) {
        int i15 = i14 + 1;
        if (charAt(str, i15) == 'M') {
            return true;
        }
        if (contains(str, i14 - 1, 3, "UMB")) {
            return i15 == str.length() - 1 || contains(str, i14 + 2, 2, "ER");
        }
        return false;
    }

    public static boolean contains(String str, int i14, int i15, String... strArr) {
        int i16;
        if (i14 >= 0 && (i16 = i15 + i14) <= str.length()) {
            String strSubstring = str.substring(i14, i16);
            for (String str2 : strArr) {
                if (strSubstring.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private int handleAEIOUY(DoubleMetaphoneResult doubleMetaphoneResult, int i14) {
        if (i14 == 0) {
            doubleMetaphoneResult.append('A');
        }
        return i14 + 1;
    }

    private int handleC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14) {
        if (conditionC0(str, i14)) {
            doubleMetaphoneResult.append('K');
            return i14 + 2;
        }
        if (i14 == 0 && contains(str, i14, 6, "CAESAR")) {
            doubleMetaphoneResult.append('S');
            return i14 + 2;
        }
        if (contains(str, i14, 2, "CH")) {
            return handleCH(str, doubleMetaphoneResult, i14);
        }
        if (contains(str, i14, 2, "CZ") && !contains(str, i14 - 2, 4, "WICZ")) {
            doubleMetaphoneResult.append('S', 'X');
            return i14 + 2;
        }
        int i15 = i14 + 1;
        if (contains(str, i15, 3, "CIA")) {
            doubleMetaphoneResult.append('X');
            return i14 + 3;
        }
        if (contains(str, i14, 2, "CC") && (i14 != 1 || charAt(str, 0) != 'M')) {
            return handleCC(str, doubleMetaphoneResult, i14);
        }
        if (contains(str, i14, 2, "CK", "CG", "CQ")) {
            doubleMetaphoneResult.append('K');
            return i14 + 2;
        }
        if (contains(str, i14, 2, "CI", "CE", "CY")) {
            if (contains(str, i14, 3, "CIO", "CIE", "CIA")) {
                doubleMetaphoneResult.append('S', 'X');
            } else {
                doubleMetaphoneResult.append('S');
            }
            return i14 + 2;
        }
        doubleMetaphoneResult.append('K');
        if (contains(str, i15, 2, " C", " Q", " G")) {
            return i14 + 3;
        }
        return (!contains(str, i15, 1, "C", "K", "Q") || contains(str, i15, 2, "CE", "CI")) ? i15 : i14 + 2;
    }

    private int handleCC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14) {
        int i15 = i14 + 2;
        if (!contains(str, i15, 1, "I", "E", "H") || contains(str, i15, 2, "HU")) {
            doubleMetaphoneResult.append('K');
            return i15;
        }
        if ((i14 == 1 && charAt(str, i14 - 1) == 'A') || contains(str, i14 - 1, 5, "UCCEE", "UCCES")) {
            doubleMetaphoneResult.append("KS");
        } else {
            doubleMetaphoneResult.append('X');
        }
        return i14 + 3;
    }

    private int handleCH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14) {
        if (i14 > 0 && contains(str, i14, 4, "CHAE")) {
            doubleMetaphoneResult.append('K', 'X');
        } else {
            if (!conditionCH0(str, i14) && !conditionCH1(str, i14)) {
                if (i14 <= 0) {
                    doubleMetaphoneResult.append('X');
                } else if (contains(str, 0, 2, "MC")) {
                    doubleMetaphoneResult.append('K');
                } else {
                    doubleMetaphoneResult.append('X', 'K');
                }
                return i14 + 2;
            }
            doubleMetaphoneResult.append('K');
        }
        return i14 + 2;
    }

    private int handleD(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14) {
        if (!contains(str, i14, 2, "DG")) {
            if (contains(str, i14, 2, "DT", "DD")) {
                doubleMetaphoneResult.append('T');
                return i14 + 2;
            }
            doubleMetaphoneResult.append('T');
            return i14 + 1;
        }
        int i15 = i14 + 2;
        if (contains(str, i15, 1, "I", "E", "Y")) {
            doubleMetaphoneResult.append('J');
            return i14 + 3;
        }
        doubleMetaphoneResult.append("TK");
        return i15;
    }

    private int handleG(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14, boolean z14) {
        int i15 = i14 + 1;
        if (charAt(str, i15) == 'H') {
            return handleGH(str, doubleMetaphoneResult, i14);
        }
        if (charAt(str, i15) == 'N') {
            if (i14 == 1 && isVowel(charAt(str, 0)) && !z14) {
                doubleMetaphoneResult.append("KN", "N");
            } else if (contains(str, i14 + 2, 2, "EY") || charAt(str, i15) == 'Y' || z14) {
                doubleMetaphoneResult.append("KN");
            } else {
                doubleMetaphoneResult.append("N", "KN");
            }
            return i14 + 2;
        }
        if (contains(str, i15, 2, "LI") && !z14) {
            doubleMetaphoneResult.append("KL", "L");
        } else {
            if (i14 != 0 || (charAt(str, i15) != 'Y' && !contains(str, i15, 2, ES_EP_EB_EL_EY_IB_IL_IN_IE_EI_ER))) {
                if ((contains(str, i15, 2, "ER") || charAt(str, i15) == 'Y') && !contains(str, 0, 6, "DANGER", "RANGER", "MANGER")) {
                    int i16 = i14 - 1;
                    if (!contains(str, i16, 1, "E", "I") && !contains(str, i16, 3, "RGY", "OGY")) {
                        doubleMetaphoneResult.append('K', 'J');
                    }
                }
                if (!contains(str, i15, 1, "E", "I", "Y") && !contains(str, i14 - 1, 4, "AGGI", "OGGI")) {
                    if (charAt(str, i15) == 'G') {
                        i15 = i14 + 2;
                    }
                    doubleMetaphoneResult.append('K');
                    return i15;
                }
                if (contains(str, 0, 4, "VAN ", "VON ") || contains(str, 0, 3, "SCH") || contains(str, i15, 2, "ET")) {
                    doubleMetaphoneResult.append('K');
                } else if (contains(str, i15, 3, "IER")) {
                    doubleMetaphoneResult.append('J');
                } else {
                    doubleMetaphoneResult.append('J', 'K');
                }
                return i14 + 2;
            }
            doubleMetaphoneResult.append('K', 'J');
        }
        return i14 + 2;
    }

    private int handleGH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14) {
        if (i14 > 0 && !isVowel(charAt(str, i14 - 1))) {
            doubleMetaphoneResult.append('K');
            return i14 + 2;
        }
        if (i14 == 0) {
            int i15 = i14 + 2;
            if (charAt(str, i15) == 'I') {
                doubleMetaphoneResult.append('J');
            } else {
                doubleMetaphoneResult.append('K');
            }
            return i15;
        }
        if ((i14 > 1 && contains(str, i14 - 2, 1, "B", "H", "D")) || ((i14 > 2 && contains(str, i14 - 3, 1, "B", "H", "D")) || (i14 > 3 && contains(str, i14 - 4, 1, "B", "H")))) {
            return i14 + 2;
        }
        if (i14 > 2 && charAt(str, i14 - 1) == 'U' && contains(str, i14 - 3, 1, "C", "G", "L", "R", "T")) {
            doubleMetaphoneResult.append('F');
        } else if (i14 > 0 && charAt(str, i14 - 1) != 'I') {
            doubleMetaphoneResult.append('K');
        }
        return i14 + 2;
    }

    private int handleH(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14) {
        if ((i14 != 0 && !isVowel(charAt(str, i14 - 1))) || !isVowel(charAt(str, i14 + 1))) {
            return i14 + 1;
        }
        doubleMetaphoneResult.append('H');
        return i14 + 2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    private int handleJ(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14, boolean z14) {
        if (contains(str, i14, 4, "JOSE") || contains(str, 0, 4, "SAN ")) {
            if ((i14 == 0 && charAt(str, i14 + 4) == ' ') || str.length() == 4 || contains(str, 0, 4, "SAN ")) {
                doubleMetaphoneResult.append('H');
            } else {
                doubleMetaphoneResult.append('J', 'H');
            }
            return i14 + 1;
        }
        if (i14 != 0 || contains(str, i14, 4, "JOSE")) {
            int i15 = i14 - 1;
            if (isVowel(charAt(str, i15)) && !z14) {
                int i16 = i14 + 1;
                if (charAt(str, i16) == 'A' || charAt(str, i16) == 'O') {
                    doubleMetaphoneResult.append('J', 'H');
                } else if (i14 == str.length() - 1) {
                    doubleMetaphoneResult.append('J', ' ');
                } else if (!contains(str, i14 + 1, 1, L_T_K_S_N_M_B_Z)) {
                    doubleMetaphoneResult.append('J');
                }
            } else if (i14 == str.length() - 1) {
                doubleMetaphoneResult.append('J', ' ');
            } else if (!contains(str, i14 + 1, 1, L_T_K_S_N_M_B_Z) && !contains(str, i15, 1, "S", "K", "L")) {
                doubleMetaphoneResult.append('J');
            }
        } else {
            doubleMetaphoneResult.append('J', 'A');
        }
        int i17 = i14 + 1;
        return charAt(str, i17) == 'J' ? i14 + 2 : i17;
    }

    private int handleL(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14) {
        int i15 = i14 + 1;
        if (charAt(str, i15) != 'L') {
            doubleMetaphoneResult.append('L');
            return i15;
        }
        if (conditionL0(str, i14)) {
            doubleMetaphoneResult.appendPrimary('L');
        } else {
            doubleMetaphoneResult.append('L');
        }
        return i14 + 2;
    }

    private int handleP(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14) {
        int i15 = i14 + 1;
        if (charAt(str, i15) == 'H') {
            doubleMetaphoneResult.append('F');
            return i14 + 2;
        }
        doubleMetaphoneResult.append('P');
        return contains(str, i15, 1, "P", "B") ? i14 + 2 : i15;
    }

    private int handleR(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14, boolean z14) {
        if (i14 != str.length() - 1 || z14 || !contains(str, i14 - 2, 2, "IE") || contains(str, i14 - 4, 2, "ME", "MA")) {
            doubleMetaphoneResult.append('R');
        } else {
            doubleMetaphoneResult.appendAlternate('R');
        }
        int i15 = i14 + 1;
        return charAt(str, i15) == 'R' ? i14 + 2 : i15;
    }

    private int handleS(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14, boolean z14) {
        if (contains(str, i14 - 1, 3, "ISL", "YSL")) {
            return i14 + 1;
        }
        if (i14 == 0 && contains(str, i14, 5, "SUGAR")) {
            doubleMetaphoneResult.append('X', 'S');
            return i14 + 1;
        }
        if (contains(str, i14, 2, "SH")) {
            if (contains(str, i14 + 1, 4, "HEIM", "HOEK", "HOLM", "HOLZ")) {
                doubleMetaphoneResult.append('S');
            } else {
                doubleMetaphoneResult.append('X');
            }
            return i14 + 2;
        }
        if (contains(str, i14, 3, "SIO", "SIA") || contains(str, i14, 4, "SIAN")) {
            if (z14) {
                doubleMetaphoneResult.append('S');
            } else {
                doubleMetaphoneResult.append('S', 'X');
            }
            return i14 + 3;
        }
        if (i14 != 0 || !contains(str, i14 + 1, 1, "M", "N", "L", "W")) {
            int i15 = i14 + 1;
            if (!contains(str, i15, 1, "Z")) {
                if (contains(str, i14, 2, "SC")) {
                    return handleSC(str, doubleMetaphoneResult, i14);
                }
                if (i14 == str.length() - 1 && contains(str, i14 - 2, 2, "AI", "OI")) {
                    doubleMetaphoneResult.appendAlternate('S');
                } else {
                    doubleMetaphoneResult.append('S');
                }
                return contains(str, i15, 1, "S", "Z") ? i14 + 2 : i15;
            }
        }
        doubleMetaphoneResult.append('S', 'X');
        int i16 = i14 + 1;
        return contains(str, i16, 1, "Z") ? i14 + 2 : i16;
    }

    private int handleSC(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14) {
        int i15 = i14 + 2;
        if (charAt(str, i15) == 'H') {
            int i16 = i14 + 3;
            if (contains(str, i16, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
                if (contains(str, i16, 2, "ER", "EN")) {
                    doubleMetaphoneResult.append("X", "SK");
                } else {
                    doubleMetaphoneResult.append("SK");
                }
            } else if (i14 != 0 || isVowel(charAt(str, 3)) || charAt(str, 3) == 'W') {
                doubleMetaphoneResult.append('X');
            } else {
                doubleMetaphoneResult.append('X', 'S');
            }
        } else if (contains(str, i15, 1, "I", "E", "Y")) {
            doubleMetaphoneResult.append('S');
        } else {
            doubleMetaphoneResult.append("SK");
        }
        return i14 + 3;
    }

    private int handleT(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14) {
        if (contains(str, i14, 4, "TION") || contains(str, i14, 3, "TIA", "TCH")) {
            doubleMetaphoneResult.append('X');
            return i14 + 3;
        }
        if (!contains(str, i14, 2, "TH") && !contains(str, i14, 3, "TTH")) {
            doubleMetaphoneResult.append('T');
            int i15 = i14 + 1;
            return contains(str, i15, 1, "T", "D") ? i14 + 2 : i15;
        }
        int i16 = i14 + 2;
        if (contains(str, i16, 2, "OM", "AM") || contains(str, 0, 4, "VAN ", "VON ") || contains(str, 0, 3, "SCH")) {
            doubleMetaphoneResult.append('T');
        } else {
            doubleMetaphoneResult.append('0', 'T');
        }
        return i16;
    }

    private int handleW(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14) {
        if (contains(str, i14, 2, "WR")) {
            doubleMetaphoneResult.append('R');
            return i14 + 2;
        }
        if (i14 == 0) {
            int i15 = i14 + 1;
            if (isVowel(charAt(str, i15)) || contains(str, i14, 2, "WH")) {
                if (isVowel(charAt(str, i15))) {
                    doubleMetaphoneResult.append('A', 'F');
                } else {
                    doubleMetaphoneResult.append('A');
                }
                return i15;
            }
        }
        if ((i14 == str.length() - 1 && isVowel(charAt(str, i14 - 1))) || contains(str, i14 - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") || contains(str, 0, 3, "SCH")) {
            doubleMetaphoneResult.appendAlternate('F');
            return i14 + 1;
        }
        if (!contains(str, i14, 4, "WICZ", "WITZ")) {
            return i14 + 1;
        }
        doubleMetaphoneResult.append("TS", "FX");
        return i14 + 4;
    }

    private int handleX(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14) {
        if (i14 == 0) {
            doubleMetaphoneResult.append('S');
            return i14 + 1;
        }
        if (i14 != str.length() - 1 || (!contains(str, i14 - 3, 3, "IAU", "EAU") && !contains(str, i14 - 2, 2, "AU", "OU"))) {
            doubleMetaphoneResult.append("KS");
        }
        int i15 = i14 + 1;
        return contains(str, i15, 1, "C", "X") ? i14 + 2 : i15;
    }

    private int handleZ(String str, DoubleMetaphoneResult doubleMetaphoneResult, int i14, boolean z14) {
        int i15 = i14 + 1;
        if (charAt(str, i15) == 'H') {
            doubleMetaphoneResult.append('J');
            return i14 + 2;
        }
        if (contains(str, i15, 2, "ZO", "ZI", "ZA") || (z14 && i14 > 0 && charAt(str, i14 - 1) != 'T')) {
            doubleMetaphoneResult.append("S", "TS");
        } else {
            doubleMetaphoneResult.append('S');
        }
        return charAt(str, i15) == 'Z' ? i14 + 2 : i15;
    }

    private boolean isSilentStart(String str) {
        for (String str2 : SILENT_START) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean isSlavoGermanic(String str) {
        return str.indexOf(87) > -1 || str.indexOf(75) > -1 || str.contains("CZ") || str.contains("WITZ");
    }

    private boolean isVowel(char c14) {
        return VOWELS.indexOf(c14) != -1;
    }

    public char charAt(String str, int i14) {
        if (i14 < 0 || i14 >= str.length()) {
            return (char) 0;
        }
        return str.charAt(i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.apache.commons.codec.language.DoubleMetaphone] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    public String doubleMetaphone(String str, boolean z14) {
        int i14;
        ?? CleanInput = cleanInput(str);
        if (CleanInput == 0) {
            return null;
        }
        boolean zIsSlavoGermanic = isSlavoGermanic(CleanInput);
        ?? IsSilentStart = isSilentStart(CleanInput);
        DoubleMetaphoneResult doubleMetaphoneResult = new DoubleMetaphoneResult(getMaxCodeLen());
        while (!doubleMetaphoneResult.isComplete() && IsSilentStart <= CleanInput.length() - 1) {
            char cCharAt = CleanInput.charAt(IsSilentStart);
            if (cCharAt == 199) {
                doubleMetaphoneResult.append('S');
            } else if (cCharAt != 209) {
                switch (cCharAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'Y':
                        IsSilentStart = handleAEIOUY(doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'B':
                        doubleMetaphoneResult.append('P');
                        i14 = IsSilentStart + 1;
                        IsSilentStart = charAt(CleanInput, i14) != 'B' ? i14 : IsSilentStart + 2;
                        break;
                    case 'C':
                        IsSilentStart = handleC(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'D':
                        IsSilentStart = handleD(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'F':
                        doubleMetaphoneResult.append('F');
                        i14 = IsSilentStart + 1;
                        if (charAt(CleanInput, i14) != 'F') {
                        }
                        break;
                    case 'G':
                        IsSilentStart = handleG(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'H':
                        IsSilentStart = handleH(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'J':
                        IsSilentStart = handleJ(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'K':
                        doubleMetaphoneResult.append('K');
                        i14 = IsSilentStart + 1;
                        if (charAt(CleanInput, i14) != 'K') {
                        }
                        break;
                    case 'L':
                        IsSilentStart = handleL(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'M':
                        doubleMetaphoneResult.append('M');
                        if (!conditionM0(CleanInput, IsSilentStart)) {
                        }
                        break;
                    case 'N':
                        doubleMetaphoneResult.append('N');
                        i14 = IsSilentStart + 1;
                        if (charAt(CleanInput, i14) != 'N') {
                        }
                        break;
                    case 'P':
                        IsSilentStart = handleP(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'Q':
                        doubleMetaphoneResult.append('K');
                        i14 = IsSilentStart + 1;
                        if (charAt(CleanInput, i14) != 'Q') {
                        }
                        break;
                    case 'R':
                        IsSilentStart = handleR(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'S':
                        IsSilentStart = handleS(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    case 'T':
                        IsSilentStart = handleT(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'V':
                        doubleMetaphoneResult.append('F');
                        i14 = IsSilentStart + 1;
                        if (charAt(CleanInput, i14) != 'V') {
                        }
                        break;
                    case 'W':
                        IsSilentStart = handleW(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'X':
                        IsSilentStart = handleX(CleanInput, doubleMetaphoneResult, IsSilentStart);
                        break;
                    case 'Z':
                        IsSilentStart = handleZ(CleanInput, doubleMetaphoneResult, IsSilentStart, zIsSlavoGermanic);
                        break;
                    default:
                        break;
                }
            } else {
                doubleMetaphoneResult.append('N');
            }
            IsSilentStart++;
        }
        return z14 ? doubleMetaphoneResult.getAlternate() : doubleMetaphoneResult.getPrimary();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return doubleMetaphone((String) obj);
        }
        throw new EncoderException("DoubleMetaphone encode parameter is not of type String");
    }

    public int getMaxCodeLen() {
        return this.maxCodeLen;
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2, boolean z14) {
        return org.apache.commons.codec.binary.StringUtils.equals(doubleMetaphone(str, z14), doubleMetaphone(str2, z14));
    }

    public void setMaxCodeLen(int i14) {
        this.maxCodeLen = i14;
    }

    public class DoubleMetaphoneResult {
        private final StringBuilder alternate;
        private final int maxLength;
        private final StringBuilder primary;

        public DoubleMetaphoneResult(int i14) {
            this.primary = new StringBuilder(DoubleMetaphone.this.getMaxCodeLen());
            this.alternate = new StringBuilder(DoubleMetaphone.this.getMaxCodeLen());
            this.maxLength = i14;
        }

        public void append(char c14) {
            appendPrimary(c14);
            appendAlternate(c14);
        }

        public void appendAlternate(String str) {
            int length = this.maxLength - this.alternate.length();
            int length2 = str.length();
            StringBuilder sb3 = this.alternate;
            if (length2 <= length) {
                sb3.append(str);
            } else {
                sb3.append((CharSequence) str, 0, length);
            }
        }

        public void appendPrimary(String str) {
            int length = this.maxLength - this.primary.length();
            int length2 = str.length();
            StringBuilder sb3 = this.primary;
            if (length2 <= length) {
                sb3.append(str);
            } else {
                sb3.append((CharSequence) str, 0, length);
            }
        }

        public String getAlternate() {
            return this.alternate.toString();
        }

        public String getPrimary() {
            return this.primary.toString();
        }

        public boolean isComplete() {
            return this.primary.length() >= this.maxLength && this.alternate.length() >= this.maxLength;
        }

        public void append(char c14, char c15) {
            appendPrimary(c14);
            appendAlternate(c15);
        }

        public void append(String str) {
            appendPrimary(str);
            appendAlternate(str);
        }

        public void append(String str, String str2) {
            appendPrimary(str);
            appendAlternate(str2);
        }

        public void appendAlternate(char c14) {
            if (this.alternate.length() < this.maxLength) {
                this.alternate.append(c14);
            }
        }

        public void appendPrimary(char c14) {
            if (this.primary.length() < this.maxLength) {
                this.primary.append(c14);
            }
        }
    }

    public boolean isDoubleMetaphoneEqual(String str, String str2) {
        return isDoubleMetaphoneEqual(str, str2, false);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return doubleMetaphone(str);
    }

    public String doubleMetaphone(String str) {
        return doubleMetaphone(str, false);
    }
}
