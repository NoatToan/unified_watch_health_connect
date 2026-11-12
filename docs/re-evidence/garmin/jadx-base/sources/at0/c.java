package at0;

import a73.f;
import android.content.Context;
import android.graphics.Shader;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Surface;
import androidx.browser.trusted.i;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.work.impl.WorkDatabase;
import b0.a1;
import b0.g1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.connectiq.b0;
import com.garmin.android.apps.connectmobile.powerguide.edit.PowerGuideFullscreenMapActivity;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.m;
import com.garmin.android.lib.networking.authentication.diapi.DI2RevokeAccessAndRefreshTokensWorker;
import com.garmin.android.music.MusicPlayerUtilKt;
import com.garmin.proto.generated.GDIConnectIQInstalledApps;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.androidbrowserhelper.trusted.TwaLauncher;
import com.google.androidbrowserhelper.trusted.splashscreens.SplashScreenStrategy;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mapbox.maps.GeoJSONSourceData;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import com.mapbox.maps.plugin.compass.CompassPlugin;
import com.mapbox.maps.plugin.compass.CompassUtils;
import com.mapbox.maps.plugin.viewport.ViewportPluginImpl;
import com.mapbox.maps.plugin.viewport.ViewportStatus;
import com.mapbox.maps.plugin.viewport.ViewportStatusObserver;
import com.mapbox.maps.plugin.viewport.data.ViewportStatusChangeReason;
import d53.w;
import ie2.l;
import j1.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import ji2.h;
import ne2.e0;
import ne2.s;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import sa1.j;
import ue.i0;
import ue.x;
import ve.r;
import ve.t;
import ve.t0;
import xe2.n0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12743e;

    public /* synthetic */ c(com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b interfaceC0995b, com.garmin.android.library.backgroundtaskmanagement.b bVar, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        this.f12739a = 11;
        this.f12740b = interfaceC0995b;
        this.f12741c = bVar;
        this.f12743e = eVar;
        this.f12742d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, android.graphics.Shader] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        int nativeAppId;
        CompassPlugin compass;
        boolean z14;
        switch (this.f12739a) {
            case 0:
                r0 r0Var = (r0) this.f12740b;
                d dVar = (d) this.f12741c;
                Object obj = this.f12742d;
                CustomLineChart customLineChart = (CustomLineChart) this.f12743e;
                r0Var.f105810a = dVar.f12746b.b(customLineChart.getContentRect().bottom, customLineChart.getContentRect().top, obj);
                customLineChart.getRenderer().getPaintRender().setShader((Shader) r0Var.f105810a);
                customLineChart.invalidate();
                return;
            case 1:
                b0.b bVar = (b0.b) this.f12740b;
                b0.g gVar = (b0.g) this.f12741c;
                GDIConnectIQInstalledApps.GetInstalledAppsResponse getInstalledAppsResponse = (GDIConnectIQInstalledApps.GetInstalledAppsResponse) this.f12742d;
                GDISmartProto.Smart smart = (GDISmartProto.Smart) this.f12743e;
                long availableSpace = getInstalledAppsResponse.getAvailableSpace();
                long availableSlots = getInstalledAppsResponse.getAvailableSlots();
                b0.this.getClass();
                ArrayList arrayList = new ArrayList();
                GDIConnectIQInstalledApps.ConnectIQInstalledAppsService connectIQInstalledAppsServiceC = b0.c(smart);
                if (connectIQInstalledAppsServiceC != null && connectIQInstalledAppsServiceC.hasGetInstalledAppsResponse()) {
                    for (GDIConnectIQInstalledApps.GetInstalledAppsResponse.InstalledApp installedApp : connectIQInstalledAppsServiceC.getGetInstalledAppsResponse().getInstalledAppList()) {
                        if (installedApp.hasNativeAppId()) {
                            nativeAppId = installedApp.getNativeAppId();
                        } else {
                            Parcelable.Creator<com.garmin.android.apps.connectmobile.connectiq.e> creator = com.garmin.android.apps.connectmobile.connectiq.e.CREATOR;
                            nativeAppId = -1;
                        }
                        arrayList.add(new com.garmin.android.apps.connectmobile.connectiq.e(installedApp.getStoreAppId().toByteArray(), installedApp.getName(), installedApp.getVersion(), installedApp.getFilesize(), installedApp.getDisabled(), nativeAppId, installedApp.getFavorite()));
                    }
                }
                gVar.a(availableSpace, availableSlots, arrayList);
                return;
            case 2:
                MusicPlayerUtilKt.launchMusicPlayer$lambda$8((AtomicReference) this.f12740b, (Context) this.f12741c, (Handler) this.f12742d, (e23.a) this.f12743e);
                return;
            case 3:
                ((MediaSourceEventListener.EventDispatcher) this.f12740b).lambda$upstreamDiscarded$4((MediaSourceEventListener) this.f12741c, (MediaSource.MediaPeriodId) this.f12742d, (MediaLoadData) this.f12743e);
                return;
            case 4:
                ((TwaLauncher) this.f12740b).lambda$launchTwa$2((i) this.f12741c, (SplashScreenStrategy) this.f12742d, (Runnable) this.f12743e);
                return;
            case 5:
                ((TwaLauncher) this.f12740b).lambda$launchTwa$3((TwaLauncher.FallbackStrategy) this.f12741c, (i) this.f12742d, (Runnable) this.f12743e);
                return;
            case 6:
                ((UserMetadata) this.f12740b).lambda$setNewSession$0((String) this.f12741c, (Map) this.f12742d, (List) this.f12743e);
                return;
            case 7:
                GeoJsonSource.setDataAsync$lambda$3$lambda$2$lambda$1((MapboxStyleManager) this.f12740b, (String) this.f12741c, (GeoJsonSource) this.f12742d, (Date) this.f12743e);
                return;
            case 8:
                GeoJsonSource.setDataAsync$lambda$3$lambda$2((MapboxStyleManager) this.f12740b, (GeoJsonSource) this.f12741c, (String) this.f12742d, (GeoJSONSourceData) this.f12743e);
                return;
            case 9:
                ViewportPluginImpl.notifyStatusChanged$lambda$4$lambda$3((ViewportStatusObserver) this.f12740b, (ViewportStatus) this.f12741c, (ViewportStatus) this.f12742d, (ViewportStatusChangeReason) this.f12743e);
                return;
            case 10:
                com.garmin.android.apps.connectmobile.settings.devices.wifi.b bVar2 = (com.garmin.android.apps.connectmobile.settings.devices.wifi.b) this.f12740b;
                m.b bVar3 = (m.b) this.f12741c;
                com.garmin.android.library.backgroundtaskmanagement.b.c cVar = (com.garmin.android.library.backgroundtaskmanagement.b.c) this.f12742d;
                String str = (String) this.f12743e;
                com.garmin.android.apps.connectmobile.settings.devices.wifi.b.C0803b c0803b = com.garmin.android.apps.connectmobile.settings.devices.wifi.b.f43259w;
                bVar2.z6(bVar3);
                if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                    if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.DEVICE_TIMEOUT) {
                        com.garmin.android.apps.connectmobile.settings.devices.wifi.b.w6(bVar2, bVar2.getString(R.string.wifi_error_connecting_timeout, str));
                        return;
                    } else {
                        com.garmin.android.apps.connectmobile.settings.devices.wifi.b.w6(bVar2, bVar2.getString(R.string.txt_something_went_wrong_try_again));
                        return;
                    }
                }
                return;
            case 11:
                ((com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b) this.f12740b).onResults(((com.garmin.android.library.backgroundtaskmanagement.b) this.f12741c).f50096f, (com.garmin.android.library.backgroundtaskmanagement.b.e) this.f12743e, this.f12742d);
                return;
            case 12:
                ((DefaultScheduler) this.f12740b).lambda$schedule$1((TransportContext) this.f12741c, (TransportScheduleCallback) this.f12742d, (EventInternal) this.f12743e);
                return;
            case 13:
                z zVar = (z) this.f12740b;
                Surface surface = (Surface) this.f12741c;
                androidx.concurrent.futures.b.d dVar2 = (androidx.concurrent.futures.b.d) this.f12742d;
                g1 g1Var = (g1) this.f12743e;
                f fVar = zVar.f96338l;
                if (fVar != null) {
                    fVar.a();
                    zVar.f96338l = null;
                }
                surface.release();
                if (zVar.f96333g == dVar2) {
                    zVar.f96333g = null;
                }
                if (zVar.f96334h == g1Var) {
                    zVar.f96334h = null;
                    return;
                }
                return;
            case 14:
                AudioTrack audioTrack = (AudioTrack) this.f12740b;
                AudioSink.b bVar4 = (AudioSink.b) this.f12741c;
                Handler handler = (Handler) this.f12742d;
                AudioSink.a aVar = (AudioSink.a) this.f12743e;
                int i14 = 28;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (bVar4 != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new h0.r0(i14, bVar4, aVar));
                    }
                    synchronized (DefaultAudioSink.f8674j0) {
                        try {
                            int i15 = DefaultAudioSink.f8676l0 - 1;
                            DefaultAudioSink.f8676l0 = i15;
                            if (i15 == 0) {
                                DefaultAudioSink.f8675k0.shutdown();
                                DefaultAudioSink.f8675k0 = null;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th4) {
                    if (bVar4 != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new h0.r0(i14, bVar4, aVar));
                    }
                    synchronized (DefaultAudioSink.f8674j0) {
                        try {
                            int i16 = DefaultAudioSink.f8676l0 - 1;
                            DefaultAudioSink.f8676l0 = i16;
                            if (i16 == 0) {
                                DefaultAudioSink.f8675k0.shutdown();
                                DefaultAudioSink.f8675k0 = null;
                            }
                            throw th4;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            case 15:
                String str2 = (String) this.f12740b;
                ni2.c cVar2 = (ni2.c) this.f12741c;
                ni2.a aVar2 = (ni2.a) this.f12742d;
                Unit unit = (Unit) this.f12743e;
                str2.getClass();
                cVar2.getClass();
                aVar2.getClass();
                unit.getClass();
                ji2.i.f98859a.getClass();
                String strB = ji2.i.a.b(str2);
                if (strB != null) {
                    h.f98854a.getClass();
                    h.a.f98857c.put(strB, cVar2.f126218b);
                }
                aVar2.onSuccess(unit);
                return;
            case 16:
                s sVar = (s) this.f12740b;
                l lVar = (l) this.f12741c;
                MapView mapView = (MapView) this.f12742d;
                com.garmin.android.library.mapsdkadapter.i.l lVar2 = (com.garmin.android.library.mapsdkadapter.i.l) this.f12743e;
                int i17 = s.M0;
                e0 e0Var = (e0) sVar.B.getValue();
                if (e0Var != null && lVar != null) {
                    Boolean bool = lVar.f93141f;
                    if (lVar.f93137b) {
                        e0Var.setAllGesturesEnabled(false);
                    } else {
                        if (bool != null) {
                            e0Var.setScrollGesturesEnabled(bool.booleanValue());
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (bool != null) {
                            e0Var.setScrollGesturesEnabled(bool.booleanValue());
                            z14 = true;
                        }
                        Boolean bool2 = lVar.f93142g;
                        if (bool2 != null) {
                            e0Var.setRotateGesturesEnabled(bool2.booleanValue());
                            z14 = true;
                        }
                        Boolean bool3 = lVar.f93144i;
                        if (bool3 != null) {
                            e0Var.setZoomGesturesEnabled(bool3.booleanValue());
                            z14 = true;
                        }
                        if (lVar.f93143h != null) {
                            z14 = true;
                        }
                        Boolean bool4 = lVar.f93145j;
                        if (bool4 != null) {
                            e0Var.setTiltGesturesEnabled(bool4.booleanValue());
                            z14 = true;
                        }
                        Boolean bool5 = lVar.f93146k;
                        if (bool5 != null) {
                            e0Var.setMapToolbarEnabled(bool5.booleanValue());
                            z14 = true;
                        }
                        if (!z14) {
                            e0Var.setAllGesturesEnabled(true);
                        }
                    }
                }
                MapView mapView2 = sVar.f125704v;
                if (mapView2 != null && (compass = CompassUtils.getCompass(mapView2)) != null) {
                    compass.setEnabled(false);
                }
                sVar.f50241b = true;
                mapView.getWidth();
                mapView.getHeight();
                if (lVar2 != null) {
                    lVar2.h1(sVar);
                    return;
                }
                return;
            case 17:
                Context context = (Context) this.f12740b;
                String str3 = (String) this.f12741c;
                String str4 = (String) this.f12742d;
                x xVar = (x) this.f12743e;
                Context applicationContext = context.getApplicationContext();
                i0.f170088a.getClass();
                t0 t0VarA = i0.a.a(applicationContext);
                DI2RevokeAccessAndRefreshTokensWorker.a aVar3 = DI2RevokeAccessAndRefreshTokensWorker.f50061e;
                if (str3 == null) {
                    str3 = "";
                }
                if (str4 == null) {
                    str4 = "";
                }
                aVar3.getClass();
                String str5 = "NC#DI2RevokeAccessAndRefreshTokensWorker_";
                if (!w.J(str3)) {
                    str5 = "NC#DI2RevokeAccessAndRefreshTokensWorker_" + ((Object) str3.subSequence(0, 10));
                } else if (!w.J(str4)) {
                    str5 = "NC#DI2RevokeAccessAndRefreshTokensWorker_" + ((Object) str4.subSequence(0, 10));
                }
                t0VarA.a(str5, ue.l.REPLACE, xVar).a();
                return;
            case 18:
                qe2.h hVar = (qe2.h) this.f12740b;
                ie2.c cVar3 = (ie2.c) this.f12741c;
                Handler handler2 = (Handler) this.f12742d;
                ie2.c cVar4 = (ie2.c) this.f12743e;
                int i18 = po.h.E1;
                hVar.getClass();
                hVar.f144584a.o(cVar3);
                handler2.post(new l0.e(20, hVar, cVar4));
                return;
            case 19:
                r0.e eVar = (r0.e) this.f12740b;
                b0.b0 b0Var = (b0.b0) this.f12741c;
                Map map = (Map) this.f12742d;
                androidx.concurrent.futures.b.a aVar4 = (androidx.concurrent.futures.b.a) this.f12743e;
                try {
                    eVar.f148707a.e(b0Var, map);
                    aVar4.b(null);
                    return;
                } catch (RuntimeException e4) {
                    aVar4.d(e4);
                    return;
                }
            case 20:
                s0.e eVar2 = (s0.e) this.f12740b;
                b0.b0 b0Var2 = (b0.b0) this.f12741c;
                Map map2 = (Map) this.f12742d;
                androidx.concurrent.futures.b.a aVar5 = (androidx.concurrent.futures.b.a) this.f12743e;
                try {
                    eVar2.f155260a.e(b0Var2, map2);
                    aVar5.b(null);
                    return;
                } catch (RuntimeException e14) {
                    aVar5.d(e14);
                    return;
                }
            case 21:
                List list = (List) this.f12740b;
                cf.m mVar = (cf.m) this.f12741c;
                androidx.work.a aVar6 = (androidx.work.a) this.f12742d;
                WorkDatabase workDatabase = (WorkDatabase) this.f12743e;
                int i19 = t.f177600a;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).c(mVar.f26929a);
                }
                t.b(aVar6, workDatabase, list);
                return;
            case 22:
                j jVar = (j) this.f12740b;
                Fragment fragment = (Fragment) this.f12741c;
                com.garmin.android.apps.connectmobile.courses.model.e eVar3 = (com.garmin.android.apps.connectmobile.courses.model.e) this.f12742d;
                ArrayList arrayList2 = (ArrayList) this.f12743e;
                PowerGuideFullscreenMapActivity.a aVar7 = PowerGuideFullscreenMapActivity.f40410a;
                jVar.k(fragment, eVar3, arrayList2);
                return;
            case 23:
                com.garmin.android.library.mobileauth.ui.a aVar8 = (com.garmin.android.library.mobileauth.ui.a) this.f12740b;
                String str6 = (String) this.f12741c;
                String str7 = (String) this.f12742d;
                e23.a aVar9 = (e23.a) this.f12743e;
                int i24 = com.garmin.android.library.mobileauth.ui.a.f50411l;
                aVar8.f50416e = n0.a(aVar8, str6, str7, new jy0.w(aVar9, 2), null, null, null, 112);
                return;
            default:
                ((y0.b) this.f12740b).f192979c.accept(new y0.b.a((HashMap) this.f12741c, ((a1) this.f12742d).f13847e.getTimestamp(), (HashMap) this.f12743e));
                return;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f12739a = i14;
        this.f12740b = obj;
        this.f12741c = obj2;
        this.f12742d = obj3;
        this.f12743e = obj4;
    }
}
