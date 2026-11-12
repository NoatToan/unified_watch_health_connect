package com.huawei.datatype;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eeq;
import defpackage.lst;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceCommand implements Parcelable {
    private static final int ARRAY_MAX_SIZE = 65535;
    public static final Parcelable.Creator<DeviceCommand> CREATOR = new Parcelable.Creator<DeviceCommand>() { // from class: com.huawei.datatype.DeviceCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceCommand[] newArray(int i) {
            if (i > 65535 || i < 0) {
                return null;
            }
            return new DeviceCommand[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceCommand createFromParcel(Parcel parcel) {
            byte[] bArr;
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(parcel.readInt());
            deviceCommand.setCommandID(parcel.readInt());
            deviceCommand.setDataLen(parcel.readInt());
            deviceCommand.setmIdentify(parcel.readString());
            deviceCommand.setPriority(parcel.readInt());
            deviceCommand.setNeedAck(parcel.readByte() != 0);
            deviceCommand.setNeedEncrypt(parcel.readByte() != 0);
            int i = parcel.readInt();
            if (i <= 0 || i >= 102400) {
                bArr = null;
            } else {
                bArr = new byte[i];
                parcel.readByteArray(bArr);
            }
            deviceCommand.setDataContent(bArr);
            return deviceCommand;
        }
    };
    private static final int DATA_LIMIT_SIZE = 102400;
    private int mCommandId;
    private byte[] mDataContents;
    private int mDataLength;
    private String mIdentify;
    private int mServiceId;
    private int mPriority = 1;
    private boolean mIsNeedAck = false;
    private boolean mIsNeedEncrypt = true;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void setServiceID(int i) {
        this.mServiceId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void setServiceId(int i) {
        this.mServiceId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getServiceID() {
        return ((Integer) lst.d(Integer.valueOf(this.mServiceId))).intValue();
    }

    public int getServiceId() {
        return ((Integer) lst.d(Integer.valueOf(this.mServiceId))).intValue();
    }

    public void setCommandID(int i) {
        this.mCommandId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void setCommandId(int i) {
        this.mCommandId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getCommandID() {
        return ((Integer) lst.d(Integer.valueOf(this.mCommandId))).intValue();
    }

    public int getCommandId() {
        return ((Integer) lst.d(Integer.valueOf(this.mCommandId))).intValue();
    }

    public void setDataLen(int i) {
        this.mDataLength = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void setDataLength(int i) {
        this.mDataLength = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getDataLen() {
        return ((Integer) lst.d(Integer.valueOf(this.mDataLength))).intValue();
    }

    public int getDataLength() {
        return ((Integer) lst.d(Integer.valueOf(this.mDataLength))).intValue();
    }

    public void setDataContent(byte[] bArr) {
        if (bArr != null) {
            this.mDataContents = (byte[]) lst.d(Arrays.copyOf(bArr, bArr.length));
        }
    }

    public byte[] getDataContent() {
        byte[] bArr = this.mDataContents;
        if (bArr != null) {
            return (byte[]) lst.d(Arrays.copyOf(bArr, bArr.length));
        }
        return new byte[0];
    }

    public void setPriority(int i) {
        this.mPriority = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getPriority() {
        return ((Integer) lst.d(Integer.valueOf(this.mPriority))).intValue();
    }

    public void setNeedAck(boolean z) {
        this.mIsNeedAck = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }

    public boolean getNeedAck() {
        return ((Boolean) lst.d(Boolean.valueOf(this.mIsNeedAck))).booleanValue();
    }

    public void setNeedEncrypt(boolean z) {
        this.mIsNeedEncrypt = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }

    public boolean getNeedEncrypt() {
        return ((Boolean) lst.d(Boolean.valueOf(this.mIsNeedEncrypt))).booleanValue();
    }

    public String getmIdentify() {
        return this.mIdentify;
    }

    public void setmIdentify(String str) {
        this.mIdentify = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mServiceId);
        parcel.writeInt(this.mCommandId);
        parcel.writeInt(this.mDataLength);
        parcel.writeString(this.mIdentify);
        parcel.writeInt(this.mPriority);
        parcel.writeByte(this.mIsNeedAck ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mIsNeedEncrypt ? (byte) 1 : (byte) 0);
        byte[] bArr = this.mDataContents;
        if (bArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr.length);
        }
        byte[] bArr2 = this.mDataContents;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
    }

    public String toString() {
        return "DeviceCommand{serviceId='" + eeq.d(this.mServiceId) + "', commandId='" + eeq.d(this.mCommandId) + "', dataLength='" + this.mDataLength + "', dataContents='" + eeq.e(this.mDataContents) + "'}";
    }
}
