package nm1;

import com.garmin.android.apps.connectmobile.f0;
import java.util.Objects;
import km1.v;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import sm1.s;
import sm1.t;
import sm1.u;
import sm1.x;
import sm1.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lnm1/b;", "Lnm1/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lim1/a;", "sleepApi", "<init>", "(Lim1/a;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements nm1.a, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final im1.a f126612a;

    static {
        new a(null);
    }

    public b(im1.a aVar) {
        aVar.getClass();
        this.f126612a = aVar;
    }

    @Override // nm1.a
    public final Object a(km1.b bVar, t.a aVar) {
        return f0.J(this, new c(this, bVar, null), aVar);
    }

    @Override // nm1.a
    public final Object b(DateTime dateTime, s.e eVar) {
        Thread.currentThread().getName();
        Objects.toString(dateTime);
        return f0.J(this, new i(this, dateTime, null), eVar);
    }

    @Override // nm1.a
    public final Object c(DateTime dateTime, long j8, x.a aVar) {
        return f0.J(this, new e(this, dateTime, j8, null), aVar);
    }

    @Override // nm1.a
    public final Object d(DateTime dateTime, long j8, long j14, km1.b bVar, y.a aVar) {
        return f0.J(this, new g(this, dateTime, j8, j14, bVar, null), aVar);
    }

    @Override // nm1.a
    public final Object f(DateTime dateTime, int i14, s.m mVar) {
        Thread.currentThread().getName();
        Objects.toString(dateTime);
        return f0.J(this, new k(this, dateTime, i14, null), mVar);
    }

    @Override // nm1.a
    public final Object g(DateTime dateTime, DateTime dateTime2, v13.i iVar) {
        Thread.currentThread().getName();
        Objects.toString(dateTime);
        return f0.J(this, new j(this, dateTime, dateTime2, null), iVar);
    }

    @Override // nm1.a
    public final Object h(DateTime dateTime, s.l lVar) {
        return f0.J(this, new f(this, dateTime, null), lVar);
    }

    @Override // nm1.a
    public final Object i(v vVar, u uVar) {
        Thread.currentThread().getName();
        return f0.J(this, new d(this, vVar, null), uVar);
    }

    @Override // nm1.a
    public final Object j(long j8, v vVar, u uVar) {
        Thread.currentThread().getName();
        return f0.J(this, new h(this, j8, vVar, null), uVar);
    }

    @Override // nm1.a
    public final Object k(DateTime dateTime, String str, s.l lVar) {
        return f0.J(this, new l(this, dateTime, str, null), lVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnm1/b$a;", "", "<init>", "()V", "", "DEFAULT_NON_SLEEP_BUFFER", "I", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
