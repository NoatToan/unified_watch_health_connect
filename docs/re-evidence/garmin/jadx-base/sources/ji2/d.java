package ji2;

import com.google.gson.JsonObject;
import org.json.JSONException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lji2/d;", "Lc83/f;", "Lcom/google/gson/JsonObject;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements c83.f<JsonObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni2.a<String> f98844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f98845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f98846c;

    public d(ni2.a<String> aVar, c cVar, String str) {
        this.f98844a = aVar;
        this.f98845b = cVar;
        this.f98846c = str;
    }

    @Override // c83.f
    public final void a(c83.d<JsonObject> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        c.f98838d.b("fetchData: Received null data");
        this.f98844a.b("Did not receive data", new NullPointerException());
    }

    @Override // c83.f
    public final void c(c83.d<JsonObject> dVar, c83.a0<JsonObject> a0Var) {
        ni2.a<String> aVar = this.f98844a;
        dVar.getClass();
        try {
            ki2.f.a aVar2 = ki2.f.f104922a;
            li2.a aVar3 = this.f98845b.f98839b;
            aVar2.getClass();
            String strEncode = ki2.f.a.a(aVar3, "walking").encode(String.valueOf(a0Var.f25746b));
            c.f98838d.getClass();
            h.f98854a.getClass();
            h.a.f98857c.put(this.f98846c, strEncode);
            aVar.onSuccess(strEncode);
        } catch (JSONException e4) {
            c.f98838d.b("fetchData: Received data with JSON Exception " + e4 + ".");
            aVar.b("Json exception " + e4, new Throwable("JSON Exception"));
        }
    }
}
