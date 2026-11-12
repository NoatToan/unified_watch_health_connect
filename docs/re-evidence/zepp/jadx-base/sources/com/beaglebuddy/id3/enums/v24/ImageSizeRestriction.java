package com.beaglebuddy.id3.enums.v24;

/* JADX INFO: loaded from: classes2.dex */
public enum ImageSizeRestriction {
    NO_RESTRICTIONS("No restrictions", (byte) 0),
    DIMENSIONS_256_X_256_OR_SMALLER("All images are 256x256 pixels or smaller.", (byte) 1),
    DIMENSIONS_64_x_64_OR_SMALLER("All images are 64x64 pixels or smaller.", (byte) 2),
    DIMENSIONS_64_X_64("All images are exactly 64x64 pixels, unless required otherwise.", (byte) 3);

    private String description;
    private byte mask;

    ImageSizeRestriction(String str, byte b) {
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

    public static ImageSizeRestriction valueOf(int i) throws IllegalArgumentException {
        for (ImageSizeRestriction imageSizeRestriction : values()) {
            if (i == imageSizeRestriction.ordinal()) {
                return imageSizeRestriction;
            }
        }
        throw new IllegalArgumentException("Invalid image size restriction " + i + ".");
    }
}
