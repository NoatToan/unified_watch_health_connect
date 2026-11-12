package cd0;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.GCMActivityStartup;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppDetailsActivity;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.eventbus.GroupRideCodeReceivedEvent;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.eventbus.GroupRideEnableReceivedEvent;
import com.garmin.android.apps.connectmobile.h1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.incidentdetection.EdgeIncidentDetectionService;
import com.garmin.android.gncs.SmartNotificationsModule;
import com.garmin.proto.generated.GDIConnectIQAppSettingsProto;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.androidbrowserhelper.trusted.splashscreens.PwaWrapperSplashScreenStrategy;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.perf.config.DeviceCacheManager;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BatteryMonitorObserver;
import com.mapbox.common.LifecycleMonitorAndroid;
import com.mapbox.common.LifecycleState;
import com.mapbox.common.LifecycleUtils;
import com.mapbox.common.MovementInfo;
import com.mapbox.common.MovementModeObserver;
import com.mapbox.common.battery.AndroidBatteryMonitor;
import com.mapbox.common.movement.AndroidMovementMonitor;
import com.mapbox.maps.renderer.MapboxRenderThread;
import com.mapbox.maps.renderer.RenderEvent;
import com.mapbox.maps.renderer.RendererError;
import com.mapbox.maps.renderer.RendererSetupErrorListener;
import com.mapbox.maps.renderer.egl.EGLCore;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o53.c2;
import o53.e1;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26793c;

    public /* synthetic */ f(com.garmin.android.apps.connectmobile.connectiq.b0.h hVar, UUID uuid, String str) {
        this.f26791a = 6;
        this.f26792b = hVar;
        this.f26793c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = 1;
        switch (this.f26791a) {
            case 0:
                hk0.a.f().l(hk0.a.EnumC1667a.FINISHED_WITH_FAILURE, ((g) this.f26792b).c(), (yl2.e) this.f26793c, "Failed to register device.");
                i2.a(a2.DEVICES, "DeviceSetupWizStrategy", ".handleDeviceRegistrationFailure(): sent milestone PAIRING FAILED to device");
                return;
            case 1:
                com.garmin.android.apps.connectmobile.c.a aVar = (com.garmin.android.apps.connectmobile.c.a) this.f26792b;
                GroupRideCodeReceivedEvent groupRideCodeReceivedEvent = (GroupRideCodeReceivedEvent) this.f26793c;
                kd0.m mVar = bv.b.f21240b;
                com.garmin.android.apps.connectmobile.c cVar = com.garmin.android.apps.connectmobile.c.this;
                String groupRideCode = groupRideCodeReceivedEvent.getGroupRideCode();
                mVar.getClass();
                cVar.getClass();
                groupRideCode.getClass();
                androidx.fragment.app.v supportFragmentManager = cVar.getSupportFragmentManager();
                supportFragmentManager.getClass();
                if (supportFragmentManager.G("GroupRideCodeDialog") != null) {
                    return;
                }
                r22.s0.a aVar2 = r22.s0.f149856f;
                String string = cVar.getString(R.string.lbl_group_ride_code);
                String string2 = cVar.getString(R.string.msg_group_ride_generated_code_ready);
                String string3 = cVar.getString(R.string.lbl_view_code);
                string3.getClass();
                r22.s0.a.a(aVar2, string, string2, string3, new k11.h(7, cVar, groupRideCode), cVar.getString(R.string.lbl_close), null, 32).show(supportFragmentManager, "GroupRideCodeDialog");
                return;
            case 2:
                com.garmin.android.apps.connectmobile.c.a aVar3 = (com.garmin.android.apps.connectmobile.c.a) this.f26792b;
                GroupRideEnableReceivedEvent groupRideEnableReceivedEvent = (GroupRideEnableReceivedEvent) this.f26793c;
                kd0.m mVar2 = bv.b.f21240b;
                com.garmin.android.apps.connectmobile.c cVar2 = com.garmin.android.apps.connectmobile.c.this;
                final long deviceId = groupRideEnableReceivedEvent.getDeviceId();
                mVar2.getClass();
                cVar2.getClass();
                androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(cVar2).setTitle(R.string.lbl_group_ride_enable).setMessage(R.string.msg_group_ride_enable).setPositiveButton(R.string.lbl_ok, new jr2.e(cVar2, deviceId, i14)).setNegativeButton(R.string.lbl_close, new DialogInterface.OnClickListener() { // from class: kd0.l
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i15) {
                        int i16 = m.f104216a;
                        ((uu0.a) KoinJavaComponent.get$default(uu0.a.class, null, null, 6, null)).j().j(deviceId);
                        dialogInterface.dismiss();
                    }
                }).create();
                eVarCreate.getClass();
                eVarCreate.setCanceledOnTouchOutside(false);
                eVarCreate.show();
                return;
            case 3:
                GCMActivityStartup gCMActivityStartup = (GCMActivityStartup) this.f26792b;
                re2.b.a aVar4 = (re2.b.a) this.f26793c;
                Logger logger = GCMActivityStartup.f28658d;
                if (aVar4 == null) {
                    return;
                }
                Logger logger2 = GCMActivityStartup.f28658d;
                logger2.debug("evaluateSSO: " + aVar4.name());
                int i15 = GCMActivityStartup.a.f28662a[aVar4.ordinal()];
                if (i15 != 1) {
                    if (i15 == 2) {
                        gCMActivityStartup.O9();
                        logger2.debug("evaluateSSO: no system account, legacy already evaluated, launching auth activity");
                        gCMActivityStartup.Q9(gCMActivityStartup);
                        return;
                    } else {
                        if (i15 != 3) {
                            return;
                        }
                        gCMActivityStartup.O9();
                        logger2.debug("evaluateSSO: user signed out, launching auth activity");
                        gCMActivityStartup.Q9(gCMActivityStartup);
                        return;
                    }
                }
                gCMActivityStartup.f28659a.x4();
                h1 h1Var = new h1(gCMActivityStartup);
                oi2.a.f132270a.getClass();
                oi2.a.C2513a.b(h1Var);
                com.garmin.android.apps.connectmobile.startup.k kVar = gCMActivityStartup.f28659a;
                Context applicationContext = gCMActivityStartup.getApplicationContext();
                kVar.getClass();
                applicationContext.getClass();
                if (kVar.f44880b == null) {
                    kVar.f44880b = new y0<>();
                }
                c2 c2Var = kVar.f44881c;
                if (c2Var == null || c2Var.e()) {
                    kVar.f44881c = ge1.b.T(v1.a(kVar), null, null, new com.garmin.android.apps.connectmobile.startup.l(kVar, applicationContext, null), 3);
                }
                y0<com.garmin.android.apps.connectmobile.startup.k.c> y0Var = kVar.f44880b;
                if (y0Var == null) {
                    p005kotlin.jvm.internal.s.m("startupLiveData");
                    throw null;
                }
                y0Var.f(gCMActivityStartup, new a4.b(gCMActivityStartup, 11));
                logger2.debug("startUp: user signed in, calling 'StartupBackgroundOperation', not blocking, but not waiting for a result");
                bq1.a.f19547q.getClass();
                bq1.a aVar5 = (bq1.a) KoinJavaComponent.get$default(bq1.a.class, null, null, 6, null);
                aVar5.getClass();
                e1 e1Var = e1.f129333a;
                x53.c cVar3 = o53.s0.f129406a;
                ge1.b.T(e1Var, x53.b.f189152a, null, new bq1.b(aVar5, null), 2);
                com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.k(null), null);
                logger2.debug("startUp: user signed in, calling 'DevicesBizManager.refreshUserActiveFromGC'");
                cc0.b bVar = (cc0.b) KoinJavaComponent.get(cc0.b.class);
                String userDisplayName = ((f12.b) KoinJavaComponent.get(f12.b.class)).getUserDisplayName();
                bVar.getClass();
                i2.a(a2.DEVICES, "DevicesBizManager", "refreshUserActiveFromGC: connectUserDisplayName " + userDisplayName);
                com.garmin.android.library.backgroundtaskmanagement.c.d(new cc0.e(userDisplayName, bVar), null);
                return;
            case 4:
                Context context = (Context) this.f26792b;
                Intent intent = (Intent) this.f26793c;
                com.garmin.android.apps.connectmobile.v1 v1Var = com.garmin.android.apps.connectmobile.v1.f47374a;
                hh2.b bVar2 = hh2.b.f83747a;
                Context applicationContext2 = context.getApplicationContext();
                applicationContext2.getClass();
                bVar2.getClass();
                hh2.b.b(applicationContext2, intent);
                return;
            case 5:
                com.garmin.android.apps.connectmobile.connectiq.c cVar4 = (com.garmin.android.apps.connectmobile.connectiq.c) this.f26792b;
                try {
                    try {
                        if (!((CountDownLatch) this.f26793c).await(5L, TimeUnit.SECONDS)) {
                            i2.i("CompanionAppServiceManager", "Service not bound within timeout");
                        } else if (cVar4.f31838b) {
                            i2.d("CompanionAppServiceManager", "Service bound successfully, starting 60 second timer");
                            cVar4.f31844h.b();
                        }
                        cVar4.f31842f.lock();
                        try {
                            cVar4.f31843g = null;
                            return;
                        } finally {
                            cVar4.f31842f.unlock();
                        }
                    } catch (InterruptedException unused) {
                        i2.i("CompanionAppServiceManager", "Interrupted while waiting for service to bind");
                        cVar4.f31842f.lock();
                        try {
                            cVar4.f31843g = null;
                        } finally {
                            cVar4.f31842f.unlock();
                        }
                        break;
                    }
                } catch (Throwable th3) {
                    cVar4.f31842f.lock();
                    try {
                        cVar4.f31843g = null;
                        throw th3;
                    } finally {
                        cVar4.f31842f.unlock();
                    }
                }
                break;
            case 6:
                ((ConnectIQAppDetailsActivity.c.a) ((com.garmin.android.apps.connectmobile.connectiq.b0.h) this.f26792b)).a((String) this.f26793c);
                return;
            case 7:
                ((com.garmin.android.apps.connectmobile.connectiq.b0.i) this.f26792b).b(((GDIConnectIQAppSettingsProto.GetAppSettingsResponse) this.f26793c).getAppIdentifier().toByteArray());
                return;
            case 8:
                ((SmartNotificationsModule) this.f26792b).lambda$onListenerConnected$1((List) this.f26793c);
                return;
            case 9:
                ((JobInfoSchedulerService) this.f26792b).lambda$onStartJob$0((JobParameters) this.f26793c);
                return;
            case 10:
                ((AudioRendererEventListener.EventDispatcher) this.f26792b).lambda$decoderReleased$5((String) this.f26793c);
                return;
            case 11:
                ((NetworkTypeObserver) this.f26792b).lambda$register$0((NetworkTypeObserver.Listener) this.f26793c);
                return;
            case 12:
                ((VideoRendererEventListener.EventDispatcher) this.f26792b).lambda$videoSizeChanged$5((VideoSize) this.f26793c);
                return;
            case 13:
                ((VideoRendererEventListener.EventDispatcher) this.f26792b).lambda$decoderReleased$7((String) this.f26793c);
                return;
            case 14:
                ((VideoRendererEventListener.EventDispatcher) this.f26792b).lambda$videoCodecError$9((Exception) this.f26793c);
                return;
            case 15:
                ((SphericalGLSurfaceView) this.f26792b).lambda$onSurfaceTextureAvailable$1((SurfaceTexture) this.f26793c);
                return;
            case 16:
                ((PwaWrapperSplashScreenStrategy) this.f26792b).lambda$onSplashImageTransferred$1((Runnable) this.f26793c);
                return;
            case 17:
                ((RemovalListener) this.f26792b).onRemoval((RemovalNotification) this.f26793c);
                return;
            case 18:
                ((UserMetadata) this.f26792b).lambda$updateRolloutsState$1((List) this.f26793c);
                return;
            case 19:
                ((DeviceCacheManager) this.f26792b).lambda$setContext$0((Context) this.f26793c);
                return;
            case 20:
                ((AppStartTrace) this.f26792b).lambda$logExperimentTrace$0((TraceMetric.Builder) this.f26793c);
                return;
            case 21:
                og.a.d0((q53.t) this.f26792b, (ConfigUpdate) this.f26793c);
                return;
            case 22:
                LifecycleMonitorAndroid.notifyObservers$lambda$8$lambda$6$lambda$5((Map.Entry) this.f26792b, (LifecycleState) this.f26793c);
                return;
            case 23:
                LifecycleUtils.getLifecycleState$lambda$24$lambda$20$lambda$19$lambda$18((e23.l) this.f26792b, (LifecycleState) this.f26793c);
                return;
            case 24:
                AndroidBatteryMonitor.notifyObservers$lambda$2$lambda$1((BatteryMonitorObserver) this.f26792b, (Expected) this.f26793c);
                return;
            case 25:
                AndroidMovementMonitor.notifyObservers$lambda$2$lambda$1((MovementModeObserver) this.f26792b, (MovementInfo) this.f26793c);
                return;
            case 26:
                MapboxRenderThread.postNonRenderEvent$lambda$23((MapboxRenderThread) this.f26792b, (RenderEvent) this.f26793c);
                return;
            case 27:
                EGLCore.notifyListeners$lambda$5((HashSet) this.f26792b, (RendererError) this.f26793c);
                return;
            case 28:
                EGLCore.addRendererStateListener$lambda$3((LinkedList) this.f26792b, (RendererSetupErrorListener) this.f26793c);
                return;
            default:
                ((cq0.j) this.f26792b).q((EdgeIncidentDetectionService.h) this.f26793c);
                return;
        }
    }

    public /* synthetic */ f(int i14, Object obj, Object obj2) {
        this.f26791a = i14;
        this.f26792b = obj;
        this.f26793c = obj2;
    }
}
