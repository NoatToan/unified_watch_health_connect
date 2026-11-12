package com.milink.sdk.cast.v1;

import android.content.Context;
import android.os.RemoteException;
import com.milink.api.v1.MiLinkClientMiracastConnectCallback;
import com.milink.api.v1.MiLinkClientScanListCallback;
import com.milink.api.v1.MilinkClientManager;
import com.milink.api.v1.MilinkClientManagerDataSource;
import com.milink.api.v1.MilinkClientManagerDelegate;
import com.milink.api.v1.type.DeviceType;
import com.milink.api.v1.type.ErrorCode;
import com.milink.api.v1.type.MediaType;
import com.milink.api.v1.type.SlideMode;
import com.milink.sdk.cast.IMiLinkCastCallback;
import com.milink.sdk.cast.MiLinkDevice;
import com.milink.sdk.client.IMiLinkCastClient;
import com.milink.sdk.client.MiLinkCastCallback;
import com.milink.sdk.client.MiLinkDataCallback;
import com.milink.sdk.client.MiLinkDeviceListener;
import com.milink.sdk.client.MiLinkMediaCallback;
import com.milink.sdk.client.MiLinkPhotoSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class MiLinkCastClientV1 implements IMiLinkCastClient {
    private Context mContext;
    private MiLinkDeviceListener mDeviceListener;
    private MilinkClientManager mManager;
    private MiLinkMediaCallback mMediaCallback;
    private IMiLinkCastCallback mMiLinkCallback;
    private MiLinkPhotoSource mPhotoSource;
    private Map<String, MiLinkDevice> mMediaDeviceMap = new HashMap();
    private MilinkClientManagerDelegate mDelegate = new MilinkClientManagerDelegate() { // from class: com.milink.sdk.cast.v1.MiLinkCastClientV1.1
        @Override // com.milink.api.v1.MilinkClientManagerDelegate
        public void onClose() {
        }

        @Override // com.milink.api.v1.MilinkClientManagerDelegate
        public void onConnected() {
            try {
                MiLinkCastClientV1.this.mMiLinkCallback.onConnected(null, 2);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // com.milink.api.v1.MilinkClientManagerDelegate
        public void onConnectedFailed(ErrorCode errorCode) {
            try {
                MiLinkCastClientV1.this.mMiLinkCallback.onFailure(-1, 2);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // com.milink.api.v1.MilinkClientManagerDelegate
        public void onDeviceFound(String str, String str2, DeviceType deviceType) {
            MiLinkDevice miLinkDevice = new MiLinkDevice();
            miLinkDevice.setName(str2);
            miLinkDevice.setKey(str);
            miLinkDevice.setIp(str);
            miLinkDevice.setType(deviceType.name());
            MiLinkCastClientV1.this.mMediaDeviceMap.put(str, miLinkDevice);
            if (MiLinkCastClientV1.this.mDeviceListener != null) {
                try {
                    MiLinkCastClientV1.this.mDeviceListener.onFound(miLinkDevice);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.milink.api.v1.MilinkClientManagerDelegate
        public void onDeviceLost(String str) {
            MiLinkDevice miLinkDevice = new MiLinkDevice();
            miLinkDevice.setKey(str);
            miLinkDevice.setIp(str);
            MiLinkCastClientV1.this.mMediaDeviceMap.remove(str);
            if (MiLinkCastClientV1.this.mDeviceListener != null) {
                try {
                    MiLinkCastClientV1.this.mDeviceListener.onLost(miLinkDevice);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.milink.api.v1.MilinkClientManagerDelegate
        public void onDisconnected() {
            try {
                MiLinkCastClientV1.this.mMiLinkCallback.onDisconnected(null, 2);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // com.milink.api.v1.MilinkClientManagerDelegate
        public void onLoading() {
            if (MiLinkCastClientV1.this.mMediaCallback != null) {
                try {
                    MiLinkCastClientV1.this.mMediaCallback.onLoading();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.milink.api.v1.MilinkClientManagerDelegate
        public void onNextAudio(boolean z) {
            if (MiLinkCastClientV1.this.mMediaCallback != null) {
                try {
                    MiLinkCastClientV1.this.mMediaCallback.onNextAudio(z);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.milink.api.v1.MilinkClientManagerDelegate
        public void onOpen() {
            try {
                MiLinkCastClientV1.this.mMiLinkCallback.onInit();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // com.milink.api.v1.MilinkClientManagerDelegate
        public void onPaused() {
            if (MiLinkCastClientV1.this.mMediaCallback != null) {
                try {
                    MiLinkCastClientV1.this.mMediaCallback.onPaused();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.milink.api.v1.MilinkClientManagerDelegate
        public void onPlaying() {
            if (MiLinkCastClientV1.this.mMediaCallback != null) {
                try {
                    MiLinkCastClientV1.this.mMediaCallback.onPlaying();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.milink.api.v1.MilinkClientManagerDelegate
        public void onPrevAudio(boolean z) {
            if (MiLinkCastClientV1.this.mMediaCallback != null) {
                try {
                    MiLinkCastClientV1.this.mMediaCallback.onPrevAudio(z);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.milink.api.v1.MilinkClientManagerDelegate
        public void onStopped() {
            if (MiLinkCastClientV1.this.mMediaCallback != null) {
                try {
                    MiLinkCastClientV1.this.mMediaCallback.onStopped();
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.milink.api.v1.MilinkClientManagerDelegate
        public void onVolume(int i) {
            if (MiLinkCastClientV1.this.mMediaCallback != null) {
                try {
                    MiLinkCastClientV1.this.mMediaCallback.onVolume(i);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    public MiLinkCastClientV1(Context context) {
        this.mContext = context;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public MiLinkDevice getConnectMiLinkDevice() {
        return null;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public long getDuration() {
        return this.mManager.getPlaybackDuration();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public long getProgress() {
        return this.mManager.getPlaybackProgress();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public float getRate() {
        return this.mManager.getPlaybackRate();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int getVolume() {
        return this.mManager.getVolume();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int init(MiLinkCastCallback miLinkCastCallback) {
        this.mMiLinkCallback = miLinkCastCallback;
        MilinkClientManager milinkClientManager = new MilinkClientManager(this.mContext);
        this.mManager = milinkClientManager;
        milinkClientManager.open();
        this.mManager.setDelegate(this.mDelegate);
        this.mManager.setDataSource(new MilinkClientManagerDataSource() { // from class: com.milink.sdk.cast.v1.MiLinkCastClientV1.2
            @Override // com.milink.api.v1.MilinkClientManagerDataSource
            public String getNextPhoto(String str, boolean z) {
                if (MiLinkCastClientV1.this.mPhotoSource == null) {
                    return null;
                }
                try {
                    return MiLinkCastClientV1.this.mPhotoSource.getNextPhoto(str, z);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override // com.milink.api.v1.MilinkClientManagerDataSource
            public String getPrevPhoto(String str, boolean z) {
                if (MiLinkCastClientV1.this.mPhotoSource == null) {
                    return null;
                }
                try {
                    return MiLinkCastClientV1.this.mPhotoSource.getPrevPhoto(str, z);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        });
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isAgreePrivacy(Context context) {
        return false;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isAuthDevice(String str) {
        return false;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isAuthDeviceConnecting() {
        return false;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isPrivateProtectMode(Context context) {
        return false;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isSmallWindowMode(Context context) {
        return false;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isVerifyCodeInputShown() {
        return false;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int operatePhoto(String str, int i, int i2, int i3, int i4, int i5, int i6, float f) {
        this.mManager.zoomPhoto(str, i, i2, i3, i4, i5, i6, f);
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public void release() {
        this.mManager.close();
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int send(byte[] bArr) {
        return -2;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setAgreePrivacy(Context context, boolean z) {
        return -1;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean setClickSource(int i) {
        return false;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setDataCallback(MiLinkDataCallback miLinkDataCallback) {
        return -2;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setMediaCallback(MiLinkMediaCallback miLinkMediaCallback) {
        this.mMediaCallback = miLinkMediaCallback;
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setPhotoSource(MiLinkPhotoSource miLinkPhotoSource) {
        this.mPhotoSource = miLinkPhotoSource;
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setProgress(long j) {
        this.mManager.setPlaybackProgress((int) j);
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setRate(float f) {
        this.mManager.setPlaybackRate((int) f);
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setVolume(int i) {
        this.mManager.setVolume(i);
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int showPhoto(String str) {
        this.mManager.show(str);
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int showSlide(int i) {
        this.mManager.startSlideshow(i, SlideMode.Recyle);
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startConnect(MiLinkDevice miLinkDevice, int i) {
        if (i != 1) {
            this.mManager.connect(miLinkDevice.getIp(), 2000);
            return 0;
        }
        if (!"miracast".equals(miLinkDevice.getType())) {
            return 0;
        }
        this.mManager.connectWifiDisplay(miLinkDevice.getName(), miLinkDevice.getP2pMac(), miLinkDevice.getWifiMac(), new MiLinkClientMiracastConnectCallback() { // from class: com.milink.sdk.cast.v1.MiLinkCastClientV1.4
            @Override // com.milink.api.v1.MiLinkClientMiracastConnectCallback
            public void onConnectFail(String str) {
                try {
                    MiLinkCastClientV1.this.mMiLinkCallback.onFailure(-1, 2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.milink.api.v1.MiLinkClientMiracastConnectCallback
            public void onConnectSuccess(String str) {
                try {
                    MiLinkCastClientV1.this.mMiLinkCallback.onConnected(null, 2);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.milink.api.v1.MiLinkClientMiracastConnectCallback
            public void onConnecting(String str) {
            }

            @Override // com.milink.api.v1.MiLinkClientMiracastConnectCallback
            public void onResult(int i2, String str, String str2) {
            }
        });
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startDiscovery(int i, MiLinkDeviceListener miLinkDeviceListener) {
        if (i == 1) {
            this.mManager.startWifiDisplayScan();
            return 0;
        }
        this.mDeviceListener = miLinkDeviceListener;
        if (miLinkDeviceListener == null) {
            return 0;
        }
        Iterator<MiLinkDevice> it = this.mMediaDeviceMap.values().iterator();
        while (it.hasNext()) {
            try {
                this.mDeviceListener.onFound(it.next());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startPhotoShow() {
        this.mManager.startShow();
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startPlayAudio(String str, String str2, String str3, int i, double d) {
        this.mManager.startPlay(str, str2, str3, i, d, MediaType.Audio);
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startPlayVideo(String str, String str2, String str3, int i, double d) {
        this.mManager.startPlay(str, str2, str3, i, d, MediaType.Video);
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startWithUI(final int i) {
        this.mManager.showScanList(new MiLinkClientScanListCallback() { // from class: com.milink.sdk.cast.v1.MiLinkCastClientV1.3
            @Override // com.milink.api.v1.MiLinkClientScanListCallback
            public void onConnectFail(String str, String str2) {
                try {
                    MiLinkCastClientV1.this.mMiLinkCallback.onFailure(-1, 1);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.milink.api.v1.MiLinkClientScanListCallback
            public void onConnectSuccess(String str, String str2) {
                try {
                    MiLinkCastClientV1.this.mMiLinkCallback.onConnected(null, 1);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.milink.api.v1.MiLinkClientScanListCallback
            public void onSelectDevice(String str, String str2, String str3) {
                if (i == 2) {
                    MiLinkCastClientV1.this.mManager.connect(str, 1000);
                }
            }
        }, i);
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int stopConnect(int i) {
        if (i == 1) {
            this.mManager.disconnectWifiDisplay();
            return 0;
        }
        this.mManager.disconnect();
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int stopDiscovery(int i) {
        if (i == 1) {
            this.mManager.stopWifiDisplayScan();
            return 0;
        }
        this.mDeviceListener = null;
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int stopPhotoShow() {
        this.mManager.stopShow();
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int stopPlay() {
        this.mManager.stopPlay();
        return 0;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean support(String str) {
        return false;
    }
}
