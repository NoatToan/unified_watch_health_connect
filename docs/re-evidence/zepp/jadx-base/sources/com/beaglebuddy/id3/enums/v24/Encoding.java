package com.beaglebuddy.id3.enums.v24;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public enum Encoding {
    ISO_8859_1("ISO-8859-1", Charset.forName("ISO-8859-1"), 1),
    UTF_16("UTF-16", Charset.forName("UTF-16"), 2),
    UTF_16BE("UTF-16BE", Charset.forName("UTF-16BE"), 2),
    UTF_8("UTF-8", Charset.forName("UTF-8"), 1);

    private Charset characterSet;
    private String name;
    private int numBytesInNullTerminator;

    Encoding(String str, Charset charset, int i) {
        this.name = str;
        this.characterSet = charset;
        this.numBytesInNullTerminator = i;
    }

    public Charset getCharacterSet() {
        return this.characterSet;
    }

    public String getName() {
        return this.name;
    }

    public int getNumBytesInNullTerminator() {
        return this.numBytesInNullTerminator;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "" + ordinal() + " - " + this.name;
    }

    public static Encoding valueOf(byte b) throws IllegalArgumentException {
        for (Encoding encoding : values()) {
            if (b == encoding.ordinal()) {
                return encoding;
            }
        }
        throw new IllegalArgumentException("Invalid ID3v2.4 encoding " + ((int) b) + ".  It must be either 0, 1, 2, or 3.");
    }
}
