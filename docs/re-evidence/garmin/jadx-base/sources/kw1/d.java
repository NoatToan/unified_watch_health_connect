package kw1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import kv1.m;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import tw1.o;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ltw1/o;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.findplan.domain.GetTrainingPlansUseCase$invoke$2", f = "GetTrainingPlansUseCase.kt", l = {14}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super v2<? extends o>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f106963b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f106963b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f106963b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends o>> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106962a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        kv1.b bVar = this.f106963b.f106964a;
        fy1.i.f73924a.getClass();
        String strF = fy1.i.a.f();
        List listK = x.k("FBT_ADAPTIVE", "ITP", "STRENGTH");
        this.f106962a = 1;
        Object objJ = f0.J(bVar, new m(bVar, strF, listK, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
