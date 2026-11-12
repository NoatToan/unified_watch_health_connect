package a52;

import com.garmin.android.apps.connectmobile.f0;
import d52.q;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La52/g;", "Lcom/garmin/android/apps/connectmobile/f0;", "La52/a;", "Ly42/a;", "pushesApiService", "<init>", "(Ly42/a;)V", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements f0, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y42.a f1480a;

    public g(y42.a aVar) {
        aVar.getClass();
        this.f1480a = aVar;
    }

    @Override // a52.a
    public final Object a(DateTime dateTime, q.d dVar) {
        return f0.J(this, new e(this, dateTime, 12, null), dVar);
    }

    @Override // a52.a
    public final Object b(DateTime dateTime, q.e eVar) {
        return f0.J(this, new f(this, dateTime, 52, null), eVar);
    }

    @Override // a52.a
    public final Object c(DateTime dateTime, q.c.b bVar) {
        return f0.J(this, new c(this, dateTime, null), bVar);
    }

    @Override // a52.a
    public final Object d(DateTime dateTime, q.c.a aVar) {
        return f0.J(this, new b(this, dateTime, null), aVar);
    }

    @Override // a52.a
    public final Object f(DateTime dateTime, DateTime dateTime2, q.b bVar) {
        return C(new d(this, dateTime, dateTime2, null), bVar);
    }
}
