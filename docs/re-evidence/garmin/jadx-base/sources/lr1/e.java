package lr1;

import com.garmin.android.apps.connectmobile.f0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llr1/e;", "Lcom/garmin/android/apps/connectmobile/f0;", "Llr1/b;", "Ljr1/a;", "stressApiService", "<init>", "(Ljr1/a;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements f0, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jr1.a f114377a;

    public e(jr1.a aVar) {
        aVar.getClass();
        this.f114377a = aVar;
    }

    @Override // lr1.b
    public final Object a(DateTime dateTime, qr1.d.e eVar) {
        return f0.J(this, new d(this, dateTime, 52, null), eVar);
    }

    @Override // lr1.b
    public final Object b(DateTime dateTime, DateTime dateTime2, qr1.d.c cVar) {
        return f0.J(this, new c(this, dateTime, dateTime2, null), cVar);
    }
}
