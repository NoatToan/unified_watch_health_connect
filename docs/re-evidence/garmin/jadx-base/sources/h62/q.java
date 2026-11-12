package h62;

import java.util.ArrayList;
import java.util.Collection;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListViewModel$selectWorkoutType$1", f = "WorkoutListViewModel.kt", l = {116, 118}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f82279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f82280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m52.k f82281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z14, m mVar, m52.k kVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f82279b = z14;
        this.f82280c = mVar;
        this.f82281d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f82279b, this.f82280c, this.f82281d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        return r0;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f82278a;
        if (i14 == 0) {
            r.b(obj);
            m52.k kVar = this.f82281d;
            boolean z14 = this.f82279b;
            m mVar = this.f82280c;
            if (z14) {
                p2 p2Var = mVar.f82261m;
                ArrayList arrayListD0 = h0.D0((Collection) p2Var.getValue(), kVar);
                this.f82278a = 1;
                p2Var.k(null, arrayListD0);
            } else {
                p2 p2Var2 = mVar.f82261m;
                ArrayList arrayListY0 = h0.y0((Iterable) p2Var2.getValue(), kVar);
                this.f82278a = 2;
                p2Var2.k(null, arrayListY0);
            }
        } else {
            if (i14 != 1 && i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
