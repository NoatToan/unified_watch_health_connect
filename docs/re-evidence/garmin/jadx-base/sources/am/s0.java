package am;

import okhttp3.MultipartBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/j;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$uploadActivityImage$deferredResult$1", f = "ActivityRepo.kt", l = {196}, m = "invokeSuspend", v = 2)
public final class s0 extends v13.i implements e23.l<t13.d<? super c83.a0<ps.j>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f4189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MultipartBody.Part f4191d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(m mVar, long j8, MultipartBody.Part part, t13.d<? super s0> dVar) {
        super(1, dVar);
        this.f4189b = mVar;
        this.f4190c = j8;
        this.f4191d = part;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new s0(this.f4189b, this.f4190c, this.f4191d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ps.j>> dVar) {
        return ((s0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4188a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        d2 d2Var = this.f4189b.f4070b;
        this.f4188a = 1;
        Object objA = d2Var.a(this.f4190c, this.f4191d, this);
        return objA == aVar ? aVar : objA;
    }
}
