package jx2;

import android.annotation.SuppressLint;
import android.content.Context;
import com.garmin.samd.exception.InvalidOAuth2DIBearerTokenException;
import com.garmin.samd.exception.NullAppDelegateException;
import java.util.concurrent.atomic.AtomicLong;
import o53.c0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljx2/b;", "Ljx2/a;", "<init>", "()V", "a", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"VisibleForTests"})
public final class b extends jx2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f101511b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f101512c = 3600000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicLong f101513d = new AtomicLong(-1);

    public b() {
        super("AccountManager");
    }

    public static final void i(b bVar, String str) {
        gx2.b.f80060a.getClass();
        ge1.b.T(c0.a(gx2.b.d.a().plus(ge1.b.h())), null, null, new h(str, null), 3);
    }

    public static void m(b bVar, kx2.a aVar, String str) throws InvalidOAuth2DIBearerTokenException, NullAppDelegateException {
        aVar.getClass();
        str.getClass();
        if (d53.w.J(str)) {
            throw new InvalidOAuth2DIBearerTokenException();
        }
        gx2.b.d dVar = gx2.b.f80060a;
        dVar.getClass();
        Context context = gx2.b.f80062c;
        if (context == null) {
            throw new NullAppDelegateException();
        }
        gx2.a aVarC = jx2.a.c();
        if (aVarC == null) {
            throw new NullAppDelegateException();
        }
        dVar.getClass();
        ge1.b.T(c0.a((z) gx2.b.f80065f.getValue()), null, null, new j(bVar, aVar, true, aVarC, str, context, null), 3);
    }

    public final Object j(long j8, px2.g gVar) {
        gx2.b.f80060a.getClass();
        return ge1.b.e0(gx2.b.d.a(), new c(this, j8, null), gVar);
    }

    public final Object k(String str, qf1.d dVar) throws Throwable {
        gx2.b.f80060a.getClass();
        Object objE0 = ge1.b.e0(gx2.b.d.a(), new d(str, this, null), dVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    public final Object l(v13.c cVar) {
        gx2.b.f80060a.getClass();
        return ge1.b.e0(gx2.b.d.a(), new e(this, null), cVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ljx2/b$a;", "", "<init>", "()V", "", "INITIAL_VAL_LAST_GC_SERVER_CALL_IS_HEALTH_FEATURE_ENABLED_TIMESTAMP", "J", "IS_GC_HEALTH_FEATURE_ENABLED_MAX_CACHE_MILLIS", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
