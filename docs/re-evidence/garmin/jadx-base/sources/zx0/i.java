package zx0;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.devices.model.DeviceAppInfoDTO;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.moveiq.MoveIQViewModel$getDeviceInfoFromGC$1", f = "MoveIQViewModel.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f207358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f207359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f207360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f207361d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, long j8, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f207360c = jVar;
        this.f207361d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f207360c, this.f207361d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f207359b;
        if (i14 == 0) {
            r.b(obj);
            j jVar = this.f207360c;
            y0<v2<DeviceAppInfoDTO>> y0Var2 = jVar.f207366e;
            k kVar = jVar.f207363b;
            this.f207358a = y0Var2;
            this.f207359b = 1;
            obj = kVar.a(this.f207361d, this);
            if (obj == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y0Var = this.f207358a;
            r.b(obj);
        }
        y0Var.m(obj);
        return Unit.INSTANCE;
    }
}
