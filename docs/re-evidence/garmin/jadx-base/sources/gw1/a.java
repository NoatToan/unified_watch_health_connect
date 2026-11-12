package gw1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import tw1.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.workouts.FBTScheduleViewModel$refreshTrainingPlan$1", f = "FBTScheduleViewModel.kt", l = {51, 52, 54, 57}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f79827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f79828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v2.b f79829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f79831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f79832f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f79832f = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f79832f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0083  */
    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d3  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ee, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        m mVar;
        int i14;
        long trainingPlanId;
        boolean zP0;
        uw1.b bVar2;
        Object objJ;
        int i15;
        b bVar3;
        v2 v2Var;
        v2 v2Var2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f79831e;
        if (i16 == 0) {
            r.b(obj);
            bVar = this.f79832f;
            m mVar2 = bVar.S0;
            if (mVar2 != null) {
                p2 p2Var = bVar.M0;
                g3 g3VarC = g3.a.c(g3.f35298f);
                this.f79827a = bVar;
                this.f79828b = mVar2;
                this.f79830d = 0;
                this.f79831e = 1;
                p2Var.k(null, g3VarC);
                if (Unit.INSTANCE != aVar) {
                    mVar = mVar2;
                    i14 = 0;
                    trainingPlanId = mVar.getTrainingPlanId();
                    this.f79827a = bVar;
                    this.f79828b = null;
                    this.f79830d = i14;
                    this.f79831e = 2;
                    int i17 = b.X0;
                    m mVar3 = bVar.S0;
                    if (mVar3 != null) {
                    }
                    bVar2 = bVar.L0;
                    if (zP0) {
                        bVar2.getClass();
                        objJ = f0.J(bVar2, new uw1.e(trainingPlanId, null), this);
                    } else {
                        bVar2.getClass();
                        objJ = f0.J(bVar2, new uw1.g(trainingPlanId, null), this);
                    }
                    if (objJ != aVar) {
                        i15 = i14;
                        bVar3 = bVar;
                        v2Var = (v2) objJ;
                        if (v2Var instanceof v2.b) {
                            p2 p2Var2 = bVar3.M0;
                            g3.a aVar2 = g3.f35298f;
                            v2.b bVar4 = (v2.b) v2Var;
                            T t7 = bVar4.f47386a;
                            aVar2.getClass();
                            g3 g3VarD = g3.a.d(t7);
                            this.f79827a = bVar3;
                            this.f79828b = null;
                            this.f79829c = bVar4;
                            this.f79830d = i15;
                            this.f79831e = 3;
                            p2Var2.k(null, g3VarD);
                            if (Unit.INSTANCE != aVar) {
                                v2Var2 = v2Var;
                                bVar3.S0 = (m) ((v2.b) v2Var2).f47386a;
                            }
                        } else {
                            p2 p2Var3 = bVar3.M0;
                            g3 g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
                            this.f79827a = null;
                            this.f79828b = null;
                            this.f79830d = i15;
                            this.f79831e = 4;
                            p2Var3.k(null, g3VarA);
                        }
                    }
                }
                return aVar;
            }
        } else {
            if (i16 == 1) {
                i14 = this.f79830d;
                mVar = this.f79828b;
                bVar = this.f79827a;
                r.b(obj);
                trainingPlanId = mVar.getTrainingPlanId();
                this.f79827a = bVar;
                this.f79828b = null;
                this.f79830d = i14;
                this.f79831e = 2;
                int i18 = b.X0;
                m mVar4 = bVar.S0;
                zP0 = mVar4 != null ? mVar4.p0() : false;
                bVar2 = bVar.L0;
                if (zP0) {
                    bVar2.getClass();
                    objJ = f0.J(bVar2, new uw1.e(trainingPlanId, null), this);
                } else {
                    bVar2.getClass();
                    objJ = f0.J(bVar2, new uw1.g(trainingPlanId, null), this);
                }
                if (objJ != aVar) {
                    i15 = i14;
                    bVar3 = bVar;
                    v2Var = (v2) objJ;
                    if (v2Var instanceof v2.b) {
                        p2 p2Var4 = bVar3.M0;
                        g3.a aVar3 = g3.f35298f;
                        v2.b bVar5 = (v2.b) v2Var;
                        T t14 = bVar5.f47386a;
                        aVar3.getClass();
                        g3 g3VarD2 = g3.a.d(t14);
                        this.f79827a = bVar3;
                        this.f79828b = null;
                        this.f79829c = bVar5;
                        this.f79830d = i15;
                        this.f79831e = 3;
                        p2Var4.k(null, g3VarD2);
                        if (Unit.INSTANCE != aVar) {
                            v2Var2 = v2Var;
                            bVar3.S0 = (m) ((v2.b) v2Var2).f47386a;
                        }
                    } else {
                        p2 p2Var5 = bVar3.M0;
                        g3 g3VarA2 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                        this.f79827a = null;
                        this.f79828b = null;
                        this.f79830d = i15;
                        this.f79831e = 4;
                        p2Var5.k(null, g3VarA2);
                    }
                }
                return aVar;
            }
            if (i16 == 2) {
                int i19 = this.f79830d;
                b bVar6 = this.f79827a;
                r.b(obj);
                i15 = i19;
                bVar3 = bVar6;
                objJ = obj;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    p2 p2Var6 = bVar3.M0;
                    g3.a aVar4 = g3.f35298f;
                    v2.b bVar7 = (v2.b) v2Var;
                    T t15 = bVar7.f47386a;
                    aVar4.getClass();
                    g3 g3VarD3 = g3.a.d(t15);
                    this.f79827a = bVar3;
                    this.f79828b = null;
                    this.f79829c = bVar7;
                    this.f79830d = i15;
                    this.f79831e = 3;
                    p2Var6.k(null, g3VarD3);
                    if (Unit.INSTANCE != aVar) {
                        v2Var2 = v2Var;
                        bVar3.S0 = (m) ((v2.b) v2Var2).f47386a;
                    }
                } else {
                    p2 p2Var7 = bVar3.M0;
                    g3 g3VarA3 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                    this.f79827a = null;
                    this.f79828b = null;
                    this.f79830d = i15;
                    this.f79831e = 4;
                    p2Var7.k(null, g3VarA3);
                }
                return aVar;
            }
            if (i16 == 3) {
                v2Var2 = this.f79829c;
                bVar3 = this.f79827a;
                r.b(obj);
                bVar3.S0 = (m) ((v2.b) v2Var2).f47386a;
            } else {
                if (i16 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        }
        return Unit.INSTANCE;
    }
}
