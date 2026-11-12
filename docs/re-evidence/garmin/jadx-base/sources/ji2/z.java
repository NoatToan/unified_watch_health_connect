package ji2;

import com.google.gson.JsonObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lji2/z;", "Lc83/f;", "Lcom/google/gson/JsonObject;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z implements c83.f<JsonObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni2.a<String> f98908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f98909b;

    public z(ni2.a<String> aVar, String str) {
        this.f98908a = aVar;
        this.f98909b = str;
    }

    @Override // c83.f
    public final void a(c83.d<JsonObject> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        hi2.d dVar2 = w.f98897c;
        th3.toString();
        dVar2.getClass();
        this.f98908a.b("Something went wrong", th3);
    }

    @Override // c83.f
    public final void c(c83.d<JsonObject> dVar, c83.a0<JsonObject> a0Var) {
        Unit unit;
        dVar.getClass();
        w.f98897c.getClass();
        JsonObject jsonObject = a0Var.f25746b;
        ni2.a<String> aVar = this.f98908a;
        if (jsonObject != null) {
            String string = jsonObject.toString();
            string.getClass();
            if (string.length() > 0) {
                h.f98854a.getClass();
                h.a.f98856b.put(this.f98909b, jsonObject.toString());
                String string2 = jsonObject.toString();
                string2.getClass();
                aVar.onSuccess(string2);
            } else {
                aVar.b("Empty object", new NullPointerException());
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
