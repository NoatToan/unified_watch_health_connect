package ai2;

import org.json.JSONArray;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lai2/a;", "Lni2/a;", "", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements ni2.a<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f3311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ni2.a<JSONArray> f3312b;

    public a(b bVar, ni2.a<JSONArray> aVar) {
        this.f3311a = bVar;
        this.f3312b = aVar;
    }

    @Override // ni2.a
    public final void a() {
        this.f3311a.f3313a.b("getSearchIndexes: Received void ");
        this.f3312b.b("Cannot be empty", new NullPointerException());
    }

    @Override // ni2.a
    public final void b(String str, Throwable th3) {
        th3.getClass();
        this.f3311a.f3313a.b("Consuming app exception: " + str);
        this.f3312b.b(str, th3);
    }

    @Override // ni2.a
    public final void onSuccess(String str) {
        String str2 = str;
        ni2.a<JSONArray> aVar = this.f3312b;
        b bVar = this.f3311a;
        str2.getClass();
        try {
            bVar.f3313a.getClass();
            aVar.onSuccess(new JSONArray(str2));
        } catch (Exception e4) {
            bVar.f3313a.b("getComposition: Received throwable - " + e4);
            aVar.b(null, e4);
        }
    }
}
