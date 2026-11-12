package com.milink.sdk.cast.v2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.milink.sdk.cast.IMiLinkCastCallback;
import com.milink.sdk.cast.IMiLinkDataCallback;
import com.milink.sdk.cast.IMiLinkDeviceListener;
import com.milink.sdk.cast.IMiLinkMediaCallback;
import com.milink.sdk.cast.IMiLinkPhotoSource;
import com.milink.sdk.cast.MiLinkDevice;

/* JADX INFO: loaded from: classes5.dex */
public interface IMiLinkCastServiceV2 extends IInterface {

    public static class Default implements IMiLinkCastServiceV2 {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public MiLinkDevice getConnectMiLinkDevice() throws RemoteException {
            return null;
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public long getDuration(String str) throws RemoteException {
            return 0L;
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public long getProgress(String str) throws RemoteException {
            return 0L;
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public float getRate(String str) throws RemoteException {
            return 0.0f;
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public int getVolume(String str) throws RemoteException {
            return 0;
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void init(String str, IMiLinkCastCallback iMiLinkCastCallback) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public boolean isAgreePrivacy() throws RemoteException {
            return false;
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public boolean isAuthDevice(String str) throws RemoteException {
            return false;
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public boolean isAuthDeviceConnecting() throws RemoteException {
            return false;
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public boolean isVerifyCodeInputShown() throws RemoteException {
            return false;
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void operatePhoto(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, float f) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void release(String str) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void send(String str, byte[] bArr) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public int setAgreePrivacy(boolean z) throws RemoteException {
            return 0;
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public boolean setClickSource(int i) throws RemoteException {
            return false;
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void setDataCallback(String str, IMiLinkDataCallback iMiLinkDataCallback) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void setMediaCallback(String str, IMiLinkMediaCallback iMiLinkMediaCallback) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void setPhotoSource(String str, IMiLinkPhotoSource iMiLinkPhotoSource) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void setProgress(String str, long j) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void setRate(String str, float f) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void setVolume(String str, int i) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void showPhoto(String str, String str2) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void showSlide(String str, int i) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void startConnect(String str, MiLinkDevice miLinkDevice, int i) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void startDiscovery(String str, int i, IMiLinkDeviceListener iMiLinkDeviceListener) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void startPhotoShow(String str) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void startPlayAudio(String str, String str2, String str3, String str4, int i, double d) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void startPlayVideo(String str, String str2, String str3, String str4, int i, double d) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void startWithUI(String str, int i) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void stopConnect(String str, int i) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void stopDiscovery(String str, int i) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void stopPhotoShow(String str) throws RemoteException {
        }

        @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
        public void stopPlay(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IMiLinkCastServiceV2 {
        private static final String DESCRIPTOR = "com.milink.sdk.cast.v2.IMiLinkCastServiceV2";
        static final int TRANSACTION_getConnectMiLinkDevice = 29;
        static final int TRANSACTION_getDuration = 20;
        static final int TRANSACTION_getProgress = 21;
        static final int TRANSACTION_getRate = 18;
        static final int TRANSACTION_getVolume = 23;
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_isAgreePrivacy = 27;
        static final int TRANSACTION_isAuthDevice = 31;
        static final int TRANSACTION_isAuthDeviceConnecting = 32;
        static final int TRANSACTION_isVerifyCodeInputShown = 30;
        static final int TRANSACTION_operatePhoto = 11;
        static final int TRANSACTION_release = 7;
        static final int TRANSACTION_send = 25;
        static final int TRANSACTION_setAgreePrivacy = 28;
        static final int TRANSACTION_setClickSource = 33;
        static final int TRANSACTION_setDataCallback = 26;
        static final int TRANSACTION_setMediaCallback = 14;
        static final int TRANSACTION_setPhotoSource = 8;
        static final int TRANSACTION_setProgress = 22;
        static final int TRANSACTION_setRate = 19;
        static final int TRANSACTION_setVolume = 24;
        static final int TRANSACTION_showPhoto = 10;
        static final int TRANSACTION_showSlide = 12;
        static final int TRANSACTION_startConnect = 5;
        static final int TRANSACTION_startDiscovery = 3;
        static final int TRANSACTION_startPhotoShow = 9;
        static final int TRANSACTION_startPlayAudio = 15;
        static final int TRANSACTION_startPlayVideo = 16;
        static final int TRANSACTION_startWithUI = 2;
        static final int TRANSACTION_stopConnect = 6;
        static final int TRANSACTION_stopDiscovery = 4;
        static final int TRANSACTION_stopPhotoShow = 13;
        static final int TRANSACTION_stopPlay = 17;

        public static class Proxy implements IMiLinkCastServiceV2 {
            public static IMiLinkCastServiceV2 sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public MiLinkDevice getConnectMiLinkDevice() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(29, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getConnectMiLinkDevice();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? MiLinkDevice.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public long getDuration(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(20, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDuration(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public long getProgress(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(21, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getProgress(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public float getRate(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(18, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRate(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readFloat();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public int getVolume(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(23, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVolume(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void init(String str, IMiLinkCastCallback iMiLinkCastCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iMiLinkCastCallback != null ? iMiLinkCastCallback.asBinder() : null);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().init(str, iMiLinkCastCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public boolean isAgreePrivacy() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(27, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isAgreePrivacy();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public boolean isAuthDevice(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (!this.mRemote.transact(31, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isAuthDevice(str);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public boolean isAuthDeviceConnecting() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(32, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isAuthDeviceConnecting();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public boolean isVerifyCodeInputShown() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(30, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isVerifyCodeInputShown();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void operatePhoto(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, float f) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeInt(i5);
                    parcelObtain.writeInt(i6);
                    parcelObtain.writeFloat(f);
                    try {
                        if (this.mRemote.transact(11, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } else {
                            Stub.getDefaultImpl().operatePhoto(str, str2, i, i2, i3, i4, i5, i6, f);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        }
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

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void release(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(7, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().release(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void send(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (this.mRemote.transact(25, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().send(str, bArr);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public int setAgreePrivacy(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.mRemote.transact(28, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setAgreePrivacy(z);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public boolean setClickSource(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.mRemote.transact(33, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setClickSource(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void setDataCallback(String str, IMiLinkDataCallback iMiLinkDataCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iMiLinkDataCallback != null ? iMiLinkDataCallback.asBinder() : null);
                    if (this.mRemote.transact(26, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setDataCallback(str, iMiLinkDataCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void setMediaCallback(String str, IMiLinkMediaCallback iMiLinkMediaCallback) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iMiLinkMediaCallback != null ? iMiLinkMediaCallback.asBinder() : null);
                    if (this.mRemote.transact(14, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setMediaCallback(str, iMiLinkMediaCallback);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void setPhotoSource(String str, IMiLinkPhotoSource iMiLinkPhotoSource) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongBinder(iMiLinkPhotoSource != null ? iMiLinkPhotoSource.asBinder() : null);
                    if (this.mRemote.transact(8, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setPhotoSource(str, iMiLinkPhotoSource);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void setProgress(String str, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j);
                    if (this.mRemote.transact(22, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setProgress(str, j);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void setRate(String str, float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeFloat(f);
                    if (this.mRemote.transact(19, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setRate(str, f);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void setVolume(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(24, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setVolume(str, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void showPhoto(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    if (this.mRemote.transact(10, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().showPhoto(str, str2);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void showSlide(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(12, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().showSlide(str, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void startConnect(String str, MiLinkDevice miLinkDevice, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (miLinkDevice != null) {
                        parcelObtain.writeInt(1);
                        miLinkDevice.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(5, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().startConnect(str, miLinkDevice, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void startDiscovery(String str, int i, IMiLinkDeviceListener iMiLinkDeviceListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongBinder(iMiLinkDeviceListener != null ? iMiLinkDeviceListener.asBinder() : null);
                    if (this.mRemote.transact(3, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().startDiscovery(str, i, iMiLinkDeviceListener);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void startPhotoShow(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(9, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().startPhotoShow(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void startPlayAudio(String str, String str2, String str3, String str4, int i, double d) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeDouble(d);
                    try {
                        if (this.mRemote.transact(15, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } else {
                            Stub.getDefaultImpl().startPlayAudio(str, str2, str3, str4, i, d);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        }
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

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void startPlayVideo(String str, String str2, String str3, String str4, int i, double d) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeDouble(d);
                    try {
                        if (this.mRemote.transact(16, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                            parcelObtain2.readException();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        } else {
                            Stub.getDefaultImpl().startPlayVideo(str, str2, str3, str4, i, d);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        }
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

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void startWithUI(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().startWithUI(str, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void stopConnect(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(6, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().stopConnect(str, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void stopDiscovery(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    if (this.mRemote.transact(4, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().stopDiscovery(str, i);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void stopPhotoShow(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(13, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().stopPhotoShow(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.milink.sdk.cast.v2.IMiLinkCastServiceV2
            public void stopPlay(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(17, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                    } else {
                        Stub.getDefaultImpl().stopPlay(str);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IMiLinkCastServiceV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMiLinkCastServiceV2)) ? new Proxy(iBinder) : (IMiLinkCastServiceV2) iInterfaceQueryLocalInterface;
        }

        public static IMiLinkCastServiceV2 getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMiLinkCastServiceV2 iMiLinkCastServiceV2) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iMiLinkCastServiceV2 == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMiLinkCastServiceV2;
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
                    init(parcel.readString(), IMiLinkCastCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    startWithUI(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    startDiscovery(parcel.readString(), parcel.readInt(), IMiLinkDeviceListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    stopDiscovery(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    startConnect(parcel.readString(), parcel.readInt() != 0 ? MiLinkDevice.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    stopConnect(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    release(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPhotoSource(parcel.readString(), IMiLinkPhotoSource.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    startPhotoShow(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    showPhoto(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    operatePhoto(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    showSlide(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    stopPhotoShow(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    setMediaCallback(parcel.readString(), IMiLinkMediaCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    startPlayAudio(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readDouble());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    startPlayVideo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readDouble());
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    stopPlay(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    float rate = getRate(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeFloat(rate);
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    setRate(parcel.readString(), parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    long duration = getDuration(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeLong(duration);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    long progress = getProgress(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeLong(progress);
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    setProgress(parcel.readString(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    int volume = getVolume(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(volume);
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    setVolume(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    send(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    setDataCallback(parcel.readString(), IMiLinkDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsAgreePrivacy = isAgreePrivacy();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsAgreePrivacy ? 1 : 0);
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    int agreePrivacy = setAgreePrivacy(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(agreePrivacy);
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    MiLinkDevice connectMiLinkDevice = getConnectMiLinkDevice();
                    parcel2.writeNoException();
                    if (connectMiLinkDevice != null) {
                        parcel2.writeInt(1);
                        connectMiLinkDevice.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsVerifyCodeInputShown = isVerifyCodeInputShown();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsVerifyCodeInputShown ? 1 : 0);
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsAuthDevice = isAuthDevice(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsAuthDevice ? 1 : 0);
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsAuthDeviceConnecting = isAuthDeviceConnecting();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsAuthDeviceConnecting ? 1 : 0);
                    return true;
                case 33:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean clickSource = setClickSource(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(clickSource ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    MiLinkDevice getConnectMiLinkDevice() throws RemoteException;

    long getDuration(String str) throws RemoteException;

    long getProgress(String str) throws RemoteException;

    float getRate(String str) throws RemoteException;

    int getVolume(String str) throws RemoteException;

    void init(String str, IMiLinkCastCallback iMiLinkCastCallback) throws RemoteException;

    boolean isAgreePrivacy() throws RemoteException;

    boolean isAuthDevice(String str) throws RemoteException;

    boolean isAuthDeviceConnecting() throws RemoteException;

    boolean isVerifyCodeInputShown() throws RemoteException;

    void operatePhoto(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, float f) throws RemoteException;

    void release(String str) throws RemoteException;

    void send(String str, byte[] bArr) throws RemoteException;

    int setAgreePrivacy(boolean z) throws RemoteException;

    boolean setClickSource(int i) throws RemoteException;

    void setDataCallback(String str, IMiLinkDataCallback iMiLinkDataCallback) throws RemoteException;

    void setMediaCallback(String str, IMiLinkMediaCallback iMiLinkMediaCallback) throws RemoteException;

    void setPhotoSource(String str, IMiLinkPhotoSource iMiLinkPhotoSource) throws RemoteException;

    void setProgress(String str, long j) throws RemoteException;

    void setRate(String str, float f) throws RemoteException;

    void setVolume(String str, int i) throws RemoteException;

    void showPhoto(String str, String str2) throws RemoteException;

    void showSlide(String str, int i) throws RemoteException;

    void startConnect(String str, MiLinkDevice miLinkDevice, int i) throws RemoteException;

    void startDiscovery(String str, int i, IMiLinkDeviceListener iMiLinkDeviceListener) throws RemoteException;

    void startPhotoShow(String str) throws RemoteException;

    void startPlayAudio(String str, String str2, String str3, String str4, int i, double d) throws RemoteException;

    void startPlayVideo(String str, String str2, String str3, String str4, int i, double d) throws RemoteException;

    void startWithUI(String str, int i) throws RemoteException;

    void stopConnect(String str, int i) throws RemoteException;

    void stopDiscovery(String str, int i) throws RemoteException;

    void stopPhotoShow(String str) throws RemoteException;

    void stopPlay(String str) throws RemoteException;
}
