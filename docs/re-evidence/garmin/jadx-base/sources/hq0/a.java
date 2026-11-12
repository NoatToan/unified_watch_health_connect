package hq0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import c22.j2;
import c22.q0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestHandler;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.incidentdetection.EdgeIncidentDetectionService;
import com.garmin.proto.generated.GDIIncidentDetectionExtension;
import com.garmin.proto.generated.GDIIncidentDetectionProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;
import cq0.j;
import fq0.f;
import fq0.g;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import sz0.e;
import z6.o;
import z6.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lhq0/a;", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/ProtobufRequestHandler;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceId", "", "requestId", "Lcom/garmin/proto/generated/GDISmartProto$Smart;", "requestMsg", "<init>", "(Landroid/content/Context;JILcom/garmin/proto/generated/GDISmartProto$Smart;)V", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ProtobufRequestHandler {
    static {
        new C1688a(null);
    }

    public a(Context context, long j8, int i14, GDISmartProto.Smart smart) {
        super(context, j8, i14, smart);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:45:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:46:0x020c  */
    @Override // java.lang.Runnable
    public final void run() {
        String string;
        Context context = this.contextRef.get();
        if (context == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "IncidentDetectionProtobufRequestHandler", "Aborting. Context is null.");
            return;
        }
        Object obj = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        obj.getClass();
        if (!((f12.b) obj).c()) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.p(a2Var2, "IncidentDetectionProtobufRequestHandler", "Aborting. No user is currently signed in to GCM.");
            return;
        }
        GDISmartProto.Smart smart = this.requestMsg;
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIIncidentDetectionProto.IncidentDetectionService> generatedExtension = GDIIncidentDetectionExtension.incidentDetectionService;
        GDIIncidentDetectionProto.IncidentDetectionService incidentDetectionService = smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? (GDIIncidentDetectionProto.IncidentDetectionService) this.requestMsg.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension) : null;
        if (incidentDetectionService == null) {
            return;
        }
        if (incidentDetectionService.hasUpdateDeviceOwnerRequest()) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var3, "IncidentDetectionProtobufRequestHandler", "Received [updateDeviceOwnerRequest]");
            long j8 = this.deviceId;
            incidentDetectionService.getUpdateDeviceOwnerRequest().getClass();
            GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(generatedExtension, GDIIncidentDetectionProto.IncidentDetectionService.newBuilder().setUpdateDeviceOwnerResponse(GDIIncidentDetectionProto.UpdateDeviceOwnerResponse.newBuilder().setStatus(GDIIncidentDetectionProto.UpdateDeviceOwnerResponse.ResponseStatus.OK)).build()).build();
            j jVar = (j) KoinJavaComponent.get$default(j.class, null, null, 6, null);
            int i14 = this.requestId;
            smartBuild.getClass();
            jVar.a(i14, j8, smartBuild);
            eq0.a aVarA = eq0.a.f65038b.a();
            aVarA.getClass();
            com.garmin.android.library.backgroundtaskmanagement.c.d(new g(aVarA), null);
            return;
        }
        if (incidentDetectionService.hasUpdateIncidentContactsRequest()) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var4, "IncidentDetectionProtobufRequestHandler", "Received [updateIncidentContactsRequest]");
            long j14 = this.deviceId;
            incidentDetectionService.getUpdateIncidentContactsRequest().getClass();
            GDISmartProto.Smart smartBuild2 = GDISmartProto.Smart.newBuilder().setExtension(generatedExtension, GDIIncidentDetectionProto.IncidentDetectionService.newBuilder().setUpdateIncidentContactsResponse(GDIIncidentDetectionProto.UpdateIncidentContactsResponse.newBuilder().setStatus(GDIIncidentDetectionProto.UpdateIncidentContactsResponse.ResponseStatus.OK)).build()).build();
            j jVar2 = (j) KoinJavaComponent.get$default(j.class, null, null, 6, null);
            int i15 = this.requestId;
            smartBuild2.getClass();
            jVar2.a(i15, j14, smartBuild2);
            eq0.a aVarA2 = eq0.a.f65038b.a();
            aVarA2.getClass();
            com.garmin.android.library.backgroundtaskmanagement.c.d(new f(aVarA2), null);
            return;
        }
        if (incidentDetectionService.hasIncidentDetectedRequest()) {
            i2.a aVar5 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var5, "IncidentDetectionProtobufRequestHandler", "Received [incidentDetectedRequest]");
            long j15 = this.deviceId;
            GDIIncidentDetectionProto.IncidentDetectedRequest incidentDetectedRequest = incidentDetectionService.getIncidentDetectedRequest();
            incidentDetectedRequest.getClass();
            if (!incidentDetectedRequest.hasPosition()) {
                i2.a.f(a2Var5, "IncidentDetectionProtobufRequestHandler", "Aborting. Position not set.");
                return;
            }
            Intent intent = new Intent(this.contextRef.get(), (Class<?>) EdgeIncidentDetectionService.class);
            intent.setAction("action.incident.detected");
            intent.putExtra("extra.remote.device.id", j15);
            intent.putExtra("extra.incident.detected.proto", incidentDetectedRequest);
            intent.putExtra("extra.protobuf.request.id", this.requestId);
            Context context2 = this.contextRef.get();
            context2.getClass();
            a7.b.startForegroundService(context2, intent);
            return;
        }
        if (incidentDetectionService.hasCancelIncidentRequest()) {
            i2.a aVar6 = i2.f36769a;
            a2 a2Var6 = a2.GENERAL;
            aVar6.getClass();
            i2.a.b(a2Var6, "IncidentDetectionProtobufRequestHandler", "Received [cancelIncidentRequest]");
            long j16 = this.deviceId;
            incidentDetectionService.getCancelIncidentRequest().getClass();
            Intent intent2 = new Intent(this.contextRef.get(), (Class<?>) EdgeIncidentDetectionService.class);
            intent2.setAction("action.cancel.incident.from.device");
            intent2.putExtra("extra.remote.device.id", j16);
            intent2.putExtra("extra.protobuf.request.id", this.requestId);
            Context context3 = this.contextRef.get();
            context3.getClass();
            a7.b.startForegroundService(context3, intent2);
            return;
        }
        if (!incidentDetectionService.hasIncidentVideoNotification()) {
            i2.a aVar7 = i2.f36769a;
            a2 a2Var7 = a2.GENERAL;
            aVar7.getClass();
            i2.a.f(a2Var7, "IncidentDetectionProtobufRequestHandler", "Aborting. Unknown request message.");
            return;
        }
        i2.a aVar8 = i2.f36769a;
        a2 a2Var8 = a2.GENERAL;
        aVar8.getClass();
        i2.a.b(a2Var8, "IncidentDetectionProtobufRequestHandler", "Received [incidentVideoRequest]");
        Intent intent3 = new Intent("android.intent.action.VIEW");
        intent3.setData(Uri.parse("virb://com.garmin.VirbMobile?StartPage=MediaLibrary?Filter=Incident"));
        hb2.g.a aVar9 = hb2.g.a.GARMIN_VIRB;
        if (hb2.g.b(context, aVar9)) {
            int i16 = j2.f23107a;
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent3, 65536);
            listQueryIntentActivities.getClass();
            if (listQueryIntentActivities.size() > 0) {
                string = context.getString(R.string.incident_video_recorded_notification_text);
                string.getClass();
            } else if (hb2.g.b(context, aVar9)) {
                intent3 = hb2.j.a(context, aVar9.f82804a);
                intent3.getClass();
                string = context.getString(R.string.incident_video_recorded_notification_text);
                string.getClass();
            } else {
                q0.f23203a.getClass();
                intent3 = new Intent("android.intent.action.VIEW", q0.a.a(context, aVar9));
                string = context.getString(R.string.incident_video_recorded_no_virb_app_notification_text);
                string.getClass();
            }
        } else if (hb2.g.b(context, aVar9)) {
            intent3 = hb2.j.a(context, aVar9.f82804a);
            intent3.getClass();
            string = context.getString(R.string.incident_video_recorded_notification_text);
            string.getClass();
        } else {
            q0.f23203a.getClass();
            intent3 = new Intent("android.intent.action.VIEW", q0.a.a(context, aVar9));
            string = context.getString(R.string.incident_video_recorded_no_virb_app_notification_text);
            string.getClass();
        }
        e eVar = e.f161370j;
        q qVar = new q(context, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = q.e(context.getString(R.string.app_name_garmin_connect));
        o oVar = new o();
        oVar.f202664e = q.e(string);
        qVar.l(oVar);
        qVar.i(16, true);
        qVar.f202686h = PendingIntent.getActivity(context, 0, intent3, 201326592);
        sz0.f.a aVar10 = sz0.f.f161394a;
        Notification notificationC = qVar.c();
        notificationC.getClass();
        aVar10.getClass();
        sz0.f.a.f(context, notificationC, 18, eVar);
    }

    /* JADX INFO: renamed from: hq0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhq0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1688a {
        public /* synthetic */ C1688a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1688a() {
        }
    }
}
