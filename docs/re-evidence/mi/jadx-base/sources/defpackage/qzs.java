package defpackage;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes3.dex */
public class qzs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("type")
    public String f32038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("data")
    public String f32039b;

    public static qzs a(String str) {
        return (qzs) new Gson().fromJson(str, qzs.class);
    }

    public String b() {
        return this.f32039b;
    }

    public String c() {
        return this.f32038a;
    }

    public String d() {
        return new Gson().toJson(this);
    }
}
