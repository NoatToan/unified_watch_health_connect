package com.ingenic.iwds.uniconnect.link;

/* JADX INFO: loaded from: classes18.dex */
public abstract class RemoteDevice {
    public static int TYPE_BLUETOOTH_CLASSIC = 0;
    public static int TYPE_BLUETOOTH_DUAL = 1;
    public static int TYPE_BLUETOOTH_LE = 2;
    public static int TYPE_BLUETOOTH_UNKNOWN = 3;

    public abstract boolean equals(Object obj);

    public abstract String getAddress();

    public abstract int getDeviceType();

    public abstract String getName();

    public abstract int hashCode();

    public abstract String toString();
}
