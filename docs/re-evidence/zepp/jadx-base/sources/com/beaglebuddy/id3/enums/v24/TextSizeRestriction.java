package com.beaglebuddy.id3.enums.v24;

/* JADX INFO: loaded from: classes2.dex */
public enum TextSizeRestriction {
    NO_RESTRICTIONS("No string size restrictions.", (byte) 0),
    CHARACTERS_1024("No string is longer than 1024 characters.", (byte) 8),
    CHARACTERS_128("No string is longer than 128 characters.", (byte) 16),
    CHARACTERS_30("No string is longer than 30 characters.", (byte) 24);

    private String description;
    private byte mask;

    TextSizeRestriction(String str, byte b) {
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

    public static TextSizeRestriction valueOf(int i) throws IllegalArgumentException {
        for (TextSizeRestriction textSizeRestriction : values()) {
            if (i == textSizeRestriction.ordinal()) {
                return textSizeRestriction;
            }
        }
        throw new IllegalArgumentException("Invalid text size restriction " + i + ".");
    }
}
