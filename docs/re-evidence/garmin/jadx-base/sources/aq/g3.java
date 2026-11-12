package aq;

import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.ThirdPartyUploaderRepo$getThirdPartyUploadersAsync$2", f = "ThirdPartyUploaderRepo.kt", l = {10}, m = "invokeSuspend", v = 2)
public final class g3 extends v13.i implements e23.l<t13.d<? super c83.a0<ResponseBody>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h3 f11971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(h3 h3Var, t13.d<? super g3> dVar) {
        super(1, dVar);
        this.f11971b = h3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g3(this.f11971b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ResponseBody>> dVar) {
        return ((g3) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f11970a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<ResponseBody>> i0VarA = this.f11971b.f11988a.a();
        this.f11970a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
