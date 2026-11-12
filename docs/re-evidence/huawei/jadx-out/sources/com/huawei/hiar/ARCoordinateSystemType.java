package com.huawei.hiar;

/* JADX INFO: loaded from: classes33.dex */
public enum ARCoordinateSystemType {
    COORDINATE_SYSTEM_TYPE_UNKNOWN(-1),
    COORDINATE_SYSTEM_TYPE_3D_WORLD(0),
    COORDINATE_SYSTEM_TYPE_3D_SELF(1),
    COORDINATE_SYSTEM_TYPE_2D_IMAGE(2),
    COORDINATE_SYSTEM_TYPE_3D_CAMERA(3);

    private static final int DEFAULT_SIZE = 16;
    final int nativeCode;

    public int getKeyValues() {
        return this.nativeCode;
    }

    static ARCoordinateSystemType forNumber(int i) {
        for (ARCoordinateSystemType aRCoordinateSystemType : values()) {
            if (aRCoordinateSystemType.nativeCode == i) {
                return aRCoordinateSystemType;
            }
        }
        return COORDINATE_SYSTEM_TYPE_UNKNOWN;
    }

    ARCoordinateSystemType(int i) {
        this.nativeCode = i;
    }
}
