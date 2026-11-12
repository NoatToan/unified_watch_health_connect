package com.beaglebuddy.id3.enums.v24;

/* JADX INFO: loaded from: classes2.dex */
public enum ImageEncodingRestriction {
    NO_RESTRICTIONS("No image encoding restrictions.", (byte) 0),
    PNG_OR_JPEG("Images are encoded only with PNG or JPEG.", (byte) 4);

    private String description;
    private byte mask;

    ImageEncodingRestriction(String str, byte b) {
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

    public static ImageEncodingRestriction valueOf(int i) throws IllegalArgumentException {
        for (ImageEncodingRestriction imageEncodingRestriction : values()) {
            if (i == imageEncodingRestriction.ordinal()) {
                return imageEncodingRestriction;
            }
        }
        throw new IllegalArgumentException("Invalid image encoding restriction " + i + ".");
    }
}
