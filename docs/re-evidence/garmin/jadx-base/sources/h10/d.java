package h10;

import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.GroupsActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import ds.e0;
import j20.x;
import java.util.Iterator;
import java.util.Set;
import lc.u0;
import org.slf4j.Logger;
import p005kotlin.jvm.internal.s;
import wd2.c2;
import wd2.h2;
import wd2.z1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80749a;

    /* JADX WARN: Code duplicated, block: B:28:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:32:0x010f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0116  */
    /* JADX WARN: Code duplicated, block: B:36:0x0118  */
    /* JADX WARN: Code duplicated, block: B:44:0x0145  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        Object next;
        h2 h2Var;
        String str;
        long jR;
        long j8;
        long jS4;
        a2 a2Var;
        long j14;
        boolean z14;
        h2 h2Var2;
        switch (this.f80749a) {
            case 0:
                g3 g3Var = (g3) obj;
                int i14 = GroupsActivity.f31357h;
                if (g3Var.f35300a == fw.p.ERROR) {
                    a2 a2Var2 = a2.GENERAL;
                    i2.a(a2Var2, "GroupsActivity", "Fetch unhandled request failed");
                    String str2 = "Exception: " + g3Var.f35303d;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "GroupsActivity", str2);
                }
                break;
            case 1:
                wd2.f fVar = (wd2.f) obj;
                Logger logger = nu0.d.f127897b;
                nu0.d dVar = nu0.d.f127896a;
                if (fVar != null) {
                    com.garmin.android.library.livetrack.d dVar2 = (com.garmin.android.library.livetrack.d) fVar.f184455a;
                    logger.debug("LivetrackLibraryHook", "observeLivetrackState " + dVar2);
                    if (dVar2 instanceof com.garmin.android.library.livetrack.d.c) {
                        long j15 = ((com.garmin.android.library.livetrack.d.c) dVar2).f50196a;
                        logger.debug("LivetrackLibraryHook", "observeLivetrackState session started deviceUnitId " + j15);
                        dVar.getClass();
                        for (z1 z1Var : wd2.m.a()) {
                            long j16 = z1Var.f184693a;
                            wr.g.v("sessionGroup.deviceUnitId:", j16, ", deviceUnitId", logger);
                            if (j16 == j15) {
                                GarminConnectMobileApp.f28685g.getClass();
                                nu0.e eVar = new nu0.e(GarminConnectMobileApp.a.a(), j15);
                                a2 a2Var3 = a2.LIVE_EVENT_SHARING;
                                String str3 = z1Var.f184697e;
                                Set<h2> set = z1Var.f184698f;
                                String strE = x.e(com.airbnb.lottie.animation.keyframe.a.k(j16, "respondToLiveEventSharing attempt device: ", " publisher identifier: ", str3), set.size(), " sessions no: ");
                                i2.f36769a.getClass();
                                i2.a.f(a2Var3, "LT#LiveEventHandler", strE);
                                Iterator<T> it = set.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        h2Var2 = (h2) next;
                                        if (!s.g(h2Var2.f184494d, c2.d.f184412a)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                    h2Var = (h2) next;
                                    if (h2Var == null) {
                                        j8 = j15;
                                    } else {
                                        str = h2Var.f184491a;
                                        fd0.d dVar3 = fd0.d.LIVE_EVENT_SHARING;
                                        jR = GCMSettingManager.r(dVar3, null);
                                        f12.l.f68084a.getClass();
                                        j8 = j15;
                                        jS4 = f12.l.a.a().s4();
                                        a2Var = a2.LIVE_EVENT_SHARING;
                                        StringBuilder sbK = e0.k(jR, "lastDeviceSelected: ", ", preferredActivityTracker: ");
                                        sbK.append(jS4);
                                        String string = sbK.toString();
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var, "LT#LiveEventHandler", string);
                                        if (jR == -1) {
                                            jR = jS4;
                                        }
                                        j14 = eVar.f127901b;
                                        if (j14 == jR) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (str == null && str.length() != 0 && z14) {
                                            i2.a.k(a2Var, "LT#LiveEventHandler", am.j.i(GCMSettingManager.r(dVar3, null), " preparing URL...", e0.k(j14, "We have valid live event sharing session with Livetrack: deviceId: ", ", current LES device selected: ")));
                                            ge1.b.T(eVar, null, null, new nu0.f(h2Var, eVar, null), 3);
                                        } else {
                                            StringBuilder sbD = zl.a.d("Session Id is ", str, " isTargetedDevice: ", z14, ", device unit ID = ");
                                            sbD.append(j14);
                                            i2.a.f(a2Var, "LT#LiveEventHandler", com.nimbusds.jose.shaded.gson.internal.a.g(jR, " and last or preferred device ID= ", "  ", sbD));
                                        }
                                    }
                                    j15 = j8;
                                } while (!s.g(h2Var2.f184494d, c2.a.f184409a));
                                h2Var = (h2) next;
                                if (h2Var == null) {
                                    j8 = j15;
                                } else {
                                    str = h2Var.f184491a;
                                    fd0.d dVar4 = fd0.d.LIVE_EVENT_SHARING;
                                    jR = GCMSettingManager.r(dVar4, null);
                                    f12.l.f68084a.getClass();
                                    j8 = j15;
                                    jS4 = f12.l.a.a().s4();
                                    a2Var = a2.LIVE_EVENT_SHARING;
                                    StringBuilder sbK2 = e0.k(jR, "lastDeviceSelected: ", ", preferredActivityTracker: ");
                                    sbK2.append(jS4);
                                    String string2 = sbK2.toString();
                                    i2.f36769a.getClass();
                                    i2.a.f(a2Var, "LT#LiveEventHandler", string2);
                                    if (jR == -1) {
                                        jR = jS4;
                                    }
                                    j14 = eVar.f127901b;
                                    if (j14 == jR) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (str == null) {
                                        StringBuilder sbD2 = zl.a.d("Session Id is ", str, " isTargetedDevice: ", z14, ", device unit ID = ");
                                        sbD2.append(j14);
                                        i2.a.f(a2Var, "LT#LiveEventHandler", com.nimbusds.jose.shaded.gson.internal.a.g(jR, " and last or preferred device ID= ", "  ", sbD2));
                                    } else {
                                        StringBuilder sbD3 = zl.a.d("Session Id is ", str, " isTargetedDevice: ", z14, ", device unit ID = ");
                                        sbD3.append(j14);
                                        i2.a.f(a2Var, "LT#LiveEventHandler", com.nimbusds.jose.shaded.gson.internal.a.g(jR, " and last or preferred device ID= ", "  ", sbD3));
                                    }
                                }
                                j15 = j8;
                            }
                        }
                        nu0.d.f127897b.debug("Posting refresh drawer event");
                        f12.l.f68084a.getClass();
                        f12.l.a.a().H0(true);
                    } else if (dVar2 instanceof com.garmin.android.library.livetrack.d.b) {
                        logger.debug("LivetrackLibraryHook", "observeLivetrackState session ended deviceUnitId " + ((com.garmin.android.library.livetrack.d.b) dVar2).f50196a);
                        dVar.getClass();
                        logger.debug("Posting refresh drawer event");
                        f12.l.f68084a.getClass();
                        f12.l.a.a().H0(true);
                    } else if ((dVar2 instanceof com.garmin.android.library.livetrack.d.a) || dVar2 == null) {
                        logger.debug("LivetrackLibraryHook", "observeLivetrackState error");
                    } else {
                        u0.r();
                    }
                }
                break;
            case 2:
                break;
            default:
                i2.c("In-app review flow completed");
                break;
        }
    }
}
