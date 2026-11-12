package ml0;

import android.location.Location;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.l3;
import c22.m3;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import hl0.u;
import hl0.w;
import hl0.x;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.t;
import o53.b0;
import o53.c2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lml0/p;", "Landroidx/lifecycle/u1;", "Lhl0/x;", "searchGolfCoursesWithDownloadStatusUseCase", "Lhl0/u;", "initiateGolfCourseDownloadUseCase", "Lmv0/e;", "locationProvider", "Lf12/l;", "userSettings", "<init>", "(Lhl0/x;Lhl0/u;Lmv0/e;Lf12/l;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f119260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f119261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mv0.e f119262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.l f119263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f119264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Location f119265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f119266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f119267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c2 f119268i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m02.b<Integer, o13.p<fl0.a, il0.c>> f119269j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f119270k;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ml0/p$a", "Lol0/b;", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ol0.b {
        public a() {
        }

        @Override // ol0.b
        public final void databaseContentChanged(ol0.a aVar) {
            aVar.getClass();
            p pVar = p.this;
            p2 p2Var = pVar.f119266g;
            l lVar = (l) p2Var.getValue();
            List<il0.a> list = ((l) pVar.f119266g.getValue()).f119246c;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            for (il0.a aVarA : list) {
                if (aVarA.getGlobalLayoutId() == aVar.f132830a) {
                    il0.c.a aVar2 = il0.c.f93960a;
                    Integer numValueOf = Integer.valueOf(aVar.f132831b);
                    aVar2.getClass();
                    aVarA = il0.a.a(aVarA, il0.c.a.b(numValueOf));
                }
                arrayList.add(aVarA);
            }
            p2Var.k(null, l.a(lVar, false, null, arrayList, false, 0, 123));
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "nextPage", "Lo13/q;", "", "Lo13/p;", "Lfl0/a;", "Lil0/c;", "<anonymous>", "(I)Lo13/q;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.search.SearchGolfCoursesViewModel$paginator$2", f = "SearchGolfCoursesViewModel.kt", l = {57}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<Integer, t13.d<? super o13.q<? extends List<? extends o13.p<? extends fl0.a, ? extends il0.c>>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f119273b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = p.this.new b(dVar);
            bVar.f119273b = ((Number) obj).intValue();
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(Integer num, t13.d<? super o13.q<? extends List<? extends o13.p<? extends fl0.a, ? extends il0.c>>>> dVar) {
            return ((b) create(Integer.valueOf(num.intValue()), dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i14 = this.f119273b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f119272a;
            if (i15 == 0) {
                o13.r.b(obj);
                int i16 = o13.q.f128596b;
                p pVar = p.this;
                x xVar = pVar.f119260a;
                String str = ((l) pVar.f119267h.f150540a.getValue()).f119245b;
                Location location = pVar.f119265f;
                this.f119273b = i14;
                this.f119272a = 1;
                obj = ge1.b.e0(xVar.f84353c, new w(xVar, location, str, 25, i14, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return o13.q.a(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lo13/p;", "Lfl0/a;", "Lil0/c;", "it", "", "<anonymous>", "(Ljava/util/List;)I"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.search.SearchGolfCoursesViewModel$paginator$3", f = "SearchGolfCoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<List<? extends o13.p<? extends fl0.a, ? extends il0.c>>, t13.d<? super Integer>, Object> {
        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(List<? extends o13.p<? extends fl0.a, ? extends il0.c>> list, t13.d<? super Integer> dVar) {
            return ((c) create(list, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return new Integer(((l) p.this.f119266g.getValue()).f119249f + 1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.search.SearchGolfCoursesViewModel$paginator$4", f = "SearchGolfCoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<Throwable, t13.d<? super Unit>, Object> {
        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(Throwable th3, t13.d<? super Unit> dVar) {
            return ((d) create(th3, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p2 p2Var = p.this.f119266g;
            p2Var.k(null, l.a((l) p2Var.getValue(), false, null, null, false, 0, 119));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lo13/p;", "Lfl0/a;", "Lil0/c;", FirebaseAnalytics.Param.ITEMS, "", "newKey", "", "<anonymous>", "(Ljava/util/List;I)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.search.SearchGolfCoursesViewModel$paginator$5", f = "SearchGolfCoursesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.q<List<? extends o13.p<? extends fl0.a, ? extends il0.c>>, Integer, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ List f119277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f119278b;

        public e(t13.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(List<? extends o13.p<? extends fl0.a, ? extends il0.c>> list, Integer num, t13.d<? super Unit> dVar) {
            int iIntValue = num.intValue();
            e eVar = p.this.new e(dVar);
            eVar.f119277a = list;
            eVar.f119278b = iIntValue;
            return eVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            p pVar;
            List list = this.f119277a;
            int i14 = this.f119278b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                Object aVar2 = null;
                pVar = p.this;
                if (!zHasNext) {
                    break;
                }
                o13.p pVar2 = (o13.p) it.next();
                fl0.a aVar3 = (fl0.a) pVar2.f128594a;
                il0.c cVar = (il0.c) pVar2.f128595b;
                m3 m3Var = (m3) pVar.f119264e.getValue();
                aVar3.getClass();
                m3Var.getClass();
                String name = aVar3.getName();
                Integer globalLayoutId = aVar3.getGlobalLayoutId();
                if (name != null && globalLayoutId != null) {
                    int iIntValue = globalLayoutId.intValue();
                    Integer distanceFromOrigin = aVar3.getDistanceFromOrigin();
                    if (distanceFromOrigin != null) {
                        int iIntValue2 = distanceFromOrigin.intValue();
                        l3.a aVar4 = l3.f23124b;
                        DecimalFormat decimalFormat = l3.f23137o;
                        aVar4.getClass();
                        aVar2 = l3.a.R(null, iIntValue2, m3Var, decimalFormat, false, null);
                    }
                    String str = aVar2;
                    int i15 = m3Var.f23160a ? R.string.lbl_km : R.string.lbl_mile;
                    Integer buildId = aVar3.getBuildId();
                    String street = aVar3.getStreet();
                    String city = aVar3.getCity();
                    String str2 = aVar3.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String();
                    String postalCode = aVar3.getPostalCode();
                    String country = aVar3.getCountry();
                    Integer latitude = aVar3.getLatitude();
                    Integer longitude = aVar3.getLongitude();
                    String webSite = aVar3.getWebSite();
                    String str3 = aVar3.getCom.google.android.gms.common.Scopes.EMAIL java.lang.String();
                    String phone = aVar3.getPhone();
                    String phoneExtension = aVar3.getPhoneExtension();
                    String designer = aVar3.getDesigner();
                    String yearDesigned = aVar3.getYearDesigned();
                    Integer numberOfHoles = aVar3.getNumberOfHoles();
                    il0.d.f93967d.getClass();
                    il0.d dVar = il0.d.f93969f.get(aVar3.getMembershipType());
                    if (dVar == null) {
                        dVar = il0.d.NO_VALUE;
                    }
                    aVar2 = new il0.a(iIntValue, name, cVar, str, i15, buildId, street, city, str2, postalCode, country, latitude, longitude, webSite, str3, phone, phoneExtension, designer, yearDesigned, numberOfHoles, dVar, aVar3.getVersion());
                }
                if (aVar2 != null) {
                    arrayList.add(aVar2);
                }
            }
            p2 p2Var = pVar.f119266g;
            p2Var.k(null, l.a((l) p2Var.getValue(), false, null, h0.C0(((l) pVar.f119266g.getValue()).f119246c, arrayList), list.isEmpty() || list.size() < 25, i14, 75));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.search.SearchGolfCoursesViewModel$searchNearbyGolfCourses$1", f = "SearchGolfCoursesViewModel.kt", l = {SyslogConstants.LOG_LOCAL1, 137, 141}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f119280a;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0060  */
        /* JADX WARN: Code duplicated, block: B:25:0x0069  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        
            if (r2.a(r17) == r1) goto L24;
         */
        /* JADX WARN: Type inference failed for: r5v1, types: [Key] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f119280a;
            p pVar = p.this;
            if (i14 == 0) {
                o13.r.b(obj);
                if (pVar.f119265f == null) {
                    this.f119280a = 1;
                    if (p.x4(pVar, this) != aVar) {
                    }
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                o13.r.b(obj);
                pVar.f119266g.k(null, new l(false, null, null, false, false, 0, k.LOCATION, 63, null));
                m02.b<Integer, o13.p<fl0.a, il0.c>> bVar = pVar.f119269j;
                bVar.f115752g = bVar.f115746a;
                if (pVar.f119265f != null) {
                    this.f119280a = 3;
                } else {
                    p2 p2Var = pVar.f119266g;
                    p2Var.k(null, l.a((l) p2Var.getValue(), false, null, null, true, 0, 110));
                }
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            this.f119280a = 2;
            if (gg.b.U(this) != aVar) {
                pVar.f119266g.k(null, new l(false, null, null, false, false, 0, k.LOCATION, 63, null));
                m02.b<Integer, o13.p<fl0.a, il0.c>> bVar2 = pVar.f119269j;
                bVar2.f115752g = bVar2.f115746a;
                if (pVar.f119265f != null) {
                    this.f119280a = 3;
                } else {
                    p2 p2Var2 = pVar.f119266g;
                    p2Var2.k(null, l.a((l) p2Var2.getValue(), false, null, null, true, 0, 110));
                }
                return Unit.INSTANCE;
            }
            return aVar;
        }
    }

    public p(x xVar, u uVar, mv0.e eVar, f12.l lVar) {
        xVar.getClass();
        uVar.getClass();
        eVar.getClass();
        lVar.getClass();
        this.f119260a = xVar;
        this.f119261b = uVar;
        this.f119262c = eVar;
        this.f119263d = lVar;
        this.f119264e = o13.m.b(new ml0.d(this, 1));
        p2 p2VarA = q2.a(new l(false, null, null, false, false, 0, null, 127, null));
        this.f119266g = p2VarA;
        this.f119267h = r53.s.d(p2VarA);
        this.f119269j = new m02.b<>(Integer.valueOf(((l) p2VarA.getValue()).f119249f), new ml0.c(this, 2), new b(null), new c(null), new d(null), new e(null));
        t tVarB = o13.m.b(new ml0.d(this, 2));
        this.f119270k = tVarB;
        oi2.a.C2513a c2513a = oi2.a.f132270a;
        a aVar = (a) tVarB.getValue();
        c2513a.getClass();
        oi2.a.C2513a.b(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object x4(p pVar, v13.c cVar) throws Throwable {
        m mVar;
        p pVar2;
        mv0.e eVar = pVar.f119262c;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f119255e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f119255e = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(pVar, cVar);
            }
        } else {
            mVar = new m(pVar, cVar);
        }
        Object objE0 = mVar.f119253c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f119255e;
        Location location = null;
        if (i15 != 0) {
            if (i15 == 1) {
                pVar2 = mVar.f119251a;
                o13.r.b(objE0);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pVar = mVar.f119252b;
                o13.r.b(objE0);
            }
            location = (Location) objE0;
            pVar.f119265f = location;
            return Unit.INSTANCE;
        }
        o13.r.b(objE0);
        if (eVar.b("SearchGolfCoursesViewModel")) {
            if (eVar.b("SearchGolfCoursesViewModel")) {
                x53.c cVar2 = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                n nVar = new n(pVar, null);
                mVar.f119251a = pVar;
                mVar.f119255e = 1;
                objE0 = ge1.b.e0(bVar, nVar, mVar);
                if (objE0 != aVar) {
                    pVar2 = pVar;
                }
                return aVar;
            }
            pVar.f119265f = location;
        }
        return Unit.INSTANCE;
        Location location2 = (Location) objE0;
        if (location2 == null) {
            x53.c cVar3 = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            o oVar = new o(pVar, null);
            mVar.f119251a = null;
            mVar.f119252b = pVar2;
            mVar.f119255e = 2;
            objE0 = ge1.b.e0(bVar2, oVar, mVar);
            if (objE0 != aVar) {
                pVar = pVar2;
                location = (Location) objE0;
            }
            return aVar;
        }
        location = location2;
        pVar = pVar2;
        pVar.f119265f = location;
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        oi2.a.C2513a c2513a = oi2.a.f132270a;
        a aVar = (a) this.f119270k.getValue();
        c2513a.getClass();
        oi2.a.C2513a.c(aVar);
    }

    public final void y4() {
        p2 p2Var = this.f119266g;
        p2Var.k(null, l.a((l) p2Var.getValue(), false, null, null, true, 0, 110));
    }

    public final void z4() {
        c2 c2Var = this.f119268i;
        if (c2Var != null) {
            c2Var.c(null);
        }
        this.f119268i = ge1.b.T(v1.a(this), null, null, new f(null), 3);
    }
}
