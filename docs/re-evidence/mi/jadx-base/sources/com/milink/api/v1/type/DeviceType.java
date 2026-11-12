package com.milink.api.v1.type;

/* JADX INFO: loaded from: classes5.dex */
public enum DeviceType {
    Unknown,
    TV,
    Speaker,
    Miracast,
    Lelink,
    Bluetooth,
    MiPlay;

    public static final String AIRKAN = "airkan";
    public static final String AIRPLAY = "airplay";
    public static final String AIRTUNES = "airtunes";
    public static final String BLUETOOTH = "bluetooth";
    public static final String DLNA_SPEAKER = "dlna.speaker";
    public static final String DLNA_TV = "dlna.tv";
    public static final String LELINK = "lelink";
    public static final String MIPLAY = "miplay";
    public static final String MIRACAST = "miracast";

    public static DeviceType create(String str) {
        if (!str.equalsIgnoreCase("airkan") && !str.equalsIgnoreCase(AIRPLAY)) {
            if (str.equalsIgnoreCase(AIRTUNES)) {
                return Speaker;
            }
            if (str.equalsIgnoreCase("dlna.tv")) {
                return TV;
            }
            if (str.equalsIgnoreCase("dlna.speaker")) {
                return Speaker;
            }
            if (str.equalsIgnoreCase("miracast")) {
                return Miracast;
            }
            if (str.equalsIgnoreCase("lelink")) {
                return Lelink;
            }
            if (str.equalsIgnoreCase("bluetooth")) {
                return Bluetooth;
            }
            return str.equalsIgnoreCase("miplay") ? MiPlay : Unknown;
        }
        return TV;
    }
}
