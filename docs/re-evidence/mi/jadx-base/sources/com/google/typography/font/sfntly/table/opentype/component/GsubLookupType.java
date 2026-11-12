package com.google.typography.font.sfntly.table.opentype.component;

/* JADX INFO: loaded from: classes5.dex */
public enum GsubLookupType {
    GSUB_SINGLE,
    GSUB_MULTIPLE,
    GSUB_ALTERNATE,
    GSUB_LIGATURE,
    GSUB_CONTEXTUAL,
    GSUB_CHAINING_CONTEXTUAL,
    GSUB_EXTENSION,
    GSUB_REVERSE_CHAINING_CONTEXTUAL_SINGLE;

    private static final GsubLookupType[] values = values();

    public static GsubLookupType forTypeNum(int i) {
        if (i > 0) {
            GsubLookupType[] gsubLookupTypeArr = values;
            if (i <= gsubLookupTypeArr.length) {
                return gsubLookupTypeArr[i - 1];
            }
        }
        System.err.format("unknown gsub lookup typeNum: %d\n", Integer.valueOf(i));
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return super.toString().toLowerCase();
    }

    public int typeNum() {
        return ordinal() + 1;
    }
}
