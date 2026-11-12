package ji2;

import com.google.gson.JsonArray;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lji2/l;", "Lc83/f;", "Lcom/google/gson/JsonArray;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l implements c83.f<JsonArray> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap<String, String> f98868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f98869b;

    public l(HashMap<String, String> map, CountDownLatch countDownLatch) {
        this.f98868a = map;
        this.f98869b = countDownLatch;
    }

    @Override // c83.f
    public final void a(c83.d<JsonArray> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        j.f98861f.b("Goal Settings Call: Failed to fetch.");
        this.f98868a.put("goals", null);
        this.f98869b.countDown();
    }

    @Override // c83.f
    public final void c(c83.d<JsonArray> dVar, c83.a0<JsonArray> a0Var) {
        dVar.getClass();
        j.f98861f.b("Goal Settings fetch call success.");
        this.f98868a.put("goals", String.valueOf(a0Var.f25746b));
        this.f98869b.countDown();
    }
}
