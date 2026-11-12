package com.ingenic.iwds;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.ingenic.iwds.utils.IwdsAssert;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class DeviceDescriptor implements Parcelable {
    public static final Parcelable.Creator<DeviceDescriptor> CREATOR;
    public static final int DEVICE_CLASS_MOBILE = 2;
    public static final int DEVICE_CLASS_SMARTHOME = 1;
    public static final int DEVICE_CLASS_WEARABLE = 0;
    public static final int MOBILE_DEVICE_SUBCLASS_SMARTPHONE = 1;
    public static final int WEARABLE_DEVICE_SUBCLASS_GLASS = 2;
    public static final int WEARABLE_DEVICE_SUBCLASS_WATCH = 1;
    private static HashMap<Integer, ArrayList<Integer>> a = new HashMap<>();
    public int androidApiLevel;
    public String devAddress;
    public int devClass;
    public int devSubClass;
    public String displayID;
    public String extraInfo;
    public int iwdsVersion;
    public String lcdExterior;
    public String lcdSize;
    public String linkTag;
    public String manufacture;
    public String model;
    public String serialNo;

    public static class a implements Parcelable.Creator<DeviceDescriptor> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceDescriptor createFromParcel(Parcel parcel) {
            DeviceDescriptor deviceDescriptor = new DeviceDescriptor(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
            deviceDescriptor.model = parcel.readString();
            deviceDescriptor.manufacture = parcel.readString();
            deviceDescriptor.serialNo = parcel.readString();
            deviceDescriptor.displayID = parcel.readString();
            deviceDescriptor.androidApiLevel = parcel.readInt();
            deviceDescriptor.iwdsVersion = parcel.readInt();
            deviceDescriptor.lcdExterior = parcel.readString();
            deviceDescriptor.lcdSize = parcel.readString();
            deviceDescriptor.extraInfo = parcel.readString();
            return deviceDescriptor;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceDescriptor[] newArray(int i) {
            return new DeviceDescriptor[i];
        }
    }

    static {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        a.put(0, arrayList);
        a.put(1, new ArrayList<>());
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        a.put(2, arrayList2);
        CREATOR = new a();
    }

    public DeviceDescriptor(String str, String str2, int i, int i2) {
        IwdsAssert.dieIf(this, str == null || str.isEmpty(), "Device devAddress is null or empty.");
        IwdsAssert.dieIf(this, !a.containsKey(Integer.valueOf(i)), "Unknown device class, class code: " + i);
        IwdsAssert.dieIf(this, true ^ a.get(Integer.valueOf(i)).contains(Integer.valueOf(i2)), "Unknown sub device class, subclass code: " + i2);
        this.lcdExterior = HardwareList.getHardwareValue(HardwareList.KEY_LCD_EXTERIOR, "unknown");
        this.lcdSize = HardwareList.getHardwareValue(HardwareList.KEY_LCD_SIZE, "unknown");
        this.devAddress = str;
        this.linkTag = str2;
        this.devClass = i;
        this.devSubClass = i2;
        this.model = Build.MODEL;
        this.manufacture = Build.MANUFACTURER;
        this.serialNo = Build.SERIAL;
        this.displayID = Build.DISPLAY;
        this.androidApiLevel = Build.VERSION.SDK_INT;
        this.iwdsVersion = 10001;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeviceDescriptor)) {
            return false;
        }
        DeviceDescriptor deviceDescriptor = (DeviceDescriptor) obj;
        if (this.androidApiLevel != deviceDescriptor.androidApiLevel) {
            return false;
        }
        String str = this.devAddress;
        if (str == null) {
            if (deviceDescriptor.devAddress != null) {
                return false;
            }
        } else if (!str.equals(deviceDescriptor.devAddress)) {
            return false;
        }
        if (this.devClass != deviceDescriptor.devClass || this.devSubClass != deviceDescriptor.devSubClass || this.iwdsVersion != deviceDescriptor.iwdsVersion) {
            return false;
        }
        String str2 = this.linkTag;
        if (str2 == null) {
            if (deviceDescriptor.linkTag != null) {
                return false;
            }
        } else if (!str2.equals(deviceDescriptor.linkTag)) {
            return false;
        }
        String str3 = this.manufacture;
        if (str3 == null) {
            if (deviceDescriptor.manufacture != null) {
                return false;
            }
        } else if (!str3.equals(deviceDescriptor.manufacture)) {
            return false;
        }
        String str4 = this.model;
        if (str4 == null) {
            if (deviceDescriptor.model != null) {
                return false;
            }
        } else if (!str4.equals(deviceDescriptor.model)) {
            return false;
        }
        String str5 = this.serialNo;
        if (str5 == null) {
            if (deviceDescriptor.serialNo != null) {
                return false;
            }
        } else if (!str5.equals(deviceDescriptor.serialNo)) {
            return false;
        }
        String str6 = this.displayID;
        if (str6 == null) {
            if (deviceDescriptor.displayID != null) {
                return false;
            }
        } else if (!str6.equals(deviceDescriptor.displayID)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = (this.androidApiLevel + 31) * 31;
        String str = this.devAddress;
        int iHashCode = (((((((i + (str == null ? 0 : str.hashCode())) * 31) + this.devClass) * 31) + this.devSubClass) * 31) + this.iwdsVersion) * 31;
        String str2 = this.linkTag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.manufacture;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.model;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.serialNo;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayID;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "DeviceDescriptor [devAddress=" + this.devAddress + ", linkTag=" + this.linkTag + ", devClass=" + this.devClass + ", devSubClass=" + this.devSubClass + ", model=" + this.model + ", manufacture=" + this.manufacture + ", serialNo=" + this.serialNo + ", androidApiLevel=" + this.androidApiLevel + ", iwdsVersion=" + this.iwdsVersion + ", displayid=" + this.displayID + ", extraInfo : " + this.extraInfo + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.devAddress);
        parcel.writeString(this.linkTag);
        parcel.writeInt(this.devClass);
        parcel.writeInt(this.devSubClass);
        parcel.writeString(this.model);
        parcel.writeString(this.manufacture);
        parcel.writeString(this.serialNo);
        parcel.writeString(this.displayID);
        parcel.writeInt(this.androidApiLevel);
        parcel.writeInt(this.iwdsVersion);
        parcel.writeString(this.lcdExterior);
        parcel.writeString(this.lcdSize);
        parcel.writeString(this.extraInfo);
    }
}
