package ey1;

import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.StrengthTrainingPlanDashboardViewModel$deleteStrengthTrainingPlan$1", f = "StrengthTrainingPlanDashboardViewModel.kt", l = {692, 693, 695, 703, 704}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f67391b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j jVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f67391b = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f67391b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L36;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67390a;
        j jVar = this.f67391b;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = jVar.f67355x;
            Boolean bool = Boolean.TRUE;
            this.f67390a = 1;
            p2Var.k(null, bool);
            if (Unit.INSTANCE != aVar) {
            }
            return aVar;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    o13.r.b(obj);
                    jVar.C4();
                    return Unit.INSTANCE;
                }
                if (i14 == 4) {
                    o13.r.b(obj);
                    p2 p2Var2 = jVar.f67355x;
                    Boolean bool2 = Boolean.FALSE;
                    this.f67390a = 5;
                    p2Var2.k(null, bool2);
                } else {
                    if (i14 != 5) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                sn.a.o(f12.l.f68084a, true);
                jVar.B.setValue(dy1.n.a.f61579a);
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            v2Var = (v2) obj;
            if (v2Var instanceof v2.a) {
                p2 p2Var3 = jVar.f67355x;
                Boolean bool3 = Boolean.FALSE;
                this.f67390a = 3;
                p2Var3.k(null, bool3);
            } else {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                this.f67390a = 4;
                if (m0.b(2000L, this) != aVar) {
                    p2 p2Var4 = jVar.f67355x;
                    Boolean bool4 = Boolean.FALSE;
                    this.f67390a = 5;
                    p2Var4.k(null, bool4);
                }
            }
            return aVar;
        }
        o13.r.b(obj);
        nx1.c cVar = jVar.f67341h;
        long j8 = jVar.f67334a;
        this.f67390a = 2;
        obj = cVar.f128206a.a(j8, this);
        if (obj != aVar) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.a) {
                p2 p2Var5 = jVar.f67355x;
                Boolean bool5 = Boolean.FALSE;
                this.f67390a = 3;
                p2Var5.k(null, bool5);
            } else {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                this.f67390a = 4;
                if (m0.b(2000L, this) != aVar) {
                    p2 p2Var6 = jVar.f67355x;
                    Boolean bool6 = Boolean.FALSE;
                    this.f67390a = 5;
                    p2Var6.k(null, bool6);
                }
            }
        }
        return aVar;
    }
}
