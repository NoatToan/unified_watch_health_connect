package cu0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventService;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.proto.generated.GDIDeviceStatus;
import com.garmin.proto.generated.GDIDeviceStatusExtension;
import com.garmin.proto.generated.GDISmartProto;
import e23.p;
import java.util.TimerTask;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcu0/b;", "Ljava/util/TimerTask;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LiveEventService f55558a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventService$getTwentyFourHourTimerTask$1$run$1", f = "LiveEventService.kt", l = {217}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f55559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f55560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LiveEventService f55561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f55562d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LiveEventService liveEventService, long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f55561c = liveEventService;
            this.f55562d = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f55561c, this.f55562d, dVar);
            aVar.f55560b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f55560b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f55559a;
            long j8 = this.f55562d;
            LiveEventService liveEventService = this.f55561c;
            if (i14 == 0) {
                r.b(obj);
                ju0.e eVarA = LiveEventService.a(liveEventService);
                this.f55560b = b0Var;
                this.f55559a = 1;
                ju0.e.a aVar2 = ju0.e.f100881g;
                obj = eVarA.a(j8, this, false);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            gu0.b bVar = (gu0.b) obj;
            if ((bVar != null ? s.g(bVar.f79037b, Boolean.TRUE) : false) && hk0.p.k(j8)) {
                int i15 = LiveEventService.f38482h;
                liveEventService.getClass();
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var, "LiveEventService", "Asking device for Activity Status. Device Id: " + j8);
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIDeviceStatusExtension.deviceStatusService, GDIDeviceStatus.DeviceStatusService.newBuilder().setActivityStatusRequest(GDIDeviceStatus.GetCurrentActivityStatusRequest.newBuilder().build()).build()).build();
                ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
                smartBuild.getClass();
                protobufRequestManager.initiateRequest(smartBuild, j8, liveEventService.f38488f);
            } else {
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var2, "LiveEventService", "The device is not paired! The extra timer will check back in one hour.");
            }
            return Unit.INSTANCE;
        }
    }

    public b(LiveEventService liveEventService) {
        this.f55558a = liveEventService;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "LiveEventService", "The 24 hr timer is finish.");
        long jR = GCMSettingManager.r(fd0.d.LIVE_EVENT_SHARING, null);
        LiveEventService liveEventService = this.f55558a;
        ge1.b.T(liveEventService, null, null, new a(liveEventService, jR, null), 3);
    }
}
