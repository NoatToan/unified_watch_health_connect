package fv;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIConnectionManagement;
import com.garmin.proto.generated.GDIConnectionManagementExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.d;
import dt2.g;
import dt2.h;
import dt2.k;
import java.util.Set;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.a1;
import rs2.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lfv/a;", "Ldt2/a;", "Ldt2/h;", "<init>", "()V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements dt2.a, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f73610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f73611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<Integer> f73612d = a1.b(113);

    static {
        new C1487a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(GDIConnectionManagement.SupportedConnectionTypes supportedConnectionTypes, v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f73615c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f73615c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objB = bVar.f73613a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f73615c;
        try {
            if (i15 == 0) {
                r.b(objB);
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIConnectionManagementExtension.connectionManagementService, GDIConnectionManagement.Service.newBuilder().setConnectionModeRequest(GDIConnectionManagement.ConnectionModeRequest.newBuilder().setConnectionMode(supportedConnectionTypes).build()).build()).build();
                i2.a aVar2 = i2.f36769a;
                aVar2.getClass();
                i2.a.b(a2.BIC, "ConnectionManagementProtobufDataHandler", "updateBleConnectionType " + smartBuild);
                g gVar = this.f73611c;
                if (gVar == null) {
                    s.m("messenger");
                    throw null;
                }
                smartBuild.getClass();
                bVar.f73615c = 1;
                objB = gVar.b(smartBuild, bVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objB);
            }
            i2.a aVar3 = i2.f36769a;
            aVar3.getClass();
            i2.a.b(a2.BIC, "ConnectionManagementProtobufDataHandler", "updateBleConnectionType response " + ((GDISmartProto.Smart) objB));
        } catch (Exception e4) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.BIC;
            String str = "Failed to send message to the device " + e4.getMessage();
            aVar4.getClass();
            i2.a.b(a2Var, "ConnectionManagementProtobufDataHandler", str);
        }
        return Unit.INSTANCE;
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f73612d;
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
        GDIConnectionManagement.ConnectionModeResponse connectionModeResponse;
        GDIConnectionManagement.ConnectionModeResponse connectionModeResponse2;
        smart.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.BIC;
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIConnectionManagement.Service> generatedExtension = GDIConnectionManagementExtension.connectionManagementService;
        String str = "onProtobufRequest: hasConnectionManagementExtension " + smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        aVar.getClass();
        i2.a.b(a2Var, "ConnectionManagementProtobufDataHandler", str);
        if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            GDIConnectionManagement.Service service = (GDIConnectionManagement.Service) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            String string = null;
            i2.a.b(a2Var, "ConnectionManagementProtobufDataHandler", "onProtobufRequest: hasConnectionMode " + ((service == null || (connectionModeResponse2 = service.getConnectionModeResponse()) == null) ? null : Boolean.valueOf(connectionModeResponse2.hasConnectionMode())));
            if (service != null && (connectionModeResponse = service.getConnectionModeResponse()) != null) {
                string = connectionModeResponse.toString();
            }
            i2.a.b(a2Var, "ConnectionManagementProtobufDataHandler", "onProtobufRequest: connectionModeResponse " + string);
        }
        return smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
    }

    @Override // dt2.a
    public final void start(c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f73610b = cVar;
        this.f73611c = gVar;
        extensionRegistryLite.add(GDIConnectionManagementExtension.connectionManagementService);
        ((d) gVar).f61154i.add(this);
    }

    /* JADX INFO: renamed from: fv.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfv/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1487a {
        public /* synthetic */ C1487a(j jVar) {
            this();
        }

        private C1487a() {
        }
    }
}
