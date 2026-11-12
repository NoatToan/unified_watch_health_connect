package com.dsi.ant.utils.communicator;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.dsi.ant.channel.AntCommandFailedException;
import com.dsi.ant.channel.ChannelNotAvailableException;
import com.dsi.ant.channel.UnsupportedFeatureException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
public class AntChannelSearchController {
    private static final long CHANNEL_GET_RETRY_DELAY_MS = 200;
    private static final int MAX_CHANNEL_GET_TRIES = 50;
    public static final int NO_TIMEOUT_VALUE = -1;
    private static String TAG = "AntChannelSearchController";
    private boolean mBound;
    private final ak.b mChanId;
    private BroadcastReceiver mChannelAvailableReceiver;
    private final ServiceConnection mChannelConnection;
    private nk.a mCommunicator;
    private final j mConnection;
    private final Context mContext;
    private ok.d mExecutor;
    private List<Integer> mFoundDevices;
    private final long mInitialSearchTimeoutMillis;
    private final wj.k mNetwork;
    private final int mPeriod;
    private wj.j mPrivateNetwork;
    private wj.b mProvider;
    private final int mProximityThreshold;
    private final k mResultReceiver;
    private final int mRfFreq;
    private final ServiceConnection mSearchConnection;
    private final rk.a.b mSearchHandler;
    private final Timer mSearchTimer;
    private boolean mShutdown;
    private final Object mStateLock;
    private boolean mStayConnected;
    private boolean mStopEventSent;
    private boolean mTimedout;
    private volatile boolean mWaitForChannels;

    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: com.dsi.ant.utils.communicator.AntChannelSearchController$a$a, reason: collision with other inner class name */
        public class C0437a extends Thread {
            public C0437a() {
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                try {
                    AntChannelSearchController.this.getChannelAndStartSearch();
                } catch (RemoteException unused) {
                    AntChannelSearchController.this.close();
                } catch (ChannelNotAvailableException unused2) {
                    AntChannelSearchController.this.close();
                }
            }
        }

