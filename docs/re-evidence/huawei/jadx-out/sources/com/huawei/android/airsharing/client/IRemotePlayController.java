package com.huawei.android.airsharing.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.android.airsharing.api.GrabState;
import com.huawei.android.airsharing.api.PlayInfo;
import com.huawei.android.airsharing.api.PlayInfoHolder;
import com.huawei.android.airsharing.api.PlayerCapability;
import com.huawei.android.airsharing.api.TrackInfo;
import com.huawei.android.airsharing.api.TrackInfoSet;

/* JADX INFO: loaded from: classes22.dex */
public interface IRemotePlayController extends IInterface {
    boolean addMediaItem(PlayInfo playInfo) throws RemoteException;

    boolean configGrabState(int i, long j) throws RemoteException;

    boolean fastForward(int i) throws RemoteException;

    boolean fastRewind(int i) throws RemoteException;

    int getBufferedPosition() throws RemoteException;

    GrabState getCurrentGrabState() throws RemoteException;

    int getDuration() throws RemoteException;

    float getPlaySpeed() throws RemoteException;

    PlayerCapability getPlayerCapability() throws RemoteException;

    int getPlayerStatus() throws RemoteException;

    int getPosition() throws RemoteException;

    int getRepeatMode() throws RemoteException;

    TrackInfoSet getTrackInfoSet() throws RemoteException;

    int getVolume() throws RemoteException;

    boolean isMute() throws RemoteException;

    boolean next() throws RemoteException;

    boolean pause() throws RemoteException;

    boolean play(PlayInfoHolder playInfoHolder) throws RemoteException;

    boolean previous() throws RemoteException;

    boolean provideKeyResponse(String str, byte[] bArr) throws RemoteException;

    boolean registerRemotePlayerListener(IRemotePlayerListener iRemotePlayerListener) throws RemoteException;

    boolean resume() throws RemoteException;

    boolean seek(int i) throws RemoteException;

    boolean setAudioTrackInfo(TrackInfo trackInfo) throws RemoteException;

    boolean setMute(boolean z) throws RemoteException;

    boolean setRepeatMode(int i) throws RemoteException;

    boolean setSpeed(float f) throws RemoteException;

    boolean setSubtitleTrackInfo(TrackInfo trackInfo) throws RemoteException;

    boolean setVideoTrackInfo(TrackInfo trackInfo) throws RemoteException;

    boolean setVolume(int i) throws RemoteException;

    boolean stop() throws RemoteException;

    boolean unregisterRemotePlayerListener() throws RemoteException;

