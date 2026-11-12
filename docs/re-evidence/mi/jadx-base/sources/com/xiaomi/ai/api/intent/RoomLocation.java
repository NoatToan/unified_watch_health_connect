package com.xiaomi.ai.api.intent;

/* JADX INFO: loaded from: classes7.dex */
public enum RoomLocation {
    Default(-1, "Default"),
    WholeHouse(0, "WholeHouse"),
    LivingRoom(1, "LivingRoom"),
    Bedroom(2, "Bedroom"),
    MasterBedroom(3, "MasterBedroom"),
    Kitchen(4, "Kitchen"),
    DiningRoom(5, "DiningRoom"),
    Toilet(6, "Toilet"),
    KidsRoom(7, "KidsRoom"),
    Study(8, "Study"),
    Library(9, "Library"),
    Balcony(10, "Balcony"),
    Workshop(11, "Workshop"),
    Bathroom(12, "Bathroom"),
    BackYard(13, "BackYard");

    private int id;
    private String name;

    RoomLocation(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static RoomLocation find(String str) {
        for (RoomLocation roomLocation : values()) {
            if (roomLocation.name.equals(str)) {
                return roomLocation;
            }
        }
        return Default;
    }

    public static RoomLocation read(String str) {
        return find(str);
    }

    public static String write(RoomLocation roomLocation) {
        return roomLocation.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
