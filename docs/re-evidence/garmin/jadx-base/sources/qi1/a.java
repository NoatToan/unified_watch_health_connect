package qi1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDILTEExtension;
import com.garmin.proto.generated.GDILTEProto;
import com.garmin.proto.generated.GDISmartProto;
import o53.b0;
import o53.e2;
import o53.s0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ui1.o0;
import ui1.x0;
import ui1.y0;
import ui1.z0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lqi1/a;", "Lqi1/b;", "Lo53/b0;", "", "requestId", "", "deviceId", "<init>", "(IJ)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qi1.b, b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f144846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f144847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f144848c = ge1.b.h();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.lte.LTEGenericNotificationHandler$processDeviceRequest$1", f = "LTEGenericNotificationHandler.kt", l = {33}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f144849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f144850b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = a.this.new b(dVar);
            bVar.f144850b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            DateTime dateTimeB;
            b0 b0Var = (b0) this.f144850b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f144849a;
            a aVar2 = a.this;
            if (i14 == 0) {
                o13.r.b(obj);
                o0.f171346d.getClass();
                o0 o0VarA = o0.a.a();
                Long l14 = new Long(aVar2.f144847b);
                this.f144850b = b0Var;
                this.f144849a = 1;
                obj = o0VarA.f(l14, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                v2.b bVar = (v2.b) v2Var;
                Object obj2 = bVar.f47386a;
                String str = "Response from API was successful, sending data to the device. " + obj2 + ", response code: " + bVar.f47387b;
                i2.a aVar3 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var, "LTEGenericNotificationHandler", str);
                z0 z0VarA = y0.a((x0) obj2);
                long j8 = aVar2.f144847b;
                i2.a.b(a2Var, "LTEGenericNotificationHandler", "buildLteSubscriptionInfo() deviceId: " + j8 + ", subscriptionResponseItem: " + z0VarA);
                boolean zI = km2.a.i(j8, null, SupportedCapability.INREACH.ordinal());
                GDILTEProto.LTESubscriptionInfo.Builder isSubscribed = GDILTEProto.LTESubscriptionInfo.newBuilder().setDeviceId((int) j8).setIsSubscribed(z0VarA != null ? z0VarA.d() : false);
                if (zI) {
                    isSubscribed.setSubscriptionStatus(GDILTEProto.LTESubscriptionInfo.SubscriptionStatus.INACTIVE);
                }
                if (z0VarA != null && (dateTimeB = z0VarA.b()) != null) {
                    isSubscribed.setAccountExpirationUnixTimestamp(dateTimeB.getMillis());
                }
                GDILTEProto.LTESubscriptionInfo lTESubscriptionInfoBuild = isSubscribed.build();
                lTESubscriptionInfoBuild.getClass();
                a.b(aVar2, GDILTEProto.LTESubscriptionInfoResponse.newBuilder().setStatus(GDILTEProto.LTESubscriptionInfoResponse.ResponseStatus.OK).setInfo(lTESubscriptionInfoBuild));
            } else {
                a.b(aVar2, GDILTEProto.LTESubscriptionInfoResponse.newBuilder().setStatus(GDILTEProto.LTESubscriptionInfoResponse.ResponseStatus.UNKNOWN));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new C2732a(null);
    }

    public a(int i14, long j8) {
        this.f144846a = i14;
        this.f144847b = j8;
    }

    public static final void b(a aVar, GDILTEProto.LTESubscriptionInfoResponse.Builder builder) {
        aVar.getClass();
        GDILTEProto.LTEService.Builder lteSubscriptionInfoResponse = GDILTEProto.LTEService.newBuilder().setLteSubscriptionInfoResponse(builder);
        GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
        builderNewBuilder.getClass();
        lteSubscriptionInfoResponse.getClass();
        builderNewBuilder.setExtension(GDILTEExtension.lteService, lteSubscriptionInfoResponse.build());
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        int i14 = aVar.f144846a;
        long j8 = aVar.f144847b;
        GDISmartProto.Smart smartBuild = builderNewBuilder.build();
        smartBuild.getClass();
        protobufRequestManager.respondToRequest(i14, j8, smartBuild);
    }

    @Override // qi1.b
    public final void a() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "LTEGenericNotificationHandler", "processDeviceRequest");
        ge1.b.T(this, null, null, new b(null), 3);
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        x53.c cVar = s0.f129406a;
        return x53.b.f189152a.plus(this.f144848c);
    }

    /* JADX INFO: renamed from: qi1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqi1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2732a {
        public /* synthetic */ C2732a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2732a() {
        }
    }
}
