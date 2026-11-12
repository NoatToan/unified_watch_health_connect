package q60;

import com.garmin.android.apps.connectmobile.f0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq60/e;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lq60/b;", "Lq60/a;", "api", "<init>", "(Lq60/a;)V", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements f0, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f143170a;

    public e(a aVar) {
        aVar.getClass();
        this.f143170a = aVar;
    }

    @Override // q60.b
    public final Object a(DateTime dateTime, DateTime dateTime2, String str, i iVar) {
        return f0.J(this, new d(this, dateTime, dateTime2, str, null), iVar);
    }

    @Override // q60.b
    public final Object b(DateTime dateTime, long j8, h60.i iVar) {
        return f0.J(this, new c(this, dateTime, j8, null), iVar);
    }
}
