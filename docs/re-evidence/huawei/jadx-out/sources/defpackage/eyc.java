package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class eyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("unhappyRatio")
    private int f33671a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("happyRatio")
    private int f33672c;

    @SerializedName("day")
    private String d;

    @SerializedName("peaceRatio")
    private int e;

    public void c(String str) {
        this.d = str;
    }

    public void a(int i) {
        this.f33672c = i;
    }

    public void d(int i) {
        this.f33671a = i;
    }

    public void c(int i) {
        this.e = i;
    }
}
