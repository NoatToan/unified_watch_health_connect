package pt2;

import com.garmin.livetrack.LivetrackInvalidCredentialsProviderException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpt2/a;", "", "Lpt2/b;", "credentialsProvider", "<init>", "(Lpt2/b;)V", "a", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.livetrack.retrofit.b f141036b;

    static {
        new C2648a(null);
        zy2.c.f207527a.a("LVT#AbstractManager");
    }

    public a(b bVar) {
        bVar.getClass();
        this.f141036b = new com.garmin.livetrack.retrofit.b(bVar);
    }

    public final com.garmin.livetrack.retrofit.b a() throws LivetrackInvalidCredentialsProviderException {
        com.garmin.livetrack.retrofit.b bVar = this.f141036b;
        if (bVar != null) {
            return bVar;
        }
        throw new LivetrackInvalidCredentialsProviderException("RetrofitManager has been destroyed. A new manager instance must be created after onCustomerLogout() before making any API calls.");
    }

    /* JADX INFO: renamed from: pt2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpt2/a$a;", "", "<init>", "()V", "Lzy2/k;", "LOGGER", "Lzy2/k;", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2648a {
        public /* synthetic */ C2648a(j jVar) {
            this();
        }

        private C2648a() {
        }
    }
}
