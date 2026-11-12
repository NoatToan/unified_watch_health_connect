package org.apache.commons.text.matcher;

import org.apache.commons.lang3.CharSequenceUtils;

/* JADX INFO: loaded from: classes3.dex */
public interface StringMatcher {
    default StringMatcher andThen(StringMatcher stringMatcher) {
        return StringMatcherFactory.INSTANCE.andMatcher(this, stringMatcher);
    }

    default int isMatch(CharSequence charSequence, int i14) {
        return isMatch(charSequence, i14, 0, charSequence.length());
    }

    int isMatch(char[] cArr, int i14, int i15, int i16);

    default int size() {
        return 0;
    }

    default int isMatch(char[] cArr, int i14) {
        return isMatch(cArr, i14, 0, cArr.length);
    }

    default int isMatch(CharSequence charSequence, int i14, int i15, int i16) {
        return isMatch(CharSequenceUtils.toCharArray(charSequence), i14, i16, i16);
    }
}
