package fq0;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDIIncidentDetectionExtension;
import com.garmin.proto.generated.GDIIncidentDetectionProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import cq0.j;
import f12.l;
import iu1.k;
import l20.q;
import l20.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lfq0/g;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Ljq0/e;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b$a;)V", "b", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends com.garmin.android.library.backgroundtaskmanagement.b<jq0.e> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f73227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f73228m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfq0/g$b;", "Lcom/garmin/android/library/backgroundtaskmanagement/d;", "", "deviceID", "<init>", "(Lfq0/g;J)V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends com.garmin.android.library.backgroundtaskmanagement.d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f73229i;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"fq0/g$b$a", "Lwm2/b;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a implements wm2.b {
            public a() {
            }

            @Override // wm2.b
            public final void onResponseFailed(int i14) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "SendUserInfoToGarminDevicesOperation", "protobuf:UpdateDeviceOwnerRequest:onResponseFailed");
                b.this.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            }

            @Override // wm2.b
            public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
                smart.getClass();
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "SendUserInfoToGarminDevicesOperation", "protobuf:UpdateDeviceOwnerRequest:onResponseReceived");
                b.this.c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
            }
        }

        public b(long j8) {
            super(g.this);
            this.f73229i = j8;
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.f
        public final void a() {
            GDIIncidentDetectionProto.UpdateDeviceOwnerRequest.Builder builderNewBuilder = GDIIncidentDetectionProto.UpdateDeviceOwnerRequest.newBuilder();
            g gVar = g.this;
            builderNewBuilder.setName(gVar.f73227l);
            builderNewBuilder.setLocation(gVar.f73228m);
            GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIIncidentDetectionExtension.incidentDetectionService, GDIIncidentDetectionProto.IncidentDetectionService.newBuilder().setUpdateDeviceOwnerRequest(builderNewBuilder).build()).build();
            j jVar = (j) KoinJavaComponent.get$default(j.class, null, null, 6, null);
            smartBuild.getClass();
            jVar.j(smartBuild, this.f73229i, new a());
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.d
        public final void b() {
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"fq0/g$c", "Liu1/k;", "Ll20/r;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements k<r> {
        public c() {
        }

        @Override // iu1.k
        public final void a(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0056 A[PHI: r3
          0x0056: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v7 java.lang.String) binds: [B:7:0x0034, B:9:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // iu1.k
        public final void onSuccess(r rVar) {
            q selfUserContactDTO = rVar.getSelfUserContactDTO();
            if (selfUserContactDTO != null) {
                String fullName = selfUserContactDTO.getFullName();
                String location = selfUserContactDTO.getLocation();
                if (TextUtils.isEmpty(fullName)) {
                    eq0.a.f65038b.a().getClass();
                    Object obj = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                    obj.getClass();
                    String userFullName = ((f12.b) obj).getUserFullName();
                    if (TextUtils.isEmpty(userFullName)) {
                        userFullName = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).getUserName();
                        if (TextUtils.isEmpty(userFullName)) {
                            Object obj2 = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
                            obj2.getClass();
                            fullName = ((f12.b) obj2).getUserDisplayName();
                        } else {
                            fullName = userFullName;
                        }
                    } else {
                        fullName = userFullName;
                    }
                }
                g gVar = g.this;
                gVar.f73227l = fullName;
                if (TextUtils.isEmpty(location)) {
                    eq0.a.f65038b.a().getClass();
                    l.f68084a.getClass();
                    location = l.a.a().f();
                }
                gVar.f73228m = location;
                gVar.b(new h(gVar, SupportedCapability.INCIDENT_DETECTION));
            }
        }
    }

    static {
        new a(null);
    }

    public g(com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.BACKGROUND_PRIORITY, aVar);
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new jq0.e());
        cw.e.a(this, new gq0.c(new c()));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfq0/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
