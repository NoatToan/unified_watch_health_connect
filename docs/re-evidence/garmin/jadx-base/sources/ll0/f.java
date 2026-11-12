package ll0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.m3;
import f12.l;
import hl0.n;
import java.util.ArrayList;
import java.util.List;
import o13.m;
import o13.r;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.v0;
import r53.b2;
import r53.i;
import r53.j;
import r53.k2;
import r53.s;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lll0/f;", "Landroidx/lifecycle/u1;", "Lhl0/n;", "getDownloadedGolfCoursesUseCase", "Lhl0/f;", "deleteGolfCourseDownloadUseCase", "Lf12/l;", "userSettings", "<init>", "(Lhl0/n;Lhl0/f;Lf12/l;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hl0.f f113354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f113355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f113356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f113357d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements i<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f113358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f113359b;

        /* JADX INFO: renamed from: ll0.f$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C2166a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ j f113360a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f113361b;

            /* JADX INFO: renamed from: ll0.f$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.downloaded.DownloadedGolfCoursesViewModel$special$$inlined$map$1$2", f = "DownloadedGolfCoursesViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C2167a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f113362a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f113363b;

                public C2167a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f113362a = obj;
                    this.f113363b |= Integer.MIN_VALUE;
                    return C2166a.this.emit(null, this);
                }
            }

            public C2166a(j jVar, f fVar) {
                this.f113360a = jVar;
                this.f113361b = fVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C2167a c2167a;
                if (dVar instanceof C2167a) {
                    c2167a = (C2167a) dVar;
                    int i14 = c2167a.f113363b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c2167a.f113363b = i14 - Integer.MIN_VALUE;
                    } else {
                        c2167a = new C2167a(dVar);
                    }
                } else {
                    c2167a = new C2167a(dVar);
                }
                Object obj2 = c2167a.f113362a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c2167a.f113363b;
                if (i15 == 0) {
                    r.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (sd2.i iVar : (List) obj) {
                        m3 m3Var = (m3) this.f113361b.f113356c.getValue();
                        il0.c.a aVar2 = il0.c.f93960a;
                        Integer numS = iVar.s();
                        aVar2.getClass();
                        il0.c cVarB = il0.c.a.b(numS);
                        if (cVarB != il0.c.DOWNLOADING) {
                            cVarB = null;
                        }
                        il0.a aVarA = il0.b.a(iVar, m3Var, cVarB);
                        if (aVarA != null) {
                            arrayList.add(aVarA);
                        }
                    }
                    d dVar2 = new d(false, arrayList);
                    c2167a.f113363b = 1;
                    if (this.f113360a.emit(dVar2, c2167a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public a(i iVar, f fVar) {
            this.f113358a = iVar;
            this.f113359b = fVar;
        }

        @Override // r53.i
        public final Object collect(j<? super d> jVar, t13.d dVar) {
            Object objCollect = this.f113358a.collect(new C2166a(jVar, this.f113359b), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    public f(n nVar, hl0.f fVar, l lVar) {
        nVar.getClass();
        fVar.getClass();
        lVar.getClass();
        this.f113354a = fVar;
        this.f113355b = lVar;
        this.f113356c = m.b(new v0(this, 11));
        this.f113357d = s.K(new a(s.f(new hl0.m(nVar, null)), this), v1.a(this), k2.a.a(k2.f150703a, 2), new d(true, null, 2, null));
    }
}
