package com.beaglebuddy.id3.enums.v24;

/* JADX INFO: loaded from: classes2.dex */
public enum TextEncodingRestriction {
    NO_RESTRICTIONS("No String encoding restrictions.", (byte) 0),
    ISO_8859_1_OR_UTF_8("Strings are only encoded with ISO-8859-1 or UTF-8.", (byte) 32);

    private String description;
    private byte mask;

    TextEncodingRestriction(String str, byte b) {
        this.description = str;
        this.mask = b;
    }

    public String getDescription() {
        return this.description;
    }

    public byte getMask() {
        return this.mask;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "" + ordinal() + " - " + this.description;
    }

    public static TextEncodingRestriction valueOf(int i) throws IllegalArgumentException {
        for (TextEncodingRestriction textEncodingRestriction : values()) {
            if (i == textEncodingRestriction.ordinal()) {
                return textEncodingRestriction;
            }
        }
        throw new IllegalArgumentException("Invalid text encoding restriction " + i + ".");
    }
}
