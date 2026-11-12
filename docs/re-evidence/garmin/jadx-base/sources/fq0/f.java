package fq0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDIIncidentDetectionExtension;
import com.garmin.proto.generated.GDIIncidentDetectionProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import cq0.j;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lfq0/f;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Ljq0/d;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "c", "b", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends com.garmin.android.library.backgroundtaskmanagement.b<jq0.d> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f73220l;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"fq0/f$a", "Lgq0/b;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends gq0.b {
        public a(SupportedCapability supportedCapability) {
            super(f.this, supportedCapability);
        }

        @Override // gq0.b
        public final void d(ArrayList arrayList) {
            boolean zIsEmpty = arrayList.isEmpty();
            f fVar = f.this;
            if (zIsEmpty) {
                fVar.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new jq0.d(jq0.d.a.NO_DEVICES_WITH_CAPABILITY_CONNECTED));
            } else {
                cw.e.a(fVar, new gq0.c(new e(fVar, arrayList)));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfq0/f$c;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "", "Lcom/garmin/device/datatypes/DeviceProfile;", "devices", "<init>", "(Lfq0/f;Ljava/util/List;)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends com.garmin.android.library.backgroundtaskmanagement.d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final List<DeviceProfile> f73222i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ f f73223j;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"fq0/f$c$a", "Lwm2/b;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a implements wm2.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ DeviceProfile f73224a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f73225b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ c f73226c;

            public a(DeviceProfile deviceProfile, f fVar, c cVar) {
                this.f73224a = deviceProfile;
                this.f73225b = fVar;
                this.f73226c = cVar;
            }

            @Override // wm2.b
            public final void onResponseFailed(int i14) {
                a2 a2Var = a2.SETTINGS;
                String strE = org.apache.commons.lang3.e.e(this.f73224a.getF172494b(), "protobuf:UpdateIncidentContactsRequest:onResponseFailed:deviceID ");
                i2.f36769a.getClass();
                i2.a.p(a2Var, "SendContactsToDevicesOp", strE);
                this.f73225b.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new jq0.d(jq0.d.a.ON_RESPONSE_FAILED));
                this.f73226c.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            }

            @Override // wm2.b
            public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
                smart.getClass();
                String strE = org.apache.commons.lang3.e.e(this.f73224a.getF172494b(), "protobuf:UpdateIncidentContactsRequest:onResponseReceived:deviceID ");
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "SendContactsToDevicesOp", strE);
                this.f73225b.i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new jq0.d(jq0.d.a.SUCCESS));
                this.f73226c.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(f fVar, List<? extends DeviceProfile> list) {
            super(fVar);
            list.getClass();
            this.f73223j = fVar;
            this.f73222i = list;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            GDIIncidentDetectionProto.UpdateIncidentContactsRequest.Builder builderNewBuilder = GDIIncidentDetectionProto.UpdateIncidentContactsRequest.newBuilder();
            f fVar = this.f73223j;
            ArrayList arrayList = fVar.f73220l;
            if (arrayList != null && !arrayList.isEmpty()) {
                builderNewBuilder.addAllContact(fVar.f73220l);
            }
            for (DeviceProfile deviceProfile : this.f73222i) {
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIIncidentDetectionExtension.incidentDetectionService, GDIIncidentDetectionProto.IncidentDetectionService.newBuilder().setUpdateIncidentContactsRequest(builderNewBuilder.mo57clone()).build()).build();
                j jVar = (j) KoinJavaComponent.get$default(j.class, null, null, 6, null);
                smartBuild.getClass();
                jVar.j(smartBuild, deviceProfile.getF172494b(), new a(deviceProfile, fVar, this));
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
        }
    }

    static {
        new b(null);
    }

    public f(com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar);
        b(new a(SupportedCapability.INCIDENT_DETECTION));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfq0/f$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
