package de2;

import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.device.DefaultDeviceManager$getMacAddress$2", f = "DefaultDeviceManager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0<List<DeviceProfile>> f59260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f59261b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r0<List<DeviceProfile>> r0Var, a aVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f59260a = r0Var;
        this.f59261b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f59260a, this.f59261b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.ArrayList] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f59260a.f105810a = new ArrayList(da2.d.c(this.f59261b.f59231d).f58886a.f111646e.e());
        return Unit.INSTANCE;
    }
}
