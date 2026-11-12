package jx0;

import androidx.lifecycle.y0;
import e23.p;
import o13.r;
import o53.b0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.reports.MenstrualCycleReportViewModel$getReport$1$1", f = "MenstrualCycleReportViewModel.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f101477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f101478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalDate f101479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f101481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ww0.k.b f101482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y0<cx0.a<ww0.k>> f101483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ww0.k f101484h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.reports.MenstrualCycleReportViewModel$getReport$1$1$1", f = "MenstrualCycleReportViewModel.kt", l = {79}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f101485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f101486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f101487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LocalDate f101488d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f101489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ww0.k.b f101490f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ y0<cx0.a<ww0.k>> f101491g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ww0.k f101492h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, int i14, LocalDate localDate, boolean z14, ww0.k.b bVar, y0<cx0.a<ww0.k>> y0Var, ww0.k kVar2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f101486b = kVar;
            this.f101487c = i14;
            this.f101488d = localDate;
            this.f101489e = z14;
            this.f101490f = bVar;
            this.f101491g = y0Var;
            this.f101492h = kVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f101486b, this.f101487c, this.f101488d, this.f101489e, this.f101490f, this.f101491g, this.f101492h, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objH;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f101485a;
            y0<cx0.a<ww0.k>> y0Var = this.f101491g;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    yw0.a aVar2 = this.f101486b.f101493a;
                    int i15 = this.f101487c;
                    LocalDate localDate = this.f101488d;
                    boolean z14 = this.f101489e;
                    ww0.k.b bVar = this.f101490f;
                    this.f101485a = 1;
                    objH = aVar2.h(i15, localDate, z14, bVar, this);
                    if (objH == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                    objH = obj;
                }
                ww0.k kVar = (ww0.k) objH;
                if (kVar != null) {
                    kVar.r(this.f101488d);
                }
                y0Var.j(new cx0.a<>(kVar, null, null, false, 12, null));
            } catch (Throwable th3) {
                y0Var.j(new cx0.a<>(this.f101492h, th3, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, LocalDate localDate, int i14, boolean z14, ww0.k.b bVar, y0<cx0.a<ww0.k>> y0Var, ww0.k kVar2, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f101478b = kVar;
        this.f101479c = localDate;
        this.f101480d = i14;
        this.f101481e = z14;
        this.f101482f = bVar;
        this.f101483g = y0Var;
        this.f101484h = kVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f101478b, this.f101479c, this.f101480d, this.f101481e, this.f101482f, this.f101483g, this.f101484h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f101477a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f101478b, this.f101480d, this.f101479c, this.f101481e, this.f101482f, this.f101483g, this.f101484h, null);
            this.f101477a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        this.f101478b.f101496d.remove(new o13.p(this.f101479c, new Integer(this.f101480d)));
        return Unit.INSTANCE;
    }
}
