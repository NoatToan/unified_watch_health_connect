package xk0;

import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import zk0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lzk0/h;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.goals.WellnessGoalsViewModel$updateWellnessGoal$1", f = "WellnessGoalsViewModel.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super v2<? extends h>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f191204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f191205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f191206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f191207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f191208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, String str2, h hVar, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f191205b = gVar;
        this.f191206c = str;
        this.f191207d = str2;
        this.f191208e = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f191205b, this.f191206c, this.f191207d, this.f191208e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends h>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f191204a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        al0.a aVar2 = this.f191205b.f191210b;
        this.f191204a = 1;
        Object objA = aVar2.a(this.f191206c, this.f191207d, this.f191208e, this);
        return objA == aVar ? aVar : objA;
    }
}
