package com.beaglebuddy.id3.enums;

/* JADX INFO: loaded from: classes2.dex */
public enum TimeStampFormat {
    MPEG(1, "absolute time, 32 bit sized, using MPEG frames as units"),
    MS(2, "absolute time, 32 bit sized, using milliseconds as units");

    private String description;
    private int value;

    TimeStampFormat(int i, String str) {
        this.value = i;
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public int getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "" + this.value + " - " + this.description;
    }

    public static TimeStampFormat valueOf(byte b) throws IllegalArgumentException {
        for (TimeStampFormat timeStampFormat : values()) {
            if (b == timeStampFormat.getValue()) {
                return timeStampFormat;
            }
        }
        throw new IllegalArgumentException("Invalid time stamp format " + ((int) b) + ".  It must be either 1 or 2.");
    }
}
