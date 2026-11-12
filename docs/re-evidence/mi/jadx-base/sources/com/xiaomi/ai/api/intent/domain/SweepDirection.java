package com.xiaomi.ai.api.intent.domain;

/* JADX INFO: loaded from: classes7.dex */
public enum SweepDirection {
    Center(0, "Center"),
    Around(1, "Around"),
    Front(2, "Front"),
    Back(3, "Back"),
    Left(4, "Left"),
    Right(5, "Right"),
    Up(6, "Up"),
    Down(7, "Down"),
    Outside(8, "Outside"),
    Inside(9, "Inside"),
    Opposite(10, "Opposite"),
    East(11, "East"),
    West(12, "West"),
    South(13, "South"),
    North(14, "North"),
    Northeast(15, "Northeast"),
    Northwest(16, "Northwest"),
    Southeast(17, "Southeast"),
    Southwest(18, "Southwest");

    private int id;
    private String name;

    SweepDirection(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static SweepDirection find(String str) {
        for (SweepDirection sweepDirection : values()) {
            if (sweepDirection.name.equals(str)) {
                return sweepDirection;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static SweepDirection read(String str) {
        return find(str);
    }

    public static String write(SweepDirection sweepDirection) {
        return sweepDirection.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
