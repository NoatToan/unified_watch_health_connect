package qr;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lto/l;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.TimeInGearViewModel$getTimeInGear$1", f = "TimeInGearViewModel.kt", l = {12}, m = "invokeSuspend", v = 2)
public final class p6 extends v13.i implements e23.l<t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends to.l>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f146432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q6 f146433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f146434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(q6 q6Var, long j8, t13.d<? super p6> dVar) {
        super(1, dVar);
        this.f146433b = q6Var;
        this.f146434c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p6(this.f146433b, this.f146434c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends List<? extends to.l>>> dVar) {
        return ((p6) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146432a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        am.m mVar = (am.m) this.f146433b.f146456a.getValue();
        this.f146432a = 1;
        mVar.getClass();
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(mVar, new am.k0(mVar, this.f146434c, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
