package ua1;

import ab1.r;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import sa1.a0;
import va1.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyViewModel$updateRiderWeight$1", f = "CreatePowerGuideStrategyViewModel.kt", l = {96, 98, 100, 106}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f169646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f169647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f169648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f169649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, r rVar, double d14, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f169647b = cVar;
        this.f169648c = rVar;
        this.f169649d = d14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f169647b, this.f169648c, this.f169649d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (ua1.c.y4(r6, r7) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r6.C4(r8, r7) == r0) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169646a;
        c cVar = this.f169647b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f169646a = 1;
            if (c.x4(cVar, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    this.f169646a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String string = ((v2.a) v2Var).f47383a.toString();
                    this.f169646a = 4;
                }
                return aVar;
            }
            if (i14 == 3) {
                o13.r.b(obj);
                f12.l.f68084a.getClass();
                f12.l.a.a().K1(this.f169649d);
                cVar.z4(o.SELECT_BIKE_WEIGHT);
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
        a0 a0Var = cVar.f169608d;
        this.f169646a = 2;
        a0Var.getClass();
        obj = f0.J(a0Var, new sa1.b0(a0Var, this.f169648c, null), this);
        if (obj != aVar) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                this.f169646a = 3;
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                String string2 = ((v2.a) v2Var).f47383a.toString();
                this.f169646a = 4;
            }
        }
        return aVar;
    }
}
