package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum NearbyType {
    Ahead(0, "Ahead"),
    NextTo(1, "NextTo"),
    Left(2, "Left"),
    Right(3, "Right"),
    Behind(4, "Behind"),
    DiagonallyAhead(5, "DiagonallyAhead"),
    DiagonallyBehind(6, "DiagonallyBehind"),
    LeftAhead(7, "LeftAhead"),
    RightAhead(8, "RightAhead"),
    LeftBehind(9, "LeftBehind"),
    RightBehind(10, "RightBehind");

    private int id;
    private String name;

    NearbyType(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static NearbyType find(String str) {
        for (NearbyType nearbyType : values()) {
            if (nearbyType.name.equals(str)) {
                return nearbyType;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static NearbyType read(String str) {
        return find(str);
    }

    public static String write(NearbyType nearbyType) {
        return nearbyType.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
