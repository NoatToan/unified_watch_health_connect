package ov0;

import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDIGarminConnect;
import com.garmin.proto.generated.GDIGarminConnectExtension;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.c;
import dt2.g;
import g8.i;
import java.util.Set;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.l0;
import u53.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lov0/a;", "Ldt2/c;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f134126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f134127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rs2.c f134128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0 f134129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f134130f;

    static {
        new C2542a(null);
    }

    public a() {
        x53.c cVar = s0.f129406a;
        this.f134126b = c0.a(x53.b.f189152a.plus(i.c()));
        this.f134129e = l0.f134950a;
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
    }

    @Override // dt2.c
    public final void configure(rs2.c cVar, ExtensionRegistryLite extensionRegistryLite, GDICore.FeatureCapabilitiesRequest.Builder builder) {
        cVar.getClass();
        extensionRegistryLite.getClass();
        this.f134128d = cVar;
        GDIGarminConnectExtension.registerAllExtensions(extensionRegistryLite);
        GDIGarminConnect.registerAllExtensions(extensionRegistryLite);
    }

    @Override // dt2.c
    public final void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f134129e;
    }

    @Override // dt2.c
    public final void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse) {
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, GDIGarminConnect.ServerFeatureCapabilities> generatedExtension = GDIGarminConnect.responseGarminConnectCapabilites;
        GDIGarminConnect.ServerFeatureCapabilities serverFeatureCapabilities = featureCapabilitiesResponse.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? (GDIGarminConnect.ServerFeatureCapabilities) featureCapabilitiesResponse.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension) : null;
        boolean lifestyleLoggingSupport = false;
        if (serverFeatureCapabilities != null && serverFeatureCapabilities.hasLifestyleLoggingSupport()) {
            lifestyleLoggingSupport = serverFeatureCapabilities.getLifestyleLoggingSupport();
        }
        this.f134130f = lifestyleLoggingSupport;
        rs2.c cVar = this.f134128d;
        if (cVar != null) {
            cVar.getF92746j();
        }
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f134127c = gVar;
        this.f134128d = cVar;
    }

    /* JADX INFO: renamed from: ov0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lov0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2542a {
        public /* synthetic */ C2542a(j jVar) {
            this();
        }

        private C2542a() {
        }
    }
}
