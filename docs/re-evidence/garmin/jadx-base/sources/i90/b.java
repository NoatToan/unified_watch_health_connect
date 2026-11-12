package i90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDISimpleSetup;
import com.garmin.proto.generated.GDISimpleSetupExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import java.util.List;
import java.util.Set;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.l0;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Li90/b;", "Ldt2/a;", "<init>", "()V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements dt2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dt2.g f92278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f92279c = l0.f134950a;

    static {
        new a(null);
    }

    public static List d(GDISmartProto.Smart smart) {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDISimpleSetup.SimpleSetupService> generatedExtension = GDISimpleSetupExtension.simpleSetupService;
        if (!smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            a2 a2Var = a2.BIC;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SimpleSetupDataHandler", "parseFeatureListResponse: extension missing in response");
            return j0.f134944a;
        }
        GDISimpleSetup.SimpleSetupService simpleSetupService = (GDISimpleSetup.SimpleSetupService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (!simpleSetupService.hasSupportedFeatureListResponse()) {
            a2 a2Var2 = a2.BIC;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "SimpleSetupDataHandler", "parseFeatureListResponse: no SupportedFeatureListResponse in service");
            return j0.f134944a;
        }
        List<GDISimpleSetup.Feature> featureList = simpleSetupService.getSupportedFeatureListResponse().getFeatureList();
        a2 a2Var3 = a2.BIC;
        String strF = e0.f(featureList.size(), "parseFeatureListResponse: ", " features");
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "SimpleSetupDataHandler", strF);
        return featureList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f92282c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f92282c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objB = cVar2.f92280a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f92282c;
        try {
            if (i15 == 0) {
                r.b(objB);
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDISimpleSetupExtension.simpleSetupService, GDISimpleSetup.SimpleSetupService.newBuilder().setSupportedFeatureListRequest(GDISimpleSetup.SupportedFeaturesListRequest.newBuilder()).build()).build();
                a2 a2Var = a2.BIC;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SimpleSetupDataHandler", "fetchFeatureList: sending request");
                dt2.g gVar = this.f92278b;
                if (gVar == null) {
                    throw new IllegalStateException("Messenger is null, handler not started");
                }
                smartBuild.getClass();
                cVar2.f92282c = 1;
                objB = gVar.b(smartBuild, cVar2);
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
            return d((GDISmartProto.Smart) objB);
        } catch (Exception e4) {
            a2 a2Var2 = a2.BIC;
            String strN = fb1.c.n("fetchFeatureList: request failed - ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "SimpleSetupDataHandler", strN);
            throw e4;
        }
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        this.f92278b = null;
        a2 a2Var = a2.BIC;
        String strConcat = "close: ".concat(str);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "SimpleSetupDataHandler", strConcat);
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f92279c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(GDISimpleSetup.FeatureType featureType, v13.c cVar) throws Exception {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f92285c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f92285c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.f92283a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f92285c;
        try {
            if (i15 == 0) {
                r.b(obj);
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDISimpleSetupExtension.simpleSetupService, GDISimpleSetup.SimpleSetupService.newBuilder().setSelectedRestoreListNotification(GDISimpleSetup.SelectedRestoreListNotification.newBuilder().addFeatureType(featureType)).build()).build();
                i2.f36769a.getClass();
                i2.a.b(a2.BIC, "SimpleSetupDataHandler", "sendRestoreListNotification: featureType=" + featureType);
                dt2.g gVar = this.f92278b;
                if (gVar == null) {
                    throw new IllegalStateException("Messenger is null, handler not started");
                }
                smartBuild.getClass();
                dVar.f92285c = 1;
                if (gVar.c(smartBuild, dVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        } catch (Exception e4) {
            a2 a2Var = a2.BIC;
            String strN = fb1.c.n("sendRestoreListNotification: failed - ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.f(a2Var, "SimpleSetupDataHandler", strN);
            throw e4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(List list, v13.c cVar) throws Exception {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f92288c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f92288c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f92286a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f92288c;
        try {
            if (i15 == 0) {
                r.b(obj);
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDISimpleSetupExtension.simpleSetupService, GDISimpleSetup.SimpleSetupService.newBuilder().setSelectedSensorListNotification(GDISimpleSetup.SelectedSensorListNotification.newBuilder().addAllSensorType(list)).build()).build();
                a2 a2Var = a2.BIC;
                String strF = e0.f(list.size(), "sendSensorListNotification: sending ", " sensors");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SimpleSetupDataHandler", strF);
                dt2.g gVar = this.f92278b;
                if (gVar == null) {
                    throw new IllegalStateException("Messenger is null, handler not started");
                }
                smartBuild.getClass();
                eVar.f92288c = 1;
                if (gVar.c(smartBuild, eVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        } catch (Exception e4) {
            a2 a2Var2 = a2.BIC;
            String strN = fb1.c.n("sendSensorListNotification: failed - ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "SimpleSetupDataHandler", strN);
            throw e4;
        }
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f92278b = gVar;
        extensionRegistryLite.add(GDISimpleSetupExtension.simpleSetupService);
        i2.f36769a.getClass();
        i2.a.b(a2.BIC, "SimpleSetupDataHandler", "start: " + cVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li90/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
