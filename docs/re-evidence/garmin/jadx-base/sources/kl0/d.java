package kl0;

import android.location.Location;
import android.net.Uri;
import androidx.lifecycle.j1;
import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import e23.q;
import hl0.k;
import hl0.u;
import o13.m;
import o13.r;
import o13.t;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkl0/d;", "Landroidx/lifecycle/u1;", "Landroidx/lifecycle/j1;", "savedStateHandle", "Lhl0/k;", "getDownloadedGolfCourseUseCase", "Lhl0/u;", "initiateGolfCourseDownloadUseCase", "Lmv0/e;", "locationProvider", "<init>", "(Landroidx/lifecycle/j1;Lhl0/k;Lhl0/u;Lmv0/e;)V", "a", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f105234g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f105235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f105236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mv0.e f105237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final il0.a f105238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f105239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f105240f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsd2/i;", "golfCourse", "Landroid/net/Uri;", "drivingDirectionsLocation", "Lkl0/c;", "<anonymous>", "(Lsd2/i;Landroid/net/Uri;)Lkl0/c;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.details.GolfCourseDetailsViewModel$uiState$2$1", f = "GolfCourseDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements q<sd2.i, Uri, t13.d<? super c>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ sd2.i f105241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Uri f105242b;

        public b(t13.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(sd2.i iVar, Uri uri, t13.d<? super c> dVar) {
            b bVar = d.this.new b(dVar);
            bVar.f105241a = iVar;
            bVar.f105242b = uri;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            sd2.i iVar = this.f105241a;
            Uri uri = this.f105242b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            il0.c.a aVar2 = il0.c.f93960a;
            Integer numS = iVar != null ? iVar.s() : null;
            aVar2.getClass();
            il0.c cVarB = il0.c.a.b(numS);
            if (cVarB == null) {
                cVarB = il0.c.NOT_DOWNLOADED;
            }
            return new c(il0.a.a(d.this.f105238d, cVarB), uri);
        }
    }

    static {
        new a(null);
    }

    public d(j1 j1Var, k kVar, u uVar, mv0.e eVar) {
        j1Var.getClass();
        kVar.getClass();
        uVar.getClass();
        eVar.getClass();
        this.f105235a = kVar;
        this.f105236b = uVar;
        this.f105237c = eVar;
        this.f105238d = (il0.a) GsonUtil.f47253b.fromJson((String) j1Var.d(null, "GOLF_COURSE").f150540a.getValue(), il0.a.class);
        this.f105239e = q2.a(null);
        this.f105240f = m.b(new jx0.e(this, 19));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r8 == r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x4(d dVar, v13.c cVar) throws Throwable {
        f fVar;
        mv0.e eVar = dVar.f105237c;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f105253c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f105253c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar, cVar);
            }
        } else {
            fVar = new f(dVar, cVar);
        }
        Object objE0 = fVar.f105251a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f105253c;
        if (i15 != 0) {
            if (i15 == 1) {
                r.b(objE0);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objE0);
            }
            return (Location) objE0;
        }
        r.b(objE0);
        if (!eVar.b("GolfCourseDetailsViewModel") || !eVar.b("GolfCourseDetailsViewModel")) {
            return null;
        }
        x53.c cVar2 = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        g gVar = new g(dVar, null);
        fVar.f105253c = 1;
        objE0 = ge1.b.e0(bVar, gVar, fVar);
        if (objE0 != aVar) {
        }
        return aVar;
        Location location = (Location) objE0;
        if (location != null) {
            return location;
        }
        x53.c cVar3 = s0.f129406a;
        x53.b bVar2 = x53.b.f189152a;
        h hVar = new h(dVar, null);
        fVar.f105253c = 2;
        objE0 = ge1.b.e0(bVar2, hVar, fVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkl0/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
