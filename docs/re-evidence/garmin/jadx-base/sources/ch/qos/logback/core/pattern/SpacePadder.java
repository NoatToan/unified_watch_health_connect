package ch.qos.logback.core.pattern;

import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes7.dex */
public class SpacePadder {
    static final String[] SPACES = {StringUtils.SPACE, "  ", "    ", "        ", "                ", "                                "};

    public static final void leftPad(StringBuilder sb3, String str, int i14) {
        int length = str != null ? str.length() : 0;
        if (length < i14) {
            spacePad(sb3, i14 - length);
        }
        if (str != null) {
            sb3.append(str);
        }
    }

    public static final void rightPad(StringBuilder sb3, String str, int i14) {
        int length = str != null ? str.length() : 0;
        if (str != null) {
            sb3.append(str);
        }
        if (length < i14) {
            spacePad(sb3, i14 - length);
        }
    }

    public static final void spacePad(StringBuilder sb3, int i14) {
        while (i14 >= 32) {
            sb3.append(SPACES[5]);
            i14 -= 32;
        }
        for (int i15 = 4; i15 >= 0; i15--) {
            if (((1 << i15) & i14) != 0) {
                sb3.append(SPACES[i15]);
            }
        }
    }
}
