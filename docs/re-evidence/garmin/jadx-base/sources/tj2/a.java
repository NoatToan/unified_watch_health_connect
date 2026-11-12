package tj2;

import android.content.Context;
import com.garmin.proto.generated.GDICredentials;
import com.garmin.proto.generated.GDICredentialsExtension;
import com.garmin.proto.generated.GDISmartProto;
import dt2.j;
import dt2.k;
import java.util.List;
import o53.s0;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import r1.q2;
import rc2.l;
import rc2.m;
import rs2.c;
import sc2.i;
import sc2.o;
import u53.d;
import vb.h;
import ve2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0002\t\nB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Ltj2/a;", "", "Loc2/a;", "delegate", "", "Lcom/garmin/proto/generated/GDICredentials$CredentialType;", "supportedCredentialTypes", "<init>", "(Loc2/a;Ljava/util/List;)V", "a", "b", "ciq-http_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C3099a f165188f = new C3099a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oc2.a f165189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<GDICredentials.CredentialType> f165190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f165191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Logger f165192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f165193e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltj2/a$b;", "", "Lcom/garmin/proto/generated/GDICredentials$CredentialType;", "credentialType", "Ldt2/k;", "responder", "<init>", "(Lcom/garmin/proto/generated/GDICredentials$CredentialType;Ldt2/k;)V", "ciq-http_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GDICredentials.CredentialType f165195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f165196b;

        public b(GDICredentials.CredentialType credentialType, k kVar) {
            credentialType.getClass();
            kVar.getClass();
            this.f165195a = credentialType;
            this.f165196b = kVar;
        }

        public final Object a(GDICredentials.OAuth2Credentials.Builder builder, e eVar, tj2.b bVar) {
            GDICredentials.GCSLocation gCSLocation;
            GDICredentials.OAuth2CredentialsResponse.Builder builderNewBuilder = GDICredentials.OAuth2CredentialsResponse.newBuilder();
            builderNewBuilder.setCredentials(builder);
            builderNewBuilder.setCredentialType(this.f165195a);
            if (eVar != null) {
                a.f165188f.getClass();
                int i14 = C3099a.C3100a.f165194a[eVar.ordinal()];
                if (i14 != 1) {
                    gCSLocation = (i14 == 2 || i14 == 3) ? GDICredentials.GCSLocation.CHINA : GDICredentials.GCSLocation.TEST;
                } else {
                    gCSLocation = GDICredentials.GCSLocation.PRODUCTION;
                }
                builderNewBuilder.setEnvironment(gCSLocation);
            }
            GDICredentials.CredentialsService credentialsServiceBuild = GDICredentials.CredentialsService.newBuilder().setOauth2Response(builderNewBuilder).build();
            GDISmartProto.Smart.Builder builderNewBuilder2 = GDISmartProto.Smart.newBuilder();
            builderNewBuilder2.setExtension(GDICredentialsExtension.credentialsService, credentialsServiceBuild);
            GDISmartProto.Smart smartBuild = builderNewBuilder2.build();
            smartBuild.getClass();
            Object objA = j.a(this.f165196b, smartBuild, bVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(oc2.a aVar, List<? extends GDICredentials.CredentialType> list) {
        list.getClass();
        this.f165189a = aVar;
        this.f165190b = list;
        this.f165191c = q2.l("OAuth2RequestProcessor");
        this.f165192d = LoggerFactory.getLogger("OAuth2RequestProcessor");
    }

    public final GDICredentials.OAuth2Credentials.Builder a(sc2.d dVar) {
        dVar.getClass();
        GDICredentials.OAuth2Credentials.Builder builderNewBuilder = GDICredentials.OAuth2Credentials.newBuilder();
        o oVar = dVar.f158492b;
        builderNewBuilder.setAccessToken(oVar != null ? oVar.f158544a : null);
        builderNewBuilder.setRefreshToken(oVar != null ? oVar.f158546c : null);
        String str = dVar.f158495e;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("token_type")) {
                    builderNewBuilder.setTokenType(jSONObject.optString("token_type"));
                }
                if (jSONObject.has("expires_in")) {
                    builderNewBuilder.setExpiresIn(jSONObject.optInt("expires_in"));
                }
                if (jSONObject.has("refresh_token_expires_in")) {
                    builderNewBuilder.setRefreshTokenExpiresIn(jSONObject.optInt("refresh_token_expires_in"));
                }
            } catch (Throwable th3) {
                this.f165192d.warn("Failed to convert ITAuth2Response to proto", th3);
            }
        }
        i iVar = dVar.f158493c;
        if (iVar != null) {
            builderNewBuilder.setMfaToken(iVar.f158507a);
            Long l14 = iVar.f158508b;
            if (l14 != null) {
                builderNewBuilder.setMfaExpirationTimestampMs(l14.longValue());
            }
        }
        return builderNewBuilder;
    }

    public final Object b(GDICredentials.OAuth2CredentialsRequest oAuth2CredentialsRequest, String str, tj2.b bVar) {
        oc2.a aVar = this.f165189a;
        if (aVar == null || !aVar.isInitialized()) {
            h.z("Cannot exchange IT credentials without IAuthenticationHelper");
            return null;
        }
        String strD = aVar.d();
        if (strD == null || strD.length() == 0) {
            strD = oAuth2CredentialsRequest.getClientId();
        }
        String str2 = strD;
        e eVarC = aVar != null ? aVar.c() : null;
        eVarC.getClass();
        String clientId = oAuth2CredentialsRequest.getClientId();
        clientId.getClass();
        Context contextB = aVar.b();
        str2.getClass();
        m mVar = new m(eVarC, clientId, str, contextB, str2);
        Logger logger = LoggerFactory.getLogger("ITAuth2UsingITOAuth2");
        x53.c cVar = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new l(logger, mVar, null), bVar);
    }

    /* JADX INFO: renamed from: tj2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltj2/a$a;", "", "<init>", "()V", "ciq-http_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3099a {

        /* JADX INFO: renamed from: tj2.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3100a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f165194a;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.f177704d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.f177705e.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.f177706f.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f165194a = iArr;
            }
        }

        public /* synthetic */ C3099a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3099a() {
        }
    }

    public /* synthetic */ a(oc2.a aVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, (i14 & 2) != 0 ? w.c(GDICredentials.CredentialType.GENERIC_IT_OAUTH_2) : list);
    }
}
