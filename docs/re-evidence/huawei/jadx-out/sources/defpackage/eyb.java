package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class eyb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("min")
    private int f33669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("current")
    private int f33670b;

    @SerializedName("day")
    private String d;

    @SerializedName("max")
    private int e;

    public void b(int i) {
        this.f33670b = i;
    }

    public void a(String str) {
        this.d = str;
    }

    public void a(int i) {
        this.f33669a = i;
    }

    public void c(int i) {
        this.e = i;
    }
}
