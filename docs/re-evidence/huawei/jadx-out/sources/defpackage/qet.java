package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
public class qet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resultDesc")
    private String f46075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("resultCode")
    private int f46076b;

    public String a() {
        return this.f46075a;
    }

    public void a(String str) {
        this.f46075a = str;
    }

    public int e() {
        return this.f46076b;
    }

    public void b(int i) {
        this.f46076b = i;
    }

    public String toString() {
        return "BaseResp{resultDesc='" + this.f46075a + ", resultCode=" + this.f46076b + '}';
    }
}
