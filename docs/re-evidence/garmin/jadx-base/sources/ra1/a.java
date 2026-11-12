package ra1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import f32.j;
import f32.m;
import f32.p;
import java.util.List;
import o13.r;
import o53.b0;
import o53.j0;
import oa1.c;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lra1/a;", "Landroidx/lifecycle/u1;", "Lma1/a;", "powerCurveSport", "Loa1/c;", "powerCurveRepository", "<init>", "(Lma1/a;Loa1/c;)V", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ma1.a f151466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f151467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f151468c;

    /* JADX INFO: renamed from: ra1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ra1/a$a", "Lf32/p;", "Lna1/c;", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2849a extends p<na1.c> {

        /* JADX INFO: renamed from: ra1.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @e(c = "com.garmin.android.apps.connectmobile.powercurve.viewmodel.PowerCurveViewModel$dailySummaryDataAdapter$1", f = "PowerCurveViewModel.kt", l = {39, 40}, m = "requestSafeSummary", v = 2)
        public static final class C2850a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public j0 f151470a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public v2 f151471b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f151472c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f151474e;

            public C2850a(d<? super C2850a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f151472c = obj;
                this.f151474e |= Integer.MIN_VALUE;
                return C2849a.this.b(null, null, this);
            }
        }

        /* JADX INFO: renamed from: ra1.a$a$b */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lna1/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.powercurve.viewmodel.PowerCurveViewModel$dailySummaryDataAdapter$1$requestSafeSummary$deferredDailyPowerCurveSummary$1", f = "PowerCurveViewModel.kt", l = {29}, m = "invokeSuspend", v = 2)
        public static final class b extends i implements e23.p<b0, d<? super v2<? extends na1.b>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f151475a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f151476b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DateTime f151477c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ DateTime f151478d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, DateTime dateTime, DateTime dateTime2, d<? super b> dVar) {
                super(2, dVar);
                this.f151476b = aVar;
                this.f151477c = dateTime;
                this.f151478d = dateTime2;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new b(this.f151476b, this.f151477c, this.f151478d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super v2<? extends na1.b>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f151475a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f151476b;
                oa1.c cVar = aVar2.f151467b;
                String str = aVar2.f151466a.f117628a;
                this.f151475a = 1;
                cVar.getClass();
                Object objJ = f0.J(cVar, new oa1.a(cVar, this.f151477c, this.f151478d, str, null), this);
                return objJ == aVar ? aVar : objJ;
            }
        }

        /* JADX INFO: renamed from: ra1.a$a$c */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lna1/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.powercurve.viewmodel.PowerCurveViewModel$dailySummaryDataAdapter$1$requestSafeSummary$deferredHistoricalPowerCurve$1", f = "PowerCurveViewModel.kt", l = {36}, m = "invokeSuspend", v = 2)
        public static final class c extends i implements e23.p<b0, d<? super v2<? extends na1.b>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f151479a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f151480b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a aVar, d<? super c> dVar) {
                super(2, dVar);
                this.f151480b = aVar;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new c(this.f151480b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, d<? super v2<? extends na1.b>> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f151479a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f151480b;
                oa1.c cVar = aVar2.f151467b;
                String str = aVar2.f151466a.f117628a;
                this.f151479a = 1;
                cVar.getClass();
                Object objJ = f0.J(cVar, new oa1.b(cVar, str, null), this);
                return objJ == aVar ? aVar : objJ;
            }
        }

        public C2849a() {
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0088  */
        /* JADX WARN: Code duplicated, block: B:28:0x0099  */
        /* JADX WARN: Code duplicated, block: B:29:0x009c  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f32.p
        public final Object b(DateTime dateTime, DateTime dateTime2, d<? super v2<? extends na1.c>> dVar) throws Exception {
            C2850a c2850a;
            j0 j0Var;
            v2 v2Var;
            v2 v2Var2;
            v2.b bVar;
            na1.b bVar2;
            if (dVar instanceof C2850a) {
                c2850a = (C2850a) dVar;
                int i14 = c2850a.f151474e;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c2850a.f151474e = i14 - Integer.MIN_VALUE;
                } else {
                    c2850a = new C2850a(dVar);
                }
            } else {
                c2850a = new C2850a(dVar);
            }
            Object obj = c2850a.f151472c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c2850a.f151474e;
            List<na1.a> listB = null;
            if (i15 == 0) {
                r.b(obj);
                a aVar2 = a.this;
                j0 j0VarJ = ge1.b.j(v1.a(aVar2), null, null, new b(aVar2, dateTime, dateTime2, null), 3);
                j0 j0VarJ2 = ge1.b.j(v1.a(aVar2), null, null, new c(aVar2, null), 3);
                c2850a.f151470a = j0VarJ2;
                c2850a.f151474e = 1;
                Object objC = j0VarJ.C(c2850a);
                if (objC != aVar) {
                    j0Var = j0VarJ2;
                    obj = objC;
                }
                return aVar;
            }
            if (i15 == 1) {
                j0Var = c2850a.f151470a;
                r.b(obj);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var = c2850a.f151471b;
                r.b(obj);
            }
            v2Var2 = (v2) obj;
            if (!(v2Var instanceof v2.a)) {
                throw ((v2.a) v2Var).f47383a;
            }
            v2Var.getClass();
            v2.b bVar3 = (v2.b) v2Var;
            na1.b bVar4 = (na1.b) bVar3.f47386a;
            if (v2Var2 instanceof v2.b) {
                bVar = (v2.b) v2Var2;
            } else {
                bVar = null;
            }
            if (bVar != null && (bVar2 = (na1.b) bVar.f47386a) != null) {
                listB = bVar2.b();
            }
            return new v2.b(new na1.c(bVar4, listB), bVar3.f47387b, null, null, 12, null);
            v2 v2Var3 = (v2) obj;
            c2850a.f151470a = null;
            c2850a.f151471b = v2Var3;
            c2850a.f151474e = 2;
            Object objAwait = j0Var.await(c2850a);
            if (objAwait != aVar) {
                v2Var = v2Var3;
                obj = objAwait;
                v2Var2 = (v2) obj;
                if (!(v2Var instanceof v2.a)) {
                    throw ((v2.a) v2Var).f47383a;
                }
                v2Var.getClass();
                v2.b bVar5 = (v2.b) v2Var;
                na1.b bVar6 = (na1.b) bVar5.f47386a;
                if (v2Var2 instanceof v2.b) {
                    bVar = (v2.b) v2Var2;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    listB = bVar2.b();
                }
                return new v2.b(new na1.c(bVar6, listB), bVar5.f47387b, null, null, 12, null);
            }
            return aVar;
        }
    }

    public a(ma1.a aVar, c cVar) {
        aVar.getClass();
        cVar.getClass();
        this.f151466a = aVar;
        this.f151467b = cVar;
        this.f151468c = new m(new j(v1.a(this), new C2849a(), null, 4, null));
    }
}
