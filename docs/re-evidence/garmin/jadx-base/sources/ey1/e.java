package ey1;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.SetupStrengthTrainingPlanViewModel$loadData$1", f = "SetupStrengthTrainingPlanViewModel.kt", l = {139, 140, 142, 143}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f67314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f67316c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f67316c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f67316c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006c A[PHI: r1
      0x006c: PHI (r1v5 boolean) = (r1v4 boolean), (r1v6 boolean) binds: [B:21:0x0069, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L25;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67315b;
        a aVar2 = this.f67316c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = aVar2.f67273e;
            Boolean bool = Boolean.TRUE;
            this.f67315b = 1;
            p2Var.k(null, bool);
            if (Unit.INSTANCE != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                aVar2.f67272d = zBooleanValue;
                p2 p2Var2 = aVar2.f67274f;
                Boolean boolValueOf = Boolean.valueOf(!zBooleanValue);
                this.f67314a = zBooleanValue;
                this.f67315b = 3;
                p2Var2.k(null, boolValueOf);
                if (Unit.INSTANCE != aVar) {
                    p2 p2Var3 = aVar2.f67273e;
                    Boolean bool2 = Boolean.FALSE;
                    this.f67314a = zBooleanValue;
                    this.f67315b = 4;
                    p2Var3.k(null, bool2);
                }
                return aVar;
            }
            if (i14 == 3) {
                zBooleanValue = this.f67314a;
                o13.r.b(obj);
                p2 p2Var4 = aVar2.f67273e;
                Boolean bool3 = Boolean.FALSE;
                this.f67314a = zBooleanValue;
                this.f67315b = 4;
                p2Var4.k(null, bool3);
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
        lx1.a aVar3 = aVar2.f67269a;
        String strB = aVar2.f67271c.b();
        this.f67315b = 2;
        obj = aVar3.k(strB, null, this);
        if (obj != aVar) {
            zBooleanValue = ((Boolean) obj).booleanValue();
            aVar2.f67272d = zBooleanValue;
            p2 p2Var5 = aVar2.f67274f;
            Boolean boolValueOf2 = Boolean.valueOf(!zBooleanValue);
            this.f67314a = zBooleanValue;
            this.f67315b = 3;
            p2Var5.k(null, boolValueOf2);
            if (Unit.INSTANCE != aVar) {
                p2 p2Var6 = aVar2.f67273e;
                Boolean bool4 = Boolean.FALSE;
                this.f67314a = zBooleanValue;
                this.f67315b = 4;
                p2Var6.k(null, bool4);
            }
        }
        return aVar;
    }
}
