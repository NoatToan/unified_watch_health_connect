package y80;

import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lokhttp3/ResponseBody;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.data.DeviceStorageRepository$getDeviceBitmapAsset$result$1", f = "DeviceStorageRepository.kt", l = {268}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.l<t13.d<? super c83.a0<ResponseBody>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f195114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f195115c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(b0 b0Var, String str, t13.d<? super e0> dVar) {
        super(1, dVar);
        this.f195114b = b0Var;
        this.f195115c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e0(this.f195114b, this.f195115c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<ResponseBody>> dVar) {
        return ((e0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195113a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<ResponseBody>> i0VarA = this.f195114b.f195092c.a(this.f195115c);
        this.f195113a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
