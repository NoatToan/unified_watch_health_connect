package yc2;

import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.google.firebase.perf.FirebasePerformance;
import e23.p;
import java.net.HttpURLConnection;
import java.net.URL;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import t13.d;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lwc2/a;", "Lzc2/a;", "<anonymous>", "(Lo53/b0;)Lwc2/a;"}, k = 3, mv = {2, 1, 0})
@e(c = "com.garmin.android.lib.networking.diapi.DIGarminUserProfileRequest$run$2", f = "DIGarminUserProfileRequest.kt", l = {}, m = "invokeSuspend")
public final class c extends i implements p<b0, d<? super wc2.a<? extends zc2.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0<Logger> f196746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f196747b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r0<Logger> r0Var, b bVar, d<? super c> dVar) {
        super(2, dVar);
        this.f196746a = r0Var;
        this.f196747b = bVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new c(this.f196746a, this.f196747b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super wc2.a<? extends zc2.a>> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r11v9, types: [T, java.lang.Object, org.slf4j.Logger] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        wc2.a.C3415a c3415a;
        Object objA;
        r0<Logger> r0Var = this.f196746a;
        b bVar = this.f196747b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            ?? logger = LoggerFactory.getLogger("NC#".concat("DIGarminUserProfileRequest"));
            r0Var.f105810a = logger;
            logger.getClass();
            bVar.b((Logger) logger, b.c(bVar), FirebasePerformance.HttpMethod.GET, "Bearer " + bVar.f196745g);
            HttpURLConnection httpURLConnection = bVar.f196741b;
            httpURLConnection.getClass();
            httpURLConnection.connect();
            Integer num = new Integer(oc.b.g(httpURLConnection));
            bVar.f196742c = num;
            int iIntValue = num.intValue();
            Logger logger2 = r0Var.f105810a;
            if (200 == iIntValue) {
                objA = b.d(bVar, logger2);
            } else {
                logger2.getClass();
                URL url = httpURLConnection.getURL();
                url.getClass();
                objA = nd2.c.a(logger2, url, httpURLConnection, bVar.f196742c);
            }
            return objA;
        } catch (RateLimitException e4) {
            c3415a = new wc2.a.C3415a(e4, new Integer(e4.getServerResponseCode()), e4.getError(), null, 8, null);
            return c3415a;
        } catch (Exception e14) {
            Logger logger3 = r0Var.f105810a;
            if (logger3 != null) {
                Object obj2 = bVar.f196742c;
                if (obj2 == null) {
                    obj2 = "";
                }
                logger3.error(obj2 + StringUtils.SPACE + bVar.f196740a, (Throwable) e14);
            }
            c3415a = new wc2.a.C3415a(e14, bVar.f196742c, null, null, 12, null);
            return c3415a;
        } finally {
            bVar.a();
        }
    }
}
