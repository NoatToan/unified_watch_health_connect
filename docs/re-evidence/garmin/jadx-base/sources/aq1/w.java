package aq1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Laq1/w;", "", "Laq1/i;", "startupChecksRepository", "Lpu/h;", "gcmCountryMinimumAge", "<init>", "(Laq1/i;Lpu/h;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f12441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu.h f12442b;

    static {
        new a(null);
    }

    public w(i iVar, pu.h hVar) {
        iVar.getClass();
        hVar.getClass();
        this.f12441a = iVar;
        this.f12442b = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r11 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        if (r10.f12442b.a(r0) == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v13.c cVar) {
        x xVar;
        boolean isCountryCodeVerified;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i14 = xVar.f12446d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                xVar.f12446d = i14 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, cVar);
            }
        } else {
            xVar = new x(this, cVar);
        }
        Object objA = xVar.f12444b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = xVar.f12446d;
        i iVar = this.f12441a;
        if (i15 == 0) {
            o13.r.b(objA);
            xVar.f12446d = 1;
            objA = iVar.a(xVar);
            if (objA != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objA);
        } else if (i15 == 2) {
            isCountryCodeVerified = xVar.f12443a;
            o13.r.b(objA);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "StartupChecksUseCase", "GET USER CONNECT PRIVACY CONSENT -> " + ((q92.v) objA));
            if (iVar.d()) {
                i2.a.b(a2Var, "StartupChecksUseCase", "Show Connect Privacy consent screen");
                return Boolean.TRUE;
            }
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var2, "StartupChecksUseCase", "Fetch country minimumAge");
            xVar.f12443a = isCountryCodeVerified;
            xVar.f12446d = 3;
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        return Boolean.FALSE;
        v2 v2Var = (v2) objA;
        if (!(v2Var instanceof v2.b)) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            String strF = b71.i.f("GET USER LOCATION -> server call failed ", v2Var);
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var3, "StartupChecksUseCase", strF);
            return Boolean.FALSE;
        }
        String strF2 = b71.i.f("GET USER LOCATION -> success ", v2Var);
        i2.a aVar5 = i2.f36769a;
        a2 a2Var4 = a2.GENERAL;
        aVar5.getClass();
        i2.a.b(a2Var4, "StartupChecksUseCase", strF2);
        d20.c cVar2 = (d20.c) ((v2.b) v2Var).f47386a;
        isCountryCodeVerified = cVar2.getIsCountryCodeVerified();
        String str = cVar2.com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String;
        if (!isCountryCodeVerified) {
            i2.a.b(a2Var4, "StartupChecksUseCase", "Country code not verified");
            return Boolean.TRUE;
        }
        if (iVar.b()) {
            i2.a.b(a2Var4, "StartupChecksUseCase", "Country code " + str + " trigger Connect Privacy consent server call");
            p92.o oVar = p92.o.f136619a;
            q92.x xVar2 = q92.x.DI_CONNECT_PRIVACY;
            xVar.f12443a = isCountryCodeVerified;
            xVar.f12446d = 2;
            objA = oVar.c(xVar2, xVar);
        } else {
            i2.a aVar6 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar6.getClass();
            i2.a.b(a2Var5, "StartupChecksUseCase", "Fetch country minimumAge");
            xVar.f12443a = isCountryCodeVerified;
            xVar.f12446d = 3;
        }
        return aVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laq1/w$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
