package com.huawei.harmonyos.interwork;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.appcompat.app.AppCompatDelegate;
import defpackage.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class DeviceInfo implements Parcelable {
    public static final Parcelable.Creator<DeviceInfo> CREATOR = new a();
    public static final int FLAG_GET_ALL_DEVICE = 0;
    public static final int FLAG_GET_OFFLINE_DEVICE = 2;
    public static final int FLAG_GET_ONLINE_DEVICE = 1;
    private static final String TAG = "DefKitLib_DeviceInfo";
    private String mDeviceId;
    private String mDeviceName;
    private DeviceState mDeviceState;
    private DeviceType mDeviceType;

    public enum DeviceState {
        UNKNOWN,
        ONLINE,
        OFFLINE
    }

    public enum DeviceType {
        UNKNOWN_TYPE(0),
        AUDIO(10),
        PHONE(14),
        PAD(17),
        WATCH(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY),
        CAR(131),
        TELEVISION(156);

        private static final Map<Integer, DeviceType> DEVICE_TYPE_MAP = new HashMap();
        private final int mVal;

        static {
            for (DeviceType deviceType : values()) {
                DEVICE_TYPE_MAP.put(Integer.valueOf(deviceType.value()), deviceType);
            }
        }

        DeviceType(int i) {
            this.mVal = i;
        }

        public int value() {
            return this.mVal;
        }

        public static DeviceType valueOf(int i) {
            return DEVICE_TYPE_MAP.getOrDefault(Integer.valueOf(i), UNKNOWN_TYPE);
        }
    }

    public /* synthetic */ DeviceInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public String getDeviceName() {
        return this.mDeviceName;
    }

    public DeviceState getDeviceState() {
        return this.mDeviceState;
    }

    public DeviceType getDeviceType() {
        return this.mDeviceType;
    }

    public boolean isDeviceOnline() {
        return this.mDeviceState == DeviceState.ONLINE;
    }

    public void setDeviceInfo(String str, String str2) {
        this.mDeviceId = str;
        this.mDeviceName = str2;
    }

    public void setDeviceState(DeviceState deviceState) {
        Log.i(TAG, "Device state change : " + this.mDeviceState + " -> " + deviceState);
        this.mDeviceState = deviceState;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.mDeviceType = deviceType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            return;
        }
        parcel.writeInterfaceToken(TAG);
        parcel.writeString(this.mDeviceId);
        parcel.writeString(this.mDeviceName);
        parcel.writeInt(this.mDeviceType.ordinal());
        parcel.writeInt(this.mDeviceState.ordinal());
    }

    public DeviceInfo(String str, String str2) {
        this.mDeviceId = str;
        this.mDeviceName = str2;
        this.mDeviceType = DeviceType.PHONE;
        this.mDeviceState = DeviceState.OFFLINE;
    }

    private DeviceInfo(Parcel parcel) {
        if (parcel == null) {
            return;
        }
        parcel.enforceInterface(TAG);
        this.mDeviceId = parcel.readString();
        this.mDeviceName = parcel.readString();
        int i = parcel.readInt();
        int i2 = 0;
        this.mDeviceType = DeviceType.values()[(i < 0 || i >= DeviceType.values().length) ? 0 : i];
        int i3 = parcel.readInt();
        if (i3 >= 0 && i3 < DeviceState.values().length) {
            i2 = i3;
        }
        this.mDeviceState = DeviceState.values()[i2];
    }
}
