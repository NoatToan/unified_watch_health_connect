package ji2;

import com.google.gson.JsonObject;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lji2/b0;", "Lc83/f;", "Lcom/google/gson/JsonObject;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b0 implements c83.f<JsonObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f98835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f98836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConcurrentHashMap<String, String> f98837c;

    public b0(a0 a0Var, CountDownLatch countDownLatch, ConcurrentHashMap<String, String> concurrentHashMap) {
        this.f98835a = a0Var;
        this.f98836b = countDownLatch;
        this.f98837c = concurrentHashMap;
    }

    @Override // c83.f
    public final void a(c83.d<JsonObject> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        this.f98835a.f98831c.b("fetchUserData: Failed to fetch data with status.");
        this.f98836b.countDown();
    }

    @Override // c83.f
    public final void c(c83.d<JsonObject> dVar, c83.a0<JsonObject> a0Var) {
        dVar.getClass();
        JsonObject jsonObject = a0Var.f25746b;
        int length = String.valueOf(jsonObject).length();
        a0 a0Var2 = this.f98835a;
        if (length > 0) {
            a0Var2.f98831c.getClass();
            this.f98837c.put("userData", String.valueOf(jsonObject));
        } else {
            a0Var2.f98831c.b("fetchUserData: received no data.");
        }
        this.f98836b.countDown();
    }
}
