package xk0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import zk0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lzk0/h;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.goals.WellnessGoalsViewModel$getWellnessGoal$1", f = "WellnessGoalsViewModel.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super v2<? extends h>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f191194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f191195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f191196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f191197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, String str, String str2, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f191195b = gVar;
        this.f191196c = str;
        this.f191197d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f191195b, this.f191196c, this.f191197d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends h>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f191194a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        al0.a aVar2 = this.f191195b.f191210b;
        this.f191194a = 1;
        aVar2.getClass();
        Object objJ = f0.J(aVar2, new al0.f(aVar2, this.f191196c, this.f191197d, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
