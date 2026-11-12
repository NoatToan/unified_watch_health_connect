package za0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.SmartNotificationsModule;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.permissions.DeviceSetupPermissionsViewModel$sendPhonePermissionBroadcast$1", f = "DeviceSetupPermissionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f203262a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f203262a = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f203262a, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Intent intent = new Intent(SmartNotificationsModule.ACTION_PERMISSIONS_GRANTED);
        Context context = this.f203262a;
        context.sendBroadcast(intent, oa2.b.d(context));
        GNCSListenerService.refreshPhoneCallListener();
        return Unit.INSTANCE;
    }
}
