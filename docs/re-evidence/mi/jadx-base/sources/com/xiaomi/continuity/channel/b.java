package com.xiaomi.continuity.channel;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xiaomi.continuity.ServiceName;

/* JADX INFO: loaded from: classes7.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        public a() {
            attachInterface(this, "com.xiaomi.continuity.channel.IChannelInnerListener");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.continuity.channel.IChannelInnerListener");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.xiaomi.continuity.channel.IChannelInnerListener");
                    onChannelConfirm(parcel.readString(), parcel.readInt() != 0 ? ServiceName.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt() != 0 ? ConfirmInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.xiaomi.continuity.channel.IChannelInnerListener");
                    onChannelCreated(parcel.readString(), parcel.readInt() != 0 ? ServiceName.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? ChannelInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.xiaomi.continuity.channel.IChannelInnerListener");
                    onChannelCreateFailed(parcel.readString(), parcel.readInt() != 0 ? ServiceName.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("com.xiaomi.continuity.channel.IChannelInnerListener");
                    onChannelRelease(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("com.xiaomi.continuity.channel.IChannelInnerListener");
                    onReceived(parcel.readInt(), parcel.createByteArray(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.xiaomi.continuity.channel.IChannelInnerListener");
                    onServerRegisterStatus(parcel.readInt() != 0 ? ServiceName.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.xiaomi.continuity.channel.IChannelInnerListener");
                    onRequestSocketPort(parcel.readString(), parcel.readInt() != 0 ? ServiceName.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface("com.xiaomi.continuity.channel.IChannelInnerListener");
                    String features = getFeatures();
                    parcel2.writeNoException();
                    parcel2.writeString(features);
                    return true;
                case 9:
                    parcel.enforceInterface("com.xiaomi.continuity.channel.IChannelInnerListener");
                    onChannelConfirmV2(parcel.readString(), parcel.readInt() != 0 ? ServiceName.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt() != 0 ? ConfirmInfoV2.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    String getFeatures();

    void onChannelConfirm(String str, ServiceName serviceName, int i, ConfirmInfo confirmInfo);

    void onChannelConfirmV2(String str, ServiceName serviceName, int i, ConfirmInfoV2 confirmInfoV2);

    void onChannelCreateFailed(String str, ServiceName serviceName, int i, int i2);

    void onChannelCreated(String str, ServiceName serviceName, ChannelInfo channelInfo);

    void onChannelRelease(int i, int i2);

    void onReceived(int i, byte[] bArr, int i2);

    void onRequestSocketPort(String str, ServiceName serviceName, int i);

    void onServerRegisterStatus(ServiceName serviceName, int i);
}
