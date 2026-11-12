package sj2;

import am.j;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDICredentials;
import com.garmin.proto.generated.GDICredentialsExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import dt2.g;
import dt2.h;
import dt2.k;
import e23.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.a1;
import p13.u;
import r1.q2;
import us2.f;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lsj2/d;", "Ldt2/c;", "Ldt2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lsj2/c;", "delegate", "Ltj2/a;", "oauth2Processor", "<init>", "(Landroid/content/Context;Lsj2/c;Ltj2/a;)V", "ciq-http_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class d implements dt2.c, h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f159460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tj2.a f159461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f159462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Logger f159463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u53.d f159464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f159465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f159466h;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159467a;

        static {
            int[] iArr = new int[zi2.a.values().length];
            try {
                iArr[zi2.a.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zi2.a.CHINA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zi2.a.CHINA_TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f159467a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "com.garmin.device.ciq.http.CredentialsService$onProtobufRequest$1", f = "CredentialsService.kt", l = {99}, m = "invokeSuspend")
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f159468a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f159470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f159471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f159472e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @e(c = "com.garmin.device.ciq.http.CredentialsService$onProtobufRequest$1$1", f = "CredentialsService.kt", l = {114, 116}, m = "invokeSuspend")
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public zi2.a f159473a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public dd2.c f159474b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f159475c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public long f159476d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f159477e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ d f159478f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ k f159479g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ boolean f159480h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ boolean f159481i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, k kVar, boolean z14, boolean z15, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f159478f = dVar;
                this.f159479g = kVar;
                this.f159480h = z14;
                this.f159481i = z15;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f159478f, this.f159479g, this.f159480h, this.f159481i, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
            
                if (sj2.d.c(r0, r15, r2, r3, r4, r5, r21) == r7) goto L30;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                zi2.a aVarA;
                dd2.c cVarB;
                String strD;
                Object objC;
                long j8;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f159477e;
                d dVar = this.f159478f;
                try {
                    if (i14 != 0) {
                        if (i14 == 1) {
                            long j14 = this.f159476d;
                            strD = this.f159475c;
                            cVarB = this.f159474b;
                            aVarA = this.f159473a;
                            r.b(obj);
                            j8 = j14;
                            objC = obj;
                        } else {
                            if (i14 != 2) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r.b(obj);
                        }
                        Logger logger = dVar.f159463e;
                        if (logger == null) {
                            s.m("logger");
                            throw null;
                        }
                        logger.debug(dVar.f159466h + " success");
                        return Unit.INSTANCE;
                    }
                    r.b(obj);
                    Context context = dVar.f159462d;
                    c cVar = dVar.f159460b;
                    Logger logger2 = yj2.b.f197581a;
                    if (context != null) {
                        Object systemService = context.getSystemService("connectivity");
                        systemService.getClass();
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            aVarA = cVar.a();
                            long j15 = dVar.f159465g;
                            cVarB = cVar.b();
                            strD = cVar.d(dVar.f159465g);
                            this.f159473a = aVarA;
                            this.f159474b = cVarB;
                            this.f159475c = strD;
                            this.f159476d = j15;
                            this.f159477e = 1;
                            objC = cVar.c();
                            if (objC != aVar) {
                                j8 = j15;
                            }
                            return aVar;
                        }
                    }
                    return Unit.INSTANCE;
                    zi2.a aVar2 = aVarA;
                    cd2.a aVar3 = new cd2.a(j8, null, aVar2, (String) objC, cVarB, strD, 2, null);
                    d dVar2 = this.f159478f;
                    k kVar = this.f159479g;
                    boolean z14 = this.f159480h;
                    boolean z15 = this.f159481i;
                    this.f159473a = null;
                    this.f159474b = null;
                    this.f159475c = null;
                    this.f159477e = 2;
                } catch (Throwable th3) {
                    Logger logger3 = dVar.f159463e;
                    if (logger3 == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger3.error(dVar.f159466h + ": isRequestForOAuth1GC:" + this.f159480h + ", isRequestForOAuth2DI:" + this.f159481i, th3);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, boolean z14, boolean z15, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f159470c = kVar;
            this.f159471d = z14;
            this.f159472e = z15;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new b(this.f159470c, this.f159471d, this.f159472e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f159468a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = new a(d.this, this.f159470c, this.f159471d, this.f159472e, null);
                this.f159468a = 1;
                if (ge1.b.Y(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public d(Context context, c cVar, tj2.a aVar) {
        context.getClass();
        cVar.getClass();
        this.f159460b = cVar;
        this.f159461c = aVar;
        this.f159462d = context.getApplicationContext();
        this.f159466h = "";
    }

    public static final Object c(d dVar, zi2.a aVar, k kVar, cd2.a aVar2, boolean z14, boolean z15, b.a aVar3) throws Throwable {
        GDICredentials.GCSLocation gCSLocation;
        if (!z14) {
            if (z15) {
                Logger logger = dVar.f159463e;
                if (logger == null) {
                    s.m("logger");
                    throw null;
                }
                logger.debug(dVar.f159466h + " requesting oAuth2DI credential");
            } else {
                dVar.getClass();
            }
            return Unit.INSTANCE;
        }
        Logger logger2 = dVar.f159463e;
        if (logger2 == null) {
            s.m("logger");
            throw null;
        }
        logger2.debug(dVar.f159466h + " requesting oAuth1GC credential");
        dd2.c cVarA = aVar2.a();
        GDICredentials.GCOAuthCredentialsResponse.Builder builderNewBuilder = GDICredentials.GCOAuthCredentialsResponse.newBuilder();
        int i14 = a.f159467a[aVar.ordinal()];
        if (i14 != 1) {
            gCSLocation = (i14 == 2 || i14 == 3) ? GDICredentials.GCSLocation.CHINA : GDICredentials.GCSLocation.TEST;
        } else {
            gCSLocation = GDICredentials.GCSLocation.PRODUCTION;
        }
        GDICredentials.CredentialsService credentialsServiceBuild = GDICredentials.CredentialsService.newBuilder().setGcOauthResponse(builderNewBuilder.setGcsLocation(gCSLocation).setOauthCredentials(GDICredentials.OAuthCredentials.newBuilder().setConsumerKey(cVarA.f59214c).setConsumerSecret(cVarA.f59215d).setOauthToken(cVarA.f59212a).setOauthSecret(cVarA.f59213b))).build();
        GDISmartProto.Smart.Builder builderNewBuilder2 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder2.setExtension(GDICredentialsExtension.credentialsService, credentialsServiceBuild);
        GDISmartProto.Smart smartBuild = builderNewBuilder2.build();
        smartBuild.getClass();
        Object objA = kVar.a(smartBuild, aVar3);
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        if (objA != aVar4) {
            objA = Unit.INSTANCE;
        }
        return objA == aVar4 ? objA : Unit.INSTANCE;
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        u53.d dVar = this.f159464f;
        if (dVar != null) {
            c0.d(dVar, "CredentialsService closed");
        } else {
            s.m("coroutineScope");
            throw null;
        }
    }

    @Override // dt2.c
    public final void configure(rs2.c cVar, ExtensionRegistryLite extensionRegistryLite, GDICore.FeatureCapabilitiesRequest.Builder builder) {
        cVar.getClass();
        extensionRegistryLite.getClass();
        tj2.a aVar = this.f159461c;
        if (aVar != null) {
            aVar.f165193e = cVar;
            GDICredentials.CapabilitiesRequest.Builder builderNewBuilder = GDICredentials.CapabilitiesRequest.newBuilder();
            List<GDICredentials.CredentialType> list = aVar.f165190b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((GDICredentials.CredentialType) obj) == GDICredentials.CredentialType.GENERIC_IT_OAUTH_2) {
                    oc2.a aVar2 = aVar.f165189a;
                    if ((aVar2 != null ? aVar2.d() : null) != null) {
                    }
                }
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            builderNewBuilder.addAllSupportedCredentialTypes(arrayList);
            builder.setExtension(GDICredentials.CapabilitiesRequest.credentialsRequest, builderNewBuilder.build());
        }
    }

    @Override // dt2.c
    public final void connectionReady(GDICore.ConnectionReadyNotification connectionReadyNotification) {
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f159461c == null ? a1.b(77) : u.m0(new Integer[]{77, 99});
    }

    @Override // dt2.h
    public final boolean onProtobufRequest(GDISmartProto.Smart smart, k kVar) {
        smart.getClass();
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDICredentials.CredentialsService> generatedExtension = GDICredentialsExtension.credentialsService;
        GDICredentials.CredentialsService credentialsService = !smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension) ? null : (GDICredentials.CredentialsService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
        if (credentialsService != null) {
            if (credentialsService.hasOauth2Request()) {
                tj2.a aVar = this.f159461c;
                if (aVar != null) {
                    GDICredentials.OAuth2CredentialsRequest oauth2Request = credentialsService.getOauth2Request();
                    oauth2Request.getClass();
                    if (oauth2Request.hasCredentialType()) {
                        GDICredentials.CredentialType credentialType = oauth2Request.getCredentialType();
                        if (credentialType != GDICredentials.CredentialType.GENERIC_IT_OAUTH_2) {
                            credentialType.getClass();
                            new tj2.a.b(credentialType, kVar);
                            aVar.f165192d.warn("credentialType: " + credentialType + " not handled. isAppProvidedCredentialType: " + aVar.f165190b.contains(credentialType));
                            return false;
                        }
                        if (oauth2Request.hasClientId()) {
                            u53.d dVar = aVar.f165191c;
                            x53.c cVar = s0.f129406a;
                            ge1.b.T(dVar, x53.b.f189152a, null, new tj2.b(aVar, oauth2Request, kVar, null), 2);
                            return true;
                        }
                    }
                }
            } else {
                boolean zHasGcOauthRequest = credentialsService.hasGcOauthRequest();
                if (zHasGcOauthRequest) {
                    u53.d dVar2 = this.f159464f;
                    if (dVar2 != null) {
                        ge1.b.T(dVar2, null, null, new b(kVar, zHasGcOauthRequest, false, null), 3);
                        return true;
                    }
                    s.m("coroutineScope");
                    throw null;
                }
            }
        }
        return false;
    }

    @Override // dt2.c
    public final void receiveCapabilities(GDICore.FeatureCapabilitiesResponse featureCapabilitiesResponse) {
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        f fVar = (f) cVar;
        String strM = j.m("CIQReq#CredentialsService[", fVar.f172493a, "]");
        this.f159464f = q2.l(strM);
        this.f159463e = LoggerFactory.getLogger(strM);
        this.f159465g = fVar.f172494b;
        this.f159466h = fVar.f172496d;
        ((dt2.d) gVar).f61154i.add(this);
        GDICredentialsExtension.registerAllExtensions(extensionRegistryLite);
        GDICredentials.registerAllExtensions(extensionRegistryLite);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Context context, c cVar) {
        this(context, cVar, null, 4, null);
        context.getClass();
        cVar.getClass();
    }

    public /* synthetic */ d(Context context, c cVar, tj2.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, cVar, (i14 & 4) != 0 ? null : aVar);
    }
}
