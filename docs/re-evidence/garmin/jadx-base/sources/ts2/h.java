package ts2;

import com.garmin.proto.generated.GDIConnectedDevicesReporting;
import com.garmin.proto.generated.GDIConnectedDevicesReportingExtension;
import com.garmin.proto.generated.GDISmartProto;
import dt2.k;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.connecteddevices.ConnectedDevicesHandler$onConnectionAlert$2", f = "ConnectedDevicesHandler.kt", l = {195}, m = "invokeSuspend")
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f166235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f166236c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, b bVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f166235b = kVar;
        this.f166236c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f166235b, this.f166236c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166234a;
        try {
            if (i14 == 0) {
                r.b(obj);
                GDIConnectedDevicesReporting.Service.Builder connectionAlertRegistrationResponse = GDIConnectedDevicesReporting.Service.newBuilder().setConnectionAlertRegistrationResponse(GDIConnectedDevicesReporting.ConnectionAlertRegistrationResponse.newBuilder());
                k kVar = this.f166235b;
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIConnectedDevicesReportingExtension.connectedDevicesReportingService, connectionAlertRegistrationResponse.build()).build();
                smartBuild.getClass();
                this.f166234a = 1;
                if (kVar.a(smartBuild, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Throwable th3) {
            this.f166236c.l().error("onConnectionAlert: Failed to send response: " + th3.getMessage(), null);
        }
        return Unit.INSTANCE;
    }
}
