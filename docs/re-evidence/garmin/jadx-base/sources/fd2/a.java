package fd2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.common.net.HttpHeaders;
import e23.l;
import ed2.c;
import fb1.d0;
import i3.e5;
import o13.m;
import o13.t;
import o53.b0;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import t13.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\rBA\b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lfd2/a;", "Lokhttp3/Authenticator;", "", "maxRetryThreshold", "Lkotlin/Function0;", "", NotificationConstants.KEY_DATA_MIME_TYPE, "Lkotlin/Function1;", "Lt13/d;", "", "credentialsAsync", "<init>", "(ILe23/a;Le23/l;)V", "a", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Authenticator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1446a f70497e = new C1446a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<String> f70499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<d<? super String>, Object> f70500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f70501d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(int i14, e23.a<String> aVar, l<? super d<? super String>, ? extends Object> lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f70498a = i14;
        this.f70499b = aVar;
        this.f70500c = lVar;
        this.f70501d = m.b(new d0(5));
    }

    @Override // okhttp3.Authenticator
    public final Request authenticate(Route route, Response response) {
        response.getClass();
        int i14 = 0;
        Response responsePriorResponse = response;
        while (true) {
            if ((responsePriorResponse != null ? responsePriorResponse.priorResponse() : null) == null) {
                break;
            }
            responsePriorResponse = responsePriorResponse.priorResponse();
            i14++;
        }
        if (i14 < this.f70498a) {
            String strInvoke = this.f70499b.invoke();
            if (strInvoke.length() <= 0) {
                strInvoke = null;
            }
            String str = strInvoke;
            if (str != null) {
                String strA = c.a.a(c.C, (b0) this.f70501d.getValue(), this.f70500c);
                if (strA.length() <= 0) {
                    strA = null;
                }
                if (strA != null) {
                    String strG = e5.g(str, StringUtils.SPACE, strA);
                    if (strG.equals(response.request().header(HttpHeaders.AUTHORIZATION))) {
                        strG = null;
                    }
                    if (strG != null) {
                        return response.request().newBuilder().header(HttpHeaders.AUTHORIZATION, strG).build();
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: fd2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfd2/a$a;", "", "<init>", "()V", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1446a {
        public /* synthetic */ C1446a(j jVar) {
            this();
        }

        private C1446a() {
        }
    }

    public /* synthetic */ a(int i14, e23.a aVar, l lVar, int i15, j jVar) {
        this((i15 & 1) != 0 ? 1 : i14, (i15 & 2) != 0 ? new d0(6) : aVar, lVar);
    }
}
