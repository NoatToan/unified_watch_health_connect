package com.xiaomi.continuity.channel;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.continuity.ServiceName;
import defpackage.j3s;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class ChannelInfo implements Parcelable {
    public static final Parcelable.Creator<ChannelInfo> CREATOR = new a();
    private String address;
    private int channelId;
    private int channelRole;
    private String deviceId;
    private boolean isSdkSocket;
    private String localAddress;
    private int peerChannelId;
    private int port;
    private ServiceName serviceName;
    private byte[] transKey;

    public class a implements Parcelable.Creator<ChannelInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChannelInfo createFromParcel(Parcel parcel) {
            return new ChannelInfo(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChannelInfo[] newArray(int i) {
            return new ChannelInfo[i];
        }
    }

    private ChannelInfo() {
    }

    private ChannelInfo(Parcel parcel) {
        this.channelId = parcel.readInt();
        this.peerChannelId = parcel.readInt();
        this.deviceId = parcel.readString();
        this.serviceName = (ServiceName) parcel.readParcelable(ServiceName.class.getClassLoader());
        this.address = parcel.readString();
        this.port = parcel.readInt();
        this.channelRole = parcel.readInt();
        this.isSdkSocket = parcel.readByte() != 0;
        this.localAddress = parcel.readString();
        int i = parcel.readInt();
        if (i != 32) {
            this.transKey = new byte[0];
            return;
        }
        byte[] bArr = new byte[i];
        this.transKey = bArr;
        parcel.readByteArray(bArr);
    }

    public void WipeTransKey() {
        int i = 0;
        while (true) {
            byte[] bArr = this.transKey;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return this.address;
    }

    public int getChannelId() {
        return this.channelId;
    }

    public int getChannelRole() {
        return this.channelRole;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getLocalAddress() {
        return this.localAddress;
    }

    public int getPeerChannelId() {
        return this.peerChannelId;
    }

    public int getPort() {
        return this.port;
    }

    public ServiceName getServiceName() {
        return this.serviceName;
    }

    public byte[] getTransKey() {
        return this.transKey;
    }

    public boolean isSdkSocket() {
        return this.isSdkSocket;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("ChannelInfo{channelId=");
        sbA.append(this.channelId);
        sbA.append(", peerChannelId=");
        sbA.append(this.peerChannelId);
        sbA.append(", deviceId='");
        sbA.append(this.deviceId);
        sbA.append('\'');
        sbA.append(", serviceName='");
        sbA.append(this.serviceName);
        sbA.append('\'');
        sbA.append(", port=");
        sbA.append(this.port);
        sbA.append(", channelRole=");
        sbA.append(this.channelRole);
        sbA.append(", isSdkSocket=");
        sbA.append(this.isSdkSocket);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.channelId);
        parcel.writeInt(this.peerChannelId);
        parcel.writeString(this.deviceId);
        parcel.writeParcelable(this.serviceName, i);
        parcel.writeString(this.address);
        parcel.writeInt(this.port);
        parcel.writeInt(this.channelRole);
        parcel.writeByte(this.isSdkSocket ? (byte) 1 : (byte) 0);
        parcel.writeString(this.localAddress);
        byte[] bArr = this.transKey;
        if (bArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.transKey);
        }
    }

    public /* synthetic */ ChannelInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    public /* synthetic */ ChannelInfo(a aVar) {
        this();
    }
}
