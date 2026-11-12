package de2;

import ae2.o0;
import ae2.p0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.RemoteException;
import bs2.ab;
import bs2.ad;
import bs2.aq;
import bs2.b7;
import bs2.bb;
import bs2.cb;
import bs2.ck;
import bs2.fb;
import bs2.fk;
import bs2.fs;
import bs2.gs;
import bs2.id;
import bs2.jd;
import bs2.js;
import bs2.l6;
import bs2.nv;
import bs2.ov;
import bs2.pv;
import bs2.qv;
import bs2.sw;
import bs2.ti;
import bs2.ui;
import bs2.v5;
import bs2.z3;
import bs2.zp;
import ch.qos.logback.core.CoreConstants;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.fit.FitRuntimeException;
import com.garmin.proto.generated.GDILiveTrackProto;
import fe2.j0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ConcurrentHashMap;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.r0;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0010B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lde2/a;", "Lde2/g0;", "Ljava/util/Observer;", "Lwd2/g;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lwd2/e;", "deviceDataDelegate", "Lkotlin/Function3;", "Lde2/g0$a;", "", "", "", "deviceEventListener", "<init>", "(Landroid/content/Context;Lwd2/e;Le23/q;)V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements g0, Observer, wd2.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f59227j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd2.e f59228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.q<g0.a, Long, Boolean, Unit> f59229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f59230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f59231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f59232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f59233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f59234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f59235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f59236i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"de2/a$b", "Landroid/content/BroadcastReceiver;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent != null ? intent.getAction() : null;
            a aVar = a.this;
            if (action == null || action.hashCode() != -1856497853 || !action.equals("com.garmin.livetrack.ACTION_ON_CANCEL_START_LIVE_TRACK_REQUEST_RECEIVED")) {
                ds.e0.v("onReceive: fix me developer, not handling action ", intent != null ? intent.getAction() : null, aVar.f59230c);
                return;
            }
            aVar.f59230c.debug("Received ACTION_ON_CANCEL_START_LIVE_TRACK_REQUEST_RECEIVED from device.");
            Bundle extras = intent.getExtras();
            long j8 = extras != null ? extras.getLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L) : -1L;
            if (j8 != -1) {
                e23.q<g0.a, Long, Boolean, Unit> qVar = aVar.f59229b;
                if (qVar != null) {
                    qVar.invoke(g0.a.C1266a.f59292a, Long.valueOf(j8), Boolean.FALSE);
                    return;
                }
                return;
            }
            aVar.f59230c.error("onReceive: invalid device unit id " + j8);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"de2/a$c", "Lla2/a;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements la2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f59238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f59239b;

        public c(Context context, a aVar) {
            this.f59238a = context;
            this.f59239b = aVar;
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            DeviceProfile deviceProfile = bVar.f111632a;
            a aVar = this.f59239b;
            e23.q<g0.a, Long, Boolean, Unit> qVar = aVar.f59229b;
            if (qVar != null) {
                qVar.invoke(g0.a.b.f59293a, Long.valueOf(deviceProfile.getF92746j()), Boolean.valueOf(aVar.f59228a.e(deviceProfile.getF92746j())));
            }
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(la2.h hVar) {
            a aVar;
            e23.q<g0.a, Long, Boolean, Unit> qVar;
            da2.b bVar = da2.d.c(this.f59238a).f58886a.f111646e;
            DeviceProfile deviceProfile = hVar.f111673a;
            if (bVar.a(deviceProfile.getF92746j()).length != 0 || (qVar = (aVar = this.f59239b).f59229b) == null) {
                return;
            }
            qVar.invoke(g0.a.c.f59294a, Long.valueOf(deviceProfile.getF92746j()), Boolean.valueOf(aVar.f59228a.e(deviceProfile.getF92746j())));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"de2/a$d", "Landroid/content/BroadcastReceiver;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent != null ? intent.getAction() : null;
            a aVar = a.this;
            if (action == null || action.hashCode() != 213122184 || !action.equals("com.garmin.livetrack.ACTION_ON_STOP_LIVE_TRACK_REQUEST_RECEIVED")) {
                com.airbnb.lottie.animation.keyframe.a.w("onReceive: fix me developer, not handling action ", intent != null ? intent.getAction() : null, aVar.f59230c);
                return;
            }
            aVar.f59230c.debug("Received ACTION_ON_STOP_LIVE_TRACK_REQUEST_RECEIVED from device.");
            Bundle extras = intent.getExtras();
            long j8 = extras != null ? extras.getLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", -1L) : -1L;
            if (j8 != -1) {
                e23.q<g0.a, Long, Boolean, Unit> qVar = aVar.f59229b;
                if (qVar != null) {
                    qVar.invoke(g0.a.d.f59295a, Long.valueOf(j8), Boolean.FALSE);
                    return;
                }
                return;
            }
            aVar.f59230c.error("onReceive: invalid device unit id " + j8);
        }
    }

    static {
        new C1265a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, wd2.e eVar, e23.q<? super g0.a, ? super Long, ? super Boolean, Unit> qVar) {
        context.getClass();
        eVar.getClass();
        this.f59228a = eVar;
        this.f59229b = qVar;
        this.f59230c = i2.a("DefaultDeviceManager");
        this.f59231d = context.getApplicationContext();
        this.f59232e = o13.m.b(new d4.h(26));
        this.f59234g = new b();
        this.f59235h = new d();
        this.f59236i = new c(context, this);
    }

    @Override // de2.g0
    public final z a(final long j8) {
        final z zVarH = h();
        ConcurrentHashMap concurrentHashMap = zVarH.f59389b;
        if (!concurrentHashMap.containsKey(Long.valueOf(j8))) {
            zVarH.f59388a.debug("registerDevice [" + j8 + "] ");
            b7 b7Var = new b7();
            b7Var.g();
            if (b7Var.f19710v != null) {
                throw new FitRuntimeException("Can't set incompleteStream option after Decode started!");
            }
            b7Var.f19711w = false;
            ck ckVar = new ck(b7Var);
            ckVar.S0.add(new aq() { // from class: de2.x
                @Override // bs2.aq
                public final void a(zp zpVar) {
                    bs2.x xVar;
                    int i14 = z.f59387c;
                    Long lJ = zpVar.j(29, 65535);
                    Double dValueOf = lJ != null ? Double.valueOf(lJ.longValue()) : null;
                    ae2.r.a aVar = ae2.r.f2989b;
                    Short shK = zpVar.k(42);
                    if (shK != null) {
                        bs2.x[] xVarArrValues = bs2.x.values();
                        int length = xVarArrValues.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= length) {
                                xVar = bs2.x.INVALID;
                                break;
                            }
                            xVar = xVarArrValues[i15];
                            if (shK.shortValue() == xVar.f20658a) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    } else {
                        xVar = null;
                    }
                    if (xVar == null) {
                        xVar = bs2.x.INVALID;
                    }
                    bs2.x xVar2 = bs2.x.INVALID;
                    String strName = xVar.name();
                    strName.getClass();
                    aVar.getClass();
                    ae2.r rVarA = ae2.r.a.a(strName);
                    Short shK2 = zpVar.k(4);
                    short sShortValue = shK2 != null ? shK2.shortValue() : (short) -1;
                    Float fH = zpVar.h(5);
                    Double dValueOf2 = fH != null ? Double.valueOf(fH.floatValue()) : null;
                    Float fH2 = zpVar.h(14);
                    Double dValueOf3 = fH2 != null ? Double.valueOf(fH2.floatValue()) : null;
                    ae2.f.a.c cVar = new ae2.f.a.c();
                    Short shK3 = zpVar.k(3);
                    short sShortValue2 = shK3 != null ? shK3.shortValue() : (short) 0;
                    Short shK4 = zpVar.k(30);
                    short sShortValue3 = shK4 != null ? shK4.shortValue() : (short) -1;
                    Integer numI = zpVar.i(7);
                    double dIntValue = numI != null ? numI.intValue() : -1.0d;
                    Float fH3 = zpVar.h(73);
                    if (fH3 == null) {
                        fH3 = zpVar.h(6);
                    }
                    Double dValueOf4 = fH3 != null ? Double.valueOf(fH3.floatValue()) : null;
                    Float fH4 = zpVar.h(5);
                    Double dValueOf5 = fH4 != null ? Double.valueOf(fH4.floatValue()) : null;
                    Float fH5 = zpVar.h(15);
                    ae2.f fVar = new ae2.f(dValueOf, null, rVarA, sShortValue, null, dValueOf2, dValueOf3, null, cVar, null, sShortValue2, sShortValue3, null, dIntValue, dValueOf4, null, dValueOf5, fH5 != null ? Double.valueOf(fH5.floatValue()) : null, null, 299666, null);
                    fVar.d(Long.valueOf(j8));
                    Short shK5 = zpVar.k(31);
                    Integer numValueOf = shK5 != null ? Integer.valueOf(shK5.shortValue()) : null;
                    Float fH6 = zpVar.h(78);
                    if (fH6 == null) {
                        fH6 = zpVar.h(2);
                    }
                    Float f14 = fH6;
                    Float fH7 = zpVar.h(81);
                    Integer numValueOf2 = fH7 != null ? Integer.valueOf((int) fH7.floatValue()) : null;
                    l6 l6VarP = zpVar.p(zpVar.j(253, 65535));
                    DateTime dateTime = new DateTime(l6VarP != null ? Long.valueOf(new Date((l6VarP.f20276a * 1000) + Math.round(l6VarP.f20277b * 1000.0d) + 631065600000L).getTime()) : null);
                    o0.c cVar2 = new o0.c();
                    p0.d dVar = new p0.d();
                    Integer numI2 = zpVar.i(89);
                    ae2.z zVar = new ae2.z(zpVar.i(0), zpVar.i(1));
                    Float fH8 = zpVar.h(73);
                    if (fH8 == null) {
                        fH8 = zpVar.h(6);
                    }
                    ae2.g gVar = new ae2.g(numValueOf, f14, numValueOf2, cVar2, dateTime, null, dVar, numI2, null, zVar, null, fH8, 1312, null);
                    gVar.c(fVar);
                    z zVar2 = zVarH;
                    zVar2.a(gVar);
                    zVar2.f59388a.debug("FitnessPointData message = " + gVar);
                }
            });
            ckVar.U0.add(new cb() { // from class: de2.y
                /* JADX WARN: Code duplicated, block: B:31:0x0082  */
                @Override // bs2.cb
                public final void a(bb bbVar) {
                    bs2.x xVar;
                    ae2.u uVar;
                    z zVar = zVarH;
                    Logger logger = zVar.f59388a;
                    fb eventType = bbVar.getEventType();
                    ae2.u uVar2 = null;
                    String strName = eventType != null ? eventType.name() : null;
                    Short shK = bbVar.k(14);
                    if (shK != null) {
                        bs2.x[] xVarArrValues = bs2.x.values();
                        int length = xVarArrValues.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                xVar = bs2.x.INVALID;
                                break;
                            }
                            xVar = xVarArrValues[i14];
                            if (shK.shortValue() == xVar.f20658a) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                    } else {
                        xVar = null;
                    }
                    logger.debug("createEventMesgListener eventType = " + strName + " activityType = " + (xVar != null ? xVar.name() : null));
                    if (bbVar.c() == null || bbVar.c() != ab.TIMER) {
                        uVar = null;
                    } else {
                        fb eventType2 = bbVar.getEventType();
                        if ((eventType2 == null ? -1 : a0.a.f59241a[eventType2.ordinal()]) == 1) {
                            uVar = new ae2.u(null, ae2.v.b.f2999a, null, 5, null);
                        } else {
                            uVar = null;
                        }
                    }
                    if (uVar != null) {
                        uVar.f2995a = Long.valueOf(j8);
                        uVar2 = uVar;
                    }
                    if (uVar2 != null) {
                        zVar.a(uVar2);
                        logger.debug("LtLifeEvent event = " + uVar2);
                    }
                }
            });
            ckVar.Q0.add(new ui() { // from class: de2.t
                @Override // bs2.ui
                public final void a(ti tiVar) {
                    z zVar = zVarH;
                    Logger logger = zVar.f59388a;
                    fb eventType = tiVar.getEventType();
                    String strName = eventType != null ? eventType.name() : null;
                    logger.debug("createLapMessageListener eventType = " + strName + " activityTime = " + tiVar.h(70));
                    ae2.s sVar = new ae2.s(null, new ae2.t.d(), 1, null);
                    sVar.f2991a = Long.valueOf(j8);
                    zVar.a(sVar);
                    logger.debug("LtEvent lap = " + sVar);
                }
            });
            ckVar.N0.add(new bs2.u() { // from class: de2.w
                @Override // bs2.u
                public final void a(bs2.t tVar) {
                    bs2.q qVar;
                    z zVar = zVarH;
                    Logger logger = zVar.f59388a;
                    fb eventType = tVar.getEventType();
                    String strName = eventType != null ? eventType.name() : null;
                    Short shK = tVar.k(2);
                    if (shK != null) {
                        bs2.q[] qVarArrValues = bs2.q.values();
                        int length = qVarArrValues.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                qVar = bs2.q.INVALID;
                                break;
                            }
                            qVar = qVarArrValues[i14];
                            if (shK.shortValue() == qVar.f20420a) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                    } else {
                        qVar = null;
                    }
                    logger.debug("createActivityMesgListener eventType = " + strName + " activityType = " + (qVar != null ? qVar.name() : null));
                    ae2.s sVar = new ae2.s(null, new ae2.t.c(), 1, null);
                    long j14 = j8;
                    sVar.f2991a = Long.valueOf(j14);
                    zVar.a(sVar);
                    logger.debug("LtEvent activity = " + sVar);
                    ae2.u uVar = new ae2.u(null, ae2.v.a.f2998a, null, 5, null);
                    uVar.f2995a = Long.valueOf(j14);
                    zVar.a(uVar);
                    logger.debug("LtLifeEvent activity = " + uVar);
                }
            });
            ckVar.P0.add(new gs() { // from class: de2.s
                @Override // bs2.gs
                public final void a(fs fsVar) {
                    ov ovVar;
                    z zVar = zVarH;
                    Logger logger = zVar.f59388a;
                    js jsVarR = fsVar.r();
                    ae2.u uVar = null;
                    String strName = jsVarR != null ? jsVarR.name() : null;
                    Short shK = fsVar.k(81);
                    if (shK != null) {
                        ov[] ovVarArrValues = ov.values();
                        int length = ovVarArrValues.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                ovVar = ov.INVALID;
                                break;
                            }
                            ovVar = ovVarArrValues[i14];
                            if (shK.shortValue() == ovVar.f20389a) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                    } else {
                        ovVar = null;
                    }
                    String strName2 = ovVar != null ? ovVar.name() : null;
                    Short shK2 = fsVar.k(5);
                    nv nvVarA = shK2 == null ? null : nv.a(shK2);
                    String strName3 = nvVarA != null ? nvVarA.name() : null;
                    Short shK3 = fsVar.k(6);
                    sw swVarA = shK3 == null ? null : sw.a(shK3);
                    fb eventType = fsVar.getEventType();
                    String strName4 = eventType != null ? eventType.name() : null;
                    ab abVarC = fsVar.c();
                    String strName5 = abVarC != null ? abVarC.name() : null;
                    StringBuilder sbI = p6.b.i("createSessionMesgListener trigger = ", strName, " sportEvent = ", strName2, " sport = ");
                    sbI.append(strName3);
                    sbI.append(" subSport = ");
                    sbI.append(swVarA);
                    sbI.append(" eventType = ");
                    sbI.append(strName4);
                    sbI.append(" event = ");
                    sbI.append(strName5);
                    logger.debug(sbI.toString());
                    js jsVarR2 = fsVar.r();
                    ae2.s sVar = (jsVarR2 == null ? -1 : a0.a.f59242b[jsVarR2.ordinal()]) == 1 ? new ae2.s(null, new ae2.t.c(), 1, null) : null;
                    long j14 = j8;
                    if (sVar != null) {
                        sVar.f2991a = Long.valueOf(j14);
                    } else {
                        sVar = null;
                    }
                    if (sVar != null) {
                        zVar.a(sVar);
                        logger.debug("LtEvent session = " + sVar);
                    }
                    js jsVarR3 = fsVar.r();
                    ae2.u uVar2 = (jsVarR3 != null ? a0.a.f59242b[jsVarR3.ordinal()] : -1) == 1 ? new ae2.u(null, ae2.v.a.f2998a, null, 5, null) : null;
                    if (uVar2 != null) {
                        uVar2.f2995a = Long.valueOf(j14);
                        uVar = uVar2;
                    }
                    if (uVar != null) {
                        zVar.a(uVar);
                        logger.debug("LtLifeEvent session = " + uVar);
                    }
                }
            });
            ckVar.f19833f0.add(new qv() { // from class: de2.u
                /* JADX WARN: Code duplicated, block: B:83:0x014b  */
                @Override // bs2.qv
                public final void a(pv pvVar) {
                    z3 z3Var;
                    ov ovVar;
                    ae2.r iVar;
                    z3 z3Var2;
                    z3 z3Var3;
                    z zVar = zVarH;
                    Logger logger = zVar.f59388a;
                    Short shK = pvVar.k(5);
                    int i14 = 0;
                    ae2.t.a aVar = null;
                    if (shK != null) {
                        z3[] z3VarArrValues = z3.values();
                        int length = z3VarArrValues.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= length) {
                                z3Var = z3.INVALID;
                                break;
                            }
                            z3Var = z3VarArrValues[i15];
                            if (shK.shortValue() == z3Var.f20708a) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    } else {
                        z3Var = null;
                    }
                    Short shK2 = pvVar.k(6);
                    if (shK2 != null) {
                        ov[] ovVarArrValues = ov.values();
                        int length2 = ovVarArrValues.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= length2) {
                                ovVar = ov.INVALID;
                                break;
                            }
                            ovVar = ovVarArrValues[i16];
                            if (shK2.shortValue() == ovVar.f20389a) {
                                break;
                            } else {
                                i16++;
                            }
                        }
                    } else {
                        ovVar = null;
                    }
                    String strName = ovVar != null ? ovVar.name() : null;
                    Short shK3 = pvVar.k(0);
                    nv nvVarA = shK3 == null ? null : nv.a(shK3);
                    String strName2 = nvVarA != null ? nvVarA.name() : null;
                    Short shK4 = pvVar.k(1);
                    logger.debug("SportMesgListener enabled = " + z3Var + " sportEvent = " + strName + " sport = " + strName2 + " subSport = " + (shK4 == null ? null : sw.a(shK4)));
                    Short shK5 = pvVar.k(0);
                    nv nvVarA2 = shK5 == null ? null : nv.a(shK5);
                    if (nvVarA2 != null) {
                        switch (a0.a.f59243c[nvVarA2.ordinal()]) {
                            case 1:
                                iVar = new ae2.r.j();
                                break;
                            case 2:
                                iVar = new ae2.r.b();
                                break;
                            case 3:
                                iVar = new ae2.r.l();
                                break;
                            case 4:
                                iVar = new ae2.r.e();
                                break;
                            case 5:
                                iVar = new ae2.r.k();
                                break;
                            case 6:
                                iVar = new ae2.r.o();
                                break;
                            case 7:
                                iVar = new ae2.r.g();
                                break;
                            case 8:
                                iVar = new ae2.r.h();
                                break;
                            case 9:
                                iVar = new ae2.r.n();
                                break;
                            default:
                                iVar = new ae2.r.i();
                                break;
                        }
                    } else {
                        iVar = new ae2.r.i();
                    }
                    ae2.r rVar = iVar;
                    Short shK6 = pvVar.k(0);
                    if ((shK6 == null ? null : nv.a(shK6)) != null) {
                        Short shK7 = pvVar.k(5);
                        if (shK7 == null) {
                            z3Var2 = null;
                        } else {
                            z3[] z3VarArrValues2 = z3.values();
                            int length3 = z3VarArrValues2.length;
                            int i17 = 0;
                            while (true) {
                                if (i17 < length3) {
                                    z3Var2 = z3VarArrValues2[i17];
                                    if (shK7.shortValue() != z3Var2.f20708a) {
                                        i17++;
                                    }
                                } else {
                                    z3Var2 = z3.INVALID;
                                }
                            }
                        }
                        if (z3Var2 == null) {
                            aVar = new ae2.t.a();
                        } else {
                            Short shK8 = pvVar.k(5);
                            if (shK8 == null) {
                                z3Var3 = null;
                            } else {
                                z3[] z3VarArrValues3 = z3.values();
                                int length4 = z3VarArrValues3.length;
                                while (true) {
                                    if (i14 < length4) {
                                        z3Var3 = z3VarArrValues3[i14];
                                        if (shK8.shortValue() != z3Var3.f20708a) {
                                            i14++;
                                        }
                                    } else {
                                        z3Var3 = z3.INVALID;
                                    }
                                }
                            }
                            if (z3Var3 != z3.FALSE) {
                                aVar = new ae2.t.a();
                            }
                        }
                    }
                    ae2.w wVar = new ae2.w(null, rVar, aVar, 1, null);
                    wVar.f3000a = Long.valueOf(j8);
                    zVar.a(wVar);
                    logger.debug("SportMesg LtSportEvent sport change = " + wVar);
                }
            });
            ckVar.f19832f.add(new jd() { // from class: de2.v
                @Override // bs2.jd
                public final void a(id idVar) {
                    ad adVar;
                    long j14;
                    ad adVar2;
                    ae2.u uVar;
                    ae2.u uVar2;
                    z zVar = zVarH;
                    Logger logger = zVar.f59388a;
                    int i14 = 0;
                    Short shK = idVar.k(0);
                    if (shK != null) {
                        ad[] adVarArrValues = ad.values();
                        int length = adVarArrValues.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= length) {
                                adVar = ad.INVALID;
                                break;
                            }
                            adVar = adVarArrValues[i15];
                            if (shK.shortValue() == adVar.f19675a) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    } else {
                        adVar = null;
                    }
                    l6 l6VarR = idVar.r();
                    l6 l6VarR2 = idVar.r();
                    logger.debug("FileIdMesgListener type " + adVar + " date " + l6VarR + " timestamp " + (l6VarR2 != null ? l6VarR2.a() : null));
                    if (idVar.r() == null) {
                        uVar = null;
                    } else {
                        long j15 = 631065600;
                        long jCurrentTimeMillis = System.currentTimeMillis() - ((idVar.r().a().longValue() + 631065600) * 1000);
                        Short shK2 = idVar.k(0);
                        if (shK2 != null) {
                            ad[] adVarArrValues2 = ad.values();
                            int length2 = adVarArrValues2.length;
                            while (true) {
                                if (i14 >= length2) {
                                    j14 = j15;
                                    adVar2 = ad.INVALID;
                                    break;
                                }
                                adVar2 = adVarArrValues2[i14];
                                j14 = j15;
                                if (shK2.shortValue() == adVar2.f19675a) {
                                    break;
                                }
                                i14++;
                                j15 = j14;
                            }
                        } else {
                            j14 = 631065600;
                            adVar2 = null;
                        }
                        uVar = (!p005kotlin.jvm.internal.s.g(adVar2 != null ? adVar2.name() : null, "ACTIVITY") || jCurrentTimeMillis / ((long) 1000) >= 30) ? new ae2.u(null, null, new DateTime((idVar.r().a().longValue() + j14) * 1000), 3, null) : new ae2.u(null, ae2.v.b.f2999a, new DateTime((idVar.r().a().longValue() + j14) * 1000), 1, null);
                    }
                    if (uVar != null) {
                        uVar.f2995a = Long.valueOf(j8);
                        uVar2 = uVar;
                    } else {
                        uVar2 = null;
                    }
                    if (uVar2 != null) {
                        zVar.a(uVar2);
                        logger.debug("FileIdMesg LtLifeEvent event type = " + uVar2.f2996b);
                    }
                }
            });
            concurrentHashMap.put(Long.valueOf(j8), ckVar);
            v5 v5Var = new v5();
            v5Var.o(0);
            z3 z3Var = z3.TRUE;
            short s8 = z3Var.f20708a;
            short s14 = z3Var.f20708a;
            v5Var.n(0, Short.valueOf(s8));
            v5Var.n(1, Short.valueOf(s14));
            v5Var.n(2, Short.valueOf(z3.INVALID.f20708a));
            z3 z3Var2 = z3.FALSE;
            short s15 = z3Var2.f20708a;
            short s16 = z3Var2.f20708a;
            v5Var.n(4, Short.valueOf(s15));
            v5Var.n(5, Short.valueOf(s16));
            v5Var.n(6, Short.valueOf(s16));
            v5Var.n(7, Short.valueOf(s16));
            v5Var.n(8, Short.valueOf(s14));
            v5Var.n(9, Short.valueOf(s14));
            v5Var.n(10, Short.valueOf(s14));
            v5Var.n(13, Short.valueOf(s16));
            ja2.b bVar = new ja2.b(new fk(v5Var));
            zp zpVar = new zp();
            zpVar.n(0, 0);
            zpVar.n(1, 0);
            zpVar.n(253, new l6(0L).a());
            zpVar.n(14, Float.valueOf(0.0f));
            zpVar.o(1);
            fk fkVar = new fk(zpVar);
            ByteArrayOutputStream byteArrayOutputStream = bVar.f98075a;
            fkVar.b(byteArrayOutputStream);
            bb bbVar = new bb();
            bbVar.n(0, Short.valueOf(ab.TIMER.f19665a));
            bbVar.d(fb.START);
            bbVar.o(2);
            new fk(bbVar).b(byteArrayOutputStream);
            ti tiVar = new ti();
            tiVar.o(3);
            new fk(tiVar).b(byteArrayOutputStream);
            bs2.t tVar = new bs2.t();
            tVar.o(4);
            new fk(tVar).b(byteArrayOutputStream);
            fs fsVar = new fs();
            fsVar.o(7);
            new fk(fsVar).b(byteArrayOutputStream);
            pv pvVar = new pv();
            pvVar.o(8);
            new fk(pvVar).b(byteArrayOutputStream);
            ck ckVar2 = (ck) concurrentHashMap.get(Long.valueOf(j8));
            if (ckVar2 != null) {
                ckVar2.c(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            }
        }
        h().addObserver(this);
        this.f59228a.f(this);
        return h();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009e A[Catch: all -> 0x0055, RemoteException -> 0x0058, TRY_LEAVE, TryCatch #6 {RemoteException -> 0x0058, all -> 0x0055, blocks: (B:24:0x0051, B:34:0x0099, B:36:0x009e, B:42:0x00b3), top: B:55:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3 A[Catch: all -> 0x0055, RemoteException -> 0x0058, TRY_ENTER, TRY_LEAVE, TryCatch #6 {RemoteException -> 0x0058, all -> 0x0055, blocks: (B:24:0x0051, B:34:0x0099, B:36:0x009e, B:42:0x00b3), top: B:55:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // de2.g0
    public final Object b(long j8, boolean z14, h0 h0Var, v13.c cVar) {
        j jVar;
        h0 h0Var2;
        g0.b bVar;
        boolean z15;
        String str;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f59321g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f59321g = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objJ = jVar.f59319e;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f59321g;
        Logger logger = this.f59230c;
        try {
            try {
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            long j14 = jVar.f59315a;
                            g0.b bVar2 = jVar.f59318d;
                            o13.r.b(objJ);
                            return (g0.b) objJ;
                        }
                        if (i15 != 3) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        long j15 = jVar.f59315a;
                        g0.b bVar3 = jVar.f59318d;
                        o13.r.b(objJ);
                        return (g0.b) objJ;
                    }
                    boolean z16 = jVar.f59316b;
                    j8 = jVar.f59315a;
                    bVar = jVar.f59318d;
                    h0Var2 = jVar.f59317c;
                    try {
                        o13.r.b(objJ);
                        z15 = z16;
                        str = (String) objJ;
                        if (z15) {
                            jVar.f59317c = null;
                            jVar.f59318d = bVar;
                            jVar.f59315a = j8;
                            jVar.f59316b = z15;
                            jVar.f59321g = 2;
                            objJ = m(str, h0Var2, jVar);
                            if (objJ != obj) {
                                return (g0.b) objJ;
                            }
                        } else {
                            jVar.f59317c = null;
                            jVar.f59318d = bVar;
                            jVar.f59315a = j8;
                            jVar.f59316b = z15;
                            jVar.f59321g = 3;
                            objJ = j(str, jVar);
                            if (objJ != obj) {
                                return (g0.b) objJ;
                            }
                        }
                        return obj;
                    } catch (RemoteException e4) {
                        e = e4;
                        z14 = bVar;
                        logger.error("Live track not started: " + j8 + " RemoteException " + e.getMessage());
                        return z14;
                    } catch (Throwable unused) {
                        return bVar;
                    }
                }
                o13.r.b(objJ);
                logger.debug("Start live track " + j8 + "; deviceDriven: " + z14 + ", startDetails: " + h0Var);
                g0.b.c cVar2 = g0.b.c.f59298a;
                try {
                    jVar.f59317c = h0Var;
                    jVar.f59318d = cVar2;
                    jVar.f59315a = j8;
                    jVar.f59316b = z14;
                    jVar.f59321g = 1;
                    Object objI = i(j8, jVar);
                    if (objI != obj) {
                        h0Var2 = h0Var;
                        bVar = cVar2;
                        objJ = objI;
                        z15 = z14;
                        str = (String) objJ;
                        if (z15) {
                            jVar.f59317c = null;
                            jVar.f59318d = bVar;
                            jVar.f59315a = j8;
                            jVar.f59316b = z15;
                            jVar.f59321g = 2;
                            objJ = m(str, h0Var2, jVar);
                            if (objJ != obj) {
                                return (g0.b) objJ;
                            }
                        } else {
                            jVar.f59317c = null;
                            jVar.f59318d = bVar;
                            jVar.f59315a = j8;
                            jVar.f59316b = z15;
                            jVar.f59321g = 3;
                            objJ = j(str, jVar);
                            if (objJ != obj) {
                                return (g0.b) objJ;
                            }
                        }
                    }
                    return obj;
                } catch (RemoteException e14) {
                    e = e14;
                    z14 = cVar2;
                    logger.error("Live track not started: " + j8 + " RemoteException " + e.getMessage());
                    return z14;
                } catch (Throwable unused2) {
                    return cVar2;
                }
            } catch (Throwable unused3) {
                return z14;
            }
        } catch (RemoteException e15) {
            e = e15;
        }
    }

    @Override // wd2.g
    public final void c(long j8, byte[] bArr) {
        z zVarH = h();
        Logger logger = zVarH.f59388a;
        try {
            ck ckVar = (ck) zVarH.f59389b.get(Long.valueOf(j8));
            if (ckVar != null) {
                ckVar.c(new ByteArrayInputStream(bArr));
            }
        } catch (FitRuntimeException e4) {
            logger.error(v.h.u(j8, "FitRuntimeException for device ID [", "] ", e4.getMessage()), e4.getCause());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r11.a(r10, r0) == r1) goto L25;
     */
    @Override // de2.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(long j8, ae2.a aVar, v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f59291e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f59291e = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objI = gVar.f59289c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f59291e;
        Logger logger = this.f59230c;
        if (i15 != 0) {
            if (i15 == 1) {
                j8 = gVar.f59287a;
                aVar = gVar.f59288b;
                o13.r.b(objI);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objI);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objI);
        logger.debug("send auto start fail for device " + j8 + ", reason code = " + aVar.f2803a);
        gVar.f59288b = aVar;
        gVar.f59287a = j8;
        gVar.f59291e = 1;
        objI = i(j8, gVar);
        if (objI != obj) {
        }
        return obj;
        String str = (String) objI;
        if (str != null) {
            b0 b0Var = (b0) da2.d.c(this.f59231d).getCapability(str, b0.class);
            if (b0Var != null) {
                gVar.f59288b = null;
                gVar.f59287a = j8;
                gVar.f59291e = 2;
            } else {
                wr.g.v("Live track failure not sent: device ", j8, " disconnected", logger);
            }
        } else {
            logger.error("Live track failure not sent: remoteDeviceMacAddress is null");
        }
        return Unit.INSTANCE;
    }

    @Override // de2.g0
    public final Object e(long j8, String str, j0.c cVar) {
        this.f59230c.debug(v.h.u(j8, "Updating session name ", StringUtils.SPACE, str));
        GDILiveTrackProto.ShareMetaConfigurationNotification.Builder builderNewBuilder = GDILiveTrackProto.ShareMetaConfigurationNotification.newBuilder();
        builderNewBuilder.setSessionName(str);
        GDILiveTrackProto.ShareMetaConfigurationNotification shareMetaConfigurationNotificationBuild = builderNewBuilder.build();
        shareMetaConfigurationNotificationBuild.getClass();
        Object objT = t(j8, shareMetaConfigurationNotificationBuild, cVar);
        return objT == u13.a.COROUTINE_SUSPENDED ? objT : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
    
        if (r7 == r11) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [de2.g0$b] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v4, types: [de2.g0$b, de2.g0$b$c] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    @Override // de2.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j8, boolean z14, List list, long j14, v13.c cVar) {
        k kVar;
        ?? r14;
        Object obj;
        ?? r15;
        a aVar;
        Object obj2;
        Context context;
        ?? r16;
        Object obj3;
        long j15 = j8;
        boolean z15 = z14;
        ?? r17 = list;
        long j16 = j14;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f59330i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f59330i = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object obj4 = kVar.f59328g;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f59330i;
        Logger logger = this.f59230c;
        try {
            try {
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            long j17 = kVar.f59323b;
                            z15 = kVar.f59324c;
                            long j18 = kVar.f59322a;
                            a aVar3 = (a) kVar.f59327f;
                            g0.b bVar = kVar.f59326e;
                            try {
                                o13.r.b(obj4);
                                aVar = aVar3;
                                obj = obj4;
                                r15 = bVar;
                                j16 = j17;
                                j15 = j18;
                                kVar.f59325d = null;
                                kVar.f59326e = r15;
                                kVar.f59327f = null;
                                kVar.f59322a = j15;
                                kVar.f59324c = z15;
                                kVar.f59323b = j16;
                                kVar.f59330i = 3;
                                Object objK = aVar.k((String) obj, kVar);
                                obj3 = objK;
                                r14 = objK;
                            } catch (RemoteException e4) {
                                e = e4;
                                j15 = j18;
                                r17 = bVar;
                            } catch (Throwable unused) {
                                return bVar;
                            }
                        } else {
                            if (i15 != 3) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            long j19 = kVar.f59322a;
                            g0.b bVar2 = kVar.f59326e;
                            o13.r.b(obj4);
                            obj3 = obj4;
                        }
                        return (g0.b) obj3;
                    }
                    long j24 = kVar.f59323b;
                    long j25 = kVar.f59322a;
                    context = (Context) kVar.f59327f;
                    g0.b bVar3 = kVar.f59326e;
                    List list2 = kVar.f59325d;
                    try {
                        o13.r.b(obj4);
                        j16 = j24;
                        obj2 = obj4;
                        r16 = list2;
                        return a0.c(context, (String) obj2, a0.b(j16, r16));
                    } catch (RemoteException e14) {
                        e = e14;
                        j15 = j25;
                        r17 = bVar3;
                    } catch (Throwable unused2) {
                        return bVar3;
                    }
                    logger.error("Live track not stopped: " + j15 + " RemoteException " + e.getMessage());
                    return r17;
                }
                o13.r.b(obj4);
                logger.debug("Stop live track " + j15);
                r14 = g0.b.c.f59298a;
                try {
                    if (z15) {
                        logger.debug("Stop device driven sessionIds " + r17 + " extendDuration: " + j16);
                        Context context2 = this.f59231d;
                        context2.getClass();
                        kVar.f59325d = r17;
                        kVar.f59326e = r14;
                        kVar.f59327f = context2;
                        kVar.f59322a = j15;
                        kVar.f59324c = z15;
                        kVar.f59323b = j16;
                        kVar.f59330i = 1;
                        Object objI = i(j15, kVar);
                        if (objI != aVar2) {
                            r14 = r14;
                            obj2 = objI;
                            context = context2;
                            r16 = r17;
                            return a0.c(context, (String) obj2, a0.b(j16, r16));
                        }
                    } else {
                        kVar.f59325d = null;
                        kVar.f59326e = r14;
                        kVar.f59327f = this;
                        kVar.f59322a = j15;
                        kVar.f59324c = z15;
                        kVar.f59323b = j16;
                        kVar.f59330i = 2;
                        Object objI2 = i(j15, kVar);
                        r14 = r14;
                        if (objI2 != aVar2) {
                            obj = objI2;
                            r15 = r14;
                            aVar = this;
                            kVar.f59325d = null;
                            kVar.f59326e = r15;
                            kVar.f59327f = null;
                            kVar.f59322a = j15;
                            kVar.f59324c = z15;
                            kVar.f59323b = j16;
                            kVar.f59330i = 3;
                            Object objK2 = aVar.k((String) obj, kVar);
                            obj3 = objK2;
                            r14 = objK2;
                        }
                    }
                    r14 = r14;
                    return aVar2;
                } catch (RemoteException e15) {
                    e = e15;
                    r17 = r14;
                } catch (Throwable unused3) {
                    return r14;
                }
            } catch (Throwable unused4) {
                return r17;
            }
        } catch (RemoteException e16) {
            e = e16;
        }
    }

    @Override // de2.g0
    public final Unit g(long j8) {
        z zVarH = h();
        zVarH.f59388a.info("unregisterDevice [" + j8 + "] ");
        zVarH.f59389b.remove(Long.valueOf(j8));
        if (h().f59389b.isEmpty()) {
            h().deleteObserver(this);
            this.f59228a.a();
        }
        return Unit.INSTANCE;
    }

    public final z h() {
        return (z) this.f59232e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, p13.j0] */
    public final Object i(long j8, v13.c cVar) {
        de2.b bVar;
        r0 r0Var;
        Object next;
        if (cVar instanceof de2.b) {
            bVar = (de2.b) cVar;
            int i14 = bVar.f59249e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f59249e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new de2.b(this, cVar);
            }
        } else {
            bVar = new de2.b(this, cVar);
        }
        Object obj = bVar.f59247c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f59249e;
        if (i15 == 0) {
            r0 r0VarS = wr.g.s(obj);
            r0VarS.f105810a = p13.j0.f134944a;
            x53.c cVar2 = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            de2.c cVar3 = new de2.c(r0VarS, this, null);
            bVar.f59246b = r0VarS;
            bVar.f59245a = j8;
            bVar.f59249e = 1;
            if (ge1.b.e0(bVar2, cVar3, bVar) == aVar) {
                return aVar;
            }
            r0Var = r0VarS;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = bVar.f59245a;
            r0Var = bVar.f59246b;
            o13.r.b(obj);
        }
        List list = (List) r0Var.f105810a;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((DeviceProfile) next).getF92746j() != j8);
            DeviceProfile deviceProfile = (DeviceProfile) next;
            if (deviceProfile != null) {
                return deviceProfile.getMacAddress();
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, v13.c cVar) {
        de2.d dVar;
        String str2;
        m0 m0Var;
        if (cVar instanceof de2.d) {
            dVar = (de2.d) cVar;
            int i14 = dVar.f59269e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f59269e = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new de2.d(this, cVar);
            }
        } else {
            dVar = new de2.d(this, cVar);
        }
        Object obj = dVar.f59267c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f59269e;
        Context context = this.f59231d;
        Logger logger = this.f59230c;
        if (i15 == 0) {
            o13.r.b(obj);
            if (str == null) {
                return g0.b.c.f59298a;
            }
            b0 b0Var = (b0) da2.d.c(context).getCapability(str, b0.class);
            if (b0Var == null) {
                com.airbnb.lottie.animation.keyframe.a.u("Live track not started: device ", str, " disconnected", logger);
                return g0.b.a.f59296a;
            }
            m0 m0Var2 = new m0();
            long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - 631065600;
            e eVar = new e(this, m0Var2);
            dVar.f59265a = str;
            dVar.f59266b = m0Var2;
            dVar.f59269e = 1;
            if (b0Var.b(jCurrentTimeMillis, eVar, dVar) == aVar) {
                return aVar;
            }
            str2 = str;
            m0Var = m0Var2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m0Var = dVar.f59266b;
            str2 = dVar.f59265a;
            o13.r.b(obj);
        }
        if (!m0Var.f105804a) {
            com.airbnb.lottie.animation.keyframe.a.w("Live track not started: device ", str2, logger);
            return g0.b.c.f59298a;
        }
        if (!this.f59233f) {
            this.f59233f = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.garmin.livetrack.ACTION_ON_STOP_LIVE_TRACK_REQUEST_RECEIVED");
            i2.b(context, this.f59235h, intentFilter);
        }
        logger.debug("Live track started on device success");
        return g0.b.d.f59299a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f59283c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f59283c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objE = fVar.f59281a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f59283c;
        if (i15 == 0) {
            o13.r.b(objE);
            Logger logger = this.f59230c;
            if (str == null) {
                logger.debug("Live track not stopped: macAddress is null");
                return g0.b.c.f59298a;
            }
            b0 b0Var = (b0) da2.d.c(this.f59231d).getCapability(str, b0.class);
            if (b0Var == null) {
                com.airbnb.lottie.animation.keyframe.a.u("Live track not stopped: device ", str, " disconnected", logger);
                return g0.b.a.f59296a;
            }
            fVar.f59283c = 1;
            objE = b0Var.e(fVar);
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
        }
        return ((b0.c) objE) == b0.c.OK ? g0.b.d.f59299a : g0.b.c.f59298a;
    }

    public final Object l(long j8, ge2.e eVar, v13.c cVar) {
        if (!this.f59228a.e(j8)) {
            return g0.b.c.f59298a;
        }
        this.f59230c.debug("sendShareMetaConfiguration " + eVar);
        GDILiveTrackProto.ShareMetaConfigurationNotification.Builder builderNewBuilder = GDILiveTrackProto.ShareMetaConfigurationNotification.newBuilder();
        Boolean bool = eVar.f77026e;
        if (bool != null) {
            builderNewBuilder.setGrouptrackSharingEnabled(bool.booleanValue());
        }
        Boolean bool2 = eVar.f77024c;
        if (bool2 != null) {
            builderNewBuilder.setExtendLivetrackEnabled(bool2.booleanValue());
        }
        Boolean bool3 = eVar.f77023b;
        if (bool3 != null) {
            builderNewBuilder.setEmailSharingEnabled(bool3.booleanValue());
        }
        GDILiveTrackProto.ShareMetaConfigurationNotification shareMetaConfigurationNotificationBuild = builderNewBuilder.build();
        shareMetaConfigurationNotificationBuild.getClass();
        return t(j8, shareMetaConfigurationNotificationBuild, cVar);
    }

    public final Object m(String str, h0 h0Var, j jVar) {
        if (str == null || str.length() == 0 || da2.d.c(this.f59231d).a(str) == null) {
            return g0.b.a.f59296a;
        }
        if (h0Var == null) {
            return g0.b.c.f59298a;
        }
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new h(this, h0Var, str, null), jVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(long j8, v13.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f59314d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f59314d = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objI = iVar.f59312b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f59314d;
        if (i15 == 0) {
            o13.r.b(objI);
            iVar.f59311a = j8;
            iVar.f59314d = 1;
            objI = i(j8, iVar);
            if (objI == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = iVar.f59311a;
            o13.r.b(objI);
        }
        String str = (String) objI;
        if (str == null || !this.f59228a.g(str)) {
            return g0.b.c.f59298a;
        }
        this.f59230c.debug("sendUpdatedSettingsNotification " + j8);
        GDILiveTrackProto.UpdateSettingsNotification updateSettingsNotificationBuild = GDILiveTrackProto.UpdateSettingsNotification.newBuilder().build();
        GDILiveTrackProto.LiveTrackService.Builder builderNewBuilder = GDILiveTrackProto.LiveTrackService.newBuilder();
        builderNewBuilder.setUpdateSettingsNotification(updateSettingsNotificationBuild);
        Context context = this.f59231d;
        context.getClass();
        GDILiveTrackProto.LiveTrackService liveTrackServiceBuild = builderNewBuilder.build();
        liveTrackServiceBuild.getClass();
        return a0.c(context, str, liveTrackServiceBuild);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(long j8, v13.c cVar, boolean z14) {
        l lVar;
        Context context;
        GDILiveTrackProto.LiveTrackService.Builder builder;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f59335e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f59335e = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object obj = lVar.f59333c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f59335e;
        if (i15 == 0) {
            o13.r.b(obj);
            GDILiveTrackProto.ShareDeviceSettingNotification.Builder builderNewBuilder = GDILiveTrackProto.ShareDeviceSettingNotification.newBuilder();
            builderNewBuilder.setAutoStartEnabled(z14);
            GDILiveTrackProto.LiveTrackService.Builder builderNewBuilder2 = GDILiveTrackProto.LiveTrackService.newBuilder();
            builderNewBuilder2.setShareDeviceSettingNotification(builderNewBuilder.build());
            Context context2 = this.f59231d;
            context2.getClass();
            lVar.f59331a = builderNewBuilder2;
            lVar.f59332b = context2;
            lVar.f59335e = 1;
            Object objI = i(j8, lVar);
            if (objI == obj2) {
                return obj2;
            }
            obj = objI;
            context = context2;
            builder = builderNewBuilder2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = lVar.f59332b;
            builder = lVar.f59331a;
            o13.r.b(obj);
        }
        GDILiveTrackProto.LiveTrackService liveTrackServiceBuild = builder.build();
        liveTrackServiceBuild.getClass();
        return a0.c(context, (String) obj, liveTrackServiceBuild);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r9 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(long j8, v13.c cVar, boolean z14) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f59339d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f59339d = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objI = mVar.f59337b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f59339d;
        Logger logger = this.f59230c;
        if (i15 == 0) {
            o13.r.b(objI);
            logger.debug("Updating auto start for " + j8 + " to " + z14);
            if (this.f59228a.e(j8)) {
                mVar.f59336a = j8;
                mVar.f59339d = 1;
                Object objO = o(j8, mVar, z14);
                if (objO != obj) {
                    return objO;
                }
            } else {
                mVar.f59336a = j8;
                mVar.f59339d = 2;
                objI = i(j8, mVar);
            }
            return obj;
        }
        if (i15 == 1) {
            o13.r.b(objI);
            return objI;
        }
        if (i15 != 2) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = mVar.f59336a;
        o13.r.b(objI);
        String str = (String) objI;
        if (str == null) {
            logger.error("Cannot get mac address for " + j8);
            return g0.b.c.f59298a;
        }
        Context context = this.f59231d;
        DeviceProfile deviceProfileA = da2.d.c(context).a(str);
        ea2.b bVar = (ea2.b) da2.d.c(context).getCapability(str, ea2.b.class);
        if (deviceProfileA == null || bVar == null) {
            return g0.b.a.f59296a;
        }
        sm2.g.d(deviceProfileA);
        return g0.b.d.f59299a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:? A[LOOP:0: B:15:0x004b->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0075 -> B:23:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object q(boolean r9, v13.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof de2.n
            if (r0 == 0) goto L13
            r0 = r10
            de2.n r0 = (de2.n) r0
            int r1 = r0.f59345f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59345f = r1
            goto L18
        L13:
            de2.n r0 = new de2.n
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f59343d
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f59345f
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            int r9 = r0.f59342c
            boolean r2 = r0.f59340a
            java.util.Iterator r4 = r0.f59341b
            o13.r.b(r10)
            goto L78
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r9)
            r9 = 0
            return r9
        L34:
            o13.r.b(r10)
            android.content.Context r10 = r8.f59231d
            da2.d r10 = da2.d.c(r10)
            la2.e r10 = r10.f58886a
            da2.b r10 = r10.f111646e
            java.util.ArrayList r10 = r10.e()
            java.util.Iterator r10 = r10.iterator()
            r2 = 0
            r4 = r10
        L4b:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L7c
            java.lang.Object r10 = r4.next()
            com.garmin.device.datatypes.DeviceProfile r10 = (com.garmin.device.datatypes.DeviceProfile) r10
            long r5 = r10.getF92746j()
            wd2.e r10 = r8.f59228a
            boolean r10 = r10.c(r5)
            if (r10 == 0) goto L4b
            r0.getClass()
            r0.f59341b = r4
            r0.f59340a = r9
            r0.f59342c = r2
            r0.f59345f = r3
            java.lang.Object r10 = r8.p(r5, r0, r9)
            if (r10 != r1) goto L75
            return r1
        L75:
            r7 = r2
            r2 = r9
            r9 = r7
        L78:
            r7 = r2
            r2 = r9
            r9 = r7
            goto L4b
        L7c:
            kotlin.Unit r9 = p005kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: de2.a.q(boolean, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:50:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0104  */
    /* JADX WARN: Code duplicated, block: B:52:0x0107  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x0112 A[PHI: r4 r6 r7 r11 r12 r14 r15
      0x0112: PHI (r4v1 int) = (r4v7 int), (r4v7 int), (r4v27 int) binds: [B:61:0x012f, B:57:0x010f, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r6v1 java.util.Iterator) = (r6v4 java.util.Iterator), (r6v4 java.util.Iterator), (r6v10 java.util.Iterator) binds: [B:61:0x012f, B:57:0x010f, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r7v1 ge2.e) = (r7v2 ge2.e), (r7v2 ge2.e), (r7v6 ge2.e) binds: [B:61:0x012f, B:57:0x010f, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r11v1 int) = (r11v5 int), (r11v5 int), (r11v12 int) binds: [B:61:0x012f, B:57:0x010f, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r12v0 long) = (r12v1 long), (r12v1 long), (r12v10 long) binds: [B:61:0x012f, B:57:0x010f, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r14v0 int) = (r14v1 int), (r14v1 int), (r14v7 int) binds: [B:61:0x012f, B:57:0x010f, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0112: PHI (r15v0 int) = (r15v1 int), (r15v1 int), (r15v2 int) binds: [B:61:0x012f, B:57:0x010f, B:17:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:67:0x014f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0149, code lost:
    
        if (l(r12, r7, r2) == r3) goto L65;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0149 -> B:14:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(ge2.e eVar, v13.c cVar) {
        o oVar;
        Iterator it;
        int i14;
        ge2.e eVar2;
        int i15;
        int i16;
        long j8;
        int i17;
        ge2.e eVar3;
        Iterator it3;
        int i18;
        Iterator it4;
        int i19;
        ge2.a aVar;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        ge2.e eVar4;
        ge2.a aVar2;
        long f172494b;
        int i24;
        Map<Long, ge2.a> map;
        Boolean bool4;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i25 = oVar.f59356k;
            if ((i25 & Integer.MIN_VALUE) != 0) {
                oVar.f59356k = i25 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object obj = oVar.f59354i;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i26 = oVar.f59356k;
        wd2.e eVar5 = this.f59228a;
        if (i26 == 0) {
            o13.r.b(obj);
            it = da2.d.c(this.f59231d).f58886a.f111646e.e().iterator();
            i14 = 0;
            eVar2 = eVar;
            if (it.hasNext()) {
                return g0.b.d.f59299a;
            }
            f172494b = ((DeviceProfile) it.next()).getF92746j();
            map = eVar2.f77022a;
            if (map != null) {
                aVar2 = map.get(new Long(f172494b));
            } else {
                aVar2 = null;
            }
            if (eVar5.c(f172494b) || aVar2 == null || (bool4 = aVar2.f77007a) == null) {
                i16 = 0;
                eVar3 = eVar2;
                aVar = aVar2;
                it3 = it;
                j8 = f172494b;
                i15 = i14;
                if (eVar5.b(j8)) {
                    if (aVar != null) {
                        bool3 = aVar.f77008b;
                    } else {
                        bool3 = null;
                    }
                    if (bool3 != null) {
                        i17 = 1;
                    } else {
                        i17 = 0;
                    }
                } else {
                    i17 = 0;
                }
                if (aVar != null) {
                    bool = aVar.f77009c;
                } else {
                    bool = null;
                }
                if (bool == null) {
                    i18 = 0;
                } else {
                    if (aVar != null) {
                        bool2 = aVar.f77010d;
                    } else {
                        bool2 = null;
                    }
                    if (bool2 != null) {
                        i18 = 1;
                    } else {
                        i18 = 0;
                    }
                }
                if (i17 == 0) {
                    oVar.f59346a = eVar3;
                    oVar.f59347b = it3;
                    oVar.f59348c = null;
                    oVar.f59349d = i15;
                    oVar.f59350e = i16;
                    oVar.f59353h = j8;
                    oVar.f59351f = i17;
                    oVar.f59352g = i18;
                    oVar.f59356k = 2;
                    if (n(j8, oVar) != obj2) {
                        int i27 = i17;
                        it4 = it3;
                        int i28 = i18;
                        i19 = i15;
                        oVar.f59346a = eVar3;
                        oVar.f59347b = it4;
                        oVar.f59348c = null;
                        oVar.f59349d = i19;
                        oVar.f59350e = i16;
                        oVar.f59353h = j8;
                        oVar.f59351f = i27;
                        oVar.f59352g = i28;
                        oVar.f59356k = 3;
                    }
                } else {
                    oVar.f59346a = eVar3;
                    oVar.f59347b = it3;
                    oVar.f59348c = null;
                    oVar.f59349d = i15;
                    oVar.f59350e = i16;
                    oVar.f59353h = j8;
                    oVar.f59351f = i17;
                    oVar.f59352g = i18;
                    oVar.f59356k = 2;
                    if (n(j8, oVar) != obj2) {
                        int i29 = i17;
                        it4 = it3;
                        int i210 = i18;
                        i19 = i15;
                        oVar.f59346a = eVar3;
                        oVar.f59347b = it4;
                        oVar.f59348c = null;
                        oVar.f59349d = i19;
                        oVar.f59350e = i16;
                        oVar.f59353h = j8;
                        oVar.f59351f = i29;
                        oVar.f59352g = i210;
                        oVar.f59356k = 3;
                    }
                }
            } else {
                boolean zBooleanValue = bool4.booleanValue();
                oVar.f59346a = eVar2;
                oVar.f59347b = it;
                oVar.f59348c = aVar2;
                oVar.f59349d = i14;
                oVar.f59350e = 0;
                oVar.f59353h = f172494b;
                oVar.f59351f = 0;
                oVar.f59356k = 1;
                Object objP = p(f172494b, oVar, zBooleanValue);
                if (objP != obj2) {
                    eVar4 = eVar2;
                    obj = objP;
                    i24 = 0;
                    aVar = aVar2;
                    ge2.e eVar6 = eVar4;
                    i16 = i24;
                    long j14 = f172494b;
                    it3 = it;
                    j8 = j14;
                    eVar3 = eVar6;
                    i15 = i14;
                    if (eVar5.b(j8)) {
                        i17 = 0;
                    } else {
                        if (aVar != null) {
                            bool3 = aVar.f77008b;
                        } else {
                            bool3 = null;
                        }
                        if (bool3 != null) {
                            i17 = 1;
                        } else {
                            i17 = 0;
                        }
                    }
                    if (aVar != null) {
                        bool = aVar.f77009c;
                    } else {
                        bool = null;
                    }
                    if (bool == null) {
                        i18 = 0;
                    } else {
                        if (aVar != null) {
                            bool2 = aVar.f77010d;
                        } else {
                            bool2 = null;
                        }
                        if (bool2 != null) {
                            i18 = 1;
                        } else {
                            i18 = 0;
                        }
                    }
                    if (i17 == 0) {
                        oVar.f59346a = eVar3;
                        oVar.f59347b = it3;
                        oVar.f59348c = null;
                        oVar.f59349d = i15;
                        oVar.f59350e = i16;
                        oVar.f59353h = j8;
                        oVar.f59351f = i17;
                        oVar.f59352g = i18;
                        oVar.f59356k = 2;
                        if (n(j8, oVar) != obj2) {
                            int i211 = i17;
                            it4 = it3;
                            int i212 = i18;
                            i19 = i15;
                            oVar.f59346a = eVar3;
                            oVar.f59347b = it4;
                            oVar.f59348c = null;
                            oVar.f59349d = i19;
                            oVar.f59350e = i16;
                            oVar.f59353h = j8;
                            oVar.f59351f = i211;
                            oVar.f59352g = i212;
                            oVar.f59356k = 3;
                        }
                    } else {
                        oVar.f59346a = eVar3;
                        oVar.f59347b = it3;
                        oVar.f59348c = null;
                        oVar.f59349d = i15;
                        oVar.f59350e = i16;
                        oVar.f59353h = j8;
                        oVar.f59351f = i17;
                        oVar.f59352g = i18;
                        oVar.f59356k = 2;
                        if (n(j8, oVar) != obj2) {
                            int i213 = i17;
                            it4 = it3;
                            int i214 = i18;
                            i19 = i15;
                            oVar.f59346a = eVar3;
                            oVar.f59347b = it4;
                            oVar.f59348c = null;
                            oVar.f59349d = i19;
                            oVar.f59350e = i16;
                            oVar.f59353h = j8;
                            oVar.f59351f = i213;
                            oVar.f59352g = i214;
                            oVar.f59356k = 3;
                        }
                    }
                }
            }
            return obj2;
        }
        if (i26 == 1) {
            f172494b = oVar.f59353h;
            i24 = oVar.f59350e;
            i14 = oVar.f59349d;
            aVar2 = oVar.f59348c;
            it = oVar.f59347b;
            eVar4 = oVar.f59346a;
            o13.r.b(obj);
            aVar = aVar2;
            ge2.e eVar7 = eVar4;
            i16 = i24;
            long j15 = f172494b;
            it3 = it;
            j8 = j15;
            eVar3 = eVar7;
            i15 = i14;
            if (eVar5.b(j8)) {
                i17 = 0;
            } else {
                if (aVar != null) {
                    bool3 = aVar.f77008b;
                } else {
                    bool3 = null;
                }
                if (bool3 != null) {
                    i17 = 1;
                } else {
                    i17 = 0;
                }
            }
            if (aVar != null) {
                bool = aVar.f77009c;
            } else {
                bool = null;
            }
            if (bool == null) {
                i18 = 0;
            } else {
                if (aVar != null) {
                    bool2 = aVar.f77010d;
                } else {
                    bool2 = null;
                }
                if (bool2 != null) {
                    i18 = 1;
                } else {
                    i18 = 0;
                }
            }
            if (i17 == 0 || i18 != 0) {
                oVar.f59346a = eVar3;
                oVar.f59347b = it3;
                oVar.f59348c = null;
                oVar.f59349d = i15;
                oVar.f59350e = i16;
                oVar.f59353h = j8;
                oVar.f59351f = i17;
                oVar.f59352g = i18;
                oVar.f59356k = 2;
                if (n(j8, oVar) != obj2) {
                    int i215 = i17;
                    it4 = it3;
                    int i216 = i18;
                    i19 = i15;
                    oVar.f59346a = eVar3;
                    oVar.f59347b = it4;
                    oVar.f59348c = null;
                    oVar.f59349d = i19;
                    oVar.f59350e = i16;
                    oVar.f59353h = j8;
                    oVar.f59351f = i215;
                    oVar.f59352g = i216;
                    oVar.f59356k = 3;
                }
            } else {
                int i217 = i17;
                it4 = it3;
                int i218 = i18;
                i19 = i15;
                oVar.f59346a = eVar3;
                oVar.f59347b = it4;
                oVar.f59348c = null;
                oVar.f59349d = i19;
                oVar.f59350e = i16;
                oVar.f59353h = j8;
                oVar.f59351f = i217;
                oVar.f59352g = i218;
                oVar.f59356k = 3;
            }
            return obj2;
        }
        if (i26 == 2) {
            i18 = oVar.f59352g;
            i17 = oVar.f59351f;
            j8 = oVar.f59353h;
            i16 = oVar.f59350e;
            i15 = oVar.f59349d;
            it3 = oVar.f59347b;
            eVar3 = oVar.f59346a;
            o13.r.b(obj);
            int i219 = i17;
            it4 = it3;
            int i2110 = i18;
            i19 = i15;
            oVar.f59346a = eVar3;
            oVar.f59347b = it4;
            oVar.f59348c = null;
            oVar.f59349d = i19;
            oVar.f59350e = i16;
            oVar.f59353h = j8;
            oVar.f59351f = i219;
            oVar.f59352g = i2110;
            oVar.f59356k = 3;
        } else {
            if (i26 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i19 = oVar.f59349d;
            it4 = oVar.f59347b;
            ge2.e eVar8 = oVar.f59346a;
            o13.r.b(obj);
            eVar3 = eVar8;
        }
        it = it4;
        i14 = i19;
        eVar2 = eVar3;
        if (it.hasNext()) {
            return g0.b.d.f59299a;
        }
        f172494b = ((DeviceProfile) it.next()).getF92746j();
        map = eVar2.f77022a;
        if (map != null) {
            aVar2 = map.get(new Long(f172494b));
        } else {
            aVar2 = null;
        }
        if (eVar5.c(f172494b)) {
        }
        i16 = 0;
        eVar3 = eVar2;
        aVar = aVar2;
        it3 = it;
        j8 = f172494b;
        i15 = i14;
        if (eVar5.b(j8)) {
            i17 = 0;
        } else {
            if (aVar != null) {
                bool3 = aVar.f77008b;
            } else {
                bool3 = null;
            }
            if (bool3 != null) {
                i17 = 1;
            } else {
                i17 = 0;
            }
        }
        if (aVar != null) {
            bool = aVar.f77009c;
        } else {
            bool = null;
        }
        if (bool == null) {
            i18 = 0;
        } else {
            if (aVar != null) {
                bool2 = aVar.f77010d;
            } else {
                bool2 = null;
            }
            if (bool2 != null) {
                i18 = 1;
            } else {
                i18 = 0;
            }
        }
        if (i17 == 0) {
            oVar.f59346a = eVar3;
            oVar.f59347b = it3;
            oVar.f59348c = null;
            oVar.f59349d = i15;
            oVar.f59350e = i16;
            oVar.f59353h = j8;
            oVar.f59351f = i17;
            oVar.f59352g = i18;
            oVar.f59356k = 2;
            if (n(j8, oVar) != obj2) {
                int i2111 = i17;
                it4 = it3;
                int i2112 = i18;
                i19 = i15;
                oVar.f59346a = eVar3;
                oVar.f59347b = it4;
                oVar.f59348c = null;
                oVar.f59349d = i19;
                oVar.f59350e = i16;
                oVar.f59353h = j8;
                oVar.f59351f = i2111;
                oVar.f59352g = i2112;
                oVar.f59356k = 3;
            }
        } else {
            oVar.f59346a = eVar3;
            oVar.f59347b = it3;
            oVar.f59348c = null;
            oVar.f59349d = i15;
            oVar.f59350e = i16;
            oVar.f59353h = j8;
            oVar.f59351f = i17;
            oVar.f59352g = i18;
            oVar.f59356k = 2;
            if (n(j8, oVar) != obj2) {
                int i2113 = i17;
                it4 = it3;
                int i2114 = i18;
                i19 = i15;
                oVar.f59346a = eVar3;
                oVar.f59347b = it4;
                oVar.f59348c = null;
                oVar.f59349d = i19;
                oVar.f59350e = i16;
                oVar.f59353h = j8;
                oVar.f59351f = i2113;
                oVar.f59352g = i2114;
                oVar.f59356k = 3;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(long j8, ge2.e eVar, v13.c cVar) {
        p pVar;
        Object next;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f59359c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f59359c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objL = pVar.f59357a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f59359c;
        if (i15 == 0) {
            o13.r.b(objL);
            Iterator it = da2.d.c(this.f59231d).f58886a.f111646e.e().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((DeviceProfile) next).getF92746j() != j8);
            if (((DeviceProfile) next) != null) {
                pVar.f59359c = 1;
                objL = l(j8, eVar, pVar);
                if (objL == obj) {
                    return obj;
                }
            }
            return g0.b.d.f59299a;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objL);
        return g0.b.d.f59299a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(long j8, GDILiveTrackProto.ShareMetaConfigurationNotification shareMetaConfigurationNotification, v13.c cVar) {
        q qVar;
        GDILiveTrackProto.LiveTrackService.Builder builder;
        Context context;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f59364e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f59364e = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object obj = qVar.f59362c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f59364e;
        if (i15 == 0) {
            o13.r.b(obj);
            GDILiveTrackProto.LiveTrackService.Builder builderNewBuilder = GDILiveTrackProto.LiveTrackService.newBuilder();
            builderNewBuilder.setShareMetaConfigNotification(shareMetaConfigurationNotification);
            Context context2 = this.f59231d;
            context2.getClass();
            qVar.f59360a = builderNewBuilder;
            qVar.f59361b = context2;
            qVar.f59364e = 1;
            Object objI = i(j8, qVar);
            if (objI == obj2) {
                return obj2;
            }
            builder = builderNewBuilder;
            obj = objI;
            context = context2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            context = qVar.f59361b;
            builder = qVar.f59360a;
            o13.r.b(obj);
        }
        GDILiveTrackProto.LiveTrackService liveTrackServiceBuild = builder.build();
        liveTrackServiceBuild.getClass();
        return a0.c(context, (String) obj, liveTrackServiceBuild);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:22:0x009a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object u(java.util.List r9, boolean r10, v13.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof de2.r
            if (r0 == 0) goto L13
            r0 = r11
            de2.r r0 = (de2.r) r0
            int r1 = r0.f59372h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59372h = r1
            goto L18
        L13:
            de2.r r0 = new de2.r
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f59370f
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f59372h
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            int r9 = r0.f59369e
            boolean r10 = r0.f59368d
            android.content.Context r2 = r0.f59367c
            java.util.Iterator r4 = r0.f59366b
            com.garmin.proto.generated.GDILiveTrackProto$LiveTrackService r5 = r0.f59365a
            o13.r.b(r11)
            goto L9a
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r9)
            r9 = 0
            return r9
        L38:
            o13.r.b(r11)
            com.garmin.proto.generated.GDILiveTrackProto$ShareSocialCredentialsNotification$Builder r11 = com.garmin.proto.generated.GDILiveTrackProto.ShareSocialCredentialsNotification.newBuilder()
            r11.setStravaBeaconConnected(r10)
            com.garmin.proto.generated.GDILiveTrackProto$LiveTrackService$Builder r2 = com.garmin.proto.generated.GDILiveTrackProto.LiveTrackService.newBuilder()
            r2.setShareSocialNotification(r11)
            com.garmin.proto.generated.GDILiveTrackProto$LiveTrackService r11 = r2.build()
            if (r9 == 0) goto La3
            java.util.Iterator r9 = r9.iterator()
            r2 = 0
            r4 = r9
            r5 = r11
            r9 = r2
        L57:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto La3
            java.lang.Object r11 = r4.next()
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating Strava sharing state for device "
            r11.<init>(r2)
            r11.append(r6)
            java.lang.String r2 = ", state = "
            r11.append(r2)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            org.slf4j.Logger r2 = r8.f59230c
            r2.debug(r11)
            android.content.Context r2 = r8.f59231d
            r2.getClass()
            r0.f59365a = r5
            r0.f59366b = r4
            r0.f59367c = r2
            r0.f59368d = r10
            r0.f59369e = r9
            r0.f59372h = r3
            java.lang.Object r11 = r8.i(r6, r0)
            if (r11 != r1) goto L9a
            return r1
        L9a:
            java.lang.String r11 = (java.lang.String) r11
            r5.getClass()
            de2.a0.c(r2, r11, r5)
            goto L57
        La3:
            kotlin.Unit r9 = p005kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: de2.a.u(java.util.List, boolean, v13.c):java.lang.Object");
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj instanceof ae2.u) {
            ae2.u uVar = (ae2.u) obj;
            if (uVar.f2996b instanceof ae2.v.a) {
                StringBuilder sb3 = new StringBuilder("device listener ");
                e23.q<g0.a, Long, Boolean, Unit> qVar = this.f59229b;
                sb3.append(qVar);
                sb3.append(" invoked with arg ");
                sb3.append(obj);
                this.f59230c.debug(sb3.toString());
                Long l14 = uVar.f2995a;
                long jLongValue = l14 != null ? l14.longValue() : -1L;
                if (jLongValue == -1 || qVar == null) {
                    return;
                }
                qVar.invoke(g0.a.d.f59295a, Long.valueOf(jLongValue), Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: de2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lde2/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1265a {
        public /* synthetic */ C1265a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1265a() {
        }
    }
}
