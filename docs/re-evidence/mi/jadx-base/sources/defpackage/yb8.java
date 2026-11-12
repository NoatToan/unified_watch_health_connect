package defpackage;

import com.google.gson.JsonObject;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class yb8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40013b;
    public String c;

    public yb8(int i, int i2, String str) {
        this.f40012a = i;
        this.f40013b = i2;
        this.c = str;
    }

    public JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("start_idx", Integer.valueOf(d()));
        jsonObject.addProperty("end_idx", Integer.valueOf(b()));
        jsonObject.addProperty("text", e());
        return jsonObject;
    }

    public int b() {
        return this.f40013b;
    }

    public abstract String c();

    public int d() {
        return this.f40012a;
    }

    public String e() {
        return this.c;
    }

    public void f(int i) {
        this.f40013b = i;
    }

    public void g(int i) {
        this.f40012a = i;
    }

    public abstract List<q69> h();

    public abstract JsonObject i();
}
