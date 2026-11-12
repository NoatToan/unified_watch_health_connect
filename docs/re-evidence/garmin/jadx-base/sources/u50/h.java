package u50;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import e23.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import me2.z;
import o13.r;
import o53.b0;
import o53.c2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.a2;
import r53.b2;
import r53.e2;
import r53.g2;
import r53.m1;
import r53.p2;
import r53.q2;
import r53.s;
import r53.u;
import z20.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014BS\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lu50/h;", "Landroidx/lifecycle/u1;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/i;", "courseTypeFilterData", "", "isPaceProCourse", "isPowerGuideFlow", "", "initialFavorites", "Lh30/d;", "searchCoursesUseCase", "Lh30/b;", "getTrailsAvailabilityUseCase", "Lz20/h;", "deleteCourseUseCase", "Lz20/y;", "toggleFavoriteStateUseCase", "<init>", "(Ljava/util/List;ZZLjava/util/List;Lh30/d;Lh30/b;Lz20/h;Lz20/y;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f168664q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.courses.model.i> f168665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f168667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h30.d f168668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h30.b f168669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z20.h f168670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y f168671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f168672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f168673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e2 f168674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a2 f168675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet<String> f168676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.e f168677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f168678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c2 f168679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c2 f168680p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchViewModel$emitEffect$1", f = "CourseSearchViewModel.kt", l = {337}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f168681a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x50.c f168683c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x50.c cVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f168683c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new b(this.f168683c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f168681a;
            if (i14 == 0) {
                r.b(obj);
                e2 e2Var = h.this.f168674j;
                this.f168681a = 1;
                if (e2Var.emit(this.f168683c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(List<? extends com.garmin.android.apps.connectmobile.courses.model.i> list, boolean z14, boolean z15, List<String> list2, h30.d dVar, h30.b bVar, z20.h hVar, y yVar) {
        list.getClass();
        list2.getClass();
        dVar.getClass();
        bVar.getClass();
        hVar.getClass();
        yVar.getClass();
        this.f168665a = list;
        this.f168666b = z14;
        this.f168667c = z15;
        this.f168668d = dVar;
        this.f168669e = bVar;
        this.f168670f = hVar;
        this.f168671g = yVar;
        p2 p2VarA = q2.a(new x50.f(null, null, null, false, false, 0, false, false, false, 511, null));
        this.f168672h = p2VarA;
        this.f168673i = s.d(p2VarA);
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f168674j = e2VarB;
        this.f168675k = s.c(e2VarB);
        this.f168676l = new HashSet<>(list2);
        this.f168678n = true;
    }

    public static x50.f E4(x50.f fVar) {
        if (fVar.f189006a.isEmpty()) {
            return x50.f.a(fVar, null, null, x50.d.EMPTY, false, false, R.string.lbl_filter_search_no_courses, false, 475);
        }
        return fVar.b().isEmpty() ? x50.f.a(fVar, null, null, x50.d.NO_FILTER_RESULTS, false, false, 0, false, 507) : x50.f.a(fVar, null, null, null, false, false, 0, false, 507);
    }

    public final void A4(com.garmin.android.library.mapsdkadapter.e eVar) {
        p2 p2Var;
        Object value;
        Object value2;
        this.f168677m = eVar;
        c2 c2Var = this.f168679o;
        if (c2Var != null) {
            c2Var.c(null);
        }
        c2 c2Var2 = this.f168680p;
        if (c2Var2 != null) {
            c2Var2.c(null);
        }
        do {
            p2Var = this.f168672h;
            value = p2Var.getValue();
        } while (!p2Var.b(value, x50.f.a((x50.f) value, j0.f134944a, null, x50.d.EMPTY, true, false, 0, false, 434)));
        l3.a aVar = l3.f23124b;
        LatLng latLng = eVar.f50274b.f50283a;
        double d14 = latLng.latitude;
        LatLng latLng2 = eVar.f50273a.f50283a;
        double d15 = latLng2.latitude;
        double dCos = Math.cos(Math.toRadians((d14 + d15) / ((double) 2))) * 111.321d * (latLng.longitude - latLng2.longitude);
        double dAbs = Math.abs(dCos * (d14 - d15) * 111.699d);
        aVar.getClass();
        if (l3.a.T1(dAbs, 3) >= 100000.0d) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, x50.f.a((x50.f) value2, null, null, null, false, false, 0, false, 503)));
            D4();
            return;
        }
        LatLngBounds latLngBoundsH = z.h(eVar);
        h30.d dVar = this.f168668d;
        dVar.getClass();
        HashSet<String> hashSet = this.f168676l;
        hashSet.getClass();
        r53.c2 c2Var3 = new r53.c2(new h30.c(dVar, latLngBoundsH, hashSet, null));
        x53.c cVar = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        this.f168679o = s.C(s.A(new u(new m1(s.A(c2Var3, bVar), new j(this, null)), new k(this, null)), bVar), v1.a(this));
    }

    public final void B4(com.garmin.android.apps.connectmobile.courses.model.d dVar) {
        p2 p2Var;
        Object value;
        x50.f fVar;
        ArrayList arrayList;
        do {
            p2Var = this.f168672h;
            value = p2Var.getValue();
            fVar = (x50.f) value;
            List<com.garmin.android.apps.connectmobile.courses.model.d> list = fVar.f189006a;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.courses.model.d) obj).courseId, dVar.courseId)) {
                    arrayList.add(obj);
                }
            }
        } while (!p2Var.b(value, E4(x50.f.a(fVar, arrayList, null, null, false, false, 0, false, 510))));
    }

    public final void C4(String str, boolean z14) {
        p2 p2Var;
        Object value;
        x50.f fVar;
        ArrayList arrayList;
        do {
            p2Var = this.f168672h;
            value = p2Var.getValue();
            fVar = (x50.f) value;
            List<com.garmin.android.apps.connectmobile.courses.model.d> list = fVar.f189006a;
            arrayList = new ArrayList(p13.y.r(list, 10));
            for (com.garmin.android.apps.connectmobile.courses.model.d dVar : list) {
                if (p005kotlin.jvm.internal.s.g(dVar.courseId, str)) {
                    dVar.isFavorite = z14;
                }
                arrayList.add(dVar);
            }
        } while (!p2Var.b(value, x50.f.a(fVar, arrayList, null, null, false, false, 0, false, 510)));
    }

    public final void D4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f168672h;
            value = p2Var.getValue();
        } while (!p2Var.b(value, x50.f.a((x50.f) value, null, null, x50.d.TOO_MANY, false, false, 0, false, 507)));
        if (this.f168678n) {
            x4(x50.c.i.f188995a);
        }
    }

    public final void x4(x50.c cVar) {
        ge1.b.T(v1.a(this), null, null, new b(cVar, null), 3);
    }

    public final void y4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f168672h;
            value = p2Var.getValue();
        } while (!p2Var.b(value, x50.f.a((x50.f) value, null, null, null, false, false, 0, false, 255)));
    }

    public final void z4(x50.b bVar) {
        Object value;
        Object value2;
        Object next;
        Object next2;
        Object value3;
        bVar.getClass();
        if (bVar instanceof x50.b.a) {
            A4(((x50.b.a) bVar).f188975a);
            return;
        }
        boolean z14 = bVar instanceof x50.b.f;
        p2 p2Var = this.f168672h;
        if (z14) {
            String str = ((x50.b.f) bVar).f188980a;
            do {
                value3 = p2Var.getValue();
            } while (!p2Var.b(value3, E4(x50.f.a((x50.f) value3, null, str, null, false, false, 0, false, 509))));
            return;
        }
        if (bVar instanceof x50.b.k) {
            this.f168678n = ((x50.b.k) bVar).f188985a;
            return;
        }
        Object obj = null;
        if (bVar instanceof x50.b.e) {
            String str2 = ((x50.b.e) bVar).f188979a;
            for (Object obj2 : ((x50.f) p2Var.getValue()).f189006a) {
                if (p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.courses.model.d) obj2).courseId, str2)) {
                    obj = obj2;
                    break;
                }
            }
            com.garmin.android.apps.connectmobile.courses.model.d dVar = (com.garmin.android.apps.connectmobile.courses.model.d) obj;
            if (dVar == null) {
                return;
            }
            if (this.f168666b) {
                x4(new x50.c.C3514c(dVar));
                return;
            } else if (this.f168667c) {
                x4(new x50.c.b(str2));
                return;
            } else {
                x4(new x50.c.a(dVar));
                return;
            }
        }
        if (bVar instanceof x50.b.i) {
            String str3 = ((x50.b.i) bVar).f188983a;
            Iterator<T> it = ((x50.f) p2Var.getValue()).f189006a.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.courses.model.d) next2).courseId, str3));
            com.garmin.android.apps.connectmobile.courses.model.d dVar2 = (com.garmin.android.apps.connectmobile.courses.model.d) next2;
            if (dVar2 != null && ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk() == dVar2.userProfileId) {
                x4(new x50.c.f(dVar2));
                return;
            }
            return;
        }
        if (bVar instanceof x50.b.C3513b) {
            com.garmin.android.apps.connectmobile.courses.model.d dVar3 = ((x50.b.C3513b) bVar).f188976a;
            B4(dVar3);
            y4();
            m1 m1Var = new m1(this.f168670f.a(dVar3.courseId), new i(this, dVar3, null));
            x53.c cVar = s0.f129406a;
            s.C(s.A(m1Var, x53.b.f189152a), v1.a(this));
            return;
        }
        boolean z15 = bVar instanceof x50.b.l;
        HashSet<String> hashSet = this.f168676l;
        if (z15) {
            String str4 = ((x50.b.l) bVar).f188986a;
            Iterator<T> it3 = ((x50.f) p2Var.getValue()).f189006a.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!p005kotlin.jvm.internal.s.g(((com.garmin.android.apps.connectmobile.courses.model.d) next).courseId, str4));
            com.garmin.android.apps.connectmobile.courses.model.d dVar4 = (com.garmin.android.apps.connectmobile.courses.model.d) next;
            if (dVar4 == null) {
                return;
            }
            boolean z16 = dVar4.isFavorite;
            boolean z17 = !z16;
            C4(str4, z17);
            if (z16) {
                hashSet.remove(str4);
            } else {
                hashSet.add(str4);
            }
            y4();
            m1 m1Var2 = new m1(this.f168671g.a(str4, dVar4.isFavorite), new l(this, str4, z17, null));
            x53.c cVar2 = s0.f129406a;
            s.C(s.A(m1Var2, x53.b.f189152a), v1.a(this));
            return;
        }
        if (bVar.equals(x50.b.g.f188981a)) {
            x4(x50.c.d.f188990a);
            return;
        }
        if (bVar.equals(x50.b.h.f188982a)) {
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, x50.f.a((x50.f) value2, null, null, null, false, false, 0, false, 383)));
            return;
        }
        if (bVar instanceof x50.b.j) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, x50.f.a((x50.f) value, null, null, null, false, ((x50.b.j) bVar).f188984a, 0, false, 495)));
            return;
        }
        if (!(bVar instanceof x50.b.c)) {
            if (!(bVar instanceof x50.b.d)) {
                u0.r();
                return;
            } else {
                B4(((x50.b.d) bVar).f188978a);
                y4();
                return;
            }
        }
        com.garmin.android.apps.connectmobile.courses.model.d dVar5 = ((x50.b.c) bVar).f188977a;
        y4();
        String str5 = dVar5.courseId;
        if (str5 != null) {
            if (dVar5.isFavorite) {
                hashSet.add(str5);
            } else {
                hashSet.remove(str5);
            }
        }
        com.garmin.android.library.mapsdkadapter.e eVar = this.f168677m;
        if (eVar != null) {
            A4(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lu50/h$a;", "", "<init>", "()V", "", "MAX_SEARCH_AREA", "I", "", "KM_PER_DEGREE_LATITUDE", "D", "KM_PER_DEGREE_LONGITUDE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
