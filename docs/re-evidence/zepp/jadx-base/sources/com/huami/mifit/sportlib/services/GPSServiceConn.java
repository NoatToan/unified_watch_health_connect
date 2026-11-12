package com.huami.mifit.sportlib.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.huami.mifit.sportlib.IServiceObtain;
import com.huami.mifit.sportlib.LocationProvider;
import com.huami.mifit.sportlib.callback.IServiceDataCallback;
import com.huami.mifit.sportlib.callback.IServiceSportCallback;
import com.huami.mifit.sportlib.common.SportStatusCommand;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.mifit.sportlib.locate.GPSSignal;
import com.huami.mifit.sportlib.locate.InnerLocationProvider;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import com.huami.mifit.sportlib.observer.IServiceDataObserver;
import com.huami.mifit.sportlib.observer.IServiceSportObserver;
import com.huami.mifit.sportlib.tts.RunningPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes11.dex */
public class GPSServiceConn extends IGPSServiceConn {
    public static final int DEFAULT_VALUE = -1;
    private static List<IServiceDataObserver> l = new ArrayList();
    private static List<IServiceSportObserver> m = new ArrayList();
    private final String d;
    private int e;
    private long f;
    private ConcurrentLinkedQueue<Integer> g;
    private IGPSServiceConn.ServiceState h;
    private IServiceObtain i;
    private Handler j;
    private LocationProvider k;

