package is0;

import androidx.lifecycle.t1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import gs1.t;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import o53.j0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import yr0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lis0/c;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zr0.a f94904a = (zr0.a) KoinJavaComponent.get$default(zr0.a.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<g3<Long>> f94905b = new y0<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<g3<List<o>>> f94906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0 f94907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f32.l f94908e;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"is0/c$a", "Lf32/e;", "Lyr0/g;", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements f32.e<yr0.g> {

        /* JADX INFO: renamed from: is0.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.JetLagSummaryViewModel$detailsDataAdapter$1", f = "JetLagSummaryViewModel.kt", l = {59, 60}, m = "requestDetails", v = 2)
        public static final class C1815a extends v13.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public j0 f94910a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public v2 f94911b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f94912c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f94914e;

            public C1815a(t13.d<? super C1815a> dVar) {
                super(dVar);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                this.f94912c = obj;
                this.f94914e |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lyr0/f;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.JetLagSummaryViewModel$detailsDataAdapter$1$requestDetails$deferredDailyStatus$1", f = "JetLagSummaryViewModel.kt", l = {56}, m = "invokeSuspend", v = 2)
        public static final class b extends v13.i implements p<b0, t13.d<? super v2<? extends yr0.f>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f94915a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f94916b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DateTime f94917c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, DateTime dateTime, t13.d<? super b> dVar) {
                super(2, dVar);
                this.f94916b = cVar;
                this.f94917c = dateTime;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(this.f94916b, this.f94917c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends yr0.f>> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f94915a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                zr0.a aVar2 = this.f94916b.f94904a;
                LocalDate localDate = this.f94917c.toLocalDate();
                localDate.getClass();
                this.f94915a = 1;
                Object objA = aVar2.a(localDate, this);
                return objA == aVar ? aVar : objA;
            }
        }

        /* JADX INFO: renamed from: is0.c$a$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lgs1/t;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.jet_lag.presentation.edit.JetLagSummaryViewModel$detailsDataAdapter$1$requestDetails$deferredTimeline$1", f = "JetLagSummaryViewModel.kt", l = {57}, m = "invokeSuspend", v = 2)
        public static final class C1816c extends v13.i implements p<b0, t13.d<? super v2<? extends t>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f94918a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f94919b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DateTime f94920c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1816c(c cVar, DateTime dateTime, t13.d<? super C1816c> dVar) {
                super(2, dVar);
                this.f94919b = cVar;
                this.f94920c = dateTime;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C1816c(this.f94919b, this.f94920c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super v2<? extends t>> dVar) {
                return ((C1816c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f94918a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                zr0.a aVar2 = this.f94919b.f94904a;
                this.f94918a = 1;
                Object objB = aVar2.b(this.f94920c, this);
                return objB == aVar ? aVar : objB;
            }
        }

        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0087  */
        /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:44:0x0100  */
        /* JADX WARN: Code duplicated, block: B:50:0x011d  */
        /* JADX WARN: Code duplicated, block: B:53:0x0127  */
        /* JADX WARN: Code duplicated, block: B:54:0x012c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f32.e
        public final Object a(DateTime dateTime, t13.d<? super yr0.g> dVar) throws Exception {
            C1815a c1815a;
            j0 j0VarJ;
            v2 v2Var;
            v2 v2Var2;
            v2.b bVar;
            yr0.f fVar;
            ns0.b bVar2;
            int iH;
            yr0.t tVarK;
            Integer num;
            if (dVar instanceof C1815a) {
                c1815a = (C1815a) dVar;
                int i14 = c1815a.f94914e;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    c1815a.f94914e = i14 - Integer.MIN_VALUE;
                } else {
                    c1815a = new C1815a(dVar);
                }
            } else {
                c1815a = new C1815a(dVar);
            }
            Object objC = c1815a.f94912c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = c1815a.f94914e;
            t tVar = null;
            if (i15 == 0) {
                r.b(objC);
                c cVar = c.this;
                j0 j0VarJ2 = ge1.b.j(v1.a(cVar), null, null, new b(cVar, dateTime, null), 3);
                j0VarJ = ge1.b.j(v1.a(cVar), null, null, new C1816c(cVar, dateTime, null), 3);
                c1815a.f94910a = j0VarJ;
                c1815a.f94914e = 1;
                objC = j0VarJ2.C(c1815a);
                if (objC != aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                j0VarJ = c1815a.f94910a;
                r.b(objC);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var = c1815a.f94911b;
                r.b(objC);
            }
            v2Var2 = (v2) objC;
            if (v2Var instanceof v2.a) {
                v2.a aVar2 = (v2.a) v2Var;
                num = aVar2.f47384b;
                if (num != null || num.intValue() != 404) {
                    throw aVar2.f47383a;
                }
                fVar = new yr0.f((Long) null, (Long) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, (Integer) null, (String) null, (List) null, (String) null, (String) null, (Integer) null, (List) null, 131071, (p005kotlin.jvm.internal.j) null);
            } else {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                bVar = (v2.b) v2Var;
                if (bVar.f47387b == 204) {
                    fVar = new yr0.f((Long) null, (Long) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, (Integer) null, (String) null, (List) null, (String) null, (String) null, (Integer) null, (List) null, 131071, (p005kotlin.jvm.internal.j) null);
                } else {
                    fVar = (yr0.f) bVar.f47386a;
                }
            }
            if (!(v2Var2 instanceof v2.a)) {
                if (v2Var2 instanceof v2.b) {
                    u0.r();
                    return null;
                }
                tVar = (t) ((v2.b) v2Var2).f47386a;
            }
            bVar2 = ns0.b.f127812a;
            bVar2.getClass();
            iH = ns0.b.h(fVar);
            if ((v2Var instanceof v2.b) || ((v2.b) v2Var).f47387b != 204) {
                tVarK = bVar2.k(fVar, iH);
            } else {
                tVarK = yr0.t.PAST_NO_GUIDANCE;
            }
            return new yr0.g(fVar, tVar, tVarK);
            v2 v2Var3 = (v2) objC;
            c1815a.f94910a = null;
            c1815a.f94911b = v2Var3;
            c1815a.f94914e = 2;
            Object objAwait = j0VarJ.await(c1815a);
            if (objAwait != aVar) {
                objC = objAwait;
                v2Var = v2Var3;
                v2Var2 = (v2) objC;
                if (v2Var instanceof v2.a) {
                    v2.a aVar3 = (v2.a) v2Var;
                    num = aVar3.f47384b;
                    if (num != null) {
                    }
                    throw aVar3.f47383a;
                }
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                bVar = (v2.b) v2Var;
                if (bVar.f47387b == 204) {
                    fVar = new yr0.f((Long) null, (Long) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, (Integer) null, (String) null, (List) null, (String) null, (String) null, (Integer) null, (List) null, 131071, (p005kotlin.jvm.internal.j) null);
                } else {
                    fVar = (yr0.f) bVar.f47386a;
                }
                if (!(v2Var2 instanceof v2.a)) {
                    if (v2Var2 instanceof v2.b) {
                        u0.r();
                        return null;
                    }
                    tVar = (t) ((v2.b) v2Var2).f47386a;
                }
                bVar2 = ns0.b.f127812a;
                bVar2.getClass();
                iH = ns0.b.h(fVar);
                if (v2Var instanceof v2.b) {
                    tVarK = bVar2.k(fVar, iH);
                } else {
                    tVarK = bVar2.k(fVar, iH);
                }
                return new yr0.g(fVar, tVar, tVarK);
            }
            return aVar;
        }
    }

    public c() {
        y0<g3<List<o>>> y0Var = new y0<>();
        this.f94906c = y0Var;
        this.f94907d = t1.a(y0Var, new ig2.d(27));
        this.f94908e = new f32.l(new f32.a(v1.a(this), new a(), null, 4, null));
    }
}
