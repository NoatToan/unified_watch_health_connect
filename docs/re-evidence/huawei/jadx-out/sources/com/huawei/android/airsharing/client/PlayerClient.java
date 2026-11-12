package com.huawei.android.airsharing.client;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import com.huawei.android.airsharing.api.EHwMediaInfoType;
import com.huawei.android.airsharing.api.Event;
import com.huawei.android.airsharing.api.HwMediaInfo;
import com.huawei.android.airsharing.api.HwMediaPosition;
import com.huawei.android.airsharing.api.HwObject;
import com.huawei.android.airsharing.api.HwServer;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.android.airsharing.api.IPlayerManager;
import com.huawei.android.airsharing.api.IStatusListener;
import com.huawei.android.airsharing.api.InitializationInfoEvent;
import com.huawei.android.airsharing.api.ProjectionDevice;
import defpackage.ayz;
import defpackage.aze;
import defpackage.azf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class PlayerClient implements IPlayerManager, IEventListener {
    private Context i;
    private IBinder r;
    private static final ayz e = ayz.e();
    private static PlayerClient d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IAidlHwPlayerManager f5080b = null;
    private String y = "7";
    private ISdkAidlHwAuthenManager p = null;
    private EServiceConnectStatus w = EServiceConnectStatus.SERVICE_DISCONNECTED;
    private IEventListener g = null;
    private IStatusListener x = null;
    private ContentResolver h = null;
    private final HashMap<IEventListener, EventListenerAgent> q = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5081c = false;
    private final Object f = new Object();
    private final Object k = new Object();
    private final Object o = new Object();
    private final Object u = new Object();
    private final ContentObserver j = new ContentObserver(new Handler()) { // from class: com.huawei.android.airsharing.client.PlayerClient.4
        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            PlayerClient.this.k();
        }
    };
    private ExecutorService n = Executors.newFixedThreadPool(5);
    private c m = null;
    private HandlerThread l = null;
    private int t = -1;
    private ServiceConnection s = new ServiceConnection() { // from class: com.huawei.android.airsharing.client.PlayerClient.3
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            PlayerClient.e.d("PlayerClient", "bind service disconnected");
            synchronized (PlayerClient.this.f) {
                PlayerClient.this.f5080b = null;
            }
            PlayerClient.this.w = EServiceConnectStatus.SERVICE_DISCONNECTED;
            PlayerClient.this.m.removeMessages(1);
            PlayerClient.this.m.sendEmptyMessageDelayed(1, 5000L);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IBinder iBinderCheckPermission;
            PlayerClient.e.d("PlayerClient", "bind service connected");
            if (PlayerClient.this.i == null) {
                PlayerClient.e.a("PlayerClient", "context is null");
                return;
            }
            try {
                Intent intent = new Intent();
                if (PlayerClient.this.i.checkSelfPermission("com.android.permission.airsharing_play_interface") == 0) {
                    intent.setComponent(new ComponentName("com.huawei.android.airsharing", "com.huawei.android.airsharing.service.PlayerService"));
                } else {
                    intent.setComponent(new ComponentName("com.huawei.android.airsharing", "com.huawei.android.airsharing.service.SdkPlayerService"));
                }
                PlayerClient.e.d("PlayerClient", "start service");
                PlayerClient.this.i.startService(intent);
            } catch (IllegalStateException unused) {
                PlayerClient.e.a("PlayerClient", "startService catch IllegalStateException");
            } catch (SecurityException unused2) {
                PlayerClient.e.a("PlayerClient", "bindService catch SecurityException");
            }
            PlayerClient.this.m.removeMessages(1);
            PlayerClient.this.w = EServiceConnectStatus.SERVICE_CONNECTED;
            if (PlayerClient.this.i.checkSelfPermission("com.android.permission.airsharing_play_interface") != 0) {
                PlayerClient.this.p = ISdkAidlHwAuthenManager.Stub.asInterface(iBinder);
                try {
                    iBinderCheckPermission = PlayerClient.this.p.checkPermission();
                } catch (RemoteException e2) {
                    PlayerClient.e.a("PlayerClient", "onServiceConnected checkPermission failed with exception: " + e2.getLocalizedMessage());
                    iBinderCheckPermission = iBinder;
                }
                if (iBinderCheckPermission == null) {
                    PlayerClient.this.d(iBinder);
                    PlayerClient.e.a("PlayerClient", "onServiceConnected but don't have permission");
                    return;
                }
                iBinder = iBinderCheckPermission;
            }
            synchronized (PlayerClient.this.f) {
                PlayerClient.this.f5080b = IAidlHwPlayerManager.Stub.asInterface(iBinder);
            }
            PlayerClient.this.d(iBinder);
            if (PlayerClient.this.y != null) {
                b bVar = new b();
                bVar.f5085a = PlayerClient.this.y;
                PlayerClient.this.n.execute(bVar);
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBinder.DeathRecipient f5079a = new a();

    public enum EServiceConnectStatus {
        SERVICE_DISCONNECTED,
        SERVICE_DISCONNECTING,
        SERVICE_CONNECTING,
        SERVICE_CONNECTED
    }

    public static PlayerClient e() {
        PlayerClient playerClient;
        synchronized (PlayerClient.class) {
            if (d == null) {
                d = new PlayerClient();
            }
            playerClient = d;
        }
        return playerClient;
    }

    class c extends Handler {
        c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1 && PlayerClient.this.f5081c && PlayerClient.this.t != -1) {
                PlayerClient.this.h();
            }
        }
    }

    @Override // com.huawei.android.airsharing.api.IPlayerManager
    public boolean init(Context context) {
        ayz ayzVar = e;
        ayzVar.d("PlayerClient", "init in with context, AirSharing Jar version is " + azf.b().a());
        if (context == null) {
            ayzVar.c("PlayerClient", "init failed because context is null");
            return false;
        }
        this.i = context;
        this.t = Process.myPid();
        synchronized (this.o) {
            HandlerThread handlerThread = this.l;
            if (handlerThread == null || !handlerThread.isAlive()) {
                HandlerThread handlerThread2 = new HandlerThread("PlayerClientHandleThread");
                this.l = handlerThread2;
                handlerThread2.start();
                this.m = new c(this.l.getLooper());
            }
        }
        return h();
    }

    @Override // com.huawei.android.airsharing.api.IServerManager
    public void deInit() {
        ayz ayzVar = e;
        ayzVar.d("PlayerClient", "deInit in");
        c cVar = this.m;
        if (cVar != null) {
            cVar.removeMessages(1);
        }
        f();
        this.t = -1;
        synchronized (this.o) {
            HandlerThread handlerThread = this.l;
            if (handlerThread != null) {
                ayzVar.d("PlayerClient", "handle thread quit return: " + handlerThread.quitSafely());
            }
        }
        e((IEventListener) e());
        this.f5081c = false;
        synchronized (this.k) {
            this.g = null;
        }
        ayzVar.d("PlayerClient", "deInit out");
    }

    @Override // com.huawei.android.airsharing.api.IServerManager
    @Deprecated
    public void subscribServers(String str) {
        d(str);
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            e.c("PlayerClient", "subscribeServers failed because type is null");
        } else {
            ayz ayzVar = e;
            ayzVar.d("PlayerClient", "subscribeServers in serverType: " + str);
            try {
                Integer.parseInt(str);
                if (this.w == EServiceConnectStatus.SERVICE_DISCONNECTED || this.w == EServiceConnectStatus.SERVICE_DISCONNECTING) {
                    ayzVar.c("PlayerClient", "subscribeServers failed, service has not bind");
                } else if (this.w == EServiceConnectStatus.SERVICE_CONNECTING) {
                    ayzVar.d("PlayerClient", "service connect status is connecting");
                } else if (this.w == EServiceConnectStatus.SERVICE_CONNECTED) {
                    ayzVar.d("PlayerClient", "service connect status is connected, start subServerRunnable");
                    b bVar = new b();
                    bVar.f5085a = str;
                    this.n.execute(bVar);
                } else {
                    ayzVar.d("PlayerClient", "service connect status is invalid");
                }
            } catch (NumberFormatException unused) {
                e.a("PlayerClient", "subscribeServers serverType is not number: " + str);
            }
            e.d("PlayerClient", "subscribeServers out");
        }
        c(2010, "EVENT_TYPE_PLAYER_SUBSCRIBE_FAILED");
        onEventHandle(new InitializationInfoEvent(2010, 1, "EVENT_TYPE_PLAYER_SUBSCRIBE_FAILED"));
        e.d("PlayerClient", "subscribeServers out");
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5085a;

        private b() {
            this.f5085a = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                IAidlHwPlayerManager iAidlHwPlayerManager = PlayerClient.this.f5080b;
                if (iAidlHwPlayerManager == null) {
                    PlayerClient.e.c("PlayerClient", "subServerRunnable aidlHwPlayerManager is null");
                    return;
                }
                PlayerClient.e.d("PlayerClient", "subServerRunnable run");
                int i = PlayerClient.this.t;
                String str = this.f5085a;
                EventListenerAgent eventListenerAgentC = PlayerClient.this.c(PlayerClient.e(), PlayerClient.this.m.getLooper());
                iAidlHwPlayerManager.clsHwSharingListener(i, eventListenerAgentC);
                iAidlHwPlayerManager.setHwSharingListener(i, eventListenerAgentC);
                iAidlHwPlayerManager.subscribServers(i, str);
                PlayerClient.this.f5081c = true;
                PlayerClient.this.d(13);
                PlayerClient.this.i();
                PlayerClient.this.c(2010, "EVENT_TYPE_PLAYER_SUBSCRIBE_SUCCESS");
                PlayerClient.this.onEventHandle(new InitializationInfoEvent(2010, 2, "EVENT_TYPE_PLAYER_SUBSCRIBE_SUCCESS"));
            } catch (RemoteException unused) {
                PlayerClient.e.a("PlayerClient", "subServerRunnable catch RemoteException");
            }
        }
    }

    @Override // com.huawei.android.airsharing.api.IServerManager
    @Deprecated
    public void unsubscribServers() {
        l();
    }

    private void l() {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null) {
            e.c("PlayerClient", "unsubscribeServers aidlHwPlayerManager is null");
            return;
        }
        e.d("PlayerClient", "unsubscribeServers in");
        try {
            iAidlHwPlayerManager.unsubscribServers(this.t, this.y);
            this.f5081c = false;
        } catch (RemoteException unused) {
            e.a("PlayerClient", "unsubscribeServers catch RemoteException");
        }
        e.d("PlayerClient", "unsubscribeServers out");
    }

    @Deprecated
    public void d(IEventListener iEventListener) {
        b(iEventListener);
    }

    @Deprecated
    public void c(IEventListener iEventListener) {
        j();
    }

    public void b(IEventListener iEventListener) {
        if (iEventListener == null) {
            e.c("PlayerClient", "registerListener failed because eventListener is null");
            return;
        }
        synchronized (this.k) {
            this.g = iEventListener;
            e.d("PlayerClient", "registerListener listener: " + this.g);
        }
    }

    public void j() {
        synchronized (this.k) {
            this.g = null;
        }
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null) {
            e.c("PlayerClient", "unregisterListener failed because aidlHwPlayerManager is null");
            return;
        }
        e.d("PlayerClient", "unregisterListener in");
        try {
            iAidlHwPlayerManager.clsHwSharingListener(this.t, c(e(), this.m.getLooper()));
        } catch (RemoteException unused) {
            e.a("PlayerClient", "unregisterListener catch RemoteException");
        }
    }

    @Override // com.huawei.android.airsharing.api.IPlayerManager
    @Deprecated
    public boolean playMedia(String str, String str2, EHwMediaInfoType eHwMediaInfoType, String str3, int i) {
        if (str == null || eHwMediaInfoType == null || str2 == null) {
            e.c("PlayerClient", "playMedia url is error, stop playMedia");
            c(2002, IEventListener.EVENT_TYPE_PLAYER_MEDIA_STOP_PUSH_FAILED);
            return false;
        }
        e.d("PlayerClient", "playMedia in, type: " + eHwMediaInfoType + ", position: " + str3);
        HwMediaInfo hwMediaInfo = new HwMediaInfo();
        hwMediaInfo.setUrl(str);
        hwMediaInfo.setName(str2);
        hwMediaInfo.setMediaInfoType(eHwMediaInfoType);
        hwMediaInfo.setPosition(str3);
        hwMediaInfo.setVolume(i);
        return playMedia(hwMediaInfo, false, null);
    }

    @Override // com.huawei.android.airsharing.api.IPlayerManager
    @Deprecated
    public boolean playMedia(HwMediaInfo hwMediaInfo, boolean z, HwObject hwObject) {
        if (hwMediaInfo == null || hwMediaInfo.getUrl() == null || "".equals(hwMediaInfo.getUrl()) || hwMediaInfo.getMediaInfoType() == null || hwMediaInfo.getName() == null) {
            e.c("PlayerClient", "playMedia media is error, stop playMedia");
            c(2002, IEventListener.EVENT_TYPE_PLAYER_MEDIA_STOP_PUSH_FAILED);
            return false;
        }
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "playMedia aidlHwPlayerManager is null or without service init");
            return false;
        }
        int i = this.t;
        e.d("PlayerClient", "playMedia in, mediaInfo: " + hwMediaInfo + ", isHwAirsharing: " + z);
        try {
            return iAidlHwPlayerManager.playMedia(i, hwMediaInfo, z, hwObject);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "playMedia catch RemoteException");
            return false;
        }
    }

    @Override // com.huawei.android.airsharing.api.IPlayerManager
    @Deprecated
    public boolean play(HwMediaInfo hwMediaInfo, ProjectionDevice projectionDevice) {
        if (hwMediaInfo == null || hwMediaInfo.getUrl() == null || "".equals(hwMediaInfo.getUrl()) || hwMediaInfo.getMediaInfoType() == null || hwMediaInfo.getName() == null || projectionDevice == null || projectionDevice.getIndication() == null) {
            ayz ayzVar = e;
            ayzVar.c("PlayerClient", "play media or device is error, stop play");
            if (projectionDevice == null || projectionDevice.getIndication() == null) {
                ayzVar.c("PlayerClient", "play device or indication is null");
            }
            c(2002, IEventListener.EVENT_TYPE_PLAYER_MEDIA_STOP_PUSH_FAILED);
            return false;
        }
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "play aidlHwPlayerManager is null or without service init");
            return false;
        }
        int i = this.t;
        e.c("PlayerClient", "play in, mediaInfo: " + hwMediaInfo);
        try {
            return iAidlHwPlayerManager.play(i, hwMediaInfo, projectionDevice);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "play catch RemoteException");
            return false;
        }
    }

    @Override // com.huawei.android.airsharing.api.IPlayerManager
    @Deprecated
    public HwMediaPosition getPosition() {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "getPosition aidlHwPlayerManager is null or without service init");
            return null;
        }
        e.d("PlayerClient", "getPosition in");
        try {
            return iAidlHwPlayerManager.getPosition(this.t);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "getPosition catch RemoteException");
            return null;
        }
    }

    @Override // com.huawei.android.airsharing.api.IPlayerManager
    @Deprecated
    public boolean seek(String str) {
        if (TextUtils.isEmpty(str)) {
            e.c("PlayerClient", "seek failed because targetPosition is null");
            return false;
        }
        int i = this.t;
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "seek aidlHwPlayerManager is null or without service init");
            return false;
        }
        e.d("PlayerClient", "seek in, targetPosition: " + str);
        try {
            return iAidlHwPlayerManager.seek(i, str);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "seek catch RemoteException");
            return false;
        }
    }

    @Override // com.huawei.android.airsharing.api.IPlayerManager
    public boolean pause() {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "pause aidlHwPlayerManager is null or without service init");
            return false;
        }
        e.d("PlayerClient", "pause in");
        try {
            return iAidlHwPlayerManager.pause(this.t);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "pause catch RemoteException");
            return false;
        }
    }

    @Override // com.huawei.android.airsharing.api.IPlayerManager
    public boolean resume() {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "resume aidlHwPlayerManager is null or without service init");
            return false;
        }
        e.d("PlayerClient", "resume in");
        try {
            return iAidlHwPlayerManager.resume(this.t);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "resume catch RemoteException");
            return false;
        }
    }

    @Override // com.huawei.android.airsharing.api.IPlayerManager
    public boolean stop() {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "stop aidlHwPlayerManager is null or without service init");
            return false;
        }
        e.d("PlayerClient", "stop in");
        try {
            return iAidlHwPlayerManager.stop(this.t);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "stop catch RemoteException");
            return false;
        }
    }

    @Override // com.huawei.android.airsharing.api.IPlayerManager
    @Deprecated
    public boolean isRendering() {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "isRendering aidlHwPlayerManager is null or without service init");
            return false;
        }
        e.d("PlayerClient", "isRendering in");
        try {
            return iAidlHwPlayerManager.isRendering(this.t);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "isRendering catch RemoteException");
            return false;
        }
    }

    @Override // com.huawei.android.airsharing.api.IPlayerManager
    @Deprecated
    public int getVolume() {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "getVolume aidlHwPlayerManager is null or without service init");
            return 0;
        }
        e.d("PlayerClient", "getVolume in");
        try {
            return iAidlHwPlayerManager.getVolume(this.t);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "getVolume catch RemoteException");
            return 0;
        }
    }

    @Override // com.huawei.android.airsharing.api.IPlayerManager
    public boolean setVolume(int i) {
        if (i < 0 || i > 100) {
            e.c("PlayerClient", "setVolume failed because volume value is invalid");
            return false;
        }
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "setVolume aidlHwPlayerManager is null or without service init");
            return false;
        }
        e.d("PlayerClient", "setVolume in, volume: " + i);
        try {
            return iAidlHwPlayerManager.setVolume(this.t, i);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "setVolume catch RemoteException");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        ComponentName componentName;
        boolean zBindService;
        boolean zA = aze.a(this.i, "com.huawei.android.airsharing");
        ayz ayzVar = e;
        ayzVar.d("PlayerClient", "bindHwPlayerService in, isAirSharing: " + zA);
        String str = zA ? "com.huawei.android.airsharing" : "com.huawei.android.mirrorshare";
        if (this.w == EServiceConnectStatus.SERVICE_CONNECTED || this.w == EServiceConnectStatus.SERVICE_CONNECTING) {
            d(this.y);
            ayzVar.d("PlayerClient", "bindHwPlayerService service has bind");
            return true;
        }
        if (this.i != null) {
            try {
                Intent intent = new Intent();
                if (this.i.checkSelfPermission("com.android.permission.airsharing_play_interface") == 0) {
                    componentName = new ComponentName(str, "com.huawei.android.airsharing.service.PlayerService");
                } else {
                    componentName = new ComponentName(str, "com.huawei.android.airsharing.service.SdkPlayerService");
                }
                intent.setComponent(componentName);
                zBindService = this.i.bindService(intent, this.s, 65);
            } catch (IllegalArgumentException unused) {
                e.a("PlayerClient", "bindService catch IllegalArgumentException");
                zBindService = false;
            } catch (SecurityException unused2) {
                e.a("PlayerClient", "bindService catch SecurityException");
                zBindService = false;
            }
        } else {
            zBindService = false;
        }
        if (zBindService) {
            if (this.w != EServiceConnectStatus.SERVICE_CONNECTED) {
                this.w = EServiceConnectStatus.SERVICE_CONNECTING;
            }
        } else {
            this.w = EServiceConnectStatus.SERVICE_DISCONNECTED;
        }
        e.d("PlayerClient", "bindHwPlayerService out, bindServiceResult: " + zBindService);
        return zBindService;
    }

    private void f() {
        ServiceConnection serviceConnection;
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null) {
            e.c("PlayerClient", "unbindHwPlayerService aidlHwPlayerManager is null");
            return;
        }
        e.d("PlayerClient", "unbindHwPlayerService in");
        try {
            iAidlHwPlayerManager.clsHwSharingListener(this.t, c(e(), this.m.getLooper()));
            Context context = this.i;
            if (context == null || (serviceConnection = this.s) == null) {
                return;
            }
            context.unbindService(serviceConnection);
            this.w = EServiceConnectStatus.SERVICE_DISCONNECTED;
            o();
            synchronized (this.f) {
                try {
                    this.f5080b = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (RemoteException unused) {
            e.a("PlayerClient", "unbindHwPlayerService catch RemoteException");
        } catch (IllegalArgumentException unused2) {
            e.a("PlayerClient", "unbindHwPlayerService catch IllegalArgumentException");
        }
    }

    class a implements IBinder.DeathRecipient {
        private a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            synchronized (this) {
                PlayerClient.this.o();
                PlayerClient.e.c("PlayerClient", "service binderDied");
                synchronized (PlayerClient.this.f) {
                    PlayerClient.this.f5080b = null;
                    PlayerClient.this.f5081c = false;
                }
                PlayerClient.this.c(IEventListener.EVENT_ID_BINDER_DIED, "");
                PlayerClient.this.w = EServiceConnectStatus.SERVICE_DISCONNECTED;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(IBinder iBinder) {
        synchronized (this) {
            e.d("PlayerClient", "linkToDeath in, service: " + iBinder);
            if (iBinder == null) {
                return;
            }
            try {
                o();
                this.r = iBinder;
                iBinder.linkToDeath(this.f5079a, 0);
            } catch (Exception unused) {
                e.a("PlayerClient", "linkToDeath service catch Exception");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        synchronized (this) {
            e.d("PlayerClient", "unlinkToDeath in");
            try {
                IBinder iBinder = this.r;
                if (iBinder != null) {
                    iBinder.unlinkToDeath(this.f5079a, 0);
                }
            } catch (Exception unused) {
                e.a("PlayerClient", "unlinkToDeath service catch Exception");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, String str) {
        e eVar = new e();
        eVar.f5088b = i;
        eVar.e = str;
        this.n.execute(eVar);
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5088b;
        public String e;

        private e() {
            this.f5088b = -1;
            this.e = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            PlayerClient.this.onEvent(this.f5088b, this.e);
        }
    }

    @Override // com.huawei.android.airsharing.api.IEventListener
    public boolean onEvent(int i, String str) {
        ayz ayzVar = e;
        ayzVar.d("PlayerClient", "onEvent, eventId: " + i + " with type: " + str);
        synchronized (this.k) {
            IEventListener iEventListener = this.g;
            if (iEventListener != null && i > 0) {
                return iEventListener.onEvent(i, str);
            }
            ayzVar.c("PlayerClient", "onEvent failed because invalid event id or without listener init");
            return false;
        }
    }

    @Override // com.huawei.android.airsharing.api.IEventListener
    public void onProjectionDeviceUpdate(int i, ProjectionDevice projectionDevice) {
        e.d("PlayerClient", "onProjectionDeviceUpdate, eventId: " + i);
        synchronized (this.k) {
            IEventListener iEventListener = this.g;
            if (iEventListener != null) {
                iEventListener.onProjectionDeviceUpdate(i, projectionDevice);
            }
        }
    }

    @Override // com.huawei.android.airsharing.api.IEventListener
    public void onEventHandle(Event event) {
        if (event == null) {
            e.c("PlayerClient", "onEventHandle failed because event is null!");
            return;
        }
        e.d("PlayerClient", "onEventHandle, eventId: " + event.getEventId());
        synchronized (this.k) {
            IEventListener iEventListener = this.g;
            if (iEventListener != null) {
                iEventListener.onEventHandle(event);
            }
        }
    }

    @Override // com.huawei.android.airsharing.api.IEventListener
    @Deprecated
    public void onDisplayUpdate(int i, String str, String str2, int i2) {
        synchronized (this.k) {
            IEventListener iEventListener = this.g;
            if (iEventListener != null) {
                iEventListener.onDisplayUpdate(i, str, str2, i2);
            }
        }
    }

    @Override // com.huawei.android.airsharing.api.IEventListener
    @Deprecated
    public void onMirrorUpdate(int i, String str, String str2, int i2, boolean z) {
        synchronized (this.k) {
            IEventListener iEventListener = this.g;
            if (iEventListener != null) {
                iEventListener.onMirrorUpdate(i, str, str2, i2, z);
            }
        }
    }

    @Override // com.huawei.android.airsharing.api.IPlayerManager
    @Deprecated
    public HwServer getRenderingServer() {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "getRenderingServer aidlHwPlayerManager is null or without service init");
            return null;
        }
        e.d("PlayerClient", "getRenderingServer in");
        try {
            return iAidlHwPlayerManager.getRenderingServer();
        } catch (RemoteException unused) {
            e.a("PlayerClient", "getRenderingServer catch RemoteException");
            return null;
        }
    }

    @Deprecated
    public boolean b(boolean z) {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "startScanDevice aidlHwPlayerManager is null or without service init");
            return false;
        }
        int i = this.t;
        e.d("PlayerClient", "scanDevice in, pid: " + i + ", isActiveScan: " + z);
        try {
            return iAidlHwPlayerManager.startScanDevice(i, z);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "startScanDevice catch RemoteException");
            return false;
        }
    }

    @Deprecated
    public boolean d(boolean z) {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "stopScanDevice aidlHwPlayerManager is null or without service init");
            return false;
        }
        e.d("PlayerClient", "stopScanDevice in, isActiveScan: " + z);
        try {
            return iAidlHwPlayerManager.stopScanDevice(this.t, z);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "stopScanDevice catch RemoteException");
            return false;
        }
    }

    @Deprecated
    public boolean a(ProjectionDevice projectionDevice) {
        if (projectionDevice == null) {
            e.c("PlayerClient", "connectDevice failed because projection device is null");
            return false;
        }
        ayz ayzVar = e;
        ayzVar.d("PlayerClient", "connectDevice in");
        int i = this.t;
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            ayzVar.c("PlayerClient", "connectDevice aidlHwPlayerManager is null or without service init");
            return false;
        }
        try {
            return iAidlHwPlayerManager.connectDevice(i, projectionDevice);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "connectDevice catch RemoteException");
            return false;
        }
    }

    public boolean d() {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "disconnectDevice aidlHwPlayerManager is null or without service init");
            return false;
        }
        e.d("PlayerClient", "disconnectDevice in");
        try {
            return iAidlHwPlayerManager.disconnectDevice(this.t);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "disconnectDevice catch RemoteException");
            return false;
        }
    }

    public String b() {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "getTargetDevName aidlHwPlayerManager is null or without service init");
            return "";
        }
        e.d("PlayerClient", "getTargetDevName in");
        try {
            return iAidlHwPlayerManager.getTargetDevName(this.t);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "getTargetDevName catch RemoteException");
            return "";
        }
    }

    @Deprecated
    public boolean g() {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "isConnected aidlHwPlayerManager is null or without service init");
            return false;
        }
        e.d("PlayerClient", "isConnected in");
        try {
            return iAidlHwPlayerManager.isConnected(this.t);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "isConnected catch RemoteException");
            return false;
        }
    }

    public int a() {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "getSdkVersion aidlHwPlayerManager is null or without service init");
            return -1;
        }
        e.d("PlayerClient", "getSdkVersion in");
        try {
            return iAidlHwPlayerManager.getSdkVersion();
        } catch (RemoteException unused) {
            e.a("PlayerClient", "getSdkVersion catch RemoteException");
            return -1;
        }
    }

    public boolean d(int i) {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "setUsingCapability aidlHwPlayerManager is null or without service init");
            return false;
        }
        e.d("PlayerClient", "setUsingCapability in");
        try {
            return iAidlHwPlayerManager.setUsingCapability(this.t, i);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "setUsingCapability catch RemoteException");
            return false;
        }
    }

    public boolean c(String str, String str2) {
        IAidlHwPlayerManager iAidlHwPlayerManager = this.f5080b;
        if (iAidlHwPlayerManager == null || !this.f5081c) {
            e.c("PlayerClient", "setExtendInfo aidlHwPlayerManager is null or without service init");
            return false;
        }
        e.d("PlayerClient", "setExtendInfo in");
        try {
            return iAidlHwPlayerManager.setExtendInfo(str, str2);
        } catch (RemoteException unused) {
            e.a("PlayerClient", "setExtendInfo catch RemoteException");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EventListenerAgent c(IEventListener iEventListener, Looper looper) {
        EventListenerAgent eventListenerAgent;
        if (iEventListener == null) {
            return null;
        }
        synchronized (this.q) {
            this.q.remove(iEventListener);
            eventListenerAgent = new EventListenerAgent(iEventListener, looper);
            this.q.put(iEventListener, eventListenerAgent);
        }
        return eventListenerAgent;
    }

    private void e(IEventListener iEventListener) {
        if (iEventListener == null) {
            return;
        }
        synchronized (this.q) {
            this.q.remove(iEventListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        e.d("PlayerClient", "recordSdkVersion in");
        azf.b().c(a());
        c("SDK_VERSION", String.valueOf(azf.b().a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ayz ayzVar = e;
        ayzVar.d("PlayerClient", "updateCastStatus in");
        synchronized (this.u) {
            ContentResolver contentResolver = this.h;
            if (contentResolver != null && this.x != null) {
                String string = Settings.Global.getString(contentResolver, "cast_plus_info");
                ayzVar.d("PlayerClient", "updateCastStatus in, castStatus " + string);
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                HashMap map = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(Integer.valueOf(Integer.parseInt(next)), Integer.valueOf(jSONObject.getInt(next)));
                    }
                    this.x.onStatusChanged(map);
                } catch (NumberFormatException | JSONException e2) {
                    e.a("PlayerClient", "ERROR : updateCastStatus, JSONException : " + e2);
                }
                return;
            }
            ayzVar.e("PlayerClient", "updateCastStatus in, mStatusListener is null");
        }
    }
}