    public static abstract class Stub extends Binder implements IRemotePlayController {
        private static final String DESCRIPTOR = "com.huawei.android.airsharing.client.IRemotePlayController";
        static final int TRANSACTION_addMediaItem = 7;
        static final int TRANSACTION_configGrabState = 4;
        static final int TRANSACTION_fastForward = 14;
        static final int TRANSACTION_fastRewind = 15;
        static final int TRANSACTION_getBufferedPosition = 26;
        static final int TRANSACTION_getCurrentGrabState = 3;
        static final int TRANSACTION_getDuration = 25;
        static final int TRANSACTION_getPlaySpeed = 28;
        static final int TRANSACTION_getPlayerCapability = 5;
        static final int TRANSACTION_getPlayerStatus = 23;
        static final int TRANSACTION_getPosition = 24;
        static final int TRANSACTION_getRepeatMode = 27;
        static final int TRANSACTION_getTrackInfoSet = 31;
        static final int TRANSACTION_getVolume = 30;
        static final int TRANSACTION_isMute = 29;
        static final int TRANSACTION_next = 11;
        static final int TRANSACTION_pause = 8;
        static final int TRANSACTION_play = 6;
        static final int TRANSACTION_previous = 12;
        static final int TRANSACTION_provideKeyResponse = 22;
        static final int TRANSACTION_registerRemotePlayerListener = 1;
        static final int TRANSACTION_resume = 9;
        static final int TRANSACTION_seek = 13;
        static final int TRANSACTION_setAudioTrackInfo = 20;
        static final int TRANSACTION_setMute = 19;
        static final int TRANSACTION_setRepeatMode = 16;
        static final int TRANSACTION_setSpeed = 17;
        static final int TRANSACTION_setSubtitleTrackInfo = 32;
        static final int TRANSACTION_setVideoTrackInfo = 21;
        static final int TRANSACTION_setVolume = 18;
        static final int TRANSACTION_stop = 10;
        static final int TRANSACTION_unregisterRemotePlayerListener = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemotePlayController asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IRemotePlayController)) {
                return (IRemotePlayController) iInterfaceQueryLocalInterface;
            }
            return new c(iBinder);
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
                    boolean zRegisterRemotePlayerListener = registerRemotePlayerListener(IRemotePlayerListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRegisterRemotePlayerListener ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zUnregisterRemotePlayerListener = unregisterRemotePlayerListener();
                    parcel2.writeNoException();
                    parcel2.writeInt(zUnregisterRemotePlayerListener ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    GrabState currentGrabState = getCurrentGrabState();
                    parcel2.writeNoException();
                    if (currentGrabState != null) {
                        parcel2.writeInt(1);
                        currentGrabState.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zConfigGrabState = configGrabState(parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zConfigGrabState ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    PlayerCapability playerCapability = getPlayerCapability();
                    parcel2.writeNoException();
                    if (playerCapability != null) {
                        parcel2.writeInt(1);
                        playerCapability.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPlay = play(parcel.readInt() != 0 ? PlayInfoHolder.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zPlay ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zAddMediaItem = addMediaItem(parcel.readInt() != 0 ? PlayInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zAddMediaItem ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPause = pause();
                    parcel2.writeNoException();
                    parcel2.writeInt(zPause ? 1 : 0);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zResume = resume();
                    parcel2.writeNoException();
                    parcel2.writeInt(zResume ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zStop = stop();
                    parcel2.writeNoException();
                    parcel2.writeInt(zStop ? 1 : 0);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean next = next();
                    parcel2.writeNoException();
                    parcel2.writeInt(next ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zPrevious = previous();
                    parcel2.writeNoException();
                    parcel2.writeInt(zPrevious ? 1 : 0);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zSeek = seek(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSeek ? 1 : 0);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zFastForward = fastForward(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zFastForward ? 1 : 0);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zFastRewind = fastRewind(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zFastRewind ? 1 : 0);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean repeatMode = setRepeatMode(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(repeatMode ? 1 : 0);
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean speed = setSpeed(parcel.readFloat());
                    parcel2.writeNoException();
                    parcel2.writeInt(speed ? 1 : 0);
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean volume = setVolume(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(volume ? 1 : 0);
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean mute = setMute(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(mute ? 1 : 0);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean audioTrackInfo = setAudioTrackInfo(parcel.readInt() != 0 ? TrackInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(audioTrackInfo ? 1 : 0);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean videoTrackInfo = setVideoTrackInfo(parcel.readInt() != 0 ? TrackInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(videoTrackInfo ? 1 : 0);
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zProvideKeyResponse = provideKeyResponse(parcel.readString(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(zProvideKeyResponse ? 1 : 0);
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    int playerStatus = getPlayerStatus();
                    parcel2.writeNoException();
                    parcel2.writeInt(playerStatus);
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    int position = getPosition();
                    parcel2.writeNoException();
                    parcel2.writeInt(position);
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    int duration = getDuration();
                    parcel2.writeNoException();
                    parcel2.writeInt(duration);
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    int bufferedPosition = getBufferedPosition();
                    parcel2.writeNoException();
                    parcel2.writeInt(bufferedPosition);
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    int repeatMode2 = getRepeatMode();
                    parcel2.writeNoException();
                    parcel2.writeInt(repeatMode2);
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    float playSpeed = getPlaySpeed();
                    parcel2.writeNoException();
                    parcel2.writeFloat(playSpeed);
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean zIsMute = isMute();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsMute ? 1 : 0);
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    int volume2 = getVolume();
                    parcel2.writeNoException();
                    parcel2.writeInt(volume2);
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    TrackInfoSet trackInfoSet = getTrackInfoSet();
                    parcel2.writeNoException();
                    if (trackInfoSet != null) {
                        parcel2.writeInt(1);
                        trackInfoSet.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean subtitleTrackInfo = setSubtitleTrackInfo(parcel.readInt() != 0 ? TrackInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(subtitleTrackInfo ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class c implements IRemotePlayController {
            public static IRemotePlayController d;
            private IBinder e;

            c(IBinder iBinder) {
                this.e = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.e;
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean registerRemotePlayerListener(IRemotePlayerListener iRemotePlayerListener) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iRemotePlayerListener != null ? iRemotePlayerListener.asBinder() : null);
                    if (!this.e.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().registerRemotePlayerListener(iRemotePlayerListener);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean unregisterRemotePlayerListener() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(2, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().unregisterRemotePlayerListener();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public GrabState getCurrentGrabState() throws RemoteException {
                GrabState grabStateCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(3, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        grabStateCreateFromParcel = Stub.getDefaultImpl().getCurrentGrabState();
                    } else {
                        parcelObtain2.readException();
                        grabStateCreateFromParcel = parcelObtain2.readInt() != 0 ? GrabState.CREATOR.createFromParcel(parcelObtain2) : null;
                    }
                    return grabStateCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean configGrabState(int i, long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeLong(j);
                    if (!this.e.transact(4, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().configGrabState(i, j);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public PlayerCapability getPlayerCapability() throws RemoteException {
                PlayerCapability playerCapabilityCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(5, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        playerCapabilityCreateFromParcel = Stub.getDefaultImpl().getPlayerCapability();
                    } else {
                        parcelObtain2.readException();
                        playerCapabilityCreateFromParcel = parcelObtain2.readInt() != 0 ? PlayerCapability.CREATOR.createFromParcel(parcelObtain2) : null;
                    }
                    return playerCapabilityCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean play(PlayInfoHolder playInfoHolder) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (playInfoHolder != null) {
                        parcelObtain.writeInt(1);
                        playInfoHolder.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.e.transact(6, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().play(playInfoHolder);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean addMediaItem(PlayInfo playInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (playInfo != null) {
                        parcelObtain.writeInt(1);
                        playInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.e.transact(7, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().addMediaItem(playInfo);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean pause() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(8, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().pause();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean resume() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(9, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().resume();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean stop() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(10, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().stop();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean next() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(11, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().next();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean previous() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(12, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().previous();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean seek(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.e.transact(13, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().seek(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean fastForward(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.e.transact(14, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().fastForward(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean fastRewind(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.e.transact(15, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().fastRewind(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean setRepeatMode(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.e.transact(16, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setRepeatMode(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean setSpeed(float f) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeFloat(f);
                    if (!this.e.transact(17, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setSpeed(f);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean setVolume(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    if (!this.e.transact(18, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setVolume(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean setMute(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (!this.e.transact(19, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setMute(z);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean setAudioTrackInfo(TrackInfo trackInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (trackInfo != null) {
                        parcelObtain.writeInt(1);
                        trackInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.e.transact(20, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setAudioTrackInfo(trackInfo);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean setVideoTrackInfo(TrackInfo trackInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (trackInfo != null) {
                        parcelObtain.writeInt(1);
                        trackInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.e.transact(21, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setVideoTrackInfo(trackInfo);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean provideKeyResponse(String str, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeByteArray(bArr);
                    if (!this.e.transact(22, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().provideKeyResponse(str, bArr);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public int getPlayerStatus() throws RemoteException {
                int playerStatus;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(23, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        playerStatus = Stub.getDefaultImpl().getPlayerStatus();
                    } else {
                        parcelObtain2.readException();
                        playerStatus = parcelObtain2.readInt();
                    }
                    return playerStatus;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public int getPosition() throws RemoteException {
                int position;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(24, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        position = Stub.getDefaultImpl().getPosition();
                    } else {
                        parcelObtain2.readException();
                        position = parcelObtain2.readInt();
                    }
                    return position;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public int getDuration() throws RemoteException {
                int duration;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(25, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        duration = Stub.getDefaultImpl().getDuration();
                    } else {
                        parcelObtain2.readException();
                        duration = parcelObtain2.readInt();
                    }
                    return duration;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public int getBufferedPosition() throws RemoteException {
                int bufferedPosition;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(26, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        bufferedPosition = Stub.getDefaultImpl().getBufferedPosition();
                    } else {
                        parcelObtain2.readException();
                        bufferedPosition = parcelObtain2.readInt();
                    }
                    return bufferedPosition;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public int getRepeatMode() throws RemoteException {
                int repeatMode;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(27, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        repeatMode = Stub.getDefaultImpl().getRepeatMode();
                    } else {
                        parcelObtain2.readException();
                        repeatMode = parcelObtain2.readInt();
                    }
                    return repeatMode;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public float getPlaySpeed() throws RemoteException {
                float playSpeed;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(28, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        playSpeed = Stub.getDefaultImpl().getPlaySpeed();
                    } else {
                        parcelObtain2.readException();
                        playSpeed = parcelObtain2.readFloat();
                    }
                    return playSpeed;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean isMute() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(29, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isMute();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public int getVolume() throws RemoteException {
                int volume;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(30, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        volume = Stub.getDefaultImpl().getVolume();
                    } else {
                        parcelObtain2.readException();
                        volume = parcelObtain2.readInt();
                    }
                    return volume;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public TrackInfoSet getTrackInfoSet() throws RemoteException {
                TrackInfoSet trackInfoSetCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.e.transact(31, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        trackInfoSetCreateFromParcel = Stub.getDefaultImpl().getTrackInfoSet();
                    } else {
                        parcelObtain2.readException();
                        trackInfoSetCreateFromParcel = parcelObtain2.readInt() != 0 ? TrackInfoSet.CREATOR.createFromParcel(parcelObtain2) : null;
                    }
                    return trackInfoSetCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.huawei.android.airsharing.client.IRemotePlayController
            public boolean setSubtitleTrackInfo(TrackInfo trackInfo) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (trackInfo != null) {
                        parcelObtain.writeInt(1);
                        trackInfo.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.e.transact(32, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().setSubtitleTrackInfo(trackInfo);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(IRemotePlayController iRemotePlayController) {
            if (c.d != null || iRemotePlayController == null) {
                return false;
            }
            c.d = iRemotePlayController;
            return true;
        }

        public static IRemotePlayController getDefaultImpl() {
            return c.d;
        }
    }
}
