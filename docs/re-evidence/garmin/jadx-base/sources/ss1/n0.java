package ss1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsReviewsRepoImpl$markReviewHelpful$2", f = "GarminTrailsReviewsRepoImpl.kt", l = {94, 96}, m = "invokeSuspend", v = 2)
public final class n0 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f160703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f160704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f160705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(boolean z14, v0 v0Var, long j8, t13.d<? super n0> dVar) {
        super(1, dVar);
        this.f160703b = z14;
        this.f160704c = v0Var;
        this.f160705d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n0(this.f160703b, this.f160704c, this.f160705d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((n0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r7 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160702a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return (c83.a0) obj;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                return (c83.a0) obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        long j8 = this.f160705d;
        boolean z14 = this.f160703b;
        v0 v0Var = this.f160704c;
        if (z14) {
            ps1.b bVar = v0Var.f160763a;
            this.f160702a = 1;
            obj = bVar.m(j8, new qs1.k(null, 1, null), this);
        } else {
            ps1.b bVar2 = v0Var.f160763a;
            this.f160702a = 2;
            obj = bVar2.k(j8, this);
        }
        return aVar;
    }
}
