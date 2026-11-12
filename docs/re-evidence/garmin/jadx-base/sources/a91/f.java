package a91;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.mapbox.common.HttpHeaders;
import java.util.List;
import okhttp3.Headers;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"La91/f;", "La91/y;", "La91/w;", "personalizedInsightsApi", "<init>", "(La91/w;)V", "a", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f2125a;

    static {
        new a(null);
    }

    public f(w wVar) {
        wVar.getClass();
        this.f2125a = wVar;
    }

    @Override // a91.y
    public final Object C2(String str, a91.a.h hVar) {
        Object objJ = f0.J(this, new g(this, str, null), hVar);
        return objJ == u13.a.COROUTINE_SUSPENDED ? objJ : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a91.y
    public final Object G(String str, Double d14, Double d15, v13.c cVar) {
        j jVar;
        long jLongValue;
        String str2;
        Long lJ;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f2137c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f2137c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objJ = jVar.f2135a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f2137c;
        if (i15 == 0) {
            o13.r.b(objJ);
            d91.m mVar = (d14 == null || d15 == null) ? null : new d91.m(d14.doubleValue(), d15.doubleValue());
            LocalDateTime localDateTimeNow = LocalDateTime.now(DateTimeZone.UTC);
            localDateTimeNow.getClass();
            LocalDateTime localDateTimeNow2 = LocalDateTime.now();
            localDateTimeNow2.getClass();
            k kVar = new k(this, new d91.l(localDateTimeNow, localDateTimeNow2, str, mVar), null);
            jVar.f2137c = 1;
            objJ = f0.J(this, kVar, jVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            Headers headers = ((v2.b) v2Var).f47389d;
            jLongValue = (headers == null || (str2 = headers.get(HttpHeaders.RETRY_AFTER)) == null || (lJ = d53.t.j(str2)) == null) ? 300000L : lJ.longValue();
        } else {
            jLongValue = -1;
        }
        return new Long(jLongValue);
    }

    @Override // a91.y
    public final Object Q2(String str, d91.f fVar, List list, String str2, a91.a.f fVar2) {
        Object objJ = f0.J(this, new l(this, str, new d91.g(LocalDateTime.now(), LocalDateTime.now(DateTimeZone.UTC), fVar, null, list, str2), null), fVar2);
        return objJ == u13.a.COROUTINE_SUSPENDED ? objJ : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a91.y
    public final Object Z0(boolean z14, v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f2131c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f2131c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objC = hVar.f2129a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f2131c;
        if (i15 == 0) {
            o13.r.b(objC);
            i iVar = new i(this, z14, null);
            hVar.f2131c = 1;
            objC = C(iVar, hVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        v2 v2Var = (v2) objC;
        if (!(v2Var instanceof v2.b)) {
            return new d91.e(d91.p.ERROR, null);
        }
        v2.b bVar = (v2.b) v2Var;
        return new d91.e(bVar.f47387b != 204 ? d91.p.READY : d91.p.GENERATE_MESSAGE, (d91.c) bVar.f47386a);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La91/f$a;", "", "<init>", "()V", "", "RESPONSE_CODE_GENERATE_MESSAGE", "I", "", "RETRY_AFTER_HEADER_KEY", "Ljava/lang/String;", "", "DEFAULT_RETRY_INTERVAL", "J", "gcm-personalized-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
