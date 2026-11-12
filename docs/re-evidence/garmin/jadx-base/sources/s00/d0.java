package s00;

import android.app.PendingIntent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.lte.LTESubscriptionManagerActivity;
import com.garmin.proto.generated.GDILTEExtension;
import com.garmin.proto.generated.GDILTEProto;
import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/d0;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f155291b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f155292a = o13.m.b(new ro0.h(13));

    static {
        new a(null);
    }

    public static void f(long j8, boolean z14) {
        GDISmartProto.Smart.Builder extension = GDISmartProto.Smart.newBuilder().setExtension(GDILTEExtension.lteService, GDILTEProto.LTEService.newBuilder().setLteSubscriptionInfoNotification(GDILTEProto.LTESubscriptionInfoNotification.newBuilder().setInfo(GDILTEProto.LTESubscriptionInfo.newBuilder().setDeviceId((int) j8).setIsSubscribed(z14).build())).build());
        extension.getClass();
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        GDISmartProto.Smart smartBuild = extension.build();
        smartBuild.getClass();
        protobufRequestManager.initiateNotification(smartBuild, j8);
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        garminConnectMobileApp.getClass();
        cVar.getClass();
        String string = bundle.getString("effectiveDate");
        String string2 = bundle.getString("unitId");
        Long lJ = string2 != null ? d53.t.j(string2) : null;
        String string3 = bundle.getString("event");
        String string4 = bundle.getString("sku");
        a2 a2Var = a2.GENERAL;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append(", ");
        sb3.append(lJ);
        sb3.append(", ");
        sb3.append(string3);
        String strO = am.j.o(", ", string4, sb3);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "LTESubscriptionNotificationHandler", strO);
        if (lJ == null || !(p005kotlin.jvm.internal.s.g(string3, "PackageCreated") || p005kotlin.jvm.internal.s.g(string3, "PackageTransferred"))) {
            if (lJ == null || !p005kotlin.jvm.internal.s.g(string3, "PackageCanceled")) {
                return;
            }
            f(lJ.longValue(), false);
            return;
        }
        PendingIntent pendingIntentC = j.c(garminConnectMobileApp, LTESubscriptionManagerActivity.a.a(LTESubscriptionManagerActivity.f43457e, garminConnectMobileApp, lJ.longValue(), false, 8));
        o13.t tVar = this.f155292a;
        vi1.a aVar = (vi1.a) tVar.getValue();
        long jLongValue = lJ.longValue();
        pendingIntentC.getClass();
        aVar.c(jLongValue, pendingIntentC);
        if (p005kotlin.jvm.internal.s.g(string3, "PackageCreated")) {
            ((vi1.a) tVar.getValue()).a().p(lJ.longValue(), false);
        } else if (p005kotlin.jvm.internal.s.g(string3, "PackageTransferred")) {
            ((vi1.a) tVar.getValue()).a().q(String.valueOf(lJ.longValue()));
        }
        f(lJ.longValue(), true);
    }

    @Override // n00.d
    public final n00.c[] b() {
        a2 a2Var = a2.GENERAL;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "LTESubscriptionNotificationHandler", "registering TRAINING_INCREASED_WHILE_PAUSED");
        return new n00.c[]{n00.c.LTE_SUBSCRIPTION_STATUS_CHANGE};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Ls00/d0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PACKAGE_CREATED", "PACKAGE_CANCELED", "PACKAGE_TRANSFERRED", "EFFECTIVE_DATE", "UNIT_ID", "EVENT", "SKU", "PREVIOUS_UNIT_ID", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
