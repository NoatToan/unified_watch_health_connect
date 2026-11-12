package com.ximalaya.ting.android.opensdk.player;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import com.ximalaya.ting.android.opensdk.player.service.IXmPlayer;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes22.dex */
public class XmPlayerManagerForPlayer {
    private static volatile XmPlayerManagerForPlayer sInstance;
    private Context mAppCtx;
    private IXmPlayer mPlayerStub;
    private boolean mBindRet = false;
    private CopyOnWriteArrayList<IConnectListener> connectListeners = new CopyOnWriteArrayList<>();
    private ServiceConnection mConn = new ServiceConnection() { // from class: com.ximalaya.ting.android.opensdk.player.XmPlayerManagerForPlayer.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            XmPlayerManagerForPlayer.this.mPlayerStub = IXmPlayer.Stub.asInterface(iBinder);
            if (XmPlayerManagerForPlayer.this.connectListeners != null) {
                Iterator it2 = XmPlayerManagerForPlayer.this.connectListeners.iterator();
                while (it2.hasNext()) {
                    ((IConnectListener) it2.next()).onConnected();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    public interface IConnectListener {
        void onConnected();
    }

    private XmPlayerManagerForPlayer(Context context) {
        this.mAppCtx = context.getApplicationContext();
    }

    private void addOnConnectedListerner(IConnectListener iConnectListener) {
        if (iConnectListener == null || this.connectListeners.contains(iConnectListener)) {
            return;
        }
        this.connectListeners.add(iConnectListener);
    }

    public static XmPlayerManagerForPlayer getInstance(Context context) {
        if (sInstance == null) {
            synchronized (XmPlayerManagerForPlayer.class) {
                if (sInstance == null) {
                    sInstance = new XmPlayerManagerForPlayer(context);
                }
            }
        }
        return sInstance;
    }

    public static void release() {
        if (sInstance == null || sInstance.connectListeners == null) {
            return;
        }
        sInstance.connectListeners.clear();
    }

    public static void unBind() {
        if (sInstance == null || sInstance.mAppCtx == null || sInstance.mConn == null || sInstance.mPlayerStub == null || sInstance.mPlayerStub.asBinder() == null || !sInstance.mPlayerStub.asBinder().isBinderAlive()) {
            return;
        }
        sInstance.mAppCtx.unbindService(sInstance.mConn);
    }

    public void init(IConnectListener iConnectListener) {
        addOnConnectedListerner(iConnectListener);
        init();
    }

    public void init() {
        try {
            if (this.mAppCtx.getApplicationInfo().targetSdkVersion >= 26 && Build.VERSION.SDK_INT >= 26) {
                try {
                    Context context = this.mAppCtx;
                    context.startService(XmPlayerService.getIntent(context));
                } catch (Exception e) {
                    Intent intent = XmPlayerService.getIntent(this.mAppCtx);
                    intent.putExtra(XmPlayerService.FLAG_MUST_TO_SHOW_NOTIFICATION, true);
                    this.mAppCtx.startForegroundService(intent);
                    e.printStackTrace();
                }
            } else {
                Context context2 = this.mAppCtx;
                context2.startService(XmPlayerService.getIntent(context2));
            }
            Context context3 = this.mAppCtx;
            this.mBindRet = context3.bindService(XmPlayerService.getIntent(context3), this.mConn, 1);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
