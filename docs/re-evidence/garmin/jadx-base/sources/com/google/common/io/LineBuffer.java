package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
abstract class LineBuffer {
    private StringBuilder line = new StringBuilder();
    private boolean sawReturn;

    @CanIgnoreReturnValue
    private boolean finishLine(boolean z14) {
        String str;
        if (this.sawReturn) {
            str = z14 ? IOUtils.LINE_SEPARATOR_WINDOWS : StringUtils.CR;
        } else {
            str = z14 ? "\n" : "";
        }
        handleLine(this.line.toString(), str);
        this.line = new StringBuilder();
        this.sawReturn = false;
        return z14;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    public void add(char[] cArr, int i14, int i15) {
        int i16;
        if (!this.sawReturn || i15 <= 0) {
            i16 = i14;
        } else {
            if (finishLine(cArr[i14] == '\n')) {
                i16 = i14 + 1;
            } else {
                i16 = i14;
            }
        }
        int i17 = i14 + i15;
        int i18 = i16;
        while (i16 < i17) {
            char c14 = cArr[i16];
            if (c14 != '\n') {
                if (c14 == '\r') {
                    this.line.append(cArr, i18, i16 - i18);
                    this.sawReturn = true;
                    int i19 = i16 + 1;
                    if (i19 < i17) {
                        if (finishLine(cArr[i19] == '\n')) {
                            i16 = i19;
                        }
                    }
                }
                i16++;
            } else {
                this.line.append(cArr, i18, i16 - i18);
                finishLine(true);
            }
            i18 = i16 + 1;
            i16++;
        }
        this.line.append(cArr, i18, i17 - i18);
    }

    public void finish() {
        if (this.sawReturn || this.line.length() > 0) {
            finishLine(false);
        }
    }

    public abstract void handleLine(String str, String str2);
}
