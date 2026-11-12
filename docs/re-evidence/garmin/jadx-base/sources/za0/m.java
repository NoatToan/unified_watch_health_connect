package za0;

import android.content.Context;
import com.garmin.android.gncs.SmartNotificationsUtil;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.permissions.DeviceSetupPermissionsViewModel$triggerNotificationsAccessCheck$1", f = "DeviceSetupPermissionsViewModel.kt", l = {115, 118}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f203263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f203264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f203265c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, i iVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f203264b = context;
        this.f203265c = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f203264b, this.f203265c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f203263a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f203263a = 1;
            if (m0.b(500L, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        boolean zIsNotificationAccessEnabled = SmartNotificationsUtil.isNotificationAccessEnabled(this.f203264b);
        p2 p2Var = this.f203265c.f203252g;
        Boolean boolValueOf = Boolean.valueOf(zIsNotificationAccessEnabled);
        this.f203263a = 2;
        p2Var.k(null, boolValueOf);
    }
}
