package b80;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDISubscriptionExtension;
import com.garmin.proto.generated.GDISubscriptionsProto;
import dt2.g;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rs2.c;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.data.device.SubscriptionUpdateDeviceDataHandler$sendSubscriptionUpdateNotification$1", f = "SubscriptionUpdateDeviceDataHandler.kt", l = {42}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f16383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, d<? super b> dVar) {
        super(2, dVar);
        this.f16383c = aVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f16383c, dVar);
        bVar.f16382b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f16382b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f16381a;
        a aVar2 = this.f16383c;
        try {
            if (i14 == 0) {
                r.b(obj);
                a2 a2Var = a2.SUBSCRIPTIONS;
                c cVar = aVar2.f16378c;
                if (cVar == null) {
                    s.m("deviceInfo");
                    throw null;
                }
                String str = "sendSubscriptionUpdateNotification for device[" + cVar.getF92746j() + "]";
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SubscriptionUpdateDeviceDataHandler", str);
                g gVar = aVar2.f16379d;
                if (gVar == null) {
                    s.m("messenger");
                    throw null;
                }
                GDISubscriptionsProto.CustomerSubscriptionNotification customerSubscriptionNotificationBuild = GDISubscriptionsProto.CustomerSubscriptionNotification.newBuilder().build();
                GDISubscriptionsProto.SubscriptionService.Builder builderNewBuilder = GDISubscriptionsProto.SubscriptionService.newBuilder();
                builderNewBuilder.setCustomerSubscriptionNotification(customerSubscriptionNotificationBuild);
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDISubscriptionExtension.subscriptionService, builderNewBuilder.build()).build();
                smartBuild.getClass();
                this.f16382b = b0Var;
                this.f16381a = 1;
                if (gVar.c(smartBuild, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (ProtobufException e4) {
            a2 a2Var2 = a2.SUBSCRIPTIONS;
            c cVar2 = aVar2.f16378c;
            if (cVar2 == null) {
                s.m("deviceInfo");
                throw null;
            }
            String str2 = "ProtobufException for device[" + cVar2.getF92746j() + "]: " + e4;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "SubscriptionUpdateDeviceDataHandler", str2);
        }
        return Unit.INSTANCE;
    }
}