    public class a extends TimerTask {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                LogKit.w2f("GPSServiceConn", "try stop mergeGPSSport, emitter:" + this.a);
                GPSServiceConn.this.i.stopSport(this.a);
                if (RunningPlayer.getInstance() != null) {
                    RunningPlayer.getInstance().setMergePauseAndStop(false);
                }
            } catch (RemoteException e) {
                LogKit.w2f("GPSServiceConn", "mergeStopGPSSport:" + e.getMessage());
            }
        }
    }

    public class b extends IServiceDataCallback.Stub {

        public class a implements Runnable {
            public final /* synthetic */ float a;

            public a(float f) {
                this.a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = GPSServiceConn.l.iterator();
                while (it2.hasNext()) {
                    ((IServiceDataObserver) it2.next()).onClimbAscendChanged(this.a);
                }
            }
        }

        /* JADX INFO: renamed from: com.huami.mifit.sportlib.services.GPSServiceConn$b$b, reason: collision with other inner class name */
        public class RunnableC0480b implements Runnable {
            public final /* synthetic */ float a;

            public RunnableC0480b(float f) {
                this.a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = GPSServiceConn.l.iterator();
                while (it2.hasNext()) {
                    ((IServiceDataObserver) it2.next()).onPaceChanged(this.a);
                }
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ float a;

            public c(float f) {
                this.a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = GPSServiceConn.l.iterator();
                while (it2.hasNext()) {
                    ((IServiceDataObserver) it2.next()).onDistanceChanged(this.a);
                }
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ float a;

            public d(float f) {
                this.a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = GPSServiceConn.l.iterator();
                while (it2.hasNext()) {
                    ((IServiceDataObserver) it2.next()).onStepFreqChanged(this.a);
                }
            }
        }

        public class e implements Runnable {
            public final /* synthetic */ float a;

            public e(float f) {
                this.a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = GPSServiceConn.l.iterator();
                while (it2.hasNext()) {
                    ((IServiceDataObserver) it2.next()).onAltitudeChanged(this.a);
                }
            }
        }

        public class f implements Runnable {
            public final /* synthetic */ int a;

            public f(int i) {
                this.a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = GPSServiceConn.l.iterator();
                while (it2.hasNext()) {
                    ((IServiceDataObserver) it2.next()).onStepChanged(this.a);
                }
            }
        }

        public class g implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;

            public g(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = GPSServiceConn.l.iterator();
                while (it2.hasNext()) {
                    ((IServiceDataObserver) it2.next()).onHrChanged(this.a, this.b);
                }
            }
        }

        public class h implements Runnable {
            public h() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = GPSServiceConn.l.iterator();
                while (it2.hasNext()) {
                    ((IServiceDataObserver) it2.next()).onFinish();
                }
            }
        }

        public class i implements Runnable {
            public final /* synthetic */ float a;

            public i(float f) {
                this.a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = GPSServiceConn.l.iterator();
                while (it2.hasNext()) {
                    ((IServiceDataObserver) it2.next()).onAvgPaceChanged(this.a);
                }
            }
        }

        public class j implements Runnable {
            public final /* synthetic */ float a;

            public j(float f) {
                this.a = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it2 = GPSServiceConn.l.iterator();
                while (it2.hasNext()) {
                    ((IServiceDataObserver) it2.next()).onCalorieChanged(this.a);
                }
            }
        }

        private b() {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onAltitudeChanged(float f2) throws RemoteException {
            GPSServiceConn.this.j.post(new e(f2));
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onAvgPaceChanged(float f2) throws RemoteException {
            GPSServiceConn.this.j.post(new i(f2));
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onCalorieChanged(float f2) throws RemoteException {
            GPSServiceConn.this.j.post(new j(f2));
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onClimbAscendChanged(float f2) throws RemoteException {
            GPSServiceConn.this.j.post(new a(f2));
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onDistanceChanged(float f2) throws RemoteException {
            GPSServiceConn.this.j.post(new c(f2));
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onFinish() throws RemoteException {
            GPSServiceConn.this.j.post(new h());
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onGPSLineInfoChanged(List<GPSPoint> list, RouteLineInfo routeLineInfo) throws RemoteException {
            Iterator it2 = GPSServiceConn.l.iterator();
            while (it2.hasNext()) {
                ((IServiceDataObserver) it2.next()).onGPSLineInfoChanged(list, routeLineInfo);
            }
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onHrChanged(int i2, int i3) throws RemoteException {
            GPSServiceConn.this.j.post(new g(i2, i3));
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onLocationChanged(GPSPoint gPSPoint) throws RemoteException {
            Iterator it2 = GPSServiceConn.l.iterator();
            while (it2.hasNext()) {
                ((IServiceDataObserver) it2.next()).onLocationChanged(gPSPoint);
            }
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onPaceChanged(float f2) throws RemoteException {
            GPSServiceConn.this.j.post(new RunnableC0480b(f2));
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onSportControl(int i2, int i3) throws RemoteException {
            Iterator it2 = GPSServiceConn.l.iterator();
            while (it2.hasNext()) {
                ((IServiceDataObserver) it2.next()).onSportControl(i2, i3);
            }
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onSportTimeChanged(long j2) throws RemoteException {
            Iterator it2 = GPSServiceConn.l.iterator();
            while (it2.hasNext()) {
                ((IServiceDataObserver) it2.next()).onSportTimeChanged(j2);
            }
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onStepChanged(int i2) throws RemoteException {
            GPSServiceConn.this.j.post(new f(i2));
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onStepFreqChanged(float f2) throws RemoteException {
            GPSServiceConn.this.j.post(new d(f2));
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceDataCallback
        public void onTestLocationChanged(GPSPoint gPSPoint) throws RemoteException {
            Iterator it2 = GPSServiceConn.l.iterator();
            while (it2.hasNext()) {
                ((IServiceDataObserver) it2.next()).onTestLocationChanged(gPSPoint);
            }
        }
    }

    public class c extends IServiceSportCallback.Stub {
        private c() {
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceSportCallback
        public void onDeviceStatusChanged(boolean z, boolean z2) throws RemoteException {
            Iterator it2 = GPSServiceConn.m.iterator();
            while (it2.hasNext()) {
                ((IServiceSportObserver) it2.next()).onDeviceStatusChanged(z, z2);
            }
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceSportCallback
        public void onGPSSignalChanged(int i) throws RemoteException {
            Iterator it2 = GPSServiceConn.m.iterator();
            while (it2.hasNext()) {
                ((IServiceSportObserver) it2.next()).onGPSSignalChanged(i);
            }
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceSportCallback
        public void onInaccuracyLocationChanged(GPSPoint gPSPoint) throws RemoteException {
            Iterator it2 = GPSServiceConn.m.iterator();
            while (it2.hasNext()) {
                ((IServiceSportObserver) it2.next()).onInaccuracyLocationChanged(gPSPoint);
            }
        }

        @Override // com.huami.mifit.sportlib.callback.IServiceSportCallback
        public void onScreenStatusChanged(String str, String str2) throws RemoteException {
            Iterator it2 = GPSServiceConn.m.iterator();
            while (it2.hasNext()) {
                ((IServiceSportObserver) it2.next()).onScreenStatusChanged(str, str2);
            }
        }
    }

    public GPSServiceConn(Context context, int i) {
        this(context, i, InnerLocationProvider.INSTANCE.getInstance(context.getApplicationContext()));
    }

    private IGPSServiceConn.ServiceState e(int i) {
        if (this.i != null) {
            try {
                RunningPlayer.getInstance().setMergePauseAndStop(true);
                this.i.pauseSport(i);
                new Timer().schedule(new a(i), 2000L);
                return IGPSServiceConn.ServiceState.SERVICE_READY;
            } catch (RemoteException e) {
                LogKit.w2f("GPSServiceConn", "mergePauseGPSSport:" + e.getMessage());
            }
        }
        return this.h;
    }

    private IGPSServiceConn.ServiceState f(int i) {
        IServiceObtain iServiceObtain = this.i;
        if (iServiceObtain != null) {
            try {
                iServiceObtain.pauseSport(i);
                return IGPSServiceConn.ServiceState.SERVICE_READY;
            } catch (RemoteException e) {
                LogKit.w2f("GPSServiceConn", "pauseGPSSport:" + e.toString());
            }
        }
        return this.h;
    }

    private IGPSServiceConn.ServiceState g(int i) {
        IServiceObtain iServiceObtain = this.i;
        if (iServiceObtain != null) {
            try {
                iServiceObtain.resumeSport(i);
                return IGPSServiceConn.ServiceState.SERVICE_READY;
            } catch (RemoteException e) {
                LogKit.w2f("GPSServiceConn", "resumeGPSSport:" + e.toString());
            }
        }
        return this.h;
    }

    private IGPSServiceConn.ServiceState h() {
        IServiceObtain iServiceObtain = this.i;
        if (iServiceObtain != null) {
            try {
                this.f = iServiceObtain.startSport(this.e);
                return IGPSServiceConn.ServiceState.SERVICE_READY;
            } catch (RemoteException e) {
                LogKit.w2f("GPSServiceConn", "startGPSSport:" + e.toString());
            }
        }
        IGPSServiceConn.ServiceState serviceState = this.h;
        IGPSServiceConn.ServiceState serviceState2 = IGPSServiceConn.ServiceState.SERVICE_UNBIND;
        if (serviceState == serviceState2) {
            return serviceState2;
        }
        this.g.add(1);
        return IGPSServiceConn.ServiceState.BINDING_SERVICE;
    }

    private IGPSServiceConn.ServiceState i(int i) {
        IServiceObtain iServiceObtain = this.i;
        if (iServiceObtain != null) {
            try {
                iServiceObtain.stopSport(i);
                return IGPSServiceConn.ServiceState.SERVICE_READY;
            } catch (RemoteException e) {
                LogKit.w2f("GPSServiceConn", "stopWork:" + e.toString());
            }
        }
        return this.h;
    }

    public void changeSportType(int i) {
        IServiceObtain iServiceObtain = this.i;
        if (iServiceObtain != null) {
            this.e = i;
            try {
                iServiceObtain.changeSportType(i);
            } catch (RemoteException e) {
                LogKit.w2f("GPSServiceConn", "changeSportType:" + e.toString());
            }
        }
    }

    @Override // com.huami.mifit.sportlib.services.IGPSServiceConn
    public void destroy(Context context) {
        super.destroy(context);
        ConcurrentLinkedQueue<Integer> concurrentLinkedQueue = this.g;
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.clear();
        }
    }

    public IGPSServiceConn.ServiceState executeSportCmd(int i, int i2) {
        if (!SportStatusCommand.isValidCmd(i)) {
            LogKit.w2f("IllegalArgumentException", "GPSSportController executeSportCmd");
            throw new IllegalArgumentException();
        }
        Context context = this.a.get();
        if (context == null) {
            return IGPSServiceConn.ServiceState.DEFAULT;
        }
        if (i == 1) {
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(new Intent(context, (Class<?>) SubGPSSportService.class));
            } else {
                context.startService(new Intent(context, (Class<?>) SubGPSSportService.class));
            }
            return h();
        }
        if (i == 2) {
            return g(i2);
        }
        if (i == 3) {
            return f(i2);
        }
        if (i != 4) {
            return IGPSServiceConn.ServiceState.DEFAULT;
        }
        IGPSServiceConn.ServiceState serviceStateI = GPSDataController.getInstance().getState() == 2 ? i(i2) : e(i2);
        context.stopService(new Intent(context, (Class<?>) SubGPSSportService.class));
        return serviceStateI;
    }

    public String getGPSProvider() {
        IServiceObtain iServiceObtain = this.i;
        if (iServiceObtain == null) {
            return "";
        }
        try {
            return iServiceObtain.getGPSProvider();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public int getGPSSignalLevel() {
        IServiceObtain iServiceObtain = this.i;
        if (iServiceObtain != null) {
            try {
                return iServiceObtain.getGPSSignalLevel();
            } catch (RemoteException unused) {
            }
        }
        return GPSSignal.SignalLevel.DEFAULT.getValue();
    }

    public int getSportState() {
        IServiceObtain iServiceObtain = this.i;
        if (iServiceObtain == null) {
            return -1;
        }
        try {
            return iServiceObtain.getSportState();
        } catch (RemoteException unused) {
            return -1;
        }
    }

    public long getTickerTimeInMillisecond() {
        IServiceObtain iServiceObtain = this.i;
        if (iServiceObtain == null) {
            return -1L;
        }
        try {
            return iServiceObtain.getTickerTimeInMillisecond();
        } catch (RemoteException unused) {
            return -1L;
        }
    }

    public long getTrackId() {
        long j = this.f;
        if (j > 0) {
            return j;
        }
        IServiceObtain iServiceObtain = this.i;
        if (iServiceObtain == null) {
            return -1L;
        }
        try {
            this.f = iServiceObtain.getTrackId();
        } catch (RemoteException e) {
            LogKit.w2f("GPSServiceConn", "getTrackId:" + e.toString());
        }
        return this.f;
    }

    public int getUserOpState() {
        IServiceObtain iServiceObtain = this.i;
        if (iServiceObtain == null) {
            return -1;
        }
        try {
            return iServiceObtain.getUserOpState();
        } catch (RemoteException unused) {
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.mifit.sportlib.services.IGPSServiceConn, android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        super.onServiceConnected(componentName, iBinder);
        IServiceObtain iServiceObtainAsInterface = IServiceObtain.Stub.asInterface(iBinder);
        this.i = iServiceObtainAsInterface;
        try {
            this.h = IGPSServiceConn.ServiceState.SERVICE_READY;
            iServiceObtainAsInterface.changeSportType(this.e);
            this.i.registerDataCallback(new b());
            this.i.registerSportCallback(new c());
            this.i.setLocationProvider(this.k);
            IGPSServiceConn.IServiceStateListener iServiceStateListener = this.b;
            if (iServiceStateListener != null) {
                iServiceStateListener.onServerStateChanged(this.h);
                this.b.onServiceConnected();
            }
            if (this.g.remove(1)) {
                this.f = this.i.startSport(this.e);
            } else {
                this.f = this.i.getTrackId();
            }
        } catch (Exception e) {
            LogKit.w2f("GPSServiceConn", "onServiceConnected error:" + e.toString());
        }
    }

    @Override // com.huami.mifit.sportlib.services.IGPSServiceConn, android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        super.onServiceDisconnected(componentName);
        IGPSServiceConn.IServiceStateListener iServiceStateListener = this.b;
        if (iServiceStateListener != null) {
            iServiceStateListener.onServiceDisConnected();
        }
    }

    public void recoverRun(long j) {
        IServiceObtain iServiceObtain = this.i;
        if (iServiceObtain != null) {
            try {
                iServiceObtain.recoverRun(j);
            } catch (RemoteException unused) {
            }
        }
    }

    public void registerDataObserver(IServiceDataObserver iServiceDataObserver) {
        l.add(iServiceDataObserver);
    }

    public void registerSportObserver(IServiceSportObserver iServiceSportObserver) {
        m.add(iServiceSportObserver);
    }

    public void restoreGpsLine() {
        IServiceObtain iServiceObtain = this.i;
        if (iServiceObtain != null) {
            try {
                iServiceObtain.restoreGpsLine();
            } catch (RemoteException e) {
                LogKit.w2f("GPSServiceConn", "restoreGpsLine:" + e.toString());
            }
        }
    }

    public void unregisterDataObserver(IServiceDataObserver iServiceDataObserver) {
        if (iServiceDataObserver == null || !l.contains(iServiceDataObserver)) {
            return;
        }
        l.remove(iServiceDataObserver);
    }

    public void unregisterSportObserver(IServiceSportObserver iServiceSportObserver) {
        if (iServiceSportObserver == null || !m.contains(iServiceSportObserver)) {
            return;
        }
        m.remove(iServiceSportObserver);
    }

    public void verifyDistance(int i) {
        IServiceObtain iServiceObtain = this.i;
        if (iServiceObtain != null) {
            try {
                iServiceObtain.verifyIndoorDistance(i);
            } catch (RemoteException e) {
                LogKit.w2f("GPSServiceConn", "verifyDistance:" + e.toString());
            }
        }
    }

    public GPSServiceConn(Context context, int i, LocationProvider locationProvider) {
        super(context);
        this.d = "GPSServiceConn";
        this.e = -1;
        this.f = -1L;
        this.g = null;
        this.h = IGPSServiceConn.ServiceState.BINDING_SERVICE;
        this.i = null;
        this.j = new Handler(Looper.getMainLooper());
        this.k = locationProvider;
        this.e = i;
        this.g = new ConcurrentLinkedQueue<>();
    }
}
