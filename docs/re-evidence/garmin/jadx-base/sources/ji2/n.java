package ji2;

import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lji2/n;", "Lc83/f;", "Lcom/google/gson/JsonObject;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n implements c83.f<JsonObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap<String, String> f98872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f98873b;

    public n(HashMap<String, String> map, CountDownLatch countDownLatch) {
        this.f98872a = map;
        this.f98873b = countDownLatch;
    }

    @Override // c83.f
    public final void a(c83.d<JsonObject> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        j.f98861f.b("Run Options Settings Call: Failed to fetch.");
        this.f98872a.put("runOptions", null);
        this.f98873b.countDown();
    }

    @Override // c83.f
    public final void c(c83.d<JsonObject> dVar, c83.a0<JsonObject> a0Var) {
        dVar.getClass();
        j.f98861f.getClass();
        this.f98872a.put("runOptions", String.valueOf(a0Var.f25746b));
        this.f98873b.countDown();
    }
}
