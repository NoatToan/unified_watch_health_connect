package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes23.dex */
public class can {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("challengeId")
    private int f1396a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("healthGoalName")
    private String f1398c = "";

    @SerializedName("healthGoalDescription")
    private String e = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("healthGoalSelected")
    private int f1397b = 0;

    public int e() {
        return this.f1396a;
    }

    public void d(int i) {
        this.f1396a = i;
    }

    public String d() {
        return this.f1398c;
    }

    public void c(String str) {
        this.f1398c = str;
    }

    public String b() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    public int c() {
        return this.f1397b;
    }

    public void c(int i) {
        this.f1397b = i;
    }
}
