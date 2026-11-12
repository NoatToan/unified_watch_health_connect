package du2;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import bs2.a20;
import bs2.c20;
import bs2.d20;
import bs2.e20;
import bs2.f20;
import bs2.l6;
import bs2.m6;
import bs2.o0;
import bs2.y10;
import c22.t;
import com.garmin.net.weather.exception.FailedHttpRequestException;
import com.google.common.base.Ascii;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import j20.x;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import o13.q;
import o13.r;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import p13.j0;
import p13.u;
import rs2.v;
import rs2.w;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ldu2/a;", "Lbt2/b;", "Lrs2/w;", "Ldu2/g;", "helper", "Lt13/g;", "coroutineContext", "<init>", "(Ldu2/g;Lt13/g;)V", "a", "weather-gdi_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class a implements bt2.b, w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f61267g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f61268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u53.d f61269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Logger f61270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zs2.h f61271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public rs2.c f61272f;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61273a;

        static {
            int[] iArr = new int[ve2.e.values().length];
            try {
                iArr[ve2.e.f177707g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ve2.e.f177708h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ve2.e.f177705e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ve2.e.f177706f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f61273a = iArr;
        }
    }

    static {
        new C1302a(null);
        int i14 = gt2.c.f79010a;
        f61267g = gt2.b.f79005a.h("WTHR#DataHandler");
    }

    public a(g gVar, t13.g gVar2) {
        gVar.getClass();
        gVar2.getClass();
        this.f61268b = gVar;
        this.f61269c = zl.a.e("WTHR#DataHandler", gVar2.plus(ge1.b.h()));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0292  */
    /* JADX WARN: Code duplicated, block: B:102:0x0296  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:135:0x036a  */
    /* JADX WARN: Code duplicated, block: B:137:0x036d  */
    /* JADX WARN: Code duplicated, block: B:150:0x03a0 A[PHI: r0 r1 r2 r3 r5 r13 r14 r16 r31
      0x03a0: PHI (r0v75 java.lang.String) = (r0v71 java.lang.String), (r0v82 java.lang.String) binds: [B:136:0x036b, B:144:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x03a0: PHI (r1v28 u13.a) = (r1v27 u13.a), (r1v29 u13.a) binds: [B:136:0x036b, B:144:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x03a0: PHI (r2v11 du2.j) = (r2v10 du2.j), (r2v41 du2.j) binds: [B:136:0x036b, B:144:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x03a0: PHI (r3v23 android.location.Location) = (r3v22 android.location.Location), (r3v30 android.location.Location) binds: [B:136:0x036b, B:144:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x03a0: PHI (r5v12 rs2.c) = (r5v11 rs2.c), (r5v15 rs2.c) binds: [B:136:0x036b, B:144:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x03a0: PHI (r13v14 du2.d) = (r13v13 du2.d), (r13v15 du2.d) binds: [B:136:0x036b, B:144:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x03a0: PHI (r14v6 du2.a) = (r14v5 du2.a), (r14v7 du2.a) binds: [B:136:0x036b, B:144:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x03a0: PHI (r16v4 java.lang.Throwable) = (r16v3 java.lang.Throwable), (r16v6 java.lang.Throwable) binds: [B:136:0x036b, B:144:0x038f] A[DONT_GENERATE, DONT_INLINE]
      0x03a0: PHI (r31v7 java.lang.String) = (r31v6 java.lang.String), (r31v8 java.lang.String) binds: [B:136:0x036b, B:144:0x038f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:152:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:154:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:156:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:160:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:162:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:164:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:165:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:166:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:167:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:171:0x0463  */
    /* JADX WARN: Code duplicated, block: B:174:0x046b A[Catch: Exception -> 0x0476, TryCatch #1 {Exception -> 0x0476, blocks: (B:172:0x0464, B:174:0x046b, B:177:0x0478, B:178:0x047d, B:169:0x0444), top: B:192:0x0444 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0478 A[Catch: Exception -> 0x0476, TryCatch #1 {Exception -> 0x0476, blocks: (B:172:0x0464, B:174:0x046b, B:177:0x0478, B:178:0x047d, B:169:0x0444), top: B:192:0x0444 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0288  */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0380, code lost:
    
        if (r0 == r1) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04a7, code lost:
    
        if (r0.c(r13) == r1) goto L185;
     */
    /* JADX WARN: Type inference failed for: r2v32, types: [android.location.Location, du2.j, rs2.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, rs2.c cVar, j jVar, v13.c cVar2) throws Throwable {
        d dVar;
        Throwable th3;
        int i14;
        d dVar2;
        u13.a aVar2;
        Location location;
        Double d14;
        Double d15;
        u13.a aVar3;
        a aVar4;
        Object obj;
        j jVar2;
        rs2.c cVar3;
        Location location2;
        String str;
        d dVar3;
        a aVar5;
        rs2.c cVar4;
        j jVar3;
        String str2;
        boolean z14;
        ve2.e eVarA;
        int i15;
        fu2.f fVar;
        fu2.h hVar;
        Logger logger;
        j jVar4 = jVar;
        aVar.getClass();
        if (cVar2 instanceof d) {
            dVar = (d) cVar2;
            int i16 = dVar.f61289g;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                dVar.f61289g = i16 - Integer.MIN_VALUE;
            } else {
                dVar = new d(aVar, cVar2);
            }
        } else {
            dVar = new d(aVar, cVar2);
        }
        Object objC = dVar.f61287e;
        u13.a aVar6 = u13.a.COROUTINE_SUSPENDED;
        int i17 = dVar.f61289g;
        if (i17 == 0) {
            r.b(objC);
            Logger logger2 = aVar.f61270d;
            if (logger2 == null) {
                s.m("logger");
                throw null;
            }
            th3 = null;
            logger2.debug(t.e(cVar.getF92745i(), "received request from ", cVar.getF92742f(), "(SW ", ")"));
            g gVar = aVar.f61268b;
            dVar.f61283a = aVar;
            dVar.f61284b = cVar;
            dVar.f61285c = jVar4;
            dVar.f61289g = 1;
            gVar.getClass();
            Logger logger3 = g.f61294h;
            t13.i iVar = new t13.i(u13.f.b(dVar));
            g.a aVar7 = g.f61293g;
            Context context = gVar.f61295a;
            aVar7.getClass();
            if (g.a.d(context) == g.d.STATIC) {
                Location locationC = g.a.c(context);
                if (locationC == null) {
                    logger3.warn("getDeviceLocation: user preferred location source is STATIC but a location is not declared, returning null location...");
                }
                gVar.f61299e = locationC;
                int i18 = q.f128596b;
                iVar.resumeWith(locationC);
                dVar2 = dVar;
                aVar2 = aVar6;
            } else {
                ArrayList arrayList = new ArrayList();
                gk2.a.f77746a.getClass();
                try {
                    i14 = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
                } catch (Settings.SettingNotFoundException e4) {
                    e4.printStackTrace();
                    i14 = 0;
                }
                if (!(i14 != 0)) {
                    arrayList.add(g.b.NOT_ENABLED);
                }
                boolean z15 = gVar.f61300f.get();
                if (z15) {
                    if (!(a7.b.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || a7.b.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0)) {
                        arrayList.add(g.b.PERMISSION_NOT_GRANTED);
                    }
                } else if (!z15 && Build.VERSION.SDK_INT >= 29) {
                    if (!(a7.b.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0)) {
                        arrayList.add(g.b.PERMISSION_NOT_GRANTED_ACCESS_BACKGROUND_LOCATION);
                    }
                }
                if (arrayList.isEmpty()) {
                    if (gVar.f61299e == null) {
                        dVar2 = dVar;
                        aVar2 = aVar6;
                        double d16 = 2147483648L;
                        Location locationD = cu2.h.d((jVar4.f61314b * 180.0d) / d16, (jVar4.f61315c * 180.0d) / d16);
                        if (cu2.h.i(locationD)) {
                            gVar.f61299e = locationD;
                        }
                    } else {
                        dVar2 = dVar;
                        aVar2 = aVar6;
                    }
                    try {
                        Location locationA = g.a.a(context);
                        if (locationA == null) {
                            logger3.warn("getDeviceLocation(phone all providers): no location");
                            try {
                                Object systemService = context.getSystemService(FirebaseAnalytics.Param.LOCATION);
                                LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
                                if (locationManager != null && locationManager.getAllProviders().contains("network")) {
                                    if (Build.VERSION.SDK_INT >= 30) {
                                        locationManager.getCurrentLocation("network", null, context.getMainExecutor(), new h(gVar, iVar));
                                    } else {
                                        locationManager.requestSingleUpdate("network", new i(gVar, iVar), context.getMainLooper());
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            jVar4 = jVar;
                            location = gVar.f61299e;
                            if (location != null) {
                                d14 = new Double(location.getLatitude());
                            } else {
                                d14 = null;
                            }
                            if (location != null) {
                                d15 = new Double(location.getLongitude());
                            } else {
                                d15 = null;
                            }
                            logger3.debug("getDeviceLocation(fallback): last used lat[" + d14 + "], long[" + d15 + "]");
                            int i19 = q.f128596b;
                            iVar.resumeWith(location);
                        } else {
                            Location locationD2 = cu2.h.d(locationA.getLatitude(), locationA.getLongitude());
                            gVar.f61299e = locationD2;
                            logger3.debug("getDeviceLocation(phone all providers): lat[" + locationD2.getLatitude() + "], long[" + locationD2.getLongitude() + "]");
                            int i24 = q.f128596b;
                            iVar.resumeWith(locationD2);
                        }
                    } catch (Exception e14) {
                        logger3.error("getDeviceLocation(phone all providers): failed to get phone location", (Throwable) e14);
                    }
                    jVar4 = jVar;
                } else {
                    dVar2 = dVar;
                    aVar2 = aVar6;
                    double d17 = 2147483648L;
                    Location locationD3 = cu2.h.d((jVar4.f61314b * 180.0d) / d17, (jVar4.f61315c * 180.0d) / d17);
                    if (cu2.h.i(locationD3)) {
                        gVar.f61299e = locationD3;
                        double latitude = locationD3.getLatitude();
                        double longitude = locationD3.getLongitude();
                        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("getDeviceLocation: GRMN device provided lat[", latitude, "], long[");
                        sbA.append(longitude);
                        sbA.append("]");
                        logger3.debug(sbA.toString());
                        int i25 = q.f128596b;
                        iVar.resumeWith(locationD3);
                    } else {
                        logger3.warn("getDeviceLocation: GRMN device provided invalid lat/long");
                        logger3.warn("getDeviceLocation: app callback -> " + arrayList);
                        gVar.f61298d.invoke(arrayList);
                        location = gVar.f61299e;
                        if (location != null) {
                            d14 = new Double(location.getLatitude());
                        } else {
                            d14 = null;
                        }
                        if (location != null) {
                            d15 = new Double(location.getLongitude());
                        } else {
                            d15 = null;
                        }
                        logger3.debug("getDeviceLocation(fallback): last used lat[" + d14 + "], long[" + d15 + "]");
                        int i110 = q.f128596b;
                        iVar.resumeWith(location);
                    }
                }
            }
            Object objA = iVar.a();
            u13.a aVar8 = u13.a.COROUTINE_SUSPENDED;
            aVar3 = aVar2;
            if (objA != aVar3) {
                aVar4 = aVar;
                obj = objA;
                jVar2 = jVar4;
                cVar3 = cVar;
            }
            return aVar3;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                Location location3 = dVar.f61286d;
                jVar3 = dVar.f61285c;
                cVar4 = dVar.f61284b;
                aVar5 = dVar.f61283a;
                r.b(objC);
                str = "logger";
                th3 = null;
                dVar3 = dVar;
                location2 = location3;
                aVar3 = aVar6;
                str2 = (String) objC;
                if (str2 != null || str2.length() == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    String str3 = str2;
                    j jVar5 = jVar3;
                    Location location4 = location2;
                    rs2.c cVar5 = cVar4;
                    eVarA = aVar5.f61268b.f61296b.a();
                    if (eVarA == null) {
                        i15 = -1;
                    } else {
                        i15 = b.f61273a[eVarA.ordinal()];
                    }
                    if (i15 == 1) {
                        fVar = fu2.f.TEST;
                    } else if (i15 == 2) {
                        fVar = fu2.f.TEST_SSO_CHINA;
                    } else if (i15 == 3) {
                        fVar = fu2.f.CHINA;
                    } else if (i15 != 4) {
                        fVar = fu2.f.PROD;
                    } else {
                        fVar = fu2.f.CHINA_TEST;
                    }
                    fu2.f fVar2 = fVar;
                    g gVar2 = aVar5.f61268b;
                    Context context2 = gVar2.f61295a;
                    String strValueOf = String.valueOf(cVar5.getF92746j());
                    String strF = e0.f(cVar5.getF92744h(), "006-B", "-00");
                    String strValueOf2 = String.valueOf(cVar5.getF92745i());
                    String languageTag = gVar2.f61295a.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
                    languageTag.getClass();
                    fu2.i iVar2 = new fu2.i(context2, strValueOf, strF, strValueOf2, str3, languageTag);
                    jVar5.getClass();
                    fVar2.getClass();
                    location4.getClass();
                    fu2.g gVar3 = new fu2.g(fVar2, location4, iVar2, fu2.d.CELSIUS, fu2.c.METERS_PER_SECOND, 0, jVar5.f61316d, gVar2.f61297c.invoke(cVar5).booleanValue(), 32, null);
                    dVar3.f61283a = aVar5;
                    ?? r14 = th3;
                    dVar3.f61284b = r14;
                    dVar3.f61285c = r14;
                    dVar3.f61286d = r14;
                    dVar3.f61289g = 4;
                    cu2.h hVar2 = cu2.h.f55758a;
                    x53.c cVar6 = s0.f129406a;
                    objC = ge1.b.e0(x53.b.f189152a, new cu2.f(gVar3, null), dVar3);
                    if (objC == aVar3) {
                    }
                    hVar = (fu2.h) objC;
                    logger = aVar5.f61270d;
                    if (logger != null) {
                        logger.info(hVar.toString());
                        return (fu2.h) objC;
                    }
                    s.m(str);
                    throw null;
                }
                g.c cVar7 = aVar5.f61268b.f61296b;
                dVar3.f61283a = aVar5;
                dVar3.f61284b = cVar4;
                dVar3.f61285c = jVar3;
                dVar3.f61286d = location2;
                dVar3.f61289g = 3;
                objC = cVar7.c(dVar3);
                return aVar3;
            }
            if (i17 != 3) {
                if (i17 != 4) {
                    if (i17 == 5) {
                        r.b(objC);
                        return null;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a aVar9 = dVar.f61283a;
                try {
                    r.b(objC);
                    aVar5 = aVar9;
                    str = "logger";
                    hVar = (fu2.h) objC;
                    logger = aVar5.f61270d;
                    if (logger != null) {
                        logger.info(hVar.toString());
                        return (fu2.h) objC;
                    }
                    s.m(str);
                    throw null;
                } catch (Exception e15) {
                    e = e15;
                    aVar5 = aVar9;
                    dVar3 = dVar;
                    aVar3 = aVar6;
                    f61267g.error("unable to retrieve weather information", (Throwable) e);
                    if (e instanceof FailedHttpRequestException) {
                        g.c cVar8 = aVar5.f61268b.f61296b;
                        dVar3.f61283a = null;
                        dVar3.f61284b = null;
                        dVar3.f61285c = null;
                        dVar3.f61286d = null;
                        dVar3.f61289g = 5;
                    }
                    return null;
                }
            }
            Location location5 = dVar.f61286d;
            jVar3 = dVar.f61285c;
            cVar4 = dVar.f61284b;
            aVar5 = dVar.f61283a;
            r.b(objC);
            str = "logger";
            th3 = null;
            dVar3 = dVar;
            location2 = location5;
            aVar3 = aVar6;
            str2 = (String) objC;
            if (str2.length() == 0) {
                Logger logger4 = aVar5.f61270d;
                if (logger4 != null) {
                    logger4.warn("no oAuth2IT credential");
                    return th3;
                }
                s.m(str);
                throw th3;
            }
            String str4 = str2;
            j jVar6 = jVar3;
            Location location6 = location2;
            rs2.c cVar9 = cVar4;
            eVarA = aVar5.f61268b.f61296b.a();
            if (eVarA == null) {
                i15 = -1;
            } else {
                i15 = b.f61273a[eVarA.ordinal()];
            }
            if (i15 == 1) {
                fVar = fu2.f.TEST;
            } else if (i15 == 2) {
                fVar = fu2.f.TEST_SSO_CHINA;
            } else if (i15 == 3) {
                fVar = fu2.f.CHINA;
            } else if (i15 != 4) {
                fVar = fu2.f.PROD;
            } else {
                fVar = fu2.f.CHINA_TEST;
            }
            fu2.f fVar3 = fVar;
            g gVar4 = aVar5.f61268b;
            Context context3 = gVar4.f61295a;
            String strValueOf3 = String.valueOf(cVar9.getF92746j());
            String strF2 = e0.f(cVar9.getF92744h(), "006-B", "-00");
            String strValueOf4 = String.valueOf(cVar9.getF92745i());
            String languageTag2 = gVar4.f61295a.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
            languageTag2.getClass();
            fu2.i iVar3 = new fu2.i(context3, strValueOf3, strF2, strValueOf4, str4, languageTag2);
            jVar6.getClass();
            fVar3.getClass();
            location6.getClass();
            fu2.g gVar5 = new fu2.g(fVar3, location6, iVar3, fu2.d.CELSIUS, fu2.c.METERS_PER_SECOND, 0, jVar6.f61316d, gVar4.f61297c.invoke(cVar9).booleanValue(), 32, null);
            try {
                dVar3.f61283a = aVar5;
                ?? r15 = th3;
                dVar3.f61284b = r15;
                dVar3.f61285c = r15;
                dVar3.f61286d = r15;
                dVar3.f61289g = 4;
                cu2.h hVar3 = cu2.h.f55758a;
                x53.c cVar10 = s0.f129406a;
                objC = ge1.b.e0(x53.b.f189152a, new cu2.f(gVar5, null), dVar3);
                if (objC == aVar3) {
                    return aVar3;
                }
                hVar = (fu2.h) objC;
                logger = aVar5.f61270d;
                if (logger != null) {
                    logger.info(hVar.toString());
                    return (fu2.h) objC;
                }
                s.m(str);
                throw null;
            } catch (Exception e16) {
                e = e16;
                f61267g.error("unable to retrieve weather information", (Throwable) e);
                if ((e instanceof FailedHttpRequestException) && ((FailedHttpRequestException) e).getHttpStatusCode() == 401) {
                    g.c cVar11 = aVar5.f61268b.f61296b;
                    dVar3.f61283a = null;
                    dVar3.f61284b = null;
                    dVar3.f61285c = null;
                    dVar3.f61286d = null;
                    dVar3.f61289g = 5;
                }
                return null;
            }
        }
        j jVar7 = dVar.f61285c;
        cVar3 = dVar.f61284b;
        aVar4 = dVar.f61283a;
        r.b(objC);
        th3 = null;
        dVar2 = dVar;
        obj = objC;
        jVar2 = jVar7;
        aVar3 = aVar6;
        location2 = (Location) obj;
        if (location2 != null) {
            cu2.h.f55758a.getClass();
            if (cu2.h.f55765h.invoke().booleanValue()) {
                Logger logger5 = aVar4.f61270d;
                if (logger5 == null) {
                    s.m("logger");
                    throw th3;
                }
                double latitude2 = location2.getLatitude();
                double longitude2 = location2.getLongitude();
                long jE = cu2.h.e(location2.getLatitude());
                long jE2 = cu2.h.e(location2.getLongitude());
                str = "logger";
                StringBuilder sbA2 = com.airbnb.lottie.parser.moshi.a.a("Device lat: ", latitude2, ", long: ");
                sbA2.append(longitude2);
                x.j(jE, "\nGMSemicircle lat: ", ", long: ", sbA2);
                sbA2.append(jE2);
                logger5.info(sbA2.toString());
            } else {
                str = "logger";
            }
            g.c cVar12 = aVar4.f61268b.f61296b;
            dVar3 = dVar2;
            dVar3.f61283a = aVar4;
            dVar3.f61284b = cVar3;
            dVar3.f61285c = jVar2;
            dVar3.f61286d = location2;
            dVar3.f61289g = 2;
            Object objE = cVar12.e(dVar3);
            if (objE != aVar3) {
                aVar5 = aVar4;
                cVar4 = cVar3;
                jVar3 = jVar2;
                objC = objE;
                str2 = (String) objC;
                if (str2 != null) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (z14) {
                    String str5 = str2;
                    j jVar8 = jVar3;
                    Location location7 = location2;
                    rs2.c cVar13 = cVar4;
                    eVarA = aVar5.f61268b.f61296b.a();
                    if (eVarA == null) {
                        i15 = -1;
                    } else {
                        i15 = b.f61273a[eVarA.ordinal()];
                    }
                    if (i15 == 1) {
                        fVar = fu2.f.TEST;
                    } else if (i15 == 2) {
                        fVar = fu2.f.TEST_SSO_CHINA;
                    } else if (i15 == 3) {
                        fVar = fu2.f.CHINA;
                    } else if (i15 != 4) {
                        fVar = fu2.f.PROD;
                    } else {
                        fVar = fu2.f.CHINA_TEST;
                    }
                    fu2.f fVar4 = fVar;
                    g gVar6 = aVar5.f61268b;
                    Context context4 = gVar6.f61295a;
                    String strValueOf5 = String.valueOf(cVar13.getF92746j());
                    String strF3 = e0.f(cVar13.getF92744h(), "006-B", "-00");
                    String strValueOf6 = String.valueOf(cVar13.getF92745i());
                    String languageTag3 = gVar6.f61295a.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
                    languageTag3.getClass();
                    fu2.i iVar4 = new fu2.i(context4, strValueOf5, strF3, strValueOf6, str5, languageTag3);
                    jVar8.getClass();
                    fVar4.getClass();
                    location7.getClass();
                    fu2.g gVar7 = new fu2.g(fVar4, location7, iVar4, fu2.d.CELSIUS, fu2.c.METERS_PER_SECOND, 0, jVar8.f61316d, gVar6.f61297c.invoke(cVar13).booleanValue(), 32, null);
                    dVar3.f61283a = aVar5;
                    ?? r16 = th3;
                    dVar3.f61284b = r16;
                    dVar3.f61285c = r16;
                    dVar3.f61286d = r16;
                    dVar3.f61289g = 4;
                    cu2.h hVar4 = cu2.h.f55758a;
                    x53.c cVar14 = s0.f129406a;
                    objC = ge1.b.e0(x53.b.f189152a, new cu2.f(gVar7, null), dVar3);
                    if (objC == aVar3) {
                    }
                    hVar = (fu2.h) objC;
                    logger = aVar5.f61270d;
                    if (logger != null) {
                        logger.info(hVar.toString());
                        return (fu2.h) objC;
                    }
                    s.m(str);
                    throw null;
                }
                g.c cVar15 = aVar5.f61268b.f61296b;
                dVar3.f61283a = aVar5;
                dVar3.f61284b = cVar4;
                dVar3.f61285c = jVar3;
                dVar3.f61286d = location2;
                dVar3.f61289g = 3;
                objC = cVar15.c(dVar3);
            }
            return aVar3;
        }
        Logger logger6 = aVar4.f61270d;
        if (logger6 == null) {
            s.m("logger");
            throw th3;
        }
        logger6.warn("no location available, skipping weather query");
        return th3;
    }

    public static f20 b(int i14) {
        if (i14 != 0) {
            switch (i14) {
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    return f20.PARTLY_CLOUDY;
                case 11:
                case 12:
                    return f20.HAZY;
                case 13:
                case 14:
                    return f20.MOSTLY_CLOUDY;
                case 15:
                case 16:
                    return f20.CLOUDY;
                case 17:
                    return f20.UNKNOWN_PRECIPITATION;
                case 18:
                case 19:
                case 20:
                case 21:
                    return f20.SCATTERED_SHOWERS;
                case 22:
                    return f20.LIGHT_RAIN;
                case 23:
                case 24:
                case 25:
                case 26:
                    return f20.SCATTERED_THUNDERSTORMS;
                case 27:
                    return f20.THUNDERSTORMS;
                case 28:
                    return f20.RAIN;
                case 29:
                    return f20.HEAVY_RAIN;
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                    return f20.LIGHT_SNOW;
                case 35:
                case 36:
                case 37:
                    return f20.SNOW;
                case 38:
                    return f20.HEAVY_SNOW;
                case 39:
                case 40:
                case 41:
                    return f20.WINTRY_MIX;
                case 42:
                    return f20.LIGHT_RAIN_SNOW;
                case 43:
                    return f20.HEAVY_RAIN_SNOW;
                case 44:
                case 45:
                    return f20.HAIL;
                case 46:
                    return f20.WINDY;
                case 47:
                case 48:
                    return f20.FOG;
                default:
                    return f20.INVALID;
            }
        }
        return f20.CLEAR;
    }

    @Override // rs2.h
    public final void close(String str) {
        str.getClass();
        c0.d(this.f61269c, "WTHR#DataHandler closed");
    }

    public final void e(List<gu2.a> list) {
        e20 e20Var;
        d20 d20Var;
        ArrayList arrayList = new ArrayList();
        y10 y10Var = null;
        for (gu2.a aVar : list) {
            y10 y10Var2 = new y10();
            y10Var2.o(5);
            y10Var2.n(253, new l6(new Date()).a());
            String str = aVar.f79095c;
            Integer num = aVar.f79098f;
            Integer num2 = aVar.f79097e;
            int i14 = 0;
            if (str != null) {
                y10Var2.n(0, str);
            }
            if (num2 != null) {
                y10Var2.n(1, new l6(new Date(((long) num2.intValue()) * ((long) 1000))).a());
            }
            if (num != null) {
                y10Var2.n(2, new l6(new Date(((long) num.intValue()) * ((long) 1000))).a());
            }
            fu2.b bVar = aVar.f79102j;
            if (bVar != null) {
                short s8 = bVar.f73573a;
                d20[] d20VarArrValues = d20.values();
                int length = d20VarArrValues.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        d20Var = d20.INVALID;
                        break;
                    }
                    d20Var = d20VarArrValues[i15];
                    if (s8 == d20Var.f20047a) {
                        break;
                    } else {
                        i15++;
                    }
                }
                y10Var2.n(4, Short.valueOf(d20Var.f20047a));
            }
            short sOrdinal = (short) aVar.f79101i.ordinal();
            e20[] e20VarArrValues = e20.values();
            int length2 = e20VarArrValues.length;
            while (true) {
                if (i14 >= length2) {
                    e20Var = e20.INVALID;
                    break;
                }
                e20Var = e20VarArrValues[i14];
                if (sOrdinal == e20Var.f20072a) {
                    break;
                } else {
                    i14++;
                }
            }
            y10Var2.n(3, Short.valueOf(e20Var.f20072a));
            arrayList.add(y10Var2);
            if (y10Var == null) {
                y10Var = new y10(y10Var2);
            }
        }
        h("alerts", arrayList);
    }

    public final void f(fu2.h hVar) {
        Integer num;
        List<gu2.c> listSubList;
        m6 m6Var;
        Double d14;
        Double d15;
        l6 l6Var;
        Integer num2;
        o0 o0Var;
        Double d16;
        fu2.e eVar;
        Double d17;
        Double d18;
        Double d19;
        fu2.e eVar2;
        Double d24;
        Integer num3;
        fu2.e eVar3;
        Double d25;
        fu2.e eVar4;
        Double d26;
        Double d27;
        Float fValueOf = Float.valueOf(0.0f);
        Byte bValueOf = Byte.valueOf(Ascii.DEL);
        ArrayList arrayList = new ArrayList();
        gu2.b bVar = hVar.f73600f;
        List<gu2.c> list = hVar.f73601g;
        if (bVar == null) {
            vb.h.s("current conditions is null");
            return;
        }
        Location location = bVar.f79104b;
        gu2.e eVar5 = bVar.f79113k;
        gu2.c cVar = list != null ? (gu2.c) h0.b0(list) : null;
        a20 a20Var = new a20();
        l6 l6Var2 = new l6(new Date());
        a20Var.o(6);
        a20Var.n(0, Short.valueOf(c20.CURRENT.f19773a));
        a20Var.n(253, l6Var2.a());
        Long lA = l6Var2.a();
        int i14 = 9;
        a20Var.n(9, lA);
        fu2.e eVar6 = bVar.f79106d;
        a20Var.n(1, (eVar6 == null || (d27 = eVar6.f73578a) == null) ? bValueOf : Byte.valueOf((byte) MathKt.b(d27.doubleValue())));
        a20Var.n(14, (cVar == null || (eVar4 = cVar.f79122f) == null || (d26 = eVar4.f73578a) == null) ? bValueOf : Byte.valueOf((byte) MathKt.b(d26.doubleValue())));
        a20Var.n(13, (cVar == null || (eVar3 = cVar.f79121e) == null || (d25 = eVar3.f73578a) == null) ? bValueOf : Byte.valueOf((byte) MathKt.b(d25.doubleValue())));
        Integer num4 = bVar.f79108f;
        a20Var.n(2, Short.valueOf(b(num4 != null ? num4.intValue() : f20.CLEAR.ordinal()).f20112a));
        if (eVar5 == null || (num = eVar5.f79143f) == null) {
            num = 0;
        }
        a20Var.n(3, num);
        a20Var.n(5, (cVar == null || (num3 = cVar.f79123g) == null) ? (short) 255 : Short.valueOf((short) num3.intValue()));
        a20Var.n(4, (eVar5 == null || (eVar2 = eVar5.f79141d) == null || (d24 = eVar2.f73578a) == null) ? fValueOf : Float.valueOf((float) d24.doubleValue()));
        fu2.e eVar7 = bVar.f79109g;
        a20Var.n(6, (eVar7 == null || (d19 = eVar7.f73578a) == null) ? (byte) 0 : Byte.valueOf((byte) MathKt.b(d19.doubleValue())));
        Double d28 = bVar.f79112j;
        a20Var.n(7, d28 != null ? Short.valueOf((short) MathKt.b(d28.doubleValue())) : r5);
        a20Var.n(10, Integer.valueOf((int) cu2.h.e(location.getLatitude())));
        Integer num5 = 0;
        a20Var.n(11, Integer.valueOf((int) cu2.h.e(location.getLongitude())));
        String str = bVar.f79114l;
        if (str != null) {
            a20Var.n(8, str);
        }
        arrayList.add(a20Var);
        List<gu2.d> list2 = hVar.f73602h;
        if (list2 != null) {
            for (gu2.d dVar : list2) {
                a20 a20Var2 = new a20();
                a20Var2.o(i14);
                a20Var2.n(0, Short.valueOf(c20.HOURLY_FORECAST.f19773a));
                Integer num6 = dVar.f79128c;
                gu2.e eVar8 = dVar.f79133h;
                if (num6 != null) {
                    Integer num7 = dVar.f79128c;
                    num7.getClass();
                    l6Var = new l6(new Date(((long) num7.intValue()) * ((long) 1000)));
                } else {
                    l6Var = new l6(new Date());
                }
                a20Var2.n(253, l6Var.a());
                fu2.e eVar9 = dVar.f79131f;
                a20Var2.n(1, (eVar9 == null || (d18 = eVar9.f73578a) == null) ? bValueOf : Byte.valueOf((byte) MathKt.b(d18.doubleValue())));
                Integer num8 = dVar.f79130e;
                a20Var2.n(2, Short.valueOf(b(num8 != null ? num8.intValue() : f20.CLEAR.ordinal()).f20112a));
                if (eVar8 == 0 || (num2 = eVar8.f79143f) == null) {
                    num2 = num5;
                }
                a20Var2.n(3, num2);
                a20Var2.n(4, (eVar8 == null || (eVar = eVar8.f79141d) == null || (d17 = eVar.f73578a) == null) ? fValueOf : Float.valueOf((float) d17.doubleValue()));
                Integer num9 = dVar.f79132g;
                a20Var2.n(5, num9 != null ? Short.valueOf((short) num9.intValue()) : (short) 255);
                Double d29 = dVar.f79137l;
                a20Var2.n(7, d29 != null ? Short.valueOf((short) MathKt.b(d29.doubleValue())) : (short) 0);
                fu2.e eVar10 = dVar.f79134i;
                a20Var2.n(15, (eVar10 == null || (d16 = eVar10.f73578a) == null) ? (byte) 0 : Byte.valueOf((byte) MathKt.b(d16.doubleValue())));
                Double d34 = dVar.f79136k;
                if (d34 != null) {
                    a20Var2.n(16, Float.valueOf((float) d34.doubleValue()));
                }
                Integer num10 = dVar.f79135j;
                if (num10 != null) {
                    short sIntValue = (short) num10.intValue();
                    o0[] o0VarArrValues = o0.values();
                    int length = o0VarArrValues.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= length) {
                            o0Var = o0.INVALID;
                            break;
                        }
                        o0Var = o0VarArrValues[i15];
                        if (sIntValue == o0Var.f20368a) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                } else {
                    o0Var = o0.INVALID;
                }
                a20Var2.n(17, Short.valueOf(o0Var.f20368a));
                arrayList.add(a20Var2);
                num5 = num5;
                i14 = 9;
            }
        }
        if ((list != null ? list.size() : 0) >= 5 && list != null && (listSubList = list.subList(0, 5)) != null) {
            for (gu2.c cVar2 : listSubList) {
                a20 a20Var3 = new a20();
                a20Var3.o(10);
                a20Var3.n(0, Short.valueOf(c20.DAILY_FORECAST.f19773a));
                a20Var3.n(253, new l6(new Date()).a());
                fu2.e eVar11 = cVar2.f79122f;
                a20Var3.n(14, (eVar11 == null || (d15 = eVar11.f73578a) == null) ? bValueOf : Byte.valueOf((byte) MathKt.b(d15.doubleValue())));
                fu2.e eVar12 = cVar2.f79121e;
                a20Var3.n(13, (eVar12 == null || (d14 = eVar12.f73578a) == null) ? bValueOf : Byte.valueOf((byte) MathKt.b(d14.doubleValue())));
                Integer num11 = cVar2.f79120d;
                a20Var3.n(2, Short.valueOf(b(num11 != null ? num11.intValue() : f20.CLEAR.ordinal()).f20112a));
                Integer num12 = cVar2.f79123g;
                a20Var3.n(5, num12 != null ? Short.valueOf((short) num12.intValue()) : (short) 255);
                Integer num13 = cVar2.f79119c;
                if (num13 != null) {
                    switch (num13.intValue()) {
                        case 1:
                            m6Var = m6.MONDAY;
                            break;
                        case 2:
                            m6Var = m6.TUESDAY;
                            break;
                        case 3:
                            m6Var = m6.WEDNESDAY;
                            break;
                        case 4:
                            m6Var = m6.THURSDAY;
                            break;
                        case 5:
                            m6Var = m6.FRIDAY;
                            break;
                        case 6:
                            m6Var = m6.SATURDAY;
                            break;
                        case 7:
                            m6Var = m6.SUNDAY;
                            break;
                        default:
                            m6Var = m6.INVALID;
                            break;
                    }
                } else {
                    m6Var = m6.INVALID;
                }
                a20Var3.n(12, Short.valueOf(m6Var.f20304a));
                arrayList.add(a20Var3);
            }
        }
        h("conditions", arrayList);
    }

    public final void g() {
        try {
            this.f61268b.getClass();
            h(Constants.IPC_BUNDLE_KEY_SEND_ERROR, j0.f134944a);
        } catch (Exception e4) {
            f61267g.error("unable to send timeout message to device", (Throwable) e4);
        }
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return u.m0(new Integer[]{26, 27});
    }

    public final void h(String str, List list) {
        rs2.c cVar = this.f61272f;
        if (cVar == null) {
            s.m("deviceInfo");
            throw null;
        }
        String f92742f = cVar.getF92742f();
        rs2.c cVar2 = this.f61272f;
        if (cVar2 == null) {
            s.m("deviceInfo");
            throw null;
        }
        int f92745i = cVar2.getF92745i();
        StringBuilder sbI = p6.b.i("sending weather ", str, " FIT definition & data to ", f92742f, "(SW ");
        sbI.append(f92745i);
        sbI.append(")");
        f61267g.info(sbI.toString());
        list.getClass();
        ge1.b.T(this.f61269c, null, null, new e(this, list, null), 3);
    }

    @Override // bt2.b
    public final void m(zs2.h hVar) {
        hVar.getClass();
        this.f61271e = hVar;
    }

    @Override // rs2.w
    public final void onMessageReceived(int i14, byte[] bArr, rs2.x xVar) {
        bArr.getClass();
        if (i14 == 5014) {
            ge1.b.T(this.f61269c, null, null, new c(bArr, this, xVar, null), 3);
        }
    }

    @Override // rs2.h
    public final void start(rs2.c cVar, v vVar) {
        cVar.getClass();
        vVar.getClass();
        int i14 = gt2.c.f79010a;
        this.f61270d = gt2.b.f79005a.h("WTHR#DataHandler");
        this.f61272f = cVar;
        ((us2.b) vVar).d(5014, this);
    }

    /* JADX INFO: renamed from: du2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Ldu2/a$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "REQUEST_TIMEOUT_MESSAGE_ID", "I", "", "TAG", "Ljava/lang/String;", "WEATHER_ALERT", "WEATHER_CONDITIONS", "WEATHER_DAILY", "WEATHER_HOURLY", "weather-gdi_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1302a {
        public /* synthetic */ C1302a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1302a() {
        }
    }

    public a(g gVar, t13.g gVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(gVar, (i14 & 2) != 0 ? s0.f129406a : gVar2);
    }
}
