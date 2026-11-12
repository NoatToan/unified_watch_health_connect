package org.apache.commons.text;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class StrMatcher {
    private static final StrMatcher COMMA_MATCHER = new CharMatcher(CoreConstants.COMMA_CHAR);
    private static final StrMatcher TAB_MATCHER = new CharMatcher('\t');
    private static final StrMatcher SPACE_MATCHER = new CharMatcher(' ');
    private static final StrMatcher SPLIT_MATCHER = new CharSetMatcher(" \t\n\r\f".toCharArray());
    private static final StrMatcher TRIM_MATCHER = new TrimMatcher();
    private static final StrMatcher SINGLE_QUOTE_MATCHER = new CharMatcher(CoreConstants.SINGLE_QUOTE_CHAR);
    private static final StrMatcher DOUBLE_QUOTE_MATCHER = new CharMatcher(CoreConstants.DOUBLE_QUOTE_CHAR);
    private static final StrMatcher QUOTE_MATCHER = new CharSetMatcher("'\"".toCharArray());
    private static final StrMatcher NONE_MATCHER = new NoMatcher();

    public static final class CharMatcher extends StrMatcher {

        /* JADX INFO: renamed from: ch, reason: collision with root package name */
        private final char f133469ch;

        public CharMatcher(char c14) {
            this.f133469ch = c14;
        }

        @Override // org.apache.commons.text.StrMatcher
        public int isMatch(char[] cArr, int i14, int i15, int i16) {
            return this.f133469ch == cArr[i14] ? 1 : 0;
        }
    }

    public static final class CharSetMatcher extends StrMatcher {
        private final char[] chars;

        public CharSetMatcher(char[] cArr) {
            char[] cArr2 = (char[]) cArr.clone();
            this.chars = cArr2;
            Arrays.sort(cArr2);
        }

        @Override // org.apache.commons.text.StrMatcher
        public int isMatch(char[] cArr, int i14, int i15, int i16) {
            return Arrays.binarySearch(this.chars, cArr[i14]) >= 0 ? 1 : 0;
        }
    }

    public static final class NoMatcher extends StrMatcher {
        @Override // org.apache.commons.text.StrMatcher
        public int isMatch(char[] cArr, int i14, int i15, int i16) {
            return 0;
        }
    }

    public static final class StringMatcher extends StrMatcher {
        private final char[] chars;

        public StringMatcher(String str) {
            this.chars = str.toCharArray();
        }

        @Override // org.apache.commons.text.StrMatcher
        public int isMatch(char[] cArr, int i14, int i15, int i16) {
            int length = this.chars.length;
            if (i14 + length > i16) {
                return 0;
            }
            int i17 = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i17 >= cArr2.length) {
                    return length;
                }
                if (cArr2[i17] != cArr[i14]) {
                    return 0;
                }
                i17++;
                i14++;
            }
        }

        public String toString() {
            return super.toString() + ' ' + Arrays.toString(this.chars);
        }
    }

    public static final class TrimMatcher extends StrMatcher {
        @Override // org.apache.commons.text.StrMatcher
        public int isMatch(char[] cArr, int i14, int i15, int i16) {
            return cArr[i14] <= ' ' ? 1 : 0;
        }
    }

    public static StrMatcher charMatcher(char c14) {
        return new CharMatcher(c14);
    }

    public static StrMatcher charSetMatcher(String str) {
        if (str == null || str.length() == 0) {
            return NONE_MATCHER;
        }
        return str.length() == 1 ? new CharMatcher(str.charAt(0)) : new CharSetMatcher(str.toCharArray());
    }

    public static StrMatcher commaMatcher() {
        return COMMA_MATCHER;
    }

    public static StrMatcher doubleQuoteMatcher() {
        return DOUBLE_QUOTE_MATCHER;
    }

    public static StrMatcher noneMatcher() {
        return NONE_MATCHER;
    }

    public static StrMatcher quoteMatcher() {
        return QUOTE_MATCHER;
    }

    public static StrMatcher singleQuoteMatcher() {
        return SINGLE_QUOTE_MATCHER;
    }

    public static StrMatcher spaceMatcher() {
        return SPACE_MATCHER;
    }

    public static StrMatcher splitMatcher() {
        return SPLIT_MATCHER;
    }

    public static StrMatcher stringMatcher(String str) {
        return (str == null || str.length() == 0) ? NONE_MATCHER : new StringMatcher(str);
    }

    public static StrMatcher tabMatcher() {
        return TAB_MATCHER;
    }

    public static StrMatcher trimMatcher() {
        return TRIM_MATCHER;
    }

    public int isMatch(char[] cArr, int i14) {
        return isMatch(cArr, i14, 0, cArr.length);
    }

    public abstract int isMatch(char[] cArr, int i14, int i15, int i16);

    public static StrMatcher charSetMatcher(char... cArr) {
        if (ArrayUtils.isEmpty(cArr)) {
            return NONE_MATCHER;
        }
        if (cArr.length == 1) {
            return new CharMatcher(cArr[0]);
        }
        return new CharSetMatcher(cArr);
    }
}
