package com.huawei.healthcloud.plugintrack.open;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.ITrackDataReport;
import com.huawei.health.ITrackSportManager;
import com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener;
import com.huawei.healthcloud.plugintrack.manager.inteface.ISportDataFragmentListener;
import com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.iwy;
import defpackage.jck;

/* JADX INFO: loaded from: classes10.dex */
public class TrackDataRemoteProxy extends ITrackSportManager.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f10553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static jck f10554c;
    private static RemoteCallbackList<b> d = new RemoteCallbackList<>();
    private d e = new d();
    private TrackService f;
    private iwy g;

    public TrackDataRemoteProxy(TrackService trackService) {
        this.f = null;
        this.g = null;
        if (trackService == null) {
            throw new RuntimeException("TrackDataRemoteProxy invalid params in constructor");
        }
        this.f = trackService;
        d();
        jck jckVar = f10554c;
        if (jckVar != null) {
            jckVar.e(this.e);
        }
        iwy iwyVarA = iwy.a(BaseApplication.getContext());
        this.g = iwyVarA;
        e(iwyVarA.o());
    }

    public static b getLocalToRemoteProxy() {
        return f10553b;
    }

    public static void setLocalToRemoteProxyNull() {
        f10553b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(int i) {
        f10552a = i;
    }

    private static void d() {
        f10554c = new jck();
    }

    @Override // com.huawei.health.ITrackSportManager
    public int isTrackWorking() throws RemoteException {
        if (this.f == null || this.g == null) {
            return 0;
        }
        return f10552a;
    }

    @Override // com.huawei.health.ITrackSportManager
    public void registerDataCallback(ITrackDataReport iTrackDataReport) throws RemoteException {
        int iBeginBroadcast;
        b bVar;
        jck jckVar = f10554c;
        if (jckVar != null) {
            jckVar.a();
            e(f10554c.d());
        }
        LogUtil.a("Track_TrackDataRemoteProxy", "registerDataCallback at ", Long.valueOf(System.currentTimeMillis()));
        if (iTrackDataReport != null) {
            int i = 0;
            try {
                iBeginBroadcast = d.beginBroadcast();
                while (true) {
                    if (i >= iBeginBroadcast) {
                        bVar = null;
                        break;
                    } else {
                        if (((b) d.getBroadcastItem(i)).asBinder() == iTrackDataReport.asBinder()) {
                            bVar = (b) d.getBroadcastItem(i);
                            break;
                        }
                        i++;
                    }
                }
            } catch (IllegalStateException e) {
                LogUtil.e("Track_TrackDataRemoteProxy", "beginBroadcast()", e.getMessage());
                iBeginBroadcast = 0;
            }
            LogUtil.a("Track_TrackDataRemoteProxy", "registerDataCallback:Report client count ", Integer.valueOf(iBeginBroadcast));
            try {
                d.finishBroadcast();
            } catch (IllegalStateException e2) {
                LogUtil.e("Track_TrackDataRemoteProxy", "finishBroadcast()", e2.getMessage());
            }
            if (bVar == null) {
                b bVar2 = new b(iTrackDataReport);
                this.g.d(bVar2);
                iwy.c((ISportDataFragmentListener) bVar2);
                this.g.c((ISportStateChangeListener) bVar2);
                d(bVar2, "com.huawei.health.ADD_CALLBACK_IN_INDOOR_EQUIP");
                d.register(bVar2);
            } else {
                LogUtil.e("Track_TrackDataRemoteProxy", "registerDataCallback callBack is exist");
            }
        } else {
            LogUtil.j("Track_TrackDataRemoteProxy", "registerDataCallback callback is null");
        }
        int i2 = f10552a;
        if (i2 == 0 || i2 == 3) {
            return;
        }
        this.g.t();
    }

    @Override // com.huawei.health.ITrackSportManager
    public void unRegisterDataCallback(ITrackDataReport iTrackDataReport) throws RemoteException {
        int iBeginBroadcast;
        b bVar;
        LogUtil.a("Track_TrackDataRemoteProxy", "unRegisterDataCallback");
        if (iTrackDataReport != null) {
            int i = 0;
            try {
                iBeginBroadcast = d.beginBroadcast();
                while (true) {
                    if (i >= iBeginBroadcast) {
                        bVar = null;
                        break;
                    } else {
                        if (((b) d.getBroadcastItem(i)).asBinder() == iTrackDataReport.asBinder()) {
                            bVar = (b) d.getBroadcastItem(i);
                            break;
                        }
                        i++;
                    }
                }
            } catch (IllegalStateException e) {
                LogUtil.e("Track_TrackDataRemoteProxy", "beginBroadcast()", e.getMessage());
                iBeginBroadcast = 0;
            }
            e(0);
            LogUtil.a("Track_TrackDataRemoteProxy", "unRegisterDataCallback:Report client count ", Integer.valueOf(iBeginBroadcast));
            try {
                d.finishBroadcast();
            } catch (IllegalStateException e2) {
                LogUtil.e("Track_TrackDataRemoteProxy", "finishBroadcast()", e2.getMessage());
            }
            if (bVar != null) {
                this.g.c((IMapViewListener) bVar);
                iwy.b((ISportDataFragmentListener) bVar);
                this.g.b((ISportStateChangeListener) bVar);
                d(bVar, "com.huawei.health.REMOVE_CALLBACK_IN_INDOOR_EQUIP");
                d.unregister(bVar);
                LogUtil.a("Track_TrackDataRemoteProxy", "Unregister the callback on service");
            }
        }
    }

    static class b implements IMapViewListener, ISportDataFragmentListener, ISportStateChangeListener, IInterface {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ITrackDataReport f10555b;

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener
        public void pauseSport(int i) {
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener
        public void resumeSport(int i) {
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener
        public void startSport() {
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener
        public void stopSport(boolean z) {
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener
        public void updateSportStatusWhenLockScreen(int i) {
        }

        b(ITrackDataReport iTrackDataReport) {
            this.f10555b = iTrackDataReport;
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener
        public void updateGpsStatus(int i) {
            if (TrackDataRemoteProxy.f10554c == null) {
                LogUtil.j("Track_TrackDataRemoteProxy", "updateGpsStatus mLogicalTrackData null");
                return;
            }
            TrackDataRemoteProxy.f10554c.c(i);
            if (this.f10555b != null) {
                try {
                    if (TrackDataRemoteProxy.f10554c.b() != null) {
                        this.f10555b.report(TrackDataRemoteProxy.f10554c.b());
                    }
                } catch (RemoteException e) {
                    LogUtil.e("Track_TrackDataRemoteProxy", "updateGpsStatus()", e.getMessage());
                }
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportDataFragmentListener
        public void updateSportViewFragment(Bundle bundle) {
            if (TrackDataRemoteProxy.f10554c == null) {
                LogUtil.j("Track_TrackDataRemoteProxy", "updateSportViewFragment mLogicalTrackData null");
                return;
            }
            TrackDataRemoteProxy.f10554c.b(bundle);
            try {
                Bundle bundleB = TrackDataRemoteProxy.f10554c.b();
                if (bundleB != null) {
                    this.f10555b.report(bundleB);
                } else {
                    LogUtil.j("Track_TrackDataRemoteProxy", "updateSportViewFragment reportBundle is null ", bundle);
                }
            } catch (RemoteException e) {
                LogUtil.e("Track_TrackDataRemoteProxy", "updateSportViewFragment()", e.getMessage());
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            ITrackDataReport iTrackDataReport = this.f10555b;
            if (iTrackDataReport != null) {
                return iTrackDataReport.asBinder();
            }
            return null;
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
        public void onStartSport() {
            TrackDataRemoteProxy.e(1);
            if (TrackDataRemoteProxy.f10554c == null) {
                LogUtil.j("Track_TrackDataRemoteProxy", "onStartSport mLogicalTrackData null");
                return;
            }
            TrackDataRemoteProxy.f10554c.d(1);
            LogUtil.a("Track_TrackDataRemoteProxy", "LocalToRemoteProxy onStartSport");
            try {
                if (TrackDataRemoteProxy.f10554c.b() != null) {
                    this.f10555b.report(TrackDataRemoteProxy.f10554c.b());
                }
            } catch (RemoteException e) {
                LogUtil.e("Track_TrackDataRemoteProxy", "onStartSport()", e.getMessage());
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
        public void onPauseSport() {
            TrackDataRemoteProxy.e(2);
            if (TrackDataRemoteProxy.f10554c == null) {
                LogUtil.j("Track_TrackDataRemoteProxy", "onPauseSport mLogicalTrackData null");
                return;
            }
            TrackDataRemoteProxy.f10554c.d(2);
            LogUtil.a("Track_TrackDataRemoteProxy", "LocalToRemoteProxy onPauseSport");
            try {
                if (TrackDataRemoteProxy.f10554c.b() != null) {
                    this.f10555b.report(TrackDataRemoteProxy.f10554c.b());
                }
            } catch (RemoteException e) {
                LogUtil.e("Track_TrackDataRemoteProxy", "onPauseSport()", e.getMessage());
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
        public void onResumeSport() {
            TrackDataRemoteProxy.e(1);
            if (TrackDataRemoteProxy.f10554c == null) {
                LogUtil.j("Track_TrackDataRemoteProxy", "onResumeSport mLogicalTrackData null");
                return;
            }
            TrackDataRemoteProxy.f10554c.d(1);
            LogUtil.a("Track_TrackDataRemoteProxy", "LocalToRemoteProxy onResumeSport");
            try {
                if (TrackDataRemoteProxy.f10554c.b() != null) {
                    this.f10555b.report(TrackDataRemoteProxy.f10554c.b());
                }
            } catch (RemoteException e) {
                LogUtil.e("Track_TrackDataRemoteProxy", "resumeSport()", e.getMessage());
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportStateChangeListener, com.huawei.health.sportservice.SportLifecycle
        public void onStopSport() {
            TrackDataRemoteProxy.e(3);
            if (TrackDataRemoteProxy.f10554c == null) {
                LogUtil.j("Track_TrackDataRemoteProxy", "onStopSport mLogicalTrackData null");
                return;
            }
            TrackDataRemoteProxy.f10554c.d(3);
            LogUtil.a("Track_TrackDataRemoteProxy", "LocalToRemoteProxy onStopSport");
            try {
                if (TrackDataRemoteProxy.f10554c.b() != null) {
                    this.f10555b.report(TrackDataRemoteProxy.f10554c.b());
                }
            } catch (RemoteException e) {
                LogUtil.e("Track_TrackDataRemoteProxy", "onStopSport()", e.getMessage());
            }
        }
    }

    public void onServiceDestroy() {
        LogUtil.a("Track_TrackDataRemoteProxy", "onServiceDestroy");
        this.f = null;
        e(3);
        d.kill();
        this.g = null;
    }

    @Override // com.huawei.health.ITrackSportManager
    public void startSport() throws RemoteException {
        e(1);
        jck jckVar = f10554c;
        if (jckVar != null) {
            jckVar.d(1);
        }
        LogUtil.a("Track_TrackDataRemoteProxy", "TrackDataRemoteProxy startSport");
    }

    @Override // com.huawei.health.ITrackSportManager
    public void pauseSport() throws RemoteException {
        if (f10552a == 1) {
            e(2);
            this.g.b(false, 0);
        }
        LogUtil.a("Track_TrackDataRemoteProxy", "TrackDataRemoteProxy pauseSport");
    }

    @Override // com.huawei.health.ITrackSportManager
    public void stopSport() throws RemoteException {
        if (f10552a == 2) {
            e(3);
            this.g.br();
        }
    }

    @Override // com.huawei.health.ITrackSportManager
    public void resumeSport() throws RemoteException {
        if (f10552a == 2) {
            e(1);
            this.g.bp();
        }
        LogUtil.a("Track_TrackDataRemoteProxy", "TrackDataRemoteProxy resumeSport");
    }

    public static class d implements LocalTrackDataReport {
        @Override // com.huawei.healthcloud.plugintrack.open.LocalTrackDataReport
        public void report(Bundle bundle) {
            int iBeginBroadcast;
            try {
                iBeginBroadcast = TrackDataRemoteProxy.d.beginBroadcast();
            } catch (IllegalStateException e) {
                LogUtil.e("Track_TrackDataRemoteProxy", "beginBroadcast()", e.getMessage());
                iBeginBroadcast = 0;
            }
            LogUtil.a("Track_TrackDataRemoteProxy", "report:Report client count ", Integer.valueOf(iBeginBroadcast));
            if (bundle == null) {
                return;
            }
            for (int i = 0; i < iBeginBroadcast; i++) {
                try {
                    ((b) TrackDataRemoteProxy.d.getBroadcastItem(i)).f10555b.report(bundle);
                } catch (RemoteException e2) {
                    LogUtil.e("Track_TrackDataRemoteProxy", "report()", e2.getMessage());
                }
            }
            try {
                TrackDataRemoteProxy.d.finishBroadcast();
            } catch (IllegalStateException e3) {
                LogUtil.e("Track_TrackDataRemoteProxy", "finishBroadcast()", e3.getMessage());
            }
        }
    }

    private void d(b bVar, String str) {
        Intent intent = new Intent(str);
        LogUtil.a("Track_TrackDataRemoteProxy", "send LocalBroadcast action is ", str);
        f10553b = bVar;
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }
}
