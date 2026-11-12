package com.xiaomi.ai.api.intent.domain;

import androidx.health.connect.client.records.metadata.DeviceTypes;

/* JADX INFO: loaded from: classes7.dex */
public enum VehiclePosition {
    UNKNOWN(-1, DeviceTypes.UNKNOWN),
    DRIVER(0, "DRIVER"),
    PASSENGER(1, "PASSENGER"),
    FRONT(2, "FRONT"),
    REAR(3, "REAR"),
    WHOLE(4, "WHOLE"),
    LEFT_SEAT_OF_SECOND_ROW(5, "LEFT_SEAT_OF_SECOND_ROW"),
    RIGHT_SEAT_OF_SECOND_ROW(6, "RIGHT_SEAT_OF_SECOND_ROW"),
    FRONT_LEFT(7, "FRONT_LEFT"),
    FRONT_RIGHT(8, "FRONT_RIGHT"),
    REAR_LEFT(9, "REAR_LEFT"),
    REAR_RIGHT(10, "REAR_RIGHT"),
    LEFT_WINDOW(11, "LEFT_WINDOW"),
    RIGHT_WINDOW(12, "RIGHT_WINDOW");

    private int id;
    private String name;

    VehiclePosition(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public static VehiclePosition find(String str) {
        for (VehiclePosition vehiclePosition : values()) {
            if (vehiclePosition.name.equals(str)) {
                return vehiclePosition;
            }
        }
        if (values().length > 0) {
            return values()[0];
        }
        return null;
    }

    public static VehiclePosition read(String str) {
        return find(str);
    }

    public static String write(VehiclePosition vehiclePosition) {
        return vehiclePosition.getName();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
