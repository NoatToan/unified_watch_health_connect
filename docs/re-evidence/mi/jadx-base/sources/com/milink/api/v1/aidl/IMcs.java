package com.milink.api.v1.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public interface IMcs extends IInterface {

    public static class Default implements IMcs {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int connect(String str, int i) throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int connectWifiDisplay(String str, String str2, String str3, IMcsMiracastConnectCallback iMcsMiracastConnectCallback) throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int disconnect() throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int disconnectWifiDisplay() throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public void dismissScanList() throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int getPlaybackDuration() throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int getPlaybackProgress() throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int getPlaybackRate() throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int getVolume() throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int rotatePhoto(String str, boolean z, float f) throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public void selectDevice(String str, String str2, String str3) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public void setDataSource(IMcsDataSource iMcsDataSource) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public void setDelegate(IMcsDelegate iMcsDelegate) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public void setDeviceListener(IMcsDeviceListener iMcsDeviceListener) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public void setDeviceName(String str) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int setPlaybackProgress(int i) throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int setPlaybackRate(int i) throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int setVolume(int i) throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int show(String str) throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public void showScanList(IMcsScanListCallback iMcsScanListCallback, int i) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int startPlayAudio(String str, String str2, int i, double d) throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int startPlayAudioEx(String str, String str2, String str3, int i, double d) throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int startPlayVideo(String str, String str2, int i, double d) throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int startPlayVideoEx(String str, String str2, String str3, int i, double d) throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int startShow() throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int startSlideshow(int i, boolean z) throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int startTvMiracast(String str, String str2, String str3, String str4, String str5, IMcsOpenMiracastListener iMcsOpenMiracastListener) throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public boolean startWifiDisplayScan() throws RemoteException {
            return false;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int stopPlay() throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int stopShow() throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int stopSlideshow() throws RemoteException {
            return 0;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public boolean stopWifiDisplayScan() throws RemoteException {
            return false;
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public void unsetDataSource(IMcsDataSource iMcsDataSource) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public void unsetDelegate(IMcsDelegate iMcsDelegate) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public void unsetDeviceListener(IMcsDeviceListener iMcsDeviceListener) throws RemoteException {
        }

        @Override // com.milink.api.v1.aidl.IMcs
        public int zoomPhoto(String str, int i, int i2, int i3, int i4, int i5, int i6, float f) throws RemoteException {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IMcs {
        private static final String DESCRIPTOR = "com.milink.api.v1.aidl.IMcs";
        static final int TRANSACTION_connect = 13;
        static final int TRANSACTION_connectWifiDisplay = 14;
        static final int TRANSACTION_disconnect = 17;
        static final int TRANSACTION_disconnectWifiDisplay = 15;
        static final int TRANSACTION_dismissScanList = 9;
        static final int TRANSACTION_getPlaybackDuration = 31;
        static final int TRANSACTION_getPlaybackProgress = 30;
        static final int TRANSACTION_getPlaybackRate = 28;
        static final int TRANSACTION_getVolume = 33;
        static final int TRANSACTION_rotatePhoto = 34;
        static final int TRANSACTION_selectDevice = 10;
        static final int TRANSACTION_setDataSource = 3;
        static final int TRANSACTION_setDelegate = 5;
        static final int TRANSACTION_setDeviceListener = 1;
        static final int TRANSACTION_setDeviceName = 7;
        static final int TRANSACTION_setPlaybackProgress = 29;
        static final int TRANSACTION_setPlaybackRate = 27;
        static final int TRANSACTION_setVolume = 32;
        static final int TRANSACTION_show = 19;
        static final int TRANSACTION_showScanList = 8;
        static final int TRANSACTION_startPlayAudio = 25;
        static final int TRANSACTION_startPlayAudioEx = 36;
        static final int TRANSACTION_startPlayVideo = 24;
        static final int TRANSACTION_startPlayVideoEx = 35;
        static final int TRANSACTION_startShow = 18;
        static final int TRANSACTION_startSlideshow = 22;
        static final int TRANSACTION_startTvMiracast = 16;
        static final int TRANSACTION_startWifiDisplayScan = 11;
        static final int TRANSACTION_stopPlay = 26;
        static final int TRANSACTION_stopShow = 21;
        static final int TRANSACTION_stopSlideshow = 23;
        static final int TRANSACTION_stopWifiDisplayScan = 12;
        static final int TRANSACTION_unsetDataSource = 4;
        static final int TRANSACTION_unsetDelegate = 6;
        static final int TRANSACTION_unsetDeviceListener = 2;
        static final int TRANSACTION_zoomPhoto = 20;

        public static class Proxy implements IMcs {
            public static IMcs sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int connect(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(13, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().connect(str, i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int connectWifiDisplay(String str, String str2, String str3, IMcsMiracastConnectCallback iMcsMiracastConnectCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeStrongBinder(iMcsMiracastConnectCallback != null ? iMcsMiracastConnectCallback.asBinder() : null);
                    if (!this.mRemote.transact(14, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().connectWifiDisplay(str, str2, str3, iMcsMiracastConnectCallback);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int disconnect() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(17, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().disconnect();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int disconnectWifiDisplay() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(15, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().disconnectWifiDisplay();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public void dismissScanList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().dismissScanList();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int getPlaybackDuration() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(31, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPlaybackDuration();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int getPlaybackProgress() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(30, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPlaybackProgress();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int getPlaybackRate() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(28, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPlaybackRate();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int getVolume() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(33, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVolume();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int rotatePhoto(String str, boolean z, float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeFloat(f);
                    if (!this.mRemote.transact(34, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().rotatePhoto(str, z, f);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public void selectDevice(String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    if (this.mRemote.transact(10, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().selectDevice(str, str2, str3);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public void setDataSource(IMcsDataSource iMcsDataSource) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMcsDataSource != null ? iMcsDataSource.asBinder() : null);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setDataSource(iMcsDataSource);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public void setDelegate(IMcsDelegate iMcsDelegate) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMcsDelegate != null ? iMcsDelegate.asBinder() : null);
                    if (this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setDelegate(iMcsDelegate);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public void setDeviceListener(IMcsDeviceListener iMcsDeviceListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMcsDeviceListener != null ? iMcsDeviceListener.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setDeviceListener(iMcsDeviceListener);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public void setDeviceName(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setDeviceName(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int setPlaybackProgress(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(29, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setPlaybackProgress(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int setPlaybackRate(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(27, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setPlaybackRate(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int setVolume(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(32, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setVolume(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int show(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(19, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().show(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public void showScanList(IMcsScanListCallback iMcsScanListCallback, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMcsScanListCallback != null ? iMcsScanListCallback.asBinder() : null);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().showScanList(iMcsScanListCallback, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int startPlayAudio(String str, String str2, int i, double d) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeDouble(d);
                    if (!this.mRemote.transact(25, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startPlayAudio(str, str2, i, d);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int startPlayAudioEx(String str, String str2, String str3, int i, double d) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeDouble(d);
                    try {
                        if (!this.mRemote.transact(36, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                            int iStartPlayAudioEx = Stub.getDefaultImpl().startPlayAudioEx(str, str2, str3, i, d);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return iStartPlayAudioEx;
                        }
                        parcelObtain2.readException();
                        int i2 = parcelObtain2.readInt();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return i2;
                    } catch (Throwable th) {
                        th = th;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int startPlayVideo(String str, String str2, int i, double d) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeDouble(d);
                    if (!this.mRemote.transact(24, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startPlayVideo(str, str2, i, d);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int startPlayVideoEx(String str, String str2, String str3, int i, double d) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeDouble(d);
                    try {
                        if (!this.mRemote.transact(35, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                            int iStartPlayVideoEx = Stub.getDefaultImpl().startPlayVideoEx(str, str2, str3, i, d);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return iStartPlayVideoEx;
                        }
                        parcelObtain2.readException();
                        int i2 = parcelObtain2.readInt();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return i2;
                    } catch (Throwable th) {
                        th = th;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int startShow() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(18, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startShow();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int startSlideshow(int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.mRemote.transact(22, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startSlideshow(i, z);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int startTvMiracast(String str, String str2, String str3, String str4, String str5, IMcsOpenMiracastListener iMcsOpenMiracastListener) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    parcelObtain.writeString(str5);
                    parcelObtain.writeStrongBinder(iMcsOpenMiracastListener != null ? iMcsOpenMiracastListener.asBinder() : null);
                    try {
                        if (!this.mRemote.transact(16, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                            int iStartTvMiracast = Stub.getDefaultImpl().startTvMiracast(str, str2, str3, str4, str5, iMcsOpenMiracastListener);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return iStartTvMiracast;
                        }
                        parcelObtain2.readException();
                        int i = parcelObtain2.readInt();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return i;
                    } catch (Throwable th) {
                        th = th;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public boolean startWifiDisplayScan() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(11, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().startWifiDisplayScan();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int stopPlay() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(26, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopPlay();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int stopShow() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(21, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopShow();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int stopSlideshow() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(23, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopSlideshow();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public boolean stopWifiDisplayScan() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(12, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stopWifiDisplayScan();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public void unsetDataSource(IMcsDataSource iMcsDataSource) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMcsDataSource != null ? iMcsDataSource.asBinder() : null);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unsetDataSource(iMcsDataSource);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public void unsetDelegate(IMcsDelegate iMcsDelegate) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMcsDelegate != null ? iMcsDelegate.asBinder() : null);
                    if (this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unsetDelegate(iMcsDelegate);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public void unsetDeviceListener(IMcsDeviceListener iMcsDeviceListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMcsDeviceListener != null ? iMcsDeviceListener.asBinder() : null);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().unsetDeviceListener(iMcsDeviceListener);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.api.v1.aidl.IMcs
            public int zoomPhoto(String str, int i, int i2, int i3, int i4, int i5, int i6, float f) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeInt(i5);
                    parcelObtain.writeInt(i6);
                    parcelObtain.writeFloat(f);
                    try {
                        if (!this.mRemote.transact(20, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                            int iZoomPhoto = Stub.getDefaultImpl().zoomPhoto(str, i, i2, i3, i4, i5, i6, f);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return iZoomPhoto;
                        }
                        parcelObtain2.readException();
                        int i7 = parcelObtain2.readInt();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return i7;
                    } catch (Throwable th) {
                        th = th;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMcs asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMcs)) ? new Proxy(iBinder) : (IMcs) iInterfaceQueryLocalInterface;
        }

        public static IMcs getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMcs iMcs) {
            if (Proxy.sDefaultImpl != null || iMcs == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMcs;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    setDeviceListener(IMcsDeviceListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    unsetDeviceListener(IMcsDeviceListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    setDataSource(IMcsDataSource.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    unsetDataSource(IMcsDataSource.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    setDelegate(IMcsDelegate.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    unsetDelegate(IMcsDelegate.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    setDeviceName(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    showScanList(IMcsScanListCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    dismissScanList();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    selectDevice(parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStartWifiDisplayScan = startWifiDisplayScan();
                    parcel2.writeNoException();
                    parcel2.writeInt(zStartWifiDisplayScan ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStopWifiDisplayScan = stopWifiDisplayScan();
                    parcel2.writeNoException();
                    parcel2.writeInt(zStopWifiDisplayScan ? 1 : 0);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iConnect = connect(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iConnect);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iConnectWifiDisplay = connectWifiDisplay(parcel.readString(), parcel.readString(), parcel.readString(), IMcsMiracastConnectCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iConnectWifiDisplay);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iDisconnectWifiDisplay = disconnectWifiDisplay();
                    parcel2.writeNoException();
                    parcel2.writeInt(iDisconnectWifiDisplay);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStartTvMiracast = startTvMiracast(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), IMcsOpenMiracastListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartTvMiracast);
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iDisconnect = disconnect();
                    parcel2.writeNoException();
                    parcel2.writeInt(iDisconnect);
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStartShow = startShow();
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartShow);
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iShow = show(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(iShow);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iZoomPhoto = zoomPhoto(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat());
                    parcel2.writeNoException();
                    parcel2.writeInt(iZoomPhoto);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStopShow = stopShow();
                    parcel2.writeNoException();
                    parcel2.writeInt(iStopShow);
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStartSlideshow = startSlideshow(parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartSlideshow);
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStopSlideshow = stopSlideshow();
                    parcel2.writeNoException();
                    parcel2.writeInt(iStopSlideshow);
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStartPlayVideo = startPlayVideo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readDouble());
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartPlayVideo);
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStartPlayAudio = startPlayAudio(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readDouble());
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartPlayAudio);
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStopPlay = stopPlay();
                    parcel2.writeNoException();
                    parcel2.writeInt(iStopPlay);
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    int playbackRate = setPlaybackRate(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(playbackRate);
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    int playbackRate2 = getPlaybackRate();
                    parcel2.writeNoException();
                    parcel2.writeInt(playbackRate2);
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    int playbackProgress = setPlaybackProgress(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(playbackProgress);
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    int playbackProgress2 = getPlaybackProgress();
                    parcel2.writeNoException();
                    parcel2.writeInt(playbackProgress2);
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    int playbackDuration = getPlaybackDuration();
                    parcel2.writeNoException();
                    parcel2.writeInt(playbackDuration);
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    int volume = setVolume(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(volume);
                    return true;
                case 33:
                    parcel.enforceInterface(DESCRIPTOR);
                    int volume2 = getVolume();
                    parcel2.writeNoException();
                    parcel2.writeInt(volume2);
                    return true;
                case 34:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iRotatePhoto = rotatePhoto(parcel.readString(), parcel.readInt() != 0, parcel.readFloat());
                    parcel2.writeNoException();
                    parcel2.writeInt(iRotatePhoto);
                    return true;
                case 35:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStartPlayVideoEx = startPlayVideoEx(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readDouble());
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartPlayVideoEx);
                    return true;
                case 36:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iStartPlayAudioEx = startPlayAudioEx(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readDouble());
                    parcel2.writeNoException();
                    parcel2.writeInt(iStartPlayAudioEx);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    int connect(String str, int i) throws RemoteException;

    int connectWifiDisplay(String str, String str2, String str3, IMcsMiracastConnectCallback iMcsMiracastConnectCallback) throws RemoteException;

    int disconnect() throws RemoteException;

    int disconnectWifiDisplay() throws RemoteException;

    void dismissScanList() throws RemoteException;

    int getPlaybackDuration() throws RemoteException;

    int getPlaybackProgress() throws RemoteException;

    int getPlaybackRate() throws RemoteException;

    int getVolume() throws RemoteException;

    int rotatePhoto(String str, boolean z, float f) throws RemoteException;

    void selectDevice(String str, String str2, String str3) throws RemoteException;

    void setDataSource(IMcsDataSource iMcsDataSource) throws RemoteException;

    void setDelegate(IMcsDelegate iMcsDelegate) throws RemoteException;

    void setDeviceListener(IMcsDeviceListener iMcsDeviceListener) throws RemoteException;

    void setDeviceName(String str) throws RemoteException;

    int setPlaybackProgress(int i) throws RemoteException;

    int setPlaybackRate(int i) throws RemoteException;

    int setVolume(int i) throws RemoteException;

    int show(String str) throws RemoteException;

    void showScanList(IMcsScanListCallback iMcsScanListCallback, int i) throws RemoteException;

    int startPlayAudio(String str, String str2, int i, double d) throws RemoteException;

    int startPlayAudioEx(String str, String str2, String str3, int i, double d) throws RemoteException;

    int startPlayVideo(String str, String str2, int i, double d) throws RemoteException;

    int startPlayVideoEx(String str, String str2, String str3, int i, double d) throws RemoteException;

    int startShow() throws RemoteException;

    int startSlideshow(int i, boolean z) throws RemoteException;

    int startTvMiracast(String str, String str2, String str3, String str4, String str5, IMcsOpenMiracastListener iMcsOpenMiracastListener) throws RemoteException;

    boolean startWifiDisplayScan() throws RemoteException;

    int stopPlay() throws RemoteException;

    int stopShow() throws RemoteException;

    int stopSlideshow() throws RemoteException;

    boolean stopWifiDisplayScan() throws RemoteException;

    void unsetDataSource(IMcsDataSource iMcsDataSource) throws RemoteException;

    void unsetDelegate(IMcsDelegate iMcsDelegate) throws RemoteException;

    void unsetDeviceListener(IMcsDeviceListener iMcsDeviceListener) throws RemoteException;

    int zoomPhoto(String str, int i, int i2, int i3, int i4, int i5, int i6, float f) throws RemoteException;
}
