package to2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import aq2.j;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import ds.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import o13.p;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import ps2.w;
import q03.q;
import tn2.p0;
import tn2.t;
import vo2.z;
import z03.m;
import z03.r;
import zn2.g1;
import zn2.j1;
import zn2.n1;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lto2/a;", "Lop2/c;", "Lzn2/g1;", "userDataManager", "<init>", "(Lzn2/g1;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements op2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f165845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f165846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y03.d f165847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f165848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f165849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f165850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f165851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f165852h;

    /* JADX INFO: renamed from: to2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lto2/a$a;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC3119a {
        DEVICE_ID("device-id"),
        GARMIN_DEVICE_UNIT_ID("garmin-device-unit-id"),
        GARMIN_DEVICE_NAME("garmin-device-name"),
        USER_ID("user-id"),
        /* JADX INFO: Fake field, exist only in values array */
        GARMIN_USER_NAME("user-name"),
        NOTIFICATION_TYPE("notification-type"),
        /* JADX INFO: Fake field, exist only in values array */
        CREDIT_CARD_NETWORK("card-network"),
        ISSUING_BANK("issuing-bank"),
        CREDIT_CARD_NUMBER("creditcard-number"),
        /* JADX INFO: Fake field, exist only in values array */
        CREDIT_CARD_ID("creditcard-id"),
        SHORT_DESCRIPTION("short-description"),
        DAYS_UNTIL_EXPIRATION("days-until-expiration"),
        FITPAY_PAYLOAD("fitpay-payload"),
        FITPAY_PAYLOAD_DEVICE_ID("deviceId"),
        FITPAY_PAYLOAD_LINKS("_links"),
        /* JADX INFO: Fake field, exist only in values array */
        FITPAY_PAYLOAD_SYNC_ID(TtmlNode.ATTR_ID),
        FITPAY_PAYLOAD_ACK_LINK("ackSync"),
        FITPAY_PAYLOAD_COMPLETE_LINK("completeSync");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f165868a;

        EnumC3119a(String str) {
            this.f165868a = str;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165869a;

        static {
            int[] iArr = new int[to2.c.values().length];
            try {
                iArr[to2.c.APDU_OFFLINE_SESSION_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[to2.c.APDU_OFFLINE_SESSION_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[to2.c.SYNC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[to2.c.CREDITCARD_ACTIVATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[to2.c.CREDITCARD_DEACTIVATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[to2.c.CREDITCARD_REACTIVATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[to2.c.TOKEN_DEACTIVATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[to2.c.TOKEN_REACTIVATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[to2.c.CREDITCARD_DELETED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[to2.c.CREDITCARD_PROVISION_FAILED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[to2.c.CREDENTIAL_EXPIRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[to2.c.CREDENTIAL_UPDATE_FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[to2.c.DEVICE_DELETED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[to2.c.DEVICE_STATE_UPDATED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f165869a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"to2/a$c", "Landroid/net/ConnectivityManager$NetworkCallback;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends ConnectivityManager.NetworkCallback {
        public c() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            boolean z14;
            network.getClass();
            a aVar = a.this;
            if (aVar.f165848d) {
                aVar.f165848d = false;
                return;
            }
            ms2.g gVarA = w.f140538a.a(is2.b.FITPAY);
            z0 z0Var = gVarA instanceof z0 ? (z0) gVarA : null;
            if (z0Var != null && (z0Var.f205979a.s() instanceof sn2.a.C3030a)) {
                f fVar = aVar.f165851g;
                synchronized (fVar) {
                    z14 = fVar.f165904c != null;
                }
                if (z14) {
                    return;
                }
                aVar.k();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"to2/a$d", "Lto2/i;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements i {

        /* JADX INFO: renamed from: to2.a$d$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3120a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f165872a;

            static {
                int[] iArr = new int[to2.c.values().length];
                try {
                    iArr[to2.c.SYNC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[to2.c.DEVICE_STATE_UPDATED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[to2.c.CREDITCARD_CREATED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[to2.c.CREDITCARD_DEACTIVATED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[to2.c.CREDITCARD_REACTIVATED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[to2.c.CREDITCARD_ACTIVATED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[to2.c.CREDITCARD_DELETED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[to2.c.CREDENTIAL_UPDATE_FAILED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[to2.c.CREDENTIAL_UPDATE_SUCCESS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[to2.c.PURCHASE_COMPLETE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[to2.c.PURCHASE_FAILED.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[to2.c.CREDENTIAL_CREATED.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[to2.c.CREDENTIAL_ACTIVATED.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[to2.c.CREDENTIAL_DELETED.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[to2.c.CREDENTIAL_DELETE_FAILED.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[to2.c.JOB_STATUS.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[to2.c.STREAM_HEARTBEAT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[to2.c.APDU_OFFLINE_SESSION_START.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[to2.c.APDU_OFFLINE_SESSION_END.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                f165872a = iArr;
            }
        }

        public d() {
        }

        @Override // to2.i
        public final void a(h hVar) {
            hVar.getClass();
            to2.c sseEventsTypes = hVar.getSseEventsTypes();
            int i14 = sseEventsTypes == null ? -1 : C3120a.f165872a[sseEventsTypes.ordinal()];
            a aVar = a.this;
            switch (i14) {
                case 1:
                    Logger logger = aVar.f165846b;
                    logger.debug("processSyncEvent");
                    try {
                        aVar.g(hVar.i());
                    } catch (Exception e4) {
                        logger.error("processSyncEvent: can not get SyncEventDto: ", (Throwable) e4);
                    }
                    break;
                case 2:
                    aVar.getClass();
                    String strB = hVar.b();
                    if (strB == null) {
                        Logger logger2 = aVar.f165846b;
                        to2.c sseEventsTypes2 = hVar.getSseEventsTypes();
                        com.airbnb.lottie.animation.keyframe.a.z("processDeviceStateUpdatedEvent: device id is missing from payload, can not act on ", sseEventsTypes2 != null ? sseEventsTypes2.name() : null, " event", logger2);
                    } else {
                        aVar.f(strB);
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    a.d(aVar, hVar);
                    break;
                case 8:
                    a.d(aVar, hVar);
                    a.c(aVar, hVar);
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    a.c(aVar, hVar);
                    break;
                case 17:
                    aVar.f165846b.debug("handleStreamHeartBeat");
                    aVar.j();
                    zf.b.r();
                    long jG = gh2.i.f77458c.a().f77477b.g("heart_beat_timer_delay");
                    q qVar = l13.a.f108326a;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    w03.b.a(timeUnit, "unit is null");
                    w03.b.a(qVar, "scheduler is null");
                    m mVarH = new r(jG, timeUnit, qVar).k(l13.a.f108327b).h(r03.a.a());
                    p0 p0Var = new p0(new bb2.b(aVar, jG, 13), 22);
                    w03.a.d dVar = w03.a.f181172c;
                    w03.a.c cVar = w03.a.f181171b;
                    aVar.f165847c = mVarH.f(p0Var, dVar, cVar, cVar, cVar, cVar).i(new p0(new t(aVar, 4), 23), new a73.b(aVar, jG, 3));
                    break;
                case 18:
                case 19:
                    Logger logger3 = aVar.f165846b;
                    String strJ = hVar.j();
                    if (strJ == null) {
                        to2.c sseEventsTypes3 = hVar.getSseEventsTypes();
                        e0.u("processOfflineSessionEvent: target device identifier is missing from payload, can not act on ", sseEventsTypes3 != null ? sseEventsTypes3.name() : null, " event", logger3);
                    } else {
                        String strE = hVar.e();
                        if (strE == null) {
                            logger3.warn("processOfflineSessionEvent: offline session id is missing from payload, ignore it.");
                        } else {
                            CopyOnWriteArraySet copyOnWriteArraySet = aVar.f165849e;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : copyOnWriteArraySet) {
                                if (s.g(((p) obj).f128594a, strJ)) {
                                    arrayList.add(obj);
                                }
                            }
                            if (arrayList.isEmpty()) {
                                logger3.warn("notifyForDevice: no listeners found for device ".concat(strJ));
                            } else {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    to2.b bVar = (to2.b) ((p) it.next()).f128595b;
                                    to2.c sseEventsTypes4 = hVar.getSseEventsTypes();
                                    int i15 = sseEventsTypes4 == null ? -1 : b.f165869a[sseEventsTypes4.ordinal()];
                                    if (i15 == 1) {
                                        bVar.j0(strE, hVar.k());
                                    } else if (i15 != 2) {
                                        logger3.warn("processOfflineSessionEvent: offline session id is missing from payload, ignore it.");
                                    } else {
                                        bVar.x1(strE);
                                    }
                                }
                            }
                        }
                    }
                    break;
                default:
                    aVar.f165846b.debug("onStreamEvent: unhandled: " + hVar);
                    break;
            }
            Logger logger4 = aVar.f165846b;
            String strB2 = hVar.b();
            if (strB2 == null) {
                to2.c sseEventsTypes5 = hVar.getSseEventsTypes();
                com.airbnb.lottie.animation.keyframe.a.z("processSSEEvent: device id is missing from payload, can not act on ", sseEventsTypes5 != null ? sseEventsTypes5.name() : null, " event", logger4);
                return;
            }
            CopyOnWriteArraySet copyOnWriteArraySet2 = aVar.f165849e;
            ArrayList<p> arrayList2 = new ArrayList();
            for (Object obj2 : copyOnWriteArraySet2) {
                if (s.g(((p) obj2).f128594a, strB2)) {
                    arrayList2.add(obj2);
                }
            }
            for (p pVar : arrayList2) {
                to2.c sseEventsTypes6 = hVar.getSseEventsTypes();
                if (sseEventsTypes6 != null) {
                    String strG = hVar.g();
                    if (strG != null) {
                        sseEventsTypes6.f165896b = strG;
                    }
                    ((to2.b) pVar.f128595b).Q3(sseEventsTypes6);
                } else {
                    logger4.error("processSSEEvent: missing event type");
                }
            }
        }
    }

    public a(g1 g1Var) {
        g1Var.getClass();
        this.f165845a = g1Var;
        int i14 = gt2.c.f79010a;
        this.f165846b = gt2.b.f79005a.h("PAY#NEW_FITPAY#UserEventManager");
        this.f165848d = true;
        this.f165849e = new CopyOnWriteArraySet();
        this.f165850f = new Object();
        ms2.g gVarA = w.f140538a.a(is2.b.FITPAY);
        z0 z0Var = gVarA instanceof z0 ? (z0) gVarA : null;
        if (z0Var != null && !z0Var.f205981c.add(this)) {
            z0.f205975h.warn("registerForGarminPayUIEvents: GarminPay UI listener is already added");
        }
        this.f165851g = new f(g1Var, new d());
        this.f165852h = new c();
    }

    public static final void c(a aVar, h hVar) {
        Logger logger = aVar.f165846b;
        String strB = hVar.b();
        if (strB == null) {
            to2.c sseEventsTypes = hVar.getSseEventsTypes();
            com.airbnb.lottie.animation.keyframe.a.z("processTransitCardEvent: device id is missing from payload, can not act on ", sseEventsTypes != null ? sseEventsTypes.name() : null, " event", logger);
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = aVar.f165849e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArraySet) {
            if (s.g(((p) obj).f128594a, strB)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            logger.warn("notifyForDevice: no listeners found for device ".concat(strB));
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((to2.b) ((p) it.next()).f128595b).Y3(hVar);
        }
    }

    public static final void d(a aVar, h hVar) {
        aVar.getClass();
        String strB = hVar.b();
        if (strB != null) {
            aVar.h(strB);
            return;
        }
        Logger logger = aVar.f165846b;
        to2.c sseEventsTypes = hVar.getSseEventsTypes();
        com.airbnb.lottie.animation.keyframe.a.z("processUIEvent: device id is missing from payload, can not act on ", sseEventsTypes != null ? sseEventsTypes.name() : null, " event", logger);
    }

    @Override // op2.c
    public final void a() {
        wr2.b.f186831a.getClass();
        wr2.b.a().registerNetworkCallback(new NetworkRequest.Builder().build(), this.f165852h);
    }

    @Override // op2.c
    public final void b() {
        wr2.b.f186831a.getClass();
        wr2.b.a().unregisterNetworkCallback(this.f165852h);
    }

    public final void e(Map<String, String> map) {
        String asString;
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        JsonElement jsonElement;
        JsonObject asJsonObject3;
        JsonObject asJsonObject4;
        JsonElement jsonElement2;
        Logger logger = this.f165846b;
        logger.debug("handlePushNotification");
        EnumC3119a enumC3119a = EnumC3119a.NOTIFICATION_TYPE;
        String str = map.get(enumC3119a.f165868a);
        if (str == null || str.length() == 0) {
            com.airbnb.lottie.animation.keyframe.a.z("handlePushNotification: ", enumC3119a.f165868a, " is missing or empty", logger);
            return;
        }
        try {
            to2.c cVarValueOf = to2.c.valueOf(str);
            switch (b.f165869a[cVarValueOf.ordinal()]) {
                case 3:
                    String str2 = map.get(EnumC3119a.FITPAY_PAYLOAD.f165868a);
                    if (str2 == null || str2.length() == 0) {
                        com.airbnb.lottie.animation.keyframe.a.z("handlePushNotification: pushNotif payload for ", str, " is null or empty", logger);
                    } else {
                        j.f12491a.getClass();
                        JsonObject jsonObject = (JsonObject) j.d().fromJson(str2, JsonObject.class);
                        wo2.g gVar = null;
                        try {
                            JsonElement jsonElement3 = jsonObject.get(EnumC3119a.FITPAY_PAYLOAD_DEVICE_ID.f165868a);
                            String asString2 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                            if (asString2 == null || asString2.length() == 0) {
                                logger.error("getSyncEventDtoFromPayload: fitpay deviceId is null or empty, can not handle push notif");
                            } else {
                                EnumC3119a enumC3119a2 = EnumC3119a.FITPAY_PAYLOAD_LINKS;
                                JsonObject asJsonObject5 = jsonObject.getAsJsonObject(enumC3119a2.f165868a);
                                String asString3 = (asJsonObject5 == null || (asJsonObject3 = asJsonObject5.getAsJsonObject(EnumC3119a.FITPAY_PAYLOAD_ACK_LINK.f165868a)) == null || (asJsonObject4 = asJsonObject3.getAsJsonObject()) == null || (jsonElement2 = asJsonObject4.get("href")) == null) ? null : jsonElement2.getAsString();
                                JsonObject asJsonObject6 = jsonObject.getAsJsonObject(enumC3119a2.f165868a);
                                String asString4 = (asJsonObject6 == null || (asJsonObject = asJsonObject6.getAsJsonObject(EnumC3119a.FITPAY_PAYLOAD_COMPLETE_LINK.f165868a)) == null || (asJsonObject2 = asJsonObject.getAsJsonObject()) == null || (jsonElement = asJsonObject2.get("href")) == null) ? null : jsonElement.getAsString();
                                JsonElement jsonElement4 = jsonObject.get(TtmlNode.ATTR_ID);
                                if (jsonElement4 == null || (asString = jsonElement4.getAsString()) == null) {
                                    asString = UUID.randomUUID().toString() + "-Custom";
                                }
                                gVar = new wo2.g(asString, asString2, asString3, asString4, null, 16, null);
                            }
                        } catch (Exception unused) {
                            logger.error("getSyncEventDtoFromPayload: error occured while converting sync payload to SyncEventDto");
                        }
                        if (gVar != null) {
                            g(gVar);
                        }
                    }
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    String str3 = map.get(EnumC3119a.DEVICE_ID.f165868a);
                    if (str3 == null || str3.length() == 0) {
                        logger.error("handlePushNotification: fitpay deviceId is null or empty, can not handle pushNotif ".concat(str));
                    } else {
                        try {
                            String str4 = map.get(EnumC3119a.GARMIN_DEVICE_UNIT_ID.f165868a);
                            str4.getClass();
                            long j8 = Long.parseLong(str4);
                            h(str3);
                            new go2.b(cVarValueOf, map).a(new a90.b(j8, 13));
                        } catch (NumberFormatException unused2) {
                            com.airbnb.lottie.animation.keyframe.a.z("handle: ", str, ": deviceUnitId is not a Long", logger);
                            return;
                        }
                    }
                    break;
                case 13:
                    try {
                        String str5 = map.get(EnumC3119a.GARMIN_DEVICE_UNIT_ID.f165868a);
                        str5.getClass();
                        new go2.b(cVarValueOf, map).a(new a90.b(Long.parseLong(str5), 14));
                    } catch (NumberFormatException unused3) {
                        com.airbnb.lottie.animation.keyframe.a.z("handle: ", str, ": deviceUnitId is not a Long", logger);
                        return;
                    }
                    break;
                case 14:
                    String str6 = map.get(EnumC3119a.DEVICE_ID.f165868a);
                    if (str6 == null || str6.length() == 0) {
                        logger.error("handlePushNotification: fitpay deviceId is null or empty, can not handle pushNotif ".concat(str));
                    } else {
                        f(str6);
                    }
                    break;
                default:
                    logger.debug("userEventsType: " + cVarValueOf + " not handled");
                    break;
            }
        } catch (IllegalArgumentException unused4) {
            logger.error("handlePushNotification: Cannot find UserEventsType: ".concat(str));
        }
    }

    public final void f(String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f165849e) {
            if (s.g(((p) obj).f128594a, str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.f165846b.error("notifyForDeviceStateUpdatedEvent: no device found to listen DEVICE_STATE_UPDATED event");
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((to2.b) ((p) it.next()).f128595b).a2();
        }
    }

    public final void g(wo2.g gVar) {
        u53.d dVar = this.f165845a.f205537l;
        ge1.b.T(dVar, null, null, new j1(gVar, null), 3);
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f165849e) {
            if (s.g(((p) obj).f128594a, gVar.f186516b)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((to2.b) ((p) it.next()).f128595b).i2(gVar);
            }
            return;
        }
        this.f165846b.error("notifyForSyncEvent: no device found to listen sync event");
        wo2.e eVar = new wo2.e(gVar.f186515a, null, null, null, null, null, null, z.PLATFORM, 0L, 382, null);
        eVar.e(wo2.e.a.FAILED);
        eVar.c().add(wo2.e.b.NO_SYNC_HANDLER);
        eVar.a();
        ge1.b.T(dVar, null, null, new n1(gVar, eVar, null), 3);
    }

    public final void h(String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f165849e) {
            if (s.g(((p) obj).f128594a, str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.f165846b.error("notifyForUIEvents: no device found to listen CREDITCARD events");
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((to2.b) ((p) it.next()).f128595b).P0();
        }
    }

    public final void i(String str, to2.b bVar) {
        Object next;
        str.getClass();
        bVar.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = this.f165849e;
        Iterator it = copyOnWriteArraySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            p pVar = (p) next;
            if (s.g(pVar.f128594a, str) && s.g(pVar.f128595b, bVar)) {
                break;
            }
        }
        if (next != null) {
            return;
        }
        copyOnWriteArraySet.add(new p(str, bVar));
    }

    public final void j() {
        y03.d dVar = this.f165847c;
        if (dVar != null) {
            if (!dVar.b()) {
                v03.c.a(dVar);
            }
            this.f165847c = null;
        }
    }

    public final void k() {
        this.f165846b.trace("subscribeToSSE");
        synchronized (this.f165850f) {
            this.f165851g.c();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void l(String str, to2.b bVar) {
        Object next;
        str.getClass();
        bVar.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = this.f165849e;
        Iterator it = copyOnWriteArraySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            p pVar = (p) next;
            if (s.g(pVar.f128594a, str) && s.g(pVar.f128595b, bVar)) {
                break;
            }
        }
        p pVar2 = (p) next;
        if (pVar2 != null) {
            copyOnWriteArraySet.remove(pVar2);
        }
    }

    public final void m() {
        j();
        f fVar = this.f165851g;
        synchronized (fVar) {
            try {
                f.f165901f.debug("unsubscribe");
                y03.i iVar = fVar.f165904c;
                if (iVar != null) {
                    v03.c.a(iVar);
                }
                fVar.f165904c = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
