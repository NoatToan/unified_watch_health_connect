package kk0;

import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.data.repository.WebDataRepositoryImpl$getGearBrandsModels$downloadResult$1", f = "WebDataRepositoryImpl.kt", l = {38}, m = "invokeSuspend", v = 2)
public final class l0 extends v13.i implements e23.l<t13.d<? super c83.a0<ResponseBody>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f105071b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(o0 o0Var, t13.d<? super l0> dVar) {
        super(1, dVar);
        this.f105071b = o0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l0(this.f105071b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ResponseBody>> dVar) {
        return ((l0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105070a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0 i0Var = this.f105071b.f105091a;
        this.f105070a = 1;
        Object objA = i0Var.a(this);
        return objA == aVar ? aVar : objA;
    }
}
