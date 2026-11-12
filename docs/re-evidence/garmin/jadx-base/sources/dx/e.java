package dx;

import com.garmin.android.apps.connectmobile.f0;
import ix.j;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldx/e;", "Lcom/garmin/android/apps/connectmobile/f0;", "Ldx/a;", "Lax/a;", "bodyBatteryApiService", "<init>", "(Lax/a;)V", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements f0, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ax.a f61459a;

    public e(ax.a aVar) {
        aVar.getClass();
        this.f61459a = aVar;
    }

    @Override // dx.a
    public final Object a(LocalDate localDate, LocalDate localDate2, v13.c cVar) {
        return f0.J(this, new b(this, localDate, localDate2, null), cVar);
    }

    @Override // dx.a
    public final Object b(LocalDate localDate, j.c.a aVar) {
        return f0.J(this, new c(this, localDate, null), aVar);
    }

    @Override // dx.a
    public final Object c(j.c.b bVar) {
        return f0.J(this, new d(this, null), bVar);
    }
}
