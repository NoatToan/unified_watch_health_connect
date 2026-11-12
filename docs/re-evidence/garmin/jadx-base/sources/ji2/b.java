package ji2;

import com.google.gson.JsonArray;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lji2/b;", "Lc83/f;", "Lcom/google/gson/JsonArray;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements c83.f<JsonArray> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni2.a<String> f98832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f98833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f98834c;

    public b(ni2.a<String> aVar, a aVar2, String str) {
        this.f98832a = aVar;
        this.f98833b = aVar2;
        this.f98834c = str;
    }

    @Override // c83.f
    public final void a(c83.d<JsonArray> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        a.f98827d.b("onDataLoaded: Received null data.");
        this.f98832a.b(null, new NullPointerException("No data"));
    }

    @Override // c83.f
    public final void c(c83.d<JsonArray> dVar, c83.a0<JsonArray> a0Var) {
        dVar.getClass();
        a.f98827d.getClass();
        ki2.f.a aVar = ki2.f.f104922a;
        li2.a aVar2 = this.f98833b.f98828b;
        aVar.getClass();
        this.f98832a.onSuccess(ki2.f.a.a(aVar2, this.f98834c).encode(String.valueOf(a0Var.f25746b)));
    }
}
