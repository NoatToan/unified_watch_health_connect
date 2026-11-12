package com.huami.moving.maps;

/* JADX INFO: loaded from: classes11.dex */
public class MapMode {
    public static final int SATELLITE_MODE = 2;
    public static final int STREET_MODE = 1;

    public static boolean isValidMode(int i) {
        return 1 == i || i == 2;
    }
}
