package jl1;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.edit.SelectFavouriteActivitiesViewModel$setOnboardingCompleted$2", f = "SelectFavouriteActivitiesViewModel.kt", l = {153}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super v2<? extends Boolean>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f99538b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f99538b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f99538b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Boolean>> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f99537a;
        g gVar = this.f99538b;
        if (i14 == 0) {
            r.b(obj);
            dl1.a aVar2 = gVar.f99521d;
            long j8 = gVar.f99518a;
            this.f99537a = 1;
            obj = aVar2.a(j8, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            gVar.f99520c.g(gVar.f99518a);
        }
        return v2Var;
    }
}
