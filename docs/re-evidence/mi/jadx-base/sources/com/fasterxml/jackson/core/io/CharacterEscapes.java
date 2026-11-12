package com.fasterxml.jackson.core.io;

import defpackage.owl;
import defpackage.xt3;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CharacterEscapes implements Serializable {
    public static final int ESCAPE_CUSTOM = -2;
    public static final int ESCAPE_NONE = 0;
    public static final int ESCAPE_STANDARD = -1;

    public static int[] standardAsciiEscapesForJSON() {
        int[] iArrE = xt3.e();
        return Arrays.copyOf(iArrE, iArrE.length);
    }

    public abstract int[] getEscapeCodesForAscii();

    public abstract owl getEscapeSequence(int i);
}
