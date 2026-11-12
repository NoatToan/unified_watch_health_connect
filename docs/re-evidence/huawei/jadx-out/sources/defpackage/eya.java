package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class eya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("min")
    private int f33666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("day")
    private String f33667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("max")
    private int f33668c;

    @SerializedName("rhr")
    private int e;

    public void b(String str) {
        this.f33667b = str;
    }

    public void c(int i) {
        this.e = i;
    }

    public void a(int i) {
        this.f33666a = i;
    }

    public void d(int i) {
        this.f33668c = i;
    }
}
