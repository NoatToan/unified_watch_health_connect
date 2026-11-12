package org.apache.commons.text.matcher;

import am.j;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractStringMatcher implements StringMatcher {

    public static final class NoneMatcher extends AbstractStringMatcher {
        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(CharSequence charSequence, int i14, int i15, int i16) {
            return 0;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int size() {
            return 0;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(char[] cArr, int i14, int i15, int i16) {
            return 0;
        }
    }

    public static final class CharMatcher extends AbstractStringMatcher {

        /* JADX INFO: renamed from: ch, reason: collision with root package name */
        private final char f133473ch;

        public CharMatcher(char c14) {
            this.f133473ch = c14;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(CharSequence charSequence, int i14, int i15, int i16) {
            return this.f133473ch == charSequence.charAt(i14) ? 1 : 0;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int size() {
            return 1;
        }

        public String toString() {
            return super.toString() + "['" + this.f133473ch + "']";
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(char[] cArr, int i14, int i15, int i16) {
            return this.f133473ch == cArr[i14] ? 1 : 0;
        }
    }

    public static final class TrimMatcher extends AbstractStringMatcher {
        private static final int SPACE_INT = 32;

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(CharSequence charSequence, int i14, int i15, int i16) {
            return charSequence.charAt(i14) <= ' ' ? 1 : 0;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int size() {
            return 1;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(char[] cArr, int i14, int i15, int i16) {
            return cArr[i14] <= ' ' ? 1 : 0;
        }
    }

    public static final class CharSetMatcher extends AbstractStringMatcher {
        private final char[] chars;

        public CharSetMatcher(char[] cArr) {
            char[] cArr2 = (char[]) cArr.clone();
            this.chars = cArr2;
            Arrays.sort(cArr2);
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(CharSequence charSequence, int i14, int i15, int i16) {
            return Arrays.binarySearch(this.chars, charSequence.charAt(i14)) >= 0 ? 1 : 0;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int size() {
            return 1;
        }

        public String toString() {
            return super.toString() + Arrays.toString(this.chars);
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(char[] cArr, int i14, int i15, int i16) {
            return Arrays.binarySearch(this.chars, cArr[i14]) >= 0 ? 1 : 0;
        }
    }

    public static final class AndStringMatcher extends AbstractStringMatcher {
        private final StringMatcher[] stringMatchers;

        public AndStringMatcher(StringMatcher... stringMatcherArr) {
            this.stringMatchers = (StringMatcher[]) stringMatcherArr.clone();
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(char[] cArr, int i14, int i15, int i16) {
            int i17 = 0;
            for (StringMatcher stringMatcher : this.stringMatchers) {
                if (stringMatcher != null) {
                    int iIsMatch = stringMatcher.isMatch(cArr, i14, i15, i16);
                    if (iIsMatch == 0) {
                        return 0;
                    }
                    i17 += iIsMatch;
                    i14 += iIsMatch;
                }
            }
            return i17;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int size() {
            int size = 0;
            for (StringMatcher stringMatcher : this.stringMatchers) {
                if (stringMatcher != null) {
                    size = stringMatcher.size() + size;
                }
            }
            return size;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(CharSequence charSequence, int i14, int i15, int i16) {
            int i17 = 0;
            for (StringMatcher stringMatcher : this.stringMatchers) {
                if (stringMatcher != null) {
                    int iIsMatch = stringMatcher.isMatch(charSequence, i14, i15, i16);
                    if (iIsMatch == 0) {
                        return 0;
                    }
                    i17 += iIsMatch;
                    i14 += iIsMatch;
                }
            }
            return i17;
        }
    }

    public static final class CharArrayMatcher extends AbstractStringMatcher {
        private final char[] chars;
        private final String string;

        public CharArrayMatcher(char... cArr) {
            this.string = String.valueOf(cArr);
            this.chars = (char[]) cArr.clone();
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(CharSequence charSequence, int i14, int i15, int i16) {
            int size = size();
            if (i14 + size > i16) {
                return 0;
            }
            int i17 = 0;
            while (i17 < size) {
                if (this.chars[i17] != charSequence.charAt(i14)) {
                    return 0;
                }
                i17++;
                i14++;
            }
            return size;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int size() {
            return this.chars.length;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(super.toString());
            sb3.append("[\"");
            return j.o(this.string, "\"]", sb3);
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(char[] cArr, int i14, int i15, int i16) {
            int size = size();
            if (i14 + size > i16) {
                return 0;
            }
            int i17 = 0;
            while (i17 < size) {
                if (this.chars[i17] != cArr[i14]) {
                    return 0;
                }
                i17++;
                i14++;
            }
            return size;
        }
    }
}
