package bn0;

import c83.a0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcn0/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.groupride.DefaultGroupRideRepository$getDetails$2", f = "GroupRideRepository.kt", l = {29}, m = "invokeSuspend", v = 2)
public final class a extends v13.i implements e23.l<t13.d<? super a0<cn0.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f18973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18974c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, t13.d<? super a> dVar) {
        super(1, dVar);
        this.f18973b = bVar;
        this.f18974c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a(this.f18973b, this.f18974c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<cn0.b>> dVar) {
        return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18972a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        c cVar = this.f18973b.f18975a;
        this.f18972a = 1;
        Object objA = cVar.a(this.f18974c, this);
        return objA == aVar ? aVar : objA;
    }
}
