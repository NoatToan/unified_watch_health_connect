package ch.qos.logback.core.util;

import am.j;
import java.text.DateFormatSymbols;
import org.apache.commons.text.StringSubstitutor;
import tn.k;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
class CharSequenceToRegexMapper {
    DateFormatSymbols symbols = DateFormatSymbols.getInstance();

    public static int[] findMinMaxLengthsInSymbols(String[] strArr) {
        int iMin = Integer.MAX_VALUE;
        int iMax = 0;
        for (String str : strArr) {
            int length = str.length();
            if (length != 0) {
                iMin = Math.min(iMin, length);
                iMax = Math.max(iMax, length);
            }
        }
        return new int[]{iMin, iMax};
    }

    private String getRegexForAmPms() {
        return symbolArrayToRegex(this.symbols.getAmPmStrings());
    }

    private String getRegexForLongDaysOfTheWeek() {
        return symbolArrayToRegex(this.symbols.getWeekdays());
    }

    private String getRegexForLongMonths() {
        return symbolArrayToRegex(this.symbols.getMonths());
    }

    private String getRegexForShortDaysOfTheWeek() {
        return symbolArrayToRegex(this.symbols.getShortWeekdays());
    }

    private String number(int i14) {
        return e0.f(i14, "\\d{", StringSubstitutor.DEFAULT_VAR_END);
    }

    private String symbolArrayToRegex(String[] strArr) {
        int[] iArrFindMinMaxLengthsInSymbols = findMinMaxLengthsInSymbols(strArr);
        StringBuilder sb3 = new StringBuilder(".{");
        sb3.append(iArrFindMinMaxLengthsInSymbols[0]);
        sb3.append(",");
        return j.q(sb3, iArrFindMinMaxLengthsInSymbols[1], StringSubstitutor.DEFAULT_VAR_END);
    }

    public String getRegexForShortMonths() {
        return symbolArrayToRegex(this.symbols.getShortMonths());
    }

    public String toRegex(CharSequenceState charSequenceState) {
        int i14 = charSequenceState.occurrences;
        char c14 = charSequenceState.f27288c;
        if (c14 != 'y') {
            if (c14 == 'z') {
                return ".*";
            }
            switch (c14) {
                case '\'':
                    if (i14 == 1) {
                        return "";
                    }
                    h.z("Too many single quotes");
                    return null;
                case '.':
                    return "\\.";
                case 'K':
                case 'S':
                case 'W':
                case 'd':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                    break;
                case 'M':
                    if (i14 <= 2) {
                        return number(i14);
                    }
                    return i14 == 3 ? getRegexForShortMonths() : getRegexForLongMonths();
                case 'Z':
                    return "(\\+|-)\\d{4}";
                case '\\':
                    h.z("Forward slashes are not allowed");
                    return null;
                case 'a':
                    return getRegexForAmPms();
                default:
                    switch (c14) {
                        case 'D':
                        case 'F':
                        case 'H':
                            break;
                        case 'E':
                            return i14 >= 4 ? getRegexForLongDaysOfTheWeek() : getRegexForShortDaysOfTheWeek();
                        case 'G':
                            return ".*";
                        default:
                            if (i14 == 1) {
                                return k.f("", c14);
                            }
                            return c14 + "{" + i14 + StringSubstitutor.DEFAULT_VAR_END;
                    }
                    break;
            }
        }
        return number(i14);
    }
}
