package de2;

import bs2.aq;
import bs2.bb;
import bs2.cb;
import bs2.ck;
import bs2.fs;
import bs2.gs;
import bs2.id;
import bs2.jd;
import bs2.pv;
import bs2.qv;
import bs2.t;
import bs2.ti;
import bs2.ui;
import bs2.zp;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.util.Set;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.a1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000b\f\rB!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lde2/b0;", "Lbt2/b;", "Lrs2/w;", "Lde2/b0$a;", "callback", "Lzs2/k;", "fitListener", "Lt13/g;", "coroutineContext", "<init>", "(Lde2/b0$a;Lzs2/k;Lt13/g;)V", "c", "b", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 implements bt2.b, rs2.w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SupportedCapability f59250h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f59251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zs2.k f59252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u53.d f59253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Logger f59254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public rs2.v f59255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public rs2.c f59256g;

    public interface a {
        void a(rs2.c cVar);

        void b(rs2.c cVar);

        void c(rs2.c cVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lde2/b0$c;", "", "<init>", "(Ljava/lang/String;I)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        OK,
        FAILED
    }

    static {
        new b(null);
        f59250h = SupportedCapability.LIVETRACK;
    }

    public b0(a aVar, zs2.k kVar, t13.g gVar) {
        aVar.getClass();
        kVar.getClass();
        gVar.getClass();
        this.f59251b = aVar;
        this.f59252c = kVar;
        this.f59253d = zl.a.e("LiveTrackDataHandler", gVar.plus(ge1.b.h()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(ae2.a aVar, v13.c cVar) {
        c0 c0Var;
        String str;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f59264c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f59264c = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object objB = c0Var.f59262a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f59264c;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                switch (aVar.f2803a) {
                    case 1:
                        str = "General Failure";
                        break;
                    case 2:
                        str = "Tracking request processing";
                        break;
                    case 3:
                        str = "Tracking not from selected device";
                        break;
                    case 4:
                        str = "Tracking already started";
                        break;
                    case 5:
                        str = "Network unavailable";
                        break;
                    case 6:
                        str = "Sharing failure";
                        break;
                    default:
                        str = "Unknown error";
                        break;
                }
                Logger logger = this.f59254e;
                if (logger == null) {
                    p005kotlin.jvm.internal.s.m("logger");
                    throw null;
                }
                logger.debug("sendAutoStartTrackingFailure: reasonCode[" + aVar + " - " + str + "]");
                rs2.v vVar = this.f59255f;
                if (vVar == null) {
                    p005kotlin.jvm.internal.s.m("messenger");
                    throw null;
                }
                byte[] bArr = {(byte) (aVar.f2803a & 255)};
                c0Var.f59264c = 1;
                objB = vVar.b(5048, bArr, c0Var);
                if (objB == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB);
            }
            return c.OK;
        } catch (Exception unused) {
            return c.FAILED;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bf A[Catch: Exception -> 0x00c4, TryCatch #1 {Exception -> 0x00c4, blocks: (B:28:0x00b7, B:30:0x00bf, B:34:0x00c8, B:38:0x00d2, B:39:0x00d5, B:48:0x00ef, B:50:0x00f3, B:51:0x011d, B:52:0x0120, B:25:0x00a8, B:55:0x0125, B:56:0x012c), top: B:68:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3 A[Catch: Exception -> 0x00c4, TryCatch #1 {Exception -> 0x00c4, blocks: (B:28:0x00b7, B:30:0x00bf, B:34:0x00c8, B:38:0x00d2, B:39:0x00d5, B:48:0x00ef, B:50:0x00f3, B:51:0x011d, B:52:0x0120, B:25:0x00a8, B:55:0x0125, B:56:0x012c), top: B:68:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x011d A[Catch: Exception -> 0x00c4, TryCatch #1 {Exception -> 0x00c4, blocks: (B:28:0x00b7, B:30:0x00bf, B:34:0x00c8, B:38:0x00d2, B:39:0x00d5, B:48:0x00ef, B:50:0x00f3, B:51:0x011d, B:52:0x0120, B:25:0x00a8, B:55:0x0125, B:56:0x012c), top: B:68:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0153  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00f3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x0131, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(long j8, e eVar, v13.c cVar) {
        e0 e0Var;
        e eVar2;
        String str;
        Logger logger;
        e eVar3;
        String str2;
        Byte bF;
        byte bByteValue;
        boolean z14;
        String str3;
        Logger logger2;
        long j14 = j8;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i14 = e0Var.f59280e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e0Var.f59280e = i14 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(this, cVar);
            }
        } else {
            e0Var = new e0(this, cVar);
        }
        Object objB = e0Var.f59278c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e0Var.f59280e;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                Logger logger3 = this.f59254e;
                if (logger3 == null) {
                    p005kotlin.jvm.internal.s.m("logger");
                    throw null;
                }
                logger3.debug("remoteDeviceStartLiveTrack: startTime[" + j14 + "]");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(10);
                byteArrayOutputStream.write(0);
                byteArrayOutputStream.write(2);
                byteArrayOutputStream.write(0);
                String str4 = "logger";
                byteArrayOutputStream.write((int) (j14 & 255));
                byteArrayOutputStream.write((int) ((j14 >> 8) & 255));
                byteArrayOutputStream.write((int) ((j14 >> 16) & 255));
                byteArrayOutputStream.write((int) ((j14 >> 24) & 255));
                try {
                    rs2.v vVar = this.f59255f;
                    if (vVar == null) {
                        p005kotlin.jvm.internal.s.m("messenger");
                        throw null;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    eVar3 = eVar;
                    e0Var.f59277b = eVar3;
                    e0Var.f59276a = j14;
                    e0Var.f59280e = 1;
                    objB = vVar.b(5016, byteArray, e0Var);
                    str2 = str4;
                    if (objB == aVar) {
                        return aVar;
                    }
                    bF = p13.u.F((byte[]) objB);
                    if (bF != null) {
                        bByteValue = bF.byteValue();
                    } else {
                        bByteValue = 0;
                    }
                    if (((byte) (bByteValue & UnsignedBytes.MAX_POWER_OF_TWO)) == -128) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    switch ((byte) (bByteValue & 7)) {
                        case 0:
                            str3 = "Success";
                            break;
                        case 1:
                            str3 = "Live tracking not supported";
                            break;
                        case 2:
                            str3 = "Live tracking is disabled";
                            break;
                        case 3:
                            str3 = "Live tracking data format is not supported";
                            break;
                        case 4:
                            str3 = "Transfer rate not supported";
                            break;
                        case 5:
                            str3 = "Sample rate not supported";
                            break;
                        case 6:
                            str3 = "Not ready";
                            break;
                        default:
                            str3 = "Unknown error";
                            break;
                    }
                    logger2 = this.f59254e;
                    if (logger2 != null) {
                        p005kotlin.jvm.internal.s.m(str2);
                        throw null;
                    }
                    logger2.debug("remoteDeviceStartLiveTrack response: status[" + ((int) bByteValue) + " - " + str3 + "]");
                    wr.g.y("startLiveTrack: onMessageAcknowledged isDataAvailable ", z14, eVar3.f59274a.f59230c);
                    eVar3.f59275b.f105804a = true;
                } catch (Exception e4) {
                    e = e4;
                    eVar2 = eVar;
                    str = str4;
                    logger = this.f59254e;
                    if (logger != null) {
                        p005kotlin.jvm.internal.s.m(str);
                        throw null;
                    }
                    logger.error("Failed to send start live track: format=0, transferRate=10, sampleRate=2, startTime=" + j14, (Throwable) e);
                    eVar2.f59274a.f59230c.debug("startLiveTrack: onFailedToSendMessage");
                    eVar2.f59275b.f105804a = false;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j14 = e0Var.f59276a;
                e eVar4 = e0Var.f59277b;
                try {
                    o13.r.b(objB);
                    str2 = "logger";
                    eVar3 = eVar4;
                    bF = p13.u.F((byte[]) objB);
                    if (bF != null) {
                        bByteValue = bF.byteValue();
                    } else {
                        bByteValue = 0;
                    }
                    if (((byte) (bByteValue & UnsignedBytes.MAX_POWER_OF_TWO)) == -128) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    switch ((byte) (bByteValue & 7)) {
                        case 0:
                            str3 = "Success";
                            break;
                        case 1:
                            str3 = "Live tracking not supported";
                            break;
                        case 2:
                            str3 = "Live tracking is disabled";
                            break;
                        case 3:
                            str3 = "Live tracking data format is not supported";
                            break;
                        case 4:
                            str3 = "Transfer rate not supported";
                            break;
                        case 5:
                            str3 = "Sample rate not supported";
                            break;
                        case 6:
                            str3 = "Not ready";
                            break;
                        default:
                            str3 = "Unknown error";
                            break;
                    }
                    logger2 = this.f59254e;
                    if (logger2 != null) {
                        p005kotlin.jvm.internal.s.m(str2);
                        throw null;
                    }
                    logger2.debug("remoteDeviceStartLiveTrack response: status[" + ((int) bByteValue) + " - " + str3 + "]");
                    wr.g.y("startLiveTrack: onMessageAcknowledged isDataAvailable ", z14, eVar3.f59274a.f59230c);
                    eVar3.f59275b.f105804a = true;
                } catch (Exception e14) {
                    e = e14;
                    str = "logger";
                    eVar2 = eVar4;
                    logger = this.f59254e;
                    if (logger != null) {
                        p005kotlin.jvm.internal.s.m(str);
                        throw null;
                    }
                    logger.error("Failed to send start live track: format=0, transferRate=10, sampleRate=2, startTime=" + j14, (Throwable) e);
                    eVar2.f59274a.f59230c.debug("startLiveTrack: onFailedToSendMessage");
                    eVar2.f59275b.f105804a = false;
                }
            }
        } catch (Exception e15) {
            e = e15;
            str = i15;
            eVar2 = "logger";
        }
        return Unit.INSTANCE;
    }

    @Override // rs2.h
    public final void close(String str) {
        str.getClass();
        o53.c0.d(this.f59253d, "LiveTrackDataHandler closed");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum e(v13.c cVar) {
        f0 f0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f59286c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f59286c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object obj = f0Var.f59284a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f59286c;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                Logger logger = this.f59254e;
                if (logger == null) {
                    p005kotlin.jvm.internal.s.m("logger");
                    throw null;
                }
                logger.debug("sendStopTrackingRequest");
                rs2.v vVar = this.f59255f;
                if (vVar == null) {
                    p005kotlin.jvm.internal.s.m("messenger");
                    throw null;
                }
                f0Var.f59286c = 1;
                if (vVar.b(5025, new byte[0], f0Var) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return c.OK;
        } catch (Exception unused) {
            return c.FAILED;
        }
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return a1.b(Integer.valueOf(f59250h.ordinal()));
    }

    @Override // bt2.b
    public final void m(zs2.h hVar) {
        hVar.getClass();
        final zs2.k kVar = this.f59252c;
        kVar.getClass();
        ck ckVar = hVar.f206896d;
        ckVar.S0.add(new aq() { // from class: zs2.a
            @Override // bs2.aq
            public final void a(zp zpVar) {
                kVar.g(zpVar);
            }
        });
        ckVar.N0.add(new bs2.u() { // from class: zs2.b
            @Override // bs2.u
            public final void a(t tVar) {
                kVar.b(tVar);
            }
        });
        ckVar.P0.add(new gs() { // from class: zs2.c
            @Override // bs2.gs
            public final void a(fs fsVar) {
                kVar.d(fsVar);
            }
        });
        ckVar.Q0.add(new ui() { // from class: zs2.d
            @Override // bs2.ui
            public final void a(ti tiVar) {
                kVar.e(tiVar);
            }
        });
        ckVar.U0.add(new cb() { // from class: zs2.e
            @Override // bs2.cb
            public final void a(bb bbVar) {
                kVar.c(bbVar);
            }
        });
        ckVar.f19832f.add(new jd() { // from class: zs2.f
            @Override // bs2.jd
            public final void a(id idVar) {
                kVar.a(idVar);
            }
        });
        ckVar.f19833f0.add(new qv() { // from class: zs2.g
            @Override // bs2.qv
            public final void a(pv pvVar) {
                kVar.f(pvVar);
            }
        });
    }

    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, rs2.x xVar) {
        bArr.getClass();
        a aVar = this.f59251b;
        if (i14 == 5025) {
            Logger logger = this.f59254e;
            if (logger == null) {
                p005kotlin.jvm.internal.s.m("logger");
                throw null;
            }
            logger.trace("Stop live track requested");
            try {
                rs2.c cVar = this.f59256g;
                if (cVar != null) {
                    aVar.a(cVar);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
            } catch (Exception e4) {
                Logger logger2 = this.f59254e;
                if (logger2 != null) {
                    logger2.error("onStopLiveTrackRequestReceived callback failed", (Throwable) e4);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("logger");
                    throw null;
                }
            }
        }
        u53.d dVar = this.f59253d;
        if (i14 == 5046) {
            Logger logger3 = this.f59254e;
            if (logger3 == null) {
                p005kotlin.jvm.internal.s.m("logger");
                throw null;
            }
            logger3.trace("Auto start live track requested");
            try {
                rs2.c cVar2 = this.f59256g;
                if (cVar2 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                aVar.c(cVar2);
                ge1.b.T(dVar, null, null, new d0(this, "Auto Start Tracking", (us2.e.a) xVar, null), 3);
            } catch (Exception e14) {
                Logger logger4 = this.f59254e;
                if (logger4 == null) {
                    p005kotlin.jvm.internal.s.m("logger");
                    throw null;
                }
                logger4.error("onStartLiveTrackRequestReceived callback failed", (Throwable) e14);
            }
        } else {
            if (i14 != 5047) {
                return;
            }
            Logger logger5 = this.f59254e;
            if (logger5 == null) {
                p005kotlin.jvm.internal.s.m("logger");
                throw null;
            }
            logger5.trace("Cancel auto start live track requested");
            try {
                rs2.c cVar3 = this.f59256g;
                if (cVar3 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                aVar.b(cVar3);
                ge1.b.T(dVar, null, null, new d0(this, "Cancel Auto Start Live Track", (us2.e.a) xVar, null), 3);
            } catch (Exception e15) {
                Logger logger6 = this.f59254e;
                if (logger6 == null) {
                    p005kotlin.jvm.internal.s.m("logger");
                    throw null;
                }
                logger6.error("onCancelStartLiveTrackRequestReceived callback failed", (Throwable) e15);
            }
        }
    }

    @Override // rs2.h
    public final void start(rs2.c cVar, rs2.v vVar) {
        cVar.getClass();
        vVar.getClass();
        String strB = oa2.d.b("LT#", "LiveTrackDataHandler", ((us2.f) cVar).f172493a, -1L, this);
        int i14 = gt2.c.f79010a;
        this.f59254e = gt2.b.f79005a.h(strB);
        this.f59255f = vVar;
        this.f59256g = cVar;
        us2.b bVar = (us2.b) vVar;
        bVar.d(5025, this);
        bVar.d(5046, this);
        bVar.d(5047, this);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lde2/b0$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lcom/garmin/android/gfdi/configuration/SupportedCapability;", "SUPPORTED_CAPABILITY", "Lcom/garmin/android/gfdi/configuration/SupportedCapability;", "", "START_TRACKING_MESSAGE_ID", "I", "STOP_TRACKING_MESSAGE_ID", "AUTO_START_TRACKING_MESSAGE_ID", "CANCEL_AUTO_START_TRACKING_MESSAGE_ID", "AUTO_START_TRACKING_FAILURE_MESSAGE_ID", "ACTION_ON_STOP_LIVE_TRACK_REQUEST_RECEIVED", "ACTION_ON_START_LIVE_TRACK_REQUEST_RECEIVED", "ACTION_ON_CANCEL_START_LIVE_TRACK_REQUEST_RECEIVED", "DEFAULT_TRANSFER_RATE", "DEFAULT_SAMPLE_RATE", "", "DEFAULT_START_TIME", "J", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public b0(a aVar, zs2.k kVar, t13.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, kVar, (i14 & 4) != 0 ? s0.f129406a : gVar);
    }
}
