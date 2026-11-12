package ch.qos.logback.core.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DatePatternToRegexUtil {
    final String datePattern;
    final int datePatternLength;
    final CharSequenceToRegexMapper regexMapper = new CharSequenceToRegexMapper();

    public DatePatternToRegexUtil(String str) {
        this.datePattern = str;
        this.datePatternLength = str.length();
    }

    private List<CharSequenceState> tokenize() {
        ArrayList arrayList = new ArrayList();
        CharSequenceState charSequenceState = null;
        for (int i14 = 0; i14 < this.datePatternLength; i14++) {
            char cCharAt = this.datePattern.charAt(i14);
            if (charSequenceState == null || charSequenceState.f27288c != cCharAt) {
                charSequenceState = new CharSequenceState(cCharAt);
                arrayList.add(charSequenceState);
            } else {
                charSequenceState.incrementOccurrences();
            }
        }
        return arrayList;
    }

    public String toRegex() {
        List<CharSequenceState> list = tokenize();
        StringBuilder sb3 = new StringBuilder();
        Iterator<CharSequenceState> it = list.iterator();
        while (it.hasNext()) {
            sb3.append(this.regexMapper.toRegex(it.next()));
        }
        return sb3.toString();
    }
}
