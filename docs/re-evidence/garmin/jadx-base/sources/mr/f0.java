package mr;

import am.x0;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.a1;
import r53.c2;
import r53.t1;
import r53.u1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lps/a0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetCompactActivityDetailsUseCase$invoke$1", f = "GetCompactActivityDetailsUseCase.kt", l = {39, 57, 57}, m = "invokeSuspend", v = 2)
public final class f0 extends v13.i implements e23.p<r53.j<? super ps.a0>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f120264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f120265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f120266d;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "activityDetails", "Lps/s0;", "exerciseSet", "Lps/p;", "activitySplits", "Lnr/v;", "deviceData", "", "", "childActivityType", "Lps/a0;", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;Lps/s0;Lps/p;Lnr/v;Ljava/util/List;)Lps/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetCompactActivityDetailsUseCase$invoke$1$1", f = "GetCompactActivityDetailsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.t<ActivityDetailChartDTO, ps.s0, ps.p, nr.v, List<? extends String>, t13.d<? super ps.a0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ ActivityDetailChartDTO f120267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ ps.s0 f120268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ ps.p f120269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ nr.v f120270d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ List f120271e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ps.r f120272f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ps.r rVar, t13.d<? super a> dVar) {
            super(6, dVar);
            this.f120272f = rVar;
        }

        @Override // e23.t
        public final Object invoke(ActivityDetailChartDTO activityDetailChartDTO, ps.s0 s0Var, ps.p pVar, nr.v vVar, List<? extends String> list, t13.d<? super ps.a0> dVar) {
            a aVar = new a(this.f120272f, dVar);
            aVar.f120267a = activityDetailChartDTO;
            aVar.f120268b = s0Var;
            aVar.f120269c = pVar;
            aVar.f120270d = vVar;
            aVar.f120271e = list;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            r80.b bVarB;
            ActivityDetailChartDTO activityDetailChartDTO = this.f120267a;
            ps.s0 s0Var = this.f120268b;
            ps.p pVar = this.f120269c;
            nr.v vVar = this.f120270d;
            List list = this.f120271e;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return new ps.a0(this.f120272f, activityDetailChartDTO, s0Var, pVar, (vVar == null || (bVarB = vVar.b()) == null) ? null : Boolean.valueOf(bVarB.f()), list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, long j8, t13.d<? super f0> dVar) {
        super(2, dVar);
        this.f120265c = g0Var;
        this.f120266d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f0 f0Var = new f0(this.f120265c, this.f120266d, dVar);
        f0Var.f120264b = obj;
        return f0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super ps.a0> jVar, t13.d<? super Unit> dVar) {
        return ((f0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00dc  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e4, code lost:
    
        if (r1.emit(r4, r21) == r2) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object obj2;
        Object objB;
        ps.a0 a0Var;
        r53.j jVar = (r53.j) this.f120264b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120263a;
        long j8 = this.f120266d;
        g0 g0Var = this.f120265c;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f120264b = jVar;
            this.f120263a = 1;
            objC = g0.c(g0Var, j8, this);
            if (objC != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objC = obj;
        } else if (i14 == 2) {
            o13.r.b(obj);
            objB = obj;
            obj2 = null;
            a0Var = (ps.a0) objB;
            if (a0Var != null) {
                this.f120264b = obj2;
                this.f120263a = 3;
            }
        } else {
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        ps.r rVar = (ps.r) objC;
        if (rVar == null) {
            return Unit.INSTANCE;
        }
        x0 x0VarH = rVar.h();
        g0Var.getClass();
        obj2 = null;
        c2 c2Var = new c2(new u(g0Var, this.f120266d, rVar, x0VarH, null));
        a1 metadataDTO = rVar.getMetadataDTO();
        boolean zG = metadataDTO != null ? p005kotlin.jvm.internal.s.g(metadataDTO.getIsWheelchair(), Boolean.TRUE) : false;
        c2 c2Var2 = new c2(new am.r(g0Var.f120273a, j8, null));
        x53.c cVar = o53.s0.f129406a;
        t1 t1VarN = r53.s.n(c2Var, new u1(r53.s.A(c2Var2, x53.b.f189152a), g0Var.f120275c.b(x0VarH, zG), new e0(null)), new c2(new y(rVar, x0VarH, g0Var, this.f120266d, null)), new c2(new d0(rVar, g0Var, null)), new c2(new c0(rVar, g0Var, null)), new a(rVar, null));
        this.f120264b = jVar;
        this.f120263a = 2;
        objB = r53.s.B(t1VarN, this);
        if (objB != aVar) {
            a0Var = (ps.a0) objB;
            if (a0Var != null) {
                this.f120264b = obj2;
                this.f120263a = 3;
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
