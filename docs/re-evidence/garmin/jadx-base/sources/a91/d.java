package a91;

import android.location.Location;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import lc.u0;
import o53.b0;
import o53.c2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.DefaultPersonalizedInsightsProvider$generate$1", f = "DefaultPersonalizedInsightsProvider.kt", l = {230, PsExtractor.VIDEO_STREAM_MASK, 269, 277, 286, 288, 303, 309, 317, 320}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f2111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f2118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a91.a f2119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d91.u f2120j;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2121a;

        static {
            int[] iArr = new int[d91.u.values().length];
            try {
                iArr[d91.u.PUSH_NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d91.u.OTHER_LOCALE_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d91.u.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d91.u.SYNC_SUCCESSFUL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d91.u.SYNC_UNSUCCESSFUL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d91.u.PULL_TO_REFRESH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d91.u.HOME_SCREEN_LANGUAGE_UPDATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d91.u.TIMEOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d91.u.DEVELOPER_MENU.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f2121a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a91.a aVar, d91.u uVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f2119i = aVar;
        this.f2120j = uVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f2119i, this.f2120j, dVar);
        dVar2.f2118h = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02cc A[PHI: r3 r7 r8 r11 r13
      0x02cc: PHI (r3v27 int) = (r3v25 int), (r3v28 int), (r3v28 int) binds: [B:117:0x02c7, B:109:0x029a, B:111:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r7v26 int) = (r7v24 int), (r7v27 int), (r7v27 int) binds: [B:117:0x02c7, B:109:0x029a, B:111:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r8v25 int) = (r8v23 int), (r8v27 int), (r8v27 int) binds: [B:117:0x02c7, B:109:0x029a, B:111:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r11v25 java.lang.String) = (r11v22 java.lang.String), (r11v26 java.lang.String), (r11v26 java.lang.String) binds: [B:117:0x02c7, B:109:0x029a, B:111:0x02a0] A[DONT_GENERATE, DONT_INLINE]
      0x02cc: PHI (r13v21 java.lang.String) = (r13v14 java.lang.String), (r13v22 java.lang.String), (r13v22 java.lang.String) binds: [B:117:0x02c7, B:109:0x029a, B:111:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:122:0x0303  */
    /* JADX WARN: Code duplicated, block: B:123:0x030d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0314  */
    /* JADX WARN: Code duplicated, block: B:128:0x0325  */
    /* JADX WARN: Code duplicated, block: B:131:0x032d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0330  */
    /* JADX WARN: Code duplicated, block: B:134:0x033a  */
    /* JADX WARN: Code duplicated, block: B:136:0x033d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0347  */
    /* JADX WARN: Code duplicated, block: B:146:0x0385  */
    /* JADX WARN: Code duplicated, block: B:148:0x0389  */
    /* JADX WARN: Code duplicated, block: B:150:0x0399  */
    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x01f7 A[PHI: r3 r8 r11
      0x01f7: PHI (r3v20 int) = (r3v16 int), (r3v16 int), (r3v21 int) binds: [B:73:0x01a5, B:74:0x01a7, B:79:0x01e6] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r8v17 int) = (r8v7 int), (r8v7 int), (r8v19 int) binds: [B:73:0x01a5, B:74:0x01a7, B:79:0x01e6] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r11v12 int) = (r11v9 int), (r11v9 int), (r11v15 int) binds: [B:73:0x01a5, B:74:0x01a7, B:79:0x01e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0211 A[PHI: r3 r7 r8 r11
      0x0211: PHI (r3v23 int) = (r3v20 int), (r3v24 int) binds: [B:83:0x020d, B:11:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r7v22 int) = (r7v16 int), (r7v23 int) binds: [B:83:0x020d, B:11:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r8v21 int) = (r8v18 int), (r8v22 int) binds: [B:83:0x020d, B:11:0x006f] A[DONT_GENERATE, DONT_INLINE]
      0x0211: PHI (r11v17 java.lang.Object) = (r11v14 java.lang.Object), (r11v20 java.lang.Object) binds: [B:83:0x020d, B:11:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0235 A[PHI: r3 r7 r8 r11 r12 r13
      0x0235: PHI (r3v25 int) = (r3v23 int), (r3v26 int) binds: [B:86:0x0231, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r7v24 int) = (r7v22 int), (r7v25 int) binds: [B:86:0x0231, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r8v23 int) = (r8v21 int), (r8v24 int) binds: [B:86:0x0231, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r11v21 java.lang.String) = (r11v19 java.lang.String), (r11v24 java.lang.String) binds: [B:86:0x0231, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r12v22 java.util.Set) = (r12v21 java.util.Set), (r12v28 java.util.Set) binds: [B:86:0x0231, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x0235: PHI (r13v7 java.lang.Object) = (r13v6 java.lang.Object), (r13v20 java.lang.Object) binds: [B:86:0x0231, B:10:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x023b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0247  */
    /* JADX WARN: Code duplicated, block: B:95:0x024f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0253  */
    /* JADX WARN: Code duplicated, block: B:99:0x026a  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c0, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x035e, code lost:
    
        if (r3 == r2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03b0, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015e, code lost:
    
        if (o53.m0.c(r12, r17) == r2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d4, code lost:
    
        if (o53.m0.c(r12, r17) == r2) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayListE;
        int i14;
        c2 c2Var;
        int i15;
        ArrayList arrayListE2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        Object objC;
        Set set;
        String strB;
        Object objA;
        v2 v2Var;
        String preferredAiLanguage;
        String str;
        String str2;
        Object objB;
        mv0.e eVar;
        Object objD;
        int i26;
        String str3;
        a2 a2Var;
        Set set2;
        Location location;
        Double d14;
        Double d15;
        Object objG;
        b0 b0Var = (b0) this.f2118h;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i27 = this.f2117g;
        a91.a aVar2 = this.f2119i;
        switch (i27) {
            case 0:
                o13.r.b(obj);
                p2 p2Var = aVar2.f2052n;
                d91.t.e eVar2 = new d91.t.e(null, 1, null);
                this.f2118h = b0Var;
                this.f2117g = 1;
                p2Var.k(null, eVar2);
                if (Unit.INSTANCE != aVar) {
                    rd2.f.a().f152045a.getClass();
                    arrayListE = rd2.j.e();
                    if (arrayListE != null || arrayListE.isEmpty()) {
                        i14 = 0;
                    } else {
                        Iterator it = arrayListE.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i14 = 0;
                            } else if (((sd2.f) it.next()).isPaired()) {
                                i14 = 1;
                            }
                        }
                    }
                    switch (a.f2121a[this.f2120j.ordinal()]) {
                        case 1:
                            a2 a2Var2 = a2.DASHBOARD;
                            i2.f36769a.getClass();
                            i2.a.f(a2Var2, "DefaultPersonalizedInsightsProvider", "Invalid state; avoiding generating a message based on a notification that a message should be ready");
                            c2Var = aVar2.f2046h;
                            if (c2Var != null) {
                                c2Var.c(null);
                            }
                            p2 p2Var2 = aVar2.f2052n;
                            d91.t.b bVar = new d91.t.b(null, 1, null);
                            this.f2118h = null;
                            this.f2114d = i14;
                            this.f2117g = 2;
                            p2Var2.k(null, bVar);
                            break;
                        case 2:
                        case 3:
                            i15 = i14;
                            rd2.f.a().f152045a.getClass();
                            arrayListE2 = rd2.j.e();
                            if (arrayListE2 != null || arrayListE2.isEmpty()) {
                                i16 = 0;
                            } else {
                                Iterator it3 = arrayListE2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        sd2.f fVar = (sd2.f) it3.next();
                                        if (fVar.isPaired() && aVar2.f2042d.a(fVar.getUnitID())) {
                                            i16 = 1;
                                        }
                                    } else {
                                        i16 = 0;
                                    }
                                }
                            }
                            if (i15 == 0 && i16 == 0) {
                                a2 a2Var3 = a2.DASHBOARD;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var3, "DefaultPersonalizedInsightsProvider", "Waiting for device connection before generating message");
                                e53.c.a aVar3 = e53.c.f63094b;
                                long jF = e53.e.f(aVar2.f2041c.d("cppi_connection_time"), e53.f.SECONDS);
                                this.f2118h = b0Var;
                                this.f2114d = i14;
                                this.f2115e = i15;
                                this.f2116f = i16;
                                this.f2117g = 3;
                            } else {
                                i17 = i15;
                                i18 = i16;
                                if (i17 != 0 && i18 != 0) {
                                    a2 a2Var4 = a2.DASHBOARD;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var4, "DefaultPersonalizedInsightsProvider", "Waiting for device sync before generating message");
                                    e53.c.a aVar4 = e53.c.f63094b;
                                    long jF2 = e53.e.f(aVar2.f2041c.d("cppi_sync_time"), e53.f.SECONDS);
                                    this.f2118h = b0Var;
                                    this.f2114d = i14;
                                    this.f2115e = i17;
                                    this.f2116f = i18;
                                    this.f2117g = 4;
                                } else {
                                    i24 = i17;
                                    i25 = i14;
                                    m mVar = aVar2.f2040b;
                                    this.f2118h = b0Var;
                                    this.f2114d = i25;
                                    this.f2115e = i24;
                                    this.f2116f = i18;
                                    this.f2117g = 5;
                                    Set<String> set3 = m.f2145d;
                                    objC = mVar.c(false, this);
                                    if (objC != aVar) {
                                        set = (Set) objC;
                                        strB = aVar2.f2043e.b();
                                        m mVar2 = aVar2.f2040b;
                                        this.f2118h = b0Var;
                                        this.f2111a = set;
                                        this.f2112b = strB;
                                        this.f2114d = i25;
                                        this.f2115e = i24;
                                        this.f2116f = i18;
                                        this.f2117g = 6;
                                        objA = mVar2.a(this);
                                        if (objA != aVar) {
                                            v2Var = (v2) objA;
                                            if (v2Var instanceof v2.b) {
                                                preferredAiLanguage = ((d91.w) ((v2.b) v2Var).f47386a).getPreferredAiLanguage();
                                                if (preferredAiLanguage != null || d53.w.J(preferredAiLanguage)) {
                                                }
                                                if (set == null && set.contains(strB) && preferredAiLanguage != null && !preferredAiLanguage.equals(strB)) {
                                                    m mVar3 = aVar2.f2040b;
                                                    this.f2118h = b0Var;
                                                    this.f2111a = null;
                                                    this.f2112b = strB;
                                                    this.f2113c = preferredAiLanguage;
                                                    this.f2114d = i25;
                                                    this.f2115e = i24;
                                                    this.f2116f = i18;
                                                    this.f2117g = 7;
                                                    objB = mVar3.b(this);
                                                    if (objB != aVar) {
                                                        String str4 = preferredAiLanguage;
                                                        str = strB;
                                                        str2 = str4;
                                                        set2 = (Set) objB;
                                                        if (set2 != null || set2.contains(str)) {
                                                            this.f2118h = b0Var;
                                                            this.f2111a = null;
                                                            this.f2112b = str;
                                                            this.f2113c = str2;
                                                            this.f2114d = i25;
                                                            this.f2115e = i24;
                                                            this.f2116f = i18;
                                                            this.f2117g = 9;
                                                            int i28 = a91.a.f2038p;
                                                            eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                                            aVar2.getClass();
                                                            if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                                                a2Var = a2.SUBSCRIPTIONS;
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                                                if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                                                    objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                                                } else {
                                                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                                                }
                                                                if (objD != aVar) {
                                                                    i26 = i25;
                                                                    str3 = str;
                                                                    location = (Location) objD;
                                                                    y yVar = aVar2.f2039a;
                                                                    if (str2 == null) {
                                                                        str2 = str3;
                                                                    }
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
                                                                    this.f2118h = b0Var;
                                                                    this.f2111a = null;
                                                                    this.f2112b = null;
                                                                    this.f2113c = null;
                                                                    this.f2114d = i26;
                                                                    this.f2115e = i24;
                                                                    this.f2116f = i18;
                                                                    this.f2117g = 10;
                                                                    objG = yVar.G(str2, d14, d15, this);
                                                                }
                                                            } else {
                                                                a2 a2Var5 = a2.SUBSCRIPTIONS;
                                                                i2.f36769a.getClass();
                                                                i2.a.b(a2Var5, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                                            }
                                                            objD = null;
                                                            if (objD != aVar) {
                                                                i26 = i25;
                                                                str3 = str;
                                                                location = (Location) objD;
                                                                y yVar2 = aVar2.f2039a;
                                                                if (str2 == null) {
                                                                    str2 = str3;
                                                                }
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
                                                                this.f2118h = b0Var;
                                                                this.f2111a = null;
                                                                this.f2112b = null;
                                                                this.f2113c = null;
                                                                this.f2114d = i26;
                                                                this.f2115e = i24;
                                                                this.f2116f = i18;
                                                                this.f2117g = 10;
                                                                objG = yVar2.G(str2, d14, d15, this);
                                                            }
                                                        } else {
                                                            p2 p2Var3 = aVar2.f2052n;
                                                            d91.t.h hVar = new d91.t.h(str, set2);
                                                            this.f2118h = null;
                                                            this.f2111a = null;
                                                            this.f2112b = null;
                                                            this.f2113c = null;
                                                            this.f2114d = i25;
                                                            this.f2115e = i24;
                                                            this.f2116f = i18;
                                                            this.f2117g = 8;
                                                            p2Var3.k(null, hVar);
                                                        }
                                                    }
                                                } else {
                                                    String str5 = preferredAiLanguage;
                                                    str = strB;
                                                    str2 = str5;
                                                    this.f2118h = b0Var;
                                                    this.f2111a = null;
                                                    this.f2112b = str;
                                                    this.f2113c = str2;
                                                    this.f2114d = i25;
                                                    this.f2115e = i24;
                                                    this.f2116f = i18;
                                                    this.f2117g = 9;
                                                    int i29 = a91.a.f2038p;
                                                    eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                                    aVar2.getClass();
                                                    if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                                        a2Var = a2.SUBSCRIPTIONS;
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                                        if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                                            objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                                        } else {
                                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                                        }
                                                        if (objD != aVar) {
                                                            i26 = i25;
                                                            str3 = str;
                                                            location = (Location) objD;
                                                            y yVar3 = aVar2.f2039a;
                                                            if (str2 == null) {
                                                                str2 = str3;
                                                            }
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
                                                            this.f2118h = b0Var;
                                                            this.f2111a = null;
                                                            this.f2112b = null;
                                                            this.f2113c = null;
                                                            this.f2114d = i26;
                                                            this.f2115e = i24;
                                                            this.f2116f = i18;
                                                            this.f2117g = 10;
                                                            objG = yVar3.G(str2, d14, d15, this);
                                                        }
                                                    } else {
                                                        a2 a2Var6 = a2.SUBSCRIPTIONS;
                                                        i2.f36769a.getClass();
                                                        i2.a.b(a2Var6, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                                    }
                                                    objD = null;
                                                    if (objD != aVar) {
                                                        i26 = i25;
                                                        str3 = str;
                                                        location = (Location) objD;
                                                        y yVar4 = aVar2.f2039a;
                                                        if (str2 == null) {
                                                            str2 = str3;
                                                        }
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
                                                        this.f2118h = b0Var;
                                                        this.f2111a = null;
                                                        this.f2112b = null;
                                                        this.f2113c = null;
                                                        this.f2114d = i26;
                                                        this.f2115e = i24;
                                                        this.f2116f = i18;
                                                        this.f2117g = 10;
                                                        objG = yVar4.G(str2, d14, d15, this);
                                                    }
                                                }
                                            } else {
                                                if (v2Var instanceof v2.a) {
                                                    u0.r();
                                                    return null;
                                                }
                                                a2 a2Var7 = a2.SUBSCRIPTIONS;
                                                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting selected language: ");
                                                i2.f36769a.getClass();
                                                i2.a.f(a2Var7, "DefaultPersonalizedInsightsProvider", strD);
                                            }
                                            preferredAiLanguage = null;
                                            if (set == null) {
                                            }
                                            String str6 = preferredAiLanguage;
                                            str = strB;
                                            str2 = str6;
                                            this.f2118h = b0Var;
                                            this.f2111a = null;
                                            this.f2112b = str;
                                            this.f2113c = str2;
                                            this.f2114d = i25;
                                            this.f2115e = i24;
                                            this.f2116f = i18;
                                            this.f2117g = 9;
                                            int i210 = a91.a.f2038p;
                                            eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                            aVar2.getClass();
                                            if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                                a2Var = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                                if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                                    objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                                } else {
                                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                                }
                                                if (objD != aVar) {
                                                    i26 = i25;
                                                    str3 = str;
                                                    location = (Location) objD;
                                                    y yVar5 = aVar2.f2039a;
                                                    if (str2 == null) {
                                                        str2 = str3;
                                                    }
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
                                                    this.f2118h = b0Var;
                                                    this.f2111a = null;
                                                    this.f2112b = null;
                                                    this.f2113c = null;
                                                    this.f2114d = i26;
                                                    this.f2115e = i24;
                                                    this.f2116f = i18;
                                                    this.f2117g = 10;
                                                    objG = yVar5.G(str2, d14, d15, this);
                                                }
                                            } else {
                                                a2 a2Var8 = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var8, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                            }
                                            objD = null;
                                            if (objD != aVar) {
                                                i26 = i25;
                                                str3 = str;
                                                location = (Location) objD;
                                                y yVar6 = aVar2.f2039a;
                                                if (str2 == null) {
                                                    str2 = str3;
                                                }
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
                                                this.f2118h = b0Var;
                                                this.f2111a = null;
                                                this.f2112b = null;
                                                this.f2113c = null;
                                                this.f2114d = i26;
                                                this.f2115e = i24;
                                                this.f2116f = i18;
                                                this.f2117g = 10;
                                                objG = yVar6.G(str2, d14, d15, this);
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            i15 = 0;
                            rd2.f.a().f152045a.getClass();
                            arrayListE2 = rd2.j.e();
                            if (arrayListE2 != null) {
                                i16 = 0;
                            } else {
                                i16 = 0;
                            }
                            if (i15 == 0) {
                            }
                            i17 = i15;
                            i18 = i16;
                            if (i17 != 0) {
                                i24 = i17;
                                i25 = i14;
                                m mVar4 = aVar2.f2040b;
                                this.f2118h = b0Var;
                                this.f2114d = i25;
                                this.f2115e = i24;
                                this.f2116f = i18;
                                this.f2117g = 5;
                                Set<String> set4 = m.f2145d;
                                objC = mVar4.c(false, this);
                                if (objC != aVar) {
                                    set = (Set) objC;
                                    strB = aVar2.f2043e.b();
                                    m mVar5 = aVar2.f2040b;
                                    this.f2118h = b0Var;
                                    this.f2111a = set;
                                    this.f2112b = strB;
                                    this.f2114d = i25;
                                    this.f2115e = i24;
                                    this.f2116f = i18;
                                    this.f2117g = 6;
                                    objA = mVar5.a(this);
                                    if (objA != aVar) {
                                        v2Var = (v2) objA;
                                        if (v2Var instanceof v2.b) {
                                            preferredAiLanguage = ((d91.w) ((v2.b) v2Var).f47386a).getPreferredAiLanguage();
                                            if (preferredAiLanguage != null) {
                                            }
                                            if (set == null) {
                                            }
                                            String str7 = preferredAiLanguage;
                                            str = strB;
                                            str2 = str7;
                                            this.f2118h = b0Var;
                                            this.f2111a = null;
                                            this.f2112b = str;
                                            this.f2113c = str2;
                                            this.f2114d = i25;
                                            this.f2115e = i24;
                                            this.f2116f = i18;
                                            this.f2117g = 9;
                                            int i211 = a91.a.f2038p;
                                            eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                            aVar2.getClass();
                                            if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                                a2Var = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                                if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                                    objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                                } else {
                                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                                }
                                                if (objD != aVar) {
                                                    i26 = i25;
                                                    str3 = str;
                                                    location = (Location) objD;
                                                    y yVar7 = aVar2.f2039a;
                                                    if (str2 == null) {
                                                        str2 = str3;
                                                    }
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
                                                    this.f2118h = b0Var;
                                                    this.f2111a = null;
                                                    this.f2112b = null;
                                                    this.f2113c = null;
                                                    this.f2114d = i26;
                                                    this.f2115e = i24;
                                                    this.f2116f = i18;
                                                    this.f2117g = 10;
                                                    objG = yVar7.G(str2, d14, d15, this);
                                                }
                                            } else {
                                                a2 a2Var9 = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var9, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                            }
                                            objD = null;
                                            if (objD != aVar) {
                                                i26 = i25;
                                                str3 = str;
                                                location = (Location) objD;
                                                y yVar8 = aVar2.f2039a;
                                                if (str2 == null) {
                                                    str2 = str3;
                                                }
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
                                                this.f2118h = b0Var;
                                                this.f2111a = null;
                                                this.f2112b = null;
                                                this.f2113c = null;
                                                this.f2114d = i26;
                                                this.f2115e = i24;
                                                this.f2116f = i18;
                                                this.f2117g = 10;
                                                objG = yVar8.G(str2, d14, d15, this);
                                            }
                                        } else {
                                            if (v2Var instanceof v2.a) {
                                                u0.r();
                                                return null;
                                            }
                                            a2 a2Var10 = a2.SUBSCRIPTIONS;
                                            String strD2 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting selected language: ");
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var10, "DefaultPersonalizedInsightsProvider", strD2);
                                        }
                                        preferredAiLanguage = null;
                                        if (set == null) {
                                        }
                                        String str8 = preferredAiLanguage;
                                        str = strB;
                                        str2 = str8;
                                        this.f2118h = b0Var;
                                        this.f2111a = null;
                                        this.f2112b = str;
                                        this.f2113c = str2;
                                        this.f2114d = i25;
                                        this.f2115e = i24;
                                        this.f2116f = i18;
                                        this.f2117g = 9;
                                        int i212 = a91.a.f2038p;
                                        eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                        aVar2.getClass();
                                        if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                            a2Var = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                            if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                                objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                            } else {
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                            }
                                            if (objD != aVar) {
                                                i26 = i25;
                                                str3 = str;
                                                location = (Location) objD;
                                                y yVar9 = aVar2.f2039a;
                                                if (str2 == null) {
                                                    str2 = str3;
                                                }
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
                                                this.f2118h = b0Var;
                                                this.f2111a = null;
                                                this.f2112b = null;
                                                this.f2113c = null;
                                                this.f2114d = i26;
                                                this.f2115e = i24;
                                                this.f2116f = i18;
                                                this.f2117g = 10;
                                                objG = yVar9.G(str2, d14, d15, this);
                                            }
                                        } else {
                                            a2 a2Var11 = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var11, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                        }
                                        objD = null;
                                        if (objD != aVar) {
                                            i26 = i25;
                                            str3 = str;
                                            location = (Location) objD;
                                            y yVar10 = aVar2.f2039a;
                                            if (str2 == null) {
                                                str2 = str3;
                                            }
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
                                            this.f2118h = b0Var;
                                            this.f2111a = null;
                                            this.f2112b = null;
                                            this.f2113c = null;
                                            this.f2114d = i26;
                                            this.f2115e = i24;
                                            this.f2116f = i18;
                                            this.f2117g = 10;
                                            objG = yVar10.G(str2, d14, d15, this);
                                        }
                                    }
                                }
                            } else {
                                i24 = i17;
                                i25 = i14;
                                m mVar6 = aVar2.f2040b;
                                this.f2118h = b0Var;
                                this.f2114d = i25;
                                this.f2115e = i24;
                                this.f2116f = i18;
                                this.f2117g = 5;
                                Set<String> set5 = m.f2145d;
                                objC = mVar6.c(false, this);
                                if (objC != aVar) {
                                    set = (Set) objC;
                                    strB = aVar2.f2043e.b();
                                    m mVar7 = aVar2.f2040b;
                                    this.f2118h = b0Var;
                                    this.f2111a = set;
                                    this.f2112b = strB;
                                    this.f2114d = i25;
                                    this.f2115e = i24;
                                    this.f2116f = i18;
                                    this.f2117g = 6;
                                    objA = mVar7.a(this);
                                    if (objA != aVar) {
                                        v2Var = (v2) objA;
                                        if (v2Var instanceof v2.b) {
                                            preferredAiLanguage = ((d91.w) ((v2.b) v2Var).f47386a).getPreferredAiLanguage();
                                            if (preferredAiLanguage != null) {
                                            }
                                            if (set == null) {
                                            }
                                            String str9 = preferredAiLanguage;
                                            str = strB;
                                            str2 = str9;
                                            this.f2118h = b0Var;
                                            this.f2111a = null;
                                            this.f2112b = str;
                                            this.f2113c = str2;
                                            this.f2114d = i25;
                                            this.f2115e = i24;
                                            this.f2116f = i18;
                                            this.f2117g = 9;
                                            int i213 = a91.a.f2038p;
                                            eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                            aVar2.getClass();
                                            if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                                a2Var = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                                if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                                    objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                                } else {
                                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                                }
                                                if (objD != aVar) {
                                                    i26 = i25;
                                                    str3 = str;
                                                    location = (Location) objD;
                                                    y yVar11 = aVar2.f2039a;
                                                    if (str2 == null) {
                                                        str2 = str3;
                                                    }
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
                                                    this.f2118h = b0Var;
                                                    this.f2111a = null;
                                                    this.f2112b = null;
                                                    this.f2113c = null;
                                                    this.f2114d = i26;
                                                    this.f2115e = i24;
                                                    this.f2116f = i18;
                                                    this.f2117g = 10;
                                                    objG = yVar11.G(str2, d14, d15, this);
                                                }
                                            } else {
                                                a2 a2Var12 = a2.SUBSCRIPTIONS;
                                                i2.f36769a.getClass();
                                                i2.a.b(a2Var12, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                            }
                                            objD = null;
                                            if (objD != aVar) {
                                                i26 = i25;
                                                str3 = str;
                                                location = (Location) objD;
                                                y yVar12 = aVar2.f2039a;
                                                if (str2 == null) {
                                                    str2 = str3;
                                                }
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
                                                this.f2118h = b0Var;
                                                this.f2111a = null;
                                                this.f2112b = null;
                                                this.f2113c = null;
                                                this.f2114d = i26;
                                                this.f2115e = i24;
                                                this.f2116f = i18;
                                                this.f2117g = 10;
                                                objG = yVar12.G(str2, d14, d15, this);
                                            }
                                        } else {
                                            if (v2Var instanceof v2.a) {
                                                u0.r();
                                                return null;
                                            }
                                            a2 a2Var13 = a2.SUBSCRIPTIONS;
                                            String strD3 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting selected language: ");
                                            i2.f36769a.getClass();
                                            i2.a.f(a2Var13, "DefaultPersonalizedInsightsProvider", strD3);
                                        }
                                        preferredAiLanguage = null;
                                        if (set == null) {
                                        }
                                        String str10 = preferredAiLanguage;
                                        str = strB;
                                        str2 = str10;
                                        this.f2118h = b0Var;
                                        this.f2111a = null;
                                        this.f2112b = str;
                                        this.f2113c = str2;
                                        this.f2114d = i25;
                                        this.f2115e = i24;
                                        this.f2116f = i18;
                                        this.f2117g = 9;
                                        int i214 = a91.a.f2038p;
                                        eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                        aVar2.getClass();
                                        if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                            a2Var = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                            if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                                objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                            } else {
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                            }
                                            if (objD != aVar) {
                                                i26 = i25;
                                                str3 = str;
                                                location = (Location) objD;
                                                y yVar13 = aVar2.f2039a;
                                                if (str2 == null) {
                                                    str2 = str3;
                                                }
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
                                                this.f2118h = b0Var;
                                                this.f2111a = null;
                                                this.f2112b = null;
                                                this.f2113c = null;
                                                this.f2114d = i26;
                                                this.f2115e = i24;
                                                this.f2116f = i18;
                                                this.f2117g = 10;
                                                objG = yVar13.G(str2, d14, d15, this);
                                            }
                                        } else {
                                            a2 a2Var14 = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var14, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                        }
                                        objD = null;
                                        if (objD != aVar) {
                                            i26 = i25;
                                            str3 = str;
                                            location = (Location) objD;
                                            y yVar14 = aVar2.f2039a;
                                            if (str2 == null) {
                                                str2 = str3;
                                            }
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
                                            this.f2118h = b0Var;
                                            this.f2111a = null;
                                            this.f2112b = null;
                                            this.f2113c = null;
                                            this.f2114d = i26;
                                            this.f2115e = i24;
                                            this.f2116f = i18;
                                            this.f2117g = 10;
                                            objG = yVar14.G(str2, d14, d15, this);
                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            u0.r();
                            return null;
                    }
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                rd2.f.a().f152045a.getClass();
                arrayListE = rd2.j.e();
                if (arrayListE != null) {
                    i14 = 0;
                } else {
                    i14 = 0;
                }
                switch (a.f2121a[this.f2120j.ordinal()]) {
                    case 1:
                        a2 a2Var15 = a2.DASHBOARD;
                        i2.f36769a.getClass();
                        i2.a.f(a2Var15, "DefaultPersonalizedInsightsProvider", "Invalid state; avoiding generating a message based on a notification that a message should be ready");
                        c2Var = aVar2.f2046h;
                        if (c2Var != null) {
                            c2Var.c(null);
                        }
                        p2 p2Var4 = aVar2.f2052n;
                        d91.t.b bVar2 = new d91.t.b(null, 1, null);
                        this.f2118h = null;
                        this.f2114d = i14;
                        this.f2117g = 2;
                        p2Var4.k(null, bVar2);
                        break;
                    case 2:
                    case 3:
                        i15 = i14;
                        rd2.f.a().f152045a.getClass();
                        arrayListE2 = rd2.j.e();
                        if (arrayListE2 != null) {
                            i16 = 0;
                        } else {
                            i16 = 0;
                        }
                        if (i15 == 0) {
                        }
                        i17 = i15;
                        i18 = i16;
                        if (i17 != 0) {
                            i24 = i17;
                            i25 = i14;
                            m mVar8 = aVar2.f2040b;
                            this.f2118h = b0Var;
                            this.f2114d = i25;
                            this.f2115e = i24;
                            this.f2116f = i18;
                            this.f2117g = 5;
                            Set<String> set6 = m.f2145d;
                            objC = mVar8.c(false, this);
                            if (objC != aVar) {
                                set = (Set) objC;
                                strB = aVar2.f2043e.b();
                                m mVar9 = aVar2.f2040b;
                                this.f2118h = b0Var;
                                this.f2111a = set;
                                this.f2112b = strB;
                                this.f2114d = i25;
                                this.f2115e = i24;
                                this.f2116f = i18;
                                this.f2117g = 6;
                                objA = mVar9.a(this);
                                if (objA != aVar) {
                                    v2Var = (v2) objA;
                                    if (v2Var instanceof v2.b) {
                                        preferredAiLanguage = ((d91.w) ((v2.b) v2Var).f47386a).getPreferredAiLanguage();
                                        if (preferredAiLanguage != null) {
                                        }
                                        if (set == null) {
                                        }
                                        String str11 = preferredAiLanguage;
                                        str = strB;
                                        str2 = str11;
                                        this.f2118h = b0Var;
                                        this.f2111a = null;
                                        this.f2112b = str;
                                        this.f2113c = str2;
                                        this.f2114d = i25;
                                        this.f2115e = i24;
                                        this.f2116f = i18;
                                        this.f2117g = 9;
                                        int i215 = a91.a.f2038p;
                                        eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                        aVar2.getClass();
                                        if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                            a2Var = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                            if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                                objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                            } else {
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                            }
                                            if (objD != aVar) {
                                                i26 = i25;
                                                str3 = str;
                                                location = (Location) objD;
                                                y yVar15 = aVar2.f2039a;
                                                if (str2 == null) {
                                                    str2 = str3;
                                                }
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
                                                this.f2118h = b0Var;
                                                this.f2111a = null;
                                                this.f2112b = null;
                                                this.f2113c = null;
                                                this.f2114d = i26;
                                                this.f2115e = i24;
                                                this.f2116f = i18;
                                                this.f2117g = 10;
                                                objG = yVar15.G(str2, d14, d15, this);
                                            }
                                        } else {
                                            a2 a2Var16 = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var16, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                        }
                                        objD = null;
                                        if (objD != aVar) {
                                            i26 = i25;
                                            str3 = str;
                                            location = (Location) objD;
                                            y yVar16 = aVar2.f2039a;
                                            if (str2 == null) {
                                                str2 = str3;
                                            }
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
                                            this.f2118h = b0Var;
                                            this.f2111a = null;
                                            this.f2112b = null;
                                            this.f2113c = null;
                                            this.f2114d = i26;
                                            this.f2115e = i24;
                                            this.f2116f = i18;
                                            this.f2117g = 10;
                                            objG = yVar16.G(str2, d14, d15, this);
                                        }
                                    } else {
                                        if (v2Var instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        a2 a2Var17 = a2.SUBSCRIPTIONS;
                                        String strD4 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting selected language: ");
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var17, "DefaultPersonalizedInsightsProvider", strD4);
                                    }
                                    preferredAiLanguage = null;
                                    if (set == null) {
                                    }
                                    String str12 = preferredAiLanguage;
                                    str = strB;
                                    str2 = str12;
                                    this.f2118h = b0Var;
                                    this.f2111a = null;
                                    this.f2112b = str;
                                    this.f2113c = str2;
                                    this.f2114d = i25;
                                    this.f2115e = i24;
                                    this.f2116f = i18;
                                    this.f2117g = 9;
                                    int i216 = a91.a.f2038p;
                                    eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                    aVar2.getClass();
                                    if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                        a2Var = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                        if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                            objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                        } else {
                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                        }
                                        if (objD != aVar) {
                                            i26 = i25;
                                            str3 = str;
                                            location = (Location) objD;
                                            y yVar17 = aVar2.f2039a;
                                            if (str2 == null) {
                                                str2 = str3;
                                            }
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
                                            this.f2118h = b0Var;
                                            this.f2111a = null;
                                            this.f2112b = null;
                                            this.f2113c = null;
                                            this.f2114d = i26;
                                            this.f2115e = i24;
                                            this.f2116f = i18;
                                            this.f2117g = 10;
                                            objG = yVar17.G(str2, d14, d15, this);
                                        }
                                    } else {
                                        a2 a2Var18 = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var18, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                    }
                                    objD = null;
                                    if (objD != aVar) {
                                        i26 = i25;
                                        str3 = str;
                                        location = (Location) objD;
                                        y yVar18 = aVar2.f2039a;
                                        if (str2 == null) {
                                            str2 = str3;
                                        }
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
                                        this.f2118h = b0Var;
                                        this.f2111a = null;
                                        this.f2112b = null;
                                        this.f2113c = null;
                                        this.f2114d = i26;
                                        this.f2115e = i24;
                                        this.f2116f = i18;
                                        this.f2117g = 10;
                                        objG = yVar18.G(str2, d14, d15, this);
                                    }
                                }
                            }
                            break;
                        } else {
                            i24 = i17;
                            i25 = i14;
                            m mVar10 = aVar2.f2040b;
                            this.f2118h = b0Var;
                            this.f2114d = i25;
                            this.f2115e = i24;
                            this.f2116f = i18;
                            this.f2117g = 5;
                            Set<String> set7 = m.f2145d;
                            objC = mVar10.c(false, this);
                            if (objC != aVar) {
                                set = (Set) objC;
                                strB = aVar2.f2043e.b();
                                m mVar11 = aVar2.f2040b;
                                this.f2118h = b0Var;
                                this.f2111a = set;
                                this.f2112b = strB;
                                this.f2114d = i25;
                                this.f2115e = i24;
                                this.f2116f = i18;
                                this.f2117g = 6;
                                objA = mVar11.a(this);
                                if (objA != aVar) {
                                    v2Var = (v2) objA;
                                    if (v2Var instanceof v2.b) {
                                        preferredAiLanguage = ((d91.w) ((v2.b) v2Var).f47386a).getPreferredAiLanguage();
                                        if (preferredAiLanguage != null) {
                                        }
                                        if (set == null) {
                                        }
                                        String str13 = preferredAiLanguage;
                                        str = strB;
                                        str2 = str13;
                                        this.f2118h = b0Var;
                                        this.f2111a = null;
                                        this.f2112b = str;
                                        this.f2113c = str2;
                                        this.f2114d = i25;
                                        this.f2115e = i24;
                                        this.f2116f = i18;
                                        this.f2117g = 9;
                                        int i217 = a91.a.f2038p;
                                        eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                        aVar2.getClass();
                                        if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                            a2Var = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                            if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                                objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                            } else {
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                            }
                                            if (objD != aVar) {
                                                i26 = i25;
                                                str3 = str;
                                                location = (Location) objD;
                                                y yVar19 = aVar2.f2039a;
                                                if (str2 == null) {
                                                    str2 = str3;
                                                }
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
                                                this.f2118h = b0Var;
                                                this.f2111a = null;
                                                this.f2112b = null;
                                                this.f2113c = null;
                                                this.f2114d = i26;
                                                this.f2115e = i24;
                                                this.f2116f = i18;
                                                this.f2117g = 10;
                                                objG = yVar19.G(str2, d14, d15, this);
                                            }
                                        } else {
                                            a2 a2Var19 = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var19, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                        }
                                        objD = null;
                                        if (objD != aVar) {
                                            i26 = i25;
                                            str3 = str;
                                            location = (Location) objD;
                                            y yVar110 = aVar2.f2039a;
                                            if (str2 == null) {
                                                str2 = str3;
                                            }
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
                                            this.f2118h = b0Var;
                                            this.f2111a = null;
                                            this.f2112b = null;
                                            this.f2113c = null;
                                            this.f2114d = i26;
                                            this.f2115e = i24;
                                            this.f2116f = i18;
                                            this.f2117g = 10;
                                            objG = yVar110.G(str2, d14, d15, this);
                                        }
                                    } else {
                                        if (v2Var instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        a2 a2Var110 = a2.SUBSCRIPTIONS;
                                        String strD5 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting selected language: ");
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var110, "DefaultPersonalizedInsightsProvider", strD5);
                                    }
                                    preferredAiLanguage = null;
                                    if (set == null) {
                                    }
                                    String str14 = preferredAiLanguage;
                                    str = strB;
                                    str2 = str14;
                                    this.f2118h = b0Var;
                                    this.f2111a = null;
                                    this.f2112b = str;
                                    this.f2113c = str2;
                                    this.f2114d = i25;
                                    this.f2115e = i24;
                                    this.f2116f = i18;
                                    this.f2117g = 9;
                                    int i218 = a91.a.f2038p;
                                    eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                    aVar2.getClass();
                                    if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                        a2Var = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                        if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                            objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                        } else {
                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                        }
                                        if (objD != aVar) {
                                            i26 = i25;
                                            str3 = str;
                                            location = (Location) objD;
                                            y yVar111 = aVar2.f2039a;
                                            if (str2 == null) {
                                                str2 = str3;
                                            }
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
                                            this.f2118h = b0Var;
                                            this.f2111a = null;
                                            this.f2112b = null;
                                            this.f2113c = null;
                                            this.f2114d = i26;
                                            this.f2115e = i24;
                                            this.f2116f = i18;
                                            this.f2117g = 10;
                                            objG = yVar111.G(str2, d14, d15, this);
                                        }
                                    } else {
                                        a2 a2Var111 = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var111, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                    }
                                    objD = null;
                                    if (objD != aVar) {
                                        i26 = i25;
                                        str3 = str;
                                        location = (Location) objD;
                                        y yVar112 = aVar2.f2039a;
                                        if (str2 == null) {
                                            str2 = str3;
                                        }
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
                                        this.f2118h = b0Var;
                                        this.f2111a = null;
                                        this.f2112b = null;
                                        this.f2113c = null;
                                        this.f2114d = i26;
                                        this.f2115e = i24;
                                        this.f2116f = i18;
                                        this.f2117g = 10;
                                        objG = yVar112.G(str2, d14, d15, this);
                                    }
                                }
                            }
                            break;
                        }
                        return aVar;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        i15 = 0;
                        rd2.f.a().f152045a.getClass();
                        arrayListE2 = rd2.j.e();
                        if (arrayListE2 != null) {
                            i16 = 0;
                        } else {
                            i16 = 0;
                        }
                        if (i15 == 0) {
                        }
                        i17 = i15;
                        i18 = i16;
                        if (i17 != 0) {
                            i24 = i17;
                            i25 = i14;
                            m mVar12 = aVar2.f2040b;
                            this.f2118h = b0Var;
                            this.f2114d = i25;
                            this.f2115e = i24;
                            this.f2116f = i18;
                            this.f2117g = 5;
                            Set<String> set8 = m.f2145d;
                            objC = mVar12.c(false, this);
                            if (objC != aVar) {
                                set = (Set) objC;
                                strB = aVar2.f2043e.b();
                                m mVar13 = aVar2.f2040b;
                                this.f2118h = b0Var;
                                this.f2111a = set;
                                this.f2112b = strB;
                                this.f2114d = i25;
                                this.f2115e = i24;
                                this.f2116f = i18;
                                this.f2117g = 6;
                                objA = mVar13.a(this);
                                if (objA != aVar) {
                                    v2Var = (v2) objA;
                                    if (v2Var instanceof v2.b) {
                                        preferredAiLanguage = ((d91.w) ((v2.b) v2Var).f47386a).getPreferredAiLanguage();
                                        if (preferredAiLanguage != null) {
                                        }
                                        if (set == null) {
                                        }
                                        String str15 = preferredAiLanguage;
                                        str = strB;
                                        str2 = str15;
                                        this.f2118h = b0Var;
                                        this.f2111a = null;
                                        this.f2112b = str;
                                        this.f2113c = str2;
                                        this.f2114d = i25;
                                        this.f2115e = i24;
                                        this.f2116f = i18;
                                        this.f2117g = 9;
                                        int i219 = a91.a.f2038p;
                                        eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                        aVar2.getClass();
                                        if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                            a2Var = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                            if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                                objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                            } else {
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                            }
                                            if (objD != aVar) {
                                                i26 = i25;
                                                str3 = str;
                                                location = (Location) objD;
                                                y yVar113 = aVar2.f2039a;
                                                if (str2 == null) {
                                                    str2 = str3;
                                                }
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
                                                this.f2118h = b0Var;
                                                this.f2111a = null;
                                                this.f2112b = null;
                                                this.f2113c = null;
                                                this.f2114d = i26;
                                                this.f2115e = i24;
                                                this.f2116f = i18;
                                                this.f2117g = 10;
                                                objG = yVar113.G(str2, d14, d15, this);
                                            }
                                        } else {
                                            a2 a2Var112 = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var112, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                        }
                                        objD = null;
                                        if (objD != aVar) {
                                            i26 = i25;
                                            str3 = str;
                                            location = (Location) objD;
                                            y yVar114 = aVar2.f2039a;
                                            if (str2 == null) {
                                                str2 = str3;
                                            }
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
                                            this.f2118h = b0Var;
                                            this.f2111a = null;
                                            this.f2112b = null;
                                            this.f2113c = null;
                                            this.f2114d = i26;
                                            this.f2115e = i24;
                                            this.f2116f = i18;
                                            this.f2117g = 10;
                                            objG = yVar114.G(str2, d14, d15, this);
                                        }
                                    } else {
                                        if (v2Var instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        a2 a2Var113 = a2.SUBSCRIPTIONS;
                                        String strD6 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting selected language: ");
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var113, "DefaultPersonalizedInsightsProvider", strD6);
                                    }
                                    preferredAiLanguage = null;
                                    if (set == null) {
                                    }
                                    String str16 = preferredAiLanguage;
                                    str = strB;
                                    str2 = str16;
                                    this.f2118h = b0Var;
                                    this.f2111a = null;
                                    this.f2112b = str;
                                    this.f2113c = str2;
                                    this.f2114d = i25;
                                    this.f2115e = i24;
                                    this.f2116f = i18;
                                    this.f2117g = 9;
                                    int i2110 = a91.a.f2038p;
                                    eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                    aVar2.getClass();
                                    if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                        a2Var = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                        if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                            objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                        } else {
                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                        }
                                        if (objD != aVar) {
                                            i26 = i25;
                                            str3 = str;
                                            location = (Location) objD;
                                            y yVar115 = aVar2.f2039a;
                                            if (str2 == null) {
                                                str2 = str3;
                                            }
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
                                            this.f2118h = b0Var;
                                            this.f2111a = null;
                                            this.f2112b = null;
                                            this.f2113c = null;
                                            this.f2114d = i26;
                                            this.f2115e = i24;
                                            this.f2116f = i18;
                                            this.f2117g = 10;
                                            objG = yVar115.G(str2, d14, d15, this);
                                        }
                                    } else {
                                        a2 a2Var114 = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var114, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                    }
                                    objD = null;
                                    if (objD != aVar) {
                                        i26 = i25;
                                        str3 = str;
                                        location = (Location) objD;
                                        y yVar116 = aVar2.f2039a;
                                        if (str2 == null) {
                                            str2 = str3;
                                        }
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
                                        this.f2118h = b0Var;
                                        this.f2111a = null;
                                        this.f2112b = null;
                                        this.f2113c = null;
                                        this.f2114d = i26;
                                        this.f2115e = i24;
                                        this.f2116f = i18;
                                        this.f2117g = 10;
                                        objG = yVar116.G(str2, d14, d15, this);
                                    }
                                }
                            }
                            break;
                        } else {
                            i24 = i17;
                            i25 = i14;
                            m mVar14 = aVar2.f2040b;
                            this.f2118h = b0Var;
                            this.f2114d = i25;
                            this.f2115e = i24;
                            this.f2116f = i18;
                            this.f2117g = 5;
                            Set<String> set9 = m.f2145d;
                            objC = mVar14.c(false, this);
                            if (objC != aVar) {
                                set = (Set) objC;
                                strB = aVar2.f2043e.b();
                                m mVar15 = aVar2.f2040b;
                                this.f2118h = b0Var;
                                this.f2111a = set;
                                this.f2112b = strB;
                                this.f2114d = i25;
                                this.f2115e = i24;
                                this.f2116f = i18;
                                this.f2117g = 6;
                                objA = mVar15.a(this);
                                if (objA != aVar) {
                                    v2Var = (v2) objA;
                                    if (v2Var instanceof v2.b) {
                                        preferredAiLanguage = ((d91.w) ((v2.b) v2Var).f47386a).getPreferredAiLanguage();
                                        if (preferredAiLanguage != null) {
                                        }
                                        if (set == null) {
                                        }
                                        String str17 = preferredAiLanguage;
                                        str = strB;
                                        str2 = str17;
                                        this.f2118h = b0Var;
                                        this.f2111a = null;
                                        this.f2112b = str;
                                        this.f2113c = str2;
                                        this.f2114d = i25;
                                        this.f2115e = i24;
                                        this.f2116f = i18;
                                        this.f2117g = 9;
                                        int i2111 = a91.a.f2038p;
                                        eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                        aVar2.getClass();
                                        if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                            a2Var = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                            if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                                objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                            } else {
                                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                            }
                                            if (objD != aVar) {
                                                i26 = i25;
                                                str3 = str;
                                                location = (Location) objD;
                                                y yVar117 = aVar2.f2039a;
                                                if (str2 == null) {
                                                    str2 = str3;
                                                }
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
                                                this.f2118h = b0Var;
                                                this.f2111a = null;
                                                this.f2112b = null;
                                                this.f2113c = null;
                                                this.f2114d = i26;
                                                this.f2115e = i24;
                                                this.f2116f = i18;
                                                this.f2117g = 10;
                                                objG = yVar117.G(str2, d14, d15, this);
                                            }
                                        } else {
                                            a2 a2Var115 = a2.SUBSCRIPTIONS;
                                            i2.f36769a.getClass();
                                            i2.a.b(a2Var115, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                        }
                                        objD = null;
                                        if (objD != aVar) {
                                            i26 = i25;
                                            str3 = str;
                                            location = (Location) objD;
                                            y yVar118 = aVar2.f2039a;
                                            if (str2 == null) {
                                                str2 = str3;
                                            }
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
                                            this.f2118h = b0Var;
                                            this.f2111a = null;
                                            this.f2112b = null;
                                            this.f2113c = null;
                                            this.f2114d = i26;
                                            this.f2115e = i24;
                                            this.f2116f = i18;
                                            this.f2117g = 10;
                                            objG = yVar118.G(str2, d14, d15, this);
                                        }
                                    } else {
                                        if (v2Var instanceof v2.a) {
                                            u0.r();
                                            return null;
                                        }
                                        a2 a2Var116 = a2.SUBSCRIPTIONS;
                                        String strD7 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting selected language: ");
                                        i2.f36769a.getClass();
                                        i2.a.f(a2Var116, "DefaultPersonalizedInsightsProvider", strD7);
                                    }
                                    preferredAiLanguage = null;
                                    if (set == null) {
                                    }
                                    String str18 = preferredAiLanguage;
                                    str = strB;
                                    str2 = str18;
                                    this.f2118h = b0Var;
                                    this.f2111a = null;
                                    this.f2112b = str;
                                    this.f2113c = str2;
                                    this.f2114d = i25;
                                    this.f2115e = i24;
                                    this.f2116f = i18;
                                    this.f2117g = 9;
                                    int i2112 = a91.a.f2038p;
                                    eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                    aVar2.getClass();
                                    if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                        a2Var = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                        if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                            objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                        } else {
                                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                        }
                                        if (objD != aVar) {
                                            i26 = i25;
                                            str3 = str;
                                            location = (Location) objD;
                                            y yVar119 = aVar2.f2039a;
                                            if (str2 == null) {
                                                str2 = str3;
                                            }
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
                                            this.f2118h = b0Var;
                                            this.f2111a = null;
                                            this.f2112b = null;
                                            this.f2113c = null;
                                            this.f2114d = i26;
                                            this.f2115e = i24;
                                            this.f2116f = i18;
                                            this.f2117g = 10;
                                            objG = yVar119.G(str2, d14, d15, this);
                                        }
                                    } else {
                                        a2 a2Var117 = a2.SUBSCRIPTIONS;
                                        i2.f36769a.getClass();
                                        i2.a.b(a2Var117, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                    }
                                    objD = null;
                                    if (objD != aVar) {
                                        i26 = i25;
                                        str3 = str;
                                        location = (Location) objD;
                                        y yVar1110 = aVar2.f2039a;
                                        if (str2 == null) {
                                            str2 = str3;
                                        }
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
                                        this.f2118h = b0Var;
                                        this.f2111a = null;
                                        this.f2112b = null;
                                        this.f2113c = null;
                                        this.f2114d = i26;
                                        this.f2115e = i24;
                                        this.f2116f = i18;
                                        this.f2117g = 10;
                                        objG = yVar1110.G(str2, d14, d15, this);
                                    }
                                }
                            }
                            break;
                        }
                        return aVar;
                    default:
                        u0.r();
                        return null;
                }
                break;
            case 2:
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 3:
                i15 = this.f2115e;
                i14 = this.f2114d;
                o13.r.b(obj);
                rd2.f.a().f152045a.getClass();
                ArrayList arrayListE3 = rd2.j.e();
                if (arrayListE3 == null || arrayListE3.isEmpty()) {
                    i19 = 0;
                } else {
                    Iterator it4 = arrayListE3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            sd2.f fVar2 = (sd2.f) it4.next();
                            if (fVar2.isPaired() && aVar2.f2042d.a(fVar2.getUnitID())) {
                                i19 = 1;
                            }
                        } else {
                            i19 = 0;
                        }
                    }
                }
                int i30 = i19;
                i17 = i15;
                i18 = i30;
                if (i17 != 0) {
                    i24 = i17;
                    i25 = i14;
                    m mVar16 = aVar2.f2040b;
                    this.f2118h = b0Var;
                    this.f2114d = i25;
                    this.f2115e = i24;
                    this.f2116f = i18;
                    this.f2117g = 5;
                    Set<String> set10 = m.f2145d;
                    objC = mVar16.c(false, this);
                    if (objC != aVar) {
                        set = (Set) objC;
                        strB = aVar2.f2043e.b();
                        m mVar17 = aVar2.f2040b;
                        this.f2118h = b0Var;
                        this.f2111a = set;
                        this.f2112b = strB;
                        this.f2114d = i25;
                        this.f2115e = i24;
                        this.f2116f = i18;
                        this.f2117g = 6;
                        objA = mVar17.a(this);
                        if (objA != aVar) {
                            v2Var = (v2) objA;
                            if (v2Var instanceof v2.b) {
                                preferredAiLanguage = ((d91.w) ((v2.b) v2Var).f47386a).getPreferredAiLanguage();
                                if (preferredAiLanguage != null) {
                                }
                                if (set == null) {
                                }
                                String str19 = preferredAiLanguage;
                                str = strB;
                                str2 = str19;
                                this.f2118h = b0Var;
                                this.f2111a = null;
                                this.f2112b = str;
                                this.f2113c = str2;
                                this.f2114d = i25;
                                this.f2115e = i24;
                                this.f2116f = i18;
                                this.f2117g = 9;
                                int i2113 = a91.a.f2038p;
                                eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                aVar2.getClass();
                                if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                    a2Var = a2.SUBSCRIPTIONS;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                    if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                        objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                    } else {
                                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                    }
                                    if (objD != aVar) {
                                        i26 = i25;
                                        str3 = str;
                                        location = (Location) objD;
                                        y yVar1111 = aVar2.f2039a;
                                        if (str2 == null) {
                                            str2 = str3;
                                        }
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
                                        this.f2118h = b0Var;
                                        this.f2111a = null;
                                        this.f2112b = null;
                                        this.f2113c = null;
                                        this.f2114d = i26;
                                        this.f2115e = i24;
                                        this.f2116f = i18;
                                        this.f2117g = 10;
                                        objG = yVar1111.G(str2, d14, d15, this);
                                    }
                                } else {
                                    a2 a2Var118 = a2.SUBSCRIPTIONS;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var118, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                }
                                objD = null;
                                if (objD != aVar) {
                                    i26 = i25;
                                    str3 = str;
                                    location = (Location) objD;
                                    y yVar1112 = aVar2.f2039a;
                                    if (str2 == null) {
                                        str2 = str3;
                                    }
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
                                    this.f2118h = b0Var;
                                    this.f2111a = null;
                                    this.f2112b = null;
                                    this.f2113c = null;
                                    this.f2114d = i26;
                                    this.f2115e = i24;
                                    this.f2116f = i18;
                                    this.f2117g = 10;
                                    objG = yVar1112.G(str2, d14, d15, this);
                                }
                            } else {
                                if (v2Var instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                a2 a2Var119 = a2.SUBSCRIPTIONS;
                                String strD8 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting selected language: ");
                                i2.f36769a.getClass();
                                i2.a.f(a2Var119, "DefaultPersonalizedInsightsProvider", strD8);
                            }
                            preferredAiLanguage = null;
                            if (set == null) {
                            }
                            String str110 = preferredAiLanguage;
                            str = strB;
                            str2 = str110;
                            this.f2118h = b0Var;
                            this.f2111a = null;
                            this.f2112b = str;
                            this.f2113c = str2;
                            this.f2114d = i25;
                            this.f2115e = i24;
                            this.f2116f = i18;
                            this.f2117g = 9;
                            int i2114 = a91.a.f2038p;
                            eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                            aVar2.getClass();
                            if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                a2Var = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                    objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                } else {
                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                }
                                if (objD != aVar) {
                                    i26 = i25;
                                    str3 = str;
                                    location = (Location) objD;
                                    y yVar1113 = aVar2.f2039a;
                                    if (str2 == null) {
                                        str2 = str3;
                                    }
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
                                    this.f2118h = b0Var;
                                    this.f2111a = null;
                                    this.f2112b = null;
                                    this.f2113c = null;
                                    this.f2114d = i26;
                                    this.f2115e = i24;
                                    this.f2116f = i18;
                                    this.f2117g = 10;
                                    objG = yVar1113.G(str2, d14, d15, this);
                                }
                            } else {
                                a2 a2Var1110 = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var1110, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                            }
                            objD = null;
                            if (objD != aVar) {
                                i26 = i25;
                                str3 = str;
                                location = (Location) objD;
                                y yVar1114 = aVar2.f2039a;
                                if (str2 == null) {
                                    str2 = str3;
                                }
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
                                this.f2118h = b0Var;
                                this.f2111a = null;
                                this.f2112b = null;
                                this.f2113c = null;
                                this.f2114d = i26;
                                this.f2115e = i24;
                                this.f2116f = i18;
                                this.f2117g = 10;
                                objG = yVar1114.G(str2, d14, d15, this);
                            }
                        }
                    }
                    break;
                } else {
                    i24 = i17;
                    i25 = i14;
                    m mVar18 = aVar2.f2040b;
                    this.f2118h = b0Var;
                    this.f2114d = i25;
                    this.f2115e = i24;
                    this.f2116f = i18;
                    this.f2117g = 5;
                    Set<String> set11 = m.f2145d;
                    objC = mVar18.c(false, this);
                    if (objC != aVar) {
                        set = (Set) objC;
                        strB = aVar2.f2043e.b();
                        m mVar19 = aVar2.f2040b;
                        this.f2118h = b0Var;
                        this.f2111a = set;
                        this.f2112b = strB;
                        this.f2114d = i25;
                        this.f2115e = i24;
                        this.f2116f = i18;
                        this.f2117g = 6;
                        objA = mVar19.a(this);
                        if (objA != aVar) {
                            v2Var = (v2) objA;
                            if (v2Var instanceof v2.b) {
                                preferredAiLanguage = ((d91.w) ((v2.b) v2Var).f47386a).getPreferredAiLanguage();
                                if (preferredAiLanguage != null) {
                                }
                                if (set == null) {
                                }
                                String str111 = preferredAiLanguage;
                                str = strB;
                                str2 = str111;
                                this.f2118h = b0Var;
                                this.f2111a = null;
                                this.f2112b = str;
                                this.f2113c = str2;
                                this.f2114d = i25;
                                this.f2115e = i24;
                                this.f2116f = i18;
                                this.f2117g = 9;
                                int i2115 = a91.a.f2038p;
                                eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                                aVar2.getClass();
                                if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                    a2Var = a2.SUBSCRIPTIONS;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                    if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                        objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                    } else {
                                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                    }
                                    if (objD != aVar) {
                                        i26 = i25;
                                        str3 = str;
                                        location = (Location) objD;
                                        y yVar1115 = aVar2.f2039a;
                                        if (str2 == null) {
                                            str2 = str3;
                                        }
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
                                        this.f2118h = b0Var;
                                        this.f2111a = null;
                                        this.f2112b = null;
                                        this.f2113c = null;
                                        this.f2114d = i26;
                                        this.f2115e = i24;
                                        this.f2116f = i18;
                                        this.f2117g = 10;
                                        objG = yVar1115.G(str2, d14, d15, this);
                                    }
                                } else {
                                    a2 a2Var1111 = a2.SUBSCRIPTIONS;
                                    i2.f36769a.getClass();
                                    i2.a.b(a2Var1111, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                                }
                                objD = null;
                                if (objD != aVar) {
                                    i26 = i25;
                                    str3 = str;
                                    location = (Location) objD;
                                    y yVar1116 = aVar2.f2039a;
                                    if (str2 == null) {
                                        str2 = str3;
                                    }
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
                                    this.f2118h = b0Var;
                                    this.f2111a = null;
                                    this.f2112b = null;
                                    this.f2113c = null;
                                    this.f2114d = i26;
                                    this.f2115e = i24;
                                    this.f2116f = i18;
                                    this.f2117g = 10;
                                    objG = yVar1116.G(str2, d14, d15, this);
                                }
                            } else {
                                if (v2Var instanceof v2.a) {
                                    u0.r();
                                    return null;
                                }
                                a2 a2Var1112 = a2.SUBSCRIPTIONS;
                                String strD9 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting selected language: ");
                                i2.f36769a.getClass();
                                i2.a.f(a2Var1112, "DefaultPersonalizedInsightsProvider", strD9);
                            }
                            preferredAiLanguage = null;
                            if (set == null) {
                            }
                            String str112 = preferredAiLanguage;
                            str = strB;
                            str2 = str112;
                            this.f2118h = b0Var;
                            this.f2111a = null;
                            this.f2112b = str;
                            this.f2113c = str2;
                            this.f2114d = i25;
                            this.f2115e = i24;
                            this.f2116f = i18;
                            this.f2117g = 9;
                            int i2116 = a91.a.f2038p;
                            eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                            aVar2.getClass();
                            if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                a2Var = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                    objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                } else {
                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                }
                                if (objD != aVar) {
                                    i26 = i25;
                                    str3 = str;
                                    location = (Location) objD;
                                    y yVar1117 = aVar2.f2039a;
                                    if (str2 == null) {
                                        str2 = str3;
                                    }
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
                                    this.f2118h = b0Var;
                                    this.f2111a = null;
                                    this.f2112b = null;
                                    this.f2113c = null;
                                    this.f2114d = i26;
                                    this.f2115e = i24;
                                    this.f2116f = i18;
                                    this.f2117g = 10;
                                    objG = yVar1117.G(str2, d14, d15, this);
                                }
                            } else {
                                a2 a2Var1113 = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var1113, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                            }
                            objD = null;
                            if (objD != aVar) {
                                i26 = i25;
                                str3 = str;
                                location = (Location) objD;
                                y yVar1118 = aVar2.f2039a;
                                if (str2 == null) {
                                    str2 = str3;
                                }
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
                                this.f2118h = b0Var;
                                this.f2111a = null;
                                this.f2112b = null;
                                this.f2113c = null;
                                this.f2114d = i26;
                                this.f2115e = i24;
                                this.f2116f = i18;
                                this.f2117g = 10;
                                objG = yVar1118.G(str2, d14, d15, this);
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 4:
                i18 = this.f2116f;
                i17 = this.f2115e;
                i14 = this.f2114d;
                o13.r.b(obj);
                if (((Boolean) aVar2.f2048j.f150540a.getValue()).booleanValue()) {
                    a2 a2Var20 = a2.DASHBOARD;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var20, "DefaultPersonalizedInsightsProvider", "Waiting for sync to finish before generating message; exiting generate task");
                    return Unit.INSTANCE;
                }
                i24 = i17;
                i25 = i14;
                m mVar110 = aVar2.f2040b;
                this.f2118h = b0Var;
                this.f2114d = i25;
                this.f2115e = i24;
                this.f2116f = i18;
                this.f2117g = 5;
                Set<String> set12 = m.f2145d;
                objC = mVar110.c(false, this);
                if (objC != aVar) {
                    set = (Set) objC;
                    strB = aVar2.f2043e.b();
                    m mVar111 = aVar2.f2040b;
                    this.f2118h = b0Var;
                    this.f2111a = set;
                    this.f2112b = strB;
                    this.f2114d = i25;
                    this.f2115e = i24;
                    this.f2116f = i18;
                    this.f2117g = 6;
                    objA = mVar111.a(this);
                    if (objA != aVar) {
                        v2Var = (v2) objA;
                        if (v2Var instanceof v2.b) {
                            preferredAiLanguage = ((d91.w) ((v2.b) v2Var).f47386a).getPreferredAiLanguage();
                            if (preferredAiLanguage != null) {
                            }
                            if (set == null) {
                            }
                            String str113 = preferredAiLanguage;
                            str = strB;
                            str2 = str113;
                            this.f2118h = b0Var;
                            this.f2111a = null;
                            this.f2112b = str;
                            this.f2113c = str2;
                            this.f2114d = i25;
                            this.f2115e = i24;
                            this.f2116f = i18;
                            this.f2117g = 9;
                            int i2117 = a91.a.f2038p;
                            eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                            aVar2.getClass();
                            if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                                a2Var = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                                if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                    objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                                } else {
                                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                                }
                                if (objD != aVar) {
                                    i26 = i25;
                                    str3 = str;
                                    location = (Location) objD;
                                    y yVar1119 = aVar2.f2039a;
                                    if (str2 == null) {
                                        str2 = str3;
                                    }
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
                                    this.f2118h = b0Var;
                                    this.f2111a = null;
                                    this.f2112b = null;
                                    this.f2113c = null;
                                    this.f2114d = i26;
                                    this.f2115e = i24;
                                    this.f2116f = i18;
                                    this.f2117g = 10;
                                    objG = yVar1119.G(str2, d14, d15, this);
                                }
                            } else {
                                a2 a2Var1114 = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.b(a2Var1114, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                            }
                            objD = null;
                            if (objD != aVar) {
                                i26 = i25;
                                str3 = str;
                                location = (Location) objD;
                                y yVar11110 = aVar2.f2039a;
                                if (str2 == null) {
                                    str2 = str3;
                                }
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
                                this.f2118h = b0Var;
                                this.f2111a = null;
                                this.f2112b = null;
                                this.f2113c = null;
                                this.f2114d = i26;
                                this.f2115e = i24;
                                this.f2116f = i18;
                                this.f2117g = 10;
                                objG = yVar11110.G(str2, d14, d15, this);
                            }
                        } else {
                            if (v2Var instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            a2 a2Var1115 = a2.SUBSCRIPTIONS;
                            String strD10 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting selected language: ");
                            i2.f36769a.getClass();
                            i2.a.f(a2Var1115, "DefaultPersonalizedInsightsProvider", strD10);
                        }
                        preferredAiLanguage = null;
                        if (set == null) {
                        }
                        String str114 = preferredAiLanguage;
                        str = strB;
                        str2 = str114;
                        this.f2118h = b0Var;
                        this.f2111a = null;
                        this.f2112b = str;
                        this.f2113c = str2;
                        this.f2114d = i25;
                        this.f2115e = i24;
                        this.f2116f = i18;
                        this.f2117g = 9;
                        int i2118 = a91.a.f2038p;
                        eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                        aVar2.getClass();
                        if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                            a2Var = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                            if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                            } else {
                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                            }
                            if (objD != aVar) {
                                i26 = i25;
                                str3 = str;
                                location = (Location) objD;
                                y yVar11111 = aVar2.f2039a;
                                if (str2 == null) {
                                    str2 = str3;
                                }
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
                                this.f2118h = b0Var;
                                this.f2111a = null;
                                this.f2112b = null;
                                this.f2113c = null;
                                this.f2114d = i26;
                                this.f2115e = i24;
                                this.f2116f = i18;
                                this.f2117g = 10;
                                objG = yVar11111.G(str2, d14, d15, this);
                            }
                        } else {
                            a2 a2Var1116 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var1116, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                        }
                        objD = null;
                        if (objD != aVar) {
                            i26 = i25;
                            str3 = str;
                            location = (Location) objD;
                            y yVar11112 = aVar2.f2039a;
                            if (str2 == null) {
                                str2 = str3;
                            }
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
                            this.f2118h = b0Var;
                            this.f2111a = null;
                            this.f2112b = null;
                            this.f2113c = null;
                            this.f2114d = i26;
                            this.f2115e = i24;
                            this.f2116f = i18;
                            this.f2117g = 10;
                            objG = yVar11112.G(str2, d14, d15, this);
                        }
                    }
                    break;
                }
                return aVar;
            case 5:
                i18 = this.f2116f;
                i24 = this.f2115e;
                i25 = this.f2114d;
                o13.r.b(obj);
                objC = obj;
                set = (Set) objC;
                strB = aVar2.f2043e.b();
                m mVar112 = aVar2.f2040b;
                this.f2118h = b0Var;
                this.f2111a = set;
                this.f2112b = strB;
                this.f2114d = i25;
                this.f2115e = i24;
                this.f2116f = i18;
                this.f2117g = 6;
                objA = mVar112.a(this);
                if (objA != aVar) {
                    v2Var = (v2) objA;
                    if (v2Var instanceof v2.b) {
                        preferredAiLanguage = ((d91.w) ((v2.b) v2Var).f47386a).getPreferredAiLanguage();
                        if (preferredAiLanguage != null) {
                        }
                        if (set == null) {
                        }
                        String str115 = preferredAiLanguage;
                        str = strB;
                        str2 = str115;
                        this.f2118h = b0Var;
                        this.f2111a = null;
                        this.f2112b = str;
                        this.f2113c = str2;
                        this.f2114d = i25;
                        this.f2115e = i24;
                        this.f2116f = i18;
                        this.f2117g = 9;
                        int i2119 = a91.a.f2038p;
                        eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                        aVar2.getClass();
                        if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                            a2Var = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                            if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                                objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                            } else {
                                i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                            }
                            if (objD != aVar) {
                                i26 = i25;
                                str3 = str;
                                location = (Location) objD;
                                y yVar11113 = aVar2.f2039a;
                                if (str2 == null) {
                                    str2 = str3;
                                }
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
                                this.f2118h = b0Var;
                                this.f2111a = null;
                                this.f2112b = null;
                                this.f2113c = null;
                                this.f2114d = i26;
                                this.f2115e = i24;
                                this.f2116f = i18;
                                this.f2117g = 10;
                                objG = yVar11113.G(str2, d14, d15, this);
                            }
                        } else {
                            a2 a2Var1117 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var1117, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                        }
                        objD = null;
                        if (objD != aVar) {
                            i26 = i25;
                            str3 = str;
                            location = (Location) objD;
                            y yVar11114 = aVar2.f2039a;
                            if (str2 == null) {
                                str2 = str3;
                            }
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
                            this.f2118h = b0Var;
                            this.f2111a = null;
                            this.f2112b = null;
                            this.f2113c = null;
                            this.f2114d = i26;
                            this.f2115e = i24;
                            this.f2116f = i18;
                            this.f2117g = 10;
                            objG = yVar11114.G(str2, d14, d15, this);
                        }
                    } else {
                        if (v2Var instanceof v2.a) {
                            u0.r();
                            return null;
                        }
                        a2 a2Var1118 = a2.SUBSCRIPTIONS;
                        String strD11 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting selected language: ");
                        i2.f36769a.getClass();
                        i2.a.f(a2Var1118, "DefaultPersonalizedInsightsProvider", strD11);
                    }
                    preferredAiLanguage = null;
                    if (set == null) {
                    }
                    String str116 = preferredAiLanguage;
                    str = strB;
                    str2 = str116;
                    this.f2118h = b0Var;
                    this.f2111a = null;
                    this.f2112b = str;
                    this.f2113c = str2;
                    this.f2114d = i25;
                    this.f2115e = i24;
                    this.f2116f = i18;
                    this.f2117g = 9;
                    int i21110 = a91.a.f2038p;
                    eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                    aVar2.getClass();
                    if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                        a2Var = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                        if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                            objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                        } else {
                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                        }
                        if (objD != aVar) {
                            i26 = i25;
                            str3 = str;
                            location = (Location) objD;
                            y yVar11115 = aVar2.f2039a;
                            if (str2 == null) {
                                str2 = str3;
                            }
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
                            this.f2118h = b0Var;
                            this.f2111a = null;
                            this.f2112b = null;
                            this.f2113c = null;
                            this.f2114d = i26;
                            this.f2115e = i24;
                            this.f2116f = i18;
                            this.f2117g = 10;
                            objG = yVar11115.G(str2, d14, d15, this);
                        }
                    } else {
                        a2 a2Var1119 = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var1119, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                    }
                    objD = null;
                    if (objD != aVar) {
                        i26 = i25;
                        str3 = str;
                        location = (Location) objD;
                        y yVar11116 = aVar2.f2039a;
                        if (str2 == null) {
                            str2 = str3;
                        }
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
                        this.f2118h = b0Var;
                        this.f2111a = null;
                        this.f2112b = null;
                        this.f2113c = null;
                        this.f2114d = i26;
                        this.f2115e = i24;
                        this.f2116f = i18;
                        this.f2117g = 10;
                        objG = yVar11116.G(str2, d14, d15, this);
                    }
                    break;
                }
                return aVar;
            case 6:
                i18 = this.f2116f;
                i24 = this.f2115e;
                i25 = this.f2114d;
                strB = this.f2112b;
                set = this.f2111a;
                o13.r.b(obj);
                objA = obj;
                v2Var = (v2) objA;
                if (v2Var instanceof v2.b) {
                    preferredAiLanguage = ((d91.w) ((v2.b) v2Var).f47386a).getPreferredAiLanguage();
                    if (preferredAiLanguage != null) {
                        break;
                    }
                    if (set == null) {
                        break;
                    }
                    String str117 = preferredAiLanguage;
                    str = strB;
                    str2 = str117;
                    this.f2118h = b0Var;
                    this.f2111a = null;
                    this.f2112b = str;
                    this.f2113c = str2;
                    this.f2114d = i25;
                    this.f2115e = i24;
                    this.f2116f = i18;
                    this.f2117g = 9;
                    int i21111 = a91.a.f2038p;
                    eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                    aVar2.getClass();
                    if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                        a2Var = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                        if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                            objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                        } else {
                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                        }
                        if (objD != aVar) {
                            i26 = i25;
                            str3 = str;
                            location = (Location) objD;
                            y yVar11117 = aVar2.f2039a;
                            if (str2 == null) {
                                str2 = str3;
                            }
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
                            this.f2118h = b0Var;
                            this.f2111a = null;
                            this.f2112b = null;
                            this.f2113c = null;
                            this.f2114d = i26;
                            this.f2115e = i24;
                            this.f2116f = i18;
                            this.f2117g = 10;
                            objG = yVar11117.G(str2, d14, d15, this);
                            break;
                        }
                        return aVar;
                    }
                    a2 a2Var11110 = a2.SUBSCRIPTIONS;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var11110, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                    objD = null;
                    if (objD != aVar) {
                        i26 = i25;
                        str3 = str;
                        location = (Location) objD;
                        y yVar11118 = aVar2.f2039a;
                        if (str2 == null) {
                            str2 = str3;
                        }
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
                        this.f2118h = b0Var;
                        this.f2111a = null;
                        this.f2112b = null;
                        this.f2113c = null;
                        this.f2114d = i26;
                        this.f2115e = i24;
                        this.f2116f = i18;
                        this.f2117g = 10;
                        objG = yVar11118.G(str2, d14, d15, this);
                        break;
                    }
                    return aVar;
                }
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                a2 a2Var11111 = a2.SUBSCRIPTIONS;
                String strD12 = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error getting selected language: ");
                i2.f36769a.getClass();
                i2.a.f(a2Var11111, "DefaultPersonalizedInsightsProvider", strD12);
                preferredAiLanguage = null;
                if (set == null) {
                    break;
                }
                String str118 = preferredAiLanguage;
                str = strB;
                str2 = str118;
                this.f2118h = b0Var;
                this.f2111a = null;
                this.f2112b = str;
                this.f2113c = str2;
                this.f2114d = i25;
                this.f2115e = i24;
                this.f2116f = i18;
                this.f2117g = 9;
                int i21112 = a91.a.f2038p;
                eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                aVar2.getClass();
                if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                    a2Var = a2.SUBSCRIPTIONS;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                    if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                        objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                    } else {
                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                    }
                    if (objD != aVar) {
                        i26 = i25;
                        str3 = str;
                        location = (Location) objD;
                        y yVar11119 = aVar2.f2039a;
                        if (str2 == null) {
                            str2 = str3;
                        }
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
                        this.f2118h = b0Var;
                        this.f2111a = null;
                        this.f2112b = null;
                        this.f2113c = null;
                        this.f2114d = i26;
                        this.f2115e = i24;
                        this.f2116f = i18;
                        this.f2117g = 10;
                        objG = yVar11119.G(str2, d14, d15, this);
                        break;
                    }
                    return aVar;
                }
                a2 a2Var11112 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.b(a2Var11112, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                objD = null;
                if (objD != aVar) {
                    i26 = i25;
                    str3 = str;
                    location = (Location) objD;
                    y yVar111110 = aVar2.f2039a;
                    if (str2 == null) {
                        str2 = str3;
                    }
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
                    this.f2118h = b0Var;
                    this.f2111a = null;
                    this.f2112b = null;
                    this.f2113c = null;
                    this.f2114d = i26;
                    this.f2115e = i24;
                    this.f2116f = i18;
                    this.f2117g = 10;
                    objG = yVar111110.G(str2, d14, d15, this);
                    break;
                }
                return aVar;
            case 7:
                i18 = this.f2116f;
                i24 = this.f2115e;
                i25 = this.f2114d;
                str2 = this.f2113c;
                String str20 = this.f2112b;
                Set set13 = this.f2111a;
                o13.r.b(obj);
                str = str20;
                objB = obj;
                set2 = (Set) objB;
                if (set2 != null) {
                    this.f2118h = b0Var;
                    this.f2111a = null;
                    this.f2112b = str;
                    this.f2113c = str2;
                    this.f2114d = i25;
                    this.f2115e = i24;
                    this.f2116f = i18;
                    this.f2117g = 9;
                    int i21113 = a91.a.f2038p;
                    eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                    aVar2.getClass();
                    if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                        a2Var = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                        if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                            objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                        } else {
                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                        }
                        if (objD != aVar) {
                            i26 = i25;
                            str3 = str;
                            location = (Location) objD;
                            y yVar111111 = aVar2.f2039a;
                            if (str2 == null) {
                                str2 = str3;
                            }
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
                            this.f2118h = b0Var;
                            this.f2111a = null;
                            this.f2112b = null;
                            this.f2113c = null;
                            this.f2114d = i26;
                            this.f2115e = i24;
                            this.f2116f = i18;
                            this.f2117g = 10;
                            objG = yVar111111.G(str2, d14, d15, this);
                        }
                    } else {
                        a2 a2Var11113 = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var11113, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                    }
                    objD = null;
                    if (objD != aVar) {
                        i26 = i25;
                        str3 = str;
                        location = (Location) objD;
                        y yVar111112 = aVar2.f2039a;
                        if (str2 == null) {
                            str2 = str3;
                        }
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
                        this.f2118h = b0Var;
                        this.f2111a = null;
                        this.f2112b = null;
                        this.f2113c = null;
                        this.f2114d = i26;
                        this.f2115e = i24;
                        this.f2116f = i18;
                        this.f2117g = 10;
                        objG = yVar111112.G(str2, d14, d15, this);
                    }
                    break;
                } else {
                    this.f2118h = b0Var;
                    this.f2111a = null;
                    this.f2112b = str;
                    this.f2113c = str2;
                    this.f2114d = i25;
                    this.f2115e = i24;
                    this.f2116f = i18;
                    this.f2117g = 9;
                    int i21114 = a91.a.f2038p;
                    eVar = (mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null);
                    aVar2.getClass();
                    if (eVar.b("DefaultPersonalizedInsightsProvider")) {
                        a2Var = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission is already granted");
                        if (eVar.a("DefaultPersonalizedInsightsProvider")) {
                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location service is already enabled; returning current location");
                            objD = eVar.d("DefaultPersonalizedInsightsProvider", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
                        } else {
                            i2.a.b(a2Var, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location is disabled");
                        }
                        if (objD != aVar) {
                            i26 = i25;
                            str3 = str;
                            location = (Location) objD;
                            y yVar111113 = aVar2.f2039a;
                            if (str2 == null) {
                                str2 = str3;
                            }
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
                            this.f2118h = b0Var;
                            this.f2111a = null;
                            this.f2112b = null;
                            this.f2113c = null;
                            this.f2114d = i26;
                            this.f2115e = i24;
                            this.f2116f = i18;
                            this.f2117g = 10;
                            objG = yVar111113.G(str2, d14, d15, this);
                        }
                    } else {
                        a2 a2Var11114 = a2.SUBSCRIPTIONS;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var11114, "DefaultPersonalizedInsightsProvider", "[requestCurrentLocation] location permission not granted");
                    }
                    objD = null;
                    if (objD != aVar) {
                        i26 = i25;
                        str3 = str;
                        location = (Location) objD;
                        y yVar111114 = aVar2.f2039a;
                        if (str2 == null) {
                            str2 = str3;
                        }
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
                        this.f2118h = b0Var;
                        this.f2111a = null;
                        this.f2112b = null;
                        this.f2113c = null;
                        this.f2114d = i26;
                        this.f2115e = i24;
                        this.f2116f = i18;
                        this.f2117g = 10;
                        objG = yVar111114.G(str2, d14, d15, this);
                    }
                    break;
                }
                return aVar;
            case 8:
                Set set14 = this.f2111a;
                o13.r.b(obj);
                return Unit.INSTANCE;
            case 9:
                i18 = this.f2116f;
                int i34 = this.f2115e;
                i26 = this.f2114d;
                String str21 = this.f2113c;
                str3 = this.f2112b;
                Set set15 = this.f2111a;
                o13.r.b(obj);
                str2 = str21;
                i24 = i34;
                objD = obj;
                location = (Location) objD;
                y yVar111115 = aVar2.f2039a;
                if (str2 == null) {
                    str2 = str3;
                }
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
                this.f2118h = b0Var;
                this.f2111a = null;
                this.f2112b = null;
                this.f2113c = null;
                this.f2114d = i26;
                this.f2115e = i24;
                this.f2116f = i18;
                this.f2117g = 10;
                objG = yVar111115.G(str2, d14, d15, this);
                break;
            case 10:
                Set set16 = this.f2111a;
                o13.r.b(obj);
                objG = obj;
                long jLongValue = ((Number) objG).longValue();
                if (jLongValue > 0) {
                    Long l14 = new Long(jLongValue);
                    int i35 = a91.a.f2038p;
                    aVar2.getClass();
                    aVar2.f2046h = ge1.b.T(b0Var, null, null, new e(l14, aVar2, null), 3);
                }
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
