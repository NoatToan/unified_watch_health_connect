package cu0;

import android.content.Context;
import android.content.Intent;
import bs2.nv;
import c22.l3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventService;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import f12.l;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.x;
import zb0.n0;
import zb0.u0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu0/g;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f55579a = new g();

    private g() {
    }

    public static iu0.b a(Double d14, boolean z14) {
        Object next;
        Iterator it = (z14 ? x.k(iu0.b.METRIC_CENTURY, iu0.b.CENTURY) : x.k(iu0.b.FIVE_K, iu0.b.TEN_K, iu0.b.HALF_MARATHON, iu0.b.MARATHON)).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (s.a(((iu0.b) next).f95011a, d14)) {
                return (iu0.b) next;
            }
        }
        next = null;
        return (iu0.b) next;
    }

    public static String b(Context context, iu0.e eVar) {
        int i14;
        int iY = l3.a.y(0, 38, 43);
        eVar.getClass();
        ju0.c cVar = eVar.f95024d;
        boolean z14 = eVar.f95023c;
        Integer num = eVar.f95025e;
        lu0.b bVar = new lu0.b(context);
        boolean z15 = eVar.f95032l;
        if (z15) {
            bVar.f114966m = nv.CYCLING.f20362a;
            if (z14) {
                boolean z16 = cVar == ju0.c.DISTANCE;
                if (cVar == ju0.c.TIME) {
                    l3.f23124b.getClass();
                    bVar.f114957d = (int) (((double) 100) * 18668.3904d);
                    bVar.f114956c = l3.a.y(0, 40, 0);
                } else if (!z16) {
                    l3.f23124b.getClass();
                    bVar.f114957d = (int) (((double) 100) * 16093.44d);
                    bVar.f114956c = iY;
                } else if (((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y()) {
                    l3.f23124b.getClass();
                    bVar.f114957d = (int) (((double) 100) * 20000.0d);
                    bVar.f114956c = l3.a.y(0, 47, 5);
                } else {
                    l3.f23124b.getClass();
                    bVar.f114957d = (int) (((double) 100) * 32186.88d);
                    bVar.f114956c = l3.a.y(1, 17, 30);
                }
            } else {
                l3.f23124b.getClass();
                bVar.f114957d = (int) (((double) 100) * 16093.44d);
                bVar.f114956c = iY;
            }
        } else {
            l3.f23124b.getClass();
            bVar.f114957d = (int) (((double) 100) * 4828.032d);
            bVar.f114956c = l3.a.y(0, 25, 30);
        }
        bVar.e(lu0.c.SAMPLE);
        if (eVar.f95021a) {
            bVar.f();
        }
        if (eVar.f95022b) {
            bVar.j();
        }
        if (z14) {
            boolean z17 = cVar == ju0.c.DISTANCE;
            boolean z18 = cVar == ju0.c.TIME;
            if (z18) {
                if (z15) {
                    l3.f23124b.getClass();
                    i14 = (int) (8368.588800000001d * ((double) 100));
                } else {
                    i14 = 402336;
                }
                bVar.f114963j = i14;
                lu0.b.i(bVar, false, z18, Integer.valueOf(num != null ? num.intValue() : -1), 3);
            } else {
                int iY2 = 505;
                if (z17) {
                    if (z15) {
                        if (((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y()) {
                            l3.f23124b.getClass();
                            iY2 = l3.a.y(0, 24, 15);
                        } else {
                            l3.f23124b.getClass();
                            iY2 = l3.a.y(0, 39, 30);
                        }
                    }
                    bVar.f114958e = iY2;
                    lu0.b.i(bVar, z17, false, Integer.valueOf(num != null ? num.intValue() : -1), 5);
                } else {
                    if (z15) {
                        l3.f23124b.getClass();
                        iY2 = l3.a.y(0, 19, 28);
                    }
                    bVar.f114958e = iY2;
                    lu0.b.i(bVar, false, false, Integer.valueOf(num != null ? num.intValue() : -1), 6);
                }
            }
        }
        if (eVar.f95026f) {
            bVar.g();
        }
        if (s.g(eVar.f95028h, Boolean.TRUE)) {
            a2 a2Var = a2.LIVE_EVENT_SHARING;
            String strConcat = "In  addLiveTrackURL(), url: ".concat("https://gar.mn/2EmCO94");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "TextMessage.Builder", strConcat);
            bVar.f114955b = "https://gar.mn/2EmCO94";
        }
        return bVar.a();
    }

    public static final boolean c(long j8) {
        List<iu0.a> listA;
        String productNumber;
        if (j8 > 0) {
            boolean zI = km2.a.i(j8, n0.f203578b, SupportedCapability.EVENT_SHARING.ordinal());
            l.f68084a.getClass();
            Boolean livetrackWithLiveEventSharing = l.a.a().g0(j8).getLivetrackWithLiveEventSharing();
            boolean zBooleanValue = livetrackWithLiveEventSharing != null ? livetrackWithLiveEventSharing.booleanValue() : false;
            iu0.g gVarQ = GCMSettingManager.q(j8);
            if (gVarQ == null || (listA = gVarQ.a()) == null) {
                listA = j0.f134944a;
            }
            boolean zF = dh.b.F(listA);
            a2 a2Var = a2.LIVE_EVENT_SHARING;
            StringBuilder sb3 = new StringBuilder("Device ");
            sb3.append(j8);
            sb3.append(" has the Event Sharing capability (");
            sb3.append(zI);
            com.airbnb.lottie.animation.keyframe.a.v("), the LIVEEVENT session type (", "), and the correct alert types (", sb3, zBooleanValue, zF);
            sb3.append(").");
            String string = sb3.toString();
            i2.f36769a.getClass();
            i2.a.b(a2Var, "LiveEventSharingUtil", string);
            rd2.f.a().f152045a.getClass();
            sd2.f fVarI = rd2.j.i(j8, null);
            boolean z14 = (fVarI == null || (productNumber = fVarI.getProductNumber()) == null || u0.b(productNumber) != u0.A1) ? false : true;
            if ((zI && zBooleanValue && zF) || z14) {
                return true;
            }
        }
        return false;
    }

    public static final void d(Context context, boolean z14) {
        Intent intent = new Intent(context, (Class<?>) LiveEventService.class);
        intent.putExtra("LIVE_EVENT_REFRESH_CACHE_SETTINGS", z14);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.k(a2Var, "LiveEventSharingUtil", "Starting the live event sharing service...");
        context.startForegroundService(intent);
    }
}
