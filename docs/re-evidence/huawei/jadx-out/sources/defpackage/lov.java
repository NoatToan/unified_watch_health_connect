package defpackage;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes37.dex */
public class lov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("filePartId")
    private String f40575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("uploadUrl")
    private String f40576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("uploadHeaders")
    private JsonObject f40577c;

    @SerializedName("uploadMethod")
    private String e;

    public String d() {
        return this.f40576b;
    }

    public String a() {
        return this.e;
    }

    public JsonObject c() {
        return this.f40577c;
    }

    public void d(String str) {
        this.f40576b = str;
    }

    public void c(String str) {
        this.e = str;
    }

    public void b(JsonObject jsonObject) {
        this.f40577c = jsonObject;
    }
}
