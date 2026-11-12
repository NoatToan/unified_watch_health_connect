package com.xiaomi.continuity.networking;

/* JADX INFO: loaded from: classes7.dex */
public enum PropertyType {
    PropIpAddr,
    PropBtAddr,
    PropP2PAddr,
    PropSupportP2P,
    PropSupportRfcomm,
    PropSupportNogroup,
    PropOSType,
    PropProductID,
    PropLyraVersion,
    PropScreenState,
    PropSupportLinkData,
    PropBuildRegion,
    PropUserId,
    PropMarketName;

    public static PropertyType fromInteger(int i) {
        return values()[i];
    }

    public int toInteger() {
        return ordinal();
    }
}
