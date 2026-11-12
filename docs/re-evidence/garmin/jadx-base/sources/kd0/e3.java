package kd0;

import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDILiveTrackExtension;
import com.garmin.proto.generated.GDILiveTrackProto;
import com.garmin.proto.generated.GDISmartProto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.GroupRideDelegateImpl$sendCodeToDevice$2", f = "GroupRideDelegateImpl.kt", l = {45, 53}, m = "invokeSuspend", v = 2)
public final class e3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GDILiveTrackProto.LiveTrackService f104042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f104043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f104044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f104045d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.GroupRideDelegateImpl$sendCodeToDevice$2$1", f = "GroupRideDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wm2.a f104046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart.Builder f104047b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f104048c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wm2.a aVar, GDISmartProto.Smart.Builder builder, String str, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f104046a = aVar;
            this.f104047b = builder;
            this.f104048c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f104046a, this.f104047b, this.f104048c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            wm2.a aVar2 = this.f104046a;
            if (aVar2 == null) {
                return null;
            }
            GDISmartProto.Smart smartBuild = this.f104047b.build();
            smartBuild.getClass();
            aVar2.initiateNotification(smartBuild, this.f104048c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\"\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001j\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002`\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Ljava/util/ArrayList;", "Lcom/garmin/device/datatypes/DeviceProfile;", "kotlin.jvm.PlatformType", "Lkotlin/collections/ArrayList;", "<anonymous>", "(Lo53/b0;)Ljava/util/ArrayList;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.GroupRideDelegateImpl$sendCodeToDevice$2$connectedDevices$1", f = "GroupRideDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super ArrayList<DeviceProfile>>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super ArrayList<DeviceProfile>> dVar) {
            return new b(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            GarminConnectMobileApp.f28685g.getClass();
            return new ArrayList(da2.d.c(GarminConnectMobileApp.a.a()).f58886a.f111646e.e());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(String str, long j8, t13.d<? super e3> dVar) {
        super(2, dVar);
        this.f104044c = str;
        this.f104045d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e3(this.f104044c, this.f104045d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        if (ge1.b.e0(r1, r6, r9) == r0) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        GDILiveTrackProto.LiveTrackService liveTrackServiceBuild;
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f104043b;
        if (i14 != 0) {
            if (i14 == 1) {
                liveTrackServiceBuild = this.f104042a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        GDILiveTrackProto.GroupRideNotification.Builder builderNewBuilder = GDILiveTrackProto.GroupRideNotification.newBuilder();
        builderNewBuilder.setShareSessionCode(this.f104044c);
        GDILiveTrackProto.LiveTrackService.Builder builderNewBuilder2 = GDILiveTrackProto.LiveTrackService.newBuilder();
        builderNewBuilder2.setGroupRideNotification(builderNewBuilder);
        liveTrackServiceBuild = builderNewBuilder2.build();
        x53.c cVar = o53.s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        b bVar2 = new b(null);
        this.f104042a = liveTrackServiceBuild;
        this.f104043b = 1;
        obj = ge1.b.e0(bVar, bVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        Iterator it = ((List) obj).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((DeviceProfile) next).getF92746j() != this.f104045d);
        DeviceProfile deviceProfile = (DeviceProfile) next;
        String macAddress = deviceProfile != null ? deviceProfile.getMacAddress() : null;
        if (macAddress != null) {
            GarminConnectMobileApp.f28685g.getClass();
            wm2.a aVar2 = (wm2.a) da2.d.c(GarminConnectMobileApp.a.a()).getCapability(macAddress, wm2.a.class);
            GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
            builderNewBuilder3.getClass();
            liveTrackServiceBuild.getClass();
            builderNewBuilder3.setExtension(GDILiveTrackExtension.liveTrackService, liveTrackServiceBuild);
            x53.c cVar2 = o53.s0.f129406a;
            x53.b bVar3 = x53.b.f189152a;
            a aVar3 = new a(aVar2, builderNewBuilder3, macAddress, null);
            this.f104042a = null;
            this.f104043b = 2;
        }
        return Unit.INSTANCE;
    }
}
