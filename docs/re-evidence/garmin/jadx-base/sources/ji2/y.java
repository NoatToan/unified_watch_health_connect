package ji2;

import com.google.gson.JsonArray;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lji2/y;", "Lc83/f;", "Lcom/google/gson/JsonArray;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y implements c83.f<JsonArray> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni2.a<String> f98906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f98907b;

    public y(ni2.a<String> aVar, String str) {
        this.f98906a = aVar;
        this.f98907b = str;
    }

    @Override // c83.f
    public final void a(c83.d<JsonArray> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        hi2.d dVar2 = w.f98897c;
        th3.toString();
        dVar2.getClass();
        this.f98906a.b("Something went wrong", th3);
    }

    @Override // c83.f
    public final void c(c83.d<JsonArray> dVar, c83.a0<JsonArray> a0Var) {
        Unit unit;
        dVar.getClass();
        w.f98897c.getClass();
        JsonArray jsonArray = a0Var.f25746b;
        ni2.a<String> aVar = this.f98906a;
        if (jsonArray != null) {
            String string = jsonArray.toString();
            string.getClass();
            if (string.length() > 0) {
                h.f98854a.getClass();
                h.a.f98856b.put(this.f98907b, jsonArray.toString());
                String string2 = jsonArray.toString();
                string2.getClass();
                aVar.onSuccess(string2);
            } else {
                aVar.b("Empty array", new NullPointerException());
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            aVar.b("Empty response body", new NullPointerException());
        }
    }
}
