package vs2;

import com.garmin.gfdi.GfdiException;
import com.garmin.gfdi.ResponseStatusException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import kotlinx.coroutines.TimeoutCancellationException;
import o13.p;
import o13.r;
import o53.c0;
import o53.j2;
import o53.s;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeZone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.a1;
import r1.q2;
import rs2.v;
import rs2.w;
import rs2.x;
import rs2.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lvs2/a;", "Lrs2/h;", "Lrs2/w;", "<init>", "()V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements rs2.h, w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Logger f179928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f179929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rs2.c f179930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u53.d f179931e = q2.l("CurrentTimeManager");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f179932f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f179933g;

    static {
        new C3357a(null);
    }

    public static p a(long j8, TimeZone timeZone) {
        DateTimeZone dateTimeZoneForTimeZone;
        long jNextTransition;
        long jNextTransition2;
        Logger logger = ft2.a.f73453a;
        try {
            dateTimeZoneForTimeZone = DateTimeZone.forTimeZone(timeZone);
        } catch (IllegalArgumentException e4) {
            logger.debug(e4.getMessage());
            String[] availableIDs = TimeZone.getAvailableIDs(timeZone.getRawOffset());
            Date date = new Date();
            int length = availableIDs.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    SimpleTimeZone simpleTimeZone = new SimpleTimeZone(timeZone.getRawOffset(), String.format(Locale.ROOT, "GMT%c%02d:%02d", Character.valueOf(timeZone.getRawOffset() >= 0 ? '+' : '-'), Integer.valueOf(Math.abs(timeZone.getRawOffset()) / DateTimeConstants.MILLIS_PER_HOUR), Integer.valueOf((Math.abs(timeZone.getRawOffset()) / DateTimeConstants.MILLIS_PER_MINUTE) % 60)));
                    logger.warn("No alternate time zone found. Use simple time zone (no DST) instead: " + simpleTimeZone.getID());
                    dateTimeZoneForTimeZone = DateTimeZone.forTimeZone(simpleTimeZone);
                    break;
                }
                TimeZone timeZone2 = TimeZone.getTimeZone(availableIDs[i14]);
                if (timeZone2.hasSameRules(timeZone) && timeZone.inDaylightTime(date) == timeZone2.inDaylightTime(date)) {
                    try {
                        DateTimeZone dateTimeZoneForTimeZone2 = DateTimeZone.forTimeZone(timeZone2);
                        logger.debug("Use alternate time zone: " + timeZone2.getID());
                        dateTimeZoneForTimeZone = dateTimeZoneForTimeZone2;
                        break;
                    } catch (IllegalArgumentException unused) {
                        continue;
                        i14++;
                    }
                }
                i14++;
            }
        }
        long jNextTransition3 = dateTimeZoneForTimeZone.nextTransition(j8);
        if (j8 != jNextTransition3) {
            if (timeZone.inDaylightTime(new Date(jNextTransition3))) {
                long j14 = 1000;
                long j15 = 631065600;
                jNextTransition2 = (jNextTransition3 / j14) - j15;
                jNextTransition = (dateTimeZoneForTimeZone.nextTransition(jNextTransition3 + 86400000) / j14) - j15;
            } else {
                long j16 = 1000;
                long j17 = 631065600;
                jNextTransition2 = (dateTimeZoneForTimeZone.nextTransition(jNextTransition3 + 86400000) / j16) - j17;
                jNextTransition = (jNextTransition3 / j16) - j17;
            }
            long j18 = d.f179939a;
            if (j18 != -1) {
                if (d.f179940b) {
                    jNextTransition2 = (j18 / ((long) 1000)) - ((long) 631065600);
                } else {
                    jNextTransition = (j18 / ((long) 1000)) - ((long) 631065600);
                }
            }
        } else {
            jNextTransition = 0;
            jNextTransition2 = 0;
        }
        return new p(Long.valueOf(jNextTransition2), Long.valueOf(jNextTransition));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #3 {all -> 0x0095, blocks: (B:41:0x008a, B:43:0x008e, B:48:0x0097), top: B:100:0x008a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x0176  */
    /* JADX WARN: Code duplicated, block: B:86:0x017a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0182  */
    /* JADX WARN: Code duplicated, block: B:90:0x0188  */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015e, code lost:
    
        if (r0 == r3) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(v13.c cVar) throws Throwable {
        b bVar;
        Throwable th3;
        s sVarB;
        c cVar2;
        Logger logger;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f179936c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f179936c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objB = bVar.f179934a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f179936c;
        try {
            try {
                if (i15 != 0) {
                    if (i15 == 1) {
                        r.b(objB);
                        synchronized (this.f179932f) {
                            try {
                                sVarB = this.f179933g;
                                if (sVarB != null || !sVarB.isActive()) {
                                    sVarB = gl.b.b();
                                    this.f179933g = sVarB;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        cVar2 = new c(sVarB, null);
                        bVar.f179936c = 2;
                        if (j2.b(5000L, cVar2, bVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            try {
                                r.b(objB);
                                return Unit.INSTANCE;
                            } catch (ResponseStatusException e4) {
                                e = e4;
                                th3 = null;
                                if (e.getStatus() == y.UNKNOWN_OR_NOT_SUPPORTED) {
                                    throw new GfdiException("Failed to send time settings", e);
                                }
                                logger = this.f179928b;
                                if (logger != null) {
                                    logger.debug("Device does not support synchronizing time.");
                                    return Unit.INSTANCE;
                                }
                                p005kotlin.jvm.internal.s.m("logger");
                                throw th3;
                            }
                        }
                        r.b(objB);
                    }
                    return Unit.INSTANCE;
                }
                r.b(objB);
                rs2.c cVar3 = this.f179930d;
                if (cVar3 == null) {
                    p005kotlin.jvm.internal.s.m("deviceInfo");
                    throw null;
                }
                if (cVar3.getConfigurationFlags().contains(new Integer(71))) {
                    v vVar = this.f179929c;
                    if (vVar == null) {
                        p005kotlin.jvm.internal.s.m("messenger");
                        throw null;
                    }
                    byte[] bArr = {k.TIME_UPDATED.f179981a, 0};
                    bVar.f179936c = 1;
                    if (vVar.b(5030, bArr, bVar) != aVar) {
                        synchronized (this.f179932f) {
                            sVarB = this.f179933g;
                            if (sVarB != null) {
                                sVarB = gl.b.b();
                                this.f179933g = sVarB;
                            } else {
                                sVarB = gl.b.b();
                                this.f179933g = sVarB;
                            }
                            cVar2 = new c(sVarB, null);
                            bVar.f179936c = 2;
                            if (j2.b(5000L, cVar2, bVar) == aVar) {
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write(5);
                    TimeZone timeZone = TimeZone.getDefault();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    byteArrayOutputStream.write(1);
                    byteArrayOutputStream.write(4);
                    th3 = null;
                    lg.d.Q(byteArrayOutputStream, (jCurrentTimeMillis / ((long) 1000)) - ((long) 631065600));
                    int dSTSavings = timeZone.inDaylightTime(new Date(jCurrentTimeMillis)) ? timeZone.getDSTSavings() / 1000 : 0;
                    byteArrayOutputStream.write(2);
                    byteArrayOutputStream.write(4);
                    lg.d.Q(byteArrayOutputStream, dSTSavings);
                    byteArrayOutputStream.write(3);
                    byteArrayOutputStream.write(4);
                    lg.d.Q(byteArrayOutputStream, timeZone.getOffset(jCurrentTimeMillis) / 1000);
                    p pVarA = a(jCurrentTimeMillis, timeZone);
                    long jLongValue = ((Number) pVarA.f128594a).longValue();
                    long jLongValue2 = ((Number) pVarA.f128595b).longValue();
                    byteArrayOutputStream.write(4);
                    byteArrayOutputStream.write(4);
                    lg.d.Q(byteArrayOutputStream, jLongValue);
                    byteArrayOutputStream.write(5);
                    byteArrayOutputStream.write(4);
                    lg.d.Q(byteArrayOutputStream, jLongValue2);
                    try {
                        v vVar2 = this.f179929c;
                        if (vVar2 == null) {
                            p005kotlin.jvm.internal.s.m("messenger");
                            throw null;
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArray.getClass();
                        bVar.f179936c = 3;
                        objB = vVar2.b(5026, byteArray, bVar);
                    } catch (ResponseStatusException e14) {
                        e = e14;
                        if (e.getStatus() == y.UNKNOWN_OR_NOT_SUPPORTED) {
                            throw new GfdiException("Failed to send time settings", e);
                        }
                        logger = this.f179928b;
                        if (logger != null) {
                            logger.debug("Device does not support synchronizing time.");
                            return Unit.INSTANCE;
                        }
                        p005kotlin.jvm.internal.s.m("logger");
                        throw th3;
                    }
                }
                return aVar;
            } catch (IOException e15) {
                throw new GfdiException("Failed to send time settings", e15);
            }
        } catch (ResponseStatusException e16) {
            throw new GfdiException("Failed to send time updated system event", e16);
        } catch (IOException e17) {
            throw new GfdiException("Failed to send time updated system event", e17);
        } catch (TimeoutCancellationException e18) {
            throw new GfdiException("Timed out waiting for device to request time", e18);
        }
    }

    @Override // rs2.h
    public final void close(String str) {
        s sVar;
        str.getClass();
        synchronized (this.f179932f) {
            sVar = this.f179933g;
            this.f179933g = null;
            Unit unit = Unit.INSTANCE;
        }
        if (sVar != null) {
            sVar.O(new GfdiException("Connection closed", null, 2, null));
        }
        c0.d(this.f179931e, "CurrentTimeManager closed");
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return a1.b(71);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, x xVar) {
        s sVar;
        bArr.getClass();
        if (bArr.length < 4) {
            Logger logger = this.f179928b;
            if (logger == null) {
                p005kotlin.jvm.internal.s.m("logger");
                throw null;
            }
            logger.warn("Invalid current time payload");
            ft2.d.a(xVar, this.f179931e, y.LENGTH_ERROR, new byte[0]);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        TimeZone timeZone = TimeZone.getDefault();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(20);
        byteArrayOutputStream.write(bArr, 0, 4);
        lg.d.Q(byteArrayOutputStream, (jCurrentTimeMillis / ((long) 1000)) - ((long) 631065600));
        timeZone.getClass();
        lg.d.Q(byteArrayOutputStream, timeZone.getOffset(jCurrentTimeMillis) / 1000);
        p pVarA = a(jCurrentTimeMillis, timeZone);
        long jLongValue = ((Number) pVarA.f128594a).longValue();
        long jLongValue2 = ((Number) pVarA.f128595b).longValue();
        lg.d.Q(byteArrayOutputStream, jLongValue);
        lg.d.Q(byteArrayOutputStream, jLongValue2);
        u53.d dVar = this.f179931e;
        y yVar = y.ACK;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        ft2.d.a(xVar, dVar, yVar, byteArray);
        synchronized (this.f179932f) {
            sVar = this.f179933g;
            this.f179933g = null;
            Unit unit = Unit.INSTANCE;
        }
        if (sVar != null) {
            sVar.g0(Unit.INSTANCE);
        }
    }

    @Override // rs2.h
    public final void start(rs2.c cVar, v vVar) {
        cVar.getClass();
        vVar.getClass();
        rs2.d dVar = rs2.d.f154380a;
        String str = ((us2.f) cVar).f172493a;
        dVar.getClass();
        this.f179928b = LoggerFactory.getLogger(rs2.d.a("CurrentTimeManager", -1L, this, str));
        this.f179929c = vVar;
        this.f179930d = cVar;
        ((us2.b) vVar).d(5052, this);
    }

    /* JADX INFO: renamed from: vs2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lvs2/a$a;", "", "<init>", "()V", "", "EPOCH_DIFF_DAYS", "I", "EPOCH_DIFF_SECONDS", "", "ONE_DAY_MILLIS", "J", "SYNC_TIME_TIMEOUT", "CURRENT_TIME", "DAYLIGHT_SAVINGS_TIME_OFFSET", "TIME_ZONE_OFFSET", "NEXT_DAYLIGHT_SAVINGS_START", "NEXT_DAYLIGHT_SAVINGS_END", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3357a {
        public /* synthetic */ C3357a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3357a() {
        }
    }
}
