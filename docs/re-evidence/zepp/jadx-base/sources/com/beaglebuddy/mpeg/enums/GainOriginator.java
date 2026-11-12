package com.beaglebuddy.mpeg.enums;

import com.huami.watch.companion.facestore.database.WactchFacesProvider;

/* JADX INFO: loaded from: classes2.dex */
public enum GainOriginator {
    NOT_SET("not set"),
    ARTIST(WactchFacesProvider.DatabaseHelper.ARTIST),
    USER("user"),
    MODEL("model"),
    RMS_AVERAGE("RMS average");

    private String name;

    GainOriginator(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public static GainOriginator valueOf(int i) throws IllegalArgumentException {
        for (GainOriginator gainOriginator : values()) {
            if (i == gainOriginator.ordinal()) {
                return gainOriginator;
            }
        }
        throw new IllegalArgumentException("Invalid LAME replay gain originator, " + i + ".  It must be 0 <= originator <= " + RMS_AVERAGE.ordinal() + ".");
    }
}
