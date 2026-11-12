package jt0;

import am.e2;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import b63.o;
import c22.a0;
import com.garmin.android.apps.connectmobile.lactate_threshold.reports.data.model.LactateSummaryMeasurementsDTO;
import com.garmin.android.apps.connectmobile.userprofile.model.BiometricProfileDTO;
import com.garmin.android.apps.connectmobile.userprofile.model.BiometricThresholdDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.wallet.WalletConstants;
import e23.p;
import f32.j;
import f32.l;
import f32.m;
import g22.k;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.i0;
import o53.j0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.w;
import p13.x;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ljt0/a;", "Landroidx/lifecycle/u1;", "Lxs0/a;", "lactateThresholdSportType", "Lws0/a;", "lactateThresholdRepo", "", "userId", "userDisplayName", "Lc22/a0;", "dispatcherProvider", "<init>", "(Lxs0/a;Lws0/a;Ljava/lang/String;Ljava/lang/String;Lc22/a0;)V", "a", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xs0.a f100682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ws0.a f100683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f100685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f100686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<String> f100687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public vs0.a f100688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<xs0.b> f100689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f100690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f100691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f100692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f100693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f100694m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f100695n;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"jt0/a$b", "Lf32/g;", "Lvs0/a;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends f32.g<vs0.a> {

        /* JADX INFO: renamed from: jt0.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$detailsDataAdapter$1", f = "LactateThresholdViewModel.kt", l = {80, 94}, m = "requestSafeDetails", v = 2)
        public static final class C1931a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public j0 f100697a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public vs0.b f100698b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public vs0.b f100699c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f100700d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f100702f;

            public C1931a(t13.d<? super C1931a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f100700d = obj;
                this.f100702f |= Integer.MIN_VALUE;
                return b.this.c(null, this);
            }
        }

        /* JADX INFO: renamed from: jt0.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lvs0/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$detailsDataAdapter$1$requestSafeDetails$latestLactateThresholdCall$1", f = "LactateThresholdViewModel.kt", l = {66}, m = "invokeSuspend", v = 2)
        public static final class C1932b extends i implements p<b0, t13.d<? super v2<? extends List<? extends vs0.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100703a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100704b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1932b(a aVar, t13.d<? super C1932b> dVar) {
                super(2, dVar);
                this.f100704b = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1932b(this.f100704b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends vs0.b>>> dVar) {
                return ((C1932b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100703a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100704b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                this.f100703a = 1;
                Object objG = aVar3.g(str, this);
                return objG == aVar ? aVar : objG;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo61/h;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$detailsDataAdapter$1$requestSafeDetails$powerToWeightCall$1", f = "LactateThresholdViewModel.kt", l = {69}, m = "invokeSuspend", v = 2)
        public static final class c extends i implements p<b0, t13.d<? super v2<? extends List<? extends o61.h>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100705a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100706b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DateTime f100707c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a aVar, DateTime dateTime, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f100706b = aVar;
                this.f100707c = dateTime;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f100706b, this.f100707c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends o61.h>>> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100705a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100706b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                LocalDate localDate = this.f100707c.toLocalDate();
                localDate.getClass();
                o oVarT = k.t(localDate);
                xs0.a aVar4 = aVar2.f100682a;
                this.f100705a = 1;
                Object objI = aVar3.i(str, oVarT, aVar4, this);
                return objI == aVar ? aVar : objI;
            }
        }

        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:45:0x00de  */
        /* JADX WARN: Code duplicated, block: B:50:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:58:0x0110  */
        /* JADX WARN: Code duplicated, block: B:60:0x0113  */
        /* JADX WARN: Code duplicated, block: B:61:0x011a  */
        /* JADX WARN: Code duplicated, block: B:68:0x0132  */
        /* JADX WARN: Code duplicated, block: B:69:0x0138  */
        /* JADX WARN: Code duplicated, block: B:71:0x013b  */
        /* JADX WARN: Code duplicated, block: B:74:0x0162  */
        /* JADX WARN: Code duplicated, block: B:79:0x00f4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // f32.g
        public final Object c(DateTime dateTime, t13.d<? super v2<? extends vs0.a>> dVar) {
            C1931a c1931a;
            j0 j0VarJ;
            Object next;
            Object next2;
            vs0.b bVar;
            vs0.b bVar2;
            v2 v2Var;
            o61.h hVar;
            double dDoubleValue;
            double dIntValue;
            Double dF;
            Double functionalThresholdPower;
            Integer numD;
            Iterator it;
            Object next3;
            if (dVar instanceof C1931a) {
                c1931a = (C1931a) dVar;
                int i14 = c1931a.f100702f;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1931a.f100702f = i14 - Integer.MIN_VALUE;
                } else {
                    c1931a = new C1931a(dVar);
                }
            } else {
                c1931a = new C1931a(dVar);
            }
            Object objC = c1931a.f100700d;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1931a.f100702f;
            a aVar2 = a.this;
            if (i15 == 0) {
                r.b(objC);
                j0 j0VarJ2 = ge1.b.j(v1.a(aVar2), null, null, new C1932b(aVar2, null), 3);
                j0VarJ = ge1.b.j(v1.a(aVar2), null, null, new c(aVar2, dateTime, null), 3);
                c1931a.f100697a = j0VarJ;
                c1931a.f100702f = 1;
                objC = j0VarJ2.C(c1931a);
                if (objC != aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                j0VarJ = c1931a.f100697a;
                r.b(objC);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = c1931a.f100699c;
                bVar2 = c1931a.f100698b;
                r.b(objC);
            }
            v2Var = (v2) objC;
            if (v2Var instanceof v2.b) {
                it = ((Iterable) ((v2.b) v2Var).f47386a).iterator();
                do {
                    if (it.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it.next();
                } while (!s.g(((o61.h) next3).getSport(), aVar2.f100682a.f192068a));
                hVar = (o61.h) next3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                hVar = null;
            }
            xs0.a aVar3 = aVar2.f100682a;
            dDoubleValue = Double.NaN;
            if (bVar2 != null || (numD = bVar2.d(aVar3)) == null) {
                dIntValue = Double.NaN;
            } else {
                dIntValue = numD.intValue();
            }
            if (bVar != null) {
                dF = bVar.f(aVar2.f100682a);
            } else {
                dF = null;
            }
            if (dF != null && !Double.isNaN(dF.doubleValue())) {
                dDoubleValue = ((double) 10) * dF.doubleValue();
            }
            double d14 = dDoubleValue;
            if (hVar != null) {
                functionalThresholdPower = hVar.getFunctionalThresholdPower();
            } else {
                functionalThresholdPower = null;
            }
            vs0.a aVar4 = new vs0.a(aVar3, dIntValue, d14, functionalThresholdPower, hVar != null ? hVar.getPowerToWeight() : null, null, 32, null);
            aVar2.f100688g = aVar4;
            return new v2.b(aVar4, 200, null, null, 12, null);
            v2 v2Var2 = (v2) objC;
            if (!(v2Var2 instanceof v2.b)) {
                if (v2Var2 instanceof v2.a) {
                    return v2Var2;
                }
                u0.r();
                return null;
            }
            Iterable iterable = (Iterable) ((v2.b) v2Var2).f47386a;
            Iterator it3 = iterable.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (((vs0.b) next).d(aVar2.f100682a) == null);
            vs0.b bVar3 = (vs0.b) next;
            Iterator it4 = iterable.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (((vs0.b) next2).f(aVar2.f100682a) == null);
            vs0.b bVar4 = (vs0.b) next2;
            c1931a.f100697a = null;
            c1931a.f100698b = bVar3;
            c1931a.f100699c = bVar4;
            c1931a.f100702f = 2;
            Object objAwait = j0VarJ.await(c1931a);
            if (objAwait != aVar) {
                bVar = bVar4;
                objC = objAwait;
                bVar2 = bVar3;
                v2Var = (v2) objC;
                if (v2Var instanceof v2.b) {
                    it = ((Iterable) ((v2.b) v2Var).f47386a).iterator();
                    do {
                        if (it.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it.next();
                    } while (!s.g(((o61.h) next3).getSport(), aVar2.f100682a.f192068a));
                    hVar = (o61.h) next3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    hVar = null;
                }
                xs0.a aVar5 = aVar2.f100682a;
                dDoubleValue = Double.NaN;
                if (bVar2 != null) {
                    dIntValue = Double.NaN;
                } else {
                    dIntValue = Double.NaN;
                }
                if (bVar != null) {
                    dF = bVar.f(aVar2.f100682a);
                } else {
                    dF = null;
                }
                if (dF != null) {
                    dDoubleValue = ((double) 10) * dF.doubleValue();
                }
                double d15 = dDoubleValue;
                if (hVar != null) {
                    functionalThresholdPower = hVar.getFunctionalThresholdPower();
                } else {
                    functionalThresholdPower = null;
                }
                vs0.a aVar6 = new vs0.a(aVar5, dIntValue, d15, functionalThresholdPower, hVar != null ? hVar.getPowerToWeight() : null, null, 32, null);
                aVar2.f100688g = aVar6;
                return new v2.b(aVar6, 200, null, null, 12, null);
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"jt0/a$c", "Lf32/p;", "Lvs0/c;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends f32.p<vs0.c> {

        /* JADX INFO: renamed from: jt0.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getSportSpecificLTDailySummaryDataAdapter$1", f = "LactateThresholdViewModel.kt", l = {167, 168, 169, 170}, m = "requestSafeSummary", v = 2)
        public static final class C1933a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public j0 f100709a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public i0 f100710b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public i0 f100711c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public v2 f100712d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public v2 f100713e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public v2 f100714f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public /* synthetic */ Object f100715g;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f100717i;

            public C1933a(t13.d<? super C1933a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f100715g = obj;
                this.f100717i |= Integer.MIN_VALUE;
                return c.this.b(null, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo61/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getSportSpecificLTDailySummaryDataAdapter$1$requestSafeSummary$ftpCall$1", f = "LactateThresholdViewModel.kt", l = {131}, m = "invokeSuspend", v = 2)
        public static final class b extends i implements p<b0, t13.d<? super v2<? extends List<? extends o61.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100718a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100719b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f100720c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f100721d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, o oVar, o oVar2, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f100719b = aVar;
                this.f100720c = oVar;
                this.f100721d = oVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f100719b, this.f100720c, this.f100721d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends o61.b>>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100718a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100719b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                List<String> list = aVar2.f100686e;
                this.f100718a = 1;
                Object objC = aVar3.c(str, this.f100720c, this.f100721d, list, "daily", this);
                return objC == aVar ? aVar : objC;
            }
        }

        /* JADX INFO: renamed from: jt0.a$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo61/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getSportSpecificLTDailySummaryDataAdapter$1$requestSafeSummary$heartRateCall$1", f = "LactateThresholdViewModel.kt", l = {149}, m = "invokeSuspend", v = 2)
        public static final class C1934c extends i implements p<b0, t13.d<? super v2<? extends List<? extends o61.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100722a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100723b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f100724c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f100725d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1934c(a aVar, o oVar, o oVar2, t13.d<? super C1934c> dVar) {
                super(2, dVar);
                this.f100723b = aVar;
                this.f100724c = oVar;
                this.f100725d = oVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1934c(this.f100723b, this.f100724c, this.f100725d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends o61.b>>> dVar) {
                return ((C1934c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100722a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100723b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                List<String> list = aVar2.f100686e;
                this.f100722a = 1;
                Object objF = aVar3.f(str, this.f100724c, this.f100725d, list, "daily", this);
                return objF == aVar ? aVar : objF;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo61/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getSportSpecificLTDailySummaryDataAdapter$1$requestSafeSummary$powerCall$1", f = "LactateThresholdViewModel.kt", l = {140}, m = "invokeSuspend", v = 2)
        public static final class d extends i implements p<b0, t13.d<? super v2<? extends List<? extends o61.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100726a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100727b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f100728c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f100729d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(a aVar, o oVar, o oVar2, t13.d<? super d> dVar) {
                super(2, dVar);
                this.f100727b = aVar;
                this.f100728c = oVar;
                this.f100729d = oVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new d(this.f100727b, this.f100728c, this.f100729d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends o61.b>>> dVar) {
                return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100726a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100727b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                List<String> list = aVar2.f100686e;
                this.f100726a = 1;
                Object objB = aVar3.b(str, this.f100728c, this.f100729d, list, "daily", this);
                return objB == aVar ? aVar : objB;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo61/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getSportSpecificLTDailySummaryDataAdapter$1$requestSafeSummary$speedCall$1", f = "LactateThresholdViewModel.kt", l = {158}, m = "invokeSuspend", v = 2)
        public static final class e extends i implements p<b0, t13.d<? super v2<? extends List<? extends o61.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100730a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100731b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f100732c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f100733d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(a aVar, o oVar, o oVar2, t13.d<? super e> dVar) {
                super(2, dVar);
                this.f100731b = aVar;
                this.f100732c = oVar;
                this.f100733d = oVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new e(this.f100731b, this.f100732c, this.f100733d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends o61.b>>> dVar) {
                return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100730a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100731b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                List<String> list = aVar2.f100686e;
                this.f100730a = 1;
                Object objA = aVar3.a(str, this.f100732c, this.f100733d, list, "daily", this);
                return objA == aVar ? aVar : objA;
            }
        }

        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:35:0x011a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // f32.p
        public final Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends vs0.c>> dVar) {
            C1933a c1933a;
            i0 i0VarJ;
            j0 j0Var;
            i0 i0Var;
            v2 v2Var;
            i0 i0Var2;
            v2 v2Var2;
            Object objAwait;
            v2 v2Var3;
            v2 v2Var4;
            Object objAwait2;
            v2 v2Var5;
            v2 v2Var6;
            v2 v2Var7;
            if (dVar instanceof C1933a) {
                c1933a = (C1933a) dVar;
                int i14 = c1933a.f100717i;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1933a.f100717i = i14 - Integer.MIN_VALUE;
                } else {
                    c1933a = new C1933a(dVar);
                }
            } else {
                c1933a = new C1933a(dVar);
            }
            Object objC = c1933a.f100715g;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1933a.f100717i;
            a aVar2 = a.this;
            if (i15 == 0) {
                r.b(objC);
                LocalDate localDate = dateTime.withTimeAtStartOfDay().toLocalDate();
                localDate.getClass();
                o oVarT = k.t(localDate);
                LocalDate localDate2 = dateTime2.withTimeAtStartOfDay().toLocalDate();
                localDate2.getClass();
                o oVarT2 = k.t(localDate2);
                j0 j0VarJ = ge1.b.j(v1.a(aVar2), null, null, new b(aVar2, oVarT, oVarT2, null), 3);
                j0 j0VarJ2 = ge1.b.j(v1.a(aVar2), null, null, new d(aVar2, oVarT, oVarT2, null), 3);
                j0 j0VarJ3 = ge1.b.j(v1.a(aVar2), null, null, new C1934c(aVar2, oVarT, oVarT2, null), 3);
                i0VarJ = ge1.b.j(v1.a(aVar2), null, null, new e(aVar2, oVarT, oVarT2, null), 3);
                c1933a.f100709a = j0VarJ2;
                c1933a.f100710b = j0VarJ3;
                c1933a.f100711c = i0VarJ;
                c1933a.f100717i = 1;
                objC = j0VarJ.C(c1933a);
                if (objC != aVar) {
                    j0Var = j0VarJ2;
                    i0Var = j0VarJ3;
                }
                return aVar;
            }
            if (i15 == 1) {
                i0VarJ = c1933a.f100711c;
                i0Var = c1933a.f100710b;
                j0Var = c1933a.f100709a;
                r.b(objC);
            } else {
                if (i15 == 2) {
                    v2Var = c1933a.f100712d;
                    i0Var2 = c1933a.f100711c;
                    i0Var = c1933a.f100710b;
                    r.b(objC);
                    v2Var2 = (v2) objC;
                    c1933a.f100709a = null;
                    c1933a.f100710b = null;
                    c1933a.f100711c = i0Var2;
                    c1933a.f100712d = v2Var;
                    c1933a.f100713e = v2Var2;
                    c1933a.f100717i = 3;
                    objAwait = i0Var.await(c1933a);
                    if (objAwait != aVar) {
                        v2Var3 = v2Var2;
                        objC = objAwait;
                        v2Var4 = (v2) objC;
                        c1933a.f100709a = null;
                        c1933a.f100710b = null;
                        c1933a.f100711c = null;
                        c1933a.f100712d = v2Var;
                        c1933a.f100713e = v2Var3;
                        c1933a.f100714f = v2Var4;
                        c1933a.f100717i = 4;
                        objAwait2 = i0Var2.await(c1933a);
                        if (objAwait2 != aVar) {
                            v2Var5 = v2Var4;
                            objC = objAwait2;
                            v2Var6 = v2Var;
                            v2Var7 = v2Var3;
                        }
                    }
                    return aVar;
                }
                if (i15 == 3) {
                    v2 v2Var8 = c1933a.f100713e;
                    v2 v2Var9 = c1933a.f100712d;
                    i0Var2 = c1933a.f100711c;
                    r.b(objC);
                    v2Var3 = v2Var8;
                    v2Var = v2Var9;
                    v2Var4 = (v2) objC;
                    c1933a.f100709a = null;
                    c1933a.f100710b = null;
                    c1933a.f100711c = null;
                    c1933a.f100712d = v2Var;
                    c1933a.f100713e = v2Var3;
                    c1933a.f100714f = v2Var4;
                    c1933a.f100717i = 4;
                    objAwait2 = i0Var2.await(c1933a);
                    if (objAwait2 != aVar) {
                        v2Var5 = v2Var4;
                        objC = objAwait2;
                        v2Var6 = v2Var;
                        v2Var7 = v2Var3;
                    }
                    return aVar;
                }
                if (i15 != 4) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var5 = c1933a.f100714f;
                v2Var7 = c1933a.f100713e;
                v2Var6 = c1933a.f100712d;
                r.b(objC);
            }
            return new v2.b(a.y4(aVar2, v2Var6, v2Var7, v2Var5, (v2) objC), 200, null, null, 12, null);
            v2 v2Var10 = (v2) objC;
            c1933a.f100709a = null;
            c1933a.f100710b = i0Var;
            c1933a.f100711c = i0VarJ;
            c1933a.f100712d = v2Var10;
            c1933a.f100717i = 2;
            Object objAwait3 = j0Var.await(c1933a);
            if (objAwait3 != aVar) {
                i0 i0Var3 = i0VarJ;
                v2Var = v2Var10;
                objC = objAwait3;
                i0Var2 = i0Var3;
                v2Var2 = (v2) objC;
                c1933a.f100709a = null;
                c1933a.f100710b = null;
                c1933a.f100711c = i0Var2;
                c1933a.f100712d = v2Var;
                c1933a.f100713e = v2Var2;
                c1933a.f100717i = 3;
                objAwait = i0Var.await(c1933a);
                if (objAwait != aVar) {
                    v2Var3 = v2Var2;
                    objC = objAwait;
                    v2Var4 = (v2) objC;
                    c1933a.f100709a = null;
                    c1933a.f100710b = null;
                    c1933a.f100711c = null;
                    c1933a.f100712d = v2Var;
                    c1933a.f100713e = v2Var3;
                    c1933a.f100714f = v2Var4;
                    c1933a.f100717i = 4;
                    objAwait2 = i0Var2.await(c1933a);
                    if (objAwait2 != aVar) {
                        v2Var5 = v2Var4;
                        objC = objAwait2;
                        v2Var6 = v2Var;
                        v2Var7 = v2Var3;
                        return new v2.b(a.y4(aVar2, v2Var6, v2Var7, v2Var5, (v2) objC), 200, null, null, 12, null);
                    }
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"jt0/a$d", "Lf32/p;", "Lvs0/c;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends f32.p<vs0.c> {

        /* JADX INFO: renamed from: jt0.a$d$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getSportSpecificLTMonthlySummaryDataAdapter$1", f = "LactateThresholdViewModel.kt", l = {287, 288, 289, 290}, m = "requestSafeSummary", v = 2)
        public static final class C1935a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public j0 f100735a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public i0 f100736b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public i0 f100737c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public v2 f100738d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public v2 f100739e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public v2 f100740f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public /* synthetic */ Object f100741g;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f100743i;

            public C1935a(t13.d<? super C1935a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f100741g = obj;
                this.f100743i |= Integer.MIN_VALUE;
                return d.this.b(null, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo61/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getSportSpecificLTMonthlySummaryDataAdapter$1$requestSafeSummary$ftpCall$1", f = "LactateThresholdViewModel.kt", l = {251}, m = "invokeSuspend", v = 2)
        public static final class b extends i implements p<b0, t13.d<? super v2<? extends List<? extends o61.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100744a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100745b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f100746c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f100747d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, o oVar, o oVar2, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f100745b = aVar;
                this.f100746c = oVar;
                this.f100747d = oVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f100745b, this.f100746c, this.f100747d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends o61.b>>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100744a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100745b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                List<String> list = aVar2.f100686e;
                this.f100744a = 1;
                Object objC = aVar3.c(str, this.f100746c, this.f100747d, list, "monthly", this);
                return objC == aVar ? aVar : objC;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo61/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getSportSpecificLTMonthlySummaryDataAdapter$1$requestSafeSummary$heartRateCall$1", f = "LactateThresholdViewModel.kt", l = {269}, m = "invokeSuspend", v = 2)
        public static final class c extends i implements p<b0, t13.d<? super v2<? extends List<? extends o61.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100748a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100749b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f100750c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f100751d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a aVar, o oVar, o oVar2, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f100749b = aVar;
                this.f100750c = oVar;
                this.f100751d = oVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f100749b, this.f100750c, this.f100751d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends o61.b>>> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100748a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100749b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                List<String> list = aVar2.f100686e;
                this.f100748a = 1;
                Object objF = aVar3.f(str, this.f100750c, this.f100751d, list, "monthly", this);
                return objF == aVar ? aVar : objF;
            }
        }

        /* JADX INFO: renamed from: jt0.a$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo61/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getSportSpecificLTMonthlySummaryDataAdapter$1$requestSafeSummary$powerCall$1", f = "LactateThresholdViewModel.kt", l = {260}, m = "invokeSuspend", v = 2)
        public static final class C1936d extends i implements p<b0, t13.d<? super v2<? extends List<? extends o61.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100752a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100753b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f100754c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f100755d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1936d(a aVar, o oVar, o oVar2, t13.d<? super C1936d> dVar) {
                super(2, dVar);
                this.f100753b = aVar;
                this.f100754c = oVar;
                this.f100755d = oVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1936d(this.f100753b, this.f100754c, this.f100755d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends o61.b>>> dVar) {
                return ((C1936d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100752a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100753b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                List<String> list = aVar2.f100686e;
                this.f100752a = 1;
                Object objB = aVar3.b(str, this.f100754c, this.f100755d, list, "monthly", this);
                return objB == aVar ? aVar : objB;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo61/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getSportSpecificLTMonthlySummaryDataAdapter$1$requestSafeSummary$speedCall$1", f = "LactateThresholdViewModel.kt", l = {278}, m = "invokeSuspend", v = 2)
        public static final class e extends i implements p<b0, t13.d<? super v2<? extends List<? extends o61.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100756a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100757b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f100758c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f100759d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(a aVar, o oVar, o oVar2, t13.d<? super e> dVar) {
                super(2, dVar);
                this.f100757b = aVar;
                this.f100758c = oVar;
                this.f100759d = oVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new e(this.f100757b, this.f100758c, this.f100759d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends o61.b>>> dVar) {
                return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100756a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100757b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                List<String> list = aVar2.f100686e;
                this.f100756a = 1;
                Object objA = aVar3.a(str, this.f100758c, this.f100759d, list, "monthly", this);
                return objA == aVar ? aVar : objA;
            }
        }

        public d() {
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:35:0x011a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // f32.p
        public final Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends vs0.c>> dVar) {
            C1935a c1935a;
            i0 i0VarJ;
            j0 j0Var;
            i0 i0Var;
            v2 v2Var;
            i0 i0Var2;
            v2 v2Var2;
            Object objAwait;
            v2 v2Var3;
            v2 v2Var4;
            Object objAwait2;
            v2 v2Var5;
            v2 v2Var6;
            v2 v2Var7;
            if (dVar instanceof C1935a) {
                c1935a = (C1935a) dVar;
                int i14 = c1935a.f100743i;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1935a.f100743i = i14 - Integer.MIN_VALUE;
                } else {
                    c1935a = new C1935a(dVar);
                }
            } else {
                c1935a = new C1935a(dVar);
            }
            Object objC = c1935a.f100741g;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1935a.f100743i;
            a aVar2 = a.this;
            if (i15 == 0) {
                r.b(objC);
                LocalDate localDate = dateTime.withTimeAtStartOfDay().toLocalDate();
                localDate.getClass();
                o oVarT = k.t(localDate);
                LocalDate localDate2 = dateTime2.withTimeAtStartOfDay().toLocalDate();
                localDate2.getClass();
                o oVarT2 = k.t(localDate2);
                j0 j0VarJ = ge1.b.j(v1.a(aVar2), null, null, new b(aVar2, oVarT, oVarT2, null), 3);
                j0 j0VarJ2 = ge1.b.j(v1.a(aVar2), null, null, new C1936d(aVar2, oVarT, oVarT2, null), 3);
                j0 j0VarJ3 = ge1.b.j(v1.a(aVar2), null, null, new c(aVar2, oVarT, oVarT2, null), 3);
                i0VarJ = ge1.b.j(v1.a(aVar2), null, null, new e(aVar2, oVarT, oVarT2, null), 3);
                c1935a.f100735a = j0VarJ2;
                c1935a.f100736b = j0VarJ3;
                c1935a.f100737c = i0VarJ;
                c1935a.f100743i = 1;
                objC = j0VarJ.C(c1935a);
                if (objC != aVar) {
                    j0Var = j0VarJ2;
                    i0Var = j0VarJ3;
                }
                return aVar;
            }
            if (i15 == 1) {
                i0VarJ = c1935a.f100737c;
                i0Var = c1935a.f100736b;
                j0Var = c1935a.f100735a;
                r.b(objC);
            } else {
                if (i15 == 2) {
                    v2Var = c1935a.f100738d;
                    i0Var2 = c1935a.f100737c;
                    i0Var = c1935a.f100736b;
                    r.b(objC);
                    v2Var2 = (v2) objC;
                    c1935a.f100735a = null;
                    c1935a.f100736b = null;
                    c1935a.f100737c = i0Var2;
                    c1935a.f100738d = v2Var;
                    c1935a.f100739e = v2Var2;
                    c1935a.f100743i = 3;
                    objAwait = i0Var.await(c1935a);
                    if (objAwait != aVar) {
                        v2Var3 = v2Var2;
                        objC = objAwait;
                        v2Var4 = (v2) objC;
                        c1935a.f100735a = null;
                        c1935a.f100736b = null;
                        c1935a.f100737c = null;
                        c1935a.f100738d = v2Var;
                        c1935a.f100739e = v2Var3;
                        c1935a.f100740f = v2Var4;
                        c1935a.f100743i = 4;
                        objAwait2 = i0Var2.await(c1935a);
                        if (objAwait2 != aVar) {
                            v2Var5 = v2Var4;
                            objC = objAwait2;
                            v2Var6 = v2Var;
                            v2Var7 = v2Var3;
                        }
                    }
                    return aVar;
                }
                if (i15 == 3) {
                    v2 v2Var8 = c1935a.f100739e;
                    v2 v2Var9 = c1935a.f100738d;
                    i0Var2 = c1935a.f100737c;
                    r.b(objC);
                    v2Var3 = v2Var8;
                    v2Var = v2Var9;
                    v2Var4 = (v2) objC;
                    c1935a.f100735a = null;
                    c1935a.f100736b = null;
                    c1935a.f100737c = null;
                    c1935a.f100738d = v2Var;
                    c1935a.f100739e = v2Var3;
                    c1935a.f100740f = v2Var4;
                    c1935a.f100743i = 4;
                    objAwait2 = i0Var2.await(c1935a);
                    if (objAwait2 != aVar) {
                        v2Var5 = v2Var4;
                        objC = objAwait2;
                        v2Var6 = v2Var;
                        v2Var7 = v2Var3;
                    }
                    return aVar;
                }
                if (i15 != 4) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var5 = c1935a.f100740f;
                v2Var7 = c1935a.f100739e;
                v2Var6 = c1935a.f100738d;
                r.b(objC);
            }
            return new v2.b(a.y4(aVar2, v2Var6, v2Var7, v2Var5, (v2) objC), 200, null, null, 12, null);
            v2 v2Var10 = (v2) objC;
            c1935a.f100735a = null;
            c1935a.f100736b = i0Var;
            c1935a.f100737c = i0VarJ;
            c1935a.f100738d = v2Var10;
            c1935a.f100743i = 2;
            Object objAwait3 = j0Var.await(c1935a);
            if (objAwait3 != aVar) {
                i0 i0Var3 = i0VarJ;
                v2Var = v2Var10;
                objC = objAwait3;
                i0Var2 = i0Var3;
                v2Var2 = (v2) objC;
                c1935a.f100735a = null;
                c1935a.f100736b = null;
                c1935a.f100737c = i0Var2;
                c1935a.f100738d = v2Var;
                c1935a.f100739e = v2Var2;
                c1935a.f100743i = 3;
                objAwait = i0Var.await(c1935a);
                if (objAwait != aVar) {
                    v2Var3 = v2Var2;
                    objC = objAwait;
                    v2Var4 = (v2) objC;
                    c1935a.f100735a = null;
                    c1935a.f100736b = null;
                    c1935a.f100737c = null;
                    c1935a.f100738d = v2Var;
                    c1935a.f100739e = v2Var3;
                    c1935a.f100740f = v2Var4;
                    c1935a.f100743i = 4;
                    objAwait2 = i0Var2.await(c1935a);
                    if (objAwait2 != aVar) {
                        v2Var5 = v2Var4;
                        objC = objAwait2;
                        v2Var6 = v2Var;
                        v2Var7 = v2Var3;
                        return new v2.b(a.y4(aVar2, v2Var6, v2Var7, v2Var5, (v2) objC), 200, null, null, 12, null);
                    }
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"jt0/a$e", "Lf32/p;", "Lvs0/c;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends f32.p<vs0.c> {

        /* JADX INFO: renamed from: jt0.a$e$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getWeeklySportSpecificLTSummaryDataAdapter$1", f = "LactateThresholdViewModel.kt", l = {227, 228, 229, 230}, m = "requestSafeSummary", v = 2)
        public static final class C1937a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public j0 f100761a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public i0 f100762b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public i0 f100763c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public v2 f100764d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public v2 f100765e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public v2 f100766f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public /* synthetic */ Object f100767g;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f100769i;

            public C1937a(t13.d<? super C1937a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f100767g = obj;
                this.f100769i |= Integer.MIN_VALUE;
                return e.this.b(null, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo61/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getWeeklySportSpecificLTSummaryDataAdapter$1$requestSafeSummary$ftpCall$1", f = "LactateThresholdViewModel.kt", l = {191}, m = "invokeSuspend", v = 2)
        public static final class b extends i implements p<b0, t13.d<? super v2<? extends List<? extends o61.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100770a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100771b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f100772c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f100773d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, o oVar, o oVar2, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f100771b = aVar;
                this.f100772c = oVar;
                this.f100773d = oVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f100771b, this.f100772c, this.f100773d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends o61.b>>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100770a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100771b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                List<String> list = aVar2.f100686e;
                this.f100770a = 1;
                Object objC = aVar3.c(str, this.f100772c, this.f100773d, list, "weekly", this);
                return objC == aVar ? aVar : objC;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo61/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getWeeklySportSpecificLTSummaryDataAdapter$1$requestSafeSummary$heartRateCall$1", f = "LactateThresholdViewModel.kt", l = {209}, m = "invokeSuspend", v = 2)
        public static final class c extends i implements p<b0, t13.d<? super v2<? extends List<? extends o61.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100774a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100775b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f100776c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f100777d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a aVar, o oVar, o oVar2, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f100775b = aVar;
                this.f100776c = oVar;
                this.f100777d = oVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new c(this.f100775b, this.f100776c, this.f100777d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends o61.b>>> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100774a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100775b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                List<String> list = aVar2.f100686e;
                this.f100774a = 1;
                Object objF = aVar3.f(str, this.f100776c, this.f100777d, list, "weekly", this);
                return objF == aVar ? aVar : objF;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo61/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getWeeklySportSpecificLTSummaryDataAdapter$1$requestSafeSummary$powerCall$1", f = "LactateThresholdViewModel.kt", l = {200}, m = "invokeSuspend", v = 2)
        public static final class d extends i implements p<b0, t13.d<? super v2<? extends List<? extends o61.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100778a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100779b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f100780c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f100781d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(a aVar, o oVar, o oVar2, t13.d<? super d> dVar) {
                super(2, dVar);
                this.f100779b = aVar;
                this.f100780c = oVar;
                this.f100781d = oVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new d(this.f100779b, this.f100780c, this.f100781d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends o61.b>>> dVar) {
                return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100778a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100779b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                List<String> list = aVar2.f100686e;
                this.f100778a = 1;
                Object objB = aVar3.b(str, this.f100780c, this.f100781d, list, "weekly", this);
                return objB == aVar ? aVar : objB;
            }
        }

        /* JADX INFO: renamed from: jt0.a$e$e, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo61/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$getWeeklySportSpecificLTSummaryDataAdapter$1$requestSafeSummary$speedCall$1", f = "LactateThresholdViewModel.kt", l = {218}, m = "invokeSuspend", v = 2)
        public static final class C1938e extends i implements p<b0, t13.d<? super v2<? extends List<? extends o61.b>>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100782a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100783b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f100784c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f100785d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1938e(a aVar, o oVar, o oVar2, t13.d<? super C1938e> dVar) {
                super(2, dVar);
                this.f100783b = aVar;
                this.f100784c = oVar;
                this.f100785d = oVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1938e(this.f100783b, this.f100784c, this.f100785d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends o61.b>>> dVar) {
                return ((C1938e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100782a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100783b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                List<String> list = aVar2.f100686e;
                this.f100782a = 1;
                Object objA = aVar3.a(str, this.f100784c, this.f100785d, list, "weekly", this);
                return objA == aVar ? aVar : objA;
            }
        }

        public e() {
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:35:0x011a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // f32.p
        public final Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends vs0.c>> dVar) {
            C1937a c1937a;
            i0 i0VarJ;
            j0 j0Var;
            i0 i0Var;
            v2 v2Var;
            i0 i0Var2;
            v2 v2Var2;
            Object objAwait;
            v2 v2Var3;
            v2 v2Var4;
            Object objAwait2;
            v2 v2Var5;
            v2 v2Var6;
            v2 v2Var7;
            if (dVar instanceof C1937a) {
                c1937a = (C1937a) dVar;
                int i14 = c1937a.f100769i;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1937a.f100769i = i14 - Integer.MIN_VALUE;
                } else {
                    c1937a = new C1937a(dVar);
                }
            } else {
                c1937a = new C1937a(dVar);
            }
            Object objC = c1937a.f100767g;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1937a.f100769i;
            a aVar2 = a.this;
            if (i15 == 0) {
                r.b(objC);
                LocalDate localDate = dateTime.withTimeAtStartOfDay().toLocalDate();
                localDate.getClass();
                o oVarT = k.t(localDate);
                LocalDate localDate2 = dateTime2.withTimeAtStartOfDay().toLocalDate();
                localDate2.getClass();
                o oVarT2 = k.t(localDate2);
                j0 j0VarJ = ge1.b.j(v1.a(aVar2), null, null, new b(aVar2, oVarT, oVarT2, null), 3);
                j0 j0VarJ2 = ge1.b.j(v1.a(aVar2), null, null, new d(aVar2, oVarT, oVarT2, null), 3);
                j0 j0VarJ3 = ge1.b.j(v1.a(aVar2), null, null, new c(aVar2, oVarT, oVarT2, null), 3);
                i0VarJ = ge1.b.j(v1.a(aVar2), null, null, new C1938e(aVar2, oVarT, oVarT2, null), 3);
                c1937a.f100761a = j0VarJ2;
                c1937a.f100762b = j0VarJ3;
                c1937a.f100763c = i0VarJ;
                c1937a.f100769i = 1;
                objC = j0VarJ.C(c1937a);
                if (objC != aVar) {
                    j0Var = j0VarJ2;
                    i0Var = j0VarJ3;
                }
                return aVar;
            }
            if (i15 == 1) {
                i0VarJ = c1937a.f100763c;
                i0Var = c1937a.f100762b;
                j0Var = c1937a.f100761a;
                r.b(objC);
            } else {
                if (i15 == 2) {
                    v2Var = c1937a.f100764d;
                    i0Var2 = c1937a.f100763c;
                    i0Var = c1937a.f100762b;
                    r.b(objC);
                    v2Var2 = (v2) objC;
                    c1937a.f100761a = null;
                    c1937a.f100762b = null;
                    c1937a.f100763c = i0Var2;
                    c1937a.f100764d = v2Var;
                    c1937a.f100765e = v2Var2;
                    c1937a.f100769i = 3;
                    objAwait = i0Var.await(c1937a);
                    if (objAwait != aVar) {
                        v2Var3 = v2Var2;
                        objC = objAwait;
                        v2Var4 = (v2) objC;
                        c1937a.f100761a = null;
                        c1937a.f100762b = null;
                        c1937a.f100763c = null;
                        c1937a.f100764d = v2Var;
                        c1937a.f100765e = v2Var3;
                        c1937a.f100766f = v2Var4;
                        c1937a.f100769i = 4;
                        objAwait2 = i0Var2.await(c1937a);
                        if (objAwait2 != aVar) {
                            v2Var5 = v2Var4;
                            objC = objAwait2;
                            v2Var6 = v2Var;
                            v2Var7 = v2Var3;
                        }
                    }
                    return aVar;
                }
                if (i15 == 3) {
                    v2 v2Var8 = c1937a.f100765e;
                    v2 v2Var9 = c1937a.f100764d;
                    i0Var2 = c1937a.f100763c;
                    r.b(objC);
                    v2Var3 = v2Var8;
                    v2Var = v2Var9;
                    v2Var4 = (v2) objC;
                    c1937a.f100761a = null;
                    c1937a.f100762b = null;
                    c1937a.f100763c = null;
                    c1937a.f100764d = v2Var;
                    c1937a.f100765e = v2Var3;
                    c1937a.f100766f = v2Var4;
                    c1937a.f100769i = 4;
                    objAwait2 = i0Var2.await(c1937a);
                    if (objAwait2 != aVar) {
                        v2Var5 = v2Var4;
                        objC = objAwait2;
                        v2Var6 = v2Var;
                        v2Var7 = v2Var3;
                    }
                    return aVar;
                }
                if (i15 != 4) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var5 = c1937a.f100766f;
                v2Var7 = c1937a.f100765e;
                v2Var6 = c1937a.f100764d;
                r.b(objC);
            }
            return new v2.b(a.y4(aVar2, v2Var6, v2Var7, v2Var5, (v2) objC), 200, null, null, 12, null);
            v2 v2Var10 = (v2) objC;
            c1937a.f100761a = null;
            c1937a.f100762b = i0Var;
            c1937a.f100763c = i0VarJ;
            c1937a.f100764d = v2Var10;
            c1937a.f100769i = 2;
            Object objAwait3 = j0Var.await(c1937a);
            if (objAwait3 != aVar) {
                i0 i0Var3 = i0VarJ;
                v2Var = v2Var10;
                objC = objAwait3;
                i0Var2 = i0Var3;
                v2Var2 = (v2) objC;
                c1937a.f100761a = null;
                c1937a.f100762b = null;
                c1937a.f100763c = i0Var2;
                c1937a.f100764d = v2Var;
                c1937a.f100765e = v2Var2;
                c1937a.f100769i = 3;
                objAwait = i0Var.await(c1937a);
                if (objAwait != aVar) {
                    v2Var3 = v2Var2;
                    objC = objAwait;
                    v2Var4 = (v2) objC;
                    c1937a.f100761a = null;
                    c1937a.f100762b = null;
                    c1937a.f100763c = null;
                    c1937a.f100764d = v2Var;
                    c1937a.f100765e = v2Var3;
                    c1937a.f100766f = v2Var4;
                    c1937a.f100769i = 4;
                    objAwait2 = i0Var2.await(c1937a);
                    if (objAwait2 != aVar) {
                        v2Var5 = v2Var4;
                        objC = objAwait2;
                        v2Var6 = v2Var;
                        v2Var7 = v2Var3;
                        return new v2.b(a.y4(aVar2, v2Var6, v2Var7, v2Var5, (v2) objC), 200, null, null, 12, null);
                    }
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"jt0/a$f", "Lf32/p;", "Lo13/p;", "Lcom/garmin/android/apps/connectmobile/lactate_threshold/reports/data/model/LactateSummaryMeasurementsDTO;", "Lvs0/a;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends f32.p<o13.p<? extends LactateSummaryMeasurementsDTO, ? extends vs0.a>> {

        /* JADX INFO: renamed from: jt0.a$f$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$lactateThresholdDailySummaryDataAdapter$1", f = "LactateThresholdViewModel.kt", l = {371, 382}, m = "requestSafeSummary", v = 2)
        public static final class C1939a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public j0 f100787a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f100788b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f100790d;

            public C1939a(t13.d<? super C1939a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f100788b = obj;
                this.f100790d |= Integer.MIN_VALUE;
                return f.this.b(null, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/lactate_threshold/reports/data/model/LactateSummaryMeasurementsDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$lactateThresholdDailySummaryDataAdapter$1$requestSafeSummary$request$1", f = "LactateThresholdViewModel.kt", l = {361}, m = "invokeSuspend", v = 2)
        public static final class b extends i implements p<b0, t13.d<? super v2<? extends LactateSummaryMeasurementsDTO>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100791a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100792b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f100793c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f100794d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, o oVar, o oVar2, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f100792b = aVar;
                this.f100793c = oVar;
                this.f100794d = oVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f100792b, this.f100793c, this.f100794d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends LactateSummaryMeasurementsDTO>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100791a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100792b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                String str2 = aVar2.f100682a.f192068a;
                List<String> list = aVar2.f100687f;
                this.f100791a = 1;
                Object objD = aVar3.d(str, this.f100793c, this.f100794d, str2, "daily", list, this);
                return objD == aVar ? aVar : objD;
            }
        }

        public f() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
        
            if (r1 == r3) goto L26;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f32.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends o13.p<? extends LactateSummaryMeasurementsDTO, ? extends vs0.a>>> dVar) {
            C1939a c1939a;
            j0 j0VarJ;
            if (dVar instanceof C1939a) {
                c1939a = (C1939a) dVar;
                int i14 = c1939a.f100790d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1939a.f100790d = i14 - Integer.MIN_VALUE;
                } else {
                    c1939a = new C1939a(dVar);
                }
            } else {
                c1939a = new C1939a(dVar);
            }
            Object objH = c1939a.f100788b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1939a.f100790d;
            a aVar2 = a.this;
            if (i15 != 0) {
                if (i15 == 1) {
                    j0VarJ = c1939a.f100787a;
                    r.b(objH);
                } else {
                    if (i15 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(objH);
                }
                v2 v2Var = (v2) objH;
                if (v2Var instanceof v2.b) {
                    return new v2.b(new o13.p(((v2.b) v2Var).f47386a, aVar2.f100688g), 200, null, null, 12, null);
                }
                if (v2Var instanceof v2.a) {
                    return new v2.a(((v2.a) v2Var).f47383a, null, null, 6, null);
                }
                u0.r();
                return null;
            }
            r.b(objH);
            LocalDate localDate = dateTime.withTimeAtStartOfDay().toLocalDate();
            localDate.getClass();
            o oVarT = k.t(localDate);
            LocalDate localDate2 = dateTime2.withTimeAtStartOfDay().toLocalDate();
            localDate2.getClass();
            j0VarJ = ge1.b.j(v1.a(aVar2), null, null, new b(aVar2, oVarT, k.t(localDate2), null), 3);
            ws0.a aVar3 = aVar2.f100683b;
            String str = aVar2.f100685d;
            c1939a.f100787a = j0VarJ;
            c1939a.f100790d = 1;
            objH = aVar3.h(str, c1939a);
            if (objH != aVar) {
            }
            return aVar;
            v2 v2Var2 = (v2) objH;
            aVar2.f100688g = v2Var2 instanceof v2.b ? a.x4(aVar2, (BiometricProfileDTO) ((v2.b) v2Var2).f47386a) : new vs0.a(aVar2.f100682a, Double.NaN, Double.NaN, null, null, null, 56, null);
            c1939a.f100787a = null;
            c1939a.f100790d = 2;
            objH = j0VarJ.await(c1939a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"jt0/a$g", "Lf32/p;", "Lo13/p;", "Lcom/garmin/android/apps/connectmobile/lactate_threshold/reports/data/model/LactateSummaryMeasurementsDTO;", "Lvs0/a;", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g extends f32.p<o13.p<? extends LactateSummaryMeasurementsDTO, ? extends vs0.a>> {

        /* JADX INFO: renamed from: jt0.a$g$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$lactateThresholdSummaryDataAdapter$1", f = "LactateThresholdViewModel.kt", l = {414, 425}, m = "requestSafeSummary", v = 2)
        public static final class C1940a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public j0 f100796a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f100797b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f100799d;

            public C1940a(t13.d<? super C1940a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f100797b = obj;
                this.f100799d |= Integer.MIN_VALUE;
                return g.this.b(null, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/lactate_threshold/reports/data/model/LactateSummaryMeasurementsDTO;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.lactate_threshold.reports.presentation.viewmodel.LactateThresholdViewModel$lactateThresholdSummaryDataAdapter$1$requestSafeSummary$request$1", f = "LactateThresholdViewModel.kt", l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS}, m = "invokeSuspend", v = 2)
        public static final class b extends i implements p<b0, t13.d<? super v2<? extends LactateSummaryMeasurementsDTO>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f100800a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f100801b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o f100802c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o f100803d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, o oVar, o oVar2, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f100801b = aVar;
                this.f100802c = oVar;
                this.f100803d = oVar2;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f100801b, this.f100802c, this.f100803d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends LactateSummaryMeasurementsDTO>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f100800a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                a aVar2 = this.f100801b;
                ws0.a aVar3 = aVar2.f100683b;
                String str = aVar2.f100684c;
                String str2 = aVar2.f100682a.f192068a;
                List<String> list = aVar2.f100687f;
                this.f100800a = 1;
                Object objD = aVar3.d(str, this.f100802c, this.f100803d, str2, "monthly", list, this);
                return objD == aVar ? aVar : objD;
            }
        }

        public g() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ad, code lost:
        
            if (r1 == r3) goto L26;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f32.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(DateTime dateTime, DateTime dateTime2, t13.d<? super v2<? extends o13.p<? extends LactateSummaryMeasurementsDTO, ? extends vs0.a>>> dVar) {
            C1940a c1940a;
            j0 j0VarJ;
            if (dVar instanceof C1940a) {
                c1940a = (C1940a) dVar;
                int i14 = c1940a.f100799d;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1940a.f100799d = i14 - Integer.MIN_VALUE;
                } else {
                    c1940a = new C1940a(dVar);
                }
            } else {
                c1940a = new C1940a(dVar);
            }
            Object objH = c1940a.f100797b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1940a.f100799d;
            a aVar2 = a.this;
            if (i15 != 0) {
                if (i15 == 1) {
                    j0VarJ = c1940a.f100796a;
                    r.b(objH);
                } else {
                    if (i15 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(objH);
                }
                v2 v2Var = (v2) objH;
                if (v2Var instanceof v2.b) {
                    return new v2.b(new o13.p(((v2.b) v2Var).f47386a, aVar2.f100688g), 200, null, null, 12, null);
                }
                if (v2Var instanceof v2.a) {
                    return new v2.a(((v2.a) v2Var).f47383a, null, null, 6, null);
                }
                u0.r();
                return null;
            }
            r.b(objH);
            LocalDate localDate = dateTime.withTimeAtStartOfDay().toLocalDate();
            localDate.getClass();
            o oVarT = k.t(localDate);
            LocalDate localDate2 = dateTime2.withTimeAtStartOfDay().toLocalDate();
            localDate2.getClass();
            j0VarJ = ge1.b.j(v1.a(aVar2), null, null, new b(aVar2, oVarT, k.t(localDate2), null), 3);
            ws0.a aVar3 = aVar2.f100683b;
            String str = aVar2.f100685d;
            c1940a.f100796a = j0VarJ;
            c1940a.f100799d = 1;
            objH = aVar3.h(str, c1940a);
            if (objH != aVar) {
            }
            return aVar;
            v2 v2Var2 = (v2) objH;
            aVar2.f100688g = v2Var2 instanceof v2.b ? a.x4(aVar2, (BiometricProfileDTO) ((v2.b) v2Var2).f47386a) : new vs0.a(aVar2.f100682a, Double.NaN, Double.NaN, null, null, null, 56, null);
            c1940a.f100796a = null;
            c1940a.f100799d = 2;
            objH = j0VarJ.await(c1940a);
        }
    }

    static {
        new C1930a(null);
    }

    public a(xs0.a aVar, ws0.a aVar2, String str, String str2, a0 a0Var) {
        aVar.getClass();
        aVar2.getClass();
        str.getClass();
        str2.getClass();
        a0Var.getClass();
        this.f100682a = aVar;
        this.f100683b = aVar2;
        this.f100684c = str;
        this.f100685d = str2;
        this.f100686e = w.c(aVar.f192068a);
        this.f100687f = x.k(e2.ACTIVITY_AVG_LT_SPEED_MTR_PER_SEC.f3931a, e2.ACTIVITY_AVG_LACTATE_THRESHOLD_BPM.f3931a);
        this.f100688g = new vs0.a(aVar, Double.NaN, Double.NaN, null, null, null, 56, null);
        this.f100689h = new y0<>(xs0.b.PACE);
        this.f100690i = new l(new f32.a(v1.a(this), new b(), a0Var));
        this.f100691j = new m(new j(v1.a(this), new c(), a0Var));
        this.f100692k = new m(new j(v1.a(this), new e(), a0Var));
        this.f100693l = new m(new j(v1.a(this), new d(), a0Var));
        this.f100694m = new m(new j(v1.a(this), new f(), a0Var));
        this.f100695n = new m(new j(v1.a(this), new g(), a0Var));
    }

    public static final vs0.a x4(a aVar, BiometricProfileDTO biometricProfileDTO) {
        BiometricThresholdDTO biometricThresholdDTO;
        aVar.getClass();
        BiometricThresholdDTO biometricThresholdDTO2 = biometricProfileDTO.f46805h;
        if (biometricThresholdDTO2 == null || (biometricThresholdDTO = biometricProfileDTO.f46804g) == null) {
            return new vs0.a(aVar.f100682a, Double.NaN, Double.NaN, null, null, null, 56, null);
        }
        double d14 = biometricThresholdDTO.f46809b;
        if (!Double.isNaN(d14)) {
            d14 *= (double) 10;
        }
        return new vs0.a(aVar.f100682a, biometricThresholdDTO2.f46809b, d14, null, null, null, 56, null);
    }

    public static final vs0.c y4(a aVar, v2 v2Var, v2 v2Var2, v2 v2Var3, v2 v2Var4) {
        vs0.c cVarA;
        vs0.c cVarA2;
        vs0.c cVarA3;
        aVar.getClass();
        vs0.c cVar = new vs0.c(null, null, null, null, 15, null);
        if (v2Var instanceof v2.b) {
            cVarA = vs0.c.a(cVar, null, (List) ((v2.b) v2Var).f47386a, null, null, 13);
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            cVarA = vs0.c.a(cVar, null, null, null, null, 13);
        }
        vs0.c cVar2 = cVarA;
        if (v2Var2 instanceof v2.b) {
            cVarA2 = vs0.c.a(cVar2, (List) ((v2.b) v2Var2).f47386a, null, null, null, 14);
        } else {
            if (!(v2Var2 instanceof v2.a)) {
                u0.r();
                return null;
            }
            cVarA2 = vs0.c.a(cVar2, null, null, null, null, 14);
        }
        vs0.c cVar3 = cVarA2;
        if (v2Var3 instanceof v2.b) {
            cVarA3 = vs0.c.a(cVar3, null, null, (List) ((v2.b) v2Var3).f47386a, null, 11);
        } else {
            if (!(v2Var3 instanceof v2.a)) {
                u0.r();
                return null;
            }
            cVarA3 = vs0.c.a(cVar3, null, null, null, null, 11);
        }
        vs0.c cVar4 = cVarA3;
        if (v2Var4 instanceof v2.b) {
            return vs0.c.a(cVar4, null, null, null, (List) ((v2.b) v2Var4).f47386a, 7);
        }
        if (v2Var4 instanceof v2.a) {
            return vs0.c.a(cVar4, null, null, null, null, 7);
        }
        u0.r();
        return null;
    }

    /* JADX INFO: renamed from: jt0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ljt0/a$a;", "", "<init>", "()V", "", "DAILY_AGGREGATION", "Ljava/lang/String;", "WEEKLY_AGGREGATION", "MONTHLY_AGGREGATION", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1930a {
        public /* synthetic */ C1930a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1930a() {
        }
    }

    public /* synthetic */ a(xs0.a aVar, ws0.a aVar2, String str, String str2, a0 a0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, aVar2, str, str2, (i14 & 16) != 0 ? new a0(null, null, null, 7, null) : a0Var);
    }
}