        public a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AntChannelSearchController antChannelSearchController = AntChannelSearchController.this;
            try {
                vj.a aVar = new vj.a(iBinder);
                if (aVar.f178444b == null) {
                    aVar.f178444b = new wj.b(aVar.f178443a.w(vj.a.EnumC3334a.CHANNEL_PROVIDER.f178447a));
                }
                antChannelSearchController.mProvider = aVar.f178444b;
                new C0437a().start();
            } catch (RemoteException unused) {
                antChannelSearchController.close();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            AntChannelSearchController.this.close();
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (AntChannelSearchController.this.mStateLock) {
                nk.a aVar = AntChannelSearchController.this.mCommunicator;
                nk.a.C2430a c2430a = aVar.f126369g;
                if (c2430a != null) {
                    c2430a.b();
                }
                aVar.release();
                AntChannelSearchController.this.mCommunicator = null;
            }
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent.getIntExtra("com.dsi.ant.intent.extra.CHANNEL_PROVIDER_NUM_CHANNELS_AVAILABLE", 0) > 0) {
                AntChannelSearchController antChannelSearchController = AntChannelSearchController.this;
                if (antChannelSearchController.mWaitForChannels) {
                    try {
                        antChannelSearchController.getChannelAndStartSearch();
                    } catch (RemoteException unused) {
                        antChannelSearchController.close();
                    } catch (ChannelNotAvailableException unused2) {
                        String unused3 = AntChannelSearchController.TAG;
                        int i14 = qk.b.f145071a;
                    }
                }
            }
        }
    }

    public class d implements ok.d.b {
        public d() {
        }

        @Override // ok.d.b
        public final void a() {
            AntChannelSearchController.this.close();
        }
    }

    public class e extends TimerTask {
        public e() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            synchronized (AntChannelSearchController.this.mStateLock) {
                try {
                    if (!AntChannelSearchController.this.mShutdown && AntChannelSearchController.this.mExecutor != null) {
                        AntChannelSearchController.this.mExecutor.e(null);
                        AntChannelSearchController.this.mTimedout = true;
                        AntChannelSearchController.access$900(AntChannelSearchController.this);
                        throw null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public class f extends Thread {
        public f(l lVar) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            AntChannelSearchController.access$900(AntChannelSearchController.this);
            throw null;
        }
    }

    public class g implements rk.a.b {
        public g() {
        }

        public final void a(rk.a.EnumC2896a enumC2896a, ak.b bVar) {
            int i14 = h.f28597a[enumC2896a.ordinal()];
            AntChannelSearchController antChannelSearchController = AntChannelSearchController.this;
            if (i14 != 1) {
                if (i14 != 2) {
                    antChannelSearchController.sendStopEvent(l.INTERRUPTED);
                }
            } else {
                if (antChannelSearchController.mFoundDevices.contains(Integer.valueOf(bVar.f3497a))) {
                    return;
                }
                antChannelSearchController.mFoundDevices.add(Integer.valueOf(bVar.f3497a));
                AntChannelSearchController.access$900(antChannelSearchController);
                new i(bVar, (nk.a) antChannelSearchController.mExecutor.f(false), null);
                throw null;
            }
        }
    }

    public static /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28597a;

        static {
            int[] iArr = new int[rk.a.EnumC2896a.values().length];
            f28597a = iArr;
            try {
                iArr[rk.a.EnumC2896a.FOUND_DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28597a[rk.a.EnumC2896a.SEARCH_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28597a[rk.a.EnumC2896a.INTERRUPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class j implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ServiceConnection f28599a;

        public j(ServiceConnection serviceConnection) {
            if (serviceConnection == null) {
                vb.h.s("Target can not be null.");
                throw null;
            }
            synchronized (AntChannelSearchController.this.mStateLock) {
                this.f28599a = serviceConnection;
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (AntChannelSearchController.this.mStateLock) {
                this.f28599a.onServiceConnected(componentName, iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (AntChannelSearchController.this.mStateLock) {
                this.f28599a.onServiceDisconnected(componentName);
            }
        }
    }

    public interface k {
    }

    public enum l {
        NO_ADAPTERS,
        INTERRUPTED
    }

    public AntChannelSearchController(ak.b bVar, int i14, int i15, int i16, wj.k kVar, k kVar2, Context context, long j8, boolean z14) {
        this.mStateLock = new Object();
        a aVar = new a();
        this.mSearchConnection = aVar;
        this.mChannelConnection = new b();
        j jVar = new j(aVar);
        this.mConnection = jVar;
        this.mSearchTimer = new Timer();
        this.mShutdown = false;
        this.mBound = false;
        this.mStopEventSent = false;
        this.mTimedout = false;
        this.mStayConnected = false;
        this.mWaitForChannels = false;
        this.mChannelAvailableReceiver = new c();
        this.mSearchHandler = new g();
        this.mContext = context;
        this.mRfFreq = i14;
        this.mPeriod = i15;
        this.mProximityThreshold = i16;
        this.mChanId = bVar;
        this.mNetwork = kVar;
        this.mInitialSearchTimeoutMillis = j8;
        vj.a.f178442c = vj.a.a(context);
        Intent intent = new Intent();
        intent.setAction("com.dsi.ant.bind.AntService");
        context.bindService(intent, jVar, 1);
        this.mBound = true;
        this.mStayConnected = z14;
        this.mFoundDevices = new ArrayList();
        context.registerReceiver(this.mChannelAvailableReceiver, new IntentFilter("com.dsi.ant.intent.action.CHANNEL_PROVIDER_STATE_CHANGED"));
    }

    public static /* synthetic */ k access$900(AntChannelSearchController antChannelSearchController) {
        antChannelSearchController.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getChannelAndStartSearch() {
        if (!isAntAdapterAvailable()) {
            sendStopEvent(l.NO_ADAPTERS);
        }
        if (this.mProvider.f185710a.f197463a.I() <= 0) {
            int i14 = qk.b.f145071a;
            this.mWaitForChannels = true;
            return;
        }
        try {
            wj.k kVar = this.mNetwork;
            wj.k kVar2 = wj.k.INVALID;
            wj.b bVar = this.mProvider;
            Context context = this.mContext;
            wj.a aVarA = kVar != kVar2 ? bVar.a(context, kVar) : bVar.b(context, this.mPrivateNetwork);
            this.mWaitForChannels = false;
            synchronized (this.mStateLock) {
                try {
                    if (this.mShutdown) {
                        aVarA.f();
                    } else {
                        this.mExecutor = new ok.d(aVarA, new d());
                        startSearch(this.mInitialSearchTimeoutMillis, this.mStayConnected);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (ChannelNotAvailableException unused) {
            int i15 = qk.b.f145071a;
            this.mWaitForChannels = true;
        } catch (UnsupportedFeatureException unused2) {
            int i16 = qk.b.f145071a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r1.reasonCode == wj.g.NO_ADAPTERS_EXIST) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean isAntAdapterAvailable() {
        int i14 = 0;
        while (true) {
            int i15 = i14 + 1;
            if (i14 < 50) {
                try {
                    this.mProvider.a(this.mContext, wj.k.ANT_PLUS).f();
                    try {
                        Thread.sleep(CHANNEL_GET_RETRY_DELAY_MS);
                    } catch (InterruptedException e4) {
                        e4.printStackTrace();
                    }
                } catch (RemoteException unused) {
                    break;
                } catch (ChannelNotAvailableException e14) {
                    try {
                    } catch (Throwable th3) {
                        try {
                            Thread.sleep(CHANNEL_GET_RETRY_DELAY_MS);
                        } catch (InterruptedException e15) {
                            e15.printStackTrace();
                        }
                        throw th3;
                    }
                } catch (NullPointerException unused2) {
                    try {
                        Thread.sleep(CHANNEL_GET_RETRY_DELAY_MS);
                    } catch (InterruptedException e16) {
                        e16.printStackTrace();
                    }
                    i14 = i15;
                }
            }
            return true;
            i14 = i15;
        }
        try {
            Thread.sleep(CHANNEL_GET_RETRY_DELAY_MS);
            return false;
        } catch (InterruptedException e17) {
            e17.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendStopEvent(l lVar) {
        synchronized (this.mStateLock) {
            try {
                if (this.mStopEventSent) {
                    return;
                }
                this.mStopEventSent = true;
                new f(lVar).start();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private void startSearch(long j8, boolean z14) {
        ok.e cVar;
        if (z14) {
            int i14 = this.mRfFreq;
            int i15 = this.mPeriod;
            ak.b bVar = this.mChanId;
            cVar = new rk.c(0, i14, i15, bVar.f3499c, bVar.f3500d, this.mProximityThreshold, this.mSearchHandler);
        } else {
            int i16 = this.mRfFreq;
            int i17 = this.mPeriod;
            ak.b bVar2 = this.mChanId;
            cVar = new rk.b(i16, i17, bVar2.f3499c, bVar2.f3500d, this.mProximityThreshold, this.mSearchHandler);
        }
        this.mExecutor.e(cVar);
        if (j8 != -1) {
            this.mSearchTimer.schedule(new e(), j8);
        }
    }

    public void close() {
        synchronized (this.mStateLock) {
            try {
                if (this.mShutdown) {
                    return;
                }
                this.mShutdown = true;
                this.mSearchTimer.cancel();
                ok.d dVar = this.mExecutor;
                if (dVar != null) {
                    dVar.f(true);
                }
                if (this.mBound) {
                    this.mContext.unbindService(this.mConnection);
                }
                sendStopEvent(l.INTERRUPTED);
                this.mContext.unregisterReceiver(this.mChannelAvailableReceiver);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public nk.a connect(i iVar, int i14) {
        ok.d dVar;
        nk.a aVar;
        boolean z14;
        synchronized (this.mStateLock) {
            if (this.mShutdown || (dVar = this.mExecutor) == null) {
                throw new IllegalStateException("Can only connect to device while search is active.");
            }
            wj.a aVar2 = null;
            dVar.e(null);
            pk.a aVar3 = new pk.a();
            try {
                this.mExecutor.g(aVar3, 1000);
                try {
                    aVar3.f138170q.await();
                    z14 = !aVar3.f138169p;
                } catch (InterruptedException unused) {
                    z14 = false;
                }
                if (!z14) {
                    throw new InterruptedException();
                }
                wj.a aVar4 = ((nk.a) this.mExecutor.f(false)).f126363a;
                try {
                    this.mExecutor = null;
                } catch (InterruptedException unused2) {
                    aVar2 = aVar4;
                    aVar4 = aVar2;
                }
                if (aVar4 == null) {
                    close();
                    throw new RemoteException();
                }
                try {
                    ak.d dVar2 = ak.d.BIDIRECTIONAL_SLAVE;
                    ak.f fVar = new ak.f();
                    Bundle bundle = new Bundle();
                    aVar4.f185705a.i(dVar2, fVar, bundle);
                    wj.a.b(ck.k.ASSIGN_CHANNEL, bundle);
                    ak.b bVar = iVar.f28598a;
                    Bundle bundle2 = new Bundle();
                    aVar4.f185705a.m(bVar, bundle2);
                    wj.a.b(ck.k.CHANNEL_ID, bundle2);
                    int i15 = this.mRfFreq;
                    Bundle bundle3 = new Bundle();
                    aVar4.f185705a.F(i15, bundle3);
                    wj.a.b(ck.k.CHANNEL_RF_FREQUENCY, bundle3);
                    Bundle bundle4 = new Bundle();
                    aVar4.f185705a.q(i14, bundle4);
                    wj.a.b(ck.k.CHANNEL_PERIOD, bundle4);
                    aVar4.g(wj.h.f185764d);
                    Bundle bundle5 = new Bundle();
                    aVar4.f185705a.z(bundle5);
                    wj.a.b(ck.k.OPEN_CHANNEL, bundle5);
                    this.mBound = false;
                    j jVar = this.mConnection;
                    ServiceConnection serviceConnection = this.mChannelConnection;
                    if (serviceConnection == null) {
                        jVar.getClass();
                        throw new IllegalArgumentException("Target can not be null.");
                    }
                    synchronized (AntChannelSearchController.this.mStateLock) {
                        jVar.f28599a = serviceConnection;
                    }
                    this.mCommunicator = new nk.a(aVar4, this.mConnection, this.mContext);
                    sendStopEvent(l.INTERRUPTED);
                    aVar = this.mCommunicator;
                } catch (AntCommandFailedException e4) {
                    aVar4.f();
                    close();
                    throw e4;
                }
            } catch (InterruptedException unused3) {
            }
        }
        return aVar;
    }

    public void removeDeviceFromExclusionList(i iVar) {
        this.mFoundDevices.remove(Integer.valueOf(iVar.f28598a.f3497a));
    }

    public void restartSearch(long j8) {
        synchronized (this.mStateLock) {
            if (this.mShutdown || !this.mTimedout) {
                throw new IllegalStateException("Cannot restart a closed or running search.");
            }
            this.mTimedout = false;
            this.mFoundDevices = new ArrayList();
            try {
                getChannelAndStartSearch();
            } catch (RemoteException e4) {
                e4.printStackTrace();
            } catch (ChannelNotAvailableException e14) {
                e14.printStackTrace();
            }
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ak.b f28598a;

        private i(ak.b bVar, nk.a aVar) {
            this.f28598a = bVar;
        }

        public /* synthetic */ i(ak.b bVar, nk.a aVar, a aVar2) {
            this(bVar, aVar);
        }
    }

    public AntChannelSearchController(ak.b bVar, int i14, int i15, int i16, wj.j jVar, k kVar, Context context, long j8, boolean z14) {
        this(bVar, i14, i15, i16, wj.k.INVALID, kVar, context, j8, z14);
        this.mPrivateNetwork = jVar;
    }
}
