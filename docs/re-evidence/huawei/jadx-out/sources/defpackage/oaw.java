package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes12.dex */
public class oaw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("extend")
    private String f44017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("state")
    private int f44018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("code")
    private int f44019c;

    @SerializedName("session")
    private String d;

    public String d() {
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }

    public int c() {
        return this.f44018b;
    }

    public void d(int i) {
        this.f44018b = i;
    }

    public String e() {
        return this.f44017a;
    }

    public void a(String str) {
        this.f44017a = str;
    }

    public int a() {
        return this.f44019c;
    }

    public void e(int i) {
        this.f44019c = i;
    }
}
