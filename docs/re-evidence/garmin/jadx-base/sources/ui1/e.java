package ui1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.garmin.proto.generated.GDIInReachMessagingExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import java.io.Serializable;
import java.util.Set;
import org.apache.commons.text.lookup.StringLookupFactory;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r53.a2;
import r53.e2;
import r53.g2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lui1/e;", "Ldt2/a;", "Ldt2/h;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements dt2.a, dt2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dt2.g f171253c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e2 f171255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2 f171256f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p13.l0 f171252b = p13.l0.f134950a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f171254d = -1;

    static {
        new a(null);
    }

    public e() {
        e2 e2VarB = g2.b(1, 0, q53.a.DROP_OLDEST, 2);
        this.f171255e = e2VarB;
        this.f171256f = r53.s.c(e2VarB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f171271c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f171271c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objB = fVar.f171269a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f171271c;
        boolean z14 = false;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIInReachMessagingExtension.inreachMessagingService, GDIInReachMessaging.InReachMessagingService.newBuilder().setCapabilitiesRequest(GDIInReachMessaging.CapabilitiesRequest.newBuilder().build()).build()).build();
                dt2.g gVar = this.f171253c;
                if (gVar == null) {
                    p005kotlin.jvm.internal.s.m("messenger");
                    throw null;
                }
                smartBuild.getClass();
                fVar.f171271c = 1;
                objB = gVar.b(smartBuild, fVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB);
            }
            GDISmartProto.Smart smart = (GDISmartProto.Smart) objB;
            GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachMessaging.InReachMessagingService> generatedExtension = GDIInReachMessagingExtension.inreachMessagingService;
            if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                GDIInReachMessaging.Capabilities capabilities = ((GDIInReachMessaging.InReachMessagingService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getCapabilitiesResponse().getCapabilities();
                if (capabilities.hasIrisServiceCapabilities() && (capabilities.getIrisServiceCapabilities() & 2) != 0) {
                    z14 = true;
                }
            } else {
                i2.a aVar2 = i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "InReachMessagingProtobufHandler", "Response missing inreachMessagingService extension");
            }
        } catch (ProtobufException e4) {
            i2.a aVar3 = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "InReachMessagingProtobufHandler", "hasIrisServiceCapableDevice sendRequest failed: " + e4);
        }
        return Boolean.valueOf(z14);
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f171276c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f171276c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objB = gVar.f171274a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f171276c;
        boolean z14 = false;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIInReachMessagingExtension.inreachMessagingService, GDIInReachMessaging.InReachMessagingService.newBuilder().setMessagingStatusRequest(GDIInReachMessaging.MessagingStatusRequest.newBuilder().build()).build()).build();
                dt2.g gVar2 = this.f171253c;
                if (gVar2 == null) {
                    p005kotlin.jvm.internal.s.m("messenger");
                    throw null;
                }
                smartBuild.getClass();
                gVar.f171276c = 1;
                objB = gVar2.b(smartBuild, gVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB);
            }
            GDISmartProto.Smart smart = (GDISmartProto.Smart) objB;
            GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachMessaging.InReachMessagingService> generatedExtension = GDIInReachMessagingExtension.inreachMessagingService;
            if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                GDIInReachMessaging.ActivationStatus activationStatus = ((GDIInReachMessaging.InReachMessagingService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMessagingStatusResponse().getActivationStatus();
                if (activationStatus == GDIInReachMessaging.ActivationStatus.ACTIVE || activationStatus == GDIInReachMessaging.ActivationStatus.ACTIVE_BYPASSED) {
                    z14 = true;
                }
            } else {
                i2.a aVar2 = i2.f36769a;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "InReachMessagingProtobufHandler", "Response missing inreachMessagingService extension");
            }
        } catch (ProtobufException e4) {
            i2.a aVar3 = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "InReachMessagingProtobufHandler", "sendRequest failed: " + e4);
        }
        return Boolean.valueOf(z14);
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f171252b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable l(v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f171285c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f171285c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objB = hVar.f171283a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f171285c;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIInReachMessagingExtension.inreachMessagingService, GDIInReachMessaging.InReachMessagingService.newBuilder().setMessagingSubscribeRequest(GDIInReachMessaging.MessagingSubscribeRequest.newBuilder().setWantActivationStatus(true).build()).build()).build();
                dt2.g gVar = this.f171253c;
                if (gVar == null) {
                    p005kotlin.jvm.internal.s.m("messenger");
                    throw null;
                }
                smartBuild.getClass();
                hVar.f171285c = 1;
                objB = gVar.b(smartBuild, hVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB);
            }
            GDISmartProto.Smart smart = (GDISmartProto.Smart) objB;
            GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachMessaging.InReachMessagingService> generatedExtension = GDIInReachMessagingExtension.inreachMessagingService;
            if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                return ((GDIInReachMessaging.InReachMessagingService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getMessagingSubscribeRequest();
            }
            i2.a aVar2 = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "InReachMessagingProtobufHandler", "Response missing inreachMessagingService extension");
            return null;
        } catch (ProtobufException e4) {
            i2.a aVar3 = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "InReachMessagingProtobufHandler", "messagingSubscribeRequest failed : " + e4);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable m(GDIInReachMessaging.ActivationMethod activationMethod, v13.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f171292c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f171292c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objB = iVar.f171290a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f171292c;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDIInReachMessagingExtension.inreachMessagingService, GDIInReachMessaging.InReachMessagingService.newBuilder().setActivationStartRequest(GDIInReachMessaging.ActivationStartRequest.newBuilder().setActivationMethod(activationMethod).setActivationType(GDIInReachMessaging.ActivationType.NORMAL_ACTIVATION).build()).build()).build();
                dt2.g gVar = this.f171253c;
                if (gVar == null) {
                    p005kotlin.jvm.internal.s.m("messenger");
                    throw null;
                }
                smartBuild.getClass();
                iVar.f171292c = 1;
                objB = gVar.b(smartBuild, iVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB);
            }
            GDISmartProto.Smart smart = (GDISmartProto.Smart) objB;
            GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachMessaging.InReachMessagingService> generatedExtension = GDIInReachMessagingExtension.inreachMessagingService;
            if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                return ((GDIInReachMessaging.InReachMessagingService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension)).getActivationStartResponse();
            }
            i2.a aVar2 = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "InReachMessagingProtobufHandler", "Response missing inreachMessagingService extension");
            return null;
        } catch (ProtobufException e4) {
            i2.a aVar3 = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "InReachMessagingProtobufHandler", "startActivation sendRequest failed: " + e4);
            return null;
        }
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, dt2.k kVar) {
        smart.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachMessaging.InReachMessagingService> generatedExtension = GDIInReachMessagingExtension.inreachMessagingService;
        if (!smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
            return false;
        }
        GDIInReachMessaging.InReachMessagingService inReachMessagingService = (GDIInReachMessaging.InReachMessagingService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (!inReachMessagingService.hasActivationStatusNotification()) {
            i2.a aVar = i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "InReachMessagingProtobufHandler", "Unhandled InReachMessagingService request");
            return false;
        }
        GDIInReachMessaging.ActivationStatusNotification activationStatusNotification = inReachMessagingService.getActivationStatusNotification();
        String str = "Received ActivationStatusNotification: activationStatus=" + activationStatusNotification.getActivationStatus();
        i2.a aVar2 = i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "InReachMessagingProtobufHandler", str);
        if (activationStatusNotification.getActivationStatus() == GDIInReachMessaging.ActivationStatus.ACTIVE || activationStatusNotification.getActivationStatus() == GDIInReachMessaging.ActivationStatus.ACTIVE_BYPASSED) {
            Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
            PendingIntent pendingIntentH = ((m90.a) KoinJavaComponent.get$default(m90.a.class, null, null, 6, null)).h(contextC, this.f171254d);
            sz0.e eVar = sz0.e.I0;
            z6.q qVar = new z6.q(contextC, eVar.f161386a);
            qVar.N.icon = 2131232010;
            qVar.f202683e = z6.q.e(contextC.getString(R.string.device_settings_inreach_device_activated));
            qVar.f202684f = z6.q.e(contextC.getString(R.string.lbl_plan_ready));
            qVar.i(16, true);
            qVar.B = StringLookupFactory.KEY_SYS;
            qVar.f202691m = 1;
            qVar.f202686h = pendingIntentH;
            Notification notificationC = qVar.c();
            notificationC.getClass();
            sz0.f.f161394a.getClass();
            sz0.f.a.f(contextC, notificationC, 53, eVar);
        }
        this.f171255e.d(activationStatusNotification);
        return true;
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f171253c = gVar;
        long j8 = ((us2.f) cVar).f172494b;
        this.f171254d = j8;
        extensionRegistryLite.add(GDIInReachMessagingExtension.inreachMessagingService);
        ((dt2.d) gVar).f61154i.add(this);
        i2.a aVar = i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "InReachMessagingProtobufHandler", "InReachMessagingProtobufHandler started for device: " + j8);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lui1/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
