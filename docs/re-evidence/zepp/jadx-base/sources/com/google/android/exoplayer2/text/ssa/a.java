package com.google.android.exoplayer2.text.ssa;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes3.dex */
final class a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private a(int startTimeIndex, int endTimeIndex, int styleIndex, int textIndex, int length) {
        this.a = startTimeIndex;
        this.b = endTimeIndex;
        this.c = styleIndex;
        this.d = textIndex;
        this.e = length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    @Nullable
    public static a a(String formatLine) {
        Assertions.checkArgument(formatLine.startsWith(SsaDecoder.v));
        String[] strArrSplit = TextUtils.split(formatLine.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String lowerCase = Ascii.toLowerCase(strArrSplit[i5].trim());
            lowerCase.hashCode();
            switch (lowerCase) {
                case "end":
                    i2 = i5;
                    break;
                case "text":
                    i4 = i5;
                    break;
                case "start":
                    i = i5;
                    break;
                case "style":
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new a(i, i2, i3, i4, strArrSplit.length);
    }
}
