package ri1;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIInReachMessaging;
import java.io.Serializable;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachSubscriptionManagerViewModel$activateOnDevice$1", f = "InReachSubscriptionManagerViewModel.kt", l = {129, SyslogConstants.LOG_LOCAL1, 141}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f152905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f152906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f152907c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f152907c = sVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f152907c, dVar);
        tVar.f152906b = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r1.h(r3, r21) == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f2, code lost:
    
        if (r1.h(r3, r21) == r2) goto L39;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Serializable serializableM;
        Object value2;
        b0 b0Var = (b0) this.f152906b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152905a;
        s sVar = this.f152907c;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                serializableM = obj;
            } else {
                if (i14 != 2 && i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        p2 p2Var = sVar.f152894h;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, si1.k.b((si1.k) value, false, false, null, false, false, false, false, false, si1.e.LOADING, 1023)));
        ui1.l lVar = sVar.f152890d;
        long j8 = sVar.f152887a;
        GDIInReachMessaging.ActivationMethod activationMethod = GDIInReachMessaging.ActivationMethod.ACTIVATION_METHOD_USER_INITIATED;
        this.f152906b = b0Var;
        this.f152905a = 1;
        lVar.getClass();
        ui1.e eVarB = ui1.l.b(j8, "startDeviceActivation");
        serializableM = eVarB == null ? null : eVarB.m(activationMethod, this);
        if (serializableM != aVar) {
        }
        return aVar;
        GDIInReachMessaging.ActivationStartResponse activationStartResponse = (GDIInReachMessaging.ActivationStartResponse) serializableM;
        String str = "activateOnDevice response status: " + (activationStartResponse != null ? activationStartResponse.getStatus() : null);
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "InReachSubscriptionManagerViewModel", str);
        if ((activationStartResponse != null ? activationStartResponse.getStatus() : null) == GDIInReachMessaging.ActivationStartResponse.Status.OK) {
            q53.b bVar = sVar.f152896j;
            String string = sVar.f152888b.getString(R.string.lbl_device_activation_in_progress);
            string.getClass();
            this.f152906b = null;
            this.f152905a = 2;
        } else {
            p2 p2Var2 = sVar.f152894h;
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, si1.k.b((si1.k) value2, false, false, null, false, false, false, false, false, si1.e.INACTIVE, 1023)));
            q53.b bVar2 = sVar.f152896j;
            String string2 = sVar.f152888b.getString(R.string.device_settings_inreach_device_activation_failed);
            string2.getClass();
            this.f152906b = null;
            this.f152905a = 3;
        }
    }
}
