package com.beaglebuddy.id3.enums.v24;

/* JADX INFO: loaded from: classes2.dex */
public enum TagSizeRestriction {
    TAG_SIZE_1_MB_AND_128_FRAMES("No more than 128 frames and 1 MB total tag size", (byte) 0),
    TAG_SIZE_128KB_AND_64_FRAMES("No more than 64 frames and 128 KB total tag size.", (byte) 64),
    TAG_SIZE_40KB_AND_32_FRAMES("No more than 32 frames and 40 KB total tag size.", (byte) -128),
    TAG_SIZE_4KB_AND_32_FRAMES("No more than 32 frames and 4 KB total tag size.", (byte) -64);

    private String description;
    private byte mask;

    TagSizeRestriction(String str, byte b) {
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

    public static TagSizeRestriction valueOf(int i) throws IllegalArgumentException {
        for (TagSizeRestriction tagSizeRestriction : values()) {
            if (i == tagSizeRestriction.ordinal()) {
                return tagSizeRestriction;
            }
        }
        throw new IllegalArgumentException("Invalid tag size restriction " + i + ".");
    }
}
