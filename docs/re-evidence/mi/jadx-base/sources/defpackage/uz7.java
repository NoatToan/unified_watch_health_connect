package defpackage;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class uz7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f36301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ovg f36302b;
    public final ovg c;
    public JsonObject d = new JsonObject();

    public uz7(ovg ovgVar, ovg ovgVar2, double d) {
        this.f36301a = d;
        this.f36302b = ovgVar;
        this.c = ovgVar2;
    }

    public ovg a() {
        return this.f36302b;
    }

    public JsonObject b() {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<String, JsonElement> entry : this.d.entrySet()) {
            if (entry.getValue().isJsonPrimitive() && entry.getValue().getAsJsonPrimitive().isNumber()) {
                jsonObject.addProperty(entry.getKey(), String.format("%.3f", Float.valueOf(entry.getValue().getAsFloat())));
            } else {
                jsonObject.addProperty(entry.getKey(), entry.getValue().getAsString());
            }
        }
        return jsonObject;
    }

    public double c() {
        return this.f36301a;
    }

    public ovg d() {
        return this.c;
    }

    public void e(JsonObject jsonObject) {
        this.d = jsonObject;
    }

    public void f(double d) {
        this.f36301a = d;
    }
}
