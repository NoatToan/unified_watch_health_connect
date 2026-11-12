package pw0;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDILTEExtension;
import com.garmin.proto.generated.GDILTEProto;
import com.garmin.proto.generated.GDISmartProto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lpw0/e;", "Lqi1/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "requestId", "", "deviceId", "<init>", "(Landroid/content/Context;IJ)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements qi1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f141706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f141707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f141708c;

    static {
        new a(null);
    }

    public e(Context context, int i14, long j8) {
        context.getClass();
        this.f141706a = context;
        this.f141707b = i14;
        this.f141708c = j8;
    }

    @Override // qi1.b
    public final void a() {
        j22.a[] aVarArr = {j22.a.f96717f, j22.a.f96723l};
        j22.b bVar = j22.b.f96736a;
        j22.a[] aVarArr2 = (j22.a[]) Arrays.copyOf(aVarArr, 2);
        bVar.getClass();
        if (!j22.b.k(aVarArr2)) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "VerizonNotificationHandler", "*LTE* Phone does not have the correct permission to read SIM info.");
            b(null);
            return;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "VerizonNotificationHandler", "*LTE* Phone has the correct permissions to read SIM info.");
        ArrayList arrayList = new ArrayList();
        List<SubscriptionInfo> activeSubscriptionInfoList = ((SubscriptionManager) this.f141706a.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList != null) {
            Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getCarrierName().toString());
            }
        }
        boolean zContains = arrayList.contains("Verizon");
        GDILTEProto.LTEServiceProvider lTEServiceProvider = GDILTEProto.LTEServiceProvider.OTHER;
        if (zContains) {
            lTEServiceProvider = GDILTEProto.LTEServiceProvider.VERIZON;
        }
        b(lTEServiceProvider);
    }

    public final void b(GDILTEProto.LTEServiceProvider lTEServiceProvider) {
        GDILTEProto.LTEPhoneInfoResponse lTEPhoneInfoResponseBuild;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "VerizonNotificationHandler", "*LTE* sendResponseToDevice() Sending the response to the device.");
        if (lTEServiceProvider != null) {
            GDILTEProto.LTEPhoneInfoResponse.ResponseStatus responseStatus = GDILTEProto.LTEPhoneInfoResponse.ResponseStatus.OK;
            lTEPhoneInfoResponseBuild = GDILTEProto.LTEPhoneInfoResponse.newBuilder().setStatus(responseStatus).setPhoneInfo(GDILTEProto.LTEPhoneInfo.newBuilder().setServiceProvider(lTEServiceProvider)).build();
            lTEPhoneInfoResponseBuild.getClass();
        } else {
            lTEPhoneInfoResponseBuild = GDILTEProto.LTEPhoneInfoResponse.newBuilder().setStatus(GDILTEProto.LTEPhoneInfoResponse.ResponseStatus.ERROR).build();
            lTEPhoneInfoResponseBuild.getClass();
        }
        GDILTEProto.LTEService.Builder builderNewBuilder = GDILTEProto.LTEService.newBuilder();
        builderNewBuilder.setPhoneInfoResponse(lTEPhoneInfoResponseBuild);
        GDISmartProto.Smart.Builder builderNewBuilder2 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder2.getClass();
        builderNewBuilder2.setExtension(GDILTEExtension.lteService, builderNewBuilder.build());
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        GDISmartProto.Smart smartBuild = builderNewBuilder2.build();
        smartBuild.getClass();
        protobufRequestManager.respondToRequest(this.f141707b, this.f141708c, smartBuild);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpw0/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
