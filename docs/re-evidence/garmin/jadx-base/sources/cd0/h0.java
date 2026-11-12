package cd0;

import android.app.NotificationManager;
import android.widget.LinearLayout;
import bs2.q4;
import com.garmin.android.apps.connectmobile.BluetoothInBadStateNotificationActivity;
import com.garmin.android.apps.connectmobile.GCMActivityStartup;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.d1;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.BLEScanningWizardActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.DisplayWiFiNetworksActivity;
import com.garmin.android.gncs.SmartNotificationsModule;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsChangedListener;
import com.garmin.android.gncs.settings.GNCSSettings;
import com.garmin.android.lib.connectdevicesync.exception.ServerException;
import com.garmin.android.music.AdvancedMusicControlModule;
import com.garmin.io.cobs.CobsDecodeException;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.androidbrowserhelper.trusted.LauncherActivity;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.installations.FirebaseInstallations;
import com.mapbox.common.module.cronet.CronetRequestDetail;
import com.mapbox.maps.NativeMapImpl;
import com.mapbox.maps.plugin.gestures.GesturesPluginImpl;
import com.mapbox.maps.plugin.scalebar.ScaleBarImpl;
import com.mapbox.maps.renderer.FpsManager;
import java.io.IOException;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26812b;

    public /* synthetic */ h0(Object obj, int i14) {
        this.f26811a = i14;
        this.f26812b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iK;
        ct2.h hVar;
        rs2.y yVar;
        rs2.w wVar;
        rs2.w wVar2;
        int i14 = 3;
        switch (this.f26811a) {
            case 0:
                i0 i0Var = (i0) this.f26812b;
                try {
                    bc2.g.a(i0Var.f26813a).b(i0Var.f26814b.getDeviceUnitId());
                    return;
                } catch (ServerException e4) {
                    i2.f(a2.DEVICES, "TruSwingDevice", "requestUploadConfigurationService: " + e4.getMessage());
                    return;
                }
            case 1:
                ((com.garmin.android.apps.connectmobile.c) this.f26812b).hideStatusBanner();
                return;
            case 2:
                com.garmin.android.apps.connectmobile.d0.a.A(((com.garmin.android.apps.connectmobile.d0) this.f26812b).f33124l, false);
                return;
            case 3:
                BluetoothInBadStateNotificationActivity bluetoothInBadStateNotificationActivity = (BluetoothInBadStateNotificationActivity) this.f26812b;
                int i15 = BluetoothInBadStateNotificationActivity.f28650a;
                NotificationManager notificationManager = (NotificationManager) bluetoothInBadStateNotificationActivity.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(3);
                    i2.d("BluetoothInBadStateNotificationActivity", "onCreate(): Cancelled NOTIFICATION_BAR_ID_BLUETOOTH_IN_BAD_STATE in a background thread.");
                    return;
                }
                return;
            case 4:
                d1 d1Var = (d1) this.f26812b;
                if (!d1Var.f33129a || !d1Var.f33130b) {
                    i2.j("com.garmin.android.apps.connectmobile.d1", "still foreground");
                    return;
                }
                d1Var.f33129a = false;
                d1Var.f33135g = false;
                i2.j("com.garmin.android.apps.connectmobile.d1", "went background");
                Iterator it = d1Var.f33132d.iterator();
                while (it.hasNext()) {
                    try {
                        ((d1.a) it.next()).b();
                    } catch (Exception e14) {
                        i2.i("com.garmin.android.apps.connectmobile.d1", "Listener threw exception: " + e14.getMessage());
                    }
                }
                return;
            case 5:
                GCMActivityStartup gCMActivityStartup = (GCMActivityStartup) this.f26812b;
                Logger logger = GCMActivityStartup.f28658d;
                gCMActivityStartup.runOnUiThread(new f(i14, gCMActivityStartup, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).o()));
                return;
            case 6:
                com.garmin.android.apps.connectmobile.connectiq.c cVar = (com.garmin.android.apps.connectmobile.connectiq.c) this.f26812b;
                i2.d("CompanionAppServiceManager", "60 second timer expired, unbinding service");
                cVar.d();
                return;
            case 7:
                ((com.garmin.android.apps.connectmobile.connectiq.b0.g) this.f26812b).b();
                return;
            case 8:
                ((com.garmin.android.apps.connectmobile.connectiq.b0.i) this.f26812b).a();
                return;
            case 9:
                ((com.garmin.android.apps.connectmobile.connectiq.n0.a) this.f26812b).f31917a.f31907j.setChoiceMode(0);
                return;
            case 10:
                ((SmartNotificationsModule) this.f26812b).lambda$reloadPackages$0();
                return;
            case 11:
                GNCSSettings.lambda$completeOptOutSettings$0((GNCSOptOutSettingsChangedListener) this.f26812b);
                return;
            case 12:
                ((AdvancedMusicControlModule) this.f26812b).lambda$evaluateActiveSessions$3();
                return;
            case 13:
                ((WorkInitializer) this.f26812b).lambda$ensureContextsScheduled$1();
                return;
            case 14:
                ((DefaultAnalyticsCollector) this.f26812b).releaseInternal();
                return;
            case 15:
                ((CarouselLayoutManager) this.f26812b).refreshKeylineState();
                return;
            case 16:
                ((MaterialBackOrchestrator) this.f26812b).startListeningForBackCallbacksWithPriorityOverlay();
                return;
            case 17:
                ((LauncherActivity) this.f26812b).lambda$launchTwa$0();
                return;
            case 18:
                ((FirebaseInstallations) this.f26812b).lambda$getId$1();
                return;
            case 19:
                CronetRequestDetail.start$lambda$0((CronetRequestDetail) this.f26812b);
                return;
            case 20:
                NativeMapImpl._set_sizeSet_$lambda$1((NativeMapImpl) this.f26812b);
                return;
            case 21:
                GesturesPluginImpl.scheduleAnimators$lambda$3((GesturesPluginImpl) this.f26812b);
                return;
            case 22:
                ((ScaleBarImpl) this.f26812b).requestLayout();
                return;
            case 23:
                FpsManager.onRenderingPausedRunnable$lambda$1((FpsManager) this.f26812b);
                return;
            case 24:
                cp.b bVar = (cp.b) this.f26812b;
                if (bVar.f54871a == null) {
                    return;
                }
                cp.a.a(bVar.requireActivity(), bVar.f54874d, bVar.f54871a, bVar);
                return;
            case 25:
                com.garmin.android.apps.connectmobile.incidentdetection.c cVar2 = (com.garmin.android.apps.connectmobile.incidentdetection.c) this.f26812b;
                com.garmin.android.apps.connectmobile.incidentdetection.c.a aVar = com.garmin.android.apps.connectmobile.incidentdetection.c.f36851e;
                if (cVar2.getActivity() == null || cVar2.requireActivity().isFinishing()) {
                    return;
                }
                cVar2.requireActivity().finish();
                return;
            case 26:
                ct2.b bVar2 = (ct2.b) this.f26812b;
                while (bVar2.f55530d.get()) {
                    rs2.p pVar = bVar2.f55527a;
                    Logger logger2 = bVar2.f55528b;
                    try {
                        byte[] bArrA = bVar2.f55529c.a();
                        if (pVar != null) {
                            pVar.b();
                        }
                        byte[] bArrDecrypt = bVar2.f55533g.get().decrypt(bArrA);
                        if (bArrDecrypt == null) {
                            logger2.error("Failed to decode message: decryption error");
                            us2.b bVar3 = bVar2.f55532f;
                            if (bVar3 == null) {
                                p005kotlin.jvm.internal.s.m("delegate");
                                throw null;
                            }
                            bVar3.h(ct2.a.DECRYPTION_ERROR);
                        } else if (bArrDecrypt.length < 6) {
                            logger2.error("Failed to read message: not enough bytes");
                            us2.b bVar4 = bVar2.f55532f;
                            if (bVar4 == null) {
                                p005kotlin.jvm.internal.s.m("delegate");
                                throw null;
                            }
                            bVar4.h(ct2.a.INVALID_LENGTH);
                        } else {
                            int iK2 = jg.b.K(0, bArrDecrypt);
                            if (bArrDecrypt.length != iK2) {
                                logger2.error("Failed to read message: invalid length in header");
                                us2.b bVar5 = bVar2.f55532f;
                                if (bVar5 == null) {
                                    p005kotlin.jvm.internal.s.m("delegate");
                                    throw null;
                                }
                                bVar5.h(ct2.a.INVALID_LENGTH);
                            } else {
                                int i16 = iK2 - 2;
                                int iK3 = jg.b.K(i16, bArrDecrypt);
                                int iA = 0;
                                for (int i17 = 0; i17 < i16; i17++) {
                                    iA = q4.a(bArrDecrypt[i17], iA);
                                }
                                if (iK3 != iA) {
                                    logger2.error("Failed to read message: CRC check failed");
                                    us2.b bVar6 = bVar2.f55532f;
                                    if (bVar6 == null) {
                                        p005kotlin.jvm.internal.s.m("delegate");
                                        throw null;
                                    }
                                    bVar6.h(ct2.a.CRC_ERROR);
                                } else {
                                    if ((bArrDecrypt[3] & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                                        iK = (bArrDecrypt[2] & UnsignedBytes.MAX_VALUE) + 5000;
                                        hVar = new ct2.h(Integer.valueOf(bArrDecrypt[3] & Ascii.US));
                                    } else {
                                        iK = jg.b.K(2, bArrDecrypt);
                                        hVar = new ct2.h(null);
                                    }
                                    if (iK != 5000) {
                                        byte[] bArrK = p13.s.k(4, i16, bArrDecrypt);
                                        ct2.c cVar3 = ct2.c.f55534a;
                                        cVar3.getClass();
                                        logger2.info("Received " + ct2.c.a(iK) + " request");
                                        us2.b bVar7 = bVar2.f55532f;
                                        if (bVar7 == null) {
                                            p005kotlin.jvm.internal.s.m("delegate");
                                            throw null;
                                        }
                                        rk0.g gVar = bVar7.f172471n;
                                        if (gVar != null) {
                                            gVar.invoke(Integer.valueOf(iK));
                                        }
                                        rs2.f fVar = bVar7.f172461d;
                                        if (fVar != null) {
                                            fVar.onRequestRead(hVar.f55555a, iK, bArrK);
                                        }
                                        synchronized (bVar7.f172466i) {
                                            wVar2 = (rs2.w) bVar7.f172466i.get(Integer.valueOf(iK));
                                        }
                                        if (wVar2 == null) {
                                            Logger logger3 = bVar7.f172463f;
                                            cVar3.getClass();
                                            logger3.error("No handler for ".concat(ct2.c.a(iK)));
                                            ft2.d.b(bVar7.f172465h, new us2.d(bVar7, hVar, iK, null));
                                        } else {
                                            ft2.d.b(bVar7.f172465h, new us2.e(wVar2, iK, bArrK, bVar7, hVar, null));
                                        }
                                    } else if (bArrDecrypt.length < 9) {
                                        logger2.error("Failed to decode response: not enough bytes");
                                        us2.b bVar8 = bVar2.f55532f;
                                        if (bVar8 == null) {
                                            p005kotlin.jvm.internal.s.m("delegate");
                                            throw null;
                                        }
                                        bVar8.h(ct2.a.INVALID_LENGTH);
                                    } else {
                                        int iK4 = jg.b.K(4, bArrDecrypt);
                                        rs2.y.a aVar2 = rs2.y.f154458b;
                                        byte b14 = bArrDecrypt[6];
                                        aVar2.getClass();
                                        if (b14 == 0) {
                                            yVar = rs2.y.ACK;
                                        } else if (b14 == 1) {
                                            yVar = rs2.y.NAK;
                                        } else if (b14 == 2) {
                                            yVar = rs2.y.UNKNOWN_OR_NOT_SUPPORTED;
                                        } else if (b14 == 3) {
                                            yVar = rs2.y.COBS_DECODER_ERROR;
                                        } else if (b14 != 4) {
                                            yVar = b14 != 5 ? rs2.y.NAK : rs2.y.LENGTH_ERROR;
                                        } else {
                                            yVar = rs2.y.CRC_ERROR;
                                        }
                                        byte[] bArrK2 = p13.s.k(7, i16, bArrDecrypt);
                                        ct2.c.f55534a.getClass();
                                        logger2.debug("Received response for " + ct2.c.a(iK4) + " - " + yVar);
                                        us2.b bVar9 = bVar2.f55532f;
                                        if (bVar9 == null) {
                                            p005kotlin.jvm.internal.s.m("delegate");
                                            throw null;
                                        }
                                        yVar.getClass();
                                        if (bVar9.f172464g.get() != us2.b.a.ENDED) {
                                            us2.g gVar2 = bVar9.f172467j.get();
                                            if (gVar2 == null) {
                                                vb.h.z("Outgoing strategy not set");
                                                return;
                                            }
                                            rs2.f fVar2 = bVar9.f172461d;
                                            if (fVar2 != null) {
                                                fVar2.onResponseRead(hVar.f55555a, iK4, yVar, bArrK2);
                                            }
                                            if (gVar2.c(hVar, iK4, yVar, bArrK2)) {
                                                continue;
                                            } else {
                                                bVar9.f172463f.warn("No one is listening for response of type " + iK4 + ":" + hVar);
                                                synchronized (bVar9.f172466i) {
                                                    wVar = (rs2.w) bVar9.f172466i.get(Integer.valueOf(iK4));
                                                }
                                                if (wVar instanceof rs2.b0) {
                                                    ((rs2.b0) wVar).d(iK4, yVar, bArrK2);
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (CobsDecodeException e15) {
                        logger2.error("Failed to decode message: COBS decode failure", (Throwable) e15);
                        if (pVar != null) {
                            pVar.a();
                        }
                        us2.b bVar10 = bVar2.f55532f;
                        if (bVar10 == null) {
                            p005kotlin.jvm.internal.s.m("delegate");
                            throw null;
                        }
                        bVar10.h(ct2.a.COBS_DECODE_ERROR);
                    } catch (IOException unused) {
                        if (pVar != null) {
                            pVar.a();
                        }
                        bVar2.a();
                    }
                }
                return;
            case 27:
                ((BLEScanningWizardActivity) this.f26812b).na();
                return;
            case 28:
                DisplayWiFiNetworksActivity displayWiFiNetworksActivity = (DisplayWiFiNetworksActivity) this.f26812b;
                DisplayWiFiNetworksActivity.a aVar3 = DisplayWiFiNetworksActivity.f43230m;
                if (!((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).a(displayWiFiNetworksActivity.f43231a)) {
                    displayWiFiNetworksActivity.ea();
                    return;
                }
                i2.a aVar4 = i2.f36769a;
                a2 a2Var = a2.SETTINGS;
                aVar4.getClass();
                i2.a.b(a2Var, "DisplayWiFiNetworksActivity", "mDisconnectionReminderRunnable.run(): Do nothing, just remove any runnables.");
                displayWiFiNetworksActivity.f43237g.removeCallbacksAndMessages(null);
                return;
            default:
                ((LinearLayout) this.f26812b).requestLayout();
                return;
        }
    }
}
