package ov0;

import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIGarminConnect;
import com.garmin.proto.generated.GDIGarminConnectExtension;
import com.garmin.proto.generated.GDISmartProto;
import dt2.g;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.c;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.logging.data.device.LifestyleLoggingDeviceUpdateDataHandler$sendLifestyleLoggingUpdateRequestNotification$1$1", f = "LifestyleLoggingDeviceUpdateDataHandler.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f134131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f134132b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, d<? super b> dVar) {
        super(2, dVar);
        this.f134132b = aVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f134132b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f134131a;
        a aVar2 = this.f134132b;
        try {
            if (i14 == 0) {
                r.b(obj);
                c cVar = aVar2.f134128d;
                if (cVar != null) {
                    new Long(cVar.getF92746j());
                }
                g gVar = aVar2.f134127c;
                if (gVar != null) {
                    GDIGarminConnect.LifestyleLoggingUpdateRequestNotification lifestyleLoggingUpdateRequestNotificationBuild = GDIGarminConnect.LifestyleLoggingUpdateRequestNotification.newBuilder().build();
                    GDIGarminConnect.Service.Builder builderNewBuilder = GDIGarminConnect.Service.newBuilder();
                    builderNewBuilder.setLifestyleLoggingUpdateRequestNotification(lifestyleLoggingUpdateRequestNotificationBuild);
                    GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIGarminConnectExtension.garminConnectService, builderNewBuilder.build()).build();
                    smartBuild.getClass();
                    this.f134131a = 1;
                    if (gVar.c(smartBuild, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (ProtobufException e4) {
            c cVar2 = aVar2.f134128d;
            if (cVar2 != null) {
                new Long(cVar2.getF92746j());
            }
            e4.toString();
        }
        return Unit.INSTANCE;
    }
}
