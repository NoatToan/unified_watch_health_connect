package cu2;

import android.location.Location;
import android.os.Looper;
import android.os.SystemClock;
import c22.t;
import com.garmin.net.weather.exception.FailedHttpRequestException;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import o53.b0;
import o53.i0;
import o53.s0;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lfu2/h;", "<anonymous>", "(Lo53/b0;)Lfu2/h;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "com.garmin.net.weather.WeatherService$getWeather$2", f = "WeatherService.kt", l = {225, 226, 227, 228}, m = "invokeSuspend")
public final class f extends v13.i implements p<b0, t13.d<? super fu2.h>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f55741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f55742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f55743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f55744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f55747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f55748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f55749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fu2.g f55750j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lgu2/a;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "com.garmin.net.weather.WeatherService$getWeather$2$alertsDeferred$1", f = "WeatherService.kt", l = {213}, m = "invokeSuspend")
    public static final class a extends v13.i implements p<b0, t13.d<? super List<? extends gu2.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f55751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fu2.g f55752b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fu2.g gVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f55752b = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f55752b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super List<? extends gu2.a>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            fu2.f fVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f55751a;
            if (i14 == 0) {
                r.b(obj);
                fu2.g gVar = this.f55752b;
                if (!gVar.f73594h || (fVar = gVar.f73587a) == fu2.f.CHINA || fVar == fu2.f.CHINA_TEST || fVar == fu2.f.TEST_SSO_CHINA) {
                    return j0.f134944a;
                }
                h hVar = h.f55758a;
                this.f55751a = 1;
                hVar.getClass();
                x53.c cVar = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new cu2.b(gVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            List list = (List) obj;
            return list == null ? j0.f134944a : list;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lgu2/b;", "<anonymous>", "(Lo53/b0;)Lgu2/b;"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "com.garmin.net.weather.WeatherService$getWeather$2$conditionsDeferred$1", f = "WeatherService.kt", l = {218}, m = "invokeSuspend")
    public static final class b extends v13.i implements p<b0, t13.d<? super gu2.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f55753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fu2.g f55754b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(fu2.g gVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f55754b = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f55754b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super gu2.b> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f55753a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            h hVar = h.f55758a;
            this.f55753a = 1;
            hVar.getClass();
            x53.c cVar = s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new cu2.c(this.f55754b, true, null), this);
            return objE0 == aVar ? aVar : objE0;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lgu2/c;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    @v13.e(c = "com.garmin.net.weather.WeatherService$getWeather$2$dailyForecastDeferred$1", f = "WeatherService.kt", l = {219}, m = "invokeSuspend")
    public static final class c extends v13.i implements p<b0, t13.d<? super List<? extends gu2.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f55755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fu2.g f55756b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fu2.g gVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f55756b = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f55756b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super List<? extends gu2.c>> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f55755a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            h hVar = h.f55758a;
            this.f55755a = 1;
            hVar.getClass();
            x53.c cVar = s0.f129406a;
            Object objE0 = ge1.b.e0(x53.b.f189152a, new d(this.f55756b, null), this);
            return objE0 == aVar ? aVar : objE0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(fu2.g gVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f55750j = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f55750j, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super fu2.h> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:104:0x02db  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:110:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:111:0x02f9  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        boolean z14;
        i0 i0VarJ;
        i0 i0VarJ2;
        long jElapsedRealtime;
        Object objC;
        Location location;
        long j8;
        int i14;
        int i15;
        List<gu2.a> list;
        ArrayList arrayList;
        boolean z15;
        gu2.b bVar;
        Object objAwait;
        i0 i0Var;
        List list2;
        Object objE0;
        Location location2;
        List list3;
        i0 i0Var2;
        gu2.b bVar2;
        int i16;
        List list4;
        Object objAwait2;
        int i17;
        long j14;
        int i18;
        List list5;
        gu2.b bVar3;
        Location location3;
        boolean z16;
        boolean z17;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i19 = this.f55749i;
        if (i19 == 0) {
            r.b(obj);
            h.f55758a.getClass();
            if (h.f55761d == null) {
                h.f().error("getWeather: WeatherService is not initialized");
                com.nimbusds.jose.shaded.gson.internal.a.t("getWeather: WeatherService is not initialized");
                return null;
            }
            if (s.g(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                h.f().error("getWeather: cannot be run on main thread");
                com.nimbusds.jose.shaded.gson.internal.a.t("getWeather: cannot be run on main thread");
                return null;
            }
            Location location4 = this.f55750j.f73588b;
            if (!h.i(location4)) {
                String strD = t.d(location4.getLongitude(), "]", com.airbnb.lottie.parser.moshi.a.a("getWeather: invalid location -> lat [", location4.getLatitude(), "], long ["));
                h.f().error(strD);
                vb.h.s(strD);
                return null;
            }
            cu2.a aVar2 = h.f55761d;
            aVar2.getClass();
            Location location5 = this.f55750j.f73588b;
            location5.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            synchronized (aVar2.f55734f) {
                try {
                    fu2.h hVar = aVar2.f55733e;
                    if (hVar != null) {
                        if (aVar2.b(jElapsedRealtime2, hVar.f73597c, location5, hVar.f73599e)) {
                            aVar2.f55733e = null;
                        } else {
                            gu2.b bVar4 = hVar.f73600f;
                            bVar4.getClass();
                            if (bVar4.f79103a + ((long) aVar2.f55731c) < jElapsedRealtime2) {
                                com.airbnb.lottie.animation.keyframe.a.r("cache entry for current conditions older ", aVar2.f55731c, " ms (EXPIRED)", aVar2.a());
                                z15 = true;
                            } else {
                                com.airbnb.lottie.animation.keyframe.a.r("cache entry for current conditions has not passed ", aVar2.f55731c, " ms expiration (NOT EXPIRED)", aVar2.a());
                                z15 = false;
                            }
                            fu2.h hVar2 = aVar2.f55733e;
                            if (z15) {
                                hVar2.getClass();
                                hVar2.f73600f = null;
                            } else {
                                hVar2.getClass();
                                hVar2.f73596b = true;
                            }
                            fu2.h hVar3 = aVar2.f55733e;
                            hVar3.getClass();
                            hVar3.f73595a = true;
                        }
                    }
                    fu2.h hVar4 = aVar2.f55733e;
                    if (hVar4 != null && (list = hVar4.f73603i) != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        ArrayList arrayList2 = null;
                        for (gu2.a aVar3 : list) {
                            Integer num = aVar3.f79098f;
                            if (num != null) {
                                cu2.a aVar4 = aVar2;
                                if (num.intValue() >= jCurrentTimeMillis) {
                                    aVar2 = aVar4;
                                    arrayList = arrayList2;
                                    if (aVar2.b(jElapsedRealtime2, aVar3.f79093a, location5, aVar3.f79094b)) {
                                        arrayList2 = arrayList;
                                    } else {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList2 = arrayList;
                                        arrayList2.add(aVar3);
                                    }
                                } else {
                                    aVar2 = aVar4;
                                    arrayList = arrayList2;
                                    arrayList2 = arrayList;
                                }
                            } else {
                                arrayList = arrayList2;
                                arrayList2 = arrayList;
                            }
                        }
                        ArrayList arrayList3 = arrayList2;
                        if (arrayList3 != null) {
                            arrayList3.trimToSize();
                        }
                        fu2.h hVar5 = aVar2.f55733e;
                        hVar5.getClass();
                        hVar5.f73603i = arrayList3;
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            fu2.h hVar6 = aVar2.f55733e;
            if (hVar6 == null) {
                z14 = false;
            } else {
                if (hVar6.f73600f != null) {
                    return hVar6;
                }
                z14 = true;
            }
            if (z14) {
                h.c(h.f55758a, h.f55763f);
            } else {
                h.c(h.f55758a, h.f55762e);
            }
            if (hVar6 == null) {
                hVar6 = new fu2.h(false, false, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime(), this.f55750j.f73588b, null, null, null, null, 483, null);
            }
            if (z14) {
                try {
                    fu2.g gVar = this.f55750j;
                    gu2.b bVarB = new eu2.c(gVar.f73587a, gVar.f73590d, gVar.f73591e, gVar.f73588b, gVar.f73589c).b();
                    h hVar7 = h.f55758a;
                    cu2.a aVar5 = h.f55761d;
                    aVar5.getClass();
                    h.b(hVar7, aVar5.f55731c / DateTimeConstants.MILLIS_PER_MINUTE);
                    hVar6.f73598d = SystemClock.elapsedRealtime();
                    hVar6.f73600f = bVarB;
                    return hVar6;
                } catch (FailedHttpRequestException e4) {
                    h.b(h.f55758a, h.f55764g);
                    throw e4;
                } catch (Exception e14) {
                    h.b(h.f55758a, h.f55764g);
                    throw e14;
                }
            }
            u53.d dVar = h.f55760c;
            i0VarJ = ge1.b.j(dVar, null, null, new a(this.f55750j, null), 3);
            o53.j0 j0VarJ = ge1.b.j(dVar, null, null, new b(this.f55750j, null), 3);
            i0VarJ2 = ge1.b.j(dVar, null, null, new c(this.f55750j, null), 3);
            jElapsedRealtime = SystemClock.elapsedRealtime();
            Location location6 = this.f55750j.f73588b;
            this.f55741a = i0VarJ;
            this.f55742b = i0VarJ2;
            this.f55743c = location6;
            this.f55745e = 0;
            this.f55746f = 0;
            this.f55747g = jElapsedRealtime;
            this.f55748h = jElapsedRealtime;
            this.f55749i = 1;
            objC = j0VarJ.C(this);
            u13.a aVar6 = u13.a.COROUTINE_SUSPENDED;
            if (objC != aVar) {
                location = location6;
                j8 = jElapsedRealtime;
                i14 = 0;
                i15 = 0;
            }
            return aVar;
        }
        if (i19 == 1) {
            long j15 = this.f55748h;
            j8 = this.f55747g;
            i14 = this.f55746f;
            i15 = this.f55745e;
            location = (Location) this.f55743c;
            i0VarJ2 = (i0) this.f55742b;
            i0VarJ = (i0) this.f55741a;
            r.b(obj);
            jElapsedRealtime = j15;
            objC = obj;
        } else {
            if (i19 == 2) {
                long j16 = this.f55748h;
                j8 = this.f55747g;
                int i24 = this.f55746f;
                int i25 = this.f55745e;
                gu2.b bVar5 = (gu2.b) this.f55743c;
                location = (Location) this.f55742b;
                i0Var = (i0) this.f55741a;
                r.b(obj);
                i14 = i24;
                jElapsedRealtime = j16;
                bVar = bVar5;
                i15 = i25;
                objAwait = obj;
                list2 = (List) objAwait;
                h hVar8 = h.f55758a;
                fu2.g gVar2 = this.f55750j;
                this.f55741a = i0Var;
                this.f55742b = location;
                this.f55743c = bVar;
                this.f55744d = list2;
                this.f55745e = i15;
                this.f55746f = i14;
                this.f55747g = j8;
                this.f55748h = jElapsedRealtime;
                this.f55749i = 3;
                hVar8.getClass();
                x53.c cVar = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new e(gVar2, null), this);
                if (objE0 != aVar) {
                    location2 = location;
                    list3 = list2;
                    i0Var2 = i0Var;
                    bVar2 = bVar;
                    i16 = i14;
                    list4 = (List) objE0;
                    this.f55741a = location2;
                    this.f55742b = bVar2;
                    this.f55743c = list3;
                    this.f55744d = list4;
                    this.f55745e = i15;
                    this.f55746f = i16;
                    this.f55747g = j8;
                    this.f55748h = jElapsedRealtime;
                    this.f55749i = 4;
                    objAwait2 = i0Var2.await(this);
                    if (objAwait2 != aVar) {
                        i17 = i16;
                        j14 = jElapsedRealtime;
                        i18 = i15;
                        list5 = list3;
                        bVar3 = bVar2;
                        location3 = location2;
                    }
                }
                return aVar;
            }
            if (i19 == 3) {
                long j17 = this.f55748h;
                long j18 = this.f55747g;
                i16 = this.f55746f;
                int i26 = this.f55745e;
                list3 = this.f55744d;
                bVar2 = (gu2.b) this.f55743c;
                location2 = (Location) this.f55742b;
                i0Var2 = (i0) this.f55741a;
                r.b(obj);
                i15 = i26;
                jElapsedRealtime = j17;
                j8 = j18;
                objE0 = obj;
                list4 = (List) objE0;
                this.f55741a = location2;
                this.f55742b = bVar2;
                this.f55743c = list3;
                this.f55744d = list4;
                this.f55745e = i15;
                this.f55746f = i16;
                this.f55747g = j8;
                this.f55748h = jElapsedRealtime;
                this.f55749i = 4;
                objAwait2 = i0Var2.await(this);
                if (objAwait2 != aVar) {
                    i17 = i16;
                    j14 = jElapsedRealtime;
                    i18 = i15;
                    list5 = list3;
                    bVar3 = bVar2;
                    location3 = location2;
                }
                return aVar;
            }
            if (i19 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j19 = this.f55748h;
            j8 = this.f55747g;
            i17 = this.f55746f;
            i18 = this.f55745e;
            list4 = this.f55744d;
            List list6 = (List) this.f55743c;
            gu2.b bVar6 = (gu2.b) this.f55742b;
            Location location7 = (Location) this.f55741a;
            r.b(obj);
            j14 = j19;
            list5 = list6;
            bVar3 = bVar6;
            location3 = location7;
            objAwait2 = obj;
        }
        long j24 = j8;
        List list7 = list4;
        List list8 = (List) objAwait2;
        if (i18 != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (i17 != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        fu2.h hVar9 = new fu2.h(z16, z17, j24, j14, location3, bVar3, list5, list7, list8, 3, null);
        h.f55758a.getClass();
        ge1.b.T(h.f55760c, null, null, new i(hVar9, null), 3);
        return hVar9;
        bVar = (gu2.b) objC;
        this.f55741a = i0VarJ;
        this.f55742b = location;
        this.f55743c = bVar;
        this.f55745e = i15;
        this.f55746f = i14;
        this.f55747g = j8;
        this.f55748h = jElapsedRealtime;
        this.f55749i = 2;
        objAwait = i0VarJ2.await(this);
        if (objAwait != aVar) {
            i0Var = i0VarJ;
            list2 = (List) objAwait;
            h hVar10 = h.f55758a;
            fu2.g gVar3 = this.f55750j;
            this.f55741a = i0Var;
            this.f55742b = location;
            this.f55743c = bVar;
            this.f55744d = list2;
            this.f55745e = i15;
            this.f55746f = i14;
            this.f55747g = j8;
            this.f55748h = jElapsedRealtime;
            this.f55749i = 3;
            hVar10.getClass();
            x53.c cVar2 = s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new e(gVar3, null), this);
            if (objE0 != aVar) {
                location2 = location;
                list3 = list2;
                i0Var2 = i0Var;
                bVar2 = bVar;
                i16 = i14;
                list4 = (List) objE0;
                this.f55741a = location2;
                this.f55742b = bVar2;
                this.f55743c = list3;
                this.f55744d = list4;
                this.f55745e = i15;
                this.f55746f = i16;
                this.f55747g = j8;
                this.f55748h = jElapsedRealtime;
                this.f55749i = 4;
                objAwait2 = i0Var2.await(this);
                if (objAwait2 != aVar) {
                    i17 = i16;
                    j14 = jElapsedRealtime;
                    i18 = i15;
                    list5 = list3;
                    bVar3 = bVar2;
                    location3 = location2;
                    long j25 = j8;
                    List list9 = list4;
                    List list10 = (List) objAwait2;
                    if (i18 != 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i17 != 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    fu2.h hVar11 = new fu2.h(z16, z17, j25, j14, location3, bVar3, list5, list9, list10, 3, null);
                    h.f55758a.getClass();
                    ge1.b.T(h.f55760c, null, null, new i(hVar11, null), 3);
                    return hVar11;
                }
            }
        }
        return aVar;
    }
}
