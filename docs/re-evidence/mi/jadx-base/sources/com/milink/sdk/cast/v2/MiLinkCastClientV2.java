package com.milink.sdk.cast.v2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import com.milink.sdk.Constants;
import com.milink.sdk.cast.IMiLinkCastCallback;
import com.milink.sdk.cast.IMiLinkDataCallback;
import com.milink.sdk.cast.IMiLinkMediaCallback;
import com.milink.sdk.cast.IMiLinkPhotoSource;
import com.milink.sdk.cast.MiLinkDevice;
import com.milink.sdk.client.IMiLinkCastClient;
import com.milink.sdk.client.MiLinkCastCallback;
import com.milink.sdk.client.MiLinkDataCallback;
import com.milink.sdk.client.MiLinkDeviceListener;
import com.milink.sdk.client.MiLinkMediaCallback;
import com.milink.sdk.client.MiLinkPhotoSource;
import com.milink.sdk.util.ApiUtils;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;

/* JADX INFO: loaded from: classes5.dex */
public class MiLinkCastClientV2 implements IMiLinkCastClient {
    private static final String ACTION_SERVICE = "com.milink.sdk.cast.v2.client";
    private static final String ACTION_SERVICE_PUBLIC = "com.milink.sdk.cast.v2.client.public";
    private IMiLinkCastCallback mCallback;
    private String mCaller;
    private Context mContext;
    private MiLinkDataCallback mDataCallback;
    private MiLinkMediaCallback mMediaCallback;
    private MiLinkPhotoSource mPhotoSource;
    private IMiLinkCastServiceV2 mRemoteService;
    private boolean mSystemApp;
    private final String TAG = "MLC::MiLinkCastClientV2-" + hashCode() + "-" + Process.myPid();
    private boolean mBound = false;
    private ServiceConnection mConnection = new ServiceConnection() { // from class: com.milink.sdk.cast.v2.MiLinkCastClientV2.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String unused = MiLinkCastClientV2.this.TAG;
            MiLinkCastClientV2.this.mRemoteService = IMiLinkCastServiceV2.Stub.asInterface(iBinder);
            try {
                MiLinkCastClientV2.this.mRemoteService.init(MiLinkCastClientV2.this.mCaller, MiLinkCastClientV2.this.mCallback);
                MiLinkCastClientV2.this.mRemoteService.setPhotoSource(MiLinkCastClientV2.this.mCaller, MiLinkCastClientV2.this.mInnerPhotoSource);
                MiLinkCastClientV2.this.mRemoteService.setMediaCallback(MiLinkCastClientV2.this.mCaller, MiLinkCastClientV2.this.mInnerMediaCallback);
                MiLinkCastClientV2.this.mRemoteService.setDataCallback(MiLinkCastClientV2.this.mCaller, MiLinkCastClientV2.this.mInnerDataCallback);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            String unused = MiLinkCastClientV2.this.TAG;
            MiLinkCastClientV2.this.mRemoteService = null;
            if (MiLinkCastClientV2.this.mCallback != null) {
                try {
                    MiLinkCastClientV2.this.mCallback.onFailure(-2, 0);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    };
    private IMiLinkPhotoSource mInnerPhotoSource = new IMiLinkPhotoSource.Stub() { // from class: com.milink.sdk.cast.v2.MiLinkCastClientV2.2
        @Override // com.milink.sdk.cast.IMiLinkPhotoSource
        public String getNextPhoto(String str, boolean z) throws RemoteException {
            if (MiLinkCastClientV2.this.mPhotoSource != null) {
                return MiLinkCastClientV2.this.mPhotoSource.getNextPhoto(str, z);
            }
            return null;
        }

        @Override // com.milink.sdk.cast.IMiLinkPhotoSource
        public String getPrevPhoto(String str, boolean z) throws RemoteException {
            if (MiLinkCastClientV2.this.mPhotoSource != null) {
                return MiLinkCastClientV2.this.mPhotoSource.getPrevPhoto(str, z);
            }
            return null;
        }
    };
    private IMiLinkDataCallback mInnerDataCallback = new IMiLinkDataCallback.Stub() { // from class: com.milink.sdk.cast.v2.MiLinkCastClientV2.3
        @Override // com.milink.sdk.cast.IMiLinkDataCallback
        public void onReceived(byte[] bArr) throws RemoteException {
            String unused = MiLinkCastClientV2.this.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("onReceived: ");
            sb.append(bArr != null);
            if (MiLinkCastClientV2.this.mDataCallback != null) {
                MiLinkCastClientV2.this.mDataCallback.onReceived(bArr);
            }
        }
    };
    private IMiLinkMediaCallback mInnerMediaCallback = new IMiLinkMediaCallback.Stub() { // from class: com.milink.sdk.cast.v2.MiLinkCastClientV2.4
        @Override // com.milink.sdk.cast.IMiLinkMediaCallback
        public void onLoading() throws RemoteException {
            if (MiLinkCastClientV2.this.mMediaCallback != null) {
                MiLinkCastClientV2.this.mMediaCallback.onLoading();
            }
        }

        @Override // com.milink.sdk.cast.IMiLinkMediaCallback
        public void onNextAudio(boolean z) throws RemoteException {
            if (MiLinkCastClientV2.this.mMediaCallback != null) {
                MiLinkCastClientV2.this.mMediaCallback.onNextAudio(z);
            }
        }

        @Override // com.milink.sdk.cast.IMiLinkMediaCallback
        public void onPaused() throws RemoteException {
            if (MiLinkCastClientV2.this.mMediaCallback != null) {
                MiLinkCastClientV2.this.mMediaCallback.onPaused();
            }
        }

        @Override // com.milink.sdk.cast.IMiLinkMediaCallback
        public void onPlaying() throws RemoteException {
            if (MiLinkCastClientV2.this.mMediaCallback != null) {
                MiLinkCastClientV2.this.mMediaCallback.onPlaying();
            }
        }

        @Override // com.milink.sdk.cast.IMiLinkMediaCallback
        public void onPrevAudio(boolean z) throws RemoteException {
            if (MiLinkCastClientV2.this.mMediaCallback != null) {
                MiLinkCastClientV2.this.mMediaCallback.onPrevAudio(z);
            }
        }

        @Override // com.milink.sdk.cast.IMiLinkMediaCallback
        public void onStopped() throws RemoteException {
            if (MiLinkCastClientV2.this.mMediaCallback != null) {
                MiLinkCastClientV2.this.mMediaCallback.onStopped();
            }
        }

        @Override // com.milink.sdk.cast.IMiLinkMediaCallback
        public void onVolume(int i) throws RemoteException {
            if (MiLinkCastClientV2.this.mMediaCallback != null) {
                MiLinkCastClientV2.this.mMediaCallback.onVolume(i);
            }
        }
    };

    public MiLinkCastClientV2(Context context, boolean z, String str) {
        this.mContext = context;
        this.mSystemApp = z;
        this.mCaller = str;
    }

    private boolean supportDFS() {
        return ApiUtils.getVersionCode(this.mContext, "com.milink.service") >= 12040809;
    }

    private boolean supportSendData() {
        return ApiUtils.getVersionCode(this.mContext, "com.milink.service") >= 12040701;
    }

    private boolean supportSendDataFloatWindow() {
        return ApiUtils.getVersionCode(this.mContext, "com.milink.service") >= 13000010;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public MiLinkDevice getConnectMiLinkDevice() {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return null;
        }
        try {
            return iMiLinkCastServiceV2.getConnectMiLinkDevice();
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public long getDuration() {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2L;
        }
        try {
            return iMiLinkCastServiceV2.getDuration(this.mCaller);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3L;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public long getProgress() {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2L;
        }
        try {
            return iMiLinkCastServiceV2.getProgress(this.mCaller);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3L;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public float getRate() {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2.0f;
        }
        try {
            return iMiLinkCastServiceV2.getRate(this.mCaller);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3.0f;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int getVolume() {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2;
        }
        try {
            return iMiLinkCastServiceV2.getVolume(this.mCaller);
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int init(MiLinkCastCallback miLinkCastCallback) {
        this.mCallback = miLinkCastCallback;
        if (this.mBound) {
            IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
            if (iMiLinkCastServiceV2 == null) {
                return -2;
            }
            try {
                iMiLinkCastServiceV2.init(this.mCaller, miLinkCastCallback);
                return 0;
            } catch (RemoteException e) {
                e.printStackTrace();
                return -3;
            }
        }
        if (this.mSystemApp) {
            Intent intent = new Intent(ACTION_SERVICE);
            intent.setPackage("com.milink.service");
            this.mBound = this.mContext.bindService(intent, this.mConnection, 1);
            StringBuilder sb = new StringBuilder();
            sb.append("systemApp init mBound: ");
            sb.append(this.mBound);
            return this.mBound ? 0 : -1;
        }
        Intent intent2 = new Intent(ACTION_SERVICE_PUBLIC);
        intent2.setPackage("com.milink.service");
        this.mBound = this.mContext.bindService(intent2, this.mConnection, 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("non-systemApp init mBound: ");
        sb2.append(this.mBound);
        return this.mBound ? 0 : -1;
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isAgreePrivacy(Context context) {
        Bundle bundle = new Bundle();
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                bundle = context.getContentResolver().call(Constants.AUTHORITY_MILINK_PUBLIC, Constants.METHOD_PRIVACY_DFS_GET, (String) null, (Bundle) null);
            } else {
                context.getContentResolver().call(new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(Constants.AUTHORITY_MILINK_PUBLIC).build(), Constants.METHOD_PRIVACY_DFS_GET, (String) null, (Bundle) null);
            }
            return bundle != null && bundle.getBoolean("enable");
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isAuthDevice(String str) {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return false;
        }
        try {
            return iMiLinkCastServiceV2.isAuthDevice(str);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isAuthDeviceConnecting() {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return false;
        }
        try {
            return iMiLinkCastServiceV2.isAuthDeviceConnecting();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isPrivateProtectMode(Context context) {
        Bundle bundleCall;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                bundleCall = context.getContentResolver().call(Constants.AUTHORITY_MILINK_PUBLIC, Constants.METHOD_IS_PRIVATE_PROTECT, (String) null, (Bundle) null);
            } else {
                bundleCall = context.getContentResolver().call(new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(Constants.AUTHORITY_MILINK_PUBLIC).build(), Constants.METHOD_IS_PRIVATE_PROTECT, (String) null, (Bundle) null);
            }
            return bundleCall != null && bundleCall.getBoolean("enable");
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isSmallWindowMode(Context context) {
        Bundle bundleCall;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                bundleCall = context.getContentResolver().call(Constants.AUTHORITY_MILINK_PUBLIC, Constants.METHOD_IS_SMALL_WINDOW, (String) null, (Bundle) null);
            } else {
                bundleCall = context.getContentResolver().call(new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(Constants.AUTHORITY_MILINK_PUBLIC).build(), Constants.METHOD_IS_SMALL_WINDOW, (String) null, (Bundle) null);
            }
            return bundleCall != null && bundleCall.getBoolean("enable");
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean isVerifyCodeInputShown() {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return false;
        }
        try {
            return iMiLinkCastServiceV2.isVerifyCodeInputShown();
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int operatePhoto(String str, int i, int i2, int i3, int i4, int i5, int i6, float f) {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2;
        }
        try {
            iMiLinkCastServiceV2.operatePhoto(this.mCaller, str, i, i2, i3, i4, i5, i6, f);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public void release() {
        StringBuilder sb = new StringBuilder();
        sb.append("release mBound: ");
        sb.append(this.mBound);
        if (this.mBound) {
            IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
            if (iMiLinkCastServiceV2 != null) {
                try {
                    iMiLinkCastServiceV2.release(this.mCaller);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
            this.mContext.unbindService(this.mConnection);
            this.mBound = false;
            this.mRemoteService = null;
            this.mCallback = null;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int send(byte[] bArr) {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2;
        }
        try {
            iMiLinkCastServiceV2.send(this.mCaller, bArr);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setAgreePrivacy(Context context, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable", z);
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                context.getContentResolver().call(Constants.AUTHORITY_MILINK_PUBLIC, Constants.METHOD_PRIVACY_DFS_SET, (String) null, bundle);
                return 0;
            }
            context.getContentResolver().call(new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(Constants.AUTHORITY_MILINK_PUBLIC).build(), Constants.METHOD_PRIVACY_DFS_SET, (String) null, bundle);
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean setClickSource(int i) {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return false;
        }
        try {
            return iMiLinkCastServiceV2.setClickSource(i);
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setDataCallback(MiLinkDataCallback miLinkDataCallback) {
        this.mDataCallback = miLinkDataCallback;
        return 0;
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
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2;
        }
        try {
            iMiLinkCastServiceV2.setProgress(this.mCaller, j);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setRate(float f) {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2;
        }
        try {
            iMiLinkCastServiceV2.setRate(this.mCaller, f);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int setVolume(int i) {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2;
        }
        try {
            iMiLinkCastServiceV2.setVolume(this.mCaller, i);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int showPhoto(String str) {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2;
        }
        try {
            iMiLinkCastServiceV2.showPhoto(this.mCaller, str);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int showSlide(int i) {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2;
        }
        try {
            iMiLinkCastServiceV2.showSlide(this.mCaller, i);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startConnect(MiLinkDevice miLinkDevice, int i) {
        if (this.mRemoteService == null) {
            return -2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("startConnect flag= ");
        sb.append(Integer.toBinaryString(i));
        try {
            this.mRemoteService.startConnect(this.mCaller, miLinkDevice, i);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startDiscovery(int i, MiLinkDeviceListener miLinkDeviceListener) {
        if (this.mRemoteService == null) {
            return -2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("startDiscovery flag= ");
        sb.append(Integer.toBinaryString(i));
        try {
            this.mRemoteService.startDiscovery(this.mCaller, i, miLinkDeviceListener);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startPhotoShow() {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2;
        }
        try {
            iMiLinkCastServiceV2.startPhotoShow(this.mCaller);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startPlayAudio(String str, String str2, String str3, int i, double d) {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2;
        }
        try {
            iMiLinkCastServiceV2.startPlayAudio(this.mCaller, str, str2, str3, i, d);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startPlayVideo(String str, String str2, String str3, int i, double d) {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2;
        }
        try {
            iMiLinkCastServiceV2.startPlayVideo(this.mCaller, str, str2, str3, i, d);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int startWithUI(int i) {
        if (this.mRemoteService == null) {
            return -2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("startWithUI flag= ");
        sb.append(Integer.toBinaryString(i));
        try {
            this.mRemoteService.startWithUI(this.mCaller, i);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int stopConnect(int i) {
        if (this.mRemoteService == null) {
            return -2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("stopConnect flag= ");
        sb.append(Integer.toBinaryString(i));
        try {
            this.mRemoteService.stopConnect(this.mCaller, i);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int stopDiscovery(int i) {
        if (this.mRemoteService == null) {
            return -2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("stopDiscovery flag= ");
        sb.append(Integer.toBinaryString(i));
        try {
            this.mRemoteService.stopDiscovery(this.mCaller, i);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int stopPhotoShow() {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2;
        }
        try {
            iMiLinkCastServiceV2.stopPhotoShow(this.mCaller);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public int stopPlay() {
        IMiLinkCastServiceV2 iMiLinkCastServiceV2 = this.mRemoteService;
        if (iMiLinkCastServiceV2 == null) {
            return -2;
        }
        try {
            iMiLinkCastServiceV2.stopPlay(this.mCaller);
            return 0;
        } catch (RemoteException e) {
            e.printStackTrace();
            return -3;
        }
    }

    @Override // com.milink.sdk.client.IMiLinkCastClient
    public boolean support(String str) {
        if ("data".equals(str)) {
            return supportSendData();
        }
        if (Constants.FEATURE_DFS.equals(str)) {
            return supportDFS();
        }
        if (Constants.FEATURE_DATA_FLOAT_WINDIW.equals(str)) {
            return supportSendDataFloatWindow();
        }
        return false;
    }
}
