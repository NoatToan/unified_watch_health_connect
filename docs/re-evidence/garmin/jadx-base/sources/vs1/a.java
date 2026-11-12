package vs1;

import c22.s3;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.CanSeeReviewsUseCase$fetchUserReviewsCount$1", f = "CanSeeReviewsUseCase.kt", l = {20, 23, 30}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f179739b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f179739b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f179739b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (f12.l.a.a().l1() == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (r6.emit(r2, r18) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (r2.emit(r4, r18) == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objH2;
        v2 v2Var;
        qs1.c0 c0Var;
        int iB;
        boolean z14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179738a;
        b bVar = this.f179739b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                objH2 = obj;
                v2Var = (v2) objH2;
                if (v2Var instanceof v2.b) {
                    c0Var = (qs1.c0) ((v2.b) v2Var).f47386a;
                    if (c0Var != null) {
                        iB = c0Var.getReviewCount();
                    } else {
                        iB = 0;
                    }
                    z1<pt1.c> z1Var = bVar.f179750c;
                    pt1.c value = z1Var.getValue();
                    if (iB > 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    pt1.c cVarA = pt1.c.a(value, false, false, false, null, null, null, false, z14, 127);
                    this.f179738a = 2;
                } else {
                    z1<pt1.c> z1Var2 = bVar.f179750c;
                    pt1.c cVarA2 = pt1.c.a(z1Var2.getValue(), false, false, false, null, null, null, false, false, 383);
                    this.f179738a = 3;
                }
            } else {
                if (i14 != 2 && i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        if (!bVar.f179750c.getValue().f140824i) {
            if (!s3.b()) {
                f12.l.f68084a.getClass();
            }
            ss1.a0 a0Var = bVar.f179749b;
            this.f179738a = 1;
            objH2 = a0Var.H2(this);
            if (objH2 != aVar) {
                v2Var = (v2) objH2;
                if (v2Var instanceof v2.b) {
                    c0Var = (qs1.c0) ((v2.b) v2Var).f47386a;
                    if (c0Var != null) {
                        iB = c0Var.getReviewCount();
                    } else {
                        iB = 0;
                    }
                    z1<pt1.c> z1Var3 = bVar.f179750c;
                    pt1.c value2 = z1Var3.getValue();
                    if (iB > 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    pt1.c cVarA3 = pt1.c.a(value2, false, false, false, null, null, null, false, z14, 127);
                    this.f179738a = 2;
                } else {
                    z1<pt1.c> z1Var4 = bVar.f179750c;
                    pt1.c cVarA4 = pt1.c.a(z1Var4.getValue(), false, false, false, null, null, null, false, false, 383);
                    this.f179738a = 3;
                }
            }
            return aVar;
        }
        return Unit.INSTANCE;
    }
}
