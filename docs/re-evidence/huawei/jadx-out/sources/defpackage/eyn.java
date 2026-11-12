package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class eyn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("max")
    private int f33691a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("min")
    private int f33692c;

    @SerializedName("avg")
    private int d;

    @SerializedName("day")
    private String e;

    public void a(String str) {
        this.e = str;
    }

    public void d(int i) {
        this.f33692c = i;
    }

    public void c(int i) {
        this.f33691a = i;
    }

    public void b(int i) {
        this.d = i;
    }
}
