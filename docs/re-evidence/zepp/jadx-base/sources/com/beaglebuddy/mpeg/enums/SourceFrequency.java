package com.beaglebuddy.mpeg.enums;

/* JADX INFO: loaded from: classes2.dex */
public enum SourceFrequency {
    FREQ_32KHZ("32 kHz or smaller"),
    FREQ_44_1KHZ("44.1 kHz"),
    FREQ_48_KHZ("48 kHz"),
    FREQ_HIGHER("higher than 48kHz");

    private String name;

    SourceFrequency(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public static SourceFrequency valueOf(int i) throws IllegalArgumentException {
        for (SourceFrequency sourceFrequency : values()) {
            if (i == sourceFrequency.ordinal()) {
                return sourceFrequency;
            }
        }
        throw new IllegalArgumentException("Invalid source frequency " + i + ".  It must be 0 <= source frequency <= " + FREQ_HIGHER.ordinal() + ".");
    }
}
