package pg1;

import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity$initNavigationGraph$1$1$1$1$2$1$1", f = "DeviceBackupActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceBackupActivity f137609a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DeviceBackupActivity deviceBackupActivity, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f137609a = deviceBackupActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f137609a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        DeviceBackupActivity.a aVar2 = DeviceBackupActivity.f42558c;
        DeviceBackupActivity deviceBackupActivity = this.f137609a;
        ug1.c cVarGa = deviceBackupActivity.ga();
        l22.a aVar3 = new l22.a(deviceBackupActivity);
        long j8 = deviceBackupActivity.f42560b;
        cVarGa.getClass();
        ge1.b.T(v1.a(cVarGa), null, null, new ug1.f(j8, cVarGa, aVar3, null), 3);
        return Unit.INSTANCE;
    }
}
