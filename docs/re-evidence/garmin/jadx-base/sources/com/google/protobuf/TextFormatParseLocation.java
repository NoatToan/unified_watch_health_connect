package com.google.protobuf;

import java.util.Arrays;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes2.dex */
public final class TextFormatParseLocation {
    public static final TextFormatParseLocation EMPTY = new TextFormatParseLocation(-1, -1);
    private final int column;
    private final int line;

    private TextFormatParseLocation(int i14, int i15) {
        this.line = i14;
        this.column = i15;
    }

    public static TextFormatParseLocation create(int i14, int i15) {
        if (i14 == -1 && i15 == -1) {
            return EMPTY;
        }
        if (i14 >= 0 && i15 >= 0) {
            return new TextFormatParseLocation(i14, i15);
        }
        e.s("line and column values must be >= 0: line %d, column: %d", new Object[]{Integer.valueOf(i14), Integer.valueOf(i15)});
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextFormatParseLocation)) {
            return false;
        }
        TextFormatParseLocation textFormatParseLocation = (TextFormatParseLocation) obj;
        return this.line == textFormatParseLocation.getLine() && this.column == textFormatParseLocation.getColumn();
    }

    public int getColumn() {
        return this.column;
    }

    public int getLine() {
        return this.line;
    }

    public int hashCode() {
        return Arrays.hashCode(new int[]{this.line, this.column});
    }

    public String toString() {
        return String.format("ParseLocation{line=%d, column=%d}", Integer.valueOf(this.line), Integer.valueOf(this.column));
    }
}
