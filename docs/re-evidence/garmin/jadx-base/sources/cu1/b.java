package cu1;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcu1/b;", "", "Lcu1/k;", "view", "", "athletePlanId", "<init>", "(Lcu1/k;J)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f55627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt1.u f55629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f55630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f55631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fu1.v f55632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f55633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f55634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1204b f55635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f55636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j f55637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f55638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f55639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f55640n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h f55641o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f55642p;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55643a;

        static {
            int[] iArr = new int[cu1.j.values().length];
            try {
                iArr[cu1.j.SHOW_WORKOUT_SCHEDULE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cu1.j.RESUME_ATP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cu1.j.REVIEW_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f55643a = iArr;
        }
    }

    /* JADX INFO: renamed from: cu1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"cu1/b$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lfu1/m;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1204b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<fu1.m> {
        public C1204b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, fu1.m mVar) {
            fu1.m mVar2 = mVar;
            eVar.getClass();
            mVar2.getClass();
            b.this.f55627a.M0(mVar2);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"cu1/b$c", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lfu1/n;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<fu1.n> {
        public c() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, fu1.n nVar) {
            fu1.n nVar2 = nVar;
            eVar.getClass();
            nVar2.getClass();
            b.this.f55627a.N5(nVar2);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"cu1/b$d", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lfu1/v;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<fu1.v> {
        public d() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            b bVar = b.this;
            bVar.f55627a.t();
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            k kVar = bVar.f55627a;
            if (cVar == cVar2) {
                kVar.Y2();
            } else {
                kVar.i3();
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, fu1.v vVar) {
            xw1.d dVar;
            fu1.v vVar2 = vVar;
            eVar.getClass();
            vVar2.getClass();
            b bVar = b.this;
            bVar.f55632f = vVar2;
            k kVar = bVar.f55627a;
            xw1.d dVar2 = vVar2.f73560a;
            if ((dVar2 == null || !dVar2.I()) && (dVar = vVar2.f73560a) != null && dVar.Z()) {
                kVar.G2();
            }
            kVar.g3(vVar2);
            kVar.J(bVar.d());
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"cu1/b$e", "Lcu1/n;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends n {
        public e() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [cu1.k] */
        /* JADX WARN: Type inference failed for: r6v2, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            ?? arrayList;
            cVar.getClass();
            b bVar = b.this;
            k kVar = bVar.f55627a;
            ?? r14 = bVar.f55627a;
            kVar.t();
            if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                f12.l.f68084a.getClass();
                f12.l.a.a().p3(true);
                r14.N(cVar);
                return;
            }
            f12.l.f68084a.getClass();
            f12.l.a.a().p3(false);
            rd2.f.a().f152045a.getClass();
            ArrayList arrayListD = rd2.j.d();
            if (arrayListD != null) {
                arrayList = new ArrayList();
                for (Object obj : arrayListD) {
                    sd2.f fVar = (sd2.f) obj;
                    if (fVar.c3() && !fVar.p2()) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = j0.f134944a;
            }
            r14.p5(arrayList);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"cu1/b$f", "Lcu1/n;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends n {
        public f() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            b.a(b.this, cVar, 1);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"cu1/b$g", "Lcu1/n;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g extends n {
        public g() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            b.a(b.this, cVar, 3);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"cu1/b$h", "Lcu1/n;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h extends n {
        public h() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            b.a(b.this, cVar, 4);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"cu1/b$i", "Lcu1/n;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i extends n {
        public i() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            b.a(b.this, cVar, 2);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"cu1/b$j", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lfu1/p;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<fu1.p> {
        public j() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, fu1.p pVar) {
            fu1.p pVar2 = pVar;
            eVar.getClass();
            pVar2.getClass();
            b.this.f55627a.Q3(pVar2);
        }
    }

    public b(k kVar, long j8) {
        kVar.getClass();
        this.f55627a = kVar;
        this.f55628b = j8;
        this.f55629c = (wt1.u) KoinJavaComponent.get$default(wt1.u.class, null, null, 6, null);
        this.f55630d = new ArrayList();
        this.f55633g = "OTHER";
        this.f55634h = new d();
        this.f55635i = new C1204b();
        this.f55636j = new c();
        this.f55637k = new j();
        this.f55638l = new f();
        this.f55639m = new i();
        this.f55640n = new g();
        this.f55641o = new h();
        this.f55642p = new e();
    }

    public static final void a(b bVar, com.garmin.android.library.backgroundtaskmanagement.b.c cVar, int i14) {
        k kVar = bVar.f55627a;
        kVar.t();
        if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
            kVar.V(i14);
            return;
        }
        if (i14 == 1) {
            bVar.c(-1);
        } else if (i14 == 2) {
            bVar.c(R.string.lbl_recalculating_atp_plan);
        } else if (i14 == 3) {
            kVar.U();
        } else if (i14 == 4) {
            kVar.H();
        }
        kVar.Y2();
        f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
        lVar.p3(true);
        lVar.N2(true);
    }

    @Override // cu1.l
    public final void I0(fu1.h hVar) {
        this.f55627a.K(hVar);
        rt1.c cVar = rt1.c.f154516a;
        fu1.v vVar = this.f55632f;
        xw1.d dVar = vVar != null ? vVar.f73560a : null;
        cVar.getClass();
        Boolean boolValueOf = dVar != null ? Boolean.valueOf(dVar.Z()) : null;
        rt1.r.a aVar = rt1.r.f154555d;
        Integer numValueOf = dVar != null ? Integer.valueOf(dVar.getWorkoutPlanTypeId()) : null;
        aVar.getClass();
        String strA = rt1.r.a.a(numValueOf);
        Bundle bundleD = b71.i.d("Screen", "GarminCoachArticle");
        bundleD.putString("articleId", hVar.f73517a);
        bundleD.putString("garminCoachPlanType", strA);
        if (boolValueOf != null) {
            bundleD.putBoolean("garminCoachIsPlanActive", boolValueOf.booleanValue());
        }
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "PageView");
    }

    @Override // cu1.l
    public final void P(xw1.o oVar) {
        this.f55627a.r(oVar);
        rt1.c cVar = rt1.c.f154516a;
        fu1.v vVar = this.f55632f;
        xw1.d dVar = vVar != null ? vVar.f73560a : null;
        cVar.getClass();
        Boolean boolValueOf = dVar != null ? Boolean.valueOf(dVar.Z()) : null;
        rt1.r.a aVar = rt1.r.f154555d;
        Integer numValueOf = dVar != null ? Integer.valueOf(dVar.getWorkoutPlanTypeId()) : null;
        aVar.getClass();
        String strA = rt1.r.a.a(numValueOf);
        Bundle bundleD = b71.i.d("Screen", "GarminCoachVideo");
        bundleD.putString("videoKey", oVar.getVideoKey());
        bundleD.putString("garminCoachPlanType", strA);
        if (boolValueOf != null) {
            bundleD.putBoolean("garminCoachIsPlanActive", boolValueOf.booleanValue());
        }
        ht.a.f85464a.getClass();
        ht.a.a(bundleD, "PageView");
    }

    @Override // cu1.l
    public final void a5(int i14, long j8) {
        this.f55630d.add(Long.valueOf(this.f55629c.i(i14, j8, this.f55635i)));
    }

    public final xw1.d b() {
        fu1.v vVar = this.f55632f;
        if (vVar != null) {
            return vVar.f73560a;
        }
        return null;
    }

    public final void c(int i14) {
        k kVar = this.f55627a;
        if (i14 == -1) {
            kVar.U1();
        } else {
            kVar.S3(i14);
        }
        this.f55630d.add(Long.valueOf(this.f55629c.p(this.f55628b, this.f55634h)));
    }

    public final String d() {
        xw1.d dVar;
        fu1.v vVar = this.f55632f;
        if (vVar == null || (dVar = vVar.f73560a) == null) {
            return "";
        }
        long workoutPlanId = dVar.getWorkoutPlanId();
        vt1.a.f180073b.getClass();
        return vt1.a.C3360a.a((int) workoutPlanId);
    }

    public final void e() {
        this.f55627a.U1();
        this.f55630d.add(Long.valueOf(this.f55629c.k(this.f55628b, this.f55638l)));
        fy1.i.a.t(fy1.i.f73924a);
    }

    public final void f() {
        this.f55627a.U1();
        this.f55630d.add(Long.valueOf(this.f55629c.t(this.f55628b, this.f55640n)));
    }

    public final void g(String str) {
        str.getClass();
        this.f55633g = str;
        this.f55627a.S3(R.string.lbl_recalculating_atp_plan);
        this.f55630d.add(Long.valueOf(this.f55629c.a(str, this.f55628b, this.f55639m)));
        fy1.i.a.t(fy1.i.f73924a);
    }

    @Override // cu1.l
    public final void q0(long j8, boolean z14, boolean z15) {
        this.f55627a.m(j8, z14, z15);
    }

    @Override // cu1.l
    public final void q6(int i14, String str) {
        this.f55630d.add(Long.valueOf(this.f55629c.f(i14, str, this.f55636j)));
    }

    @Override // cu1.l
    public final void u3(int i14, String str) {
        this.f55630d.add(Long.valueOf(this.f55629c.w(i14, str, this.f55637k)));
    }

    @Override // cz.a
    public final void y1(int i14, Bundle bundle) {
        this.f55627a.L(i14, bundle);
    }

    @Override // cu1.l
    public final void y2(cu1.j jVar) {
        jVar.getClass();
        int i14 = a.f55643a[jVar.ordinal()];
        k kVar = this.f55627a;
        if (i14 == 1) {
            fu1.v vVar = this.f55632f;
            xw1.d dVar = vVar != null ? vVar.f73560a : null;
            if (dVar != null) {
                kVar.Q(dVar);
                return;
            }
            return;
        }
        if (i14 == 2) {
            fy1.i.a.t(fy1.i.f73924a);
            kVar.l();
        } else if (i14 == 3) {
            kVar.G5();
        } else {
            u0.r();
        }
    }
}
