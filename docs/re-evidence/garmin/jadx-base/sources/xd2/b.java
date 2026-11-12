package xd2;

import com.garmin.android.library.livetrack.data.typeadapters.PeriodAdapter;
import fe2.k1;
import fe2.l1;
import fe2.m1;
import fe2.n1;
import fe2.s1;
import fe2.y1;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import wd2.i2;
import wd2.o1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lxd2/b;", "Lxd2/a1;", "Lxd2/z0;", "gcsDataSource", "Lxd2/f1;", "localPersistedDataSource", "Lxd2/y0;", "deviceInfoSource", "Lwd2/l;", "appDelegate", "Lo13/l;", "Lwd2/o1;", "mobcoreApi", "<init>", "(Lxd2/z0;Lxd2/f1;Lxd2/y0;Lwd2/l;Lo13/l;)V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements a1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f190044j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f190045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1 f190046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f190047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wd2.l f190048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f190049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o13.l f190050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.lifecycle.y0<ge2.e> f190051i;

    /* JADX INFO: renamed from: xd2.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C3544b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f190052a;

        static {
            int[] iArr = new int[ge2.c.values().length];
            try {
                iArr[ge2.c.ProfilePrivacy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ge2.c.ActiveSessionPrivacy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f190052a = iArr;
        }
    }

    static {
        new a(null);
    }

    public b(z0 z0Var, f1 f1Var, y0 y0Var, wd2.l lVar, o13.l<? extends o1> lVar2) {
        z0Var.getClass();
        f1Var.getClass();
        y0Var.getClass();
        lVar.getClass();
        lVar2.getClass();
        this.f190045c = z0Var;
        this.f190046d = f1Var;
        this.f190047e = y0Var;
        this.f190048f = lVar;
        this.f190049g = i2.a("DefaultLivetrackRepository");
        this.f190050h = lVar2;
        this.f190051i = new androidx.lifecycle.y0<>();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Serializable J(b bVar, long j8, t13.d dVar) {
        o oVar;
        bVar.getClass();
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i14 = oVar.f190273c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f190273c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(bVar, dVar);
            }
        } else {
            oVar = new o(bVar, dVar);
        }
        Object objB = oVar.f190271a;
        Object objE = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f190273c;
        if (i15 == 0) {
            o13.r.b(objB);
            y0 y0Var = bVar.f190047e;
            oVar.f190273c = 1;
            objB = y0Var.b(j8, oVar);
            if (objB != objE) {
            }
            return (Serializable) objE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objB);
        wd2.h hVar = (wd2.h) objB;
        if (hVar != null) {
            objE = p13.u0.e(new o13.p("X-Garmin-Unit-ID", String.valueOf(hVar.f184483a)), new o13.p("X-Garmin-SW-Part-Number", hVar.f184485c), new o13.p("X-Garmin-Firmware-Version", hVar.f184484b));
        } else {
            objE = p13.k0.f134949a;
            objE.getClass();
        }
        return (Serializable) objE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // xd2.a1
    public final Object A(ae2.e0 e0Var, long j8, String str, DateTime dateTime, int i14, v13.c cVar) throws Throwable {
        c cVar2;
        long j14;
        int i15;
        String str2;
        ae2.e0 e0Var2;
        DateTime dateTime2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i16 = cVar2.f190065h;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                cVar2.f190065h = i16 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        c cVar3 = cVar2;
        Object obj = cVar3.f190063f;
        Serializable serializable = u13.a.COROUTINE_SUSPENDED;
        int i17 = cVar3.f190065h;
        if (i17 == 0) {
            o13.r.b(obj);
            cVar3.f190058a = e0Var;
            cVar3.f190059b = str;
            cVar3.f190060c = dateTime;
            cVar3.f190061d = j8;
            cVar3.f190062e = i14;
            cVar3.f190065h = 1;
            Serializable serializableG = g(j8, cVar3);
            if (serializableG != serializable) {
                j14 = j8;
                i15 = i14;
                str2 = str;
                e0Var2 = e0Var;
                obj = serializableG;
                dateTime2 = dateTime;
            }
        }
        if (i17 != 1) {
            if (i17 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i15 = cVar3.f190062e;
        long j15 = cVar3.f190061d;
        dateTime2 = cVar3.f190060c;
        String str3 = cVar3.f190059b;
        ae2.e0 e0Var3 = cVar3.f190058a;
        o13.r.b(obj);
        j14 = j15;
        e0Var2 = e0Var3;
        str2 = str3;
        long j16 = j14;
        Period period = (Period) obj;
        x53.c cVar4 = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        d dVar = new d(this, i15, str2, e0Var2, dateTime2, period, j16, null);
        cVar3.f190058a = null;
        cVar3.f190059b = null;
        cVar3.f190060c = null;
        cVar3.f190061d = j16;
        cVar3.f190062e = i15;
        cVar3.f190065h = 2;
        Object objE0 = ge1.b.e0(bVar, dVar, cVar3);
        return objE0 == serializable ? serializable : objE0;
    }

    @Override // xd2.a1
    public final Object B(String str, long j8, long j14, m1 m1Var) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new r(this, j14, str, j8, null), m1Var);
    }

    @Override // xd2.a1
    public final Object C(long j8, s1 s1Var, n1 n1Var) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new d0(this, j8, s1Var, null), n1Var);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // xd2.a1
    public final Object D(long j8, ge2.a aVar, v13.c cVar) {
        f0 f0Var;
        ge2.a aVar2;
        Object objK;
        long j14;
        be2.f fVar;
        be2.f fVar2;
        Map<Long, be2.f.a> map;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f190148f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f190148f = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object obj = f0Var.f190146d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f190148f;
        Logger logger = this.f190049g;
        if (i15 == 0) {
            o13.r.b(obj);
            aVar2 = aVar;
            f0Var.f190144b = aVar2;
            f0Var.f190143a = j8;
            f0Var.f190148f = 1;
            objK = K(f0Var);
            if (objK != obj2) {
                j14 = j8;
            }
            return obj2;
        }
        if (i15 == 1) {
            j14 = f0Var.f190143a;
            ge2.a aVar3 = f0Var.f190144b;
            o13.r.b(obj);
            objK = obj;
            aVar2 = aVar3;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar2 = f0Var.f190145c;
            o13.r.b(obj);
        }
        map = fVar2.f17751a;
        if (map != null) {
            logger.debug("Saving DeviceSettingsDTO to local persistence");
            this.f190046d.k(map);
        }
        fVar = fVar2;
        this.f190051i.j(xd2.a.d(fVar));
        return Boolean.TRUE;
        be2.f fVar3 = (be2.f) objK;
        Map<Long, be2.f.a> map2 = fVar3 != null ? fVar3.f17751a : null;
        be2.f.a aVar4 = map2 != null ? map2.get(new Long(j14)) : null;
        Boolean bool = aVar2.f77007a;
        if (bool == null) {
            bool = aVar4 != null ? aVar4.f17759a : null;
        }
        Boolean bool2 = aVar2.f77008b;
        if (bool2 == null) {
            bool2 = aVar4 != null ? aVar4.f17760b : null;
        }
        Boolean bool3 = aVar2.f77009c;
        if (bool3 == null) {
            bool3 = aVar4 != null ? aVar4.f17761c : null;
        }
        Boolean bool4 = aVar2.f77010d;
        if (bool4 == null) {
            bool4 = aVar4 != null ? aVar4.f17762d : null;
        }
        be2.f.a aVar5 = new be2.f.a(bool, bool2, bool3, bool4);
        LinkedHashMap linkedHashMap = map2 != null ? new LinkedHashMap(map2) : new LinkedHashMap();
        linkedHashMap.put(new Long(j14), aVar5);
        if (fVar3 != null) {
            fVar = be2.f.a(fVar3, linkedHashMap, null, 126);
        } else {
            fVar = new be2.f(null, null, null, null, null, null, null, 127, null);
        }
        if (!fVar.equals(fVar3)) {
            f0Var.f190144b = null;
            f0Var.f190145c = fVar;
            f0Var.f190143a = j14;
            f0Var.f190148f = 2;
            if (L(fVar, f0Var) != obj2) {
                fVar2 = fVar;
                map = fVar2.f17751a;
                if (map != null) {
                    logger.debug("Saving DeviceSettingsDTO to local persistence");
                    this.f190046d.k(map);
                }
                fVar = fVar2;
            }
            return obj2;
        }
        logger.debug("Nothing to update, settings are the same.");
        this.f190051i.j(xd2.a.d(fVar));
        return Boolean.TRUE;
    }

    @Override // xd2.a1
    public final Object E(ae2.e0 e0Var, long j8, DateTime dateTime, y1 y1Var) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new m(this, j8, dateTime, e0Var, null), y1Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[PHI: r10 r11 r12
      0x0078: PHI (r10v3 androidx.lifecycle.y0<ge2.e>) = (r10v2 androidx.lifecycle.y0<ge2.e>), (r10v5 androidx.lifecycle.y0<ge2.e>) binds: [B:26:0x0076, B:32:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0078: PHI (r11v2 androidx.lifecycle.y0<ge2.e>) = (r11v1 androidx.lifecycle.y0<ge2.e>), (r11v4 androidx.lifecycle.y0<ge2.e>) binds: [B:26:0x0076, B:32:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0078: PHI (r12v12 be2.f) = (r12v10 be2.f), (r12v14 be2.f) binds: [B:26:0x0076, B:32:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r12 == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xd2.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(long j8, v13.c cVar, boolean z14) throws Throwable {
        w wVar;
        int i14;
        long j14;
        androidx.lifecycle.y0<ge2.e> y0Var;
        androidx.lifecycle.y0<ge2.e> y0Var2;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i15 = wVar.f190380i;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                wVar.f190380i = i15 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object objK = wVar.f190378g;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = wVar.f190380i;
        if (i16 == 0) {
            o13.r.b(objK);
            androidx.lifecycle.y0<ge2.e> y0Var3 = this.f190051i;
            wVar.f190374c = y0Var3;
            wVar.f190375d = y0Var3;
            wVar.f190372a = z14;
            wVar.f190373b = j8;
            i14 = 0;
            wVar.f190377f = 0;
            wVar.f190380i = 1;
            Object objY = y(j8, wVar, z14);
            if (objY != obj) {
                j14 = j8;
                y0Var = y0Var3;
                y0Var2 = y0Var;
                objK = objY;
            }
            return obj;
        }
        if (i16 == 1) {
            int i17 = wVar.f190377f;
            j14 = wVar.f190373b;
            z14 = wVar.f190372a;
            androidx.lifecycle.y0<ge2.e> y0Var4 = wVar.f190375d;
            androidx.lifecycle.y0<ge2.e> y0Var5 = wVar.f190374c;
            o13.r.b(objK);
            i14 = i17;
            y0Var = y0Var4;
            y0Var2 = y0Var5;
        } else {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = wVar.f190376e;
            y0Var2 = wVar.f190374c;
            o13.r.b(objK);
        }
        be2.f fVar = (be2.f) objK;
        ge2.e eVarD = fVar != null ? xd2.a.d(fVar) : null;
        y0Var.j(eVarD);
        return y0Var2;
        g1 g1Var = (g1) objK;
        g1.b bVar = g1Var instanceof g1.b ? (g1.b) g1Var : null;
        if (bVar == null || (fVar = (be2.f) bVar.f190167a) == null) {
            wVar.f190374c = y0Var2;
            wVar.f190375d = null;
            wVar.f190376e = y0Var;
            wVar.f190372a = z14;
            wVar.f190373b = j14;
            wVar.f190377f = i14;
            wVar.f190380i = 2;
            objK = K(wVar);
        }
        y0Var.j(eVarD);
        return y0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xd2.a1
    public final Object G(long j8, v13.c cVar, boolean z14) throws Throwable {
        c0 c0Var;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f190068c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f190068c = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object objY = c0Var.f190066a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f190068c;
        if (i15 == 0) {
            o13.r.b(objY);
            c0Var.f190068c = 1;
            objY = y(j8, c0Var, z14);
            if (objY == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        g1.b bVar = objY instanceof g1.b ? (g1.b) objY : null;
        be2.f fVar = bVar != null ? (be2.f) bVar.f190167a : null;
        return Boolean.valueOf(fVar != null ? p005kotlin.jvm.internal.s.g(fVar.f17755e, Boolean.TRUE) : false);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b5 -> B:29:0x00bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xd2.a1
    public final java.lang.Object H(o13.p[] r19, v13.c r20) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xd2.b.H(o13.p[], v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // xd2.a1
    public final Object I(ae2.e0 e0Var, long j8, v13.c cVar) throws Throwable {
        k kVar;
        ae2.e0 e0Var2;
        long j14 = j8;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f190215e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f190215e = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        k kVar2 = kVar;
        Object obj = kVar2.f190213c;
        Serializable serializable = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar2.f190215e;
        if (i15 == 0) {
            o13.r.b(obj);
            if (!this.f190048f.c().d()) {
                return g1.a.b.f190162b;
            }
            kVar2.f190211a = e0Var;
            kVar2.f190212b = j14;
            kVar2.f190215e = 1;
            Serializable serializableG = g(j8, kVar2);
            if (serializableG != serializable) {
                obj = serializableG;
                e0Var2 = e0Var;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j14 = kVar2.f190212b;
        e0Var2 = kVar2.f190211a;
        o13.r.b(obj);
        Period period = (Period) obj;
        x53.c cVar2 = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        l lVar = new l(this, j14, e0Var2, period, null);
        kVar2.f190211a = null;
        kVar2.f190212b = j14;
        kVar2.f190215e = 2;
        Object objE0 = ge1.b.e0(bVar, lVar, kVar2);
        return objE0 == serializable ? serializable : objE0;
    }

    public final Object K(v13.c cVar) {
        this.f190049g.debug("Fetching LivetrackSettings from local persistence");
        return this.f190046d.f(cVar);
    }

    public final Object L(be2.f fVar, v13.c cVar) {
        this.f190049g.debug("Saving LivetrackSettings to local persistence");
        Object objH = this.f190046d.h(fVar, cVar);
        return objH == u13.a.COROUTINE_SUSPENDED ? objH : Unit.INSTANCE;
    }

    @Override // xd2.a1
    public final Object a(long j8, Boolean bool, Long l14, String str, List list, v13.c cVar) {
        this.f190049g.debug("Updating SessionInfo to local persistence: shouldStopOnDevice: " + bool);
        Object objA = this.f190046d.a(j8, bool, l14, str, list, cVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    @Override // xd2.a1
    public final Object b(long j8, v13.c cVar) {
        wr.g.v("Deleting SessionInfo for ", j8, " from local persistence", this.f190049g);
        Object objB = this.f190046d.b(j8, cVar);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    @Override // xd2.a1
    public final Object c(long j8, fe2.a0.b bVar) {
        return this.f190046d.c(j8, bVar);
    }

    @Override // xd2.a1
    public final Object d(long j8, v13.c cVar) {
        wr.g.v("Deleting LivetrackPublisher for ", j8, " from local persistence", this.f190049g);
        Object objD = this.f190046d.d(j8, cVar);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
    }

    @Override // xd2.a1
    public final Object e(be2.g gVar, v13.c cVar) {
        this.f190049g.debug("Saving SessionInfo to local persistence");
        Object objE = this.f190046d.e(gVar, cVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    @Override // xd2.a1
    public final Object f(long j8, List list, l1 l1Var) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new q(this, j8, list, null), l1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xd2.a1
    public final Serializable g(long j8, v13.c cVar) throws Throwable {
        y yVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i14 = yVar.f190393c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f190393c = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object objY = yVar.f190391a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar.f190393c;
        if (i15 == 0) {
            o13.r.b(objY);
            yVar.f190393c = 1;
            objY = y(j8, yVar, true);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        g1.b bVar = objY instanceof g1.b ? (g1.b) objY : null;
        be2.f fVar = bVar != null ? (be2.f) bVar.f190167a : null;
        return fVar != null ? p005kotlin.jvm.internal.s.g(fVar.f17753c, Boolean.TRUE) : false ? Period.hours(24) : Period.hours(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // xd2.a1
    public final Object h(String str, v13.c cVar) {
        i0 i0Var;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i14 = i0Var.f190194c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i0Var.f190194c = i14 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object objK = i0Var.f190192a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = i0Var.f190194c;
        if (i15 == 0) {
            o13.r.b(objK);
            e23.l j0Var = new j0(this, str, null);
            i0Var.f190194c = 1;
            objK = k(0, j0Var, i0Var);
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objK);
        }
        return h1.a((yd2.b) objK, new x91.j(16));
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:68:0x0105 A[LOOP:0: B:66:0x00ff->B:68:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:73:0x0152  */
    /* JADX WARN: Code duplicated, block: B:75:0x0156  */
    /* JADX WARN: Code duplicated, block: B:76:0x016f  */
    /* JADX WARN: Code duplicated, block: B:80:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01af  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d0  */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bd, code lost:
    
        if (r1.L(r2, r6) == r7) goto L85;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x01d0, please report this as an issue */
    @Override // xd2.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(long j8, ge2.e eVar, v13.c cVar) {
        g0 g0Var;
        ge2.e eVar2;
        Object obj;
        long j14;
        be2.f fVar;
        Boolean bool;
        Boolean bool2;
        ge2.d dVar;
        be2.f.b bVar;
        be2.f.b bVar2;
        String str;
        Map<Long, ge2.a> map;
        HashMap map2;
        HashMap map3;
        long j15;
        Period periodC;
        ae2.d0 d0Var;
        long j16;
        be2.f fVar2;
        g1 g1VarA;
        b bVar3 = this;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f190160f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f190160f = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(bVar3, cVar);
            }
        } else {
            g0Var = new g0(bVar3, cVar);
        }
        g0 g0Var2 = g0Var;
        Object objK = g0Var2.f190158d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var2.f190160f;
        Logger logger = bVar3.f190049g;
        if (i15 == 0) {
            o13.r.b(objK);
            eVar2 = eVar;
            g0Var2.f190156b = eVar2;
            g0Var2.f190155a = j8;
            g0Var2.f190160f = 1;
            Object objK2 = bVar3.K(g0Var2);
            if (objK2 != aVar) {
                obj = objK2;
                j14 = j8;
            }
            return aVar;
        }
        if (i15 == 1) {
            j14 = g0Var2.f190155a;
            ge2.e eVar3 = g0Var2.f190156b;
            o13.r.b(objK);
            obj = objK;
            eVar2 = eVar3;
        } else if (i15 == 2) {
            long j17 = g0Var2.f190155a;
            be2.f fVar3 = g0Var2.f190157c;
            o13.r.b(objK);
            fVar2 = fVar3;
            j16 = j17;
            g1VarA = h1.a((yd2.b) objK, new x91.j(14));
            if (!(g1VarA instanceof g1.b)) {
                logger.debug("Updating settings failed! " + g1VarA);
                return Boolean.FALSE;
            }
            g0Var2.f190156b = null;
            g0Var2.f190157c = fVar2;
            g0Var2.f190155a = j16;
            g0Var2.f190160f = 3;
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar2 = g0Var2.f190157c;
            o13.r.b(objK);
        }
        Map<Long, be2.f.a> map4 = fVar2.f17751a;
        if (map4 != null) {
            logger.debug("Saving DeviceSettingsDTO to local persistence");
            bVar3.f190046d.k(map4);
        }
        fVar = fVar2;
        bVar3.f190051i.j(xd2.a.d(fVar));
        return Boolean.TRUE;
        be2.f fVar4 = (be2.f) obj;
        Map<Long, ge2.a> map5 = eVar2.f77022a;
        ge2.d dVar2 = eVar2.f77027f;
        Map mapC = xd2.a.c(map5);
        if (mapC == null) {
            mapC = fVar4 != null ? fVar4.f17751a : null;
        }
        Boolean bool3 = eVar2.f77023b;
        if (bool3 == null) {
            bool3 = fVar4 != null ? fVar4.f17752b : null;
        }
        Boolean bool4 = eVar2.f77024c;
        if (bool4 == null) {
            bool4 = fVar4 != null ? fVar4.f17753c : null;
        }
        Boolean bool5 = eVar2.f77025d;
        if (bool5 != null) {
            bool = bool5;
        } else if (fVar4 != null) {
            bool5 = fVar4.f17754d;
            bool = bool5;
        } else {
            bool = null;
        }
        Boolean bool6 = eVar2.f77026e;
        if (bool6 != null) {
            bool2 = bool6;
        } else if (fVar4 != null) {
            bool6 = fVar4.f17755e;
            bool2 = bool6;
        } else {
            bool2 = null;
        }
        Period period = fVar4 != null ? fVar4.f17756f : null;
        if (dVar2 == null) {
            if (fVar4 != null) {
                bVar2 = fVar4.f17757g;
            } else {
                dVar = dVar2;
                bVar = null;
            }
            fVar = new be2.f(mapC, bool3, bool4, bool, bool2, period, bVar);
            if (!fVar.equals(fVar4)) {
                str = eVar2.f77028g;
                map = eVar2.f77022a;
                if (map == null) {
                    map3 = null;
                } else {
                    map2 = new HashMap();
                    for (Map.Entry<Long, ge2.a> entry : map.entrySet()) {
                        String strValueOf = String.valueOf(entry.getKey().longValue());
                        ge2.a value = entry.getValue();
                        value.getClass();
                        map2.put(strValueOf, new ae2.c(value.f77007a, value.f77008b, value.f77009c, value.f77010d));
                        j14 = j14;
                    }
                    map3 = map2;
                }
                j15 = j14;
                Boolean bool7 = eVar2.f77023b;
                Boolean bool8 = eVar2.f77024c;
                Boolean bool9 = eVar2.f77025d;
                Boolean bool10 = eVar2.f77026e;
                if (str != null) {
                    periodC = new PeriodAdapter().b(str);
                } else {
                    periodC = null;
                }
                if (dVar != null) {
                    ae2.p.a aVar2 = ae2.p.f2971b;
                    String str2 = dVar.f77021b;
                    aVar2.getClass();
                    d0Var = new ae2.d0(ae2.p.a.a(str2), ae2.p.a.a(dVar.f77020a));
                } else {
                    d0Var = null;
                }
                ae2.q qVar = new ae2.q(map3, bool7, bool8, bool9, bool10, periodC, d0Var);
                bVar3 = this;
                h0 h0Var = new h0(bVar3, j15, qVar, null);
                g0Var2.f190156b = null;
                g0Var2.f190157c = fVar;
                g0Var2.f190155a = j15;
                g0Var2.f190160f = 2;
                objK = bVar3.k(0, h0Var, g0Var2);
                if (objK != aVar) {
                    j16 = j15;
                    fVar2 = fVar;
                    g1VarA = h1.a((yd2.b) objK, new x91.j(14));
                    if (!(g1VarA instanceof g1.b)) {
                        logger.debug("Updating settings failed! " + g1VarA);
                        return Boolean.FALSE;
                    }
                    g0Var2.f190156b = null;
                    g0Var2.f190157c = fVar2;
                    g0Var2.f190155a = j16;
                    g0Var2.f190160f = 3;
                }
                return aVar;
            }
            bVar3.f190051i.j(xd2.a.d(fVar));
            return Boolean.TRUE;
        }
        bVar2 = new be2.f.b(dVar2.f77020a, dVar2.f77021b);
        dVar = dVar2;
        bVar = bVar2;
        fVar = new be2.f(mapC, bool3, bool4, bool, bool2, period, bVar);
        if (!fVar.equals(fVar4)) {
            str = eVar2.f77028g;
            map = eVar2.f77022a;
            if (map == null) {
                map3 = null;
            } else {
                map2 = new HashMap();
                while (r9.hasNext()) {
                    String strValueOf2 = String.valueOf(entry.getKey().longValue());
                    ge2.a value2 = entry.getValue();
                    value2.getClass();
                    map2.put(strValueOf2, new ae2.c(value2.f77007a, value2.f77008b, value2.f77009c, value2.f77010d));
                    j14 = j14;
                }
                map3 = map2;
            }
            j15 = j14;
            Boolean bool11 = eVar2.f77023b;
            Boolean bool12 = eVar2.f77024c;
            Boolean bool13 = eVar2.f77025d;
            Boolean bool14 = eVar2.f77026e;
            if (str != null) {
                periodC = new PeriodAdapter().b(str);
            } else {
                periodC = null;
            }
            if (dVar != null) {
                ae2.p.a aVar3 = ae2.p.f2971b;
                String str3 = dVar.f77021b;
                aVar3.getClass();
                d0Var = new ae2.d0(ae2.p.a.a(str3), ae2.p.a.a(dVar.f77020a));
            } else {
                d0Var = null;
            }
            ae2.q qVar2 = new ae2.q(map3, bool11, bool12, bool13, bool14, periodC, d0Var);
            bVar3 = this;
            h0 h0Var2 = new h0(bVar3, j15, qVar2, null);
            g0Var2.f190156b = null;
            g0Var2.f190157c = fVar;
            g0Var2.f190155a = j15;
            g0Var2.f190160f = 2;
            objK = bVar3.k(0, h0Var2, g0Var2);
            if (objK != aVar) {
                j16 = j15;
                fVar2 = fVar;
                g1VarA = h1.a((yd2.b) objK, new x91.j(14));
                if (!(g1VarA instanceof g1.b)) {
                    logger.debug("Updating settings failed! " + g1VarA);
                    return Boolean.FALSE;
                }
                g0Var2.f190156b = null;
                g0Var2.f190157c = fVar2;
                g0Var2.f190155a = j16;
                g0Var2.f190160f = 3;
            }
            return aVar;
        }
        bVar3.f190051i.j(xd2.a.d(fVar));
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // xd2.a1
    public final Object j(long j8, ae2.e0 e0Var, String str, v13.c cVar) throws Throwable {
        g gVar;
        String str2;
        ae2.e0 e0Var2;
        long j14 = j8;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f190154f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f190154f = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f190152d;
        Serializable serializable = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar2.f190154f;
        if (i15 == 0) {
            o13.r.b(obj);
            if (!this.f190048f.c().d()) {
                return g1.a.b.f190162b;
            }
            gVar2.f190149a = str;
            gVar2.f190150b = e0Var;
            gVar2.f190151c = j14;
            gVar2.f190154f = 1;
            Serializable serializableG = g(j14, gVar2);
            if (serializableG != serializable) {
                str2 = str;
                obj = serializableG;
                e0Var2 = e0Var;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j14 = gVar2.f190151c;
        ae2.e0 e0Var3 = gVar2.f190150b;
        String str3 = gVar2.f190149a;
        o13.r.b(obj);
        e0Var2 = e0Var3;
        str2 = str3;
        Period period = (Period) obj;
        x53.c cVar2 = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        h hVar = new h(this, j14, str2, e0Var2, period, null);
        gVar2.f190149a = null;
        gVar2.f190150b = null;
        gVar2.f190151c = j14;
        gVar2.f190154f = 2;
        Object objE0 = ge1.b.e0(bVar, hVar, gVar2);
        return objE0 == serializable ? serializable : objE0;
    }

    @Override // xd2.a1
    public final Object l(long j8, ae2.e0 e0Var, String str, v13.c cVar) {
        x53.c cVar2 = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new l0(this, j8, e0Var, str, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // xd2.a1
    public final Object n(boolean z14, v13.c cVar) {
        k0 k0Var;
        boolean z15;
        Object objK;
        Map<Long, be2.f.a> map;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i14 = k0Var.f190219d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k0Var.f190219d = i14 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        Object obj = k0Var.f190217b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = k0Var.f190219d;
        if (i15 == 0) {
            o13.r.b(obj);
            z15 = z14;
            k0Var.f190216a = z15;
            k0Var.f190219d = 1;
            objK = K(k0Var);
            if (objK != obj2) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z16 = k0Var.f190216a;
        o13.r.b(obj);
        objK = obj;
        z15 = z16;
        be2.f fVar = (be2.f) objK;
        LinkedHashMap linkedHashMap = (fVar == null || (map = fVar.f17751a) == null) ? new LinkedHashMap() : new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            be2.f.a aVar = (be2.f.a) entry.getValue();
            entry.setValue(new be2.f.a(Boolean.valueOf(z15), ((be2.f.a) entry.getValue()).f17760b, aVar.f17761c, aVar.f17762d));
        }
        ge2.e eVar = new ge2.e(xd2.a.b(linkedHashMap), null, null, null, null, null, null, 126, null);
        k0Var.f190216a = z15;
        k0Var.f190219d = 2;
        Object objI = i(-1L, eVar, k0Var);
        return objI == obj2 ? obj2 : objI;
    }

    @Override // xd2.a1
    public final Object p(long j8, String str, String str2, fe2.m0 m0Var) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new v(this, j8, str, str2, null), m0Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // xd2.a1
    public final Object q(ae2.e0 e0Var, long j8, String str, int i14, ae2.l lVar, Boolean bool, Boolean bool2, boolean z14, v13.c cVar) throws Throwable {
        e eVar;
        String str2;
        boolean z15;
        ae2.e0 e0Var2;
        Boolean bool3;
        Boolean bool4;
        long j14;
        ae2.l lVar2;
        int i15;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i16 = eVar.f190106k;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                eVar.f190106k = i16 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f190104i;
        Serializable serializable = u13.a.COROUTINE_SUSPENDED;
        int i17 = eVar2.f190106k;
        if (i17 == 0) {
            o13.r.b(obj);
            eVar2.f190096a = e0Var;
            str2 = str;
            eVar2.f190097b = str2;
            eVar2.f190098c = lVar;
            eVar2.f190099d = bool;
            eVar2.f190100e = bool2;
            eVar2.f190101f = j8;
            eVar2.f190102g = i14;
            z15 = z14;
            eVar2.f190103h = z15;
            eVar2.f190106k = 1;
            Serializable serializableG = g(j8, eVar2);
            if (serializableG != serializable) {
                e0Var2 = e0Var;
                obj = serializableG;
                bool3 = bool;
                bool4 = bool2;
                j14 = j8;
                lVar2 = lVar;
                i15 = i14;
            }
        }
        if (i17 != 1) {
            if (i17 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z16 = eVar2.f190103h;
        int i18 = eVar2.f190102g;
        long j15 = eVar2.f190101f;
        Boolean bool5 = eVar2.f190100e;
        Boolean bool6 = eVar2.f190099d;
        ae2.l lVar3 = eVar2.f190098c;
        String str3 = eVar2.f190097b;
        ae2.e0 e0Var3 = eVar2.f190096a;
        o13.r.b(obj);
        bool3 = bool6;
        bool4 = bool5;
        z15 = z16;
        i15 = i18;
        lVar2 = lVar3;
        j14 = j15;
        str2 = str3;
        e0Var2 = e0Var3;
        long j16 = j14;
        x53.c cVar2 = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        f fVar = new f(this, i15, lVar2, str2, e0Var2, bool3, (Period) obj, bool4, j16, z15, null);
        eVar2.f190096a = null;
        eVar2.f190097b = null;
        eVar2.f190098c = null;
        eVar2.f190099d = null;
        eVar2.f190100e = null;
        eVar2.f190101f = j16;
        eVar2.f190102g = i15;
        eVar2.f190103h = z15;
        eVar2.f190106k = 2;
        Object objE0 = ge1.b.e0(bVar, fVar, eVar2);
        return objE0 == serializable ? serializable : objE0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xd2.a1
    public final Object r(long j8, v13.c cVar) throws Throwable {
        b0 b0Var;
        int iIntValue;
        Period period;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i14 = b0Var.f190055c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f190055c = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(this, cVar);
            }
        } else {
            b0Var = new b0(this, cVar);
        }
        Object objY = b0Var.f190053a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f190055c;
        if (i15 == 0) {
            o13.r.b(objY);
            b0Var.f190055c = 1;
            objY = y(j8, b0Var, true);
            if (objY == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        g1.b bVar = objY instanceof g1.b ? (g1.b) objY : null;
        be2.f fVar = bVar != null ? (be2.f) bVar.f190167a : null;
        if (fVar == null || (period = fVar.f17756f) == null) {
            iIntValue = 15;
        } else {
            Integer num = new Integer(period.getSeconds());
            Integer num2 = num.intValue() > 0 ? num : null;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 15;
            }
        }
        this.f190049g.debug("Upload frequency seconds = " + iIntValue);
        return new Integer(iIntValue);
    }

    @Override // xd2.a1
    public final Object s(ae2.e0 e0Var, long j8, boolean z14, wd2.b1 b1Var) {
        Period periodHours = Period.hours(z14 ? 24 : 0);
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new n0(this, j8, e0Var, periodHours, null), b1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xd2.a1
    public final Object t(long j8, String str, v13.c cVar) throws Throwable {
        z zVar;
        p005kotlin.jvm.internal.r0 r0VarS;
        p005kotlin.jvm.internal.r0 r0Var;
        T t7;
        p005kotlin.jvm.internal.r0 r0Var2;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i14 = zVar.f190398e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f190398e = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object obj = zVar.f190396c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = zVar.f190398e;
        if (i15 == 0) {
            r0VarS = wr.g.s(obj);
            if (str != null) {
                x53.c cVar2 = o53.s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                a0 a0Var = new a0(this, j8, str, null);
                zVar.f190394a = r0VarS;
                zVar.f190395b = r0VarS;
                zVar.f190398e = 1;
                Object objE0 = ge1.b.e0(bVar, a0Var, zVar);
                if (objE0 == aVar) {
                    return aVar;
                }
                r0Var = r0VarS;
                t7 = objE0;
                r0Var2 = r0Var;
            }
            return r0VarS.f105810a;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r0Var2 = zVar.f190395b;
        r0Var = zVar.f190394a;
        o13.r.b(obj);
        t7 = obj;
        r0Var2.f105810a = t7;
        r0VarS = r0Var;
        return r0VarS.f105810a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0072 -> B:21:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xd2.a1
    public final java.lang.Object u(java.util.List r10, v13.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof xd2.t
            if (r0 == 0) goto L13
            r0 = r11
            xd2.t r0 = (xd2.t) r0
            int r1 = r0.f190342h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f190342h = r1
            goto L18
        L13:
            xd2.t r0 = new xd2.t
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f190340f
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f190342h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L32
            int r10 = r0.f190339e
            java.util.Map r2 = r0.f190338d
            java.lang.String r5 = r0.f190337c
            java.util.Iterator r6 = r0.f190336b
            java.util.Map r7 = r0.f190335a
            o13.r.b(r11)
            goto L73
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r10)
            return r4
        L38:
            o13.r.b(r11)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
            r2 = 0
            r6 = r10
            r10 = r2
            r2 = r11
        L48:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L78
            java.lang.Object r11 = r6.next()
            be2.g r11 = (be2.g) r11
            java.lang.String r5 = r11.f17767c
            x53.c r7 = o53.s0.f129406a
            x53.b r7 = x53.b.f189152a
            xd2.u r8 = new xd2.u
            r8.<init>(r9, r11, r5, r4)
            r0.f190335a = r2
            r0.f190336b = r6
            r0.f190337c = r5
            r0.f190338d = r2
            r0.f190339e = r10
            r0.f190342h = r3
            java.lang.Object r11 = ge1.b.e0(r7, r8, r0)
            if (r11 != r1) goto L72
            return r1
        L72:
            r7 = r2
        L73:
            r2.put(r5, r11)
            r2 = r7
            goto L48
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xd2.b.u(java.util.List, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // xd2.a1
    public final Object v(long j8, ae2.e0 e0Var, String str, v13.c cVar) throws Throwable {
        i iVar;
        String str2;
        ae2.e0 e0Var2;
        long j14 = j8;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f190191f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f190191f = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        i iVar2 = iVar;
        Object obj = iVar2.f190189d;
        Serializable serializable = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar2.f190191f;
        if (i15 == 0) {
            o13.r.b(obj);
            if (!this.f190048f.c().d()) {
                return g1.a.b.f190162b;
            }
            iVar2.f190186a = e0Var;
            str2 = str;
            iVar2.f190187b = str2;
            iVar2.f190188c = j14;
            iVar2.f190191f = 1;
            Serializable serializableG = g(j14, iVar2);
            if (serializableG != serializable) {
                e0Var2 = e0Var;
                obj = serializableG;
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j14 = iVar2.f190188c;
        str2 = iVar2.f190187b;
        e0Var2 = iVar2.f190186a;
        o13.r.b(obj);
        Period period = (Period) obj;
        x53.c cVar2 = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        j jVar = new j(this, j14, str2, e0Var2, period, null);
        iVar2.f190186a = null;
        iVar2.f190187b = null;
        iVar2.f190188c = j14;
        iVar2.f190191f = 2;
        Object objE0 = ge1.b.e0(bVar, jVar, iVar2);
        return objE0 == serializable ? serializable : objE0;
    }

    @Override // xd2.a1
    public final Object w(long j8, int i14, List list, Integer num, Integer num2, k1 k1Var) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new p(this, j8, num, num2, i14, list, null), k1Var);
    }

    @Override // xd2.a1
    public final Object x(ae2.e0 e0Var, long j8, List list, v13.c cVar) {
        com.airbnb.lottie.animation.keyframe.a.r("Uploading ", list.size(), " track points", this.f190049g);
        x53.c cVar2 = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new o0(this, j8, e0Var, list, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:54:0x010d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r1 == r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f4, code lost:
    
        if (L(r2, r3) == r4) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xd2.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(long j8, v13.c cVar, boolean z14) throws Throwable {
        n nVar;
        long j14;
        be2.f fVar;
        be2.f fVar2;
        boolean z15;
        long j15;
        g1 g1VarA;
        yd2.b bVar;
        yd2.b.C3683b c3683b;
        boolean z16 = z14;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f190259f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f190259f = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objK = nVar.f190257d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f190259f;
        Logger logger = this.f190049g;
        yd2.b bVar2 = null;
        if (i15 != 0) {
            if (i15 == 1) {
                j14 = nVar.f190255b;
                z16 = nVar.f190254a;
                o13.r.b(objK);
            } else {
                if (i15 == 2) {
                    j15 = nVar.f190255b;
                    z16 = nVar.f190254a;
                    o13.r.b(objK);
                    bVar = (yd2.b) objK;
                    if (bVar instanceof yd2.b.C3683b) {
                        c3683b = (yd2.b.C3683b) bVar;
                    } else {
                        c3683b = null;
                    }
                    bVar2 = bVar;
                    z15 = z16;
                    fVar2 = c3683b != null ? (be2.f) c3683b.f196776a : null;
                    j14 = j15;
                    if (fVar2 == null) {
                        return (bVar2 != null || (g1VarA = h1.a(bVar2, new x91.j(15))) == null) ? g1.a.f.f190166b : g1VarA;
                    }
                    if (bVar2 != null) {
                        nVar.f190256c = fVar2;
                        nVar.f190254a = z15;
                        nVar.f190255b = j14;
                        nVar.f190259f = 3;
                    }
                    return new g1.b(fVar2);
                }
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar2 = nVar.f190256c;
                o13.r.b(objK);
            }
            Map<Long, be2.f.a> map = fVar2.f17751a;
            if (map != null) {
                logger.debug("Saving DeviceSettingsDTO to local persistence");
                this.f190046d.k(map);
            }
            return new g1.b(fVar2);
        }
        o13.r.b(objK);
        if (z16) {
            nVar.f190254a = z16;
            j14 = j8;
            nVar.f190255b = j14;
            nVar.f190259f = 1;
            objK = K(nVar);
        } else {
            j14 = j8;
            fVar = null;
            if (fVar == null) {
                boolean z17 = z16;
                fVar2 = fVar;
                z15 = z17;
                if (fVar2 == null) {
                    if (bVar2 != null) {
                    }
                }
                if (bVar2 != null) {
                    nVar.f190256c = fVar2;
                    nVar.f190254a = z15;
                    nVar.f190255b = j14;
                    nVar.f190259f = 3;
                }
                return new g1.b(fVar2);
            }
            if (z16) {
                logger.warn("Local persistence cache miss, fallback to API call");
            }
            nVar.f190256c = null;
            nVar.f190254a = z16;
            nVar.f190255b = j14;
            nVar.f190259f = 2;
            logger.debug("Fetching LivetrackSettingsDTO from Mobcore API");
            this.f190048f.f().getClass();
            kg1.a.f104701a.getClass();
            if (kg1.a.C2003a.a().h()) {
                objK = new yd2.b.C3683b(new be2.f(null, null, null, null, null, null, null, 127, null), 200);
            } else {
                x53.c cVar2 = o53.s0.f129406a;
                objK = ge1.b.e0(x53.b.f189152a, new x(this, null), nVar);
            }
            if (objK != obj) {
                j15 = j14;
                bVar = (yd2.b) objK;
                if (bVar instanceof yd2.b.C3683b) {
                    c3683b = (yd2.b.C3683b) bVar;
                } else {
                    c3683b = null;
                }
                bVar2 = bVar;
                z15 = z16;
                fVar2 = c3683b != null ? (be2.f) c3683b.f196776a : null;
                j14 = j15;
                if (fVar2 == null) {
                    if (bVar2 != null) {
                    }
                }
                if (bVar2 != null) {
                    nVar.f190256c = fVar2;
                    nVar.f190254a = z15;
                    nVar.f190255b = j14;
                    nVar.f190259f = 3;
                }
                return new g1.b(fVar2);
            }
        }
        return obj;
        fVar = (be2.f) objK;
        if (fVar == null) {
            boolean z18 = z16;
            fVar2 = fVar;
            z15 = z18;
            if (fVar2 == null) {
                if (bVar2 != null) {
                }
            }
            if (bVar2 != null) {
                nVar.f190256c = fVar2;
                nVar.f190254a = z15;
                nVar.f190255b = j14;
                nVar.f190259f = 3;
            }
            return new g1.b(fVar2);
        }
        if (z16) {
            logger.warn("Local persistence cache miss, fallback to API call");
        }
        nVar.f190256c = null;
        nVar.f190254a = z16;
        nVar.f190255b = j14;
        nVar.f190259f = 2;
        logger.debug("Fetching LivetrackSettingsDTO from Mobcore API");
        this.f190048f.f().getClass();
        kg1.a.f104701a.getClass();
        if (kg1.a.C2003a.a().h()) {
            objK = new yd2.b.C3683b(new be2.f(null, null, null, null, null, null, null, 127, null), 200);
        } else {
            x53.c cVar3 = o53.s0.f129406a;
            objK = ge1.b.e0(x53.b.f189152a, new x(this, null), nVar);
        }
        if (objK != obj) {
            j15 = j14;
            bVar = (yd2.b) objK;
            if (bVar instanceof yd2.b.C3683b) {
                c3683b = (yd2.b.C3683b) bVar;
            } else {
                c3683b = null;
            }
            bVar2 = bVar;
            z15 = z16;
            fVar2 = c3683b != null ? (be2.f) c3683b.f196776a : null;
            j14 = j15;
            if (fVar2 == null) {
                if (bVar2 != null) {
                }
            }
            if (bVar2 != null) {
                nVar.f190256c = fVar2;
                nVar.f190254a = z15;
                nVar.f190255b = j14;
                nVar.f190259f = 3;
            }
            return new g1.b(fVar2);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // xd2.a1
    public final Object z(long j8, v13.c cVar) {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f190332e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f190332e = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objG = sVar.f190330c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f190332e;
        f1 f1Var = this.f190046d;
        if (i15 == 0) {
            o13.r.b(objG);
            sVar.f190328a = j8;
            sVar.f190332e = 1;
            objG = f1Var.g(j8, sVar);
            if (objG != aVar) {
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            be2.e eVar = sVar.f190329b;
            o13.r.b(objG);
            return eVar;
        }
        j8 = sVar.f190328a;
        o13.r.b(objG);
        be2.e eVar2 = (be2.e) objG;
        if (eVar2 == null) {
            eVar2 = new be2.e(j8, kg.f.c(), new ae2.e0.a.b().f2837a);
            sVar.f190329b = eVar2;
            sVar.f190328a = j8;
            sVar.f190332e = 2;
            this.f190049g.debug("Save publisher " + eVar2 + " to local persistence");
            Object objJ = f1Var.j(eVar2, sVar);
            if (objJ != aVar) {
                objJ = Unit.INSTANCE;
            }
            if (objJ == aVar) {
                return aVar;
            }
        }
        return eVar2;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxd2/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_TRACK_POINT_UPLOAD_LIMIT", "I", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
