package jk1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c22.k;
import ch.qos.logback.classic.spi.CallerData;
import e23.p;
import ek1.v;
import hk1.q;
import hk1.w;
import i3.e5;
import java.net.URLDecoder;
import java.util.List;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;
import p92.o;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ljk1/f;", "Landroidx/lifecycle/u1;", "Lhk1/w;", "oauthData", "", "forceAllEnable", "Lp92/o;", "garminConsent", "Lek1/c;", "authorizeThirdPartyTokenUseCase", "Lek1/v;", "updateAppPermissionListUseCase", "Lek1/d;", "connectThirdPartyUseCase", "Lc22/k;", "appConfigurationDelegate", "<init>", "(Lhk1/w;ZLp92/o;Lek1/c;Lek1/v;Lek1/d;Lc22/k;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f99396l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f99397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f99398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f99399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ek1.c f99400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f99401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ek1.d f99402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f99403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<String> f99404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s92.g f99405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f99406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f99407k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Ljk1/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.presentation.connect.ThirdPartyConnectViewModel$uiState$1", f = "ThirdPartyConnectViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<r53.j<? super e>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super e> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = f.f99396l;
            f fVar = f.this;
            fVar.getClass();
            ge1.b.T(v1.a(fVar), null, null, new i(fVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(w wVar, boolean z14, o oVar, ek1.c cVar, v vVar, ek1.d dVar, k kVar) {
        oVar.getClass();
        cVar.getClass();
        vVar.getClass();
        dVar.getClass();
        kVar.getClass();
        this.f99397a = wVar;
        this.f99398b = z14;
        this.f99399c = oVar;
        this.f99400d = cVar;
        this.f99401e = vVar;
        this.f99402f = dVar;
        this.f99403g = kVar;
        p2 p2VarA = q2.a(new e(true, false, null, null, null, null, null, false, null, 510, null));
        this.f99406j = p2VarA;
        r53.v vVar2 = new r53.v(new b(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        this.f99407k = s.K(vVar2, aVarA, k2.a.f150706c, new e(true, false, objArr, objArr2, null, objArr3, null, false, null, 510, null));
    }

    public final String x4(q qVar) {
        String str;
        hk1.r rVar = ((e) this.f99406j.getValue()).f99390d;
        String strDecode = null;
        String callBackUrl = rVar != null ? rVar.getRedirectUri() : null;
        qVar.getClass();
        w wVar = this.f99397a;
        if (wVar != null) {
            try {
                if (wVar instanceof w.a) {
                    str = ((w.a) wVar).f84208b;
                } else {
                    if (!(wVar instanceof w.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = ((w.b) wVar).f84213e;
                }
                if (str != null) {
                    strDecode = URLDecoder.decode(str, d53.c.f57666b.name());
                }
            } catch (Exception unused) {
                if (wVar instanceof w.a) {
                    strDecode = ((w.a) wVar).f84208b;
                } else {
                    if (!(wVar instanceof w.b)) {
                        u0.r();
                        return null;
                    }
                    strDecode = ((w.b) wVar).f84213e;
                }
            }
        }
        if (strDecode != null) {
            callBackUrl = strDecode;
        } else if (callBackUrl == null) {
            callBackUrl = "https://www.google.com";
        }
        String str2 = CallerData.NA;
        if (d53.w.z(callBackUrl, CallerData.NA, false)) {
            str2 = "&";
        }
        if (qVar instanceof q.a) {
            q.a aVar = (q.a) qVar;
            String str3 = aVar.f84183a;
            String str4 = aVar.f84184b;
            StringBuilder sbL = e5.l(callBackUrl, str2, "oauth_token=", str3, "&oauth_verifier=");
            sbL.append(str4);
            return sbL.toString();
        }
        if (qVar instanceof q.c) {
            hk1.a aVar2 = ((q.c) qVar).f84187a;
            String code = aVar2.getCode();
            String str5 = aVar2.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String();
            StringBuilder sbL2 = e5.l(callBackUrl, str2, "code=", code, "&state=");
            sbL2.append(str5);
            return sbL2.toString();
        }
        if (!(qVar instanceof q.b)) {
            return callBackUrl;
        }
        q.b bVar = (q.b) qVar;
        String str6 = bVar.f84185a.f84172a;
        String str7 = bVar.f84186b;
        StringBuilder sbL3 = e5.l(callBackUrl, str2, "error=", str6, "&state=");
        sbL3.append(str7);
        return sbL3.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljk1/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
