package tj2;

import com.garmin.proto.generated.GDICredentials;
import dt2.k;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "com.garmin.device.ciq.http.credentials.oauth2.OAuth2RequestProcessor$handleITAuth2Request$1", f = "OAuth2RequestProcessor.kt", l = {174, 179, 182}, m = "invokeSuspend")
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f165197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f165198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDICredentials.OAuth2CredentialsRequest f165199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f165200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, GDICredentials.OAuth2CredentialsRequest oAuth2CredentialsRequest, k kVar, d<? super b> dVar) {
        super(2, dVar);
        this.f165198b = aVar;
        this.f165199c = oAuth2CredentialsRequest;
        this.f165200d = kVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f165198b, this.f165199c, this.f165200d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[Catch: all -> 0x0019, PHI: r9
      0x0050: PHI (r9v12 java.lang.Object) = (r9v9 java.lang.Object), (r9v0 java.lang.Object) binds: [B:29:0x004d, B:13:0x0022] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:13:0x0022, B:31:0x0050, B:33:0x0068, B:34:0x006c, B:14:0x0026, B:22:0x003a, B:25:0x0040, B:28:0x0047, B:37:0x0075, B:17:0x002d, B:19:0x0031), top: B:42:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0068 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:13:0x0022, B:31:0x0050, B:33:0x0068, B:34:0x006c, B:14:0x0026, B:22:0x003a, B:25:0x0040, B:28:0x0047, B:37:0x0075, B:17:0x002d, B:19:0x0031), top: B:42:0x000c }] */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        if (r1.a(r9, r2, r8) == r0) goto L36;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f165197a;
        GDICredentials.OAuth2CredentialsRequest oAuth2CredentialsRequest = this.f165199c;
        a aVar2 = this.f165198b;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else if (i14 == 2) {
                    r.b(obj);
                    GDICredentials.CredentialType credentialType = oAuth2CredentialsRequest.getCredentialType();
                    credentialType.getClass();
                    a.b bVar = new a.b(credentialType, this.f165200d);
                    GDICredentials.OAuth2Credentials.Builder builderA = aVar2.a((sc2.d) obj);
                    oc2.a aVar3 = aVar2.f165189a;
                    ve2.e eVarC = aVar3 != null ? aVar3.c() : null;
                    this.f165197a = 3;
                } else {
                    if (i14 != 3) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            oc2.a aVar4 = aVar2.f165189a;
            if (aVar4 == null) {
                str = null;
                if (str != null && str.length() != 0) {
                    this.f165197a = 2;
                    obj = aVar2.b(oAuth2CredentialsRequest, str, this);
                    if (obj == aVar) {
                        GDICredentials.CredentialType credentialType2 = oAuth2CredentialsRequest.getCredentialType();
                        credentialType2.getClass();
                        a.b bVar2 = new a.b(credentialType2, this.f165200d);
                        GDICredentials.OAuth2Credentials.Builder builderA2 = aVar2.a((sc2.d) obj);
                        oc2.a aVar5 = aVar2.f165189a;
                        if (aVar5 != null) {
                        }
                        this.f165197a = 3;
                    }
                }
                aVar2.f165192d.error("Missing app ITOAuth2AccessToken. Unable to exchange");
                return Unit.INSTANCE;
            }
            this.f165197a = 1;
            obj = aVar4.a(this);
            if (obj == aVar) {
            }
            return aVar;
            str = (String) obj;
            if (str != null) {
                this.f165197a = 2;
                obj = aVar2.b(oAuth2CredentialsRequest, str, this);
                if (obj == aVar) {
                    GDICredentials.CredentialType credentialType3 = oAuth2CredentialsRequest.getCredentialType();
                    credentialType3.getClass();
                    a.b bVar3 = new a.b(credentialType3, this.f165200d);
                    GDICredentials.OAuth2Credentials.Builder builderA3 = aVar2.a((sc2.d) obj);
                    oc2.a aVar6 = aVar2.f165189a;
                    if (aVar6 != null) {
                    }
                    this.f165197a = 3;
                }
                return aVar;
            }
            aVar2.f165192d.error("Missing app ITOAuth2AccessToken. Unable to exchange");
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            aVar2.f165192d.error("failed to exchangeITOAuth2", th3);
        }
    }
}
