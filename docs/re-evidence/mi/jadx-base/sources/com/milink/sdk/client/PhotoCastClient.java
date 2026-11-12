package com.milink.sdk.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.milink.sdk.photo.IPhotoCastCallback;
import com.milink.sdk.photo.IPhotoCastDataSource;
import com.milink.sdk.photo.IPhotoCastService;
import com.milink.sdk.util.ApiUtils;

/* JADX INFO: loaded from: classes5.dex */
public class PhotoCastClient {
    private static final String MI_LINK_PACKAGE = "com.milink.service";
    private static final int MI_LINK_SUPPORT_CODE = 12020203;
    private static final int MI_LINK_SUPPORT_CODE_MERGE_MIPLAY = 12040700;
    private static final String MI_PLAY_PACKAGE = "com.xiaomi.miplay_client";
    private static final int MI_PLAY_SUPPORT_CODE = 101;
    private static final String TAG = "ML::PhotoCastClient";
    private IPhotoCastDataSource mCastDataSource;
    private IPhotoCastCallback mCastListener;
    private Context mContext;
    private IPhotoCastService mService;
    private boolean mBound = false;
    private ServiceConnection mServiceConnection = new ServiceConnection() { // from class: com.milink.sdk.client.PhotoCastClient.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            PhotoCastClient.this.mService = IPhotoCastService.Stub.asInterface(iBinder);
            try {
                if (PhotoCastClient.this.mCastDataSource != null) {
                    PhotoCastClient.this.mService.setDataSource(PhotoCastClient.this.mCastDataSource);
                }
                if (PhotoCastClient.this.mCastListener != null) {
                    PhotoCastClient.this.mService.init(PhotoCastClient.this.mCastListener);
                    PhotoCastClient.this.mCastListener.onInit();
                }
            } catch (RemoteException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            PhotoCastClient.this.mService = null;
        }
    };

    public PhotoCastClient(Context context) {
        this.mContext = context;
    }

    public int checkAccess() {
        IPhotoCastService iPhotoCastService = this.mService;
        if (iPhotoCastService == null) {
            return -1;
        }
        try {
            return iPhotoCastService.checkAccess();
        } catch (RemoteException unused) {
            return -1;
        }
    }

    public String getCastDeviceName() {
        IPhotoCastService iPhotoCastService = this.mService;
        if (iPhotoCastService == null) {
            return "";
        }
        try {
            return iPhotoCastService.getCastingDeviceName();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public int[] getCastDeviceSize() {
        IPhotoCastService iPhotoCastService = this.mService;
        if (iPhotoCastService == null) {
            return null;
        }
        try {
            return iPhotoCastService.getCastingDeviceSize();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public int init(IPhotoCastCallback iPhotoCastCallback) {
        if (ApiUtils.getVersionCode(this.mContext, "com.milink.service") < MI_LINK_SUPPORT_CODE_MERGE_MIPLAY) {
            if (ApiUtils.getVersionCode(this.mContext, "com.milink.service") < MI_LINK_SUPPORT_CODE) {
                return -2;
            }
            if (ApiUtils.getVersionCode(this.mContext, MI_PLAY_PACKAGE) < 101) {
                return -3;
            }
        }
        this.mCastListener = iPhotoCastCallback;
        Intent intent = new Intent(IPhotoCastService.class.getName());
        intent.setPackage("com.milink.service");
        this.mBound = this.mContext.bindService(intent, this.mServiceConnection, 1);
        return 1;
    }

    public void release() {
        if (this.mBound) {
            IPhotoCastService iPhotoCastService = this.mService;
            if (iPhotoCastService != null) {
                try {
                    iPhotoCastService.release(this.mCastListener);
                } catch (RemoteException unused) {
                }
            }
            this.mContext.unbindService(this.mServiceConnection);
            this.mBound = false;
            this.mService = null;
            this.mCastListener = null;
        }
    }

    public int rotate(String str, float f) {
        IPhotoCastService iPhotoCastService = this.mService;
        if (iPhotoCastService != null) {
            try {
                return iPhotoCastService.rotate(str, f);
            } catch (RemoteException unused) {
            }
        }
        return -1;
    }

    public void setDataSource(IPhotoCastDataSource iPhotoCastDataSource) {
        this.mCastDataSource = iPhotoCastDataSource;
        IPhotoCastService iPhotoCastService = this.mService;
        if (iPhotoCastService != null) {
            try {
                iPhotoCastService.setDataSource(iPhotoCastDataSource);
            } catch (RemoteException unused) {
            }
        }
    }

    public int show(String str) {
        IPhotoCastService iPhotoCastService = this.mService;
        if (iPhotoCastService != null) {
            try {
                return iPhotoCastService.show(str);
            } catch (RemoteException unused) {
            }
        }
        return -1;
    }

    public int startSlide() {
        IPhotoCastService iPhotoCastService = this.mService;
        if (iPhotoCastService != null) {
            try {
                return iPhotoCastService.startSlide();
            } catch (RemoteException unused) {
            }
        }
        return -1;
    }

    public int stop() {
        IPhotoCastService iPhotoCastService = this.mService;
        if (iPhotoCastService != null) {
            try {
                return iPhotoCastService.stop();
            } catch (RemoteException unused) {
            }
        }
        return -1;
    }

    public int stopSlide() {
        IPhotoCastService iPhotoCastService = this.mService;
        if (iPhotoCastService != null) {
            try {
                return iPhotoCastService.stopSlide();
            } catch (RemoteException unused) {
            }
        }
        return -1;
    }

    public int zoom(String str, int i, int i2, int i3, int i4, int i5, int i6, float f) {
        IPhotoCastService iPhotoCastService = this.mService;
        if (iPhotoCastService != null) {
            try {
                return iPhotoCastService.zoom(str, i, i2, i3, i4, i5, i6, f);
            } catch (RemoteException unused) {
            }
        }
        return -1;
    }
}
