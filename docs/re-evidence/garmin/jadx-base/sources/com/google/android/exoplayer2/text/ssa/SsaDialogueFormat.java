package com.google.android.exoplayer2.text.ssa;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes14.dex */
final class SsaDialogueFormat {
    public final int endTimeIndex;
    public final int length;
    public final int startTimeIndex;
    public final int styleIndex;
    public final int textIndex;

    private SsaDialogueFormat(int i14, int i15, int i16, int i17, int i18) {
        this.startTimeIndex = i14;
        this.endTimeIndex = i15;
        this.styleIndex = i16;
        this.textIndex = i17;
        this.length = i18;
    }

    public static SsaDialogueFormat fromFormatLine(String str) {
        Assertions.checkArgument(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        for (int i18 = 0; i18 < strArrSplit.length; i18++) {
            String lowerCase = Ascii.toLowerCase(strArrSplit[i18].trim());
            lowerCase.getClass();
            switch (lowerCase) {
                case "end":
                    i15 = i18;
                    break;
                case "text":
                    i17 = i18;
                    break;
                case "start":
                    i14 = i18;
                    break;
                case "style":
                    i16 = i18;
                    break;
            }
        }
        if (i14 == -1 || i15 == -1 || i17 == -1) {
            return null;
        }
        return new SsaDialogueFormat(i14, i15, i16, i17, strArrSplit.length);
    }
}
