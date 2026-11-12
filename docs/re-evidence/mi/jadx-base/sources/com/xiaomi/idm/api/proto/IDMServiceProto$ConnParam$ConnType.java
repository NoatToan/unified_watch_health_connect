package com.xiaomi.idm.api.proto;

import com.google.protobuf.d0;

/* JADX INFO: loaded from: classes11.dex */
public enum IDMServiceProto$ConnParam$ConnType implements d0.c {
    WIFI_P2P_GO(0),
    WIFI_P2P_GC(1),
    WIFI_SOFTAP(2),
    WIFI_STATION(3),
    BT_RFCOMM(4),
    BT_GATT(8),
    BLE_GATT(16),
    COAP(32),
    NFC(64),
    IDB(128),
    WLAN_P2P(256),
    WLAN_SOFTAP(512),
    WLAN_GC_SOFTAP(1024),
    UNKNOWN(-1),
    UNRECOGNIZED(-1);

    public static final int BLE_GATT_VALUE = 16;
    public static final int BT_GATT_VALUE = 8;
    public static final int BT_RFCOMM_VALUE = 4;
    public static final int COAP_VALUE = 32;
    public static final int IDB_VALUE = 128;
    public static final int NFC_VALUE = 64;
    public static final int UNKNOWN_VALUE = -1;
    public static final int WIFI_P2P_GC_VALUE = 1;
    public static final int WIFI_P2P_GO_VALUE = 0;
    public static final int WIFI_SOFTAP_VALUE = 2;
    public static final int WIFI_STATION_VALUE = 3;
    public static final int WLAN_GC_SOFTAP_VALUE = 1024;
    public static final int WLAN_P2P_VALUE = 256;
    public static final int WLAN_SOFTAP_VALUE = 512;
    private static final d0.d<IDMServiceProto$ConnParam$ConnType> internalValueMap = new d0.d<IDMServiceProto$ConnParam$ConnType>() { // from class: com.xiaomi.idm.api.proto.IDMServiceProto$ConnParam$ConnType.a
        @Override // com.google.protobuf.d0.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IDMServiceProto$ConnParam$ConnType findValueByNumber(int i) {
            return IDMServiceProto$ConnParam$ConnType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements d0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d0.e f13580a = new b();

        @Override // com.google.protobuf.d0.e
        public boolean isInRange(int i) {
            return IDMServiceProto$ConnParam$ConnType.forNumber(i) != null;
        }
    }

    IDMServiceProto$ConnParam$ConnType(int i) {
        this.value = i;
    }

    public static IDMServiceProto$ConnParam$ConnType forNumber(int i) {
        if (i == -1) {
            return UNKNOWN;
        }
        if (i == 0) {
            return WIFI_P2P_GO;
        }
        if (i == 1) {
            return WIFI_P2P_GC;
        }
        if (i == 2) {
            return WIFI_SOFTAP;
        }
        if (i == 3) {
            return WIFI_STATION;
        }
        if (i == 4) {
            return BT_RFCOMM;
        }
        if (i == 8) {
            return BT_GATT;
        }
        if (i == 16) {
            return BLE_GATT;
        }
        if (i == 32) {
            return COAP;
        }
        if (i == 64) {
            return NFC;
        }
        if (i == 128) {
            return IDB;
        }
        if (i == 256) {
            return WLAN_P2P;
        }
        if (i == 512) {
            return WLAN_SOFTAP;
        }
        if (i != 1024) {
            return null;
        }
        return WLAN_GC_SOFTAP;
    }

    public static d0.d<IDMServiceProto$ConnParam$ConnType> internalGetValueMap() {
        return internalValueMap;
    }

    public static d0.e internalGetVerifier() {
        return b.f13580a;
    }

    @Override // com.google.protobuf.d0.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static IDMServiceProto$ConnParam$ConnType valueOf(int i) {
        return forNumber(i);
    }
}
