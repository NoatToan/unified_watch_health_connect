package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
abstract class c {
    private StringBuilder a = new StringBuilder();
    private boolean b;

    @CanIgnoreReturnValue
    private boolean c(boolean z) throws IOException {
        String str;
        if (this.b) {
            str = z ? "\r\n" : StringUtils.CR;
        } else {
            str = z ? "\n" : "";
        }
        d(this.a.toString(), str);
        this.a = new StringBuilder();
        this.b = false;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    public void a(char[] cArr, int i, int i2) throws IOException {
        int i3;
        if (!this.b || i2 <= 0) {
            i3 = i;
        } else {
            if (c(cArr[i] == '\n')) {
                i3 = i + 1;
            } else {
                i3 = i;
            }
        }
        int i4 = i + i2;
        int i5 = i3;
        while (i3 < i4) {
            char c = cArr[i3];
            if (c != '\n') {
                if (c == '\r') {
                    this.a.append(cArr, i5, i3 - i5);
                    this.b = true;
                    int i6 = i3 + 1;
                    if (i6 < i4) {
                        if (c(cArr[i6] == '\n')) {
                            i3 = i6;
                        }
                    }
                }
                i3++;
            } else {
                this.a.append(cArr, i5, i3 - i5);
                c(true);
            }
            i5 = i3 + 1;
            i3++;
        }
        this.a.append(cArr, i5, i4 - i5);
    }

    public void b() throws IOException {
        if (this.b || this.a.length() > 0) {
            c(false);
        }
    }

    public abstract void d(String str, String str2) throws IOException;
}
