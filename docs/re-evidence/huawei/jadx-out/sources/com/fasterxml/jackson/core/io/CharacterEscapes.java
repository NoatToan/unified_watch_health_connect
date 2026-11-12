package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import defpackage.wz;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public abstract class CharacterEscapes implements Serializable {
    public static final int ESCAPE_CUSTOM = -2;
    public static final int ESCAPE_NONE = 0;
    public static final int ESCAPE_STANDARD = -1;

    public abstract int[] getEscapeCodesForAscii();

    public abstract SerializableString getEscapeSequence(int i);

    public static int[] standardAsciiEscapesForJSON() {
        int[] iArrC = wz.c();
        return Arrays.copyOf(iArrC, iArrC.length);
    }
}
