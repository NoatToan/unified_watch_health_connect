package hd0;

import com.garmin.proto.generated.WifiSetup;
import com.google.protobuf.ByteString;
import d53.w;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.wifi.WifiNetworksViewModel$updateNetworkPassword$1", f = "WifiNetworksViewModel.kt", l = {169, 187}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WifiSetup.StoredAccessPoint f83346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f83347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f83348d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/proto/generated/WifiSetup$StoredAccessPoint;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.wifi.WifiNetworksViewModel$updateNetworkPassword$1$newNetworksList$1", f = "WifiNetworksViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super List<? extends WifiSetup.StoredAccessPoint>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f83349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WifiSetup.StoredAccessPoint f83350b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, WifiSetup.StoredAccessPoint storedAccessPoint, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f83349a = bVar;
            this.f83350b = storedAccessPoint;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f83349a, this.f83350b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super List<? extends WifiSetup.StoredAccessPoint>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ArrayList arrayList = this.f83349a.f83310c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (!s.g(((WifiSetup.StoredAccessPoint) obj2).getSsid(), this.f83350b.getSsid())) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(WifiSetup.StoredAccessPoint storedAccessPoint, String str, b bVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f83346b = storedAccessPoint;
        this.f83347c = str;
        this.f83348d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f83346b, this.f83347c, this.f83348d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        if (r9 == r0) goto L24;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f83345a;
        b bVar = this.f83348d;
        WifiSetup.StoredAccessPoint storedAccessPoint = this.f83346b;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar2 = x53.b.f189152a;
            a aVar2 = new a(bVar, storedAccessPoint, null);
            this.f83345a = 1;
            obj = ge1.b.e0(bVar2, aVar2, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        bVar.f83309b.j(new h.g(storedAccessPoint, ((Boolean) obj).booleanValue()));
        return Unit.INSTANCE;
        ArrayList arrayListD1 = h0.d1((Collection) obj);
        WifiSetup.StoredAccessPoint.Builder builderNewBuilder = WifiSetup.StoredAccessPoint.newBuilder();
        builderNewBuilder.setSsid(storedAccessPoint.getSsid());
        builderNewBuilder.setSecurityType(storedAccessPoint.getSecurityType());
        String str = this.f83347c;
        builderNewBuilder.setPasswordIsHex(hd0.a.b(str));
        if (w.J(str) || storedAccessPoint.getSecurityType() == WifiSetup.SecurityType.OPEN) {
            builderNewBuilder.setPasswordLen(0);
        } else {
            byte[] bytes = str.getBytes(d53.c.f57666b);
            bytes.getClass();
            builderNewBuilder.setPassword(ByteString.copyFrom(bytes));
            builderNewBuilder.setPasswordLen(str.length());
        }
        if (!storedAccessPoint.getMacAddress().isEmpty()) {
            builderNewBuilder.setMacAddress(storedAccessPoint.getMacAddress());
        }
        WifiSetup.StoredAccessPoint storedAccessPointBuild = builderNewBuilder.build();
        storedAccessPointBuild.getClass();
        arrayListD1.add(storedAccessPointBuild);
        this.f83345a = 2;
        obj = b.x4(bVar, arrayListD1, this);
    }
}
