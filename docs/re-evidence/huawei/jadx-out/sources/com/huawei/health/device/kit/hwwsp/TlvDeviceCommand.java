package com.huawei.health.device.kit.hwwsp;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.eeq;
import defpackage.lst;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class TlvDeviceCommand implements Parcelable {
    public static final Parcelable.Creator<TlvDeviceCommand> CREATOR = new Parcelable.Creator<TlvDeviceCommand>() { // from class: com.huawei.health.device.kit.hwwsp.TlvDeviceCommand.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public TlvDeviceCommand[] newArray(int i) {
            return new TlvDeviceCommand[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TlvDeviceCommand createFromParcel(Parcel parcel) {
            byte[] bArr;
            TlvDeviceCommand tlvDeviceCommand = new TlvDeviceCommand();
            tlvDeviceCommand.setServiceId(parcel.readInt());
            tlvDeviceCommand.setCommandId(parcel.readInt());
            tlvDeviceCommand.setDataLength(parcel.readInt());
            tlvDeviceCommand.setIdentify(parcel.readString());
            tlvDeviceCommand.setNeedAck(parcel.readByte() != 0);
            tlvDeviceCommand.setNeedEncrypt(parcel.readByte() != 0);
            int i = parcel.readInt();
            if (i <= 0 || i >= 102400) {
                bArr = null;
            } else {
                bArr = new byte[i];
                parcel.readByteArray(bArr);
            }
            tlvDeviceCommand.setDataContent(bArr);
            return tlvDeviceCommand;
        }
    };
    private static final int DATA_LIMIT_SIZE = 102400;
    private int mCommandId;
    private byte[] mDataContents;
    private String mIdentify;
    private int mServiceId;
    private int mDataLength = 0;
    private boolean mIsNeedAck = false;
    private boolean mIsNeedEncrypt = true;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void setServiceId(int i) {
        this.mServiceId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getServiceId() {
        return ((Integer) lst.d(Integer.valueOf(this.mServiceId))).intValue();
    }

    public void setCommandId(int i) {
        this.mCommandId = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public int getCommandId() {
        return ((Integer) lst.d(Integer.valueOf(this.mCommandId))).intValue();
    }

    public void setDataLength(int i) {
        this.mDataLength = ((Integer) lst.d(Integer.valueOf(i))).intValue();
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

    public String getIdentify() {
        return this.mIdentify;
    }

    public void setIdentify(String str) {
        this.mIdentify = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mServiceId);
        parcel.writeInt(this.mCommandId);
        parcel.writeInt(this.mDataLength);
        parcel.writeString(this.mIdentify);
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
        return "TlvDeviceCommand{serviceId='" + eeq.d(this.mServiceId) + "', commandId='" + eeq.d(this.mCommandId) + "', dataLength='" + this.mDataLength + "', dataContents='" + eeq.e(this.mDataContents) + "'}";
    }
}
